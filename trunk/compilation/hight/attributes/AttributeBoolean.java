/* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package attributes;

import code.Code;

/**
 *
 * @author Quentin
 */
public class AttributeBoolean implements Attributes {
    private boolean b;

    public AttributeBoolean(boolean b) {
        this.b = b;
    }

    public void setValue(boolean b){
        this.b=b;
    }

    public String getValue() {
        return b+"";
    }

    @Override
    public String toString() {
        if(b)
            return "true";
        else
            return "false";
    }

    public void setValue(String r, String u) {
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