// $ANTLR 3.3 Nov 30, 2010 12:50:56 LowgTree.g 2011-01-10 23:24:50

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LowgTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "VAL", "GAME", "PARAMS", "OBJ", "OBJS", "PTVIRG", "ID", "INT", "FLOAT", "OBJECT", "AFF", "FRICTIONCOEF", "WS", "WITH"
    };
    public static final int EOF=-1;
    public static final int IMAGINERY_TOKEN=4;
    public static final int RESOURCE=5;
    public static final int RESOURCES=6;
    public static final int VAL=7;
    public static final int GAME=8;
    public static final int PARAMS=9;
    public static final int OBJ=10;
    public static final int OBJS=11;
    public static final int PTVIRG=12;
    public static final int ID=13;
    public static final int INT=14;
    public static final int FLOAT=15;
    public static final int OBJECT=16;
    public static final int AFF=17;
    public static final int FRICTIONCOEF=18;
    public static final int WS=19;
    public static final int WITH=20;

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
    // LowgTree.g:8:1: game returns [Codes c] : ^( GAME rs= resourcesSets e= entities ) ;
    public final Codes game() throws RecognitionException {
        Codes c = null;

        Code rs = null;

        Code e = null;


         c = null;
        try {
            // LowgTree.g:8:41: ( ^( GAME rs= resourcesSets e= entities ) )
            // LowgTree.g:8:43: ^( GAME rs= resourcesSets e= entities )
            {
            match(input,GAME,FOLLOW_GAME_in_game47); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_resourcesSets_in_game53);
            rs=resourcesSets();

            state._fsp--;

            pushFollow(FOLLOW_entities_in_game60);
            e=entities();

            state._fsp--;

            c = new Codes(e,rs);

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


         c =new ConcreteCode();
        try {
            // LowgTree.g:12:62: ( ^( RESOURCES (r= resource )+ ) )
            // LowgTree.g:12:64: ^( RESOURCES (r= resource )+ )
            {
            match(input,RESOURCES,FOLLOW_RESOURCES_in_resourcesSets85); 

            match(input, Token.DOWN, null); 
            // LowgTree.g:12:76: (r= resource )+
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
            	    // LowgTree.g:12:77: r= resource
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
            match(input,RESOURCE,FOLLOW_RESOURCE_in_resource117); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,ID,FOLLOW_ID_in_resource127); 
            pushFollow(FOLLOW_initValue_in_resource137);
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
    // LowgTree.g:29:1: initValue returns [String s] : (n= INT | f= FLOAT );
    public final String initValue() throws RecognitionException {
        String s = null;

        CommonTree n=null;
        CommonTree f=null;

        s = null;
        try {
            // LowgTree.g:30:20: (n= INT | f= FLOAT )
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
                    // LowgTree.g:30:22: n= INT
                    {
                    n=(CommonTree)match(input,INT,FOLLOW_INT_in_initValue169); 

                    		s = new String(n.getText());
                    	  

                    }
                    break;
                case 2 :
                    // LowgTree.g:35:12: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_initValue193); 

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


    // $ANTLR start "entities"
    // LowgTree.g:48:1: entities returns [Code c] : ^( OBJS (ob= object )+ ) ;
    public final Code entities() throws RecognitionException {
        Code c = null;

        ClassJS ob = null;


        c = new ConcreteCode();
        try {
            // LowgTree.g:48:57: ( ^( OBJS (ob= object )+ ) )
            // LowgTree.g:48:59: ^( OBJS (ob= object )+ )
            {
            match(input,OBJS,FOLLOW_OBJS_in_entities220); 

            match(input, Token.DOWN, null); 
            // LowgTree.g:48:66: (ob= object )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==OBJ) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // LowgTree.g:48:67: ob= object
            	    {
            	    pushFollow(FOLLOW_object_in_entities227);
            	    ob=object();

            	    state._fsp--;


            	    			c.append(ob);	
            	    		

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
    // $ANTLR end "entities"


    // $ANTLR start "object"
    // LowgTree.g:56:1: object returns [ClassJS cjs] : ^( OBJ i= ID pms= parameters ) ;
    public final ClassJS object() throws RecognitionException {
        ClassJS cjs = null;

        CommonTree i=null;
        AffJS pms = null;


        cjs = null; 
        try {
            // LowgTree.g:56:49: ( ^( OBJ i= ID pms= parameters ) )
            // LowgTree.g:56:51: ^( OBJ i= ID pms= parameters )
            {
            match(input,OBJ,FOLLOW_OBJ_in_object255); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,ID,FOLLOW_ID_in_object261); 
            pushFollow(FOLLOW_parameters_in_object267);
            pms=parameters();

            state._fsp--;


            		List<AffJS> l= new ArrayList();
            		l.add(pms);		
            		cjs = new ClassJS(i.getText() , new ArrayList() , l); 
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cjs;
    }
    // $ANTLR end "object"


    // $ANTLR start "parameters"
    // LowgTree.g:66:1: parameters returns [AffJS aff] : ^( PARAMS id= FRICTIONCOEF f= FLOAT ) ;
    public final AffJS parameters() throws RecognitionException {
        AffJS aff = null;

        CommonTree id=null;
        CommonTree f=null;

        aff=null;
        try {
            // LowgTree.g:66:48: ( ^( PARAMS id= FRICTIONCOEF f= FLOAT ) )
            // LowgTree.g:66:50: ^( PARAMS id= FRICTIONCOEF f= FLOAT )
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_parameters292); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,FRICTIONCOEF,FOLLOW_FRICTIONCOEF_in_parameters298); 
            f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_parameters305); 

            			aff = new AffJS(id.getText() , f.getText());
            		

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return aff;
    }
    // $ANTLR end "parameters"

    // Delegated rules


 

    public static final BitSet FOLLOW_GAME_in_game47 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resourcesSets_in_game53 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_entities_in_game60 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RESOURCES_in_resourcesSets85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resource_in_resourcesSets92 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_RESOURCE_in_resource117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_resource127 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_initValue_in_resource137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_initValue169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_initValue193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJS_in_entities220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_entities227 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_OBJ_in_object255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_object261 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_parameters_in_object267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMS_in_parameters292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FRICTIONCOEF_in_parameters298 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FLOAT_in_parameters305 = new BitSet(new long[]{0x0000000000000008L});

}