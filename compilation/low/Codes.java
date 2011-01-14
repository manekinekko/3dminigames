import java.util.*;


public class Codes {

	protected Hashtable<String,Code> ht;
	
	//Code order : entities , resources ...
	public Codes(Code ec, Code rc){
		this.ht = new Hashtable<String,Code>();
		this.ht.put("entities", ec);
		this.ht.put("resources", rc);

	}
	
	public void put(String s , Code c){
		this.ht.put(s,c);	
	}
	
	public Code get(String s){
		return this.ht.get(s);	
	}
	
	public Hashtable<String,Code> getHt(){
		return this.ht;
	}
}
