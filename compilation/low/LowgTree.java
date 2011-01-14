// $ANTLR 3.3 Nov 30, 2010 12:50:56 LowgTree.g 2011-01-14 21:07:02

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LowgTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IMAGINERY_TOKEN", "RESOURCE", "RESOURCES", "VAL", "GAME", "PARAM", "PARAMLIST", "OBJ", "OBJS", "PTVIRG", "OBJECT", "ID", "AFF", "VIRG", "CAMERA", "AD", "AF", "POSITION", "DP", "ANGLE", "KEYLISTENER", "MOUSELISTENER", "KEYSTROKE", "LEFTCLICK", "LEFTDROP", "LEFTDRAG", "RIGHTCLICK", "RIGHTDROP", "ARROW", "APPLY", "PG", "PD", "PT", "PLUS", "MOINS", "MULT", "DIV", "MOD", "GAMEOVER", "PAUSE", "NEWGAME", "SAVEGAME", "INT", "FLOAT", "STRING", "WS", "PIPE", "WITH"
    };
    public static final int EOF=-1;
    public static final int IMAGINERY_TOKEN=4;
    public static final int RESOURCE=5;
    public static final int RESOURCES=6;
    public static final int VAL=7;
    public static final int GAME=8;
    public static final int PARAM=9;
    public static final int PARAMLIST=10;
    public static final int OBJ=11;
    public static final int OBJS=12;
    public static final int PTVIRG=13;
    public static final int OBJECT=14;
    public static final int ID=15;
    public static final int AFF=16;
    public static final int VIRG=17;
    public static final int CAMERA=18;
    public static final int AD=19;
    public static final int AF=20;
    public static final int POSITION=21;
    public static final int DP=22;
    public static final int ANGLE=23;
    public static final int KEYLISTENER=24;
    public static final int MOUSELISTENER=25;
    public static final int KEYSTROKE=26;
    public static final int LEFTCLICK=27;
    public static final int LEFTDROP=28;
    public static final int LEFTDRAG=29;
    public static final int RIGHTCLICK=30;
    public static final int RIGHTDROP=31;
    public static final int ARROW=32;
    public static final int APPLY=33;
    public static final int PG=34;
    public static final int PD=35;
    public static final int PT=36;
    public static final int PLUS=37;
    public static final int MOINS=38;
    public static final int MULT=39;
    public static final int DIV=40;
    public static final int MOD=41;
    public static final int GAMEOVER=42;
    public static final int PAUSE=43;
    public static final int NEWGAME=44;
    public static final int SAVEGAME=45;
    public static final int INT=46;
    public static final int FLOAT=47;
    public static final int STRING=48;
    public static final int WS=49;
    public static final int PIPE=50;
    public static final int WITH=51;

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
    // LowgTree.g:8:1: game returns [Codes c] : ^( GAME e= entities camera refreshLoop eventManager rs= resourcesSets ) ;
    public final Codes game() throws RecognitionException {
        Codes c = null;

        Code e = null;

        Code rs = null;


         c = null;
        try {
            // LowgTree.g:8:40: ( ^( GAME e= entities camera refreshLoop eventManager rs= resourcesSets ) )
            // LowgTree.g:8:42: ^( GAME e= entities camera refreshLoop eventManager rs= resourcesSets )
            {
            match(input,GAME,FOLLOW_GAME_in_game46); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_entities_in_game52);
            e=entities();

            state._fsp--;

            pushFollow(FOLLOW_camera_in_game54);
            camera();

            state._fsp--;

            pushFollow(FOLLOW_refreshLoop_in_game56);
            refreshLoop();

            state._fsp--;

            pushFollow(FOLLOW_eventManager_in_game58);
            eventManager();

            state._fsp--;

            pushFollow(FOLLOW_resourcesSets_in_game64);
            rs=resourcesSets();

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


    // $ANTLR start "entities"
    // LowgTree.g:14:1: entities returns [Code c] : ^( OBJS (ob= object )+ ) ;
    public final Code entities() throws RecognitionException {
        Code c = null;

        ClassJS ob = null;


        c = new ConcreteCode();
        try {
            // LowgTree.g:14:57: ( ^( OBJS (ob= object )+ ) )
            // LowgTree.g:14:59: ^( OBJS (ob= object )+ )
            {
            match(input,OBJS,FOLLOW_OBJS_in_entities93); 

            match(input, Token.DOWN, null); 
            // LowgTree.g:14:66: (ob= object )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==OBJ) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // LowgTree.g:14:67: ob= object
            	    {
            	    pushFollow(FOLLOW_object_in_entities100);
            	    ob=object();

            	    state._fsp--;


            	    			c.append(ob);	
            	    		

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
    // $ANTLR end "entities"


    // $ANTLR start "object"
    // LowgTree.g:22:1: object returns [ClassJS cjs] : ^( OBJ i= ID pms= paramlist ) ;
    public final ClassJS object() throws RecognitionException {
        ClassJS cjs = null;

        CommonTree i=null;
        List<AffJS> pms = null;


        cjs = null; 
        try {
            // LowgTree.g:22:49: ( ^( OBJ i= ID pms= paramlist ) )
            // LowgTree.g:22:51: ^( OBJ i= ID pms= paramlist )
            {
            match(input,OBJ,FOLLOW_OBJ_in_object128); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,ID,FOLLOW_ID_in_object134); 
            pushFollow(FOLLOW_paramlist_in_object140);
            pms=paramlist();

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


    // $ANTLR start "paramlist"
    // LowgTree.g:31:1: paramlist returns [List<AffJS> l] : ^( PARAMLIST (p= param )+ ) ;
    public final List<AffJS> paramlist() throws RecognitionException {
        List<AffJS> l = null;

        AffJS p = null;


        l = new ArrayList<AffJS>();
        try {
            // LowgTree.g:31:69: ( ^( PARAMLIST (p= param )+ ) )
            // LowgTree.g:31:71: ^( PARAMLIST (p= param )+ )
            {
            match(input,PARAMLIST,FOLLOW_PARAMLIST_in_paramlist165); 

            match(input, Token.DOWN, null); 
            // LowgTree.g:31:83: (p= param )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==PARAM) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // LowgTree.g:31:84: p= param
            	    {
            	    pushFollow(FOLLOW_param_in_paramlist172);
            	    p=param();

            	    state._fsp--;


            	    			l.add(p);	 
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
        return l;
    }
    // $ANTLR end "paramlist"


    // $ANTLR start "param"
    // LowgTree.g:39:1: param returns [AffJS aff] : ^( PARAM id= ID v= initValue ) ;
    public final AffJS param() throws RecognitionException {
        AffJS aff = null;

        CommonTree id=null;
        String v = null;


        aff = null;
        try {
            // LowgTree.g:39:45: ( ^( PARAM id= ID v= initValue ) )
            // LowgTree.g:39:46: ^( PARAM id= ID v= initValue )
            {
            match(input,PARAM,FOLLOW_PARAM_in_param200); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_param206); 
            pushFollow(FOLLOW_initValue_in_param212);
            v=initValue();

            state._fsp--;

            aff = new AffJS(id.getText() , v);

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
    // $ANTLR end "param"


    // $ANTLR start "camera"
    // LowgTree.g:48:1: camera : CAMERA ID AD position AF ;
    public final void camera() throws RecognitionException {
        try {
            // LowgTree.g:48:8: ( CAMERA ID AD position AF )
            // LowgTree.g:48:10: CAMERA ID AD position AF
            {
            match(input,CAMERA,FOLLOW_CAMERA_in_camera237); 
            match(input,ID,FOLLOW_ID_in_camera239); 
            match(input,AD,FOLLOW_AD_in_camera241); 
            pushFollow(FOLLOW_position_in_camera243);
            position();

            state._fsp--;

            match(input,AF,FOLLOW_AF_in_camera245); 

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
    // $ANTLR end "camera"


    // $ANTLR start "position"
    // LowgTree.g:50:1: position : POSITION DP triplet PTVIRG ANGLE DP triplet PTVIRG ;
    public final void position() throws RecognitionException {
        try {
            // LowgTree.g:50:10: ( POSITION DP triplet PTVIRG ANGLE DP triplet PTVIRG )
            // LowgTree.g:50:12: POSITION DP triplet PTVIRG ANGLE DP triplet PTVIRG
            {
            match(input,POSITION,FOLLOW_POSITION_in_position253); 
            match(input,DP,FOLLOW_DP_in_position255); 
            pushFollow(FOLLOW_triplet_in_position257);
            triplet();

            state._fsp--;

            match(input,PTVIRG,FOLLOW_PTVIRG_in_position259); 
            match(input,ANGLE,FOLLOW_ANGLE_in_position261); 
            match(input,DP,FOLLOW_DP_in_position263); 
            pushFollow(FOLLOW_triplet_in_position265);
            triplet();

            state._fsp--;

            match(input,PTVIRG,FOLLOW_PTVIRG_in_position267); 

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
    // $ANTLR end "position"


    // $ANTLR start "triplet"
    // LowgTree.g:52:1: triplet : initNumValue initNumValue initNumValue ;
    public final void triplet() throws RecognitionException {
        try {
            // LowgTree.g:52:9: ( initNumValue initNumValue initNumValue )
            // LowgTree.g:52:11: initNumValue initNumValue initNumValue
            {
            pushFollow(FOLLOW_initNumValue_in_triplet276);
            initNumValue();

            state._fsp--;

            pushFollow(FOLLOW_initNumValue_in_triplet278);
            initNumValue();

            state._fsp--;

            pushFollow(FOLLOW_initNumValue_in_triplet280);
            initNumValue();

            state._fsp--;


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
    // $ANTLR end "triplet"


    // $ANTLR start "refreshLoop"
    // LowgTree.g:61:1: refreshLoop : KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF ;
    public final void refreshLoop() throws RecognitionException {
        try {
            // LowgTree.g:61:13: ( KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF )
            // LowgTree.g:61:15: KEYLISTENER AD keyboardCommands AF MOUSELISTENER AD mouseCommands AF
            {
            match(input,KEYLISTENER,FOLLOW_KEYLISTENER_in_refreshLoop299); 
            match(input,AD,FOLLOW_AD_in_refreshLoop301); 
            pushFollow(FOLLOW_keyboardCommands_in_refreshLoop303);
            keyboardCommands();

            state._fsp--;

            match(input,AF,FOLLOW_AF_in_refreshLoop305); 
            match(input,MOUSELISTENER,FOLLOW_MOUSELISTENER_in_refreshLoop307); 
            match(input,AD,FOLLOW_AD_in_refreshLoop309); 
            pushFollow(FOLLOW_mouseCommands_in_refreshLoop311);
            mouseCommands();

            state._fsp--;

            match(input,AF,FOLLOW_AF_in_refreshLoop313); 

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
    // LowgTree.g:63:1: keyboardCommands : ( KEYSTROKE DP signalSets ) ( VIRG KEYSTROKE DP signalSets )* ;
    public final void keyboardCommands() throws RecognitionException {
        try {
            // LowgTree.g:63:18: ( ( KEYSTROKE DP signalSets ) ( VIRG KEYSTROKE DP signalSets )* )
            // LowgTree.g:63:20: ( KEYSTROKE DP signalSets ) ( VIRG KEYSTROKE DP signalSets )*
            {
            // LowgTree.g:63:20: ( KEYSTROKE DP signalSets )
            // LowgTree.g:63:21: KEYSTROKE DP signalSets
            {
            match(input,KEYSTROKE,FOLLOW_KEYSTROKE_in_keyboardCommands322); 
            match(input,DP,FOLLOW_DP_in_keyboardCommands324); 
            pushFollow(FOLLOW_signalSets_in_keyboardCommands326);
            signalSets();

            state._fsp--;


            }

            // LowgTree.g:63:45: ( VIRG KEYSTROKE DP signalSets )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VIRG) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // LowgTree.g:63:46: VIRG KEYSTROKE DP signalSets
            	    {
            	    match(input,VIRG,FOLLOW_VIRG_in_keyboardCommands329); 
            	    match(input,KEYSTROKE,FOLLOW_KEYSTROKE_in_keyboardCommands331); 
            	    match(input,DP,FOLLOW_DP_in_keyboardCommands333); 
            	    pushFollow(FOLLOW_signalSets_in_keyboardCommands335);
            	    signalSets();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // LowgTree.g:66:1: mouseCommands : ( typeofclick DP signalSets )* ;
    public final void mouseCommands() throws RecognitionException {
        try {
            // LowgTree.g:66:15: ( ( typeofclick DP signalSets )* )
            // LowgTree.g:66:17: ( typeofclick DP signalSets )*
            {
            // LowgTree.g:66:17: ( typeofclick DP signalSets )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=LEFTCLICK && LA4_0<=RIGHTDROP)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LowgTree.g:66:18: typeofclick DP signalSets
            	    {
            	    pushFollow(FOLLOW_typeofclick_in_mouseCommands348);
            	    typeofclick();

            	    state._fsp--;

            	    match(input,DP,FOLLOW_DP_in_mouseCommands350); 
            	    pushFollow(FOLLOW_signalSets_in_mouseCommands352);
            	    signalSets();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // LowgTree.g:68:1: signalSets : ( signal )+ ;
    public final void signalSets() throws RecognitionException {
        try {
            // LowgTree.g:68:12: ( ( signal )+ )
            // LowgTree.g:68:14: ( signal )+
            {
            // LowgTree.g:68:14: ( signal )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // LowgTree.g:68:14: signal
            	    {
            	    pushFollow(FOLLOW_signal_in_signalSets362);
            	    signal();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // LowgTree.g:70:1: signal : ID ;
    public final void signal() throws RecognitionException {
        try {
            // LowgTree.g:70:8: ( ID )
            // LowgTree.g:70:10: ID
            {
            match(input,ID,FOLLOW_ID_in_signal371); 

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
    // LowgTree.g:72:1: typeofclick : ( LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP );
    public final void typeofclick() throws RecognitionException {
        try {
            // LowgTree.g:72:13: ( LEFTCLICK | LEFTDROP | LEFTDRAG | RIGHTCLICK | RIGHTDROP )
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


    // $ANTLR start "eventManager"
    // LowgTree.g:79:1: eventManager : signal ( VIRG signal )* ARROW instructions ( signal ( VIRG signal )* ARROW instructions )* ;
    public final void eventManager() throws RecognitionException {
        try {
            // LowgTree.g:79:14: ( signal ( VIRG signal )* ARROW instructions ( signal ( VIRG signal )* ARROW instructions )* )
            // LowgTree.g:79:16: signal ( VIRG signal )* ARROW instructions ( signal ( VIRG signal )* ARROW instructions )*
            {
            pushFollow(FOLLOW_signal_in_eventManager411);
            signal();

            state._fsp--;

            // LowgTree.g:79:23: ( VIRG signal )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==VIRG) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // LowgTree.g:79:24: VIRG signal
            	    {
            	    match(input,VIRG,FOLLOW_VIRG_in_eventManager414); 
            	    pushFollow(FOLLOW_signal_in_eventManager416);
            	    signal();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,ARROW,FOLLOW_ARROW_in_eventManager420); 
            pushFollow(FOLLOW_instructions_in_eventManager422);
            instructions();

            state._fsp--;

            // LowgTree.g:79:58: ( signal ( VIRG signal )* ARROW instructions )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // LowgTree.g:79:60: signal ( VIRG signal )* ARROW instructions
            	    {
            	    pushFollow(FOLLOW_signal_in_eventManager427);
            	    signal();

            	    state._fsp--;

            	    // LowgTree.g:79:66: ( VIRG signal )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==VIRG) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // LowgTree.g:79:67: VIRG signal
            	    	    {
            	    	    match(input,VIRG,FOLLOW_VIRG_in_eventManager429); 
            	    	    pushFollow(FOLLOW_signal_in_eventManager431);
            	    	    signal();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    match(input,ARROW,FOLLOW_ARROW_in_eventManager435); 
            	    pushFollow(FOLLOW_instructions_in_eventManager437);
            	    instructions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "eventManager"


    // $ANTLR start "instructions"
    // LowgTree.g:81:1: instructions : ( resourcePath APPLY PG applyExpression PD PTVIRG | conceptInstruction PTVIRG );
    public final void instructions() throws RecognitionException {
        try {
            // LowgTree.g:81:14: ( resourcePath APPLY PG applyExpression PD PTVIRG | conceptInstruction PTVIRG )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=GAMEOVER && LA9_0<=SAVEGAME)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // LowgTree.g:81:17: resourcePath APPLY PG applyExpression PD PTVIRG
                    {
                    pushFollow(FOLLOW_resourcePath_in_instructions452);
                    resourcePath();

                    state._fsp--;

                    match(input,APPLY,FOLLOW_APPLY_in_instructions454); 
                    match(input,PG,FOLLOW_PG_in_instructions456); 
                    pushFollow(FOLLOW_applyExpression_in_instructions458);
                    applyExpression();

                    state._fsp--;

                    match(input,PD,FOLLOW_PD_in_instructions460); 
                    match(input,PTVIRG,FOLLOW_PTVIRG_in_instructions462); 

                    }
                    break;
                case 2 :
                    // LowgTree.g:81:67: conceptInstruction PTVIRG
                    {
                    pushFollow(FOLLOW_conceptInstruction_in_instructions466);
                    conceptInstruction();

                    state._fsp--;

                    match(input,PTVIRG,FOLLOW_PTVIRG_in_instructions468); 

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
        return ;
    }
    // $ANTLR end "instructions"


    // $ANTLR start "resourcePath"
    // LowgTree.g:83:1: resourcePath : ( ID | ID PT ID ) ;
    public final void resourcePath() throws RecognitionException {
        try {
            // LowgTree.g:83:14: ( ( ID | ID PT ID ) )
            // LowgTree.g:83:16: ( ID | ID PT ID )
            {
            // LowgTree.g:83:16: ( ID | ID PT ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==PT) ) {
                    alt10=2;
                }
                else if ( (LA10_1==APPLY) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // LowgTree.g:83:17: ID
                    {
                    match(input,ID,FOLLOW_ID_in_resourcePath477); 

                    }
                    break;
                case 2 :
                    // LowgTree.g:83:22: ID PT ID
                    {
                    match(input,ID,FOLLOW_ID_in_resourcePath481); 
                    match(input,PT,FOLLOW_PT_in_resourcePath483); 
                    match(input,ID,FOLLOW_ID_in_resourcePath485); 

                    }
                    break;

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
    // $ANTLR end "resourcePath"


    // $ANTLR start "applyExpression"
    // LowgTree.g:85:1: applyExpression : arithmeticOperator initNumValue ;
    public final void applyExpression() throws RecognitionException {
        try {
            // LowgTree.g:85:17: ( arithmeticOperator initNumValue )
            // LowgTree.g:85:19: arithmeticOperator initNumValue
            {
            pushFollow(FOLLOW_arithmeticOperator_in_applyExpression494);
            arithmeticOperator();

            state._fsp--;

            pushFollow(FOLLOW_initNumValue_in_applyExpression496);
            initNumValue();

            state._fsp--;


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
    // $ANTLR end "applyExpression"


    // $ANTLR start "arithmeticOperator"
    // LowgTree.g:87:1: arithmeticOperator : ( PLUS | MOINS | MULT | DIV | MOD );
    public final void arithmeticOperator() throws RecognitionException {
        try {
            // LowgTree.g:87:20: ( PLUS | MOINS | MULT | DIV | MOD )
            // LowgTree.g:
            {
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MOD) ) {
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
    // $ANTLR end "arithmeticOperator"


    // $ANTLR start "conceptInstruction"
    // LowgTree.g:89:1: conceptInstruction : ( GAMEOVER | PAUSE | NEWGAME | SAVEGAME );
    public final void conceptInstruction() throws RecognitionException {
        try {
            // LowgTree.g:89:20: ( GAMEOVER | PAUSE | NEWGAME | SAVEGAME )
            // LowgTree.g:
            {
            if ( (input.LA(1)>=GAMEOVER && input.LA(1)<=SAVEGAME) ) {
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
    // $ANTLR end "conceptInstruction"


    // $ANTLR start "resourcesSets"
    // LowgTree.g:97:1: resourcesSets returns [Code c] : ^( RESOURCES (r= resource )* ) ;
    public final Code resourcesSets() throws RecognitionException {
        Code c = null;

        Inst r = null;


         c =new ConcreteCode();
        try {
            // LowgTree.g:97:62: ( ^( RESOURCES (r= resource )* ) )
            // LowgTree.g:97:64: ^( RESOURCES (r= resource )* )
            {
            match(input,RESOURCES,FOLLOW_RESOURCES_in_resourcesSets563); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // LowgTree.g:99:4: (r= resource )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RESOURCE) ) {
                        alt11=1;
                    }


                    switch (alt11) {
                	case 1 :
                	    // LowgTree.g:99:5: r= resource
                	    {
                	    pushFollow(FOLLOW_resource_in_resourcesSets576);
                	    r=resource();

                	    state._fsp--;

                	     
                	    				c.append(r);
                	    			

                	    }
                	    break;

                	default :
                	    break loop11;
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
        return c;
    }
    // $ANTLR end "resourcesSets"


    // $ANTLR start "resource"
    // LowgTree.g:104:1: resource returns [Inst ijs] : ^( RESOURCE n= ID i= initNumValue ) ;
    public final Inst resource() throws RecognitionException {
        Inst ijs = null;

        CommonTree n=null;
        String i = null;


        ijs = null; 
        try {
            // LowgTree.g:106:3: ( ^( RESOURCE n= ID i= initNumValue ) )
            // LowgTree.g:106:4: ^( RESOURCE n= ID i= initNumValue )
            {
            match(input,RESOURCE,FOLLOW_RESOURCE_in_resource601); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,ID,FOLLOW_ID_in_resource611); 
            pushFollow(FOLLOW_initNumValue_in_resource621);
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
    // LowgTree.g:118:1: initNumValue returns [String s] : (n= INT | f= FLOAT );
    public final String initNumValue() throws RecognitionException {
        String s = null;

        CommonTree n=null;
        CommonTree f=null;

        s = null;
        try {
            // LowgTree.g:119:20: (n= INT | f= FLOAT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==FLOAT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // LowgTree.g:119:22: n= INT
                    {
                    n=(CommonTree)match(input,INT,FOLLOW_INT_in_initNumValue653); 

                    		s = new String(n.getText());
                    	  

                    }
                    break;
                case 2 :
                    // LowgTree.g:124:12: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_initNumValue677); 

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
    // LowgTree.g:132:1: initValue returns [String s] : (inv= initNumValue | st= STRING );
    public final String initValue() throws RecognitionException {
        String s = null;

        CommonTree st=null;
        String inv = null;


        s = null;
        try {
            // LowgTree.g:133:20: (inv= initNumValue | st= STRING )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=INT && LA13_0<=FLOAT)) ) {
                alt13=1;
            }
            else if ( (LA13_0==STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // LowgTree.g:133:22: inv= initNumValue
                    {
                    pushFollow(FOLLOW_initNumValue_in_initValue703);
                    inv=initNumValue();

                    state._fsp--;


                    		s = inv;
                    	  

                    }
                    break;
                case 2 :
                    // LowgTree.g:138:12: st= STRING
                    {
                    st=(CommonTree)match(input,STRING,FOLLOW_STRING_in_initValue727); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_GAME_in_game46 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entities_in_game52 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_camera_in_game54 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_refreshLoop_in_game56 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_eventManager_in_game58 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_resourcesSets_in_game64 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OBJS_in_entities93 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_entities100 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_OBJ_in_object128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_object134 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_paramlist_in_object140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMLIST_in_paramlist165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_param_in_paramlist172 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_PARAM_in_param200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_param206 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_initValue_in_param212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_in_camera237 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_camera239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_AD_in_camera241 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_position_in_camera243 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_AF_in_camera245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITION_in_position253 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_position255 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_triplet_in_position257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_position259 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ANGLE_in_position261 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_position263 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_triplet_in_position265 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_position267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initNumValue_in_triplet276 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_initNumValue_in_triplet278 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_initNumValue_in_triplet280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYLISTENER_in_refreshLoop299 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_AD_in_refreshLoop301 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_keyboardCommands_in_refreshLoop303 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_AF_in_refreshLoop305 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_MOUSELISTENER_in_refreshLoop307 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_AD_in_refreshLoop309 = new BitSet(new long[]{0x00000000F8100000L});
    public static final BitSet FOLLOW_mouseCommands_in_refreshLoop311 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_AF_in_refreshLoop313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYSTROKE_in_keyboardCommands322 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_keyboardCommands324 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signalSets_in_keyboardCommands326 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_VIRG_in_keyboardCommands329 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_KEYSTROKE_in_keyboardCommands331 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_keyboardCommands333 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signalSets_in_keyboardCommands335 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_typeofclick_in_mouseCommands348 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DP_in_mouseCommands350 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signalSets_in_mouseCommands352 = new BitSet(new long[]{0x00000000F8000002L});
    public static final BitSet FOLLOW_signal_in_signalSets362 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ID_in_signal371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeofclick0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signal_in_eventManager411 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_VIRG_in_eventManager414 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signal_in_eventManager416 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_ARROW_in_eventManager420 = new BitSet(new long[]{0x00003C0000008000L});
    public static final BitSet FOLLOW_instructions_in_eventManager422 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_signal_in_eventManager427 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_VIRG_in_eventManager429 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_signal_in_eventManager431 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_ARROW_in_eventManager435 = new BitSet(new long[]{0x00003C0000008000L});
    public static final BitSet FOLLOW_instructions_in_eventManager437 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_resourcePath_in_instructions452 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_APPLY_in_instructions454 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_PG_in_instructions456 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_applyExpression_in_instructions458 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_PD_in_instructions460 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_instructions462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conceptInstruction_in_instructions466 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PTVIRG_in_instructions468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_resourcePath477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_resourcePath481 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_PT_in_resourcePath483 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_resourcePath485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticOperator_in_applyExpression494 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_initNumValue_in_applyExpression496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_arithmeticOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_conceptInstruction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESOURCES_in_resourcesSets563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resource_in_resourcesSets576 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_RESOURCE_in_resource601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_resource611 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_initNumValue_in_resource621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_initNumValue653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_initNumValue677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initNumValue_in_initValue703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_initValue727 = new BitSet(new long[]{0x0000000000000002L});

}