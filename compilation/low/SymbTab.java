
import java.util.*;

public class SymbTab {
	protected Hashtable<String,Value> ht;
	 
	public SymbTab(){
		ht = new Hashtable<String,Value>();
	}
	
	public void add(String key, Value val){
		ht.put(key,val);
	}
	
	public boolean check(String key){
		return ht.containsKey(key);
	}
	
}
