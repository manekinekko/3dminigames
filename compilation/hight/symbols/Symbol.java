package symbols;

import attributes.AttributeValue;

public interface Symbol {
    public String getName();
    public AttributeValue getAttribute(String n);
    public void addAttribute(String attr, AttributeValue value);
    public void toGenerate();
    public boolean getGenerate();
}
