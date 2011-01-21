/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Quentin
 */
public class Code {

    private String c;

    public Code() {
	c = "";
    }

    public Code(String s) {
	c = s;
    }

    public void append(String s) {
	c += s;
    }

    public void append(Code co) {
	c += co.getCode();
    }

    public String getCode() {
	return c;
    }

    public static Code genEntity(String name) {
	return new Code("object" + name + "=");
    }

    public static Code genRessourceI(String name, float value, boolean fin) {
	Code co = new Code(" " + name + "=" + value);
	if (fin) {
	    co.append(" ;");
	} else {
	    co.append(",");
	}
	return co;
    }

    public static Code genRessourceS(String name, String value, boolean fin) {
	Code co = new Code(" " + name + "=" + value);
	if (fin) {
	    co.append(" ;");
	} else {
	    co.append(",");
	}
	return co;
    }
/*
    public Code genCam(String name, float value) {
	Code co = new Code("camera" + name + "{ position :");
	for (int i = 0; i < 3; i++) {
	    co.append(value[i]);
	}
	co.append("; \n angle :");
	for (int i = 3;
		i < 5;
		i++) {
	    co.append(value[i]);
	}
	co.append("; }");
	return co;
    }

    public Code genKListener(String... com, String ... sig){
	Code co = new Code("keylistener {");
	for (int i = 0, i  < com.length, i++ ){
	    co.append(com[i] + ":" + sig[i]);
	    if (i != com.length - 1) {
		co.append(",");
	    }
	}
	co.append("}");
	return co;
    }

    public Code genMListener(String... com, String ... sig){
	Code co = new Code("mouselistener {");
	for (int i = 0, i  < com.length, i++ ){
	    co.append(com[i] + ":" + sig[i]);
	    if (i != com.length - 1) {
		co.append(",");
	    }
	}
	co.append("}");
	return co;
    }*/

    public static Code genSigPre(String name, String pre) {
	return new Code(name + "->" + pre + ";");
    }

    public static Code genSigOp(String name, String entities, String ress, String op, float value) {
	return new Code(name + "->" + entities + "." + ress + "apply (" + op + value + ");");
    }

    public static Code genRD(String val1, String val2){
        return new Code("Rand("+val1+","+val2+")");
    }

    public static Code genEOF() {
	return new Code(";;");
    }
}
