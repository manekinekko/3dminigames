/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

/**
 *
 * @author Quentin
 */
public class AttributeTime implements Attributes {

    private int valeur;
    private String unite;

    public AttributeTime(int v, String unite) {
	this.valeur = v;
	this.unite = unite;
    }

    public int TimeValue() {
	return valeur;
    }

    public String TimeUnit() {
	return unite;
    }

    @Override
    public String toString() {
	return valeur + unite;
    }
}
