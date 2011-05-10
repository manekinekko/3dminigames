package com.istic.mini3d.lib;

/**
 * Classe permetant de créer des objets de type paire
 * @param <A> type du premier élèment de la paire
 * @param <B> type du deuxième élèment de la paire
 * @author Mini3D
 * @version 1.0
 */
public class Pair<A, B> {
    private A first;
    private B second;

    /**
     * Constructeur de paire.
     * Permet de construire une paire d'objet. Ces objets sont passés en paramètre.
     * @param first premier élèment de la paire.
     * @param second deuxième élèment de la paire.
     */
    public Pair(A first, B second) {
        super();
        this.first = first;
        this.second = second;
    }

    public int hashCode() {
        int hashFirst = first != null ? first.hashCode() : 0;
        int hashSecond = second != null ? second.hashCode() : 0;

        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    public boolean equals(Object other) {
        if (other instanceof Pair) {
                Pair otherPair = (Pair) other;
                return
                ((  this.first == otherPair.first ||
                        ( this.first != null && otherPair.first != null &&
                          this.first.equals(otherPair.first))) &&
                 (      this.second == otherPair.second ||
                        ( this.second != null && otherPair.second != null &&
                          this.second.equals(otherPair.second))) );
        }

        return false;
    }

    public String toString()
    {
           return "(" + first + ", " + second + ")";
    }

    /**
     * Accesseur au premier élèment.
     * Permet d'obtenir le premier élèment de la paire.
     * @return le premier élèment de la paire.
     */
    public A getFirst() {
        return first;
    }

    /**
     * Modificateur de premier élèment.
     * Permet de définir le premier élèment de la paire.
     * @param first nouvel objet a mettre comme premier élèment de la paire.
     */
    public void setFirst(A first) {
        this.first = first;
    }

    /**
     * Accesseur au deuxième élèment
     * Permet d'obtenir le deuxième élèment de la paire
     * @return le deuxième élèment de la paire
     */
    public B getSecond() {
        return second;
    }

    /**
     * Modificateur de deuxième élèment.
     * Permet de définir le deuxième élèment de la paire.
     * @param second nouvel objet a mettre comme deuxième élèment de la paire.
     */
    public void setSecond(B second) {
        this.second = second;
    }
}

