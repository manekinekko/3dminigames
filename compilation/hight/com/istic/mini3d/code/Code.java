package com.istic.mini3d.code;

import com.istic.mini3d.attributes.*;
import com.istic.mini3d.symbols.Control;
import java.util.Iterator;
import java.util.List;

import com.istic.mini3d.symbols.Definition;
import com.istic.mini3d.symbols.Entity;
import com.istic.mini3d.symbols.Model;
import java.util.ArrayList;

/**
 * Classe de gestion des Objets de type Code
 * @author Mini3D
 * @version 1.0
 */
public class Code {

    private String c;

    /**
     * Constructeur simple de la classe
     * Permet de créer un objet de type code vide.
     */
    public Code() {
        c = "";
    }

    /**
     * Constructeur paramétrable de la classe.
     * Permet de créer un objet de type code qui contient le code du string s.
     * @param s valeur qui doit être contenue dans l'objet de type code.
     */
    public Code(String s) {
        c = s;
    }

    /**
     * Concatenateur de code/chaine de caractère.
     * Permet d'ajouter un chaine de caractère a la suite du code existant.
     * @param s chaine de caractère a ajouter a la suite du code courant.
     */
    public void append(String s) {
        c += s;
    }

    /**
     * Concatenateur de code/code.
     * Permet d'ajouter un code a la suite du code existant.
     * @param co objet Code a ajouter a la suite du code courant.
     */
    public void append(Code co) {
        if (co != null) {
            c += co.getCode();
        }
    }

    /**
     * Accesseur au code
     * Permet de réccupérer le javaScrit contenu dans l'objet code
     * @return code Javascript stocké dans l'objet
     */
    public String getCode() {
        return c;
    }

    @Override
    public String toString() {
        return c;
    }

    /**
     * Méthode de génération du code d'une entité.
     * Permet de générer le JavaScript voulu.
     * @param name nom de l'entité.
     * @return code JavaScript représentatif de la déclaration de l'entité.
     */
    public static Code genEntity(String name) {
        return new Code("object" + name + "=");
    }

    /**
     * Méthode de génération du code d'une ressource.
     * Permet de générer le code pour la déclaration d'une ressource.
     * @param name nom de la ressource.
     * @param value valeur de la ressource sous forme de float.
     * @param fin boolen représentatif de la fin de ligne.
     * @return code JavaScript représentatif de la déclaration de l'entité.
     */
    public static Code genRessourceI(String name, float value, boolean fin) {
        Code co = new Code(" " + name + "=" + value);
        if (fin) {
            co.append(" ;");
        } else {
            co.append(",");
        }
        return co;
    }

    /**
     * Méthode de génération du code d'une ressource.
     * Permet de générer le code pour la déclaration d'une ressource.
     * @param name nom de la ressource.
     * @param value valeur de la ressource sous forme de chaine de caractère.
     * @param fin boolen représentatif de la fin de ligne.
     * @return code JavaScript l'affectation de la ressource.
     */
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

    /**
     * 
     * @param name
     * @param pre
     * @return
     */
    public static Code genSigPre(String name, String pre) {
        return new Code(name + "->" + pre + ";");
    }

    /**
     * 
     * @param name
     * @param entities
     * @param ress
     * @param op
     * @param value
     * @return
     */
    public static Code genSigOp(String name, String entities, String ress, String op, float value) {
        return new Code(name + "->" + entities + "." + ress + "apply (" + op + value + ");");
    }

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////Assignation//////////////////////////////////////
    /**
     * Methode qui permet de générer le code de l'affectation.
     * Permet de créer le code JavaScript d'une affectation de la forme "A = B;".
     * @param s1 code de l'objet qui subit l'affectation.
     * @param s2 code de la valeur a affecter.
     * @return code JavaScript de l'affectation.
     */
    public static Code genAffect(Code s1, Code s2) {
        Code cod = new Code();

        cod.append(s1);
        cod.append(" = ");
        cod.append(s2);
        cod.append(";\n");
        return cod;
    }

    /**
     * Methode qui permet de générer le code de l'incrémentation.
     * Permet de créer le code JavaScript d'une incrémentation de la forme "A += B;".
     * @param s1 code de la variable a incrémenter.
     * @param s2 code de la valeur a incrémenter.
     * @return code JavaScript de l'incrémentation.
     */
    public static Code genIncr(Code s1, Code s2) {
        Code cod = new Code();

        cod.append(s1);
        cod.append(" += ");
        cod.append(s2);
        cod.append(";\n");
        return cod;
    }

