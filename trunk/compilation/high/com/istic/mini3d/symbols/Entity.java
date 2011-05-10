package com.istic.mini3d.symbols;

import com.istic.mini3d.attributes.AttributeValue;
import java.util.*;

/**
 * Classe permettant de gérer les entités.
 * @author Mini3D
 * @version 1.0
 */
public class Entity implements Symbol {

    private String name;
    /**
     * Liste des différents models de l'entité.
     */
    public List<Model> models;
    /**
     * Liste des couples nom valeur des attributs de l'entité.
     */
    public Map<String, AttributeValue> attributes;
    private boolean duplicable = false;
    private int generate = 0;
    private String playerName ="";

    /**
     * Constructeur d'entité.
     * Permet de créer un objet de type Entité initialisé avec les paramètes.
     * @param name nom de l'entité
     * @param m tableau de models de l'entité
     */
    public Entity(String name, Model... m) {
        this.name = name;
        this.models = new ArrayList<Model>();
        this.attributes = new HashMap<String, AttributeValue>();
        this.models.addAll(Arrays.asList(m));
    }

    /**
     * @see Symbol
     */
    public void addAttribute(String attr, AttributeValue value) {
        this.attributes.put(attr, value);
    }
    /**
     * @see Symbol
     */
    public AttributeValue getAttribute(String n) {
        if (this.attributes.containsKey(n)) {
            return this.attributes.get(n);
        } else {
            Iterator<Model> it = this.models.iterator();
            while (it.hasNext()) {
                Model m = it.next();
                if (m.contains(n)) {
                    return m.getAttribute(n);
                }
            }

            return null;
        }
    }

    /**
     * Accesseurs aux attributs.
     * Permet d'obtenir la liste des noms de tous les attributs de l'entités.
     * @return liste des noms des attributs
     */
    public List<String> listAttributes() {
        List<String> res = new ArrayList<String>();

        Iterator<Model> it = this.models.iterator();
        Model m;
        while (it.hasNext()) {
            m = it.next();
            if(m != null)
            {res.addAll(m.listAttributes());}
        }

        String[] tab = (String[]) this.attributes.keySet().toArray(new String[0]);
        res.addAll(Arrays.asList(tab));

        return res;
    }

    /**
     * Accesseur a la liste d'attribut modifiés
     * Permet d'obtenir les attributs ajoutés a l'entité en plus de ceux définis par les models
     * @return liste des attributs modifiés
     */
    public List<String> listModifyAttributes() {
        List<String> res = new ArrayList<String>();

        String[] tab = (String[]) this.attributes.keySet().toArray(new String[0]);
        res.addAll(Arrays.asList(tab));

        return res;
    }

    /**
     * Accesseur a la liste des models.
     * Permet d'obtenir la liste des models de l'entité.
     * @return liste des models
     */
    public List<Model> listModels() {
        List<Model> ret = new ArrayList<Model>(models);
        return ret;
    }
    /**
     * @see Symbol
     */
    public String getName() {
        return this.name;
    }

    /**
     * Modificateur de duplicable.
     * Permet de dire qu'une entité est duplicable.
     */
    public void setDuplicable() {
        duplicable = true;
    }

    /**
     * Accesseur a duplicable.
     * Permet d'obtenir duplicable pour savoir si l'entité l'est ou non.
     * @return booleen représentatif de la duplicabilité.
     */
    public boolean getDuplicable() {
        return duplicable;
    }
    /**
     * @see Symbol
     */
    public void toGenerate() {
        generate++;;
    }
    /**
     * @see Symbol
     */
    public int getGenerate() {
        return generate;
    }
    /**
     * @see Symbol
     */
    public Type getType() {
	return Type.ENTITY;
    }

    /**
     * Modificateur du nom de joueur.
     * Permet de définir le nom du joueur qui possède l'entité.
     * @param s identifiant du joueur
     */
    public void setPlayerName(String s){
        playerName = s;
    }

    /**
     * Accesseur au nom du joueur.
     * Permet d'obtenir le nom du joueur qui possède l'entité.
     * @return le nom du joueur
     */
    public String getPlayerName(){
        return playerName;
    }
}
