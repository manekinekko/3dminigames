package types;

import java.util.*;
import lib.Pair;

public class Type {

    public static Type object, character, projectile, zone, obstacle, weapon;
    private String name;
    private Map<String, Attributes> attributs; //Les objet Attributes contiennent les valeurs des attributs et non leur nom.

    public Type(String name) {
	this.name = name;
	attributs = new HashMap<String, Attributes>();
    }

    public Type(String name, String... attr) {
	this.name = name;
	attributs = new HashMap<String, Attributes>();

    }

    public Type(String name, Pair<String, Attributes>... attr) {
	this.name = name;
	attributs = new HashMap<String, Attributes>();
	for (int i = 0; i < attr.length; i++) {
	    attributs.put(attr[i].getFirst(), attr[i].getSecond());
	}
    }

    public Type(String name, Type... subtypes) {
	this.name = name;
	attributs = new HashMap<String, Attributes>();
	for (int i = 0; i < subtypes.length; i++) {
	    attributs.putAll(subtypes[i].getAllAttributes());
	}
    }

    public static void init() {
	object = new Type("Object", new Pair<String, Attributes>("mass", new AttributeFloat(0)), new Pair<String, Attributes>("posX", new AttributeFloat(0)), new Pair<String, Attributes>("posY", new AttributeFloat(0)), new Pair<String, Attributes>("posZ", new AttributeFloat(0)), new Pair<String, Attributes>("orX", new AttributeFloat(0)), new Pair<String, Attributes>("orY", new AttributeFloat(0)), new Pair<String, Attributes>("orZ", new AttributeFloat(0)), new Pair<String, Attributes>("tX", new AttributeFloat(0)), new Pair<String, Attributes>("tY", new AttributeFloat(0)), new Pair<String, Attributes>("tZ", new AttributeFloat(0)), new Pair<String, Attributes>("isFix", new AttributeBoolean(false)), new Pair<String, Attributes>("isTraversable", new AttributeBoolean(false)));
	character = new Type("Character", object);
	character.addAttribut(new Pair<String, Attributes>("name", new AttributeString("")), new Pair<String, Attributes>("description", new AttributeString("")), new Pair<String, Attributes>("life", new AttributeInteger(1)), new Pair<String, Attributes>("lifeMax", new AttributeInteger(1)), new Pair<String, Attributes>("lifeMin", new AttributeInteger(1)), new Pair<String, Attributes>("nbOfLives", new AttributeInteger(1)), new Pair<String, Attributes>("magic", new AttributeInteger(0)), new Pair<String, Attributes>("magicMax", new AttributeInteger(0)), new Pair<String, Attributes>("magicMin", new AttributeFloat(0)), new Pair<String, Attributes>("level", new AttributeInteger(0)), new Pair<String, Attributes>("attack", new AttributeInteger(0)), new Pair<String, Attributes>("defense", new AttributeInteger(0)), new Pair<String, Attributes>("jumpForce", new AttributeInteger(0)), new Pair<String, Attributes>("maxJumpsInTheAir", new AttributeInteger(0)), new Pair<String, Attributes>("money", new AttributeInteger(0)), new Pair<String, Attributes>("class", new AttributeString("")), new Pair<String, Attributes>("race", new AttributeString("")), new Pair<String, Attributes>("acceleration", new AttributeInteger(1)), new Pair<String, Attributes>("inventory", new AttributeFloat(0)/*a revoir*/), new Pair<String, Attributes>("moveWithCamera", new AttributeBoolean(false)), new Pair<String, Attributes>("equipedObject", new AttributeFloat(0)/*a revoir*/), new Pair<String, Attributes>("rightHandObject", new AttributeFloat(0)/*a revoir*/), new Pair<String, Attributes>("leftHandObject", new AttributeFloat(0)/*a revoir*/));
	projectile = new Type("Projectile", object);
	projectile.addAttribut(new Pair<String, Attributes>("speed", new AttributeInteger(1)), new Pair<String, Attributes>("damages", new AttributeInteger(1)), new Pair<String, Attributes>("damageZone", new AttributeString(null)/*a revoir*/));
	zone = new Type("Zone", object);
	zone.addAttribut(new Pair<String, Attributes>("name", new AttributeString("")));
	obstacle = new Type("Obstacle", object);
	obstacle.addAttribut(new Pair<String, Attributes>("name", new AttributeString("")));
	weapon = new Type("Weapon", object);
	weapon.addAttribut(new Pair<String, Attributes>("name", new AttributeString("")), new Pair<String, Attributes>("nbMunitions", new AttributeInteger(-1)), new Pair<String, Attributes>("nbMunitionsMax", new AttributeInteger(-1)), new Pair<String, Attributes>("shootPower", new AttributeInteger(1)), new Pair<String, Attributes>("shootInterval", new AttributeTime(1, "s")), new Pair<String, Attributes>("reloadTime", new AttributeTime(1, "s")));
    }

    public void addAttribut(String attr) {
	this.attributs.put(attr, null);
    }

    public void addAttribut(String attr, Attributes value) {
	this.attributs.put(attr, value);
    }

    public void addAttribut(Pair<String,Attributes>...attr) {
	for(int i=0; i<attr.length; i++){
	    attributs.put(attr[i].getFirst(), attr[0].getSecond());
	}
    }

    public void changeDefaultValue(String attr, Attributes value) {
	this.attributs.remove(attr);
	this.attributs.put(attr, value);
    }

    public Map<String, Attributes> getAllAttributes() {
	return new HashMap<String, Attributes>(attributs);
    }

    public boolean exist(String attr) {
	return attributs.containsKey(attr);
    }

    public String getName() {
	return name;
    }

    @Override
    public String toString() {
	return "";
    }
}
