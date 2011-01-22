/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package attributes;

/**
 *
 * @author Quentin
 */
public class AttributeInteger implements Attributes {
    private String rd;
    private int i;
    private String last ;

    public AttributeInteger(int i) {
        this.i = i;
        last = "i";
    }

    public AttributeInteger(String i) {
        this.rd = i;
        last = "rd";
    }

   public void setValue(int i){
        this.i=i;
        last = "i";
    }

    public void setValue(String s){
        if(s.contains("Rand")){
            this.rd = s;
            last = "rd";
        }
    }
    public Object getValue() {
        if(last.equals("rd")){
            return rd;
        }else{
            return i;
        }
    }

    @Override
    public String toString() {
        if(last.equals("rd")){
            return rd;
        }else{
            return i+"";
        }
    }

    public void setValue(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(String r, String u) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
