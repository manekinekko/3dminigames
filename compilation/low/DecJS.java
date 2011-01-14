
public class DecJS implements Inst{

	protected String name;
	public static final String VARINST = "var";
	
	
	public DecJS(String n){
		this.name = n;
	}
	
	public String getCode(){
		return VARINST + " " + this.name + ";" ;
	}
	
}
