package com.istic.mini3d.attributes;

import com.istic.mini3d.code.Code;
import com.istic.mini3d.symbols.Entity;
import com.istic.mini3d.symbols.Model;
import java.util.Iterator;
import java.util.List;

/**
 * Classe permettant de gérer les listes/tableau
 * @author Mini3D
 * @version 1.0
 */
public class Array {
    private Model type;
    private List<Entity> list;

    /**
     * Constructeur de la classe.
     * Permet de construire un objet Array en spécifiant son type
     * @param type model du type de l'array
     */
    public Array(Model type) {
	this.type = type;
    }

    /**
     * Modificateur d'entité.
     * Permet d'ajouter une entité à la liste du tableau si elle n'y figure pas déjà.
     * @param e entitée a ajouter
     * @return retourne vrai si l'entité est bien ajoutée
     */
    public boolean add(Entity e) {
	if(e.listModels().contains(this.type))
	    this.list.add(e);
	else
	    return false;
	return true;
    }

    /**
     * Modificateur d'entité.
     * Permet de retirer une entité à la liste du tableau.
     * @param e entité a enlever
     */
    public void remove(Entity e) {
	list.remove(e);
    }

    /**
     * Modificateur d'entité.
     * Permet de retirer une entité à la liste du tableau grâce a son indice.
     * @param i indice de l'entité a retirer
     */
    public void remove(int i) {
	list.remove(i);
    }

    /**
     * Accesseur au code.
     * Permet d'obtenir le code de création du tableau.
     * @return un objet code représentatif de la création du tableau.
     */
    public Code getCode() {
	Code c = new Code();
	c.append("new Array(");
	Iterator<Entity> it = this.list.iterator();
	while(it.hasNext()) {
	    Entity ent = it.next();
	    c.append(ent.getName()+", ");
	}
	c.append(");");

	return c;
    }
}
