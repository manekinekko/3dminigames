 
import org.antlr.runtime.*;

public class Test {
    public static void main(String[] args) throws Exception {
        
        GrammaireHautNiveauLexer lexer = new GrammaireHautNiveauLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammaireHautNiveauParser parser = new GrammaireHautNiveauParser(tokens);
        parser.jeu();
    }
}
