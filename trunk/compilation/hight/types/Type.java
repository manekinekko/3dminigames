package types;

import java.util.*;
import lib.Pair;

public class Type {

    public static final Type Object = new Type("Object"),
            Character = new Type("Character");
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
