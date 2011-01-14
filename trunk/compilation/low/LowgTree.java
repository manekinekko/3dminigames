// $ANTLR 3.3 Nov 30, 2010 12:50:56 LowgTree.g 2011-01-13 20:39:00

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LowgTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "VAL", "GAME", "PARAMS", "PARAMLIST", "OBJ", "OBJS", "PTVIRG", "KEYLISTENER", "AD", "AF", "MOUSELISTENER", "KEYSTROKE", "DP", "ID", "LEFTCLICK", "LEFTDROP", "LEFTDRAG", "RIGHTCLICK", "RIGHTDROP", "INT", "FLOAT", "STRING", "OBJECT", "AFF", "POSX", "VIRG", "POSY", "POSZ", "WS", "WITH"
    };
    public static final int EOF=-1;
    public static final int IMAGINERY_TOKEN=4;
    public static final int RESOURCE=5;
    public static final int RESOURCES=6;
    public static final int VAL=7;
    public static final int GAME=8;
    public static final int PARAMS=9;
    public static final int PARAMLIST=10;
    public static final int OBJ=11;
    public static final int OBJS=12;
    public static final int PTVIRG=13;
    public static final int KEYLISTENER=14;
    public static final int AD=15;
    public static final int AF=16;
    public static final int MOUSELISTENER=17;
    public static final int KEYSTROKE=18;
    public static final int DP=19;
    public static final int ID=20;
    public static final int LEFTCLICK=21;
    public static final int LEFTDROP=22;
    public static final int LEFTDRAG=23;
    public static final int RIGHTCLICK=24;
    public static final int RIGHTDROP=25;
    public static final int INT=26;
    public static final int FLOAT=27;
    public static final int STRING=28;
    public static final int OBJECT=29;
    public static final int AFF=30;
    public static final int POSX=31;
    public static final int VIRG=32;
    public static final int POSY=33;
    public static final int POSZ=34;
    public static final int WS=35;
    public static final int WITH=36;

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


    // $ANTLR start "refreshLoop"
    // LowgTree.g:14:1: refreshLoop : KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF ;
    public final void refreshLoop() throws RecognitionException {
        try {
            // LowgTree.g:14:13: ( KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF )
            // LowgTree.g:14:15: KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF
            {
            match(input,KEYLISTENER,FOLLOW_KEYLISTENER_in_refreshLoop80); 
            match(input,AD,FOLLOW_AD_in_refreshLoop82); 
            pushFollow(FOLLOW_keyboardCommands_in_refreshLoop84);
            keyboardCommands();

            state._fsp--;

            match(input,AF,FOLLOW_AF_in_refreshLoop86); 
            match(input,MOUSELISTENER,FOLLOW_MOUSELISTENER_in_refreshLoop88); 
            match(input,AD,FOLLOW_AD_in_refreshLoop90); 
            pushFollow(FOLLOW_mouseCommands_in_refreshLoop92);
            mouseCommands();

            state._fsp--;

            match(input,AF,FOLLOW_AF_in_refreshLoop94); 

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
    // $ANTLR end "refreshLoop"


    // $ANTLR start "keyboardCommands"
    // LowgTree.g:16:1: keyboardCommands : ( KEYSTROKE DP signalSets )* ;
    public final void keyboardCommands() throws RecognitionException {
        try {
            // LowgTree.g:16:18: ( ( KEYSTROKE DP signalSets )* )
            // LowgTree.g:16:20: ( KEYSTROKE DP signalSets )*
            {
            // LowgTree.g:16:20: ( KEYSTROKE DP signalSets )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYSTROKE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // LowgTree.g:16:21: KEYSTROKE DP signalSets
            	    {
            	    match(input,KEYSTROKE,FOLLOW_KEYSTROKE_in_keyboardCommands103); 
            	    match(input,DP,FOLLOW_DP_in_keyboardCommands105); 
            	    pushFollow(FOLLOW_signalSets_in_keyboardCommands107);
            	    signalSets();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "keyboardCommands"


    // $ANTLR start "mouseCommands"
    // LowgTree.g:19:1: mouseCommands : ( typeofclick DP signalSets )* ;
    public final void mouseCommands() throws RecognitionException {
        try {
            // LowgTree.g:19:15: ( ( typeofclick DP signalSets )* )
            // LowgTree.g:19:17: ( typeofclick DP signalSets )*
            {
            // LowgTree.g:19:17: ( typeofclick DP signalSets )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=LEFTCLICK && LA2_0<=RIGHTDROP)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // LowgTree.g:19:18: typeofclick DP signalSets
            	    {
            	    pushFollow(FOLLOW_typeofclick_in_mouseCommands120);
            	    typeofclick();

            	    state._fsp--;

            	    match(input,DP,FOLLOW_DP_in_mouseCommands122); 
            	    pushFollow(FOLLOW_signalSets_in_mouseCommands124);
            	    signalSets();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "mouseCommands"


    // $ANTLR start "signalSets"
    // LowgTree.g:21:1: signalSets : ( signal )+ ;
    public final void signalSets() throws RecognitionException {
        try {
            // LowgTree.g:21:12: ( ( signal )+ )
            // LowgTree.g:21:14: ( signal )+
            {
            // LowgTree.g:21:14: ( signal )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // LowgTree.g:21:14: signal
            	    {
            	    pushFollow(FOLLOW_signal_in_signalSets134);
            	    signal();

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
    // $ANTLR end "signalSets"


    // $ANTLR start "signal"
    // LowgTree.g:23:1: signal : ID ;
    public final void signal() throws RecognitionException {
        try {
            // LowgTree.g:23:8: ( ID )
            // LowgTree.g:23:10: ID
            {
            match(input,ID,FOLLOW_ID_in_signal143); 

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
    // $ANTLR end "signal"


    // $ANTLR start "typeofclick"
    // LowgTree.g:25:1: typeofclick : ( LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP );
    public final void typeofclick() throws RecognitionException {
        try {
            // LowgTree.g:25:13: ( LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP )
            // LowgTree.g:
            {
            if ( (input.LA(1)>=LEFTCLICK && input.LA(1)<=RIGHTDROP) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "typeofclick"


    // $ANTLR start "resourcesSets"
    // LowgTree.g:37:1: resourcesSets returns [Code c] : ^( RESOURCES (r= resource )+ ) ;
    public final Code resourcesSets() throws RecognitionException {
        Code c = null;

        Inst r = null;


         c =new ConcreteCode();
        try {
            // LowgTree.g:37:62: ( ^( RESOURCES (r= resource )+ ) )
            // LowgTree.g:37:64: ^( RESOURCES (r= resource )+ )
            {
            match(input,RESOURCES,FOLLOW_RESOURCES_in_resourcesSets196); 

            match(input, Token.DOWN, null); 
            // LowgTree.g:39:4: (r= resource )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RESOURCE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LowgTree.g:39:5: r= resource
            	    {
            	    pushFollow(FOLLOW_resource_in_resourcesSets209);
            	    r=resource();

            	    state._fsp--;

            	     
            	    				c.append(r);
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // LowgTree.g:44:1: resource returns [Inst ijs] : ^( RESOURCE n= ID i= initNumValue ) ;
    public final Inst resource() throws RecognitionException {
        Inst ijs = null;

        CommonTree n=null;
        String i = null;


        ijs = null; 
        try {
            // LowgTree.g:46:3: ( ^( RESOURCE n= ID i= initNumValue ) )
            // LowgTree.g:46:4: ^( RESOURCE n= ID i= initNumValue )
            {
            match(input,RESOURCE,FOLLOW_RESOURCE_in_resource234); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,ID,FOLLOW_ID_in_resource244); 
            pushFollow(FOLLOW_initNumValue_in_resource254);
            i=initNumValue();

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


    // $ANTLR start "initNumValue"
    // LowgTree.g:58:1: initNumValue returns [String s] : (n= INT | f= FLOAT );
    public final String initNumValue() throws RecognitionException {
        String s = null;

        CommonTree n=null;
        CommonTree f=null;

        s = null;
        try {
            // LowgTree.g:59:20: (n= INT | f= FLOAT )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==FLOAT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // LowgTree.g:59:22: n= INT
                    {
                    n=(CommonTree)match(input,INT,FOLLOW_INT_in_initNumValue286); 

                    		s = new String(n.getText());
                    	  

                    }
                    break;
                case 2 :
                    // LowgTree.g:64:12: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_initNumValue310); 

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
    // $ANTLR end "initNumValue"


    // $ANTLR start "initValue"
    // LowgTree.g:72:1: initValue returns [String s] : (inv= initNumValue | st= STRING );
    public final String initValue() throws RecognitionException {
        String s = null;

        CommonTree st=null;
        String inv = null;


        s = null;
        try {
            // LowgTree.g:73:20: (inv= initNumValue | st= STRING )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=INT && LA6_0<=FLOAT)) ) {
                alt6=1;
            }
            else if ( (LA6_0==STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // LowgTree.g:73:22: inv= initNumValue
                    {
                    pushFollow(FOLLOW_initNumValue_in_initValue336);
                    inv=initNumValue();

                    state._fsp--;


                    		s = inv;
                    	  

                    }
                    break;
                case 2 :
                    // LowgTree.g:78:12: st= STRING
                    {
                    st=(CommonTree)match(input,STRING,FOLLOW_STRING_in_initValue360); 

                    		s = new String(st.getText());


                    	

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
    // LowgTree.g:91:1: entities returns [Code c] : ^( OBJS (ob= object )+ ) ;
    public final Code entities() throws RecognitionException {
        Code c = null;

        ClassJS ob = null;


        c = new ConcreteCode();
        try {
            // LowgTree.g:91:57: ( ^( OBJS (ob= object )+ ) )
            // LowgTree.g:91:59: ^( OBJS (ob= object )+ )
            {
            match(input,OBJS,FOLLOW_OBJS_in_entities387); 

            match(input, Token.DOWN, null); 
            // LowgTree.g:91:66: (ob= object )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OBJ) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // LowgTree.g:91:67: ob= object
            	    {
            	    pushFollow(FOLLOW_object_in_entities394);
            	    ob=object();

            	    state._fsp--;


            	    			c.append(ob);	
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // LowgTree.g:99:1: object returns [ClassJS cjs] : ^( OBJ i= ID pms= parameters ) ;
    public final ClassJS object() throws RecognitionException {
        ClassJS cjs = null;

        CommonTree i=null;
        List<AffJS> pms = null;


        cjs = null; 
        try {
            // LowgTree.g:99:49: ( ^( OBJ i= ID pms= parameters ) )
            // LowgTree.g:99:51: ^( OBJ i= ID pms= parameters )
            {
            match(input,OBJ,FOLLOW_OBJ_in_object422); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,ID,FOLLOW_ID_in_object428); 
            pushFollow(FOLLOW_parameters_in_object434);
            pms=parameters();

            state._fsp--;



            		cjs = new ClassJS(i.getText() , new ArrayList() , pms); 
            	

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
    // LowgTree.g:108:1: parameters returns [List<AffJS> l] : ^( PARAMS id1= POSX f1= initNumValue id2= POSY f2= initNumValue id3= POSZ f3= initNumValue pl= paramlist ) ;
    public final List<AffJS> parameters() throws RecognitionException {
        List<AffJS> l = null;

        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree id3=null;
        String f1 = null;

        String f2 = null;

        String f3 = null;

        List<AffJS> pl = null;


        l = new ArrayList<AffJS>();
        try {
            // LowgTree.g:108:70: ( ^( PARAMS id1= POSX f1= initNumValue id2= POSY f2= initNumValue id3= POSZ f3= initNumValue pl= paramlist ) )
            // LowgTree.g:108:72: ^( PARAMS id1= POSX f1= initNumValue id2= POSY f2= initNumValue id3= POSZ f3= initNumValue pl= paramlist )
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_parameters459); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,POSX,FOLLOW_POSX_in_parameters465); 
            pushFollow(FOLLOW_initNumValue_in_parameters471);
            f1=initNumValue();

            state._fsp--;

            id2=(CommonTree)match(input,POSY,FOLLOW_POSY_in_parameters477); 
            pushFollow(FOLLOW_initNumValue_in_parameters483);
            f2=initNumValue();

            state._fsp--;

            id3=(CommonTree)match(input,POSZ,FOLLOW_POSZ_in_parameters490); 
            pushFollow(FOLLOW_initNumValue_in_parameters496);
            f3=initNumValue();

            state._fsp--;

            pushFollow(FOLLOW_paramlist_in_parameters502);
            pl=paramlist();

            state._fsp--;



            			l.add(new AffJS(id1.getText() , f1));
            			l.add(new AffJS(id2.getText() , f2));
            			l.add(new AffJS(id3.getText() , f3));
            			l.addAll(pl);

            		 


            		

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "parameters"


    // $ANTLR start "paramlist"
    // LowgTree.g:124:1: paramlist returns [List<AffJS> l] : ^( PARAMLIST (id= ID v= initValue )* ) ;
    public final List<AffJS> paramlist() throws RecognitionException {
        List<AffJS> l = null;

        CommonTree id=null;
        String v = null;


        l = new ArrayList<AffJS>();
        try {
            // LowgTree.g:124:69: ( ^( PARAMLIST (id= ID v= initValue )* ) )
            // LowgTree.g:124:70: ^( PARAMLIST (id= ID v= initValue )* )
            {
            match(input,PARAMLIST,FOLLOW_PARAMLIST_in_paramlist527); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // LowgTree.g:124:82: (id= ID v= initValue )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ID) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // LowgTree.g:124:83: id= ID v= initValue
                	    {
                	    id=(CommonTree)match(input,ID,FOLLOW_ID_in_paramlist534); 
                	    pushFollow(FOLLOW_initValue_in_paramlist540);
                	    v=initValue();

                	    state._fsp--;

                	    l.add(new AffJS(id.getText() , v));

                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "paramlist"

    // Delegated rules


 

    public static final BitSet FOLLOW_GAME_in_game47 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resourcesSets_in_game53 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_entities_in_game60 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEYLISTENER_in_refreshLoop80 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AD_in_refreshLoop82 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_keyboardCommands_in_refreshLoop84 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_AF_in_refreshLoop86 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MOUSELISTENER_in_refreshLoop88 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AD_in_refreshLoop90 = new BitSet(new long[]{0x0000000003E10000L});
    public static final BitSet FOLLOW_mouseCommands_in_refreshLoop92 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_AF_in_refreshLoop94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYSTROKE_in_keyboardCommands103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DP_in_keyboardCommands105 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_signalSets_in_keyboardCommands107 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_typeofclick_in_mouseCommands120 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DP_in_mouseCommands122 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_signalSets_in_mouseCommands124 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_signal_in_signalSets134 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ID_in_signal143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeofclick0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESOURCES_in_resourcesSets196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resource_in_resourcesSets209 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_RESOURCE_in_resource234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_resource244 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_initNumValue_in_resource254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_initNumValue286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_initNumValue310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initNumValue_in_initValue336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_initValue360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJS_in_entities387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_entities394 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_OBJ_in_object422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_object428 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_parameters_in_object434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMS_in_parameters459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSX_in_parameters465 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_initNumValue_in_parameters471 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_POSY_in_parameters477 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_initNumValue_in_parameters483 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_POSZ_in_parameters490 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_initNumValue_in_parameters496 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_paramlist_in_parameters502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMLIST_in_paramlist527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_paramlist534 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_initValue_in_paramlist540 = new BitSet(new long[]{0x0000000000100008L});

}