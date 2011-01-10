
public class AffJS implements InstJS{
	
	protected String name;
	protected String val;
	
	public AffJS(String n , String v){
		this.name = n;
		this.val = v;
	}
	
	public String getCode(){
		return this.name + " = " + this.val + " ;\n";
	}
}
