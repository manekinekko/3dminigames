 
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
	
	   Code code = tparser.game();
	   String resultingCode = new String();

	   for (Iterator<InstJS> it = code.getIterator() ; it.hasNext() ;){
		   //System.out.print(it.next().getCode());
		   resultingCode += it.next().getCode();
	   }

	/* Create js files */
	File resourcesFile = new File("resources.js");
	File entitiesFile = new File("entities.js");
	
	/* Write into this file */
	
	FileWriter jsFileWriter = new FileWriter(resourcesFile);
	
	//Create an output stream
	BufferedWriter out = new BufferedWriter(jsFileWriter);
	out.write(resultingCode);
	
	//Close the output stream
    out.close();
	
    //Create the actual files
	resourcesFile.createNewFile();
	entitiesFile.createNewFile();

    
    

	
    }
     
}
