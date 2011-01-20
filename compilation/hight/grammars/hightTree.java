// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g 2011-01-20 18:55:00

    package grammars;
    import code.*;
    import symbols.*;
    import lib.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class hightTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "ACCESS_KW", "KEY_KW", "MOUSE_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "SCORE", "TYPE", "IDENT", "IS", "AND", "LIST_KW", "OF", "WITH", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "IN", "PLAYER", "ALLY", "ENEMY", "NEUTRAL", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "DIES_KW", "DURING", "UNTIL", "EQUIP", "NEXT", "PREVIOUS", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "MOUSE", "FOR", "KEY", "WUP", "WDOWN", "LEFT", "RIGHT", "CLICK_LEFT", "CLICK_CENTER", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "JUMP", "MOVE", "FORWARD", "BACKWARD", "TURN", "ACCELERATE", "BRAKE", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "BY", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "X", "Y", "Z", "VALUE", "ALL", "NUM", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "COUNTER", "TIME", "OBJECT", "CHARACTER", "VEHICLE", "PLANE", "SPACECRAFT", "OBSTACLE", "WEAPON", "SWORD", "PROJECTILE", "ZONE", "GROUND", "BONUS", "CHECKPOINT", "BREAKABLE", "CONSTRUCTION", "ROOM", "BALL", "TELEPORTER", "MASS", "IS_FIX", "IS_TRAVERSABLE", "FOV", "ACTIVE", "NAME", "DESCRIPTION", "LIFE", "LIFE_MAX", "LIFE_MIN", "NB_LIVES", "MAGIC", "MAGIC_MAX", "MAGIC_MIN", "LEVEL", "ATTACK", "DEFENSE", "JUMP_FORCE", "JUMP_AIR_MAX", "MONEY", "CLASS", "RACE", "ACCELERATION", "SPEED", "SPEED_MAX", "SPEED_MIN", "BOOST", "BOOST_MAX", "NB_MUNITIONS", "NB_MUNITIONS_MAX", "SHOOT_POWER", "DAMAGES", "UNIT", "OBJECT_NAME", "ATTRIBUT_NAME", "VOLUME", "NUMBER", "MOVE_WITH_CAMERA", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "WS", "'true'", "'false'"
    };
    public static final int EOF=-1;
    public static final int T__251=251;
    public static final int T__252=252;
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
    public static final int OBJECT=177;
    public static final int CHARACTER=178;
    public static final int VEHICLE=179;
    public static final int PLANE=180;
    public static final int SPACECRAFT=181;
    public static final int OBSTACLE=182;
    public static final int WEAPON=183;
    public static final int SWORD=184;
    public static final int PROJECTILE=185;
    public static final int ZONE=186;
    public static final int GROUND=187;
    public static final int BONUS=188;
    public static final int CHECKPOINT=189;
    public static final int BREAKABLE=190;
    public static final int CONSTRUCTION=191;
    public static final int ROOM=192;
    public static final int BALL=193;
    public static final int TELEPORTER=194;
    public static final int MASS=195;
    public static final int IS_FIX=196;
    public static final int IS_TRAVERSABLE=197;
    public static final int FOV=198;
    public static final int ACTIVE=199;
    public static final int NAME=200;
    public static final int DESCRIPTION=201;
    public static final int LIFE=202;
    public static final int LIFE_MAX=203;
    public static final int LIFE_MIN=204;
    public static final int NB_LIVES=205;
    public static final int MAGIC=206;
    public static final int MAGIC_MAX=207;
    public static final int MAGIC_MIN=208;
    public static final int LEVEL=209;
    public static final int ATTACK=210;
    public static final int DEFENSE=211;
    public static final int JUMP_FORCE=212;
    public static final int JUMP_AIR_MAX=213;
    public static final int MONEY=214;
    public static final int CLASS=215;
    public static final int RACE=216;
    public static final int ACCELERATION=217;
    public static final int SPEED=218;
    public static final int SPEED_MAX=219;
    public static final int SPEED_MIN=220;
    public static final int BOOST=221;
    public static final int BOOST_MAX=222;
    public static final int NB_MUNITIONS=223;
    public static final int NB_MUNITIONS_MAX=224;
    public static final int SHOOT_POWER=225;
    public static final int DAMAGES=226;
    public static final int UNIT=227;
    public static final int OBJECT_NAME=228;
    public static final int ATTRIBUT_NAME=229;
    public static final int VOLUME=230;
    public static final int NUMBER=231;
    public static final int MOVE_WITH_CAMERA=232;
    public static final int BOOST_INTERVAL=233;
    public static final int SHOOT_INTERVAL=234;
    public static final int RELOAD_TIME=235;
    public static final int INVENTORY=236;
    public static final int EQUIPED_OBJECT=237;
    public static final int ENTRANCES=238;
    public static final int EXITS=239;
    public static final int DAMAGE_ZONE=240;
    public static final int COLLECTORS=241;
    public static final int TYPES_COLLECTORS=242;
    public static final int GENERATORS=243;
    public static final int TYPE_GENERATORS=244;
    public static final int BREAKERS=245;
    public static final int TYPES_BREAKERS=246;
    public static final int TELEPORTABLES=247;
    public static final int TYPES_TELEPORTABLES=248;
    public static final int COMMENT=249;
    public static final int WS=250;

    // delegates
    // delegators


        public hightTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public hightTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return hightTree.tokenNames; }
    public String getGrammarFileName() { return "D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g"; }



    // $ANTLR start "game"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:21:1: game[SymbolTable st] returns [Code c] : ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* (in= init[st] )+ (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) ;
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
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:24: ( ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* (in= init[st] )+ (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:2: ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* (in= init[st] )+ (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* )
            {
            match(input,GAME_KW,FOLLOW_GAME_KW_in_game59); 

            match(input, Token.DOWN, null); 
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:14: (gd= gameData[st] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME_ATTRIBUT_KW) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:14: gd= gameData[st]
                    {
                    pushFollow(FOLLOW_gameData_in_game63);
                    gd=gameData(st);

                    state._fsp--;


                    }
                    break;

            }

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:29: ( newType[st] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:29: newType[st]
            	    {
            	    pushFollow(FOLLOW_newType_in_game67);
            	    newType(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:44: (in= init[st] )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=INIT_IS_KW && LA3_0<=INIT_HAS_KW)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:44: in= init[st]
            	    {
            	    pushFollow(FOLLOW_init_in_game73);
            	    in=init(st);

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

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:58: (def= definition[st] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DEFINITION_KW) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:58: def= definition[st]
            	    {
            	    pushFollow(FOLLOW_definition_in_game79);
            	    def=definition(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:78: (com= commande[st] )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMAND_KW) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:78: com= commande[st]
            	    {
            	    pushFollow(FOLLOW_commande_in_game85);
            	    com=commande(st);

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

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:96: (reg= reglesJeu[st] )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_KW) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:96: reg= reglesJeu[st]
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game91);
            	    reg=reglesJeu(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:114: (ia= iaBasique[st] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IA_KW) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:23:114: ia= iaBasique[st]
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game97);
            	    ia=iaBasique(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input, Token.UP, null); 
            st.print();

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:30:1: gameData[SymbolTable st] returns [Code c] : ^( GAME_ATTRIBUT_KW attributGame_list[st] ) ;
    public final Code gameData(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:30:43: ( ^( GAME_ATTRIBUT_KW attributGame_list[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:31:2: ^( GAME_ATTRIBUT_KW attributGame_list[st] )
            {
            match(input,GAME_ATTRIBUT_KW,FOLLOW_GAME_ATTRIBUT_KW_in_gameData128); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_attributGame_list_in_gameData130);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:33:1: attributGame_list[SymbolTable st] returns [Code c] : ( attributGame[st] )+ ;
    public final Code attributGame_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:33:52: ( ( attributGame[st] )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:34:2: ( attributGame[st] )+
            {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:34:2: ( attributGame[st] )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==SCORE_KW||LA8_0==GRAVITY_KW) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:34:2: attributGame[st]
            	    {
            	    pushFollow(FOLLOW_attributGame_in_attributGame_list147);
            	    attributGame(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:36:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) );
    public final Code attributGame(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:36:47: ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==GRAVITY_KW) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==DOWN) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==FLOAT) ) {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==UP) ) {
                            alt9=1;
                        }
                        else if ( (LA9_4==FLOAT) ) {
                            alt9=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==SCORE_KW) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:37:2: ^( GRAVITY_KW FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame165); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame167); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:38:3: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame173); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame175); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame177); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame179); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:39:3: ^( SCORE_KW FLOAT )
                    {
                    match(input,SCORE_KW,FOLLOW_SCORE_KW_in_attributGame185); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame187); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:42:1: newType[SymbolTable st] : ^( TYPE i= IDENT ( subType[st,sub] )+ ) ;
    public final void newType(SymbolTable st) throws RecognitionException {
        CommonTree i=null;

        List<Model> sub = new ArrayList<Model>();
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:43:50: ( ^( TYPE i= IDENT ( subType[st,sub] )+ ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:44:2: ^( TYPE i= IDENT ( subType[st,sub] )+ )
            {
            match(input,TYPE,FOLLOW_TYPE_in_newType208); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_newType212); 
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:44:17: ( subType[st,sub] )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDENT||LA10_0==CAMERA||LA10_0==MEDIA||(LA10_0>=COUNTER && LA10_0<=TELEPORTER)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:44:17: subType[st,sub]
            	    {
            	    pushFollow(FOLLOW_subType_in_newType214);
            	    subType(st, sub);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:58:1: subType[SymbolTable st, List<Model> sub] : (i= IDENT | t= typeObjet );
    public final void subType(SymbolTable st, List<Model> sub) throws RecognitionException {
        CommonTree i=null;
        Model t = null;


        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:58:43: (i= IDENT | t= typeObjet )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==CAMERA||LA11_0==MEDIA||(LA11_0>=COUNTER && LA11_0<=TELEPORTER)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:59:2: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_subType235); 
                       String id = i.getText();
                    	    Symbol verif = st.get(id);
                    	    if(verif == null) {
                    		System.out.println("Model \""+id+"\" non défini.");
                    		System.exit(-1);
                    	    } else if(verif.getName() != id) {
                    		System.out.println("Gros Gros bug !!!");
                    		System.exit(-1);
                    	    } else {
                    		sub.add((Model)verif);
                    	    }
                    	

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:72:4: t= typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_subType245);
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


    // $ANTLR start "init"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:75:1: init[SymbolTable st] returns [Code c] : ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW affectationObjet[st] ) );
    public final Code init(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Pair<Model, Integer> d = null;


        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:75:39: ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW affectationObjet[st] ) )
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:76:2: ^( INIT_IS_KW i= IDENT d= declarationObjet[st] )
                    {
                    match(input,INIT_IS_KW,FOLLOW_INIT_IS_KW_in_init265); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_init269); 
                    pushFollow(FOLLOW_declarationObjet_in_init273);
                    d=declarationObjet(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                       String id = i.getText();
                    	    Symbol verif = st.get(id);
                    	    if(verif != null) {
                    		System.out.println("Elément \""+id+"\" déjà déclaré.");
                    		System.exit(-1);
                    	    } else {
                                    System.out.println(d.getFirst().getName());
                    		Entity t = new Entity(id,d.getFirst());
                    		st.add(id,t);
                    	    }
                    	

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:88:3: ^( INIT_HAS_KW affectationObjet[st] )
                    {
                    match(input,INIT_HAS_KW,FOLLOW_INIT_HAS_KW_in_init283); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_affectationObjet_in_init285);
                    affectationObjet(st);

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
    // $ANTLR end "init"


    // $ANTLR start "declarationObjet"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:92:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC te= typeEntity[st] (em= entityMode )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );
    public final Pair<Model, Integer> declarationObjet(SymbolTable st) throws RecognitionException {
        Pair<Model, Integer> p = null;

        Model te = null;

        Integer em = null;


        em=null;
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:93:17: ( ^( DEC te= typeEntity[st] (em= entityMode )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:94:2: ^( DEC te= typeEntity[st] (em= entityMode )? )
                    {
                    match(input,DEC,FOLLOW_DEC_in_declarationObjet310); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet314);
                    te=typeEntity(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:94:26: (em= entityMode )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==INTERACTION_KW||LA13_0==PLAYER||LA13_0==DUPLICABLE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:94:27: em= entityMode
                            {
                            pushFollow(FOLLOW_entityMode_in_declarationObjet320);
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:101:3: ^( LIST_KW list_declaration[st] )
                    {
                    match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet331); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_declaration_in_declarationObjet333);
                    list_declaration(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:102:3: ^( CAMERA_KW PERSON view[st] )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet340); 

                    match(input, Token.DOWN, null); 
                    match(input,PERSON,FOLLOW_PERSON_in_declarationObjet342); 
                    pushFollow(FOLLOW_view_in_declarationObjet344);
                    view(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:103:3: ^( CAMERA_KW FREE )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet352); 

                    match(input, Token.DOWN, null); 
                    match(input,FREE,FOLLOW_FREE_in_declarationObjet354); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:104:3: ^( MEDIA_KW LOOP )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet360); 

                    match(input, Token.DOWN, null); 
                    match(input,LOOP,FOLLOW_LOOP_in_declarationObjet362); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:105:3: ^( MEDIA_KW ONCE )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet369); 

                    match(input, Token.DOWN, null); 
                    match(input,ONCE,FOLLOW_ONCE_in_declarationObjet371); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:106:3: ^( IN_KW IDENT )
                    {
                    match(input,IN_KW,FOLLOW_IN_KW_in_declarationObjet385); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declarationObjet387); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:109:1: list_declaration[SymbolTable st] returns [Code c] : ( ( operation[st] )? IDENT )+ ;
    public final Code list_declaration(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:109:51: ( ( ( operation[st] )? IDENT )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:2: ( ( operation[st] )? IDENT )+
            {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:2: ( ( operation[st] )? IDENT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==GAME_SCORE_KW||LA16_0==VALUE_KW||(LA16_0>=VAR_I_KW && LA16_0<=VAR_A_KW)||LA16_0==FLOAT||LA16_0==IDENT||LA16_0==RANDOM_KW||(LA16_0>=PLUS && LA16_0<=Z)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:3: ( operation[st] )? IDENT
            	    {
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:3: ( operation[st] )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==GAME_SCORE_KW||LA15_0==VALUE_KW||(LA15_0>=VAR_I_KW && LA15_0<=VAR_A_KW)||LA15_0==FLOAT||LA15_0==RANDOM_KW||(LA15_0>=PLUS && LA15_0<=Z)) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:3: operation[st]
            	            {
            	            pushFollow(FOLLOW_operation_in_list_declaration419);
            	            operation(st);

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    match(input,IDENT,FOLLOW_IDENT_in_list_declaration423); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:113:1: typeEntity[SymbolTable st] returns [Model t] : (i= IDENT | to= typeObjet3D );
    public final Model typeEntity(SymbolTable st) throws RecognitionException {
        Model t = null;

        CommonTree i=null;
        Model to = null;


        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:113:46: (i= IDENT | to= typeObjet3D )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=OBJECT && LA17_0<=TELEPORTER)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:114:2: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeEntity444); 
                       String id = i.getText();
                    	    Symbol verif = st.get(id);
                    	    if(verif == null) {
                    		System.out.println("Model \""+id+"\" non défini.");
                    		System.exit(-1);
                    	    } else if(!verif.getName().equals(id)) {
                    		System.out.println("Gros Gros bug !!!");
                    		System.exit(-1);
                    	    } else {
                                    System.out.println(verif.getName());
                    		t = (Model)verif;
                    	    }
                    	

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:128:4: to= typeObjet3D
                    {
                    pushFollow(FOLLOW_typeObjet3D_in_typeEntity454);
                    to=typeObjet3D();

                    state._fsp--;

                    t = to;

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
        return t;
    }
    // $ANTLR end "typeEntity"


    // $ANTLR start "entityMode"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:131:1: entityMode returns [Integer i] : ( PLAYER | ^( INTERACTION_KW in= interaction (d= dupli )? ) | d= dupli );
    public final Integer entityMode() throws RecognitionException {
        Integer i = null;

        Integer in = null;

        Integer d = null;


        d=null;
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:132:19: ( PLAYER | ^( INTERACTION_KW in= interaction (d= dupli )? ) | d= dupli )
            int alt19=3;
            switch ( input.LA(1) ) {
            case PLAYER:
                {
                alt19=1;
                }
                break;
            case INTERACTION_KW:
                {
                alt19=2;
                }
                break;
            case DUPLICABLE:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:133:2: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_entityMode477); 
                    i=1;

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:135:4: ^( INTERACTION_KW in= interaction (d= dupli )? )
                    {
                    match(input,INTERACTION_KW,FOLLOW_INTERACTION_KW_in_entityMode486); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_interaction_in_entityMode490);
                    in=interaction();

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:135:37: (d= dupli )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DUPLICABLE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:135:37: d= dupli
                            {
                            pushFollow(FOLLOW_dupli_in_entityMode494);
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:136:4: d= dupli
                    {
                    pushFollow(FOLLOW_dupli_in_entityMode505);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:139:1: interaction returns [Integer i] : ( ALLY | ENEMY | NEUTRAL );
    public final Integer interaction() throws RecognitionException {
        Integer i = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:139:32: ( ALLY | ENEMY | NEUTRAL )
            int alt20=3;
            switch ( input.LA(1) ) {
            case ALLY:
                {
                alt20=1;
                }
                break;
            case ENEMY:
                {
                alt20=2;
                }
                break;
            case NEUTRAL:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:140:2: ALLY
                    {
                    match(input,ALLY,FOLLOW_ALLY_in_interaction522); 
                    i=2;

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:142:4: ENEMY
                    {
                    match(input,ENEMY,FOLLOW_ENEMY_in_interaction530); 
                    i=3;

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:144:4: NEUTRAL
                    {
                    match(input,NEUTRAL,FOLLOW_NEUTRAL_in_interaction538); 
                    i=4;

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:148:1: dupli returns [Integer i] : DUPLICABLE ;
    public final Integer dupli() throws RecognitionException {
        Integer i = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:148:26: ( DUPLICABLE )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:149:2: DUPLICABLE
            {
            match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli555); 
            i=10;

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:153:1: view[SymbolTable st] returns [Code c] : ( FIRST | THIRD );
    public final Code view(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:153:39: ( FIRST | THIRD )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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


    // $ANTLR start "affectationObjet"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:158:1: affectationObjet[SymbolTable st] returns [Code c] : ( ^( ALLOCATION_KW IDENT ( valAggregation[st] )? ) | ^( ALLOCATION_KW attribut[st] typeAllocation[st] ) | ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st] ) );
    public final Code affectationObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:158:51: ( ^( ALLOCATION_KW IDENT ( valAggregation[st] )? ) | ^( ALLOCATION_KW attribut[st] typeAllocation[st] ) | ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st] ) )
            int alt22=5;
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
                    case TYPE:
                    case VALUE:
                    case MASS:
                    case IS_FIX:
                    case IS_TRAVERSABLE:
                    case FOV:
                    case ACTIVE:
                    case NAME:
                    case DESCRIPTION:
                    case LIFE:
                    case LIFE_MAX:
                    case LIFE_MIN:
                    case NB_LIVES:
                    case MAGIC:
                    case MAGIC_MAX:
                    case MAGIC_MIN:
                    case LEVEL:
                    case ATTACK:
                    case DEFENSE:
                    case JUMP_FORCE:
                    case JUMP_AIR_MAX:
                    case MONEY:
                    case CLASS:
                    case RACE:
                    case ACCELERATION:
                    case SPEED:
                    case SPEED_MAX:
                    case SPEED_MIN:
                    case BOOST:
                    case BOOST_MAX:
                    case NB_MUNITIONS:
                    case NB_MUNITIONS_MAX:
                    case SHOOT_POWER:
                    case DAMAGES:
                    case UNIT:
                    case OBJECT_NAME:
                    case ATTRIBUT_NAME:
                    case VOLUME:
                    case NUMBER:
                    case MOVE_WITH_CAMERA:
                        {
                        alt22=2;
                        }
                        break;
                    case POSITION:
                    case ORIENTATION:
                    case SIZE:
                        {
                        alt22=3;
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
                        alt22=4;
                        }
                        break;
                    case BOOST_INTERVAL:
                    case SHOOT_INTERVAL:
                    case RELOAD_TIME:
                        {
                        alt22=5;
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:2: ^( ALLOCATION_KW IDENT ( valAggregation[st] )? )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet598); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_affectationObjet600); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:25: ( valAggregation[st] )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==AGGREGATION_KW) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:25: valAggregation[st]
                            {
                            pushFollow(FOLLOW_valAggregation_in_affectationObjet602);
                            valAggregation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:160:4: ^( ALLOCATION_KW attribut[st] typeAllocation[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet612); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attribut_in_affectationObjet614);
                    attribut(st);

                    state._fsp--;

                    pushFollow(FOLLOW_typeAllocation_in_affectationObjet617);
                    typeAllocation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:161:4: ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet626); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_affectationObjet628);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_affectationObjet631);
                    coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:162:4: ^( ALLOCATION_KW attributListeOuObjet[st] IDENT )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet640); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributListeOuObjet_in_affectationObjet642);
                    attributListeOuObjet(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_affectationObjet645); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:163:4: ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet653); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_affectationObjet655);
                    attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_affectationObjet658);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_affectationObjet661);
                    timeUnit(st);

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
    // $ANTLR end "affectationObjet"


    // $ANTLR start "typeAllocation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:166:1: typeAllocation[SymbolTable st] returns [Code c] : ( operation[st] | IDENT | 'true' | 'false' ) ;
    public final Code typeAllocation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:166:49: ( ( operation[st] | IDENT | 'true' | 'false' ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:167:2: ( operation[st] | IDENT | 'true' | 'false' )
            {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:167:2: ( operation[st] | IDENT | 'true' | 'false' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case GAME_SCORE_KW:
            case VALUE_KW:
            case VAR_I_KW:
            case VAR_A_KW:
            case FLOAT:
            case RANDOM_KW:
            case PLUS:
            case MINUS:
            case MUL:
            case DIV:
            case MOD:
            case POW:
            case X:
            case Y:
            case Z:
                {
                alt23=1;
                }
                break;
            case IDENT:
                {
                alt23=2;
                }
                break;
            case 251:
                {
                alt23=3;
                }
                break;
            case 252:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:167:3: operation[st]
                    {
                    pushFollow(FOLLOW_operation_in_typeAllocation688);
                    operation(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:167:19: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_typeAllocation693); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:167:27: 'true'
                    {
                    match(input,251,FOLLOW_251_in_typeAllocation697); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:167:36: 'false'
                    {
                    match(input,252,FOLLOW_252_in_typeAllocation701); 

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
    // $ANTLR end "typeAllocation"


    // $ANTLR start "valAggregation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:170:1: valAggregation[SymbolTable st] returns [Code c] : ( ^( AGGREGATION_KW operation[st] ( timeUnit[st] )? ) | ^( AGGREGATION_KW IDENT ) );
    public final Code valAggregation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:170:49: ( ^( AGGREGATION_KW operation[st] ( timeUnit[st] )? ) | ^( AGGREGATION_KW IDENT ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AGGREGATION_KW) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==DOWN) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==IDENT) ) {
                        alt25=2;
                    }
                    else if ( (LA25_2==GAME_SCORE_KW||LA25_2==VALUE_KW||(LA25_2>=VAR_I_KW && LA25_2<=VAR_A_KW)||LA25_2==FLOAT||LA25_2==RANDOM_KW||(LA25_2>=PLUS && LA25_2<=Z)) ) {
                        alt25=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:171:2: ^( AGGREGATION_KW operation[st] ( timeUnit[st] )? )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation720); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_valAggregation722);
                    operation(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:171:33: ( timeUnit[st] )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=MIN && LA24_0<=FRAME)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:171:33: timeUnit[st]
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation725);
                            timeUnit(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:172:3: ^( AGGREGATION_KW IDENT )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation733); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_valAggregation735); 

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
    // $ANTLR end "valAggregation"


    // $ANTLR start "definition"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:176:1: definition[SymbolTable st] returns [Code c] : ^( DEFINITION_KW IDENT consequences[st] ) ;
    public final Code definition(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:176:45: ( ^( DEFINITION_KW IDENT consequences[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:177:2: ^( DEFINITION_KW IDENT consequences[st] )
            {
            match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition758); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_definition760); 
            pushFollow(FOLLOW_consequences_in_definition762);
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
    // $ANTLR end "definition"


    // $ANTLR start "consequences"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:180:1: consequences[SymbolTable st] returns [Code c] : ^( CONSEQUENCES_KW consequ_list[st] ) ;
    public final Code consequences(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:180:47: ( ^( CONSEQUENCES_KW consequ_list[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:181:2: ^( CONSEQUENCES_KW consequ_list[st] )
            {
            match(input,CONSEQUENCES_KW,FOLLOW_CONSEQUENCES_KW_in_consequences782); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_consequ_list_in_consequences784);
            consequ_list(st);

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
    // $ANTLR end "consequences"


    // $ANTLR start "consequ_list"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:184:1: consequ_list[SymbolTable st] returns [Code c] : ( consequ[st] )+ ;
    public final Code consequ_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:184:47: ( ( consequ[st] )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:185:3: ( consequ[st] )+
            {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:185:3: ( consequ[st] )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ACCESS_KW||LA26_0==IDENT||(LA26_0>=VICTORY_KW && LA26_0<=MUTE_KW)||(LA26_0>=PLAY_KW && LA26_0<=WAIT_KW)||LA26_0==SAVE_KW||(LA26_0>=ACTIVATE_KW && LA26_0<=DISABLE_KW)||LA26_0==IF_KW||(LA26_0>=ASSIGN_KW && LA26_0<=INVERT_KW)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:185:3: consequ[st]
            	    {
            	    pushFollow(FOLLOW_consequ_in_consequ_list803);
            	    consequ(st);

            	    state._fsp--;


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:187:1: consequ[SymbolTable st] returns [Code c] : ( siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW );
    public final Code consequ(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:187:42: ( siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW )
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:188:3: siAlors[st]
                    {
                    pushFollow(FOLLOW_siAlors_in_consequ822);
                    siAlors(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:189:5: action[st]
                    {
                    pushFollow(FOLLOW_action_in_consequ829);
                    action(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:190:5: affectation[st]
                    {
                    pushFollow(FOLLOW_affectation_in_consequ836);
                    affectation(st);

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:191:5: activCommande[st]
                    {
                    pushFollow(FOLLOW_activCommande_in_consequ843);
                    activCommande(st);

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:192:5: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_consequ850); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:193:5: VICTORY_KW
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ856); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:194:5: DEFEAT_KW
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ862); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:197:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );
    public final Code action(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:197:41: ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW )
            int alt30=14;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:198:2: accesClass[st] actionObjet[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_action879);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionObjet_in_action882);
                    actionObjet(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:199:3: ^( ENDS_KW IDENT )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action888); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action890); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:200:3: ^( ENDS_KW GAME )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action897); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action899); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:201:3: ^( STARTS_KW IDENT )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action906); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action908); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:202:3: ^( STARTS_KW GAME )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action914); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action916); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:203:3: ^( PAUSE_KW IDENT )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action922); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action924); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:204:3: ^( MUTE_KW mode_mute[st] IDENT )
                    {
                    match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action930); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mode_mute_in_action932);
                    mode_mute(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_action935); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:205:3: ^( PLAY_KW IDENT )
                    {
                    match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action941); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action943); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:206:3: ^( STOP_KW IDENT )
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_action949); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action951); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:207:3: ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] )
                    {
                    match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action957); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_transformation_in_action959);
                    transformation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_action962);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_action965);
                    coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:208:3: ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action972); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action974);
                    typeAcces(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:208:29: ( typeDestination[st] )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==COORDINATE_KW||LA28_0==ACCESS_KW) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:208:29: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action977);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:209:3: ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action985); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action987);
                    typeAcces(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:209:31: ( typeDestination[st] )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==COORDINATE_KW||LA29_0==ACCESS_KW) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:209:31: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action990);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:210:3: ^( WAIT_KW operation[st] timeUnit[st] consequences[st] )
                    {
                    match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action998); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_action1000);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_action1003);
                    timeUnit(st);

                    state._fsp--;

                    pushFollow(FOLLOW_consequences_in_action1006);
                    consequences(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:211:3: SAVE_KW
                    {
                    match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1012); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:214:1: typeAcces[SymbolTable st] returns [Code c] : ( accesClass[st] | operation[st] ( IDENT | accesClass[st] ) );
    public final Code typeAcces(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:214:44: ( accesClass[st] | operation[st] ( IDENT | accesClass[st] ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ACCESS_KW) ) {
                alt32=1;
            }
            else if ( (LA32_0==GAME_SCORE_KW||LA32_0==VALUE_KW||(LA32_0>=VAR_I_KW && LA32_0<=VAR_A_KW)||LA32_0==FLOAT||LA32_0==RANDOM_KW||(LA32_0>=PLUS && LA32_0<=Z)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:215:2: accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeAcces1028);
                    accesClass(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:215:19: operation[st] ( IDENT | accesClass[st] )
                    {
                    pushFollow(FOLLOW_operation_in_typeAcces1033);
                    operation(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:215:33: ( IDENT | accesClass[st] )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENT) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==ACCESS_KW) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:215:34: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_typeAcces1037); 

                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:215:42: accesClass[st]
                            {
                            pushFollow(FOLLOW_accesClass_in_typeAcces1041);
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
        return c;
    }
    // $ANTLR end "typeAcces"


    // $ANTLR start "typeDestination"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:217:1: typeDestination[SymbolTable st] returns [Code c] : ( accesClass[st] | coordinates[st] );
    public final Code typeDestination(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:217:50: ( accesClass[st] | coordinates[st] )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ACCESS_KW) ) {
                alt33=1;
            }
            else if ( (LA33_0==COORDINATE_KW) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:218:2: accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeDestination1058);
                    accesClass(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:218:19: coordinates[st]
                    {
                    pushFollow(FOLLOW_coordinates_in_typeDestination1063);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:220:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );
    public final Code actionObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:220:46: ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) )
            int alt34=7;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:221:3: DIES_KW
                    {
                    match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1079); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:222:5: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1085);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:223:4: ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] )
                    {
                    match(input,DURING,FOLLOW_DURING_in_actionObjet1092); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1094);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_actionObjet1097);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_actionObjet1100);
                    timeUnit(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:224:4: ^( UNTIL actionCommandeMaintenue[st] conditions[st] )
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1108); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1110);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_actionObjet1113);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:225:4: ^( EQUIP accesClass[st] )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1121); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_actionObjet1123);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:226:4: ^( EQUIP NEXT )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1131); 

                    match(input, Token.DOWN, null); 
                    match(input,NEXT,FOLLOW_NEXT_in_actionObjet1133); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:227:4: ^( EQUIP PREVIOUS )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1141); 

                    match(input, Token.DOWN, null); 
                    match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1143); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:230:1: transformation[SymbolTable st] returns [Code c] : ( TRANSLATION | ROTATION | SCALE );
    public final Code transformation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:230:49: ( TRANSLATION | ROTATION | SCALE )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:236:1: coordinates[SymbolTable st] returns [Code c] : ^( COORDINATE_KW operation[st] operation[st] operation[st] ) ;
    public final Code coordinates(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:236:46: ( ^( COORDINATE_KW operation[st] operation[st] operation[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:237:2: ^( COORDINATE_KW operation[st] operation[st] operation[st] )
            {
            match(input,COORDINATE_KW,FOLLOW_COORDINATE_KW_in_coordinates1194); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_coordinates1196);
            operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates1199);
            operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates1202);
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
    // $ANTLR end "coordinates"


    // $ANTLR start "commande"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:242:1: commande[SymbolTable st] returns [Code c] : ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) ;
    public final Code commande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:242:43: ( ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:243:2: ^( COMMAND_KW ( IDENT )? actionCommande_list[st] )
            {
            match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1224); 

            match(input, Token.DOWN, null); 
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:243:15: ( IDENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IDENT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:243:15: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_commande1226); 

                    }
                    break;

            }

            pushFollow(FOLLOW_actionCommande_list_in_commande1229);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:246:1: actionCommande_list[SymbolTable st] returns [Code c] : ( actionCommande[st] )+ ;
    public final Code actionCommande_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:246:53: ( ( actionCommande[st] )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:2: ( actionCommande[st] )+
            {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:2: ( actionCommande[st] )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=KEY_KW && LA36_0<=MOUSE_KW)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:2: actionCommande[st]
            	    {
            	    pushFollow(FOLLOW_actionCommande_in_actionCommande_list1247);
            	    actionCommande(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:250:1: actionCommande[SymbolTable st] returns [Code c] : ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) );
    public final Code actionCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:250:49: ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==MOUSE_KW) ) {
                alt37=1;
            }
            else if ( (LA37_0==KEY_KW) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:251:2: ^( MOUSE_KW souris[st] actionCommandeType[st] )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande1267); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_souris_in_actionCommande1269);
                    souris(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1272);
                    actionCommandeType(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:252:3: ^( KEY_KW clavier[st] actionCommandeType[st] )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande1280); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_clavier_in_actionCommande1282);
                    clavier(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1285);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:255:1: actionCommandeType[SymbolTable st] returns [Code c] : ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] );
    public final Code actionCommandeType(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:255:53: ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] )
            int alt38=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt38=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt38=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:256:2: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1304); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:256:10: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1308);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:256:38: actionCommandeMaintenue[st]
                    {
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1313);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:259:1: souris[SymbolTable st] returns [Code c] : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final Code souris(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:259:41: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:263:1: clavier[SymbolTable st] returns [Code c] : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final Code clavier(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:263:42: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:267:1: actionCommandePressee[SymbolTable st] returns [Code c] : ( JUMP operation[st] | PAUSE_KW | STOP_KW );
    public final Code actionCommandePressee(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:267:56: ( JUMP operation[st] | PAUSE_KW | STOP_KW )
            int alt39=3;
            switch ( input.LA(1) ) {
            case JUMP:
                {
                alt39=1;
                }
                break;
            case PAUSE_KW:
                {
                alt39=2;
                }
                break;
            case STOP_KW:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:268:3: JUMP operation[st]
                    {
                    match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1441); 
                    pushFollow(FOLLOW_operation_in_actionCommandePressee1443);
                    operation(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:269:5: PAUSE_KW
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1450); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:270:5: STOP_KW
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1456); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:273:1: actionCommandeMaintenue[SymbolTable st] returns [Code c] : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
    public final Code actionCommandeMaintenue(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:273:58: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
            int alt40=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt40=1;
                }
                break;
            case TURN:
                {
                alt40=2;
                }
                break;
            case ACCELERATE:
                {
                alt40=3;
                }
                break;
            case BRAKE:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1476); 
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:5: TURN ( LEFT | RIGHT )
                    {
                    match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1498); 
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:276:5: ACCELERATE
                    {
                    match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1512); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:277:5: BRAKE
                    {
                    match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1518); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:280:1: activCommande[SymbolTable st] returns [Code c] : ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) );
    public final Code activCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:280:48: ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ACTIVATE_KW) ) {
                alt41=1;
            }
            else if ( (LA41_0==DISABLE_KW) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:281:3: ^( ACTIVATE_KW typeCommand[st] )
                    {
                    match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1539); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande1541);
                    typeCommand(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:282:4: ^( DISABLE_KW typeCommand[st] )
                    {
                    match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1550); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande1552);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:285:1: typeCommand[SymbolTable st] returns [Code c] : ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD );
    public final Code typeCommand(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:285:46: ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD )
            int alt44=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt44=1;
                }
                break;
            case MOUSE_KW:
                {
                alt44=2;
                }
                break;
            case KEY_KW:
                {
                alt44=3;
                }
                break;
            case KEYBOARD:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:286:2: COMMANDS
                    {
                    match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand1570); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:287:4: ^( MOUSE_KW ( souris[st] )* )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_typeCommand1577); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:287:15: ( souris[st] )*
                        loop42:
                        do {
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( ((LA42_0>=WUP && LA42_0<=SCROLL_DOWN)) ) {
                                alt42=1;
                            }


                            switch (alt42) {
                        	case 1 :
                        	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:287:15: souris[st]
                        	    {
                        	    pushFollow(FOLLOW_souris_in_typeCommand1579);
                        	    souris(st);

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop42;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:288:4: ^( KEY_KW ( clavier[st] )+ )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_typeCommand1588); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:288:13: ( clavier[st] )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=WUP && LA43_0<=RIGHT)||(LA43_0>=LETTER && LA43_0<=ENTER)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:288:13: clavier[st]
                    	    {
                    	    pushFollow(FOLLOW_clavier_in_typeCommand1590);
                    	    clavier(st);

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


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:289:4: KEYBOARD
                    {
                    match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand1598); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:291:1: reglesJeu[SymbolTable st] returns [Code c] : ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) ;
    public final Code reglesJeu(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:291:44: ( ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:292:3: ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] )
            {
            match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1616); 

            match(input, Token.DOWN, null); 
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:292:13: ( IDENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==IDENT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:292:13: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1618); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu1621);
            declencheur(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_reglesJeu1624);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:295:1: declencheur[SymbolTable st] returns [Code c] : ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW );
    public final Code declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:295:46: ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW )
            int alt47=7;
            switch ( input.LA(1) ) {
            case ACCESS_KW:
                {
                alt47=1;
                }
                break;
            case ENDS_KW:
                {
                alt47=2;
                }
                break;
            case STARTS_KW:
                {
                alt47=3;
                }
                break;
            case BECOMES_VAR_KW:
                {
                alt47=4;
                }
                break;
            case BECOMES_ID_KW:
                {
                alt47=5;
                }
                break;
            case VICTORY_KW:
                {
                alt47=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt47=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:3: accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    {
                    pushFollow(FOLLOW_accesClass_in_declencheur1645);
                    accesClass(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:18: ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    int alt46=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt46=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt46=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                        {
                        alt46=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
                        {
                        alt46=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }

                    switch (alt46) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:19: MOVES_KW
                            {
                            match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1649); 

                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:30: DIES_KW
                            {
                            match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1653); 

                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:40: declencheurTK[st]
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1657);
                            declencheurTK(st);

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:60: declencheurKT[st]
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1662);
                            declencheurKT(st);

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:297:4: ^( ENDS_KW type_declencheur[st] )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1670); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1672);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:298:4: ^( STARTS_KW type_declencheur[st] )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1680); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1682);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:299:4: ^( BECOMES_VAR_KW variable[st] varOuNB[st] )
                    {
                    match(input,BECOMES_VAR_KW,FOLLOW_BECOMES_VAR_KW_in_declencheur1700); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_declencheur1702);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_varOuNB_in_declencheur1705);
                    varOuNB(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:300:4: ^( BECOMES_ID_KW IDENT playerOuInteraction[st] )
                    {
                    match(input,BECOMES_ID_KW,FOLLOW_BECOMES_ID_KW_in_declencheur1713); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declencheur1715); 
                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1717);
                    playerOuInteraction(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:301:4: VICTORY_KW
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur1724); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:302:4: DEFEAT_KW
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur1730); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:305:1: type_declencheur[SymbolTable st] returns [Code c] : ( IDENT | GAME );
    public final Code type_declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:305:51: ( IDENT | GAME )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:308:1: varOuNB[SymbolTable st] returns [Code c] : ( variable[st] | FLOAT );
    public final Code varOuNB(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:308:42: ( variable[st] | FLOAT )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==GAME_SCORE_KW||LA48_0==VALUE_KW||(LA48_0>=VAR_I_KW && LA48_0<=VAR_A_KW)||(LA48_0>=X && LA48_0<=Z)) ) {
                alt48=1;
            }
            else if ( (LA48_0==FLOAT) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:308:44: variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_varOuNB1766);
                    variable(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:308:59: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB1771); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:310:1: playerOuInteraction[SymbolTable st] returns [Code c] : ( PLAYER | interaction ) ;
    public final Code playerOuInteraction(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:311:2: ( ( PLAYER | interaction ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:311:4: ( PLAYER | interaction )
            {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:311:4: ( PLAYER | interaction )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==PLAYER) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=ALLY && LA49_0<=NEUTRAL)) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:311:5: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction1787); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:311:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction1790);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:313:1: declencheurTK[SymbolTable st] returns [Code c] : ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurTK(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:314:2: ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==TOUCHES_KW) ) {
                alt52=1;
            }
            else if ( (LA52_0==KILLS_KW) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:314:4: ^( TOUCHES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK1807); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:314:17: ( OTHER )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==OTHER) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:314:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK1810); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK1814);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:315:4: ^( KILLS_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK1822); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:315:15: ( OTHER )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==OTHER) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:315:16: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK1825); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK1829);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:319:1: declencheurKT[SymbolTable st] returns [Code c] : ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurKT(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:320:2: ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==KILLED_KW) ) {
                alt55=1;
            }
            else if ( (LA55_0==TOUCHED_KW) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:320:4: ^( KILLED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT1851); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:320:16: ( OTHER )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==OTHER) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:320:17: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT1854); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT1858);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:321:4: ^( TOUCHED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT1866); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:321:17: ( OTHER )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==OTHER) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:321:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT1869); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT1873);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:324:1: siAlors[SymbolTable st] returns [Code c] : ^( IF_KW conditions[st] consequences[st] ( consequences[st] )? ) ;
    public final Code siAlors(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:324:42: ( ^( IF_KW conditions[st] consequences[st] ( consequences[st] )? ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:325:3: ^( IF_KW conditions[st] consequences[st] ( consequences[st] )? )
            {
            match(input,IF_KW,FOLLOW_IF_KW_in_siAlors1896); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_conditions_in_siAlors1898);
            conditions(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_siAlors1901);
            consequences(st);

            state._fsp--;

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:325:43: ( consequences[st] )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==CONSEQUENCES_KW) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:325:43: consequences[st]
                    {
                    pushFollow(FOLLOW_consequences_in_siAlors1904);
                    consequences(st);

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "siAlors"


    // $ANTLR start "conditions"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:328:1: conditions[SymbolTable st] returns [Code c] : ( ^( CONDITION_KW ( NOT )? conditions[st] ) | ^( OR conditions[st] ( NOT )? conditions[st] ) | ^( AND conditions[st] ( NOT )? conditions[st] ) | ^( EQUALS operation[st] operation[st] ) | ^( INF operation[st] operation[st] ) | ^( SUP operation[st] operation[st] ) | ^( INFEG operation[st] operation[st] ) | ^( SUPED operation[st] operation[st] ) | ^( DIFF operation[st] operation[st] ) | etat[st] );
    public final Code conditions(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:328:45: ( ^( CONDITION_KW ( NOT )? conditions[st] ) | ^( OR conditions[st] ( NOT )? conditions[st] ) | ^( AND conditions[st] ( NOT )? conditions[st] ) | ^( EQUALS operation[st] operation[st] ) | ^( INF operation[st] operation[st] ) | ^( SUP operation[st] operation[st] ) | ^( INFEG operation[st] operation[st] ) | ^( SUPED operation[st] operation[st] ) | ^( DIFF operation[st] operation[st] ) | etat[st] )
            int alt60=10;
            switch ( input.LA(1) ) {
            case CONDITION_KW:
                {
                alt60=1;
                }
                break;
            case OR:
                {
                alt60=2;
                }
                break;
            case AND:
                {
                alt60=3;
                }
                break;
            case EQUALS:
                {
                alt60=4;
                }
                break;
            case INF:
                {
                alt60=5;
                }
                break;
            case SUP:
                {
                alt60=6;
                }
                break;
            case INFEG:
                {
                alt60=7;
                }
                break;
            case SUPED:
                {
                alt60=8;
                }
                break;
            case DIFF:
                {
                alt60=9;
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
                alt60=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:329:3: ^( CONDITION_KW ( NOT )? conditions[st] )
                    {
                    match(input,CONDITION_KW,FOLLOW_CONDITION_KW_in_conditions1926); 

                    match(input, Token.DOWN, null); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:329:18: ( NOT )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==NOT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:329:18: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_conditions1928); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditions_in_conditions1931);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:330:4: ^( OR conditions[st] ( NOT )? conditions[st] )
                    {
                    match(input,OR,FOLLOW_OR_in_conditions1939); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions1941);
                    conditions(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:330:24: ( NOT )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==NOT) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:330:24: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_conditions1944); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditions_in_conditions1947);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:331:4: ^( AND conditions[st] ( NOT )? conditions[st] )
                    {
                    match(input,AND,FOLLOW_AND_in_conditions1955); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions1957);
                    conditions(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:331:25: ( NOT )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==NOT) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:331:25: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_conditions1960); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditions_in_conditions1963);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:332:4: ^( EQUALS operation[st] operation[st] )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_conditions1971); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions1973);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions1976);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:333:4: ^( INF operation[st] operation[st] )
                    {
                    match(input,INF,FOLLOW_INF_in_conditions1984); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions1986);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions1988);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:334:4: ^( SUP operation[st] operation[st] )
                    {
                    match(input,SUP,FOLLOW_SUP_in_conditions1996); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions1998);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2001);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:335:4: ^( INFEG operation[st] operation[st] )
                    {
                    match(input,INFEG,FOLLOW_INFEG_in_conditions2009); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2011);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2014);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:336:4: ^( SUPED operation[st] operation[st] )
                    {
                    match(input,SUPED,FOLLOW_SUPED_in_conditions2022); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2024);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2027);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:337:4: ^( DIFF operation[st] operation[st] )
                    {
                    match(input,DIFF,FOLLOW_DIFF_in_conditions2035); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2037);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2040);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:338:5: etat[st]
                    {
                    pushFollow(FOLLOW_etat_in_conditions2048);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:341:1: etat[SymbolTable st] returns [Code c] : ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW );
    public final Code etat(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:341:39: ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW )
            int alt81=15;
            switch ( input.LA(1) ) {
            case DEAD_KW:
                {
                alt81=1;
                }
                break;
            case ALIVE_KW:
                {
                alt81=2;
                }
                break;
            case EFFACED_KW:
                {
                alt81=3;
                }
                break;
            case GENERATED_KW:
                {
                alt81=4;
                }
                break;
            case TOUCHING_KW:
                {
                alt81=5;
                }
                break;
            case MOVING_KW:
                {
                alt81=6;
                }
                break;
            case WAITING_KW:
                {
                alt81=7;
                }
                break;
            case FINISHED_KW:
                {
                alt81=8;
                }
                break;
            case STARTED_KW:
                {
                alt81=9;
                }
                break;
            case PAUSED_KW:
                {
                alt81=10;
                }
                break;
            case MUTED_KW:
                {
                alt81=11;
                }
                break;
            case PLAYED_KW:
                {
                alt81=12;
                }
                break;
            case STOPPED_KW:
                {
                alt81=13;
                }
                break;
            case VICTORY_KW:
                {
                alt81=14;
                }
                break;
            case DEFEAT_KW:
                {
                alt81=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:342:2: ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2067); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2069);
                    accesClass(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:342:27: ( NOT )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==NOT) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:342:28: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2073); 

                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:342:34: ( OTHER )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==OTHER) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:342:35: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2078); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2082);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:343:4: ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2090); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2092);
                    accesClass(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:343:30: ( NOT )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==NOT) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:343:31: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2096); 

                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:343:37: ( OTHER )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==OTHER) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:343:38: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2101); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2105);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:344:4: ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2113); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2115);
                    accesClass(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:344:32: ( NOT )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==NOT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:344:33: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2119); 

                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:344:39: ( OTHER )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==OTHER) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:344:40: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2124); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2128);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:345:4: ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2136); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2138);
                    accesClass(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:345:34: ( NOT )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==NOT) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:345:35: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2142); 

                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:345:41: ( OTHER )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==OTHER) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:345:42: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2147); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2151);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:346:4: ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2159); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2161);
                    accesClass(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:346:33: ( NOT )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NOT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:346:34: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2165); 

                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:346:40: ( OTHER )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==OTHER) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:346:41: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2170); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2174);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:347:4: ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2182); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2184);
                    accesClass(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:347:31: ( NOT )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NOT) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:347:32: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2188); 

                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:347:38: ( OTHER )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==OTHER) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:347:39: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2193); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2197);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:348:4: ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2205); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2207);
                    accesClass(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:348:32: ( NOT )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==NOT) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:348:33: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2211); 

                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:348:39: ( OTHER )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==OTHER) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:348:40: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2216); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2220);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:349:4: ^( FINISHED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2228); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2230);
                    type_declencheur(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:349:39: ( NOT )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==NOT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:349:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2234); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:350:4: ^( STARTED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2243); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2245);
                    type_declencheur(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:350:37: ( NOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NOT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:350:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2248); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:351:4: ^( PAUSED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2257); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2259);
                    type_declencheur(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:351:36: ( NOT )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NOT) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:351:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2262); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:352:4: ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] )
                    {
                    match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2271); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2273);
                    type_declencheur(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:352:36: ( NOT )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NOT) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:352:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2277); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mode_mute_in_etat2281);
                    mode_mute(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:353:4: ^( PLAYED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2289); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2291);
                    type_declencheur(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:353:37: ( NOT )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==NOT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:353:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2295); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:354:4: ^( STOPPED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2306);
                    type_declencheur(st);

                    state._fsp--;

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:354:38: ( NOT )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NOT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:354:39: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2310); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:356:4: VICTORY_KW
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2321); 

                    }
                    break;
                case 15 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:357:4: DEFEAT_KW
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2326); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:360:1: mode_mute[SymbolTable st] returns [Code c] : ( ON | OFF );
    public final Code mode_mute(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:360:44: ( ON | OFF )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:363:1: affectation[SymbolTable st] returns [Code c] : ( ^( ASSIGN_KW operation[st] variable[st] ) | ^( ADD_KW operation[st] variable[st] ) | ^( SUB_KW operation[st] variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) );
    public final Code affectation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:363:46: ( ^( ASSIGN_KW operation[st] variable[st] ) | ^( ADD_KW operation[st] variable[st] ) | ^( SUB_KW operation[st] variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt82=1;
                }
                break;
            case ADD_KW:
                {
                alt82=2;
                }
                break;
            case SUB_KW:
                {
                alt82=3;
                }
                break;
            case INVERT_KW:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:364:3: ^( ASSIGN_KW operation[st] variable[st] )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2365); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation2367);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2370);
                    variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:365:4: ^( ADD_KW operation[st] variable[st] )
                    {
                    match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2378); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation2380);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2383);
                    variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:366:4: ^( SUB_KW operation[st] variable[st] )
                    {
                    match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2392); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation2394);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2397);
                    variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:367:4: ^( INVERT_KW variable[st] variable[st] )
                    {
                    match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2406); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_affectation2408);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2411);
                    variable(st);

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
    // $ANTLR end "affectation"


    // $ANTLR start "iaBasique"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:370:1: iaBasique[SymbolTable st] returns [Code c] : ^( IA_KW accesClass[st] actionObjetList[st] ) ;
    public final Code iaBasique(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:370:44: ( ^( IA_KW accesClass[st] actionObjetList[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:370:46: ^( IA_KW accesClass[st] actionObjetList[st] )
            {
            match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2432); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_accesClass_in_iaBasique2434);
            accesClass(st);

            state._fsp--;

            pushFollow(FOLLOW_actionObjetList_in_iaBasique2437);
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:372:1: actionObjetList[SymbolTable st] returns [Code c] : ( actionObjet[st] )+ ;
    public final Code actionObjetList(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:372:50: ( ( actionObjet[st] )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:372:52: ( actionObjet[st] )+
            {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:372:52: ( actionObjet[st] )+
            int cnt83=0;
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==PAUSE_KW||LA83_0==STOP_KW||(LA83_0>=DIES_KW && LA83_0<=EQUIP)||LA83_0==JUMP) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:372:52: actionObjet[st]
            	    {
            	    pushFollow(FOLLOW_actionObjet_in_actionObjetList2452);
            	    actionObjet(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt83 >= 1 ) break loop83;
                        EarlyExitException eee =
                            new EarlyExitException(83, input);
                        throw eee;
                }
                cnt83++;
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:379:1: operation[SymbolTable st] returns [Code c] : ( ^( RANDOM_KW operation[st] operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | variable[st] | FLOAT );
    public final Code operation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:379:44: ( ^( RANDOM_KW operation[st] operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | variable[st] | FLOAT )
            int alt84=9;
            switch ( input.LA(1) ) {
            case RANDOM_KW:
                {
                alt84=1;
                }
                break;
            case PLUS:
                {
                alt84=2;
                }
                break;
            case MINUS:
                {
                alt84=3;
                }
                break;
            case MUL:
                {
                alt84=4;
                }
                break;
            case DIV:
                {
                alt84=5;
                }
                break;
            case MOD:
                {
                alt84=6;
                }
                break;
            case POW:
                {
                alt84=7;
                }
                break;
            case GAME_SCORE_KW:
            case VALUE_KW:
            case VAR_I_KW:
            case VAR_A_KW:
            case X:
            case Y:
            case Z:
                {
                alt84=8;
                }
                break;
            case FLOAT:
                {
                alt84=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:380:2: ^( RANDOM_KW operation[st] operation[st] )
                    {
                    match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2477); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2479);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2482);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:381:3: ^( PLUS operation[st] operation[st] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_operation2489); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2491);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2494);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:382:3: ^( MINUS operation[st] operation[st] )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_operation2501); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2503);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2506);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:383:3: ^( MUL operation[st] operation[st] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_operation2513); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2515);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2518);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:384:3: ^( DIV operation[st] operation[st] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_operation2525); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2527);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2530);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:385:3: ^( MOD operation[st] operation[st] )
                    {
                    match(input,MOD,FOLLOW_MOD_in_operation2537); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2539);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2542);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:386:3: ^( POW operation[st] operation[st] )
                    {
                    match(input,POW,FOLLOW_POW_in_operation2549); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2551);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2554);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:387:3: variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_operation2560);
                    variable(st);

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:388:3: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_operation2565); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:392:1: variable[SymbolTable st] returns [Code c] : ( ^( X typeCoordonnees[st] accesClass[st] ) | ^( Y typeCoordonnees[st] accesClass[st] ) | ^( Z typeCoordonnees[st] accesClass[st] ) | ^( VAR_I_KW IDENT accesClass[st] ) | ^( VAR_A_KW attribut[st] accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW attributTps[st] accesClass[st] ) );
    public final Code variable(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:392:43: ( ^( X typeCoordonnees[st] accesClass[st] ) | ^( Y typeCoordonnees[st] accesClass[st] ) | ^( Z typeCoordonnees[st] accesClass[st] ) | ^( VAR_I_KW IDENT accesClass[st] ) | ^( VAR_A_KW attribut[st] accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW attributTps[st] accesClass[st] ) )
            int alt85=7;
            switch ( input.LA(1) ) {
            case X:
                {
                alt85=1;
                }
                break;
            case Y:
                {
                alt85=2;
                }
                break;
            case Z:
                {
                alt85=3;
                }
                break;
            case VAR_I_KW:
                {
                alt85=4;
                }
                break;
            case VAR_A_KW:
                {
                alt85=5;
                }
                break;
            case GAME_SCORE_KW:
                {
                alt85=6;
                }
                break;
            case VALUE_KW:
                {
                alt85=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:393:3: ^( X typeCoordonnees[st] accesClass[st] )
                    {
                    match(input,X,FOLLOW_X_in_variable2585); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2587);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable2590);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:394:4: ^( Y typeCoordonnees[st] accesClass[st] )
                    {
                    match(input,Y,FOLLOW_Y_in_variable2598); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2600);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable2603);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:395:4: ^( Z typeCoordonnees[st] accesClass[st] )
                    {
                    match(input,Z,FOLLOW_Z_in_variable2611); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2613);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable2616);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:396:4: ^( VAR_I_KW IDENT accesClass[st] )
                    {
                    match(input,VAR_I_KW,FOLLOW_VAR_I_KW_in_variable2624); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_variable2626); 
                    pushFollow(FOLLOW_accesClass_in_variable2628);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:397:4: ^( VAR_A_KW attribut[st] accesClass[st] )
                    {
                    match(input,VAR_A_KW,FOLLOW_VAR_A_KW_in_variable2636); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attribut_in_variable2638);
                    attribut(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable2641);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:398:4: GAME_SCORE_KW
                    {
                    match(input,GAME_SCORE_KW,FOLLOW_GAME_SCORE_KW_in_variable2648); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:399:4: ^( VALUE_KW attributTps[st] accesClass[st] )
                    {
                    match(input,VALUE_KW,FOLLOW_VALUE_KW_in_variable2654); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_variable2656);
                    attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable2659);
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
    // $ANTLR end "variable"


    // $ANTLR start "accesClass"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:402:1: accesClass[SymbolTable st] returns [Code c] : ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW typeObjet ) | ^( ACCESS_KW interaction ) | ^( ACCESS_KW NOT notAccess[st] ) | ^( ACCESS_KW IDENT ( operation[st] )? ) | ^( ACCESS_KW PLAYER ) );
    public final Code accesClass(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:402:46: ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW typeObjet ) | ^( ACCESS_KW interaction ) | ^( ACCESS_KW NOT notAccess[st] ) | ^( ACCESS_KW IDENT ( operation[st] )? ) | ^( ACCESS_KW PLAYER ) )
            int alt87=6;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==ACCESS_KW) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ALL:
                        {
                        alt87=1;
                        }
                        break;
                    case NOT:
                        {
                        alt87=4;
                        }
                        break;
                    case IDENT:
                        {
                        alt87=5;
                        }
                        break;
                    case PLAYER:
                        {
                        alt87=6;
                        }
                        break;
                    case CAMERA:
                    case MEDIA:
                    case COUNTER:
                    case TIME:
                    case OBJECT:
                    case CHARACTER:
                    case VEHICLE:
                    case PLANE:
                    case SPACECRAFT:
                    case OBSTACLE:
                    case WEAPON:
                    case SWORD:
                    case PROJECTILE:
                    case ZONE:
                    case GROUND:
                    case BONUS:
                    case CHECKPOINT:
                    case BREAKABLE:
                    case CONSTRUCTION:
                    case ROOM:
                    case BALL:
                    case TELEPORTER:
                        {
                        alt87=2;
                        }
                        break;
                    case ALLY:
                    case ENEMY:
                    case NEUTRAL:
                        {
                        alt87=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:403:5: ^( ACCESS_KW ALL )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass2683); 

                    match(input, Token.DOWN, null); 
                    match(input,ALL,FOLLOW_ALL_in_accesClass2685); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:404:5: ^( ACCESS_KW typeObjet )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass2693); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeObjet_in_accesClass2695);
                    typeObjet();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:405:5: ^( ACCESS_KW interaction )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass2703); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_interaction_in_accesClass2705);
                    interaction();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:406:5: ^( ACCESS_KW NOT notAccess[st] )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass2713); 

                    match(input, Token.DOWN, null); 
                    match(input,NOT,FOLLOW_NOT_in_accesClass2715); 
                    pushFollow(FOLLOW_notAccess_in_accesClass2717);
                    notAccess(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:407:5: ^( ACCESS_KW IDENT ( operation[st] )? )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass2726); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_accesClass2728); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:407:23: ( operation[st] )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==GAME_SCORE_KW||LA86_0==VALUE_KW||(LA86_0>=VAR_I_KW && LA86_0<=VAR_A_KW)||LA86_0==FLOAT||LA86_0==RANDOM_KW||(LA86_0>=PLUS && LA86_0<=Z)) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:407:23: operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_accesClass2730);
                            operation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:408:5: ^( ACCESS_KW PLAYER )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass2740); 

                    match(input, Token.DOWN, null); 
                    match(input,PLAYER,FOLLOW_PLAYER_in_accesClass2742); 

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
    // $ANTLR end "accesClass"


    // $ANTLR start "notAccess"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:411:1: notAccess[SymbolTable st] returns [Code c] : ( typeObjet | interaction | PLAYER );
    public final Code notAccess(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:411:45: ( typeObjet | interaction | PLAYER )
            int alt88=3;
            switch ( input.LA(1) ) {
            case CAMERA:
            case MEDIA:
            case COUNTER:
            case TIME:
            case OBJECT:
            case CHARACTER:
            case VEHICLE:
            case PLANE:
            case SPACECRAFT:
            case OBSTACLE:
            case WEAPON:
            case SWORD:
            case PROJECTILE:
            case ZONE:
            case GROUND:
            case BONUS:
            case CHECKPOINT:
            case BREAKABLE:
            case CONSTRUCTION:
            case ROOM:
            case BALL:
            case TELEPORTER:
                {
                alt88=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
                {
                alt88=2;
                }
                break;
            case PLAYER:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:412:1: typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_notAccess2760);
                    typeObjet();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:412:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_notAccess2764);
                    interaction();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:412:27: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_notAccess2768); 

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:414:1: typeCoordonnees[SymbolTable st] returns [Code c] : ( POSITION | ORIENTATION | SIZE );
    public final Code typeCoordonnees(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:414:50: ( POSITION | ORIENTATION | SIZE )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            if ( (input.LA(1)>=POSITION && input.LA(1)<=SIZE) ) {
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
    // $ANTLR end "typeCoordonnees"


    // $ANTLR start "timeUnit"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:418:1: timeUnit[SymbolTable st] returns [Code c] : ( MIN | SEC | MS | FRAME );
    public final Code timeUnit(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:418:43: ( MIN | SEC | MS | FRAME )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            if ( (input.LA(1)>=MIN && input.LA(1)<=FRAME) ) {
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
    // $ANTLR end "timeUnit"


    // $ANTLR start "typeObjet"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:426:1: typeObjet returns [Model t] : ( CAMERA | MEDIA | COUNTER | TIME | to= typeObjet3D );
    public final Model typeObjet() throws RecognitionException {
        Model t = null;

        Model to = null;


        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:426:28: ( CAMERA | MEDIA | COUNTER | TIME | to= typeObjet3D )
            int alt89=5;
            switch ( input.LA(1) ) {
            case CAMERA:
                {
                alt89=1;
                }
                break;
            case MEDIA:
                {
                alt89=2;
                }
                break;
            case COUNTER:
                {
                alt89=3;
                }
                break;
            case TIME:
                {
                alt89=4;
                }
                break;
            case OBJECT:
            case CHARACTER:
            case VEHICLE:
            case PLANE:
            case SPACECRAFT:
            case OBSTACLE:
            case WEAPON:
            case SWORD:
            case PROJECTILE:
            case ZONE:
            case GROUND:
            case BONUS:
            case CHECKPOINT:
            case BREAKABLE:
            case CONSTRUCTION:
            case ROOM:
            case BALL:
            case TELEPORTER:
                {
                alt89=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:427:2: CAMERA
                    {
                    match(input,CAMERA,FOLLOW_CAMERA_in_typeObjet2839); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:428:4: MEDIA
                    {
                    match(input,MEDIA,FOLLOW_MEDIA_in_typeObjet2844); 

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:429:4: COUNTER
                    {
                    match(input,COUNTER,FOLLOW_COUNTER_in_typeObjet2849); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:430:4: TIME
                    {
                    match(input,TIME,FOLLOW_TIME_in_typeObjet2854); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:431:4: to= typeObjet3D
                    {
                    pushFollow(FOLLOW_typeObjet3D_in_typeObjet2861);
                    to=typeObjet3D();

                    state._fsp--;

                    t = to;

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
        return t;
    }
    // $ANTLR end "typeObjet"


    // $ANTLR start "typeObjet3D"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:436:1: typeObjet3D returns [Model t] : ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER );
    public final Model typeObjet3D() throws RecognitionException {
        Model t = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:436:30: ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER )
            int alt90=18;
            switch ( input.LA(1) ) {
            case OBJECT:
                {
                alt90=1;
                }
                break;
            case CHARACTER:
                {
                alt90=2;
                }
                break;
            case VEHICLE:
                {
                alt90=3;
                }
                break;
            case PLANE:
                {
                alt90=4;
                }
                break;
            case SPACECRAFT:
                {
                alt90=5;
                }
                break;
            case OBSTACLE:
                {
                alt90=6;
                }
                break;
            case WEAPON:
                {
                alt90=7;
                }
                break;
            case SWORD:
                {
                alt90=8;
                }
                break;
            case PROJECTILE:
                {
                alt90=9;
                }
                break;
            case ZONE:
                {
                alt90=10;
                }
                break;
            case GROUND:
                {
                alt90=11;
                }
                break;
            case BONUS:
                {
                alt90=12;
                }
                break;
            case CHECKPOINT:
                {
                alt90=13;
                }
                break;
            case BREAKABLE:
                {
                alt90=14;
                }
                break;
            case CONSTRUCTION:
                {
                alt90=15;
                }
                break;
            case ROOM:
                {
                alt90=16;
                }
                break;
            case BALL:
                {
                alt90=17;
                }
                break;
            case TELEPORTER:
                {
                alt90=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:437:2: OBJECT
                    {
                    match(input,OBJECT,FOLLOW_OBJECT_in_typeObjet3D2881); 
                    t = Model.object;

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:438:4: CHARACTER
                    {
                    match(input,CHARACTER,FOLLOW_CHARACTER_in_typeObjet3D2888); 
                    t = Model.character;

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:439:4: VEHICLE
                    {
                    match(input,VEHICLE,FOLLOW_VEHICLE_in_typeObjet3D2895); 

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:440:4: PLANE
                    {
                    match(input,PLANE,FOLLOW_PLANE_in_typeObjet3D2919); 

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:440:12: SPACECRAFT
                    {
                    match(input,SPACECRAFT,FOLLOW_SPACECRAFT_in_typeObjet3D2923); 

                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:441:4: OBSTACLE
                    {
                    match(input,OBSTACLE,FOLLOW_OBSTACLE_in_typeObjet3D2928); 
                    t = Model.obstacle;

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:442:4: WEAPON
                    {
                    match(input,WEAPON,FOLLOW_WEAPON_in_typeObjet3D2935); 
                    t = Model.weapon;

                    }
                    break;
                case 8 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:443:4: SWORD
                    {
                    match(input,SWORD,FOLLOW_SWORD_in_typeObjet3D2942); 

                    }
                    break;
                case 9 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:444:4: PROJECTILE
                    {
                    match(input,PROJECTILE,FOLLOW_PROJECTILE_in_typeObjet3D2968); 
                    t = Model.projectile;

                    }
                    break;
                case 10 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:445:4: ZONE
                    {
                    match(input,ZONE,FOLLOW_ZONE_in_typeObjet3D2975); 
                    t = Model.zone;

                    }
                    break;
                case 11 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:446:4: GROUND
                    {
                    match(input,GROUND,FOLLOW_GROUND_in_typeObjet3D2982); 

                    }
                    break;
                case 12 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:447:4: BONUS
                    {
                    match(input,BONUS,FOLLOW_BONUS_in_typeObjet3D3007); 

                    }
                    break;
                case 13 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:448:4: CHECKPOINT
                    {
                    match(input,CHECKPOINT,FOLLOW_CHECKPOINT_in_typeObjet3D3033); 

                    }
                    break;
                case 14 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:449:4: BREAKABLE
                    {
                    match(input,BREAKABLE,FOLLOW_BREAKABLE_in_typeObjet3D3038); 

                    }
                    break;
                case 15 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:450:4: CONSTRUCTION
                    {
                    match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_typeObjet3D3043); 

                    }
                    break;
                case 16 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:451:4: ROOM
                    {
                    match(input,ROOM,FOLLOW_ROOM_in_typeObjet3D3048); 

                    }
                    break;
                case 17 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:452:4: BALL
                    {
                    match(input,BALL,FOLLOW_BALL_in_typeObjet3D3053); 

                    }
                    break;
                case 18 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:453:4: TELEPORTER
                    {
                    match(input,TELEPORTER,FOLLOW_TELEPORTER_in_typeObjet3D3058); 

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
        return t;
    }
    // $ANTLR end "typeObjet3D"


    // $ANTLR start "attribut"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:457:1: attribut[SymbolTable st] returns [Code c] : ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA );
    public final Code attribut(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:457:43: ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            if ( input.LA(1)==TYPE||input.LA(1)==VALUE||(input.LA(1)>=MASS && input.LA(1)<=MOVE_WITH_CAMERA) ) {
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
    // $ANTLR end "attribut"


    // $ANTLR start "attributTps"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:500:1: attributTps[SymbolTable st] returns [Code c] : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final Code attributTps(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:500:46: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            if ( (input.LA(1)>=BOOST_INTERVAL && input.LA(1)<=RELOAD_TIME) ) {
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
    // $ANTLR end "attributTps"


    // $ANTLR start "attributListeOuObjet"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:506:1: attributListeOuObjet[SymbolTable st] returns [Code c] : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final Code attributListeOuObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:506:55: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
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
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA34 dfa34 = new DFA34(this);
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
            return "92:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC te= typeEntity[st] (em= entityMode )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );";
        }
    }
    static final String DFA30_eotS =
        "\23\uffff";
    static final String DFA30_eofS =
        "\23\uffff";
    static final String DFA30_minS =
        "\1\31\1\uffff\2\2\11\uffff\2\35\4\uffff";
    static final String DFA30_maxS =
        "\1\113\1\uffff\2\2\11\uffff\2\45\4\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\2\uffff\1\2\1\3\1\4\1\5";
    static final String DFA30_specialS =
        "\23\uffff}>";
    static final String[] DFA30_transitionS = {
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "197:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );";
        }
    }
    static final String DFA34_eotS =
        "\12\uffff";
    static final String DFA34_eofS =
        "\12\uffff";
    static final String DFA34_minS =
        "\1\77\4\uffff\1\2\1\31\3\uffff";
    static final String DFA34_maxS =
        "\1\146\4\uffff\1\2\1\121\3\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\6\1\7\1\5";
    static final String DFA34_specialS =
        "\12\uffff}>";
    static final String[] DFA34_transitionS = {
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "220:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );";
        }
    }
 

    public static final BitSet FOLLOW_GAME_KW_in_game59 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gameData_in_game63 = new BitSet(new long[]{0x00000010000000C0L});
    public static final BitSet FOLLOW_newType_in_game67 = new BitSet(new long[]{0x00000010000000C0L});
    public static final BitSet FOLLOW_init_in_game73 = new BitSet(new long[]{0x02000010000000C0L,0x0000000000200000L});
    public static final BitSet FOLLOW_definition_in_game79 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_commande_in_game85 = new BitSet(new long[]{0x0200000000000000L,0x0002000000200000L});
    public static final BitSet FOLLOW_reglesJeu_in_game91 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_iaBasique_in_game97 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_GAME_ATTRIBUT_KW_in_gameData128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributGame_list_in_gameData130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attributGame_in_attributGame_list147 = new BitSet(new long[]{0x0000000100002002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame175 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame177 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCORE_KW_in_attributGame185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_newType208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_newType212 = new BitSet(new long[]{0x0000482000000000L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_subType_in_newType214 = new BitSet(new long[]{0x0000482000000008L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_IDENT_in_subType235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_IS_KW_in_init265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init269 = new BitSet(new long[]{0x0000010000008700L});
    public static final BitSet FOLLOW_declarationObjet_in_init273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INIT_HAS_KW_in_init283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_affectationObjet_in_init285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEC_in_declarationObjet310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet314 = new BitSet(new long[]{0x0044000000000808L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_declaration_in_declarationObjet333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet342 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_view_in_declarationObjet344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet371 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_KW_in_declarationObjet385 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_list_declaration419 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_list_declaration423 = new BitSet(new long[]{0x0000002400305002L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeEntity454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERACTION_KW_in_entityMode486 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_entityMode490 = new BitSet(new long[]{0x0044000000000808L});
    public static final BitSet FOLLOW_dupli_in_entityMode494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dupli_in_entityMode505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALLY_in_interaction522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENEMY_in_interaction530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEUTRAL_in_interaction538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet598 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet600 = new BitSet(new long[]{0x0000000000080008L});
    public static final BitSet FOLLOW_valAggregation_in_affectationObjet602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribut_in_affectationObjet614 = new BitSet(new long[]{0x0000002400305000L,0x0000000000000000L,0x0000001FF4000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_typeAllocation_in_affectationObjet617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_affectationObjet628 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_affectationObjet631 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_affectationObjet642 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_affectationObjet655 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_affectationObjet658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_affectationObjet661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_typeAllocation688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeAllocation693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_typeAllocation697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_typeAllocation701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_valAggregation722 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_definition760 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_definition762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSEQUENCES_KW_in_consequences782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_list_in_consequences784 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_consequ_in_consequ_list803 = new BitSet(new long[]{0xF800002002000002L,0x04006000000009F9L,0x0000000001E00000L});
    public static final BitSet FOLLOW_siAlors_in_consequ822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_action879 = new BitSet(new long[]{0x8000000000000000L,0x000000400000F010L});
    public static final BitSet FOLLOW_actionObjet_in_action882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_action888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENDS_KW_in_action897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action906 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action908 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action924 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mode_mute_in_action932 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_action935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAY_KW_in_action941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action943 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOP_KW_in_action949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_transformation_in_action959 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_action962 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_action965 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action974 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action987 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action990 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_KW_in_action998 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_action1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action1003 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_action1006 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAcces1033 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeAcces1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeDestination1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coordinates_in_typeDestination1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1092 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1094 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_actionObjet1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1110 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_actionObjet1113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_actionObjet1123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_KW_in_coordinates1194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_coordinates1196 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_coordinates1199 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_coordinates1202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_commande1226 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_actionCommande_list_in_commande1229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionCommande_in_actionCommande_list1247 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande1267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_actionCommande1269 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande1280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1282 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1441 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1476 = new BitSet(new long[]{0x0000000000000000L,0x0000030018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande1541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande1552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_typeCommand1577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_typeCommand1579 = new BitSet(new long[]{0x0000000000000008L,0x00000003FE000000L});
    public static final BitSet FOLLOW_KEY_KW_in_typeCommand1588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_typeCommand1590 = new BitSet(new long[]{0x0000000000000008L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1618 = new BitSet(new long[]{0x7800000002C00000L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1621 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1624 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_declencheur1645 = new BitSet(new long[]{0x0000000000000000L,0x01B4000000001000L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_VAR_KW_in_declencheur1700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_declencheur1702 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_ID_KW_in_declencheur1713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1715 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_declencheur0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK1807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK1810 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK1814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK1822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK1825 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK1829 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT1851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT1854 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT1858 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT1866 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT1869 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT1873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors1896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors1898 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_siAlors1901 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_consequences_in_siAlors1904 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_KW_in_conditions1926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_conditions1928 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_conditions1931 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_conditions1939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions1941 = new BitSet(new long[]{0x1800008001000000L,0x6000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_NOT_in_conditions1944 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_conditions1947 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_conditions1955 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions1957 = new BitSet(new long[]{0x1800008001000000L,0x6000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_NOT_in_conditions1960 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_conditions1963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_conditions1971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions1973 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions1976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_conditions1984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions1986 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions1988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_conditions1996 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions1998 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2001 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEG_in_conditions2009 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2011 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2014 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPED_in_conditions2022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2024 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIFF_in_conditions2035 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2037 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_etat_in_conditions2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2069 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2073 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2078 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2082 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2090 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2092 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2096 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2101 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2115 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2119 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2138 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2142 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2147 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2161 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2165 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2170 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2184 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2188 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2193 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2207 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2211 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2216 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2230 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2245 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2259 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2273 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000006L});
    public static final BitSet FOLLOW_NOT_in_etat2277 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000006L});
    public static final BitSet FOLLOW_mode_mute_in_etat2281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2291 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2306 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mode_mute0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2367 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2380 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2394 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_affectation2408 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2411 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_iaBasique2434 = new BitSet(new long[]{0x8000000000000000L,0x000000400000F010L});
    public static final BitSet FOLLOW_actionObjetList_in_iaBasique2437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionObjet_in_actionObjetList2452 = new BitSet(new long[]{0x8000000000000002L,0x000000400000F010L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2479 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2482 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_operation2489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2491 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_operation2501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2503 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_operation2513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2515 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation2525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2527 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_operation2537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2539 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_operation2549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2551 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_operation2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operation2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable2585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2587 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable2590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_variable2598 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2600 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable2603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Z_in_variable2611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2613 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable2616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_I_KW_in_variable2624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable2626 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable2628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_A_KW_in_variable2636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribut_in_variable2638 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable2641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GAME_SCORE_KW_in_variable2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_KW_in_variable2654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_variable2656 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable2659 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass2683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ALL_in_accesClass2685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass2693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeObjet_in_accesClass2695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass2703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_accesClass2705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass2713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_accesClass2715 = new BitSet(new long[]{0x003C482000000000L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_notAccess_in_accesClass2717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass2726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accesClass2728 = new BitSet(new long[]{0x0000000400305008L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_accesClass2730 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass2740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLAYER_in_accesClass2742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeObjet_in_notAccess2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_notAccess2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_notAccess2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERA_in_typeObjet2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_typeObjet2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNTER_in_typeObjet2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_typeObjet2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeObjet2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_in_typeObjet3D2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_typeObjet3D2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEHICLE_in_typeObjet3D2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLANE_in_typeObjet3D2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPACECRAFT_in_typeObjet3D2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_typeObjet3D2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEAPON_in_typeObjet3D2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWORD_in_typeObjet3D2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROJECTILE_in_typeObjet3D2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZONE_in_typeObjet3D2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUND_in_typeObjet3D2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BONUS_in_typeObjet3D3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECKPOINT_in_typeObjet3D3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAKABLE_in_typeObjet3D3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_typeObjet3D3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROOM_in_typeObjet3D3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BALL_in_typeObjet3D3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TELEPORTER_in_typeObjet3D3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attribut0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}