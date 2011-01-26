/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package symbols;

import attributes.Attributes;
import code.Code;

/**
 *
 * @author Beben
 */
public class Definition implements Symbol{

    String name;
    Code c;
    boolean generate = false;

    public Definition(String s, Code c){
        name = s;
        this.c=c;
    }

    public Code getCode() {
        return c;
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

    public Attributes getAttribute(String n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addAttribute(String attr, Attributes value) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

}
