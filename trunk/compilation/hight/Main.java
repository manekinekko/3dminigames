
import code.Code;
import code.SymbolTable;
import grammars.*;
import symbols.Model;
import java.io.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/**
 *
 * @author Quentin
 */
public class Main {

    private static String jsFile, m3dFile, errorFile, errorFormat;
    private static boolean minimize;
    private static PrintStream output, error;

    public static void main(String[] args) {

	errorFile = null;
	errorFormat = null;
	minimize = false;

	error = System.out;
	for (int i = 0; i < args.length; i++) {
	    if (args[i].equals("-errorFormat")) {
		errorFormat = args[i + 1];
		i++;
	    } else if (args[i].equals("-errorFile")) {
		errorFile = args[i + 1];
		i++;
	    } else if (args[i].equals("-minimize")) {
		minimize = true;
	    } else if (args[i].equals("-out")) {
		jsFile = args[i + 1];
		i++;
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
	    hightLexer lexer = new hightLexer(input);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    hightParser parser = new hightParser(tokens);
	    hightParser.game_return r = parser.game();

	    //resulting tree
	    CommonTree t = (CommonTree) r.getTree();

	    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
	    hightTree tparser = new hightTree(nodes);
	    

	    SymbolTable ts = new SymbolTable();
	    Model.init(ts);

	    c = tparser.game(ts);

	    System.out.println(c.getCode());

	} catch (FileNotFoundException e) {
	} catch (IOException e) {
	} catch (RecognitionException e) {
	    
	}
    }
}
