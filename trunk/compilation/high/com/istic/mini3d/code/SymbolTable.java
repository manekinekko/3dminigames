package com.istic.mini3d.code;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import com.istic.mini3d.symbols.Entity;
import com.istic.mini3d.symbols.Symbol;

/**
 * Classe de gestion de la table des symboles.
 * @author Mini3D
 * @version 1.0
 */

public class SymbolTable {

    private Hashtable<String, Symbol> table;

    /**
     * Constructeur de la classe.
     * Constructeur permettant de créer la table des symboles.
     */

    public SymbolTable() {
	table = new Hashtable<String, Symbol>();
    }

    /**
     * Ajoute un élément dans la table des symboles.
     * Permet d'ajouter un nouvel élément dans la table de symbole.
     * On y associe un nom et un objet de type Symbol.
     * @param name nom de l'entité, du modèle, de la definition ou de la commande.
     * @param s symbole de l'entité, du modèle, de la definition ou de la commande.
     */
    public void add(String name, Symbol s) {
	table.put(name, s);
    }

    /**
     * Accesseur aux éléments de la table des symboles.
     * Permet d'accéder a un symbole dans la table grâçe a son nom.
     * @param name nom de l'élément désiré.
     * @return le symbol associé au nom, s'il n'est pas dans la table la méthode retourne null.
     */
    public Symbol get(String name) {
	return table.get(name);
    }

    /**
     * Accesseur a toutes les entités.
     * Permet de retourner toutes les Symbol de type Entités présents dans la table des symboles.
     * @return un tableau contenant tous les symboles de types Entité.
     */
    public List<Entity> getAllEntities() {
	List<Entity> array = new ArrayList<Entity>();
	Enumeration<String> keys = table.keys();
	while(keys.hasMoreElements()) {
	    String key = keys.nextElement();
	    Symbol s = table.get(key);
	    if(s.getType() == Symbol.Type.ENTITY)
		array.add((Entity)s);
	}
	
	return array;
    }

    /**
     * Afficheur de la table.
     * Permet d'afficher le contenu de la table des symboles dans la console.
     */
    public void print() {
        System.out.println("/////////////////////////////Table des Symboles/////////////////////////////");
	Enumeration<String> key = table.keys();
	for (int i = 0; i < table.size(); i++) {
	    String id = key.nextElement();
	    System.out.println(id + "\t\t\t" + table.get(id).getName());
	}
        System.out.println("////////////////////////////////////////////////////////////////////////////");
    }
}
