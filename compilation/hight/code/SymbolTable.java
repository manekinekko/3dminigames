package code;

import java.util.Hashtable;
import types.Type;

public class SymbolTable{

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

}