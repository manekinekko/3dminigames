import java.util.*;


public class IndexHTML implements Inst{

	public static final String HTMLBEG = "<html>";
	public static final String HTMLEND = "</html>";
	
	public static final String HEADBEG = "<head>";
	public static final String HEADEND = "</head>";
	
	public static final String TITLEBEG = "<title>";
	public static final String TITLEEND = "</title>";
	
	public static final String BODYBEG = "<body>";
	public static final String BODYEND = "</body>";
	
	public static final String H1BEG = "<h1>";
	public static final String H1END = "</h1>";
	public static final String BR = "<br\\>";
	
	public static final String DIVBEG = "<div id='container'>";
	public static final String DIVEND = "</div>";
	
	public static final String CANVASBEG = "<canvas id=\"canvasElem\" width=\"400\" height=\"300\">";
	public static final String CANVASEND = "</canvas>";
	

	
	
	
	protected List<String> jsFiles;
	protected String title;
	protected String indent; 
	
	public IndexHTML(String title,String ... jsf){
		this.jsFiles = Arrays.asList(jsf);
		this.title = title;
		this.indent = new String();
	}
	
	public String getCode(){
		
		String tmp = HTMLBEG + "\n\t" +
				     HEADBEG + "\n\t\t" +
		             TITLEBEG + this.title + TITLEEND + "\n\t" +
		             HEADEND + "\n\n\t" +
		             BODYBEG + "\n\t\t" +
		             DIVBEG + "\n\t\t\t" +
		             CANVASBEG + CANVASEND + "\n\t\t" +
		             DIVEND + "\n\n";
		
		for(Iterator<String> it = jsFiles.iterator() ; it.hasNext();){
			tmp += "\t\t" + (new ScriptBalise(it.next()).getCode()); 
		}
		
		tmp += "\t" + BODYEND +"\n" +
			   HTMLEND;
		
		
	return tmp;	
	}
	
	
}
