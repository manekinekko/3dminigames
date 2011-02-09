package symbols;

import code.SymbolTable;
import attributes.*;
import java.util.*;
import lib.Pair;

public class Model implements Symbol {

    public static Model object, character, projectile, zone, obstacle, weapon, ground;
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

	object = new Model("Object");
        object.addAttributes(new Pair<String, AttributeValue>("mass", new AttributeValue(0)), new Pair<String, AttributeValue>("posX", new AttributeValue(0)), new Pair<String, AttributeValue>("posY", new AttributeValue(0)), new Pair<String, AttributeValue>("posZ", new AttributeValue(0)), new Pair<String, AttributeValue>("orX", new AttributeValue(0)), new Pair<String, AttributeValue>("orY", new AttributeValue(0)), new Pair<String, AttributeValue>("orZ", new AttributeValue(0)), new Pair<String, AttributeValue>("tX", new AttributeValue(0)), new Pair<String, AttributeValue>("tY", new AttributeValue(0)), new Pair<String, AttributeValue>("tZ", new AttributeValue(0)), new Pair<String, AttributeValue>("isFix", new AttributeValue(false,"isFix")), new Pair<String, AttributeValue>("isTraversable", new AttributeValue(false,"isTraversable")),new Pair<String, AttributeValue>("URL", new AttributeValue("")));
        st.add(object.getName(), object);
	character = new Model("Character", object);
	character.addAttributes(new Pair<String, AttributeValue>("name", new AttributeValue("")), new Pair<String, AttributeValue>("description", new AttributeValue("")), new Pair<String, AttributeValue>("life", new AttributeValue(1)), new Pair<String, AttributeValue>("lifeMax", new AttributeValue(1)), new Pair<String, AttributeValue>("lifeMin", new AttributeValue(1)), new Pair<String, AttributeValue>("nbOfLives", new AttributeValue(1)), new Pair<String, AttributeValue>("magic", new AttributeValue(0)), new Pair<String, AttributeValue>("magicMax", new AttributeValue(0)), new Pair<String, AttributeValue>("magicMin", new AttributeValue(0)), new Pair<String, AttributeValue>("level", new AttributeValue(0)), new Pair<String, AttributeValue>("attack", new AttributeValue(0)), new Pair<String, AttributeValue>("defense", new AttributeValue(0)), new Pair<String, AttributeValue>("jumpForce", new AttributeValue(0)), new Pair<String, AttributeValue>("maxJumpsInTheAir", new AttributeValue(0)), new Pair<String, AttributeValue>("money", new AttributeValue(0)), new Pair<String, AttributeValue>("classification", new AttributeValue("")), new Pair<String, AttributeValue>("race", new AttributeValue("")), new Pair<String, AttributeValue>("acceleration", new AttributeValue(1)), new Pair<String, AttributeValue>("inventory", new AttributeValue(0)/*a revoir*/), new Pair<String, AttributeValue>("moveWithCamera", new AttributeValue(false,"moveWithCamera")), new Pair<String, AttributeValue>("equipedObject", new AttributeValue(0)/*a revoir*/), new Pair<String, AttributeValue>("rightHandObject", new AttributeValue(0)/*a revoir*/), new Pair<String, AttributeValue>("leftHandObject", new AttributeValue(0)/*a revoir*/));
	st.add(character.getName(), character);
        projectile = new Model("Projectile", object);
	projectile.addAttributes(new Pair<String, AttributeValue>("speed", new AttributeValue(1)), new Pair<String, AttributeValue>("damages", new AttributeValue(1)), new Pair<String, AttributeValue>("damageZone", new AttributeValue()/*a revoir*/));
	st.add(projectile.getName(), projectile);
        zone = new Model("Zone", object);
	zone.addAttributes(new Pair<String, AttributeValue>("name", new AttributeValue("")));
        st.add(zone.getName(), zone);
	obstacle = new Model("Obstacle", object);
	obstacle.addAttributes(new Pair<String, AttributeValue>("name", new AttributeValue("")));
        st.add(obstacle.getName(), obstacle);
	weapon = new Model("Weapon", object);
	weapon.addAttributes(new Pair<String, AttributeValue>("name", new AttributeValue("")), new Pair<String, AttributeValue>("nbMunitions", new AttributeValue(-1)), new Pair<String, AttributeValue>("nbMunitionsMax", new AttributeValue(-1)), new Pair<String, AttributeValue>("shootPower", new AttributeValue(1)), new Pair<String, AttributeValue>("shootInterval", new AttributeValue(new Duration(1, "s"))), new Pair<String, AttributeValue>("reloadTime", new AttributeValue(new Duration(1, "s"))));
        st.add(weapon.getName(), weapon);
        ground = new Model("Ground", object);
        ground.addAttribute("type", new AttributeValue(""));
        st.add(ground.getName(), ground);
    }

    public void addAttribut(String attr) {
	this.attributs.put(attr, null);
    }

    public void addAttribute(String attr, AttributeValue value) {
	this.attributs.put(attr, value);
    }

    public void addAttributes(Pair<String,AttributeValue>...attr) {
	for(int i=0; i<attr.length; i++){
	    attributs.put(attr[i].getFirst(), attr[i].getSecond());
	}
    }

    public Map<String, AttributeValue> getAllAttributes() {
	return new HashMap<String, AttributeValue>(attributs);
    }

    public boolean contains(String attr) {
	return attributs.containsKey(attr);
    }

    public AttributeValue getAttribute(String n){
        return this.attributs.get(n);
    }

    public List<String> listAttributes() {
        List<String> res = new ArrayList<String>();

        String[] tab = (String[])this.attributs.keySet().toArray(new String[0]);
        res.addAll(Arrays.asList(tab));
        
        return res;
    }

    public String getName() {
	return name;
    }

    public void toGenerate(){
        generate++;;
    }

    public int getGenerate(){
        return generate;
    }

    public static void addGenerated(Model m) {
	generated.add(m);
    }

    public static boolean generated(Model m) {
	return generated.contains(m);
    }
}
