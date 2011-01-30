// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g 2011-01-30 22:49:13

    package grammars;
    import code.*;
    import symbols.*;
    import lib.*;
    import attributes.*;
    import java.util.Iterator;


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
    public String getGrammarFileName() { return "C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g"; }


        private int INT_PLAYER=1, INT_ALLY=2, INT_ENEMY=3, INT_NEUTRAL=4, INT_DUPLICABLE=10;



    // $ANTLR start "game"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:25:1: game[SymbolTable st] returns [Code c] : ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) ;
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:26:27: ( ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:5: ^( GAME_KW (gd= gameData[st] )? ( newType[st] )* in= initialization[st] (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* )
            {
            match(input,GAME_KW,FOLLOW_GAME_KW_in_game69); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:17: (gd= gameData[st] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME_ATTRIBUT_KW) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:17: gd= gameData[st]
                    {
                    pushFollow(FOLLOW_gameData_in_game73);
                    gd=gameData(st);

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:32: ( newType[st] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:32: newType[st]
            	    {
            	    pushFollow(FOLLOW_newType_in_game77);
            	    newType(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_initialization_in_game83);
            in=initialization(st);

            state._fsp--;

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:70: (def= definition[st] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DEFINITION_KW) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:70: def= definition[st]
            	    {
            	    pushFollow(FOLLOW_definition_in_game88);
            	    def=definition(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:90: (com= commande[st] )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:90: com= commande[st]
            	    {
            	    pushFollow(FOLLOW_commande_in_game94);
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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:108: (reg= reglesJeu[st] )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:108: reg= reglesJeu[st]
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game100);
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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:126: (ia= iaBasique[st] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IA_KW) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:27:126: ia= iaBasique[st]
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game106);
            	    ia=iaBasique(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input, Token.UP, null); 

            	st.print();
            	System.out.println(in.getCode());
                

            }

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:37:1: gameData[SymbolTable st] returns [Code c] : ^( GAME_ATTRIBUT_KW attributGame_list[st] ) ;
    public final Code gameData(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:37:43: ( ^( GAME_ATTRIBUT_KW attributGame_list[st] ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:38:2: ^( GAME_ATTRIBUT_KW attributGame_list[st] )
            {
            match(input,GAME_ATTRIBUT_KW,FOLLOW_GAME_ATTRIBUT_KW_in_gameData140); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_attributGame_list_in_gameData142);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:40:1: attributGame_list[SymbolTable st] returns [Code c] : ( attributGame[st] )+ ;
    public final Code attributGame_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:40:52: ( ( attributGame[st] )+ )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:41:2: ( attributGame[st] )+
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:41:2: ( attributGame[st] )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:41:2: attributGame[st]
            	    {
            	    pushFollow(FOLLOW_attributGame_in_attributGame_list159);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:43:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) );
    public final Code attributGame(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:43:47: ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:44:2: ^( GRAVITY_KW FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame177); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame179); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:45:3: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                    {
                    match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame185); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame187); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame189); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame191); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:46:3: ^( SCORE_KW FLOAT )
                    {
                    match(input,SCORE_KW,FOLLOW_SCORE_KW_in_attributGame197); 

                    match(input, Token.DOWN, null); 
                    match(input,FLOAT,FOLLOW_FLOAT_in_attributGame199); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:49:1: newType[SymbolTable st] : ^( TYPE i= IDENT ( subType[st,sub] )+ ) ;
    public final void newType(SymbolTable st) throws RecognitionException {
        CommonTree i=null;

        List<Model> sub = new ArrayList<Model>();
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:50:50: ( ^( TYPE i= IDENT ( subType[st,sub] )+ ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:51:2: ^( TYPE i= IDENT ( subType[st,sub] )+ )
            {
            match(input,TYPE,FOLLOW_TYPE_in_newType220); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_newType224); 
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:51:17: ( subType[st,sub] )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDENT||LA9_0==CAMERA||LA9_0==MEDIA||(LA9_0>=COUNTER && LA9_0<=TELEPORTER)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:51:17: subType[st,sub]
            	    {
            	    pushFollow(FOLLOW_subType_in_newType226);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:65:1: subType[SymbolTable st, List<Model> sub] : (i= IDENT | t= typeObjet );
    public final void subType(SymbolTable st, List<Model> sub) throws RecognitionException {
        CommonTree i=null;
        Model t = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:65:43: (i= IDENT | t= typeObjet )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==CAMERA||LA10_0==MEDIA||(LA10_0>=COUNTER && LA10_0<=TELEPORTER)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:66:2: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_subType247); 
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:79:4: t= typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_subType257);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:82:1: initialization[SymbolTable st] returns [Code c] : ( init[st] )+ ;
    public final Code initialization(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:82:49: ( ( init[st] )+ )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:83:5: ( init[st] )+
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:83:5: ( init[st] )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:83:5: init[st]
            	    {
            	    pushFollow(FOLLOW_init_in_initialization278);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:127:1: init[SymbolTable st] returns [Code c] : ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) );
    public final Code init(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Pair<Model, Integer> d = null;

        ArrayList<Symbol> ac = null;

        ArrayList<Pair<String,Attributes>> ao = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:127:39: ( ^( INIT_IS_KW i= IDENT d= declarationObjet[st] ) | ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:128:2: ^( INIT_IS_KW i= IDENT d= declarationObjet[st] )
                    {
                    match(input,INIT_IS_KW,FOLLOW_INIT_IS_KW_in_init306); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_init310); 
                    pushFollow(FOLLOW_declarationObjet_in_init314);
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:154:3: ^( INIT_HAS_KW ac= accesClass[st] ao= affectationObjet_list[st] )
                    {
                    match(input,INIT_HAS_KW,FOLLOW_INIT_HAS_KW_in_init324); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_init328);
                    ac=accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_affectationObjet_list_in_init333);
                    ao=affectationObjet_list(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	    Iterator<Symbol> it = ac.iterator();
                    	    while(it.hasNext()) {
                    		Symbol s = it.next();
                    		Iterator<Pair<String,Attributes>> ite = ao.iterator();
                    		while(ite.hasNext()) {
                    		    Pair<String,Attributes> p = ite.next();
                    		    s.addAttribute(p.getFirst(),p.getSecond());
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:173:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC te= typeEntity[st] (em= entityMode )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );
    public final Pair<Model, Integer> declarationObjet(SymbolTable st) throws RecognitionException {
        Pair<Model, Integer> p = null;

        Model te = null;

        Integer em = null;


        em=null;
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:174:17: ( ^( DEC te= typeEntity[st] (em= entityMode )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:175:2: ^( DEC te= typeEntity[st] (em= entityMode )? )
                    {
                    match(input,DEC,FOLLOW_DEC_in_declarationObjet365); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet369);
                    te=typeEntity(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:175:26: (em= entityMode )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==INTERACTION_KW||LA13_0==PLAYER||LA13_0==DUPLICABLE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:175:27: em= entityMode
                            {
                            pushFollow(FOLLOW_entityMode_in_declarationObjet375);
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:182:3: ^( LIST_KW list_declaration[st] )
                    {
                    match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet386); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_declaration_in_declarationObjet388);
                    list_declaration(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:183:3: ^( CAMERA_KW PERSON view[st] )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet395); 

                    match(input, Token.DOWN, null); 
                    match(input,PERSON,FOLLOW_PERSON_in_declarationObjet397); 
                    pushFollow(FOLLOW_view_in_declarationObjet399);
                    view(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:184:3: ^( CAMERA_KW FREE )
                    {
                    match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet407); 

                    match(input, Token.DOWN, null); 
                    match(input,FREE,FOLLOW_FREE_in_declarationObjet409); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:185:3: ^( MEDIA_KW LOOP )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet415); 

                    match(input, Token.DOWN, null); 
                    match(input,LOOP,FOLLOW_LOOP_in_declarationObjet417); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:186:3: ^( MEDIA_KW ONCE )
                    {
                    match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet424); 

                    match(input, Token.DOWN, null); 
                    match(input,ONCE,FOLLOW_ONCE_in_declarationObjet426); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:187:3: ^( IN_KW IDENT )
                    {
                    match(input,IN_KW,FOLLOW_IN_KW_in_declarationObjet440); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declarationObjet442); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:190:1: list_declaration[SymbolTable st] returns [Code c] : ( ( operation[st] )? IDENT )+ ;
    public final Code list_declaration(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:190:51: ( ( ( operation[st] )? IDENT )+ )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:191:2: ( ( operation[st] )? IDENT )+
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:191:2: ( ( operation[st] )? IDENT )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:191:3: ( operation[st] )? IDENT
            	    {
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:191:3: ( operation[st] )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==GAME_SCORE_KW||LA15_0==VALUE_KW||(LA15_0>=VAR_I_KW && LA15_0<=VAR_A_KW)||LA15_0==FLOAT||LA15_0==RANDOM_KW||(LA15_0>=PLUS && LA15_0<=Z)) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:191:3: operation[st]
            	            {
            	            pushFollow(FOLLOW_operation_in_list_declaration474);
            	            operation(st);

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    match(input,IDENT,FOLLOW_IDENT_in_list_declaration478); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:194:1: typeEntity[SymbolTable st] returns [Model t] : (i= IDENT | to= typeObjet3D );
    public final Model typeEntity(SymbolTable st) throws RecognitionException {
        Model t = null;

        CommonTree i=null;
        Model to = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:194:46: (i= IDENT | to= typeObjet3D )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:195:2: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeEntity499); 
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
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:208:4: to= typeObjet3D
                    {
                    pushFollow(FOLLOW_typeObjet3D_in_typeEntity509);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:211:1: entityMode returns [Integer i] : ( PLAYER | ^( INTERACTION_KW in= interaction (d= dupli )? ) | d= dupli );
    public final Integer entityMode() throws RecognitionException {
        Integer i = null;

        Integer in = null;

        Integer d = null;


        d=null;
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:212:19: ( PLAYER | ^( INTERACTION_KW in= interaction (d= dupli )? ) | d= dupli )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:213:2: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_entityMode532); 
                    i=INT_PLAYER;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:215:4: ^( INTERACTION_KW in= interaction (d= dupli )? )
                    {
                    match(input,INTERACTION_KW,FOLLOW_INTERACTION_KW_in_entityMode541); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_interaction_in_entityMode545);
                    in=interaction();

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:215:37: (d= dupli )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DUPLICABLE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:215:37: d= dupli
                            {
                            pushFollow(FOLLOW_dupli_in_entityMode549);
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:216:4: d= dupli
                    {
                    pushFollow(FOLLOW_dupli_in_entityMode560);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:219:1: interaction returns [Integer i] : ( ALLY | ENEMY | NEUTRAL );
    public final Integer interaction() throws RecognitionException {
        Integer i = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:219:32: ( ALLY | ENEMY | NEUTRAL )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:220:2: ALLY
                    {
                    match(input,ALLY,FOLLOW_ALLY_in_interaction577); 
                    i=INT_ALLY;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:222:4: ENEMY
                    {
                    match(input,ENEMY,FOLLOW_ENEMY_in_interaction585); 
                    i=INT_ENEMY;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:224:4: NEUTRAL
                    {
                    match(input,NEUTRAL,FOLLOW_NEUTRAL_in_interaction593); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:228:1: dupli returns [Integer i] : DUPLICABLE ;
    public final Integer dupli() throws RecognitionException {
        Integer i = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:228:26: ( DUPLICABLE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:229:2: DUPLICABLE
            {
            match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli610); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:233:1: view[SymbolTable st] returns [Code c] : ( FIRST | THIRD );
    public final Code view(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:233:39: ( FIRST | THIRD )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:237:1: affectationObjet_list[SymbolTable st] returns [ArrayList<Pair<String,Attributes>> c] : (a= affectationObjet[st] )+ ;
    public final ArrayList<Pair<String,Attributes>> affectationObjet_list(SymbolTable st) throws RecognitionException {
        ArrayList<Pair<String,Attributes>> c = null;

        ArrayList<Pair<String,Attributes>> a = null;


        c = new ArrayList();
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:237:113: ( (a= affectationObjet[st] )+ )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:238:9: (a= affectationObjet[st] )+
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:238:9: (a= affectationObjet[st] )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:238:10: a= affectationObjet[st]
            	    {
            	    pushFollow(FOLLOW_affectationObjet_in_affectationObjet_list663);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:240:1: affectationObjet[SymbolTable st] returns [ArrayList<Pair<String,Attributes>> c] : ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW a= attribut[st] ta= typeAllocation[st] ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) );
    public final ArrayList<Pair<String,Attributes>> affectationObjet(SymbolTable st) throws RecognitionException {
        ArrayList<Pair<String,Attributes>> c = null;

        CommonTree i=null;
        Attributes t = null;

        Pair<String,Class<Attributes>> a = null;

        Pair<Class<Attributes>, Code> ta = null;

        Code tc = null;

        Coordonnees coo = null;

        String att = null;

        Code v = null;

        String u = null;


        c = new ArrayList();
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:240:109: ( ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? ) | ^( ALLOCATION_KW a= attribut[st] ta= typeAllocation[st] ) | ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] ) )
            int alt23=5;
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
                        alt23=2;
                        }
                        break;
                    case POSITION:
                    case ORIENTATION:
                    case SIZE:
                        {
                        alt23=3;
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
                        alt23=4;
                        }
                        break;
                    case BOOST_INTERVAL:
                    case SHOOT_INTERVAL:
                    case RELOAD_TIME:
                        {
                        alt23=5;
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:241:2: ^( ALLOCATION_KW i= IDENT (t= valAggregation[st] )? )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet688); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet692); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:241:28: (t= valAggregation[st] )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AGGREGATION_KW) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:241:28: t= valAggregation[st]
                            {
                            pushFollow(FOLLOW_valAggregation_in_affectationObjet696);
                            t=valAggregation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    c.add(new Pair(i.getText(),t));

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:243:4: ^( ALLOCATION_KW a= attribut[st] ta= typeAllocation[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet716); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attribut_in_affectationObjet720);
                    a=attribut(st);

                    state._fsp--;

                    pushFollow(FOLLOW_typeAllocation_in_affectationObjet725);
                    ta=typeAllocation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		if(!a.getSecond().equals(ta.getFirst())) {
                    		    System.out.println("Erreur : Erreur de type");
                    		    System.exit(-1);
                    		}

                    		try {
                    		    Attributes attr = ta.getFirst().getConstructor(Code.class).newInstance(ta.getSecond());
                    		    c.add(new Pair(a.getFirst(), attr));
                    		} catch(Exception e) {
                    		    System.out.println("Erreur Critique !!!");
                    		    System.exit(-1);
                    		}
                    	    

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:258:4: ^( ALLOCATION_KW tc= typeCoordonnees[st] coo= coordinates[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet749); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_affectationObjet753);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_affectationObjet758);
                    coo=coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    String mode = tc.getCode();
                            if(mode.equals("position")){
                                    c.add(new Pair("posX", new AttributeNum(coo.x)));
                                    c.add(new Pair("posY", new AttributeNum(coo.y)));
                                    c.add(new Pair("posZ", new AttributeNum(coo.z)));
                                }else if(mode.equals("angle")){
                                    c.add(new Pair("orX", new AttributeNum(coo.x)));
                                    c.add(new Pair("orY", new AttributeNum(coo.y)));
                                    c.add(new Pair("orZ", new AttributeNum(coo.z)));
                                }else{
                                    c.add(new Pair("tX", new AttributeNum(coo.x)));
                                    c.add(new Pair("tY", new AttributeNum(coo.y)));
                                    c.add(new Pair("tZ", new AttributeNum(coo.z)));
                                }
                            

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:274:4: ^( ALLOCATION_KW attributListeOuObjet[st] IDENT )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet777); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributListeOuObjet_in_affectationObjet779);
                    attributListeOuObjet(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_affectationObjet782); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:275:4: ^( ALLOCATION_KW att= attributTps[st] v= operation[st] u= timeUnit[st] )
                    {
                    match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet790); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_affectationObjet794);
                    att=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_affectationObjet799);
                    v=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_affectationObjet804);
                    u=timeUnit(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c.add(new Pair(att,new AttributeTime(v.getCode(),u)));

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:279:1: typeAllocation[SymbolTable st] returns [Pair<Class<Attributes>, Code> p] : (co= operation[st] | i= IDENT | 'true' | 'false' );
    public final Pair<Class<Attributes>, Code> typeAllocation(SymbolTable st) throws RecognitionException {
        Pair<Class<Attributes>, Code> p = null;

        CommonTree i=null;
        Code co = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:279:74: (co= operation[st] | i= IDENT | 'true' | 'false' )
            int alt24=4;
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
                alt24=1;
                }
                break;
            case IDENT:
                {
                alt24=2;
                }
                break;
            case 251:
                {
                alt24=3;
                }
                break;
            case 252:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:280:2: co= operation[st]
                    {
                    pushFollow(FOLLOW_operation_in_typeAllocation843);
                    co=operation(st);

                    state._fsp--;

                    p = new Pair(AttributeNum.class,co);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:281:4: i= IDENT
                    {
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeAllocation853); 
                    p = new Pair(AttributeString.class,new Code(i.getText()));

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:282:4: 'true'
                    {
                    match(input,251,FOLLOW_251_in_typeAllocation860); 
                    p = new Pair(AttributeBoolean.class, new Code ("true"));

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:283:4: 'false'
                    {
                    match(input,252,FOLLOW_252_in_typeAllocation867); 
                    p = new Pair(AttributeBoolean.class, new Code ("false"));

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
    // $ANTLR end "typeAllocation"


    // $ANTLR start "valAggregation"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:286:1: valAggregation[SymbolTable st] returns [Attributes c] : ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) );
    public final Attributes valAggregation(SymbolTable st) throws RecognitionException {
        Attributes c = null;

        CommonTree i=null;
        Code o = null;

        String t = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:286:55: ( ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? ) | ^( AGGREGATION_KW i= IDENT ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==AGGREGATION_KW) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==DOWN) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==IDENT) ) {
                        alt26=2;
                    }
                    else if ( (LA26_2==GAME_SCORE_KW||LA26_2==VALUE_KW||(LA26_2>=VAR_I_KW && LA26_2<=VAR_A_KW)||LA26_2==FLOAT||LA26_2==RANDOM_KW||(LA26_2>=PLUS && LA26_2<=Z)) ) {
                        alt26=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:287:2: ^( AGGREGATION_KW o= operation[st] (t= timeUnit[st] )? )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation887); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_valAggregation891);
                    o=operation(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:287:36: (t= timeUnit[st] )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=MIN && LA25_0<=FRAME)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:287:36: t= timeUnit[st]
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation896);
                            t=timeUnit(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    if(t!=null){
                                c= new AttributeTime(o.getCode(),t);
                            }else{
                                    c=new AttributeNum(o);
                                }
                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:294:3: ^( AGGREGATION_KW i= IDENT )
                    {
                    match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation914); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_valAggregation918); 

                    match(input, Token.UP, null); 
                    c = new AttributeString(i.getText());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:299:1: definition[SymbolTable st] returns [Code c] : ^( DEFINITION_KW i= IDENT consequences[st] ) ;
    public final Code definition(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:299:45: ( ^( DEFINITION_KW i= IDENT consequences[st] ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:300:2: ^( DEFINITION_KW i= IDENT consequences[st] )
            {
            match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition951); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definition955); 
            pushFollow(FOLLOW_consequences_in_definition957);
            consequences(st);

            state._fsp--;


            match(input, Token.UP, null); 
            String ident = i.getText();
            	if(st.get(ident)!=null){System.out.println("l'ident "+ ident + " est deja defini");System.exit(-1);}

            }

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:305:1: consequences[SymbolTable st] returns [Code c] : ^( CONSEQUENCES_KW consequ_list[st] ) ;
    public final Code consequences(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:305:47: ( ^( CONSEQUENCES_KW consequ_list[st] ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:306:2: ^( CONSEQUENCES_KW consequ_list[st] )
            {
            match(input,CONSEQUENCES_KW,FOLLOW_CONSEQUENCES_KW_in_consequences980); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_consequ_list_in_consequences982);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:310:1: consequ_list[SymbolTable st] returns [Code c] : ( consequ[st] )+ ;
    public final Code consequ_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:310:47: ( ( consequ[st] )+ )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:311:3: ( consequ[st] )+
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:311:3: ( consequ[st] )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ACCESS_KW||LA27_0==IDENT||(LA27_0>=VICTORY_KW && LA27_0<=MUTE_KW)||(LA27_0>=PLAY_KW && LA27_0<=WAIT_KW)||LA27_0==SAVE_KW||(LA27_0>=ACTIVATE_KW && LA27_0<=DISABLE_KW)||LA27_0==IF_KW||(LA27_0>=ASSIGN_KW && LA27_0<=INVERT_KW)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:311:3: consequ[st]
            	    {
            	    pushFollow(FOLLOW_consequ_in_consequ_list1004);
            	    consequ(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:314:1: consequ[SymbolTable st] returns [Code c] : (i= siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW );
    public final Code consequ(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code i = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:314:42: (i= siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW )
            int alt28=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt28=1;
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
                alt28=2;
                }
                break;
            case ASSIGN_KW:
            case ADD_KW:
            case SUB_KW:
            case INVERT_KW:
                {
                alt28=3;
                }
                break;
            case ACTIVATE_KW:
            case DISABLE_KW:
                {
                alt28=4;
                }
                break;
            case IDENT:
                {
                alt28=5;
                }
                break;
            case VICTORY_KW:
                {
                alt28=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt28=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:315:3: i= siAlors[st]
                    {
                    pushFollow(FOLLOW_siAlors_in_consequ1029);
                    i=siAlors(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:316:5: action[st]
                    {
                    pushFollow(FOLLOW_action_in_consequ1037);
                    action(st);

                    state._fsp--;



                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:317:5: affectation[st]
                    {
                    pushFollow(FOLLOW_affectation_in_consequ1046);
                    affectation(st);

                    state._fsp--;



                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:318:5: activCommande[st]
                    {
                    pushFollow(FOLLOW_activCommande_in_consequ1055);
                    activCommande(st);

                    state._fsp--;



                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:319:5: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_consequ1064); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:320:5: VICTORY_KW
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1070); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:321:5: DEFEAT_KW
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1076); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:324:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );
    public final Code action(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:324:41: ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW )
            int alt31=14;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:325:2: accesClass[st] actionObjet[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_action1093);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionObjet_in_action1096);
                    actionObjet(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:326:3: ^( ENDS_KW IDENT )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1102); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1104); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:327:3: ^( ENDS_KW GAME )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1111); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1113); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:328:3: ^( STARTS_KW IDENT )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1120); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1122); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:329:3: ^( STARTS_KW GAME )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1128); 

                    match(input, Token.DOWN, null); 
                    match(input,GAME,FOLLOW_GAME_in_action1130); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:330:3: ^( PAUSE_KW IDENT )
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1136); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1138); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:331:3: ^( MUTE_KW mode_mute[st] IDENT )
                    {
                    match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1144); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mode_mute_in_action1146);
                    mode_mute(st);

                    state._fsp--;

                    match(input,IDENT,FOLLOW_IDENT_in_action1149); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:332:3: ^( PLAY_KW IDENT )
                    {
                    match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1155); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1157); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:333:3: ^( STOP_KW IDENT )
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_action1163); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_action1165); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:334:3: ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] )
                    {
                    match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1171); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_transformation_in_action1173);
                    transformation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_action1176);
                    accesClass(st);

                    state._fsp--;

                    pushFollow(FOLLOW_coordinates_in_action1179);
                    coordinates(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:335:3: ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1186); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1188);
                    typeAcces(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:335:29: ( typeDestination[st] )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==COORDINATE_KW||LA29_0==ACCESS_KW) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:335:29: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1191);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:336:3: ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1199); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeAcces_in_action1201);
                    typeAcces(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:336:31: ( typeDestination[st] )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==COORDINATE_KW||LA30_0==ACCESS_KW) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:336:31: typeDestination[st]
                            {
                            pushFollow(FOLLOW_typeDestination_in_action1204);
                            typeDestination(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:337:3: ^( WAIT_KW operation[st] timeUnit[st] consequences[st] )
                    {
                    match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1212); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_action1214);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_action1217);
                    timeUnit(st);

                    state._fsp--;

                    pushFollow(FOLLOW_consequences_in_action1220);
                    consequences(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:338:3: SAVE_KW
                    {
                    match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1226); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:341:1: typeAcces[SymbolTable st] returns [Code c] : ( accesClass[st] | operation[st] ( IDENT | accesClass[st] ) );
    public final Code typeAcces(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:341:44: ( accesClass[st] | operation[st] ( IDENT | accesClass[st] ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ACCESS_KW) ) {
                alt33=1;
            }
            else if ( (LA33_0==GAME_SCORE_KW||LA33_0==VALUE_KW||(LA33_0>=VAR_I_KW && LA33_0<=VAR_A_KW)||LA33_0==FLOAT||LA33_0==RANDOM_KW||(LA33_0>=PLUS && LA33_0<=Z)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:342:2: accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeAcces1242);
                    accesClass(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:342:19: operation[st] ( IDENT | accesClass[st] )
                    {
                    pushFollow(FOLLOW_operation_in_typeAcces1247);
                    operation(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:342:33: ( IDENT | accesClass[st] )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENT) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==ACCESS_KW) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:342:34: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_typeAcces1251); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:342:42: accesClass[st]
                            {
                            pushFollow(FOLLOW_accesClass_in_typeAcces1255);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:344:1: typeDestination[SymbolTable st] returns [Code c] : ( accesClass[st] | coordinates[st] );
    public final Code typeDestination(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:344:50: ( accesClass[st] | coordinates[st] )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ACCESS_KW) ) {
                alt34=1;
            }
            else if ( (LA34_0==COORDINATE_KW) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:345:2: accesClass[st]
                    {
                    pushFollow(FOLLOW_accesClass_in_typeDestination1272);
                    accesClass(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:345:19: coordinates[st]
                    {
                    pushFollow(FOLLOW_coordinates_in_typeDestination1277);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:347:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );
    public final Code actionObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:347:46: ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) )
            int alt35=7;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:348:3: DIES_KW
                    {
                    match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1293); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:349:5: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1299);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:350:4: ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] )
                    {
                    match(input,DURING,FOLLOW_DURING_in_actionObjet1306); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1308);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_actionObjet1311);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_timeUnit_in_actionObjet1314);
                    timeUnit(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:351:4: ^( UNTIL actionCommandeMaintenue[st] conditions[st] )
                    {
                    match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1322); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1324);
                    actionCommandeMaintenue(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_actionObjet1327);
                    conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:352:4: ^( EQUIP accesClass[st] )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1335); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_actionObjet1337);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:353:4: ^( EQUIP NEXT )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1345); 

                    match(input, Token.DOWN, null); 
                    match(input,NEXT,FOLLOW_NEXT_in_actionObjet1347); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:354:4: ^( EQUIP PREVIOUS )
                    {
                    match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1355); 

                    match(input, Token.DOWN, null); 
                    match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1357); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:357:1: transformation[SymbolTable st] returns [Code c] : ( TRANSLATION | ROTATION | SCALE );
    public final Code transformation(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:357:49: ( TRANSLATION | ROTATION | SCALE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:363:1: coordinates[SymbolTable st] returns [Coordonnees coo] : ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) ;
    public final Coordonnees coordinates(SymbolTable st) throws RecognitionException {
        Coordonnees coo = null;

        Code x = null;

        Code y = null;

        Code z = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:363:55: ( ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:364:2: ^( COORDINATE_KW x= operation[st] y= operation[st] z= operation[st] )
            {
            match(input,COORDINATE_KW,FOLLOW_COORDINATE_KW_in_coordinates1408); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_operation_in_coordinates1412);
            x=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates1417);
            y=operation(st);

            state._fsp--;

            pushFollow(FOLLOW_operation_in_coordinates1422);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:370:1: commande[SymbolTable st] returns [Code c] : ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) ;
    public final Code commande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:370:43: ( ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:371:2: ^( COMMAND_KW ( IDENT )? actionCommande_list[st] )
            {
            match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1454); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:371:15: ( IDENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==IDENT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:371:15: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_commande1456); 

                    }
                    break;

            }

            pushFollow(FOLLOW_actionCommande_list_in_commande1459);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:374:1: actionCommande_list[SymbolTable st] returns [Code c] : ( actionCommande[st] )+ ;
    public final Code actionCommande_list(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:374:53: ( ( actionCommande[st] )+ )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:375:2: ( actionCommande[st] )+
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:375:2: ( actionCommande[st] )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=KEY_KW && LA37_0<=MOUSE_KW)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:375:2: actionCommande[st]
            	    {
            	    pushFollow(FOLLOW_actionCommande_in_actionCommande_list1477);
            	    actionCommande(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:378:1: actionCommande[SymbolTable st] returns [Code c] : ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) );
    public final Code actionCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:378:49: ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==MOUSE_KW) ) {
                alt38=1;
            }
            else if ( (LA38_0==KEY_KW) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:379:2: ^( MOUSE_KW souris[st] actionCommandeType[st] )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande1497); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_souris_in_actionCommande1499);
                    souris(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1502);
                    actionCommandeType(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:380:3: ^( KEY_KW clavier[st] actionCommandeType[st] )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande1510); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_clavier_in_actionCommande1512);
                    clavier(st);

                    state._fsp--;

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1515);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:383:1: actionCommandeType[SymbolTable st] returns [Code c] : ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] );
    public final Code actionCommandeType(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:383:53: ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] )
            int alt39=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt39=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt39=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:384:2: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1534); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:384:10: actionCommandePressee[st]
                    {
                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1538);
                    actionCommandePressee(st);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:384:38: actionCommandeMaintenue[st]
                    {
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1543);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:387:1: souris[SymbolTable st] returns [Code c] : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final Code souris(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:387:41: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:391:1: clavier[SymbolTable st] returns [Code c] : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final Code clavier(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:391:42: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:395:1: actionCommandePressee[SymbolTable st] returns [Code c] : ( JUMP operation[st] | PAUSE_KW | STOP_KW );
    public final Code actionCommandePressee(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:395:56: ( JUMP operation[st] | PAUSE_KW | STOP_KW )
            int alt40=3;
            switch ( input.LA(1) ) {
            case JUMP:
                {
                alt40=1;
                }
                break;
            case PAUSE_KW:
                {
                alt40=2;
                }
                break;
            case STOP_KW:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:396:3: JUMP operation[st]
                    {
                    match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1671); 
                    pushFollow(FOLLOW_operation_in_actionCommandePressee1673);
                    operation(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:397:5: PAUSE_KW
                    {
                    match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1680); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:398:5: STOP_KW
                    {
                    match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1686); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:401:1: actionCommandeMaintenue[SymbolTable st] returns [Code c] : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
    public final Code actionCommandeMaintenue(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:401:58: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:402:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1706); 
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:403:5: TURN ( LEFT | RIGHT )
                    {
                    match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1728); 
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:404:5: ACCELERATE
                    {
                    match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1742); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:405:5: BRAKE
                    {
                    match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1748); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:408:1: activCommande[SymbolTable st] returns [Code c] : ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) );
    public final Code activCommande(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:408:48: ( ^( ACTIVATE_KW typeCommand[st] ) | ^( DISABLE_KW typeCommand[st] ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ACTIVATE_KW) ) {
                alt42=1;
            }
            else if ( (LA42_0==DISABLE_KW) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:409:3: ^( ACTIVATE_KW typeCommand[st] )
                    {
                    match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1769); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande1771);
                    typeCommand(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:410:4: ^( DISABLE_KW typeCommand[st] )
                    {
                    match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1780); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCommand_in_activCommande1782);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:413:1: typeCommand[SymbolTable st] returns [Code c] : ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD );
    public final Code typeCommand(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:413:46: ( COMMANDS | ^( MOUSE_KW ( souris[st] )* ) | ^( KEY_KW ( clavier[st] )+ ) | KEYBOARD )
            int alt45=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt45=1;
                }
                break;
            case MOUSE_KW:
                {
                alt45=2;
                }
                break;
            case KEY_KW:
                {
                alt45=3;
                }
                break;
            case KEYBOARD:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:414:2: COMMANDS
                    {
                    match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand1800); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:415:4: ^( MOUSE_KW ( souris[st] )* )
                    {
                    match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_typeCommand1807); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:415:15: ( souris[st] )*
                        loop43:
                        do {
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( ((LA43_0>=WUP && LA43_0<=SCROLL_DOWN)) ) {
                                alt43=1;
                            }


                            switch (alt43) {
                        	case 1 :
                        	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:415:15: souris[st]
                        	    {
                        	    pushFollow(FOLLOW_souris_in_typeCommand1809);
                        	    souris(st);

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop43;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:416:4: ^( KEY_KW ( clavier[st] )+ )
                    {
                    match(input,KEY_KW,FOLLOW_KEY_KW_in_typeCommand1818); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:416:13: ( clavier[st] )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=WUP && LA44_0<=RIGHT)||(LA44_0>=LETTER && LA44_0<=ENTER)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:416:13: clavier[st]
                    	    {
                    	    pushFollow(FOLLOW_clavier_in_typeCommand1820);
                    	    clavier(st);

                    	    state._fsp--;


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


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:417:4: KEYBOARD
                    {
                    match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand1828); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:419:1: reglesJeu[SymbolTable st] returns [Code c] : ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) ;
    public final Code reglesJeu(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:419:44: ( ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:420:3: ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] )
            {
            match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1846); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:420:13: ( IDENT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IDENT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:420:13: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1848); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu1851);
            declencheur(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_reglesJeu1854);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:423:1: declencheur[SymbolTable st] returns [Code c] : ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW );
    public final Code declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:423:46: ( accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW )
            int alt48=7;
            switch ( input.LA(1) ) {
            case ACCESS_KW:
                {
                alt48=1;
                }
                break;
            case ENDS_KW:
                {
                alt48=2;
                }
                break;
            case STARTS_KW:
                {
                alt48=3;
                }
                break;
            case BECOMES_VAR_KW:
                {
                alt48=4;
                }
                break;
            case BECOMES_ID_KW:
                {
                alt48=5;
                }
                break;
            case VICTORY_KW:
                {
                alt48=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt48=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:424:3: accesClass[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    {
                    pushFollow(FOLLOW_accesClass_in_declencheur1875);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:424:18: ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    int alt47=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt47=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt47=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                        {
                        alt47=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
                        {
                        alt47=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:424:19: MOVES_KW
                            {
                            match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1879); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:424:30: DIES_KW
                            {
                            match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1883); 

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:424:40: declencheurTK[st]
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1887);
                            declencheurTK(st);

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:424:60: declencheurKT[st]
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1892);
                            declencheurKT(st);

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:425:4: ^( ENDS_KW type_declencheur[st] )
                    {
                    match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1900); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1902);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:426:4: ^( STARTS_KW type_declencheur[st] )
                    {
                    match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1910); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1912);
                    type_declencheur(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:427:4: ^( BECOMES_VAR_KW variable[st] varOuNB[st] )
                    {
                    match(input,BECOMES_VAR_KW,FOLLOW_BECOMES_VAR_KW_in_declencheur1930); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_declencheur1932);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_varOuNB_in_declencheur1935);
                    varOuNB(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:428:4: ^( BECOMES_ID_KW IDENT playerOuInteraction[st] )
                    {
                    match(input,BECOMES_ID_KW,FOLLOW_BECOMES_ID_KW_in_declencheur1943); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_declencheur1945); 
                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1947);
                    playerOuInteraction(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:429:4: VICTORY_KW
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur1954); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:430:4: DEFEAT_KW
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur1960); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:433:1: type_declencheur[SymbolTable st] returns [Code c] : ( IDENT | GAME );
    public final Code type_declencheur(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:433:51: ( IDENT | GAME )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:436:1: varOuNB[SymbolTable st] returns [Code c] : ( variable[st] | FLOAT );
    public final Code varOuNB(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:436:42: ( variable[st] | FLOAT )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==GAME_SCORE_KW||LA49_0==VALUE_KW||(LA49_0>=VAR_I_KW && LA49_0<=VAR_A_KW)||(LA49_0>=X && LA49_0<=Z)) ) {
                alt49=1;
            }
            else if ( (LA49_0==FLOAT) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:436:44: variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_varOuNB1996);
                    variable(st);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:436:59: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2001); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:438:1: playerOuInteraction[SymbolTable st] returns [Code c] : ( PLAYER | interaction ) ;
    public final Code playerOuInteraction(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:439:2: ( ( PLAYER | interaction ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:439:4: ( PLAYER | interaction )
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:439:4: ( PLAYER | interaction )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==PLAYER) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=ALLY && LA50_0<=NEUTRAL)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:439:5: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction2017); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:439:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction2020);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:441:1: declencheurTK[SymbolTable st] returns [Code c] : ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurTK(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:442:2: ( ^( TOUCHES_KW ( OTHER )? accesClass[st] ) | ^( KILLS_KW ( OTHER )? accesClass[st] ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==TOUCHES_KW) ) {
                alt53=1;
            }
            else if ( (LA53_0==KILLS_KW) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:442:4: ^( TOUCHES_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2037); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:442:17: ( OTHER )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==OTHER) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:442:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2040); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2044);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:443:4: ^( KILLS_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2052); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:443:15: ( OTHER )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==OTHER) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:443:16: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2055); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurTK2059);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:447:1: declencheurKT[SymbolTable st] returns [Code c] : ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) );
    public final Code declencheurKT(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:448:2: ( ^( KILLED_KW ( OTHER )? accesClass[st] ) | ^( TOUCHED_KW ( OTHER )? accesClass[st] ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==KILLED_KW) ) {
                alt56=1;
            }
            else if ( (LA56_0==TOUCHED_KW) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:448:4: ^( KILLED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2081); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:448:16: ( OTHER )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==OTHER) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:448:17: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2084); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2088);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:449:4: ^( TOUCHED_KW ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2096); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:449:17: ( OTHER )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==OTHER) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:449:18: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2099); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_declencheurKT2103);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:452:1: siAlors[SymbolTable st] returns [Code c] : ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? ) ;
    public final Code siAlors(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code cond = null;

        Code r1 = null;

        Code r2 = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:452:42: ( ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:453:3: ^( IF_KW cond= conditions[st] r1= consequences[st] (r2= consequences[st] )? )
            {
            match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2126); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_conditions_in_siAlors2130);
            cond=conditions(st);

            state._fsp--;

            pushFollow(FOLLOW_consequences_in_siAlors2135);
            r1=consequences(st);

            state._fsp--;

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:453:53: (r2= consequences[st] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==CONSEQUENCES_KW) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:453:53: r2= consequences[st]
                    {
                    pushFollow(FOLLOW_consequences_in_siAlors2140);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:457:1: conditions[SymbolTable st] returns [Code c] : ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] );
    public final Code conditions(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree not=null;
        Code cond = null;

        Code cond1 = null;

        Code cond2 = null;


        not=null;
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:458:21: ( ^( CONDITION_KW (not= NOT )? cond= conditions[st] ) | ^( OR cond1= conditions[st] cond2= conditions[st] ) | ^( AND cond1= conditions[st] cond2= conditions[st] ) | ^( EQUALS cond1= operation[st] cond2= operation[st] ) | ^( INF cond1= operation[st] cond2= operation[st] ) | ^( SUP cond1= operation[st] cond2= operation[st] ) | ^( INFEG cond1= operation[st] cond2= operation[st] ) | ^( SUPED cond1= operation[st] cond2= operation[st] ) | ^( DIFF cond1= operation[st] cond2= operation[st] ) | etat[st] )
            int alt59=10;
            switch ( input.LA(1) ) {
            case CONDITION_KW:
                {
                alt59=1;
                }
                break;
            case OR:
                {
                alt59=2;
                }
                break;
            case AND:
                {
                alt59=3;
                }
                break;
            case EQUALS:
                {
                alt59=4;
                }
                break;
            case INF:
                {
                alt59=5;
                }
                break;
            case SUP:
                {
                alt59=6;
                }
                break;
            case INFEG:
                {
                alt59=7;
                }
                break;
            case SUPED:
                {
                alt59=8;
                }
                break;
            case DIFF:
                {
                alt59=9;
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
                alt59=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:459:3: ^( CONDITION_KW (not= NOT )? cond= conditions[st] )
                    {
                    match(input,CONDITION_KW,FOLLOW_CONDITION_KW_in_conditions2174); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:459:18: (not= NOT )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==NOT) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:459:19: not= NOT
                            {
                            not=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions2179); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditions_in_conditions2185);
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:467:4: ^( OR cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,OR,FOLLOW_OR_in_conditions2199); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions2203);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions2208);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genOr(cond1,cond2);
                        

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:471:4: ^( AND cond1= conditions[st] cond2= conditions[st] )
                    {
                    match(input,AND,FOLLOW_AND_in_conditions2222); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_conditions_in_conditions2226);
                    cond1=conditions(st);

                    state._fsp--;

                    pushFollow(FOLLOW_conditions_in_conditions2231);
                    cond2=conditions(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genAnd(cond1,cond2);
                        

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:475:4: ^( EQUALS cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_conditions2245); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2249);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2254);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genEquals(cond1,cond2);
                        

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:479:4: ^( INF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INF,FOLLOW_INF_in_conditions2268); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2272);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2277);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInf(cond1,cond2);
                        

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:483:4: ^( SUP cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUP,FOLLOW_SUP_in_conditions2291); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2295);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2300);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSup(cond1,cond2);
                        

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:487:4: ^( INFEG cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,INFEG,FOLLOW_INFEG_in_conditions2314); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2318);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2323);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genInfEg(cond1,cond2);
                        

                    }
                    break;
                case 8 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:491:4: ^( SUPED cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,SUPED,FOLLOW_SUPED_in_conditions2337); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2341);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2346);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genSupEg(cond1,cond2);
                        

                    }
                    break;
                case 9 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:495:4: ^( DIFF cond1= operation[st] cond2= operation[st] )
                    {
                    match(input,DIFF,FOLLOW_DIFF_in_conditions2360); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_conditions2364);
                    cond1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_conditions2369);
                    cond2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                            c = Code.genDiff(cond1,cond2);
                        

                    }
                    break;
                case 10 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:499:5: etat[st]
                    {
                    pushFollow(FOLLOW_etat_in_conditions2383);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:502:1: etat[SymbolTable st] returns [Code c] : ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW );
    public final Code etat(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:502:39: ( ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW )
            int alt80=15;
            switch ( input.LA(1) ) {
            case DEAD_KW:
                {
                alt80=1;
                }
                break;
            case ALIVE_KW:
                {
                alt80=2;
                }
                break;
            case EFFACED_KW:
                {
                alt80=3;
                }
                break;
            case GENERATED_KW:
                {
                alt80=4;
                }
                break;
            case TOUCHING_KW:
                {
                alt80=5;
                }
                break;
            case MOVING_KW:
                {
                alt80=6;
                }
                break;
            case WAITING_KW:
                {
                alt80=7;
                }
                break;
            case FINISHED_KW:
                {
                alt80=8;
                }
                break;
            case STARTED_KW:
                {
                alt80=9;
                }
                break;
            case PAUSED_KW:
                {
                alt80=10;
                }
                break;
            case MUTED_KW:
                {
                alt80=11;
                }
                break;
            case PLAYED_KW:
                {
                alt80=12;
                }
                break;
            case STOPPED_KW:
                {
                alt80=13;
                }
                break;
            case VICTORY_KW:
                {
                alt80=14;
                }
                break;
            case DEFEAT_KW:
                {
                alt80=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:503:2: ^( DEAD_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2402); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2404);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:503:27: ( NOT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==NOT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:503:28: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2408); 

                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:503:34: ( OTHER )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==OTHER) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:503:35: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2413); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2417);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:504:4: ^( ALIVE_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2425); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2427);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:504:30: ( NOT )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==NOT) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:504:31: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2431); 

                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:504:37: ( OTHER )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==OTHER) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:504:38: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2436); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2440);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:505:4: ^( EFFACED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2448); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2450);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:505:32: ( NOT )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==NOT) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:505:33: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2454); 

                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:505:39: ( OTHER )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==OTHER) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:505:40: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2459); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2463);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:506:4: ^( GENERATED_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2471); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2473);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:506:34: ( NOT )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NOT) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:506:35: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2477); 

                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:506:41: ( OTHER )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==OTHER) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:506:42: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2482); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2486);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:507:4: ^( TOUCHING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2494); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2496);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:507:33: ( NOT )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==NOT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:507:34: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2500); 

                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:507:40: ( OTHER )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==OTHER) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:507:41: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2505); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2509);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:508:4: ^( MOVING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2517); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2519);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:508:31: ( NOT )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NOT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:508:32: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2523); 

                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:508:38: ( OTHER )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==OTHER) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:508:39: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2528); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2532);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:509:4: ^( WAITING_KW accesClass[st] ( NOT )? ( OTHER )? accesClass[st] )
                    {
                    match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2540); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_accesClass_in_etat2542);
                    accesClass(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:509:32: ( NOT )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NOT) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:509:33: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2546); 

                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:509:39: ( OTHER )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==OTHER) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:509:40: OTHER
                            {
                            match(input,OTHER,FOLLOW_OTHER_in_etat2551); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesClass_in_etat2555);
                    accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:510:4: ^( FINISHED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2563); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2565);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:510:39: ( NOT )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NOT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:510:40: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2569); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:511:4: ^( STARTED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2578); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2580);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:511:37: ( NOT )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==NOT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:511:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2583); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:512:4: ^( PAUSED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2592); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2594);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:512:36: ( NOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NOT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:512:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2597); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:513:4: ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] )
                    {
                    match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2606); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2608);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:513:36: ( NOT )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NOT) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:513:37: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2612); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mode_mute_in_etat2616);
                    mode_mute(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:514:4: ^( PLAYED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2624); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2626);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:514:37: ( NOT )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==NOT) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:514:38: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2630); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:515:4: ^( STOPPED_KW type_declencheur[st] ( NOT )? )
                    {
                    match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2639); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_declencheur_in_etat2641);
                    type_declencheur(st);

                    state._fsp--;

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:515:38: ( NOT )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==NOT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:515:39: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_etat2645); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:517:4: VICTORY_KW
                    {
                    match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2656); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:518:4: DEFEAT_KW
                    {
                    match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2661); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:521:1: mode_mute[SymbolTable st] returns [Code c] : ( ON | OFF );
    public final Code mode_mute(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:521:44: ( ON | OFF )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:524:1: affectation[SymbolTable st] returns [Code c] : ( ^( ASSIGN_KW i1= operation[st] i2= variable[st] ) | ^( ADD_KW operation[st] variable[st] ) | ^( SUB_KW operation[st] variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) );
    public final Code affectation(SymbolTable st) throws RecognitionException {
        Code c = null;

        Code i1 = null;

        Code i2 = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:524:46: ( ^( ASSIGN_KW i1= operation[st] i2= variable[st] ) | ^( ADD_KW operation[st] variable[st] ) | ^( SUB_KW operation[st] variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) )
            int alt81=4;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt81=1;
                }
                break;
            case ADD_KW:
                {
                alt81=2;
                }
                break;
            case SUB_KW:
                {
                alt81=3;
                }
                break;
            case INVERT_KW:
                {
                alt81=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:525:3: ^( ASSIGN_KW i1= operation[st] i2= variable[st] )
                    {
                    match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2700); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation2704);
                    i1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2709);
                    i2=variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    //verifier attribute = attributeNum
                    	/*if(i2.getSecond().getClass() != attributeNum.class){System.out.println("la variable "+ i2 + " n'est pas de type entier");System.exit(-1);}
                    	c = genAffect(i1,i2);*/

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:528:4: ^( ADD_KW operation[st] variable[st] )
                    {
                    match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2718); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation2720);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2723);
                    variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:529:4: ^( SUB_KW operation[st] variable[st] )
                    {
                    match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2732); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_affectation2734);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2737);
                    variable(st);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:530:4: ^( INVERT_KW variable[st] variable[st] )
                    {
                    match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2746); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variable_in_affectation2748);
                    variable(st);

                    state._fsp--;

                    pushFollow(FOLLOW_variable_in_affectation2751);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:533:1: iaBasique[SymbolTable st] returns [Code c] : ^( IA_KW accesClass[st] actionObjetList[st] ) ;
    public final Code iaBasique(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:533:44: ( ^( IA_KW accesClass[st] actionObjetList[st] ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:533:46: ^( IA_KW accesClass[st] actionObjetList[st] )
            {
            match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2772); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_accesClass_in_iaBasique2774);
            accesClass(st);

            state._fsp--;

            pushFollow(FOLLOW_actionObjetList_in_iaBasique2777);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:535:1: actionObjetList[SymbolTable st] returns [Code c] : ( actionObjet[st] )+ ;
    public final Code actionObjetList(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:535:50: ( ( actionObjet[st] )+ )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:535:52: ( actionObjet[st] )+
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:535:52: ( actionObjet[st] )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==PAUSE_KW||LA82_0==STOP_KW||(LA82_0>=DIES_KW && LA82_0<=EQUIP)||LA82_0==JUMP) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:535:52: actionObjet[st]
            	    {
            	    pushFollow(FOLLOW_actionObjet_in_actionObjetList2792);
            	    actionObjet(st);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:542:1: operation[SymbolTable st] returns [Code c] : ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | variable[st] | f= FLOAT );
    public final Code operation(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree f=null;
        Code c1 = null;

        Code c2 = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:542:44: ( ^( RANDOM_KW c1= operation[st] c2= operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | variable[st] | f= FLOAT )
            int alt83=9;
            switch ( input.LA(1) ) {
            case RANDOM_KW:
                {
                alt83=1;
                }
                break;
            case PLUS:
                {
                alt83=2;
                }
                break;
            case MINUS:
                {
                alt83=3;
                }
                break;
            case MUL:
                {
                alt83=4;
                }
                break;
            case DIV:
                {
                alt83=5;
                }
                break;
            case MOD:
                {
                alt83=6;
                }
                break;
            case POW:
                {
                alt83=7;
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
                alt83=8;
                }
                break;
            case FLOAT:
                {
                alt83=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:543:2: ^( RANDOM_KW c1= operation[st] c2= operation[st] )
                    {
                    match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2817); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2822);
                    c1=operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2828);
                    c2=operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genRD(c1,c2);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:545:3: ^( PLUS operation[st] operation[st] )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_operation2846); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2848);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2851);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPLUS(c1,c2);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:547:3: ^( MINUS operation[st] operation[st] )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_operation2868); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2870);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2873);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMINUS(c1,c2);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:549:3: ^( MUL operation[st] operation[st] )
                    {
                    match(input,MUL,FOLLOW_MUL_in_operation2890); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2892);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2895);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMUL(c1,c2);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:551:3: ^( DIV operation[st] operation[st] )
                    {
                    match(input,DIV,FOLLOW_DIV_in_operation2912); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2914);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2917);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genDIV(c1,c2);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:553:3: ^( MOD operation[st] operation[st] )
                    {
                    match(input,MOD,FOLLOW_MOD_in_operation2934); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2936);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2939);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genMOD(c1,c2);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:555:3: ^( POW operation[st] operation[st] )
                    {
                    match(input,POW,FOLLOW_POW_in_operation2956); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operation_in_operation2958);
                    operation(st);

                    state._fsp--;

                    pushFollow(FOLLOW_operation_in_operation2961);
                    operation(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    c=Code.genPOW(c1,c2);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:557:3: variable[st]
                    {
                    pushFollow(FOLLOW_variable_in_operation2977);
                    variable(st);

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:558:3: f= FLOAT
                    {
                    f=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_operation2986); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:563:1: variable[SymbolTable st] returns [Code c] : ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | ^( VAR_A_KW att= attribut[st] en= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) );
    public final Code variable(SymbolTable st) throws RecognitionException {
        Code c = null;

        CommonTree i=null;
        Code tc = null;

        ArrayList<Symbol> sb = null;

        ArrayList<Symbol> e = null;

        Pair<String,Class<Attributes>> att = null;

        ArrayList<Symbol> en = null;

        String at = null;

        ArrayList<Symbol> ac = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:563:43: ( ^( X tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Y tc= typeCoordonnees[st] sb= accesClass[st] ) | ^( Z typeCoordonnees[st] sb= accesClass[st] ) | ^( VAR_I_KW i= IDENT e= accesClass[st] ) | ^( VAR_A_KW att= attribut[st] en= accesClass[st] ) | GAME_SCORE_KW | ^( VALUE_KW at= attributTps[st] ac= accesClass[st] ) )
            int alt84=7;
            switch ( input.LA(1) ) {
            case X:
                {
                alt84=1;
                }
                break;
            case Y:
                {
                alt84=2;
                }
                break;
            case Z:
                {
                alt84=3;
                }
                break;
            case VAR_I_KW:
                {
                alt84=4;
                }
                break;
            case VAR_A_KW:
                {
                alt84=5;
                }
                break;
            case GAME_SCORE_KW:
                {
                alt84=6;
                }
                break;
            case VALUE_KW:
                {
                alt84=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:564:3: ^( X tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,X,FOLLOW_X_in_variable3023); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3027);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3032);
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:575:4: ^( Y tc= typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Y,FOLLOW_Y_in_variable3044); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3049);
                    tc=typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3054);
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:586:4: ^( Z typeCoordonnees[st] sb= accesClass[st] )
                    {
                    match(input,Z,FOLLOW_Z_in_variable3066); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3068);
                    typeCoordonnees(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3073);
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:596:4: ^( VAR_I_KW i= IDENT e= accesClass[st] )
                    {
                    match(input,VAR_I_KW,FOLLOW_VAR_I_KW_in_variable3087); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variable3091); 
                    pushFollow(FOLLOW_accesClass_in_variable3095);
                    e=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    Symbol si = e.get(0);String ident= i.getText(); Attributes a = si.getAttribute(ident);
                        if(a==null){
                            System.out.println(si.getName()+"n'a pas l'attribut"+ident);
                            System.exit(-1);}
                        else if(a.getClass()!= AttributeNum.class){
                            System.out.println(ident+"n'est pas un nombre.");
                            System.exit(-1);
                       }else{
                            c=Code.genAccess(si.getName(),ident);
                        }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:607:4: ^( VAR_A_KW att= attribut[st] en= accesClass[st] )
                    {
                    match(input,VAR_A_KW,FOLLOW_VAR_A_KW_in_variable3107); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attribut_in_variable3111);
                    att=attribut(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3116);
                    en=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    Symbol si = en.get(0); Attributes a = si.getAttribute(att.getFirst());
                        if(a==null){
                            System.out.println(si.getName()+"n'a pas l'attribut"+att.getFirst());
                            System.exit(-1);}
                        else if(a.getClass()!= AttributeNum.class){
                            System.out.println(att.getFirst()+"n'est pas un nombre.");
                            System.exit(-1);
                       }else{
                            c=Code.genAccess(si.getName(),att.getFirst());
                        }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:618:4: GAME_SCORE_KW
                    {
                    match(input,GAME_SCORE_KW,FOLLOW_GAME_SCORE_KW_in_variable3127); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:619:4: ^( VALUE_KW at= attributTps[st] ac= accesClass[st] )
                    {
                    match(input,VALUE_KW,FOLLOW_VALUE_KW_in_variable3133); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attributTps_in_variable3137);
                    at=attributTps(st);

                    state._fsp--;

                    pushFollow(FOLLOW_accesClass_in_variable3142);
                    ac=accesClass(st);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    Symbol si = ac.get(0); Attributes a = si.getAttribute(at);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:629:1: accesClass[SymbolTable st] returns [ArrayList<Symbol> sb] : ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW mo= typeObjet ) | ^( ACCESS_KW val= interaction ) | ^( ACCESS_KW NOT notAccess[st] ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) );
    public final ArrayList<Symbol> accesClass(SymbolTable st) throws RecognitionException {
        ArrayList<Symbol> sb = null;

        CommonTree i=null;
        Model mo = null;

        Integer val = null;

        Code co = null;


        sb = new ArrayList();
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:629:88: ( ^( ACCESS_KW ALL ) | ^( ACCESS_KW mo= typeObjet ) | ^( ACCESS_KW val= interaction ) | ^( ACCESS_KW NOT notAccess[st] ) | ^( ACCESS_KW i= IDENT (co= operation[st] )? ) | ^( ACCESS_KW PLAYER ) )
            int alt86=6;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==ACCESS_KW) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ALL:
                        {
                        alt86=1;
                        }
                        break;
                    case NOT:
                        {
                        alt86=4;
                        }
                        break;
                    case IDENT:
                        {
                        alt86=5;
                        }
                        break;
                    case PLAYER:
                        {
                        alt86=6;
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
                        alt86=2;
                        }
                        break;
                    case ALLY:
                    case ENEMY:
                    case NEUTRAL:
                        {
                        alt86=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:630:5: ^( ACCESS_KW ALL )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3173); 

                    match(input, Token.DOWN, null); 
                    match(input,ALL,FOLLOW_ALL_in_accesClass3175); 

                    match(input, Token.UP, null); 
                    sb.add(Genre.player);sb.addAll(Genre.allies);sb.addAll(Genre.enemies);sb.addAll(Genre.neutral);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:632:5: ^( ACCESS_KW mo= typeObjet )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3189); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_typeObjet_in_accesClass3193);
                    mo=typeObjet();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    sb.add(mo);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:634:5: ^( ACCESS_KW val= interaction )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3207); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_interaction_in_accesClass3211);
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:643:5: ^( ACCESS_KW NOT notAccess[st] )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3225); 

                    match(input, Token.DOWN, null); 
                    match(input,NOT,FOLLOW_NOT_in_accesClass3227); 
                    pushFollow(FOLLOW_notAccess_in_accesClass3229);
                    notAccess(st);

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:645:5: ^( ACCESS_KW i= IDENT (co= operation[st] )? )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3244); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesClass3248); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:645:27: (co= operation[st] )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==GAME_SCORE_KW||LA85_0==VALUE_KW||(LA85_0>=VAR_I_KW && LA85_0<=VAR_A_KW)||LA85_0==FLOAT||LA85_0==RANDOM_KW||(LA85_0>=PLUS && LA85_0<=Z)) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:645:27: co= operation[st]
                            {
                            pushFollow(FOLLOW_operation_in_accesClass3252);
                            co=operation(st);

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    String ident = i.getText(); Symbol s = st.get(ident);
                        if(s==null){
                            System.out.println("L'identifiant"+ident+"n'est pas défini.");
                            System.exit(-1);
                        }else{
                            sb.add(s);
                        }
                        

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:654:5: ^( ACCESS_KW PLAYER )
                    {
                    match(input,ACCESS_KW,FOLLOW_ACCESS_KW_in_accesClass3269); 

                    match(input, Token.DOWN, null); 
                    match(input,PLAYER,FOLLOW_PLAYER_in_accesClass3271); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:658:1: notAccess[SymbolTable st] returns [Code c] : ( typeObjet | interaction | PLAYER );
    public final Code notAccess(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:658:45: ( typeObjet | interaction | PLAYER )
            int alt87=3;
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
                alt87=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
                {
                alt87=2;
                }
                break;
            case PLAYER:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:659:1: typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_notAccess3295);
                    typeObjet();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:659:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_notAccess3299);
                    interaction();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:659:27: PLAYER
                    {
                    match(input,PLAYER,FOLLOW_PLAYER_in_notAccess3303); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:661:1: typeCoordonnees[SymbolTable st] returns [Code c] : ( POSITION | ORIENTATION | SIZE );
    public final Code typeCoordonnees(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:661:50: ( POSITION | ORIENTATION | SIZE )
            int alt88=3;
            switch ( input.LA(1) ) {
            case POSITION:
                {
                alt88=1;
                }
                break;
            case ORIENTATION:
                {
                alt88=2;
                }
                break;
            case SIZE:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:662:2: POSITION
                    {
                    match(input,POSITION,FOLLOW_POSITION_in_typeCoordonnees3319); 
                    c = new Code("position");

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:662:40: ORIENTATION
                    {
                    match(input,ORIENTATION,FOLLOW_ORIENTATION_in_typeCoordonnees3324); 
                    c = new Code("angle");

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:662:78: SIZE
                    {
                    match(input,SIZE,FOLLOW_SIZE_in_typeCoordonnees3329); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:665:1: timeUnit[SymbolTable st] returns [String c] : ( MIN | SEC | MS | FRAME );
    public final String timeUnit(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:665:45: ( MIN | SEC | MS | FRAME )
            int alt89=4;
            switch ( input.LA(1) ) {
            case MIN:
                {
                alt89=1;
                }
                break;
            case SEC:
                {
                alt89=2;
                }
                break;
            case MS:
                {
                alt89=3;
                }
                break;
            case FRAME:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:666:2: MIN
                    {
                    match(input,MIN,FOLLOW_MIN_in_timeUnit3347); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:667:4: SEC
                    {
                    match(input,SEC,FOLLOW_SEC_in_timeUnit3352); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:668:4: MS
                    {
                    match(input,MS,FOLLOW_MS_in_timeUnit3357); 
                    c = "ms";

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:670:4: FRAME
                    {
                    match(input,FRAME,FOLLOW_FRAME_in_timeUnit3372); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:674:1: typeObjet returns [Model t] : ( CAMERA | MEDIA | COUNTER | TIME | to= typeObjet3D );
    public final Model typeObjet() throws RecognitionException {
        Model t = null;

        Model to = null;


        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:674:28: ( CAMERA | MEDIA | COUNTER | TIME | to= typeObjet3D )
            int alt90=5;
            switch ( input.LA(1) ) {
            case CAMERA:
                {
                alt90=1;
                }
                break;
            case MEDIA:
                {
                alt90=2;
                }
                break;
            case COUNTER:
                {
                alt90=3;
                }
                break;
            case TIME:
                {
                alt90=4;
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
                alt90=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:675:2: CAMERA
                    {
                    match(input,CAMERA,FOLLOW_CAMERA_in_typeObjet3388); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:676:4: MEDIA
                    {
                    match(input,MEDIA,FOLLOW_MEDIA_in_typeObjet3393); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:677:4: COUNTER
                    {
                    match(input,COUNTER,FOLLOW_COUNTER_in_typeObjet3398); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:678:4: TIME
                    {
                    match(input,TIME,FOLLOW_TIME_in_typeObjet3403); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:679:4: to= typeObjet3D
                    {
                    pushFollow(FOLLOW_typeObjet3D_in_typeObjet3410);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:684:1: typeObjet3D returns [Model t] : ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER );
    public final Model typeObjet3D() throws RecognitionException {
        Model t = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:684:30: ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER )
            int alt91=18;
            switch ( input.LA(1) ) {
            case OBJECT:
                {
                alt91=1;
                }
                break;
            case CHARACTER:
                {
                alt91=2;
                }
                break;
            case VEHICLE:
                {
                alt91=3;
                }
                break;
            case PLANE:
                {
                alt91=4;
                }
                break;
            case SPACECRAFT:
                {
                alt91=5;
                }
                break;
            case OBSTACLE:
                {
                alt91=6;
                }
                break;
            case WEAPON:
                {
                alt91=7;
                }
                break;
            case SWORD:
                {
                alt91=8;
                }
                break;
            case PROJECTILE:
                {
                alt91=9;
                }
                break;
            case ZONE:
                {
                alt91=10;
                }
                break;
            case GROUND:
                {
                alt91=11;
                }
                break;
            case BONUS:
                {
                alt91=12;
                }
                break;
            case CHECKPOINT:
                {
                alt91=13;
                }
                break;
            case BREAKABLE:
                {
                alt91=14;
                }
                break;
            case CONSTRUCTION:
                {
                alt91=15;
                }
                break;
            case ROOM:
                {
                alt91=16;
                }
                break;
            case BALL:
                {
                alt91=17;
                }
                break;
            case TELEPORTER:
                {
                alt91=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:685:2: OBJECT
                    {
                    match(input,OBJECT,FOLLOW_OBJECT_in_typeObjet3D3430); 
                    t = Model.object;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:686:4: CHARACTER
                    {
                    match(input,CHARACTER,FOLLOW_CHARACTER_in_typeObjet3D3437); 
                    t = Model.character;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:687:4: VEHICLE
                    {
                    match(input,VEHICLE,FOLLOW_VEHICLE_in_typeObjet3D3444); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:688:4: PLANE
                    {
                    match(input,PLANE,FOLLOW_PLANE_in_typeObjet3D3468); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:688:12: SPACECRAFT
                    {
                    match(input,SPACECRAFT,FOLLOW_SPACECRAFT_in_typeObjet3D3472); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:689:4: OBSTACLE
                    {
                    match(input,OBSTACLE,FOLLOW_OBSTACLE_in_typeObjet3D3477); 
                    t = Model.obstacle;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:690:4: WEAPON
                    {
                    match(input,WEAPON,FOLLOW_WEAPON_in_typeObjet3D3484); 
                    t = Model.weapon;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:691:4: SWORD
                    {
                    match(input,SWORD,FOLLOW_SWORD_in_typeObjet3D3491); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:692:4: PROJECTILE
                    {
                    match(input,PROJECTILE,FOLLOW_PROJECTILE_in_typeObjet3D3517); 
                    t = Model.projectile;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:693:4: ZONE
                    {
                    match(input,ZONE,FOLLOW_ZONE_in_typeObjet3D3524); 
                    t = Model.zone;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:694:4: GROUND
                    {
                    match(input,GROUND,FOLLOW_GROUND_in_typeObjet3D3531); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:695:4: BONUS
                    {
                    match(input,BONUS,FOLLOW_BONUS_in_typeObjet3D3556); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:696:4: CHECKPOINT
                    {
                    match(input,CHECKPOINT,FOLLOW_CHECKPOINT_in_typeObjet3D3582); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:697:4: BREAKABLE
                    {
                    match(input,BREAKABLE,FOLLOW_BREAKABLE_in_typeObjet3D3587); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:698:4: CONSTRUCTION
                    {
                    match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_typeObjet3D3592); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:699:4: ROOM
                    {
                    match(input,ROOM,FOLLOW_ROOM_in_typeObjet3D3597); 

                    }
                    break;
                case 17 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:700:4: BALL
                    {
                    match(input,BALL,FOLLOW_BALL_in_typeObjet3D3602); 

                    }
                    break;
                case 18 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:701:4: TELEPORTER
                    {
                    match(input,TELEPORTER,FOLLOW_TELEPORTER_in_typeObjet3D3607); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:705:1: attribut[SymbolTable st] returns [Pair<String,Class<Attributes>> c] : ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA );
    public final Pair<String,Class<Attributes>> attribut(SymbolTable st) throws RecognitionException {
        Pair<String,Class<Attributes>> c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:705:69: ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA )
            int alt92=40;
            switch ( input.LA(1) ) {
            case MASS:
                {
                alt92=1;
                }
                break;
            case IS_FIX:
                {
                alt92=2;
                }
                break;
            case IS_TRAVERSABLE:
                {
                alt92=3;
                }
                break;
            case FOV:
                {
                alt92=4;
                }
                break;
            case TYPE:
                {
                alt92=5;
                }
                break;
            case ACTIVE:
                {
                alt92=6;
                }
                break;
            case NAME:
                {
                alt92=7;
                }
                break;
            case DESCRIPTION:
                {
                alt92=8;
                }
                break;
            case LIFE:
                {
                alt92=9;
                }
                break;
            case LIFE_MAX:
                {
                alt92=10;
                }
                break;
            case LIFE_MIN:
                {
                alt92=11;
                }
                break;
            case NB_LIVES:
                {
                alt92=12;
                }
                break;
            case MAGIC:
                {
                alt92=13;
                }
                break;
            case MAGIC_MAX:
                {
                alt92=14;
                }
                break;
            case MAGIC_MIN:
                {
                alt92=15;
                }
                break;
            case LEVEL:
                {
                alt92=16;
                }
                break;
            case ATTACK:
                {
                alt92=17;
                }
                break;
            case DEFENSE:
                {
                alt92=18;
                }
                break;
            case JUMP_FORCE:
                {
                alt92=19;
                }
                break;
            case JUMP_AIR_MAX:
                {
                alt92=20;
                }
                break;
            case MONEY:
                {
                alt92=21;
                }
                break;
            case CLASS:
                {
                alt92=22;
                }
                break;
            case RACE:
                {
                alt92=23;
                }
                break;
            case ACCELERATION:
                {
                alt92=24;
                }
                break;
            case SPEED:
                {
                alt92=25;
                }
                break;
            case SPEED_MAX:
                {
                alt92=26;
                }
                break;
            case SPEED_MIN:
                {
                alt92=27;
                }
                break;
            case BOOST:
                {
                alt92=28;
                }
                break;
            case BOOST_MAX:
                {
                alt92=29;
                }
                break;
            case NB_MUNITIONS:
                {
                alt92=30;
                }
                break;
            case NB_MUNITIONS_MAX:
                {
                alt92=31;
                }
                break;
            case SHOOT_POWER:
                {
                alt92=32;
                }
                break;
            case DAMAGES:
                {
                alt92=33;
                }
                break;
            case VALUE:
                {
                alt92=34;
                }
                break;
            case UNIT:
                {
                alt92=35;
                }
                break;
            case OBJECT_NAME:
                {
                alt92=36;
                }
                break;
            case ATTRIBUT_NAME:
                {
                alt92=37;
                }
                break;
            case VOLUME:
                {
                alt92=38;
                }
                break;
            case NUMBER:
                {
                alt92=39;
                }
                break;
            case MOVE_WITH_CAMERA:
                {
                alt92=40;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:706:2: MASS
                    {
                    match(input,MASS,FOLLOW_MASS_in_attribut3625); 
                    c =new Pair("mass", AttributeNum.class);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:707:4: IS_FIX
                    {
                    match(input,IS_FIX,FOLLOW_IS_FIX_in_attribut3649); 
                    c =new Pair("isFix", AttributeBoolean.class);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:708:4: IS_TRAVERSABLE
                    {
                    match(input,IS_TRAVERSABLE,FOLLOW_IS_TRAVERSABLE_in_attribut3656); 
                    c =new Pair("isTraversable", AttributeBoolean.class);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:709:4: FOV
                    {
                    match(input,FOV,FOLLOW_FOV_in_attribut3663); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:710:4: TYPE
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_attribut3669); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:711:4: ACTIVE
                    {
                    match(input,ACTIVE,FOLLOW_ACTIVE_in_attribut3675); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:712:4: NAME
                    {
                    match(input,NAME,FOLLOW_NAME_in_attribut3681); 
                    c =new Pair("name", AttributeString.class);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:713:4: DESCRIPTION
                    {
                    match(input,DESCRIPTION,FOLLOW_DESCRIPTION_in_attribut3707); 
                    c =new Pair("description", AttributeString.class);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:714:4: LIFE
                    {
                    match(input,LIFE,FOLLOW_LIFE_in_attribut3714); 
                    c =new Pair("life", AttributeNum.class);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:715:4: LIFE_MAX
                    {
                    match(input,LIFE_MAX,FOLLOW_LIFE_MAX_in_attribut3721); 
                    c =new Pair("lifeMax", AttributeNum.class);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:716:4: LIFE_MIN
                    {
                    match(input,LIFE_MIN,FOLLOW_LIFE_MIN_in_attribut3728); 
                    c =new Pair("lifeMin", AttributeNum.class);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:717:4: NB_LIVES
                    {
                    match(input,NB_LIVES,FOLLOW_NB_LIVES_in_attribut3735); 
                    c =new Pair("nbOfLives", AttributeNum.class);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:718:4: MAGIC
                    {
                    match(input,MAGIC,FOLLOW_MAGIC_in_attribut3742); 
                    c =new Pair("magic", AttributeNum.class);

                    }
                    break;
                case 14 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:719:4: MAGIC_MAX
                    {
                    match(input,MAGIC_MAX,FOLLOW_MAGIC_MAX_in_attribut3749); 
                    c =new Pair("magicMax", AttributeNum.class);

                    }
                    break;
                case 15 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:720:4: MAGIC_MIN
                    {
                    match(input,MAGIC_MIN,FOLLOW_MAGIC_MIN_in_attribut3756); 
                    c =new Pair("magicMin", AttributeNum.class);

                    }
                    break;
                case 16 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:721:4: LEVEL
                    {
                    match(input,LEVEL,FOLLOW_LEVEL_in_attribut3763); 
                    c =new Pair("level", AttributeNum.class);

                    }
                    break;
                case 17 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:722:4: ATTACK
                    {
                    match(input,ATTACK,FOLLOW_ATTACK_in_attribut3770); 
                    c =new Pair("attack", AttributeNum.class);

                    }
                    break;
                case 18 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:723:4: DEFENSE
                    {
                    match(input,DEFENSE,FOLLOW_DEFENSE_in_attribut3777); 
                    c =new Pair("defense", AttributeNum.class);

                    }
                    break;
                case 19 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:724:4: JUMP_FORCE
                    {
                    match(input,JUMP_FORCE,FOLLOW_JUMP_FORCE_in_attribut3784); 
                    c =new Pair("jumpForce", AttributeNum.class);

                    }
                    break;
                case 20 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:725:4: JUMP_AIR_MAX
                    {
                    match(input,JUMP_AIR_MAX,FOLLOW_JUMP_AIR_MAX_in_attribut3791); 
                    c =new Pair("maxJumpsInTheAir", AttributeNum.class);

                    }
                    break;
                case 21 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:726:4: MONEY
                    {
                    match(input,MONEY,FOLLOW_MONEY_in_attribut3798); 
                    c =new Pair("money", AttributeNum.class);

                    }
                    break;
                case 22 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:727:4: CLASS
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_attribut3805); 
                    c =new Pair("classification",new AttributeString(""));

                    }
                    break;
                case 23 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:728:4: RACE
                    {
                    match(input,RACE,FOLLOW_RACE_in_attribut3812); 
                    c =new Pair("race",new AttributeString(""));

                    }
                    break;
                case 24 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:729:4: ACCELERATION
                    {
                    match(input,ACCELERATION,FOLLOW_ACCELERATION_in_attribut3819); 
                    c =new Pair("acceleration", AttributeNum.class);

                    }
                    break;
                case 25 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:730:4: SPEED
                    {
                    match(input,SPEED,FOLLOW_SPEED_in_attribut3826); 
                    c =new Pair("speed", AttributeNum.class);

                    }
                    break;
                case 26 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:731:4: SPEED_MAX
                    {
                    match(input,SPEED_MAX,FOLLOW_SPEED_MAX_in_attribut3849); 

                    }
                    break;
                case 27 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:732:4: SPEED_MIN
                    {
                    match(input,SPEED_MIN,FOLLOW_SPEED_MIN_in_attribut3855); 

                    }
                    break;
                case 28 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:733:4: BOOST
                    {
                    match(input,BOOST,FOLLOW_BOOST_in_attribut3861); 

                    }
                    break;
                case 29 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:734:4: BOOST_MAX
                    {
                    match(input,BOOST_MAX,FOLLOW_BOOST_MAX_in_attribut3867); 

                    }
                    break;
                case 30 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:735:4: NB_MUNITIONS
                    {
                    match(input,NB_MUNITIONS,FOLLOW_NB_MUNITIONS_in_attribut3873); 
                    c =new Pair("nbMunitions", AttributeNum.class);

                    }
                    break;
                case 31 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:736:4: NB_MUNITIONS_MAX
                    {
                    match(input,NB_MUNITIONS_MAX,FOLLOW_NB_MUNITIONS_MAX_in_attribut3891); 
                    c =new Pair("nbMunitionsMax", AttributeNum.class);

                    }
                    break;
                case 32 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:737:4: SHOOT_POWER
                    {
                    match(input,SHOOT_POWER,FOLLOW_SHOOT_POWER_in_attribut3898); 
                    c =new Pair("boostInterval", AttributeNum.class);

                    }
                    break;
                case 33 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:738:4: DAMAGES
                    {
                    match(input,DAMAGES,FOLLOW_DAMAGES_in_attribut3905); 
                    c =new Pair("damages", AttributeNum.class);

                    }
                    break;
                case 34 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:739:4: VALUE
                    {
                    match(input,VALUE,FOLLOW_VALUE_in_attribut3927); 

                    }
                    break;
                case 35 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:740:4: UNIT
                    {
                    match(input,UNIT,FOLLOW_UNIT_in_attribut3933); 

                    }
                    break;
                case 36 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:741:4: OBJECT_NAME
                    {
                    match(input,OBJECT_NAME,FOLLOW_OBJECT_NAME_in_attribut3939); 

                    }
                    break;
                case 37 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:742:4: ATTRIBUT_NAME
                    {
                    match(input,ATTRIBUT_NAME,FOLLOW_ATTRIBUT_NAME_in_attribut3945); 

                    }
                    break;
                case 38 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:743:4: VOLUME
                    {
                    match(input,VOLUME,FOLLOW_VOLUME_in_attribut3951); 

                    }
                    break;
                case 39 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:744:4: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_attribut3958); 

                    }
                    break;
                case 40 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:745:4: MOVE_WITH_CAMERA
                    {
                    match(input,MOVE_WITH_CAMERA,FOLLOW_MOVE_WITH_CAMERA_in_attribut3964); 
                    c =new Pair("moveWithCamera", AttributeBoolean.class);

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
    // $ANTLR end "attribut"


    // $ANTLR start "attributTps"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:748:1: attributTps[SymbolTable st] returns [String c] : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final String attributTps(SymbolTable st) throws RecognitionException {
        String c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:748:48: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            int alt93=3;
            switch ( input.LA(1) ) {
            case BOOST_INTERVAL:
                {
                alt93=1;
                }
                break;
            case SHOOT_INTERVAL:
                {
                alt93=2;
                }
                break;
            case RELOAD_TIME:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:749:2: BOOST_INTERVAL
                    {
                    match(input,BOOST_INTERVAL,FOLLOW_BOOST_INTERVAL_in_attributTps3983); 
                    c ="boostInterval";

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:750:4: SHOOT_INTERVAL
                    {
                    match(input,SHOOT_INTERVAL,FOLLOW_SHOOT_INTERVAL_in_attributTps3989); 
                    c = "shootInterval";

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:751:4: RELOAD_TIME
                    {
                    match(input,RELOAD_TIME,FOLLOW_RELOAD_TIME_in_attributTps4004); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:754:1: attributListeOuObjet[SymbolTable st] returns [Code c] : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final Code attributListeOuObjet(SymbolTable st) throws RecognitionException {
        Code c = null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:754:55: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hightTree.g:
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
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA35 dfa35 = new DFA35(this);
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
            return "173:1: declarationObjet[SymbolTable st] returns [Pair<Model, Integer> p] : ( ^( DEC te= typeEntity[st] (em= entityMode )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );";
        }
    }
    static final String DFA31_eotS =
        "\23\uffff";
    static final String DFA31_eofS =
        "\23\uffff";
    static final String DFA31_minS =
        "\1\31\1\uffff\2\2\11\uffff\2\35\4\uffff";
    static final String DFA31_maxS =
        "\1\113\1\uffff\2\2\11\uffff\2\45\4\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\2\uffff\1\2\1\3\1\4\1\5";
    static final String DFA31_specialS =
        "\23\uffff}>";
    static final String[] DFA31_transitionS = {
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "324:1: action[SymbolTable st] returns [Code c] : ( accesClass[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW mode_mute[st] IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClass[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );";
        }
    }
    static final String DFA35_eotS =
        "\12\uffff";
    static final String DFA35_eofS =
        "\12\uffff";
    static final String DFA35_minS =
        "\1\77\4\uffff\1\2\1\31\3\uffff";
    static final String DFA35_maxS =
        "\1\146\4\uffff\1\2\1\121\3\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\6\1\7\1\5";
    static final String DFA35_specialS =
        "\12\uffff}>";
    static final String[] DFA35_transitionS = {
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "347:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesClass[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );";
        }
    }
 

    public static final BitSet FOLLOW_GAME_KW_in_game69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gameData_in_game73 = new BitSet(new long[]{0x00000010000000C0L});
    public static final BitSet FOLLOW_newType_in_game77 = new BitSet(new long[]{0x00000010000000C0L});
    public static final BitSet FOLLOW_initialization_in_game83 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_definition_in_game88 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_commande_in_game94 = new BitSet(new long[]{0x0200000000000000L,0x0002000000200000L});
    public static final BitSet FOLLOW_reglesJeu_in_game100 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_iaBasique_in_game106 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_GAME_ATTRIBUT_KW_in_gameData140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributGame_list_in_gameData142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attributGame_in_attributGame_list159 = new BitSet(new long[]{0x0000000100002002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame187 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame189 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCORE_KW_in_attributGame197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_newType220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_newType224 = new BitSet(new long[]{0x0000482000000000L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_subType_in_newType226 = new BitSet(new long[]{0x0000482000000008L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_IDENT_in_subType247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_in_initialization278 = new BitSet(new long[]{0x00000010000000C2L});
    public static final BitSet FOLLOW_INIT_IS_KW_in_init306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init310 = new BitSet(new long[]{0x0000010000008700L});
    public static final BitSet FOLLOW_declarationObjet_in_init314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INIT_HAS_KW_in_init324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_init328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_affectationObjet_list_in_init333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEC_in_declarationObjet365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet369 = new BitSet(new long[]{0x0044000000000808L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_declaration_in_declarationObjet388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet397 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_view_in_declarationObjet399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet409 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_KW_in_declarationObjet440 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet442 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_list_declaration474 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_list_declaration478 = new BitSet(new long[]{0x0000002400305002L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeEntity509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERACTION_KW_in_entityMode541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_entityMode545 = new BitSet(new long[]{0x0044000000000808L});
    public static final BitSet FOLLOW_dupli_in_entityMode549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dupli_in_entityMode560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALLY_in_interaction577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENEMY_in_interaction585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEUTRAL_in_interaction593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectationObjet_in_affectationObjet_list663 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet692 = new BitSet(new long[]{0x0000000000080008L});
    public static final BitSet FOLLOW_valAggregation_in_affectationObjet696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribut_in_affectationObjet720 = new BitSet(new long[]{0x0000002400305000L,0x0000000000000000L,0x0000001FF4000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_typeAllocation_in_affectationObjet725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_affectationObjet753 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_affectationObjet758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_affectationObjet779 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet782 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_affectationObjet794 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_affectationObjet799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_affectationObjet804 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_typeAllocation843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeAllocation853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_typeAllocation860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_typeAllocation867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_valAggregation891 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation896 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation918 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_definition955 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_definition957 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSEQUENCES_KW_in_consequences980 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_list_in_consequences982 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_consequ_in_consequ_list1004 = new BitSet(new long[]{0xF800002002000002L,0x04006000000009F9L,0x0000000001E00000L});
    public static final BitSet FOLLOW_siAlors_in_consequ1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_action1093 = new BitSet(new long[]{0x8000000000000000L,0x000000400000F010L});
    public static final BitSet FOLLOW_actionObjet_in_action1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action1130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mode_mute_in_action1146 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOP_KW_in_action1163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action1165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_transformation_in_action1173 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_action1176 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_action1179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1188 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action1201 = new BitSet(new long[]{0x0000000002020008L});
    public static final BitSet FOLLOW_typeDestination_in_action1204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_action1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action1217 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_action1220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAcces1247 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeAcces1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeAcces1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClass_in_typeDestination1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coordinates_in_typeDestination1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1308 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_actionObjet1311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1324 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_actionObjet1327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_actionObjet1337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_KW_in_coordinates1408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_coordinates1412 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_coordinates1417 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_coordinates1422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_commande1456 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_actionCommande_list_in_commande1459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionCommande_in_actionCommande_list1477 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande1497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_actionCommande1499 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande1510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1512 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1671 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1706 = new BitSet(new long[]{0x0000000000000000L,0x0000030018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande1771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande1782 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_typeCommand1807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_typeCommand1809 = new BitSet(new long[]{0x0000000000000008L,0x00000003FE000000L});
    public static final BitSet FOLLOW_KEY_KW_in_typeCommand1818 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_typeCommand1820 = new BitSet(new long[]{0x0000000000000008L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1848 = new BitSet(new long[]{0x7800000002C00000L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1851 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClass_in_declencheur1875 = new BitSet(new long[]{0x0000000000000000L,0x01B4000000001000L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1902 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_VAR_KW_in_declencheur1930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_declencheur1932 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_ID_KW_in_declencheur1943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1945 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1947 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_declencheur0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2040 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2044 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2055 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurTK2059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2081 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2084 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2088 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2099 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_declencheurKT2103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors2130 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_siAlors2135 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_consequences_in_siAlors2140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_KW_in_conditions2174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_conditions2179 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_conditions2185 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_conditions2199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions2203 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_conditions2208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_conditions2222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions2226 = new BitSet(new long[]{0x1800008001000000L,0x4000000000000000L,0x00000000001FFF3FL});
    public static final BitSet FOLLOW_conditions_in_conditions2231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_conditions2245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2249 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_conditions2268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2272 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_conditions2291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2295 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEG_in_conditions2314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2318 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPED_in_conditions2337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2341 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIFF_in_conditions2360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2364 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_conditions2369 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_etat_in_conditions2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2404 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2408 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2413 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2427 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2431 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2436 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2450 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2454 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2459 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2473 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2477 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2496 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2500 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2505 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2519 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2523 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2528 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2532 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2540 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_etat2542 = new BitSet(new long[]{0x0000000002000000L,0x2040000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2546 = new BitSet(new long[]{0x0000000002000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OTHER_in_etat2551 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_etat2555 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2565 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2580 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2583 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2594 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2608 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000006L});
    public static final BitSet FOLLOW_NOT_in_etat2612 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000006L});
    public static final BitSet FOLLOW_mode_mute_in_etat2616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2626 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2641 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mode_mute0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2704 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2720 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2723 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2734 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_affectation2748 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClass_in_iaBasique2774 = new BitSet(new long[]{0x8000000000000000L,0x000000400000F010L});
    public static final BitSet FOLLOW_actionObjetList_in_iaBasique2777 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionObjet_in_actionObjetList2792 = new BitSet(new long[]{0x8000000000000002L,0x000000400000F010L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2822 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_operation2846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2848 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2851 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_operation2868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2870 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_operation2890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2892 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2895 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation2912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2914 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2917 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_operation2934 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2936 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_operation2956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2958 = new BitSet(new long[]{0x0000000400305000L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_operation2961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_operation2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operation2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable3023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3027 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3032 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_variable3044 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3049 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3054 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Z_in_variable3066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3068 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_I_KW_in_variable3087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable3091 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3095 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_A_KW_in_variable3107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribut_in_variable3111 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GAME_SCORE_KW_in_variable3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_KW_in_variable3133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_variable3137 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_accesClass_in_variable3142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ALL_in_accesClass3175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeObjet_in_accesClass3193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_accesClass3211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_accesClass3227 = new BitSet(new long[]{0x003C482000000000L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_notAccess_in_accesClass3229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accesClass3248 = new BitSet(new long[]{0x0000000400305008L,0x0000000000000000L,0x0000001FF4000000L});
    public static final BitSet FOLLOW_operation_in_accesClass3252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_KW_in_accesClass3269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLAYER_in_accesClass3271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeObjet_in_notAccess3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_notAccess3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_notAccess3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITION_in_typeCoordonnees3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORIENTATION_in_typeCoordonnees3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_typeCoordonnees3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_timeUnit3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEC_in_timeUnit3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MS_in_timeUnit3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAME_in_timeUnit3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERA_in_typeObjet3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_typeObjet3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNTER_in_typeObjet3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_typeObjet3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeObjet3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_in_typeObjet3D3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_typeObjet3D3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEHICLE_in_typeObjet3D3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLANE_in_typeObjet3D3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPACECRAFT_in_typeObjet3D3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_typeObjet3D3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEAPON_in_typeObjet3D3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWORD_in_typeObjet3D3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROJECTILE_in_typeObjet3D3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZONE_in_typeObjet3D3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUND_in_typeObjet3D3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BONUS_in_typeObjet3D3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECKPOINT_in_typeObjet3D3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAKABLE_in_typeObjet3D3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_typeObjet3D3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROOM_in_typeObjet3D3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BALL_in_typeObjet3D3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TELEPORTER_in_typeObjet3D3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MASS_in_attribut3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_FIX_in_attribut3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_TRAVERSABLE_in_attribut3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOV_in_attribut3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_attribut3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVE_in_attribut3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_attribut3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIPTION_in_attribut3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIFE_in_attribut3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIFE_MAX_in_attribut3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIFE_MIN_in_attribut3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_LIVES_in_attribut3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAGIC_in_attribut3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAGIC_MAX_in_attribut3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAGIC_MIN_in_attribut3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEVEL_in_attribut3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACK_in_attribut3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFENSE_in_attribut3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_FORCE_in_attribut3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_AIR_MAX_in_attribut3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONEY_in_attribut3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_attribut3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RACE_in_attribut3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATION_in_attribut3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_attribut3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_MAX_in_attribut3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_MIN_in_attribut3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOST_in_attribut3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOST_MAX_in_attribut3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_MUNITIONS_in_attribut3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_MUNITIONS_MAX_in_attribut3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOOT_POWER_in_attribut3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAMAGES_in_attribut3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_attribut3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIT_in_attribut3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_NAME_in_attribut3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUT_NAME_in_attribut3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLUME_in_attribut3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_attribut3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_WITH_CAMERA_in_attribut3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOST_INTERVAL_in_attributTps3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOOT_INTERVAL_in_attributTps3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOAD_TIME_in_attributTps4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}