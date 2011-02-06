// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g 2011-02-06 20:28:34

    package grammars;
    import code.*;
    import symbols.*;
    import lib.*;
    import attributes.*;
    import java.util.Iterator;
    import java.util.Hashtable;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class hightTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "ACCESS_KW", "KEY_KW", "MOUSE_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "SCORE", "TYPE", "IDENT", "IS", "AND", "LIST_KW", "OF", "WITH", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "IN", "PLAYER", "ALLY", "ENEMY", "NEUTRAL", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "DIES_KW", "DURING", "UNTIL", "EQUIP", "NEXT", "PREVIOUS", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "MOUSE", "FOR", "KEY", "WUP", "WDOWN", "LEFT", "RIGHT", "CLICK_LEFT", "CLICK_CENTER", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "JUMP", "MOVE", "FORWARD", "BACKWARD", "TURN", "ACCELERATE", "BRAKE", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "BY", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "X", "Y", "Z", "VALUE", "ALL", "NUM", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "COUNTER", "TIME", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "WS", "'true'", "'false'"
    };
    public static final int EOF=-1;
    public static final int T__195=195;
    public static final int T__196=196;
    public static final int GAME_KW=4;
    public static final int GAME_ATTRIBUT_KW=5;
    public static final int INIT_IS_KW=6;
    public static final int INIT_HAS_KW=7;
    public static final int DEC=8;
    public static final int MEDIA_KW=9;
    public static final int CAMERA_KW=10;
    public static final int INTERACTION_KW=11;
    public static final int GAME_SCORE_KW=12;
    public static final int SCORE_KW=13;
    public static final int VALUE_KW=14;
    public static final int IN_KW=15;
    public static final int ALLOCATION_KW=16;
    public static final int COORDINATE_KW=17;
    public static final int CONSEQUENCES_KW=18;
    public static final int AGGREGATION_KW=19;
    public static final int VAR_I_KW=20;
    public static final int VAR_A_KW=21;
    public static final int BECOMES_VAR_KW=22;
    public static final int BECOMES_ID_KW=23;
    public static final int CONDITION_KW=24;
    public static final int ACCESS_KW=25;
    public static final int KEY_KW=26;
    public static final int MOUSE_KW=27;
    public static final int FIN=28;
    public static final int GAME=29;
    public static final int HAS=30;
    public static final int VIRG=31;
    public static final int GRAVITY_KW=32;
    public static final int AT=33;
    public static final int FLOAT=34;
    public static final int SCORE=35;
    public static final int TYPE=36;
    public static final int IDENT=37;
    public static final int IS=38;
    public static final int AND=39;
    public static final int LIST_KW=40;
    public static final int OF=41;
    public static final int WITH=42;
    public static final int CAMERA=43;
    public static final int PERSON=44;
    public static final int FREE=45;
    public static final int MEDIA=46;
    public static final int LOOP=47;
    public static final int ONCE=48;
    public static final int IN=49;
    public static final int PLAYER=50;
    public static final int ALLY=51;
    public static final int ENEMY=52;
    public static final int NEUTRAL=53;
    public static final int DUPLICABLE=54;
    public static final int FIRST=55;
    public static final int THIRD=56;
    public static final int DEFINITION_KW=57;
    public static final int MEANS=58;
    public static final int VICTORY_KW=59;
    public static final int DEFEAT_KW=60;
    public static final int ENDS_KW=61;
    public static final int STARTS_KW=62;
    public static final int PAUSE_KW=63;
    public static final int MUTE_KW=64;
    public static final int ON=65;
    public static final int OFF=66;
    public static final int PLAY_KW=67;
    public static final int STOP_KW=68;
    public static final int BLOCK_KW=69;
    public static final int EFFACE_KW=70;
    public static final int GENERATE_KW=71;
    public static final int WAIT_KW=72;
    public static final int THEN=73;
    public static final int ENDWAIT=74;
    public static final int SAVE_KW=75;
    public static final int DIES_KW=76;
    public static final int DURING=77;
    public static final int UNTIL=78;
    public static final int EQUIP=79;
    public static final int NEXT=80;
    public static final int PREVIOUS=81;
    public static final int TRANSLATION=82;
    public static final int ROTATION=83;
    public static final int SCALE=84;
    public static final int COMMAND_KW=85;
    public static final int MOUSE=86;
    public static final int FOR=87;
    public static final int KEY=88;
    public static final int WUP=89;
    public static final int WDOWN=90;
    public static final int LEFT=91;
    public static final int RIGHT=92;
    public static final int CLICK_LEFT=93;
    public static final int CLICK_CENTER=94;
    public static final int CLICK_RIGHT=95;
    public static final int SCROLL_UP=96;
    public static final int SCROLL_DOWN=97;
    public static final int LETTER=98;
    public static final int SPACE=99;
    public static final int ESCAPE=100;
    public static final int ENTER=101;
    public static final int JUMP=102;
    public static final int MOVE=103;
    public static final int FORWARD=104;
    public static final int BACKWARD=105;
    public static final int TURN=106;
    public static final int ACCELERATE=107;
    public static final int BRAKE=108;
    public static final int ACTIVATE_KW=109;
    public static final int DISABLE_KW=110;
    public static final int COMMANDS=111;
    public static final int KEYBOARD=112;
    public static final int RULE_KW=113;
    public static final int MOVES_KW=114;
    public static final int BECOMES=115;
    public static final int TOUCHES_KW=116;
    public static final int KILLS_KW=117;
    public static final int OTHER=118;
    public static final int KILLED_KW=119;
    public static final int TOUCHED_KW=120;
    public static final int BY=121;
    public static final int IF_KW=122;
    public static final int ELSE=123;
    public static final int ENDIF=124;
    public static final int NOT=125;
    public static final int OR=126;
    public static final int COMP=127;
    public static final int EQUALS=128;
    public static final int INF=129;
    public static final int SUP=130;
    public static final int INFEG=131;
    public static final int SUPED=132;
    public static final int DIFF=133;
    public static final int PG=134;
    public static final int PD=135;
    public static final int DEAD_KW=136;
    public static final int ALIVE_KW=137;
    public static final int EFFACED_KW=138;
    public static final int GENERATED_KW=139;
    public static final int TOUCHING_KW=140;
    public static final int MOVING_KW=141;
    public static final int WAITING_KW=142;
    public static final int FINISHED_KW=143;
    public static final int STARTED_KW=144;
    public static final int PAUSED_KW=145;
    public static final int MUTED_KW=146;
    public static final int PLAYED_KW=147;
    public static final int STOPPED_KW=148;
    public static final int ASSIGN_KW=149;
    public static final int ADD_KW=150;
    public static final int SUB_KW=151;
    public static final int INVERT_KW=152;
    public static final int IA_KW=153;
    public static final int RANDOM_KW=154;
    public static final int BETWEEN=155;
    public static final int PLUS=156;
    public static final int MINUS=157;
    public static final int MUL=158;
    public static final int DIV=159;
    public static final int MOD=160;
    public static final int POW=161;
    public static final int X=162;
    public static final int Y=163;
    public static final int Z=164;
    public static final int VALUE=165;
    public static final int ALL=166;
    public static final int NUM=167;
    public static final int POSITION=168;
    public static final int ORIENTATION=169;
    public static final int SIZE=170;
    public static final int MIN=171;
    public static final int SEC=172;
    public static final int MS=173;
    public static final int FRAME=174;
    public static final int COUNTER=175;
    public static final int TIME=176;
    public static final int BOOST_INTERVAL=177;
    public static final int SHOOT_INTERVAL=178;
    public static final int RELOAD_TIME=179;
    public static final int INVENTORY=180;
    public static final int EQUIPED_OBJECT=181;
    public static final int ENTRANCES=182;
    public static final int EXITS=183;
    public static final int DAMAGE_ZONE=184;
    public static final int COLLECTORS=185;
    public static final int TYPES_COLLECTORS=186;
    public static final int GENERATORS=187;
    public static final int TYPE_GENERATORS=188;
    public static final int BREAKERS=189;
    public static final int TYPES_BREAKERS=190;
    public static final int TELEPORTABLES=191;
    public static final int TYPES_TELEPORTABLES=192;
    public static final int COMMENT=193;
    public static final int WS=194;

    // delegates
    // delegators


        public hightTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public hightTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return hightTree.tokenNames; }
    public String getGrammarFileName() { return "/home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g"; }


        private int INT_PLAYER=1, INT_ALLY=2, INT_ENEMY=3, INT_NEUTRAL=4, INT_DUPLICABLE=10;
        private Hashtable<String, String> aggreg = new Hashtable<String, String>();



    // $ANTLR start "game"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:27:1: game[SymbolTable st] returns [Code c] : ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) ;
    public final Code game(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code gd = null;

        Code in = null;

        Code def = null;

        Code com = null;

        Code reg = null;

        Code ia = null;


        c = new Code();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:28:27: ( ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:29:5: ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* )
            {
            match(input,GAME_KW,FOLLOW_GAME_KW_in_game70); 

            match(input, Token.DOWN, null); 
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:29:17: (gd= gameData[st] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME_ATTRIBUT_KW) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:29:17: gd= gameData[st]
                    {
                    pushFollow(FOLLOW_gameData_in_game74);
                    gd=gameData(st);

                    state._fsp--;


                    }
                    break;

            }

            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:29:32: ( newType[st] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:29:32: newType[st]
            	    {
            	    pushFollow(FOLLOW_newType_in_game78);
            	    newType(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_initialization_in_game88);
            in=initialization(st);

            state._fsp--;


            	st.print();
            	System.out.println(in.getCode());
                
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:38:2: (def= definition[st] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DEFINITION_KW) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:38:3: def= definition[st]
            	    {
            	    pushFollow(FOLLOW_definition_in_game108);
            	    def=definition(st);

            	    state._fsp--;


            	    	System.out.println(def.getCode()+"\n");
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:44:9: (com= commande[st] )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMAND_KW) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:44:9: com= commande[st]
            	    {
            	    pushFollow(FOLLOW_commande_in_game129);
            	    com=commande(st);

            	    state._fsp--;


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

            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:44:27: (reg= reglesJeu[st] )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_KW) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:44:27: reg= reglesJeu[st]
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game135);
            	    reg=reglesJeu(st);

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

            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:44:45: (ia= iaBasique[st] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IA_KW) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:44:45: ia= iaBasique[st]
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game141);
            	    ia=iaBasique(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
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
    // $ANTLR end "game"


    // $ANTLR start "gameData"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:51:1: gameData[SymbolTable st] returns [Code c] : ^( GAME_ATTRIBUT_KW attributGame_list[st] ) ;
    public final Code gameData(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:51:43: ( ^( GAME_ATTRIBUT_KW attributGame_list[st] ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:52:2: ^( GAME_ATTRIBUT_KW attributGame_list[st] )
            {
            match(input,GAME_ATTRIBUT_KW,FOLLOW_GAME_ATTRIBUT_KW_in_gameData167); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_attributGame_list_in_gameData169);
            attributGame_list(st);

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
    // $ANTLR end "gameData"


    // $ANTLR start "attributGame_list"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:54:1: attributGame_list[SymbolTable st] returns [Code c] : ( attributGame[st] )+ ;
    public final Code attributGame_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:54:52: ( ( attributGame[st] )+ )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:55:2: ( attributGame[st] )+
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:55:2: ( attributGame[st] )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==SCORE_KW||LA7_0==GRAVITY_KW) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:55:2: attributGame[st]
            	    {
            	    pushFollow(FOLLOW_attributGame_in_attributGame_list186);
            	    attributGame(st);

            	    state._fsp--;


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
    // $ANTLR end "attributGame_list"


    // $ANTLR start "attributGame"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:57:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) );
    public final Code attributGame(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:57:47: ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==GRAVITY_KW) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOWN) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==FLOAT) ) {
                        int LA8_4 = input.LA(4);

                        if ( (LA8_4==UP) ) {
                            alt8=1;
                        }
                        else if ( (LA8_4==FLOAT) ) {
                            alt8=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==SCORE_KW) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:58:2: ^( GRAVITY_KW FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame204); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame206); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:59:3: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame212); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame214); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame216); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame218); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:60:3: ^( SCORE_KW FLOAT )
                    {
                    match(input,SCORE_KW,FOLLOW_SCORE_KW_in_attributGame224); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame226); 

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
        return c;
    }
    // $ANTLR end "attributGame"


    // $ANTLR start "newType"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:63:1: newType[SymbolTable st] : ^( TYPE i= IDENT ( subType[st,sub] )+ ) ;
    public final void newType(SymbolTable st) throws RecognitionException {
        CommonTree i=null;

        List<Model> sub = new ArrayList<Model>();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:64:50: ( ^( TYPE i= IDENT ( subType[st,sub] )+ ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:65:2: ^( TYPE i= IDENT ( subType[st,sub] )+ )
            {
            match(input,TYPE,FOLLOW_TYPE_in_newType247); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_newType251); 
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:65:17: ( subType[st,sub] )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDENT||LA9_0==CAMERA||LA9_0==MEDIA||(LA9_0>=COUNTER && LA9_0<=TIME)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:65:17: subType[st,sub]
            	    {
            	    pushFollow(FOLLOW_subType_in_newType253);
            	    subType(st, sub);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            match(input, Token.UP, null); 
               String id = i.getText();
            	    Symbol verif = st.get(id);
            	    if(verif != null) {
            		System.out.println("Type \""+id+"\" déjà déclaré.");
            		System.exit(-1);
            	    } else {
            		Model[] tab = (Model[])sub.toArray(new Model[0]);
            		Model t = new Model(id, tab);
            		st.add(id, t);
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
    // $ANTLR end "newType"


    // $ANTLR start "subType"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:79:1: subType[SymbolTable st, List<Model> sub] : (i= IDENT | t= typeObjet );
    public final void subType(SymbolTable st, List<Model> sub) throws RecognitionException {
        CommonTree i=null;
        Model t = null;


        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:79:43: (i= IDENT | t= typeObjet )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==CAMERA||LA10_0==MEDIA||(LA10_0>=COUNTER && LA10_0<=TIME)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:80:2: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_subType274); 
                       String id = i.getText();
                    	    Symbol verif = st.get(id);
                    	    if(verif == null) {
                    		System.out.println("Model \""+id+"\" non défini.");
                    		System.exit(-1);
                    	    } else if(!verif.getName().equals(id)) {
                    		System.out.println("Gros Gros bug !!!");
                    		System.exit(-1);
                    	    } else {
                    		sub.add((Model)verif);
                    	    }
                    	

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:93:4: t= typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_subType284);
                    t=typeObjet();

                    state._fsp--;

                    sub.add(t);

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
    // $ANTLR end "subType"


    // $ANTLR start "initialization"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:96:1: initialization[SymbolTable st] returns [Code c] : ( init[st] )+ ;
    public final Code initialization(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:96:49: ( ( init[st] )+ )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:97:5: ( init[st] )+
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:97:5: ( init[st] )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=INIT_IS_KW && LA11_0<=INIT_HAS_KW)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:97:5: init[st]
            	    {
            	    pushFollow(FOLLOW_init_in_initialization305);
            	    init(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            	Code modelCode = new Code();
            	Code entitiesCode = new Code();
            	Code entitiesFunCode = new Code();
            	List<Entity> lPlayer = new ArrayList<Entity>();
            	lPlayer.add(Genre.player);
            	List<List<Entity>> list = new ArrayList<List<Entity>>();
            	list.add(lPlayer);
            	list.add(Genre.allies);
            	list.add(Genre.enemies);
            	list.add(Genre.neutral);

            	Iterator<List<Entity>> genre = list.iterator();
            	while(genre.hasNext()) {
            	    Iterator<Entity> it = genre.next().iterator();
            	    while(it.hasNext()) {
            		Entity ent = it.next();
            		Model model = null;
            		if(ent.listModels().size() > 1) {

            		} else {
            		    model = ent.listModels().get(0);
            		}
            		modelCode.append(Code.genModel(model));
            		modelCode.append("\n");

            		entitiesFunCode.append(Code.genFuncEntity(ent));
            		entitiesFunCode.append("\n");

            		//entitiesCode.append(Code.genEntity(ent));
            		entitiesCode.append("\n");
            	    }
            	}

            	c = new Code("/*Models*/\n");
            	c.append(modelCode);
            	c.append("\n/*Entities*/\n");
            	c.append(entitiesFunCode);
            	c.append(entitiesCode);
            	c.append("\n");
                

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
    // $ANTLR end "initialization"


    // $ANTLR start "init"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:141:1: init[SymbolTable st] returns [Code c] : ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) );
    public final Code init(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Pair<Model, Integer> d = null;

        ArrayList<Symbol> ac = null;

        ArrayList<Pair<String,AttributeValue>> ao = null;


        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:141:39: ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==INIT_IS_KW) ) {
                alt12=1;
            }
            else if ( (LA12_0==INIT_HAS_KW) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:142:2: ^( INIT_IS_KW i= IDENT d= declarationObjet[st] )
                    {
                    match(input,INIT_IS_KW,FOLLOW_INIT_IS_KW_in_init333); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_init337); 
                    pushFollow(FOLLOW_declarationObjet_in_init341);
                    d=declarationObjet(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                       String id = i.getText();
                    	    Symbol verif = st.get(id);
                    	    if(verif != null) {
                    		System.out.println("Elément \""+id+"\" déjà déclaré.");
                    		System.exit(-1);
                    	    } else {
                    		int mode = d.getSecond();
                    		int duplicable = (mode/INT_DUPLICABLE);
                    		mode = mode - (duplicable*INT_DUPLICABLE);
                    	    
                    		Entity t = new Entity(id,d.getFirst());
                    		d.getFirst().toGenerate();

                                    if(duplicable==1){
                                        t.setDuplicable();
                                    }

                    		if(mode == INT_PLAYER)
                    		    Genre.player = t;
                    		else if(mode == INT_ENEMY)
                    		    Genre.enemies.add(t);
                    		else if(mode == INT_ALLY)
                    		    Genre.allies.add(t);
                    		else
                    		    Genre.neutral.add(t);

                    		st.add(id,t);
                    	    }
                    	

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:172:3: ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] )
                    {
                    match(input,INIT_HAS_KW,FOLLOW_INIT_HAS_KW_in_init351); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_init355);
                    ac=accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_affectationObjet_list_in_init360);
                    ao=affectationObjet_list(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	    Iterator<Symbol> it = ac.iterator();
                    	    while(it.hasNext()) {
                    		Symbol s = it.next();
                    		Iterator<Pair<String,AttributeValue>> ite = ao.iterator();
                    		while(ite.hasNext()) {
                    		    Pair<String,AttributeValue> p = ite.next();
                    		    String attributeValue = p.getFirst();
                                        if(p.getSecond().getType()==AttributeValue.Type.AGGR){
                                            aggreg.put(attributeValue,s.getName());
                                        }else{
                                            AttributeValue attr = s.getAttribute(attributeValue);
                                            if(attr != null && attr.getType() != p.getSecond().getType()) {
                                                System.out.println("Erreur : Type incompatible");
                                                System.exit(-1);
                                            }
                                            s.addAttribute(p.getFirst(),p.getSecond());
                                        }
                                    }
                    	    }
                    	

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
        return c;
    }
    // $ANTLR end "init"


    // $ANTLR start "declarationObjet"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:201:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC te= typeEntity[st] (em= entityMode )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );
    public final Pair<Model, Integer> declarationObjet(SymbolTable st) throws RecognitionException {
        Pair<Model, Integer> p = null;

        Model te = null;

        Integer em = null;


        em=null;
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:202:17: ( ^( DEC te= typeEntity[st] (em= entityMode )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:203:2: ^( DEC te= typeEntity[st] (em= entityMode )? )
                    {
                    match(input,DEC,FOLLOW_DEC_in_declarationObjet392); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet396);
                    te=typeEntity(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:203:26: (em= entityMode )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==INTERACTION_KW||LA13_0==PLAYER||LA13_0==DUPLICABLE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:203:27: em= entityMode
                            {
                            pushFollow(FOLLOW_entityMode_in_declarationObjet402);
                            em=entityMode();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    	    if(em == null)
                    		em=4;

                    	    p = new Pair<Model, Integer>(te,em);
                    	

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:210:3: ^( LIST_KW list_declaration[st] )
                    {
                    match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet413); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_declaration_in_declarationObjet415);
                    list_declaration(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:211:3: ^( CAMERA_KW PERSON view[st] )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet422); 

                    match(input, Token.DOWN, null); 
                    match(input,PERSON,FOLLOW_PERSON_in_declarationObjet424); 
                    pushFollow(FOLLOW_view_in_declarationObjet426);
                    view(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:212:3: ^( CAMERA_KW FREE )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet434); 

                    match(input, Token.DOWN, null); 
                    match(input,FREE,FOLLOW_FREE_in_declarationObjet436); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:213:3: ^( MEDIA_KW LOOP )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet442); 

                    match(input, Token.DOWN, null); 
                    match(input,LOOP,FOLLOW_LOOP_in_declarationObjet444); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:214:3: ^( MEDIA_KW ONCE )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet451); 

                    match(input, Token.DOWN, null); 
                    match(input,ONCE,FOLLOW_ONCE_in_declarationObjet453); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:215:3: ^( IN_KW IDENT )
                    {
                    match(input,IN_KW,FOLLOW_IN_KW_in_declarationObjet467); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declarationObjet469); 

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
        return p;
    }
    // $ANTLR end "declarationObjet"


    // $ANTLR start "list_declaration"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:218:1: list_declaration[SymbolTable st] returns [Code c] : ( ( operation[st] )? IDENT )+ ;
    public final Code list_declaration(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:218:51: ( ( ( operation[st] )? IDENT )+ )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:219:2: ( ( operation[st] )? IDENT )+
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:219:2: ( ( operation[st] )? IDENT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==GAME_SCORE_KW||LA16_0==VALUE_KW||LA16_0==VAR_I_KW||LA16_0==FLOAT||LA16_0==IDENT||LA16_0==RANDOM_KW||(LA16_0>=PLUS && LA16_0<=Z)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:219:3: ( operation[st] )? IDENT
            	    {
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:219:3: ( operation[st] )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==GAME_SCORE_KW||LA15_0==VALUE_KW||LA15_0==VAR_I_KW||LA15_0==FLOAT||LA15_0==RANDOM_KW||(LA15_0>=PLUS && LA15_0<=Z)) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:219:3: operation[st]
            	            {
            	            pushFollow(FOLLOW_operation_in_list_declaration501);
            	            operation(st);

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    match(input,IDENT,FOLLOW_IDENT_in_list_declaration505); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


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
    // $ANTLR end "list_declaration"


    // $ANTLR start "typeEntity"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:222:1: typeEntity[SymbolTable st] returns [Model t] : i= IDENT ;
    public final Model typeEntity(SymbolTable st) throws RecognitionException {
        Model t = null;

        CommonTree i=null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:222:46: (i= IDENT )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:223:2: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeEntity526); 
               String id = i.getText();
            	    Symbol verif = st.get(id);
            	    if(verif == null) {
            		System.out.println("Model \""+id+"\" non défini.");
            		System.exit(-1);
            	    } else if(!verif.getName().equals(id)) {
            		System.out.println("Gros Gros bug !!!");
            		System.exit(-1);
            	    } else {
            		t = (Model)verif;
            	    }
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "typeEntity"


    // $ANTLR start "entityMode"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:238:1: entityMode returns [Integer i] : ( PLAYER | ^( INTERACTION_KW in= interaction (d= dupli )? ) | d= dupli );
    public final Integer entityMode() throws RecognitionException {
        Integer i = null;

        Integer in = null;

        Integer d = null;


        d=null;
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:239:19: ( PLAYER | ^( INTERACTION_KW in= interaction (d= dupli )? ) | d= dupli )
            int alt18=3;
            switch ( input.LA(1) ) {
            case PLAYER:
                {
                alt18=1;
                }
                break;
            case INTERACTION_KW:
                {
                alt18=2;
                }
                break;
            case DUPLICABLE:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:240:2: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_entityMode551); 
                    i=INT_PLAYER;

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:242:4: ^( INTERACTION_KW in= interaction (d= dupli )? )
                    {
                    match(input,INTERACTION_KW,FOLLOW_INTERACTION_KW_in_entityMode560); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_interaction_in_entityMode564);
                    in=interaction();

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:242:37: (d= dupli )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==DUPLICABLE) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:242:37: d= dupli
                            {
                            pushFollow(FOLLOW_dupli_in_entityMode568);
                            d=dupli();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    if(d!=null){i=in+d;}else{i=in;}

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:243:4: d= dupli
                    {
                    pushFollow(FOLLOW_dupli_in_entityMode579);
                    d=dupli();

                    state._fsp--;

                    i=d;

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
        return i;
    }
    // $ANTLR end "entityMode"


    // $ANTLR start "interaction"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:246:1: interaction returns [Integer i] : ( ALLY | ENEMY | NEUTRAL );
    public final Integer interaction() throws RecognitionException {
        Integer i = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:246:32: ( ALLY | ENEMY | NEUTRAL )
            int alt19=3;
            switch ( input.LA(1) ) {
            case ALLY:
                {
                alt19=1;
                }
                break;
            case ENEMY:
                {
                alt19=2;
                }
                break;
            case NEUTRAL:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:247:2: ALLY
                    {
                    match(input,ALLY,FOLLOW_ALLY_in_interaction596); 
                    i=INT_ALLY;

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:249:4: ENEMY
                    {
                    match(input,ENEMY,FOLLOW_ENEMY_in_interaction604); 
                    i=INT_ENEMY;

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:251:4: NEUTRAL
                    {
                    match(input,NEUTRAL,FOLLOW_NEUTRAL_in_interaction612); 
                    i=INT_NEUTRAL;

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
        return i;
    }
    // $ANTLR end "interaction"


    // $ANTLR start "dupli"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:255:1: dupli returns [Integer i] : DUPLICABLE ;
    public final Integer dupli() throws RecognitionException {
        Integer i = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:255:26: ( DUPLICABLE )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:256:2: DUPLICABLE
            {
            match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli629); 
            i=INT_DUPLICABLE;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end "dupli"


    // $ANTLR start "view"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:260:1: view[SymbolTable st] returns [Code c] : ( FIRST | THIRD );
    public final Code view(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:260:39: ( FIRST | THIRD )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:
            {
            if ( (input.LA(1)>=FIRST && input.LA(1)<=THIRD) ) {
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
        return c;
    }
    // $ANTLR end "view"


    // $ANTLR start "affectationObjet_list"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:264:1: affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : (a= affectationObjet[st] )+ ;
    public final ArrayList<Pair<String,AttributeValue>> affectationObjet_list(SymbolTable st) throws RecognitionException {
        ArrayList<Pair<String,AttributeValue>> c = null;

        ArrayList<Pair<String,AttributeValue>> a = null;


        c = new ArrayList<Pair<String,AttributeValue>>();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:264:146: ( (a= affectationObjet[st] )+ )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:265:9: (a= affectationObjet[st] )+
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:265:9: (a= affectationObjet[st] )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ALLOCATION_KW) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:265:10: a= affectationObjet[st]
            	    {
            	    pushFollow(FOLLOW_affectationObjet_in_affectationObjet_list682);
            	    a=affectationObjet(st);

            	    state._fsp--;

            	    c.addAll(a);

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


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
    // $ANTLR end "affectationObjet_list"


    // $ANTLR start "affectationObjet"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:267:1: affectationObjet[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) );
    public final ArrayList<Pair<String,AttributeValue>> affectationObjet(SymbolTable st) throws RecognitionException {
        ArrayList<Pair<String,AttributeValue>> c = null;

        CommonTree i=null;
        AttributeValue t = null;

        Code tc = null;

        Coordonnees coo = null;

        String att = null;

        Code v = null;

        String u = null;


        c = new ArrayList<Pair<String,AttributeValue>>();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:267:142: ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) )
            int alt22=4;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ALLOCATION_KW) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case IDENT:
                        {
                        alt22=1;
                        }
                        break;
                    case POSITION:
                    case ORIENTATION:
                    case SIZE:
                        {
                        alt22=2;
                        }
                        break;
                    case INVENTORY:
                    case EQUIPED_OBJECT:
                    case ENTRANCES:
                    case EXITS:
                    case DAMAGE_ZONE:
                    case COLLECTORS:
                    case TYPES_COLLECTORS:
                    case GENERATORS:
                    case TYPE_GENERATORS:
                    case BREAKERS:
                    case TYPES_BREAKERS:
                    case TELEPORTABLES:
                    case TYPES_TELEPORTABLES:
                        {
                        alt22=3;
                        }
                        break;
                    case BOOST_INTERVAL:
                    case SHOOT_INTERVAL:
                    case RELOAD_TIME:
                        {
                        alt22=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:268:2: ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet707); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet711); 
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:268:28: (t= valAggregation[st] )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==AGGREGATION_KW||(LA21_0>=195 && LA21_0<=196)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:268:28: t= valAggregation[st]
                            {
                            pushFollow(FOLLOW_valAggregation_in_affectationObjet715);
                            t=valAggregation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    if(t==null){
                                AttributeValue av = new AttributeValue(new Code(i.getText()),AttributeValue.Type.AGGR);
                                c.add(new Pair<String,AttributeValue>(i.getText(),av));
                            }else{
                                c.add(new Pair<String,AttributeValue>(i.getText(),t));
                            }

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:275:4: ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet735); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_affectationObjet739);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_affectationObjet744);
                    coo=coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    String mode = tc.getCode();
                            if(mode.equals("position")){
                                    c.add(new Pair<String,AttributeValue>("posX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
                                    c.add(new Pair<String,AttributeValue>("posY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
                                    c.add(new Pair<String,AttributeValue>("posZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
                                }else if(mode.equals("angle")){
                                    c.add(new Pair<String,AttributeValue>("orX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
                                    c.add(new Pair<String,AttributeValue>("orY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
                                    c.add(new Pair<String,AttributeValue>("orZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
                                }else{
                                    c.add(new Pair<String,AttributeValue>("tX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
                                    c.add(new Pair<String,AttributeValue>("tY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
                                    c.add(new Pair<String,AttributeValue>("tZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
                                }
                            

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:291:4: ^( ALLOCATION_KW attributListeOuObjet[st] IDENT )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet763); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributListeOuObjet_in_affectationObjet765);
                    attributListeOuObjet(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_affectationObjet768); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:292:4: ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet776); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_affectationObjet780);
                    att=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_affectationObjet785);
                    v=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_affectationObjet790);
                    u=timeUnit(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c.add(new Pair<String,AttributeValue>(att,new AttributeValue(new Duration(v,u))));

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
        return c;
    }
    // $ANTLR end "affectationObjet"


    // $ANTLR start "valAggregation"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:297:1: valAggregation[SymbolTable st] returns [AttributeValue c] : ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' );
    public final AttributeValue valAggregation(SymbolTable st) throws RecognitionException {
        AttributeValue c = null;

        CommonTree i=null;
        Code o = null;

        String t = null;


        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:297:59: ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case AGGREGATION_KW:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==DOWN) ) {
                    int LA24_4 = input.LA(3);

                    if ( (LA24_4==IDENT) ) {
                        alt24=2;
                    }
                    else if ( (LA24_4==GAME_SCORE_KW||LA24_4==VALUE_KW||LA24_4==VAR_I_KW||LA24_4==FLOAT||LA24_4==RANDOM_KW||(LA24_4>=PLUS && LA24_4<=Z)) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case 195:
                {
                alt24=3;
                }
                break;
            case 196:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:298:2: ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation828); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_valAggregation832);
                    o=operation(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:298:36: (t= timeUnit[st] )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=MIN && LA23_0<=FRAME)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:298:36: t= timeUnit[st]
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation837);
                            t=timeUnit(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    if(t!=null){
                                c= new AttributeValue(new Duration(o,t));
                            }else{
                                    c=new AttributeValue(o, AttributeValue.Type.NUMBER);
                                }
                            

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:305:3: ^( AGGREGATION_KW i= IDENT )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation855); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_valAggregation859); 

                    match(input, Token.UP, null); 

                    	    String value = i.getText();
                    	    try {
                    		float tmp = Float.parseFloat(value);
                    		c = new AttributeValue(tmp);
                    	    } catch(NumberFormatException e) {
                    		c = new AttributeValue(value);
                    	    }
                    	

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:315:4: 'true'
                    {
                    match(input,195,FOLLOW_195_in_valAggregation875); 
                    c = new AttributeValue(true,"true");

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:316:4: 'false'
                    {
                    match(input,196,FOLLOW_196_in_valAggregation882); 
                    c = new AttributeValue(false,"false");

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
        return c;
    }
    // $ANTLR end "valAggregation"


    // $ANTLR start "definition"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:321:1: definition[SymbolTable st] returns [Code c] : ^( DEFINITION_KW i= IDENT cons= consequences[st] ) ;
    public final Code definition(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code cons = null;


         c = new Code();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:321:69: ( ^( DEFINITION_KW i= IDENT cons= consequences[st] ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:322:2: ^( DEFINITION_KW i= IDENT cons= consequences[st] )
            {
            match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition911); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definition915); 
            pushFollow(FOLLOW_consequences_in_definition919);
            cons=consequences(st);

            state._fsp--;


            match(input, Token.UP, null); 
            String ident = i.getText();
            	if(st.get(ident)!=null){System.out.println("l'ident "+ ident + " est deja defini");System.exit(-1);}
            		else{
            			Definition def = new Definition(ident,cons);			
            			c.append(Code.genFuncDef(def));
            			st.add(ident,def);
            			
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
    // $ANTLR end "definition"


    // $ANTLR start "consequences"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:334:1: consequences[SymbolTable st] returns [Code c] : ^( CONSEQUENCES_KW conslist= consequ_list[st] ) ;
    public final Code consequences(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code conslist = null;


         c = new Code();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:334:70: ( ^( CONSEQUENCES_KW conslist= consequ_list[st] ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:335:2: ^( CONSEQUENCES_KW conslist= consequ_list[st] )
            {
            match(input,CONSEQUENCES_KW,FOLLOW_CONSEQUENCES_KW_in_consequences945); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_consequ_list_in_consequences949);
            conslist=consequ_list(st);

            state._fsp--;


            match(input, Token.UP, null); 
            c.append(conslist);

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
    // $ANTLR end "consequences"


    // $ANTLR start "consequ_list"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:339:1: consequ_list[SymbolTable st] returns [Code c] : (cons= consequ[st] )+ ;
    public final Code consequ_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code cons = null;


         c = new Code();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:339:70: ( (cons= consequ[st] )+ )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:340:3: (cons= consequ[st] )+
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:340:3: (cons= consequ[st] )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ACCESS_KW||LA25_0==IDENT||(LA25_0>=VICTORY_KW && LA25_0<=MUTE_KW)||(LA25_0>=PLAY_KW && LA25_0<=WAIT_KW)||LA25_0==SAVE_KW||(LA25_0>=ACTIVATE_KW && LA25_0<=DISABLE_KW)||LA25_0==IF_KW||(LA25_0>=ASSIGN_KW && LA25_0<=INVERT_KW)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:340:4: cons= consequ[st]
            	    {
            	    pushFollow(FOLLOW_consequ_in_consequ_list977);
            	    cons=consequ(st);

            	    state._fsp--;

            	    c.append(cons);

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


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
    // $ANTLR end "consequ_list"


    // $ANTLR start "consequ"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:343:1: consequ[SymbolTable st] returns [Code c] : (i= siAlors[st] | act= action[st] | a= affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW );
    public final Code consequ(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code i = null;

        Code act = null;

        Code a = null;


         c = new Code();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:343:65: (i= siAlors[st] | act= action[st] | a= affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW )
            int alt26=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt26=1;
                }
                break;
            case ACCESS_KW:
            case ENDS_KW:
            case STARTS_KW:
            case PAUSE_KW:
            case MUTE_KW:
            case PLAY_KW:
            case STOP_KW:
            case BLOCK_KW:
            case EFFACE_KW:
            case GENERATE_KW:
            case WAIT_KW:
            case SAVE_KW:
                {
                alt26=2;
                }
                break;
            case ASSIGN_KW:
            case ADD_KW:
            case SUB_KW:
            case INVERT_KW:
                {
                alt26=3;
                }
                break;
            case ACTIVATE_KW:
            case DISABLE_KW:
                {
                alt26=4;
                }
                break;
            case IDENT:
                {
                alt26=5;
                }
                break;
            case VICTORY_KW:
                {
                alt26=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:344:3: i= siAlors[st]
                    {
                    pushFollow(FOLLOW_siAlors_in_consequ1006);
                    i=siAlors(st);

                    state._fsp--;

                    c=i;

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:345:5: act= action[st]
                    {
                    pushFollow(FOLLOW_action_in_consequ1017);
                    act=action(st);

                    state._fsp--;

                    c.append("\t");	c.append(act);

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:346:5: a= affectation[st]
                    {
                    pushFollow(FOLLOW_affectation_in_consequ1028);
                    a=affectation(st);

                    state._fsp--;

                    c=a;

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:347:5: activCommande[st]
                    {
                    pushFollow(FOLLOW_activCommande_in_consequ1038);
                    activCommande(st);

                    state._fsp--;



                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:348:5: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1047); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:349:5: VICTORY_KW
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1053); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:350:5: DEFEAT_KW
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1059); 

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
        return c;
    }
    // $ANTLR end "consequ"


    // $ANTLR start "action"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:353:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );
    public final Code action(SymbolTable st) throws RecognitionException {
        Code c = null;

        ArrayList<Symbol> ta = null;


         c = new Code();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:353:64: ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW )
            int alt29=14;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:354:2: accesClass[st] actionObjet[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_action1079);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionObjet_in_action1082);
                    actionObjet(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:355:3: ^( ENDS_KW IDENT )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1088); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1090); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:356:3: ^( ENDS_KW GAME )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1097); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1099); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:357:3: ^( STARTS_KW IDENT )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1106); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1108); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:358:3: ^( STARTS_KW GAME )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1114); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1116); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:359:3: ^( PAUSE_KW IDENT )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1122); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1124); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:360:3: ^( MUTE_KW mode_mute[st] IDENT )
                    {
                    match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1130); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mode_mute_in_action1132);
                    mode_mute(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_action1135); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:361:3: ^( PLAY_KW IDENT )
                    {
                    match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1141); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1143); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:362:3: ^( STOP_KW IDENT )
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_action1149); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1151); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:363:3: ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] )
                    {
                    match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1157); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_transformation_in_action1159);
                    transformation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_action1162);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_action1165);
                    coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:364:3: ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1172); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1174);
                    typeAcces(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:364:29: ( typeDestination[st] )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==COORDINATE_KW||LA27_0==ACCESS_KW) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:364:29: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1177);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:365:3: ^( GENERATE_KW ta= typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1185); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1189);
                    ta=typeAcces(st);

                    state._fsp--;


                    		for(Iterator<Symbol> it = ta.iterator() ; it.hasNext();){
                    			c.append(Code.genEntity(it.next()));
                    		}	
                    	
                    	// TO DO -> MOTEUR3D.addObject = function(idObject,urlObject, tabCoord, idParent)
                    	
                    	
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:372:4: ( typeDestination[st] )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==COORDINATE_KW||LA28_0==ACCESS_KW) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:372:4: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1193);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:373:3: ^( WAIT_KW operation[st] timeUnit[st] consequences[st] )
                    {
                    match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1205); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_action1207);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_action1210);
                    timeUnit(st);

                    state._fsp--;

                    pushFollow(FOLLOW_consequences_in_action1213);
                    consequences(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:374:3: SAVE_KW
                    {
                    match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1219); 

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
        return c;
    }
    // $ANTLR end "action"


    // $ANTLR start "typeAcces"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:377:1: typeAcces[SymbolTable st] returns [ArrayList<Symbol> l] : (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) );
    public final ArrayList<Symbol> typeAcces(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> l = null;

        ArrayList<Symbol> ac = null;


        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:377:57: (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ACCESS_KW) ) {
                alt31=1;
            }
            else if ( (LA31_0==GAME_SCORE_KW||LA31_0==VALUE_KW||LA31_0==VAR_I_KW||LA31_0==FLOAT||LA31_0==RANDOM_KW||(LA31_0>=PLUS && LA31_0<=Z)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:378:2: ac= accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeAcces1237);
                    ac=accesClass(st);

                    state._fsp--;

                    l=ac;

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:378:29: operation[st] ( IDENT | accesClass[st] )
                    {
                    pushFollow(FOLLOW_operation_in_typeAcces1243);
                    operation(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:378:43: ( IDENT | accesClass[st] )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENT) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==ACCESS_KW) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:378:44: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_typeAcces1247); 

                            }
                            break;
                        case 2 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:378:52: accesClass[st]
                            {
                            pushFollow(FOLLOW_accesClass_in_typeAcces1251);
                            accesClass(st);

                            state._fsp--;


                            }
                            break;

                    }


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
        return l;
    }
    // $ANTLR end "typeAcces"


    // $ANTLR start "typeDestination"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:380:1: typeDestination[SymbolTable st] returns [Code c] : ( accesClass[st] | coordinates[st] );
    public final Code typeDestination(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:380:50: ( accesClass[st] | coordinates[st] )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ACCESS_KW) ) {
                alt32=1;
            }
            else if ( (LA32_0==COORDINATE_KW) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:381:2: accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeDestination1270);
                    accesClass(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:381:19: coordinates[st]
                    {
                    pushFollow(FOLLOW_coordinates_in_typeDestination1275);
                    coordinates(st);

                    state._fsp--;


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
        return c;
    }
    // $ANTLR end "typeDestination"


    // $ANTLR start "actionObjet"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:383:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );
    public final Code actionObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:383:46: ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) )
            int alt33=7;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:384:3: DIES_KW
                    {
                    match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1291); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:385:5: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1297);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:386:4: ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] )
                    {
                    match(input,DURING,FOLLOW_DURING_in_actionObjet1304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1306);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_actionObjet1309);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_actionObjet1312);
                    timeUnit(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:387:4: ^( UNTIL actionCommandeMaintenue[st] conditions[st] )
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1320); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1322);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_actionObjet1325);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:388:4: ^( EQUIP accesClass[st] )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1333); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_actionObjet1335);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:389:4: ^( EQUIP NEXT )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1343); 

                    match(input, Token.DOWN, null); 
                    match(input,NEXT,FOLLOW_NEXT_in_actionObjet1345); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:390:4: ^( EQUIP PREVIOUS )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1353); 

                    match(input, Token.DOWN, null); 
                    match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1355); 

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
        return c;
    }
    // $ANTLR end "actionObjet"


    // $ANTLR start "transformation"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:393:1: transformation[SymbolTable st] returns [Code c] : ( TRANSLATION | ROTATION | SCALE );
    public final Code transformation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:393:49: ( TRANSLATION | ROTATION | SCALE )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:
            {
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
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
        return c;
    }
    // $ANTLR end "transformation"


    // $ANTLR start "coordinates"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:399:1: coordinates[SymbolTable st] returns [Coordonnees coo] : ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) ;
    public final Coordonnees coordinates(SymbolTable st) throws RecognitionException {
        Coordonnees coo = null;

        Code x = null;

        Code y = null;

        Code z = null;


        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:399:55: ( ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:400:2: ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] )
            {
            match(input,COORDINATE_KW,FOLLOW_COORDINATE_KW_in_coordinates1406); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_coordinates1410);
            x=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates1415);
            y=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates1420);
            z=operation(st);

            state._fsp--;


            match(input, Token.UP, null); 
            coo = new Coordonnees(x, y, z);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return coo;
    }
    // $ANTLR end "coordinates"


    // $ANTLR start "commande"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:406:1: commande[SymbolTable st] returns [Code c] : ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) ;
    public final Code commande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:406:43: ( ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:407:2: ^( COMMAND_KW ( IDENT )? actionCommande_list[st] )
            {
            match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1452); 

            match(input, Token.DOWN, null); 
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:407:15: ( IDENT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==IDENT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:407:15: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_commande1454); 

                    }
                    break;

            }

            pushFollow(FOLLOW_actionCommande_list_in_commande1457);
            actionCommande_list(st);

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
    // $ANTLR end "commande"


    // $ANTLR start "actionCommande_list"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:410:1: actionCommande_list[SymbolTable st] returns [Code c] : ( actionCommande[st] )+ ;
    public final Code actionCommande_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:410:53: ( ( actionCommande[st] )+ )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:411:2: ( actionCommande[st] )+
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:411:2: ( actionCommande[st] )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=KEY_KW && LA35_0<=MOUSE_KW)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:411:2: actionCommande[st]
            	    {
            	    pushFollow(FOLLOW_actionCommande_in_actionCommande_list1475);
            	    actionCommande(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


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
    // $ANTLR end "actionCommande_list"


    // $ANTLR start "actionCommande"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:414:1: actionCommande[SymbolTable st] returns [Code c] : ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) );
    public final Code actionCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:414:49: ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==MOUSE_KW) ) {
                alt36=1;
            }
            else if ( (LA36_0==KEY_KW) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:415:2: ^( MOUSE_KW souris[st] actionCommandeType[st] )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande1495); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_souris_in_actionCommande1497);
                    souris(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1500);
                    actionCommandeType(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:416:3: ^( KEY_KW clavier[st] actionCommandeType[st] )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande1508); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_clavier_in_actionCommande1510);
                    clavier(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1513);
                    actionCommandeType(st);

                    state._fsp--;


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
        return c;
    }
    // $ANTLR end "actionCommande"


    // $ANTLR start "actionCommandeType"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:419:1: actionCommandeType[SymbolTable st] returns [Code c] : ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] );
    public final Code actionCommandeType(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:419:53: ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] )
            int alt37=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt37=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt37=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:420:2: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1532); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:420:10: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1536);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:420:38: actionCommandeMaintenue[st]
                    {
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1541);
                    actionCommandeMaintenue(st);

                    state._fsp--;


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
        return c;
    }
    // $ANTLR end "actionCommandeType"


    // $ANTLR start "souris"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:423:1: souris[SymbolTable st] returns [Code c] : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final Code souris(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:423:41: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:
            {
            if ( (input.LA(1)>=WUP && input.LA(1)<=SCROLL_DOWN) ) {
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
        return c;
    }
    // $ANTLR end "souris"


    // $ANTLR start "clavier"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:427:1: clavier[SymbolTable st] returns [Code c] : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final Code clavier(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:427:42: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:
            {
            if ( (input.LA(1)>=WUP && input.LA(1)<=RIGHT)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
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
        return c;
    }
    // $ANTLR end "clavier"


    // $ANTLR start "actionCommandePressee"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:431:1: actionCommandePressee[SymbolTable st] returns [Code c] : ( JUMP operation[st] | PAUSE_KW | STOP_KW );
    public final Code actionCommandePressee(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:431:56: ( JUMP operation[st] | PAUSE_KW | STOP_KW )
            int alt38=3;
            switch ( input.LA(1) ) {
            case JUMP:
                {
                alt38=1;
                }
                break;
            case PAUSE_KW:
                {
                alt38=2;
                }
                break;
            case STOP_KW:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:432:3: JUMP operation[st]
                    {
                    match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1669); 
                    pushFollow(FOLLOW_operation_in_actionCommandePressee1671);
                    operation(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:433:5: PAUSE_KW
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1678); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:434:5: STOP_KW
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1684); 

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
        return c;
    }
    // $ANTLR end "actionCommandePressee"


    // $ANTLR start "actionCommandeMaintenue"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:437:1: actionCommandeMaintenue[SymbolTable st] returns [Code c] : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
    public final Code actionCommandeMaintenue(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:437:58: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
            int alt39=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt39=1;
                }
                break;
            case TURN:
                {
                alt39=2;
                }
                break;
            case ACCELERATE:
                {
                alt39=3;
                }
                break;
            case BRAKE:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:438:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1704); 
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=FORWARD && input.LA(1)<=BACKWARD) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:439:5: TURN ( LEFT | RIGHT )
                    {
                    match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1726); 
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:440:5: ACCELERATE
                    {
                    match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1740); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:441:5: BRAKE
                    {
                    match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1746); 

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
        return c;
    }
    // $ANTLR end "actionCommandeMaintenue"


    // $ANTLR start "activCommande"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:444:1: activCommande[SymbolTable st] returns [Code c] : ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) );
    public final Code activCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:444:48: ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ACTIVATE_KW) ) {
                alt40=1;
            }
            else if ( (LA40_0==DISABLE_KW) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:445:3: ^( ACTIVATE_KW typeCommand[st] )
                    {
                    match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1767); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande1769);
                    typeCommand(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:446:4: ^( DISABLE_KW typeCommand[st] )
                    {
                    match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1778); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande1780);
                    typeCommand(st);

                    state._fsp--;


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
        return c;
    }
    // $ANTLR end "activCommande"


    // $ANTLR start "typeCommand"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:449:1: typeCommand[SymbolTable st] returns [Code c] : ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD );
    public final Code typeCommand(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:449:46: ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD )
            int alt43=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt43=1;
                }
                break;
            case MOUSE_KW:
                {
                alt43=2;
                }
                break;
            case KEY_KW:
                {
                alt43=3;
                }
                break;
            case KEYBOARD:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:450:2: COMMANDS
                    {
                    match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand1798); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:451:4: ^( MOUSE_KW ( souris[st] )* )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_typeCommand1805); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:451:15: ( souris[st] )*
                        loop41:
                        do {
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( ((LA41_0>=WUP && LA41_0<=SCROLL_DOWN)) ) {
                                alt41=1;
                            }


                            switch (alt41) {
                        	case 1 :
                        	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:451:15: souris[st]
                        	    {
                        	    pushFollow(FOLLOW_souris_in_typeCommand1807);
                        	    souris(st);

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop41;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:452:4: ^( KEY_KW ( clavier[st] )+ )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_typeCommand1816); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:452:13: ( clavier[st] )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=WUP && LA42_0<=RIGHT)||(LA42_0>=LETTER && LA42_0<=ENTER)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:452:13: clavier[st]
                    	    {
                    	    pushFollow(FOLLOW_clavier_in_typeCommand1818);
                    	    clavier(st);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:453:4: KEYBOARD
                    {
                    match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand1826); 

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
        return c;
    }
    // $ANTLR end "typeCommand"


    // $ANTLR start "reglesJeu"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:455:1: reglesJeu[SymbolTable st] returns [Code c] : ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) ;
    public final Code reglesJeu(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:455:44: ( ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:456:3: ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] )
            {
            match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1844); 

            match(input, Token.DOWN, null); 
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:456:13: ( IDENT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==IDENT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:456:13: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1846); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu1849);
            declencheur(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_reglesJeu1852);
            consequences(st);

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
    // $ANTLR end "reglesJeu"


    // $ANTLR start "declencheur"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:459:1: declencheur[SymbolTable st] returns [Code c] : ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW );
    public final Code declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:459:46: ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW )
            int alt46=7;
            switch ( input.LA(1) ) {
            case ACCESS_KW:
                {
                alt46=1;
                }
                break;
            case ENDS_KW:
                {
                alt46=2;
                }
                break;
            case STARTS_KW:
                {
                alt46=3;
                }
                break;
            case BECOMES_VAR_KW:
                {
                alt46=4;
                }
                break;
            case BECOMES_ID_KW:
                {
                alt46=5;
                }
                break;
            case VICTORY_KW:
                {
                alt46=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt46=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:460:3: accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    {
                    pushFollow(FOLLOW_accesClass_in_declencheur1873);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:460:18: ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    int alt45=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt45=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt45=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                        {
                        alt45=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
                        {
                        alt45=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }

                    switch (alt45) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:460:19: MOVES_KW
                            {
                            match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1877); 

                            }
                            break;
                        case 2 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:460:30: DIES_KW
                            {
                            match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1881); 

                            }
                            break;
                        case 3 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:460:40: declencheurTK[st]
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1885);
                            declencheurTK(st);

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:460:60: declencheurKT[st]
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1890);
                            declencheurKT(st);

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:461:4: ^( ENDS_KW type_declencheur[st] )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1898); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1900);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:462:4: ^( STARTS_KW type_declencheur[st] )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1908); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1910);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:463:4: ^( BECOMES_VAR_KW variable[st] varOuNB[st] )
                    {
                    match(input,BECOMES_VAR_KW,FOLLOW_BECOMES_VAR_KW_in_declencheur1928); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_declencheur1930);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_varOuNB_in_declencheur1933);
                    varOuNB(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:464:4: ^( BECOMES_ID_KW IDENT playerOuInteraction[st] )
                    {
                    match(input,BECOMES_ID_KW,FOLLOW_BECOMES_ID_KW_in_declencheur1941); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declencheur1943); 
                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1945);
                    playerOuInteraction(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:465:4: VICTORY_KW
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur1952); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:466:4: DEFEAT_KW
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur1958); 

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
        return c;
    }
    // $ANTLR end "declencheur"


    // $ANTLR start "type_declencheur"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:469:1: type_declencheur[SymbolTable st] returns [Code c] : ( IDENT | GAME );
    public final Code type_declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:469:51: ( IDENT | GAME )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:
            {
            if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
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
        return c;
    }
    // $ANTLR end "type_declencheur"


    // $ANTLR start "varOuNB"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:472:1: varOuNB[SymbolTable st] returns [Code c] : ( variable[st] | FLOAT );
    public final Code varOuNB(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:472:42: ( variable[st] | FLOAT )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==GAME_SCORE_KW||LA47_0==VALUE_KW||LA47_0==VAR_I_KW||(LA47_0>=X && LA47_0<=Z)) ) {
                alt47=1;
            }
            else if ( (LA47_0==FLOAT) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:472:44: variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_varOuNB1994);
                    variable(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:472:59: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB1999); 

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
        return c;
    }
    // $ANTLR end "varOuNB"


    // $ANTLR start "playerOuInteraction"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:474:1: playerOuInteraction[SymbolTable st] returns [Code c] : ( PLAYER | interaction ) ;
    public final Code playerOuInteraction(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:475:2: ( ( PLAYER | interaction ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:475:4: ( PLAYER | interaction )
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:475:4: ( PLAYER | interaction )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==PLAYER) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=ALLY && LA48_0<=NEUTRAL)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:475:5: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction2015); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:475:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction2018);
                    interaction();

                    state._fsp--;


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
        return c;
    }
    // $ANTLR end "playerOuInteraction"


    // $ANTLR start "declencheurTK"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:477:1: declencheurTK[SymbolTable st] returns [Code c] : ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurTK(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:478:2: ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==TOUCHES_KW) ) {
                alt51=1;
            }
            else if ( (LA51_0==KILLS_KW) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:478:4: ^( TOUCHES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2035); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:478:17: ( OTHER )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==OTHER) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:478:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2038); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2042);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:479:4: ^( KILLS_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2050); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:479:15: ( OTHER )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==OTHER) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:479:16: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2053); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2057);
                    accesClass(st);

                    state._fsp--;


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
        return c;
    }
    // $ANTLR end "declencheurTK"


    // $ANTLR start "declencheurKT"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:483:1: declencheurKT[SymbolTable st] returns [Code c] : ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurKT(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:484:2: ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KILLED_KW) ) {
                alt54=1;
            }
            else if ( (LA54_0==TOUCHED_KW) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:484:4: ^( KILLED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2079); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:484:16: ( OTHER )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==OTHER) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:484:17: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2082); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2086);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:485:4: ^( TOUCHED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2094); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:485:17: ( OTHER )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==OTHER) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:485:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2097); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2101);
                    accesClass(st);

                    state._fsp--;


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
        return c;
    }
    // $ANTLR end "declencheurKT"


    // $ANTLR start "siAlors"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:488:1: siAlors[SymbolTable st] returns [Code c] : ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? ) ;
    public final Code siAlors(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code cond = null;

        Code r1 = null;

        Code r2 = null;


        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:488:42: ( ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:489:3: ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? )
            {
            match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2124); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_conditions_in_siAlors2128);
            cond=conditions(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_siAlors2133);
            r1=consequences(st);

            state._fsp--;

            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:489:53: (r2= consequences[st] )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==CONSEQUENCES_KW) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:489:53: r2= consequences[st]
                    {
                    pushFollow(FOLLOW_consequences_in_siAlors2138);
                    r2=consequences(st);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            c = Code.genIF(cond,r1,r2);

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
    // $ANTLR end "siAlors"


    // $ANTLR start "conditions"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:493:1: conditions[SymbolTable st] returns [Code c] : ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] );
    public final Code conditions(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree not=null;
        Code cond = null;

        Code cond1 = null;

        Code cond2 = null;


        not=null;
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:494:21: ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] )
            int alt57=10;
            switch ( input.LA(1) ) {
            case CONDITION_KW:
                {
                alt57=1;
                }
                break;
            case OR:
                {
                alt57=2;
                }
                break;
            case AND:
                {
                alt57=3;
                }
                break;
            case EQUALS:
                {
                alt57=4;
                }
                break;
            case INF:
                {
                alt57=5;
                }
                break;
            case SUP:
                {
                alt57=6;
                }
                break;
            case INFEG:
                {
                alt57=7;
                }
                break;
            case SUPED:
                {
                alt57=8;
                }
                break;
            case DIFF:
                {
                alt57=9;
                }
                break;
            case VICTORY_KW:
            case DEFEAT_KW:
            case DEAD_KW:
            case ALIVE_KW:
            case EFFACED_KW:
            case GENERATED_KW:
            case TOUCHING_KW:
            case MOVING_KW:
            case WAITING_KW:
            case FINISHED_KW:
            case STARTED_KW:
            case PAUSED_KW:
            case MUTED_KW:
            case PLAYED_KW:
            case STOPPED_KW:
                {
                alt57=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:495:3: ^( CONDITION_KW (not= NOT )? cond= conditions[st] )
                    {
                    match(input,CONDITION_KW,FOLLOW_CONDITION_KW_in_conditions2172); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:495:18: (not= NOT )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==NOT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:495:19: not= NOT
                            {
                            not=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions2177); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditions_in_conditions2183);
                    cond=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            if(not != null) {
                                c = Code.genNot(cond);
                            } else {
                                c = cond;
                            }
                        

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:503:4: ^( OR cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,OR,FOLLOW_OR_in_conditions2197); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions2201);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions2206);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genOr(cond1,cond2);
                        

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:507:4: ^( AND cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,AND,FOLLOW_AND_in_conditions2220); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions2224);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions2229);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genAnd(cond1,cond2);
                        

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:511:4: ^( EQUALS cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_conditions2243); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2247);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2252);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genEquals(cond1,cond2);
                        

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:515:4: ^( INF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INF,FOLLOW_INF_in_conditions2266); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2270);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2275);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInf(cond1,cond2);
                        

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:519:4: ^( SUP cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUP,FOLLOW_SUP_in_conditions2289); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2293);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2298);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSup(cond1,cond2);
                        

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:523:4: ^( INFEG cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INFEG,FOLLOW_INFEG_in_conditions2312); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2316);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2321);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInfEg(cond1,cond2);
                        

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:527:4: ^( SUPED cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUPED,FOLLOW_SUPED_in_conditions2335); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2339);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2344);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSupEg(cond1,cond2);
                        

                    }
                    break;
                case 9 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:531:4: ^( DIFF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,DIFF,FOLLOW_DIFF_in_conditions2358); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2362);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2367);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genDiff(cond1,cond2);
                        

                    }
                    break;
                case 10 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:535:5: etat[st]
                    {
                    pushFollow(FOLLOW_etat_in_conditions2381);
                    etat(st);

                    state._fsp--;


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
        return c;
    }
    // $ANTLR end "conditions"


    // $ANTLR start "etat"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:538:1: etat[SymbolTable st] returns [Code c] : ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW );
    public final Code etat(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:538:39: ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW )
            int alt78=15;
            switch ( input.LA(1) ) {
            case DEAD_KW:
                {
                alt78=1;
                }
                break;
            case ALIVE_KW:
                {
                alt78=2;
                }
                break;
            case EFFACED_KW:
                {
                alt78=3;
                }
                break;
            case GENERATED_KW:
                {
                alt78=4;
                }
                break;
            case TOUCHING_KW:
                {
                alt78=5;
                }
                break;
            case MOVING_KW:
                {
                alt78=6;
                }
                break;
            case WAITING_KW:
                {
                alt78=7;
                }
                break;
            case FINISHED_KW:
                {
                alt78=8;
                }
                break;
            case STARTED_KW:
                {
                alt78=9;
                }
                break;
            case PAUSED_KW:
                {
                alt78=10;
                }
                break;
            case MUTED_KW:
                {
                alt78=11;
                }
                break;
            case PLAYED_KW:
                {
                alt78=12;
                }
                break;
            case STOPPED_KW:
                {
                alt78=13;
                }
                break;
            case VICTORY_KW:
                {
                alt78=14;
                }
                break;
            case DEFEAT_KW:
                {
                alt78=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:539:2: ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2400); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2402);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:539:27: ( NOT )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==NOT) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:539:28: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2406); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:539:34: ( OTHER )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==OTHER) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:539:35: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2411); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2415);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:540:4: ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2423); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2425);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:540:30: ( NOT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==NOT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:540:31: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2429); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:540:37: ( OTHER )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==OTHER) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:540:38: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2434); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2438);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:541:4: ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2446); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2448);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:541:32: ( NOT )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==NOT) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:541:33: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2452); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:541:39: ( OTHER )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==OTHER) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:541:40: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2457); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2461);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:542:4: ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2469); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2471);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:542:34: ( NOT )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==NOT) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:542:35: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2475); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:542:41: ( OTHER )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==OTHER) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:542:42: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2480); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2484);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:543:4: ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2492); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2494);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:543:33: ( NOT )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NOT) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:543:34: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2498); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:543:40: ( OTHER )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==OTHER) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:543:41: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2503); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2507);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:544:4: ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2515); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2517);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:544:31: ( NOT )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==NOT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:544:32: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2521); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:544:38: ( OTHER )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==OTHER) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:544:39: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2526); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2530);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:545:4: ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2538); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2540);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:545:32: ( NOT )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NOT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:545:33: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2544); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:545:39: ( OTHER )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==OTHER) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:545:40: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2549); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2553);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:546:4: ^( FINISHED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2561); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2563);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:546:39: ( NOT )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NOT) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:546:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2567); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:547:4: ^( STARTED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2576); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2578);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:547:37: ( NOT )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NOT) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:547:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2581); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:548:4: ^( PAUSED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2590); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2592);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:548:36: ( NOT )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NOT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:548:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2595); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:549:4: ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] )
                    {
                    match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2604); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2606);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:549:36: ( NOT )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==NOT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:549:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2610); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mode_mute_in_etat2614);
                    mode_mute(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:550:4: ^( PLAYED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2622); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2624);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:550:37: ( NOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NOT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:550:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2628); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:551:4: ^( STOPPED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2637); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2639);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:551:38: ( NOT )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NOT) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:551:39: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2643); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:553:4: VICTORY_KW
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2654); 

                    }
                    break;
                case 15 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:554:4: DEFEAT_KW
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2659); 

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
        return c;
    }
    // $ANTLR end "etat"


    // $ANTLR start "mode_mute"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:557:1: mode_mute[SymbolTable st] returns [Code c] : ( ON | OFF );
    public final Code mode_mute(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:557:44: ( ON | OFF )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:
            {
            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
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
        return c;
    }
    // $ANTLR end "mode_mute"


    // $ANTLR start "affectation"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:560:1: affectation[SymbolTable st] returns [Code c] : ( ^( ASSIGN_KW i1= operation[st] i2= variable[st] ) | ^( ADD_KW o= operation[st] v= variable[st] ) | ^( SUB_KW op= operation[st] var= variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) );
    public final Code affectation(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code i1 = null;

        Code i2 = null;

        Code o = null;

        Code v = null;

        Code op = null;

        Code var = null;


        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:560:46: ( ^( ASSIGN_KW i1= operation[st] i2= variable[st] ) | ^( ADD_KW o= operation[st] v= variable[st] ) | ^( SUB_KW op= operation[st] var= variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt79=1;
                }
                break;
            case ADD_KW:
                {
                alt79=2;
                }
                break;
            case SUB_KW:
                {
                alt79=3;
                }
                break;
            case INVERT_KW:
                {
                alt79=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:561:3: ^( ASSIGN_KW i1= operation[st] i2= variable[st] )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2698); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation2702);
                    i1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2707);
                    i2=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	c = Code.genAffect(i2,i1);
                        

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:565:4: ^( ADD_KW o= operation[st] v= variable[st] )
                    {
                    match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2719); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation2723);
                    o=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2728);
                    v=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genIncr(v,o);
                        

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:569:4: ^( SUB_KW op= operation[st] var= variable[st] )
                    {
                    match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2740); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation2744);
                    op=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2749);
                    var=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSub(var,op);
                        

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:573:4: ^( INVERT_KW variable[st] variable[st] )
                    {
                    match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2761); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_affectation2763);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2766);
                    variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInvert(var,op);
                        

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
        return c;
    }
    // $ANTLR end "affectation"


    // $ANTLR start "iaBasique"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:579:1: iaBasique[SymbolTable st] returns [Code c] : ^( IA_KW accesClass[st] actionObjetList[st] ) ;
    public final Code iaBasique(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:579:44: ( ^( IA_KW accesClass[st] actionObjetList[st] ) )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:579:46: ^( IA_KW accesClass[st] actionObjetList[st] )
            {
            match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2791); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_accesClass_in_iaBasique2793);
            accesClass(st);

            state._fsp--;

            pushFollow(FOLLOW_actionObjetList_in_iaBasique2796);
            actionObjetList(st);

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
    // $ANTLR end "iaBasique"


    // $ANTLR start "actionObjetList"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:581:1: actionObjetList[SymbolTable st] returns [Code c] : ( actionObjet[st] )+ ;
    public final Code actionObjetList(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:581:50: ( ( actionObjet[st] )+ )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:581:52: ( actionObjet[st] )+
            {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:581:52: ( actionObjet[st] )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==PAUSE_KW||LA80_0==STOP_KW||(LA80_0>=DIES_KW && LA80_0<=EQUIP)||LA80_0==JUMP) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:581:52: actionObjet[st]
            	    {
            	    pushFollow(FOLLOW_actionObjet_in_actionObjetList2811);
            	    actionObjet(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);


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
    // $ANTLR end "actionObjetList"


    // $ANTLR start "operation"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:588:1: operation[SymbolTable st] returns [Code c] : ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st] | f= FLOAT );
    public final Code operation(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree f=null;
        Code c1 = null;

        Code c2 = null;

        Code v = null;


        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:588:44: ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st] | f= FLOAT )
            int alt81=9;
            switch ( input.LA(1) ) {
            case RANDOM_KW:
                {
                alt81=1;
                }
                break;
            case PLUS:
                {
                alt81=2;
                }
                break;
            case MINUS:
                {
                alt81=3;
                }
                break;
            case MUL:
                {
                alt81=4;
                }
                break;
            case DIV:
                {
                alt81=5;
                }
                break;
            case MOD:
                {
                alt81=6;
                }
                break;
            case POW:
                {
                alt81=7;
                }
                break;
            case GAME_SCORE_KW:
            case VALUE_KW:
            case VAR_I_KW:
            case X:
            case Y:
            case Z:
                {
                alt81=8;
                }
                break;
            case FLOAT:
                {
                alt81=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:589:2: ^( RANDOM_KW c1= operation[st] c2= operation[st] )
                    {
                    match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2836); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2841);
                    c1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2847);
                    c2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genRD(c1,c2);

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:591:3: ^( PLUS operation[st] operation[st] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_operation2865); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2867);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2870);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPLUS(c1,c2);

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:593:3: ^( MINUS operation[st] operation[st] )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_operation2887); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2889);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2892);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMINUS(c1,c2);

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:595:3: ^( MUL operation[st] operation[st] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_operation2909); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2911);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2914);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMUL(c1,c2);

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:597:3: ^( DIV operation[st] operation[st] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_operation2931); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2933);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2936);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genDIV(c1,c2);

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:599:3: ^( MOD operation[st] operation[st] )
                    {
                    match(input,MOD,FOLLOW_MOD_in_operation2953); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2955);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2958);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMOD(c1,c2);

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:601:3: ^( POW operation[st] operation[st] )
                    {
                    match(input,POW,FOLLOW_POW_in_operation2975); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2977);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2980);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPOW(c1,c2);

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:603:3: v= variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_operation3000);
                    v=variable(st);

                    state._fsp--;

                    c = v;

                    }
                    break;
                case 9 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:605:3: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_operation3019); 
                    c = new Code(f.getText());

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
        return c;
    }
    // $ANTLR end "operation"


    // $ANTLR start "variable"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:610:1: variable[SymbolTable st] returns [Code c] : ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) );
    public final Code variable(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code tc = null;

        ArrayList<Symbol> sb = null;

        ArrayList<Symbol> e = null;

        String at = null;

        ArrayList<Symbol> ac = null;


        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:610:43: ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) )
            int alt82=6;
            switch ( input.LA(1) ) {
            case X:
                {
                alt82=1;
                }
                break;
            case Y:
                {
                alt82=2;
                }
                break;
            case Z:
                {
                alt82=3;
                }
                break;
            case VAR_I_KW:
                {
                alt82=4;
                }
                break;
            case GAME_SCORE_KW:
                {
                alt82=5;
                }
                break;
            case VALUE_KW:
                {
                alt82=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:611:3: ^( X tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,X,FOLLOW_X_in_variable3056); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3060);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3065);
                    sb=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                          Symbol sy = sb.get(0);
                          if(tc.equals("position")){
                                    c = Code.genPosX(sy.getName());
                            }else if(tc.equals("angle")){
                                    c= Code.genoRX(sy.getName());
                            }else{
                                    c= Code.genTX(sy.getName());
                                }
                      

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:622:4: ^( Y tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Y,FOLLOW_Y_in_variable3077); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3082);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3087);
                    sb=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                                Symbol sy = sb.get(0);
                          if(tc.equals("position")){
                                    c = Code.genPosY(sy.getName());
                            }else if(tc.equals("angle")){
                                    c= Code.genoRY(sy.getName());
                            }else{
                                    c= Code.genTY(sy.getName());
                                }
                      

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:633:4: ^( Z typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Z,FOLLOW_Z_in_variable3099); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3101);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3106);
                    sb=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                          Symbol sy = sb.get(0);
                          if(tc.equals("position")){
                                    c = Code.genPosZ(sy.getName());
                            }else if(tc.equals("angle")){
                                    c= Code.genoRZ(sy.getName());
                            }else{
                                    c= Code.genTZ(sy.getName());
                                }
                            

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:643:4: ^( VAR_I_KW i= IDENT e= accesClass[st] )
                    {
                    match(input,VAR_I_KW,FOLLOW_VAR_I_KW_in_variable3120); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variable3124); 
                    pushFollow(FOLLOW_accesClass_in_variable3128);
                    e=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    Symbol si = e.get(0);String ident= i.getText(); AttributeValue a = si.getAttribute(ident);
                        if(a==null){
                            System.out.println(si.getName()+"n'a pas l'attribut"+ident);
                            System.exit(-1);}
                        else if(a.getType()!= AttributeValue.Type.NUMBER){
                            System.out.println(ident+"n'est pas un nombre.");
                            System.exit(-1);
                       }else{
                            c=Code.genAccess(si.getName(),ident);
                        }

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:654:4: GAME_SCORE_KW
                    {
                    match(input,GAME_SCORE_KW,FOLLOW_GAME_SCORE_KW_in_variable3139); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:655:4: ^( VALUE_KW at= attributTps[st] ac= accesClass[st] )
                    {
                    match(input,VALUE_KW,FOLLOW_VALUE_KW_in_variable3145); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_variable3149);
                    at=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3154);
                    ac=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    Symbol si = ac.get(0); AttributeValue a = si.getAttribute(at);
                        if(a==null){
                        System.out.println(si.getName()+"n'a pas l'attribut"+at);
                        System.exit(-1);}
                        else{
                            c=Code.genAccess(si.getName(),at);
                        }

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
        return c;
    }
    // $ANTLR end "variable"


    // $ANTLR start "accesClass"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:665:1: accesClass[SymbolTable st] returns [ArrayList<Symbol> sb] : ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW mo= typeObjet ) | ^( ACCESS_KW val= interaction ) | ^( ACCESS_KW NOT notAccess[st] ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) );
    public final ArrayList<Symbol> accesClass(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> sb = null;

        CommonTree i=null;
        Model mo = null;

        Integer val = null;

        Code co = null;


        sb = new ArrayList<Symbol>();
        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:665:96: ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW mo= typeObjet ) | ^( ACCESS_KW val= interaction ) | ^( ACCESS_KW NOT notAccess[st] ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) )
            int alt84=6;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==ACCESS_KW) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ALL:
                        {
                        alt84=1;
                        }
                        break;
                    case NOT:
                        {
                        alt84=4;
                        }
                        break;
                    case IDENT:
                        {
                        alt84=5;
                        }
                        break;
                    case PLAYER:
                        {
                        alt84=6;
                        }
                        break;
                    case CAMERA:
                    case MEDIA:
                    case COUNTER:
                    case TIME:
                        {
                        alt84=2;
                        }
                        break;
                    case ALLY:
                    case ENEMY:
                    case NEUTRAL:
                        {
                        alt84=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:666:5: ^( ACCESS_KW ALL )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3186); 

                    match(input, Token.DOWN, null); 
                    match(input,ALL,FOLLOW_ALL_in_accesClass3188); 

                    match(input, Token.UP, null); 
                    sb.add(Genre.player);sb.addAll(Genre.allies);sb.addAll(Genre.enemies);sb.addAll(Genre.neutral);

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:668:5: ^( ACCESS_KW mo= typeObjet )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3202); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeObjet_in_accesClass3206);
                    mo=typeObjet();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    sb.add(mo);

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:670:5: ^( ACCESS_KW val= interaction )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3220); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_interaction_in_accesClass3224);
                    val=interaction();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    if(val == 2 ){
                            sb.addAll(Genre.allies);
                        }else if (val == 3){
                            sb.addAll(Genre.enemies);
                        }else{
                            sb.addAll(Genre.neutral);
                        }
                        

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:679:5: ^( ACCESS_KW NOT notAccess[st] )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3238); 

                    match(input, Token.DOWN, null); 
                    match(input,NOT,FOLLOW_NOT_in_accesClass3240); 
                    pushFollow(FOLLOW_notAccess_in_accesClass3242);
                    notAccess(st);

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:681:5: ^( ACCESS_KW i= IDENT (co= operation[st] )? )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3257); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesClass3261); 
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:681:27: (co= operation[st] )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==GAME_SCORE_KW||LA83_0==VALUE_KW||LA83_0==VAR_I_KW||LA83_0==FLOAT||LA83_0==RANDOM_KW||(LA83_0>=PLUS && LA83_0<=Z)) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:681:27: co= operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_accesClass3265);
                            co=operation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    String ident = i.getText(); Symbol s = st.get(ident);
                        if(s==null){
                            System.out.println("L'identifiant "+ident+" n'est pas défini.");
                            System.exit(-1);
                        }else{
                            sb.add(s);
                        }
                        

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:690:5: ^( ACCESS_KW PLAYER )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3282); 

                    match(input, Token.DOWN, null); 
                    match(input,PLAYER,FOLLOW_PLAYER_in_accesClass3284); 

                    match(input, Token.UP, null); 
                    sb.add(Genre.player);

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
        return sb;
    }
    // $ANTLR end "accesClass"


    // $ANTLR start "notAccess"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:694:1: notAccess[SymbolTable st] returns [Code c] : ( typeObjet | interaction | PLAYER );
    public final Code notAccess(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:694:45: ( typeObjet | interaction | PLAYER )
            int alt85=3;
            switch ( input.LA(1) ) {
            case CAMERA:
            case MEDIA:
            case COUNTER:
            case TIME:
                {
                alt85=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
                {
                alt85=2;
                }
                break;
            case PLAYER:
                {
                alt85=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:695:1: typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_notAccess3308);
                    typeObjet();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:695:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_notAccess3312);
                    interaction();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:695:27: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_notAccess3316); 

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
        return c;
    }
    // $ANTLR end "notAccess"


    // $ANTLR start "typeCoordonnees"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:697:1: typeCoordonnees[SymbolTable st] returns [Code c] : ( POSITION | ORIENTATION | SIZE );
    public final Code typeCoordonnees(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:697:50: ( POSITION | ORIENTATION | SIZE )
            int alt86=3;
            switch ( input.LA(1) ) {
            case POSITION:
                {
                alt86=1;
                }
                break;
            case ORIENTATION:
                {
                alt86=2;
                }
                break;
            case SIZE:
                {
                alt86=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:698:2: POSITION
                    {
                    match(input,POSITION,FOLLOW_POSITION_in_typeCoordonnees3332); 
                    c = new Code("position");

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:698:40: ORIENTATION
                    {
                    match(input,ORIENTATION,FOLLOW_ORIENTATION_in_typeCoordonnees3337); 
                    c = new Code("angle");

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:698:78: SIZE
                    {
                    match(input,SIZE,FOLLOW_SIZE_in_typeCoordonnees3342); 
                    c = new Code("taille");

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
        return c;
    }
    // $ANTLR end "typeCoordonnees"


    // $ANTLR start "timeUnit"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:701:1: timeUnit[SymbolTable st] returns [String c] : ( MIN | SEC | MS | FRAME );
    public final String timeUnit(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:701:45: ( MIN | SEC | MS | FRAME )
            int alt87=4;
            switch ( input.LA(1) ) {
            case MIN:
                {
                alt87=1;
                }
                break;
            case SEC:
                {
                alt87=2;
                }
                break;
            case MS:
                {
                alt87=3;
                }
                break;
            case FRAME:
                {
                alt87=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:702:2: MIN
                    {
                    match(input,MIN,FOLLOW_MIN_in_timeUnit3360); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:703:4: SEC
                    {
                    match(input,SEC,FOLLOW_SEC_in_timeUnit3365); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:704:4: MS
                    {
                    match(input,MS,FOLLOW_MS_in_timeUnit3370); 
                    c = "ms";

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:706:4: FRAME
                    {
                    match(input,FRAME,FOLLOW_FRAME_in_timeUnit3385); 

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
        return c;
    }
    // $ANTLR end "timeUnit"


    // $ANTLR start "typeObjet"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:710:1: typeObjet returns [Model t] : ( CAMERA | MEDIA | COUNTER | TIME );
    public final Model typeObjet() throws RecognitionException {
        Model t = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:710:28: ( CAMERA | MEDIA | COUNTER | TIME )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:
            {
            if ( input.LA(1)==CAMERA||input.LA(1)==MEDIA||(input.LA(1)>=COUNTER && input.LA(1)<=TIME) ) {
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
        return t;
    }
    // $ANTLR end "typeObjet"


    // $ANTLR start "attributTps"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:717:1: attributTps[SymbolTable st] returns [String c] : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final String attributTps(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:717:48: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            int alt88=3;
            switch ( input.LA(1) ) {
            case BOOST_INTERVAL:
                {
                alt88=1;
                }
                break;
            case SHOOT_INTERVAL:
                {
                alt88=2;
                }
                break;
            case RELOAD_TIME:
                {
                alt88=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:718:2: BOOST_INTERVAL
                    {
                    match(input,BOOST_INTERVAL,FOLLOW_BOOST_INTERVAL_in_attributTps3433); 
                    c ="boostInterval";

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:719:4: SHOOT_INTERVAL
                    {
                    match(input,SHOOT_INTERVAL,FOLLOW_SHOOT_INTERVAL_in_attributTps3439); 
                    c = "shootInterval";

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:720:4: RELOAD_TIME
                    {
                    match(input,RELOAD_TIME,FOLLOW_RELOAD_TIME_in_attributTps3454); 
                    c = "reloadTime";

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
        return c;
    }
    // $ANTLR end "attributTps"


    // $ANTLR start "attributListeOuObjet"
    // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:723:1: attributListeOuObjet[SymbolTable st] returns [Code c] : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final Code attributListeOuObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:723:55: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // /home/touzbi/Documents/SVN_Proj_Update/compilation/hight/grammars/hightTree.g:
            {
            if ( (input.LA(1)>=INVENTORY && input.LA(1)<=TYPES_TELEPORTABLES) ) {
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
        return c;
    }
    // $ANTLR end "attributListeOuObjet"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA14_eotS =
        "\14\uffff";
    static final String DFA14_eofS =
        "\14\uffff";
    static final String DFA14_minS =
        "\1\10\2\uffff\2\2\1\uffff\1\54\1\57\4\uffff";
    static final String DFA14_maxS =
        "\1\50\2\uffff\2\2\1\uffff\1\55\1\60\4\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\7\2\uffff\1\3\1\4\1\5\1\6";
    static final String DFA14_specialS =
        "\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\4\1\3\4\uffff\1\5\30\uffff\1\2",
            "",
            "",
            "\1\6",
            "\1\7",
            "",
            "\1\10\1\11",
            "\1\12\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "201:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC te= typeEntity[st] (em= entityMode )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );";
        }
    }
    static final String DFA29_eotS =
        "\23\uffff";
    static final String DFA29_eofS =
        "\23\uffff";
    static final String DFA29_minS =
        "\1\31\1\uffff\2\2\11\uffff\2\35\4\uffff";
    static final String DFA29_maxS =
        "\1\113\1\uffff\2\2\11\uffff\2\45\4\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\2\uffff\1\2\1\3\1\4\1\5";
    static final String DFA29_specialS =
        "\23\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\43\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\1\7\1\10\1\11\1\12"+
            "\1\13\2\uffff\1\14",
            "",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\7\uffff\1\17",
            "\1\22\7\uffff\1\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "353:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );";
        }
    }
    static final String DFA33_eotS =
        "\12\uffff";
    static final String DFA33_eofS =
        "\12\uffff";
    static final String DFA33_minS =
        "\1\77\4\uffff\1\2\1\31\3\uffff";
    static final String DFA33_maxS =
        "\1\146\4\uffff\1\2\1\121\3\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\6\1\7\1\5";
    static final String DFA33_specialS =
        "\12\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\2\4\uffff\1\2\7\uffff\1\1\1\3\1\4\1\5\26\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\6",
            "\1\11\66\uffff\1\7\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "383:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );";
        }
    }
 

    public static final BitSet FOLLOW_GAME_KW_in_game70 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gameData_in_game74 = new BitSet(new long[]{0x00000010000000C0L});
    public static final BitSet FOLLOW_newType_in_game78 = new BitSet(new long[]{0x00000010000000C0L});
    public static final BitSet FOLLOW_initialization_in_game88 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_definition_in_game108 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_commande_in_game129 = new BitSet(new long[]{0x0200000000000000L,0x0002000000200000L});
    public static final BitSet FOLLOW_reglesJeu_in_game135 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_iaBasique_in_game141 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_GAME_ATTRIBUT_KW_in_gameData167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributGame_list_in_gameData169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attributGame_in_attributGame_list186 = new BitSet(new long[]{0x0000000100002002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame214 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame216 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCORE_KW_in_attributGame224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_newType247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_newType251 = new BitSet(new long[]{0x0000482000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_subType_in_newType253 = new BitSet(new long[]{0x0000482000000008L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_IDENT_in_subType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_in_initialization305 = new BitSet(new long[]{0x00000010000000C2L});
    public static final BitSet FOLLOW_INIT_IS_KW_in_init333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init337 = new BitSet(new long[]{0x0000010000008700L});
    public static final BitSet FOLLOW_declarationObjet_in_init341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INIT_HAS_KW_in_init351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_init355 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_affectationObjet_list_in_init360 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEC_in_declarationObjet392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet396 = new BitSet(new long[]{0x0044000000000808L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_declaration_in_declarationObjet415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet424 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_view_in_declarationObjet426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet444 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_KW_in_declarationObjet467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_list_declaration501 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_list_declaration505 = new BitSet(new long[]{0x0000002400105002L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERACTION_KW_in_entityMode560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_entityMode564 = new BitSet(new long[]{0x0044000000000808L});
    public static final BitSet FOLLOW_dupli_in_entityMode568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dupli_in_entityMode579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALLY_in_interaction596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENEMY_in_interaction604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEUTRAL_in_interaction612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectationObjet_in_affectationObjet_list682 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet711 = new BitSet(new long[]{0x0000000000080008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_valAggregation_in_affectationObjet715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_affectationObjet739 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_affectationObjet744 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_affectationObjet765 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet776 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_affectationObjet780 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_affectationObjet785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_affectationObjet790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation828 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_valAggregation832 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_valAggregation875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_valAggregation882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_definition915 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_definition919 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSEQUENCES_KW_in_consequences945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_list_in_consequences949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_consequ_in_consequ_list977 = new BitSet(new long[]{0xF800002002000002L,0x04006000000009F9L,0x0000000001E00000L});
    public static final BitSet FOLLOW_siAlors_in_consequ1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_action1079 = new BitSet(new long[]{0x8000000000000000L,0x000000400000F010L});
    public static final BitSet FOLLOW_actionObjet_in_action1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1088 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1090 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1097 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mode_mute_in_action1132 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOP_KW_in_action1149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_transformation_in_action1159 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_action1162 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_action1165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1174 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1189 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_action1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action1210 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_action1213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAcces1243 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeAcces1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeDestination1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coordinates_in_typeDestination1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1306 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_actionObjet1309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1322 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_actionObjet1325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_actionObjet1335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_KW_in_coordinates1406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_coordinates1410 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_coordinates1415 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_coordinates1420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_commande1454 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_actionCommande_list_in_commande1457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionCommande_in_actionCommande_list1475 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande1495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_actionCommande1497 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande1508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1510 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1669 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1704 = new BitSet(new long[]{0x0000000000000000L,0x0000030018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande1769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande1780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_typeCommand1805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_typeCommand1807 = new BitSet(new long[]{0x0000000000000008L,0x00000003FE000000L});
    public static final BitSet FOLLOW_KEY_KW_in_typeCommand1816 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_typeCommand1818 = new BitSet(new long[]{0x0000000000000008L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1846 = new BitSet(new long[]{0x7800000002C00000L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1849 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1852 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_declencheur1873 = new BitSet(new long[]{0x0000000000000000L,0x01B4000000001000L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1910 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_VAR_KW_in_declencheur1928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_declencheur1930 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_ID_KW_in_declencheur1941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1943 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_declencheur0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2035 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2038 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2053 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2057 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2079 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2082 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2086 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2094 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2097 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2101 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors2128 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_siAlors2133 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_consequences_in_siAlors2138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_KW_in_conditions2172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_conditions2177 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_conditions2183 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_conditions2197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions2201 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_conditions2206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_conditions2220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions2224 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_conditions2229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_conditions2243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2247 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_conditions2266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2270 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_conditions2289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2293 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2298 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEG_in_conditions2312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2316 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPED_in_conditions2335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2339 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIFF_in_conditions2358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2362 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_etat_in_conditions2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2402 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2406 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2411 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2425 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2429 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2434 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2448 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2452 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2457 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2461 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2471 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2475 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2480 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2484 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2494 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2498 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2503 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2517 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2521 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2526 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2540 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2544 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2549 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2563 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2578 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2592 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2606 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000006L});
    public static final BitSet FOLLOW_NOT_in_etat2610 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000006L});
    public static final BitSet FOLLOW_mode_mute_in_etat2614 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2624 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2639 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mode_mute0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2702 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2723 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2744 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_affectation2763 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_iaBasique2793 = new BitSet(new long[]{0x8000000000000000L,0x000000400000F010L});
    public static final BitSet FOLLOW_actionObjetList_in_iaBasique2796 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionObjet_in_actionObjetList2811 = new BitSet(new long[]{0x8000000000000002L,0x000000400000F010L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2841 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_operation2865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2867 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_operation2887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2889 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_operation2909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2911 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2914 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation2931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2933 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2936 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_operation2953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2955 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_operation2975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2977 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2980 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_operation3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operation3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable3056 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3060 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_variable3077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3082 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3087 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Z_in_variable3099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3101 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_I_KW_in_variable3120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable3124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GAME_SCORE_KW_in_variable3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_KW_in_variable3145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_variable3149 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ALL_in_accesClass3188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeObjet_in_accesClass3206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_accesClass3224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_accesClass3240 = new BitSet(new long[]{0x003C482000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_notAccess_in_accesClass3242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accesClass3261 = new BitSet(new long[]{0x0000000400105008L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_accesClass3265 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLAYER_in_accesClass3284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeObjet_in_notAccess3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_notAccess3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_notAccess3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITION_in_typeCoordonnees3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORIENTATION_in_typeCoordonnees3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_typeCoordonnees3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_timeUnit3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEC_in_timeUnit3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MS_in_timeUnit3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAME_in_timeUnit3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeObjet0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOST_INTERVAL_in_attributTps3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOOT_INTERVAL_in_attributTps3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOAD_TIME_in_attributTps3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}