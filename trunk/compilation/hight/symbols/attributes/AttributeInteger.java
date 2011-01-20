/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package symbols.attributes;

/**
 *
 * @author Quentin
 */
public class AttributeInteger implements Attributes {
    private int i;

    public AttributeInteger(int i) {
        this.i = i;
    }

    public int intValue() {
        return i;
    }

    @Override
    public String toString() {
        return i+"";
    }
}
