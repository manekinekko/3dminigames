package com.istic.mini3d.attributes;

import com.istic.mini3d.code.Code;

/**
 * Classe de gestions des attributs des différents types
 * @author Mini3D
 * @version 1.0
 */
public class AttributeValue {

    /**
     * Type énuméré Type.
     * Il permet de définir les différents Types d'un attribut
     */
    public static enum Type {

        /**
         * Type null.
         * Il est utilisé lorsque l'on veut associer un type vide a un attribut.
         */
        NIL,
        /**
         * Type booleen.
         * Il est utilisé lorsque l'on veut associer un type booleen a un attribut.
         */
        BOOLEAN,
        /**
         * Type énuméré.
         * Il est utilisé lorsque l'on veut associer un type énuméré a un attribut.
         */
        ENUM,
        /**
         * Type numérique.
         * Il est utilisé lorsque l'on veut associer un type numérique a un attribut.
         */
        NUMBER,
        /**
         * Type chaine de caractère.
         * Il est utilisé lorsque l'on veut associer un type chaine de caractère a un attribut.
         */
        STRING,
        /**
         * Type temps.
         * Il est utilisé lorsque l'on veut associer un type temps a un attribut.
         */
        TIME,
        /**
         * Type aggrégatio,.
         * Il est utilisé lorsque que l'utilisateur va faire une aggrégation de deux entités.
         */
        AGGR,
        /**
         * Type tableau.
         * Il est utilisé lorsque l'on veut associer un type tableau a un attribut.
         */
        ARRAY
    };

    private Code value;
    private Type type;

    /**
     * Constructeur par défaut de la classe.
     * Il initialise le type et la valeur a null.
     */

    public AttributeValue() {
	value = null;
	type = Type.NIL;
    }

    /**
     * Constructeur d'un attribut de type booleen.
     * Initialise la valeur de l'attribut par la valeur du booléen passé en paramètre(qui est convertie en code).
     * Le type est mis automatiquement à BOOLEAN.
     * @param b la valeur booleenne de l'attribut.
     */

    public AttributeValue(Boolean b) {
	value = new Code(b.toString());
	type = Type.BOOLEAN;
    }

    /**
     * Constructeur d'un attribut de type numérique.
     * Initialise la valeur de l'attribut par la valeur du nombre passé en paramètre(qui est convertie en code).
     * Le type est mis automatiquement à NUMBER.
     * @param n la valeur numérique de l'attribut.
     */

    public AttributeValue(Number n) {
	value = new Code(n.floatValue()+"");
	type = Type.NUMBER;
    }

    /**
     * Constructeur d'un attribut de type chaine de caractères.
     * Initialise la valeur de l'attribut par la valeur de la chaine passée en paramètre(qui est convertie en code).
     * Le type est mis automatiquement à STRING.
     * @param s la chaine de caractères contenue de l'attribut.
     */

    public AttributeValue(String s) {
	value = new Code(s);
	type = Type.STRING;
    }

    /**
     * Constructeur d'un attribut de type chaine de caractères.
     * Initialise la valeur de l'attribut par la valeur de l'objet Duration passée en paramètre(qui est convertie en code).
     * Le type est mis automatiquement à TIME.
     * @param d l'objet Duration représentatif de la valeur de l'attribut.
     */
    public AttributeValue(Duration d) {
	value = d.getCode();
	type = Type.TIME;
    }
    
    /**
     * Constructeur d'un attribut par code et type.
     * Initialise la valeur de l'attribut par l'objet Code passé en paramètre.
     * Le type prend la valeur du paramètre t qui est un élément du type énuméré Type.
     * @param c le code représentatif de la valeur de l'attribut.
     * @param t le type de l'attribut.
     */

    public AttributeValue(Code c, Type t) {
	value = c;
	type = t;
    }

    /**
     * Constructeur d'un attribut par type.
     * Initialise la valeur de l'attribut par un objet Code vide.
     * Le type prend la valeur du paramètre t qui est un élément du type énuméré Type.
     * @param t le type de l'attribut.
     */

    public AttributeValue(Type t) {
	type = t;
	value = new Code();
    }

    /**
     * Accesseur au code.
     * Retourne le code contenu dans l'attribut value.
     * @return value valeur sour forme de code de l'attribut.
     */

    public Code getCode() {
	return value;
    }
    
    /**
     * Modificateur du code.
     * Modifie le code contenu dans l'attribut value.
     * @param c nouveau code a mettre dans value.
     */
    public void setCode(Code c){
    	value = c;
    }

    /**
     * Accesseur au type.
     * Retourne le code contenu dans l'attribut type.
     * @return type type de l'attribut.
     */
    public Type getType() {
	return type;
    }
}
