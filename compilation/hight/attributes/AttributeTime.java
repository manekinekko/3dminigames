/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

import code.Code;

/**
 *
 * @author Quentin
 */
public class AttributeTime implements Attributes {

    private int valeur;
    private String unite;
    private String last;
    private String rd;

    public AttributeTime(int v, String unite) {
        this.valeur = v;
        this.unite = unite;
        last = "unite";
    }

     public AttributeTime(String v, String unite) {
        this.rd = v;
        this.unite = unite;
        last = "rd";
    }

    public void setValue(int i, String u) {
        valeur = i;
        unite = u;
        last = "valeur";
    }

    public void setValue(String r, String u) {
            this.rd = r;
            unite = u;
            last = "rd";
    }

    public Object getValue() {
        if (last.equals("rd")) {
            return rd;
        } else {
            return valeur;
        }
    }

    public String getUnit() {
        return unite;
    }

    @Override
    public String toString() {
        if (last.equals("rd")) {
            return rd + " " + unite;
        } else {
            return valeur + " " + unite;
        }
    }

    public void setValue(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(String s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(Code s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
