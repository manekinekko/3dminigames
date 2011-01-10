// $ANTLR 3.3 Nov 30, 2010 12:50:56 LowgTree.g 2011-01-10 20:30:26

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LowgTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "VAL", "GAME", "PTVIRG", "ID", "INT", "FLOAT", "OBJECT", "AFF", "FRICTIONCOEF", "WS", "WITH"
    };
    public static final int EOF=-1;
    public static final int IMAGINERY_TOKEN=4;
    public static final int RESOURCE=5;
    public static final int RESOURCES=6;
    public static final int VAL=7;
    public static final int GAME=8;
    public static final int PTVIRG=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int FLOAT=12;
    public static final int OBJECT=13;
    public static final int AFF=14;
    public static final int FRICTIONCOEF=15;
    public static final int WS=16;
    public static final int WITH=17;

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
    // LowgTree.g:8:1: game returns [Code c] : ^( GAME rs= resourcesSets entities ) ;
    public final Code game() throws RecognitionException {
        Code c = null;

        Code rs = null;


         c = new CodeResources();
        try {
            // LowgTree.g:8:55: ( ^( GAME rs= resourcesSets entities ) )
            // LowgTree.g:8:57: ^( GAME rs= resourcesSets entities )
            {
            match(input,GAME,FOLLOW_GAME_in_game47); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_resourcesSets_in_game53);
            rs=resourcesSets();

            state._fsp--;

             c.append(rs); 
            pushFollow(FOLLOW_entities_in_game57);
            entities();

            state._fsp--;


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
    // LowgTree.g:12:1: resourcesSets returns [Code c] : ^( RESOURCES (r= resource )+ ) ;
    public final Code resourcesSets() throws RecognitionException {
        Code c = null;

        InstJS r = null;


         c =new CodeResources();
        try {
            // LowgTree.g:12:63: ( ^( RESOURCES (r= resource )+ ) )
            // LowgTree.g:12:65: ^( RESOURCES (r= resource )+ )
            {
            match(input,RESOURCES,FOLLOW_RESOURCES_in_resourcesSets81); 

            match(input, Token.DOWN, null); 
            // LowgTree.g:12:77: (r= resource )+
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
            	    // LowgTree.g:12:78: r= resource
            	    {
            	    pushFollow(FOLLOW_resource_in_resourcesSets88);
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
    // LowgTree.g:15:1: resource returns [InstJS ijs] : ^( RESOURCE n= ID i= initValue ) ;
    public final InstJS resource() throws RecognitionException {
        InstJS ijs = null;

        CommonTree n=null;
        String i = null;


        ijs = null; 
        try {
            // LowgTree.g:17:3: ( ^( RESOURCE n= ID i= initValue ) )
            // LowgTree.g:17:4: ^( RESOURCE n= ID i= initValue )
            {
            match(input,RESOURCE,FOLLOW_RESOURCE_in_resource113); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,ID,FOLLOW_ID_in_resource123); 
            pushFollow(FOLLOW_initValue_in_resource133);
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


    // $ANTLR start "initValue"
    // LowgTree.g:29:1: initValue returns [String s] : ( ^( VAL n= INT ) | ^( VAL f= FLOAT ) );
    public final String initValue() throws RecognitionException {
        String s = null;

        CommonTree n=null;
        CommonTree f=null;

        s = null;
        try {
            // LowgTree.g:30:20: ( ^( VAL n= INT ) | ^( VAL f= FLOAT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VAL) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==INT) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==FLOAT) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // LowgTree.g:30:22: ^( VAL n= INT )
                    {
                    match(input,VAL,FOLLOW_VAL_in_initValue162); 

                    match(input, Token.DOWN, null); 
                    n=(CommonTree)match(input,INT,FOLLOW_INT_in_initValue168); 

                    		s = new String(n.getText());
                    	  

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // LowgTree.g:35:12: ^( VAL f= FLOAT )
                    {
                    match(input,VAL,FOLLOW_VAL_in_initValue190); 

                    match(input, Token.DOWN, null); 
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_initValue196); 

                    		s = new String(f.getText());


                    	

                    match(input, Token.UP, null); 

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


    // $ANTLR start "entities"
    // LowgTree.g:48:1: entities : ( object )+ ;
    public final void entities() throws RecognitionException {
        try {
            // LowgTree.g:48:10: ( ( object )+ )
            // LowgTree.g:48:12: ( object )+
            {
            // LowgTree.g:48:12: ( object )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==OBJECT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // LowgTree.g:48:12: object
            	    {
            	    pushFollow(FOLLOW_object_in_entities216);
            	    object();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


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
    // $ANTLR end "entities"


    // $ANTLR start "object"
    // LowgTree.g:51:1: object : OBJECT AFF ID parameters PTVIRG ;
    public final void object() throws RecognitionException {
        try {
            // LowgTree.g:51:8: ( OBJECT AFF ID parameters PTVIRG )
            // LowgTree.g:51:10: OBJECT AFF ID parameters PTVIRG
            {
            match(input,OBJECT,FOLLOW_OBJECT_in_object226); 
            match(input,AFF,FOLLOW_AFF_in_object228); 
            match(input,ID,FOLLOW_ID_in_object230); 
            pushFollow(FOLLOW_parameters_in_object232);
            parameters();

            state._fsp--;

            match(input,PTVIRG,FOLLOW_PTVIRG_in_object234); 

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
    // $ANTLR end "object"


    // $ANTLR start "parameters"
    // LowgTree.g:53:1: parameters : FRICTIONCOEF AFF FLOAT ;
    public final void parameters() throws RecognitionException {
        try {
            // LowgTree.g:53:12: ( FRICTIONCOEF AFF FLOAT )
            // LowgTree.g:53:14: FRICTIONCOEF AFF FLOAT
            {
            match(input,FRICTIONCOEF,FOLLOW_FRICTIONCOEF_in_parameters243); 
            match(input,AFF,FOLLOW_AFF_in_parameters245); 
            match(input,FLOAT,FOLLOW_FLOAT_in_parameters247); 

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
    // $ANTLR end "parameters"

    // Delegated rules


 

    public static final BitSet FOLLOW_GAME_in_game47 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resourcesSets_in_game53 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_entities_in_game57 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RESOURCES_in_resourcesSets81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resource_in_resourcesSets88 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_RESOURCE_in_resource113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_resource123 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_initValue_in_resource133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAL_in_initValue162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_initValue168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAL_in_initValue190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_initValue196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_object_in_entities216 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_OBJECT_in_object226 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_AFF_in_object228 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_object230 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_parameters_in_object232 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PTVIRG_in_object234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRICTIONCOEF_in_parameters243 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_AFF_in_parameters245 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_FLOAT_in_parameters247 = new BitSet(new long[]{0x0000000000000002L});

}