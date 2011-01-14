import java.util.*;


public class FunCallJS implements Inst{

	protected String name;
	protected String owner;
	protected List<String> params;
	
	public FunCallJS(String n , String own, String ... p){
		this.name = n;
		this.owner = own;
		this.params = Arrays.asList(p);
	}
	
	public String getCode(){
		String tmp = new String();
		
		if (!this.owner.isEmpty()){
			tmp += this.owner + ".";
		}
		
		tmp += this.name + "(";
		
		for(Iterator<String> it = this.params.iterator() ; it.hasNext();){
			tmp += it.next();
			tmp += ",";
		}
		
		tmp += ");\n";
		
		return tmp;
	}
	
	
}
