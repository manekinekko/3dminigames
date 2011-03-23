package com.istic.mini3d;

import com.istic.mini3d.code.Code;
import com.istic.mini3d.code.SymbolTable;
import com.istic.mini3d.grammars.*;
import com.istic.mini3d.symbols.Model;
import java.io.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/**
 *
 * @author Quentin
 */
public class Main {

    private static String jsFile, m3dFile;
    //private static String errorFile, errorFormat;
    private static boolean minimize;
    private static PrintStream output, error;

    public static void main(String[] args) {

	//errorFile = null; errorFormat = null;
	minimize = false;
	jsFile = null;

	error = System.out;
	for (int i = 0; i < args.length; i++) {
	    if (args[i].equals("-out")) {
		jsFile = args[i + 1];
		i++;
	    /*} else if(args[i].equals("-errorFormat")) {
		errorFormat = args[i + 1];
		i++;
	    } else if (args[i].equals("-errorFile")) {
		errorFile = args[i + 1];
		i++;*/
	    } else if (args[i].equals("-minimize")) {
		minimize = true;
	    } else {
		m3dFile = args[i];
	    }
	}

	File m3d;
	FileReader m3dReader;
	Code c = null;
	try {
	    //Test pour vérifier que le fichier existe.
	    m3d = new File(m3dFile);
	    m3dReader = new FileReader(m3d);

	    ANTLRFileStream input = new ANTLRFileStream(args[0]);
	    highLexer lexer = new highLexer(input);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    highParser parser = new highParser(tokens);
	    highParser.game_return r = parser.game();

	    //resulting tree
	    CommonTree t = (CommonTree) r.getTree();

	    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
	    highTree tparser = new highTree(nodes);
	    

	    SymbolTable ts = new SymbolTable();
	    Model.init(ts);

	    c = tparser.game(ts);

	    FileWriter m3dJS = null;

	    if(jsFile != null) {
		try {
		    m3dJS = new FileWriter(jsFile);
		    m3dJS.write(c.getCode());
		} catch(IOException ex) {
		    error.println("Le fichier "+jsFile+" existe déjà.");
		} finally {
		    if(m3dJS != null)
			m3dJS.close();
		}
	    } else {
		System.out.println(c.getCode());
                ts.print();
	    }

	} catch (FileNotFoundException e) {
	} catch (IOException e) {
	} catch (RecognitionException e) {
	    
	}
    }
}
