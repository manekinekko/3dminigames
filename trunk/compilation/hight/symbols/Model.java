package symbols;

import code.SymbolTable;
import attributes.*;
import java.util.*;
import lib.Pair;

public class Model implements Symbol {

    public static Model object, character, projectile, zone, obstacle, weapon, ground;
    private String name;
    private Map<String, Attributes> attributs; //Les objet Attributes contiennent les valeurs des attributs et non leur nom.
    private boolean generate = true;

    public Model(String name) {
	this.name = name;
	attributs = new HashMap<String, Attributes>();
    }

    public Model(String name, Model... subtypes) {
	this.name = name;
	attributs = new HashMap<String, Attributes>();
	for (int i = 0; i < subtypes.length; i++) {
	    attributs.putAll(subtypes[i].getAllAttributes());
	}
    }

    public static void init(SymbolTable st) {
	object = new Model("Object");
        object.addAttributes(new Pair<String, Attributes>("mass", new AttributeNum(0)), new Pair<String, Attributes>("posX", new AttributeNum(0)), new Pair<String, Attributes>("posY", new AttributeNum(0)), new Pair<String, Attributes>("posZ", new AttributeNum(0)), new Pair<String, Attributes>("orX", new AttributeNum(0)), new Pair<String, Attributes>("orY", new AttributeNum(0)), new Pair<String, Attributes>("orZ", new AttributeNum(0)), new Pair<String, Attributes>("tX", new AttributeNum(0)), new Pair<String, Attributes>("tY", new AttributeNum(0)), new Pair<String, Attributes>("tZ", new AttributeNum(0)), new Pair<String, Attributes>("isFix", new AttributeBoolean(false)), new Pair<String, Attributes>("isTraversable", new AttributeBoolean(false)));
        st.add(object.getName(), object);
	character = new Model("Character", object);
	character.addAttributes(new Pair<String, Attributes>("name", new AttributeString("")), new Pair<String, Attributes>("description", new AttributeString("")), new Pair<String, Attributes>("life", new AttributeNum(1)), new Pair<String, Attributes>("lifeMax", new AttributeNum(1)), new Pair<String, Attributes>("lifeMin", new AttributeNum(1)), new Pair<String, Attributes>("nbOfLives", new AttributeNum(1)), new Pair<String, Attributes>("magic", new AttributeNum(0)), new Pair<String, Attributes>("magicMax", new AttributeNum(0)), new Pair<String, Attributes>("magicMin", new AttributeNum(0)), new Pair<String, Attributes>("level", new AttributeNum(0)), new Pair<String, Attributes>("attack", new AttributeNum(0)), new Pair<String, Attributes>("defense", new AttributeNum(0)), new Pair<String, Attributes>("jumpForce", new AttributeNum(0)), new Pair<String, Attributes>("maxJumpsInTheAir", new AttributeNum(0)), new Pair<String, Attributes>("money", new AttributeNum(0)), new Pair<String, Attributes>("class", new AttributeString("")), new Pair<String, Attributes>("race", new AttributeString("")), new Pair<String, Attributes>("acceleration", new AttributeNum(1)), new Pair<String, Attributes>("inventory", new AttributeNum(0)/*a revoir*/), new Pair<String, Attributes>("moveWithCamera", new AttributeBoolean(false)), new Pair<String, Attributes>("equipedObject", new AttributeNum(0)/*a revoir*/), new Pair<String, Attributes>("rightHandObject", new AttributeNum(0)/*a revoir*/), new Pair<String, Attributes>("leftHandObject", new AttributeNum(0)/*a revoir*/));
	st.add(character.getName(), character);
        projectile = new Model("Projectile", object);
	projectile.addAttributes(new Pair<String, Attributes>("speed", new AttributeNum(1)), new Pair<String, Attributes>("damages", new AttributeNum(1)), new Pair<String, Attributes>("damageZone", new AttributeString(null)/*a revoir*/));
	st.add(projectile.getName(), projectile);
        zone = new Model("Zone", object);
	zone.addAttributes(new Pair<String, Attributes>("name", new AttributeString("")));
        st.add(zone.getName(), zone);
	obstacle = new Model("Obstacle", object);
	obstacle.addAttributes(new Pair<String, Attributes>("name", new AttributeString("")));
        st.add(obstacle.getName(), obstacle);
	weapon = new Model("Weapon", object);
	weapon.addAttributes(new Pair<String, Attributes>("name", new AttributeString("")), new Pair<String, Attributes>("nbMunitions", new AttributeNum(-1)), new Pair<String, Attributes>("nbMunitionsMax", new AttributeNum(-1)), new Pair<String, Attributes>("shootPower", new AttributeNum(1)), new Pair<String, Attributes>("shootInterval", new AttributeTime(1, "s")), new Pair<String, Attributes>("reloadTime", new AttributeTime(1, "s")));
        st.add(weapon.getName(), weapon);
        ground = new Model("Ground", object);
        ground.addAttribut("type", new AttributeString(""));
        st.add(ground.getName(), ground);
    }

    public void addAttribut(String attr) {
	this.attributs.put(attr, null);
    }

    public void addAttribut(String attr, Attributes value) {
	this.attributs.put(attr, value);
    }

    public void addAttributes(Pair<String,Attributes>...attr) {
	for(int i=0; i<attr.length; i++){
	    attributs.put(attr[i].getFirst(), attr[0].getSecond());
	}
    }

    public Map<String, Attributes> getAllAttributes() {
	return new HashMap<String, Attributes>(attributs);
    }

    public boolean contains(String attr) {
	return attributs.containsKey(attr);
    }

    public Attributes getAttribute(String n){
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
        generate = true;
    }

    public boolean getGenerate(){
        return generate;
    }
}
