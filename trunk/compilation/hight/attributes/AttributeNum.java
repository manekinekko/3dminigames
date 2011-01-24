/* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

import code.Code;

/**
 *
 * @author Quentin
 */
public class AttributeNum implements Attributes {

    private float f;
    private String last;
    private Code rd;

    public AttributeNum(float f) {
        this.f = f;
        last = "f";
    }

    public AttributeNum(Code f) {
        this.rd = f;
        last = "rd";
    }

    public void setValue(float f) {
        this.f = f;
        last = "f";
    }

    public void setValue(Code s) {
            this.rd = s;
            last = "rd";
    }

    public Object getValue() {
        if (last.equals("rd")) {
            return rd;
        } else {
            return f;
        }
    }

    @Override
    public String toString() {
        if (last.equals("rd")) {
            return rd.getCode();
        } else {
            return f + "";
        }
    }

    public void setValue(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(String r, String u) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(String s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
