package com.istic.mini3d.attributes;

import com.istic.mini3d.code.Code;

/**
 * Classe de gestions des valeurs des attributs de type temps.
 * @author Mini3D
 * @version 1.0
 */

public class Duration {

    private Code value;
    private String unit;

    /**
     * Constructeur par défaut de la classe.
     * Créer un objet de type duration avec pour valeur un code vide et comme unité les millisecondes.
     */
    public Duration(){
	value = new Code();
	unit = "MS";
    }

    /**
     * Constructeur paramétrable de la classe avec un nombre.
     * Créer un objet de type duration avec pour valeur un code représentatif de n.
     * Il a pour unité la valeur du paramètre u.
     * @param n valeur de temps
     * @param u string représentatif de l'unité utilisée (S,MS,MIN)
     */

    public Duration(Number n, String u) {
	value = new Code(n.toString()+"");
	unit = u.toUpperCase();
    }

    /**
     * Constructeur paramétrable de la classe avec un code.
     * Créer un objet de type duration avec pour valeur le code de c.
     * Il a pour unité la valeur du paramètre u.
     * @param c valeur de temps sous forme de code
     * @param u string représentatif de l'unité utilisée (S,MS,MIN)
     */

    public Duration(Code c, String u) {
	value = c;
	unit = u.toUpperCase();
    }

    /**
     * Accesseur a la valeur de temps
     * Convertit le code en milliseconde et le retourne.
     * @return c code de la valeur de temps en MS et sous forme de code
     */
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

    /*
     * Calculateur d'unité
     * Permet de calculer la valeur pour convertir le code en MS
     * @return valeur de conversion
     */
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
