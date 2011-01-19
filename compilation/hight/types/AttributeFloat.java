/* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package types;

/**
 *
 * @author Quentin
 */
public class AttributeFloat implements Attributes {
    private float f;

    public AttributeFloat(float f) {
        this.f = f;
    }

    public float floatValue() {
        return f;
    }

    @Override
    public String toString() {
        return f+"";
    }
}