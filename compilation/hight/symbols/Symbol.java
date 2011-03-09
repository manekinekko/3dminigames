package symbols;

import attributes.AttributeValue;

public interface Symbol {
    public static enum Type{DEFINITION, ENTITY, MODEL};
    public String getName();
    public AttributeValue getAttribute(String n);
    public void addAttribute(String attr, AttributeValue value);
    public void toGenerate();
    public int getGenerate();
    public Type getType();
}
