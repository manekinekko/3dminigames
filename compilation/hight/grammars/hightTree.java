// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g 2011-02-23 16:20:59

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "ACCESS_KW", "KEY_KW", "MOUSE_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "TURNBASED_KW", "WORLD_KW", "GRIDSIZE_KW", "NAME_KW", "GENERIC", "GRID", "RIBBON", "IDENT", "TYPE", "IS", "AND", "INSERT_KW", "IN", "NUM", "REMOVE_KW", "FROM", "LIST_KW", "OF", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "PLAYER", "SOLO", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DBP", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "NEXTURN_KW", "GRASPS_KW", "EXPELS_KW", "BY", "INGESTS_KW", "DIES_KW", "DURING", "UNTIL", "HAPPENS", "EQUIP", "NEXT", "PREVIOUS", "JUMP", "MOVE", "LEFT", "RIGHT", "FORWARD", "BACKWARD", "WUP", "WDOWN", "TURN", "CLOCKWISE", "ANTICLOCKWISE", "ACCELERATE", "BRAKE", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "FOR", "MOUSE", "KEY", "PRESSED_KW", "HELD_KW", "RELEASED_KW", "CLICK_LEFT", "CLICK_MIDDLE", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OWNES_KW", "NOTOWNES_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "OWNED_KW", "NOTOWNED_KW", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "CONTAINS_KW", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "WITH", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "DISTANCE_KW", "ANGLE_KW", "X", "Y", "Z", "SCORE", "VALUE", "ALL", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "RELOAD_KW", "TIME", "WS", "'true'", "'false'", "COUNTER"
    };
    public static final int EOF=-1;
    public static final int T__221=221;
    public static final int T__222=222;
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
    public static final int TURNBASED_KW=35;
    public static final int WORLD_KW=36;
    public static final int GRIDSIZE_KW=37;
    public static final int NAME_KW=38;
    public static final int GENERIC=39;
    public static final int GRID=40;
    public static final int RIBBON=41;
    public static final int IDENT=42;
    public static final int TYPE=43;
    public static final int IS=44;
    public static final int AND=45;
    public static final int INSERT_KW=46;
    public static final int IN=47;
    public static final int NUM=48;
    public static final int REMOVE_KW=49;
    public static final int FROM=50;
    public static final int LIST_KW=51;
    public static final int OF=52;
    public static final int CAMERA=53;
    public static final int PERSON=54;
    public static final int FREE=55;
    public static final int MEDIA=56;
    public static final int LOOP=57;
    public static final int ONCE=58;
    public static final int PLAYER=59;
    public static final int SOLO=60;
    public static final int DUPLICABLE=61;
    public static final int FIRST=62;
    public static final int THIRD=63;
    public static final int DEFINITION_KW=64;
    public static final int MEANS=65;
    public static final int VICTORY_KW=66;
    public static final int DBP=67;
    public static final int DEFEAT_KW=68;
    public static final int ENDS_KW=69;
    public static final int STARTS_KW=70;
    public static final int PAUSE_KW=71;
    public static final int MUTE_KW=72;
    public static final int ON=73;
    public static final int OFF=74;
    public static final int PLAY_KW=75;
    public static final int STOP_KW=76;
    public static final int BLOCK_KW=77;
    public static final int EFFACE_KW=78;
    public static final int GENERATE_KW=79;
    public static final int WAIT_KW=80;
    public static final int THEN=81;
    public static final int ENDWAIT=82;
    public static final int SAVE_KW=83;
    public static final int NEXTURN_KW=84;
    public static final int GRASPS_KW=85;
    public static final int EXPELS_KW=86;
    public static final int BY=87;
    public static final int INGESTS_KW=88;
    public static final int DIES_KW=89;
    public static final int DURING=90;
    public static final int UNTIL=91;
    public static final int HAPPENS=92;
    public static final int EQUIP=93;
    public static final int NEXT=94;
    public static final int PREVIOUS=95;
    public static final int JUMP=96;
    public static final int MOVE=97;
    public static final int LEFT=98;
    public static final int RIGHT=99;
    public static final int FORWARD=100;
    public static final int BACKWARD=101;
    public static final int WUP=102;
    public static final int WDOWN=103;
    public static final int TURN=104;
    public static final int CLOCKWISE=105;
    public static final int ANTICLOCKWISE=106;
    public static final int ACCELERATE=107;
    public static final int BRAKE=108;
    public static final int TRANSLATION=109;
    public static final int ROTATION=110;
    public static final int SCALE=111;
    public static final int COMMAND_KW=112;
    public static final int FOR=113;
    public static final int MOUSE=114;
    public static final int KEY=115;
    public static final int PRESSED_KW=116;
    public static final int HELD_KW=117;
    public static final int RELEASED_KW=118;
    public static final int CLICK_LEFT=119;
    public static final int CLICK_MIDDLE=120;
    public static final int CLICK_RIGHT=121;
    public static final int SCROLL_UP=122;
    public static final int SCROLL_DOWN=123;
    public static final int LETTER=124;
    public static final int SPACE=125;
    public static final int ESCAPE=126;
    public static final int ENTER=127;
    public static final int ACTIVATE_KW=128;
    public static final int DISABLE_KW=129;
    public static final int COMMANDS=130;
    public static final int KEYBOARD=131;
    public static final int RULE_KW=132;
    public static final int MOVES_KW=133;
    public static final int BECOMES=134;
    public static final int TOUCHES_KW=135;
    public static final int KILLS_KW=136;
    public static final int OWNES_KW=137;
    public static final int NOTOWNES_KW=138;
    public static final int OTHER=139;
    public static final int KILLED_KW=140;
    public static final int TOUCHED_KW=141;
    public static final int OWNED_KW=142;
    public static final int NOTOWNED_KW=143;
    public static final int IF_KW=144;
    public static final int ELSE=145;
    public static final int ENDIF=146;
    public static final int NOT=147;
    public static final int OR=148;
    public static final int COMP=149;
    public static final int EQUALS=150;
    public static final int INF=151;
    public static final int SUP=152;
    public static final int INFEG=153;
    public static final int SUPED=154;
    public static final int DIFF=155;
    public static final int PG=156;
    public static final int PD=157;
    public static final int CONTAINS_KW=158;
    public static final int DEAD_KW=159;
    public static final int ALIVE_KW=160;
    public static final int EFFACED_KW=161;
    public static final int GENERATED_KW=162;
    public static final int TOUCHING_KW=163;
    public static final int MOVING_KW=164;
    public static final int WAITING_KW=165;
    public static final int FINISHED_KW=166;
    public static final int STARTED_KW=167;
    public static final int PAUSED_KW=168;
    public static final int MUTED_KW=169;
    public static final int PLAYED_KW=170;
    public static final int STOPPED_KW=171;
    public static final int ASSIGN_KW=172;
    public static final int ADD_KW=173;
    public static final int SUB_KW=174;
    public static final int INVERT_KW=175;
    public static final int WITH=176;
    public static final int IA_KW=177;
    public static final int RANDOM_KW=178;
    public static final int BETWEEN=179;
    public static final int PLUS=180;
    public static final int MINUS=181;
    public static final int MUL=182;
    public static final int DIV=183;
    public static final int MOD=184;
    public static final int POW=185;
    public static final int DISTANCE_KW=186;
    public static final int ANGLE_KW=187;
    public static final int X=188;
    public static final int Y=189;
    public static final int Z=190;
    public static final int SCORE=191;
    public static final int VALUE=192;
    public static final int ALL=193;
    public static final int POSITION=194;
    public static final int ORIENTATION=195;
    public static final int SIZE=196;
    public static final int MIN=197;
    public static final int SEC=198;
    public static final int MS=199;
    public static final int FRAME=200;
    public static final int BOOST_INTERVAL=201;
    public static final int SHOOT_INTERVAL=202;
    public static final int RELOAD_TIME=203;
    public static final int INVENTORY=204;
    public static final int EQUIPED_OBJECT=205;
    public static final int ENTRANCES=206;
    public static final int EXITS=207;
    public static final int DAMAGE_ZONE=208;
    public static final int COLLECTORS=209;
    public static final int TYPES_COLLECTORS=210;
    public static final int GENERATORS=211;
    public static final int TYPE_GENERATORS=212;
    public static final int BREAKERS=213;
    public static final int TYPES_BREAKERS=214;
    public static final int TELEPORTABLES=215;
    public static final int TYPES_TELEPORTABLES=216;
    public static final int COMMENT=217;
    public static final int RELOAD_KW=218;
    public static final int TIME=219;
    public static final int WS=220;
    public static final int COUNTER=223;

    // delegates
    // delegators


        public hightTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public hightTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return hightTree.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g"; }


        private int INT_PLAYER=1, INT_ALLY=2, INT_ENEMY=3, INT_NEUTRAL=4, INT_DUPLICABLE=10;
        private Hashtable<String, String> aggreg = new Hashtable<String, String>();



    // $ANTLR start "game"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:27:1: game[SymbolTable st] returns [Code c] : ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:28:27: ( ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:29:5: ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* )
            {
            match(input,GAME_KW,FOLLOW_GAME_KW_in_game70); 

            c.append(Code.genRefreshLoop());

            match(input, Token.DOWN, null); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:31:7: (gd= gameData[st] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME_ATTRIBUT_KW) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:31:7: gd= gameData[st]
                    {
                    pushFollow(FOLLOW_gameData_in_game85);
                    gd=gameData(st);

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:32:5: ( newType[st] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:32:5: newType[st]
            	    {
            	    pushFollow(FOLLOW_newType_in_game93);
            	    newType(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_initialization_in_game103);
            in=initialization(st);

            state._fsp--;


            	//st.print();
                    //System.out.println(in.getCode());
                    c.append(in);
                
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:40:5: (def= definition[st] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DEFINITION_KW) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:40:6: def= definition[st]
            	    {
            	    pushFollow(FOLLOW_definition_in_game125);
            	    def=definition(st);

            	    state._fsp--;


            	    	//System.out.println(def.getCode()+"\n");
            	            c.append(def);
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:47:8: (com= commande[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:47:8: com= commande[st]
            	    {
            	    pushFollow(FOLLOW_commande_in_game148);
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:47:26: (reg= reglesJeu[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:47:26: reg= reglesJeu[st]
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game154);
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:47:44: (ia= iaBasique[st] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IA_KW) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:47:44: ia= iaBasique[st]
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game160);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:53:1: gameData[SymbolTable st] returns [Code c] : ^( GAME_ATTRIBUT_KW attributGame_list[st] ) ;
    public final Code gameData(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:53:43: ( ^( GAME_ATTRIBUT_KW attributGame_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:54:5: ^( GAME_ATTRIBUT_KW attributGame_list[st] )
            {
            match(input,GAME_ATTRIBUT_KW,FOLLOW_GAME_ATTRIBUT_KW_in_gameData191); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_attributGame_list_in_gameData193);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:56:1: attributGame_list[SymbolTable st] returns [Code c] : ( attributGame[st] )+ ;
    public final Code attributGame_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:56:52: ( ( attributGame[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:57:5: ( attributGame[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:57:5: ( attributGame[st] )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==GRAVITY_KW||(LA7_0>=TURNBASED_KW && LA7_0<=NAME_KW)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:57:5: attributGame[st]
            	    {
            	    pushFollow(FOLLOW_attributGame_in_attributGame_list213);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:59:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) );
    public final Code attributGame(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:59:47: ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:60:2: ^( GRAVITY_KW FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame231); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame233); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:61:4: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame240); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame242); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame244); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame246); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:62:4: ^( TURNBASED_KW ( 'true' | 'false' ) )
                    {
                    match(input,TURNBASED_KW,FOLLOW_TURNBASED_KW_in_attributGame253); 

                    match(input, Token.DOWN, null); 
                    if ( (input.LA(1)>=221 && input.LA(1)<=222) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:63:4: ^( WORLD_KW mapType )
                    {
                    match(input,WORLD_KW,FOLLOW_WORLD_KW_in_attributGame266); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mapType_in_attributGame268);
                    mapType();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:64:4: ^( GRIDSIZE_KW FLOAT )
                    {
                    match(input,GRIDSIZE_KW,FOLLOW_GRIDSIZE_KW_in_attributGame275); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame277); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:65:4: ^( NAME_KW name )
                    {
                    match(input,NAME_KW,FOLLOW_NAME_KW_in_attributGame284); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_name_in_attributGame286);
                    name();

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
    // $ANTLR end "attributGame"


    // $ANTLR start "mapType"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:68:1: mapType returns [Integer i] : ( GENERIC | GRID | RIBBON );
    public final Integer mapType() throws RecognitionException {
        Integer i = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:68:28: ( GENERIC | GRID | RIBBON )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            if ( (input.LA(1)>=GENERIC && input.LA(1)<=RIBBON) ) {
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
        return i;
    }
    // $ANTLR end "mapType"


    // $ANTLR start "name"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:74:1: name returns [String s] : i= IDENT ;
    public final String name() throws RecognitionException {
        String s = null;

        CommonTree i=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:74:24: (i= IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:75:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_name342); 
            s = i.getText();

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
    // $ANTLR end "name"


    // $ANTLR start "newType"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:79:1: newType[SymbolTable st] : ^( TYPE i= IDENT ( subType[st,sub] )+ ) ;
    public final void newType(SymbolTable st) throws RecognitionException {
        CommonTree i=null;

        List<Model> sub = new ArrayList<Model>();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:80:54: ( ^( TYPE i= IDENT ( subType[st,sub] )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:81:5: ^( TYPE i= IDENT ( subType[st,sub] )+ )
            {
            match(input,TYPE,FOLLOW_TYPE_in_newType378); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_newType382); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:81:20: ( subType[st,sub] )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDENT||LA9_0==CAMERA||LA9_0==MEDIA||LA9_0==TIME||LA9_0==COUNTER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:81:20: subType[st,sub]
            	    {
            	    pushFollow(FOLLOW_subType_in_newType384);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:96:1: subType[SymbolTable st, List<Model> sub] : (i= IDENT | t= typeObjet );
    public final void subType(SymbolTable st, List<Model> sub) throws RecognitionException {
        CommonTree i=null;
        Model t = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:96:43: (i= IDENT | t= typeObjet )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==CAMERA||LA10_0==MEDIA||LA10_0==TIME||LA10_0==COUNTER) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:97:5: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_subType414); 

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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:111:7: t= typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_subType430);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:114:1: initialization[SymbolTable st] returns [Code c] : ( init[st] )+ ;
    public final Code initialization(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:114:49: ( ( init[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:115:5: ( init[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:115:5: ( init[st] )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=INIT_IS_KW && LA11_0<=INIT_HAS_KW)||LA11_0==INSERT_KW||LA11_0==REMOVE_KW) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:115:5: init[st]
            	    {
            	    pushFollow(FOLLOW_init_in_initialization453);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:1: init[SymbolTable st] returns [Code c] : ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) | ^( INSERT_KW IDENT IDENT ( operation[st] )? ) | ^( REMOVE_KW ( IDENT | operation[st] ) IDENT ) );
    public final Code init(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Pair<Model, Integer> d = null;

        ArrayList<Symbol> ac = null;

        ArrayList<Pair<String,AttributeValue>> ao = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:39: ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) | ^( INSERT_KW IDENT IDENT ( operation[st] )? ) | ^( REMOVE_KW ( IDENT | operation[st] ) IDENT ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case INIT_IS_KW:
                {
                alt14=1;
                }
                break;
            case INIT_HAS_KW:
                {
                alt14=2;
                }
                break;
            case INSERT_KW:
                {
                alt14=3;
                }
                break;
            case REMOVE_KW:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:160:5: ^( INIT_IS_KW i= IDENT d= declarationObjet[st] )
                    {
                    match(input,INIT_IS_KW,FOLLOW_INIT_IS_KW_in_init484); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_init488); 
                    pushFollow(FOLLOW_declarationObjet_in_init492);
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

                    	    if(duplicable==1)
                    		t.setDuplicable();

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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:190:7: ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] )
                    {
                    match(input,INIT_HAS_KW,FOLLOW_INIT_HAS_KW_in_init509); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_init513);
                    ac=accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_affectationObjet_list_in_init518);
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
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:212:7: ^( INSERT_KW IDENT IDENT ( operation[st] )? )
                    {
                    match(input,INSERT_KW,FOLLOW_INSERT_KW_in_init535); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_init537); 
                    match(input,IDENT,FOLLOW_IDENT_in_init539); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:212:31: ( operation[st] )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==GAME_SCORE_KW||LA12_0==VALUE_KW||LA12_0==VAR_I_KW||LA12_0==FLOAT||LA12_0==RANDOM_KW||(LA12_0>=PLUS && LA12_0<=POW)||(LA12_0>=X && LA12_0<=Z)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:212:31: operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_init541);
                            operation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:213:7: ^( REMOVE_KW ( IDENT | operation[st] ) IDENT )
                    {
                    match(input,REMOVE_KW,FOLLOW_REMOVE_KW_in_init553); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:213:19: ( IDENT | operation[st] )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==IDENT) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==GAME_SCORE_KW||LA13_0==VALUE_KW||LA13_0==VAR_I_KW||LA13_0==FLOAT||LA13_0==RANDOM_KW||(LA13_0>=PLUS && LA13_0<=POW)||(LA13_0>=X && LA13_0<=Z)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:213:20: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_init556); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:213:26: operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_init558);
                            operation(st);

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_init562); 

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
    // $ANTLR end "init"


    // $ANTLR start "declarationObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:217:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC te= typeEntity[st] (em= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER ( SOLO )? );
    public final Pair<Model, Integer> declarationObjet(SymbolTable st) throws RecognitionException {
        Pair<Model, Integer> p = null;

        Model te = null;

        Integer em = null;


        em=null;
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:218:20: ( ^( DEC te= typeEntity[st] (em= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER ( SOLO )? )
            int alt17=8;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:219:5: ^( DEC te= typeEntity[st] (em= dupli )? )
                    {
                    match(input,DEC,FOLLOW_DEC_in_declarationObjet595); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet599);
                    te=typeEntity(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:219:29: (em= dupli )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==DUPLICABLE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:219:30: em= dupli
                            {
                            pushFollow(FOLLOW_dupli_in_declarationObjet605);
                            em=dupli();

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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:226:7: ^( LIST_KW list_declaration[st] )
                    {
                    match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet623); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_declaration_in_declarationObjet625);
                    list_declaration(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:227:7: ^( CAMERA_KW PERSON view[st] )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet636); 

                    match(input, Token.DOWN, null); 
                    match(input,PERSON,FOLLOW_PERSON_in_declarationObjet638); 
                    pushFollow(FOLLOW_view_in_declarationObjet640);
                    view(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:228:7: ^( CAMERA_KW FREE )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet651); 

                    match(input, Token.DOWN, null); 
                    match(input,FREE,FOLLOW_FREE_in_declarationObjet653); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:229:7: ^( MEDIA_KW LOOP )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet663); 

                    match(input, Token.DOWN, null); 
                    match(input,LOOP,FOLLOW_LOOP_in_declarationObjet665); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:230:7: ^( MEDIA_KW ONCE )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet675); 

                    match(input, Token.DOWN, null); 
                    match(input,ONCE,FOLLOW_ONCE_in_declarationObjet677); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:231:7: ^( IN_KW IDENT )
                    {
                    match(input,IN_KW,FOLLOW_IN_KW_in_declarationObjet695); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declarationObjet697); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:232:7: PLAYER ( SOLO )?
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_declarationObjet717); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:232:14: ( SOLO )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==SOLO) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:232:15: SOLO
                            {
                            match(input,SOLO,FOLLOW_SOLO_in_declarationObjet720); 

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
        return p;
    }
    // $ANTLR end "declarationObjet"


    // $ANTLR start "list_declaration"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:235:1: list_declaration[SymbolTable st] returns [Code c] : ( ( operation[st] )? IDENT )+ ;
    public final Code list_declaration(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:235:51: ( ( ( operation[st] )? IDENT )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:236:5: ( ( operation[st] )? IDENT )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:236:5: ( ( operation[st] )? IDENT )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==GAME_SCORE_KW||LA19_0==VALUE_KW||LA19_0==VAR_I_KW||LA19_0==FLOAT||LA19_0==IDENT||LA19_0==RANDOM_KW||(LA19_0>=PLUS && LA19_0<=POW)||(LA19_0>=X && LA19_0<=Z)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:236:6: ( operation[st] )? IDENT
            	    {
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:236:6: ( operation[st] )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==GAME_SCORE_KW||LA18_0==VALUE_KW||LA18_0==VAR_I_KW||LA18_0==FLOAT||LA18_0==RANDOM_KW||(LA18_0>=PLUS && LA18_0<=POW)||(LA18_0>=X && LA18_0<=Z)) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:236:6: operation[st]
            	            {
            	            pushFollow(FOLLOW_operation_in_list_declaration747);
            	            operation(st);

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    match(input,IDENT,FOLLOW_IDENT_in_list_declaration751); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:239:1: typeEntity[SymbolTable st] returns [Model t] : i= IDENT ;
    public final Model typeEntity(SymbolTable st) throws RecognitionException {
        Model t = null;

        CommonTree i=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:239:46: (i= IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:240:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeEntity778); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:257:1: entityMode returns [Integer i] : ( PLAYER | d= dupli );
    public final Integer entityMode() throws RecognitionException {
        Integer i = null;

        Integer d = null;


        d=null;
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:258:19: ( PLAYER | d= dupli )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==PLAYER) ) {
                alt20=1;
            }
            else if ( (LA20_0==DUPLICABLE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:259:5: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_entityMode813); 
                    i=INT_PLAYER;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:261:7: d= dupli
                    {
                    pushFollow(FOLLOW_dupli_in_entityMode829);
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


    // $ANTLR start "dupli"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:264:1: dupli returns [Integer i] : DUPLICABLE ;
    public final Integer dupli() throws RecognitionException {
        Integer i = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:264:26: ( DUPLICABLE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:265:5: DUPLICABLE
            {
            match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli851); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:269:1: view[SymbolTable st] returns [Code c] : ( FIRST | THIRD );
    public final Code view(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:269:39: ( FIRST | THIRD )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:273:1: affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : (a= affectationObjet[st] )+ ;
    public final ArrayList<Pair<String,AttributeValue>> affectationObjet_list(SymbolTable st) throws RecognitionException {
        ArrayList<Pair<String,AttributeValue>> c = null;

        ArrayList<Pair<String,AttributeValue>> a = null;


        c = new ArrayList<Pair<String,AttributeValue>>();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:62: ( (a= affectationObjet[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:5: (a= affectationObjet[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:5: (a= affectationObjet[st] )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ALLOCATION_KW) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:6: a= affectationObjet[st]
            	    {
            	    pushFollow(FOLLOW_affectationObjet_in_affectationObjet_list917);
            	    a=affectationObjet(st);

            	    state._fsp--;

            	    c.addAll(a);

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:277:1: affectationObjet[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:277:142: ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) )
            int alt23=4;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ALLOCATION_KW) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case IDENT:
                        {
                        alt23=1;
                        }
                        break;
                    case POSITION:
                    case ORIENTATION:
                    case SIZE:
                        {
                        alt23=2;
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
                        alt23=3;
                        }
                        break;
                    case BOOST_INTERVAL:
                    case SHOOT_INTERVAL:
                    case RELOAD_TIME:
                        {
                        alt23=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:278:5: ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet945); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet949); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:278:31: (t= valAggregation[st] )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AGGREGATION_KW||(LA22_0>=221 && LA22_0<=222)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:278:31: t= valAggregation[st]
                            {
                            pushFollow(FOLLOW_valAggregation_in_affectationObjet953);
                            t=valAggregation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    	if(t==null){
                    	    AttributeValue av = new AttributeValue(new Code(i.getText()),AttributeValue.Type.AGGR);
                                c.add(new Pair<String,AttributeValue>(i.getText(),av));
                            } else{
                                c.add(new Pair<String,AttributeValue>(i.getText(),t));
                            }
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:287:7: ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet972); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_affectationObjet976);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_affectationObjet981);
                    coo=coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	String mode = tc.getCode();
                            if(mode.equals("position")){
                    	    c.add(new Pair<String,AttributeValue>("posX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
                                c.add(new Pair<String,AttributeValue>("posY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
                                c.add(new Pair<String,AttributeValue>("posZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
                            } else if(mode.equals("angle")){
                                c.add(new Pair<String,AttributeValue>("orX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
                                c.add(new Pair<String,AttributeValue>("orY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
                                c.add(new Pair<String,AttributeValue>("orZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
                            } else{
                                c.add(new Pair<String,AttributeValue>("tX", new AttributeValue(coo.x,AttributeValue.Type.NUMBER)));
                                c.add(new Pair<String,AttributeValue>("tY", new AttributeValue(coo.y,AttributeValue.Type.NUMBER)));
                                c.add(new Pair<String,AttributeValue>("tZ", new AttributeValue(coo.z,AttributeValue.Type.NUMBER)));
                            }
                        

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:304:7: ^( ALLOCATION_KW attributListeOuObjet[st] IDENT )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet999); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributListeOuObjet_in_affectationObjet1001);
                    attributListeOuObjet(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_affectationObjet1004); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:305:7: ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet1015); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_affectationObjet1019);
                    att=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_affectationObjet1024);
                    v=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_affectationObjet1029);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:312:1: valAggregation[SymbolTable st] returns [AttributeValue c] : ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' );
    public final AttributeValue valAggregation(SymbolTable st) throws RecognitionException {
        AttributeValue c = null;

        CommonTree i=null;
        Code o = null;

        String t = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:312:59: ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case AGGREGATION_KW:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==DOWN) ) {
                    int LA25_4 = input.LA(3);

                    if ( (LA25_4==IDENT) ) {
                        alt25=2;
                    }
                    else if ( (LA25_4==GAME_SCORE_KW||LA25_4==VALUE_KW||LA25_4==VAR_I_KW||LA25_4==FLOAT||LA25_4==RANDOM_KW||(LA25_4>=PLUS && LA25_4<=POW)||(LA25_4>=X && LA25_4<=Z)) ) {
                        alt25=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 221:
                {
                alt25=3;
                }
                break;
            case 222:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:313:5: ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation1066); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_valAggregation1070);
                    o=operation(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:313:39: (t= timeUnit[st] )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=MIN && LA24_0<=FRAME)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:313:39: t= timeUnit[st]
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1075);
                            t=timeUnit(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    	if(t!=null){
                    	    c= new AttributeValue(new Duration(o,t));
                            } else{
                                c=new AttributeValue(o, AttributeValue.Type.NUMBER);
                            }
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:321:6: ^( AGGREGATION_KW i= IDENT )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation1092); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1096); 

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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:331:7: 'true'
                    {
                    match(input,221,FOLLOW_221_in_valAggregation1111); 
                    c = new AttributeValue(true,"true");

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:332:7: 'false'
                    {
                    match(input,222,FOLLOW_222_in_valAggregation1121); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:337:1: definition[SymbolTable st] returns [Code c] : ^( DEFINITION_KW i= IDENT cons= consequences[st] ) ;
    public final Code definition(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code cons = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:337:69: ( ^( DEFINITION_KW i= IDENT cons= consequences[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:338:5: ^( DEFINITION_KW i= IDENT cons= consequences[st] )
            {
            match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1155); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definition1159); 
            pushFollow(FOLLOW_consequences_in_definition1163);
            cons=consequences(st);

            state._fsp--;


            match(input, Token.UP, null); 

            	String ident = i.getText();
            	if(st.get(ident)!=null) {
            	    System.out.println("l'ident "+ ident + " est deja defini");
            	    System.exit(-1);
            	} else {
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:352:1: consequences[SymbolTable st] returns [Code c] : ^( CONSEQUENCES_KW conslist= consequ_list[st] ) ;
    public final Code consequences(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code conslist = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:353:29: ( ^( CONSEQUENCES_KW conslist= consequ_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:354:5: ^( CONSEQUENCES_KW conslist= consequ_list[st] )
            {
            match(input,CONSEQUENCES_KW,FOLLOW_CONSEQUENCES_KW_in_consequences1203); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_consequ_list_in_consequences1207);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:360:1: consequ_list[SymbolTable st] returns [Code c] : (cons= consequ[st] )+ ;
    public final Code consequ_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code cons = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:361:29: ( (cons= consequ[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:362:5: (cons= consequ[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:362:5: (cons= consequ[st] )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ACCESS_KW||LA26_0==IDENT||LA26_0==VICTORY_KW||(LA26_0>=DEFEAT_KW && LA26_0<=MUTE_KW)||(LA26_0>=PLAY_KW && LA26_0<=WAIT_KW)||(LA26_0>=SAVE_KW && LA26_0<=EXPELS_KW)||LA26_0==INGESTS_KW||(LA26_0>=ACTIVATE_KW && LA26_0<=DISABLE_KW)||LA26_0==IF_KW||(LA26_0>=ASSIGN_KW && LA26_0<=INVERT_KW)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:362:6: cons= consequ[st]
            	    {
            	    pushFollow(FOLLOW_consequ_in_consequ_list1249);
            	    cons=consequ(st);

            	    state._fsp--;

            	     c.append(cons); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:365:1: consequ[SymbolTable st] returns [Code c] : (i= siAlors[st] | act= action[st] | a= affectation[st] | activCommande[st] | IDENT | ^( VICTORY_KW IDENT ( IDENT )? ) | ^( DEFEAT_KW IDENT ( IDENT )? ) );
    public final Code consequ(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code i = null;

        Code act = null;

        Code a = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:366:29: (i= siAlors[st] | act= action[st] | a= affectation[st] | activCommande[st] | IDENT | ^( VICTORY_KW IDENT ( IDENT )? ) | ^( DEFEAT_KW IDENT ( IDENT )? ) )
            int alt29=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt29=1;
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
            case NEXTURN_KW:
            case GRASPS_KW:
            case EXPELS_KW:
            case INGESTS_KW:
                {
                alt29=2;
                }
                break;
            case ASSIGN_KW:
            case ADD_KW:
            case SUB_KW:
            case INVERT_KW:
                {
                alt29=3;
                }
                break;
            case ACTIVATE_KW:
            case DISABLE_KW:
                {
                alt29=4;
                }
                break;
            case IDENT:
                {
                alt29=5;
                }
                break;
            case VICTORY_KW:
                {
                alt29=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:367:5: i= siAlors[st]
                    {
                    pushFollow(FOLLOW_siAlors_in_consequ1289);
                    i=siAlors(st);

                    state._fsp--;

                    c=i;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:369:7: act= action[st]
                    {
                    pushFollow(FOLLOW_action_in_consequ1306);
                    act=action(st);

                    state._fsp--;

                    c.append(act);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:371:7: a= affectation[st]
                    {
                    pushFollow(FOLLOW_affectation_in_consequ1323);
                    a=affectation(st);

                    state._fsp--;

                    c=a;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:372:7: activCommande[st]
                    {
                    pushFollow(FOLLOW_activCommande_in_consequ1334);
                    activCommande(st);

                    state._fsp--;



                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:373:7: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1345); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:374:7: ^( VICTORY_KW IDENT ( IDENT )? )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1354); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1356); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:374:26: ( IDENT )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==IDENT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:374:26: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_consequ1358); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:375:7: ^( DEFEAT_KW IDENT ( IDENT )? )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1369); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1371); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:375:25: ( IDENT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:375:25: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_consequ1373); 

                            }
                            break;

                    }


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
    // $ANTLR end "consequ"


    // $ANTLR start "action"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:378:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) );
    public final Code action(SymbolTable st) throws RecognitionException {
        Code c = null;

        ArrayList<Symbol> ta = null;

        Coordonnees td = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:379:28: ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) )
            int alt38=19;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:380:5: accesClass[st] actionObjet[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_action1405);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionObjet_in_action1408);
                    actionObjet(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:381:6: ^( ENDS_KW IDENT ( IDENT )? )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1417); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1419); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:381:22: ( IDENT )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:381:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1421); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:382:6: ^( ENDS_KW GAME ( IDENT )? )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1431); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1433); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:382:21: ( IDENT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENT) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:382:21: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1435); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:383:6: ^( STARTS_KW IDENT ( IDENT )? )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1445); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1447); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:383:24: ( IDENT )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENT) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:383:24: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1449); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:384:6: ^( STARTS_KW GAME ( IDENT )? )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1459); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1461); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:384:23: ( IDENT )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:384:23: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1463); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:385:6: ^( PAUSE_KW IDENT ( IDENT )? )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1473); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1475); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:385:23: ( IDENT )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==IDENT) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:385:23: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1477); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:386:6: ^( PAUSE_KW GAME ( IDENT )? )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1487); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1489); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:386:22: ( IDENT )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==IDENT) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:386:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1491); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                            c.append("\t");
                            c.append("pause();\n");
                        

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:391:6: ^( MUTE_KW mode_mute[st] IDENT )
                    {
                    match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1507); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mode_mute_in_action1509);
                    mode_mute(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_action1512); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:392:6: ^( PLAY_KW IDENT )
                    {
                    match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1521); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1523); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:393:6: ^( STOP_KW IDENT )
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_action1532); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1534); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:394:6: ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] )
                    {
                    match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1543); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_transformation_in_action1545);
                    transformation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_action1548);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_action1551);
                    coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:395:6: ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1561); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1563);
                    typeAcces(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:395:32: ( typeDestination[st] )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==COORDINATE_KW||LA36_0==ACCESS_KW) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:395:32: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1566);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:396:6: ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? )
                    {
                    match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1577); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1581);
                    ta=typeAcces(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:396:39: (td= typeDestination[st] )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==COORDINATE_KW||LA37_0==ACCESS_KW) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:396:39: td= typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1586);
                            td=typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    	for(Iterator<Symbol> it = ta.iterator() ; it.hasNext();) {
                    	    Symbol e = it.next();

                    	    //Erreur entité déja générée
                    	    if(!((Entity)e).getDuplicable() && (e.getGenerate()>=1)){
                    		System.out.println("L'entité " + e.getName() + " n'est pas duplicable!");
                    		System.exit(-1);
                    	    }
                    	    if(td!=null){
                    		e.getAttribute("posX").setCode(td.getX());
                    		e.getAttribute("posY").setCode(td.getY());
                    		e.getAttribute("posZ").setCode(td.getZ());
                    	    }
                    	    e.toGenerate();
                    	    c.append("\t");		c.append(Code.genEntity((Entity) e));
                    	    c.append("\t");		c.append(Code.genAddObject((Entity) e));
                    	}
                    	    // TO DO -> MOTEUR3D.addObject(idObject,urlObject, tabCoord, idParent)
                        

                    }
                    break;
                case 14 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:417:6: ^( WAIT_KW operation[st] timeUnit[st] consequences[st] )
                    {
                    match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1603); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_action1605);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_action1608);
                    timeUnit(st);

                    state._fsp--;

                    pushFollow(FOLLOW_consequences_in_action1611);
                    consequences(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:418:6: SAVE_KW
                    {
                    match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1620); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:419:6: ^( NEXTURN_KW IDENT )
                    {
                    match(input,NEXTURN_KW,FOLLOW_NEXTURN_KW_in_action1628); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1630); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:421:6: ^( GRASPS_KW IDENT IDENT )
                    {
                    match(input,GRASPS_KW,FOLLOW_GRASPS_KW_in_action1644); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1646); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1648); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:422:6: ^( EXPELS_KW IDENT IDENT operation[st] )
                    {
                    match(input,EXPELS_KW,FOLLOW_EXPELS_KW_in_action1657); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1659); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1661); 
                    pushFollow(FOLLOW_operation_in_action1663);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:423:6: ^( INGESTS_KW IDENT IDENT IDENT )
                    {
                    match(input,INGESTS_KW,FOLLOW_INGESTS_KW_in_action1673); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1675); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1677); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1679); 

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
    // $ANTLR end "action"


    // $ANTLR start "typeAcces"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:426:1: typeAcces[SymbolTable st] returns [ArrayList<Symbol> l] : (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) );
    public final ArrayList<Symbol> typeAcces(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> l = null;

        ArrayList<Symbol> ac = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:426:57: (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ACCESS_KW) ) {
                alt40=1;
            }
            else if ( (LA40_0==GAME_SCORE_KW||LA40_0==VALUE_KW||LA40_0==VAR_I_KW||LA40_0==FLOAT||LA40_0==RANDOM_KW||(LA40_0>=PLUS && LA40_0<=POW)||(LA40_0>=X && LA40_0<=Z)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:427:5: ac= accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeAcces1704);
                    ac=accesClass(st);

                    state._fsp--;

                    l=ac;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:428:7: operation[st] ( IDENT | accesClass[st] )
                    {
                    pushFollow(FOLLOW_operation_in_typeAcces1715);
                    operation(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:428:21: ( IDENT | accesClass[st] )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==IDENT) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==ACCESS_KW) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:428:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_typeAcces1719); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:428:30: accesClass[st]
                            {
                            pushFollow(FOLLOW_accesClass_in_typeAcces1723);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:431:1: typeDestination[SymbolTable st] returns [Coordonnees coord] : ( accesClass[st] | coo= coordinates[st] );
    public final Coordonnees typeDestination(SymbolTable st) throws RecognitionException {
        Coordonnees coord = null;

        Coordonnees coo = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:431:61: ( accesClass[st] | coo= coordinates[st] )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ACCESS_KW) ) {
                alt41=1;
            }
            else if ( (LA41_0==COORDINATE_KW) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:432:5: accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeDestination1750);
                    accesClass(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:433:7: coo= coordinates[st]
                    {
                    pushFollow(FOLLOW_coordinates_in_typeDestination1761);
                    coo=coordinates(st);

                    state._fsp--;

                    coord=coo;

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
        return coord;
    }
    // $ANTLR end "typeDestination"


    // $ANTLR start "actionObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:435:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );
    public final Code actionObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:435:46: ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) )
            int alt42=7;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:436:5: DIES_KW
                    {
                    match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1780); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:437:7: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1788);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:438:6: ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] )
                    {
                    match(input,DURING,FOLLOW_DURING_in_actionObjet1797); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1799);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_actionObjet1802);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_actionObjet1805);
                    timeUnit(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:439:6: ^( UNTIL actionCommandeMaintenue[st] conditions[st] )
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1815); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1817);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_actionObjet1820);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:440:6: ^( EQUIP accesClass[st] )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1830); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_actionObjet1832);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:441:6: ^( EQUIP NEXT )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1842); 

                    match(input, Token.DOWN, null); 
                    match(input,NEXT,FOLLOW_NEXT_in_actionObjet1844); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:442:6: ^( EQUIP PREVIOUS )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1853); 

                    match(input, Token.DOWN, null); 
                    match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1855); 

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


    // $ANTLR start "actionCommandePressee"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:445:1: actionCommandePressee[SymbolTable st] returns [Code c] : ^( JUMP operation[st] ) ;
    public final Code actionCommandePressee(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:445:56: ( ^( JUMP operation[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:446:3: ^( JUMP operation[st] )
            {
            match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1877); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_actionCommandePressee1879);
            operation(st);

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
    // $ANTLR end "actionCommandePressee"


    // $ANTLR start "actionCommandeMaintenue"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:449:1: actionCommandeMaintenue[SymbolTable st] returns [Code c] : ( ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) operation[st] ) | ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] ) | ^( ACCELERATE operation[st] ) | ^( BRAKE operation[st] ) );
    public final Code actionCommandeMaintenue(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:449:58: ( ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) operation[st] ) | ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] ) | ^( ACCELERATE operation[st] ) | ^( BRAKE operation[st] ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt43=1;
                }
                break;
            case TURN:
                {
                alt43=2;
                }
                break;
            case ACCELERATE:
                {
                alt43=3;
                }
                break;
            case BRAKE:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:450:3: ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) operation[st] )
                    {
                    match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1900); 

                    match(input, Token.DOWN, null); 
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=WDOWN) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1926);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:451:5: ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] )
                    {
                    match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1935); 

                    match(input, Token.DOWN, null); 
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLOCKWISE && input.LA(1)<=ANTICLOCKWISE) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1961);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:452:5: ^( ACCELERATE operation[st] )
                    {
                    match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1970); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1972);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:453:5: ^( BRAKE operation[st] )
                    {
                    match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1981); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1983);
                    operation(st);

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
    // $ANTLR end "actionCommandeMaintenue"


    // $ANTLR start "transformation"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:456:1: transformation[SymbolTable st] returns [Code c] : ( TRANSLATION | ROTATION | SCALE );
    public final Code transformation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:456:49: ( TRANSLATION | ROTATION | SCALE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:462:1: coordinates[SymbolTable st] returns [Coordonnees coo] : ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) ;
    public final Coordonnees coordinates(SymbolTable st) throws RecognitionException {
        Coordonnees coo = null;

        Code x = null;

        Code y = null;

        Code z = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:462:55: ( ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:463:5: ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] )
            {
            match(input,COORDINATE_KW,FOLLOW_COORDINATE_KW_in_coordinates2047); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_coordinates2051);
            x=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates2056);
            y=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates2061);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:471:1: commande[SymbolTable st] returns [Code c] : ^( COMMAND_KW i= IDENT player_list[st] actionCommande_list[st] ) ;
    public final Code commande(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:471:43: ( ^( COMMAND_KW i= IDENT player_list[st] actionCommande_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:472:5: ^( COMMAND_KW i= IDENT player_list[st] actionCommande_list[st] )
            {
            match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande2095); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_commande2099); 
            pushFollow(FOLLOW_player_list_in_commande2101);
            player_list(st);

            state._fsp--;

            pushFollow(FOLLOW_actionCommande_list_in_commande2104);
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


    // $ANTLR start "player_list"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:475:1: player_list[SymbolTable st] returns [Code c] : ( IDENT )+ ;
    public final Code player_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:475:46: ( ( IDENT )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:476:5: ( IDENT )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:476:5: ( IDENT )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==IDENT) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:476:5: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_player_list2128); 

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
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
    // $ANTLR end "player_list"


    // $ANTLR start "actionCommande_list"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:479:1: actionCommande_list[SymbolTable st] returns [Code c] : ( actionCommande[st] )+ ;
    public final Code actionCommande_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:479:53: ( ( actionCommande[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:480:2: ( actionCommande[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:480:2: ( actionCommande[st] )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=KEY_KW && LA45_0<=MOUSE_KW)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:480:2: actionCommande[st]
            	    {
            	    pushFollow(FOLLOW_actionCommande_in_actionCommande_list2147);
            	    actionCommande(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:483:1: actionCommande[SymbolTable st] returns [Code c] : ( ^( MOUSE_KW souris[st] commandMode definitionId ) | ^( KEY_KW clavier[st] commandMode definitionId ) );
    public final Code actionCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:483:49: ( ^( MOUSE_KW souris[st] commandMode definitionId ) | ^( KEY_KW clavier[st] commandMode definitionId ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==MOUSE_KW) ) {
                alt46=1;
            }
            else if ( (LA46_0==KEY_KW) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:484:5: ^( MOUSE_KW souris[st] commandMode definitionId )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande2170); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_souris_in_actionCommande2172);
                    souris(st);

                    state._fsp--;

                    pushFollow(FOLLOW_commandMode_in_actionCommande2175);
                    commandMode();

                    state._fsp--;

                    pushFollow(FOLLOW_definitionId_in_actionCommande2177);
                    definitionId();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:485:6: ^( KEY_KW clavier[st] commandMode definitionId )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande2186); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_clavier_in_actionCommande2188);
                    clavier(st);

                    state._fsp--;

                    pushFollow(FOLLOW_commandMode_in_actionCommande2191);
                    commandMode();

                    state._fsp--;

                    pushFollow(FOLLOW_definitionId_in_actionCommande2193);
                    definitionId();

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


    // $ANTLR start "commandMode"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:488:1: commandMode : ( PRESSED_KW | HELD_KW | RELEASED_KW );
    public final void commandMode() throws RecognitionException {
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:488:13: ( PRESSED_KW | HELD_KW | RELEASED_KW )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            if ( (input.LA(1)>=PRESSED_KW && input.LA(1)<=RELEASED_KW) ) {
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
    // $ANTLR end "commandMode"


    // $ANTLR start "definitionId"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:492:1: definitionId : IDENT ;
    public final void definitionId() throws RecognitionException {
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:492:14: ( IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:493:5: IDENT
            {
            match(input,IDENT,FOLLOW_IDENT_in_definitionId2236); 

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
    // $ANTLR end "definitionId"


    // $ANTLR start "souris"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:496:1: souris[SymbolTable st] returns [Code c] : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final Code souris(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:496:41: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLICK_LEFT && input.LA(1)<=SCROLL_DOWN) ) {
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:500:1: clavier[SymbolTable st] returns [Code c] : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final Code clavier(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:500:42: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
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


    // $ANTLR start "activCommande"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:504:1: activCommande[SymbolTable st] returns [Code c] : ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) );
    public final Code activCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:504:48: ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ACTIVATE_KW) ) {
                alt47=1;
            }
            else if ( (LA47_0==DISABLE_KW) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:505:5: ^( ACTIVATE_KW typeCommand[st] )
                    {
                    match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande2378); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande2380);
                    typeCommand(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:506:6: ^( DISABLE_KW typeCommand[st] )
                    {
                    match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande2390); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande2392);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:509:1: typeCommand[SymbolTable st] returns [Code c] : ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD );
    public final Code typeCommand(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:509:46: ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD )
            int alt50=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt50=1;
                }
                break;
            case MOUSE_KW:
                {
                alt50=2;
                }
                break;
            case KEY_KW:
                {
                alt50=3;
                }
                break;
            case KEYBOARD:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:510:5: COMMANDS
                    {
                    match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand2416); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:511:7: ^( MOUSE_KW ( souris[st] )* )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_typeCommand2425); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:511:18: ( souris[st] )*
                        loop48:
                        do {
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( ((LA48_0>=LEFT && LA48_0<=RIGHT)||(LA48_0>=WUP && LA48_0<=WDOWN)||(LA48_0>=CLICK_LEFT && LA48_0<=SCROLL_DOWN)) ) {
                                alt48=1;
                            }


                            switch (alt48) {
                        	case 1 :
                        	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:511:18: souris[st]
                        	    {
                        	    pushFollow(FOLLOW_souris_in_typeCommand2427);
                        	    souris(st);

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop48;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:512:7: ^( KEY_KW ( clavier[st] )+ )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_typeCommand2439); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:512:16: ( clavier[st] )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=LEFT && LA49_0<=RIGHT)||(LA49_0>=WUP && LA49_0<=WDOWN)||(LA49_0>=LETTER && LA49_0<=ENTER)) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:512:16: clavier[st]
                    	    {
                    	    pushFollow(FOLLOW_clavier_in_typeCommand2441);
                    	    clavier(st);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:513:7: KEYBOARD
                    {
                    match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand2452); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:515:1: reglesJeu[SymbolTable st] returns [Code c] : ^( RULE_KW ( IDENT )? declencheur[st] definitionId ) ;
    public final Code reglesJeu(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:515:44: ( ^( RULE_KW ( IDENT )? declencheur[st] definitionId ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:516:5: ^( RULE_KW ( IDENT )? declencheur[st] definitionId )
            {
            match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu2472); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:516:15: ( IDENT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==IDENT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:516:15: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_reglesJeu2474); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu2477);
            declencheur(st);

            state._fsp--;

            pushFollow(FOLLOW_definitionId_in_reglesJeu2480);
            definitionId();

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:519:1: declencheur[SymbolTable st] returns [Code c] : ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( VICTORY_KW ( PLAYER | IDENT ) ) | ^( DEFEAT_KW ( PLAYER | IDENT ) ) );
    public final Code declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:519:46: ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( VICTORY_KW ( PLAYER | IDENT ) ) | ^( DEFEAT_KW ( PLAYER | IDENT ) ) )
            int alt53=6;
            switch ( input.LA(1) ) {
            case ACCESS_KW:
                {
                alt53=1;
                }
                break;
            case ENDS_KW:
                {
                alt53=2;
                }
                break;
            case STARTS_KW:
                {
                alt53=3;
                }
                break;
            case BECOMES_VAR_KW:
                {
                alt53=4;
                }
                break;
            case VICTORY_KW:
                {
                alt53=5;
                }
                break;
            case DEFEAT_KW:
                {
                alt53=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:520:5: accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    {
                    pushFollow(FOLLOW_accesClass_in_declencheur2504);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:520:20: ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    int alt52=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt52=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt52=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                    case OWNES_KW:
                    case NOTOWNES_KW:
                        {
                        alt52=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
                    case OWNED_KW:
                    case NOTOWNED_KW:
                        {
                        alt52=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }

                    switch (alt52) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:520:21: MOVES_KW
                            {
                            match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur2508); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:520:32: DIES_KW
                            {
                            match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur2512); 

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:520:42: declencheurTK[st]
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur2516);
                            declencheurTK(st);

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:520:62: declencheurKT[st]
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur2521);
                            declencheurKT(st);

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:521:6: ^( ENDS_KW type_declencheur[st] )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur2531); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur2533);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:522:6: ^( STARTS_KW type_declencheur[st] )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur2543); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur2545);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:523:6: ^( BECOMES_VAR_KW variable[st] varOuNB[st] )
                    {
                    match(input,BECOMES_VAR_KW,FOLLOW_BECOMES_VAR_KW_in_declencheur2565); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_declencheur2567);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_varOuNB_in_declencheur2570);
                    varOuNB(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:524:6: ^( VICTORY_KW ( PLAYER | IDENT ) )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur2580); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==IDENT||input.LA(1)==PLAYER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:525:6: ^( DEFEAT_KW ( PLAYER | IDENT ) )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur2597); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==IDENT||input.LA(1)==PLAYER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


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
    // $ANTLR end "declencheur"


    // $ANTLR start "type_declencheur"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:528:1: type_declencheur[SymbolTable st] returns [Code c] : ( IDENT | GAME );
    public final Code type_declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:528:51: ( IDENT | GAME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:531:1: varOuNB[SymbolTable st] returns [Code c] : ( variable[st] | FLOAT );
    public final Code varOuNB(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:531:42: ( variable[st] | FLOAT )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==GAME_SCORE_KW||LA54_0==VALUE_KW||LA54_0==VAR_I_KW||(LA54_0>=X && LA54_0<=Z)) ) {
                alt54=1;
            }
            else if ( (LA54_0==FLOAT) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:532:5: variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_varOuNB2650);
                    variable(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:532:20: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2655); 

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


    // $ANTLR start "declencheurTK"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:534:1: declencheurTK[SymbolTable st] returns [Code c] : ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) | ^( OWNES_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNES_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurTK(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:534:49: ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) | ^( OWNES_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNES_KW ( OTHER )? accesClass[st] ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case TOUCHES_KW:
                {
                alt59=1;
                }
                break;
            case KILLS_KW:
                {
                alt59=2;
                }
                break;
            case OWNES_KW:
                {
                alt59=3;
                }
                break;
            case NOTOWNES_KW:
                {
                alt59=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:535:5: ^( TOUCHES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2674); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:535:18: ( OTHER )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==OTHER) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:535:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2677); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2681);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:536:7: ^( KILLS_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2692); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:536:18: ( OTHER )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==OTHER) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:536:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2695); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2699);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:537:7: ^( OWNES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,OWNES_KW,FOLLOW_OWNES_KW_in_declencheurTK2710); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:537:18: ( OTHER )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==OTHER) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:537:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2713); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2717);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:538:7: ^( NOTOWNES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,NOTOWNES_KW,FOLLOW_NOTOWNES_KW_in_declencheurTK2728); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:538:21: ( OTHER )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==OTHER) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:538:22: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2731); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2735);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:543:1: declencheurKT[SymbolTable st] returns [Code c] : ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) | ^( OWNED_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNED_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurKT(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:543:49: ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) | ^( OWNED_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNED_KW ( OTHER )? accesClass[st] ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case KILLED_KW:
                {
                alt64=1;
                }
                break;
            case TOUCHED_KW:
                {
                alt64=2;
                }
                break;
            case OWNED_KW:
                {
                alt64=3;
                }
                break;
            case NOTOWNED_KW:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:544:5: ^( KILLED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2765); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:544:17: ( OTHER )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==OTHER) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:544:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2768); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2772);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:545:7: ^( TOUCHED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2783); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:545:20: ( OTHER )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==OTHER) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:545:21: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2786); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2790);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:546:7: ^( OWNED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,OWNED_KW,FOLLOW_OWNED_KW_in_declencheurKT2801); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:546:18: ( OTHER )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==OTHER) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:546:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2804); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2808);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:547:7: ^( NOTOWNED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,NOTOWNED_KW,FOLLOW_NOTOWNED_KW_in_declencheurKT2819); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:547:21: ( OTHER )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==OTHER) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:547:22: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2822); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2826);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:551:1: siAlors[SymbolTable st] returns [Code c] : ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? ) ;
    public final Code siAlors(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code cond = null;

        Code r1 = null;

        Code r2 = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:551:42: ( ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:552:5: ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? )
            {
            match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2856); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_conditions_in_siAlors2860);
            cond=conditions(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_siAlors2865);
            r1=consequences(st);

            state._fsp--;

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:552:55: (r2= consequences[st] )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==CONSEQUENCES_KW) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:552:55: r2= consequences[st]
                    {
                    pushFollow(FOLLOW_consequences_in_siAlors2870);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:556:1: conditions[SymbolTable st] returns [Code c] : ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] );
    public final Code conditions(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree not=null;
        Code cond = null;

        Code cond1 = null;

        Code cond2 = null;


        not=null;
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:557:21: ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] )
            int alt67=10;
            switch ( input.LA(1) ) {
            case CONDITION_KW:
                {
                alt67=1;
                }
                break;
            case OR:
                {
                alt67=2;
                }
                break;
            case AND:
                {
                alt67=3;
                }
                break;
            case EQUALS:
                {
                alt67=4;
                }
                break;
            case INF:
                {
                alt67=5;
                }
                break;
            case SUP:
                {
                alt67=6;
                }
                break;
            case INFEG:
                {
                alt67=7;
                }
                break;
            case SUPED:
                {
                alt67=8;
                }
                break;
            case DIFF:
                {
                alt67=9;
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
                alt67=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:558:5: ^( CONDITION_KW (not= NOT )? cond= conditions[st] )
                    {
                    match(input,CONDITION_KW,FOLLOW_CONDITION_KW_in_conditions2910); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:558:20: (not= NOT )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NOT) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:558:21: not= NOT
                            {
                            not=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions2915); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditions_in_conditions2921);
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:566:6: ^( OR cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,OR,FOLLOW_OR_in_conditions2937); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions2941);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions2946);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genOr(cond1,cond2);
                        

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:570:6: ^( AND cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,AND,FOLLOW_AND_in_conditions2962); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions2966);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions2971);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genAnd(cond1,cond2);
                        

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:574:6: ^( EQUALS cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_conditions2987); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2991);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2996);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genEquals(cond1,cond2);
                        

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:578:6: ^( INF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INF,FOLLOW_INF_in_conditions3012); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3016);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3021);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInf(cond1,cond2);
                        

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:582:6: ^( SUP cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUP,FOLLOW_SUP_in_conditions3037); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3041);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3046);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSup(cond1,cond2);
                        

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:586:6: ^( INFEG cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INFEG,FOLLOW_INFEG_in_conditions3062); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3066);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3071);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInfEg(cond1,cond2);
                        

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:590:6: ^( SUPED cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUPED,FOLLOW_SUPED_in_conditions3087); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3091);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3096);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSupEg(cond1,cond2);
                        

                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:594:6: ^( DIFF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,DIFF,FOLLOW_DIFF_in_conditions3112); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3116);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3121);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genDiff(cond1,cond2);
                        

                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:598:7: etat[st]
                    {
                    pushFollow(FOLLOW_etat_in_conditions3137);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:601:1: etat[SymbolTable st] returns [Code c] : ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | ^( VICTORY_KW IDENT ) | ^( DEFEAT_KW IDENT ) );
    public final Code etat(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:601:39: ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | ^( VICTORY_KW IDENT ) | ^( DEFEAT_KW IDENT ) )
            int alt88=15;
            switch ( input.LA(1) ) {
            case DEAD_KW:
                {
                alt88=1;
                }
                break;
            case ALIVE_KW:
                {
                alt88=2;
                }
                break;
            case EFFACED_KW:
                {
                alt88=3;
                }
                break;
            case GENERATED_KW:
                {
                alt88=4;
                }
                break;
            case TOUCHING_KW:
                {
                alt88=5;
                }
                break;
            case MOVING_KW:
                {
                alt88=6;
                }
                break;
            case WAITING_KW:
                {
                alt88=7;
                }
                break;
            case FINISHED_KW:
                {
                alt88=8;
                }
                break;
            case STARTED_KW:
                {
                alt88=9;
                }
                break;
            case PAUSED_KW:
                {
                alt88=10;
                }
                break;
            case MUTED_KW:
                {
                alt88=11;
                }
                break;
            case PLAYED_KW:
                {
                alt88=12;
                }
                break;
            case STOPPED_KW:
                {
                alt88=13;
                }
                break;
            case VICTORY_KW:
                {
                alt88=14;
                }
                break;
            case DEFEAT_KW:
                {
                alt88=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:602:5: ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat3159); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3161);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:602:30: ( NOT )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==NOT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:602:31: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3165); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:602:37: ( OTHER )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==OTHER) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:602:38: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3170); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3174);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:603:7: ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat3185); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3187);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:603:33: ( NOT )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NOT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:603:34: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3191); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:603:40: ( OTHER )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==OTHER) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:603:41: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3196); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3200);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:604:7: ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat3211); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3213);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:604:35: ( NOT )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NOT) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:604:36: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3217); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:604:42: ( OTHER )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==OTHER) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:604:43: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3222); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3226);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:605:7: ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat3237); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3239);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:605:37: ( NOT )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NOT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:605:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3243); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:605:44: ( OTHER )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==OTHER) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:605:45: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3248); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3252);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:606:7: ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat3263); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3265);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:606:36: ( NOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NOT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:606:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3269); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:606:43: ( OTHER )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==OTHER) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:606:44: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3274); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3278);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:607:7: ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat3289); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3291);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:607:34: ( NOT )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NOT) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:607:35: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3295); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:607:41: ( OTHER )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==OTHER) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:607:42: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3300); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3304);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:608:7: ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat3315); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3317);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:608:35: ( NOT )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NOT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:608:36: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3321); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:608:42: ( OTHER )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==OTHER) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:608:43: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3326); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3330);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:609:7: ^( FINISHED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat3341); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3343);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:609:42: ( NOT )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==NOT) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:609:43: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3347); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:610:7: ^( STARTED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat3359); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3361);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:610:40: ( NOT )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NOT) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:610:41: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3364); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:611:7: ^( PAUSED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat3376); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3378);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:611:39: ( NOT )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NOT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:611:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3381); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:612:7: ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] )
                    {
                    match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat3393); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3395);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:612:39: ( NOT )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==NOT) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:612:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3399); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mode_mute_in_etat3403);
                    mode_mute(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:613:7: ^( PLAYED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat3414); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3416);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:613:40: ( NOT )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==NOT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:613:41: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3420); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:614:7: ^( STOPPED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat3432); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3434);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:614:41: ( NOT )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==NOT) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:614:42: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3438); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:616:7: ^( VICTORY_KW IDENT )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat3455); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_etat3457); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:617:7: ^( DEFEAT_KW IDENT )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat3467); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_etat3469); 

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
    // $ANTLR end "etat"


    // $ANTLR start "mode_mute"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:620:1: mode_mute[SymbolTable st] returns [Code c] : ( ON | OFF );
    public final Code mode_mute(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:620:44: ( ON | OFF )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:623:1: affectation[SymbolTable st] returns [Code c] : ( ^( ASSIGN_KW i1= operation[st] i2= variable[st] ) | ^( ADD_KW o= operation[st] v= variable[st] ) | ^( SUB_KW op= operation[st] var= variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) );
    public final Code affectation(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code i1 = null;

        Code i2 = null;

        Code o = null;

        Code v = null;

        Code op = null;

        Code var = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:623:46: ( ^( ASSIGN_KW i1= operation[st] i2= variable[st] ) | ^( ADD_KW o= operation[st] v= variable[st] ) | ^( SUB_KW op= operation[st] var= variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) )
            int alt89=4;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt89=1;
                }
                break;
            case ADD_KW:
                {
                alt89=2;
                }
                break;
            case SUB_KW:
                {
                alt89=3;
                }
                break;
            case INVERT_KW:
                {
                alt89=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:624:5: ^( ASSIGN_KW i1= operation[st] i2= variable[st] )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation3516); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3520);
                    i1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3525);
                    i2=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	c = Code.genAffect(i2,i1);
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:628:6: ^( ADD_KW o= operation[st] v= variable[st] )
                    {
                    match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation3541); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3545);
                    o=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3550);
                    v=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genIncr(v,o);
                        

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:632:6: ^( SUB_KW op= operation[st] var= variable[st] )
                    {
                    match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation3566); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3570);
                    op=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3575);
                    var=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSub(var,op);
                        

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:636:6: ^( INVERT_KW variable[st] variable[st] )
                    {
                    match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation3591); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_affectation3593);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3596);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:642:1: iaBasique[SymbolTable st] returns [Code c] : ^( IA_KW IDENT ( reglesJeu[st] )+ ) ;
    public final Code iaBasique(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:642:44: ( ^( IA_KW IDENT ( reglesJeu[st] )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:643:5: ^( IA_KW IDENT ( reglesJeu[st] )+ )
            {
            match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique3630); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_iaBasique3632); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:643:19: ( reglesJeu[st] )+
            int cnt90=0;
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==RULE_KW) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:643:19: reglesJeu[st]
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_iaBasique3634);
            	    reglesJeu(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt90 >= 1 ) break loop90;
                        EarlyExitException eee =
                            new EarlyExitException(90, input);
                        throw eee;
                }
                cnt90++;
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
    // $ANTLR end "iaBasique"


    // $ANTLR start "operation"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:647:1: operation[SymbolTable st] returns [Code c] : ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st] | f= FLOAT );
    public final Code operation(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree f=null;
        Code c1 = null;

        Code c2 = null;

        Code v = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:647:44: ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st] | f= FLOAT )
            int alt91=9;
            switch ( input.LA(1) ) {
            case RANDOM_KW:
                {
                alt91=1;
                }
                break;
            case PLUS:
                {
                alt91=2;
                }
                break;
            case MINUS:
                {
                alt91=3;
                }
                break;
            case MUL:
                {
                alt91=4;
                }
                break;
            case DIV:
                {
                alt91=5;
                }
                break;
            case MOD:
                {
                alt91=6;
                }
                break;
            case POW:
                {
                alt91=7;
                }
                break;
            case GAME_SCORE_KW:
            case VALUE_KW:
            case VAR_I_KW:
            case X:
            case Y:
            case Z:
                {
                alt91=8;
                }
                break;
            case FLOAT:
                {
                alt91=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:648:5: ^( RANDOM_KW c1= operation[st] c2= operation[st] )
                    {
                    match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation3658); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3663);
                    c1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3669);
                    c2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genRD(c1,c2);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:650:6: ^( PLUS operation[st] operation[st] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_operation3685); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3687);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3690);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPLUS(c1,c2);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:652:6: ^( MINUS operation[st] operation[st] )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_operation3706); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3708);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3711);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMINUS(c1,c2);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:654:6: ^( MUL operation[st] operation[st] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_operation3727); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3729);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3732);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMUL(c1,c2);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:656:6: ^( DIV operation[st] operation[st] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_operation3748); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3750);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3753);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genDIV(c1,c2);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:658:6: ^( MOD operation[st] operation[st] )
                    {
                    match(input,MOD,FOLLOW_MOD_in_operation3769); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3771);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3774);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMOD(c1,c2);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:660:6: ^( POW operation[st] operation[st] )
                    {
                    match(input,POW,FOLLOW_POW_in_operation3790); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3792);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3795);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPOW(c1,c2);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:662:6: v= variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_operation3814);
                    v=variable(st);

                    state._fsp--;

                    c = v;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:664:6: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_operation3832); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:669:1: variable[SymbolTable st] returns [Code c] : ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) );
    public final Code variable(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code tc = null;

        ArrayList<Symbol> sb = null;

        ArrayList<Symbol> e = null;

        String at = null;

        ArrayList<Symbol> ac = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:669:43: ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) )
            int alt92=6;
            switch ( input.LA(1) ) {
            case X:
                {
                alt92=1;
                }
                break;
            case Y:
                {
                alt92=2;
                }
                break;
            case Z:
                {
                alt92=3;
                }
                break;
            case VAR_I_KW:
                {
                alt92=4;
                }
                break;
            case GAME_SCORE_KW:
                {
                alt92=5;
                }
                break;
            case VALUE_KW:
                {
                alt92=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:670:5: ^( X tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,X,FOLLOW_X_in_variable3863); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3867);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3872);
                    sb=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	Symbol sy = sb.get(0);
                    	if(tc.equals("position")){
                    	    c = Code.genPosX(sy.getName());
                            }else if(tc.equals("angle")){
                                c = Code.genoRX(sy.getName());
                            }else{
                                c = Code.genTX(sy.getName());
                            }
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:681:6: ^( Y tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Y,FOLLOW_Y_in_variable3888); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3893);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3898);
                    sb=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	Symbol sy = sb.get(0);
                    	if(tc.equals("position")){
                    	    c = Code.genPosY(sy.getName());
                            }else if(tc.equals("angle")){
                                c = Code.genoRY(sy.getName());
                            }else{
                                c = Code.genTY(sy.getName());
                            }
                        

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:692:6: ^( Z typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Z,FOLLOW_Z_in_variable3914); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3916);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3921);
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:703:6: ^( VAR_I_KW i= IDENT e= accesClass[st] )
                    {
                    match(input,VAR_I_KW,FOLLOW_VAR_I_KW_in_variable3937); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variable3941); 
                    pushFollow(FOLLOW_accesClass_in_variable3945);
                    e=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	Symbol si = e.get(0);String ident= i.getText(); AttributeValue a = si.getAttribute(ident);
                    	if(a==null){
                    	    System.out.println(si.getName()+"n'a pas l'attribut"+ident);
                    	    System.exit(-1);
                    	}
                    	else if(a.getType()!= AttributeValue.Type.NUMBER){
                    	    System.out.println(ident+"n'est pas un nombre.");
                    	    System.exit(-1);
                    	}else{
                    	    c=Code.genAccess(si.getName(),ident);
                    	}
                        

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:717:6: GAME_SCORE_KW
                    {
                    match(input,GAME_SCORE_KW,FOLLOW_GAME_SCORE_KW_in_variable3960); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:718:6: ^( VALUE_KW at= attributTps[st] ac= accesClass[st] )
                    {
                    match(input,VALUE_KW,FOLLOW_VALUE_KW_in_variable3968); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_variable3972);
                    at=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3977);
                    ac=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	Symbol si = ac.get(0); AttributeValue a = si.getAttribute(at);
                    	if(a==null){
                    	    System.out.println(si.getName()+"n'a pas l'attribut"+at);
                    	    System.exit(-1);
                    	}
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:731:1: accesClass[SymbolTable st] returns [ArrayList<Symbol> sb] : ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW mo= typeObjet ) | ^( ACCESS_KW NOT notAccess[st] ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) );
    public final ArrayList<Symbol> accesClass(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> sb = null;

        CommonTree i=null;
        Model mo = null;

        Code co = null;


        sb = new ArrayList<Symbol>();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:731:96: ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW mo= typeObjet ) | ^( ACCESS_KW NOT notAccess[st] ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) )
            int alt94=5;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ACCESS_KW) ) {
                int LA94_1 = input.LA(2);

                if ( (LA94_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ALL:
                        {
                        alt94=1;
                        }
                        break;
                    case NOT:
                        {
                        alt94=3;
                        }
                        break;
                    case IDENT:
                        {
                        alt94=4;
                        }
                        break;
                    case PLAYER:
                        {
                        alt94=5;
                        }
                        break;
                    case CAMERA:
                    case MEDIA:
                    case TIME:
                    case COUNTER:
                        {
                        alt94=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:732:5: ^( ACCESS_KW ALL )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4013); 

                    match(input, Token.DOWN, null); 
                    match(input,ALL,FOLLOW_ALL_in_accesClass4015); 

                    match(input, Token.UP, null); 

                    	sb.add(Genre.player);sb.addAll(Genre.allies);sb.addAll(Genre.enemies);sb.addAll(Genre.neutral);
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:736:5: ^( ACCESS_KW mo= typeObjet )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4029); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeObjet_in_accesClass4033);
                    mo=typeObjet();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    sb.add(mo);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:738:5: ^( ACCESS_KW NOT notAccess[st] )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4047); 

                    match(input, Token.DOWN, null); 
                    match(input,NOT,FOLLOW_NOT_in_accesClass4049); 
                    pushFollow(FOLLOW_notAccess_in_accesClass4051);
                    notAccess(st);

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:740:5: ^( ACCESS_KW i= IDENT (co= operation[st] )? )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4066); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesClass4070); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:740:27: (co= operation[st] )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==GAME_SCORE_KW||LA93_0==VALUE_KW||LA93_0==VAR_I_KW||LA93_0==FLOAT||LA93_0==RANDOM_KW||(LA93_0>=PLUS && LA93_0<=POW)||(LA93_0>=X && LA93_0<=Z)) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:740:27: co= operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_accesClass4074);
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
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:749:5: ^( ACCESS_KW PLAYER )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4091); 

                    match(input, Token.DOWN, null); 
                    match(input,PLAYER,FOLLOW_PLAYER_in_accesClass4093); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:753:1: notAccess[SymbolTable st] returns [Code c] : ( typeObjet | PLAYER );
    public final Code notAccess(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:753:45: ( typeObjet | PLAYER )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==CAMERA||LA95_0==MEDIA||LA95_0==TIME||LA95_0==COUNTER) ) {
                alt95=1;
            }
            else if ( (LA95_0==PLAYER) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:754:1: typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_notAccess4117);
                    typeObjet();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:754:13: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_notAccess4121); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:756:1: typeCoordonnees[SymbolTable st] returns [Code c] : ( POSITION | ORIENTATION | SIZE );
    public final Code typeCoordonnees(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:756:50: ( POSITION | ORIENTATION | SIZE )
            int alt96=3;
            switch ( input.LA(1) ) {
            case POSITION:
                {
                alt96=1;
                }
                break;
            case ORIENTATION:
                {
                alt96=2;
                }
                break;
            case SIZE:
                {
                alt96=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:757:2: POSITION
                    {
                    match(input,POSITION,FOLLOW_POSITION_in_typeCoordonnees4137); 
                    c = new Code("position");

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:757:40: ORIENTATION
                    {
                    match(input,ORIENTATION,FOLLOW_ORIENTATION_in_typeCoordonnees4142); 
                    c = new Code("angle");

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:757:78: SIZE
                    {
                    match(input,SIZE,FOLLOW_SIZE_in_typeCoordonnees4147); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:760:1: timeUnit[SymbolTable st] returns [String c] : ( MIN | SEC | MS | FRAME );
    public final String timeUnit(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:760:45: ( MIN | SEC | MS | FRAME )
            int alt97=4;
            switch ( input.LA(1) ) {
            case MIN:
                {
                alt97=1;
                }
                break;
            case SEC:
                {
                alt97=2;
                }
                break;
            case MS:
                {
                alt97=3;
                }
                break;
            case FRAME:
                {
                alt97=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:761:2: MIN
                    {
                    match(input,MIN,FOLLOW_MIN_in_timeUnit4165); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:762:4: SEC
                    {
                    match(input,SEC,FOLLOW_SEC_in_timeUnit4170); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:763:4: MS
                    {
                    match(input,MS,FOLLOW_MS_in_timeUnit4175); 
                    c = "ms";

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:765:4: FRAME
                    {
                    match(input,FRAME,FOLLOW_FRAME_in_timeUnit4190); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:769:1: typeObjet returns [Model t] : ( CAMERA | MEDIA | COUNTER | TIME );
    public final Model typeObjet() throws RecognitionException {
        Model t = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:769:28: ( CAMERA | MEDIA | COUNTER | TIME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            if ( input.LA(1)==CAMERA||input.LA(1)==MEDIA||input.LA(1)==TIME||input.LA(1)==COUNTER ) {
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:776:1: attributTps[SymbolTable st] returns [String c] : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final String attributTps(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:776:48: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            int alt98=3;
            switch ( input.LA(1) ) {
            case BOOST_INTERVAL:
                {
                alt98=1;
                }
                break;
            case SHOOT_INTERVAL:
                {
                alt98=2;
                }
                break;
            case RELOAD_TIME:
                {
                alt98=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:777:2: BOOST_INTERVAL
                    {
                    match(input,BOOST_INTERVAL,FOLLOW_BOOST_INTERVAL_in_attributTps4238); 
                    c ="boostInterval";

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:778:4: SHOOT_INTERVAL
                    {
                    match(input,SHOOT_INTERVAL,FOLLOW_SHOOT_INTERVAL_in_attributTps4244); 
                    c = "shootInterval";

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:779:4: RELOAD_TIME
                    {
                    match(input,RELOAD_TIME,FOLLOW_RELOAD_TIME_in_attributTps4259); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:782:1: attributListeOuObjet[SymbolTable st] returns [Code c] : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final Code attributListeOuObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:782:55: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\40\1\2\4\uffff\1\42\1\3\2\uffff";
    static final String DFA8_maxS =
        "\1\46\1\2\4\uffff\2\42\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\2\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\2\uffff\1\2\1\3\1\4\1\5",
            "\1\6",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\10\36\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "59:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) );";
        }
    }
    static final String DFA17_eotS =
        "\15\uffff";
    static final String DFA17_eofS =
        "\15\uffff";
    static final String DFA17_minS =
        "\1\10\2\uffff\2\2\2\uffff\1\66\1\71\4\uffff";
    static final String DFA17_maxS =
        "\1\73\2\uffff\2\2\2\uffff\1\67\1\72\4\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\7\1\10\2\uffff\1\3\1\4\1\5\1\6";
    static final String DFA17_specialS =
        "\15\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\4\1\3\4\uffff\1\5\43\uffff\1\2\7\uffff\1\6",
            "",
            "",
            "\1\7",
            "\1\10",
            "",
            "",
            "\1\11\1\12",
            "\1\13\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "217:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC te= typeEntity[st] (em= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER ( SOLO )? );";
        }
    }
    static final String DFA38_eotS =
        "\32\uffff";
    static final String DFA38_eofS =
        "\32\uffff";
    static final String DFA38_minS =
        "\1\31\1\uffff\3\2\14\uffff\3\35\6\uffff";
    static final String DFA38_maxS =
        "\1\130\1\uffff\3\2\14\uffff\3\52\6\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\3\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA38_specialS =
        "\32\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1\53\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\1\7\1\10\1\11\1\12"+
            "\1\13\2\uffff\1\14\1\15\1\16\1\17\1\uffff\1\20",
            "",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\14\uffff\1\24",
            "\1\27\14\uffff\1\26",
            "\1\31\14\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "378:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) );";
        }
    }
    static final String DFA42_eotS =
        "\12\uffff";
    static final String DFA42_eofS =
        "\12\uffff";
    static final String DFA42_minS =
        "\1\131\4\uffff\1\2\1\31\3\uffff";
    static final String DFA42_maxS =
        "\1\140\4\uffff\1\2\1\137\3\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\6\1\7\1\5";
    static final String DFA42_specialS =
        "\12\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\1\1\3\1\4\1\uffff\1\5\2\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\6",
            "\1\11\104\uffff\1\7\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "435:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );";
        }
    }
 

    public static final BitSet FOLLOW_GAME_KW_in_game70 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gameData_in_game85 = new BitSet(new long[]{0x00024800000000C0L});
    public static final BitSet FOLLOW_newType_in_game93 = new BitSet(new long[]{0x00024800000000C0L});
    public static final BitSet FOLLOW_initialization_in_game103 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L});
    public static final BitSet FOLLOW_definition_in_game125 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L});
    public static final BitSet FOLLOW_commande_in_game148 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_game154 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0002000000000010L});
    public static final BitSet FOLLOW_iaBasique_in_game160 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_GAME_ATTRIBUT_KW_in_gameData191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributGame_list_in_gameData193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attributGame_in_attributGame_list213 = new BitSet(new long[]{0x0000007900000002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame242 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame244 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TURNBASED_KW_in_attributGame253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_attributGame255 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORLD_KW_in_attributGame266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mapType_in_attributGame268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRIDSIZE_KW_in_attributGame275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAME_KW_in_attributGame284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_name_in_attributGame286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_mapType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_name342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_newType378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_newType382 = new BitSet(new long[]{0x0120040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000088000000L});
    public static final BitSet FOLLOW_subType_in_newType384 = new BitSet(new long[]{0x0120040000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000088000000L});
    public static final BitSet FOLLOW_IDENT_in_subType414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_in_initialization453 = new BitSet(new long[]{0x00024800000000C2L});
    public static final BitSet FOLLOW_INIT_IS_KW_in_init484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init488 = new BitSet(new long[]{0x0808000000008700L});
    public static final BitSet FOLLOW_declarationObjet_in_init492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INIT_HAS_KW_in_init509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_init513 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_affectationObjet_list_in_init518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_KW_in_init535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init537 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init539 = new BitSet(new long[]{0x0000000400105008L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_init541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REMOVE_KW_in_init553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init556 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_operation_in_init558 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEC_in_declarationObjet595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet599 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_dupli_in_declarationObjet605 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet623 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_declaration_in_declarationObjet625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet638 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_view_in_declarationObjet640 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_KW_in_declarationObjet695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet697 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYER_in_declarationObjet717 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_SOLO_in_declarationObjet720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_list_declaration747 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_list_declaration751 = new BitSet(new long[]{0x0000040400105002L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectationObjet_in_affectationObjet_list917 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet949 = new BitSet(new long[]{0x0000000000080008L,0x0000000000000000L,0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_valAggregation_in_affectationObjet953 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_affectationObjet976 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_affectationObjet981 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet999 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_affectationObjet1001 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet1004 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet1015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_affectationObjet1019 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_affectationObjet1024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_affectationObjet1029 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation1066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_valAggregation1070 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation1092 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_221_in_valAggregation1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_valAggregation1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_definition1159 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_definition1163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSEQUENCES_KW_in_consequences1203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_list_in_consequences1207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_consequ_in_consequ_list1249 = new BitSet(new long[]{0x0000040002000002L,0x000000000179F9F4L,0x0000F00000010003L});
    public static final BitSet FOLLOW_siAlors_in_consequ1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_consequ1356 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_consequ1358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_consequ1371 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_consequ1373 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_action1405 = new BitSet(new long[]{0x0000000000000000L,0x000000012E000000L});
    public static final BitSet FOLLOW_actionObjet_in_action1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1419 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1433 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1447 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1461 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1475 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1489 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mode_mute_in_action1509 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1523 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOP_KW_in_action1532 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_transformation_in_action1545 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_action1548 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_action1551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1563 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1581 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_action1605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_action1608 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_action1611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXTURN_KW_in_action1628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRASPS_KW_in_action1644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1646 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPELS_KW_in_action1657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1659 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1661 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_action1663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INGESTS_KW_in_action1673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1675 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1677 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAcces1715 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeAcces1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeDestination1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coordinates_in_typeDestination1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1799 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionObjet1802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1815 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1817 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1820 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_actionObjet1832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1902 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1926 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1935 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1937 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1981 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_KW_in_coordinates2047 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_coordinates2051 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_coordinates2056 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_coordinates2061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande2095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_commande2099 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_player_list_in_commande2101 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_actionCommande_list_in_commande2104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_player_list2128 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_actionCommande_in_actionCommande_list2147 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande2170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_actionCommande2172 = new BitSet(new long[]{0x0000000000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2175 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande2186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_actionCommande2188 = new BitSet(new long[]{0x0000000000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2191 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_commandMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_definitionId2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande2378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande2390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_typeCommand2425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_typeCommand2427 = new BitSet(new long[]{0x0000000000000008L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_KEY_KW_in_typeCommand2439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2441 = new BitSet(new long[]{0x0000000000000008L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu2472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu2474 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000074L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu2477 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_definitionId_in_reglesJeu2480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_declencheur2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x000000000000F7A0L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur2531 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur2533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur2543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur2545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_VAR_KW_in_declencheur2565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_declencheur2567 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur2570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur2580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_declencheur2582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur2597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_declencheur2599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_type_declencheur0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2677 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2681 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2695 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OWNES_KW_in_declencheurTK2710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2713 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTOWNES_KW_in_declencheurTK2728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2731 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2768 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2772 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2786 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OWNED_KW_in_declencheurKT2801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2804 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTOWNED_KW_in_declencheurKT2819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2822 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2826 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors2860 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_siAlors2865 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_consequences_in_siAlors2870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_KW_in_conditions2910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_conditions2915 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions2921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_conditions2937 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions2941 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions2946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_conditions2962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions2966 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions2971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_conditions2987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2991 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions2996 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_conditions3012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3016 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_conditions3037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3041 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEG_in_conditions3062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3066 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3071 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPED_in_conditions3087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3091 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIFF_in_conditions3112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3116 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_etat_in_conditions3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat3159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3161 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3165 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3170 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat3185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3187 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3191 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3196 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat3211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3213 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3217 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3222 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat3237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3239 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3243 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3248 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat3263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3265 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3269 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3274 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat3289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3291 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3295 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3300 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat3315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3317 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3321 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3326 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3330 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat3341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3343 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat3359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3361 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat3376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3378 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat3393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L,0x0000000000080000L});
    public static final BitSet FOLLOW_mode_mute_in_etat3403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat3414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3416 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat3432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3434 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat3455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_etat3457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat3467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_etat3469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_mode_mute0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation3516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3520 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation3541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3545 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation3566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3570 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation3591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_affectation3593 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique3630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_iaBasique3632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3634 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation3658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3663 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_operation3685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3687 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_operation3706 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3708 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_operation3727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3729 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation3748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3750 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3753 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_operation3769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3771 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3774 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_operation3790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3792 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_operation3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operation3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable3863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3867 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3872 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_variable3888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3893 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3898 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Z_in_variable3914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3916 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_I_KW_in_variable3937 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable3941 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GAME_SCORE_KW_in_variable3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_KW_in_variable3968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_variable3972 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ALL_in_accesClass4015 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4029 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeObjet_in_accesClass4033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4047 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_accesClass4049 = new BitSet(new long[]{0x0920040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000088000000L});
    public static final BitSet FOLLOW_notAccess_in_accesClass4051 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accesClass4070 = new BitSet(new long[]{0x0000000400105008L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_accesClass4074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLAYER_in_accesClass4093 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeObjet_in_notAccess4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_notAccess4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITION_in_typeCoordonnees4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORIENTATION_in_typeCoordonnees4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_typeCoordonnees4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_timeUnit4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEC_in_timeUnit4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MS_in_timeUnit4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAME_in_timeUnit4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeObjet0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOST_INTERVAL_in_attributTps4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOOT_INTERVAL_in_attributTps4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOAD_TIME_in_attributTps4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}