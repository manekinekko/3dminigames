package com.istic.mini3d.attributes;

import com.istic.mini3d.code.Code;

/**
 *
 * @author Quentin
 */
public class Duration {

    private Code value;
    private String unit;

    public Duration(){
	value = new Code();
	unit = "MS";
    }

    public Duration(Number n, String u) {
	value = new Code(n.toString()+"");
	unit = u.toUpperCase();
    }

    public Duration(Code c, String u) {
	value = c;
	unit = u.toUpperCase();
    }

    public Code getCode() {
	int u = this.calcUnit();
	Code c = new Code();
	if(u != 1) {
	    c.append("(");c.append(value);c.append(")*"+u);
	} else {
	    c.append(value);
	}
	return c;
    }

    private int calcUnit() {
	if(unit.equals("MIN"))
	    return 60000;
	if(unit.equals("SEC"))
	    return 1000;
	if(unit.equals("MS"))
	    return 1;
	return 0;
    }
}
