package symbols;

import code.SymbolTable;
import attributes.*;
import java.util.*;
import lib.Pair;
import java.io.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.filter.*;
import java.util.List;
import java.util.Iterator;

public class Model implements Symbol {

    public static String xml = ".\\xml\\attributesv2.xml";
    private static List<Model> generated;
    private String name;
    private Map<String, AttributeValue> attributs; //Les objet Attributes contiennent les valeurs des attributs et non leur nom.
    private int generate = 0;

    public Model(String name) {
	this.name = name;
	attributs = new HashMap<String, AttributeValue>();
    }

    public Model(String name, Model... subtypes) {
	this.name = name;
	attributs = new HashMap<String, AttributeValue>();
	for (int i = 0; i < subtypes.length; i++) {
	    attributs.putAll(subtypes[i].getAllAttributes());
	}
    }

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
    //On initialise un nouvel element racine avec l'element racine du document.

    public void addAttribute(String attr) {
	this.attributs.put(attr, null);
    }

    public void addAttribute(String attr, AttributeValue value) {
	this.attributs.put(attr, value);
    }

    public void addAttributes(Pair<String, AttributeValue>... attr) {
	for (int i = 0; i < attr.length; i++) {
	    attributs.put(attr[i].getFirst(), attr[i].getSecond());
	}
    }

    public Map<String, AttributeValue> getAllAttributes() {
	return new HashMap<String, AttributeValue>(attributs);
    }

    public boolean contains(String attr) {
	return attributs.containsKey(attr);
    }

    public AttributeValue getAttribute(String n) {
	return this.attributs.get(n);
    }

    public List<String> listAttributes() {
	List<String> res = new ArrayList<String>();

	String[] tab = (String[]) this.attributs.keySet().toArray(new String[0]);
	res.addAll(Arrays.asList(tab));

	return res;
    }

    public String getName() {
	return name;
    }

    public void toGenerate() {
	generate++;
    }

    public int getGenerate() {
	return generate;
    }

    public static void addGenerated(Model m) {
	generated.add(m);
    }

    public static boolean generated(Model m) {
	return generated.contains(m);
    }

    public Type getType() {
	return Type.MODEL;
    }

    public void print(){
        System.out.println(attributs.toString());
    }
}
