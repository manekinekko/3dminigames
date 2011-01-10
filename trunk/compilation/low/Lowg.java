 
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;

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

	   //Resulting code
	
	   Codes codes = tparser.game();
	   
	   Code entCode = codes.getEntitiesCode();
	   Code rsCode = codes.getResourcesCode();
	   
	   
	   
	   String resultingEntCode = new String();
	   String resultingRsCode = new String();
	   
	   for (Iterator<InstJS> it = entCode.getIterator() ; it.hasNext() ;){
		   //System.out.print(it.next().getCode());
		   resultingEntCode += it.next().getCode();
	   }
	   
	   for (Iterator<InstJS> it = rsCode.getIterator() ; it.hasNext() ;){
		   //System.out.print(it.next().getCode());
		   resultingRsCode += it.next().getCode();
	   }
	   

	/* RESSOURCE.JS */
	
	   
	File resourcesFile = new File("resources.js");
	
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
	
	File entitiesFile = new File("entities.js");
    
	FileWriter entFileWriter = new FileWriter(entitiesFile);
		
	BufferedWriter entOut = new BufferedWriter(entFileWriter);
	entOut.write(resultingEntCode);
	    
	entOut.close();
	
	entitiesFile.createNewFile();
	
	/* ***************************************************************** */
	
	
	
    }
     
}
