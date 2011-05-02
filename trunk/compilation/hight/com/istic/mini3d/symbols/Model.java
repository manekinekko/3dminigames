package com.istic.mini3d.symbols;

import com.istic.mini3d.code.SymbolTable;
import com.istic.mini3d.attributes.*;
import java.util.*;
import java.io.*;
import org.jdom.*;
import org.jdom.input.*;

/**
 * Classe permettant de gérer les models.
 * @author Mini3D
 * @version 1.0
 */
public class Model implements Symbol {

    /**
     * Constante qui défini le chemin vers le fichier xml des attributs prédéfinis.
     */
    public static String xml = "./com/istic/mini3d/xml/attributesv2.xml"; //Linux (Fonctionne aussi sous windows)
    private /*public pour JUnit tests*/ static List<Model> generated;
    private String name;
    private /*public pour JUnit tests*/ Map<String, AttributeValue> attributs; //Les objet Attributes contiennent les valeurs des attributs et non leur nom.
    private /*public pour JUnit tests*/ Map<String, Model> inheritance;
    /**
     * Entier représentatif de la génération de code.
     */
    public int generate = 0;

    /**
     * Constructeur de création de modèle avec le nom.
     * Utilisé avec les models prédéfinis
     * @param name nom du model
     */
    public Model(String name) {
	this.name = name;
	attributs = new HashMap<String, AttributeValue>();
	inheritance = new HashMap<String, Model>();
    }

    /**
     * Constructeur avec les models hérités.
     * @param name nom du modèle
     * @param subtypes liste des models hérités
     */
    public Model(String name, Model... subtypes) {
	this.name = name;
	attributs = new HashMap<String, AttributeValue>();
	inheritance = new HashMap<String, Model>();
	for (int i = 0; i < subtypes.length; i++) {
	    inheritance.put(subtypes[i].name, subtypes[i]);
	    attributs.putAll(subtypes[i].getAllAttributes());
	}
    }

    /**
     * Ajoute un attribut au model.
     * @param attr nom de l'attribut
     * @param value valeur de l'attribut
     */
    public void addAttribute(String attr, AttributeValue value) {
	this.attributs.put(attr, value);
    }

    /**
     * Accesseur a la liste d'attribut avec leur valeur.
     * @return Map<String, AttributeValue> des attributs du model.
     */
    public Map<String, AttributeValue> getAllAttributes() {
	return new HashMap<String, AttributeValue>(attributs);
    }

    /**
     * Accesseur a la valeur d'un attribut grâce a son nom.
     * @param n nom de l'attribut
     * @return la valeur de l'attribut sous forme d'AttributeValue
     */
    public AttributeValue getAttribute(String n) {
	return this.attributs.get(n);
    }

    /**
     * Accesseur a toute la liste des attributs du model.
     * @return la liste des noms des attributs du model.
     */
    public List<String> listAttributes() {
	List<String> res = new ArrayList<String>();

	String[] tab = (String[]) this.attributs.keySet().toArray(new String[0]);
	res.addAll(Arrays.asList(tab));

	return res;
    }

    /**
     * Vérifie si l'attribut est présent dans le model.
     * @param attr nom de l'attribut.
     * @return vrai si l'attribut existe.
     */
    public boolean contains(String attr) {
	return attributs.containsKey(attr);
    }

    /**
     * Vérifie si le modèle courant hérite du modèle passé en paramètre.
     * @param model model dont on veut vérifier qu'il est hérité.
     * @return vrai s'il hérite du modèle
     */
    public boolean ineheritsOf(String model) {
	return inheritance.containsKey(model);
    }

    /**
     * @see Symbol
     */
    public String getName() {
	return name;
    }

    /**
     * @see Symbol
     */
    public void toGenerate() {
	generate++;
    }

    /**
     * @see Symbol
     */
    public int getGenerate() {
	return generate;
    }

    /**
     * @see Symbol
     */
    public Type getType() {
	return Type.MODEL;
    }

    /**
     * Fonction de debug
     */
    public void print() {
	System.out.println(attributs.toString());
    }

    /**
     * Ajoute le model passé en paramètre a la liste des modèles déjà générés
     * @param m model a ajouter
     */
    public static void addGenerated(Model m) {
	generated.add(m);
    }

    /**
     * Vérifie si un model a déjà été généré.
     * @param m model a vérifier
     * @return vrai si le model a déjà été généré.
     */
    public static boolean generated(Model m) {
	return generated.contains(m);
    }

    /**
     * Parse le xml et initialise les models par défaut.
     * Fonctionne grâce a la librairie JDOM.
     * @param st table des symboles
     */
    @SuppressWarnings("unchecked")
    public static void init(SymbolTable st) {
	generated = new ArrayList<Model>();

	org.jdom.Document document = null;
	Element racine = null;

	SAXBuilder sxb = new SAXBuilder();
	try {
	    //On cree un nouveau document JDOM avec en argument le fichier XML
	    //Le parsing est termine ;)
	    document = sxb.build(new File(xml));
	    racine = document.getRootElement();
	} catch (Exception e) {
	    System.out.println("Rate");
	}

	List listmodel = racine.getChildren("model");

	//On cree un Iterator sur notre liste
	Iterator i = listmodel.iterator();
	while (i.hasNext()) {
	    Element courant = (Element) i.next();
	    Model m;
	    Element e = courant.getChild("inheritance");
	    if (e == null) {
		m = new Model(courant.getChild("name").getText());
	    } else {
		Symbol he = st.get(courant.getChild("inheritance").getAttributeValue("value"));
		m = new Model(courant.getChild("name").getText(), (Model) he);
	    }

	    st.add(m.getName(), m);


	    List listAttribute = courant.getChildren("attribute");
	    Iterator i2 = listAttribute.iterator();
	    while (i2.hasNext()) {
		Element attr = (Element) i2.next();
		if (attr.getAttributeValue("type").equals("String")) {
		    m.addAttribute(attr.getAttributeValue("name"), new AttributeValue(attr.getAttributeValue("value")));
		} else if (attr.getAttributeValue("type").equals("number")) {
		    m.addAttribute(attr.getAttributeValue("name"), new AttributeValue(Float.valueOf(attr.getAttributeValue("value"))));
		} else if (attr.getAttributeValue("type").equals("boolean")) {
		    m.addAttribute(attr.getAttributeValue("name"), new AttributeValue(Boolean.valueOf(attr.getAttributeValue("value"))));
		} else if (attr.getAttributeValue("type").equals("array")) {
		    m.addAttribute(attr.getAttributeValue("name"), new AttributeValue(AttributeValue.Type.ARRAY));
		} else if (attr.getAttributeValue("type").equals("List")) {
		} else if (attr.getAttributeValue("type").equals("Enum")) {
		} else if (attr.getAttributeValue("type").equals("Empty")) {
		} else if (attr.getAttributeValue("type").equals("Object")) {
		} else if (attr.getAttributeValue("type").equals("time")) {
		    m.addAttribute(attr.getAttributeValue("name"), new AttributeValue(new Duration(Float.valueOf(attr.getAttributeValue("value")), attr.getAttributeValue("unit"))));
		}
	    }
	    st.add(m.getName(), m);
	}
    }
}
