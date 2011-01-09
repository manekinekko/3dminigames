// $ANTLR 3.3 Nov 30, 2010 12:50:56 LowgTree.g 2011-01-09 16:40:03

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LowgTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "GAME", "PTVIRG", "ID", "INT", "FLOAT", "WS"
    };
    public static final int EOF=-1;
    public static final int IMAGINERY_TOKEN=4;
    public static final int RESOURCE=5;
    public static final int RESOURCES=6;
    public static final int GAME=7;
    public static final int PTVIRG=8;
    public static final int ID=9;
    public static final int INT=10;
    public static final int FLOAT=11;
    public static final int WS=12;

    // delegates
    // delegators


        public LowgTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public LowgTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return LowgTree.tokenNames; }
    public String getGrammarFileName() { return "LowgTree.g"; }



    // $ANTLR start "game"
    // LowgTree.g:8:1: game returns [Code c] : ^( GAME rs= resourcesSets EOF ) ;
    public final Code game() throws RecognitionException {
        Code c = null;

        Code rs = null;


         c = new CodeResources();
        try {
            // LowgTree.g:8:55: ( ^( GAME rs= resourcesSets EOF ) )
            // LowgTree.g:8:90: ^( GAME rs= resourcesSets EOF )
            {
            match(input,GAME,FOLLOW_GAME_in_game48); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_resourcesSets_in_game54);
            rs=resourcesSets();

            state._fsp--;

             c.append(rs); 
            match(input,EOF,FOLLOW_EOF_in_game58); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "game"


    // $ANTLR start "resourcesSets"
    // LowgTree.g:56:1: resourcesSets returns [Code c] : ^( RESOURCES (r= resource )+ ) ;
    public final Code resourcesSets() throws RecognitionException {
        Code c = null;

        InstJS r = null;


         c =new CodeResources();
        try {
            // LowgTree.g:56:63: ( ^( RESOURCES (r= resource )+ ) )
            // LowgTree.g:56:85: ^( RESOURCES (r= resource )+ )
            {
            match(input,RESOURCES,FOLLOW_RESOURCES_in_resourcesSets85); 

            match(input, Token.DOWN, null); 
            // LowgTree.g:56:97: (r= resource )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RESOURCE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // LowgTree.g:56:98: r= resource
            	    {
            	    pushFollow(FOLLOW_resource_in_resourcesSets92);
            	    r=resource();

            	    state._fsp--;

            	     c.append(r);

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "resourcesSets"


    // $ANTLR start "resource"
    // LowgTree.g:67:1: resource returns [InstJS ijs] : ^( RESOURCE n= ID i= initValue ) ;
    public final InstJS resource() throws RecognitionException {
        InstJS ijs = null;

        CommonTree n=null;
        String i = null;


        ijs = null; 
        try {
            // LowgTree.g:69:3: ( ^( RESOURCE n= ID i= initValue ) )
            // LowgTree.g:69:4: ^( RESOURCE n= ID i= initValue )
            {
            match(input,RESOURCE,FOLLOW_RESOURCE_in_resource124); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,ID,FOLLOW_ID_in_resource134); 
            pushFollow(FOLLOW_initValue_in_resource144);
            i=initValue();

            state._fsp--;


            			ijs = new DecafJS(n.getText() , i);	   

            		

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ijs;
    }
    // $ANTLR end "resource"


    // $ANTLR start "name"
    // LowgTree.g:82:1: name : ID ;
    public final void name() throws RecognitionException {
        try {
            // LowgTree.g:82:6: ( ID )
            // LowgTree.g:82:8: ID
            {
            match(input,ID,FOLLOW_ID_in_name163); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "name"


    // $ANTLR start "initValue"
    // LowgTree.g:86:1: initValue returns [String s] : (n= INT | f= FLOAT );
    public final String initValue() throws RecognitionException {
        String s = null;

        CommonTree n=null;
        CommonTree f=null;

        s = null;
        try {
            // LowgTree.g:87:20: (n= INT | f= FLOAT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==FLOAT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // LowgTree.g:87:22: n= INT
                    {
                    n=(CommonTree)match(input,INT,FOLLOW_INT_in_initValue186); 

                    		s = new String(n.getText());
                    	  

                    }
                    break;
                case 2 :
                    // LowgTree.g:92:12: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_initValue210); 

                    		s = new String(f.getText());


                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "initValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_GAME_in_game48 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resourcesSets_in_game54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_game58 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RESOURCES_in_resourcesSets85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resource_in_resourcesSets92 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_RESOURCE_in_resource124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_resource134 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_initValue_in_resource144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_name163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_initValue186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_initValue210 = new BitSet(new long[]{0x0000000000000002L});

}