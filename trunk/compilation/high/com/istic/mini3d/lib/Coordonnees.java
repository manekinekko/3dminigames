package com.istic.mini3d.lib;

import com.istic.mini3d.code.Code;

/**
 * Classe permetant de créer un objet coordonnees pour gérer les coordonnées, orientation, taille des entités.
 * @author Mini3D
 * @version 1.0
 */
public class Coordonnees{

    /**
     * Code représentatif de la valeur sur l'axe des x.
     */
    /**
     * Code représentatif de la valeur sur l'axe des y.
     */
    /**
     * Code représentatif de la valeur sur l'axe des z.
     */
    public Code x,y,z;

/**
 * Constructeur paramétrable de Coordonnées.
 * Permet de créer des objets de type coordonnées en passant 3 codes représentatifs des valeurs en paramètre.
 * @param x code représentatif de la valeur sur l'axe des x.
 * @param y code représentatif de la valeur sur l'axe des y.
 * @param z code représentatif de la valeur sur l'axe des z.
 */
public Coordonnees(Code x, Code y, Code z){
    this.x = x;
    this.y = y;
    this.z = z;
}


/**
 * Constructeur simple de Coordonnées.
 * Permet de créer des objets de type coordonnées avec des valeurs initialisées avec un code vide.
 */
 public Coordonnees(){
    this.x = new Code();
    this.y = new Code();
    this.z = new Code();
}

/**
 * Accesseur a x.
 * Permet d'acceder a la variable x.
 * @return la valeur de la variable x sous forme de code
 */
public Code getX(){return x;};
/**
 * Accesseur a y.
 * Permet d'acceder a la variable y.
 * @return la valeur de la variable y sous forme de code.
 */
public Code getY(){return y;};
/**
 * Accesseur a z.
 * Permet d'acceder a la variable z.
 * @return la valeur de la variable z sous forme de code.
 */
public Code getZ(){return z;};


}
