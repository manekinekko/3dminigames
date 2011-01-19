package types;

import java.util.*;
import lib.Pair;

public class Type {

    public static final Type Object = new Type("Object",new Pair("mass",new AttributeFloat(0.0)),new Pair("posX",new AttributeFloat(0.0)),new Pair("posY",new AttributeFloat(0.0)),new Pair("posZ",new AttributeFloat(0.0)),new Pair("orX",new AttributeFloat(0.0)),new Pair("orY",new AttributeFloat(0.0)),new Pair("orZ",new AttributeFloat(0.0)),new Pair("tX",new AttributeFloat(0.0)),new Pair("tY",new AttributeFloat(0.0)),new Pair("tZ",new AttributeFloat(0.0)),new Pair("isFix",new AttributeBoolean(false)),new Pair("isTraversable",new AttributeBoolean(false))),
            Character = new Type("Character", Object, new Pair("name",new AttributeString("")), new Pair("description",new AttributeString("")), new Pair("life",new AttributeInteger(1)), new Pair("lifeMax",new AttributeInteger(1)),new Pair("lifeMin",new AttributeInteger(1)),new Pair("nbOfLives",new AttributeInteger(1)), new Pair("magic",new AttributeInteger(0)), new Pair("magicMax",new AttributeInteger(0)), new Pair("magicMin",new AttributeFloat(0)), new Pair("level",new AttributeInteger(0)), new Pair("attack",new AttributeInteger(0)), new Pair("defense",new AttributeInteger(0)), new Pair("jumpForce",new AttributeInteger(0)), new Pair("maxJumpsInTheAir",new AttributeIntger(0)), new Pair("money",new AttributeInteger(0)), new Pair("class",new AttributeString("")),new Pair("race",new AttributeString("")),new Pair("acceleration",new AttributeInteger(1)),new Pair("inventory",new AttributeFloat(0.0)/*a revoir*/),new Pair("moveWithCamera",new AttributeBoolean(false)), new Pair("equipedObject",new AttributeFloat(0.0)/*a revoir*/), new Pair("rightHandObject",new AttributeFloat(0.0)/*a revoir*/), new Pair("leftHandObject",new AttributeFloat(0.0)/*a revoir*/)),
            Projectile = new Type("Projectile", Object, new Pair("speed",new AttributeInteger(1)),new Pair("damages",new AttributeInteger(1)),new Pair("damageZone",new AttributeString("")/*a revoir*/)),
            Zone = new Type("Zone", Object,new Pair("name",new AttributeString(""))),
            Obstacle = new Type ("Obstacle", Object, new Pair("name",new AttributeString("")));
    private String name;
    private Map<String, Attributes> attributs; //Les objet Attributes contiennent les valeurs des attributs et non leur nom.

    public Type(String name) {
        this.name = name;
        attributs = new EnumMap(String.class);
    }

    public Type(String name, String... attr) {
        this.name = name;
        attributs = new EnumMap(String.class);

    }

    public Type(String name, Pair<String, Attributes> ... attr) {
        this.name = name;
        attributs = new EnumMap(String.class);
        for (int i = 0; i < attr.length; i++) {
            attributs.put(attr[i].getFirst(), attr[i].getSecond());
        }
    }

    public Type(String name, Type subtype, Pair<String, Attributes ... attr){
        this.name = name;
        attributs = new EnumMap(String.class);
        attributs.putAll(subtype.getAllAttributes());
        for (int i = 0; i < attr.length; i++) {
            attributs.put(attr[i].getFirst(), attr[i].getSecond());
        }
    }

    public Type(String name, Type... subtypes) {
        this.name = name;
        attributs = new EnumMap(String.class);
        for (int i = 0; i < subtypes.length; i++) {
            attributs.putAll(subtypes[i].getAllAttributes());
        }
    }

    public void addAttribut(String attr) {
        this.attributs.put(attr, null);
    }

    public void addAttribut(String attr, Attributes value) {
        this.attributs.put(attr, value);
    }

    public void changeDefaultValue(String attr, Attributes value) {
        this.attributs.remove(attr);
        this.attributs.put(attr, value);
    }

    public final Object getAttribut() {
        return ((ArrayList<String>) attributs).clone();
    }

    public Map<String, Attributes> getAllAttributes() {
        return new EnumMap(attributs);
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
