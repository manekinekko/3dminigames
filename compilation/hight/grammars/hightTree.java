// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g 2011-01-19 01:38:41

    package grammars;
    import code.*;
    import types.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class hightTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "SCORE", "TYPE", "IDENT", "IS", "AND", "LIST_KW", "OF", "WITH", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "IN", "PLAYER", "ALLY", "ENEMY", "NEUTRAL", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "DIES_KW", "DURING", "UNTIL", "EQUIP", "NEXT", "PREVIOUS", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "MOUSE_KW", "KEY_KW", "FOR", "WUP", "WDOWN", "LEFT", "RIGHT", "CLICK_LEFT", "CLICK_CENTER", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "JUMP", "MOVE", "FORWARD", "BACKWARD", "TURN", "ACCELERATE", "BRAKE", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "BY", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "X", "Y", "Z", "VALUE", "ALL", "NUM", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "COUNTER", "TIME", "OBJECT", "CHARACTER", "VEHICLE", "PLANE", "SPACECRAFT", "OBSTACLE", "WEAPON", "SWORD", "PROJECTILE", "ZONE", "GROUND", "BONUS", "CHECKPOINT", "BREAKABLE", "CONSTRUCTION", "ROOM", "BALL", "TELEPORTER", "MASS", "IS_FIX", "IS_TRAVERSABLE", "FOV", "ACTIVE", "NAME", "DESCRIPTION", "LIFE", "LIFE_MAX", "LIFE_MIN", "NB_LIVES", "MAGIC", "MAGIC_MAX", "MAGIC_MIN", "LEVEL", "ATTACK", "DEFENSE", "JUMP_FORCE", "JUMP_AIR_MAX", "MONEY", "CLASS", "RACE", "ACCELERATION", "SPEED", "SPEED_MAX", "SPEED_MIN", "BOOST", "BOOST_MAX", "NB_MUNITIONS", "NB_MUNITIONS_MAX", "SHOOT_POWER", "DAMAGES", "UNIT", "OBJECT_NAME", "ATTRIBUT_NAME", "VOLUME", "NUMBER", "MOVE_WITH_CAMERA", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "WS", "'true'", "'false'", "TYPE_KW"
    };
    public static final int EOF=-1;
    public static final int T__248=248;
    public static final int T__249=249;
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
    public static final int FIN=25;
    public static final int GAME=26;
    public static final int HAS=27;
    public static final int VIRG=28;
    public static final int GRAVITY_KW=29;
    public static final int AT=30;
    public static final int FLOAT=31;
    public static final int SCORE=32;
    public static final int TYPE=33;
    public static final int IDENT=34;
    public static final int IS=35;
    public static final int AND=36;
    public static final int LIST_KW=37;
    public static final int OF=38;
    public static final int WITH=39;
    public static final int CAMERA=40;
    public static final int PERSON=41;
    public static final int FREE=42;
    public static final int MEDIA=43;
    public static final int LOOP=44;
    public static final int ONCE=45;
    public static final int IN=46;
    public static final int PLAYER=47;
    public static final int ALLY=48;
    public static final int ENEMY=49;
    public static final int NEUTRAL=50;
    public static final int DUPLICABLE=51;
    public static final int FIRST=52;
    public static final int THIRD=53;
    public static final int DEFINITION_KW=54;
    public static final int MEANS=55;
    public static final int VICTORY_KW=56;
    public static final int DEFEAT_KW=57;
    public static final int ENDS_KW=58;
    public static final int STARTS_KW=59;
    public static final int PAUSE_KW=60;
    public static final int MUTE_KW=61;
    public static final int ON=62;
    public static final int OFF=63;
    public static final int PLAY_KW=64;
    public static final int STOP_KW=65;
    public static final int BLOCK_KW=66;
    public static final int EFFACE_KW=67;
    public static final int GENERATE_KW=68;
    public static final int WAIT_KW=69;
    public static final int THEN=70;
    public static final int ENDWAIT=71;
    public static final int SAVE_KW=72;
    public static final int DIES_KW=73;
    public static final int DURING=74;
    public static final int UNTIL=75;
    public static final int EQUIP=76;
    public static final int NEXT=77;
    public static final int PREVIOUS=78;
    public static final int TRANSLATION=79;
    public static final int ROTATION=80;
    public static final int SCALE=81;
    public static final int COMMAND_KW=82;
    public static final int MOUSE_KW=83;
    public static final int KEY_KW=84;
    public static final int FOR=85;
    public static final int WUP=86;
    public static final int WDOWN=87;
    public static final int LEFT=88;
    public static final int RIGHT=89;
    public static final int CLICK_LEFT=90;
    public static final int CLICK_CENTER=91;
    public static final int CLICK_RIGHT=92;
    public static final int SCROLL_UP=93;
    public static final int SCROLL_DOWN=94;
    public static final int LETTER=95;
    public static final int SPACE=96;
    public static final int ESCAPE=97;
    public static final int ENTER=98;
    public static final int JUMP=99;
    public static final int MOVE=100;
    public static final int FORWARD=101;
    public static final int BACKWARD=102;
    public static final int TURN=103;
    public static final int ACCELERATE=104;
    public static final int BRAKE=105;
    public static final int ACTIVATE_KW=106;
    public static final int DISABLE_KW=107;
    public static final int COMMANDS=108;
    public static final int KEYBOARD=109;
    public static final int RULE_KW=110;
    public static final int MOVES_KW=111;
    public static final int BECOMES=112;
    public static final int TOUCHES_KW=113;
    public static final int KILLS_KW=114;
    public static final int OTHER=115;
    public static final int KILLED_KW=116;
    public static final int TOUCHED_KW=117;
    public static final int BY=118;
    public static final int IF_KW=119;
    public static final int ELSE=120;
    public static final int ENDIF=121;
    public static final int NOT=122;
    public static final int OR=123;
    public static final int COMP=124;
    public static final int EQUALS=125;
    public static final int INF=126;
    public static final int SUP=127;
    public static final int INFEG=128;
    public static final int SUPED=129;
    public static final int DIFF=130;
    public static final int PG=131;
    public static final int PD=132;
    public static final int DEAD_KW=133;
    public static final int ALIVE_KW=134;
    public static final int EFFACED_KW=135;
    public static final int GENERATED_KW=136;
    public static final int TOUCHING_KW=137;
    public static final int MOVING_KW=138;
    public static final int WAITING_KW=139;
    public static final int FINISHED_KW=140;
    public static final int STARTED_KW=141;
    public static final int PAUSED_KW=142;
    public static final int MUTED_KW=143;
    public static final int PLAYED_KW=144;
    public static final int STOPPED_KW=145;
    public static final int ASSIGN_KW=146;
    public static final int ADD_KW=147;
    public static final int SUB_KW=148;
    public static final int INVERT_KW=149;
    public static final int IA_KW=150;
    public static final int RANDOM_KW=151;
    public static final int BETWEEN=152;
    public static final int PLUS=153;
    public static final int MINUS=154;
    public static final int MUL=155;
    public static final int DIV=156;
    public static final int MOD=157;
    public static final int POW=158;
    public static final int X=159;
    public static final int Y=160;
    public static final int Z=161;
    public static final int VALUE=162;
    public static final int ALL=163;
    public static final int NUM=164;
    public static final int POSITION=165;
    public static final int ORIENTATION=166;
    public static final int SIZE=167;
    public static final int MIN=168;
    public static final int SEC=169;
    public static final int MS=170;
    public static final int FRAME=171;
    public static final int COUNTER=172;
    public static final int TIME=173;
    public static final int OBJECT=174;
    public static final int CHARACTER=175;
    public static final int VEHICLE=176;
    public static final int PLANE=177;
    public static final int SPACECRAFT=178;
    public static final int OBSTACLE=179;
    public static final int WEAPON=180;
    public static final int SWORD=181;
    public static final int PROJECTILE=182;
    public static final int ZONE=183;
    public static final int GROUND=184;
    public static final int BONUS=185;
    public static final int CHECKPOINT=186;
    public static final int BREAKABLE=187;
    public static final int CONSTRUCTION=188;
    public static final int ROOM=189;
    public static final int BALL=190;
    public static final int TELEPORTER=191;
    public static final int MASS=192;
    public static final int IS_FIX=193;
    public static final int IS_TRAVERSABLE=194;
    public static final int FOV=195;
    public static final int ACTIVE=196;
    public static final int NAME=197;
    public static final int DESCRIPTION=198;
    public static final int LIFE=199;
    public static final int LIFE_MAX=200;
    public static final int LIFE_MIN=201;
    public static final int NB_LIVES=202;
    public static final int MAGIC=203;
    public static final int MAGIC_MAX=204;
    public static final int MAGIC_MIN=205;
    public static final int LEVEL=206;
    public static final int ATTACK=207;
    public static final int DEFENSE=208;
    public static final int JUMP_FORCE=209;
    public static final int JUMP_AIR_MAX=210;
    public static final int MONEY=211;
    public static final int CLASS=212;
    public static final int RACE=213;
    public static final int ACCELERATION=214;
    public static final int SPEED=215;
    public static final int SPEED_MAX=216;
    public static final int SPEED_MIN=217;
    public static final int BOOST=218;
    public static final int BOOST_MAX=219;
    public static final int NB_MUNITIONS=220;
    public static final int NB_MUNITIONS_MAX=221;
    public static final int SHOOT_POWER=222;
    public static final int DAMAGES=223;
    public static final int UNIT=224;
    public static final int OBJECT_NAME=225;
    public static final int ATTRIBUT_NAME=226;
    public static final int VOLUME=227;
    public static final int NUMBER=228;
    public static final int MOVE_WITH_CAMERA=229;
    public static final int BOOST_INTERVAL=230;
    public static final int SHOOT_INTERVAL=231;
    public static final int RELOAD_TIME=232;
    public static final int INVENTORY=233;
    public static final int EQUIPED_OBJECT=234;
    public static final int ENTRANCES=235;
    public static final int EXITS=236;
    public static final int DAMAGE_ZONE=237;
    public static final int COLLECTORS=238;
    public static final int TYPES_COLLECTORS=239;
    public static final int GENERATORS=240;
    public static final int TYPE_GENERATORS=241;
    public static final int BREAKERS=242;
    public static final int TYPES_BREAKERS=243;
    public static final int TELEPORTABLES=244;
    public static final int TYPES_TELEPORTABLES=245;
    public static final int COMMENT=246;
    public static final int WS=247;
    public static final int TYPE_KW=250;

    // delegates
    // delegators


        public hightTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public hightTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return hightTree.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g"; }


    public static class game_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "game"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:21:1: game[SymbolTable st] returns [Code c] : ^( GAME_KW (gd= gameData[st] )? (nt= newType[st] )* (in= init[st] )+ (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) ;
    public final hightTree.game_return game(SymbolTable st) throws RecognitionException {
        hightTree.game_return retval = new hightTree.game_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GAME_KW1=null;
        hightTree.gameData_return gd = null;

        hightTree.newType_return nt = null;

        hightTree.init_return in = null;

        hightTree.definition_return def = null;

        hightTree.commande_return com = null;

        hightTree.reglesJeu_return reg = null;

        hightTree.iaBasique_return ia = null;


        CommonTree GAME_KW1_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:21:66: ( ^( GAME_KW (gd= gameData[st] )? (nt= newType[st] )* (in= init[st] )+ (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:2: ^( GAME_KW (gd= gameData[st] )? (nt= newType[st] )* (in= init[st] )+ (def= definition[st] )* (com= commande[st] )+ (reg= reglesJeu[st] )+ (ia= iaBasique[st] )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GAME_KW1=(CommonTree)match(input,GAME_KW,FOLLOW_GAME_KW_in_game65); 
            GAME_KW1_tree = (CommonTree)adaptor.dupNode(GAME_KW1);

            root_1 = (CommonTree)adaptor.becomeRoot(GAME_KW1_tree, root_1);



            match(input, Token.DOWN, null); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:15: (gd= gameData[st] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME_ATTRIBUT_KW) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:15: gd= gameData[st]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_gameData_in_game70);
                    gd=gameData(st);

                    state._fsp--;

                    adaptor.addChild(root_1, gd.getTree());

                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:32: (nt= newType[st] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE_KW) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:32: nt= newType[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_newType_in_game76);
            	    nt=newType(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, nt.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:48: (in= init[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:48: in= init[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_init_in_game82);
            	    in=init(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, in.getTree());

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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:62: (def= definition[st] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DEFINITION_KW) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:62: def= definition[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_definition_in_game88);
            	    def=definition(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, def.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:82: (com= commande[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:82: com= commande[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_commande_in_game94);
            	    com=commande(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, com.getTree());

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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:100: (reg= reglesJeu[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:100: reg= reglesJeu[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_reglesJeu_in_game100);
            	    reg=reglesJeu(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, reg.getTree());

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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:118: (ia= iaBasique[st] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IA_KW) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:22:118: ia= iaBasique[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_iaBasique_in_game106);
            	    ia=iaBasique(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, ia.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "game"

    public static class gameData_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "gameData"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:29:1: gameData[SymbolTable st] returns [Code c] : ^( GAME_ATTRIBUT_KW attributGame_list[st] ) ;
    public final hightTree.gameData_return gameData(SymbolTable st) throws RecognitionException {
        hightTree.gameData_return retval = new hightTree.gameData_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GAME_ATTRIBUT_KW2=null;
        hightTree.attributGame_list_return attributGame_list3 = null;


        CommonTree GAME_ATTRIBUT_KW2_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:29:43: ( ^( GAME_ATTRIBUT_KW attributGame_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:30:2: ^( GAME_ATTRIBUT_KW attributGame_list[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GAME_ATTRIBUT_KW2=(CommonTree)match(input,GAME_ATTRIBUT_KW,FOLLOW_GAME_ATTRIBUT_KW_in_gameData136); 
            GAME_ATTRIBUT_KW2_tree = (CommonTree)adaptor.dupNode(GAME_ATTRIBUT_KW2);

            root_1 = (CommonTree)adaptor.becomeRoot(GAME_ATTRIBUT_KW2_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_attributGame_list_in_gameData138);
            attributGame_list3=attributGame_list(st);

            state._fsp--;

            adaptor.addChild(root_1, attributGame_list3.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "gameData"

    public static class attributGame_list_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributGame_list"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:32:1: attributGame_list[SymbolTable st] returns [Code c] : ( attributGame[st] )+ ;
    public final hightTree.attributGame_list_return attributGame_list(SymbolTable st) throws RecognitionException {
        hightTree.attributGame_list_return retval = new hightTree.attributGame_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.attributGame_return attributGame4 = null;



        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:32:52: ( ( attributGame[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:33:2: ( attributGame[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:33:2: ( attributGame[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:33:2: attributGame[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_attributGame_in_attributGame_list155);
            	    attributGame4=attributGame(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, attributGame4.getTree());

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributGame_list"

    public static class attributGame_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributGame"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:35:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) );
    public final hightTree.attributGame_return attributGame(SymbolTable st) throws RecognitionException {
        hightTree.attributGame_return retval = new hightTree.attributGame_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GRAVITY_KW5=null;
        CommonTree FLOAT6=null;
        CommonTree GRAVITY_KW7=null;
        CommonTree FLOAT8=null;
        CommonTree FLOAT9=null;
        CommonTree FLOAT10=null;
        CommonTree SCORE_KW11=null;
        CommonTree FLOAT12=null;

        CommonTree GRAVITY_KW5_tree=null;
        CommonTree FLOAT6_tree=null;
        CommonTree GRAVITY_KW7_tree=null;
        CommonTree FLOAT8_tree=null;
        CommonTree FLOAT9_tree=null;
        CommonTree FLOAT10_tree=null;
        CommonTree SCORE_KW11_tree=null;
        CommonTree FLOAT12_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:35:47: ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:36:2: ^( GRAVITY_KW FLOAT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GRAVITY_KW5=(CommonTree)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame173); 
                    GRAVITY_KW5_tree = (CommonTree)adaptor.dupNode(GRAVITY_KW5);

                    root_1 = (CommonTree)adaptor.becomeRoot(GRAVITY_KW5_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    FLOAT6=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame175); 
                    FLOAT6_tree = (CommonTree)adaptor.dupNode(FLOAT6);

                    adaptor.addChild(root_1, FLOAT6_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:37:3: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GRAVITY_KW7=(CommonTree)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame181); 
                    GRAVITY_KW7_tree = (CommonTree)adaptor.dupNode(GRAVITY_KW7);

                    root_1 = (CommonTree)adaptor.becomeRoot(GRAVITY_KW7_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    FLOAT8=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame183); 
                    FLOAT8_tree = (CommonTree)adaptor.dupNode(FLOAT8);

                    adaptor.addChild(root_1, FLOAT8_tree);

                    _last = (CommonTree)input.LT(1);
                    FLOAT9=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame185); 
                    FLOAT9_tree = (CommonTree)adaptor.dupNode(FLOAT9);

                    adaptor.addChild(root_1, FLOAT9_tree);

                    _last = (CommonTree)input.LT(1);
                    FLOAT10=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame187); 
                    FLOAT10_tree = (CommonTree)adaptor.dupNode(FLOAT10);

                    adaptor.addChild(root_1, FLOAT10_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:38:3: ^( SCORE_KW FLOAT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SCORE_KW11=(CommonTree)match(input,SCORE_KW,FOLLOW_SCORE_KW_in_attributGame193); 
                    SCORE_KW11_tree = (CommonTree)adaptor.dupNode(SCORE_KW11);

                    root_1 = (CommonTree)adaptor.becomeRoot(SCORE_KW11_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    FLOAT12=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame195); 
                    FLOAT12_tree = (CommonTree)adaptor.dupNode(FLOAT12);

                    adaptor.addChild(root_1, FLOAT12_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributGame"

    public static class newType_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newType"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:41:1: newType[SymbolTable st] returns [Code c] : ^( TYPE_KW IDENT subType_list[st] ) ;
    public final hightTree.newType_return newType(SymbolTable st) throws RecognitionException {
        hightTree.newType_return retval = new hightTree.newType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPE_KW13=null;
        CommonTree IDENT14=null;
        hightTree.subType_list_return subType_list15 = null;


        CommonTree TYPE_KW13_tree=null;
        CommonTree IDENT14_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:41:42: ( ^( TYPE_KW IDENT subType_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:42:2: ^( TYPE_KW IDENT subType_list[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TYPE_KW13=(CommonTree)match(input,TYPE_KW,FOLLOW_TYPE_KW_in_newType215); 
            TYPE_KW13_tree = (CommonTree)adaptor.dupNode(TYPE_KW13);

            root_1 = (CommonTree)adaptor.becomeRoot(TYPE_KW13_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENT14=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_newType217); 
            IDENT14_tree = (CommonTree)adaptor.dupNode(IDENT14);

            adaptor.addChild(root_1, IDENT14_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_subType_list_in_newType219);
            subType_list15=subType_list(st);

            state._fsp--;

            adaptor.addChild(root_1, subType_list15.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newType"

    public static class subType_list_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subType_list"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:45:1: subType_list[SymbolTable st] returns [Code c] : ( subType[st] )+ ;
    public final hightTree.subType_list_return subType_list(SymbolTable st) throws RecognitionException {
        hightTree.subType_list_return retval = new hightTree.subType_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.subType_return subType16 = null;



        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:45:47: ( ( subType[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:46:2: ( subType[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:46:2: ( subType[st] )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:46:2: subType[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_subType_in_subType_list238);
            	    subType16=subType(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, subType16.getTree());

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


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subType_list"

    public static class subType_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subType"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:48:1: subType[SymbolTable st] returns [Code c] : ( IDENT | typeObjet[st] );
    public final hightTree.subType_return subType(SymbolTable st) throws RecognitionException {
        hightTree.subType_return retval = new hightTree.subType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT17=null;
        hightTree.typeObjet_return typeObjet18 = null;


        CommonTree IDENT17_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:48:42: ( IDENT | typeObjet[st] )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:49:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT17=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_subType256); 
                    IDENT17_tree = (CommonTree)adaptor.dupNode(IDENT17);

                    adaptor.addChild(root_0, IDENT17_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:50:4: typeObjet[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeObjet_in_subType261);
                    typeObjet18=typeObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet18.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subType"

    public static class init_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "init"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:53:1: init[SymbolTable st] returns [Code c] : ( ^( INIT_IS_KW IDENT declarationObjet[st] ) | ^( INIT_HAS_KW affectationObjet[st] ) );
    public final hightTree.init_return init(SymbolTable st) throws RecognitionException {
        hightTree.init_return retval = new hightTree.init_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INIT_IS_KW19=null;
        CommonTree IDENT20=null;
        CommonTree INIT_HAS_KW22=null;
        hightTree.declarationObjet_return declarationObjet21 = null;

        hightTree.affectationObjet_return affectationObjet23 = null;


        CommonTree INIT_IS_KW19_tree=null;
        CommonTree IDENT20_tree=null;
        CommonTree INIT_HAS_KW22_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:53:39: ( ^( INIT_IS_KW IDENT declarationObjet[st] ) | ^( INIT_HAS_KW affectationObjet[st] ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:54:2: ^( INIT_IS_KW IDENT declarationObjet[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INIT_IS_KW19=(CommonTree)match(input,INIT_IS_KW,FOLLOW_INIT_IS_KW_in_init281); 
                    INIT_IS_KW19_tree = (CommonTree)adaptor.dupNode(INIT_IS_KW19);

                    root_1 = (CommonTree)adaptor.becomeRoot(INIT_IS_KW19_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT20=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_init283); 
                    IDENT20_tree = (CommonTree)adaptor.dupNode(IDENT20);

                    adaptor.addChild(root_1, IDENT20_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declarationObjet_in_init285);
                    declarationObjet21=declarationObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declarationObjet21.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:55:3: ^( INIT_HAS_KW affectationObjet[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INIT_HAS_KW22=(CommonTree)match(input,INIT_HAS_KW,FOLLOW_INIT_HAS_KW_in_init292); 
                    INIT_HAS_KW22_tree = (CommonTree)adaptor.dupNode(INIT_HAS_KW22);

                    root_1 = (CommonTree)adaptor.becomeRoot(INIT_HAS_KW22_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_affectationObjet_in_init294);
                    affectationObjet23=affectationObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_1, affectationObjet23.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "init"

    public static class declarationObjet_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarationObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:59:1: declarationObjet[SymbolTable st] returns [Code c] : ( ^( DEC typeEntity[st] ( entityMode[st] )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );
    public final hightTree.declarationObjet_return declarationObjet(SymbolTable st) throws RecognitionException {
        hightTree.declarationObjet_return retval = new hightTree.declarationObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEC24=null;
        CommonTree LIST_KW27=null;
        CommonTree CAMERA_KW29=null;
        CommonTree PERSON30=null;
        CommonTree CAMERA_KW32=null;
        CommonTree FREE33=null;
        CommonTree MEDIA_KW34=null;
        CommonTree LOOP35=null;
        CommonTree MEDIA_KW36=null;
        CommonTree ONCE37=null;
        CommonTree IN_KW38=null;
        CommonTree IDENT39=null;
        hightTree.typeEntity_return typeEntity25 = null;

        hightTree.entityMode_return entityMode26 = null;

        hightTree.list_declaration_return list_declaration28 = null;

        hightTree.view_return view31 = null;


        CommonTree DEC24_tree=null;
        CommonTree LIST_KW27_tree=null;
        CommonTree CAMERA_KW29_tree=null;
        CommonTree PERSON30_tree=null;
        CommonTree CAMERA_KW32_tree=null;
        CommonTree FREE33_tree=null;
        CommonTree MEDIA_KW34_tree=null;
        CommonTree LOOP35_tree=null;
        CommonTree MEDIA_KW36_tree=null;
        CommonTree ONCE37_tree=null;
        CommonTree IN_KW38_tree=null;
        CommonTree IDENT39_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:59:51: ( ^( DEC typeEntity[st] ( entityMode[st] )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:60:2: ^( DEC typeEntity[st] ( entityMode[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DEC24=(CommonTree)match(input,DEC,FOLLOW_DEC_in_declarationObjet314); 
                    DEC24_tree = (CommonTree)adaptor.dupNode(DEC24);

                    root_1 = (CommonTree)adaptor.becomeRoot(DEC24_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet316);
                    typeEntity25=typeEntity(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeEntity25.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:60:23: ( entityMode[st] )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==INTERACTION_KW||LA13_0==PLAYER||LA13_0==DUPLICABLE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:60:23: entityMode[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_entityMode_in_declarationObjet319);
                            entityMode26=entityMode(st);

                            state._fsp--;

                            adaptor.addChild(root_1, entityMode26.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:61:3: ^( LIST_KW list_declaration[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LIST_KW27=(CommonTree)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet330); 
                    LIST_KW27_tree = (CommonTree)adaptor.dupNode(LIST_KW27);

                    root_1 = (CommonTree)adaptor.becomeRoot(LIST_KW27_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_list_declaration_in_declarationObjet332);
                    list_declaration28=list_declaration(st);

                    state._fsp--;

                    adaptor.addChild(root_1, list_declaration28.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:62:3: ^( CAMERA_KW PERSON view[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CAMERA_KW29=(CommonTree)match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet339); 
                    CAMERA_KW29_tree = (CommonTree)adaptor.dupNode(CAMERA_KW29);

                    root_1 = (CommonTree)adaptor.becomeRoot(CAMERA_KW29_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    PERSON30=(CommonTree)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet341); 
                    PERSON30_tree = (CommonTree)adaptor.dupNode(PERSON30);

                    adaptor.addChild(root_1, PERSON30_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_view_in_declarationObjet343);
                    view31=view(st);

                    state._fsp--;

                    adaptor.addChild(root_1, view31.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:63:3: ^( CAMERA_KW FREE )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CAMERA_KW32=(CommonTree)match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet351); 
                    CAMERA_KW32_tree = (CommonTree)adaptor.dupNode(CAMERA_KW32);

                    root_1 = (CommonTree)adaptor.becomeRoot(CAMERA_KW32_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    FREE33=(CommonTree)match(input,FREE,FOLLOW_FREE_in_declarationObjet353); 
                    FREE33_tree = (CommonTree)adaptor.dupNode(FREE33);

                    adaptor.addChild(root_1, FREE33_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:64:3: ^( MEDIA_KW LOOP )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MEDIA_KW34=(CommonTree)match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet359); 
                    MEDIA_KW34_tree = (CommonTree)adaptor.dupNode(MEDIA_KW34);

                    root_1 = (CommonTree)adaptor.becomeRoot(MEDIA_KW34_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    LOOP35=(CommonTree)match(input,LOOP,FOLLOW_LOOP_in_declarationObjet361); 
                    LOOP35_tree = (CommonTree)adaptor.dupNode(LOOP35);

                    adaptor.addChild(root_1, LOOP35_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:65:3: ^( MEDIA_KW ONCE )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MEDIA_KW36=(CommonTree)match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet368); 
                    MEDIA_KW36_tree = (CommonTree)adaptor.dupNode(MEDIA_KW36);

                    root_1 = (CommonTree)adaptor.becomeRoot(MEDIA_KW36_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ONCE37=(CommonTree)match(input,ONCE,FOLLOW_ONCE_in_declarationObjet370); 
                    ONCE37_tree = (CommonTree)adaptor.dupNode(ONCE37);

                    adaptor.addChild(root_1, ONCE37_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:66:3: ^( IN_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IN_KW38=(CommonTree)match(input,IN_KW,FOLLOW_IN_KW_in_declarationObjet384); 
                    IN_KW38_tree = (CommonTree)adaptor.dupNode(IN_KW38);

                    root_1 = (CommonTree)adaptor.becomeRoot(IN_KW38_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT39=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet386); 
                    IDENT39_tree = (CommonTree)adaptor.dupNode(IDENT39);

                    adaptor.addChild(root_1, IDENT39_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarationObjet"

    public static class list_declaration_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_declaration"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:69:1: list_declaration[SymbolTable st] returns [Code c] : ( ( operation[st] )? IDENT )+ ;
    public final hightTree.list_declaration_return list_declaration(SymbolTable st) throws RecognitionException {
        hightTree.list_declaration_return retval = new hightTree.list_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT41=null;
        hightTree.operation_return operation40 = null;


        CommonTree IDENT41_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:69:51: ( ( ( operation[st] )? IDENT )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:70:2: ( ( operation[st] )? IDENT )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:70:2: ( ( operation[st] )? IDENT )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:70:3: ( operation[st] )? IDENT
            	    {
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:70:3: ( operation[st] )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==GAME_SCORE_KW||LA15_0==VALUE_KW||(LA15_0>=VAR_I_KW && LA15_0<=VAR_A_KW)||LA15_0==FLOAT||LA15_0==RANDOM_KW||(LA15_0>=PLUS && LA15_0<=Z)) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:70:3: operation[st]
            	            {
            	            _last = (CommonTree)input.LT(1);
            	            pushFollow(FOLLOW_operation_in_list_declaration418);
            	            operation40=operation(st);

            	            state._fsp--;

            	            adaptor.addChild(root_0, operation40.getTree());

            	            }
            	            break;

            	    }

            	    _last = (CommonTree)input.LT(1);
            	    IDENT41=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_list_declaration422); 
            	    IDENT41_tree = (CommonTree)adaptor.dupNode(IDENT41);

            	    adaptor.addChild(root_0, IDENT41_tree);


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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list_declaration"

    public static class typeEntity_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeEntity"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:73:1: typeEntity[SymbolTable st] returns [Code c] : ( IDENT | typeObjet3D[st] );
    public final hightTree.typeEntity_return typeEntity(SymbolTable st) throws RecognitionException {
        hightTree.typeEntity_return retval = new hightTree.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT42=null;
        hightTree.typeObjet3D_return typeObjet3D43 = null;


        CommonTree IDENT42_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:73:45: ( IDENT | typeObjet3D[st] )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:74:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT42=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeEntity441); 
                    IDENT42_tree = (CommonTree)adaptor.dupNode(IDENT42);

                    adaptor.addChild(root_0, IDENT42_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:75:4: typeObjet3D[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeObjet3D_in_typeEntity446);
                    typeObjet3D43=typeObjet3D(st);

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet3D43.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeEntity"

    public static class entityMode_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entityMode"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:78:1: entityMode[SymbolTable st] returns [Code c] : ( PLAYER | ^( INTERACTION_KW interaction[st] ( dupli[st] )? ) | dupli[st] );
    public final hightTree.entityMode_return entityMode(SymbolTable st) throws RecognitionException {
        hightTree.entityMode_return retval = new hightTree.entityMode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PLAYER44=null;
        CommonTree INTERACTION_KW45=null;
        hightTree.interaction_return interaction46 = null;

        hightTree.dupli_return dupli47 = null;

        hightTree.dupli_return dupli48 = null;


        CommonTree PLAYER44_tree=null;
        CommonTree INTERACTION_KW45_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:78:45: ( PLAYER | ^( INTERACTION_KW interaction[st] ( dupli[st] )? ) | dupli[st] )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:79:2: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PLAYER44=(CommonTree)match(input,PLAYER,FOLLOW_PLAYER_in_entityMode463); 
                    PLAYER44_tree = (CommonTree)adaptor.dupNode(PLAYER44);

                    adaptor.addChild(root_0, PLAYER44_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:80:4: ^( INTERACTION_KW interaction[st] ( dupli[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INTERACTION_KW45=(CommonTree)match(input,INTERACTION_KW,FOLLOW_INTERACTION_KW_in_entityMode469); 
                    INTERACTION_KW45_tree = (CommonTree)adaptor.dupNode(INTERACTION_KW45);

                    root_1 = (CommonTree)adaptor.becomeRoot(INTERACTION_KW45_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interaction_in_entityMode471);
                    interaction46=interaction(st);

                    state._fsp--;

                    adaptor.addChild(root_1, interaction46.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:80:37: ( dupli[st] )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DUPLICABLE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:80:37: dupli[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_dupli_in_entityMode474);
                            dupli47=dupli(st);

                            state._fsp--;

                            adaptor.addChild(root_1, dupli47.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:81:4: dupli[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_dupli_in_entityMode482);
                    dupli48=dupli(st);

                    state._fsp--;

                    adaptor.addChild(root_0, dupli48.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entityMode"

    public static class interaction_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interaction"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:84:1: interaction[SymbolTable st] returns [Code c] : ( ALLY | ENEMY | NEUTRAL );
    public final hightTree.interaction_return interaction(SymbolTable st) throws RecognitionException {
        hightTree.interaction_return retval = new hightTree.interaction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set49=null;

        CommonTree set49_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:84:46: ( ALLY | ENEMY | NEUTRAL )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set49=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=ALLY && input.LA(1)<=NEUTRAL) ) {
                input.consume();

                set49_tree = (CommonTree)adaptor.dupNode(set49);

                adaptor.addChild(root_0, set49_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interaction"

    public static class dupli_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dupli"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:90:1: dupli[SymbolTable st] returns [Code c] : DUPLICABLE ;
    public final hightTree.dupli_return dupli(SymbolTable st) throws RecognitionException {
        hightTree.dupli_return retval = new hightTree.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DUPLICABLE50=null;

        CommonTree DUPLICABLE50_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:90:40: ( DUPLICABLE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:91:2: DUPLICABLE
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            DUPLICABLE50=(CommonTree)match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli526); 
            DUPLICABLE50_tree = (CommonTree)adaptor.dupNode(DUPLICABLE50);

            adaptor.addChild(root_0, DUPLICABLE50_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dupli"

    public static class view_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "view"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:94:1: view[SymbolTable st] returns [Code c] : ( FIRST | THIRD );
    public final hightTree.view_return view(SymbolTable st) throws RecognitionException {
        hightTree.view_return retval = new hightTree.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set51=null;

        CommonTree set51_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:94:39: ( FIRST | THIRD )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set51=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=FIRST && input.LA(1)<=THIRD) ) {
                input.consume();

                set51_tree = (CommonTree)adaptor.dupNode(set51);

                adaptor.addChild(root_0, set51_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "view"

    public static class affectationObjet_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectationObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:99:1: affectationObjet[SymbolTable st] returns [Code c] : ( ^( ALLOCATION_KW IDENT ( valAggregation[st] )? ) | ^( ALLOCATION_KW attribut[st] typeAllocation[st] ) | ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st] ) );
    public final hightTree.affectationObjet_return affectationObjet(SymbolTable st) throws RecognitionException {
        hightTree.affectationObjet_return retval = new hightTree.affectationObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALLOCATION_KW52=null;
        CommonTree IDENT53=null;
        CommonTree ALLOCATION_KW55=null;
        CommonTree ALLOCATION_KW58=null;
        CommonTree ALLOCATION_KW61=null;
        CommonTree IDENT63=null;
        CommonTree ALLOCATION_KW64=null;
        hightTree.valAggregation_return valAggregation54 = null;

        hightTree.attribut_return attribut56 = null;

        hightTree.typeAllocation_return typeAllocation57 = null;

        hightTree.typeCoordonnees_return typeCoordonnees59 = null;

        hightTree.coordinates_return coordinates60 = null;

        hightTree.attributListeOuObjet_return attributListeOuObjet62 = null;

        hightTree.attributTps_return attributTps65 = null;

        hightTree.operation_return operation66 = null;

        hightTree.timeUnit_return timeUnit67 = null;


        CommonTree ALLOCATION_KW52_tree=null;
        CommonTree IDENT53_tree=null;
        CommonTree ALLOCATION_KW55_tree=null;
        CommonTree ALLOCATION_KW58_tree=null;
        CommonTree ALLOCATION_KW61_tree=null;
        CommonTree IDENT63_tree=null;
        CommonTree ALLOCATION_KW64_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:99:51: ( ^( ALLOCATION_KW IDENT ( valAggregation[st] )? ) | ^( ALLOCATION_KW attribut[st] typeAllocation[st] ) | ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st] ) | ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) | ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st] ) )
            int alt21=5;
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
                        alt21=2;
                        }
                        break;
                    case POSITION:
                    case ORIENTATION:
                    case SIZE:
                        {
                        alt21=3;
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
                        alt21=4;
                        }
                        break;
                    case BOOST_INTERVAL:
                    case SHOOT_INTERVAL:
                    case RELOAD_TIME:
                        {
                        alt21=5;
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:100:2: ^( ALLOCATION_KW IDENT ( valAggregation[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ALLOCATION_KW52=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet567); 
                    ALLOCATION_KW52_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW52);

                    root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW52_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT53=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet569); 
                    IDENT53_tree = (CommonTree)adaptor.dupNode(IDENT53);

                    adaptor.addChild(root_1, IDENT53_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:100:25: ( valAggregation[st] )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==AGGREGATION_KW) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:100:25: valAggregation[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_valAggregation_in_affectationObjet571);
                            valAggregation54=valAggregation(st);

                            state._fsp--;

                            adaptor.addChild(root_1, valAggregation54.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:101:4: ^( ALLOCATION_KW attribut[st] typeAllocation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ALLOCATION_KW55=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet581); 
                    ALLOCATION_KW55_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW55);

                    root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW55_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_attribut_in_affectationObjet583);
                    attribut56=attribut(st);

                    state._fsp--;

                    adaptor.addChild(root_1, attribut56.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeAllocation_in_affectationObjet586);
                    typeAllocation57=typeAllocation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeAllocation57.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:102:4: ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ALLOCATION_KW58=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet595); 
                    ALLOCATION_KW58_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW58);

                    root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW58_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeCoordonnees_in_affectationObjet597);
                    typeCoordonnees59=typeCoordonnees(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeCoordonnees59.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_coordinates_in_affectationObjet600);
                    coordinates60=coordinates(st);

                    state._fsp--;

                    adaptor.addChild(root_1, coordinates60.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:103:4: ^( ALLOCATION_KW attributListeOuObjet[st] IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ALLOCATION_KW61=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet609); 
                    ALLOCATION_KW61_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW61);

                    root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW61_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_attributListeOuObjet_in_affectationObjet611);
                    attributListeOuObjet62=attributListeOuObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_1, attributListeOuObjet62.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT63=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet614); 
                    IDENT63_tree = (CommonTree)adaptor.dupNode(IDENT63);

                    adaptor.addChild(root_1, IDENT63_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:104:4: ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ALLOCATION_KW64=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet622); 
                    ALLOCATION_KW64_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW64);

                    root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW64_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_attributTps_in_affectationObjet624);
                    attributTps65=attributTps(st);

                    state._fsp--;

                    adaptor.addChild(root_1, attributTps65.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_affectationObjet627);
                    operation66=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation66.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timeUnit_in_affectationObjet630);
                    timeUnit67=timeUnit(st);

                    state._fsp--;

                    adaptor.addChild(root_1, timeUnit67.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "affectationObjet"

    public static class typeAllocation_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeAllocation"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:107:1: typeAllocation[SymbolTable st] returns [Code c] : ( operation[st] | IDENT | 'true' | 'false' ) ;
    public final hightTree.typeAllocation_return typeAllocation(SymbolTable st) throws RecognitionException {
        hightTree.typeAllocation_return retval = new hightTree.typeAllocation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT69=null;
        CommonTree string_literal70=null;
        CommonTree string_literal71=null;
        hightTree.operation_return operation68 = null;


        CommonTree IDENT69_tree=null;
        CommonTree string_literal70_tree=null;
        CommonTree string_literal71_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:107:49: ( ( operation[st] | IDENT | 'true' | 'false' ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:108:2: ( operation[st] | IDENT | 'true' | 'false' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:108:2: ( operation[st] | IDENT | 'true' | 'false' )
            int alt22=4;
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
                alt22=1;
                }
                break;
            case IDENT:
                {
                alt22=2;
                }
                break;
            case 248:
                {
                alt22=3;
                }
                break;
            case 249:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:108:3: operation[st]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_typeAllocation657);
                    operation68=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, operation68.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:108:19: IDENT
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENT69=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeAllocation662); 
                    IDENT69_tree = (CommonTree)adaptor.dupNode(IDENT69);

                    adaptor.addChild(root_0, IDENT69_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:108:27: 'true'
                    {
                    _last = (CommonTree)input.LT(1);
                    string_literal70=(CommonTree)match(input,248,FOLLOW_248_in_typeAllocation666); 
                    string_literal70_tree = (CommonTree)adaptor.dupNode(string_literal70);

                    adaptor.addChild(root_0, string_literal70_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:108:36: 'false'
                    {
                    _last = (CommonTree)input.LT(1);
                    string_literal71=(CommonTree)match(input,249,FOLLOW_249_in_typeAllocation670); 
                    string_literal71_tree = (CommonTree)adaptor.dupNode(string_literal71);

                    adaptor.addChild(root_0, string_literal71_tree);


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeAllocation"

    public static class valAggregation_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valAggregation"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:111:1: valAggregation[SymbolTable st] returns [Code c] : ( ^( AGGREGATION_KW operation[st] ( timeUnit[st] )? ) | ^( AGGREGATION_KW IDENT ) );
    public final hightTree.valAggregation_return valAggregation(SymbolTable st) throws RecognitionException {
        hightTree.valAggregation_return retval = new hightTree.valAggregation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AGGREGATION_KW72=null;
        CommonTree AGGREGATION_KW75=null;
        CommonTree IDENT76=null;
        hightTree.operation_return operation73 = null;

        hightTree.timeUnit_return timeUnit74 = null;


        CommonTree AGGREGATION_KW72_tree=null;
        CommonTree AGGREGATION_KW75_tree=null;
        CommonTree IDENT76_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:111:49: ( ^( AGGREGATION_KW operation[st] ( timeUnit[st] )? ) | ^( AGGREGATION_KW IDENT ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==AGGREGATION_KW) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==DOWN) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==IDENT) ) {
                        alt24=2;
                    }
                    else if ( (LA24_2==GAME_SCORE_KW||LA24_2==VALUE_KW||(LA24_2>=VAR_I_KW && LA24_2<=VAR_A_KW)||LA24_2==FLOAT||LA24_2==RANDOM_KW||(LA24_2>=PLUS && LA24_2<=Z)) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:112:2: ^( AGGREGATION_KW operation[st] ( timeUnit[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AGGREGATION_KW72=(CommonTree)match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation689); 
                    AGGREGATION_KW72_tree = (CommonTree)adaptor.dupNode(AGGREGATION_KW72);

                    root_1 = (CommonTree)adaptor.becomeRoot(AGGREGATION_KW72_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_valAggregation691);
                    operation73=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation73.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:112:33: ( timeUnit[st] )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=MIN && LA23_0<=FRAME)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:112:33: timeUnit[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_timeUnit_in_valAggregation694);
                            timeUnit74=timeUnit(st);

                            state._fsp--;

                            adaptor.addChild(root_1, timeUnit74.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:113:3: ^( AGGREGATION_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AGGREGATION_KW75=(CommonTree)match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation702); 
                    AGGREGATION_KW75_tree = (CommonTree)adaptor.dupNode(AGGREGATION_KW75);

                    root_1 = (CommonTree)adaptor.becomeRoot(AGGREGATION_KW75_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT76=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_valAggregation704); 
                    IDENT76_tree = (CommonTree)adaptor.dupNode(IDENT76);

                    adaptor.addChild(root_1, IDENT76_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "valAggregation"

    public static class definition_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:117:1: definition[SymbolTable st] returns [Code c] : ^( DEFINITION_KW IDENT consequences[st] ) ;
    public final hightTree.definition_return definition(SymbolTable st) throws RecognitionException {
        hightTree.definition_return retval = new hightTree.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFINITION_KW77=null;
        CommonTree IDENT78=null;
        hightTree.consequences_return consequences79 = null;


        CommonTree DEFINITION_KW77_tree=null;
        CommonTree IDENT78_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:117:45: ( ^( DEFINITION_KW IDENT consequences[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:118:2: ^( DEFINITION_KW IDENT consequences[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DEFINITION_KW77=(CommonTree)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition727); 
            DEFINITION_KW77_tree = (CommonTree)adaptor.dupNode(DEFINITION_KW77);

            root_1 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW77_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENT78=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definition729); 
            IDENT78_tree = (CommonTree)adaptor.dupNode(IDENT78);

            adaptor.addChild(root_1, IDENT78_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_consequences_in_definition731);
            consequences79=consequences(st);

            state._fsp--;

            adaptor.addChild(root_1, consequences79.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "definition"

    public static class consequences_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consequences"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:121:1: consequences[SymbolTable st] returns [Code c] : ^( CONSEQUENCES_KW consequ_list[st] ) ;
    public final hightTree.consequences_return consequences(SymbolTable st) throws RecognitionException {
        hightTree.consequences_return retval = new hightTree.consequences_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONSEQUENCES_KW80=null;
        hightTree.consequ_list_return consequ_list81 = null;


        CommonTree CONSEQUENCES_KW80_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:121:47: ( ^( CONSEQUENCES_KW consequ_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:122:2: ^( CONSEQUENCES_KW consequ_list[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CONSEQUENCES_KW80=(CommonTree)match(input,CONSEQUENCES_KW,FOLLOW_CONSEQUENCES_KW_in_consequences751); 
            CONSEQUENCES_KW80_tree = (CommonTree)adaptor.dupNode(CONSEQUENCES_KW80);

            root_1 = (CommonTree)adaptor.becomeRoot(CONSEQUENCES_KW80_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_consequ_list_in_consequences753);
            consequ_list81=consequ_list(st);

            state._fsp--;

            adaptor.addChild(root_1, consequ_list81.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consequences"

    public static class consequ_list_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consequ_list"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:125:1: consequ_list[SymbolTable st] returns [Code c] : ( consequ[st] )+ ;
    public final hightTree.consequ_list_return consequ_list(SymbolTable st) throws RecognitionException {
        hightTree.consequ_list_return retval = new hightTree.consequ_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.consequ_return consequ82 = null;



        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:125:47: ( ( consequ[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:126:3: ( consequ[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:126:3: ( consequ[st] )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENT||LA25_0==CAMERA||LA25_0==MEDIA||(LA25_0>=PLAYER && LA25_0<=NEUTRAL)||(LA25_0>=VICTORY_KW && LA25_0<=MUTE_KW)||(LA25_0>=PLAY_KW && LA25_0<=WAIT_KW)||LA25_0==SAVE_KW||(LA25_0>=ACTIVATE_KW && LA25_0<=DISABLE_KW)||LA25_0==IF_KW||LA25_0==PG||(LA25_0>=ASSIGN_KW && LA25_0<=INVERT_KW)||(LA25_0>=ALL && LA25_0<=NUM)||(LA25_0>=COUNTER && LA25_0<=TELEPORTER)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:126:3: consequ[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_consequ_in_consequ_list772);
            	    consequ82=consequ(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, consequ82.getTree());

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consequ_list"

    public static class consequ_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consequ"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:128:1: consequ[SymbolTable st] returns [Code c] : ( siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW );
    public final hightTree.consequ_return consequ(SymbolTable st) throws RecognitionException {
        hightTree.consequ_return retval = new hightTree.consequ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT87=null;
        CommonTree VICTORY_KW88=null;
        CommonTree DEFEAT_KW89=null;
        hightTree.siAlors_return siAlors83 = null;

        hightTree.action_return action84 = null;

        hightTree.affectation_return affectation85 = null;

        hightTree.activCommande_return activCommande86 = null;


        CommonTree IDENT87_tree=null;
        CommonTree VICTORY_KW88_tree=null;
        CommonTree DEFEAT_KW89_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:128:42: ( siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW )
            int alt26=7;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:129:3: siAlors[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_siAlors_in_consequ791);
                    siAlors83=siAlors(st);

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors83.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:130:5: action[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_action_in_consequ798);
                    action84=action(st);

                    state._fsp--;

                    adaptor.addChild(root_0, action84.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:131:5: affectation[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_affectation_in_consequ805);
                    affectation85=affectation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, affectation85.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:132:5: activCommande[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_activCommande_in_consequ812);
                    activCommande86=activCommande(st);

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande86.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:133:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT87=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_consequ819); 
                    IDENT87_tree = (CommonTree)adaptor.dupNode(IDENT87);

                    adaptor.addChild(root_0, IDENT87_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:134:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    VICTORY_KW88=(CommonTree)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ825); 
                    VICTORY_KW88_tree = (CommonTree)adaptor.dupNode(VICTORY_KW88);

                    adaptor.addChild(root_0, VICTORY_KW88_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:135:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DEFEAT_KW89=(CommonTree)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ831); 
                    DEFEAT_KW89_tree = (CommonTree)adaptor.dupNode(DEFEAT_KW89);

                    adaptor.addChild(root_0, DEFEAT_KW89_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consequ"

    public static class action_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:138:1: action[SymbolTable st] returns [Code c] : ( accesClasse[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW ON IDENT ) | ^( MUTE_KW OFF IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClasse[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );
    public final hightTree.action_return action(SymbolTable st) throws RecognitionException {
        hightTree.action_return retval = new hightTree.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ENDS_KW92=null;
        CommonTree IDENT93=null;
        CommonTree ENDS_KW94=null;
        CommonTree GAME95=null;
        CommonTree STARTS_KW96=null;
        CommonTree IDENT97=null;
        CommonTree STARTS_KW98=null;
        CommonTree GAME99=null;
        CommonTree PAUSE_KW100=null;
        CommonTree IDENT101=null;
        CommonTree MUTE_KW102=null;
        CommonTree ON103=null;
        CommonTree IDENT104=null;
        CommonTree MUTE_KW105=null;
        CommonTree OFF106=null;
        CommonTree IDENT107=null;
        CommonTree PLAY_KW108=null;
        CommonTree IDENT109=null;
        CommonTree STOP_KW110=null;
        CommonTree IDENT111=null;
        CommonTree BLOCK_KW112=null;
        CommonTree EFFACE_KW116=null;
        CommonTree GENERATE_KW119=null;
        CommonTree WAIT_KW122=null;
        CommonTree SAVE_KW126=null;
        hightTree.accesClasse_return accesClasse90 = null;

        hightTree.actionObjet_return actionObjet91 = null;

        hightTree.transformation_return transformation113 = null;

        hightTree.accesClasse_return accesClasse114 = null;

        hightTree.coordinates_return coordinates115 = null;

        hightTree.typeAcces_return typeAcces117 = null;

        hightTree.typeDestination_return typeDestination118 = null;

        hightTree.typeAcces_return typeAcces120 = null;

        hightTree.typeDestination_return typeDestination121 = null;

        hightTree.operation_return operation123 = null;

        hightTree.timeUnit_return timeUnit124 = null;

        hightTree.consequences_return consequences125 = null;


        CommonTree ENDS_KW92_tree=null;
        CommonTree IDENT93_tree=null;
        CommonTree ENDS_KW94_tree=null;
        CommonTree GAME95_tree=null;
        CommonTree STARTS_KW96_tree=null;
        CommonTree IDENT97_tree=null;
        CommonTree STARTS_KW98_tree=null;
        CommonTree GAME99_tree=null;
        CommonTree PAUSE_KW100_tree=null;
        CommonTree IDENT101_tree=null;
        CommonTree MUTE_KW102_tree=null;
        CommonTree ON103_tree=null;
        CommonTree IDENT104_tree=null;
        CommonTree MUTE_KW105_tree=null;
        CommonTree OFF106_tree=null;
        CommonTree IDENT107_tree=null;
        CommonTree PLAY_KW108_tree=null;
        CommonTree IDENT109_tree=null;
        CommonTree STOP_KW110_tree=null;
        CommonTree IDENT111_tree=null;
        CommonTree BLOCK_KW112_tree=null;
        CommonTree EFFACE_KW116_tree=null;
        CommonTree GENERATE_KW119_tree=null;
        CommonTree WAIT_KW122_tree=null;
        CommonTree SAVE_KW126_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:138:41: ( accesClasse[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW ON IDENT ) | ^( MUTE_KW OFF IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClasse[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW )
            int alt29=15;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:139:2: accesClasse[st] actionObjet[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_action848);
                    accesClasse90=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse90.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionObjet_in_action851);
                    actionObjet91=actionObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet91.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:140:3: ^( ENDS_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ENDS_KW92=(CommonTree)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action857); 
                    ENDS_KW92_tree = (CommonTree)adaptor.dupNode(ENDS_KW92);

                    root_1 = (CommonTree)adaptor.becomeRoot(ENDS_KW92_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT93=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action859); 
                    IDENT93_tree = (CommonTree)adaptor.dupNode(IDENT93);

                    adaptor.addChild(root_1, IDENT93_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:141:3: ^( ENDS_KW GAME )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ENDS_KW94=(CommonTree)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action866); 
                    ENDS_KW94_tree = (CommonTree)adaptor.dupNode(ENDS_KW94);

                    root_1 = (CommonTree)adaptor.becomeRoot(ENDS_KW94_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    GAME95=(CommonTree)match(input,GAME,FOLLOW_GAME_in_action868); 
                    GAME95_tree = (CommonTree)adaptor.dupNode(GAME95);

                    adaptor.addChild(root_1, GAME95_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:142:3: ^( STARTS_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STARTS_KW96=(CommonTree)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action875); 
                    STARTS_KW96_tree = (CommonTree)adaptor.dupNode(STARTS_KW96);

                    root_1 = (CommonTree)adaptor.becomeRoot(STARTS_KW96_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT97=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action877); 
                    IDENT97_tree = (CommonTree)adaptor.dupNode(IDENT97);

                    adaptor.addChild(root_1, IDENT97_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:143:3: ^( STARTS_KW GAME )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STARTS_KW98=(CommonTree)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action883); 
                    STARTS_KW98_tree = (CommonTree)adaptor.dupNode(STARTS_KW98);

                    root_1 = (CommonTree)adaptor.becomeRoot(STARTS_KW98_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    GAME99=(CommonTree)match(input,GAME,FOLLOW_GAME_in_action885); 
                    GAME99_tree = (CommonTree)adaptor.dupNode(GAME99);

                    adaptor.addChild(root_1, GAME99_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:144:3: ^( PAUSE_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PAUSE_KW100=(CommonTree)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action891); 
                    PAUSE_KW100_tree = (CommonTree)adaptor.dupNode(PAUSE_KW100);

                    root_1 = (CommonTree)adaptor.becomeRoot(PAUSE_KW100_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT101=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action893); 
                    IDENT101_tree = (CommonTree)adaptor.dupNode(IDENT101);

                    adaptor.addChild(root_1, IDENT101_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:145:3: ^( MUTE_KW ON IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MUTE_KW102=(CommonTree)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action899); 
                    MUTE_KW102_tree = (CommonTree)adaptor.dupNode(MUTE_KW102);

                    root_1 = (CommonTree)adaptor.becomeRoot(MUTE_KW102_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ON103=(CommonTree)match(input,ON,FOLLOW_ON_in_action901); 
                    ON103_tree = (CommonTree)adaptor.dupNode(ON103);

                    adaptor.addChild(root_1, ON103_tree);

                    _last = (CommonTree)input.LT(1);
                    IDENT104=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action903); 
                    IDENT104_tree = (CommonTree)adaptor.dupNode(IDENT104);

                    adaptor.addChild(root_1, IDENT104_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:146:3: ^( MUTE_KW OFF IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MUTE_KW105=(CommonTree)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action909); 
                    MUTE_KW105_tree = (CommonTree)adaptor.dupNode(MUTE_KW105);

                    root_1 = (CommonTree)adaptor.becomeRoot(MUTE_KW105_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    OFF106=(CommonTree)match(input,OFF,FOLLOW_OFF_in_action911); 
                    OFF106_tree = (CommonTree)adaptor.dupNode(OFF106);

                    adaptor.addChild(root_1, OFF106_tree);

                    _last = (CommonTree)input.LT(1);
                    IDENT107=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action913); 
                    IDENT107_tree = (CommonTree)adaptor.dupNode(IDENT107);

                    adaptor.addChild(root_1, IDENT107_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:147:3: ^( PLAY_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLAY_KW108=(CommonTree)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action920); 
                    PLAY_KW108_tree = (CommonTree)adaptor.dupNode(PLAY_KW108);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLAY_KW108_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT109=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action922); 
                    IDENT109_tree = (CommonTree)adaptor.dupNode(IDENT109);

                    adaptor.addChild(root_1, IDENT109_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:148:3: ^( STOP_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STOP_KW110=(CommonTree)match(input,STOP_KW,FOLLOW_STOP_KW_in_action928); 
                    STOP_KW110_tree = (CommonTree)adaptor.dupNode(STOP_KW110);

                    root_1 = (CommonTree)adaptor.becomeRoot(STOP_KW110_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT111=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action930); 
                    IDENT111_tree = (CommonTree)adaptor.dupNode(IDENT111);

                    adaptor.addChild(root_1, IDENT111_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 11 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:149:3: ^( BLOCK_KW transformation[st] accesClasse[st] coordinates[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BLOCK_KW112=(CommonTree)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action936); 
                    BLOCK_KW112_tree = (CommonTree)adaptor.dupNode(BLOCK_KW112);

                    root_1 = (CommonTree)adaptor.becomeRoot(BLOCK_KW112_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_transformation_in_action938);
                    transformation113=transformation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, transformation113.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_action941);
                    accesClasse114=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse114.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_coordinates_in_action944);
                    coordinates115=coordinates(st);

                    state._fsp--;

                    adaptor.addChild(root_1, coordinates115.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 12 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:150:3: ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EFFACE_KW116=(CommonTree)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action951); 
                    EFFACE_KW116_tree = (CommonTree)adaptor.dupNode(EFFACE_KW116);

                    root_1 = (CommonTree)adaptor.becomeRoot(EFFACE_KW116_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeAcces_in_action953);
                    typeAcces117=typeAcces(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeAcces117.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:150:29: ( typeDestination[st] )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==COORDINATE_KW||LA27_0==IDENT||LA27_0==PLAYER||LA27_0==NUM) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:150:29: typeDestination[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_typeDestination_in_action956);
                            typeDestination118=typeDestination(st);

                            state._fsp--;

                            adaptor.addChild(root_1, typeDestination118.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 13 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:151:3: ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GENERATE_KW119=(CommonTree)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action964); 
                    GENERATE_KW119_tree = (CommonTree)adaptor.dupNode(GENERATE_KW119);

                    root_1 = (CommonTree)adaptor.becomeRoot(GENERATE_KW119_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeAcces_in_action966);
                    typeAcces120=typeAcces(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeAcces120.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:151:31: ( typeDestination[st] )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==COORDINATE_KW||LA28_0==IDENT||LA28_0==PLAYER||LA28_0==NUM) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:151:31: typeDestination[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_typeDestination_in_action969);
                            typeDestination121=typeDestination(st);

                            state._fsp--;

                            adaptor.addChild(root_1, typeDestination121.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 14 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:152:3: ^( WAIT_KW operation[st] timeUnit[st] consequences[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WAIT_KW122=(CommonTree)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action977); 
                    WAIT_KW122_tree = (CommonTree)adaptor.dupNode(WAIT_KW122);

                    root_1 = (CommonTree)adaptor.becomeRoot(WAIT_KW122_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_action979);
                    operation123=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation123.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timeUnit_in_action982);
                    timeUnit124=timeUnit(st);

                    state._fsp--;

                    adaptor.addChild(root_1, timeUnit124.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_consequences_in_action985);
                    consequences125=consequences(st);

                    state._fsp--;

                    adaptor.addChild(root_1, consequences125.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 15 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:153:3: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    SAVE_KW126=(CommonTree)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action991); 
                    SAVE_KW126_tree = (CommonTree)adaptor.dupNode(SAVE_KW126);

                    adaptor.addChild(root_0, SAVE_KW126_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action"

    public static class typeAcces_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeAcces"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:156:1: typeAcces[SymbolTable st] returns [Code c] : ( accesLocal[st] | operation[st] ( IDENT | accesGlobal[st] ) );
    public final hightTree.typeAcces_return typeAcces(SymbolTable st) throws RecognitionException {
        hightTree.typeAcces_return retval = new hightTree.typeAcces_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT129=null;
        hightTree.accesLocal_return accesLocal127 = null;

        hightTree.operation_return operation128 = null;

        hightTree.accesGlobal_return accesGlobal130 = null;


        CommonTree IDENT129_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:156:44: ( accesLocal[st] | operation[st] ( IDENT | accesGlobal[st] ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT||LA31_0==PLAYER||LA31_0==NUM) ) {
                alt31=1;
            }
            else if ( (LA31_0==GAME_SCORE_KW||LA31_0==VALUE_KW||(LA31_0>=VAR_I_KW && LA31_0<=VAR_A_KW)||LA31_0==FLOAT||LA31_0==RANDOM_KW||(LA31_0>=PLUS && LA31_0<=Z)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:157:2: accesLocal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_typeAcces1007);
                    accesLocal127=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal127.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:157:19: operation[st] ( IDENT | accesGlobal[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_typeAcces1012);
                    operation128=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, operation128.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:157:33: ( IDENT | accesGlobal[st] )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENT) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==CAMERA||LA30_0==MEDIA||(LA30_0>=ALLY && LA30_0<=NEUTRAL)||LA30_0==PG||(LA30_0>=COUNTER && LA30_0<=TELEPORTER)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:157:34: IDENT
                            {
                            _last = (CommonTree)input.LT(1);
                            IDENT129=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeAcces1016); 
                            IDENT129_tree = (CommonTree)adaptor.dupNode(IDENT129);

                            adaptor.addChild(root_0, IDENT129_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:157:42: accesGlobal[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_accesGlobal_in_typeAcces1020);
                            accesGlobal130=accesGlobal(st);

                            state._fsp--;

                            adaptor.addChild(root_0, accesGlobal130.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeAcces"

    public static class typeDestination_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDestination"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:1: typeDestination[SymbolTable st] returns [Code c] : ( accesLocal[st] | coordinates[st] );
    public final hightTree.typeDestination_return typeDestination(SymbolTable st) throws RecognitionException {
        hightTree.typeDestination_return retval = new hightTree.typeDestination_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.accesLocal_return accesLocal131 = null;

        hightTree.coordinates_return coordinates132 = null;



        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:50: ( accesLocal[st] | coordinates[st] )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IDENT||LA32_0==PLAYER||LA32_0==NUM) ) {
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:160:2: accesLocal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_typeDestination1037);
                    accesLocal131=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal131.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:160:19: coordinates[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_coordinates_in_typeDestination1042);
                    coordinates132=coordinates(st);

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates132.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeDestination"

    public static class actionObjet_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:162:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesLocal[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );
    public final hightTree.actionObjet_return actionObjet(SymbolTable st) throws RecognitionException {
        hightTree.actionObjet_return retval = new hightTree.actionObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DIES_KW133=null;
        CommonTree DURING135=null;
        CommonTree UNTIL139=null;
        CommonTree EQUIP142=null;
        CommonTree EQUIP144=null;
        CommonTree NEXT145=null;
        CommonTree EQUIP146=null;
        CommonTree PREVIOUS147=null;
        hightTree.actionCommandePressee_return actionCommandePressee134 = null;

        hightTree.actionCommandeMaintenue_return actionCommandeMaintenue136 = null;

        hightTree.operation_return operation137 = null;

        hightTree.timeUnit_return timeUnit138 = null;

        hightTree.actionCommandeMaintenue_return actionCommandeMaintenue140 = null;

        hightTree.conditions_return conditions141 = null;

        hightTree.accesLocal_return accesLocal143 = null;


        CommonTree DIES_KW133_tree=null;
        CommonTree DURING135_tree=null;
        CommonTree UNTIL139_tree=null;
        CommonTree EQUIP142_tree=null;
        CommonTree EQUIP144_tree=null;
        CommonTree NEXT145_tree=null;
        CommonTree EQUIP146_tree=null;
        CommonTree PREVIOUS147_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:162:46: ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesLocal[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) )
            int alt33=7;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:163:3: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DIES_KW133=(CommonTree)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1058); 
                    DIES_KW133_tree = (CommonTree)adaptor.dupNode(DIES_KW133);

                    adaptor.addChild(root_0, DIES_KW133_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:164:5: actionCommandePressee[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1064);
                    actionCommandePressee134=actionCommandePressee(st);

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee134.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:165:4: ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DURING135=(CommonTree)match(input,DURING,FOLLOW_DURING_in_actionObjet1071); 
                    DURING135_tree = (CommonTree)adaptor.dupNode(DURING135);

                    root_1 = (CommonTree)adaptor.becomeRoot(DURING135_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1073);
                    actionCommandeMaintenue136=actionCommandeMaintenue(st);

                    state._fsp--;

                    adaptor.addChild(root_1, actionCommandeMaintenue136.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_actionObjet1076);
                    operation137=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation137.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timeUnit_in_actionObjet1079);
                    timeUnit138=timeUnit(st);

                    state._fsp--;

                    adaptor.addChild(root_1, timeUnit138.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:166:4: ^( UNTIL actionCommandeMaintenue[st] conditions[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UNTIL139=(CommonTree)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1087); 
                    UNTIL139_tree = (CommonTree)adaptor.dupNode(UNTIL139);

                    root_1 = (CommonTree)adaptor.becomeRoot(UNTIL139_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1089);
                    actionCommandeMaintenue140=actionCommandeMaintenue(st);

                    state._fsp--;

                    adaptor.addChild(root_1, actionCommandeMaintenue140.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_actionObjet1092);
                    conditions141=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions141.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:167:4: ^( EQUIP accesLocal[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUIP142=(CommonTree)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1100); 
                    EQUIP142_tree = (CommonTree)adaptor.dupNode(EQUIP142);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUIP142_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_actionObjet1102);
                    accesLocal143=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesLocal143.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:168:4: ^( EQUIP NEXT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUIP144=(CommonTree)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1111); 
                    EQUIP144_tree = (CommonTree)adaptor.dupNode(EQUIP144);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUIP144_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NEXT145=(CommonTree)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1113); 
                    NEXT145_tree = (CommonTree)adaptor.dupNode(NEXT145);

                    adaptor.addChild(root_1, NEXT145_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:169:4: ^( EQUIP PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUIP146=(CommonTree)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1121); 
                    EQUIP146_tree = (CommonTree)adaptor.dupNode(EQUIP146);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUIP146_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    PREVIOUS147=(CommonTree)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1123); 
                    PREVIOUS147_tree = (CommonTree)adaptor.dupNode(PREVIOUS147);

                    adaptor.addChild(root_1, PREVIOUS147_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionObjet"

    public static class transformation_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "transformation"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:172:1: transformation[SymbolTable st] returns [Code c] : ( TRANSLATION | ROTATION | SCALE );
    public final hightTree.transformation_return transformation(SymbolTable st) throws RecognitionException {
        hightTree.transformation_return retval = new hightTree.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set148=null;

        CommonTree set148_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:172:49: ( TRANSLATION | ROTATION | SCALE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set148=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
                input.consume();

                set148_tree = (CommonTree)adaptor.dupNode(set148);

                adaptor.addChild(root_0, set148_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "transformation"

    public static class coordinates_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "coordinates"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:178:1: coordinates[SymbolTable st] returns [Code c] : ^( COORDINATE_KW operation[st] operation[st] operation[st] ) ;
    public final hightTree.coordinates_return coordinates(SymbolTable st) throws RecognitionException {
        hightTree.coordinates_return retval = new hightTree.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COORDINATE_KW149=null;
        hightTree.operation_return operation150 = null;

        hightTree.operation_return operation151 = null;

        hightTree.operation_return operation152 = null;


        CommonTree COORDINATE_KW149_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:178:46: ( ^( COORDINATE_KW operation[st] operation[st] operation[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:179:2: ^( COORDINATE_KW operation[st] operation[st] operation[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COORDINATE_KW149=(CommonTree)match(input,COORDINATE_KW,FOLLOW_COORDINATE_KW_in_coordinates1174); 
            COORDINATE_KW149_tree = (CommonTree)adaptor.dupNode(COORDINATE_KW149);

            root_1 = (CommonTree)adaptor.becomeRoot(COORDINATE_KW149_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_coordinates1176);
            operation150=operation(st);

            state._fsp--;

            adaptor.addChild(root_1, operation150.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_coordinates1179);
            operation151=operation(st);

            state._fsp--;

            adaptor.addChild(root_1, operation151.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_coordinates1182);
            operation152=operation(st);

            state._fsp--;

            adaptor.addChild(root_1, operation152.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "coordinates"

    public static class commande_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commande"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:184:1: commande[SymbolTable st] returns [Code c] : ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) ;
    public final hightTree.commande_return commande(SymbolTable st) throws RecognitionException {
        hightTree.commande_return retval = new hightTree.commande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COMMAND_KW153=null;
        CommonTree IDENT154=null;
        hightTree.actionCommande_list_return actionCommande_list155 = null;


        CommonTree COMMAND_KW153_tree=null;
        CommonTree IDENT154_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:184:43: ( ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:185:2: ^( COMMAND_KW ( IDENT )? actionCommande_list[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COMMAND_KW153=(CommonTree)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1204); 
            COMMAND_KW153_tree = (CommonTree)adaptor.dupNode(COMMAND_KW153);

            root_1 = (CommonTree)adaptor.becomeRoot(COMMAND_KW153_tree, root_1);



            match(input, Token.DOWN, null); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:185:15: ( IDENT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==IDENT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:185:15: IDENT
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENT154=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_commande1206); 
                    IDENT154_tree = (CommonTree)adaptor.dupNode(IDENT154);

                    adaptor.addChild(root_1, IDENT154_tree);


                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_actionCommande_list_in_commande1209);
            actionCommande_list155=actionCommande_list(st);

            state._fsp--;

            adaptor.addChild(root_1, actionCommande_list155.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commande"

    public static class actionCommande_list_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommande_list"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:188:1: actionCommande_list[SymbolTable st] returns [Code c] : ( actionCommande[st] )+ ;
    public final hightTree.actionCommande_list_return actionCommande_list(SymbolTable st) throws RecognitionException {
        hightTree.actionCommande_list_return retval = new hightTree.actionCommande_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.actionCommande_return actionCommande156 = null;



        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:188:53: ( ( actionCommande[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:189:2: ( actionCommande[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:189:2: ( actionCommande[st] )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=MOUSE_KW && LA35_0<=KEY_KW)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:189:2: actionCommande[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_actionCommande_in_actionCommande_list1227);
            	    actionCommande156=actionCommande(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionCommande156.getTree());

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionCommande_list"

    public static class actionCommande_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommande"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:192:1: actionCommande[SymbolTable st] returns [Code c] : ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) );
    public final hightTree.actionCommande_return actionCommande(SymbolTable st) throws RecognitionException {
        hightTree.actionCommande_return retval = new hightTree.actionCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MOUSE_KW157=null;
        CommonTree KEY_KW160=null;
        hightTree.souris_return souris158 = null;

        hightTree.actionCommandeType_return actionCommandeType159 = null;

        hightTree.clavier_return clavier161 = null;

        hightTree.actionCommandeType_return actionCommandeType162 = null;


        CommonTree MOUSE_KW157_tree=null;
        CommonTree KEY_KW160_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:192:49: ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:193:2: ^( MOUSE_KW souris[st] actionCommandeType[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MOUSE_KW157=(CommonTree)match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande1247); 
                    MOUSE_KW157_tree = (CommonTree)adaptor.dupNode(MOUSE_KW157);

                    root_1 = (CommonTree)adaptor.becomeRoot(MOUSE_KW157_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_souris_in_actionCommande1249);
                        souris158=souris(st);

                        state._fsp--;

                        adaptor.addChild(root_1, souris158.getTree());
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_actionCommandeType_in_actionCommande1252);
                        actionCommandeType159=actionCommandeType(st);

                        state._fsp--;

                        adaptor.addChild(root_1, actionCommandeType159.getTree());

                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:194:3: ^( KEY_KW clavier[st] actionCommandeType[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    KEY_KW160=(CommonTree)match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande1260); 
                    KEY_KW160_tree = (CommonTree)adaptor.dupNode(KEY_KW160);

                    root_1 = (CommonTree)adaptor.becomeRoot(KEY_KW160_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_clavier_in_actionCommande1262);
                        clavier161=clavier(st);

                        state._fsp--;

                        adaptor.addChild(root_1, clavier161.getTree());
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_actionCommandeType_in_actionCommande1265);
                        actionCommandeType162=actionCommandeType(st);

                        state._fsp--;

                        adaptor.addChild(root_1, actionCommandeType162.getTree());

                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionCommande"

    public static class actionCommandeType_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommandeType"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:197:1: actionCommandeType[SymbolTable st] returns [Code c] : ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] );
    public final hightTree.actionCommandeType_return actionCommandeType(SymbolTable st) throws RecognitionException {
        hightTree.actionCommandeType_return retval = new hightTree.actionCommandeType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT163=null;
        hightTree.actionCommandePressee_return actionCommandePressee164 = null;

        hightTree.actionCommandeMaintenue_return actionCommandeMaintenue165 = null;


        CommonTree IDENT163_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:197:53: ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:198:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT163=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1284); 
                    IDENT163_tree = (CommonTree)adaptor.dupNode(IDENT163);

                    adaptor.addChild(root_0, IDENT163_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:198:10: actionCommandePressee[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1288);
                    actionCommandePressee164=actionCommandePressee(st);

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee164.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:198:38: actionCommandeMaintenue[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1293);
                    actionCommandeMaintenue165=actionCommandeMaintenue(st);

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue165.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionCommandeType"

    public static class souris_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "souris"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:201:1: souris[SymbolTable st] returns [Code c] : ( UP | DOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final hightTree.souris_return souris(SymbolTable st) throws RecognitionException {
        hightTree.souris_return retval = new hightTree.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set166=null;

        CommonTree set166_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:201:41: ( UP | DOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set166=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=DOWN && input.LA(1)<=UP)||(input.LA(1)>=LEFT && input.LA(1)<=SCROLL_DOWN) ) {
                input.consume();

                set166_tree = (CommonTree)adaptor.dupNode(set166);

                adaptor.addChild(root_0, set166_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "souris"

    public static class clavier_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clavier"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:205:1: clavier[SymbolTable st] returns [Code c] : ( LETTER | UP | DOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final hightTree.clavier_return clavier(SymbolTable st) throws RecognitionException {
        hightTree.clavier_return retval = new hightTree.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set167=null;

        CommonTree set167_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:205:42: ( LETTER | UP | DOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set167=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=DOWN && input.LA(1)<=UP)||(input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
                input.consume();

                set167_tree = (CommonTree)adaptor.dupNode(set167);

                adaptor.addChild(root_0, set167_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "clavier"

    public static class actionCommandePressee_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommandePressee"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:209:1: actionCommandePressee[SymbolTable st] returns [Code c] : ( JUMP operation[st] | PAUSE_KW | STOP_KW );
    public final hightTree.actionCommandePressee_return actionCommandePressee(SymbolTable st) throws RecognitionException {
        hightTree.actionCommandePressee_return retval = new hightTree.actionCommandePressee_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree JUMP168=null;
        CommonTree PAUSE_KW170=null;
        CommonTree STOP_KW171=null;
        hightTree.operation_return operation169 = null;


        CommonTree JUMP168_tree=null;
        CommonTree PAUSE_KW170_tree=null;
        CommonTree STOP_KW171_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:209:56: ( JUMP operation[st] | PAUSE_KW | STOP_KW )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:210:3: JUMP operation[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    JUMP168=(CommonTree)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1421); 
                    JUMP168_tree = (CommonTree)adaptor.dupNode(JUMP168);

                    adaptor.addChild(root_0, JUMP168_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_actionCommandePressee1423);
                    operation169=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, operation169.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:211:5: PAUSE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PAUSE_KW170=(CommonTree)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1430); 
                    PAUSE_KW170_tree = (CommonTree)adaptor.dupNode(PAUSE_KW170);

                    adaptor.addChild(root_0, PAUSE_KW170_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:212:5: STOP_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    STOP_KW171=(CommonTree)match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1436); 
                    STOP_KW171_tree = (CommonTree)adaptor.dupNode(STOP_KW171);

                    adaptor.addChild(root_0, STOP_KW171_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionCommandePressee"

    public static class actionCommandeMaintenue_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommandeMaintenue"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:215:1: actionCommandeMaintenue[SymbolTable st] returns [Code c] : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
    public final hightTree.actionCommandeMaintenue_return actionCommandeMaintenue(SymbolTable st) throws RecognitionException {
        hightTree.actionCommandeMaintenue_return retval = new hightTree.actionCommandeMaintenue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MOVE172=null;
        CommonTree set173=null;
        CommonTree TURN174=null;
        CommonTree set175=null;
        CommonTree ACCELERATE176=null;
        CommonTree BRAKE177=null;

        CommonTree MOVE172_tree=null;
        CommonTree set173_tree=null;
        CommonTree TURN174_tree=null;
        CommonTree set175_tree=null;
        CommonTree ACCELERATE176_tree=null;
        CommonTree BRAKE177_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:215:58: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:216:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    MOVE172=(CommonTree)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1456); 
                    MOVE172_tree = (CommonTree)adaptor.dupNode(MOVE172);

                    adaptor.addChild(root_0, MOVE172_tree);

                    _last = (CommonTree)input.LT(1);
                    set173=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=FORWARD && input.LA(1)<=BACKWARD) ) {
                        input.consume();

                        set173_tree = (CommonTree)adaptor.dupNode(set173);

                        adaptor.addChild(root_0, set173_tree);

                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:217:5: TURN ( LEFT | RIGHT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    TURN174=(CommonTree)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1478); 
                    TURN174_tree = (CommonTree)adaptor.dupNode(TURN174);

                    adaptor.addChild(root_0, TURN174_tree);

                    _last = (CommonTree)input.LT(1);
                    set175=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT) ) {
                        input.consume();

                        set175_tree = (CommonTree)adaptor.dupNode(set175);

                        adaptor.addChild(root_0, set175_tree);

                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:218:5: ACCELERATE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ACCELERATE176=(CommonTree)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1492); 
                    ACCELERATE176_tree = (CommonTree)adaptor.dupNode(ACCELERATE176);

                    adaptor.addChild(root_0, ACCELERATE176_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:219:5: BRAKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    BRAKE177=(CommonTree)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1498); 
                    BRAKE177_tree = (CommonTree)adaptor.dupNode(BRAKE177);

                    adaptor.addChild(root_0, BRAKE177_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionCommandeMaintenue"

    public static class activCommande_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activCommande"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:222:1: activCommande[SymbolTable st] returns [Code c] : ( ^( ACTIVATE_KW type_Command[st] ) | ^( DISABLE_KW type_Command[st] ) );
    public final hightTree.activCommande_return activCommande(SymbolTable st) throws RecognitionException {
        hightTree.activCommande_return retval = new hightTree.activCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ACTIVATE_KW178=null;
        CommonTree DISABLE_KW180=null;
        hightTree.type_Command_return type_Command179 = null;

        hightTree.type_Command_return type_Command181 = null;


        CommonTree ACTIVATE_KW178_tree=null;
        CommonTree DISABLE_KW180_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:222:48: ( ^( ACTIVATE_KW type_Command[st] ) | ^( DISABLE_KW type_Command[st] ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:223:3: ^( ACTIVATE_KW type_Command[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ACTIVATE_KW178=(CommonTree)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1519); 
                    ACTIVATE_KW178_tree = (CommonTree)adaptor.dupNode(ACTIVATE_KW178);

                    root_1 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW178_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_Command_in_activCommande1521);
                    type_Command179=type_Command(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_Command179.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:224:4: ^( DISABLE_KW type_Command[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DISABLE_KW180=(CommonTree)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1530); 
                    DISABLE_KW180_tree = (CommonTree)adaptor.dupNode(DISABLE_KW180);

                    root_1 = (CommonTree)adaptor.becomeRoot(DISABLE_KW180_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_Command_in_activCommande1532);
                    type_Command181=type_Command(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_Command181.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "activCommande"

    public static class type_Command_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_Command"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:227:1: type_Command[SymbolTable st] returns [Code c] : ( COMMANDS | MOUSE_KW ( souris[st] ( VIRG souris[st] )* )? | KEY_KW clavier[st] ( VIRG clavier[st] )* | KEYBOARD );
    public final hightTree.type_Command_return type_Command(SymbolTable st) throws RecognitionException {
        hightTree.type_Command_return retval = new hightTree.type_Command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COMMANDS182=null;
        CommonTree MOUSE_KW183=null;
        CommonTree VIRG185=null;
        CommonTree KEY_KW187=null;
        CommonTree VIRG189=null;
        CommonTree KEYBOARD191=null;
        hightTree.souris_return souris184 = null;

        hightTree.souris_return souris186 = null;

        hightTree.clavier_return clavier188 = null;

        hightTree.clavier_return clavier190 = null;


        CommonTree COMMANDS182_tree=null;
        CommonTree MOUSE_KW183_tree=null;
        CommonTree VIRG185_tree=null;
        CommonTree KEY_KW187_tree=null;
        CommonTree VIRG189_tree=null;
        CommonTree KEYBOARD191_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:227:47: ( COMMANDS | MOUSE_KW ( souris[st] ( VIRG souris[st] )* )? | KEY_KW clavier[st] ( VIRG clavier[st] )* | KEYBOARD )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:228:2: COMMANDS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    COMMANDS182=(CommonTree)match(input,COMMANDS,FOLLOW_COMMANDS_in_type_Command1550); 
                    COMMANDS182_tree = (CommonTree)adaptor.dupNode(COMMANDS182);

                    adaptor.addChild(root_0, COMMANDS182_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:229:4: MOUSE_KW ( souris[st] ( VIRG souris[st] )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    MOUSE_KW183=(CommonTree)match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_type_Command1556); 
                    MOUSE_KW183_tree = (CommonTree)adaptor.dupNode(MOUSE_KW183);

                    adaptor.addChild(root_0, MOUSE_KW183_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:229:13: ( souris[st] ( VIRG souris[st] )* )?
                    int alt42=2;
                    alt42 = dfa42.predict(input);
                    switch (alt42) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:229:14: souris[st] ( VIRG souris[st] )*
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_souris_in_type_Command1559);
                            souris184=souris(st);

                            state._fsp--;

                            adaptor.addChild(root_0, souris184.getTree());
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:229:25: ( VIRG souris[st] )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==VIRG) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:229:26: VIRG souris[st]
                            	    {
                            	    _last = (CommonTree)input.LT(1);
                            	    VIRG185=(CommonTree)match(input,VIRG,FOLLOW_VIRG_in_type_Command1563); 
                            	    _last = (CommonTree)input.LT(1);
                            	    pushFollow(FOLLOW_souris_in_type_Command1566);
                            	    souris186=souris(st);

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, souris186.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:230:4: KEY_KW clavier[st] ( VIRG clavier[st] )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    KEY_KW187=(CommonTree)match(input,KEY_KW,FOLLOW_KEY_KW_in_type_Command1576); 
                    KEY_KW187_tree = (CommonTree)adaptor.dupNode(KEY_KW187);

                    adaptor.addChild(root_0, KEY_KW187_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_clavier_in_type_Command1578);
                    clavier188=clavier(st);

                    state._fsp--;

                    adaptor.addChild(root_0, clavier188.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:230:23: ( VIRG clavier[st] )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==VIRG) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:230:24: VIRG clavier[st]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    VIRG189=(CommonTree)match(input,VIRG,FOLLOW_VIRG_in_type_Command1582); 
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_clavier_in_type_Command1585);
                    	    clavier190=clavier(st);

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, clavier190.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:231:4: KEYBOARD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    KEYBOARD191=(CommonTree)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_type_Command1594); 
                    KEYBOARD191_tree = (CommonTree)adaptor.dupNode(KEYBOARD191);

                    adaptor.addChild(root_0, KEYBOARD191_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_Command"

    public static class reglesJeu_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reglesJeu"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:233:1: reglesJeu[SymbolTable st] returns [Code c] : ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) ;
    public final hightTree.reglesJeu_return reglesJeu(SymbolTable st) throws RecognitionException {
        hightTree.reglesJeu_return retval = new hightTree.reglesJeu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RULE_KW192=null;
        CommonTree IDENT193=null;
        hightTree.declencheur_return declencheur194 = null;

        hightTree.consequences_return consequences195 = null;


        CommonTree RULE_KW192_tree=null;
        CommonTree IDENT193_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:233:44: ( ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:234:3: ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            RULE_KW192=(CommonTree)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1612); 
            RULE_KW192_tree = (CommonTree)adaptor.dupNode(RULE_KW192);

            root_1 = (CommonTree)adaptor.becomeRoot(RULE_KW192_tree, root_1);



            match(input, Token.DOWN, null); 
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:234:13: ( IDENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==IDENT) ) {
                int LA45_1 = input.LA(2);

                if ( ((LA45_1>=BECOMES_VAR_KW && LA45_1<=BECOMES_ID_KW)||LA45_1==IDENT||LA45_1==CAMERA||LA45_1==MEDIA||(LA45_1>=PLAYER && LA45_1<=NEUTRAL)||(LA45_1>=VICTORY_KW && LA45_1<=STARTS_KW)||LA45_1==PG||(LA45_1>=ALL && LA45_1<=NUM)||(LA45_1>=COUNTER && LA45_1<=TELEPORTER)) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:234:13: IDENT
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENT193=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1614); 
                    IDENT193_tree = (CommonTree)adaptor.dupNode(IDENT193);

                    adaptor.addChild(root_1, IDENT193_tree);


                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_declencheur_in_reglesJeu1617);
            declencheur194=declencheur(st);

            state._fsp--;

            adaptor.addChild(root_1, declencheur194.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_consequences_in_reglesJeu1620);
            consequences195=consequences(st);

            state._fsp--;

            adaptor.addChild(root_1, consequences195.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reglesJeu"

    public static class declencheur_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declencheur"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:237:1: declencheur[SymbolTable st] returns [Code c] : ( accesClasse[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW );
    public final hightTree.declencheur_return declencheur(SymbolTable st) throws RecognitionException {
        hightTree.declencheur_return retval = new hightTree.declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MOVES_KW197=null;
        CommonTree DIES_KW198=null;
        CommonTree ENDS_KW201=null;
        CommonTree STARTS_KW203=null;
        CommonTree BECOMES_VAR_KW205=null;
        CommonTree BECOMES_ID_KW208=null;
        CommonTree IDENT209=null;
        CommonTree VICTORY_KW211=null;
        CommonTree DEFEAT_KW212=null;
        hightTree.accesClasse_return accesClasse196 = null;

        hightTree.declencheurTK_return declencheurTK199 = null;

        hightTree.declencheurKT_return declencheurKT200 = null;

        hightTree.type_declencheur_return type_declencheur202 = null;

        hightTree.type_declencheur_return type_declencheur204 = null;

        hightTree.variable_return variable206 = null;

        hightTree.varOuNB_return varOuNB207 = null;

        hightTree.playerOuInteraction_return playerOuInteraction210 = null;


        CommonTree MOVES_KW197_tree=null;
        CommonTree DIES_KW198_tree=null;
        CommonTree ENDS_KW201_tree=null;
        CommonTree STARTS_KW203_tree=null;
        CommonTree BECOMES_VAR_KW205_tree=null;
        CommonTree BECOMES_ID_KW208_tree=null;
        CommonTree IDENT209_tree=null;
        CommonTree VICTORY_KW211_tree=null;
        CommonTree DEFEAT_KW212_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:237:46: ( accesClasse[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW )
            int alt47=7;
            switch ( input.LA(1) ) {
            case IDENT:
            case CAMERA:
            case MEDIA:
            case PLAYER:
            case ALLY:
            case ENEMY:
            case NEUTRAL:
            case PG:
            case ALL:
            case NUM:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:3: accesClasse[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_declencheur1641);
                    accesClasse196=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse196.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:19: ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:20: MOVES_KW
                            {
                            _last = (CommonTree)input.LT(1);
                            MOVES_KW197=(CommonTree)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1645); 
                            MOVES_KW197_tree = (CommonTree)adaptor.dupNode(MOVES_KW197);

                            adaptor.addChild(root_0, MOVES_KW197_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:31: DIES_KW
                            {
                            _last = (CommonTree)input.LT(1);
                            DIES_KW198=(CommonTree)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1649); 
                            DIES_KW198_tree = (CommonTree)adaptor.dupNode(DIES_KW198);

                            adaptor.addChild(root_0, DIES_KW198_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:41: declencheurTK[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1653);
                            declencheurTK199=declencheurTK(st);

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK199.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:61: declencheurKT[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1658);
                            declencheurKT200=declencheurKT(st);

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT200.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:239:4: ^( ENDS_KW type_declencheur[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ENDS_KW201=(CommonTree)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1667); 
                    ENDS_KW201_tree = (CommonTree)adaptor.dupNode(ENDS_KW201);

                    root_1 = (CommonTree)adaptor.becomeRoot(ENDS_KW201_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1669);
                    type_declencheur202=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur202.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:240:4: ^( STARTS_KW type_declencheur[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STARTS_KW203=(CommonTree)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1677); 
                    STARTS_KW203_tree = (CommonTree)adaptor.dupNode(STARTS_KW203);

                    root_1 = (CommonTree)adaptor.becomeRoot(STARTS_KW203_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1679);
                    type_declencheur204=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur204.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:241:4: ^( BECOMES_VAR_KW variable[st] varOuNB[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BECOMES_VAR_KW205=(CommonTree)match(input,BECOMES_VAR_KW,FOLLOW_BECOMES_VAR_KW_in_declencheur1697); 
                    BECOMES_VAR_KW205_tree = (CommonTree)adaptor.dupNode(BECOMES_VAR_KW205);

                    root_1 = (CommonTree)adaptor.becomeRoot(BECOMES_VAR_KW205_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_declencheur1699);
                    variable206=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable206.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOuNB_in_declencheur1702);
                    varOuNB207=varOuNB(st);

                    state._fsp--;

                    adaptor.addChild(root_1, varOuNB207.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:242:4: ^( BECOMES_ID_KW IDENT playerOuInteraction[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BECOMES_ID_KW208=(CommonTree)match(input,BECOMES_ID_KW,FOLLOW_BECOMES_ID_KW_in_declencheur1710); 
                    BECOMES_ID_KW208_tree = (CommonTree)adaptor.dupNode(BECOMES_ID_KW208);

                    root_1 = (CommonTree)adaptor.becomeRoot(BECOMES_ID_KW208_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT209=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declencheur1712); 
                    IDENT209_tree = (CommonTree)adaptor.dupNode(IDENT209);

                    adaptor.addChild(root_1, IDENT209_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1714);
                    playerOuInteraction210=playerOuInteraction(st);

                    state._fsp--;

                    adaptor.addChild(root_1, playerOuInteraction210.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:243:4: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    VICTORY_KW211=(CommonTree)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur1721); 
                    VICTORY_KW211_tree = (CommonTree)adaptor.dupNode(VICTORY_KW211);

                    adaptor.addChild(root_0, VICTORY_KW211_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:244:4: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DEFEAT_KW212=(CommonTree)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur1727); 
                    DEFEAT_KW212_tree = (CommonTree)adaptor.dupNode(DEFEAT_KW212);

                    adaptor.addChild(root_0, DEFEAT_KW212_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declencheur"

    public static class type_declencheur_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_declencheur"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:1: type_declencheur[SymbolTable st] returns [Code c] : ( IDENT | GAME );
    public final hightTree.type_declencheur_return type_declencheur(SymbolTable st) throws RecognitionException {
        hightTree.type_declencheur_return retval = new hightTree.type_declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set213=null;

        CommonTree set213_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:51: ( IDENT | GAME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set213=(CommonTree)input.LT(1);
            if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                input.consume();

                set213_tree = (CommonTree)adaptor.dupNode(set213);

                adaptor.addChild(root_0, set213_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_declencheur"

    public static class varOuNB_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varOuNB"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:250:1: varOuNB[SymbolTable st] returns [Code c] : ( variable[st] | FLOAT );
    public final hightTree.varOuNB_return varOuNB(SymbolTable st) throws RecognitionException {
        hightTree.varOuNB_return retval = new hightTree.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FLOAT215=null;
        hightTree.variable_return variable214 = null;


        CommonTree FLOAT215_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:250:42: ( variable[st] | FLOAT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:250:44: variable[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_varOuNB1763);
                    variable214=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_0, variable214.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:250:59: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    FLOAT215=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB1768); 
                    FLOAT215_tree = (CommonTree)adaptor.dupNode(FLOAT215);

                    adaptor.addChild(root_0, FLOAT215_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varOuNB"

    public static class playerOuInteraction_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "playerOuInteraction"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:252:1: playerOuInteraction[SymbolTable st] returns [Code c] : ( PLAYER | interaction[st] ) ;
    public final hightTree.playerOuInteraction_return playerOuInteraction(SymbolTable st) throws RecognitionException {
        hightTree.playerOuInteraction_return retval = new hightTree.playerOuInteraction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PLAYER216=null;
        hightTree.interaction_return interaction217 = null;


        CommonTree PLAYER216_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:253:2: ( ( PLAYER | interaction[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:253:4: ( PLAYER | interaction[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:253:4: ( PLAYER | interaction[st] )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:253:5: PLAYER
                    {
                    _last = (CommonTree)input.LT(1);
                    PLAYER216=(CommonTree)match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction1784); 
                    PLAYER216_tree = (CommonTree)adaptor.dupNode(PLAYER216);

                    adaptor.addChild(root_0, PLAYER216_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:253:13: interaction[st]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction1787);
                    interaction217=interaction(st);

                    state._fsp--;

                    adaptor.addChild(root_0, interaction217.getTree());

                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "playerOuInteraction"

    public static class declencheurTK_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declencheurTK"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:255:1: declencheurTK[SymbolTable st] returns [Code c] : ( ^( TOUCHES_KW declencheur_O[st] ) | ^( KILLS_KW declencheur_O[st] ) );
    public final hightTree.declencheurTK_return declencheurTK(SymbolTable st) throws RecognitionException {
        hightTree.declencheurTK_return retval = new hightTree.declencheurTK_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TOUCHES_KW218=null;
        CommonTree KILLS_KW220=null;
        hightTree.declencheur_O_return declencheur_O219 = null;

        hightTree.declencheur_O_return declencheur_O221 = null;


        CommonTree TOUCHES_KW218_tree=null;
        CommonTree KILLS_KW220_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:256:2: ( ^( TOUCHES_KW declencheur_O[st] ) | ^( KILLS_KW declencheur_O[st] ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==TOUCHES_KW) ) {
                alt50=1;
            }
            else if ( (LA50_0==KILLS_KW) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:256:4: ^( TOUCHES_KW declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOUCHES_KW218=(CommonTree)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK1805); 
                    TOUCHES_KW218_tree = (CommonTree)adaptor.dupNode(TOUCHES_KW218);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW218_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_declencheurTK1807);
                    declencheur_O219=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O219.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:257:4: ^( KILLS_KW declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    KILLS_KW220=(CommonTree)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK1815); 
                    KILLS_KW220_tree = (CommonTree)adaptor.dupNode(KILLS_KW220);

                    root_1 = (CommonTree)adaptor.becomeRoot(KILLS_KW220_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_declencheurTK1817);
                    declencheur_O221=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O221.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declencheurTK"

    public static class declencheurKT_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declencheurKT"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:261:1: declencheurKT[SymbolTable st] returns [Code c] : ( ^( KILLED_KW declencheur_O[st] ) | ^( TOUCHED_KW declencheur_O[st] ) );
    public final hightTree.declencheurKT_return declencheurKT(SymbolTable st) throws RecognitionException {
        hightTree.declencheurKT_return retval = new hightTree.declencheurKT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree KILLED_KW222=null;
        CommonTree TOUCHED_KW224=null;
        hightTree.declencheur_O_return declencheur_O223 = null;

        hightTree.declencheur_O_return declencheur_O225 = null;


        CommonTree KILLED_KW222_tree=null;
        CommonTree TOUCHED_KW224_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:262:2: ( ^( KILLED_KW declencheur_O[st] ) | ^( TOUCHED_KW declencheur_O[st] ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KILLED_KW) ) {
                alt51=1;
            }
            else if ( (LA51_0==TOUCHED_KW) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:262:4: ^( KILLED_KW declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    KILLED_KW222=(CommonTree)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT1839); 
                    KILLED_KW222_tree = (CommonTree)adaptor.dupNode(KILLED_KW222);

                    root_1 = (CommonTree)adaptor.becomeRoot(KILLED_KW222_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_declencheurKT1841);
                    declencheur_O223=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O223.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:263:4: ^( TOUCHED_KW declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOUCHED_KW224=(CommonTree)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT1850); 
                    TOUCHED_KW224_tree = (CommonTree)adaptor.dupNode(TOUCHED_KW224);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW224_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_declencheurKT1852);
                    declencheur_O225=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O225.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declencheurKT"

    public static class declencheur_O_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declencheur_O"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:265:1: declencheur_O[SymbolTable st] returns [Code c] : ( ( OTHER )? accesGlobal[st] | accesLocal[st] );
    public final hightTree.declencheur_O_return declencheur_O(SymbolTable st) throws RecognitionException {
        hightTree.declencheur_O_return retval = new hightTree.declencheur_O_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OTHER226=null;
        hightTree.accesGlobal_return accesGlobal227 = null;

        hightTree.accesLocal_return accesLocal228 = null;


        CommonTree OTHER226_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:265:48: ( ( OTHER )? accesGlobal[st] | accesLocal[st] )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==CAMERA||LA53_0==MEDIA||(LA53_0>=ALLY && LA53_0<=NEUTRAL)||LA53_0==OTHER||LA53_0==PG||(LA53_0>=COUNTER && LA53_0<=TELEPORTER)) ) {
                alt53=1;
            }
            else if ( (LA53_0==IDENT||LA53_0==PLAYER||LA53_0==NUM) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:266:2: ( OTHER )? accesGlobal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:266:2: ( OTHER )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==OTHER) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:266:3: OTHER
                            {
                            _last = (CommonTree)input.LT(1);
                            OTHER226=(CommonTree)match(input,OTHER,FOLLOW_OTHER_in_declencheur_O1869); 
                            OTHER226_tree = (CommonTree)adaptor.dupNode(OTHER226);

                            adaptor.addChild(root_0, OTHER226_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesGlobal_in_declencheur_O1873);
                    accesGlobal227=accesGlobal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal227.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:266:29: accesLocal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_declencheur_O1878);
                    accesLocal228=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal228.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declencheur_O"

    public static class siAlors_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "siAlors"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:269:1: siAlors[SymbolTable st] returns [Code c] : ^( IF_KW conditions[st] consequences[st] ( consequences[st] )? ) ;
    public final hightTree.siAlors_return siAlors(SymbolTable st) throws RecognitionException {
        hightTree.siAlors_return retval = new hightTree.siAlors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IF_KW229=null;
        hightTree.conditions_return conditions230 = null;

        hightTree.consequences_return consequences231 = null;

        hightTree.consequences_return consequences232 = null;


        CommonTree IF_KW229_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:269:42: ( ^( IF_KW conditions[st] consequences[st] ( consequences[st] )? ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:270:3: ^( IF_KW conditions[st] consequences[st] ( consequences[st] )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IF_KW229=(CommonTree)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors1900); 
            IF_KW229_tree = (CommonTree)adaptor.dupNode(IF_KW229);

            root_1 = (CommonTree)adaptor.becomeRoot(IF_KW229_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_conditions_in_siAlors1902);
            conditions230=conditions(st);

            state._fsp--;

            adaptor.addChild(root_1, conditions230.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_consequences_in_siAlors1905);
            consequences231=consequences(st);

            state._fsp--;

            adaptor.addChild(root_1, consequences231.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:270:43: ( consequences[st] )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==CONSEQUENCES_KW) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:270:43: consequences[st]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_consequences_in_siAlors1908);
                    consequences232=consequences(st);

                    state._fsp--;

                    adaptor.addChild(root_1, consequences232.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "siAlors"

    public static class conditions_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditions"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:273:1: conditions[SymbolTable st] returns [Code c] : ( ^( CONDITION_KW ( NOT )? conditions[st] ) | ^( OR conditions[st] ( NOT )? conditions[st] ) | ^( AND conditions[st] ( NOT )? conditions[st] ) | ^( EQUALS operation[st] operation[st] ) | ^( INF operation[st] operation[st] ) | ^( SUP operation[st] operation[st] ) | ^( INFEG operation[st] operation[st] ) | ^( SUPED operation[st] operation[st] ) | ^( DIFF operation[st] operation[st] ) );
    public final hightTree.conditions_return conditions(SymbolTable st) throws RecognitionException {
        hightTree.conditions_return retval = new hightTree.conditions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_KW233=null;
        CommonTree NOT234=null;
        CommonTree OR236=null;
        CommonTree NOT238=null;
        CommonTree AND240=null;
        CommonTree NOT242=null;
        CommonTree EQUALS244=null;
        CommonTree INF247=null;
        CommonTree SUP250=null;
        CommonTree INFEG253=null;
        CommonTree SUPED256=null;
        CommonTree DIFF259=null;
        hightTree.conditions_return conditions235 = null;

        hightTree.conditions_return conditions237 = null;

        hightTree.conditions_return conditions239 = null;

        hightTree.conditions_return conditions241 = null;

        hightTree.conditions_return conditions243 = null;

        hightTree.operation_return operation245 = null;

        hightTree.operation_return operation246 = null;

        hightTree.operation_return operation248 = null;

        hightTree.operation_return operation249 = null;

        hightTree.operation_return operation251 = null;

        hightTree.operation_return operation252 = null;

        hightTree.operation_return operation254 = null;

        hightTree.operation_return operation255 = null;

        hightTree.operation_return operation257 = null;

        hightTree.operation_return operation258 = null;

        hightTree.operation_return operation260 = null;

        hightTree.operation_return operation261 = null;


        CommonTree CONDITION_KW233_tree=null;
        CommonTree NOT234_tree=null;
        CommonTree OR236_tree=null;
        CommonTree NOT238_tree=null;
        CommonTree AND240_tree=null;
        CommonTree NOT242_tree=null;
        CommonTree EQUALS244_tree=null;
        CommonTree INF247_tree=null;
        CommonTree SUP250_tree=null;
        CommonTree INFEG253_tree=null;
        CommonTree SUPED256_tree=null;
        CommonTree DIFF259_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:273:45: ( ^( CONDITION_KW ( NOT )? conditions[st] ) | ^( OR conditions[st] ( NOT )? conditions[st] ) | ^( AND conditions[st] ( NOT )? conditions[st] ) | ^( EQUALS operation[st] operation[st] ) | ^( INF operation[st] operation[st] ) | ^( SUP operation[st] operation[st] ) | ^( INFEG operation[st] operation[st] ) | ^( SUPED operation[st] operation[st] ) | ^( DIFF operation[st] operation[st] ) )
            int alt58=9;
            switch ( input.LA(1) ) {
            case CONDITION_KW:
                {
                alt58=1;
                }
                break;
            case OR:
                {
                alt58=2;
                }
                break;
            case AND:
                {
                alt58=3;
                }
                break;
            case EQUALS:
                {
                alt58=4;
                }
                break;
            case INF:
                {
                alt58=5;
                }
                break;
            case SUP:
                {
                alt58=6;
                }
                break;
            case INFEG:
                {
                alt58=7;
                }
                break;
            case SUPED:
                {
                alt58=8;
                }
                break;
            case DIFF:
                {
                alt58=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:3: ^( CONDITION_KW ( NOT )? conditions[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONDITION_KW233=(CommonTree)match(input,CONDITION_KW,FOLLOW_CONDITION_KW_in_conditions1930); 
                    CONDITION_KW233_tree = (CommonTree)adaptor.dupNode(CONDITION_KW233);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_KW233_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:18: ( NOT )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==NOT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:18: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT234=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions1932); 
                            NOT234_tree = (CommonTree)adaptor.dupNode(NOT234);

                            adaptor.addChild(root_1, NOT234_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1935);
                    conditions235=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions235.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:4: ^( OR conditions[st] ( NOT )? conditions[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    OR236=(CommonTree)match(input,OR,FOLLOW_OR_in_conditions1943); 
                    OR236_tree = (CommonTree)adaptor.dupNode(OR236);

                    root_1 = (CommonTree)adaptor.becomeRoot(OR236_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1945);
                    conditions237=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions237.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:24: ( NOT )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==NOT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:24: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT238=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions1948); 
                            NOT238_tree = (CommonTree)adaptor.dupNode(NOT238);

                            adaptor.addChild(root_1, NOT238_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1951);
                    conditions239=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions239.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:276:4: ^( AND conditions[st] ( NOT )? conditions[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AND240=(CommonTree)match(input,AND,FOLLOW_AND_in_conditions1959); 
                    AND240_tree = (CommonTree)adaptor.dupNode(AND240);

                    root_1 = (CommonTree)adaptor.becomeRoot(AND240_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1961);
                    conditions241=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions241.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:276:25: ( NOT )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==NOT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:276:25: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT242=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions1964); 
                            NOT242_tree = (CommonTree)adaptor.dupNode(NOT242);

                            adaptor.addChild(root_1, NOT242_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1967);
                    conditions243=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions243.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:277:4: ^( EQUALS operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUALS244=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_conditions1975); 
                    EQUALS244_tree = (CommonTree)adaptor.dupNode(EQUALS244);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS244_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions1977);
                    operation245=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation245.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions1980);
                    operation246=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation246.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:278:4: ^( INF operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INF247=(CommonTree)match(input,INF,FOLLOW_INF_in_conditions1988); 
                    INF247_tree = (CommonTree)adaptor.dupNode(INF247);

                    root_1 = (CommonTree)adaptor.becomeRoot(INF247_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions1990);
                    operation248=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation248.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions1992);
                    operation249=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation249.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:279:4: ^( SUP operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUP250=(CommonTree)match(input,SUP,FOLLOW_SUP_in_conditions2000); 
                    SUP250_tree = (CommonTree)adaptor.dupNode(SUP250);

                    root_1 = (CommonTree)adaptor.becomeRoot(SUP250_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2002);
                    operation251=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation251.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2005);
                    operation252=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation252.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:280:4: ^( INFEG operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INFEG253=(CommonTree)match(input,INFEG,FOLLOW_INFEG_in_conditions2013); 
                    INFEG253_tree = (CommonTree)adaptor.dupNode(INFEG253);

                    root_1 = (CommonTree)adaptor.becomeRoot(INFEG253_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2015);
                    operation254=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation254.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2018);
                    operation255=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation255.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:281:4: ^( SUPED operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUPED256=(CommonTree)match(input,SUPED,FOLLOW_SUPED_in_conditions2026); 
                    SUPED256_tree = (CommonTree)adaptor.dupNode(SUPED256);

                    root_1 = (CommonTree)adaptor.becomeRoot(SUPED256_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2028);
                    operation257=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation257.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2031);
                    operation258=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation258.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:282:4: ^( DIFF operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIFF259=(CommonTree)match(input,DIFF,FOLLOW_DIFF_in_conditions2039); 
                    DIFF259_tree = (CommonTree)adaptor.dupNode(DIFF259);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIFF259_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2041);
                    operation260=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation260.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2044);
                    operation261=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation261.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditions"

    public static class etat_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "etat"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:285:1: etat[SymbolTable st] returns [Code c] : ( ^( DEAD_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( ALIVE_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( EFFACED_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( GENERATED_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( TOUCHING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( MOVING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( WAITING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW );
    public final hightTree.etat_return etat(SymbolTable st) throws RecognitionException {
        hightTree.etat_return retval = new hightTree.etat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEAD_KW262=null;
        CommonTree NOT264=null;
        CommonTree ALIVE_KW266=null;
        CommonTree NOT268=null;
        CommonTree EFFACED_KW270=null;
        CommonTree NOT272=null;
        CommonTree GENERATED_KW274=null;
        CommonTree NOT276=null;
        CommonTree TOUCHING_KW278=null;
        CommonTree NOT280=null;
        CommonTree MOVING_KW282=null;
        CommonTree NOT284=null;
        CommonTree WAITING_KW286=null;
        CommonTree NOT288=null;
        CommonTree FINISHED_KW290=null;
        CommonTree NOT292=null;
        CommonTree STARTED_KW293=null;
        CommonTree NOT295=null;
        CommonTree PAUSED_KW296=null;
        CommonTree NOT298=null;
        CommonTree MUTED_KW299=null;
        CommonTree NOT301=null;
        CommonTree PLAYED_KW303=null;
        CommonTree NOT305=null;
        CommonTree STOPPED_KW306=null;
        CommonTree NOT308=null;
        CommonTree VICTORY_KW309=null;
        CommonTree DEFEAT_KW310=null;
        hightTree.accesClasse_return accesClasse263 = null;

        hightTree.declencheur_O_return declencheur_O265 = null;

        hightTree.accesClasse_return accesClasse267 = null;

        hightTree.declencheur_O_return declencheur_O269 = null;

        hightTree.accesClasse_return accesClasse271 = null;

        hightTree.declencheur_O_return declencheur_O273 = null;

        hightTree.accesClasse_return accesClasse275 = null;

        hightTree.declencheur_O_return declencheur_O277 = null;

        hightTree.accesClasse_return accesClasse279 = null;

        hightTree.declencheur_O_return declencheur_O281 = null;

        hightTree.accesClasse_return accesClasse283 = null;

        hightTree.declencheur_O_return declencheur_O285 = null;

        hightTree.accesClasse_return accesClasse287 = null;

        hightTree.declencheur_O_return declencheur_O289 = null;

        hightTree.type_declencheur_return type_declencheur291 = null;

        hightTree.type_declencheur_return type_declencheur294 = null;

        hightTree.type_declencheur_return type_declencheur297 = null;

        hightTree.type_declencheur_return type_declencheur300 = null;

        hightTree.mode_mute_return mode_mute302 = null;

        hightTree.type_declencheur_return type_declencheur304 = null;

        hightTree.type_declencheur_return type_declencheur307 = null;


        CommonTree DEAD_KW262_tree=null;
        CommonTree NOT264_tree=null;
        CommonTree ALIVE_KW266_tree=null;
        CommonTree NOT268_tree=null;
        CommonTree EFFACED_KW270_tree=null;
        CommonTree NOT272_tree=null;
        CommonTree GENERATED_KW274_tree=null;
        CommonTree NOT276_tree=null;
        CommonTree TOUCHING_KW278_tree=null;
        CommonTree NOT280_tree=null;
        CommonTree MOVING_KW282_tree=null;
        CommonTree NOT284_tree=null;
        CommonTree WAITING_KW286_tree=null;
        CommonTree NOT288_tree=null;
        CommonTree FINISHED_KW290_tree=null;
        CommonTree NOT292_tree=null;
        CommonTree STARTED_KW293_tree=null;
        CommonTree NOT295_tree=null;
        CommonTree PAUSED_KW296_tree=null;
        CommonTree NOT298_tree=null;
        CommonTree MUTED_KW299_tree=null;
        CommonTree NOT301_tree=null;
        CommonTree PLAYED_KW303_tree=null;
        CommonTree NOT305_tree=null;
        CommonTree STOPPED_KW306_tree=null;
        CommonTree NOT308_tree=null;
        CommonTree VICTORY_KW309_tree=null;
        CommonTree DEFEAT_KW310_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:285:39: ( ^( DEAD_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( ALIVE_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( EFFACED_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( GENERATED_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( TOUCHING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( MOVING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( WAITING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW )
            int alt72=15;
            switch ( input.LA(1) ) {
            case DEAD_KW:
                {
                alt72=1;
                }
                break;
            case ALIVE_KW:
                {
                alt72=2;
                }
                break;
            case EFFACED_KW:
                {
                alt72=3;
                }
                break;
            case GENERATED_KW:
                {
                alt72=4;
                }
                break;
            case TOUCHING_KW:
                {
                alt72=5;
                }
                break;
            case MOVING_KW:
                {
                alt72=6;
                }
                break;
            case WAITING_KW:
                {
                alt72=7;
                }
                break;
            case FINISHED_KW:
                {
                alt72=8;
                }
                break;
            case STARTED_KW:
                {
                alt72=9;
                }
                break;
            case PAUSED_KW:
                {
                alt72=10;
                }
                break;
            case MUTED_KW:
                {
                alt72=11;
                }
                break;
            case PLAYED_KW:
                {
                alt72=12;
                }
                break;
            case STOPPED_KW:
                {
                alt72=13;
                }
                break;
            case VICTORY_KW:
                {
                alt72=14;
                }
                break;
            case DEFEAT_KW:
                {
                alt72=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:286:2: ^( DEAD_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DEAD_KW262=(CommonTree)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2064); 
                    DEAD_KW262_tree = (CommonTree)adaptor.dupNode(DEAD_KW262);

                    root_1 = (CommonTree)adaptor.becomeRoot(DEAD_KW262_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2066);
                    accesClasse263=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse263.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:286:28: ( NOT )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==NOT) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:286:29: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT264=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2070); 
                            NOT264_tree = (CommonTree)adaptor.dupNode(NOT264);

                            adaptor.addChild(root_1, NOT264_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2074);
                    declencheur_O265=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O265.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:287:4: ^( ALIVE_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ALIVE_KW266=(CommonTree)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2082); 
                    ALIVE_KW266_tree = (CommonTree)adaptor.dupNode(ALIVE_KW266);

                    root_1 = (CommonTree)adaptor.becomeRoot(ALIVE_KW266_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2084);
                    accesClasse267=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse267.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:287:31: ( NOT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==NOT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:287:32: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT268=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2088); 
                            NOT268_tree = (CommonTree)adaptor.dupNode(NOT268);

                            adaptor.addChild(root_1, NOT268_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2092);
                    declencheur_O269=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O269.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:288:4: ^( EFFACED_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EFFACED_KW270=(CommonTree)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2100); 
                    EFFACED_KW270_tree = (CommonTree)adaptor.dupNode(EFFACED_KW270);

                    root_1 = (CommonTree)adaptor.becomeRoot(EFFACED_KW270_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2102);
                    accesClasse271=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse271.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:288:33: ( NOT )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==NOT) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:288:34: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT272=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2106); 
                            NOT272_tree = (CommonTree)adaptor.dupNode(NOT272);

                            adaptor.addChild(root_1, NOT272_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2110);
                    declencheur_O273=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O273.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:289:4: ^( GENERATED_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GENERATED_KW274=(CommonTree)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2118); 
                    GENERATED_KW274_tree = (CommonTree)adaptor.dupNode(GENERATED_KW274);

                    root_1 = (CommonTree)adaptor.becomeRoot(GENERATED_KW274_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2120);
                    accesClasse275=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse275.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:289:35: ( NOT )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==NOT) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:289:36: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT276=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2124); 
                            NOT276_tree = (CommonTree)adaptor.dupNode(NOT276);

                            adaptor.addChild(root_1, NOT276_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2128);
                    declencheur_O277=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O277.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:290:4: ^( TOUCHING_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOUCHING_KW278=(CommonTree)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2136); 
                    TOUCHING_KW278_tree = (CommonTree)adaptor.dupNode(TOUCHING_KW278);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW278_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2138);
                    accesClasse279=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse279.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:290:34: ( NOT )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==NOT) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:290:35: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT280=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2142); 
                            NOT280_tree = (CommonTree)adaptor.dupNode(NOT280);

                            adaptor.addChild(root_1, NOT280_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2146);
                    declencheur_O281=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O281.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:291:4: ^( MOVING_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MOVING_KW282=(CommonTree)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2154); 
                    MOVING_KW282_tree = (CommonTree)adaptor.dupNode(MOVING_KW282);

                    root_1 = (CommonTree)adaptor.becomeRoot(MOVING_KW282_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2156);
                    accesClasse283=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse283.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:291:32: ( NOT )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==NOT) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:291:33: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT284=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2160); 
                            NOT284_tree = (CommonTree)adaptor.dupNode(NOT284);

                            adaptor.addChild(root_1, NOT284_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2164);
                    declencheur_O285=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O285.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:292:4: ^( WAITING_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WAITING_KW286=(CommonTree)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2172); 
                    WAITING_KW286_tree = (CommonTree)adaptor.dupNode(WAITING_KW286);

                    root_1 = (CommonTree)adaptor.becomeRoot(WAITING_KW286_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2174);
                    accesClasse287=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse287.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:292:33: ( NOT )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==NOT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:292:34: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT288=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2178); 
                            NOT288_tree = (CommonTree)adaptor.dupNode(NOT288);

                            adaptor.addChild(root_1, NOT288_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2182);
                    declencheur_O289=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O289.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:293:4: ^( FINISHED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FINISHED_KW290=(CommonTree)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2190); 
                    FINISHED_KW290_tree = (CommonTree)adaptor.dupNode(FINISHED_KW290);

                    root_1 = (CommonTree)adaptor.becomeRoot(FINISHED_KW290_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2192);
                    type_declencheur291=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur291.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:293:39: ( NOT )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NOT) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:293:40: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT292=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2196); 
                            NOT292_tree = (CommonTree)adaptor.dupNode(NOT292);

                            adaptor.addChild(root_1, NOT292_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:294:4: ^( STARTED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STARTED_KW293=(CommonTree)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2205); 
                    STARTED_KW293_tree = (CommonTree)adaptor.dupNode(STARTED_KW293);

                    root_1 = (CommonTree)adaptor.becomeRoot(STARTED_KW293_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2207);
                    type_declencheur294=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur294.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:294:37: ( NOT )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==NOT) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:294:38: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT295=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2210); 
                            NOT295_tree = (CommonTree)adaptor.dupNode(NOT295);

                            adaptor.addChild(root_1, NOT295_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:295:4: ^( PAUSED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PAUSED_KW296=(CommonTree)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2219); 
                    PAUSED_KW296_tree = (CommonTree)adaptor.dupNode(PAUSED_KW296);

                    root_1 = (CommonTree)adaptor.becomeRoot(PAUSED_KW296_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2221);
                    type_declencheur297=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur297.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:295:36: ( NOT )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==NOT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:295:37: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT298=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2224); 
                            NOT298_tree = (CommonTree)adaptor.dupNode(NOT298);

                            adaptor.addChild(root_1, NOT298_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 11 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:4: ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MUTED_KW299=(CommonTree)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2233); 
                    MUTED_KW299_tree = (CommonTree)adaptor.dupNode(MUTED_KW299);

                    root_1 = (CommonTree)adaptor.becomeRoot(MUTED_KW299_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2235);
                    type_declencheur300=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur300.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:36: ( NOT )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NOT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:37: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT301=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2239); 
                            NOT301_tree = (CommonTree)adaptor.dupNode(NOT301);

                            adaptor.addChild(root_1, NOT301_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_mode_mute_in_etat2243);
                    mode_mute302=mode_mute(st);

                    state._fsp--;

                    adaptor.addChild(root_1, mode_mute302.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 12 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:297:4: ^( PLAYED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLAYED_KW303=(CommonTree)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2251); 
                    PLAYED_KW303_tree = (CommonTree)adaptor.dupNode(PLAYED_KW303);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLAYED_KW303_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2253);
                    type_declencheur304=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur304.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:297:37: ( NOT )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NOT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:297:38: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT305=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2257); 
                            NOT305_tree = (CommonTree)adaptor.dupNode(NOT305);

                            adaptor.addChild(root_1, NOT305_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 13 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:298:4: ^( STOPPED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STOPPED_KW306=(CommonTree)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2266); 
                    STOPPED_KW306_tree = (CommonTree)adaptor.dupNode(STOPPED_KW306);

                    root_1 = (CommonTree)adaptor.becomeRoot(STOPPED_KW306_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2268);
                    type_declencheur307=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur307.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:298:38: ( NOT )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NOT) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:298:39: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT308=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2272); 
                            NOT308_tree = (CommonTree)adaptor.dupNode(NOT308);

                            adaptor.addChild(root_1, NOT308_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 14 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:300:4: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    VICTORY_KW309=(CommonTree)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2283); 
                    VICTORY_KW309_tree = (CommonTree)adaptor.dupNode(VICTORY_KW309);

                    adaptor.addChild(root_0, VICTORY_KW309_tree);


                    }
                    break;
                case 15 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:301:4: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DEFEAT_KW310=(CommonTree)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2288); 
                    DEFEAT_KW310_tree = (CommonTree)adaptor.dupNode(DEFEAT_KW310);

                    adaptor.addChild(root_0, DEFEAT_KW310_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "etat"

    public static class mode_mute_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mode_mute"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:304:1: mode_mute[SymbolTable st] returns [Code c] : ( ON | OFF );
    public final hightTree.mode_mute_return mode_mute(SymbolTable st) throws RecognitionException {
        hightTree.mode_mute_return retval = new hightTree.mode_mute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set311=null;

        CommonTree set311_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:304:44: ( ON | OFF )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set311=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                input.consume();

                set311_tree = (CommonTree)adaptor.dupNode(set311);

                adaptor.addChild(root_0, set311_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mode_mute"

    public static class affectation_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectation"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:307:1: affectation[SymbolTable st] returns [Code c] : ( ^( ASSIGN_KW operation[st] variable[st] ) | ^( ADD_KW operation[st] variable[st] ) | ^( SUB_KW operation[st] variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) );
    public final hightTree.affectation_return affectation(SymbolTable st) throws RecognitionException {
        hightTree.affectation_return retval = new hightTree.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN_KW312=null;
        CommonTree ADD_KW315=null;
        CommonTree SUB_KW318=null;
        CommonTree INVERT_KW321=null;
        hightTree.operation_return operation313 = null;

        hightTree.variable_return variable314 = null;

        hightTree.operation_return operation316 = null;

        hightTree.variable_return variable317 = null;

        hightTree.operation_return operation319 = null;

        hightTree.variable_return variable320 = null;

        hightTree.variable_return variable322 = null;

        hightTree.variable_return variable323 = null;


        CommonTree ASSIGN_KW312_tree=null;
        CommonTree ADD_KW315_tree=null;
        CommonTree SUB_KW318_tree=null;
        CommonTree INVERT_KW321_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:307:46: ( ^( ASSIGN_KW operation[st] variable[st] ) | ^( ADD_KW operation[st] variable[st] ) | ^( SUB_KW operation[st] variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt73=1;
                }
                break;
            case ADD_KW:
                {
                alt73=2;
                }
                break;
            case SUB_KW:
                {
                alt73=3;
                }
                break;
            case INVERT_KW:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:308:3: ^( ASSIGN_KW operation[st] variable[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ASSIGN_KW312=(CommonTree)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2327); 
                    ASSIGN_KW312_tree = (CommonTree)adaptor.dupNode(ASSIGN_KW312);

                    root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW312_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_affectation2329);
                    operation313=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation313.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2332);
                    variable314=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable314.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:309:4: ^( ADD_KW operation[st] variable[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ADD_KW315=(CommonTree)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2340); 
                    ADD_KW315_tree = (CommonTree)adaptor.dupNode(ADD_KW315);

                    root_1 = (CommonTree)adaptor.becomeRoot(ADD_KW315_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_affectation2342);
                    operation316=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation316.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2345);
                    variable317=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable317.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:310:4: ^( SUB_KW operation[st] variable[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUB_KW318=(CommonTree)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2354); 
                    SUB_KW318_tree = (CommonTree)adaptor.dupNode(SUB_KW318);

                    root_1 = (CommonTree)adaptor.becomeRoot(SUB_KW318_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_affectation2356);
                    operation319=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation319.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2359);
                    variable320=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable320.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:311:4: ^( INVERT_KW variable[st] variable[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INVERT_KW321=(CommonTree)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2368); 
                    INVERT_KW321_tree = (CommonTree)adaptor.dupNode(INVERT_KW321);

                    root_1 = (CommonTree)adaptor.becomeRoot(INVERT_KW321_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2370);
                    variable322=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable322.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2373);
                    variable323=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable323.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "affectation"

    public static class iaBasique_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iaBasique"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:314:1: iaBasique[SymbolTable st] returns [Code c] : ^( IA_KW accesClasse[st] actionObjetList[st] ) ;
    public final hightTree.iaBasique_return iaBasique(SymbolTable st) throws RecognitionException {
        hightTree.iaBasique_return retval = new hightTree.iaBasique_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IA_KW324=null;
        hightTree.accesClasse_return accesClasse325 = null;

        hightTree.actionObjetList_return actionObjetList326 = null;


        CommonTree IA_KW324_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:314:44: ( ^( IA_KW accesClasse[st] actionObjetList[st] ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:314:46: ^( IA_KW accesClasse[st] actionObjetList[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IA_KW324=(CommonTree)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2394); 
            IA_KW324_tree = (CommonTree)adaptor.dupNode(IA_KW324);

            root_1 = (CommonTree)adaptor.becomeRoot(IA_KW324_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_accesClasse_in_iaBasique2396);
            accesClasse325=accesClasse(st);

            state._fsp--;

            adaptor.addChild(root_1, accesClasse325.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_actionObjetList_in_iaBasique2399);
            actionObjetList326=actionObjetList(st);

            state._fsp--;

            adaptor.addChild(root_1, actionObjetList326.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iaBasique"

    public static class actionObjetList_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionObjetList"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:316:1: actionObjetList[SymbolTable st] returns [Code c] : ( actionObjet[st] )+ ;
    public final hightTree.actionObjetList_return actionObjetList(SymbolTable st) throws RecognitionException {
        hightTree.actionObjetList_return retval = new hightTree.actionObjetList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.actionObjet_return actionObjet327 = null;



        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:316:50: ( ( actionObjet[st] )+ )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:316:52: ( actionObjet[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:316:52: ( actionObjet[st] )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==PAUSE_KW||LA74_0==STOP_KW||(LA74_0>=DIES_KW && LA74_0<=EQUIP)||LA74_0==JUMP) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:316:52: actionObjet[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_actionObjet_in_actionObjetList2414);
            	    actionObjet327=actionObjet(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionObjet327.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionObjetList"

    public static class operation_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:323:1: operation[SymbolTable st] returns [Code c] : ( ^( RANDOM_KW operation[st] operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | variable[st] | FLOAT );
    public final hightTree.operation_return operation(SymbolTable st) throws RecognitionException {
        hightTree.operation_return retval = new hightTree.operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RANDOM_KW328=null;
        CommonTree PLUS331=null;
        CommonTree MINUS334=null;
        CommonTree MUL337=null;
        CommonTree DIV340=null;
        CommonTree MOD343=null;
        CommonTree POW346=null;
        CommonTree FLOAT350=null;
        hightTree.operation_return operation329 = null;

        hightTree.operation_return operation330 = null;

        hightTree.operation_return operation332 = null;

        hightTree.operation_return operation333 = null;

        hightTree.operation_return operation335 = null;

        hightTree.operation_return operation336 = null;

        hightTree.operation_return operation338 = null;

        hightTree.operation_return operation339 = null;

        hightTree.operation_return operation341 = null;

        hightTree.operation_return operation342 = null;

        hightTree.operation_return operation344 = null;

        hightTree.operation_return operation345 = null;

        hightTree.operation_return operation347 = null;

        hightTree.operation_return operation348 = null;

        hightTree.variable_return variable349 = null;


        CommonTree RANDOM_KW328_tree=null;
        CommonTree PLUS331_tree=null;
        CommonTree MINUS334_tree=null;
        CommonTree MUL337_tree=null;
        CommonTree DIV340_tree=null;
        CommonTree MOD343_tree=null;
        CommonTree POW346_tree=null;
        CommonTree FLOAT350_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:323:44: ( ^( RANDOM_KW operation[st] operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | variable[st] | FLOAT )
            int alt75=9;
            switch ( input.LA(1) ) {
            case RANDOM_KW:
                {
                alt75=1;
                }
                break;
            case PLUS:
                {
                alt75=2;
                }
                break;
            case MINUS:
                {
                alt75=3;
                }
                break;
            case MUL:
                {
                alt75=4;
                }
                break;
            case DIV:
                {
                alt75=5;
                }
                break;
            case MOD:
                {
                alt75=6;
                }
                break;
            case POW:
                {
                alt75=7;
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
                alt75=8;
                }
                break;
            case FLOAT:
                {
                alt75=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:324:2: ^( RANDOM_KW operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    RANDOM_KW328=(CommonTree)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2439); 
                    RANDOM_KW328_tree = (CommonTree)adaptor.dupNode(RANDOM_KW328);

                    root_1 = (CommonTree)adaptor.becomeRoot(RANDOM_KW328_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2441);
                    operation329=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation329.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2444);
                    operation330=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation330.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:325:3: ^( PLUS operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS331=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_operation2451); 
                    PLUS331_tree = (CommonTree)adaptor.dupNode(PLUS331);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS331_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2453);
                    operation332=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation332.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2456);
                    operation333=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation333.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:326:3: ^( MINUS operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS334=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_operation2463); 
                    MINUS334_tree = (CommonTree)adaptor.dupNode(MINUS334);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS334_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2465);
                    operation335=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation335.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2468);
                    operation336=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation336.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:327:3: ^( MUL operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MUL337=(CommonTree)match(input,MUL,FOLLOW_MUL_in_operation2475); 
                    MUL337_tree = (CommonTree)adaptor.dupNode(MUL337);

                    root_1 = (CommonTree)adaptor.becomeRoot(MUL337_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2477);
                    operation338=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation338.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2480);
                    operation339=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation339.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:328:3: ^( DIV operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIV340=(CommonTree)match(input,DIV,FOLLOW_DIV_in_operation2487); 
                    DIV340_tree = (CommonTree)adaptor.dupNode(DIV340);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIV340_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2489);
                    operation341=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation341.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2492);
                    operation342=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation342.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:329:3: ^( MOD operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MOD343=(CommonTree)match(input,MOD,FOLLOW_MOD_in_operation2499); 
                    MOD343_tree = (CommonTree)adaptor.dupNode(MOD343);

                    root_1 = (CommonTree)adaptor.becomeRoot(MOD343_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2501);
                    operation344=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation344.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2504);
                    operation345=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation345.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:330:3: ^( POW operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    POW346=(CommonTree)match(input,POW,FOLLOW_POW_in_operation2511); 
                    POW346_tree = (CommonTree)adaptor.dupNode(POW346);

                    root_1 = (CommonTree)adaptor.becomeRoot(POW346_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2513);
                    operation347=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation347.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2516);
                    operation348=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation348.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:331:3: variable[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_operation2522);
                    variable349=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_0, variable349.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:332:3: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    FLOAT350=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_operation2527); 
                    FLOAT350_tree = (CommonTree)adaptor.dupNode(FLOAT350);

                    adaptor.addChild(root_0, FLOAT350_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operation"

    public static class variable_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:336:1: variable[SymbolTable st] returns [Code c] : ( ^( X typeCoordonnees[st] accesClasse[st] ) | ^( Y typeCoordonnees[st] accesClasse[st] ) | ^( Z typeCoordonnees[st] accesClasse[st] ) | ^( VAR_I_KW IDENT accesClasse[st] ) | ^( VAR_A_KW attribut[st] accesClasse[st] ) | GAME_SCORE_KW | ^( VALUE_KW attributTps[st] accesClasse[st] ) );
    public final hightTree.variable_return variable(SymbolTable st) throws RecognitionException {
        hightTree.variable_return retval = new hightTree.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree X351=null;
        CommonTree Y354=null;
        CommonTree Z357=null;
        CommonTree VAR_I_KW360=null;
        CommonTree IDENT361=null;
        CommonTree VAR_A_KW363=null;
        CommonTree GAME_SCORE_KW366=null;
        CommonTree VALUE_KW367=null;
        hightTree.typeCoordonnees_return typeCoordonnees352 = null;

        hightTree.accesClasse_return accesClasse353 = null;

        hightTree.typeCoordonnees_return typeCoordonnees355 = null;

        hightTree.accesClasse_return accesClasse356 = null;

        hightTree.typeCoordonnees_return typeCoordonnees358 = null;

        hightTree.accesClasse_return accesClasse359 = null;

        hightTree.accesClasse_return accesClasse362 = null;

        hightTree.attribut_return attribut364 = null;

        hightTree.accesClasse_return accesClasse365 = null;

        hightTree.attributTps_return attributTps368 = null;

        hightTree.accesClasse_return accesClasse369 = null;


        CommonTree X351_tree=null;
        CommonTree Y354_tree=null;
        CommonTree Z357_tree=null;
        CommonTree VAR_I_KW360_tree=null;
        CommonTree IDENT361_tree=null;
        CommonTree VAR_A_KW363_tree=null;
        CommonTree GAME_SCORE_KW366_tree=null;
        CommonTree VALUE_KW367_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:336:43: ( ^( X typeCoordonnees[st] accesClasse[st] ) | ^( Y typeCoordonnees[st] accesClasse[st] ) | ^( Z typeCoordonnees[st] accesClasse[st] ) | ^( VAR_I_KW IDENT accesClasse[st] ) | ^( VAR_A_KW attribut[st] accesClasse[st] ) | GAME_SCORE_KW | ^( VALUE_KW attributTps[st] accesClasse[st] ) )
            int alt76=7;
            switch ( input.LA(1) ) {
            case X:
                {
                alt76=1;
                }
                break;
            case Y:
                {
                alt76=2;
                }
                break;
            case Z:
                {
                alt76=3;
                }
                break;
            case VAR_I_KW:
                {
                alt76=4;
                }
                break;
            case VAR_A_KW:
                {
                alt76=5;
                }
                break;
            case GAME_SCORE_KW:
                {
                alt76=6;
                }
                break;
            case VALUE_KW:
                {
                alt76=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:337:3: ^( X typeCoordonnees[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    X351=(CommonTree)match(input,X,FOLLOW_X_in_variable2547); 
                    X351_tree = (CommonTree)adaptor.dupNode(X351);

                    root_1 = (CommonTree)adaptor.becomeRoot(X351_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2549);
                    typeCoordonnees352=typeCoordonnees(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeCoordonnees352.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2552);
                    accesClasse353=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse353.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:338:4: ^( Y typeCoordonnees[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Y354=(CommonTree)match(input,Y,FOLLOW_Y_in_variable2560); 
                    Y354_tree = (CommonTree)adaptor.dupNode(Y354);

                    root_1 = (CommonTree)adaptor.becomeRoot(Y354_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2562);
                    typeCoordonnees355=typeCoordonnees(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeCoordonnees355.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2565);
                    accesClasse356=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse356.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:339:4: ^( Z typeCoordonnees[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Z357=(CommonTree)match(input,Z,FOLLOW_Z_in_variable2573); 
                    Z357_tree = (CommonTree)adaptor.dupNode(Z357);

                    root_1 = (CommonTree)adaptor.becomeRoot(Z357_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2575);
                    typeCoordonnees358=typeCoordonnees(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeCoordonnees358.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2578);
                    accesClasse359=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse359.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:340:4: ^( VAR_I_KW IDENT accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VAR_I_KW360=(CommonTree)match(input,VAR_I_KW,FOLLOW_VAR_I_KW_in_variable2586); 
                    VAR_I_KW360_tree = (CommonTree)adaptor.dupNode(VAR_I_KW360);

                    root_1 = (CommonTree)adaptor.becomeRoot(VAR_I_KW360_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT361=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variable2588); 
                    IDENT361_tree = (CommonTree)adaptor.dupNode(IDENT361);

                    adaptor.addChild(root_1, IDENT361_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2590);
                    accesClasse362=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse362.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:341:4: ^( VAR_A_KW attribut[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VAR_A_KW363=(CommonTree)match(input,VAR_A_KW,FOLLOW_VAR_A_KW_in_variable2598); 
                    VAR_A_KW363_tree = (CommonTree)adaptor.dupNode(VAR_A_KW363);

                    root_1 = (CommonTree)adaptor.becomeRoot(VAR_A_KW363_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_attribut_in_variable2600);
                    attribut364=attribut(st);

                    state._fsp--;

                    adaptor.addChild(root_1, attribut364.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2603);
                    accesClasse365=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse365.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:342:4: GAME_SCORE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    GAME_SCORE_KW366=(CommonTree)match(input,GAME_SCORE_KW,FOLLOW_GAME_SCORE_KW_in_variable2610); 
                    GAME_SCORE_KW366_tree = (CommonTree)adaptor.dupNode(GAME_SCORE_KW366);

                    adaptor.addChild(root_0, GAME_SCORE_KW366_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:343:4: ^( VALUE_KW attributTps[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VALUE_KW367=(CommonTree)match(input,VALUE_KW,FOLLOW_VALUE_KW_in_variable2616); 
                    VALUE_KW367_tree = (CommonTree)adaptor.dupNode(VALUE_KW367);

                    root_1 = (CommonTree)adaptor.becomeRoot(VALUE_KW367_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_attributTps_in_variable2618);
                    attributTps368=attributTps(st);

                    state._fsp--;

                    adaptor.addChild(root_1, attributTps368.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2621);
                    accesClasse369=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse369.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class accesClasse_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accesClasse"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:346:1: accesClasse[SymbolTable st] returns [Code c] : ( ALL | accesLocal[st] | accesGlobal[st] );
    public final hightTree.accesClasse_return accesClasse(SymbolTable st) throws RecognitionException {
        hightTree.accesClasse_return retval = new hightTree.accesClasse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALL370=null;
        hightTree.accesLocal_return accesLocal371 = null;

        hightTree.accesGlobal_return accesGlobal372 = null;


        CommonTree ALL370_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:346:46: ( ALL | accesLocal[st] | accesGlobal[st] )
            int alt77=3;
            switch ( input.LA(1) ) {
            case ALL:
                {
                alt77=1;
                }
                break;
            case IDENT:
            case PLAYER:
            case NUM:
                {
                alt77=2;
                }
                break;
            case CAMERA:
            case MEDIA:
            case ALLY:
            case ENEMY:
            case NEUTRAL:
            case PG:
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
                alt77=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:347:3: ALL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ALL370=(CommonTree)match(input,ALL,FOLLOW_ALL_in_accesClasse2642); 
                    ALL370_tree = (CommonTree)adaptor.dupNode(ALL370);

                    adaptor.addChild(root_0, ALL370_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:348:5: accesLocal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_accesClasse2649);
                    accesLocal371=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal371.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:349:5: accesGlobal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesGlobal_in_accesClasse2656);
                    accesGlobal372=accesGlobal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal372.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "accesClasse"

    public static class accesGlobal_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accesGlobal"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:352:1: accesGlobal[SymbolTable st] returns [Code c] : ( typeObjet[st] | interaction[st] | PG NOT ( typeObjet[st] | interaction[st] | PLAYER ) PD );
    public final hightTree.accesGlobal_return accesGlobal(SymbolTable st) throws RecognitionException {
        hightTree.accesGlobal_return retval = new hightTree.accesGlobal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PG375=null;
        CommonTree NOT376=null;
        CommonTree PLAYER379=null;
        CommonTree PD380=null;
        hightTree.typeObjet_return typeObjet373 = null;

        hightTree.interaction_return interaction374 = null;

        hightTree.typeObjet_return typeObjet377 = null;

        hightTree.interaction_return interaction378 = null;


        CommonTree PG375_tree=null;
        CommonTree NOT376_tree=null;
        CommonTree PLAYER379_tree=null;
        CommonTree PD380_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:352:46: ( typeObjet[st] | interaction[st] | PG NOT ( typeObjet[st] | interaction[st] | PLAYER ) PD )
            int alt79=3;
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
                alt79=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
                {
                alt79=2;
                }
                break;
            case PG:
                {
                alt79=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:353:3: typeObjet[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeObjet_in_accesGlobal2675);
                    typeObjet373=typeObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet373.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:354:5: interaction[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interaction_in_accesGlobal2682);
                    interaction374=interaction(st);

                    state._fsp--;

                    adaptor.addChild(root_0, interaction374.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:355:5: PG NOT ( typeObjet[st] | interaction[st] | PLAYER ) PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PG375=(CommonTree)match(input,PG,FOLLOW_PG_in_accesGlobal2689); 
                    PG375_tree = (CommonTree)adaptor.dupNode(PG375);

                    adaptor.addChild(root_0, PG375_tree);

                    _last = (CommonTree)input.LT(1);
                    NOT376=(CommonTree)match(input,NOT,FOLLOW_NOT_in_accesGlobal2691); 
                    NOT376_tree = (CommonTree)adaptor.dupNode(NOT376);

                    adaptor.addChild(root_0, NOT376_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:355:12: ( typeObjet[st] | interaction[st] | PLAYER )
                    int alt78=3;
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
                        alt78=1;
                        }
                        break;
                    case ALLY:
                    case ENEMY:
                    case NEUTRAL:
                        {
                        alt78=2;
                        }
                        break;
                    case PLAYER:
                        {
                        alt78=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }

                    switch (alt78) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:355:13: typeObjet[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_typeObjet_in_accesGlobal2694);
                            typeObjet377=typeObjet(st);

                            state._fsp--;

                            adaptor.addChild(root_0, typeObjet377.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:355:29: interaction[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_interaction_in_accesGlobal2699);
                            interaction378=interaction(st);

                            state._fsp--;

                            adaptor.addChild(root_0, interaction378.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:355:47: PLAYER
                            {
                            _last = (CommonTree)input.LT(1);
                            PLAYER379=(CommonTree)match(input,PLAYER,FOLLOW_PLAYER_in_accesGlobal2704); 
                            PLAYER379_tree = (CommonTree)adaptor.dupNode(PLAYER379);

                            adaptor.addChild(root_0, PLAYER379_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    PD380=(CommonTree)match(input,PD,FOLLOW_PD_in_accesGlobal2707); 
                    PD380_tree = (CommonTree)adaptor.dupNode(PD380);

                    adaptor.addChild(root_0, PD380_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "accesGlobal"

    public static class accesLocal_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accesLocal"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:358:1: accesLocal[SymbolTable st] returns [Code c] : ( IDENT | NUM operation[st] IN IDENT | PLAYER );
    public final hightTree.accesLocal_return accesLocal(SymbolTable st) throws RecognitionException {
        hightTree.accesLocal_return retval = new hightTree.accesLocal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT381=null;
        CommonTree NUM382=null;
        CommonTree IN384=null;
        CommonTree IDENT385=null;
        CommonTree PLAYER386=null;
        hightTree.operation_return operation383 = null;


        CommonTree IDENT381_tree=null;
        CommonTree NUM382_tree=null;
        CommonTree IN384_tree=null;
        CommonTree IDENT385_tree=null;
        CommonTree PLAYER386_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:358:45: ( IDENT | NUM operation[st] IN IDENT | PLAYER )
            int alt80=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt80=1;
                }
                break;
            case NUM:
                {
                alt80=2;
                }
                break;
            case PLAYER:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:359:3: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT381=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2725); 
                    IDENT381_tree = (CommonTree)adaptor.dupNode(IDENT381);

                    adaptor.addChild(root_0, IDENT381_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:360:5: NUM operation[st] IN IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    NUM382=(CommonTree)match(input,NUM,FOLLOW_NUM_in_accesLocal2731); 
                    NUM382_tree = (CommonTree)adaptor.dupNode(NUM382);

                    adaptor.addChild(root_0, NUM382_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_accesLocal2733);
                    operation383=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, operation383.getTree());
                    _last = (CommonTree)input.LT(1);
                    IN384=(CommonTree)match(input,IN,FOLLOW_IN_in_accesLocal2736); 
                    IN384_tree = (CommonTree)adaptor.dupNode(IN384);

                    adaptor.addChild(root_0, IN384_tree);

                    _last = (CommonTree)input.LT(1);
                    IDENT385=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2738); 
                    IDENT385_tree = (CommonTree)adaptor.dupNode(IDENT385);

                    adaptor.addChild(root_0, IDENT385_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:361:5: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PLAYER386=(CommonTree)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal2744); 
                    PLAYER386_tree = (CommonTree)adaptor.dupNode(PLAYER386);

                    adaptor.addChild(root_0, PLAYER386_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "accesLocal"

    public static class typeCoordonnees_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCoordonnees"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:364:1: typeCoordonnees[SymbolTable st] returns [Code c] : ( POSITION | ORIENTATION | SIZE );
    public final hightTree.typeCoordonnees_return typeCoordonnees(SymbolTable st) throws RecognitionException {
        hightTree.typeCoordonnees_return retval = new hightTree.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set387=null;

        CommonTree set387_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:364:50: ( POSITION | ORIENTATION | SIZE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set387=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=POSITION && input.LA(1)<=SIZE) ) {
                input.consume();

                set387_tree = (CommonTree)adaptor.dupNode(set387);

                adaptor.addChild(root_0, set387_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeCoordonnees"

    public static class timeUnit_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeUnit"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:368:1: timeUnit[SymbolTable st] returns [Code c] : ( MIN | SEC | MS | FRAME );
    public final hightTree.timeUnit_return timeUnit(SymbolTable st) throws RecognitionException {
        hightTree.timeUnit_return retval = new hightTree.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set388=null;

        CommonTree set388_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:368:43: ( MIN | SEC | MS | FRAME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set388=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=MIN && input.LA(1)<=FRAME) ) {
                input.consume();

                set388_tree = (CommonTree)adaptor.dupNode(set388);

                adaptor.addChild(root_0, set388_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeUnit"

    public static class typeObjet_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:376:1: typeObjet[SymbolTable st] returns [Code c] : ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D[st] );
    public final hightTree.typeObjet_return typeObjet(SymbolTable st) throws RecognitionException {
        hightTree.typeObjet_return retval = new hightTree.typeObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CAMERA389=null;
        CommonTree MEDIA390=null;
        CommonTree COUNTER391=null;
        CommonTree TIME392=null;
        hightTree.typeObjet3D_return typeObjet3D393 = null;


        CommonTree CAMERA389_tree=null;
        CommonTree MEDIA390_tree=null;
        CommonTree COUNTER391_tree=null;
        CommonTree TIME392_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:376:44: ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D[st] )
            int alt81=5;
            switch ( input.LA(1) ) {
            case CAMERA:
                {
                alt81=1;
                }
                break;
            case MEDIA:
                {
                alt81=2;
                }
                break;
            case COUNTER:
                {
                alt81=3;
                }
                break;
            case TIME:
                {
                alt81=4;
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
                alt81=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:377:2: CAMERA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    CAMERA389=(CommonTree)match(input,CAMERA,FOLLOW_CAMERA_in_typeObjet2820); 
                    CAMERA389_tree = (CommonTree)adaptor.dupNode(CAMERA389);

                    adaptor.addChild(root_0, CAMERA389_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:378:4: MEDIA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    MEDIA390=(CommonTree)match(input,MEDIA,FOLLOW_MEDIA_in_typeObjet2825); 
                    MEDIA390_tree = (CommonTree)adaptor.dupNode(MEDIA390);

                    adaptor.addChild(root_0, MEDIA390_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:379:4: COUNTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    COUNTER391=(CommonTree)match(input,COUNTER,FOLLOW_COUNTER_in_typeObjet2830); 
                    COUNTER391_tree = (CommonTree)adaptor.dupNode(COUNTER391);

                    adaptor.addChild(root_0, COUNTER391_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:380:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    TIME392=(CommonTree)match(input,TIME,FOLLOW_TIME_in_typeObjet2835); 
                    TIME392_tree = (CommonTree)adaptor.dupNode(TIME392);

                    adaptor.addChild(root_0, TIME392_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:381:4: typeObjet3D[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeObjet3D_in_typeObjet2840);
                    typeObjet3D393=typeObjet3D(st);

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet3D393.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeObjet"

    public static class typeObjet3D_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeObjet3D"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:386:1: typeObjet3D[SymbolTable st] returns [Code c] : ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER );
    public final hightTree.typeObjet3D_return typeObjet3D(SymbolTable st) throws RecognitionException {
        hightTree.typeObjet3D_return retval = new hightTree.typeObjet3D_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set394=null;

        CommonTree set394_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:386:46: ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set394=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=OBJECT && input.LA(1)<=TELEPORTER) ) {
                input.consume();

                set394_tree = (CommonTree)adaptor.dupNode(set394);

                adaptor.addChild(root_0, set394_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeObjet3D"

    public static class attribut_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribut"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:407:1: attribut[SymbolTable st] returns [Code c] : ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA );
    public final hightTree.attribut_return attribut(SymbolTable st) throws RecognitionException {
        hightTree.attribut_return retval = new hightTree.attribut_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set395=null;

        CommonTree set395_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:407:43: ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set395=(CommonTree)input.LT(1);
            if ( input.LA(1)==TYPE||input.LA(1)==VALUE||(input.LA(1)>=MASS && input.LA(1)<=MOVE_WITH_CAMERA) ) {
                input.consume();

                set395_tree = (CommonTree)adaptor.dupNode(set395);

                adaptor.addChild(root_0, set395_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribut"

    public static class attributTps_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributTps"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:450:1: attributTps[SymbolTable st] returns [Code c] : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final hightTree.attributTps_return attributTps(SymbolTable st) throws RecognitionException {
        hightTree.attributTps_return retval = new hightTree.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set396=null;

        CommonTree set396_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:450:46: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set396=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=BOOST_INTERVAL && input.LA(1)<=RELOAD_TIME) ) {
                input.consume();

                set396_tree = (CommonTree)adaptor.dupNode(set396);

                adaptor.addChild(root_0, set396_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributTps"

    public static class attributListeOuObjet_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributListeOuObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:456:1: attributListeOuObjet[SymbolTable st] returns [Code c] : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final hightTree.attributListeOuObjet_return attributListeOuObjet(SymbolTable st) throws RecognitionException {
        hightTree.attributListeOuObjet_return retval = new hightTree.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set397=null;

        CommonTree set397_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:456:55: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set397=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=INVENTORY && input.LA(1)<=TYPES_TELEPORTABLES) ) {
                input.consume();

                set397_tree = (CommonTree)adaptor.dupNode(set397);

                adaptor.addChild(root_0, set397_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributListeOuObjet"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA14_eotS =
        "\14\uffff";
    static final String DFA14_eofS =
        "\14\uffff";
    static final String DFA14_minS =
        "\1\10\2\uffff\2\2\1\uffff\1\51\1\54\4\uffff";
    static final String DFA14_maxS =
        "\1\45\2\uffff\2\2\1\uffff\1\52\1\55\4\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\7\2\uffff\1\3\1\4\1\5\1\6";
    static final String DFA14_specialS =
        "\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\4\1\3\4\uffff\1\5\25\uffff\1\2",
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
            return "59:1: declarationObjet[SymbolTable st] returns [Code c] : ( ^( DEC typeEntity[st] ( entityMode[st] )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );";
        }
    }
    static final String DFA26_eotS =
        "\13\uffff";
    static final String DFA26_eofS =
        "\13\uffff";
    static final String DFA26_minS =
        "\1\42\2\uffff\1\3\4\uffff\2\2\1\uffff";
    static final String DFA26_maxS =
        "\1\u00bf\2\uffff\1\u00bf\4\uffff\2\u00bf\1\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\6\1\7\2\uffff\1\5";
    static final String DFA26_specialS =
        "\13\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\3\5\uffff\1\2\2\uffff\1\2\3\uffff\4\2\5\uffff\1\6\1\7\4"+
            "\2\2\uffff\6\2\2\uffff\1\2\41\uffff\2\5\13\uffff\1\1\13\uffff"+
            "\1\2\16\uffff\4\4\15\uffff\2\2\7\uffff\24\2",
            "",
            "",
            "\1\12\36\uffff\1\12\5\uffff\1\12\2\uffff\1\12\3\uffff\4\12"+
            "\5\uffff\4\12\1\10\1\12\2\uffff\1\12\1\11\4\12\2\uffff\1\12"+
            "\4\2\26\uffff\1\2\6\uffff\2\12\13\uffff\1\12\13\uffff\1\12\16"+
            "\uffff\4\12\15\uffff\2\12\7\uffff\24\12",
            "",
            "",
            "",
            "",
            "\1\12\1\2\36\uffff\1\2\5\uffff\1\2\2\uffff\1\2\3\uffff\4\2"+
            "\5\uffff\6\2\2\uffff\6\2\2\uffff\1\2\41\uffff\2\2\13\uffff\1"+
            "\2\13\uffff\1\2\16\uffff\4\2\15\uffff\2\2\7\uffff\24\2",
            "\1\12\1\2\36\uffff\1\2\5\uffff\1\2\2\uffff\1\2\3\uffff\4\2"+
            "\5\uffff\6\2\2\uffff\6\2\2\uffff\1\2\41\uffff\2\2\13\uffff\1"+
            "\2\13\uffff\1\2\16\uffff\4\2\15\uffff\2\2\7\uffff\24\2",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "128:1: consequ[SymbolTable st] returns [Code c] : ( siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW );";
        }
    }
    static final String DFA29_eotS =
        "\26\uffff";
    static final String DFA29_eofS =
        "\26\uffff";
    static final String DFA29_minS =
        "\1\42\1\uffff\2\2\1\uffff\1\2\7\uffff\2\32\1\76\6\uffff";
    static final String DFA29_maxS =
        "\1\u00bf\1\uffff\2\2\1\uffff\1\2\7\uffff\2\42\1\77\6\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\1\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\1\17\3\uffff\1\2\1\3\1\4\1\5\1\7\1\10";
    static final String DFA29_specialS =
        "\26\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\5\uffff\1\1\2\uffff\1\1\3\uffff\4\1\7\uffff\1\2\1\3\1"+
            "\4\1\5\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff\1\14\72\uffff"+
            "\1\1\37\uffff\2\1\7\uffff\24\1",
            "",
            "\1\15",
            "\1\16",
            "",
            "\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\7\uffff\1\20",
            "\1\23\7\uffff\1\22",
            "\1\24\1\25",
            "",
            "",
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
            return "138:1: action[SymbolTable st] returns [Code c] : ( accesClasse[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW ON IDENT ) | ^( MUTE_KW OFF IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClasse[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );";
        }
    }
    static final String DFA33_eotS =
        "\12\uffff";
    static final String DFA33_eofS =
        "\12\uffff";
    static final String DFA33_minS =
        "\1\74\4\uffff\1\2\1\42\3\uffff";
    static final String DFA33_maxS =
        "\1\143\4\uffff\1\2\1\u00a4\3\uffff";
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
            "\1\11\14\uffff\1\11\35\uffff\1\7\1\10\125\uffff\1\11",
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
            return "162:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesLocal[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );";
        }
    }
    static final String DFA42_eotS =
        "\10\uffff";
    static final String DFA42_eofS =
        "\6\uffff\1\4\1\2";
    static final String DFA42_minS =
        "\1\2\1\3\1\uffff\1\3\1\uffff\3\3";
    static final String DFA42_maxS =
        "\1\136\1\u00bf\1\uffff\1\u00bf\1\uffff\3\u00bf";
    static final String DFA42_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String DFA42_specialS =
        "\10\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\2\1\1\124\uffff\7\2",
            "\1\3\30\uffff\1\2\5\uffff\1\4\5\uffff\1\4\2\uffff\1\4\3\uffff"+
            "\4\4\5\uffff\6\4\2\uffff\6\4\2\uffff\1\4\41\uffff\2\4\13\uffff"+
            "\1\4\13\uffff\1\4\16\uffff\4\4\15\uffff\2\4\7\uffff\24\4",
            "",
            "\1\5\16\uffff\1\4\17\uffff\1\2\5\uffff\1\2\2\uffff\1\2\3\uffff"+
            "\4\2\5\uffff\6\2\2\uffff\6\2\2\uffff\1\2\41\uffff\2\2\13\uffff"+
            "\1\2\13\uffff\1\2\16\uffff\4\2\15\uffff\2\2\7\uffff\24\2",
            "",
            "\1\6\16\uffff\1\2\17\uffff\1\4\5\uffff\1\4\2\uffff\1\4\3\uffff"+
            "\4\4\3\uffff\1\4\1\uffff\6\4\2\uffff\6\4\2\uffff\1\4\11\uffff"+
            "\1\4\27\uffff\2\4\2\uffff\1\4\10\uffff\1\4\13\uffff\1\4\16\uffff"+
            "\5\4\14\uffff\2\4\7\uffff\24\4",
            "\1\7\16\uffff\1\4\17\uffff\1\2\5\uffff\1\2\2\uffff\1\2\3\uffff"+
            "\4\2\3\uffff\1\2\1\uffff\6\2\2\uffff\6\2\2\uffff\1\2\11\uffff"+
            "\1\2\27\uffff\2\2\2\uffff\1\2\10\uffff\1\2\13\uffff\1\2\16\uffff"+
            "\5\2\14\uffff\2\2\7\uffff\24\2",
            "\1\6\16\uffff\1\2\17\uffff\1\4\5\uffff\1\4\2\uffff\1\4\3\uffff"+
            "\4\4\3\uffff\1\4\1\uffff\6\4\2\uffff\6\4\2\uffff\1\4\11\uffff"+
            "\1\4\27\uffff\2\4\2\uffff\1\4\10\uffff\1\4\13\uffff\1\4\16\uffff"+
            "\5\4\14\uffff\2\4\7\uffff\24\4"
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
            return "229:13: ( souris[st] ( VIRG souris[st] )* )?";
        }
    }
 

    public static final BitSet FOLLOW_GAME_KW_in_game65 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gameData_in_game70 = new BitSet(new long[]{0x00000000000000C0L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_newType_in_game76 = new BitSet(new long[]{0x00000000000000C0L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_init_in_game82 = new BitSet(new long[]{0x00400000000000C0L,0x0000000000040000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_definition_in_game88 = new BitSet(new long[]{0x0040000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_commande_in_game94 = new BitSet(new long[]{0x0040000000000000L,0x0000400000040000L});
    public static final BitSet FOLLOW_reglesJeu_in_game100 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_iaBasique_in_game106 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_GAME_ATTRIBUT_KW_in_gameData136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributGame_list_in_gameData138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attributGame_in_attributGame_list155 = new BitSet(new long[]{0x0000000020002002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame181 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame183 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame185 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCORE_KW_in_attributGame193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_KW_in_newType215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_newType217 = new BitSet(new long[]{0x0000090400000000L,0x0000000000000000L,0xFFFFF00000000000L});
    public static final BitSet FOLLOW_subType_list_in_newType219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_subType_in_subType_list238 = new BitSet(new long[]{0x0000090400000002L,0x0000000000000000L,0xFFFFF00000000000L});
    public static final BitSet FOLLOW_IDENT_in_subType256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_IS_KW_in_init281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init283 = new BitSet(new long[]{0x0000002000008700L});
    public static final BitSet FOLLOW_declarationObjet_in_init285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INIT_HAS_KW_in_init292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_affectationObjet_in_init294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEC_in_declarationObjet314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet316 = new BitSet(new long[]{0x0008800000000808L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_declaration_in_declarationObjet332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet341 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_view_in_declarationObjet343 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_KW_in_declarationObjet384 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_list_declaration418 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_list_declaration422 = new BitSet(new long[]{0x0000000480305002L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeEntity446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERACTION_KW_in_entityMode469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_entityMode471 = new BitSet(new long[]{0x0008800000000808L});
    public static final BitSet FOLLOW_dupli_in_entityMode474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dupli_in_entityMode482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_interaction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet567 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet569 = new BitSet(new long[]{0x0000000000080008L});
    public static final BitSet FOLLOW_valAggregation_in_affectationObjet571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribut_in_affectationObjet583 = new BitSet(new long[]{0x0000000480305000L,0x0000000000000000L,0x00000003FE800000L,0x0300000000000000L});
    public static final BitSet FOLLOW_typeAllocation_in_affectationObjet586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_affectationObjet597 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_affectationObjet600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_affectationObjet611 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet614 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_affectationObjet624 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_affectationObjet627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_timeUnit_in_affectationObjet630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_typeAllocation657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeAllocation662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_typeAllocation666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_typeAllocation670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_valAggregation691 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_definition729 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_definition731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSEQUENCES_KW_in_consequences751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_list_in_consequences753 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_consequ_in_consequ_list772 = new BitSet(new long[]{0x3F07890400000002L,0x00800C000000013FL,0xFFFFF018003C0008L});
    public static final BitSet FOLLOW_siAlors_in_consequ791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action848 = new BitSet(new long[]{0x1000000000000000L,0x0000000800001E02L});
    public static final BitSet FOLLOW_actionObjet_in_action851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_action857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENDS_KW_in_action866 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action868 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action877 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action883 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_action901 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_action903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OFF_in_action911 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_action913 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAY_KW_in_action920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOP_KW_in_action928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action936 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_transformation_in_action938 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_action941 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_action944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action953 = new BitSet(new long[]{0x0000800400020008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_typeDestination_in_action956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action966 = new BitSet(new long[]{0x0000800400020008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_typeDestination_in_action969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_KW_in_action977 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_action979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action982 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_action985 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAVE_KW_in_action991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_typeAcces1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAcces1012 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_IDENT_in_typeAcces1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_typeAcces1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_typeDestination1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coordinates_in_typeDestination1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1073 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_actionObjet1076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1079 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1089 = new BitSet(new long[]{0x0000001001000000L,0xE800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1092 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_KW_in_coordinates1174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_coordinates1176 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_coordinates1179 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_coordinates1182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_commande1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_actionCommande_list_in_commande1209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionCommande_in_actionCommande_list1227 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande1247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_actionCommande1249 = new BitSet(new long[]{0x1000000400000000L,0x0000039800000002L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande1260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1262 = new BitSet(new long[]{0x1000000400000000L,0x0000039800000002L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1265 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1421 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1456 = new BitSet(new long[]{0x0000000000000000L,0x0000006003000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_Command_in_activCommande1521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_Command_in_activCommande1532 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMANDS_in_type_Command1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_type_Command1556 = new BitSet(new long[]{0x000000000000000EL,0x000000007F000000L});
    public static final BitSet FOLLOW_souris_in_type_Command1559 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_type_Command1563 = new BitSet(new long[]{0x000000000000000CL,0x000000007F000000L});
    public static final BitSet FOLLOW_souris_in_type_Command1566 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_KEY_KW_in_type_Command1576 = new BitSet(new long[]{0x000000000000000CL,0x0000000783000000L});
    public static final BitSet FOLLOW_clavier_in_type_Command1578 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_type_Command1582 = new BitSet(new long[]{0x000000000000000CL,0x0000000783000000L});
    public static final BitSet FOLLOW_clavier_in_type_Command1585 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_type_Command1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1614 = new BitSet(new long[]{0x0F07890400C00000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1617 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur1641 = new BitSet(new long[]{0x0000000000000000L,0x0036800000000200L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1677 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_VAR_KW_in_declencheur1697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_declencheur1699 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1702 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_ID_KW_in_declencheur1710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1712 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_declencheur0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK1805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declencheur_O_in_declencheurTK1807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK1815 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declencheur_O_in_declencheurTK1817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT1839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declencheur_O_in_declencheurKT1841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT1850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declencheur_O_in_declencheurKT1852 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OTHER_in_declencheur_O1869 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheur_O1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheur_O1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors1900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors1902 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_siAlors1905 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_consequences_in_siAlors1908 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_KW_in_conditions1930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_conditions1932 = new BitSet(new long[]{0x0000001001000000L,0xE800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditions_in_conditions1935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_conditions1943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions1945 = new BitSet(new long[]{0x0000001001000000L,0xEC00000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_NOT_in_conditions1948 = new BitSet(new long[]{0x0000001001000000L,0xE800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditions_in_conditions1951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_conditions1959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions1961 = new BitSet(new long[]{0x0000001001000000L,0xEC00000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_NOT_in_conditions1964 = new BitSet(new long[]{0x0000001001000000L,0xE800000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditions_in_conditions1967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_conditions1975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions1977 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_conditions1980 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_conditions1988 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions1990 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_conditions1992 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_conditions2000 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2002 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_conditions2005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEG_in_conditions2013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2015 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_conditions2018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPED_in_conditions2026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2028 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_conditions2031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIFF_in_conditions2039 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2041 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_conditions2044 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2066 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_NOT_in_etat2070 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2084 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_NOT_in_etat2088 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2092 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2102 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_NOT_in_etat2106 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2120 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_NOT_in_etat2124 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2138 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_NOT_in_etat2142 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2156 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_NOT_in_etat2160 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2174 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_NOT_in_etat2178 = new BitSet(new long[]{0x0007890400000000L,0x0408000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2192 = new BitSet(new long[]{0x0000000000000008L,0x0400000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2207 = new BitSet(new long[]{0x0000000000000008L,0x0400000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2221 = new BitSet(new long[]{0x0000000000000008L,0x0400000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2235 = new BitSet(new long[]{0xC000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2239 = new BitSet(new long[]{0xC000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_mode_mute_in_etat2243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2253 = new BitSet(new long[]{0x0000000000000008L,0x0400000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2268 = new BitSet(new long[]{0x0000000000000008L,0x0400000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mode_mute0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2329 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_variable_in_affectation2332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2342 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_variable_in_affectation2345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2356 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_variable_in_affectation2359 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_affectation2370 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_variable_in_affectation2373 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_iaBasique2396 = new BitSet(new long[]{0x1000000000000000L,0x0000000800001E02L});
    public static final BitSet FOLLOW_actionObjetList_in_iaBasique2399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionObjet_in_actionObjetList2414 = new BitSet(new long[]{0x1000000000000002L,0x0000000800001E02L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2441 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_operation2444 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_operation2451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2453 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_operation2456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_operation2463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2465 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_operation2468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_operation2475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2477 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_operation2480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation2487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2489 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_operation2492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_operation2499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2501 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_operation2504 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_operation2511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2513 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_operation2516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_operation2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operation2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable2547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2549 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_variable2560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2562 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Z_in_variable2573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2575 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_I_KW_in_variable2586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable2588 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_A_KW_in_variable2598 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribut_in_variable2600 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GAME_SCORE_KW_in_variable2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_KW_in_variable2616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_variable2618 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALL_in_accesClasse2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_accesClasse2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_accesGlobal2689 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NOT_in_accesGlobal2691 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0xFFFFF00000000000L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PLAYER_in_accesGlobal2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PD_in_accesGlobal2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal2731 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000003FE800000L});
    public static final BitSet FOLLOW_operation_in_accesLocal2733 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal2736 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERA_in_typeObjet2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_typeObjet2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNTER_in_typeObjet2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_typeObjet2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeObjet2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeObjet3D0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attribut0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}