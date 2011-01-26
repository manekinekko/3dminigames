package symbols;

import attributes.Attributes;

public interface Symbol {
    public String getName();
    public Attributes getAttribute(String n);
    public void toGenerate();
    public boolean getGenerate();
}
