

import java.util.*;

public class FuncJS implements Inst{
	protected String name;
	protected Code code;
	protected List<String> params;
	
	public static final String INSTFUNC = "function"; 
	
	public FuncJS(String n){
		this.name = n;	
		this.code = new ConcreteCode();
		this.params = new ArrayList<String>();
		
	}
	
	public FuncJS(String n , Code c){
		this.name = n;	
		this.code = c;
		this.params = new ArrayList<String>();
	}
	
	public FuncJS(String n , Code c , String ... params){
		this.name = n;	
		this.code = c;
		this.params = Arrays.asList(params);
	}
	
	public String getCode(){
		String tmp = INSTFUNC + " " + this.name + "(";
		
		for(Iterator<String> it = this.params.iterator()  ; it.hasNext();){
			tmp += it.next();
			tmp +=(',');
		}
			
		
		
		tmp += "){\n";
		tmp += this.code.getCode();
		tmp += '}';
		
		return tmp;
	}
	
	
	
}
