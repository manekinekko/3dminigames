/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package attributes;

/**
 *
 * @author Quentin
 */
public class AttributeString implements Attributes{
    private String str;

    public AttributeString(String str) {
        this.str = str;
    }

    public void setValue(String s){
        str =s;
    }
    public String getValue(){
        return str;
    }

    @Override
    public String toString() {
        return str;
    }

    public void setValue(String r, String u) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
