package com.istic.mini3d.symbols;

import com.istic.mini3d.attributes.AttributeValue;

/**
 * Interface qui permet de définir un Sybol
 * @author Mini3D
 * @version 1.0
 */
public interface Symbol {

    /**
     * Type énuméré qui gère les différents Types de Symbols.
     */
    public static enum Type {

        /**
         * Signifie que le SYmbol est une définition.
         */
        DEFINITION,
        /**
         * Signifie que le SYmbol est une entitée.
         */
        ENTITY,
        /**
         * Signifie que le SYmbol est un modèle.
         */
        MODEL,
        /**
         * Signifie que le SYmbol est un controle.
         */
        CONTROL
    };
    /**
     * Accesseur au nom du Symbol.
     * Permet d'obtenir le nom du Symbol.
     * @return le nom du Symbol.
     */
    public String getName();
    /**
     * Accesseur a un attribut.
     * Permet d'accèder a un attribut grâce a son nom.
     * @param n nom de l'attribut voulu.
     * @return objet de type AttributeValue représentatif de la valeur de l'attribut.
     */
    public AttributeValue getAttribute(String n);
    /**
     * Modificateur de liste d'attribut.
     * Permet l'ajout d'un attribut dans la liste des attributs du Symbol.
     * @param attr nom de l'attribut
     * @param value valeur de l'attribut sous forme d'AttributeValue
     */
    public void addAttribute(String attr, AttributeValue value);
    /**
     * Permet de dire que ce symbol est a générer en javaScript
     */
    public void toGenerate();
    /**
     * Permet de savoir si ce symbol est a générer en javaScript
     * @return booleen qui permet de savoir si l'on doit le générer ou non.
     */
    public int getGenerate();
    /**
     * Accesseur au type de l'objet.
     * Permet d'obtenir le type du Symbol.
     * @return le type de l'objet (CONTROL,DEFINITION,...)
     */
    public Type getType();
}
