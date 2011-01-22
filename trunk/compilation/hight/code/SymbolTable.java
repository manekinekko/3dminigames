package code;

import java.util.Enumeration;
import java.util.Hashtable;
import symbols.Symbol;

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
