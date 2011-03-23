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
 *
 * @author Beben
 */
public class Definition implements Symbol {

    private String name;
    private Code c;
    private boolean duplicable = true;
    private int generate = 0;
    private List<Model> sign; 		//Signature de la fonction


   
    


    
    
    
    
    public Definition(){
    	name = new String();
    	c = new Code();
    	sign = new ArrayList<Model>();
    }
    
    
    public Definition(String s){
    	name = s;
    	c = new Code();
    	sign = new ArrayList<Model>();
    }
    
    
    
    public Definition(String s, Code c, Model ... m) {
        name = s;
        this.c = c;
        this.sign = Arrays.asList(m);
       
    }

    public Definition(String s, Code c) {
        name = s;
        this.c = c;
        this.sign = new ArrayList<Model>();
        
    }
    
    public void addModel(Model m){
    	this.sign.add(m);
    }

    
    public List<Model> getSignature(){
    	return new ArrayList<Model>(this.sign);
    }
    
    public void append(Code c){
    	this.c.append(c);
    }
    

    
    public void setName(String n) {
    	this.name = n;
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
