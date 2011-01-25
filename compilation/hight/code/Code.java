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

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////Assignation//////////////////////////////////////



    



////////////////////////////////////////////////////////////////////////////////
///////////////////////////////Conditions///////////////////////////////////////

    public static Code genNot(Code c) {
        Code cod = new Code();

        cod.append("!(");
        cod.append(cod);
        cod.append(")");
        
        return cod;
    }

    public static Code genOr(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") || (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }

    public static Code genAnd(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") && (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }

        public static Code genInfEg(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") <= (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }
    public static Code genInf(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") < (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }
    public static Code genSupEg(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") >= (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }
    public static Code genSup(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") > (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }
    public static Code genEquals(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") == (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }
    public static Code genDiff(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") != (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }


////////////////////////////////////////////////////////////////////////////////
///////////////////////////////Opérations///////////////////////////////////////
    public static Code genRD(Code c1, Code c2){ //Math.round() arrondi ?
        Code c = new Code("Math.ramdom()*(");
        c.append(c1);
        c.append("-");
        c.append(c2);
        c.append(") + (");
        c.append(c2);
        return c;
    }

    public static Code genPLUS(Code c1, Code c2){
        Code c = new Code("(");
        c.append(c1);
        c.append(") + (");
        c.append(c2);
        c.append(")");
      return c;
    }

    public static Code genMINUS(Code c1,Code c2){
        Code c = new Code("(");
        c.append(c1);
        c.append(") - (");
        c.append(c2);
        c.append(")");
      return c;
    }

    public static Code genMUL(Code c1,Code c2){
        Code c = new Code("(");
        c.append(c1);
        c.append(") * (");
        c.append(c2);
        c.append(")");
      return c;
    }

    public static Code genDIV(Code c1,Code c2){
        Code c = new Code("(");
        c.append(c1);
        c.append(") / (");
        c.append(c2);
        c.append(")");
      return c;
    }

    public static Code genMOD(Code c1,Code c2){
        Code c = new Code("(");
        c.append(c1);
        c.append(") % (");
        c.append(c2);
        c.append(")");
        return c;
    }

    public static Code genPOW(Code c1,Code c2){
        Code c = new Code("Math.pow(");
        c.append(c1);
        c.append(",");
        c.append(c2);
        c.append(")");
        return c;
    }
 ///////////////////////////////////////////////////////////////////////////////

    public static Code genIF(Code co, Code r1,Code r2){
        Code c = new Code ("if(");
        c.append(co);
        c.append("){ \n");
        c.append(r1);
        c.append("} \n");
        if(r2!= null){
            c.append("else{ \n");
            c.append(r2);
            c.append("} \n");
        }
        return c;
    }

    public static Code genEOL() {
	return new Code(";");
    }
}
