package symbols;

import code.SymbolTable;
import attributes.*;
import java.util.*;
import java.io.*;
import org.jdom.*;
import org.jdom.input.*;

public class Model implements Symbol {

    public static String xml = "./xml/attributesv2.xml"; //Linux (Fonctionne aussi sous windows)
    private static List<Model> generated;
    private String name;
    private Map<String, AttributeValue> attributs; //Les objet Attributes contiennent les valeurs des attributs et non leur nom.
    private Map<String, Model> inheritance;
    private int generate = 0;

    /**
     * Constructor with only model name.
     * Typically used by predefined models.
     * @param name model name
     */
    public Model(String name) {
	this.name = name;
	attributs = new HashMap<String, AttributeValue>();
	inheritance = new HashMap<String, Model>();
    }

    /**
     * Constructor with inherited models.
     * @param name name model
     * @param subtypes list of inherited models
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
     * Add an attribute to the model.
     * @param attr Name attribute
     * @param value Value attribute
     */
    public void addAttribute(String attr, AttributeValue value) {
	this.attributs.put(attr, value);
    }

    /**
     * Get a list of all attributes of the model with theirs value.
     * @return Map<String, AttributeValue> of attributes of the model.
     */
    public Map<String, AttributeValue> getAllAttributes() {
	return new HashMap<String, AttributeValue>(attributs);
    }

    /**
     * Returns the value of attribute passed as parameter.
     * @param n Attribute name
     * @return AttributeValue's instance.
     */
    public AttributeValue getAttribute(String n) {
	return this.attributs.get(n);
    }

    /**
     * Returns list of all attributes of model.
     * @return List<Model> of attributes
     */
    public List<String> listAttributes() {
	List<String> res = new ArrayList<String>();

	String[] tab = (String[]) this.attributs.keySet().toArray(new String[0]);
	res.addAll(Arrays.asList(tab));

	return res;
    }

    /**
     * Check if the attribute is present in the model.
     * @param attr Attribute name
     * @return True if attribute exists, false otherwise.
     */
    public boolean contains(String attr) {
	return attributs.containsKey(attr);
    }

    /**
     * Check if current model inherits the model passed as parameter.
     * @param model
     * @return
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
     * Debug fonction
     */
    public void print() {
	System.out.println(attributs.toString());
    }

    /**
     * Add the model passed as a parameter to the list of generated models.
     * @param m model to add
     */
    public static void addGenerated(Model m) {
	generated.add(m);
    }

    /**
     * Checks if model has already been generated.
     * @param m model checking
     * @return true if model has already been generated
     */
    public static boolean generated(Model m) {
	return generated.contains(m);
    }

    /**
     * Initializes the default models the compiler.
     * @param st Symbole Table
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
