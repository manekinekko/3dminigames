/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package symbols;

import attributes.AttributeValue;
import code.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Beben
 */
public class Definition implements Symbol {

    private String name;
    private Code c;
    private boolean duplicable = true;
    private int generate = 0;
    private /* public pour les JUnit tests*/ List<Model> sign; 		//Signature de la fonction
    private /* public pour les JUnit tests*/ List<String> params;	//Paramètres effectifs

    public Definition(String s, Code c, Model ... m) {
        name = s;
        this.c = c;
        this.sign = Arrays.asList(m);
        this.params = new ArrayList<String>();
    }

    public Definition(String s, Code c) {
        name = s;
        this.c = c;
        this.sign = new ArrayList<Model>();
        this.params = new ArrayList<String>();
    }
    
    public void addModel(Model m){
    	this.sign.add(m);
    }
    
    public void addParam(String pm){
    	this.params.add(pm);
    }
    
    public List<Model> getSignature(){
    	return this.sign;
    }
    
    public List<String> getParams(){
    	return this.params;
    }
    
    public Code getCode() {
        return c;
    }

    public String getName() {
        return name;
    }

    public void setDuplicable(Entity et) {
        duplicable = duplicable && et.getDuplicable();
    }

    public boolean getDuplicable() {
        return duplicable;
    }

    public void toGenerate() {
        generate++;
    }

    public int getGenerate() {
        return generate;
    }

    public AttributeValue getAttribute(String n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addAttribute(String attr, AttributeValue value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<String> listAttributes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Type getType() {
	return Type.DEFINITION;
    }
}
