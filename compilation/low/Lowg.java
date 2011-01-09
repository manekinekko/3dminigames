 
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;

import java.util.*;

public class Lowg {
    public static void main(String[] args) throws Exception {
        
        LowgLexer lexer = new LowgLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LowgParser parser = new LowgParser(tokens);
        parser.game(); //parsing ...
	

            LowgParser.game_return r = parser.game();
	/*	
            //resulting tree
            CommonTree t = (CommonTree)r.getTree();

            //Tree nodes stream

            CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
            LowgTree tparser = new LowgTree(nodes);

	   //Resulting code
	
	   Code code = tparser.game();

	   for (Iterator<InstJS> it = code.getIterator() ; it.hasNext() ;){
		   System.out.print(it.next().getCode());
	   }*/
	
    }
     
}
