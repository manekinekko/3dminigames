/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import attributes.*;
import java.util.Iterator;
import symbols.Definition;
import symbols.Entity;
import symbols.Model;


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
        if (co != null) {
            c += co.getCode();
        }
    }

    public String getCode() {
        return c;
    }

    @Override
    public String toString() {
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

	public static Code genAffect(Code s1, Code s2){
		Code cod = new Code();
		
		cod.append(s1);
		cod.append(" = ");
		cod.append(s2);
		cod.append(";\n");
		return cod;
	}

        public static Code genIncr(Code s1, Code s2){
		Code cod = new Code();

		cod.append(s1);
		cod.append(" += ");
		cod.append(s2);
                cod.append(";\n");
		return cod;
	}

        public static Code genSub(Code s1, Code s2){
		Code cod = new Code();

		cod.append(s1);
		cod.append(" -= ");
		cod.append(s2);
                cod.append(";\n");
		return cod;
	}

        public static Code genInvert(Code s1, Code s2){
		Code cod = new Code("var tmp = ");

		cod.append(s1);
		cod.append(";\n");
                cod.append(s1);
                cod.append(" = ");
		cod.append(s2);
                cod.append(";\n");
                cod.append(s2);
                cod.append(" = tmp ;\n");

		return cod;
	}

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////Conditions///////////////////////////////////////
    public static Code genNot(Code c) {
        Code cod = new Code();

        cod.append("!(");
        cod.append(c);
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
    public static Code genRD(Code c1, Code c2) { //Math.round() arrondi ?
        Code c = new Code("Math.random()*(");
        c.append(c1);
        c.append("-");
        c.append(c2);
        c.append(") + (");
        c.append(c2);
	c.append(")");
        return c;
    }

    public static Code genPLUS(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") + (");
        c.append(c2);
        c.append(")");
        return c;
    }

    public static Code genMINUS(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") - (");
        c.append(c2);
        c.append(")");
        return c;
    }

    public static Code genMUL(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") * (");
        c.append(c2);
        c.append(")");
        return c;
    }

    public static Code genDIV(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") / (");
        c.append(c2);
        c.append(")");
        return c;
    }

    public static Code genMOD(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") % (");
        c.append(c2);
        c.append(")");
        return c;
    }

    public static Code genPOW(Code c1, Code c2) {
        Code c = new Code("Math.pow(");
        c.append(c1);
        c.append(",");
        c.append(c2);
        c.append(")");
        return c;
    }
    
