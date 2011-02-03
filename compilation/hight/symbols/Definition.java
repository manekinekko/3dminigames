/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package symbols;

import attributes.AttributeValue;
import code.Code;
import java.util.List;

/**
 *
 * @author Beben
 */
public class Definition implements Symbol {

    String name;
    Code c;
    boolean duplicable = false;
    boolean generate = false;

    public Definition(String s, Code c) {
        name = s;
        this.c = c;
    }

    public Code getCode() {
        return c;
    }

    public String getName() {
        return name;
    }

    public void setDuplicable(Entity et) {
        duplicable = duplicable && et.getDuplicable();
    }

    public boolean getDuplicable() {
        return duplicable;
    }

    public void toGenerate() {
        generate = true;
    }

    public boolean getGenerate() {
        return generate;
    }

    public AttributeValue getAttribute(String n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addAttribute(String attr, AttributeValue value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<String> listAttributes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
