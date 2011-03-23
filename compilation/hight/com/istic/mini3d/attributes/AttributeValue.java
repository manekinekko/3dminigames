package com.istic.mini3d.attributes;

import com.istic.mini3d.code.Code;

/**
 *
 * @author Quentin
 */
public class AttributeValue {

    public static enum Type {NIL, BOOLEAN, ENUM, NUMBER, STRING, TIME, AGGR, ARRAY};

    private Code value;
    private Type type;

    public AttributeValue() {
	value = null;
	type = Type.NIL;
    }

    public AttributeValue(Boolean b) {
	value = new Code(b.toString());
	type = Type.BOOLEAN;
    }

    public AttributeValue(Number n) {
	value = new Code(n.floatValue()+"");
	type = Type.NUMBER;
    }

    public AttributeValue(String s) {
	value = new Code(s);
	type = Type.STRING;
    }

    public AttributeValue(Duration d) {
	value = d.getCode();
	type = Type.TIME;
    }

    public AttributeValue(Code c, Type t) {
	value = c;
	type = t;
    }

    public AttributeValue(Type t) {
	type = t;
	value = new Code();
    }

    public Code getCode() {
	return value;
    }
    
    
    public void setCode(Code c){
    	value = c;
    }

    public Type getType() {
	return type;
    }
}
