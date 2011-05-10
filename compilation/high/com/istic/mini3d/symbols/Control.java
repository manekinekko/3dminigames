package com.istic.mini3d.symbols;

import com.istic.mini3d.attributes.AttributeValue;

/**
 * Classe permettant de créer des objets pour définir les commandes
 * @author Mini3D
 * @version 1.0
 */
public class Control implements Symbol{

    /**
     * Permet de définir la source de la commande
     */
    public static enum Source {

        /**
         * Signifie que la commande sera émise du clavier.
         */
        CLAVIER,
        /**
         * Signifie que la commande sera émise de la sourris.
         */
        SOURIS
    }

    /**
     * Permet de définir le mode de la commande
     */
    public static enum Mode {

        /**
         * Signifie que la commande est de type préssée.
         */
        PRESSED,
        /**
         * Signifie que la commande est de type appuyée.
         */
        HELD,
        /**
         * Signifie que la commande est de type relachée.
         */
        RELEASED
    }

    private String name;
    private Mode mode;
    private Source source;
    private Definition d;
    private String commande;
    
    
    /**
     * Constructeur de la classe Control.
     * Permet de créer un objets Control pour définir les commandes. Il est initialisé grâce aux valeurs passées en paramètre.
     * @param nom code de la commande
     * @param mo mode de la commande
     * @param sr source de la commande
     * @param de définition associée a la commande
     */
    public Control(String nom, Mode mo, Source sr, Definition de){
        name = "3_"+nom;
        mode = mo;
        source = sr;
        d = de;
        commande = nom;
    }
    
    /**
     * Constructeur de la classe Control sans mode.
     * Permet de créer un objets Control pour définir les commandes. Il est initialisé grâce aux valeurs passées en paramètre et le mode est automatiquement mit a HELD.
     * @param nom nom code de la commande
     * @param sr source de la commande
     * @param de définition associée a la commande
     */
    public Control(String nom, Source sr,Definition de){
        name = "3_"+nom;
        mode = Mode.HELD;
        source = sr;
        d = de;
        commande = nom;
    }

    /**
     * @see Symbol
     */
    public String getName() {
        return name;
    }

    /**
     * Accesseur au mode de la commande.
     * Permet d'obtenir le mode de la commande.
     * @return le mode de la commande
     */
    public Mode getMode(){
        return mode;
    }

    /**
     * Accesseur à la source de la commande.
     * Permet d'obtenir la source de la commande.
     * @return la source de la commande
     */
    public Source getSource(){
        return source;
    }

    /**
     * Accesseur a la définition associée à la commande.
     * Permet d'obtenir le nom de la commande.
     * @return la définition associée à la commande
     */
    public Definition getDefinition(){
        return d;
    }

    /**
     * Accesseur au code de la commande (par ex, code ascii de la touche).
     * Permet d'obtenir le code de la commande.
     * @return le code de la commande
     */
    public String getCommande(){
        return commande;
    }


    /**
     * Méthode inutile dans cette classe, présente a cause de l'implémentation de l'interface.
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
     * Méthode inutile dans cette classe, présente a cause de l'implémentation de l'interface.
     */
    public void toGenerate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Méthode inutile dans cette classe, présente a cause de l'implémentation de l'interface.
     */
    public int getGenerate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @see Symbol
     */
    public Type getType() {
        return Type.CONTROL;
    }

}
