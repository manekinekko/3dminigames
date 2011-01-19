/* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package types;

/**
 *
 * @author Quentin
 */
public class AttributeBoolean implements Attributes {
    private boolean b;

    public AttributeBoolean(float b) {
        this.b = b;
    }

    public boolean booleanValue() {
        return b;
    }

    @Override
    public String toString() {
        if(b)
            return "true";
        else
            return "false";
    }
}