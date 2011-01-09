/* ****************************************
 *  					  *
 * Instruction de déclaration/affectation *
 *                                        *  
 * ************************************** */


public class DecafJS implements InstJS{
	
	public static final String instDec = "var"; 
	
	protected String name;
	protected String val;
	
	public DecafJS(String n , String v){
		this.name = n;
		this.val = v;
	}
	
	
	
	public String getCode(){
		return instDec + " " + this.name + " =" + this.val + "\n"; 
	}
}
