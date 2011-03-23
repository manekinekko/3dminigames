// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g 2011-03-23 14:02:15

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "ACCESS_KW", "KEY_KW", "MOUSE_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "TURNBASED_KW", "WORLD_KW", "GRIDSIZE_KW", "NAME_KW", "GENERIC", "GRID", "RIBBON", "IDENT", "TYPE", "IS", "AND", "INSERT_KW", "IN", "NUM", "REMOVE_KW", "FROM", "LIST_KW", "OF", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "PLAYER", "SOLO", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DBP", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "NEXTURN_KW", "GRASPS_KW", "EXPELS_KW", "BY", "INGESTS_KW", "DIES_KW", "DURING", "UNTIL", "HAPPENS", "EQUIP", "NEXT", "PREVIOUS", "JUMP", "MOVE", "LEFT", "RIGHT", "FORWARD", "BACKWARD", "WUP", "WDOWN", "TURN", "CLOCKWISE", "ANTICLOCKWISE", "ACCELERATE", "BRAKE", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "FOR", "MOUSE", "KEY", "PRESSED_KW", "HELD_KW", "RELEASED_KW", "CLICK_LEFT", "CLICK_MIDDLE", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OWNES_KW", "NOTOWNES_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "OWNED_KW", "NOTOWNED_KW", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "CONTAINS_KW", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "WITH", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "DISTANCE_KW", "ANGLE_KW", "X", "Y", "Z", "SCORE", "VALUE", "ALL", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "RELOAD_KW", "TIME", "WS", "'true'", "'false'"
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

     
        private int INT_DUPLICABLE=10;
        private Hashtable<String, String> aggreg = new Hashtable<String, String>();

        /*public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);

    	//System.out.println(e.node);
            System.out.println(((CommonErrorNode)e.node).start.getLine());
            //System.out.println(((CommonErrorNode)e.node).trappedException.token.getText());
        }*/



    // $ANTLR start "game"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:36:1: game[SymbolTable st] returns [Code c] : ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:37:27: ( ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:38:5: ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* )
            {
            match(input,GAME_KW,FOLLOW_GAME_KW_in_game70); 

            c.append(Code.genRefreshLoop());

            match(input, Token.DOWN, null); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:40:7: (gd= gameData[st] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME_ATTRIBUT_KW) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:40:7: gd= gameData[st]
                    {
                    pushFollow(FOLLOW_gameData_in_game85);
                    gd=gameData(st);

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:41:5: ( newType[st] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:41:5: newType[st]
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
                
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:49:5: (def= definition[st] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DEFINITION_KW) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:49:6: def= definition[st]
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:56:8: (com= commande[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:56:8: com= commande[st]
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:56:26: (reg= reglesJeu[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:56:26: reg= reglesJeu[st]
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:56:44: (ia= iaBasique[st] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IA_KW) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:56:44: ia= iaBasique[st]
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:62:1: gameData[SymbolTable st] returns [Code c] : ^( GAME_ATTRIBUT_KW attributGame_list[st] ) ;
    public final Code gameData(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:62:43: ( ^( GAME_ATTRIBUT_KW attributGame_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:63:5: ^( GAME_ATTRIBUT_KW attributGame_list[st] )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:65:1: attributGame_list[SymbolTable st] returns [Code c] : ( attributGame[st] )+ ;
    public final Code attributGame_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:65:52: ( ( attributGame[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:66:5: ( attributGame[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:66:5: ( attributGame[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:66:5: attributGame[st]
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:68:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) );
    public final Code attributGame(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:68:47: ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:69:2: ^( GRAVITY_KW FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame231); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame233); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:70:4: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:71:4: ^( TURNBASED_KW ( 'true' | 'false' ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:72:4: ^( WORLD_KW mapType )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:73:4: ^( GRIDSIZE_KW FLOAT )
                    {
                    match(input,GRIDSIZE_KW,FOLLOW_GRIDSIZE_KW_in_attributGame275); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame277); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:74:4: ^( NAME_KW name )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:77:1: mapType returns [Integer i] : ( GENERIC | GRID | RIBBON );
    public final Integer mapType() throws RecognitionException {
        Integer i = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:77:28: ( GENERIC | GRID | RIBBON )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:83:1: name returns [String s] : i= IDENT ;
    public final String name() throws RecognitionException {
        String s = null;

        CommonTree i=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:83:24: (i= IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:84:5: i= IDENT
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:88:1: newType[SymbolTable st] : ^( TYPE i= IDENT ( subType[st,sub] )+ ) ;
    public final void newType(SymbolTable st) throws RecognitionException {
        CommonTree i=null;

        List<Model> sub = new ArrayList<Model>();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:89:54: ( ^( TYPE i= IDENT ( subType[st,sub] )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:90:5: ^( TYPE i= IDENT ( subType[st,sub] )+ )
            {
            match(input,TYPE,FOLLOW_TYPE_in_newType378); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_newType382); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:90:20: ( subType[st,sub] )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:90:20: subType[st,sub]
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:105:1: subType[SymbolTable st, List<Model> sub] : i= IDENT ;
    public final void subType(SymbolTable st, List<Model> sub) throws RecognitionException {
        CommonTree i=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:105:43: (i= IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:106:5: i= IDENT
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:122:1: initialization[SymbolTable st] returns [Code c] : ( init[st] )+ ;
    public final Code initialization(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:122:49: ( ( init[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:123:5: ( init[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:123:5: ( init[st] )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=INIT_IS_KW && LA10_0<=INIT_HAS_KW)||LA10_0==INSERT_KW||LA10_0==REMOVE_KW) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:123:5: init[st]
            	    {
            	    pushFollow(FOLLOW_init_in_initialization442);
            	    init(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            	Code modelCode = new Code();
            	Code entitiesCode = new Code();
            	Code entitiesFunCode = new Code();
            	List<Entity> allEntities = st.getAllEntities();

            	Iterator<Entity> it = allEntities.iterator();
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:158:1: init[SymbolTable st] returns [Code c] : ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) | ^( INSERT_KW IDENT IDENT ( operation[st] )? ) | ^( REMOVE_KW ( IDENT | operation[st] ) IDENT ) );
    public final Code init(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Pair<Model, Integer> d = null;

        ArrayList<Symbol> ac = null;

        ArrayList<Pair<String,AttributeValue>> ao = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:158:39: ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) | ^( INSERT_KW IDENT IDENT ( operation[st] )? ) | ^( REMOVE_KW ( IDENT | operation[st] ) IDENT ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case INIT_IS_KW:
                {
                alt13=1;
                }
                break;
            case INIT_HAS_KW:
                {
                alt13=2;
                }
                break;
            case INSERT_KW:
                {
                alt13=3;
                }
                break;
            case REMOVE_KW:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:5: ^( INIT_IS_KW i= IDENT d= declarationObjet[st] )
                    {
                    match(input,INIT_IS_KW,FOLLOW_INIT_IS_KW_in_init473); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_init477); 
                    pushFollow(FOLLOW_declarationObjet_in_init481);
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
                    	    
                    	    Entity t = new Entity(id,d.getFirst());
                    	    d.getFirst().toGenerate();

                    	    if(mode == INT_DUPLICABLE)
                    		t.setDuplicable();

                    	    st.add(id,t);
                    	}
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:178:7: ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] )
                    {
                    match(input,INIT_HAS_KW,FOLLOW_INIT_HAS_KW_in_init498); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_init502);
                    ac=accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_affectationObjet_list_in_init507);
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:200:7: ^( INSERT_KW IDENT IDENT ( operation[st] )? )
                    {
                    match(input,INSERT_KW,FOLLOW_INSERT_KW_in_init524); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_init526); 
                    match(input,IDENT,FOLLOW_IDENT_in_init528); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:200:31: ( operation[st] )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==GAME_SCORE_KW||LA11_0==VALUE_KW||LA11_0==VAR_I_KW||LA11_0==FLOAT||LA11_0==RANDOM_KW||(LA11_0>=PLUS && LA11_0<=POW)||(LA11_0>=X && LA11_0<=Z)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:200:31: operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_init530);
                            operation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:201:7: ^( REMOVE_KW ( IDENT | operation[st] ) IDENT )
                    {
                    match(input,REMOVE_KW,FOLLOW_REMOVE_KW_in_init542); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:201:19: ( IDENT | operation[st] )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==IDENT) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==GAME_SCORE_KW||LA12_0==VALUE_KW||LA12_0==VAR_I_KW||LA12_0==FLOAT||LA12_0==RANDOM_KW||(LA12_0>=PLUS && LA12_0<=POW)||(LA12_0>=X && LA12_0<=Z)) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:201:20: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_init545); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:201:26: operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_init547);
                            operation(st);

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_init551); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:205:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC t= typeEntity[st] (d= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER (s= SOLO )? );
    public final Pair<Model, Integer> declarationObjet(SymbolTable st) throws RecognitionException {
        Pair<Model, Integer> p = null;

        CommonTree s=null;
        Model t = null;

        Integer d = null;


        d=null;s=null;
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:206:26: ( ^( DEC t= typeEntity[st] (d= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER (s= SOLO )? )
            int alt16=8;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:207:5: ^( DEC t= typeEntity[st] (d= dupli )? )
                    {
                    match(input,DEC,FOLLOW_DEC_in_declarationObjet584); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet588);
                    t=typeEntity(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:207:28: (d= dupli )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==DUPLICABLE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:207:29: d= dupli
                            {
                            pushFollow(FOLLOW_dupli_in_declarationObjet594);
                            d=dupli();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    	if(d == null)
                    	    d=0;

                    	p = new Pair<Model, Integer>(t,d);
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:214:7: ^( LIST_KW list_declaration[st] )
                    {
                    match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet612); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_declaration_in_declarationObjet614);
                    list_declaration(st);

                    state._fsp--;


                    match(input, Token.UP, null); 


                    	//p = new Pair<Model, Integer>
                        

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:219:7: ^( CAMERA_KW PERSON view[st] )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet631); 

                    match(input, Token.DOWN, null); 
                    match(input,PERSON,FOLLOW_PERSON_in_declarationObjet633); 
                    pushFollow(FOLLOW_view_in_declarationObjet635);
                    view(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:220:7: ^( CAMERA_KW FREE )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet646); 

                    match(input, Token.DOWN, null); 
                    match(input,FREE,FOLLOW_FREE_in_declarationObjet648); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:221:7: ^( MEDIA_KW LOOP )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet658); 

                    match(input, Token.DOWN, null); 
                    match(input,LOOP,FOLLOW_LOOP_in_declarationObjet660); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:222:7: ^( MEDIA_KW ONCE )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet670); 

                    match(input, Token.DOWN, null); 
                    match(input,ONCE,FOLLOW_ONCE_in_declarationObjet672); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:223:7: ^( IN_KW IDENT )
                    {
                    match(input,IN_KW,FOLLOW_IN_KW_in_declarationObjet690); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declarationObjet692); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:224:7: PLAYER (s= SOLO )?
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_declarationObjet712); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:224:14: (s= SOLO )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==SOLO) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:224:15: s= SOLO
                            {
                            s=(CommonTree)match(input,SOLO,FOLLOW_SOLO_in_declarationObjet717); 

                            }
                            break;

                    }


                    	if(s != null) {
                    	    
                    	}
                    	p = new Pair<Model, Integer>((Model) st.get("Player"),0);
                        

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:233:1: list_declaration[SymbolTable st] returns [Code c] : ( (o= operation[st] )? i= IDENT )+ ;
    public final Code list_declaration(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code o = null;


        o = null;
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:234:21: ( ( (o= operation[st] )? i= IDENT )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:235:5: ( (o= operation[st] )? i= IDENT )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:235:5: ( (o= operation[st] )? i= IDENT )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==GAME_SCORE_KW||LA18_0==VALUE_KW||LA18_0==VAR_I_KW||LA18_0==FLOAT||LA18_0==IDENT||LA18_0==RANDOM_KW||(LA18_0>=PLUS && LA18_0<=POW)||(LA18_0>=X && LA18_0<=Z)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:235:6: (o= operation[st] )? i= IDENT
            	    {
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:235:6: (o= operation[st] )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==GAME_SCORE_KW||LA17_0==VALUE_KW||LA17_0==VAR_I_KW||LA17_0==FLOAT||LA17_0==RANDOM_KW||(LA17_0>=PLUS && LA17_0<=POW)||(LA17_0>=X && LA17_0<=Z)) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:235:7: o= operation[st]
            	            {
            	            pushFollow(FOLLOW_operation_in_list_declaration759);
            	            o=operation(st);

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_list_declaration766); 

            	    	String id = i.getText();
            	    	Symbol verif = st.get(id);
            	    	if(verif == null) {
            	    	    System.out.println("Model \""+id+"\" non défini.");
            	    	    System.exit(-1);
            	    	}
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:246:1: typeEntity[SymbolTable st] returns [Model t] : i= IDENT ;
    public final Model typeEntity(SymbolTable st) throws RecognitionException {
        Model t = null;

        CommonTree i=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:246:46: (i= IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeEntity799); 

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


    // $ANTLR start "dupli"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:263:1: dupli returns [Integer i] : DUPLICABLE ;
    public final Integer dupli() throws RecognitionException {
        Integer i = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:263:26: ( DUPLICABLE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:264:5: DUPLICABLE
            {
            match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli825); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:268:1: view[SymbolTable st] returns [Code c] : ( FIRST | THIRD );
    public final Code view(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:268:39: ( FIRST | THIRD )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:272:1: affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : (a= affectationObjet[st] )+ ;
    public final ArrayList<Pair<String,AttributeValue>> affectationObjet_list(SymbolTable st) throws RecognitionException {
        ArrayList<Pair<String,AttributeValue>> c = null;

        ArrayList<Pair<String,AttributeValue>> a = null;


        c = new ArrayList<Pair<String,AttributeValue>>();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:273:62: ( (a= affectationObjet[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:5: (a= affectationObjet[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:5: (a= affectationObjet[st] )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ALLOCATION_KW) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:6: a= affectationObjet[st]
            	    {
            	    pushFollow(FOLLOW_affectationObjet_in_affectationObjet_list891);
            	    a=affectationObjet(st);

            	    state._fsp--;

            	    c.addAll(a);

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
    // $ANTLR end "affectationObjet_list"


    // $ANTLR start "affectationObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:276:1: affectationObjet[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:276:142: ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) )
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ALLOCATION_KW) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case IDENT:
                        {
                        alt21=1;
                        }
                        break;
                    case POSITION:
                    case ORIENTATION:
                    case SIZE:
                        {
                        alt21=2;
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
                        alt21=3;
                        }
                        break;
                    case BOOST_INTERVAL:
                    case SHOOT_INTERVAL:
                    case RELOAD_TIME:
                        {
                        alt21=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:277:5: ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet919); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet923); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:277:31: (t= valAggregation[st] )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==AGGREGATION_KW||(LA20_0>=221 && LA20_0<=222)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:277:31: t= valAggregation[st]
                            {
                            pushFollow(FOLLOW_valAggregation_in_affectationObjet927);
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:286:7: ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet946); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_affectationObjet950);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_affectationObjet955);
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:303:7: ^( ALLOCATION_KW attributListeOuObjet[st] IDENT )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet973); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributListeOuObjet_in_affectationObjet975);
                    attributListeOuObjet(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_affectationObjet978); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:304:7: ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet989); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_affectationObjet993);
                    att=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_affectationObjet998);
                    v=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_affectationObjet1003);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:311:1: valAggregation[SymbolTable st] returns [AttributeValue c] : ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' );
    public final AttributeValue valAggregation(SymbolTable st) throws RecognitionException {
        AttributeValue c = null;

        CommonTree i=null;
        Code o = null;

        String t = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:311:59: ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case AGGREGATION_KW:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==DOWN) ) {
                    int LA23_4 = input.LA(3);

                    if ( (LA23_4==IDENT) ) {
                        alt23=2;
                    }
                    else if ( (LA23_4==GAME_SCORE_KW||LA23_4==VALUE_KW||LA23_4==VAR_I_KW||LA23_4==FLOAT||LA23_4==RANDOM_KW||(LA23_4>=PLUS && LA23_4<=POW)||(LA23_4>=X && LA23_4<=Z)) ) {
                        alt23=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case 221:
                {
                alt23=3;
                }
                break;
            case 222:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:312:5: ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation1040); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_valAggregation1044);
                    o=operation(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:312:39: (t= timeUnit[st] )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=MIN && LA22_0<=FRAME)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:312:39: t= timeUnit[st]
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1049);
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:320:6: ^( AGGREGATION_KW i= IDENT )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation1066); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1070); 

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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:330:7: 'true'
                    {
                    match(input,221,FOLLOW_221_in_valAggregation1085); 
                    c = new AttributeValue(true);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:331:7: 'false'
                    {
                    match(input,222,FOLLOW_222_in_valAggregation1095); 
                    c = new AttributeValue(false);

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:336:1: definition[SymbolTable st] returns [Code c] : ^( DEFINITION_KW i= IDENT cons= consequences[st] ) ;
    public final Code definition(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code cons = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:336:69: ( ^( DEFINITION_KW i= IDENT cons= consequences[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:337:5: ^( DEFINITION_KW i= IDENT cons= consequences[st] )
            {
            match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1129); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definition1133); 
            pushFollow(FOLLOW_consequences_in_definition1137);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:351:1: consequences[SymbolTable st] returns [Code c] : ^( CONSEQUENCES_KW conslist= consequ_list[st] ) ;
    public final Code consequences(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code conslist = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:352:29: ( ^( CONSEQUENCES_KW conslist= consequ_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:353:5: ^( CONSEQUENCES_KW conslist= consequ_list[st] )
            {
            match(input,CONSEQUENCES_KW,FOLLOW_CONSEQUENCES_KW_in_consequences1177); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_consequ_list_in_consequences1181);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:359:1: consequ_list[SymbolTable st] returns [Code c] : (cons= consequ[st] )+ ;
    public final Code consequ_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code cons = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:360:29: ( (cons= consequ[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:361:5: (cons= consequ[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:361:5: (cons= consequ[st] )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ACCESS_KW||LA24_0==IDENT||LA24_0==VICTORY_KW||(LA24_0>=DEFEAT_KW && LA24_0<=MUTE_KW)||(LA24_0>=PLAY_KW && LA24_0<=WAIT_KW)||(LA24_0>=SAVE_KW && LA24_0<=EXPELS_KW)||LA24_0==INGESTS_KW||(LA24_0>=ACTIVATE_KW && LA24_0<=DISABLE_KW)||LA24_0==IF_KW||(LA24_0>=ASSIGN_KW && LA24_0<=INVERT_KW)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:361:6: cons= consequ[st]
            	    {
            	    pushFollow(FOLLOW_consequ_in_consequ_list1223);
            	    cons=consequ(st);

            	    state._fsp--;

            	     c.append(cons); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:364:1: consequ[SymbolTable st] returns [Code c] : (i= siAlors[st] | act= action[st] | a= affectation[st] | activCommande[st] | id= IDENT | ^( VICTORY_KW IDENT ( IDENT )? ) | ^( DEFEAT_KW IDENT ( IDENT )? ) );
    public final Code consequ(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree id=null;
        Code i = null;

        Code act = null;

        Code a = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:365:29: (i= siAlors[st] | act= action[st] | a= affectation[st] | activCommande[st] | id= IDENT | ^( VICTORY_KW IDENT ( IDENT )? ) | ^( DEFEAT_KW IDENT ( IDENT )? ) )
            int alt27=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt27=1;
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
                alt27=2;
                }
                break;
            case ASSIGN_KW:
            case ADD_KW:
            case SUB_KW:
            case INVERT_KW:
                {
                alt27=3;
                }
                break;
            case ACTIVATE_KW:
            case DISABLE_KW:
                {
                alt27=4;
                }
                break;
            case IDENT:
                {
                alt27=5;
                }
                break;
            case VICTORY_KW:
                {
                alt27=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt27=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:366:5: i= siAlors[st]
                    {
                    pushFollow(FOLLOW_siAlors_in_consequ1263);
                    i=siAlors(st);

                    state._fsp--;

                    c=i;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:368:7: act= action[st]
                    {
                    pushFollow(FOLLOW_action_in_consequ1280);
                    act=action(st);

                    state._fsp--;

                    c.append(act);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:370:7: a= affectation[st]
                    {
                    pushFollow(FOLLOW_affectation_in_consequ1297);
                    a=affectation(st);

                    state._fsp--;

                    c=a;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:371:7: activCommande[st]
                    {
                    pushFollow(FOLLOW_activCommande_in_consequ1308);
                    activCommande(st);

                    state._fsp--;



                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:372:7: id= IDENT
                    {
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_consequ1321); 
                    	c.append(id.getText());c.append("\n");

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:373:7: ^( VICTORY_KW IDENT ( IDENT )? )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1331); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1333); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:373:26: ( IDENT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==IDENT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:373:26: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_consequ1335); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:374:7: ^( DEFEAT_KW IDENT ( IDENT )? )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1346); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1348); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:374:25: ( IDENT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==IDENT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:374:25: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_consequ1350); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:377:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) );
    public final Code action(SymbolTable st) throws RecognitionException {
        Code c = null;

        ArrayList<Symbol> ta = null;

        Coordonnees td = null;

        Code op = null;

        String t = null;

        Code cons = null;


         c = new Code();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:378:28: ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) )
            int alt36=19;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:379:5: accesClass[st] actionObjet[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_action1382);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionObjet_in_action1385);
                    actionObjet(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:380:6: ^( ENDS_KW IDENT ( IDENT )? )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1394); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1396); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:380:22: ( IDENT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:380:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1398); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:381:6: ^( ENDS_KW GAME ( IDENT )? )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1408); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1410); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:381:21: ( IDENT )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:381:21: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1412); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:382:6: ^( STARTS_KW IDENT ( IDENT )? )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1422); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1424); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:382:24: ( IDENT )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:382:24: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1426); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:383:6: ^( STARTS_KW GAME ( IDENT )? )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1436); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1438); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:383:23: ( IDENT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENT) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:383:23: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1440); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:384:6: ^( PAUSE_KW IDENT ( IDENT )? )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1450); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1452); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:384:23: ( IDENT )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENT) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:384:23: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1454); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:385:6: ^( PAUSE_KW GAME ( IDENT )? )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1464); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1466); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:385:22: ( IDENT )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:385:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1468); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                            c.append("\t");
                            
                           /* c.append("pause();\n");
                            * equivaut à
                            */ 
                            c.append(Code.genFuncCall("pause",new ArrayList())); 
                            
                        

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:395:6: ^( MUTE_KW mode_mute[st] IDENT )
                    {
                    match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1484); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mode_mute_in_action1486);
                    mode_mute(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_action1489); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:396:6: ^( PLAY_KW IDENT )
                    {
                    match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1498); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1500); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:397:6: ^( STOP_KW IDENT )
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_action1509); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1511); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:398:6: ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] )
                    {
                    match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1520); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_transformation_in_action1522);
                    transformation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_action1525);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_action1528);
                    coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:399:6: ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1538); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1540);
                    typeAcces(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:399:32: ( typeDestination[st] )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==COORDINATE_KW||LA34_0==ACCESS_KW) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:399:32: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1543);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:400:6: ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? )
                    {
                    match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1554); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1558);
                    ta=typeAcces(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:400:39: (td= typeDestination[st] )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COORDINATE_KW||LA35_0==ACCESS_KW) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:400:39: td= typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1563);
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
                        

                    }
                    break;
                case 14 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:420:6: ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st] )
                    {
                    match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1580); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_action1584);
                    op=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_action1589);
                    t=timeUnit(st);

                    state._fsp--;

                    pushFollow(FOLLOW_consequences_in_action1594);
                    cons=consequences(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                        	c.append(Code.genSetTimeout(cons,op,t));
                        

                    }
                    break;
                case 15 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:424:6: SAVE_KW
                    {
                    match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1610); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:425:6: ^( NEXTURN_KW IDENT )
                    {
                    match(input,NEXTURN_KW,FOLLOW_NEXTURN_KW_in_action1618); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1620); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:427:6: ^( GRASPS_KW IDENT IDENT )
                    {
                    match(input,GRASPS_KW,FOLLOW_GRASPS_KW_in_action1634); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1636); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1638); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:428:6: ^( EXPELS_KW IDENT IDENT operation[st] )
                    {
                    match(input,EXPELS_KW,FOLLOW_EXPELS_KW_in_action1647); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1649); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1651); 
                    pushFollow(FOLLOW_operation_in_action1653);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:429:6: ^( INGESTS_KW IDENT IDENT IDENT )
                    {
                    match(input,INGESTS_KW,FOLLOW_INGESTS_KW_in_action1663); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1665); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1667); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1669); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:432:1: typeAcces[SymbolTable st] returns [ArrayList<Symbol> l] : (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) );
    public final ArrayList<Symbol> typeAcces(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> l = null;

        ArrayList<Symbol> ac = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:432:57: (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ACCESS_KW) ) {
                alt38=1;
            }
            else if ( (LA38_0==GAME_SCORE_KW||LA38_0==VALUE_KW||LA38_0==VAR_I_KW||LA38_0==FLOAT||LA38_0==RANDOM_KW||(LA38_0>=PLUS && LA38_0<=POW)||(LA38_0>=X && LA38_0<=Z)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:433:5: ac= accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeAcces1694);
                    ac=accesClass(st);

                    state._fsp--;

                    l=ac;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:434:7: operation[st] ( IDENT | accesClass[st] )
                    {
                    pushFollow(FOLLOW_operation_in_typeAcces1705);
                    operation(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:434:21: ( IDENT | accesClass[st] )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==IDENT) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==ACCESS_KW) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:434:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_typeAcces1709); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:434:30: accesClass[st]
                            {
                            pushFollow(FOLLOW_accesClass_in_typeAcces1713);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:437:1: typeDestination[SymbolTable st] returns [Coordonnees coord] : ( accesClass[st] | coo= coordinates[st] );
    public final Coordonnees typeDestination(SymbolTable st) throws RecognitionException {
        Coordonnees coord = null;

        Coordonnees coo = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:437:61: ( accesClass[st] | coo= coordinates[st] )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ACCESS_KW) ) {
                alt39=1;
            }
            else if ( (LA39_0==COORDINATE_KW) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:438:5: accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeDestination1740);
                    accesClass(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:439:7: coo= coordinates[st]
                    {
                    pushFollow(FOLLOW_coordinates_in_typeDestination1751);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:441:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | actionCommandeMaintenue[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );
    public final Code actionObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:441:46: ( DIES_KW | actionCommandePressee[st] | actionCommandeMaintenue[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) )
            int alt40=8;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:442:5: DIES_KW
                    {
                    match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1770); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:443:7: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1778);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:444:7: actionCommandeMaintenue[st]
                    {
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1787);
                    actionCommandeMaintenue(st);

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:445:6: ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] )
                    {
                    match(input,DURING,FOLLOW_DURING_in_actionObjet1796); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1798);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_actionObjet1801);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_actionObjet1804);
                    timeUnit(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:446:6: ^( UNTIL actionCommandeMaintenue[st] conditions[st] )
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1814); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1816);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_actionObjet1819);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:447:6: ^( EQUIP accesClass[st] )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1829); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_actionObjet1831);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:448:6: ^( EQUIP NEXT )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1841); 

                    match(input, Token.DOWN, null); 
                    match(input,NEXT,FOLLOW_NEXT_in_actionObjet1843); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:449:6: ^( EQUIP PREVIOUS )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1852); 

                    match(input, Token.DOWN, null); 
                    match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1854); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:452:1: actionCommandePressee[SymbolTable st] returns [Code c] : ^( JUMP operation[st] ) ;
    public final Code actionCommandePressee(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:452:56: ( ^( JUMP operation[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:453:3: ^( JUMP operation[st] )
            {
            match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1876); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_actionCommandePressee1878);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:456:1: actionCommandeMaintenue[SymbolTable st] returns [Code c] : ( ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) operation[st] ) | ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] ) | ^( ACCELERATE operation[st] ) | ^( BRAKE operation[st] ) );
    public final Code actionCommandeMaintenue(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:456:58: ( ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) operation[st] ) | ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] ) | ^( ACCELERATE operation[st] ) | ^( BRAKE operation[st] ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt41=1;
                }
                break;
            case TURN:
                {
                alt41=2;
                }
                break;
            case ACCELERATE:
                {
                alt41=3;
                }
                break;
            case BRAKE:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:457:3: ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) operation[st] )
                    {
                    match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1899); 

                    match(input, Token.DOWN, null); 
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=WDOWN) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1925);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:458:5: ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] )
                    {
                    match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1934); 

                    match(input, Token.DOWN, null); 
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLOCKWISE && input.LA(1)<=ANTICLOCKWISE) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1960);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:459:5: ^( ACCELERATE operation[st] )
                    {
                    match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1969); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1971);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:460:5: ^( BRAKE operation[st] )
                    {
                    match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1980); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1982);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:463:1: transformation[SymbolTable st] returns [Code c] : ( TRANSLATION | ROTATION | SCALE );
    public final Code transformation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:463:49: ( TRANSLATION | ROTATION | SCALE )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:469:1: coordinates[SymbolTable st] returns [Coordonnees coo] : ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) ;
    public final Coordonnees coordinates(SymbolTable st) throws RecognitionException {
        Coordonnees coo = null;

        Code x = null;

        Code y = null;

        Code z = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:469:55: ( ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:470:5: ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] )
            {
            match(input,COORDINATE_KW,FOLLOW_COORDINATE_KW_in_coordinates2046); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_coordinates2050);
            x=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates2055);
            y=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates2060);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:479:1: commande[SymbolTable st] returns [Code c] : ^( COMMAND_KW listplay= player_list[st] listcommand= actionCommande_list[st] ) ;
    public final Code commande(SymbolTable st) throws RecognitionException {
        Code c = null;

        ArrayList<Symbol> listplay = null;

        Code listcommand = null;


        int nbCommande = 0;
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:479:70: ( ^( COMMAND_KW listplay= player_list[st] listcommand= actionCommande_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:480:5: ^( COMMAND_KW listplay= player_list[st] listcommand= actionCommande_list[st] )
            {
            match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande2099); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_player_list_in_commande2103);
            listplay=player_list(st);

            state._fsp--;

            pushFollow(FOLLOW_actionCommande_list_in_commande2108);
            listcommand=actionCommande_list(st);

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:483:1: player_list[SymbolTable st] returns [ArrayList<Symbol> list] : (i= IDENT )+ ;
    public final ArrayList<Symbol> player_list(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> list = null;

        CommonTree i=null;

        list = new ArrayList<Symbol>();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:483:101: ( (i= IDENT )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:484:5: (i= IDENT )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:484:5: (i= IDENT )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==IDENT) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:484:6: i= IDENT
            	    {
            	    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_player_list2139); 
            	    String e = i.getText();Symbol m = st.get(e);
            	                if(m==null){
            	                    System.out.println("tamere");
            	                    System.exit(0);
            	                }else{
            	                    if( m.getType()== Symbol.Type.ENTITY){
            	                        list.add(m);
            	                    }else{
            	                        System.out.println("tamerev2");
            	                        System.exit(0);
            	                    }
            	                }

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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "player_list"


    // $ANTLR start "actionCommande_list"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:498:1: actionCommande_list[SymbolTable st] returns [Code c] : ( actionCommande[st] )+ ;
    public final Code actionCommande_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:498:53: ( ( actionCommande[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:499:2: ( actionCommande[st] )+
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:499:2: ( actionCommande[st] )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=KEY_KW && LA43_0<=MOUSE_KW)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:499:2: actionCommande[st]
            	    {
            	    pushFollow(FOLLOW_actionCommande_in_actionCommande_list2161);
            	    actionCommande(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:502:1: actionCommande[SymbolTable st] returns [Code c] : ( ^( MOUSE_KW souris[st] ( commandMode )? definitionId[st] ) | ^( KEY_KW clavier[st] ( commandMode )? definitionId[st] ) );
    public final Code actionCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:502:49: ( ^( MOUSE_KW souris[st] ( commandMode )? definitionId[st] ) | ^( KEY_KW clavier[st] ( commandMode )? definitionId[st] ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:503:5: ^( MOUSE_KW souris[st] ( commandMode )? definitionId[st] )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande2184); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_souris_in_actionCommande2186);
                    souris(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:503:27: ( commandMode )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=PRESSED_KW && LA44_0<=RELEASED_KW)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:503:27: commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2189);
                            commandMode();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_definitionId_in_actionCommande2192);
                    definitionId(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:504:6: ^( KEY_KW clavier[st] ( commandMode )? definitionId[st] )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande2202); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_clavier_in_actionCommande2204);
                    clavier(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:504:27: ( commandMode )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=PRESSED_KW && LA45_0<=RELEASED_KW)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:504:27: commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2207);
                            commandMode();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_definitionId_in_actionCommande2210);
                    definitionId(st);

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:507:1: commandMode : ( PRESSED_KW | HELD_KW | RELEASED_KW );
    public final void commandMode() throws RecognitionException {
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:507:13: ( PRESSED_KW | HELD_KW | RELEASED_KW )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:511:1: definitionId[SymbolTable st] returns [Definition d] : i= IDENT ;
    public final Definition definitionId(SymbolTable st) throws RecognitionException {
        Definition d = null;

        CommonTree i=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:511:53: (i= IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:512:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definitionId2261); 
            String nom = i.getText(); Symbol s = st.get(nom);
                    if(s == null){
                        System.out.println("tamere");
                        System.exit(0);
                    }else{
                    if( s.getType()== Symbol.Type.DEFINITION){
                                d=(Definition)s;
                    }else{
                         System.out.println("tamerev2");
                         System.exit(0);
                }}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "definitionId"


    // $ANTLR start "souris"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:525:1: souris[SymbolTable st] returns [Code c] : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final Code souris(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:525:41: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:529:1: clavier[SymbolTable st] returns [String l] : (i= LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final String clavier(SymbolTable st) throws RecognitionException {
        String l = null;

        CommonTree i=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:529:44: (i= LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            int alt47=8;
            switch ( input.LA(1) ) {
            case LETTER:
                {
                alt47=1;
                }
                break;
            case WUP:
                {
                alt47=2;
                }
                break;
            case WDOWN:
                {
                alt47=3;
                }
                break;
            case LEFT:
                {
                alt47=4;
                }
                break;
            case RIGHT:
                {
                alt47=5;
                }
                break;
            case SPACE:
                {
                alt47=6;
                }
                break;
            case ESCAPE:
                {
                alt47=7;
                }
                break;
            case ENTER:
                {
                alt47=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:530:5: i= LETTER
                    {
                    i=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_clavier2343); 
                    l = i.getText();l=l.toLowerCase();

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:530:52: WUP
                    {
                    match(input,WUP,FOLLOW_WUP_in_clavier2348); 
                    l="38";

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:530:67: WDOWN
                    {
                    match(input,WDOWN,FOLLOW_WDOWN_in_clavier2353); 
                    l="40";

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:530:84: LEFT
                    {
                    match(input,LEFT,FOLLOW_LEFT_in_clavier2358); 
                    l="37";

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:530:100: RIGHT
                    {
                    match(input,RIGHT,FOLLOW_RIGHT_in_clavier2363); 
                    l="39";

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:530:117: SPACE
                    {
                    match(input,SPACE,FOLLOW_SPACE_in_clavier2368); 
                    l="32";

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:530:134: ESCAPE
                    {
                    match(input,ESCAPE,FOLLOW_ESCAPE_in_clavier2373); 
                    l="27";

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:530:152: ENTER
                    {
                    match(input,ENTER,FOLLOW_ENTER_in_clavier2378); 
                    l="13";

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
    // $ANTLR end "clavier"


    // $ANTLR start "activCommande"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:533:1: activCommande[SymbolTable st] returns [Code c] : ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) );
    public final Code activCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:533:48: ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ACTIVATE_KW) ) {
                alt48=1;
            }
            else if ( (LA48_0==DISABLE_KW) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:534:5: ^( ACTIVATE_KW typeCommand[st] )
                    {
                    match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande2414); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande2416);
                    typeCommand(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:535:6: ^( DISABLE_KW typeCommand[st] )
                    {
                    match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande2426); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande2428);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:538:1: typeCommand[SymbolTable st] returns [Code c] : ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD );
    public final Code typeCommand(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:538:46: ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD )
            int alt51=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt51=1;
                }
                break;
            case MOUSE_KW:
                {
                alt51=2;
                }
                break;
            case KEY_KW:
                {
                alt51=3;
                }
                break;
            case KEYBOARD:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:539:5: COMMANDS
                    {
                    match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand2452); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:540:7: ^( MOUSE_KW ( souris[st] )* )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_typeCommand2461); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:540:18: ( souris[st] )*
                        loop49:
                        do {
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( ((LA49_0>=LEFT && LA49_0<=RIGHT)||(LA49_0>=WUP && LA49_0<=WDOWN)||(LA49_0>=CLICK_LEFT && LA49_0<=SCROLL_DOWN)) ) {
                                alt49=1;
                            }


                            switch (alt49) {
                        	case 1 :
                        	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:540:18: souris[st]
                        	    {
                        	    pushFollow(FOLLOW_souris_in_typeCommand2463);
                        	    souris(st);

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop49;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:541:7: ^( KEY_KW ( clavier[st] )+ )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_typeCommand2475); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:541:16: ( clavier[st] )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=LEFT && LA50_0<=RIGHT)||(LA50_0>=WUP && LA50_0<=WDOWN)||(LA50_0>=LETTER && LA50_0<=ENTER)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:541:16: clavier[st]
                    	    {
                    	    pushFollow(FOLLOW_clavier_in_typeCommand2477);
                    	    clavier(st);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:542:7: KEYBOARD
                    {
                    match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand2488); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:544:1: reglesJeu[SymbolTable st] returns [Code c] : ^( RULE_KW ( IDENT )? declencheur[st] definitionId[st] ) ;
    public final Code reglesJeu(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:544:44: ( ^( RULE_KW ( IDENT )? declencheur[st] definitionId[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:545:5: ^( RULE_KW ( IDENT )? declencheur[st] definitionId[st] )
            {
            match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu2508); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:545:15: ( IDENT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==IDENT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:545:15: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_reglesJeu2510); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu2513);
            declencheur(st);

            state._fsp--;

            pushFollow(FOLLOW_definitionId_in_reglesJeu2516);
            definitionId(st);

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:548:1: declencheur[SymbolTable st] returns [Code c] : ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( VICTORY_KW ( PLAYER | IDENT ) ) | ^( DEFEAT_KW ( PLAYER | IDENT ) ) );
    public final Code declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:548:46: ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( VICTORY_KW ( PLAYER | IDENT ) ) | ^( DEFEAT_KW ( PLAYER | IDENT ) ) )
            int alt54=6;
            switch ( input.LA(1) ) {
            case ACCESS_KW:
                {
                alt54=1;
                }
                break;
            case ENDS_KW:
                {
                alt54=2;
                }
                break;
            case STARTS_KW:
                {
                alt54=3;
                }
                break;
            case BECOMES_VAR_KW:
                {
                alt54=4;
                }
                break;
            case VICTORY_KW:
                {
                alt54=5;
                }
                break;
            case DEFEAT_KW:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:549:5: accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    {
                    pushFollow(FOLLOW_accesClass_in_declencheur2541);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:549:20: ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    int alt53=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt53=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt53=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                    case OWNES_KW:
                    case NOTOWNES_KW:
                        {
                        alt53=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
                    case OWNED_KW:
                    case NOTOWNED_KW:
                        {
                        alt53=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }

                    switch (alt53) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:549:21: MOVES_KW
                            {
                            match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur2545); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:549:32: DIES_KW
                            {
                            match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur2549); 

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:549:42: declencheurTK[st]
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur2553);
                            declencheurTK(st);

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:549:62: declencheurKT[st]
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur2558);
                            declencheurKT(st);

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:550:6: ^( ENDS_KW type_declencheur[st] )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur2568); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur2570);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:551:6: ^( STARTS_KW type_declencheur[st] )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur2580); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur2582);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:552:6: ^( BECOMES_VAR_KW variable[st] varOuNB[st] )
                    {
                    match(input,BECOMES_VAR_KW,FOLLOW_BECOMES_VAR_KW_in_declencheur2602); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_declencheur2604);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_varOuNB_in_declencheur2607);
                    varOuNB(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:553:6: ^( VICTORY_KW ( PLAYER | IDENT ) )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur2617); 

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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:554:6: ^( DEFEAT_KW ( PLAYER | IDENT ) )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur2634); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:557:1: type_declencheur[SymbolTable st] returns [Code c] : ( IDENT | GAME );
    public final Code type_declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:557:51: ( IDENT | GAME )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:560:1: varOuNB[SymbolTable st] returns [Code c] : ( variable[st] | FLOAT );
    public final Code varOuNB(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:560:42: ( variable[st] | FLOAT )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==GAME_SCORE_KW||LA55_0==VALUE_KW||LA55_0==VAR_I_KW||(LA55_0>=X && LA55_0<=Z)) ) {
                alt55=1;
            }
            else if ( (LA55_0==FLOAT) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:561:5: variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_varOuNB2687);
                    variable(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:561:20: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2692); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:563:1: declencheurTK[SymbolTable st] returns [Code c] : ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) | ^( OWNES_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNES_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurTK(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:563:49: ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) | ^( OWNES_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNES_KW ( OTHER )? accesClass[st] ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case TOUCHES_KW:
                {
                alt60=1;
                }
                break;
            case KILLS_KW:
                {
                alt60=2;
                }
                break;
            case OWNES_KW:
                {
                alt60=3;
                }
                break;
            case NOTOWNES_KW:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:564:5: ^( TOUCHES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2711); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:564:18: ( OTHER )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==OTHER) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:564:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2714); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2718);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:565:7: ^( KILLS_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2729); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:565:18: ( OTHER )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==OTHER) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:565:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2732); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2736);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:566:7: ^( OWNES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,OWNES_KW,FOLLOW_OWNES_KW_in_declencheurTK2747); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:566:18: ( OTHER )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==OTHER) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:566:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2750); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2754);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:567:7: ^( NOTOWNES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,NOTOWNES_KW,FOLLOW_NOTOWNES_KW_in_declencheurTK2765); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:567:21: ( OTHER )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==OTHER) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:567:22: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2768); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2772);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:572:1: declencheurKT[SymbolTable st] returns [Code c] : ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) | ^( OWNED_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNED_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurKT(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:572:49: ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) | ^( OWNED_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNED_KW ( OTHER )? accesClass[st] ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case KILLED_KW:
                {
                alt65=1;
                }
                break;
            case TOUCHED_KW:
                {
                alt65=2;
                }
                break;
            case OWNED_KW:
                {
                alt65=3;
                }
                break;
            case NOTOWNED_KW:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:573:5: ^( KILLED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2802); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:573:17: ( OTHER )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==OTHER) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:573:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2805); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2809);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:574:7: ^( TOUCHED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2820); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:574:20: ( OTHER )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==OTHER) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:574:21: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2823); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2827);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:575:7: ^( OWNED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,OWNED_KW,FOLLOW_OWNED_KW_in_declencheurKT2838); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:575:18: ( OTHER )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==OTHER) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:575:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2841); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2845);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:576:7: ^( NOTOWNED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,NOTOWNED_KW,FOLLOW_NOTOWNED_KW_in_declencheurKT2856); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:576:21: ( OTHER )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==OTHER) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:576:22: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2859); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2863);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:580:1: siAlors[SymbolTable st] returns [Code c] : ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? ) ;
    public final Code siAlors(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code cond = null;

        Code r1 = null;

        Code r2 = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:580:42: ( ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:581:5: ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? )
            {
            match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2893); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_conditions_in_siAlors2897);
            cond=conditions(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_siAlors2902);
            r1=consequences(st);

            state._fsp--;

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:581:55: (r2= consequences[st] )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==CONSEQUENCES_KW) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:581:55: r2= consequences[st]
                    {
                    pushFollow(FOLLOW_consequences_in_siAlors2907);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:585:1: conditions[SymbolTable st] returns [Code c] : ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] );
    public final Code conditions(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree not=null;
        Code cond = null;

        Code cond1 = null;

        Code cond2 = null;


        not=null;
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:586:21: ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] )
            int alt68=10;
            switch ( input.LA(1) ) {
            case CONDITION_KW:
                {
                alt68=1;
                }
                break;
            case OR:
                {
                alt68=2;
                }
                break;
            case AND:
                {
                alt68=3;
                }
                break;
            case EQUALS:
                {
                alt68=4;
                }
                break;
            case INF:
                {
                alt68=5;
                }
                break;
            case SUP:
                {
                alt68=6;
                }
                break;
            case INFEG:
                {
                alt68=7;
                }
                break;
            case SUPED:
                {
                alt68=8;
                }
                break;
            case DIFF:
                {
                alt68=9;
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
                alt68=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:587:5: ^( CONDITION_KW (not= NOT )? cond= conditions[st] )
                    {
                    match(input,CONDITION_KW,FOLLOW_CONDITION_KW_in_conditions2947); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:587:20: (not= NOT )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==NOT) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:587:21: not= NOT
                            {
                            not=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions2952); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditions_in_conditions2958);
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:595:6: ^( OR cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,OR,FOLLOW_OR_in_conditions2974); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions2978);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions2983);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genOr(cond1,cond2);
                        

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:599:6: ^( AND cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,AND,FOLLOW_AND_in_conditions2999); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions3003);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions3008);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genAnd(cond1,cond2);
                        

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:603:6: ^( EQUALS cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_conditions3024); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3028);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3033);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genEquals(cond1,cond2);
                        

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:607:6: ^( INF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INF,FOLLOW_INF_in_conditions3049); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3053);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3058);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInf(cond1,cond2);
                        

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:611:6: ^( SUP cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUP,FOLLOW_SUP_in_conditions3074); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3078);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3083);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSup(cond1,cond2);
                        

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:615:6: ^( INFEG cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INFEG,FOLLOW_INFEG_in_conditions3099); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3103);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3108);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInfEg(cond1,cond2);
                        

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:619:6: ^( SUPED cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUPED,FOLLOW_SUPED_in_conditions3124); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3128);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3133);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSupEg(cond1,cond2);
                        

                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:623:6: ^( DIFF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,DIFF,FOLLOW_DIFF_in_conditions3149); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3153);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3158);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genDiff(cond1,cond2);
                        

                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:627:7: etat[st]
                    {
                    pushFollow(FOLLOW_etat_in_conditions3174);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:630:1: etat[SymbolTable st] returns [Code c] : ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | ^( VICTORY_KW IDENT ) | ^( DEFEAT_KW IDENT ) );
    public final Code etat(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:630:39: ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | ^( VICTORY_KW IDENT ) | ^( DEFEAT_KW IDENT ) )
            int alt89=15;
            switch ( input.LA(1) ) {
            case DEAD_KW:
                {
                alt89=1;
                }
                break;
            case ALIVE_KW:
                {
                alt89=2;
                }
                break;
            case EFFACED_KW:
                {
                alt89=3;
                }
                break;
            case GENERATED_KW:
                {
                alt89=4;
                }
                break;
            case TOUCHING_KW:
                {
                alt89=5;
                }
                break;
            case MOVING_KW:
                {
                alt89=6;
                }
                break;
            case WAITING_KW:
                {
                alt89=7;
                }
                break;
            case FINISHED_KW:
                {
                alt89=8;
                }
                break;
            case STARTED_KW:
                {
                alt89=9;
                }
                break;
            case PAUSED_KW:
                {
                alt89=10;
                }
                break;
            case MUTED_KW:
                {
                alt89=11;
                }
                break;
            case PLAYED_KW:
                {
                alt89=12;
                }
                break;
            case STOPPED_KW:
                {
                alt89=13;
                }
                break;
            case VICTORY_KW:
                {
                alt89=14;
                }
                break;
            case DEFEAT_KW:
                {
                alt89=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:631:5: ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat3196); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3198);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:631:30: ( NOT )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NOT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:631:31: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3202); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:631:37: ( OTHER )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==OTHER) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:631:38: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3207); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3211);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:632:7: ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat3222); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3224);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:632:33: ( NOT )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NOT) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:632:34: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3228); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:632:40: ( OTHER )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==OTHER) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:632:41: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3233); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3237);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:633:7: ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat3248); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3250);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:633:35: ( NOT )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NOT) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:633:36: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3254); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:633:42: ( OTHER )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==OTHER) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:633:43: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3259); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3263);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:634:7: ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat3274); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3276);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:634:37: ( NOT )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==NOT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:634:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3280); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:634:44: ( OTHER )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==OTHER) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:634:45: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3285); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3289);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:635:7: ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat3300); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3302);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:635:36: ( NOT )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NOT) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:635:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3306); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:635:43: ( OTHER )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==OTHER) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:635:44: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3311); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3315);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:636:7: ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat3326); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3328);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:636:34: ( NOT )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==NOT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:636:35: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3332); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:636:41: ( OTHER )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==OTHER) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:636:42: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3337); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3341);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:637:7: ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat3352); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3354);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:637:35: ( NOT )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==NOT) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:637:36: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3358); 

                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:637:42: ( OTHER )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==OTHER) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:637:43: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3363); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3367);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:638:7: ^( FINISHED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat3378); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3380);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:638:42: ( NOT )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NOT) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:638:43: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3384); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:639:7: ^( STARTED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat3396); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3398);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:639:40: ( NOT )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NOT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:639:41: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3401); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:640:7: ^( PAUSED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat3413); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3415);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:640:39: ( NOT )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==NOT) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:640:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3418); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:641:7: ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] )
                    {
                    match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat3430); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3432);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:641:39: ( NOT )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==NOT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:641:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3436); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mode_mute_in_etat3440);
                    mode_mute(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:642:7: ^( PLAYED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat3451); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3453);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:642:40: ( NOT )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==NOT) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:642:41: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3457); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:643:7: ^( STOPPED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat3469); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3471);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:643:41: ( NOT )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NOT) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:643:42: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3475); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:645:7: ^( VICTORY_KW IDENT )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat3492); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_etat3494); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:646:7: ^( DEFEAT_KW IDENT )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat3504); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_etat3506); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:649:1: mode_mute[SymbolTable st] returns [Code c] : ( ON | OFF );
    public final Code mode_mute(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:649:44: ( ON | OFF )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:652:1: affectation[SymbolTable st] returns [Code c] : ( ^( ASSIGN_KW i1= operation[st] i2= variable[st] ) | ^( ADD_KW o= operation[st] v= variable[st] ) | ^( SUB_KW op= operation[st] var= variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) );
    public final Code affectation(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code i1 = null;

        Code i2 = null;

        Code o = null;

        Code v = null;

        Code op = null;

        Code var = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:652:46: ( ^( ASSIGN_KW i1= operation[st] i2= variable[st] ) | ^( ADD_KW o= operation[st] v= variable[st] ) | ^( SUB_KW op= operation[st] var= variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) )
            int alt90=4;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt90=1;
                }
                break;
            case ADD_KW:
                {
                alt90=2;
                }
                break;
            case SUB_KW:
                {
                alt90=3;
                }
                break;
            case INVERT_KW:
                {
                alt90=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:653:5: ^( ASSIGN_KW i1= operation[st] i2= variable[st] )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation3553); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3557);
                    i1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3562);
                    i2=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	c = Code.genAffect(i2,i1);
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:657:6: ^( ADD_KW o= operation[st] v= variable[st] )
                    {
                    match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation3578); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3582);
                    o=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3587);
                    v=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genIncr(v,o);
                        

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:661:6: ^( SUB_KW op= operation[st] var= variable[st] )
                    {
                    match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation3603); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3607);
                    op=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3612);
                    var=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSub(var,op);
                        

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:665:6: ^( INVERT_KW variable[st] variable[st] )
                    {
                    match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation3628); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_affectation3630);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3633);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:671:1: iaBasique[SymbolTable st] returns [Code c] : ^( IA_KW IDENT ( reglesJeu[st] )+ ) ;
    public final Code iaBasique(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:671:44: ( ^( IA_KW IDENT ( reglesJeu[st] )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:672:5: ^( IA_KW IDENT ( reglesJeu[st] )+ )
            {
            match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique3667); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_iaBasique3669); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:672:19: ( reglesJeu[st] )+
            int cnt91=0;
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==RULE_KW) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:672:19: reglesJeu[st]
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_iaBasique3671);
            	    reglesJeu(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt91 >= 1 ) break loop91;
                        EarlyExitException eee =
                            new EarlyExitException(91, input);
                        throw eee;
                }
                cnt91++;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:676:1: operation[SymbolTable st] returns [Code c] : ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st] | f= FLOAT );
    public final Code operation(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree f=null;
        Code c1 = null;

        Code c2 = null;

        Code v = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:676:44: ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st] | f= FLOAT )
            int alt92=9;
            switch ( input.LA(1) ) {
            case RANDOM_KW:
                {
                alt92=1;
                }
                break;
            case PLUS:
                {
                alt92=2;
                }
                break;
            case MINUS:
                {
                alt92=3;
                }
                break;
            case MUL:
                {
                alt92=4;
                }
                break;
            case DIV:
                {
                alt92=5;
                }
                break;
            case MOD:
                {
                alt92=6;
                }
                break;
            case POW:
                {
                alt92=7;
                }
                break;
            case GAME_SCORE_KW:
            case VALUE_KW:
            case VAR_I_KW:
            case X:
            case Y:
            case Z:
                {
                alt92=8;
                }
                break;
            case FLOAT:
                {
                alt92=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:677:5: ^( RANDOM_KW c1= operation[st] c2= operation[st] )
                    {
                    match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation3695); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3700);
                    c1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3706);
                    c2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genRD(c1,c2);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:679:6: ^( PLUS operation[st] operation[st] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_operation3722); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3724);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3727);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPLUS(c1,c2);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:681:6: ^( MINUS operation[st] operation[st] )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_operation3743); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3745);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3748);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMINUS(c1,c2);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:683:6: ^( MUL operation[st] operation[st] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_operation3764); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3766);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3769);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMUL(c1,c2);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:685:6: ^( DIV operation[st] operation[st] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_operation3785); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3787);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3790);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genDIV(c1,c2);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:687:6: ^( MOD operation[st] operation[st] )
                    {
                    match(input,MOD,FOLLOW_MOD_in_operation3806); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3808);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3811);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMOD(c1,c2);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:689:6: ^( POW operation[st] operation[st] )
                    {
                    match(input,POW,FOLLOW_POW_in_operation3827); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3829);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3832);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPOW(c1,c2);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:691:6: v= variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_operation3851);
                    v=variable(st);

                    state._fsp--;

                    c = v;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:693:6: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_operation3869); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:698:1: variable[SymbolTable st] returns [Code c] : ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) );
    public final Code variable(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code tc = null;

        ArrayList<Symbol> sb = null;

        ArrayList<Symbol> e = null;

        String at = null;

        ArrayList<Symbol> ac = null;


        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:698:43: ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) )
            int alt93=6;
            switch ( input.LA(1) ) {
            case X:
                {
                alt93=1;
                }
                break;
            case Y:
                {
                alt93=2;
                }
                break;
            case Z:
                {
                alt93=3;
                }
                break;
            case VAR_I_KW:
                {
                alt93=4;
                }
                break;
            case GAME_SCORE_KW:
                {
                alt93=5;
                }
                break;
            case VALUE_KW:
                {
                alt93=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:699:5: ^( X tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,X,FOLLOW_X_in_variable3900); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3904);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3909);
                    sb=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    //TODO
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:710:6: ^( Y tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Y,FOLLOW_Y_in_variable3925); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3930);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3935);
                    sb=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    //TODO
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:721:6: ^( Z typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Z,FOLLOW_Z_in_variable3951); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3953);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3958);
                    sb=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    //TODO
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:732:6: ^( VAR_I_KW i= IDENT e= accesClass[st] )
                    {
                    match(input,VAR_I_KW,FOLLOW_VAR_I_KW_in_variable3974); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variable3978); 
                    pushFollow(FOLLOW_accesClass_in_variable3982);
                    e=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    //TODO //PRIO 
                    	Symbol si = e.get(0);
                    	String ident= i.getText();
                    	AttributeValue a = si.getAttribute(ident);
                    	if(a==null){
                    	    System.out.println(si.getName()+" n'a pas l'attribut "+ident);
                    	    System.exit(-1);
                    	}
                    	else if(a.getType()!= AttributeValue.Type.NUMBER){
                    	    System.out.println(ident+" n'est pas un nombre.");
                    	    System.exit(-1);
                    	}else{
                    	    
                    	    if(si.getType() == Symbol.Type.MODEL){
                    	    }
                    	    else if(si.getType() == Symbol.Type.ENTITY){
                          }
                          else{
                            //ERREUR
                          }
                    	
                    	
                    	    c=Code.genAccess(si.getName(),ident);
                    	}
                        

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:758:6: GAME_SCORE_KW
                    {
                    match(input,GAME_SCORE_KW,FOLLOW_GAME_SCORE_KW_in_variable3997); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:759:6: ^( VALUE_KW at= attributTps[st] ac= accesClass[st] )
                    {
                    match(input,VALUE_KW,FOLLOW_VALUE_KW_in_variable4005); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_variable4009);
                    at=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable4014);
                    ac=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    //TODO
                    	Symbol si = ac.get(0); AttributeValue a = si.getAttribute(at);
                    	if(a==null){
                    	    System.out.println(si.getName()+" n'a pas l'attribut "+at);
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:772:1: accesClass[SymbolTable st] returns [ArrayList<Symbol> sb] : ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) );
    public final ArrayList<Symbol> accesClass(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> sb = null;

        CommonTree i=null;
        Code co = null;


        sb = new ArrayList<Symbol>();
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:773:42: ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) )
            int alt95=3;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==ACCESS_KW) ) {
                int LA95_1 = input.LA(2);

                if ( (LA95_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ALL:
                        {
                        alt95=1;
                        }
                        break;
                    case IDENT:
                        {
                        alt95=2;
                        }
                        break;
                    case PLAYER:
                        {
                        alt95=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:774:5: ^( ACCESS_KW ALL )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4055); 

                    match(input, Token.DOWN, null); 
                    match(input,ALL,FOLLOW_ALL_in_accesClass4057); 

                    match(input, Token.UP, null); 

                    	sb.addAll(st.getAllEntities());
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:778:7: ^( ACCESS_KW i= IDENT (co= operation[st] )? )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4073); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesClass4077); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:778:29: (co= operation[st] )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==GAME_SCORE_KW||LA94_0==VALUE_KW||LA94_0==VAR_I_KW||LA94_0==FLOAT||LA94_0==RANDOM_KW||(LA94_0>=PLUS && LA94_0<=POW)||(LA94_0>=X && LA94_0<=Z)) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:778:29: co= operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_accesClass4081);
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
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:788:7: ^( ACCESS_KW PLAYER )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4100); 

                    match(input, Token.DOWN, null); 
                    match(input,PLAYER,FOLLOW_PLAYER_in_accesClass4102); 

                    match(input, Token.UP, null); 

                    	//sb.add(Genre.player);
                        

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


    // $ANTLR start "typeCoordonnees"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:794:1: typeCoordonnees[SymbolTable st] returns [Code c] : ( POSITION | ORIENTATION | SIZE );
    public final Code typeCoordonnees(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:794:50: ( POSITION | ORIENTATION | SIZE )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:795:2: POSITION
                    {
                    match(input,POSITION,FOLLOW_POSITION_in_typeCoordonnees4130); 
                    c = new Code("position");

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:795:40: ORIENTATION
                    {
                    match(input,ORIENTATION,FOLLOW_ORIENTATION_in_typeCoordonnees4135); 
                    c = new Code("angle");

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:795:78: SIZE
                    {
                    match(input,SIZE,FOLLOW_SIZE_in_typeCoordonnees4140); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:798:1: timeUnit[SymbolTable st] returns [String c] : ( MIN | SEC | MS | FRAME );
    public final String timeUnit(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:798:45: ( MIN | SEC | MS | FRAME )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:799:2: MIN
                    {
                    match(input,MIN,FOLLOW_MIN_in_timeUnit4158); 
                    c = "MIN";

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:800:4: SEC
                    {
                    match(input,SEC,FOLLOW_SEC_in_timeUnit4165); 
                    c = "SEC";

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:801:4: MS
                    {
                    match(input,MS,FOLLOW_MS_in_timeUnit4171); 
                    c = "MS";

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:802:4: FRAME
                    {
                    match(input,FRAME,FOLLOW_FRAME_in_timeUnit4177); 

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


    // $ANTLR start "attributTps"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:805:1: attributTps[SymbolTable st] returns [String c] : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final String attributTps(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:805:48: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:806:2: BOOST_INTERVAL
                    {
                    match(input,BOOST_INTERVAL,FOLLOW_BOOST_INTERVAL_in_attributTps4193); 
                    c ="boostInterval";

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:807:4: SHOOT_INTERVAL
                    {
                    match(input,SHOOT_INTERVAL,FOLLOW_SHOOT_INTERVAL_in_attributTps4199); 
                    c = "shootInterval";

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:808:4: RELOAD_TIME
                    {
                    match(input,RELOAD_TIME,FOLLOW_RELOAD_TIME_in_attributTps4214); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:811:1: attributListeOuObjet[SymbolTable st] returns [Code c] : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final Code attributListeOuObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:811:55: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
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
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA40 dfa40 = new DFA40(this);
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
            return "68:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) );";
        }
    }
    static final String DFA16_eotS =
        "\15\uffff";
    static final String DFA16_eofS =
        "\15\uffff";
    static final String DFA16_minS =
        "\1\10\2\uffff\2\2\2\uffff\1\66\1\71\4\uffff";
    static final String DFA16_maxS =
        "\1\73\2\uffff\2\2\2\uffff\1\67\1\72\4\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\7\1\10\2\uffff\1\3\1\4\1\5\1\6";
    static final String DFA16_specialS =
        "\15\uffff}>";
    static final String[] DFA16_transitionS = {
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "205:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC t= typeEntity[st] (d= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER (s= SOLO )? );";
        }
    }
    static final String DFA36_eotS =
        "\32\uffff";
    static final String DFA36_eofS =
        "\32\uffff";
    static final String DFA36_minS =
        "\1\31\1\uffff\3\2\14\uffff\3\35\6\uffff";
    static final String DFA36_maxS =
        "\1\130\1\uffff\3\2\14\uffff\3\52\6\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\3\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA36_specialS =
        "\32\uffff}>";
    static final String[] DFA36_transitionS = {
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "377:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) );";
        }
    }
    static final String DFA40_eotS =
        "\13\uffff";
    static final String DFA40_eofS =
        "\13\uffff";
    static final String DFA40_minS =
        "\1\131\5\uffff\1\2\1\31\3\uffff";
    static final String DFA40_maxS =
        "\1\154\5\uffff\1\2\1\137\3\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\7\1\10\1\6";
    static final String DFA40_specialS =
        "\13\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\1\4\1\5\1\uffff\1\6\2\uffff\1\2\1\3\6\uffff\1\3\2\uffff"+
            "\2\3",
            "",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\12\104\uffff\1\10\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "441:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | actionCommandeMaintenue[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );";
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
    public static final BitSet FOLLOW_IDENT_in_newType382 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_subType_in_newType384 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_subType414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_in_initialization442 = new BitSet(new long[]{0x00024800000000C2L});
    public static final BitSet FOLLOW_INIT_IS_KW_in_init473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init477 = new BitSet(new long[]{0x0808000000008700L});
    public static final BitSet FOLLOW_declarationObjet_in_init481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INIT_HAS_KW_in_init498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_init502 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_affectationObjet_list_in_init507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_KW_in_init524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init526 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init528 = new BitSet(new long[]{0x0000000400105008L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_init530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REMOVE_KW_in_init542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init545 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_operation_in_init547 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEC_in_declarationObjet584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet588 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_dupli_in_declarationObjet594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_declaration_in_declarationObjet614 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet631 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet633 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_view_in_declarationObjet635 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_KW_in_declarationObjet690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYER_in_declarationObjet712 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_SOLO_in_declarationObjet717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_list_declaration759 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_list_declaration766 = new BitSet(new long[]{0x0000040400105002L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectationObjet_in_affectationObjet_list891 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet919 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet923 = new BitSet(new long[]{0x0000000000080008L,0x0000000000000000L,0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_valAggregation_in_affectationObjet927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet946 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_affectationObjet950 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_affectationObjet955 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_affectationObjet975 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet978 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_affectationObjet993 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_affectationObjet998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_affectationObjet1003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation1040 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_valAggregation1044 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1049 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation1066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_221_in_valAggregation1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_valAggregation1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_definition1133 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_definition1137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSEQUENCES_KW_in_consequences1177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_list_in_consequences1181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_consequ_in_consequ_list1223 = new BitSet(new long[]{0x0000040002000002L,0x000000000179F9F4L,0x0000F00000010003L});
    public static final BitSet FOLLOW_siAlors_in_consequ1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_consequ1333 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_consequ1335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_consequ1348 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_consequ1350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_action1382 = new BitSet(new long[]{0x0000000000000000L,0x000019032E000000L});
    public static final BitSet FOLLOW_actionObjet_in_action1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1396 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1398 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1410 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1424 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1438 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1452 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1466 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mode_mute_in_action1486 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1489 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOP_KW_in_action1509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_transformation_in_action1522 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_action1525 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_action1528 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1540 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1558 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_action1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_action1589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_action1594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXTURN_KW_in_action1618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRASPS_KW_in_action1634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1636 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPELS_KW_in_action1647 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1649 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1651 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_action1653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INGESTS_KW_in_action1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1665 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1667 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAcces1705 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeAcces1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeDestination1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coordinates_in_typeDestination1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1796 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1798 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionObjet1801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1804 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1816 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_actionObjet1831 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1841 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1876 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1901 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1925 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1934 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1936 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1980 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1982 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_KW_in_coordinates2046 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_coordinates2050 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_coordinates2055 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_coordinates2060 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande2099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_player_list_in_commande2103 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_actionCommande_list_in_commande2108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_player_list2139 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_actionCommande_in_actionCommande_list2161 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande2184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_actionCommande2186 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2189 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande2202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_actionCommande2204 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2207 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_commandMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_definitionId2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_clavier2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WUP_in_clavier2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WDOWN_in_clavier2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_clavier2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_clavier2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPACE_in_clavier2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESCAPE_in_clavier2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTER_in_clavier2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande2414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande2426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_typeCommand2461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_typeCommand2463 = new BitSet(new long[]{0x0000000000000008L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_KEY_KW_in_typeCommand2475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2477 = new BitSet(new long[]{0x0000000000000008L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu2508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu2510 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000074L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu2513 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_definitionId_in_reglesJeu2516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_declencheur2541 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x000000000000F7A0L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur2568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur2570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur2580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur2582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_VAR_KW_in_declencheur2602 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_declencheur2604 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur2607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur2617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_declencheur2619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur2634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_declencheur2636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_type_declencheur0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2714 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2732 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2736 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OWNES_KW_in_declencheurTK2747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2750 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTOWNES_KW_in_declencheurTK2765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2768 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2772 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2805 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2823 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OWNED_KW_in_declencheurKT2838 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2841 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTOWNED_KW_in_declencheurKT2856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2859 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2863 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors2897 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_siAlors2902 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_consequences_in_siAlors2907 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_KW_in_conditions2947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_conditions2952 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions2958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_conditions2974 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions2978 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions2983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_conditions2999 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions3003 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions3008 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_conditions3024 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3028 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_conditions3049 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3053 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_conditions3074 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3078 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3083 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEG_in_conditions3099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3103 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPED_in_conditions3124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3128 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIFF_in_conditions3149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3153 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_etat_in_conditions3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat3196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3198 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3202 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3207 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat3222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3224 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3228 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3233 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat3248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3250 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3254 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3259 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat3274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3276 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3280 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3285 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat3300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3302 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3306 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3311 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat3326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3328 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3332 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3337 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat3352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3354 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3358 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat3378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3380 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat3396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3398 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat3413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3415 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat3430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L,0x0000000000080000L});
    public static final BitSet FOLLOW_mode_mute_in_etat3440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat3451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3453 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat3469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3471 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat3492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_etat3494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat3504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_etat3506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_mode_mute0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation3553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3557 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation3578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3582 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3587 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation3603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3607 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation3628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_affectation3630 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique3667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_iaBasique3669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3671 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation3695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3700 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_operation3722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3724 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3727 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_operation3743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3745 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3748 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_operation3764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3766 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation3785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3787 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_operation3806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3808 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_operation3827 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3829 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_operation3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operation3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable3900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3904 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_variable3925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3930 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Z_in_variable3951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3953 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_I_KW_in_variable3974 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable3978 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3982 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GAME_SCORE_KW_in_variable3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_KW_in_variable4005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_variable4009 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4014 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ALL_in_accesClass4057 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accesClass4077 = new BitSet(new long[]{0x0000000400105008L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_accesClass4081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLAYER_in_accesClass4102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_typeCoordonnees4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORIENTATION_in_typeCoordonnees4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_typeCoordonnees4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_timeUnit4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEC_in_timeUnit4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MS_in_timeUnit4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAME_in_timeUnit4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOST_INTERVAL_in_attributTps4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOOT_INTERVAL_in_attributTps4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOAD_TIME_in_attributTps4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}