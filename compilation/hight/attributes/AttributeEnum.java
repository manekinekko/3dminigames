/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package attributes;

import code.Code;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quentin
 */
public class AttributeEnum implements Attributes{
    private List<String> fields;
    private int value;

    public AttributeEnum(String value, String ... fields) {
        this.fields = new ArrayList<String>();

        for(int i=0; i< fields.length; i++)
            this.fields.add(i, fields[i]);

        if(this.fields.contains(value))
            this.value = this.fields.indexOf(value);
    }

    public String getValue() {
	return fields.get(value);
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

    public void setValue(String s) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(Code s) {
	throw new UnsupportedOperationException("Not supported yet.");
    }
}
