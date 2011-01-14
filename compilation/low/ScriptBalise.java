
public class ScriptBalise implements Inst{

	
	protected String jsFile; 
	
	public ScriptBalise(String s){
		this.jsFile = s;
	}
	
	
	public String getCode(){
		return "<script type=\"text/javascript\" src=\"" + this.jsFile + "\"></script>\n";
	}
	
	
}
