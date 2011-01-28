 
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import java.util.*;
import java.io.*;

public class Lowg {
	
	
	
	
    public static void main(String[] args) throws Exception {
        
        LowgLexer lexer = new LowgLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LowgParser parser = new LowgParser(tokens);

	

            LowgParser.game_return r = parser.game();
		
            //Resulting tree
            CommonTree t = (CommonTree)r.getTree();

            //Tree nodes stream

            CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
            LowgTree tparser = new LowgTree(nodes);

	   //Resulting codes
	
            
            
	   Codes codes = tparser.game(new ClassTab());

	   codes.put("index",new ConcreteCode());
	   codes.get("index").append(new IndexHTML("GAME","config.js","resources.js" , "entities.js", "main.js", "events.js"));
	   
	   codes.put("main",new ConcreteCode());
	   codes.put("config",new ConcreteCode());
	   
	   /* Code en dur dans main.js */
	   
	   Code c = new ConcreteCode();
	   		c.append(new DecafJS("canvas",(new FunCallJS("getElementById","document","'canvasElem'").getCode())));
	   		c.append(new AffJS("context",(new FunCallJS("getContext","canvas","'2d'").getCode())));
	   		c.append(new FunCallJS("setInterval","",new FuncJS("",new ConcreteCode()).getCode(),"10"));
	   	
	   	codes.get("main").append(new FunCallJS("addEventListener" , "window", "'load'" , new FuncJS("",c).getCode(), "false"));
	   	   
	   /* ************************ */		
	   		
	   /* Code en dur dans config.js */
	   		
	   codes.get("config").append(new DecJS("context"));		
	   		
	   		
	   /* ************************ */	
	   		
	   String resultingEntCode = codes.get("entities").getCode();
	   String resultingRsCode = codes.get("resources").getCode();
	   String resultingHtmlCode = codes.get("index").getCode();
	   String resultingMainCode = codes.get("main").getCode();
	   String resultingConfigCode = codes.get("config").getCode();

	   /*var elem = document.getElementById('canvasElem');*/
	   
	   
	/* GAME DIRECTORY */
	   
	File gameDir = new File("game");
	gameDir.mkdir();
	  
	/* ***************************************************************** */
	
	
	/* INDEX.HTML */   
	   
	File indexFile = new File("game/index.html");   
	   
	FileWriter indexFileWriter = new FileWriter(indexFile);
	
	
	//Create output stream
	BufferedWriter htmlOut = new BufferedWriter(indexFileWriter);
	htmlOut.write(resultingHtmlCode);
	
	//Close the output stream
    htmlOut.close();
    
    //Create the actual files
	indexFile.createNewFile();
	
	/* ***************************************************************** */   
	   
	 
	/* MAIN.JS */
	
	File mainFile = new File("game/main.js");
	
	
	FileWriter mainFileWriter = new FileWriter(mainFile);
	
	
	//Create output stream
	BufferedWriter mainOut = new BufferedWriter(mainFileWriter);
	mainOut.write(resultingMainCode);
	
	//Close the output stream
    mainOut.close();
    
    //Create the actual files
    mainFile.createNewFile();
	
    /* ***************************************************************** */
	
    /* CONFIG.JS */
	
	File configFile = new File("game/config.js");
	
	
	FileWriter configFileWriter = new FileWriter(configFile);
	
	
	//Create output stream
	BufferedWriter configOut = new BufferedWriter(configFileWriter);
	configOut.write(resultingConfigCode);
	
	//Close the output stream
    configOut.close();
    
    //Create the actual files
    configFile.createNewFile();
    
    /* ***************************************************************** */
    
    
    
    
	/* RESSOURCE.JS */
	
	   
	File resourcesFile = new File("game/resources.js");
	
	/* Write into this file */
	FileWriter rsFileWriter = new FileWriter(resourcesFile);
	
	//Create output stream
	BufferedWriter rsOut = new BufferedWriter(rsFileWriter);
	rsOut.write(resultingRsCode);
	
	//Close the output stream
    rsOut.close();
    
    //Create the actual files
	resourcesFile.createNewFile();

	/* ***************************************************************** */
    
	/* ENTITIES.JS */
	
	File entitiesFile = new File("game/entities.js");
    
	FileWriter entFileWriter = new FileWriter(entitiesFile);
		
	BufferedWriter entOut = new BufferedWriter(entFileWriter);
	entOut.write(resultingEntCode);
	    
	entOut.close();
	
	entitiesFile.createNewFile();
	
	/* ***************************************************************** */
	
	/* EVENTS.JS */
	File eventsFile = new File("game/events.js");
	eventsFile.createNewFile();
	
	/* **************************************************************** */
    }
     
}
