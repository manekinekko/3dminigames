import java.io.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import org.antlr.runtime.tree.Tree;

import grammars.*;
import code.*;


public class Test {
    public static void main(String[] args) throws Exception {
	File f; FileReader s;
	PrintStream output;
	try {

	    if( (args.length > 2) || (args.length == 0)) {
		System.err.println("Usage: Test fichier.vsl [fichier.s]");
		System.exit(1);
	    };

	    f = new File(args[0]);
	    s = new FileReader(f);

	    if(args.length == 2){
		output = new PrintStream(new File(args[1]));
	    }
	    else{
		output = System.out;
	    }


	    ANTLRFileStream input = new ANTLRFileStream(args[0]);
	    hightLexer lexer = new hightLexer(input);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    hightParser parser = new hightParser(tokens);

	    hightParser.game_return r = parser.game();

	    //resulting tree
	    CommonTree t = (CommonTree)r.getTree();

	    // Print the resulting tree out in LISP notation
	    //System.out.println(t.toStringTree());

	    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
	    hightTree tparser = new hightTree(nodes);


	    try {
		SymbolTable ts = new SymbolTable();
		tparser.game(ts);

		//		c3a.print();
		//		CodeGenerator cg = new CodeGenerator(output);

		//cg.addStubPrint(c3a);
		//cg.addStubMain(c3a);

		//		cg.genCodeMIPS(c3a);
	    }
	    catch (Exception e) {
		System.err.println(e.getMessage());
		e.printStackTrace();
	    }





	}
	catch (FileNotFoundException fnf){
	    System.err.println("exception: "+fnf);
	}



    }
}
