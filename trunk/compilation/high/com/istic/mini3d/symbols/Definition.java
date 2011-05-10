/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istic.mini3d.symbols;

import com.istic.mini3d.attributes.AttributeValue;
import com.istic.mini3d.code.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe permettant de créer des objets pour définir les définitions
 * @author Mini3D
 * @version 1.0
 */
public class Definition implements Symbol {

    private String name;
    private Code c;
    private boolean duplicable = true;
    private int generate = 0;
    private List<Model> sign; 		//Signature de la fonction


   

    /**
     * Constructeur simple de définition
     * Permet de construire un objet définition vierge.
     */
    public Definition(){
    	name = new String();
    	c = new Code();
    	sign = new ArrayList<Model>();
    }
    
    
    /**
     * Constructeur de définition.
     * Permet de construire un objet définition avec un nom. Tout le reste est initialisé avec des objets "vides".
     * @param s nom de la définition
     */
    public Definition(String s){
    	name = s;
    	c = new Code();
    	sign = new ArrayList<Model>();
    }
    
    
    
    /**
     * Constructeur de définition.
     * Permet de construire un objet définition initialisé avec les éléments passés en paramètres.
     * @param c code de la définition
     * @param m tableau des models représentatifs de la signature de la méthode
     */
    public Definition(String s, Code c, Model ... m) {
        name = s;
        this.c = c;
        this.sign = Arrays.asList(m);
       
    }

    /**
     * Constructeur de définition.
     * Permet de construire un objet définition initialisé avec les éléments passés en paramètres.
     * @param s nom de la définition
     * @param c code de la fonction
     */
    public Definition(String s, Code c) {
        name = s;
        this.c = c;
        this.sign = new ArrayList<Model>();
        
    }
    
    /**
     * Modificateur de signature.
     * Permet d'ajouter un model dans la liste des models des paramètres de la définition.
     * @param m Model a ajouter
     */
    public void addModel(Model m){
    	this.sign.add(m);
    }

    
    /**
     * Accesseur a la signature.
     * Permet d'obtenir la liste des models qui sont les paramètres de la définition.
     * @return
     */
    public List<Model> getSignature(){
    	return new ArrayList<Model>(this.sign);
    }
    
    /**
     * Méthode de modication de code.
     * Permet de concaténer le code de la fonction avec le code passé en paramètre.
     * @param c code a ajouter
     */
    public void append(Code c){
    	this.c.append(c);
    }
    

    
    /**
     * Modificateur de nom.
     * Permet de modifier le nom de la définition.
     * @param n nouveau nom
     */
    public void setName(String n) {
    	this.name = n;
    }
    
    /**
     * Accesseur au code.
     * Permet d'obtenir le code de la définition.
     * @return code de la définition
     */
    public Code getCode() {
        return c;
    }

    /**
     * @see Symbol
     */
    public String getName() {
        return name;
    }

    /**
     * Modificateur de duplicable
     * Permet de vérifier si la définition est duplicable en fonction de ses entités
     * @param et entité présente dans la fonction
     */
    public void setDuplicable(Entity et) {
        duplicable = duplicable && et.getDuplicable();
    }

    /**
     * Accesseur a duplicable
     * Permet d'obtenir le booleen représentatif de la duplicabilité de la définition.
     * @return booleen duplicable
     */
    public boolean getDuplicable() {
        return duplicable;
    }

    /**
     * @see Symbol
     */
    public void toGenerate() {
        generate++;
    }

    /**
     * @see Symbol
     */
    public int getGenerate() {
        return generate;
    }

    /**
     *Méthode inutile dans cette classe, présente a cause de l'implémentation de l'interface.
     */
    public AttributeValue getAttribute(String n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * Méthode inutile dans cette classe, présente a cause de l'implémentation de l'interface.
     */

    public void addAttribute(String attr, AttributeValue value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * @see Symbol
     */
    public Type getType() {
	return Type.DEFINITION;
    }
}
