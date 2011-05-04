// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g 2011-05-04 12:42:36

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
    public String getGrammarFileName() { return "/home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g"; }

       
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:47:1: game[SymbolTable st] returns [Code c] : ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) ;
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
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:48:27: ( ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:49:5: ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* )
            {
            match(input,GAME_KW,FOLLOW_GAME_KW_in_game72); 

            match(input, Token.DOWN, null); 
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:50:7: (gd= gameData[st] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME_ATTRIBUT_KW) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:50:7: gd= gameData[st]
                    {
                    pushFollow(FOLLOW_gameData_in_game81);
                    gd=gameData(st);

                    state._fsp--;


                    }
                    break;

            }


            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:52:5: ( newType[st] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:52:5: newType[st]
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
                
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:60:5: (def= definition[st] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DEFINITION_KW) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:60:6: def= definition[st]
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

            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:67:8: (com= commande[st] )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:67:8: com= commande[st]
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
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:69:8: (reg= reglesJeu[st] )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:69:8: reg= reglesJeu[st]
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

            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:69:26: (ia= iaBasique[st] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IA_KW) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:69:26: ia= iaBasique[st]
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:75:1: gameData[SymbolTable st] returns [Code c] : ^( GAME_ATTRIBUT_KW attributGame_list[st] ) ;
    public final Code gameData(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:75:43: ( ^( GAME_ATTRIBUT_KW attributGame_list[st] ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:76:5: ^( GAME_ATTRIBUT_KW attributGame_list[st] )
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:78:1: attributGame_list[SymbolTable st] returns [Code c] : ( attributGame[st] )+ ;
    public final Code attributGame_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:78:52: ( ( attributGame[st] )+ )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:79:5: ( attributGame[st] )+
            {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:79:5: ( attributGame[st] )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:79:5: attributGame[st]
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:81:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) );
    public final Code attributGame(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:81:47: ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( TURNBASED_KW ( 'true' | 'false' ) ) | ^( WORLD_KW mapType ) | ^( GRIDSIZE_KW FLOAT ) | ^( NAME_KW name ) )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:82:2: ^( GRAVITY_KW FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame243); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame245); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:83:4: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:84:4: ^( TURNBASED_KW ( 'true' | 'false' ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:85:4: ^( WORLD_KW mapType )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:86:4: ^( GRIDSIZE_KW FLOAT )
                    {
                    match(input,GRIDSIZE_KW,FOLLOW_GRIDSIZE_KW_in_attributGame287); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame289); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:87:4: ^( NAME_KW name )
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:90:1: mapType returns [Integer i] : ( GENERIC | GRID | RIBBON );
    public final Integer mapType() throws RecognitionException {
        Integer i = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:90:28: ( GENERIC | GRID | RIBBON )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:96:1: name returns [String s] : i= IDENT ;
    public final String name() throws RecognitionException {
        String s = null;

        CommonTree i=null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:96:24: (i= IDENT )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:97:5: i= IDENT
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:101:1: newType[SymbolTable st] : ^( TYPE i= IDENT ( subType[st,sub] )+ ) ;
    public final void newType(SymbolTable st) throws RecognitionException {
        CommonTree i=null;

        List<Model> sub = new ArrayList<Model>();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:102:54: ( ^( TYPE i= IDENT ( subType[st,sub] )+ ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:103:5: ^( TYPE i= IDENT ( subType[st,sub] )+ )
            {
            match(input,TYPE,FOLLOW_TYPE_in_newType390); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_newType394); 
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:103:20: ( subType[st,sub] )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:103:20: subType[st,sub]
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:117:1: subType[SymbolTable st, List<Model> sub] : i= IDENT ;
    public final void subType(SymbolTable st, List<Model> sub) throws RecognitionException {
        CommonTree i=null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:117:43: (i= IDENT )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:118:5: i= IDENT
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:132:1: initialization[SymbolTable st] returns [Code c] : ( init[st] )+ ;
    public final Code initialization(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:132:49: ( ( init[st] )+ )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:133:5: ( init[st] )+
            {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:133:5: ( init[st] )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:133:5: init[st]
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:168:1: init[SymbolTable st] returns [Code c] : ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) | ^( INSERT_KW IDENT IDENT ( operation[st] )? ) | ^( REMOVE_KW ( IDENT | operation[st] ) IDENT ) );
    public final Code init(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Pair<Model, Integer> d = null;

        ArrayList<Symbol> ac = null;

        ArrayList<Pair<String,AttributeValue>> ao = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:168:39: ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) | ^( INSERT_KW IDENT IDENT ( operation[st] )? ) | ^( REMOVE_KW ( IDENT | operation[st] ) IDENT ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:169:5: ^( INIT_IS_KW i= IDENT d= declarationObjet[st] )
                    {
                    match(input,INIT_IS_KW,FOLLOW_INIT_IS_KW_in_init485); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_init489); 
                    pushFollow(FOLLOW_declarationObjet_in_init493);
                    d=declarationObjet(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

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
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:187:7: ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:222:7: ^( INSERT_KW IDENT IDENT ( operation[st] )? )
                    {
                    match(input,INSERT_KW,FOLLOW_INSERT_KW_in_init536); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_init538); 
                    match(input,IDENT,FOLLOW_IDENT_in_init540); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:222:31: ( operation[st] )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==GAME_SCORE_KW||LA11_0==VALUE_KW||LA11_0==VAR_I_KW||LA11_0==FLOAT||LA11_0==RANDOM_KW||(LA11_0>=PLUS && LA11_0<=POW)||(LA11_0>=X && LA11_0<=Z)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:222:31: operation[st]
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:223:7: ^( REMOVE_KW ( IDENT | operation[st] ) IDENT )
                    {
                    match(input,REMOVE_KW,FOLLOW_REMOVE_KW_in_init554); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:223:19: ( IDENT | operation[st] )
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
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:223:20: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_init557); 

                            }
                            break;
                        case 2 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:223:26: operation[st]
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:227:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC t= typeEntity[st] (d= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER (s= SOLO )? );
    public final Pair<Model, Integer> declarationObjet(SymbolTable st) throws RecognitionException {
        Pair<Model, Integer> p = null;

        CommonTree s=null;
        Model t = null;

        Integer d = null;


        d=null;s=null;
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:228:26: ( ^( DEC t= typeEntity[st] (d= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER (s= SOLO )? )
            int alt16=8;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:229:5: ^( DEC t= typeEntity[st] (d= dupli )? )
                    {
                    match(input,DEC,FOLLOW_DEC_in_declarationObjet596); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet600);
                    t=typeEntity(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:229:28: (d= dupli )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==DUPLICABLE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:229:29: d= dupli
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:236:7: ^( LIST_KW list_declaration[st] )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:241:7: ^( CAMERA_KW PERSON view[st] )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:242:7: ^( CAMERA_KW FREE )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet658); 

                    match(input, Token.DOWN, null); 
                    match(input,FREE,FOLLOW_FREE_in_declarationObjet660); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:243:7: ^( MEDIA_KW LOOP )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet670); 

                    match(input, Token.DOWN, null); 
                    match(input,LOOP,FOLLOW_LOOP_in_declarationObjet672); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:244:7: ^( MEDIA_KW ONCE )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet682); 

                    match(input, Token.DOWN, null); 
                    match(input,ONCE,FOLLOW_ONCE_in_declarationObjet684); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:245:7: ^( IN_KW IDENT )
                    {
                    match(input,IN_KW,FOLLOW_IN_KW_in_declarationObjet702); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declarationObjet704); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:246:7: PLAYER (s= SOLO )?
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_declarationObjet724); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:246:14: (s= SOLO )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==SOLO) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:246:15: s= SOLO
                            {
                            s=(CommonTree)match(input,SOLO,FOLLOW_SOLO_in_declarationObjet729); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:255:1: list_declaration[SymbolTable st] returns [Code c] : ( (o= operation[st] )? i= IDENT )+ ;
    public final Code list_declaration(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code o = null;


        o = null;
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:256:21: ( ( (o= operation[st] )? i= IDENT )+ )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:257:5: ( (o= operation[st] )? i= IDENT )+
            {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:257:5: ( (o= operation[st] )? i= IDENT )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:257:6: (o= operation[st] )? i= IDENT
            	    {
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:257:6: (o= operation[st] )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==GAME_SCORE_KW||LA17_0==VALUE_KW||LA17_0==VAR_I_KW||LA17_0==FLOAT||LA17_0==RANDOM_KW||(LA17_0>=PLUS && LA17_0<=POW)||(LA17_0>=X && LA17_0<=Z)) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:257:7: o= operation[st]
            	            {
            	            pushFollow(FOLLOW_operation_in_list_declaration771);
            	            o=operation(st);

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_list_declaration778); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:267:1: typeEntity[SymbolTable st] returns [Model t] : i= IDENT ;
    public final Model typeEntity(SymbolTable st) throws RecognitionException {
        Model t = null;

        CommonTree i=null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:267:46: (i= IDENT )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:268:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeEntity811); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:280:1: dupli returns [Integer i] : DUPLICABLE ;
    public final Integer dupli() throws RecognitionException {
        Integer i = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:280:26: ( DUPLICABLE )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:281:5: DUPLICABLE
            {
            match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli837); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:285:1: view[SymbolTable st] returns [Code c] : ( FIRST | THIRD );
    public final Code view(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:285:39: ( FIRST | THIRD )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:289:1: affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : (a= affectationObjet[st] )+ ;
    public final ArrayList<Pair<String,AttributeValue>> affectationObjet_list(SymbolTable st) throws RecognitionException {
        ArrayList<Pair<String,AttributeValue>> c = null;

        ArrayList<Pair<String,AttributeValue>> a = null;


        c = new ArrayList<Pair<String,AttributeValue>>();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:290:62: ( (a= affectationObjet[st] )+ )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:291:5: (a= affectationObjet[st] )+
            {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:291:5: (a= affectationObjet[st] )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:291:6: a= affectationObjet[st]
            	    {
            	    pushFollow(FOLLOW_affectationObjet_in_affectationObjet_list903);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:293:1: affectationObjet[SymbolTable st] returns [ArrayList<Pair<String,AttributeValue>> c] : ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) );
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
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:293:142: ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:294:5: ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet931); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet935); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:294:31: (t= valAggregation[st] )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==AGGREGATION_KW||(LA20_0>=221 && LA20_0<=222)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:294:31: t= valAggregation[st]
                            {
                            pushFollow(FOLLOW_valAggregation_in_affectationObjet939);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:303:7: ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet958); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_affectationObjet962);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_affectationObjet967);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:320:7: ^( ALLOCATION_KW attributListeOuObjet[st] IDENT )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet985); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributListeOuObjet_in_affectationObjet987);
                    attributListeOuObjet(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_affectationObjet990); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:321:7: ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet1001); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_affectationObjet1005);
                    att=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_affectationObjet1010);
                    v=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_affectationObjet1015);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:328:1: valAggregation[SymbolTable st] returns [AttributeValue c] : ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' );
    public final AttributeValue valAggregation(SymbolTable st) throws RecognitionException {
        AttributeValue c = null;

        CommonTree i=null;
        Code o = null;

        String t = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:328:59: ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) | 'true' | 'false' )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:329:5: ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation1052); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_valAggregation1056);
                    o=operation(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:329:39: (t= timeUnit[st] )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=MIN && LA22_0<=FRAME)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:329:39: t= timeUnit[st]
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1061);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:337:6: ^( AGGREGATION_KW i= IDENT )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation1078); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1082); 

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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:347:7: 'true'
                    {
                    match(input,221,FOLLOW_221_in_valAggregation1097); 
                    c = new AttributeValue(true);

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:348:7: 'false'
                    {
                    match(input,222,FOLLOW_222_in_valAggregation1107); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:353:1: definition[SymbolTable st] returns [Code c] : ^( DEFINITION_KW i= IDENT cons= consequences[st,d] ) ;
    public final Code definition(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code cons = null;


         Definition d = new Definition(); c = new Code();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:353:102: ( ^( DEFINITION_KW i= IDENT cons= consequences[st,d] ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:354:5: ^( DEFINITION_KW i= IDENT cons= consequences[st,d] )
            {
            match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1141); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definition1145); 
            pushFollow(FOLLOW_consequences_in_definition1149);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:369:1: consequences[SymbolTable st , Definition d] returns [Code c] : ^( CONSEQUENCES_KW conslist= consequ_list[st,d] ) ;
    public final Code consequences(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        Code conslist = null;


         c = new Code();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:370:29: ( ^( CONSEQUENCES_KW conslist= consequ_list[st,d] ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:371:5: ^( CONSEQUENCES_KW conslist= consequ_list[st,d] )
            {
            match(input,CONSEQUENCES_KW,FOLLOW_CONSEQUENCES_KW_in_consequences1189); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_consequ_list_in_consequences1193);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:377:1: consequ_list[SymbolTable st , Definition d] returns [Code c] : (cons= consequ[st,d] )+ ;
    public final Code consequ_list(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        Code cons = null;


         c = new Code();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:378:29: ( (cons= consequ[st,d] )+ )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:379:5: (cons= consequ[st,d] )+
            {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:379:5: (cons= consequ[st,d] )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:379:6: cons= consequ[st,d]
            	    {
            	    pushFollow(FOLLOW_consequ_in_consequ_list1235);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:382:1: consequ[SymbolTable st,Definition d] returns [Code c] : (i= siAlors[st] | act= action[st] | a= affectation[st,d] | activCommande[st] | id= IDENT | ^( VICTORY_KW IDENT ( IDENT )? ) | ^( DEFEAT_KW IDENT ( IDENT )? ) );
    public final Code consequ(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        CommonTree id=null;
        Code i = null;

        Code act = null;

        Code a = null;


         c = new Code();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:383:29: (i= siAlors[st] | act= action[st] | a= affectation[st,d] | activCommande[st] | id= IDENT | ^( VICTORY_KW IDENT ( IDENT )? ) | ^( DEFEAT_KW IDENT ( IDENT )? ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:384:5: i= siAlors[st]
                    {
                    pushFollow(FOLLOW_siAlors_in_consequ1275);
                    i=siAlors(st);

                    state._fsp--;

                    c=i;

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:386:7: act= action[st]
                    {
                    pushFollow(FOLLOW_action_in_consequ1292);
                    act=action(st);

                    state._fsp--;

                    c.append(act);

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:388:7: a= affectation[st,d]
                    {
                    pushFollow(FOLLOW_affectation_in_consequ1309);
                    a=affectation(st, d);

                    state._fsp--;

                    c=a;

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:389:7: activCommande[st]
                    {
                    pushFollow(FOLLOW_activCommande_in_consequ1320);
                    activCommande(st);

                    state._fsp--;



                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:390:7: id= IDENT
                    {
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_consequ1333); 
                    	c.append(id.getText());c.append("\n");

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:391:7: ^( VICTORY_KW IDENT ( IDENT )? )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1343); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1345); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:391:26: ( IDENT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==IDENT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:391:26: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_consequ1347); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:392:7: ^( DEFEAT_KW IDENT ( IDENT )? )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1358); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1360); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:392:25: ( IDENT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==IDENT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:392:25: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_consequ1362); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:395:1: action[SymbolTable st] returns [Code c] : (ent= accesClass[st] act= actionObjet[st,ent] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st,new Definition()] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) );
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
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:396:28: (ent= accesClass[st] act= actionObjet[st,ent] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st,new Definition()] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) )
            int alt36=19;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:397:5: ent= accesClass[st] act= actionObjet[st,ent]
                    {
                    pushFollow(FOLLOW_accesClass_in_action1398);
                    ent=accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionObjet_in_action1405);
                    act=actionObjet(st, ent);

                    state._fsp--;


                          c.append(act);
                        

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:401:6: ^( ENDS_KW IDENT ( IDENT )? )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1420); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1422); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:401:22: ( IDENT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:401:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1424); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:402:6: ^( ENDS_KW GAME ( IDENT )? )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1434); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1436); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:402:21: ( IDENT )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:402:21: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1438); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:403:6: ^( STARTS_KW IDENT ( IDENT )? )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1448); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1450); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:403:24: ( IDENT )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:403:24: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1452); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:404:6: ^( STARTS_KW GAME ( IDENT )? )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1462); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1464); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:404:23: ( IDENT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENT) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:404:23: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1466); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:405:6: ^( PAUSE_KW IDENT ( IDENT )? )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1476); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1478); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:405:23: ( IDENT )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENT) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:405:23: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1480); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:406:6: ^( PAUSE_KW GAME ( IDENT )? )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1490); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1492); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:406:22: ( IDENT )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:406:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_action1494); 

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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:416:6: ^( MUTE_KW mode_mute[st] IDENT )
                    {
                    match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1510); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mode_mute_in_action1512);
                    mode_mute(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_action1515); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:417:6: ^( PLAY_KW IDENT )
                    {
                    match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1524); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1526); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:418:6: ^( STOP_KW IDENT )
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_action1535); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1537); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:419:6: ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] )
                    {
                    match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1546); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_transformation_in_action1548);
                    transformation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_action1551);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_action1554);
                    coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:420:6: ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1564); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1566);
                    typeAcces(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:420:32: ( typeDestination[st] )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==COORDINATE_KW||LA34_0==ACCESS_KW) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:420:32: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1569);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:421:6: ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? )
                    {
                    match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1580); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1584);
                    ta=typeAcces(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:421:39: (td= typeDestination[st] )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COORDINATE_KW||LA35_0==ACCESS_KW) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:421:39: td= typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1589);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:440:6: ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st,new Definition()] )
                    {
                    match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1606); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_action1610);
                    op=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_action1615);
                    t=timeUnit(st);

                    state._fsp--;

                    pushFollow(FOLLOW_consequences_in_action1620);
                    cons=consequences(st, new Definition());

                    state._fsp--;


                    match(input, Token.UP, null); 

                        	c.append(Code.genSetTimeout(cons,op,t));
                        

                    }
                    break;
                case 15 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:444:6: SAVE_KW
                    {
                    match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1636); 

                    }
                    break;
                case 16 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:445:6: ^( NEXTURN_KW IDENT )
                    {
                    match(input,NEXTURN_KW,FOLLOW_NEXTURN_KW_in_action1644); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1646); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:447:6: ^( GRASPS_KW IDENT IDENT )
                    {
                    match(input,GRASPS_KW,FOLLOW_GRASPS_KW_in_action1660); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1662); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1664); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:448:6: ^( EXPELS_KW IDENT IDENT operation[st] )
                    {
                    match(input,EXPELS_KW,FOLLOW_EXPELS_KW_in_action1673); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1675); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1677); 
                    pushFollow(FOLLOW_operation_in_action1679);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:449:6: ^( INGESTS_KW IDENT IDENT IDENT )
                    {
                    match(input,INGESTS_KW,FOLLOW_INGESTS_KW_in_action1689); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1691); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1693); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1695); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:452:1: typeAcces[SymbolTable st] returns [ArrayList<Symbol> l] : (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) );
    public final ArrayList<Symbol> typeAcces(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> l = null;

        ArrayList<Symbol> ac = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:452:57: (ac= accesClass[st] | operation[st] ( IDENT | accesClass[st] ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:453:5: ac= accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeAcces1720);
                    ac=accesClass(st);

                    state._fsp--;

                    l=ac;

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:454:7: operation[st] ( IDENT | accesClass[st] )
                    {
                    pushFollow(FOLLOW_operation_in_typeAcces1731);
                    operation(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:454:21: ( IDENT | accesClass[st] )
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
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:454:22: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_typeAcces1735); 

                            }
                            break;
                        case 2 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:454:30: accesClass[st]
                            {
                            pushFollow(FOLLOW_accesClass_in_typeAcces1739);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:457:1: typeDestination[SymbolTable st] returns [Coordonnees coord] : ( accesClass[st] | coo= coordinates[st] );
    public final Coordonnees typeDestination(SymbolTable st) throws RecognitionException {
        Coordonnees coord = null;

        Coordonnees coo = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:457:61: ( accesClass[st] | coo= coordinates[st] )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:458:5: accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeDestination1766);
                    accesClass(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:459:7: coo= coordinates[st]
                    {
                    pushFollow(FOLLOW_coordinates_in_typeDestination1777);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:461:1: actionObjet[SymbolTable st,List<Symbol> l] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | act= actionCommandeMaintenue[st,l] | ^( DURING actionCommandeMaintenue[st,l] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st,l] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );
    public final Code actionObjet(SymbolTable st, List<Symbol> l) throws RecognitionException {
        Code c = null;

        Code act = null;


        c=new Code();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:461:81: ( DIES_KW | actionCommandePressee[st] | act= actionCommandeMaintenue[st,l] | ^( DURING actionCommandeMaintenue[st,l] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st,l] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) )
            int alt40=8;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:462:5: DIES_KW
                    {
                    match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1799); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:463:7: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1807);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:464:7: act= actionCommandeMaintenue[st,l]
                    {
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1820);
                    act=actionCommandeMaintenue(st, l);

                    state._fsp--;


                          c.append(act);
                        

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:468:6: ^( DURING actionCommandeMaintenue[st,l] operation[st] timeUnit[st] )
                    {
                    match(input,DURING,FOLLOW_DURING_in_actionObjet1835); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1837);
                    actionCommandeMaintenue(st, l);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_actionObjet1840);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_actionObjet1843);
                    timeUnit(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:469:6: ^( UNTIL actionCommandeMaintenue[st,l] conditions[st] )
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1853); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1855);
                    actionCommandeMaintenue(st, l);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_actionObjet1858);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:470:6: ^( EQUIP accesClass[st] )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1868); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_actionObjet1870);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:471:6: ^( EQUIP NEXT )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1880); 

                    match(input, Token.DOWN, null); 
                    match(input,NEXT,FOLLOW_NEXT_in_actionObjet1882); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:472:6: ^( EQUIP PREVIOUS )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1891); 

                    match(input, Token.DOWN, null); 
                    match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1893); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:475:1: actionCommandePressee[SymbolTable st] returns [Code c] : ^( JUMP operation[st] ) ;
    public final Code actionCommandePressee(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:475:56: ( ^( JUMP operation[st] ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:476:3: ^( JUMP operation[st] )
            {
            match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1915); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_actionCommandePressee1917);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:479:1: actionCommandeMaintenue[SymbolTable st,List<Symbol> ls] returns [Code c] : ( ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) val= operation[st] ) | ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] ) | ^( ACCELERATE operation[st] ) | ^( BRAKE operation[st] ) );
    public final Code actionCommandeMaintenue(SymbolTable st, List<Symbol> ls) throws RecognitionException {
        Code c = null;

        Code val = null;


        c = new Code();List<Integer> l = new ArrayList();int x=0,y=0,z=0;
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:479:146: ( ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) val= operation[st] ) | ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] ) | ^( ACCELERATE operation[st] ) | ^( BRAKE operation[st] ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:480:3: ^( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) val= operation[st] )
                    {
                    match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1942); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:480:10: ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN )
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
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:480:11: LEFT
                            {
                            match(input,LEFT,FOLLOW_LEFT_in_actionCommandeMaintenue1945); 
                            x=-1;

                            }
                            break;
                        case 2 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:480:25: RIGHT
                            {
                            match(input,RIGHT,FOLLOW_RIGHT_in_actionCommandeMaintenue1950); 
                            x=1;

                            }
                            break;
                        case 3 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:480:39: FORWARD
                            {
                            match(input,FORWARD,FOLLOW_FORWARD_in_actionCommandeMaintenue1955); 
                            y=1;

                            }
                            break;
                        case 4 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:480:55: BACKWARD
                            {
                            match(input,BACKWARD,FOLLOW_BACKWARD_in_actionCommandeMaintenue1960); 
                            y=-1;

                            }
                            break;
                        case 5 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:480:73: WUP
                            {
                            match(input,WUP,FOLLOW_WUP_in_actionCommandeMaintenue1965); 
                            z=1;

                            }
                            break;
                        case 6 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:480:85: WDOWN
                            {
                            match(input,WDOWN,FOLLOW_WDOWN_in_actionCommandeMaintenue1970); 
                            z=-1;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1978);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:499:5: ^( TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) operation[st] )
                    {
                    match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1995); 

                    match(input, Token.DOWN, null); 
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLOCKWISE && input.LA(1)<=ANTICLOCKWISE) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue2021);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:500:5: ^( ACCELERATE operation[st] )
                    {
                    match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue2030); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue2032);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:501:5: ^( BRAKE operation[st] )
                    {
                    match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue2041); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue2043);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:504:1: transformation[SymbolTable st] returns [Code c] : ( TRANSLATION | ROTATION | SCALE );
    public final Code transformation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:504:49: ( TRANSLATION | ROTATION | SCALE )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:510:1: coordinates[SymbolTable st] returns [Coordonnees coo] : ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) ;
    public final Coordonnees coordinates(SymbolTable st) throws RecognitionException {
        Coordonnees coo = null;

        Code x = null;

        Code y = null;

        Code z = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:510:55: ( ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:511:5: ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] )
            {
            match(input,COORDINATE_KW,FOLLOW_COORDINATE_KW_in_coordinates2107); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_coordinates2111);
            x=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates2116);
            y=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates2121);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:520:1: commande[SymbolTable st] returns [Code c] : ^( COMMAND_KW listplay= player_list[st] listCommand= actionCommande_list[st] ) ;
    public final Code commande(SymbolTable st) throws RecognitionException {
        Code c = null;

        ArrayList<Symbol> listplay = null;

        ArrayList <Control> listCommand = null;


        int nbCommande = 0;c = new Code();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:520:85: ( ^( COMMAND_KW listplay= player_list[st] listCommand= actionCommande_list[st] ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:521:5: ^( COMMAND_KW listplay= player_list[st] listCommand= actionCommande_list[st] )
            {
            match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande2160); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_player_list_in_commande2164);
            listplay=player_list(st);

            state._fsp--;

            pushFollow(FOLLOW_actionCommande_list_in_commande2169);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:645:1: player_list[SymbolTable st] returns [ArrayList<Symbol> list] : (i= IDENT )+ ;
    public final ArrayList<Symbol> player_list(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> list = null;

        CommonTree i=null;

        list = new ArrayList<Symbol>();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:645:101: ( (i= IDENT )+ )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:646:5: (i= IDENT )+
            {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:646:5: (i= IDENT )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:646:6: i= IDENT
            	    {
            	    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_player_list2206); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:658:1: actionCommande_list[SymbolTable st] returns [ArrayList <Control> c_list] : (c= actionCommande[st] )+ ;
    public final ArrayList <Control> actionCommande_list(SymbolTable st) throws RecognitionException {
        ArrayList <Control> c_list = null;

        Control c = null;


        c_list = new ArrayList<Control>();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:658:115: ( (c= actionCommande[st] )+ )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:659:2: (c= actionCommande[st] )+
            {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:659:2: (c= actionCommande[st] )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:659:3: c= actionCommande[st]
            	    {
            	    pushFollow(FOLLOW_actionCommande_in_actionCommande_list2235);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:662:1: actionCommande[SymbolTable st] returns [Control c] : ( ^( MOUSE_KW v= souris[st] (n= commandMode )? d= definitionId[st] ) | ^( KEY_KW v= clavier[st] (n= commandMode )? d= definitionId[st] ) );
    public final Control actionCommande(SymbolTable st) throws RecognitionException {
        Control c = null;

        String v = null;

        Control.Mode n = null;

        Definition d = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:662:52: ( ^( MOUSE_KW v= souris[st] (n= commandMode )? d= definitionId[st] ) | ^( KEY_KW v= clavier[st] (n= commandMode )? d= definitionId[st] ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:663:5: ^( MOUSE_KW v= souris[st] (n= commandMode )? d= definitionId[st] )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande2260); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_souris_in_actionCommande2264);
                    v=souris(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:663:30: (n= commandMode )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=PRESSED_KW && LA45_0<=RELEASED_KW)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:663:30: n= commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2269);
                            n=commandMode();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_definitionId_in_actionCommande2274);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:675:6: ^( KEY_KW v= clavier[st] (n= commandMode )? d= definitionId[st] )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande2290); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_clavier_in_actionCommande2294);
                    v=clavier(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:675:30: (n= commandMode )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=PRESSED_KW && LA46_0<=RELEASED_KW)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:675:30: n= commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2299);
                            n=commandMode();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_definitionId_in_actionCommande2304);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:689:1: commandMode returns [Control.Mode m] : ( PRESSED_KW | HELD_KW | RELEASED_KW );
    public final Control.Mode commandMode() throws RecognitionException {
        Control.Mode m = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:689:37: ( PRESSED_KW | HELD_KW | RELEASED_KW )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:690:5: PRESSED_KW
                    {
                    match(input,PRESSED_KW,FOLLOW_PRESSED_KW_in_commandMode2337); 
                    m = Control.Mode.PRESSED;

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:690:45: HELD_KW
                    {
                    match(input,HELD_KW,FOLLOW_HELD_KW_in_commandMode2342); 
                    m = Control.Mode.HELD;

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:690:79: RELEASED_KW
                    {
                    match(input,RELEASED_KW,FOLLOW_RELEASED_KW_in_commandMode2347); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:693:1: definitionId[SymbolTable st] returns [Definition d] : i= IDENT ;
    public final Definition definitionId(SymbolTable st) throws RecognitionException {
        Definition d = null;

        CommonTree i=null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:693:53: (i= IDENT )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:694:5: i= IDENT
            {
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definitionId2373); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:705:1: souris[SymbolTable st] returns [String c] : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final String souris(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:705:43: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:706:5: WUP
                    {
                    match(input,WUP,FOLLOW_WUP_in_souris2398); 
                    c = "UP";

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:706:22: WDOWN
                    {
                    match(input,WDOWN,FOLLOW_WDOWN_in_souris2403); 
                    c = "DOWN";

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:706:43: LEFT
                    {
                    match(input,LEFT,FOLLOW_LEFT_in_souris2408); 
                    c = "LEFT";

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:706:63: RIGHT
                    {
                    match(input,RIGHT,FOLLOW_RIGHT_in_souris2413); 
                    c = "RIGHT";

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:706:85: CLICK_LEFT
                    {
                    match(input,CLICK_LEFT,FOLLOW_CLICK_LEFT_in_souris2418); 
                    c = "CLK_LEFT";

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:706:115: CLICK_MIDDLE
                    {
                    match(input,CLICK_MIDDLE,FOLLOW_CLICK_MIDDLE_in_souris2423); 
                    c = "CLK_MIDDLE";

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:706:149: CLICK_RIGHT
                    {
                    match(input,CLICK_RIGHT,FOLLOW_CLICK_RIGHT_in_souris2428); 
                    c = "CLK_RIGHT";

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:706:181: SCROLL_UP
                    {
                    match(input,SCROLL_UP,FOLLOW_SCROLL_UP_in_souris2433); 
                    c = "SCR_UP";

                    }
                    break;
                case 9 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:706:208: SCROLL_DOWN
                    {
                    match(input,SCROLL_DOWN,FOLLOW_SCROLL_DOWN_in_souris2438); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:709:1: clavier[SymbolTable st] returns [String l] : (i= LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final String clavier(SymbolTable st) throws RecognitionException {
        String l = null;

        CommonTree i=null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:709:44: (i= LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:710:5: i= LETTER
                    {
                    i=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_clavier2464); 
                    l = i.getText();l=l.toLowerCase();l=String.valueOf(new Character(l.charAt(0)).hashCode());

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:710:108: WUP
                    {
                    match(input,WUP,FOLLOW_WUP_in_clavier2469); 
                    l="38";

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:710:123: WDOWN
                    {
                    match(input,WDOWN,FOLLOW_WDOWN_in_clavier2474); 
                    l="40";

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:710:140: LEFT
                    {
                    match(input,LEFT,FOLLOW_LEFT_in_clavier2479); 
                    l="37";

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:710:156: RIGHT
                    {
                    match(input,RIGHT,FOLLOW_RIGHT_in_clavier2484); 
                    l="39";

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:710:173: SPACE
                    {
                    match(input,SPACE,FOLLOW_SPACE_in_clavier2489); 
                    l="32";

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:710:190: ESCAPE
                    {
                    match(input,ESCAPE,FOLLOW_ESCAPE_in_clavier2494); 
                    l="27";

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:710:208: ENTER
                    {
                    match(input,ENTER,FOLLOW_ENTER_in_clavier2499); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:713:1: activCommande[SymbolTable st] returns [Code c] : ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) );
    public final Code activCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:713:48: ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:714:5: ^( ACTIVATE_KW typeCommand[st] )
                    {
                    match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande2535); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande2537);
                    typeCommand(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:715:6: ^( DISABLE_KW typeCommand[st] )
                    {
                    match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande2547); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande2549);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:718:1: typeCommand[SymbolTable st] returns [Code c] : ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD );
    public final Code typeCommand(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:718:46: ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:719:5: COMMANDS
                    {
                    match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand2573); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:720:7: ^( MOUSE_KW ( souris[st] )* )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_typeCommand2582); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:720:18: ( souris[st] )*
                        loop52:
                        do {
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( ((LA52_0>=LEFT && LA52_0<=RIGHT)||(LA52_0>=WUP && LA52_0<=WDOWN)||(LA52_0>=CLICK_LEFT && LA52_0<=SCROLL_DOWN)) ) {
                                alt52=1;
                            }


                            switch (alt52) {
                        	case 1 :
                        	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:720:18: souris[st]
                        	    {
                        	    pushFollow(FOLLOW_souris_in_typeCommand2584);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:721:7: ^( KEY_KW ( clavier[st] )+ )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_typeCommand2596); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:721:16: ( clavier[st] )+
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
                    	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:721:16: clavier[st]
                    	    {
                    	    pushFollow(FOLLOW_clavier_in_typeCommand2598);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:722:7: KEYBOARD
                    {
                    match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand2609); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:724:1: reglesJeu[SymbolTable st] returns [Code c] : ^( RULE_KW ( IDENT )? declencheur[st] definitionId[st] ) ;
    public final Code reglesJeu(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:724:44: ( ^( RULE_KW ( IDENT )? declencheur[st] definitionId[st] ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:725:5: ^( RULE_KW ( IDENT )? declencheur[st] definitionId[st] )
            {
            match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu2629); 

            match(input, Token.DOWN, null); 
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:725:15: ( IDENT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDENT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:725:15: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_reglesJeu2631); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu2634);
            declencheur(st);

            state._fsp--;

            pushFollow(FOLLOW_definitionId_in_reglesJeu2637);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:728:1: declencheur[SymbolTable st] returns [Code c] : ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st,new Definition()] varOuNB[st] ) | ^( VICTORY_KW ( PLAYER | IDENT ) ) | ^( DEFEAT_KW ( PLAYER | IDENT ) ) );
    public final Code declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:728:46: ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st,new Definition()] varOuNB[st] ) | ^( VICTORY_KW ( PLAYER | IDENT ) ) | ^( DEFEAT_KW ( PLAYER | IDENT ) ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:729:5: accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    {
                    pushFollow(FOLLOW_accesClass_in_declencheur2662);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:729:20: ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
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
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:729:21: MOVES_KW
                            {
                            match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur2666); 

                            }
                            break;
                        case 2 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:729:32: DIES_KW
                            {
                            match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur2670); 

                            }
                            break;
                        case 3 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:729:42: declencheurTK[st]
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur2674);
                            declencheurTK(st);

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:729:62: declencheurKT[st]
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur2679);
                            declencheurKT(st);

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:730:6: ^( ENDS_KW type_declencheur[st] )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur2689); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur2691);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:731:6: ^( STARTS_KW type_declencheur[st] )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur2701); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur2703);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:732:6: ^( BECOMES_VAR_KW variable[st,new Definition()] varOuNB[st] )
                    {
                    match(input,BECOMES_VAR_KW,FOLLOW_BECOMES_VAR_KW_in_declencheur2723); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_declencheur2725);
                    variable(st, new Definition());

                    state._fsp--;

                    pushFollow(FOLLOW_varOuNB_in_declencheur2728);
                    varOuNB(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:733:6: ^( VICTORY_KW ( PLAYER | IDENT ) )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur2738); 

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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:734:6: ^( DEFEAT_KW ( PLAYER | IDENT ) )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur2755); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:737:1: type_declencheur[SymbolTable st] returns [Code c] : ( IDENT | GAME );
    public final Code type_declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:737:51: ( IDENT | GAME )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:740:1: varOuNB[SymbolTable st] returns [Code c] : ( variable[st,new Definition()] | FLOAT );
    public final Code varOuNB(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:740:42: ( variable[st,new Definition()] | FLOAT )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:741:5: variable[st,new Definition()]
                    {
                    pushFollow(FOLLOW_variable_in_varOuNB2808);
                    variable(st, new Definition());

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:741:37: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2813); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:743:1: declencheurTK[SymbolTable st] returns [Code c] : ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) | ^( OWNES_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNES_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurTK(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:743:49: ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) | ^( OWNES_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNES_KW ( OTHER )? accesClass[st] ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:744:5: ^( TOUCHES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2832); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:744:18: ( OTHER )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==OTHER) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:744:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2835); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2839);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:745:7: ^( KILLS_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2850); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:745:18: ( OTHER )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==OTHER) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:745:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2853); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2857);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:746:7: ^( OWNES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,OWNES_KW,FOLLOW_OWNES_KW_in_declencheurTK2868); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:746:18: ( OTHER )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==OTHER) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:746:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2871); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2875);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:747:7: ^( NOTOWNES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,NOTOWNES_KW,FOLLOW_NOTOWNES_KW_in_declencheurTK2886); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:747:21: ( OTHER )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==OTHER) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:747:22: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2889); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2893);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:752:1: declencheurKT[SymbolTable st] returns [Code c] : ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) | ^( OWNED_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNED_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurKT(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:752:49: ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) | ^( OWNED_KW ( OTHER )? accesClass[st] ) | ^( NOTOWNED_KW ( OTHER )? accesClass[st] ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:753:5: ^( KILLED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2923); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:753:17: ( OTHER )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==OTHER) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:753:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2926); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2930);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:754:7: ^( TOUCHED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2941); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:754:20: ( OTHER )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==OTHER) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:754:21: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2944); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2948);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:755:7: ^( OWNED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,OWNED_KW,FOLLOW_OWNED_KW_in_declencheurKT2959); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:755:18: ( OTHER )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==OTHER) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:755:19: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2962); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2966);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:756:7: ^( NOTOWNED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,NOTOWNED_KW,FOLLOW_NOTOWNED_KW_in_declencheurKT2977); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:756:21: ( OTHER )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==OTHER) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:756:22: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2980); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2984);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:760:1: siAlors[SymbolTable st] returns [Code c] : ^( IF_KW cond= conditions[st] r1= consequences[st,new Definition()] (r2= consequences[st,new Definition()] )? ) ;
    public final Code siAlors(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code cond = null;

        Code r1 = null;

        Code r2 = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:760:42: ( ^( IF_KW cond= conditions[st] r1= consequences[st,new Definition()] (r2= consequences[st,new Definition()] )? ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:761:5: ^( IF_KW cond= conditions[st] r1= consequences[st,new Definition()] (r2= consequences[st,new Definition()] )? )
            {
            match(input,IF_KW,FOLLOW_IF_KW_in_siAlors3014); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_conditions_in_siAlors3018);
            cond=conditions(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_siAlors3023);
            r1=consequences(st, new Definition());

            state._fsp--;

            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:761:72: (r2= consequences[st,new Definition()] )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==CONSEQUENCES_KW) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:761:72: r2= consequences[st,new Definition()]
                    {
                    pushFollow(FOLLOW_consequences_in_siAlors3028);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:765:1: conditions[SymbolTable st] returns [Code c] : ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] );
    public final Code conditions(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree not=null;
        Code cond = null;

        Code cond1 = null;

        Code cond2 = null;


        not=null;
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:766:21: ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:767:5: ^( CONDITION_KW (not= NOT )? cond= conditions[st] )
                    {
                    match(input,CONDITION_KW,FOLLOW_CONDITION_KW_in_conditions3068); 

                    match(input, Token.DOWN, null); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:767:20: (not= NOT )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NOT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:767:21: not= NOT
                            {
                            not=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions3073); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditions_in_conditions3079);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:775:6: ^( OR cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,OR,FOLLOW_OR_in_conditions3095); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions3099);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions3104);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genOr(cond1,cond2);
                        

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:779:6: ^( AND cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,AND,FOLLOW_AND_in_conditions3120); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions3124);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions3129);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genAnd(cond1,cond2);
                        

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:783:6: ^( EQUALS cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_conditions3145); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3149);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3154);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genEquals(cond1,cond2);
                        

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:787:6: ^( INF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INF,FOLLOW_INF_in_conditions3170); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3174);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3179);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInf(cond1,cond2);
                        

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:791:6: ^( SUP cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUP,FOLLOW_SUP_in_conditions3195); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3199);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3204);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSup(cond1,cond2);
                        

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:795:6: ^( INFEG cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INFEG,FOLLOW_INFEG_in_conditions3220); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3224);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3229);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInfEg(cond1,cond2);
                        

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:799:6: ^( SUPED cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUPED,FOLLOW_SUPED_in_conditions3245); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3249);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3254);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSupEg(cond1,cond2);
                        

                    }
                    break;
                case 9 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:803:6: ^( DIFF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,DIFF,FOLLOW_DIFF_in_conditions3270); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions3274);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions3279);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genDiff(cond1,cond2);
                        

                    }
                    break;
                case 10 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:807:7: etat[st]
                    {
                    pushFollow(FOLLOW_etat_in_conditions3295);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:810:1: etat[SymbolTable st] returns [Code c] : ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | ^( VICTORY_KW IDENT ) | ^( DEFEAT_KW IDENT ) );
    public final Code etat(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:810:39: ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | ^( VICTORY_KW IDENT ) | ^( DEFEAT_KW IDENT ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:811:5: ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat3317); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3319);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:811:30: ( NOT )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NOT) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:811:31: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3323); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:811:37: ( OTHER )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==OTHER) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:811:38: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3328); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3332);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:812:7: ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat3343); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3345);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:812:33: ( NOT )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NOT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:812:34: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3349); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:812:40: ( OTHER )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==OTHER) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:812:41: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3354); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3358);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:813:7: ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat3369); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3371);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:813:35: ( NOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NOT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:813:36: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3375); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:813:42: ( OTHER )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==OTHER) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:813:43: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3380); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3384);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:814:7: ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat3395); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3397);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:814:37: ( NOT )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NOT) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:814:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3401); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:814:44: ( OTHER )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==OTHER) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:814:45: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3406); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3410);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:815:7: ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat3421); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3423);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:815:36: ( NOT )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NOT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:815:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3427); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:815:43: ( OTHER )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==OTHER) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:815:44: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3432); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3436);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:816:7: ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat3447); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3449);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:816:34: ( NOT )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==NOT) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:816:35: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3453); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:816:41: ( OTHER )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==OTHER) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:816:42: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3458); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3462);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:817:7: ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat3473); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat3475);
                    accesClass(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:817:35: ( NOT )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NOT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:817:36: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3479); 

                            }
                            break;

                    }

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:817:42: ( OTHER )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==OTHER) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:817:43: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat3484); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat3488);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:818:7: ^( FINISHED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat3499); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3501);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:818:42: ( NOT )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==NOT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:818:43: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3505); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:819:7: ^( STARTED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat3517); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3519);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:819:40: ( NOT )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==NOT) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:819:41: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3522); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:820:7: ^( PAUSED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat3534); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3536);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:820:39: ( NOT )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NOT) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:820:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3539); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:821:7: ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] )
                    {
                    match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat3551); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3553);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:821:39: ( NOT )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==NOT) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:821:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3557); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mode_mute_in_etat3561);
                    mode_mute(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:822:7: ^( PLAYED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat3572); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3574);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:822:40: ( NOT )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==NOT) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:822:41: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3578); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:823:7: ^( STOPPED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat3590); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat3592);
                    type_declencheur(st);

                    state._fsp--;

                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:823:41: ( NOT )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==NOT) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:823:42: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat3596); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:825:7: ^( VICTORY_KW IDENT )
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat3613); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_etat3615); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:826:7: ^( DEFEAT_KW IDENT )
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat3625); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_etat3627); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:829:1: mode_mute[SymbolTable st] returns [Code c] : ( ON | OFF );
    public final Code mode_mute(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:829:44: ( ON | OFF )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:832:1: affectation[SymbolTable st , Definition d] returns [Code c] : ( ^( ASSIGN_KW i1= operation[st] i2= variable[st,d] ) | ^( ADD_KW o= operation[st] v= variable[st,d] ) | ^( SUB_KW op= operation[st] var= variable[st,d] ) | ^( INVERT_KW variable[st,d] variable[st,d] ) );
    public final Code affectation(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        Code i1 = null;

        Code i2 = null;

        Code o = null;

        Code v = null;

        Code op = null;

        Code var = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:832:61: ( ^( ASSIGN_KW i1= operation[st] i2= variable[st,d] ) | ^( ADD_KW o= operation[st] v= variable[st,d] ) | ^( SUB_KW op= operation[st] var= variable[st,d] ) | ^( INVERT_KW variable[st,d] variable[st,d] ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:833:5: ^( ASSIGN_KW i1= operation[st] i2= variable[st,d] )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation3674); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3678);
                    i1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3683);
                    i2=variable(st, d);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	c = Code.genAffect(i2,i1);
                        

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:837:6: ^( ADD_KW o= operation[st] v= variable[st,d] )
                    {
                    match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation3699); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3703);
                    o=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3708);
                    v=variable(st, d);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genIncr(v,o);
                        

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:841:6: ^( SUB_KW op= operation[st] var= variable[st,d] )
                    {
                    match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation3724); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation3728);
                    op=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3733);
                    var=variable(st, d);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSub(var,op);
                        

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:845:6: ^( INVERT_KW variable[st,d] variable[st,d] )
                    {
                    match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation3750); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_affectation3752);
                    variable(st, d);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation3755);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:851:1: iaBasique[SymbolTable st] returns [Code c] : ^( IA_KW IDENT ( reglesJeu[st] )+ ) ;
    public final Code iaBasique(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:851:44: ( ^( IA_KW IDENT ( reglesJeu[st] )+ ) )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:852:5: ^( IA_KW IDENT ( reglesJeu[st] )+ )
            {
            match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique3789); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_iaBasique3791); 
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:852:19: ( reglesJeu[st] )+
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
            	    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:852:19: reglesJeu[st]
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_iaBasique3793);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:856:1: operation[SymbolTable st] returns [Code c] : ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st,new Definition()] | f= FLOAT );
    public final Code operation(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree f=null;
        Code c1 = null;

        Code c2 = null;

        Code v = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:856:44: ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | v= variable[st,new Definition()] | f= FLOAT )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:857:5: ^( RANDOM_KW c1= operation[st] c2= operation[st] )
                    {
                    match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation3817); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3822);
                    c1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3828);
                    c2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genRD(c1,c2);

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:859:6: ^( PLUS operation[st] operation[st] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_operation3844); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3846);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3849);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPLUS(c1,c2);

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:861:6: ^( MINUS operation[st] operation[st] )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_operation3865); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3867);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3870);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMINUS(c1,c2);

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:863:6: ^( MUL operation[st] operation[st] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_operation3886); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3888);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3891);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMUL(c1,c2);

                    }
                    break;
                case 5 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:865:6: ^( DIV operation[st] operation[st] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_operation3907); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3909);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3912);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genDIV(c1,c2);

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:867:6: ^( MOD operation[st] operation[st] )
                    {
                    match(input,MOD,FOLLOW_MOD_in_operation3928); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3930);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3933);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMOD(c1,c2);

                    }
                    break;
                case 7 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:869:6: ^( POW operation[st] operation[st] )
                    {
                    match(input,POW,FOLLOW_POW_in_operation3949); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation3951);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation3954);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPOW(c1,c2);

                    }
                    break;
                case 8 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:871:6: v= variable[st,new Definition()]
                    {
                    pushFollow(FOLLOW_variable_in_operation3973);
                    v=variable(st, new Definition());

                    state._fsp--;

                    c = v;

                    }
                    break;
                case 9 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:873:6: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_operation3991); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:878:1: variable[SymbolTable st , Definition d] returns [Code c] : ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) );
    public final Code variable(SymbolTable st, Definition d) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code tc = null;

        ArrayList<Symbol> sb = null;

        ArrayList<Symbol> e = null;

        String at = null;

        ArrayList<Symbol> ac = null;


        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:878:58: ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:879:5: ^( X tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,X,FOLLOW_X_in_variable4022); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable4026);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable4031);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:890:6: ^( Y tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Y,FOLLOW_Y_in_variable4047); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable4052);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable4057);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:901:6: ^( Z typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Z,FOLLOW_Z_in_variable4073); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable4075);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable4080);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:912:6: ^( VAR_I_KW i= IDENT e= accesClass[st] )
                    {
                    match(input,VAR_I_KW,FOLLOW_VAR_I_KW_in_variable4096); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variable4100); 
                    pushFollow(FOLLOW_accesClass_in_variable4104);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:955:6: GAME_SCORE_KW
                    {
                    match(input,GAME_SCORE_KW,FOLLOW_GAME_SCORE_KW_in_variable4119); 

                    }
                    break;
                case 6 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:956:6: ^( VALUE_KW at= attributTps[st] ac= accesClass[st] )
                    {
                    match(input,VALUE_KW,FOLLOW_VALUE_KW_in_variable4127); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_variable4131);
                    at=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable4136);
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:968:1: accesClass[SymbolTable st] returns [ArrayList<Symbol> sb] : ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) );
    public final ArrayList<Symbol> accesClass(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> sb = null;

        CommonTree i=null;
        Code co = null;


        sb = new ArrayList<Symbol>();
        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:969:42: ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:970:5: ^( ACCESS_KW ALL )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4177); 

                    match(input, Token.DOWN, null); 
                    match(input,ALL,FOLLOW_ALL_in_accesClass4179); 

                    match(input, Token.UP, null); 

                    	sb.addAll(st.getAllEntities());
                        

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:974:7: ^( ACCESS_KW i= IDENT (co= operation[st] )? )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4195); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesClass4199); 
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:974:29: (co= operation[st] )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==GAME_SCORE_KW||LA97_0==VALUE_KW||LA97_0==VAR_I_KW||LA97_0==FLOAT||LA97_0==RANDOM_KW||(LA97_0>=PLUS && LA97_0<=POW)||(LA97_0>=X && LA97_0<=Z)) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:974:29: co= operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_accesClass4203);
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:983:7: ^( ACCESS_KW PLAYER )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass4222); 

                    match(input, Token.DOWN, null); 
                    match(input,PLAYER,FOLLOW_PLAYER_in_accesClass4224); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:989:1: typeCoordonnees[SymbolTable st] returns [Code c] : ( POSITION | ORIENTATION | SIZE );
    public final Code typeCoordonnees(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:989:50: ( POSITION | ORIENTATION | SIZE )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:990:2: POSITION
                    {
                    match(input,POSITION,FOLLOW_POSITION_in_typeCoordonnees4252); 
                    c = new Code("position");

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:990:40: ORIENTATION
                    {
                    match(input,ORIENTATION,FOLLOW_ORIENTATION_in_typeCoordonnees4257); 
                    c = new Code("angle");

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:990:78: SIZE
                    {
                    match(input,SIZE,FOLLOW_SIZE_in_typeCoordonnees4262); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:993:1: timeUnit[SymbolTable st] returns [String c] : ( MIN | SEC | MS | FRAME );
    public final String timeUnit(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:993:45: ( MIN | SEC | MS | FRAME )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:994:2: MIN
                    {
                    match(input,MIN,FOLLOW_MIN_in_timeUnit4280); 
                    c = "MIN";

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:995:4: SEC
                    {
                    match(input,SEC,FOLLOW_SEC_in_timeUnit4287); 
                    c = "SEC";

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:996:4: MS
                    {
                    match(input,MS,FOLLOW_MS_in_timeUnit4293); 
                    c = "MS";

                    }
                    break;
                case 4 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:997:4: FRAME
                    {
                    match(input,FRAME,FOLLOW_FRAME_in_timeUnit4299); 

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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:1000:1: attributTps[SymbolTable st] returns [String c] : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final String attributTps(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:1000:48: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
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
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:1001:2: BOOST_INTERVAL
                    {
                    match(input,BOOST_INTERVAL,FOLLOW_BOOST_INTERVAL_in_attributTps4315); 
                    c ="boostInterval";

                    }
                    break;
                case 2 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:1002:4: SHOOT_INTERVAL
                    {
                    match(input,SHOOT_INTERVAL,FOLLOW_SHOOT_INTERVAL_in_attributTps4321); 
                    c = "shootInterval";

                    }
                    break;
                case 3 :
                    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:1003:4: RELOAD_TIME
                    {
                    match(input,RELOAD_TIME,FOLLOW_RELOAD_TIME_in_attributTps4336); 
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
    // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:1006:1: attributListeOuObjet[SymbolTable st] returns [Code c] : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final Code attributListeOuObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:1006:55: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // /home/touzbi/Documents/Projet_SVN/compilation/hight/com/istic/mini3d/grammars/highTree.g:
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
            return "227:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC t= typeEntity[st] (d= dupli )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) | PLAYER (s= SOLO )? );";
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
        "\1\uffff\1\1\3\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
        "\1\21\1\22\1\23\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
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
            return "395:1: action[SymbolTable st] returns [Code c] : (ent= accesClass[st] act= actionObjet[st,ent] | ^( ENDS_KW IDENT ( IDENT )? ) | ^( ENDS_KW GAME ( IDENT )? ) | ^( STARTS_KW IDENT ( IDENT )? ) | ^( STARTS_KW GAME ( IDENT )? ) | ^( PAUSE_KW IDENT ( IDENT )? ) | ^( PAUSE_KW GAME ( IDENT )? ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW ta= typeAcces[st] (td= typeDestination[st] )? ) | ^( WAIT_KW op= operation[st] t= timeUnit[st] cons= consequences[st,new Definition()] ) | SAVE_KW | ^( NEXTURN_KW IDENT ) | ^( GRASPS_KW IDENT IDENT ) | ^( EXPELS_KW IDENT IDENT operation[st] ) | ^( INGESTS_KW IDENT IDENT IDENT ) );";
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
            return "461:1: actionObjet[SymbolTable st,List<Symbol> l] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | act= actionCommandeMaintenue[st,l] | ^( DURING actionCommandeMaintenue[st,l] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st,l] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );";
        }
    }
 

    public static final BitSet FOLLOW_GAME_KW_in_game72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gameData_in_game81 = new BitSet(new long[]{0x00024800000000C0L});
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
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_KW_in_declarationObjet702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYER_in_declarationObjet724 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_SOLO_in_declarationObjet729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_list_declaration771 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_list_declaration778 = new BitSet(new long[]{0x0000040400105002L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectationObjet_in_affectationObjet_list903 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet935 = new BitSet(new long[]{0x0000000000080008L,0x0000000000000000L,0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_valAggregation_in_affectationObjet939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_affectationObjet962 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_affectationObjet967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_affectationObjet987 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet990 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet1001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_affectationObjet1005 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_affectationObjet1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_affectationObjet1015 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation1052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_valAggregation1056 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation1078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1082 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_221_in_valAggregation1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_valAggregation1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_definition1145 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_definition1149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSEQUENCES_KW_in_consequences1189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_list_in_consequences1193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_consequ_in_consequ_list1235 = new BitSet(new long[]{0x0000040002000002L,0x000000000179F9F4L,0x0000F00000010003L});
    public static final BitSet FOLLOW_siAlors_in_consequ1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_consequ1345 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_consequ1347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_consequ1360 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_consequ1362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_action1398 = new BitSet(new long[]{0x0000000000000000L,0x000019032E000000L});
    public static final BitSet FOLLOW_actionObjet_in_action1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1422 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1436 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1450 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1462 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1464 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1466 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1478 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1492 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_IDENT_in_action1494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mode_mute_in_action1512 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1526 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOP_KW_in_action1535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_transformation_in_action1548 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_action1551 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_action1554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1566 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1584 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_action1610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_action1615 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_action1620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXTURN_KW_in_action1644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1646 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRASPS_KW_in_action1660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1662 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1664 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPELS_KW_in_action1673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1675 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1677 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_action1679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INGESTS_KW_in_action1689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1691 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1693 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAcces1731 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeAcces1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeDestination1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coordinates_in_typeDestination1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1837 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionObjet1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1855 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1858 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_actionObjet1870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1882 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1917 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LEFT_in_actionCommandeMaintenue1945 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_actionCommandeMaintenue1950 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_FORWARD_in_actionCommandeMaintenue1955 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_BACKWARD_in_actionCommandeMaintenue1960 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_WUP_in_actionCommandeMaintenue1965 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_WDOWN_in_actionCommandeMaintenue1970 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1978 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1997 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue2021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue2030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue2032 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue2041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue2043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_KW_in_coordinates2107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_coordinates2111 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_coordinates2116 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_coordinates2121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande2160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_player_list_in_commande2164 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_actionCommande_list_in_commande2169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_player_list2206 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_actionCommande_in_actionCommande_list2235 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande2260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_actionCommande2264 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2269 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande2290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_actionCommande2294 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2299 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRESSED_KW_in_commandMode2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELD_KW_in_commandMode2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASED_KW_in_commandMode2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_definitionId2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WUP_in_souris2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WDOWN_in_souris2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_souris2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_souris2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLICK_LEFT_in_souris2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLICK_MIDDLE_in_souris2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLICK_RIGHT_in_souris2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCROLL_UP_in_souris2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCROLL_DOWN_in_souris2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_clavier2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WUP_in_clavier2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WDOWN_in_clavier2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_clavier2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_clavier2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPACE_in_clavier2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESCAPE_in_clavier2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTER_in_clavier2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande2535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande2547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_typeCommand2582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_typeCommand2584 = new BitSet(new long[]{0x0000000000000008L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_KEY_KW_in_typeCommand2596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2598 = new BitSet(new long[]{0x0000000000000008L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu2629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu2631 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000074L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu2634 = new BitSet(new long[]{0x0000040000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_definitionId_in_reglesJeu2637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_declencheur2662 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x000000000000F7A0L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur2689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur2691 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur2701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur2703 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_VAR_KW_in_declencheur2723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_declencheur2725 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur2728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur2738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_declencheur2740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur2755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_declencheur2757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_type_declencheur0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2835 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2839 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2853 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OWNES_KW_in_declencheurTK2868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2871 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2875 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTOWNES_KW_in_declencheurTK2886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2889 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2926 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2944 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2948 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OWNED_KW_in_declencheurKT2959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2962 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2966 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTOWNED_KW_in_declencheurKT2977 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2980 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2984 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors3014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors3018 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_siAlors3023 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_consequences_in_siAlors3028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_KW_in_conditions3068 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_conditions3073 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions3079 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_conditions3095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions3099 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions3104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_conditions3120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions3124 = new BitSet(new long[]{0x0000200001000000L,0x0000000000000014L,0x00000FFF8FD00000L});
    public static final BitSet FOLLOW_conditions_in_conditions3129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_conditions3145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3149 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_conditions3170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3174 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_conditions3195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3199 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEG_in_conditions3220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3224 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPED_in_conditions3245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3249 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIFF_in_conditions3270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions3274 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_conditions3279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_etat_in_conditions3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat3317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3319 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3323 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3328 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat3343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3345 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3349 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3354 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat3369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3371 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3375 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3380 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat3395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3397 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3401 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3406 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat3421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3423 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3427 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3432 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat3447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3449 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3453 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3458 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat3473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat3475 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_NOT_in_etat3479 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_OTHER_in_etat3484 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat3488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat3499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3501 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3505 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat3517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3519 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat3534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3536 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat3551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L,0x0000000000080000L});
    public static final BitSet FOLLOW_mode_mute_in_etat3561 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat3572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3574 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat3590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat3592 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat3613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_etat3615 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat3625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_etat3627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_mode_mute0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation3674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3678 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3683 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation3699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3703 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation3724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation3728 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation3750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_affectation3752 = new BitSet(new long[]{0x0000000000105000L,0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_variable_in_affectation3755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique3789 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_iaBasique3791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3793 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation3817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3822 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_operation3844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3846 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3849 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_operation3865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3867 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_operation3886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3888 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3891 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation3907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3909 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_operation3928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3930 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_operation3949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation3951 = new BitSet(new long[]{0x0000000400105000L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_operation3954 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_operation3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operation3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable4022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable4026 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_variable4047 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable4052 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4057 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Z_in_variable4073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable4075 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4080 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_I_KW_in_variable4096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable4100 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GAME_SCORE_KW_in_variable4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_KW_in_variable4127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_variable4131 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable4136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ALL_in_accesClass4179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accesClass4199 = new BitSet(new long[]{0x0000000400105008L,0x0000000000000000L,0x73F4000000000000L});
    public static final BitSet FOLLOW_operation_in_accesClass4203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass4222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLAYER_in_accesClass4224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_typeCoordonnees4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORIENTATION_in_typeCoordonnees4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_typeCoordonnees4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_timeUnit4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEC_in_timeUnit4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MS_in_timeUnit4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAME_in_timeUnit4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOST_INTERVAL_in_attributTps4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOOT_INTERVAL_in_attributTps4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOAD_TIME_in_attributTps4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}