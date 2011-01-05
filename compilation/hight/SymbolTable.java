public class SymbolTable{

	private HashTable table;
	
	public SymbolTable() {
		table = new HashTable();
	}
	
	public void add(String name, Type type) {
		table.put(name, type);
	}
	
	public Type get(String name) {
		return table.get(name);
	}

}