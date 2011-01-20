/* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package symbols.attributes;

/**
 *
 * @author Quentin
 */
public class AttributeBoolean implements Attributes {
    private boolean b;

    public AttributeBoolean(boolean b) {
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