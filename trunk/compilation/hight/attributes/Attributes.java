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
public interface Attributes {

    public void setValue(String r, String u);
    public void setValue(boolean b);
    public void setValue(float f);
    public void setValue(String s);
    public void setValue(Code s);
    public String getValue();
}
