package symbols;

import code.SymbolTable;
import attributes.*;
import java.util.*;
import lib.Pair;

public class Model implements Symbol {

    public static Model object, character, projectile, zone, obstacle, weapon, ground;
    private static List<Model> generated;
    private String name;
    private Map<String, Tmp> attributs; //Les objet Attributes contiennent les valeurs des attributs et non leur nom.
    private boolean generate = true;

    public Model(String name) {
	this.name = name;
	attributs = new HashMap<String, Tmp>();
    }

    public Model(String name, Model... subtypes) {
	this.name = name;
	attributs = new HashMap<String, Tmp>();
	for (int i = 0; i < subtypes.length; i++) {
	    attributs.putAll(subtypes[i].getAllAttributes());
	}
    }

    public static void init(SymbolTable st) {
	generated = new ArrayList();

	object = new Model("Object");
        object.addAttributes(new Pair<String, Tmp>("mass", new Tmp(0)), new Pair<String, Tmp>("posX", new Tmp(0)), new Pair<String, Tmp>("posY", new Tmp(0)), new Pair<String, Tmp>("posZ", new Tmp(0)), new Pair<String, Tmp>("orX", new Tmp(0)), new Pair<String, Tmp>("orY", new Tmp(0)), new Pair<String, Tmp>("orZ", new Tmp(0)), new Pair<String, Tmp>("tX", new Tmp(0)), new Pair<String, Tmp>("tY", new Tmp(0)), new Pair<String, Tmp>("tZ", new Tmp(0)), new Pair<String, Tmp>("isFix", new Tmp(false,"isFix")), new Pair<String, Tmp>("isTraversable", new Tmp(false,"isTraversable")),new Pair<String, Tmp>("URL", new Tmp("")));
	System.out.println(object.getAttribute("isFix").getType());
        st.add(object.getName(), object);
	character = new Model("Character", object);
	character.addAttributes(new Pair<String, Tmp>("name", new Tmp("")), new Pair<String, Tmp>("description", new Tmp("")), new Pair<String, Tmp>("life", new Tmp(1)), new Pair<String, Tmp>("lifeMax", new Tmp(1)), new Pair<String, Tmp>("lifeMin", new Tmp(1)), new Pair<String, Tmp>("nbOfLives", new Tmp(1)), new Pair<String, Tmp>("magic", new Tmp(0)), new Pair<String, Tmp>("magicMax", new Tmp(0)), new Pair<String, Tmp>("magicMin", new Tmp(0)), new Pair<String, Tmp>("level", new Tmp(0)), new Pair<String, Tmp>("attack", new Tmp(0)), new Pair<String, Tmp>("defense", new Tmp(0)), new Pair<String, Tmp>("jumpForce", new Tmp(0)), new Pair<String, Tmp>("maxJumpsInTheAir", new Tmp(0)), new Pair<String, Tmp>("money", new Tmp(0)), new Pair<String, Tmp>("classification", new Tmp("")), new Pair<String, Tmp>("race", new Tmp("")), new Pair<String, Tmp>("acceleration", new Tmp(1)), new Pair<String, Tmp>("inventory", new Tmp(0)/*a revoir*/), new Pair<String, Tmp>("moveWithCamera", new Tmp(false,"moveWithCamera")), new Pair<String, Tmp>("equipedObject", new Tmp(0)/*a revoir*/), new Pair<String, Tmp>("rightHandObject", new Tmp(0)/*a revoir*/), new Pair<String, Tmp>("leftHandObject", new Tmp(0)/*a revoir*/));
	st.add(character.getName(), character);
        projectile = new Model("Projectile", object);
	projectile.addAttributes(new Pair<String, Tmp>("speed", new Tmp(1)), new Pair<String, Tmp>("damages", new Tmp(1)), new Pair<String, Tmp>("damageZone", new Tmp()/*a revoir*/));
	st.add(projectile.getName(), projectile);
        zone = new Model("Zone", object);
	zone.addAttributes(new Pair<String, Tmp>("name", new Tmp("")));
        st.add(zone.getName(), zone);
	obstacle = new Model("Obstacle", object);
	obstacle.addAttributes(new Pair<String, Tmp>("name", new Tmp("")));
        st.add(obstacle.getName(), obstacle);
	weapon = new Model("Weapon", object);
	weapon.addAttributes(new Pair<String, Tmp>("name", new Tmp("")), new Pair<String, Tmp>("nbMunitions", new Tmp(-1)), new Pair<String, Tmp>("nbMunitionsMax", new Tmp(-1)), new Pair<String, Tmp>("shootPower", new Tmp(1)), new Pair<String, Tmp>("shootInterval", new Tmp(new Duration(1, "s"))), new Pair<String, Tmp>("reloadTime", new Tmp(new Duration(1, "s"))));
        st.add(weapon.getName(), weapon);
        ground = new Model("Ground", object);
        ground.addAttribute("type", new Tmp(""));
        st.add(ground.getName(), ground);
    }

    public void addAttribut(String attr) {
	this.attributs.put(attr, null);
    }

    public void addAttribute(String attr, Tmp value) {
	this.attributs.put(attr, value);
    }

    public void addAttributes(Pair<String,Tmp>...attr) {
	for(int i=0; i<attr.length; i++){
	    attributs.put(attr[i].getFirst(), attr[i].getSecond());
	}
    }

    public Map<String, Tmp> getAllAttributes() {
	return new HashMap<String, Tmp>(attributs);
    }

    public boolean contains(String attr) {
	return attributs.containsKey(attr);
    }

    public Tmp getAttribute(String n){
	System.out.println(n);
	System.out.println(this.attributs.get(n).getType());
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

    public static void addGenerated(Model m) {
	generated.add(m);
    }

    public static boolean generated(Model m) {
	return generated.contains(m);
    }
}
