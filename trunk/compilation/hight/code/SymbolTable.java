package code;

import java.util.Enumeration;
import java.util.Hashtable;
import types.Type;

public class SymbolTable {

    private Hashtable<String, Type> table;

    public SymbolTable() {
	table = new Hashtable<String, Type>();
    }

    public void add(String name, Type type) {
	table.put(name, type);
    }

    public Type get(String name) {
	return table.get(name);
    }

    public void print() {
	Enumeration<String> key = table.keys();
	for (int i = 0; i < table.size(); i++) {
	    String id = key.nextElement();
	    System.out.println(id + "\t\t\t" + table.get(id).getName());
	}
    }
}
