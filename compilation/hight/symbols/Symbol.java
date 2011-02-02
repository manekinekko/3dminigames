package symbols;

import attributes.Attributes;
import attributes.Tmp;

public interface Symbol {
    public String getName();
    public Tmp getAttribute(String n);
    public void addAttribute(String attr, Tmp value);
    public void toGenerate();
    public boolean getGenerate();
}
