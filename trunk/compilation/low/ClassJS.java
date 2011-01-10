
import java.util.*;

public class ClassJS implements InstJS{
	
	public static String INSTFUNC = "function"; 
	
	protected String name;
	protected List<String> params;
	protected List<AffJS> attributes;
	
	public ClassJS(String n , List<String> p , List<AffJS> att){
		this.name = n;
		this.params = p;
		this.attributes = att;
	}
	
	
	
	public String getCode(){
		
		String tmp = INSTFUNC + " " + this.name + "(){\n" ;
		/*for( Iterator<String> it = this.params.iterator() ; it.hasNext() ; ){
			tmp += it.next();
			tmp += ",";
		}
		/*
		char[] tmpChar = tmp.toCharArray();
		tmpChar[tmp.length()-1] = ')';
		tmp = tmpChar.toString();*/
		
		
		//tmp += "{\n";
		
		for( Iterator<AffJS> it = this.attributes.iterator() ; it.hasNext() ; ){
			tmp += "\tthis.";
			tmp += it.next().getCode();			
		}
		tmp += "}\n";
		
		return tmp;
	}
}
