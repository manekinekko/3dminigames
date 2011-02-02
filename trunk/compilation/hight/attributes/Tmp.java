package attributes;

import code.Code;

/**
 *
 * @author Quentin
 */
public class Tmp {

    public static enum Type {NIL, BOOLEAN, ENUM, NUMBER, STRING, TIME};

    private Code value;
    private Type type;

    public Tmp() {
	value = null;
	type = Type.NIL;
    }

    public Tmp(Boolean b,String t) {
	System.out.println("plop "+t);
	value = new Code(b.toString());
	type = Type.BOOLEAN;
    }

    public Tmp(Number n) {
	value = new Code(n.floatValue()+"");
	type = Type.NUMBER;
    }

    public Tmp(String s) {
	value = new Code(s);
	type = Type.STRING;
    }

    public Tmp(Duration d) {
	value = d.getCode();
	type = Type.TIME;
    }

    public Tmp(Code c, Type t) {
	value = c;
	type = t;
    }

    public Code getCode() {
	return value;
    }

    public Type getType() {
	return type;
    }
}