    /**
     * Methode qui permet de générer le code de l'incrémentation.
     * Permet de créer le code JavaScript d'une incrémentation de la forme "A -= B;".
     * @param s1 code de la variable a décrémenter.
     * @param s2 code de la valeur a décrémenter.
     * @return code JavaScript de l'incrémentation.
     */
    public static Code genSub(Code s1, Code s2) {
        Code cod = new Code();

        cod.append(s1);
        cod.append(" -= ");
        cod.append(s2);
        cod.append(";\n");
        return cod;
    }

    /**
     * Methode qui permet de générer le code de l'inversion de deux variables.
     * Permet de créer le code JavaScript d'une inversion de contenu entre deux variables.
     * @param s1 code d'une variable a inverser.
     * @param s2 code d'une variable a inverser.
     * @return code JavaScript de l'invertion de la variable.
     */
    public static Code genInvert(Code s1, Code s2) {
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
    /**
     * Methode qui permet de générer le code de l'inversion d'une variable.
     * Permet de générer le code Javascript qui inverse la valeur booleenne d'un code.
     * @param c code a inverser (sens booléen)
     * @return code Javascript de l'inversion de c
     */
    public static Code genNot(Code c) {
        Code cod = new Code();

        cod.append("!(");
        cod.append(c);
        cod.append(")");

        return cod;
    }

    /**
     * Méthode qui permet de générer le code pour le "ou".
     * Permet de générer le code pour réaliser un "ou" logique entre deux conditions passées en paramètre sous forme de code.
     * @param cond1 une des conditions
     * @param cond2 une des conditions
     * @return code JavaScript du "ou"
     */
    public static Code genOr(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") || (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }

    /**
     * Méthode qui permet de générer le code pour le "et".
     * Permet de générer le code pour réaliser un "et" logique entre deux conditions passées en paramètre sous forme de code.
     * @param cond1 une des conditions
     * @param cond2 une des conditions
     * @return code JavaScript du "et"
     */
    public static Code genAnd(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") && (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }

    /**
     * Méthode qui permet de générer le code pour le "<=".
     * Permet de générer le code pour réaliser un "<="  entre deux valeur passées en paramètre sous forme de code.
     * @param cond1 une des valeur
     * @param cond2 une des valeur
     * @return code JavaScript du "<="
     */
    public static Code genInfEg(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") <= (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }

    /**
     * Méthode qui permet de générer le code pour le "<".
     * Permet de générer le code pour réaliser un "<"  entre deux valeur passées en paramètre sous forme de code.
     * @param cond1 une des valeur
     * @param cond2 une des valeur
     * @return code JavaScript du "<"
     */
    public static Code genInf(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") < (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }

    /**
     * Méthode qui permet de générer le code pour le ">=".
     * Permet de générer le code pour réaliser un ">="  entre deux valeur passées en paramètre sous forme de code.
     * @param cond1 une des valeur
     * @param cond2 une des valeur
     * @return code JavaScript du ">="
     */
    public static Code genSupEg(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") >= (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }

    /**
     * Méthode qui permet de générer le code pour le ">".
     * Permet de générer le code pour réaliser un ">"  entre deux valeur passées en paramètre sous forme de code.
     * @param cond1 une des valeur
     * @param cond2 une des valeur
     * @return code JavaScript du ">"
     */
    public static Code genSup(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") > (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }

    /**
     * Méthode qui permet de générer le code pour le "==".
     * Permet de générer le code pour réaliser un "=="  entre deux valeur passées en paramètre sous forme de code.
     * @param cond1 une des valeur
     * @param cond2 une des valeur
     * @return code JavaScript du "=="
     */
    public static Code genEquals(Code cond1, Code cond2) {
        Code cod = new Code();

        cod.append("(");
        cod.append(cond1);
        cod.append(") == (");
        cod.append(cond2);
        cod.append(")");

        return cod;
    }

    /**
     * Méthode qui permet de générer le code pour le "!=".
     * Permet de générer le code pour réaliser un "!="  entre deux valeur passées en paramètre sous forme de code.
     * @param cond1 une des valeur
     * @param cond2 une des valeur
     * @return code JavaScript du "!="
     */
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
    /**
     * Méthode qui permet de générer le code pour un random
     * Permet de générer le code pour réaliser un random  entre deux valeur passées en paramètre sous forme de code.
     * @param c1 une des valeur
     * @param c2 une des valeur
     * @return code JavaScript du "random"
     */
    public static Code genRD(Code c1, Code c2) { //Math.round() arrondi ?
        Code c = new Code("Math.random()*(");
        c.append(c2);
        c.append("-");
        c.append(c1);
        c.append(") + (");
        c.append(c1);
        c.append(")");
        return c;
    }

    /**
     * Méthode qui permet de générer le code pour le "+".
     * Permet de générer le code pour réaliser un "+"  entre deux valeur passées en paramètre sous forme de code.
     * @param c1 une des valeur
     * @param c2 une des valeur
     * @return code JavaScript du "+"
     */
    public static Code genPLUS(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") + (");
        c.append(c2);
        c.append(")");
        return c;
    }

    /**
     * Méthode qui permet de générer le code pour le "-".
     * Permet de générer le code pour réaliser un "-"  entre deux valeur passées en paramètre sous forme de code.
     * @param c1 une des valeur
     * @param c2 une des valeur
     * @return code JavaScript du "-"
     */
    public static Code genMINUS(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") - (");
        c.append(c2);
        c.append(")");
        return c;
    }

    /**
     * Méthode qui permet de générer le code pour le "*".
     * Permet de générer le code pour réaliser un "*"  entre deux valeur passées en paramètre sous forme de code.
     * @param c1 une des valeur
     * @param c2 une des valeur
     * @return code JavaScript du "*"
     */
    public static Code genMUL(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") * (");
        c.append(c2);
        c.append(")");
        return c;
    }

    /**
     * Méthode qui permet de générer le code pour le "/".
     * Permet de générer le code pour réaliser un "/"  entre deux valeur passées en paramètre sous forme de code.
     * @param c1 une des valeur
     * @param c2 une des valeur
     * @return code JavaScript du "/"
     */
    public static Code genDIV(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") / (");
        c.append(c2);
        c.append(")");
        return c;
    }

    /**
     * Méthode qui permet de générer le code pour le modulo.
     * Permet de générer le code pour réaliser un modulo  entre deux valeur passées en paramètre sous forme de code.
     * @param c1 une des valeur
     * @param c2 une des valeur
     * @return code JavaScript du modulo
     */
    public static Code genMOD(Code c1, Code c2) {
        Code c = new Code("(");
        c.append(c1);
        c.append(") % (");
        c.append(c2);
        c.append(")");
        return c;
    }

    /**
     * Méthode qui permet de générer le code pour les puissances.
     * Permet de générer le code pour réaliser une puissance entre deux valeur passées en paramètre sous forme de code.
     * @param c1 une des valeur
     * @param c2 une des valeur
     * @return code JavaScript de la puissance
     */
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
    /**
     * Méthode qui génère le code d'accès a la position de l'entité.
     * Permet de génèrer le code d'accès a la position de l'entité sur l'axe des X.
     * @param s nom de l'entité.
     * @return code JavaScript d'accès a la position.
     */
    public static Code genPosX(String s) {
        return new Code(s + ".posX");
    }

    /**
     * Méthode qui génère le code d'accès a l'orientation de l'entité.
     * Permet de génèrer le code d'accès a l'orientation de l'entité sur l'axe des X.
     * @param s nom de l'entité.
     * @return code JavaScript d'accès a l'orientation.
     */
    public static Code genoRX(String s) {
        return new Code(s + ".orX");
    }

    /**
     * Méthode qui génère le code d'accès a la taille de l'entité.
     * Permet de génèrer le code d'accès a la taille de l'entité sur l'axe des X.
     * @param s nom de l'entité.
     * @return code JavaScript d'accès a la taille.
     */
    public static Code genTX(String s) {
        return new Code(s + ".tX");
    }

    /**
     * Méthode qui génère le code d'accès a la position de l'entité.
     * Permet de génèrer le code d'accès a la position de l'entité sur l'axe des Y.
     * @param s nom de l'entité.
     * @return code JavaScript d'accès a la position.
     */
    public static Code genPosY(String s) {
        return new Code(s + ".posY");
    }

    /**
     * Méthode qui génère le code d'accès a l'orientation de l'entité.
     * Permet de génèrer le code d'accès a l'orientation de l'entité sur l'axe des Y.
     * @param s nom de l'entité.
     * @return code JavaScript d'accès a l'orientation.
     */
    public static Code genoRY(String s) {
        return new Code(s + ".orY");
    }

    /**
     * Méthode qui génère le code d'accès a la taille de l'entité.
     * Permet de génèrer le code d'accès a la taille de l'entité sur l'axe des Y.
     * @param s nom de l'entité.
     * @return code JavaScript d'accès a la taille.
     */
    public static Code genTY(String s) {
        return new Code(s + ".tY");
    }

    /**
     * Méthode qui génère le code d'accès a la position de l'entité.
     * Permet de génèrer le code d'accès a la position de l'entité sur l'axe des Z.
     * @param s nom de l'entité.
     * @return code JavaScript d'accès a la position.
     */
    public static Code genPosZ(String s) {
        return new Code(s + ".posZ");
    }

    /**
     * Méthode qui génère le code d'accès a l'orientation de l'entité.
     * Permet de génèrer le code d'accès a l'orientation de l'entité sur l'axe des Z.
     * @param s nom de l'entité.
     * @return code JavaScript d'accès a l'orientation.
     */
    public static Code genoRZ(String s) {
        return new Code(s + ".orZ");
    }

    /**
     * Méthode qui génère le code d'accès a la taille de l'entité.
     * Permet de génèrer le code d'accès a la taille de l'entité sur l'axe des Z.
     * @param s nom de l'entité.
     * @return code JavaScript d'accès a la taille.
     */
    public static Code genTZ(String s) {
        return new Code(s + ".tZ");
    }
    ///////////////////////////////////////////////////////////////////////////////

    /**
     * Méthode qui génère le code du if.
     * Permet de générer le code du if...then...else... Si le deuxième paramètre est null on génère juste if...then...
     * @param co condition du if.
     * @param r1 action du then.
     * @param r2 action du else.
     * @return code JavaScript du if.
     */
    public static Code genIF(Code co, Code r1, Code r2) {
        Code c = new Code("if(");
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

    /**
     * Méthode qui génère le code d'un accès.
     * Permet de générer le code JavaScript d'un accès a l'attribut d'une entité.
     * @param nom nom de l'entité.
     * @param at nom de l'attribut.
     * @return code JavaScript de l'accès de données.
     */
    public static Code genAccess(String nom, String at) {
        Code c = new Code(nom);
        c.append(".");
        c.append(at);
        return c;
    }

    /**
     * Méthode qui génère le code de fin de ligne.
     * Permet la génération du ";" de fin de ligne.
     * @return code JavaScript de la fin de ligne.
     */
    public static Code genEOL() {
        return new Code(";");
    }

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////Models/Entitées//////////////////////////////////
    /**
     * Méthode qui génère le code d'un Model.
     * Permet le génération d'une classe JavaScript correspondant au model.
     * @param m Model à générer.
     * @return code JavaScript du model.
     */
    public static Code genModel(Model m) {
        if (Model.generated(m)) //On vérifie que le model n'est pas déjà généré.
        {
            return new Code();
        }

        Code cod = new Code();
        cod.append("function " + m.getName() + "() {\n");
        Iterator<String> it = m.listAttributes().iterator();
        while (it.hasNext()) {
            String attribute = it.next();
            AttributeValue value = m.getAttribute(attribute);
            cod.append("\tthis." + attribute + " = ");
            if (value.getType() == AttributeValue.Type.NUMBER || value.getType() == AttributeValue.Type.BOOLEAN || value.getType() == AttributeValue.Type.TIME) {
                cod.append(value.getCode());
            } else if (value.getType() == AttributeValue.Type.STRING || value.getType() == AttributeValue.Type.ENUM) {
                cod.append("'" + value.getCode() + "'");
            }

            cod.append(";\n");
        }
        cod.append("}\n");
        Model.addGenerated(m);

        return cod;
    }

    /**
     * Méthode qui génère une fonction JavaScript. Cette dernière retournera une instance de l'entité passé en paramètre.
     * @param ent Entité qui doit être générée.
     * @return code JavaScript de la fonction de génération de l'entité.
     */
    public static Code genFuncEntity(Entity ent) {
        Code cod = new Code();
        cod.append("function gen" + ent.getName() + "() {\n");
        cod.append("\tvar entity = new " + ent.listModels().get(0).getName() + "();\n");

        Iterator<String> it = ent.listModifyAttributes().iterator();
        while (it.hasNext()) {
            String attribute = it.next();
            AttributeValue value = ent.getAttribute(attribute);
            if (value.getType() == AttributeValue.Type.NUMBER || value.getType() == AttributeValue.Type.BOOLEAN || value.getType() == AttributeValue.Type.TIME) {
                cod.append("\tentity." + attribute + " = " + value.getCode() + ";\n");
            } else if (value.getType() == AttributeValue.Type.STRING || value.getType() == AttributeValue.Type.ENUM) {
                cod.append("\tentity." + attribute + " = '" + value.getCode() + "';\n");
            }
        }

        cod.append("\treturn entity;\n}\n");
        return cod;
    }

    /**
     * Méthode qui génère le code JavaScript d'un définition.
     * @param def Définition à générer.
     * @return code JavaScript de la définition.
     */
    public static Code genFuncDef(Definition def) {

        Code c = new Code();

        c.append("function " + def.getName() + "(");
        		
    	
    	for (int i = 0 ; i<def.getSignature().size() ; i++){
    		c.append("arg" + i);
    		 
    		if(i < def.getSignature().size() - 1){
    			c.append(",");
    		}
    	}
        
        c.append(") {\n");
        c.append(def.getCode());
        c.append("}\n\n");

        return c;

    }

    /**
     * Méthode qui génère l'appel pour la création d'une nouvelle entité.
     * @param ent Entité à générer.
     * @return code JavaScript de l'appel de la fonction permettant de générer l'entité.
     */
    public static Code genEntity(Entity ent) {
        Code c = new Code();
        c.append(ent.getName() + " = gen" + ent.getName() + "();\n");

        return c;
    }

    
    //Appel de fonction JavaScript exemple :  "f(p1, p2 , p3);"
    /**
     * Méthode qui génère l'appel d'un fonction JavaScript avec des paramètres.
     * @param name Nom de la fonction appellée.
     * @param params Liste des paramètre de la fonction.
     * @return code Javascript de l'appel de fonction.
     */
    public static Code genFuncCall(String name , List<String> params){
    	Code c = new Code();
    	
    	c.append(name);
    	c.append("(");
    	
    	for (int i = 0 ; i<params.size() ; i++){
    		c.append(params.get(i));
    		
    		if(i != params.size() - 1){
    			c.append(",");
    		}
    	}
    	
    	c.append(");\n");
    	
    	return c;
    }
    
    
    /* Appel de la fonction addObject du moteur3D
    MOTEUR3D.addObject(idObject,urlObject, tabCoord, idParent)
     */
    /**
     * Méthode qui génère la commande pour ajouter une entité au moteur 3D.
     * @param ent Entité à ajouter au moteur 3D
     * @return code JavaScript de l'ajout de l'entité au moteur 3D.
     */
    public static Code genAddObject(Entity ent) {

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
        c.append(ent.getAttribute("sizeX").getCode()); //TODO à vérifier si c'est bien sizeX.
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

    /**
     * Méthode qui génère un tableau à 1 ou 2 dimensions vide.
     * @param name Nom du tableau
     * @param x taille du tableau.
     * @return code JavaScript du tableau généré.
     */
    public static Code genTab(String name, Integer x) {
        Code c = new Code();
        c.append(name + "= new Array();");
        if (x != null) {
            c.append("for(var i = 0; i<" + String.valueOf(x) + ";i++) {\n");
            c.append("\t" + name + "[i] = new Array();\n");
            c.append("}");
        }
        return c;
    }

    //clearInterval(id_of_setinterval)
    /**
     * 
     * @param id
     * @return
     */
    public static Code genClearInterval(String id) {
        Code c = new Code();

        c.append("clearInterval(");
        c.append(id);
        c.append(");\n");

        return c;
    }

    //setInterval(code,millisec
    /**
     * 
     * @param cod
     * @param t
     * @return
     */
    public static Code genSetInterval(String cod, String t) {
        Code c = new Code();

        c.append("setInterval(");
        c.append(cod);
        c.append(",");
        c.append(t);
        c.append(");\n");

        return c;
    }

    //////////////////////////////////////////////////////////////////////
    ///////////////////////Boucle de rafraichissement/////////////////////
    //////////////////////////////////////////////////////////////////////
    /**
     * Méthode qui génère la Boucle de rafraichissement.
     * @param tab tableau des signatures des méthodes a lancer en cas de déplacement de la sourris
     * @param clavier booleen permettant de savoir si des commandes au clavier/clic de sourris sont a gérer
     * @return code de la boucle de rafraichissement
     */
    public static Code genRefreshLoop(Code [] tab, boolean clavier) {
        boolean com = false;
        Code c = new Code();
        for(int v = 0; v < tab.length;v++){
            if(tab[v]!=null){
                com = true;
                break;
            }
        }
        /* ************* Bool Array -> command ************************* */
        if(clavier){
            c.append("/* Array of commands */\n");
            c.append("var tabCMD = new Array();\n\n");
        }

        /* ************	Global refresh variable ************************ */

        c.append("var refresh;\n\n");

        /* ************* Paused & positions variables ************************* */

        c.append("/* The game is paused(or not");
        if(com)
            c.append("and current position of mouse");
        c.append("*/\n");
        c.append("var paused = false;\n");
        if(com){
            c.append("var soux;\n");
            c.append("var souy;\n");
        }
        c.append("\n");
        /* ************* Main function and refresh loop call ****************************** */

        c.append("/* Main function */\n");
        c.append("window.addEventListener('load', function () {\n");
        c.append("\t");
        c.append("refresh = ");
        c.append(Code.genSetInterval("refreshGame", "10"));
        c.append("} , false)\n\n");

        /* ************* Refresh loop ****************************** */

        c.append("/* Refresh loop */\n");
        c.append("function refreshGame(){\n");
        if(com){
            c.append("var soux;\n");
            c.append("var souy;\n");
        }
        if(clavier){
            c.append("\tfor(var i = 0; i< tabCMD.length;i++) {\n");
            c.append("\t\t if(tabCMD[i][0]&&tabCMD[i][1]){\n");
            c.append("\t\t\t CMDExec(i);\n");
            c.append("\t\t}\n");
            c.append("\t}\n");
        }
        c.append("}\n\n");

        /* ************* Pause function *************************** */

        c.append("function pause(){\n");
        c.append("\tif(!paused){\n");
        c.append("\t\t");
        c.append("refresh = ");
        c.append(Code.genSetInterval("refreshGame", "10"));
        c.append("\t\tpaused=true;\n");
        c.append("\t\talert('PAUSE');\n");
        c.append("\t}\n");
        c.append("\telse{\n");
        c.append("\t\t");
        c.append(Code.genClearInterval("refresh"));
        c.append("\t\tpaused=false;\n");
        c.append("\t}\n");
        c.append("}\n\n");

        return c;
    }
    
    
    
    
    //setTimeout(code,millisec)
    /**
     * 
     * @param cod
     * @param time
     * @param timeUnit
     * @return
     */
    public static Code genSetTimeout(Code cod , Code time , String timeUnit){
    	Code c = new Code();
    	
    	int coeff;
    	
    	if (timeUnit.equals("ms")){
    		coeff = 1;
    	}
    	
    	else if(timeUnit.equals("sec")){
    		coeff = 1000;
    	}
    	
    	else if(timeUnit.equals("mn")){
    		coeff = 60000;
    	}
    	
    	else{
    		coeff = 1;
    	}
		
    	c.append("setTimeout(");
		c.append(cod);
		c.append(",");
		c.append(time);
		c.append("*");
		c.append(String.valueOf(coeff));
		c.append(");\n");
		
		return c;
    }
    
    /**
     * 
     * @param n
     * @return
     */
    public static Code genArg(int n){
    	Code c = new Code();	
    	c.append("arg"+n);
    	return c;
    }

    /**
     * Méthode qui gènère le code de créations des différents listeners
     * @param clavier booleen représente les commandes au clavier
     * @param souris booleen représente les commandes a la souris (clic + molette)
     * @param possouris booleen représente les commandes au souris (déplacement)
     * @return code de la création des events
     */
    public static Code genEventListener(boolean clavier,boolean souris,boolean possouris){
        Code c = new Code();
        c.append("window.addEventListener('load', function () {\n");
        if(clavier){
            c.append("\twindow.document.onkeydown = CMDKeyDown;\n");
            c.append("\twindow.document.onkeyup = CMDKeyUp;\n");
        }
        if(souris){
            c.append("\twindow.document.onclick=CMDClk;");
        }
	c.append("}, false);\n\n");
        return c;
    }
    /**
     * Génère code java script a executé en cas d'appuis sur une touche du clavier
     * @param list_event liste des control.
     * @return code JavaScript de la fonction d'event de type KeyDown.
     */
    public static Code genCMDKeyDown(ArrayList <Control> list_event){
        Code c = new Code();
        c.append("CMDKeyDown = function(event){\n");
        Iterator <Control> it = list_event.iterator();
        int i = 0;
        c.append("\tvar intKeyCode = event.keyCode;\n");
        c.append("\tswitch(intKeyCode){\n");
        while(it.hasNext()){
            Control co = it.next();
            if(co.getSource()== Control.Source.CLAVIER){
                c.append("\t\tcase "+co.getCommande()+":\n");
                if(co.getMode()==Control.Mode.PRESSED||co.getMode()==Control.Mode.HELD){
                    c.append("\t\t\ttabCMD["+i+"][0] = true;\n");
                }else{
                    c.append("\t\t\ttabCMD["+i+"][0] = false;\n");
                }
                c.append("\t\t\tbreak;\n");
            }
            i++;
        }
        c.append("\t\tdefault :\n \t\t\t break;\n");
        c.append("\t}\n");
        c.append("}\n\n");
        return c;
    }

    /**
     * Génère code java script a executé en cas de relachement sur une touche du clavier
     * @param list_event liste des control.
     * @return code JavaScript de la fonction d'event de type KeyUp.
     */
    public static Code genCMDKeyUp(ArrayList <Control> list_event){
        Code c = new Code();
        c.append("CMDKeyUp = function(event){\n");
        Iterator <Control> it = list_event.iterator();
        int i = 0;
        c.append("\tvar intKeyCode = event.keyCode;\n");
        c.append("\tswitch(intKeyCode){\n");
        while(it.hasNext()){
            Control co = it.next();
            if(co.getSource()== Control.Source.CLAVIER){
                c.append("\t\tcase "+co.getCommande()+":\n");
                if(co.getMode()==Control.Mode.PRESSED||co.getMode()==Control.Mode.HELD){
                    c.append("\t\t\ttabCMD["+i+"][0] = false;\n");
                }else{
                    c.append("\t\t\ttabCMD["+i+"][0] = true;\n");
                }
                c.append("\t\t\tbreak;\n");
            }
            i++;
        }
        c.append("\t\tdefault :\n \t\t\t break;\n");
        c.append("\t}\n");
        c.append("}\n\n");
        return c;
    }

    /**
     * Méthode générant le code JavaScript pour le fonction CMDExec.
     * Permet de générer le code de la méthode qui fait le lien entre le tableau de booleen des commandes et les fonction a executer.
     * @param list_event liste des objets Controls demandés par l'utilisateur.
     * @param liste liste des signatures associés aux différents controles.
     * @return code JavaScript de la fonction d'execution des commandes.
     */
    public static Code genCMDExec(ArrayList <Control> list_event, ArrayList<Code> liste){
        Code c = new Code();
        c.append("var CMDExec = function(num){\n");
        Iterator <Control> it = list_event.iterator();
        int i = 0;
        c.append("\tswitch(num){\n");
        while(it.hasNext()){
            Control co = it.next();
            if(co.getSource()== Control.Source.CLAVIER){
                c.append("\t\tcase "+i+":\n");
                if(co.getMode()==Control.Mode.PRESSED||co.getMode()==Control.Mode.RELEASED){
                    c.append("\t\t\ttabCMD["+i+"][0] = false;\n");
                }
                c.append("\t\t\t"+liste.get(i).getCode()+"\n");
                c.append("\t\t\tbreak;\n");
            }
            i++;
        }
        c.append("\t\tdefault :\n \t\t\t break;\n");
        c.append("\t}\n");
        c.append("}\n\n");
        return c;
    }
}
