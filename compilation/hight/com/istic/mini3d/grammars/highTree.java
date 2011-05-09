// $ANTLR 3.3 Nov 30, 2010 12:50:56 H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g 2011-05-09 15:06:22

    package com.istic.mini3d.grammars;
    import com.istic.mini3d.Main;
    import com.istic.mini3d.code.*;
    import com.istic.mini3d.symbols.*;
    import com.istic.mini3d.lib.*;
    import com.istic.mini3d.attributes.*;
    import java.util.Iterator;
    import java.util.Hashtable;
    import java.util.Enumeration;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class highTree extends TreeParser {
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


        public highTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public highTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return highTree.tokenNames; }
    public String getGrammarFileName() { return "H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g"; }

       
        private int INT_DUPLICABLE=10;
        private Hashtable<String, String> aggreg = new Hashtable<String, String>();
        private ErrorHandler handler = ErrorHandler.getInstance();

        public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
            if(Main.isDebug()) {
                super.displayRecognitionError(tokenNames, e);
            }
            else {
                String msg = getErrorMessage(e, tokenNames);
                int line = ((CommonErrorNode)e.node).start.getLine();
                String word = ((CommonErrorNode)e.node).trappedException.token.getText();

                handler.add(ErrorHandler.ErrorType.FATAL, line, "Erreur sur \""+word+"\". ");
            }
        }

        public int getLine(CommonTree i) {
    	return i.token.getLine();
        }



    // $ANTLR start "game"
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:47:1: game[SymbolTable st] returns [Code c] : ^( GAME_KW (gd= gameData[st] )* ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:48:27: ( ^( GAME_KW (gd= gameData[st] )* ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:49:5: ^( GAME_KW (gd= gameData[st] )* ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* )
            {
            match(input,GAME_KW,FOLLOW_GAME_KW_in_game72); 

            match(input, Token.DOWN, null); 
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:50:7: (gd= gameData[st] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==GAME_ATTRIBUT_KW) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:50:7: gd= gameData[st]
            	    {
            	    pushFollow(FOLLOW_gameData_in_game81);
            	    gd=gameData(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:52:5: ( newType[st] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:52:5: newType[st]
            	    {
            	    pushFollow(FOLLOW_newType_in_game95);
            	    newType(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_initialization_in_game105);
            in=initialization(st);

            state._fsp--;


            	//st.print();
                    //System.out.println(in.getCode());
                    c.append(in);
                
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:60:5: (def= definition[st] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DEFINITION_KW) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:60:6: def= definition[st]
            	    {
            	    pushFollow(FOLLOW_definition_in_game127);
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

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:67:8: (com= commande[st] )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:67:8: com= commande[st]
            	    {
            	    pushFollow(FOLLOW_commande_in_game150);
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

            c.append(com);
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:69:8: (reg= reglesJeu[st] )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:69:8: reg= reglesJeu[st]
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game166);
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

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:69:26: (ia= iaBasique[st] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IA_KW) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:69:26: ia= iaBasique[st]
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game172);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:75:1: gameData[SymbolTable st] returns [Code c] : ^( GAME_ATTRIBUT_KW attributGame_list[st] ) ;
    public final Code gameData(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:75:43: ( ^( GAME_ATTRIBUT_KW attributGame_list[st] ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:76:5: ^( GAME_ATTRIBUT_KW attributGame_list[st] )
            {
            match(input,GAME_ATTRIBUT_KW,FOLLOW_GAME_ATTRIBUT_KW_in_gameData203); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_attributGame_list_in_gameData205);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:78:1: attributGame_list[SymbolTable st] returns [Code c] : ( attributGame[st] )+ ;
    public final Code attributGame_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:78:52: ( ( attributGame[st] )+ )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:79:5: ( attributGame[st] )+
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:79:5: ( attributGame[st] )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:79:5: attributGame[st]
            	    {
            	    pushFollow(FOLLOW_attributGame_in_attributGame_list225);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:81:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) );
    public final Code attributGame(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:81:47: ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:82:2: ^( GRAVITY_KW FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame243); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame245); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:83:4: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame252); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame254); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame256); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame258); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:84:4: ^( TURNBASED_KW ( 'true' | 'false' ) )
                    {
                    match(input,TURNBASED_KW,FOLLOW_TURNBASED_KW_in_attributGame265); 

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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:85:4: ^( WORLD_KW mapType )
                    {
                    match(input,WORLD_KW,FOLLOW_WORLD_KW_in_attributGame278); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mapType_in_attributGame280);
                    mapType();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:86:4: ^( GRIDSIZE_KW FLOAT )
                    {
                    match(input,GRIDSIZE_KW,FOLLOW_GRIDSIZE_KW_in_attributGame287); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame289); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:87:4: ^( NAME_KW name )
                    {
                    match(input,NAME_KW,FOLLOW_NAME_KW_in_attributGame296); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_name_in_attributGame298);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:90:1: mapType returns [Integer i] : ( GENERIC | GRID | RIBBON );
    public final Integer mapType() throws RecognitionException {
        Integer i = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:90:28: ( GENERIC | GRID | RIBBON )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:96:1: name returns [String s] : i= IDENT ;
    public final String name() throws RecognitionException {
        String s = null;

        CommonTree i=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:96:24: (i= IDENT )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:97:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_name354); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:101:1: newType[SymbolTable st] : ^( TYPE i= IDENT ( subType[st,sub] )+ ) ;
    public final void newType(SymbolTable st) throws RecognitionException {
        CommonTree i=null;

        List<Model> sub = new ArrayList<Model>();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:102:54: ( ^( TYPE i= IDENT ( subType[st,sub] )+ ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:103:5: ^( TYPE i= IDENT ( subType[st,sub] )+ )
            {
            match(input,TYPE,FOLLOW_TYPE_in_newType390); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_newType394); 
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:103:20: ( subType[st,sub] )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:103:20: subType[st,sub]
            	    {
            	    pushFollow(FOLLOW_subType_in_newType396);
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
            	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Type \""+id+"\" déjà déclaré.");
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:117:1: subType[SymbolTable st, List<Model> sub] : i= IDENT ;
    public final void subType(SymbolTable st, List<Model> sub) throws RecognitionException {
        CommonTree i=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:117:43: (i= IDENT )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:118:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_subType426); 

            	String id = i.getText();
            	Symbol verif = st.get(id);
            	if(verif == null) {
            	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Model \""+id+"\" non défini.");
            	} else if(verif.getType() != Symbol.Type.MODEL) {
            	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), id+"\" n'est pas un Model.");
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:132:1: initialization[SymbolTable st] returns [Code c] : ( init[st] )+ ;
    public final Code initialization(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:132:49: ( ( init[st] )+ )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:133:5: ( init[st] )+
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:133:5: ( init[st] )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:133:5: init[st]
            	    {
            	    pushFollow(FOLLOW_init_in_initialization454);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:168:1: init[SymbolTable st] returns [Code c] : ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) | ^( INSERT_KW IDENT IDENT ( operation[st] )? ) | ^( REMOVE_KW ( IDENT | operation[st] ) IDENT ) );
    public final Code init(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Pair<Model, Integer> d = null;

        ArrayList<Symbol> ac = null;

        ArrayList<Pair<String,AttributeValue>> ao = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:168:39: ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) | ^( INSERT_KW IDENT IDENT ( operation[st] )? ) | ^( REMOVE_KW ( IDENT | operation[st] ) IDENT ) )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:169:5: ^( INIT_IS_KW i= IDENT d= declarationObjet[st] )
                    {
                    match(input,INIT_IS_KW,FOLLOW_INIT_IS_KW_in_init485); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_init489); 
                    pushFollow(FOLLOW_declarationObjet_in_init493);
                    d=declarationObjet(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            if(d!=null){
                                String id = i.getText();
                                Symbol verif = st.get(id);
                                if(verif != null) {
                                    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Elément \""+id+"\" déjà déclaré.");
                                } else {
                                    int mode = d.getSecond();
                    	    
                                    Entity t = new Entity(id,d.getFirst());
                                    d.getFirst().toGenerate();

                                    if(mode == INT_DUPLICABLE)
                                        t.setDuplicable();

                                    st.add(id,t);
                                }
                            }
                        

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:189:7: ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] )
                    {
                    match(input,INIT_HAS_KW,FOLLOW_INIT_HAS_KW_in_init510); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_init514);
                    ac=accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_affectationObjet_list_in_init519);
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
                                        boolean pl = false;
                                        Entity s2 = (Entity)s;
                                        List<Model> am = s2.listModels();
                                        Iterator<Model> imod = am.iterator();
                                        while(imod.hasNext()){
                                            Model mod = imod.next();
                                            if(mod.getName().equals("Player")){
                                                Entity e1 = (Entity)st.get(attributeValue);
                                                e1.setPlayerName(s.getName());
                                                pl = true;
                                                break;
                                            }
                                        }
                                        if(!pl)
                                            aggreg.put(attributeValue,s.getName());
                                    }else{
                    		    AttributeValue attr = s.getAttribute(attributeValue);
                                        if(attr != null && attr.getType() != p.getSecond().getType()) {
                    			handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Type incompatible.");
                                        }
                                        s.addAttribute(p.getFirst(),p.getSecond());
                                    }
                    	    }
                    	}
                        

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:224:7: ^( INSERT_KW IDENT IDENT ( operation[st] )? )
                    {
                    match(input,INSERT_KW,FOLLOW_INSERT_KW_in_init536); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_init538); 
                    match(input,IDENT,FOLLOW_IDENT_in_init540); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:224:31: ( operation[st] )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==GAME_SCORE_KW||LA11_0==VALUE_KW||LA11_0==VAR_I_KW||LA11_0==FLOAT||LA11_0==RANDOM_KW||(LA11_0>=PLUS && LA11_0<=POW)||(LA11_0>=X && LA11_0<=Z)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:224:31: operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_init542);
                            operation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:225:7: ^( REMOVE_KW ( IDENT | operation[st] ) IDENT )
                    {
                    match(input,REMOVE_KW,FOLLOW_REMOVE_KW_in_init554); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:225:19: ( IDENT | operation[st] )
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:225:20: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_init557); 

                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:225:26: operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_init559);
                            operation(st);

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_init563); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:229:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC t= typeEntity[st] (d= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( CAMERA_KW ON ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER (s= SOLO )? );
    public final Pair<Model, Integer> declarationObjet(SymbolTable st) throws RecognitionException {
        Pair<Model, Integer> p = null;

        CommonTree s=null;
        Model t = null;

        Integer d = null;


        d=null;s=null;
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:230:26: ( ^( DEC t= typeEntity[st] (d= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( CAMERA_KW ON ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER (s= SOLO )? )
            int alt16=9;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:231:5: ^( DEC t= typeEntity[st] (d= dupli )? )
                    {
                    match(input,DEC,FOLLOW_DEC_in_declarationObjet596); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet600);
                    t=typeEntity(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:231:28: (d= dupli )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==DUPLICABLE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:231:29: d= dupli
                            {
                            pushFollow(FOLLOW_dupli_in_declarationObjet606);
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:238:7: ^( LIST_KW list_declaration[st] )
                    {
                    match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet624); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_declaration_in_declarationObjet626);
                    list_declaration(st);

                    state._fsp--;


                    match(input, Token.UP, null); 


                    	//p = new Pair<Model, Integer>
                        

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:243:7: ^( CAMERA_KW PERSON view[st] )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet643); 

                    match(input, Token.DOWN, null); 
                    match(input,PERSON,FOLLOW_PERSON_in_declarationObjet645); 
                    pushFollow(FOLLOW_view_in_declarationObjet647);
                    view(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:244:7: ^( CAMERA_KW FREE )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet658); 

                    match(input, Token.DOWN, null); 
                    match(input,FREE,FOLLOW_FREE_in_declarationObjet660); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:245:7: ^( CAMERA_KW ON )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet670); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_declarationObjet672); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:246:7: ^( MEDIA_KW LOOP )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet682); 

                    match(input, Token.DOWN, null); 
                    match(input,LOOP,FOLLOW_LOOP_in_declarationObjet684); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:247:7: ^( MEDIA_KW ONCE )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet694); 

                    match(input, Token.DOWN, null); 
                    match(input,ONCE,FOLLOW_ONCE_in_declarationObjet696); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:248:7: ^( IN_KW IDENT )
                    {
                    match(input,IN_KW,FOLLOW_IN_KW_in_declarationObjet714); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declarationObjet716); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:249:7: PLAYER (s= SOLO )?
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_declarationObjet736); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:249:14: (s= SOLO )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==SOLO) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:249:15: s= SOLO
                            {
                            s=(CommonTree)match(input,SOLO,FOLLOW_SOLO_in_declarationObjet741); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:258:1: list_declaration[SymbolTable st] returns [Code c] : ( (o= operation[st] )? i= IDENT )+ ;
    public final Code list_declaration(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code o = null;


        o = null;
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:259:21: ( ( (o= operation[st] )? i= IDENT )+ )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:260:5: ( (o= operation[st] )? i= IDENT )+
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:260:5: ( (o= operation[st] )? i= IDENT )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:260:6: (o= operation[st] )? i= IDENT
            	    {
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:260:6: (o= operation[st] )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==GAME_SCORE_KW||LA17_0==VALUE_KW||LA17_0==VAR_I_KW||LA17_0==FLOAT||LA17_0==RANDOM_KW||(LA17_0>=PLUS && LA17_0<=POW)||(LA17_0>=X && LA17_0<=Z)) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:260:7: o= operation[st]
            	            {
            	            pushFollow(FOLLOW_operation_in_list_declaration783);
            	            o=operation(st);

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_list_declaration790); 

            	    	String id = i.getText();
            	    	Symbol verif = st.get(id);
            	    	if(verif == null) {
            	    	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Model \""+id+"\" non défini.");
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:270:1: typeEntity[SymbolTable st] returns [Model t] : i= IDENT ;
    public final Model typeEntity(SymbolTable st) throws RecognitionException {
        Model t = null;

        CommonTree i=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:270:46: (i= IDENT )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:271:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeEntity823); 

            	String id = i.getText();
            	Symbol verif = st.get(id);
            	if(verif == null) {
            	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Model \""+id+"\" non défini.");
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:283:1: dupli returns [Integer i] : DUPLICABLE ;
    public final Integer dupli() throws RecognitionException {
        Integer i = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:283:26: ( DUPLICABLE )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:284:5: DUPLICABLE
            {
            match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli849); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:288:1: view[SymbolTable st] returns [Code c] : ( FIRST | THIRD );
    public final Code view(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:288:39: ( FIRST | THIRD )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:292:1: affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : (a= affectationObjet[st] )+ ;
    public final ArrayList<Pair<String,AttributeValue>> affectationObjet_list(SymbolTable st) throws RecognitionException {
        ArrayList<Pair<String,AttributeValue>> c = null;

        ArrayList<Pair<String,AttributeValue>> a = null;


        c = new ArrayList<Pair<String,AttributeValue>>();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:293:62: ( (a= affectationObjet[st] )+ )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:294:5: (a= affectationObjet[st] )+
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:294:5: (a= affectationObjet[st] )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:294:6: a= affectationObjet[st]
            	    {
            	    pushFollow(FOLLOW_affectationObjet_in_affectationObjet_list915);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:296:1: affectationObjet[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:296:142: ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:297:5: ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet943); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet947); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:297:31: (t= valAggregation[st] )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==AGGREGATION_KW||(LA20_0>=221 && LA20_0<=222)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:297:31: t= valAggregation[st]
                            {
                            pushFollow(FOLLOW_valAggregation_in_affectationObjet951);
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:306:7: ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet970); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_affectationObjet974);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_affectationObjet979);
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:323:7: ^( ALLOCATION_KW attributListeOuObjet[st] IDENT )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet997); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributListeOuObjet_in_affectationObjet999);
                    attributListeOuObjet(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_affectationObjet1002); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:324:7: ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet1013); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_affectationObjet1017);
                    att=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_affectationObjet1022);
                    v=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_affectationObjet1027);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:331:1: valAggregation[SymbolTable st] returns [AttributeValue c] : ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' );
    public final AttributeValue valAggregation(SymbolTable st) throws RecognitionException {
        AttributeValue c = null;

        CommonTree i=null;
        Code o = null;

        String t = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:331:59: ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:332:5: ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation1064); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_valAggregation1068);
                    o=operation(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:332:39: (t= timeUnit[st] )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=MIN && LA22_0<=FRAME)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:332:39: t= timeUnit[st]
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1073);
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:340:6: ^( AGGREGATION_KW i= IDENT )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation1090); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1094); 

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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:350:7: 'true'
                    {
                    match(input,221,FOLLOW_221_in_valAggregation1109); 
                    c = new AttributeValue(true);

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:351:7: 'false'
                    {
                    match(input,222,FOLLOW_222_in_valAggregation1119); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:356:1: definition[SymbolTable st] returns [Code c] : ^( DEFINITION_KW i= IDENT cons= consequences[st,d] ) ;
    public final Code definition(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code cons = null;


         Definition d = new Definition(); c = new Code();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:356:102: ( ^( DEFINITION_KW i= IDENT cons= consequences[st,d] ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:357:5: ^( DEFINITION_KW i= IDENT cons= consequences[st,d] )
            {
            match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1153); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definition1157); 
            pushFollow(FOLLOW_consequences_in_definition1161);
            cons=consequences(st, d);

            state._fsp--;


            match(input, Token.UP, null); 

            	String ident = i.getText();
            	if(st.get(ident)!=null) {
            	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "La définition \""+ident+"\" est déjà défini.");
            	} else {
            	    
            	    d.setName(ident);
            	    d.append(cons);
            	    c.append(Code.genFuncDef(d));
            	    st.add(ident,d);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:372:1: consequences[SymbolTable st , Definition d] returns [Code c] : ^( CONSEQUENCES_KW conslist= consequ_list[st,d] ) ;
    public final Code consequences(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        Code conslist = null;


         c = new Code();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:373:29: ( ^( CONSEQUENCES_KW conslist= consequ_list[st,d] ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:374:5: ^( CONSEQUENCES_KW conslist= consequ_list[st,d] )
            {
            match(input,CONSEQUENCES_KW,FOLLOW_CONSEQUENCES_KW_in_consequences1201); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_consequ_list_in_consequences1205);
            conslist=consequ_list(st, d);

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:380:1: consequ_list[SymbolTable st , Definition d] returns [Code c] : (cons= consequ[st,d] )+ ;
    public final Code consequ_list(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        Code cons = null;


         c = new Code();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:381:29: ( (cons= consequ[st,d] )+ )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:382:5: (cons= consequ[st,d] )+
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:382:5: (cons= consequ[st,d] )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:382:6: cons= consequ[st,d]
            	    {
            	    pushFollow(FOLLOW_consequ_in_consequ_list1247);
            	    cons=consequ(st, d);

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:385:1: consequ[SymbolTable st,Definition d] returns [Code c] : (i= siAlors[st] | act= action[st] | a= affectation[st,d] | activCommande[st] | id= IDENT | ^( VICTORY_KW IDENT ( IDENT )? ) | ^( DEFEAT_KW IDENT ( IDENT )? ) );
    public final Code consequ(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        CommonTree id=null;
        Code i = null;

        Code act = null;

        Code a = null;


         c = new Code();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:386:29: (i= siAlors[st] | act= action[st] | a= affectation[st,d] | activCommande[st] | id= IDENT | ^( VICTORY_KW IDENT ( IDENT )? ) | ^( DEFEAT_KW IDENT ( IDENT )? ) )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:387:5: i= siAlors[st]
                    {
                    pushFollow(FOLLOW_siAlors_in_consequ1287);
                    i=siAlors(st);

                    state._fsp--;

                    c=i;

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:389:7: act= action[st]
                    {
                    pushFollow(FOLLOW_action_in_consequ1304);
                    act=action(st);

                    state._fsp--;

                    c.append(act);

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:391:7: a= affectation[st,d]
                    {
                    pushFollow(FOLLOW_affectation_in_consequ1321);
                    a=affectation(st, d);

                    state._fsp--;

                    c=a;

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:392:7: activCommande[st]
                    {
                    pushFollow(FOLLOW_activCommande_in_consequ1332);
                    activCommande(st);

                    state._fsp--;



                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:393:7: id= IDENT
                    {
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_consequ1345); 
                    	c.append(id.getText());c.append("\n");

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:394:7: ^( VICTORY_KW IDENT ( IDENT )? )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1355); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1357); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:394:26: ( IDENT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==IDENT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:394:26: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_consequ1359); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:395:7: ^( DEFEAT_KW IDENT ( IDENT )? )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1370); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1372); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:395:25: ( IDENT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==IDENT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:395:25: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_consequ1374); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:398:1: action[SymbolTable st] returns [Code c] : (ent= accesClass[st] act= actionObjet[st,ent] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st,new Definition()] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) );
    public final Code action(SymbolTable st) throws RecognitionException {
        Code c = null;

        ArrayList<Symbol> ent = null;

        Code act = null;

        ArrayList<Symbol> ta = null;

        Coordonnees td = null;

        Code op = null;

        String t = null;

        Code cons = null;


         c = new Code();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:399:28: (ent= accesClass[st] act= actionObjet[st,ent] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st,new Definition()] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) )
            int alt36=19;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:400:5: ent= accesClass[st] act= actionObjet[st,ent]
                    {
                    pushFollow(FOLLOW_accesClass_in_action1410);
                    ent=accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionObjet_in_action1417);
                    act=actionObjet(st, ent);

                    state._fsp--;


                          c.append(act);
                        

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:404:6: ^( ENDS_KW IDENT ( IDENT )? )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1432); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1434); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:404:22: ( IDENT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:404:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1436); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:405:6: ^( ENDS_KW GAME ( IDENT )? )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1446); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1448); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:405:21: ( IDENT )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:405:21: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1450); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:406:6: ^( STARTS_KW IDENT ( IDENT )? )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1460); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1462); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:406:24: ( IDENT )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:406:24: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1464); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:407:6: ^( STARTS_KW GAME ( IDENT )? )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1474); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1476); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:407:23: ( IDENT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENT) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:407:23: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1478); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:408:6: ^( PAUSE_KW IDENT ( IDENT )? )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1488); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1490); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:408:23: ( IDENT )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENT) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:408:23: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1492); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:409:6: ^( PAUSE_KW GAME ( IDENT )? )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1502); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1504); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:409:22: ( IDENT )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:409:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1506); 

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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:419:6: ^( MUTE_KW mode_mute[st] IDENT )
                    {
                    match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1522); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mode_mute_in_action1524);
                    mode_mute(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_action1527); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:420:6: ^( PLAY_KW IDENT )
                    {
                    match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1536); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1538); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:421:6: ^( STOP_KW IDENT )
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_action1547); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1549); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:422:6: ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] )
                    {
                    match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1558); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_transformation_in_action1560);
                    transformation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_action1563);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_action1566);
                    coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:423:6: ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1576); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1578);
                    typeAcces(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:423:32: ( typeDestination[st] )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==COORDINATE_KW||LA34_0==ACCESS_KW) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:423:32: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1581);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:424:6: ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? )
                    {
                    match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1592); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1596);
                    ta=typeAcces(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:424:39: (td= typeDestination[st] )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COORDINATE_KW||LA35_0==ACCESS_KW) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:424:39: td= typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1601);
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
                    		handler.add(ErrorHandler.ErrorType.FATAL, 0, e.getName() + " n'est pas duplicable!");
                    	    }
                    	    if(td!=null){  
                    		e.getAttribute("posX").setCode(td.getX());
                    		e.getAttribute("posY").setCode(td.getY());
                    		e.getAttribute("posZ").setCode(td.getZ());
                    	    }  
                    	    e.toGenerate();
                    	    c.append("\t");		c.append(Code.genEntity((Entity) e));
                    	    c.append("\t");		c.append(Code.genAddObject((Entity) e,false,null));
                    	} 
                        

                    }
                    break;
                case 14 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:443:6: ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st,new Definition()] )
                    {
                    match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1618); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_action1622);
                    op=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_action1627);
                    t=timeUnit(st);

                    state._fsp--;

                    pushFollow(FOLLOW_consequences_in_action1632);
                    cons=consequences(st, new Definition());

                    state._fsp--;


                    match(input, Token.UP, null); 

                        	c.append(Code.genSetTimeout(cons,op,t));
                        

                    }
                    break;
                case 15 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:447:6: SAVE_KW
                    {
                    match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1648); 

                    }
                    break;
                case 16 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:448:6: ^( NEXTURN_KW IDENT )
                    {
                    match(input,NEXTURN_KW,FOLLOW_NEXTURN_KW_in_action1656); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1658); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:450:6: ^( GRASPS_KW IDENT IDENT )
                    {
                    match(input,GRASPS_KW,FOLLOW_GRASPS_KW_in_action1672); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1674); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1676); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:451:6: ^( EXPELS_KW IDENT IDENT operation[st] )
                    {
                    match(input,EXPELS_KW,FOLLOW_EXPELS_KW_in_action1685); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1687); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1689); 
                    pushFollow(FOLLOW_operation_in_action1691);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:452:6: ^( INGESTS_KW IDENT IDENT IDENT )
                    {
                    match(input,INGESTS_KW,FOLLOW_INGESTS_KW_in_action1701); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1703); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1705); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1707); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:455:1: typeAcces[SymbolTable st] returns [ArrayList<Symbol> l] : (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) );
    public final ArrayList<Symbol> typeAcces(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> l = null;

        ArrayList<Symbol> ac = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:455:57: (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:456:5: ac= accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeAcces1732);
                    ac=accesClass(st);

                    state._fsp--;

                    l=ac;

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:457:7: operation[st] ( IDENT | accesClass[st] )
                    {
                    pushFollow(FOLLOW_operation_in_typeAcces1743);
                    operation(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:457:21: ( IDENT | accesClass[st] )
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:457:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_typeAcces1747); 

                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:457:30: accesClass[st]
                            {
                            pushFollow(FOLLOW_accesClass_in_typeAcces1751);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:460:1: typeDestination[SymbolTable st] returns [Coordonnees coord] : ( accesClass[st] | coo= coordinates[st] );
    public final Coordonnees typeDestination(SymbolTable st) throws RecognitionException {
        Coordonnees coord = null;

        Coordonnees coo = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:460:61: ( accesClass[st] | coo= coordinates[st] )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:461:5: accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeDestination1778);
                    accesClass(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:462:7: coo= coordinates[st]
                    {
                    pushFollow(FOLLOW_coordinates_in_typeDestination1789);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:464:1: actionObjet[SymbolTable st,List<Symbol> l] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | act= actionCommandeMaintenue[st,l] | ^( DURING actionCommandeMaintenue[st,l] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st,l] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );
    public final Code actionObjet(SymbolTable st, List<Symbol> l) throws RecognitionException {
        Code c = null;

        Code act = null;


        c=new Code();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:464:81: ( DIES_KW | actionCommandePressee[st] | act= actionCommandeMaintenue[st,l] | ^( DURING actionCommandeMaintenue[st,l] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st,l] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) )
            int alt40=8;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:465:5: DIES_KW
                    {
                    match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1811); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:466:7: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1819);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:467:7: act= actionCommandeMaintenue[st,l]
                    {
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1832);
                    act=actionCommandeMaintenue(st, l);

                    state._fsp--;


                          c.append(act);
                        

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:471:6: ^( DURING actionCommandeMaintenue[st,l] operation[st] timeUnit[st] )
                    {
                    match(input,DURING,FOLLOW_DURING_in_actionObjet1847); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1849);
                    actionCommandeMaintenue(st, l);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_actionObjet1852);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_actionObjet1855);
                    timeUnit(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:472:6: ^( UNTIL actionCommandeMaintenue[st,l] conditions[st] )
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1865); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1867);
                    actionCommandeMaintenue(st, l);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_actionObjet1870);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:473:6: ^( EQUIP accesClass[st] )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1880); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_actionObjet1882);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:474:6: ^( EQUIP NEXT )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1892); 

                    match(input, Token.DOWN, null); 
                    match(input,NEXT,FOLLOW_NEXT_in_actionObjet1894); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:475:6: ^( EQUIP PREVIOUS )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1903); 

                    match(input, Token.DOWN, null); 
                    match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1905); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:478:1: actionCommandePressee[SymbolTable st] returns [Code c] : ^( JUMP operation[st] ) ;
    public final Code actionCommandePressee(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:478:56: ( ^( JUMP operation[st] ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:479:3: ^( JUMP operation[st] )
            {
            match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1927); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_actionCommandePressee1929);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:482:1: actionCommandeMaintenue[SymbolTable st,List<Symbol> ls] returns [Code c] : ( ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) val= operation[st] ) | ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] ) | ^( ACCELERATE operation[st] ) | ^( BRAKE operation[st] ) );
    public final Code actionCommandeMaintenue(SymbolTable st, List<Symbol> ls) throws RecognitionException {
        Code c = null;

        Code val = null;


        c = new Code();List<Integer> l = new ArrayList();int x=0,y=0,z=0;
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:482:146: ( ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) val= operation[st] ) | ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] ) | ^( ACCELERATE operation[st] ) | ^( BRAKE operation[st] ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt42=1;
                }
                break;
            case TURN:
                {
                alt42=2;
                }
                break;
            case ACCELERATE:
                {
                alt42=3;
                }
                break;
            case BRAKE:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:483:3: ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) val= operation[st] )
                    {
                    match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1954); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:483:10: ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN )
                    int alt41=6;
                    switch ( input.LA(1) ) {
                    case LEFT:
                        {
                        alt41=1;
                        }
                        break;
                    case RIGHT:
                        {
                        alt41=2;
                        }
                        break;
                    case FORWARD:
                        {
                        alt41=3;
                        }
                        break;
                    case BACKWARD:
                        {
                        alt41=4;
                        }
                        break;
                    case WUP:
                        {
                        alt41=5;
                        }
                        break;
                    case WDOWN:
                        {
                        alt41=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:483:11: LEFT
                            {
                            match(input,LEFT,FOLLOW_LEFT_in_actionCommandeMaintenue1957); 
                            x=-1;

                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:483:25: RIGHT
                            {
                            match(input,RIGHT,FOLLOW_RIGHT_in_actionCommandeMaintenue1962); 
                            x=1;

                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:483:39: FORWARD
                            {
                            match(input,FORWARD,FOLLOW_FORWARD_in_actionCommandeMaintenue1967); 
                            y=1;

                            }
                            break;
                        case 4 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:483:55: BACKWARD
                            {
                            match(input,BACKWARD,FOLLOW_BACKWARD_in_actionCommandeMaintenue1972); 
                            y=-1;

                            }
                            break;
                        case 5 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:483:73: WUP
                            {
                            match(input,WUP,FOLLOW_WUP_in_actionCommandeMaintenue1977); 
                            z=1;

                            }
                            break;
                        case 6 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:483:85: WDOWN
                            {
                            match(input,WDOWN,FOLLOW_WDOWN_in_actionCommandeMaintenue1982); 
                            z=-1;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1990);
                    val=operation(st);

                    state._fsp--;


                        int v = 1;
                          try{
                            v = Integer.parseInt(val.getCode());  
                          }
                          catch(Exception e){
                            e.printStackTrace(); 
                          } 

                        x *= v; y *= v; z *= v;
                        l.add(x); l.add(y); l.add(z);
                      
                        for(Iterator<Symbol> it = ls.iterator() ; it.hasNext();){
                          Symbol s = it.next();
                          c.append(Code.genTranslate(s.getName(),l, "false",s.getName()));
                        }
                      

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:502:5: ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] )
                    {
                    match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue2007); 

                    match(input, Token.DOWN, null); 
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLOCKWISE && input.LA(1)<=ANTICLOCKWISE) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue2033);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:503:5: ^( ACCELERATE operation[st] )
                    {
                    match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue2042); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue2044);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:504:5: ^( BRAKE operation[st] )
                    {
                    match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue2053); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue2055);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:507:1: transformation[SymbolTable st] returns [Code c] : ( TRANSLATION | ROTATION | SCALE );
    public final Code transformation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:507:49: ( TRANSLATION | ROTATION | SCALE )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:513:1: coordinates[SymbolTable st] returns [Coordonnees coo] : ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) ;
    public final Coordonnees coordinates(SymbolTable st) throws RecognitionException {
        Coordonnees coo = null;

        Code x = null;

        Code y = null;

        Code z = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:513:55: ( ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:514:5: ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] )
            {
            match(input,COORDINATE_KW,FOLLOW_COORDINATE_KW_in_coordinates2119); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_coordinates2123);
            x=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates2128);
            y=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates2133);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:523:1: commande[SymbolTable st] returns [Code c] : ^( COMMAND_KW listplay= player_list[st] listCommand= actionCommande_list[st] ) ;
    public final Code commande(SymbolTable st) throws RecognitionException {
        Code c = null;

        ArrayList<Symbol> listplay = null;

        ArrayList <Control> listCommand = null;


        int nbCommande = 0;c = new Code();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:523:85: ( ^( COMMAND_KW listplay= player_list[st] listCommand= actionCommande_list[st] ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:524:5: ^( COMMAND_KW listplay= player_list[st] listCommand= actionCommande_list[st] )
            {
            match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande2172); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_player_list_in_commande2176);
            listplay=player_list(st);

            state._fsp--;

            pushFollow(FOLLOW_actionCommande_list_in_commande2181);
            listCommand=actionCommande_list(st);

            state._fsp--;


            match(input, Token.UP, null); 
            boolean present = false;
                 Code [] tab = new Code[4];
                 boolean clavier = false;
                 ArrayList <Control> list_event = new ArrayList<Control>();
                 ArrayList <Control> list_save = new ArrayList<Control>();
                 ArrayList <Code> list_signature = new ArrayList<Code>();
                 Iterator<Control> it = listCommand.iterator();
                 while(it.hasNext()) {
            	    Control ctr = it.next();
                        if(ctr.getName().equals("3_UP")|ctr.getName().equals("3_DOWN") | ctr.getName().equals("3_LEFT") | ctr.getName().equals("3_RIGHT"))
                            list_save.add(ctr);
                        else{
                            clavier = true;
                            list_event.add(ctr);
                            }
                   }

                   if(!list_event.isEmpty()){
                        System.out.println("Event");
                        present = true;
                        Iterator<Control> ei = list_event.iterator();
                        while(ei.hasNext()){
                            Control ctrl = ei.next();
                            Definition def = ctrl.getDefinition();
                            Code v = new Code(def.getName()+"(");
                            if(!def.getSignature().isEmpty()){
                              Iterator<Model> im = def.getSignature().iterator();
                              while(im.hasNext()){
                                Model m = im.next();
                                System.out.println(m.getName());
                                Code l = new Code();
                                Enumeration enu = aggreg.keys();

                                while(enu.hasMoreElements()){
                                    String e = (String)enu.nextElement();
                                    String q = aggreg.get(e);

                                    Entity fi = (Entity)st.get(e);
                                    Entity et = (Entity)st.get(q);

                                    if(et != null&&fi!= null){
                                        String a = aggreg.get(q);
                                        if(a!=null){
                                            Entity et1 = (Entity)st.get(a);
                                            System.out.println(et1.getPlayerName()+listplay.get(0).getName());
                                            }
                                        if(fi.listModels().contains(m) && ((et.getName().equals(listplay.get(0).getName()))||(et.getPlayerName().equals(listplay.get(0).getName())))){
                                            l.append(e);
                                            break;
                                        }
                                    }
                               }
                                if(l.getCode().equals("")){
                                    System.out.println("pas d'alternatives");
                                    System.exit(-1);
                                }else
                                    v.append(l);

                              }
                            }
                            v.append(");");
                            list_signature.add(v);
                        }
                   }
                   if(!list_save.isEmpty()){

                       System.out.println("Position");
                        Iterator<Control> ei = list_save.iterator();
                        while(ei.hasNext()){
                            Control ctrl = ei.next();
                            Definition def = ctrl.getDefinition();
                            Code v = new Code(def.getName()+"(");
                            if(!def.getSignature().isEmpty()){
                              Iterator<Model> im = def.getSignature().iterator();
                              while(im.hasNext()){
                                Model m = im.next();
                                System.out.println(m.getName());
                                Code l = new Code();
                                Enumeration enu = aggreg.keys();
                                
                                while(enu.hasMoreElements()){
                                    String e = (String)enu.nextElement();
                                    String q = aggreg.get(e);

                                    Entity fi = (Entity)st.get(e);
                                    Entity et = (Entity)st.get(q);

                                    if(et != null&&fi!= null){
                                        String a = aggreg.get(q);
                                        if(a!=null){
                                            Entity et1 = (Entity)st.get(a);
                                            System.out.println(et1.getPlayerName()+listplay.get(0).getName());
                                            }
                                        if(fi.listModels().contains(m) && ((et.getName().equals(listplay.get(0).getName()))||(et.getPlayerName().equals(listplay.get(0).getName())))){
                                            l.append(e);
                                            break;
                                        }
                                    }
                               }
                                if(l.getCode().equals("")){
                                    System.out.println("pas d'alternatives");
                                    System.exit(-1);
                                }else
                                    v.append(l);

                              }
                            }
                            v.append(");");
                            if(ctrl.getName().equals("3_UP")){tab[0] = v;}
                            else if(ctrl.getName().equals("3_DOWN")){tab[1] = v;}
                            else if(ctrl.getName().equals("3_LEFT")){tab[2] = v;}
                            else{tab[3] = v;}
                            System.out.println(v.getCode());
                        }
                   }
                   c.append(Code.genRefreshLoop(tab,list_event));
                   c.append(Code.genEventListener(clavier,false,false));
                   c.append(Code.genCMDKeyDown(list_event));
                   c.append(Code.genCMDKeyUp(list_event));
                   c.append(Code.genCMDExec(list_event,list_signature));
                   

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:648:1: player_list[SymbolTable st] returns [ArrayList<Symbol> list] : (i= IDENT )+ ;
    public final ArrayList<Symbol> player_list(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> list = null;

        CommonTree i=null;

        list = new ArrayList<Symbol>();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:648:101: ( (i= IDENT )+ )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:649:5: (i= IDENT )+
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:649:5: (i= IDENT )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==IDENT) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:649:6: i= IDENT
            	    {
            	    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_player_list2218); 
            	    String e = i.getText();Symbol m = st.get(e);
            	                if(m==null){
            	    		handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "Entité "+ e + "inexistante");
            	                }else{
            	                    if( m.getType()== Symbol.Type.ENTITY){
            	                        list.add(m);
            	                    }else{
            	    		    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), e + " n'est pas une Entité");
            	                    }
            	                }

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
        return list;
    }
    // $ANTLR end "player_list"


    // $ANTLR start "actionCommande_list"
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:661:1: actionCommande_list[SymbolTable st] returns [ArrayList <Control> c_list] : (c= actionCommande[st] )+ ;
    public final ArrayList <Control> actionCommande_list(SymbolTable st) throws RecognitionException {
        ArrayList <Control> c_list = null;

        Control c = null;


        c_list = new ArrayList<Control>();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:661:115: ( (c= actionCommande[st] )+ )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:662:2: (c= actionCommande[st] )+
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:662:2: (c= actionCommande[st] )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=KEY_KW && LA44_0<=MOUSE_KW)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:662:3: c= actionCommande[st]
            	    {
            	    pushFollow(FOLLOW_actionCommande_in_actionCommande_list2247);
            	    c=actionCommande(st);

            	    state._fsp--;

            	    c_list.add(c);

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
        return c_list;
    }
    // $ANTLR end "actionCommande_list"


    // $ANTLR start "actionCommande"
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:665:1: actionCommande[SymbolTable st] returns [Control c] : ( ^( MOUSE_KW v= souris[st] (n= commandMode )? d= definitionId[st] ) | ^( KEY_KW v= clavier[st] (n= commandMode )? d= definitionId[st] ) );
    public final Control actionCommande(SymbolTable st) throws RecognitionException {
        Control c = null;

        String v = null;

        Control.Mode n = null;

        Definition d = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:665:52: ( ^( MOUSE_KW v= souris[st] (n= commandMode )? d= definitionId[st] ) | ^( KEY_KW v= clavier[st] (n= commandMode )? d= definitionId[st] ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==MOUSE_KW) ) {
                alt47=1;
            }
            else if ( (LA47_0==KEY_KW) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:666:5: ^( MOUSE_KW v= souris[st] (n= commandMode )? d= definitionId[st] )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande2272); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_souris_in_actionCommande2276);
                    v=souris(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:666:30: (n= commandMode )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=PRESSED_KW && LA45_0<=RELEASED_KW)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:666:30: n= commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2281);
                            n=commandMode();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_definitionId_in_actionCommande2286);
                    d=definitionId(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    if(n == null){
                            c = new Control(v,Control.Source.SOURIS,d);
                        }else{
                            c = new Control(v,n,Control.Source.SOURIS,d);
                        }
                        Symbol s = st.get(c.getName());
                        if(s != null){
                    	handler.add(ErrorHandler.ErrorType.FATAL, 0, "Commande déjà définie");
                            }
                        st.add(c.getName(),c);
                        

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:678:6: ^( KEY_KW v= clavier[st] (n= commandMode )? d= definitionId[st] )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande2302); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_clavier_in_actionCommande2306);
                    v=clavier(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:678:30: (n= commandMode )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=PRESSED_KW && LA46_0<=RELEASED_KW)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:678:30: n= commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2311);
                            n=commandMode();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_definitionId_in_actionCommande2316);
                    d=definitionId(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    if(n == null){
                            c = new Control(v,Control.Source.CLAVIER,d);
                        }else{
                            c = new Control(v,n,Control.Source.CLAVIER,d);
                        }
                        Symbol s = st.get(c.getName());
                        if(s != null){
                            handler.add(ErrorHandler.ErrorType.FATAL, 0, "Commande déjà définie");
                            }
                        st.add(c.getName(),c);
                        

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:692:1: commandMode returns [Control.Mode m] : ( PRESSED_KW | HELD_KW | RELEASED_KW );
    public final Control.Mode commandMode() throws RecognitionException {
        Control.Mode m = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:692:37: ( PRESSED_KW | HELD_KW | RELEASED_KW )
            int alt48=3;
            switch ( input.LA(1) ) {
            case PRESSED_KW:
                {
                alt48=1;
                }
                break;
            case HELD_KW:
                {
                alt48=2;
                }
                break;
            case RELEASED_KW:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:693:5: PRESSED_KW
                    {
                    match(input,PRESSED_KW,FOLLOW_PRESSED_KW_in_commandMode2349); 
                    m = Control.Mode.PRESSED;

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:693:45: HELD_KW
                    {
                    match(input,HELD_KW,FOLLOW_HELD_KW_in_commandMode2354); 
                    m = Control.Mode.HELD;

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:693:79: RELEASED_KW
                    {
                    match(input,RELEASED_KW,FOLLOW_RELEASED_KW_in_commandMode2359); 
                    m = Control.Mode.RELEASED;

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
        return m;
    }
    // $ANTLR end "commandMode"


    // $ANTLR start "definitionId"
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:696:1: definitionId[SymbolTable st] returns [Definition d] : i= IDENT ;
    public final Definition definitionId(SymbolTable st) throws RecognitionException {
        Definition d = null;

        CommonTree i=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:696:53: (i= IDENT )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:697:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definitionId2385); 
            String nom = i.getText(); Symbol s = st.get(nom);
                    if(s == null){
            	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), "La Definition "+nom+" n'existe pas");
                    }else{
                    if( s.getType()== Symbol.Type.DEFINITION){
                                d=(Definition)s;
                    }else{
            	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), nom+" n'est pas une Définition");
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:708:1: souris[SymbolTable st] returns [String c] : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final String souris(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:708:43: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            int alt49=9;
            switch ( input.LA(1) ) {
            case WUP:
                {
                alt49=1;
                }
                break;
            case WDOWN:
                {
                alt49=2;
                }
                break;
            case LEFT:
                {
                alt49=3;
                }
                break;
            case RIGHT:
                {
                alt49=4;
                }
                break;
            case CLICK_LEFT:
                {
                alt49=5;
                }
                break;
            case CLICK_MIDDLE:
                {
                alt49=6;
                }
                break;
            case CLICK_RIGHT:
                {
                alt49=7;
                }
                break;
            case SCROLL_UP:
                {
                alt49=8;
                }
                break;
            case SCROLL_DOWN:
                {
                alt49=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:709:5: WUP
                    {
                    match(input,WUP,FOLLOW_WUP_in_souris2410); 
                    c = "UP";

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:709:22: WDOWN
                    {
                    match(input,WDOWN,FOLLOW_WDOWN_in_souris2415); 
                    c = "DOWN";

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:709:43: LEFT
                    {
                    match(input,LEFT,FOLLOW_LEFT_in_souris2420); 
                    c = "LEFT";

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:709:63: RIGHT
                    {
                    match(input,RIGHT,FOLLOW_RIGHT_in_souris2425); 
                    c = "RIGHT";

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:709:85: CLICK_LEFT
                    {
                    match(input,CLICK_LEFT,FOLLOW_CLICK_LEFT_in_souris2430); 
                    c = "CLK_LEFT";

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:709:115: CLICK_MIDDLE
                    {
                    match(input,CLICK_MIDDLE,FOLLOW_CLICK_MIDDLE_in_souris2435); 
                    c = "CLK_MIDDLE";

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:709:149: CLICK_RIGHT
                    {
                    match(input,CLICK_RIGHT,FOLLOW_CLICK_RIGHT_in_souris2440); 
                    c = "CLK_RIGHT";

                    }
                    break;
                case 8 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:709:181: SCROLL_UP
                    {
                    match(input,SCROLL_UP,FOLLOW_SCROLL_UP_in_souris2445); 
                    c = "SCR_UP";

                    }
                    break;
                case 9 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:709:208: SCROLL_DOWN
                    {
                    match(input,SCROLL_DOWN,FOLLOW_SCROLL_DOWN_in_souris2450); 
                    c = "SCR_UP";

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
    // $ANTLR end "souris"


    // $ANTLR start "clavier"
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:712:1: clavier[SymbolTable st] returns [String l] : (i= LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final String clavier(SymbolTable st) throws RecognitionException {
        String l = null;

        CommonTree i=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:712:44: (i= LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            int alt50=8;
            switch ( input.LA(1) ) {
            case LETTER:
                {
                alt50=1;
                }
                break;
            case WUP:
                {
                alt50=2;
                }
                break;
            case WDOWN:
                {
                alt50=3;
                }
                break;
            case LEFT:
                {
                alt50=4;
                }
                break;
            case RIGHT:
                {
                alt50=5;
                }
                break;
            case SPACE:
                {
                alt50=6;
                }
                break;
            case ESCAPE:
                {
                alt50=7;
                }
                break;
            case ENTER:
                {
                alt50=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:713:5: i= LETTER
                    {
                    i=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_clavier2476); 
                    l = i.getText();l=l.toLowerCase();l=String.valueOf(new Character(l.charAt(0)).hashCode());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:713:108: WUP
                    {
                    match(input,WUP,FOLLOW_WUP_in_clavier2481); 
                    l="38";

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:713:123: WDOWN
                    {
                    match(input,WDOWN,FOLLOW_WDOWN_in_clavier2486); 
                    l="40";

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:713:140: LEFT
                    {
                    match(input,LEFT,FOLLOW_LEFT_in_clavier2491); 
                    l="37";

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:713:156: RIGHT
                    {
                    match(input,RIGHT,FOLLOW_RIGHT_in_clavier2496); 
                    l="39";

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:713:173: SPACE
                    {
                    match(input,SPACE,FOLLOW_SPACE_in_clavier2501); 
                    l="32";

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:713:190: ESCAPE
                    {
                    match(input,ESCAPE,FOLLOW_ESCAPE_in_clavier2506); 
                    l="27";

                    }
                    break;
                case 8 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:713:208: ENTER
                    {
                    match(input,ENTER,FOLLOW_ENTER_in_clavier2511); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:716:1: activCommande[SymbolTable st] returns [Code c] : ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) );
    public final Code activCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:716:48: ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ACTIVATE_KW) ) {
                alt51=1;
            }
            else if ( (LA51_0==DISABLE_KW) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:717:5: ^( ACTIVATE_KW typeCommand[st] )
                    {
                    match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande2547); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande2549);
                    typeCommand(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:718:6: ^( DISABLE_KW typeCommand[st] )
                    {
                    match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande2559); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande2561);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:721:1: typeCommand[SymbolTable st] returns [Code c] : ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD );
    public final Code typeCommand(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:721:46: ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD )
            int alt54=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt54=1;
                }
                break;
            case MOUSE_KW:
                {
                alt54=2;
                }
                break;
            case KEY_KW:
                {
                alt54=3;
                }
                break;
            case KEYBOARD:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:722:5: COMMANDS
                    {
                    match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand2585); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:723:7: ^( MOUSE_KW ( souris[st] )* )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_typeCommand2594); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:723:18: ( souris[st] )*
                        loop52:
                        do {
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( ((LA52_0>=LEFT && LA52_0<=RIGHT)||(LA52_0>=WUP && LA52_0<=WDOWN)||(LA52_0>=CLICK_LEFT && LA52_0<=SCROLL_DOWN)) ) {
                                alt52=1;
                            }


                            switch (alt52) {
                        	case 1 :
                        	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:723:18: souris[st]
                        	    {
                        	    pushFollow(FOLLOW_souris_in_typeCommand2596);
                        	    souris(st);

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop52;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:724:7: ^( KEY_KW ( clavier[st] )+ )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_typeCommand2608); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:724:16: ( clavier[st] )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=LEFT && LA53_0<=RIGHT)||(LA53_0>=WUP && LA53_0<=WDOWN)||(LA53_0>=LETTER && LA53_0<=ENTER)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:724:16: clavier[st]
                    	    {
                    	    pushFollow(FOLLOW_clavier_in_typeCommand2610);
                    	    clavier(st);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:725:7: KEYBOARD
                    {
                    match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand2621); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:727:1: reglesJeu[SymbolTable st] returns [Code c] : ^( RULE_KW ( IDENT )? declencheur[st] definitionId[st] ) ;
    public final Code reglesJeu(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:727:44: ( ^( RULE_KW ( IDENT )? declencheur[st] definitionId[st] ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:728:5: ^( RULE_KW ( IDENT )? declencheur[st] definitionId[st] )
            {
            match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu2641); 

            match(input, Token.DOWN, null); 
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:728:15: ( IDENT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDENT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:728:15: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_reglesJeu2643); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu2646);
            declencheur(st);

            state._fsp--;

            pushFollow(FOLLOW_definitionId_in_reglesJeu2649);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:731:1: declencheur[SymbolTable st] returns [Code c] : ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st,new Definition()] varOuNB[st] ) | ^( VICTORY_KW ( PLAYER | IDENT ) ) | ^( DEFEAT_KW ( PLAYER | IDENT ) ) );
    public final Code declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:731:46: ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st,new Definition()] varOuNB[st] ) | ^( VICTORY_KW ( PLAYER | IDENT ) ) | ^( DEFEAT_KW ( PLAYER | IDENT ) ) )
            int alt57=6;
            switch ( input.LA(1) ) {
            case ACCESS_KW:
                {
                alt57=1;
                }
                break;
            case ENDS_KW:
                {
                alt57=2;
                }
                break;
            case STARTS_KW:
                {
                alt57=3;
                }
                break;
            case BECOMES_VAR_KW:
                {
                alt57=4;
                }
                break;
            case VICTORY_KW:
                {
                alt57=5;
                }
                break;
            case DEFEAT_KW:
                {
                alt57=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:732:5: accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    {
                    pushFollow(FOLLOW_accesClass_in_declencheur2674);
                    accesClass(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:732:20: ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    int alt56=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt56=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt56=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                    case OWNES_KW:
                    case NOTOWNES_KW:
                        {
                        alt56=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
                    case OWNED_KW:
                    case NOTOWNED_KW:
                        {
                        alt56=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }

                    switch (alt56) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:732:21: MOVES_KW
                            {
                            match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur2678); 

                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:732:32: DIES_KW
                            {
                            match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur2682); 

                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:732:42: declencheurTK[st]
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur2686);
                            declencheurTK(st);

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:732:62: declencheurKT[st]
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur2691);
                            declencheurKT(st);

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:733:6: ^( ENDS_KW type_declencheur[st] )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur2701); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur2703);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:734:6: ^( STARTS_KW type_declencheur[st] )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur2713); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur2715);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:735:6: ^( BECOMES_VAR_KW variable[st,new Definition()] varOuNB[st] )
                    {
                    match(input,BECOMES_VAR_KW,FOLLOW_BECOMES_VAR_KW_in_declencheur2735); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_declencheur2737);
                    variable(st, new Definition());

                    state._fsp--;

                    pushFollow(FOLLOW_varOuNB_in_declencheur2740);
                    varOuNB(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:736:6: ^( VICTORY_KW ( PLAYER | IDENT ) )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur2750); 

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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:737:6: ^( DEFEAT_KW ( PLAYER | IDENT ) )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur2767); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:740:1: type_declencheur[SymbolTable st] returns [Code c] : ( IDENT | GAME );
    public final Code type_declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:740:51: ( IDENT | GAME )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:743:1: varOuNB[SymbolTable st] returns [Code c] : ( variable[st,new Definition()] | FLOAT );
    public final Code varOuNB(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:743:42: ( variable[st,new Definition()] | FLOAT )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==GAME_SCORE_KW||LA58_0==VALUE_KW||LA58_0==VAR_I_KW||(LA58_0>=X && LA58_0<=Z)) ) {
                alt58=1;
            }
            else if ( (LA58_0==FLOAT) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:744:5: variable[st,new Definition()]
                    {
                    pushFollow(FOLLOW_variable_in_varOuNB2820);
                    variable(st, new Definition());

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:744:37: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2825); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:746:1: declencheurTK[SymbolTable st] returns [Code c] : ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) | ^( OWNES_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNES_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurTK(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:746:49: ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) | ^( OWNES_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNES_KW ( OTHER )? accesClass[st] ) )
            int alt63=4;
            switch ( input.LA(1) ) {
            case TOUCHES_KW:
                {
                alt63=1;
                }
                break;
            case KILLS_KW:
                {
                alt63=2;
                }
                break;
            case OWNES_KW:
                {
                alt63=3;
                }
                break;
            case NOTOWNES_KW:
                {
                alt63=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:747:5: ^( TOUCHES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2844); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:747:18: ( OTHER )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==OTHER) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:747:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2847); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2851);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:748:7: ^( KILLS_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2862); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:748:18: ( OTHER )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==OTHER) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:748:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2865); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2869);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:749:7: ^( OWNES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,OWNES_KW,FOLLOW_OWNES_KW_in_declencheurTK2880); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:749:18: ( OTHER )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==OTHER) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:749:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2883); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2887);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:750:7: ^( NOTOWNES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,NOTOWNES_KW,FOLLOW_NOTOWNES_KW_in_declencheurTK2898); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:750:21: ( OTHER )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==OTHER) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:750:22: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2901); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2905);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:755:1: declencheurKT[SymbolTable st] returns [Code c] : ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) | ^( OWNED_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNED_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurKT(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:755:49: ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) | ^( OWNED_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNED_KW ( OTHER )? accesClass[st] ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case KILLED_KW:
                {
                alt68=1;
                }
                break;
            case TOUCHED_KW:
                {
                alt68=2;
                }
                break;
            case OWNED_KW:
                {
                alt68=3;
                }
                break;
            case NOTOWNED_KW:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:756:5: ^( KILLED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2935); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:756:17: ( OTHER )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==OTHER) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:756:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2938); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2942);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:757:7: ^( TOUCHED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2953); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:757:20: ( OTHER )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==OTHER) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:757:21: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2956); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2960);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:758:7: ^( OWNED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,OWNED_KW,FOLLOW_OWNED_KW_in_declencheurKT2971); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:758:18: ( OTHER )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==OTHER) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:758:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2974); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2978);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:759:7: ^( NOTOWNED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,NOTOWNED_KW,FOLLOW_NOTOWNED_KW_in_declencheurKT2989); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:759:21: ( OTHER )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==OTHER) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:759:22: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2992); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2996);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:763:1: siAlors[SymbolTable st] returns [Code c] : ^( IF_KW cond= conditions[st] r1= consequences[st,new Definition()] (r2= consequences[st,new Definition()] )? ) ;
    public final Code siAlors(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code cond = null;

        Code r1 = null;

        Code r2 = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:763:42: ( ^( IF_KW cond= conditions[st] r1= consequences[st,new Definition()] (r2= consequences[st,new Definition()] )? ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:764:5: ^( IF_KW cond= conditions[st] r1= consequences[st,new Definition()] (r2= consequences[st,new Definition()] )? )
            {
            match(input,IF_KW,FOLLOW_IF_KW_in_siAlors3026); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_conditions_in_siAlors3030);
            cond=conditions(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_siAlors3035);
            r1=consequences(st, new Definition());

            state._fsp--;

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:764:72: (r2= consequences[st,new Definition()] )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==CONSEQUENCES_KW) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:764:72: r2= consequences[st,new Definition()]
                    {
                    pushFollow(FOLLOW_consequences_in_siAlors3040);
                    r2=consequences(st, new Definition());

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:768:1: conditions[SymbolTable st] returns [Code c] : ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] );
    public final Code conditions(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree not=null;
        Code cond = null;

        Code cond1 = null;

        Code cond2 = null;


        not=null;
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:769:21: ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] )
            int alt71=10;
            switch ( input.LA(1) ) {
            case CONDITION_KW:
                {
                alt71=1;
                }
                break;
            case OR:
                {
                alt71=2;
                }
                break;
            case AND:
                {
                alt71=3;
                }
                break;
            case EQUALS:
                {
                alt71=4;
                }
                break;
            case INF:
                {
                alt71=5;
                }
                break;
            case SUP:
                {
                alt71=6;
                }
                break;
            case INFEG:
                {
                alt71=7;
                }
                break;
            case SUPED:
                {
                alt71=8;
                }
                break;
            case DIFF:
                {
                alt71=9;
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
                alt71=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:770:5: ^( CONDITION_KW (not= NOT )? cond= conditions[st] )
                    {
                    match(input,CONDITION_KW,FOLLOW_CONDITION_KW_in_conditions3080); 

                    match(input, Token.DOWN, null); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:770:20: (not= NOT )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NOT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:770:21: not= NOT
                            {
                            not=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions3085); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditions_in_conditions3091);
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:778:6: ^( OR cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,OR,FOLLOW_OR_in_conditions3107); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions3111);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions3116);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genOr(cond1,cond2);
                        

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:782:6: ^( AND cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,AND,FOLLOW_AND_in_conditions3132); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions3136);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions3141);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genAnd(cond1,cond2);
                        

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:786:6: ^( EQUALS cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_conditions3157); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3161);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3166);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genEquals(cond1,cond2);
                        

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:790:6: ^( INF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INF,FOLLOW_INF_in_conditions3182); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3186);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3191);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInf(cond1,cond2);
                        

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:794:6: ^( SUP cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUP,FOLLOW_SUP_in_conditions3207); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3211);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3216);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSup(cond1,cond2);
                        

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:798:6: ^( INFEG cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INFEG,FOLLOW_INFEG_in_conditions3232); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3236);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3241);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInfEg(cond1,cond2);
                        

                    }
                    break;
                case 8 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:802:6: ^( SUPED cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUPED,FOLLOW_SUPED_in_conditions3257); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3261);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3266);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSupEg(cond1,cond2);
                        

                    }
                    break;
                case 9 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:806:6: ^( DIFF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,DIFF,FOLLOW_DIFF_in_conditions3282); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3286);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3291);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genDiff(cond1,cond2);
                        

                    }
                    break;
                case 10 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:810:7: etat[st]
                    {
                    pushFollow(FOLLOW_etat_in_conditions3307);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:813:1: etat[SymbolTable st] returns [Code c] : ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | ^( VICTORY_KW IDENT ) | ^( DEFEAT_KW IDENT ) );
    public final Code etat(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:813:39: ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | ^( VICTORY_KW IDENT ) | ^( DEFEAT_KW IDENT ) )
            int alt92=15;
            switch ( input.LA(1) ) {
            case DEAD_KW:
                {
                alt92=1;
                }
                break;
            case ALIVE_KW:
                {
                alt92=2;
                }
                break;
            case EFFACED_KW:
                {
                alt92=3;
                }
                break;
            case GENERATED_KW:
                {
                alt92=4;
                }
                break;
            case TOUCHING_KW:
                {
                alt92=5;
                }
                break;
            case MOVING_KW:
                {
                alt92=6;
                }
                break;
            case WAITING_KW:
                {
                alt92=7;
                }
                break;
            case FINISHED_KW:
                {
                alt92=8;
                }
                break;
            case STARTED_KW:
                {
                alt92=9;
                }
                break;
            case PAUSED_KW:
                {
                alt92=10;
                }
                break;
            case MUTED_KW:
                {
                alt92=11;
                }
                break;
            case PLAYED_KW:
                {
                alt92=12;
                }
                break;
            case STOPPED_KW:
                {
                alt92=13;
                }
                break;
            case VICTORY_KW:
                {
                alt92=14;
                }
                break;
            case DEFEAT_KW:
                {
                alt92=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:814:5: ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat3329); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3331);
                    accesClass(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:814:30: ( NOT )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NOT) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:814:31: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3335); 

                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:814:37: ( OTHER )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==OTHER) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:814:38: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3340); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3344);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:815:7: ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat3355); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3357);
                    accesClass(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:815:33: ( NOT )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NOT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:815:34: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3361); 

                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:815:40: ( OTHER )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==OTHER) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:815:41: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3366); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3370);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:816:7: ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat3381); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3383);
                    accesClass(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:816:35: ( NOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NOT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:816:36: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3387); 

                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:816:42: ( OTHER )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==OTHER) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:816:43: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3392); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3396);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:817:7: ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat3407); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3409);
                    accesClass(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:817:37: ( NOT )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NOT) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:817:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3413); 

                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:817:44: ( OTHER )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==OTHER) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:817:45: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3418); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3422);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:818:7: ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat3433); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3435);
                    accesClass(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:818:36: ( NOT )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NOT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:818:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3439); 

                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:818:43: ( OTHER )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==OTHER) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:818:44: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3444); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3448);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:819:7: ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat3459); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3461);
                    accesClass(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:819:34: ( NOT )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==NOT) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:819:35: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3465); 

                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:819:41: ( OTHER )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==OTHER) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:819:42: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3470); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3474);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:820:7: ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat3485); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3487);
                    accesClass(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:820:35: ( NOT )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NOT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:820:36: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3491); 

                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:820:42: ( OTHER )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==OTHER) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:820:43: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3496); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3500);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:821:7: ^( FINISHED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat3511); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3513);
                    type_declencheur(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:821:42: ( NOT )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==NOT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:821:43: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3517); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:822:7: ^( STARTED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat3529); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3531);
                    type_declencheur(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:822:40: ( NOT )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==NOT) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:822:41: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3534); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:823:7: ^( PAUSED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat3546); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3548);
                    type_declencheur(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:823:39: ( NOT )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NOT) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:823:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3551); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:824:7: ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] )
                    {
                    match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat3563); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3565);
                    type_declencheur(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:824:39: ( NOT )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==NOT) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:824:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3569); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mode_mute_in_etat3573);
                    mode_mute(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:825:7: ^( PLAYED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat3584); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3586);
                    type_declencheur(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:825:40: ( NOT )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==NOT) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:825:41: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3590); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:826:7: ^( STOPPED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat3602); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3604);
                    type_declencheur(st);

                    state._fsp--;

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:826:41: ( NOT )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==NOT) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:826:42: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3608); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:828:7: ^( VICTORY_KW IDENT )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat3625); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_etat3627); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:829:7: ^( DEFEAT_KW IDENT )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat3637); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_etat3639); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:832:1: mode_mute[SymbolTable st] returns [Code c] : ( ON | OFF );
    public final Code mode_mute(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:832:44: ( ON | OFF )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:835:1: affectation[SymbolTable st , Definition d] returns [Code c] : ( ^( ASSIGN_KW i1= operation[st] i2= variable[st,d] ) | ^( ADD_KW o= operation[st] v= variable[st,d] ) | ^( SUB_KW op= operation[st] var= variable[st,d] ) | ^( INVERT_KW variable[st,d] variable[st,d] ) );
    public final Code affectation(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        Code i1 = null;

        Code i2 = null;

        Code o = null;

        Code v = null;

        Code op = null;

        Code var = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:835:61: ( ^( ASSIGN_KW i1= operation[st] i2= variable[st,d] ) | ^( ADD_KW o= operation[st] v= variable[st,d] ) | ^( SUB_KW op= operation[st] var= variable[st,d] ) | ^( INVERT_KW variable[st,d] variable[st,d] ) )
            int alt93=4;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt93=1;
                }
                break;
            case ADD_KW:
                {
                alt93=2;
                }
                break;
            case SUB_KW:
                {
                alt93=3;
                }
                break;
            case INVERT_KW:
                {
                alt93=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:836:5: ^( ASSIGN_KW i1= operation[st] i2= variable[st,d] )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation3686); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3690);
                    i1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3695);
                    i2=variable(st, d);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	c = Code.genAffect(i2,i1);
                        

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:840:6: ^( ADD_KW o= operation[st] v= variable[st,d] )
                    {
                    match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation3711); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3715);
                    o=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3720);
                    v=variable(st, d);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genIncr(v,o);
                        

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:844:6: ^( SUB_KW op= operation[st] var= variable[st,d] )
                    {
                    match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation3736); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3740);
                    op=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3745);
                    var=variable(st, d);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSub(var,op);
                        

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:848:6: ^( INVERT_KW variable[st,d] variable[st,d] )
                    {
                    match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation3762); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_affectation3764);
                    variable(st, d);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3767);
                    variable(st, d);

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:854:1: iaBasique[SymbolTable st] returns [Code c] : ^( IA_KW IDENT ( reglesJeu[st] )+ ) ;
    public final Code iaBasique(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:854:44: ( ^( IA_KW IDENT ( reglesJeu[st] )+ ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:855:5: ^( IA_KW IDENT ( reglesJeu[st] )+ )
            {
            match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique3801); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_iaBasique3803); 
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:855:19: ( reglesJeu[st] )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_KW) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:855:19: reglesJeu[st]
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_iaBasique3805);
            	    reglesJeu(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:859:1: operation[SymbolTable st] returns [Code c] : ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st,new Definition()] | f= FLOAT );
    public final Code operation(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree f=null;
        Code c1 = null;

        Code c2 = null;

        Code v = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:859:44: ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st,new Definition()] | f= FLOAT )
            int alt95=9;
            switch ( input.LA(1) ) {
            case RANDOM_KW:
                {
                alt95=1;
                }
                break;
            case PLUS:
                {
                alt95=2;
                }
                break;
            case MINUS:
                {
                alt95=3;
                }
                break;
            case MUL:
                {
                alt95=4;
                }
                break;
            case DIV:
                {
                alt95=5;
                }
                break;
            case MOD:
                {
                alt95=6;
                }
                break;
            case POW:
                {
                alt95=7;
                }
                break;
            case GAME_SCORE_KW:
            case VALUE_KW:
            case VAR_I_KW:
            case X:
            case Y:
            case Z:
                {
                alt95=8;
                }
                break;
            case FLOAT:
                {
                alt95=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:860:5: ^( RANDOM_KW c1= operation[st] c2= operation[st] )
                    {
                    match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation3829); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3834);
                    c1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3840);
                    c2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genRD(c1,c2);

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:862:6: ^( PLUS operation[st] operation[st] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_operation3856); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3858);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3861);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPLUS(c1,c2);

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:864:6: ^( MINUS operation[st] operation[st] )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_operation3877); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3879);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3882);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMINUS(c1,c2);

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:866:6: ^( MUL operation[st] operation[st] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_operation3898); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3900);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3903);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMUL(c1,c2);

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:868:6: ^( DIV operation[st] operation[st] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_operation3919); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3921);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3924);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genDIV(c1,c2);

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:870:6: ^( MOD operation[st] operation[st] )
                    {
                    match(input,MOD,FOLLOW_MOD_in_operation3940); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3942);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3945);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMOD(c1,c2);

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:872:6: ^( POW operation[st] operation[st] )
                    {
                    match(input,POW,FOLLOW_POW_in_operation3961); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3963);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3966);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPOW(c1,c2);

                    }
                    break;
                case 8 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:874:6: v= variable[st,new Definition()]
                    {
                    pushFollow(FOLLOW_variable_in_operation3985);
                    v=variable(st, new Definition());

                    state._fsp--;

                    c = v;

                    }
                    break;
                case 9 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:876:6: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_operation4003); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:881:1: variable[SymbolTable st , Definition d] returns [Code c] : ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) );
    public final Code variable(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code tc = null;

        ArrayList<Symbol> sb = null;

        ArrayList<Symbol> e = null;

        String at = null;

        ArrayList<Symbol> ac = null;


        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:881:58: ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) )
            int alt96=6;
            switch ( input.LA(1) ) {
            case X:
                {
                alt96=1;
                }
                break;
            case Y:
                {
                alt96=2;
                }
                break;
            case Z:
                {
                alt96=3;
                }
                break;
            case VAR_I_KW:
                {
                alt96=4;
                }
                break;
            case GAME_SCORE_KW:
                {
                alt96=5;
                }
                break;
            case VALUE_KW:
                {
                alt96=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:882:5: ^( X tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,X,FOLLOW_X_in_variable4034); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable4038);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable4043);
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:893:6: ^( Y tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Y,FOLLOW_Y_in_variable4059); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable4064);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable4069);
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:904:6: ^( Z typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Z,FOLLOW_Z_in_variable4085); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable4087);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable4092);
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:915:6: ^( VAR_I_KW i= IDENT e= accesClass[st] )
                    {
                    match(input,VAR_I_KW,FOLLOW_VAR_I_KW_in_variable4108); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variable4112); 
                    pushFollow(FOLLOW_accesClass_in_variable4116);
                    e=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    //TODO //PRIO 
                    	Symbol si = e.get(0);
                    	String ident= i.getText();
                    	AttributeValue a = si.getAttribute(ident);
                    	String access = new String();
                    	if(a==null){
                    	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), si.getName()+" n'a pas l'attribut "+ident);
                    	}
                    	else if(a.getType()!= AttributeValue.Type.NUMBER){
                    	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), ident+" n'est pas un nombre.");
                    	}else{
                    	    
                    	    if(si.getType() == Symbol.Type.MODEL){
                    	         
                    	         //On verifie si le modèle a déja été appelé
                    	             boolean present = false;
                                   for (int j = 0 ; j< d.getSignature().size() ; j++ ){
                                          if (d.getSignature().get(j).getName() == si.getName()){
                                            present = true;                      
                                          } 
                                   
                                   }
                    	             if(!present){
                    	               d.addModel((Model) si);
                    	             }
                    	             
                    	             access = "arg"+(d.getSignature().size()-1);
                    	         
                    	         
                    	         
                    	    }
                    	    else if(si.getType() == Symbol.Type.ENTITY){
                              access = si.getName();
                          }
                          else{
                            //ERREUR
                          }
                    	
                    	
                    	    c=Code.genAccess(access,ident);
                    	}
                        

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:958:6: GAME_SCORE_KW
                    {
                    match(input,GAME_SCORE_KW,FOLLOW_GAME_SCORE_KW_in_variable4131); 

                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:959:6: ^( VALUE_KW at= attributTps[st] ac= accesClass[st] )
                    {
                    match(input,VALUE_KW,FOLLOW_VALUE_KW_in_variable4139); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_variable4143);
                    at=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable4148);
                    ac=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    //TODO
                    	Symbol si = ac.get(0); AttributeValue a = si.getAttribute(at);
                    	if(a==null){
                    	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), si.getName()+" n'a pas l'attribut "+at);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:971:1: accesClass[SymbolTable st] returns [ArrayList<Symbol> sb] : ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) );
    public final ArrayList<Symbol> accesClass(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> sb = null;

        CommonTree i=null;
        Code co = null;


        sb = new ArrayList<Symbol>();
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:972:42: ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) )
            int alt98=3;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==ACCESS_KW) ) {
                int LA98_1 = input.LA(2);

                if ( (LA98_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ALL:
                        {
                        alt98=1;
                        }
                        break;
                    case IDENT:
                        {
                        alt98=2;
                        }
                        break;
                    case PLAYER:
                        {
                        alt98=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:973:5: ^( ACCESS_KW ALL )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4189); 

                    match(input, Token.DOWN, null); 
                    match(input,ALL,FOLLOW_ALL_in_accesClass4191); 

                    match(input, Token.UP, null); 

                    	sb.addAll(st.getAllEntities());
                        

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:977:7: ^( ACCESS_KW i= IDENT (co= operation[st] )? )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4207); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesClass4211); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:977:29: (co= operation[st] )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==GAME_SCORE_KW||LA97_0==VALUE_KW||LA97_0==VAR_I_KW||LA97_0==FLOAT||LA97_0==RANDOM_KW||(LA97_0>=PLUS && LA97_0<=POW)||(LA97_0>=X && LA97_0<=Z)) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:977:29: co= operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_accesClass4215);
                            co=operation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    	String ident = i.getText(); Symbol s = st.get(ident);
                    	if(s==null){
                    	    handler.add(ErrorHandler.ErrorType.FATAL, this.getLine(i), ident+" n'est pas défini.");
                    	}else{
                    	    sb.add(s);
                    	}
                        

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:986:7: ^( ACCESS_KW PLAYER )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4234); 

                    match(input, Token.DOWN, null); 
                    match(input,PLAYER,FOLLOW_PLAYER_in_accesClass4236); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:992:1: typeCoordonnees[SymbolTable st] returns [Code c] : ( POSITION | ORIENTATION | SIZE );
    public final Code typeCoordonnees(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:992:50: ( POSITION | ORIENTATION | SIZE )
            int alt99=3;
            switch ( input.LA(1) ) {
            case POSITION:
                {
                alt99=1;
                }
                break;
            case ORIENTATION:
                {
                alt99=2;
                }
                break;
            case SIZE:
                {
                alt99=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:993:2: POSITION
                    {
                    match(input,POSITION,FOLLOW_POSITION_in_typeCoordonnees4264); 
                    c = new Code("position");

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:993:40: ORIENTATION
                    {
                    match(input,ORIENTATION,FOLLOW_ORIENTATION_in_typeCoordonnees4269); 
                    c = new Code("angle");

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:993:78: SIZE
                    {
                    match(input,SIZE,FOLLOW_SIZE_in_typeCoordonnees4274); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:996:1: timeUnit[SymbolTable st] returns [String c] : ( MIN | SEC | MS | FRAME );
    public final String timeUnit(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:996:45: ( MIN | SEC | MS | FRAME )
            int alt100=4;
            switch ( input.LA(1) ) {
            case MIN:
                {
                alt100=1;
                }
                break;
            case SEC:
                {
                alt100=2;
                }
                break;
            case MS:
                {
                alt100=3;
                }
                break;
            case FRAME:
                {
                alt100=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:997:2: MIN
                    {
                    match(input,MIN,FOLLOW_MIN_in_timeUnit4292); 
                    c = "MIN";

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:998:4: SEC
                    {
                    match(input,SEC,FOLLOW_SEC_in_timeUnit4299); 
                    c = "SEC";

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:999:4: MS
                    {
                    match(input,MS,FOLLOW_MS_in_timeUnit4305); 
                    c = "MS";

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:1000:4: FRAME
                    {
                    match(input,FRAME,FOLLOW_FRAME_in_timeUnit4311); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:1003:1: attributTps[SymbolTable st] returns [String c] : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final String attributTps(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:1003:48: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            int alt101=3;
            switch ( input.LA(1) ) {
            case BOOST_INTERVAL:
                {
                alt101=1;
                }
                break;
            case SHOOT_INTERVAL:
                {
                alt101=2;
                }
                break;
            case RELOAD_TIME:
                {
                alt101=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:1004:2: BOOST_INTERVAL
                    {
                    match(input,BOOST_INTERVAL,FOLLOW_BOOST_INTERVAL_in_attributTps4327); 
                    c ="boostInterval";

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:1005:4: SHOOT_INTERVAL
                    {
                    match(input,SHOOT_INTERVAL,FOLLOW_SHOOT_INTERVAL_in_attributTps4333); 
                    c = "shootInterval";

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:1006:4: RELOAD_TIME
                    {
                    match(input,RELOAD_TIME,FOLLOW_RELOAD_TIME_in_attributTps4348); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:1009:1: attributListeOuObjet[SymbolTable st] returns [Code c] : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final Code attributListeOuObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:1009:55: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\com\\istic\\mini3d\\grammars\\highTree.g:
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
            return "81:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) );";
        }
    }
    static final String DFA16_eotS =
        "\16\uffff";
    static final String DFA16_eofS =
        "\16\uffff";
    static final String DFA16_minS =
        "\1\10\2\uffff\2\2\2\uffff\1\66\1\71\5\uffff";
    static final String DFA16_maxS =
        "\1\73\2\uffff\2\2\2\uffff\1\111\1\72\5\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\10\1\11\2\uffff\1\3\1\4\1\5\1\6\1\7";
    static final String DFA16_specialS =
        "\16\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\4\1\3\4\uffff\1\5\43\uffff\1\2\7\uffff\1\6",
            "",
            "",
            "\1\7",
            "\1\10",
            "",
            "",
            "\1\11\1\12\21\uffff\1\13",
            "\1\14\1\15",
            "",
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
            return "229:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC t= typeEntity[st] (d= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( CAMERA_KW ON ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER (s= SOLO )? );";
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
            return "398:1: action[SymbolTable st] returns [Code c] : (ent= accesClass[st] act= actionObjet[st,ent] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st,new Definition()] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) );";
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
            return "464:1: actionObjet[SymbolTable st,List<Symbol> l] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | act= actionCommandeMaintenue[st,l] | ^( DURING actionCommandeMaintenue[st,l] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st,l] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );";
        }
    }
 

    public static final BitSet FOLLOW_GAME_KW_in_game72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gameData_in_game81 = new BitSet(new long[]{0x00024800000000E0L});
    public static final BitSet FOLLOW_newType_in_game95 = new BitSet(new long[]{0x00024800000000C0L});
    public static final BitSet FOLLOW_initialization_in_game105 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L});
    public static final BitSet FOLLOW_definition_in_game127 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L});
    public static final BitSet FOLLOW_commande_in_game150 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_game166 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0002000000000010L});
    public static final BitSet FOLLOW_iaBasique_in_game172 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_GAME_ATTRIBUT_KW_in_gameData203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributGame_list_in_gameData205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attributGame_in_attributGame_list225 = new BitSet(new long[]{0x0000007900000002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame254 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame256 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TURNBASED_KW_in_attributGame265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_attributGame267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORLD_KW_in_attributGame278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mapType_in_attributGame280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRIDSIZE_KW_in_attributGame287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAME_KW_in_attributGame296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_name_in_attributGame298 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_mapType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_name354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_newType390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_newType394 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_subType_in_newType396 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_subType426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_in_initialization454 = new BitSet(new long[]{0x00024800000000C2L});
    public static final BitSet FOLLOW_INIT_IS_KW_in_init485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init489 = new BitSet(new long[]{0x0808000000008700L});
    public static final BitSet FOLLOW_declarationObjet_in_init493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INIT_HAS_KW_in_init510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_init514 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_affectationObjet_list_in_init519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_KW_in_init536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init538 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init540 = new BitSet(new long[]{0x0000000400105008L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_init542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REMOVE_KW_in_init554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init557 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_operation_in_init559 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEC_in_declarationObjet596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet600 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_dupli_in_declarationObjet606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_declaration_in_declarationObjet626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet645 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_view_in_declarationObjet647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_declarationObjet672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_KW_in_declarationObjet714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYER_in_declarationObjet736 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_SOLO_in_declarationObjet741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_list_declaration783 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_list_declaration790 = new BitSet(new long[]{0x0000040400105002L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectationObjet_in_affectationObjet_list915 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet947 = new BitSet(new long[]{0x0000000000080008L,0x0000000000000000L,0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_valAggregation_in_affectationObjet951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_affectationObjet974 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_affectationObjet979 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet997 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_affectationObjet999 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet1002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet1013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_affectationObjet1017 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_affectationObjet1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_affectationObjet1027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation1064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_valAggregation1068 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation1090 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1094 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_221_in_valAggregation1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_valAggregation1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_definition1157 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_definition1161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSEQUENCES_KW_in_consequences1201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_list_in_consequences1205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_consequ_in_consequ_list1247 = new BitSet(new long[]{0x0000040002000002L,0x000000000179F9F4L,0x0000F00000010003L});
    public static final BitSet FOLLOW_siAlors_in_consequ1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_consequ1357 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_consequ1359 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_consequ1372 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_consequ1374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_action1410 = new BitSet(new long[]{0x0000000000000000L,0x000019032E000000L});
    public static final BitSet FOLLOW_actionObjet_in_action1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1434 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1448 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1462 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1476 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1490 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1504 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mode_mute_in_action1524 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOP_KW_in_action1547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_transformation_in_action1560 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_action1563 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_action1566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1578 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1596 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_action1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_action1627 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_action1632 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXTURN_KW_in_action1656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRASPS_KW_in_action1672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1674 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPELS_KW_in_action1685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1687 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1689 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_action1691 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INGESTS_KW_in_action1701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1703 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1705 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAcces1743 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeAcces1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeDestination1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coordinates_in_typeDestination1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1847 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1849 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionObjet1852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1867 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_actionObjet1882 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1903 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1927 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_actionCommandeMaintenue1957 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_actionCommandeMaintenue1962 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_FORWARD_in_actionCommandeMaintenue1967 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_BACKWARD_in_actionCommandeMaintenue1972 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_WUP_in_actionCommandeMaintenue1977 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_WDOWN_in_actionCommandeMaintenue1982 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1990 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue2007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue2009 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue2033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue2042 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue2044 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue2053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue2055 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_KW_in_coordinates2119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_coordinates2123 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_coordinates2128 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_coordinates2133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande2172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_player_list_in_commande2176 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_actionCommande_list_in_commande2181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_player_list2218 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_actionCommande_in_actionCommande_list2247 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande2272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_actionCommande2276 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2281 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande2302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_actionCommande2306 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2311 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRESSED_KW_in_commandMode2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELD_KW_in_commandMode2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASED_KW_in_commandMode2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_definitionId2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WUP_in_souris2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WDOWN_in_souris2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_souris2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_souris2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLICK_LEFT_in_souris2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLICK_MIDDLE_in_souris2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLICK_RIGHT_in_souris2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCROLL_UP_in_souris2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCROLL_DOWN_in_souris2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_clavier2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WUP_in_clavier2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WDOWN_in_clavier2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_clavier2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_clavier2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPACE_in_clavier2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESCAPE_in_clavier2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTER_in_clavier2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande2547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande2559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2561 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_typeCommand2594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_typeCommand2596 = new BitSet(new long[]{0x0000000000000008L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_KEY_KW_in_typeCommand2608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2610 = new BitSet(new long[]{0x0000000000000008L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu2641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu2643 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000074L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu2646 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_definitionId_in_reglesJeu2649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_declencheur2674 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x000000000000F7A0L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur2701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur2703 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur2713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur2715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_VAR_KW_in_declencheur2735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_declencheur2737 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur2740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur2750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_declencheur2752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur2767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_declencheur2769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_type_declencheur0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2847 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2851 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2865 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OWNES_KW_in_declencheurTK2880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2883 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTOWNES_KW_in_declencheurTK2898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2901 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2935 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2938 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2942 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2956 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OWNED_KW_in_declencheurKT2971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2974 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2978 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTOWNED_KW_in_declencheurKT2989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2992 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2996 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors3026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors3030 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_siAlors3035 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_consequences_in_siAlors3040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_KW_in_conditions3080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_conditions3085 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions3091 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_conditions3107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions3111 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions3116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_conditions3132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions3136 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions3141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_conditions3157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3161 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_conditions3182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3186 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_conditions3207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3211 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEG_in_conditions3232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3236 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPED_in_conditions3257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3261 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIFF_in_conditions3282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3286 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3291 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_etat_in_conditions3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat3329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3331 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3335 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3340 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat3355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3357 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3361 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3366 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat3381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3383 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3387 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3392 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat3407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3409 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3413 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3418 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat3433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3435 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3439 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3444 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat3459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3461 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3465 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3470 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat3485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3487 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3491 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3496 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat3511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3513 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3517 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat3529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3531 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat3546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3548 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat3563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L,0x0000000000080000L});
    public static final BitSet FOLLOW_mode_mute_in_etat3573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat3584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3586 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat3602 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3604 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3608 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat3625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_etat3627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat3637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_etat3639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_mode_mute0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation3686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3690 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation3711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3715 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation3736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3740 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation3762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_affectation3764 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3767 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique3801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_iaBasique3803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3805 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation3829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3834 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_operation3856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3858 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_operation3877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3879 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3882 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_operation3898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3900 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation3919 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3921 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3924 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_operation3940 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3942 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_operation3961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3963 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3966 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_operation3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operation4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable4034 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable4038 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_variable4059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable4064 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4069 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Z_in_variable4085 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable4087 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4092 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_I_KW_in_variable4108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable4112 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GAME_SCORE_KW_in_variable4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_KW_in_variable4139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_variable4143 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ALL_in_accesClass4191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accesClass4211 = new BitSet(new long[]{0x0000000400105008L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_accesClass4215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLAYER_in_accesClass4236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_typeCoordonnees4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORIENTATION_in_typeCoordonnees4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_typeCoordonnees4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_timeUnit4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEC_in_timeUnit4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MS_in_timeUnit4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAME_in_timeUnit4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOST_INTERVAL_in_attributTps4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOOT_INTERVAL_in_attributTps4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOAD_TIME_in_attributTps4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}