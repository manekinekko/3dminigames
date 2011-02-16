import java.io.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


import grammars.*;
import code.*;
import symbols.Genre;
import symbols.Model;


public class Test {
	
	static String pasMain(String nf){ //recopie du main pour utilisation dans test JUnit
		File f; FileReader s;
		Code c = new Code("aucun Code");
		PrintStream output;
		try {

		    /*if( (args.length > 2) || (args.length == 0)) {
			System.err.println("Usage: Test fichier.vsl [fichier.s]");
			System.exit(1);
		    }*/

		    f = new File(nf);
		    s = new FileReader(f);

		    //if(args.length == 2){
			//output = new PrintStream(new File());
		    //}
		    //else{
			output = System.out;
		    //}

try{
		    ANTLRFileStream input = new ANTLRFileStream(nf);
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


		    
			SymbolTable ts = new SymbolTable();
	                Model.init(ts);

	                c = tparser.game(ts); // est cense rendre le code
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
		return c.toString();
	}
    public static void main(String[] args) throws Exception {
	
    		File f; FileReader s;
    		PrintStream output;
    		try {

    		    if( (args.length > 2) || (args.length == 0)) {
    			System.err.println("Usage: Test fichier.vsl [fichier.s]");
    			System.exit(1);
    		    }

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
    	                Model.init(ts);

    			Code c = tparser.game(ts); 
    			
    			System.out.println(c.getCode());
    			
    			File jsFile = new File("main.js");
    			BufferedWriter out = new BufferedWriter(new FileWriter(jsFile));
    			out.write(c.getCode());
    			out.close();
    			
    			jsFile.createNewFile();
    			
    			
    			// est cense rendre le code
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
