package com.istic.mini3d.code;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import com.istic.mini3d.symbols.Entity;
import com.istic.mini3d.symbols.Symbol;

public class SymbolTable {

    private Hashtable<String, Symbol> table;

    public SymbolTable() {
	table = new Hashtable<String, Symbol>();
    }

    public void add(String name, Symbol s) {
	table.put(name, s);
    }

    public Symbol get(String name) {
	return table.get(name);
    }

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
