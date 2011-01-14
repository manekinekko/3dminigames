/* ****************************************
 *  					  *
 * Instruction de déclaration/affectation *
 *                                        *  
 * ************************************** */


public class DecafJS implements Inst{
	
	public static final String INSTDEC = "var"; 
	
	protected String name;
	protected String val;
	
	public DecafJS(String n , String v){
		this.name = n;
		this.val = v;
	}
	
	
	
	public String getCode(){
		return INSTDEC + " " + this.name + " = " + this.val + " ;\n"; 
	}
}