////////////////////////////////////////////////////////////////////////////////
///////////////////////////////Coordonnées//////////////////////////////////////
    
    public static Code genPosX(String s) {
        return new Code(s+".posX");
    }

    public static Code genoRX(String s) {
        return new Code(s+".orX");
    }

    public static Code genTX(String s) {
        return new Code(s+".tX");
    }

    public static Code genPosY(String s) {
        return new Code(s+".posY");
    }

    public static Code genoRY(String s) {
        return new Code(s+".orY");
    }

    public static Code genTY(String s) {
        return new Code(s+".tY");
    }

    public static Code genPosZ(String s) {
        return new Code(s+".posZ");
    }

    public static Code genoRZ(String s) {
        return new Code(s+".orZ");
    }

    public static Code genTZ(String s) {
        return new Code(s+".tZ");
    }
 ///////////////////////////////////////////////////////////////////////////////

    public static Code genIF(Code co, Code r1,Code r2){
        Code c = new Code ("if(");
        c.append(co);
        c.append("){ \n");
        c.append(r1);
        c.append("} \n");
        if (r2 != null) {
            c.append("else{ \n");
            c.append(r2);
            c.append("} \n");
        }
        return c;
    }

    public static Code genAccess(String nom,String at){
        Code c = new Code(nom);
        c.append(".");
        c.append(at);
        return c;
    }

    public static Code genEOL() {
        return new Code(";");
    }

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////Models/Entitées//////////////////////////////////
    public static Code genModel(Model m) {
	if(Model.generated(m)) //On vérifie que le model n'est pas déjà généré.
	    return new Code();

	Code cod = new Code();
	cod.append("function "+m.getName()+"() {\n");
	Iterator<String> it = m.listAttributes().iterator();
	while(it.hasNext()) {
	    String attribute = it.next();
	    AttributeValue value = m.getAttribute(attribute);
	    cod.append("\tthis."+attribute+" = ");
	    if(value.getType() == AttributeValue.Type.NUMBER || value.getType() == AttributeValue.Type.BOOLEAN || value.getType() == AttributeValue.Type.TIME)
		cod.append(value.getCode());
	    else if(value.getType() == AttributeValue.Type.STRING || value.getType() == AttributeValue.Type.ENUM)
		cod.append("'"+value.getCode()+"'");

	    cod.append(";\n");
	}
	cod.append("}\n");
	Model.addGenerated(m);

	return cod;
    }

    public static Code genFuncEntity(Entity ent) {
	Code cod = new Code();
	cod.append("function gen"+ent.getName()+"() {\n");
	cod.append("\tvar entity = new "+ent.listModels().get(0).getName()+"();\n");

	Iterator<String> it = ent.listModifyAttributes().iterator();
	while(it.hasNext()) {
	    String attribute = it.next();
	    AttributeValue value = ent.getAttribute(attribute);
	    if(value.getType() == AttributeValue.Type.NUMBER || value.getType() == AttributeValue.Type.BOOLEAN || value.getType() == AttributeValue.Type.TIME)
		cod.append("\tentity."+attribute+" = "+value.getCode()+";\n");
	    else if(value.getType() == AttributeValue.Type.STRING || value.getType() == AttributeValue.Type.ENUM)
		cod.append("\tentity."+attribute+" = '"+value.getCode()+"';\n");
	}

	cod.append("\treturn entity;\n}\n");
	return cod;
    }

   /* public static Code genEntity(Entity ent) {
	Code cod = new Code();
	cod.append("var "+ent.getName()+" = gen"+ent.getName()+"();\n");

	return cod;
    }*/


        public static Code genFuncDef(Definition def){
    	
    	Code c = new Code();

    	c.append("function " + def.getName() + "() {\n");
    	c.append(def.getCode());
    	c.append("}\n");
	
    	return c;
    	
        }
       
        public static Code genEntity(Entity ent) {
    	Code c = new Code();
    	c.append(ent.getName()+" = gen"+ent.getName()+"();\n");

    	return c;
        }      
        
        /* Appel de la fonction addObject du moteur3D 
        	MOTEUR3D.addObject(idObject,urlObject, tabCoord, idParent)
        */
        
        public static Code genAddObject(Entity ent){
        	
        	Code c = new Code("MOTEUR3D.addObject(");
        	String name = ent.getName();
        	
        	c.append(name + ",");
        	c.append(name + ".obj" + ",");
         	c.append("new Array(");
        	c.append(ent.getAttribute("posX").getCode());
        	c.append(",");
        	c.append(ent.getAttribute("posY").getCode());
        	c.append(",");
        	c.append(ent.getAttribute("posZ").getCode());
        	c.append(",");
        	c.append(ent.getAttribute("orX").getCode());
        	c.append(",");
        	c.append(ent.getAttribute("orY").getCode());
        	c.append(",");
        	c.append(ent.getAttribute("orZ").getCode());
        	c.append(",");
        	c.append(ent.getAttribute("tX").getCode());
        	c.append(")");
        	c.append(")\n");
        	
        	return c;
        }
        /*
         * Classe qui permet de générer le code pour un tableau en JS.
         * name : nom du tableau
         * x : taille du tabbleau si c'est tableau a deux dimensions (argument facultatif)
         * Exemple : Tab[x][y] -> genTab("Tab",x);
         *           Tab[v]-> genTab("Tab");
         */
        public static Code genTab(String name,Integer x){
            Code c = new Code();
            c.append(name+"= new Array();");
            if(x!=null){
                c.append("for(var i = 0; i<"+String.valueOf(x)+";i++) {\n");
                c.append("\t"+name+"[i] = new Array();\n");
                c.append("}");
            }
            return c;
        }
        	
}
