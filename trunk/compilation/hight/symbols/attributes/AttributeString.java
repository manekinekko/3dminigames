/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package symbols.attributes;

/**
 *
 * @author Quentin
 */
public class AttributeString implements Attributes{
    private String str;

    public AttributeString(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
