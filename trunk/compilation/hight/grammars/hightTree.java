// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g 2011-01-15 20:54:40

    package grammars;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class hightTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "SCORE", "TYPE", "IDENT", "IS", "AND", "LIST_KW", "OF", "WITH", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "IN", "PLAYER", "ALLY", "ENEMY", "NEUTRAL", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "DIES_KW", "DURING", "UNTIL", "EQUIP", "NEXT", "PREVIOUS", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "MOUSE_KW", "KEY_KW", "FOR", "LEFT", "RIGHT", "CLICK_LEFT", "CLICK_CENTER", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "JUMP", "MOVE", "FORWARD", "BACKWARD", "TURN", "ACCELERATE", "BRAKE", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "BY", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "X", "Y", "Z", "VALUE", "ALL", "NUM", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "COUNTER", "TIME", "OBJECT", "CHARACTER", "VEHICLE", "PLANE", "SPACECRAFT", "OBSTACLE", "WEAPON", "SWORD", "PROJECTILE", "ZONE", "GROUND", "BONUS", "CHECKPOINT", "BREAKABLE", "CONSTRUCTION", "ROOM", "BALL", "TELEPORTER", "MASS", "IS_FIX", "IS_TRAVERSABLE", "FOV", "ACTIVE", "NAME", "DESCRIPTION", "LIFE", "LIFE_MAX", "LIFE_MIN", "NB_LIVES", "MAGIC", "MAGIC_MAX", "MAGIC_MIN", "LEVEL", "ATTACK", "DEFENSE", "JUMP_FORCE", "JUMP_AIR_MAX", "MONEY", "CLASS", "RACE", "ACCELERATION", "SPEED", "SPEED_MAX", "SPEED_MIN", "BOOST", "BOOST_MAX", "NB_MUNITIONS", "NB_MUNITIONS_MAX", "SHOOT_POWER", "DAMAGES", "UNIT", "OBJECT_NAME", "ATTRIBUT_NAME", "VOLUME", "NUMBER", "MOVE_WITH_CAMERA", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "WS", "'true'", "'false'", "TYPE_KW"
    };
    public static final int EOF=-1;
    public static final int T__246=246;
    public static final int T__247=247;
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
    public static final int LEFT=86;
    public static final int RIGHT=87;
    public static final int CLICK_LEFT=88;
    public static final int CLICK_CENTER=89;
    public static final int CLICK_RIGHT=90;
    public static final int SCROLL_UP=91;
    public static final int SCROLL_DOWN=92;
    public static final int LETTER=93;
    public static final int SPACE=94;
    public static final int ESCAPE=95;
    public static final int ENTER=96;
    public static final int JUMP=97;
    public static final int MOVE=98;
    public static final int FORWARD=99;
    public static final int BACKWARD=100;
    public static final int TURN=101;
    public static final int ACCELERATE=102;
    public static final int BRAKE=103;
    public static final int ACTIVATE_KW=104;
    public static final int DISABLE_KW=105;
    public static final int COMMANDS=106;
    public static final int KEYBOARD=107;
    public static final int RULE_KW=108;
    public static final int MOVES_KW=109;
    public static final int BECOMES=110;
    public static final int TOUCHES_KW=111;
    public static final int KILLS_KW=112;
    public static final int OTHER=113;
    public static final int KILLED_KW=114;
    public static final int TOUCHED_KW=115;
    public static final int BY=116;
    public static final int IF_KW=117;
    public static final int ELSE=118;
    public static final int ENDIF=119;
    public static final int NOT=120;
    public static final int OR=121;
    public static final int COMP=122;
    public static final int EQUALS=123;
    public static final int INF=124;
    public static final int SUP=125;
    public static final int INFEG=126;
    public static final int SUPED=127;
    public static final int DIFF=128;
    public static final int PG=129;
    public static final int PD=130;
    public static final int DEAD_KW=131;
    public static final int ALIVE_KW=132;
    public static final int EFFACED_KW=133;
    public static final int GENERATED_KW=134;
    public static final int TOUCHING_KW=135;
    public static final int MOVING_KW=136;
    public static final int WAITING_KW=137;
    public static final int FINISHED_KW=138;
    public static final int STARTED_KW=139;
    public static final int PAUSED_KW=140;
    public static final int MUTED_KW=141;
    public static final int PLAYED_KW=142;
    public static final int STOPPED_KW=143;
    public static final int ASSIGN_KW=144;
    public static final int ADD_KW=145;
    public static final int SUB_KW=146;
    public static final int INVERT_KW=147;
    public static final int IA_KW=148;
    public static final int RANDOM_KW=149;
    public static final int BETWEEN=150;
    public static final int PLUS=151;
    public static final int MINUS=152;
    public static final int MUL=153;
    public static final int DIV=154;
    public static final int MOD=155;
    public static final int POW=156;
    public static final int X=157;
    public static final int Y=158;
    public static final int Z=159;
    public static final int VALUE=160;
    public static final int ALL=161;
    public static final int NUM=162;
    public static final int POSITION=163;
    public static final int ORIENTATION=164;
    public static final int SIZE=165;
    public static final int MIN=166;
    public static final int SEC=167;
    public static final int MS=168;
    public static final int FRAME=169;
    public static final int COUNTER=170;
    public static final int TIME=171;
    public static final int OBJECT=172;
    public static final int CHARACTER=173;
    public static final int VEHICLE=174;
    public static final int PLANE=175;
    public static final int SPACECRAFT=176;
    public static final int OBSTACLE=177;
    public static final int WEAPON=178;
    public static final int SWORD=179;
    public static final int PROJECTILE=180;
    public static final int ZONE=181;
    public static final int GROUND=182;
    public static final int BONUS=183;
    public static final int CHECKPOINT=184;
    public static final int BREAKABLE=185;
    public static final int CONSTRUCTION=186;
    public static final int ROOM=187;
    public static final int BALL=188;
    public static final int TELEPORTER=189;
    public static final int MASS=190;
    public static final int IS_FIX=191;
    public static final int IS_TRAVERSABLE=192;
    public static final int FOV=193;
    public static final int ACTIVE=194;
    public static final int NAME=195;
    public static final int DESCRIPTION=196;
    public static final int LIFE=197;
    public static final int LIFE_MAX=198;
    public static final int LIFE_MIN=199;
    public static final int NB_LIVES=200;
    public static final int MAGIC=201;
    public static final int MAGIC_MAX=202;
    public static final int MAGIC_MIN=203;
    public static final int LEVEL=204;
    public static final int ATTACK=205;
    public static final int DEFENSE=206;
    public static final int JUMP_FORCE=207;
    public static final int JUMP_AIR_MAX=208;
    public static final int MONEY=209;
    public static final int CLASS=210;
    public static final int RACE=211;
    public static final int ACCELERATION=212;
    public static final int SPEED=213;
    public static final int SPEED_MAX=214;
    public static final int SPEED_MIN=215;
    public static final int BOOST=216;
    public static final int BOOST_MAX=217;
    public static final int NB_MUNITIONS=218;
    public static final int NB_MUNITIONS_MAX=219;
    public static final int SHOOT_POWER=220;
    public static final int DAMAGES=221;
    public static final int UNIT=222;
    public static final int OBJECT_NAME=223;
    public static final int ATTRIBUT_NAME=224;
    public static final int VOLUME=225;
    public static final int NUMBER=226;
    public static final int MOVE_WITH_CAMERA=227;
    public static final int BOOST_INTERVAL=228;
    public static final int SHOOT_INTERVAL=229;
    public static final int RELOAD_TIME=230;
    public static final int INVENTORY=231;
    public static final int EQUIPED_OBJECT=232;
    public static final int ENTRANCES=233;
    public static final int EXITS=234;
    public static final int DAMAGE_ZONE=235;
    public static final int COLLECTORS=236;
    public static final int TYPES_COLLECTORS=237;
    public static final int GENERATORS=238;
    public static final int TYPE_GENERATORS=239;
    public static final int BREAKERS=240;
    public static final int TYPES_BREAKERS=241;
    public static final int TELEPORTABLES=242;
    public static final int TYPES_TELEPORTABLES=243;
    public static final int COMMENT=244;
    public static final int WS=245;
    public static final int TYPE_KW=248;

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
    public String getGrammarFileName() { return "D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g"; }


    public static class game_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "game"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:25:1: game[SymbolTable st] returns [Code c] : ^( GAME_KW ( gameData[st] )? ( newType[st] )* ( init[st] )+ ( definition[st] )* ( commande[st] )* ( reglesJeu[st] )* ( iaBasique[st] )* ) ;
    public final hightTree.game_return game(SymbolTable st) throws RecognitionException {
        hightTree.game_return retval = new hightTree.game_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GAME_KW1=null;
        hightTree.gameData_return gameData2 = null;

        hightTree.newType_return newType3 = null;

        hightTree.init_return init4 = null;

        hightTree.definition_return definition5 = null;

        hightTree.commande_return commande6 = null;

        hightTree.reglesJeu_return reglesJeu7 = null;

        hightTree.iaBasique_return iaBasique8 = null;


        CommonTree GAME_KW1_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:25:39: ( ^( GAME_KW ( gameData[st] )? ( newType[st] )* ( init[st] )+ ( definition[st] )* ( commande[st] )* ( reglesJeu[st] )* ( iaBasique[st] )* ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:2: ^( GAME_KW ( gameData[st] )? ( newType[st] )* ( init[st] )+ ( definition[st] )* ( commande[st] )* ( reglesJeu[st] )* ( iaBasique[st] )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GAME_KW1=(CommonTree)match(input,GAME_KW,FOLLOW_GAME_KW_in_game68); 
            GAME_KW1_tree = (CommonTree)adaptor.dupNode(GAME_KW1);

            root_1 = (CommonTree)adaptor.becomeRoot(GAME_KW1_tree, root_1);



            match(input, Token.DOWN, null); 
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:12: ( gameData[st] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME_ATTRIBUT_KW) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:12: gameData[st]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_gameData_in_game70);
                    gameData2=gameData(st);

                    state._fsp--;

                    adaptor.addChild(root_1, gameData2.getTree());

                    }
                    break;

            }

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:26: ( newType[st] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE_KW) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:26: newType[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_newType_in_game74);
            	    newType3=newType(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, newType3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:39: ( init[st] )+
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
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:39: init[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_init_in_game78);
            	    init4=init(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, init4.getTree());

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

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:49: ( definition[st] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DEFINITION_KW) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:49: definition[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_definition_in_game82);
            	    definition5=definition(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, definition5.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:65: ( commande[st] )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMAND_KW) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:65: commande[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_commande_in_game86);
            	    commande6=commande(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, commande6.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:79: ( reglesJeu[st] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_KW) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:79: reglesJeu[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_reglesJeu_in_game90);
            	    reglesJeu7=reglesJeu(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, reglesJeu7.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:94: ( iaBasique[st] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IA_KW) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:26:94: iaBasique[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_iaBasique_in_game94);
            	    iaBasique8=iaBasique(st);

            	    state._fsp--;

            	    adaptor.addChild(root_1, iaBasique8.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:31:1: gameData[SymbolTable st] returns [Code c] : ^( GAME_ATTRIBUT_KW attributGame_list[st] ) ;
    public final hightTree.gameData_return gameData(SymbolTable st) throws RecognitionException {
        hightTree.gameData_return retval = new hightTree.gameData_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GAME_ATTRIBUT_KW9=null;
        hightTree.attributGame_list_return attributGame_list10 = null;


        CommonTree GAME_ATTRIBUT_KW9_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:31:43: ( ^( GAME_ATTRIBUT_KW attributGame_list[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:32:2: ^( GAME_ATTRIBUT_KW attributGame_list[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GAME_ATTRIBUT_KW9=(CommonTree)match(input,GAME_ATTRIBUT_KW,FOLLOW_GAME_ATTRIBUT_KW_in_gameData117); 
            GAME_ATTRIBUT_KW9_tree = (CommonTree)adaptor.dupNode(GAME_ATTRIBUT_KW9);

            root_1 = (CommonTree)adaptor.becomeRoot(GAME_ATTRIBUT_KW9_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_attributGame_list_in_gameData119);
            attributGame_list10=attributGame_list(st);

            state._fsp--;

            adaptor.addChild(root_1, attributGame_list10.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:34:1: attributGame_list[SymbolTable st] returns [Code c] : ( attributGame[st] )+ ;
    public final hightTree.attributGame_list_return attributGame_list(SymbolTable st) throws RecognitionException {
        hightTree.attributGame_list_return retval = new hightTree.attributGame_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.attributGame_return attributGame11 = null;



        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:34:52: ( ( attributGame[st] )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:35:2: ( attributGame[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:35:2: ( attributGame[st] )+
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
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:35:2: attributGame[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_attributGame_in_attributGame_list136);
            	    attributGame11=attributGame(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, attributGame11.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:37:1: attributGame[SymbolTable st] returns [Code c] : ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) );
    public final hightTree.attributGame_return attributGame(SymbolTable st) throws RecognitionException {
        hightTree.attributGame_return retval = new hightTree.attributGame_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GRAVITY_KW12=null;
        CommonTree FLOAT13=null;
        CommonTree GRAVITY_KW14=null;
        CommonTree FLOAT15=null;
        CommonTree FLOAT16=null;
        CommonTree FLOAT17=null;
        CommonTree SCORE_KW18=null;
        CommonTree FLOAT19=null;

        CommonTree GRAVITY_KW12_tree=null;
        CommonTree FLOAT13_tree=null;
        CommonTree GRAVITY_KW14_tree=null;
        CommonTree FLOAT15_tree=null;
        CommonTree FLOAT16_tree=null;
        CommonTree FLOAT17_tree=null;
        CommonTree SCORE_KW18_tree=null;
        CommonTree FLOAT19_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:37:47: ( ^( GRAVITY_KW FLOAT ) | ^( GRAVITY_KW FLOAT FLOAT FLOAT ) | ^( SCORE_KW FLOAT ) )
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:38:2: ^( GRAVITY_KW FLOAT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GRAVITY_KW12=(CommonTree)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame154); 
                    GRAVITY_KW12_tree = (CommonTree)adaptor.dupNode(GRAVITY_KW12);

                    root_1 = (CommonTree)adaptor.becomeRoot(GRAVITY_KW12_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    FLOAT13=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame156); 
                    FLOAT13_tree = (CommonTree)adaptor.dupNode(FLOAT13);

                    adaptor.addChild(root_1, FLOAT13_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:39:3: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GRAVITY_KW14=(CommonTree)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame162); 
                    GRAVITY_KW14_tree = (CommonTree)adaptor.dupNode(GRAVITY_KW14);

                    root_1 = (CommonTree)adaptor.becomeRoot(GRAVITY_KW14_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    FLOAT15=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame164); 
                    FLOAT15_tree = (CommonTree)adaptor.dupNode(FLOAT15);

                    adaptor.addChild(root_1, FLOAT15_tree);

                    _last = (CommonTree)input.LT(1);
                    FLOAT16=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame166); 
                    FLOAT16_tree = (CommonTree)adaptor.dupNode(FLOAT16);

                    adaptor.addChild(root_1, FLOAT16_tree);

                    _last = (CommonTree)input.LT(1);
                    FLOAT17=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame168); 
                    FLOAT17_tree = (CommonTree)adaptor.dupNode(FLOAT17);

                    adaptor.addChild(root_1, FLOAT17_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:40:3: ^( SCORE_KW FLOAT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SCORE_KW18=(CommonTree)match(input,SCORE_KW,FOLLOW_SCORE_KW_in_attributGame174); 
                    SCORE_KW18_tree = (CommonTree)adaptor.dupNode(SCORE_KW18);

                    root_1 = (CommonTree)adaptor.becomeRoot(SCORE_KW18_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    FLOAT19=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame176); 
                    FLOAT19_tree = (CommonTree)adaptor.dupNode(FLOAT19);

                    adaptor.addChild(root_1, FLOAT19_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:43:1: newType[SymbolTable st] returns [Code c] : ^( TYPE_KW IDENT subType_list[st] ) ;
    public final hightTree.newType_return newType(SymbolTable st) throws RecognitionException {
        hightTree.newType_return retval = new hightTree.newType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPE_KW20=null;
        CommonTree IDENT21=null;
        hightTree.subType_list_return subType_list22 = null;


        CommonTree TYPE_KW20_tree=null;
        CommonTree IDENT21_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:43:42: ( ^( TYPE_KW IDENT subType_list[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:44:2: ^( TYPE_KW IDENT subType_list[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TYPE_KW20=(CommonTree)match(input,TYPE_KW,FOLLOW_TYPE_KW_in_newType196); 
            TYPE_KW20_tree = (CommonTree)adaptor.dupNode(TYPE_KW20);

            root_1 = (CommonTree)adaptor.becomeRoot(TYPE_KW20_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENT21=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_newType198); 
            IDENT21_tree = (CommonTree)adaptor.dupNode(IDENT21);

            adaptor.addChild(root_1, IDENT21_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_subType_list_in_newType200);
            subType_list22=subType_list(st);

            state._fsp--;

            adaptor.addChild(root_1, subType_list22.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:47:1: subType_list[SymbolTable st] returns [Code c] : ( subType[st] )+ ;
    public final hightTree.subType_list_return subType_list(SymbolTable st) throws RecognitionException {
        hightTree.subType_list_return retval = new hightTree.subType_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.subType_return subType23 = null;



        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:47:47: ( ( subType[st] )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:48:2: ( subType[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:48:2: ( subType[st] )+
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
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:48:2: subType[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_subType_in_subType_list219);
            	    subType23=subType(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, subType23.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:50:1: subType[SymbolTable st] returns [Code c] : ( IDENT | typeObjet[st] );
    public final hightTree.subType_return subType(SymbolTable st) throws RecognitionException {
        hightTree.subType_return retval = new hightTree.subType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT24=null;
        hightTree.typeObjet_return typeObjet25 = null;


        CommonTree IDENT24_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:50:42: ( IDENT | typeObjet[st] )
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:51:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT24=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_subType237); 
                    IDENT24_tree = (CommonTree)adaptor.dupNode(IDENT24);

                    adaptor.addChild(root_0, IDENT24_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:52:4: typeObjet[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeObjet_in_subType242);
                    typeObjet25=typeObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet25.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:55:1: init[SymbolTable st] returns [Code c] : ( ^( INIT_IS_KW IDENT declarationObjet[st] ) | ^( INIT_HAS_KW affectationObjet[st] ) );
    public final hightTree.init_return init(SymbolTable st) throws RecognitionException {
        hightTree.init_return retval = new hightTree.init_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INIT_IS_KW26=null;
        CommonTree IDENT27=null;
        CommonTree INIT_HAS_KW29=null;
        hightTree.declarationObjet_return declarationObjet28 = null;

        hightTree.affectationObjet_return affectationObjet30 = null;


        CommonTree INIT_IS_KW26_tree=null;
        CommonTree IDENT27_tree=null;
        CommonTree INIT_HAS_KW29_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:55:39: ( ^( INIT_IS_KW IDENT declarationObjet[st] ) | ^( INIT_HAS_KW affectationObjet[st] ) )
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:56:2: ^( INIT_IS_KW IDENT declarationObjet[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INIT_IS_KW26=(CommonTree)match(input,INIT_IS_KW,FOLLOW_INIT_IS_KW_in_init262); 
                    INIT_IS_KW26_tree = (CommonTree)adaptor.dupNode(INIT_IS_KW26);

                    root_1 = (CommonTree)adaptor.becomeRoot(INIT_IS_KW26_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT27=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_init264); 
                    IDENT27_tree = (CommonTree)adaptor.dupNode(IDENT27);

                    adaptor.addChild(root_1, IDENT27_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declarationObjet_in_init266);
                    declarationObjet28=declarationObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declarationObjet28.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:57:3: ^( INIT_HAS_KW affectationObjet[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INIT_HAS_KW29=(CommonTree)match(input,INIT_HAS_KW,FOLLOW_INIT_HAS_KW_in_init273); 
                    INIT_HAS_KW29_tree = (CommonTree)adaptor.dupNode(INIT_HAS_KW29);

                    root_1 = (CommonTree)adaptor.becomeRoot(INIT_HAS_KW29_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_affectationObjet_in_init275);
                    affectationObjet30=affectationObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_1, affectationObjet30.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:61:1: declarationObjet[SymbolTable st] returns [Code c] : ( ^( DEC typeEntity[st] ( entityMode[st] )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );
    public final hightTree.declarationObjet_return declarationObjet(SymbolTable st) throws RecognitionException {
        hightTree.declarationObjet_return retval = new hightTree.declarationObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEC31=null;
        CommonTree LIST_KW34=null;
        CommonTree CAMERA_KW36=null;
        CommonTree PERSON37=null;
        CommonTree CAMERA_KW39=null;
        CommonTree FREE40=null;
        CommonTree MEDIA_KW41=null;
        CommonTree LOOP42=null;
        CommonTree MEDIA_KW43=null;
        CommonTree ONCE44=null;
        CommonTree IN_KW45=null;
        CommonTree IDENT46=null;
        hightTree.typeEntity_return typeEntity32 = null;

        hightTree.entityMode_return entityMode33 = null;

        hightTree.list_declaration_return list_declaration35 = null;

        hightTree.view_return view38 = null;


        CommonTree DEC31_tree=null;
        CommonTree LIST_KW34_tree=null;
        CommonTree CAMERA_KW36_tree=null;
        CommonTree PERSON37_tree=null;
        CommonTree CAMERA_KW39_tree=null;
        CommonTree FREE40_tree=null;
        CommonTree MEDIA_KW41_tree=null;
        CommonTree LOOP42_tree=null;
        CommonTree MEDIA_KW43_tree=null;
        CommonTree ONCE44_tree=null;
        CommonTree IN_KW45_tree=null;
        CommonTree IDENT46_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:61:51: ( ^( DEC typeEntity[st] ( entityMode[st] )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:62:2: ^( DEC typeEntity[st] ( entityMode[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DEC31=(CommonTree)match(input,DEC,FOLLOW_DEC_in_declarationObjet295); 
                    DEC31_tree = (CommonTree)adaptor.dupNode(DEC31);

                    root_1 = (CommonTree)adaptor.becomeRoot(DEC31_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet297);
                    typeEntity32=typeEntity(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeEntity32.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:62:23: ( entityMode[st] )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==INTERACTION_KW||LA13_0==PLAYER||LA13_0==DUPLICABLE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:62:23: entityMode[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_entityMode_in_declarationObjet300);
                            entityMode33=entityMode(st);

                            state._fsp--;

                            adaptor.addChild(root_1, entityMode33.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:63:3: ^( LIST_KW list_declaration[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LIST_KW34=(CommonTree)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet311); 
                    LIST_KW34_tree = (CommonTree)adaptor.dupNode(LIST_KW34);

                    root_1 = (CommonTree)adaptor.becomeRoot(LIST_KW34_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_list_declaration_in_declarationObjet313);
                    list_declaration35=list_declaration(st);

                    state._fsp--;

                    adaptor.addChild(root_1, list_declaration35.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:64:3: ^( CAMERA_KW PERSON view[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CAMERA_KW36=(CommonTree)match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet320); 
                    CAMERA_KW36_tree = (CommonTree)adaptor.dupNode(CAMERA_KW36);

                    root_1 = (CommonTree)adaptor.becomeRoot(CAMERA_KW36_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    PERSON37=(CommonTree)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet322); 
                    PERSON37_tree = (CommonTree)adaptor.dupNode(PERSON37);

                    adaptor.addChild(root_1, PERSON37_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_view_in_declarationObjet324);
                    view38=view(st);

                    state._fsp--;

                    adaptor.addChild(root_1, view38.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:65:3: ^( CAMERA_KW FREE )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CAMERA_KW39=(CommonTree)match(input,CAMERA_KW,FOLLOW_CAMERA_KW_in_declarationObjet332); 
                    CAMERA_KW39_tree = (CommonTree)adaptor.dupNode(CAMERA_KW39);

                    root_1 = (CommonTree)adaptor.becomeRoot(CAMERA_KW39_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    FREE40=(CommonTree)match(input,FREE,FOLLOW_FREE_in_declarationObjet334); 
                    FREE40_tree = (CommonTree)adaptor.dupNode(FREE40);

                    adaptor.addChild(root_1, FREE40_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:66:3: ^( MEDIA_KW LOOP )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MEDIA_KW41=(CommonTree)match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet340); 
                    MEDIA_KW41_tree = (CommonTree)adaptor.dupNode(MEDIA_KW41);

                    root_1 = (CommonTree)adaptor.becomeRoot(MEDIA_KW41_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    LOOP42=(CommonTree)match(input,LOOP,FOLLOW_LOOP_in_declarationObjet342); 
                    LOOP42_tree = (CommonTree)adaptor.dupNode(LOOP42);

                    adaptor.addChild(root_1, LOOP42_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:67:3: ^( MEDIA_KW ONCE )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MEDIA_KW43=(CommonTree)match(input,MEDIA_KW,FOLLOW_MEDIA_KW_in_declarationObjet349); 
                    MEDIA_KW43_tree = (CommonTree)adaptor.dupNode(MEDIA_KW43);

                    root_1 = (CommonTree)adaptor.becomeRoot(MEDIA_KW43_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ONCE44=(CommonTree)match(input,ONCE,FOLLOW_ONCE_in_declarationObjet351); 
                    ONCE44_tree = (CommonTree)adaptor.dupNode(ONCE44);

                    adaptor.addChild(root_1, ONCE44_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:68:3: ^( IN_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IN_KW45=(CommonTree)match(input,IN_KW,FOLLOW_IN_KW_in_declarationObjet365); 
                    IN_KW45_tree = (CommonTree)adaptor.dupNode(IN_KW45);

                    root_1 = (CommonTree)adaptor.becomeRoot(IN_KW45_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT46=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet367); 
                    IDENT46_tree = (CommonTree)adaptor.dupNode(IDENT46);

                    adaptor.addChild(root_1, IDENT46_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:71:1: list_declaration[SymbolTable st] returns [Code c] : ( ( operation[st] )? IDENT )+ ;
    public final hightTree.list_declaration_return list_declaration(SymbolTable st) throws RecognitionException {
        hightTree.list_declaration_return retval = new hightTree.list_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT48=null;
        hightTree.operation_return operation47 = null;


        CommonTree IDENT48_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:71:51: ( ( ( operation[st] )? IDENT )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:72:2: ( ( operation[st] )? IDENT )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:72:2: ( ( operation[st] )? IDENT )+
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
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:72:3: ( operation[st] )? IDENT
            	    {
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:72:3: ( operation[st] )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==GAME_SCORE_KW||LA15_0==VALUE_KW||(LA15_0>=VAR_I_KW && LA15_0<=VAR_A_KW)||LA15_0==FLOAT||LA15_0==RANDOM_KW||(LA15_0>=PLUS && LA15_0<=Z)) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:72:3: operation[st]
            	            {
            	            _last = (CommonTree)input.LT(1);
            	            pushFollow(FOLLOW_operation_in_list_declaration399);
            	            operation47=operation(st);

            	            state._fsp--;

            	            adaptor.addChild(root_0, operation47.getTree());

            	            }
            	            break;

            	    }

            	    _last = (CommonTree)input.LT(1);
            	    IDENT48=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_list_declaration403); 
            	    IDENT48_tree = (CommonTree)adaptor.dupNode(IDENT48);

            	    adaptor.addChild(root_0, IDENT48_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:75:1: typeEntity[SymbolTable st] returns [Code c] : ( IDENT | typeObjet3D[st] );
    public final hightTree.typeEntity_return typeEntity(SymbolTable st) throws RecognitionException {
        hightTree.typeEntity_return retval = new hightTree.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT49=null;
        hightTree.typeObjet3D_return typeObjet3D50 = null;


        CommonTree IDENT49_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:75:45: ( IDENT | typeObjet3D[st] )
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:76:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT49=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeEntity422); 
                    IDENT49_tree = (CommonTree)adaptor.dupNode(IDENT49);

                    adaptor.addChild(root_0, IDENT49_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:77:4: typeObjet3D[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeObjet3D_in_typeEntity427);
                    typeObjet3D50=typeObjet3D(st);

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet3D50.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:80:1: entityMode[SymbolTable st] returns [Code c] : ( PLAYER | ^( INTERACTION_KW interaction[st] ( dupli[st] )? ) | dupli[st] );
    public final hightTree.entityMode_return entityMode(SymbolTable st) throws RecognitionException {
        hightTree.entityMode_return retval = new hightTree.entityMode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PLAYER51=null;
        CommonTree INTERACTION_KW52=null;
        hightTree.interaction_return interaction53 = null;

        hightTree.dupli_return dupli54 = null;

        hightTree.dupli_return dupli55 = null;


        CommonTree PLAYER51_tree=null;
        CommonTree INTERACTION_KW52_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:80:45: ( PLAYER | ^( INTERACTION_KW interaction[st] ( dupli[st] )? ) | dupli[st] )
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:81:2: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PLAYER51=(CommonTree)match(input,PLAYER,FOLLOW_PLAYER_in_entityMode444); 
                    PLAYER51_tree = (CommonTree)adaptor.dupNode(PLAYER51);

                    adaptor.addChild(root_0, PLAYER51_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:82:4: ^( INTERACTION_KW interaction[st] ( dupli[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INTERACTION_KW52=(CommonTree)match(input,INTERACTION_KW,FOLLOW_INTERACTION_KW_in_entityMode450); 
                    INTERACTION_KW52_tree = (CommonTree)adaptor.dupNode(INTERACTION_KW52);

                    root_1 = (CommonTree)adaptor.becomeRoot(INTERACTION_KW52_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interaction_in_entityMode452);
                    interaction53=interaction(st);

                    state._fsp--;

                    adaptor.addChild(root_1, interaction53.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:82:37: ( dupli[st] )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DUPLICABLE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:82:37: dupli[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_dupli_in_entityMode455);
                            dupli54=dupli(st);

                            state._fsp--;

                            adaptor.addChild(root_1, dupli54.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:83:4: dupli[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_dupli_in_entityMode463);
                    dupli55=dupli(st);

                    state._fsp--;

                    adaptor.addChild(root_0, dupli55.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:86:1: interaction[SymbolTable st] returns [Code c] : ( ALLY | ENEMY | NEUTRAL );
    public final hightTree.interaction_return interaction(SymbolTable st) throws RecognitionException {
        hightTree.interaction_return retval = new hightTree.interaction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set56=null;

        CommonTree set56_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:86:46: ( ALLY | ENEMY | NEUTRAL )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set56=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=ALLY && input.LA(1)<=NEUTRAL) ) {
                input.consume();

                set56_tree = (CommonTree)adaptor.dupNode(set56);

                adaptor.addChild(root_0, set56_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:92:1: dupli[SymbolTable st] returns [Code c] : DUPLICABLE ;
    public final hightTree.dupli_return dupli(SymbolTable st) throws RecognitionException {
        hightTree.dupli_return retval = new hightTree.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DUPLICABLE57=null;

        CommonTree DUPLICABLE57_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:92:40: ( DUPLICABLE )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:93:2: DUPLICABLE
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            DUPLICABLE57=(CommonTree)match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli507); 
            DUPLICABLE57_tree = (CommonTree)adaptor.dupNode(DUPLICABLE57);

            adaptor.addChild(root_0, DUPLICABLE57_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:96:1: view[SymbolTable st] returns [Code c] : ( FIRST | THIRD );
    public final hightTree.view_return view(SymbolTable st) throws RecognitionException {
        hightTree.view_return retval = new hightTree.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set58=null;

        CommonTree set58_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:96:39: ( FIRST | THIRD )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set58=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=FIRST && input.LA(1)<=THIRD) ) {
                input.consume();

                set58_tree = (CommonTree)adaptor.dupNode(set58);

                adaptor.addChild(root_0, set58_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:101:1: affectationObjet[SymbolTable st] returns [Code c] : ^( ALLOCATION_KW IDENT valAggregation[st] ) ^( ALLOCATION_KW attribut[st] typeAllocation[st] ) ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st] ) ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st] ) ;
    public final hightTree.affectationObjet_return affectationObjet(SymbolTable st) throws RecognitionException {
        hightTree.affectationObjet_return retval = new hightTree.affectationObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALLOCATION_KW59=null;
        CommonTree IDENT60=null;
        CommonTree ALLOCATION_KW62=null;
        CommonTree ALLOCATION_KW65=null;
        CommonTree ALLOCATION_KW68=null;
        CommonTree IDENT70=null;
        CommonTree ALLOCATION_KW71=null;
        hightTree.valAggregation_return valAggregation61 = null;

        hightTree.attribut_return attribut63 = null;

        hightTree.typeAllocation_return typeAllocation64 = null;

        hightTree.typeCoordonnees_return typeCoordonnees66 = null;

        hightTree.coordinates_return coordinates67 = null;

        hightTree.attributListeOuObjet_return attributListeOuObjet69 = null;

        hightTree.attributTps_return attributTps72 = null;

        hightTree.operation_return operation73 = null;

        hightTree.timeUnit_return timeUnit74 = null;


        CommonTree ALLOCATION_KW59_tree=null;
        CommonTree IDENT60_tree=null;
        CommonTree ALLOCATION_KW62_tree=null;
        CommonTree ALLOCATION_KW65_tree=null;
        CommonTree ALLOCATION_KW68_tree=null;
        CommonTree IDENT70_tree=null;
        CommonTree ALLOCATION_KW71_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:101:51: ( ^( ALLOCATION_KW IDENT valAggregation[st] ) ^( ALLOCATION_KW attribut[st] typeAllocation[st] ) ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st] ) ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:102:2: ^( ALLOCATION_KW IDENT valAggregation[st] ) ^( ALLOCATION_KW attribut[st] typeAllocation[st] ) ^( ALLOCATION_KW typeCoordonnees[st] coordinates[st] ) ^( ALLOCATION_KW attributListeOuObjet[st] IDENT ) ^( ALLOCATION_KW attributTps[st] operation[st] timeUnit[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ALLOCATION_KW59=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet548); 
            ALLOCATION_KW59_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW59);

            root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW59_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENT60=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet550); 
            IDENT60_tree = (CommonTree)adaptor.dupNode(IDENT60);

            adaptor.addChild(root_1, IDENT60_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_valAggregation_in_affectationObjet552);
            valAggregation61=valAggregation(st);

            state._fsp--;

            adaptor.addChild(root_1, valAggregation61.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ALLOCATION_KW62=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet560); 
            ALLOCATION_KW62_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW62);

            root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW62_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_attribut_in_affectationObjet562);
            attribut63=attribut(st);

            state._fsp--;

            adaptor.addChild(root_1, attribut63.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeAllocation_in_affectationObjet565);
            typeAllocation64=typeAllocation(st);

            state._fsp--;

            adaptor.addChild(root_1, typeAllocation64.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ALLOCATION_KW65=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet572); 
            ALLOCATION_KW65_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW65);

            root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW65_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeCoordonnees_in_affectationObjet574);
            typeCoordonnees66=typeCoordonnees(st);

            state._fsp--;

            adaptor.addChild(root_1, typeCoordonnees66.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_coordinates_in_affectationObjet577);
            coordinates67=coordinates(st);

            state._fsp--;

            adaptor.addChild(root_1, coordinates67.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ALLOCATION_KW68=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet584); 
            ALLOCATION_KW68_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW68);

            root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW68_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_attributListeOuObjet_in_affectationObjet586);
            attributListeOuObjet69=attributListeOuObjet(st);

            state._fsp--;

            adaptor.addChild(root_1, attributListeOuObjet69.getTree());
            _last = (CommonTree)input.LT(1);
            IDENT70=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_affectationObjet589); 
            IDENT70_tree = (CommonTree)adaptor.dupNode(IDENT70);

            adaptor.addChild(root_1, IDENT70_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ALLOCATION_KW71=(CommonTree)match(input,ALLOCATION_KW,FOLLOW_ALLOCATION_KW_in_affectationObjet595); 
            ALLOCATION_KW71_tree = (CommonTree)adaptor.dupNode(ALLOCATION_KW71);

            root_1 = (CommonTree)adaptor.becomeRoot(ALLOCATION_KW71_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_attributTps_in_affectationObjet597);
            attributTps72=attributTps(st);

            state._fsp--;

            adaptor.addChild(root_1, attributTps72.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_affectationObjet600);
            operation73=operation(st);

            state._fsp--;

            adaptor.addChild(root_1, operation73.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_timeUnit_in_affectationObjet603);
            timeUnit74=timeUnit(st);

            state._fsp--;

            adaptor.addChild(root_1, timeUnit74.getTree());

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
    // $ANTLR end "affectationObjet"

    public static class typeAllocation_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeAllocation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:109:1: typeAllocation[SymbolTable st] returns [Code c] : ( operation[st] | IDENT | 'true' | 'false' ) ;
    public final hightTree.typeAllocation_return typeAllocation(SymbolTable st) throws RecognitionException {
        hightTree.typeAllocation_return retval = new hightTree.typeAllocation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT76=null;
        CommonTree string_literal77=null;
        CommonTree string_literal78=null;
        hightTree.operation_return operation75 = null;


        CommonTree IDENT76_tree=null;
        CommonTree string_literal77_tree=null;
        CommonTree string_literal78_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:109:49: ( ( operation[st] | IDENT | 'true' | 'false' ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:2: ( operation[st] | IDENT | 'true' | 'false' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:2: ( operation[st] | IDENT | 'true' | 'false' )
            int alt20=4;
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
                alt20=1;
                }
                break;
            case IDENT:
                {
                alt20=2;
                }
                break;
            case 246:
                {
                alt20=3;
                }
                break;
            case 247:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:3: operation[st]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_typeAllocation630);
                    operation75=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, operation75.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:19: IDENT
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENT76=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeAllocation635); 
                    IDENT76_tree = (CommonTree)adaptor.dupNode(IDENT76);

                    adaptor.addChild(root_0, IDENT76_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:27: 'true'
                    {
                    _last = (CommonTree)input.LT(1);
                    string_literal77=(CommonTree)match(input,246,FOLLOW_246_in_typeAllocation639); 
                    string_literal77_tree = (CommonTree)adaptor.dupNode(string_literal77);

                    adaptor.addChild(root_0, string_literal77_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:110:36: 'false'
                    {
                    _last = (CommonTree)input.LT(1);
                    string_literal78=(CommonTree)match(input,247,FOLLOW_247_in_typeAllocation643); 
                    string_literal78_tree = (CommonTree)adaptor.dupNode(string_literal78);

                    adaptor.addChild(root_0, string_literal78_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:113:1: valAggregation[SymbolTable st] returns [Code c] : ( ^( AGGREGATION_KW operation[st] ( timeUnit[st] )? ) | ^( AGGREGATION_KW IDENT ) );
    public final hightTree.valAggregation_return valAggregation(SymbolTable st) throws RecognitionException {
        hightTree.valAggregation_return retval = new hightTree.valAggregation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AGGREGATION_KW79=null;
        CommonTree AGGREGATION_KW82=null;
        CommonTree IDENT83=null;
        hightTree.operation_return operation80 = null;

        hightTree.timeUnit_return timeUnit81 = null;


        CommonTree AGGREGATION_KW79_tree=null;
        CommonTree AGGREGATION_KW82_tree=null;
        CommonTree IDENT83_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:113:49: ( ^( AGGREGATION_KW operation[st] ( timeUnit[st] )? ) | ^( AGGREGATION_KW IDENT ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AGGREGATION_KW) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==DOWN) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==IDENT) ) {
                        alt22=2;
                    }
                    else if ( (LA22_2==GAME_SCORE_KW||LA22_2==VALUE_KW||(LA22_2>=VAR_I_KW && LA22_2<=VAR_A_KW)||LA22_2==FLOAT||LA22_2==RANDOM_KW||(LA22_2>=PLUS && LA22_2<=Z)) ) {
                        alt22=1;
                    }
                    else {
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:114:2: ^( AGGREGATION_KW operation[st] ( timeUnit[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AGGREGATION_KW79=(CommonTree)match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation662); 
                    AGGREGATION_KW79_tree = (CommonTree)adaptor.dupNode(AGGREGATION_KW79);

                    root_1 = (CommonTree)adaptor.becomeRoot(AGGREGATION_KW79_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_valAggregation664);
                    operation80=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation80.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:114:33: ( timeUnit[st] )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=MIN && LA21_0<=FRAME)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:114:33: timeUnit[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_timeUnit_in_valAggregation667);
                            timeUnit81=timeUnit(st);

                            state._fsp--;

                            adaptor.addChild(root_1, timeUnit81.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:115:3: ^( AGGREGATION_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AGGREGATION_KW82=(CommonTree)match(input,AGGREGATION_KW,FOLLOW_AGGREGATION_KW_in_valAggregation675); 
                    AGGREGATION_KW82_tree = (CommonTree)adaptor.dupNode(AGGREGATION_KW82);

                    root_1 = (CommonTree)adaptor.becomeRoot(AGGREGATION_KW82_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT83=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_valAggregation677); 
                    IDENT83_tree = (CommonTree)adaptor.dupNode(IDENT83);

                    adaptor.addChild(root_1, IDENT83_tree);


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

    public static class valAffectation_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valAffectation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:118:2: valAffectation[SymbolTable st] returns [Code c] : ( operation[st] | IDENT | 'true' | 'false' );
    public final hightTree.valAffectation_return valAffectation(SymbolTable st) throws RecognitionException {
        hightTree.valAffectation_return retval = new hightTree.valAffectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT85=null;
        CommonTree string_literal86=null;
        CommonTree string_literal87=null;
        hightTree.operation_return operation84 = null;


        CommonTree IDENT85_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree string_literal87_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:118:50: ( operation[st] | IDENT | 'true' | 'false' )
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
            case 246:
                {
                alt23=3;
                }
                break;
            case 247:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:119:2: operation[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_valAffectation698);
                    operation84=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, operation84.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:120:3: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT85=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_valAffectation704); 
                    IDENT85_tree = (CommonTree)adaptor.dupNode(IDENT85);

                    adaptor.addChild(root_0, IDENT85_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:121:3: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    string_literal86=(CommonTree)match(input,246,FOLLOW_246_in_valAffectation708); 
                    string_literal86_tree = (CommonTree)adaptor.dupNode(string_literal86);

                    adaptor.addChild(root_0, string_literal86_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:121:12: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    string_literal87=(CommonTree)match(input,247,FOLLOW_247_in_valAffectation712); 
                    string_literal87_tree = (CommonTree)adaptor.dupNode(string_literal87);

                    adaptor.addChild(root_0, string_literal87_tree);


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
    // $ANTLR end "valAffectation"

    public static class definition_return extends TreeRuleReturnScope {
        public Code c;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:126:1: definition[SymbolTable st] returns [Code c] : ^( DEFINITION_KW IDENT consequences[st] ) ;
    public final hightTree.definition_return definition(SymbolTable st) throws RecognitionException {
        hightTree.definition_return retval = new hightTree.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFINITION_KW88=null;
        CommonTree IDENT89=null;
        hightTree.consequences_return consequences90 = null;


        CommonTree DEFINITION_KW88_tree=null;
        CommonTree IDENT89_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:126:45: ( ^( DEFINITION_KW IDENT consequences[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:127:2: ^( DEFINITION_KW IDENT consequences[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DEFINITION_KW88=(CommonTree)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition735); 
            DEFINITION_KW88_tree = (CommonTree)adaptor.dupNode(DEFINITION_KW88);

            root_1 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW88_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENT89=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_definition737); 
            IDENT89_tree = (CommonTree)adaptor.dupNode(IDENT89);

            adaptor.addChild(root_1, IDENT89_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_consequences_in_definition739);
            consequences90=consequences(st);

            state._fsp--;

            adaptor.addChild(root_1, consequences90.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:130:1: consequences[SymbolTable st] returns [Code c] : ^( CONSEQUENCES_KW consequ_list[st] ) ;
    public final hightTree.consequences_return consequences(SymbolTable st) throws RecognitionException {
        hightTree.consequences_return retval = new hightTree.consequences_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONSEQUENCES_KW91=null;
        hightTree.consequ_list_return consequ_list92 = null;


        CommonTree CONSEQUENCES_KW91_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:130:47: ( ^( CONSEQUENCES_KW consequ_list[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:131:2: ^( CONSEQUENCES_KW consequ_list[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CONSEQUENCES_KW91=(CommonTree)match(input,CONSEQUENCES_KW,FOLLOW_CONSEQUENCES_KW_in_consequences759); 
            CONSEQUENCES_KW91_tree = (CommonTree)adaptor.dupNode(CONSEQUENCES_KW91);

            root_1 = (CommonTree)adaptor.becomeRoot(CONSEQUENCES_KW91_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_consequ_list_in_consequences761);
            consequ_list92=consequ_list(st);

            state._fsp--;

            adaptor.addChild(root_1, consequ_list92.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:134:1: consequ_list[SymbolTable st] returns [Code c] : ( consequ[st] )+ ;
    public final hightTree.consequ_list_return consequ_list(SymbolTable st) throws RecognitionException {
        hightTree.consequ_list_return retval = new hightTree.consequ_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.consequ_return consequ93 = null;



        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:134:47: ( ( consequ[st] )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:135:3: ( consequ[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:135:3: ( consequ[st] )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==IDENT||LA24_0==CAMERA||LA24_0==MEDIA||(LA24_0>=PLAYER && LA24_0<=NEUTRAL)||(LA24_0>=VICTORY_KW && LA24_0<=MUTE_KW)||(LA24_0>=PLAY_KW && LA24_0<=WAIT_KW)||LA24_0==SAVE_KW||(LA24_0>=ACTIVATE_KW && LA24_0<=DISABLE_KW)||LA24_0==IF_KW||LA24_0==PG||(LA24_0>=ASSIGN_KW && LA24_0<=INVERT_KW)||(LA24_0>=ALL && LA24_0<=NUM)||(LA24_0>=COUNTER && LA24_0<=TELEPORTER)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:135:3: consequ[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_consequ_in_consequ_list780);
            	    consequ93=consequ(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, consequ93.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:137:1: consequ[SymbolTable st] returns [Code c] : ( siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW );
    public final hightTree.consequ_return consequ(SymbolTable st) throws RecognitionException {
        hightTree.consequ_return retval = new hightTree.consequ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT98=null;
        CommonTree VICTORY_KW99=null;
        CommonTree DEFEAT_KW100=null;
        hightTree.siAlors_return siAlors94 = null;

        hightTree.action_return action95 = null;

        hightTree.affectation_return affectation96 = null;

        hightTree.activCommande_return activCommande97 = null;


        CommonTree IDENT98_tree=null;
        CommonTree VICTORY_KW99_tree=null;
        CommonTree DEFEAT_KW100_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:137:42: ( siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW )
            int alt25=7;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:138:3: siAlors[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_siAlors_in_consequ799);
                    siAlors94=siAlors(st);

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors94.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:139:5: action[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_action_in_consequ806);
                    action95=action(st);

                    state._fsp--;

                    adaptor.addChild(root_0, action95.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:140:5: affectation[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_affectation_in_consequ813);
                    affectation96=affectation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, affectation96.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:141:5: activCommande[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_activCommande_in_consequ820);
                    activCommande97=activCommande(st);

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande97.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:142:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT98=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_consequ827); 
                    IDENT98_tree = (CommonTree)adaptor.dupNode(IDENT98);

                    adaptor.addChild(root_0, IDENT98_tree);


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:143:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    VICTORY_KW99=(CommonTree)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ833); 
                    VICTORY_KW99_tree = (CommonTree)adaptor.dupNode(VICTORY_KW99);

                    adaptor.addChild(root_0, VICTORY_KW99_tree);


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:144:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DEFEAT_KW100=(CommonTree)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ839); 
                    DEFEAT_KW100_tree = (CommonTree)adaptor.dupNode(DEFEAT_KW100);

                    adaptor.addChild(root_0, DEFEAT_KW100_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:147:1: action[SymbolTable st] returns [Code c] : ( accesClasse[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW ON IDENT ) | ^( MUTE_KW OFF IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClasse[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );
    public final hightTree.action_return action(SymbolTable st) throws RecognitionException {
        hightTree.action_return retval = new hightTree.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ENDS_KW103=null;
        CommonTree IDENT104=null;
        CommonTree ENDS_KW105=null;
        CommonTree GAME106=null;
        CommonTree STARTS_KW107=null;
        CommonTree IDENT108=null;
        CommonTree STARTS_KW109=null;
        CommonTree GAME110=null;
        CommonTree PAUSE_KW111=null;
        CommonTree IDENT112=null;
        CommonTree MUTE_KW113=null;
        CommonTree ON114=null;
        CommonTree IDENT115=null;
        CommonTree MUTE_KW116=null;
        CommonTree OFF117=null;
        CommonTree IDENT118=null;
        CommonTree PLAY_KW119=null;
        CommonTree IDENT120=null;
        CommonTree STOP_KW121=null;
        CommonTree IDENT122=null;
        CommonTree BLOCK_KW123=null;
        CommonTree EFFACE_KW127=null;
        CommonTree GENERATE_KW130=null;
        CommonTree WAIT_KW133=null;
        CommonTree SAVE_KW137=null;
        hightTree.accesClasse_return accesClasse101 = null;

        hightTree.actionObjet_return actionObjet102 = null;

        hightTree.transformation_return transformation124 = null;

        hightTree.accesClasse_return accesClasse125 = null;

        hightTree.coordinates_return coordinates126 = null;

        hightTree.typeAcces_return typeAcces128 = null;

        hightTree.typeDestination_return typeDestination129 = null;

        hightTree.typeAcces_return typeAcces131 = null;

        hightTree.typeDestination_return typeDestination132 = null;

        hightTree.operation_return operation134 = null;

        hightTree.timeUnit_return timeUnit135 = null;

        hightTree.consequences_return consequences136 = null;


        CommonTree ENDS_KW103_tree=null;
        CommonTree IDENT104_tree=null;
        CommonTree ENDS_KW105_tree=null;
        CommonTree GAME106_tree=null;
        CommonTree STARTS_KW107_tree=null;
        CommonTree IDENT108_tree=null;
        CommonTree STARTS_KW109_tree=null;
        CommonTree GAME110_tree=null;
        CommonTree PAUSE_KW111_tree=null;
        CommonTree IDENT112_tree=null;
        CommonTree MUTE_KW113_tree=null;
        CommonTree ON114_tree=null;
        CommonTree IDENT115_tree=null;
        CommonTree MUTE_KW116_tree=null;
        CommonTree OFF117_tree=null;
        CommonTree IDENT118_tree=null;
        CommonTree PLAY_KW119_tree=null;
        CommonTree IDENT120_tree=null;
        CommonTree STOP_KW121_tree=null;
        CommonTree IDENT122_tree=null;
        CommonTree BLOCK_KW123_tree=null;
        CommonTree EFFACE_KW127_tree=null;
        CommonTree GENERATE_KW130_tree=null;
        CommonTree WAIT_KW133_tree=null;
        CommonTree SAVE_KW137_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:147:41: ( accesClasse[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW ON IDENT ) | ^( MUTE_KW OFF IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClasse[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW )
            int alt28=15;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:148:2: accesClasse[st] actionObjet[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_action856);
                    accesClasse101=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse101.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionObjet_in_action859);
                    actionObjet102=actionObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet102.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:149:3: ^( ENDS_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ENDS_KW103=(CommonTree)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action865); 
                    ENDS_KW103_tree = (CommonTree)adaptor.dupNode(ENDS_KW103);

                    root_1 = (CommonTree)adaptor.becomeRoot(ENDS_KW103_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT104=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action867); 
                    IDENT104_tree = (CommonTree)adaptor.dupNode(IDENT104);

                    adaptor.addChild(root_1, IDENT104_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:150:3: ^( ENDS_KW GAME )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ENDS_KW105=(CommonTree)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action874); 
                    ENDS_KW105_tree = (CommonTree)adaptor.dupNode(ENDS_KW105);

                    root_1 = (CommonTree)adaptor.becomeRoot(ENDS_KW105_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    GAME106=(CommonTree)match(input,GAME,FOLLOW_GAME_in_action876); 
                    GAME106_tree = (CommonTree)adaptor.dupNode(GAME106);

                    adaptor.addChild(root_1, GAME106_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:151:3: ^( STARTS_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STARTS_KW107=(CommonTree)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action883); 
                    STARTS_KW107_tree = (CommonTree)adaptor.dupNode(STARTS_KW107);

                    root_1 = (CommonTree)adaptor.becomeRoot(STARTS_KW107_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT108=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action885); 
                    IDENT108_tree = (CommonTree)adaptor.dupNode(IDENT108);

                    adaptor.addChild(root_1, IDENT108_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:152:3: ^( STARTS_KW GAME )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STARTS_KW109=(CommonTree)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action891); 
                    STARTS_KW109_tree = (CommonTree)adaptor.dupNode(STARTS_KW109);

                    root_1 = (CommonTree)adaptor.becomeRoot(STARTS_KW109_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    GAME110=(CommonTree)match(input,GAME,FOLLOW_GAME_in_action893); 
                    GAME110_tree = (CommonTree)adaptor.dupNode(GAME110);

                    adaptor.addChild(root_1, GAME110_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:153:3: ^( PAUSE_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PAUSE_KW111=(CommonTree)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action899); 
                    PAUSE_KW111_tree = (CommonTree)adaptor.dupNode(PAUSE_KW111);

                    root_1 = (CommonTree)adaptor.becomeRoot(PAUSE_KW111_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT112=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action901); 
                    IDENT112_tree = (CommonTree)adaptor.dupNode(IDENT112);

                    adaptor.addChild(root_1, IDENT112_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:154:3: ^( MUTE_KW ON IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MUTE_KW113=(CommonTree)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action907); 
                    MUTE_KW113_tree = (CommonTree)adaptor.dupNode(MUTE_KW113);

                    root_1 = (CommonTree)adaptor.becomeRoot(MUTE_KW113_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ON114=(CommonTree)match(input,ON,FOLLOW_ON_in_action909); 
                    ON114_tree = (CommonTree)adaptor.dupNode(ON114);

                    adaptor.addChild(root_1, ON114_tree);

                    _last = (CommonTree)input.LT(1);
                    IDENT115=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action911); 
                    IDENT115_tree = (CommonTree)adaptor.dupNode(IDENT115);

                    adaptor.addChild(root_1, IDENT115_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:155:3: ^( MUTE_KW OFF IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MUTE_KW116=(CommonTree)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action917); 
                    MUTE_KW116_tree = (CommonTree)adaptor.dupNode(MUTE_KW116);

                    root_1 = (CommonTree)adaptor.becomeRoot(MUTE_KW116_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    OFF117=(CommonTree)match(input,OFF,FOLLOW_OFF_in_action919); 
                    OFF117_tree = (CommonTree)adaptor.dupNode(OFF117);

                    adaptor.addChild(root_1, OFF117_tree);

                    _last = (CommonTree)input.LT(1);
                    IDENT118=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action921); 
                    IDENT118_tree = (CommonTree)adaptor.dupNode(IDENT118);

                    adaptor.addChild(root_1, IDENT118_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:156:3: ^( PLAY_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLAY_KW119=(CommonTree)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action928); 
                    PLAY_KW119_tree = (CommonTree)adaptor.dupNode(PLAY_KW119);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLAY_KW119_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT120=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action930); 
                    IDENT120_tree = (CommonTree)adaptor.dupNode(IDENT120);

                    adaptor.addChild(root_1, IDENT120_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 10 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:157:3: ^( STOP_KW IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STOP_KW121=(CommonTree)match(input,STOP_KW,FOLLOW_STOP_KW_in_action936); 
                    STOP_KW121_tree = (CommonTree)adaptor.dupNode(STOP_KW121);

                    root_1 = (CommonTree)adaptor.becomeRoot(STOP_KW121_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT122=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_action938); 
                    IDENT122_tree = (CommonTree)adaptor.dupNode(IDENT122);

                    adaptor.addChild(root_1, IDENT122_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 11 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:158:3: ^( BLOCK_KW transformation[st] accesClasse[st] coordinates[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BLOCK_KW123=(CommonTree)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action944); 
                    BLOCK_KW123_tree = (CommonTree)adaptor.dupNode(BLOCK_KW123);

                    root_1 = (CommonTree)adaptor.becomeRoot(BLOCK_KW123_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_transformation_in_action946);
                    transformation124=transformation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, transformation124.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_action949);
                    accesClasse125=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse125.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_coordinates_in_action952);
                    coordinates126=coordinates(st);

                    state._fsp--;

                    adaptor.addChild(root_1, coordinates126.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 12 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:3: ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EFFACE_KW127=(CommonTree)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action959); 
                    EFFACE_KW127_tree = (CommonTree)adaptor.dupNode(EFFACE_KW127);

                    root_1 = (CommonTree)adaptor.becomeRoot(EFFACE_KW127_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeAcces_in_action961);
                    typeAcces128=typeAcces(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeAcces128.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:29: ( typeDestination[st] )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==COORDINATE_KW||LA26_0==IDENT||LA26_0==PLAYER||LA26_0==NUM) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:159:29: typeDestination[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_typeDestination_in_action964);
                            typeDestination129=typeDestination(st);

                            state._fsp--;

                            adaptor.addChild(root_1, typeDestination129.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 13 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:160:3: ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GENERATE_KW130=(CommonTree)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action972); 
                    GENERATE_KW130_tree = (CommonTree)adaptor.dupNode(GENERATE_KW130);

                    root_1 = (CommonTree)adaptor.becomeRoot(GENERATE_KW130_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeAcces_in_action974);
                    typeAcces131=typeAcces(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeAcces131.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:160:31: ( typeDestination[st] )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==COORDINATE_KW||LA27_0==IDENT||LA27_0==PLAYER||LA27_0==NUM) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:160:31: typeDestination[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_typeDestination_in_action977);
                            typeDestination132=typeDestination(st);

                            state._fsp--;

                            adaptor.addChild(root_1, typeDestination132.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 14 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:161:3: ^( WAIT_KW operation[st] timeUnit[st] consequences[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WAIT_KW133=(CommonTree)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action985); 
                    WAIT_KW133_tree = (CommonTree)adaptor.dupNode(WAIT_KW133);

                    root_1 = (CommonTree)adaptor.becomeRoot(WAIT_KW133_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_action987);
                    operation134=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation134.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timeUnit_in_action990);
                    timeUnit135=timeUnit(st);

                    state._fsp--;

                    adaptor.addChild(root_1, timeUnit135.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_consequences_in_action993);
                    consequences136=consequences(st);

                    state._fsp--;

                    adaptor.addChild(root_1, consequences136.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 15 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:162:3: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    SAVE_KW137=(CommonTree)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action999); 
                    SAVE_KW137_tree = (CommonTree)adaptor.dupNode(SAVE_KW137);

                    adaptor.addChild(root_0, SAVE_KW137_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:165:1: typeAcces[SymbolTable st] returns [Code c] : ( accesLocal[st] | operation[st] ( IDENT | accesGlobal[st] ) );
    public final hightTree.typeAcces_return typeAcces(SymbolTable st) throws RecognitionException {
        hightTree.typeAcces_return retval = new hightTree.typeAcces_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT140=null;
        hightTree.accesLocal_return accesLocal138 = null;

        hightTree.operation_return operation139 = null;

        hightTree.accesGlobal_return accesGlobal141 = null;


        CommonTree IDENT140_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:165:44: ( accesLocal[st] | operation[st] ( IDENT | accesGlobal[st] ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENT||LA30_0==PLAYER||LA30_0==NUM) ) {
                alt30=1;
            }
            else if ( (LA30_0==GAME_SCORE_KW||LA30_0==VALUE_KW||(LA30_0>=VAR_I_KW && LA30_0<=VAR_A_KW)||LA30_0==FLOAT||LA30_0==RANDOM_KW||(LA30_0>=PLUS && LA30_0<=Z)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:166:2: accesLocal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_typeAcces1015);
                    accesLocal138=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal138.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:166:19: operation[st] ( IDENT | accesGlobal[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_typeAcces1020);
                    operation139=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, operation139.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:166:33: ( IDENT | accesGlobal[st] )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENT) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==CAMERA||LA29_0==MEDIA||(LA29_0>=ALLY && LA29_0<=NEUTRAL)||LA29_0==PG||(LA29_0>=COUNTER && LA29_0<=TELEPORTER)) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:166:34: IDENT
                            {
                            _last = (CommonTree)input.LT(1);
                            IDENT140=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeAcces1024); 
                            IDENT140_tree = (CommonTree)adaptor.dupNode(IDENT140);

                            adaptor.addChild(root_0, IDENT140_tree);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:166:42: accesGlobal[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_accesGlobal_in_typeAcces1028);
                            accesGlobal141=accesGlobal(st);

                            state._fsp--;

                            adaptor.addChild(root_0, accesGlobal141.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:168:1: typeDestination[SymbolTable st] returns [Code c] : ( accesLocal[st] | coordinates[st] );
    public final hightTree.typeDestination_return typeDestination(SymbolTable st) throws RecognitionException {
        hightTree.typeDestination_return retval = new hightTree.typeDestination_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.accesLocal_return accesLocal142 = null;

        hightTree.coordinates_return coordinates143 = null;



        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:168:50: ( accesLocal[st] | coordinates[st] )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT||LA31_0==PLAYER||LA31_0==NUM) ) {
                alt31=1;
            }
            else if ( (LA31_0==COORDINATE_KW) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:169:2: accesLocal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_typeDestination1045);
                    accesLocal142=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal142.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:169:19: coordinates[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_coordinates_in_typeDestination1050);
                    coordinates143=coordinates(st);

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates143.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:171:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesLocal[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );
    public final hightTree.actionObjet_return actionObjet(SymbolTable st) throws RecognitionException {
        hightTree.actionObjet_return retval = new hightTree.actionObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DIES_KW144=null;
        CommonTree DURING146=null;
        CommonTree UNTIL150=null;
        CommonTree EQUIP153=null;
        CommonTree EQUIP155=null;
        CommonTree NEXT156=null;
        CommonTree EQUIP157=null;
        CommonTree PREVIOUS158=null;
        hightTree.actionCommandePressee_return actionCommandePressee145 = null;

        hightTree.actionCommandeMaintenue_return actionCommandeMaintenue147 = null;

        hightTree.operation_return operation148 = null;

        hightTree.timeUnit_return timeUnit149 = null;

        hightTree.actionCommandeMaintenue_return actionCommandeMaintenue151 = null;

        hightTree.conditions_return conditions152 = null;

        hightTree.accesLocal_return accesLocal154 = null;


        CommonTree DIES_KW144_tree=null;
        CommonTree DURING146_tree=null;
        CommonTree UNTIL150_tree=null;
        CommonTree EQUIP153_tree=null;
        CommonTree EQUIP155_tree=null;
        CommonTree NEXT156_tree=null;
        CommonTree EQUIP157_tree=null;
        CommonTree PREVIOUS158_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:171:46: ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesLocal[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) )
            int alt32=7;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:172:3: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DIES_KW144=(CommonTree)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1066); 
                    DIES_KW144_tree = (CommonTree)adaptor.dupNode(DIES_KW144);

                    adaptor.addChild(root_0, DIES_KW144_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:173:5: actionCommandePressee[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1072);
                    actionCommandePressee145=actionCommandePressee(st);

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee145.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:174:4: ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DURING146=(CommonTree)match(input,DURING,FOLLOW_DURING_in_actionObjet1079); 
                    DURING146_tree = (CommonTree)adaptor.dupNode(DURING146);

                    root_1 = (CommonTree)adaptor.becomeRoot(DURING146_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1081);
                    actionCommandeMaintenue147=actionCommandeMaintenue(st);

                    state._fsp--;

                    adaptor.addChild(root_1, actionCommandeMaintenue147.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_actionObjet1084);
                    operation148=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation148.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timeUnit_in_actionObjet1087);
                    timeUnit149=timeUnit(st);

                    state._fsp--;

                    adaptor.addChild(root_1, timeUnit149.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:175:4: ^( UNTIL actionCommandeMaintenue[st] conditions[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UNTIL150=(CommonTree)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1095); 
                    UNTIL150_tree = (CommonTree)adaptor.dupNode(UNTIL150);

                    root_1 = (CommonTree)adaptor.becomeRoot(UNTIL150_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1097);
                    actionCommandeMaintenue151=actionCommandeMaintenue(st);

                    state._fsp--;

                    adaptor.addChild(root_1, actionCommandeMaintenue151.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_actionObjet1100);
                    conditions152=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions152.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:176:4: ^( EQUIP accesLocal[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUIP153=(CommonTree)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1108); 
                    EQUIP153_tree = (CommonTree)adaptor.dupNode(EQUIP153);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUIP153_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_actionObjet1110);
                    accesLocal154=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesLocal154.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:177:4: ^( EQUIP NEXT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUIP155=(CommonTree)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1119); 
                    EQUIP155_tree = (CommonTree)adaptor.dupNode(EQUIP155);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUIP155_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NEXT156=(CommonTree)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1121); 
                    NEXT156_tree = (CommonTree)adaptor.dupNode(NEXT156);

                    adaptor.addChild(root_1, NEXT156_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:178:4: ^( EQUIP PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUIP157=(CommonTree)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1129); 
                    EQUIP157_tree = (CommonTree)adaptor.dupNode(EQUIP157);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUIP157_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    PREVIOUS158=(CommonTree)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1131); 
                    PREVIOUS158_tree = (CommonTree)adaptor.dupNode(PREVIOUS158);

                    adaptor.addChild(root_1, PREVIOUS158_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:181:1: transformation[SymbolTable st] returns [Code c] : ( TRANSLATION | ROTATION | SCALE );
    public final hightTree.transformation_return transformation(SymbolTable st) throws RecognitionException {
        hightTree.transformation_return retval = new hightTree.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set159=null;

        CommonTree set159_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:181:49: ( TRANSLATION | ROTATION | SCALE )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set159=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
                input.consume();

                set159_tree = (CommonTree)adaptor.dupNode(set159);

                adaptor.addChild(root_0, set159_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:187:1: coordinates[SymbolTable st] returns [Code c] : ^( COORDINATE_KW operation[st] operation[st] operation[st] ) ;
    public final hightTree.coordinates_return coordinates(SymbolTable st) throws RecognitionException {
        hightTree.coordinates_return retval = new hightTree.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COORDINATE_KW160=null;
        hightTree.operation_return operation161 = null;

        hightTree.operation_return operation162 = null;

        hightTree.operation_return operation163 = null;


        CommonTree COORDINATE_KW160_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:187:46: ( ^( COORDINATE_KW operation[st] operation[st] operation[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:188:2: ^( COORDINATE_KW operation[st] operation[st] operation[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COORDINATE_KW160=(CommonTree)match(input,COORDINATE_KW,FOLLOW_COORDINATE_KW_in_coordinates1182); 
            COORDINATE_KW160_tree = (CommonTree)adaptor.dupNode(COORDINATE_KW160);

            root_1 = (CommonTree)adaptor.becomeRoot(COORDINATE_KW160_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_coordinates1184);
            operation161=operation(st);

            state._fsp--;

            adaptor.addChild(root_1, operation161.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_coordinates1187);
            operation162=operation(st);

            state._fsp--;

            adaptor.addChild(root_1, operation162.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_operation_in_coordinates1190);
            operation163=operation(st);

            state._fsp--;

            adaptor.addChild(root_1, operation163.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:193:1: commande[SymbolTable st] returns [Code c] : ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) ;
    public final hightTree.commande_return commande(SymbolTable st) throws RecognitionException {
        hightTree.commande_return retval = new hightTree.commande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COMMAND_KW164=null;
        CommonTree IDENT165=null;
        hightTree.actionCommande_list_return actionCommande_list166 = null;


        CommonTree COMMAND_KW164_tree=null;
        CommonTree IDENT165_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:193:43: ( ^( COMMAND_KW ( IDENT )? actionCommande_list[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:194:2: ^( COMMAND_KW ( IDENT )? actionCommande_list[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COMMAND_KW164=(CommonTree)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1212); 
            COMMAND_KW164_tree = (CommonTree)adaptor.dupNode(COMMAND_KW164);

            root_1 = (CommonTree)adaptor.becomeRoot(COMMAND_KW164_tree, root_1);



            match(input, Token.DOWN, null); 
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:194:15: ( IDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:194:15: IDENT
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENT165=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_commande1214); 
                    IDENT165_tree = (CommonTree)adaptor.dupNode(IDENT165);

                    adaptor.addChild(root_1, IDENT165_tree);


                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_actionCommande_list_in_commande1217);
            actionCommande_list166=actionCommande_list(st);

            state._fsp--;

            adaptor.addChild(root_1, actionCommande_list166.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:197:1: actionCommande_list[SymbolTable st] returns [Code c] : ( actionCommande[st] )+ ;
    public final hightTree.actionCommande_list_return actionCommande_list(SymbolTable st) throws RecognitionException {
        hightTree.actionCommande_list_return retval = new hightTree.actionCommande_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.actionCommande_return actionCommande167 = null;



        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:197:53: ( ( actionCommande[st] )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:198:2: ( actionCommande[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:198:2: ( actionCommande[st] )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=MOUSE_KW && LA34_0<=KEY_KW)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:198:2: actionCommande[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_actionCommande_in_actionCommande_list1235);
            	    actionCommande167=actionCommande(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionCommande167.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:201:1: actionCommande[SymbolTable st] returns [Code c] : ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) );
    public final hightTree.actionCommande_return actionCommande(SymbolTable st) throws RecognitionException {
        hightTree.actionCommande_return retval = new hightTree.actionCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MOUSE_KW168=null;
        CommonTree KEY_KW171=null;
        hightTree.souris_return souris169 = null;

        hightTree.actionCommandeType_return actionCommandeType170 = null;

        hightTree.clavier_return clavier172 = null;

        hightTree.actionCommandeType_return actionCommandeType173 = null;


        CommonTree MOUSE_KW168_tree=null;
        CommonTree KEY_KW171_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:201:49: ( ^( MOUSE_KW souris[st] actionCommandeType[st] ) | ^( KEY_KW clavier[st] actionCommandeType[st] ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==MOUSE_KW) ) {
                alt35=1;
            }
            else if ( (LA35_0==KEY_KW) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:202:2: ^( MOUSE_KW souris[st] actionCommandeType[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MOUSE_KW168=(CommonTree)match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande1255); 
                    MOUSE_KW168_tree = (CommonTree)adaptor.dupNode(MOUSE_KW168);

                    root_1 = (CommonTree)adaptor.becomeRoot(MOUSE_KW168_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_souris_in_actionCommande1257);
                        souris169=souris(st);

                        state._fsp--;

                        adaptor.addChild(root_1, souris169.getTree());
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_actionCommandeType_in_actionCommande1260);
                        actionCommandeType170=actionCommandeType(st);

                        state._fsp--;

                        adaptor.addChild(root_1, actionCommandeType170.getTree());

                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:203:3: ^( KEY_KW clavier[st] actionCommandeType[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    KEY_KW171=(CommonTree)match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande1268); 
                    KEY_KW171_tree = (CommonTree)adaptor.dupNode(KEY_KW171);

                    root_1 = (CommonTree)adaptor.becomeRoot(KEY_KW171_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_clavier_in_actionCommande1270);
                        clavier172=clavier(st);

                        state._fsp--;

                        adaptor.addChild(root_1, clavier172.getTree());
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_actionCommandeType_in_actionCommande1273);
                        actionCommandeType173=actionCommandeType(st);

                        state._fsp--;

                        adaptor.addChild(root_1, actionCommandeType173.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:206:1: actionCommandeType[SymbolTable st] returns [Code c] : ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] );
    public final hightTree.actionCommandeType_return actionCommandeType(SymbolTable st) throws RecognitionException {
        hightTree.actionCommandeType_return retval = new hightTree.actionCommandeType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT174=null;
        hightTree.actionCommandePressee_return actionCommandePressee175 = null;

        hightTree.actionCommandeMaintenue_return actionCommandeMaintenue176 = null;


        CommonTree IDENT174_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:206:53: ( IDENT | actionCommandePressee[st] | actionCommandeMaintenue[st] )
            int alt36=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt36=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt36=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:207:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT174=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1292); 
                    IDENT174_tree = (CommonTree)adaptor.dupNode(IDENT174);

                    adaptor.addChild(root_0, IDENT174_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:207:10: actionCommandePressee[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1296);
                    actionCommandePressee175=actionCommandePressee(st);

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee175.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:207:38: actionCommandeMaintenue[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1301);
                    actionCommandeMaintenue176=actionCommandeMaintenue(st);

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue176.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:210:1: souris[SymbolTable st] returns [Code c] : ( UP | DOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final hightTree.souris_return souris(SymbolTable st) throws RecognitionException {
        hightTree.souris_return retval = new hightTree.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set177=null;

        CommonTree set177_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:210:41: ( UP | DOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set177=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=DOWN && input.LA(1)<=UP)||(input.LA(1)>=LEFT && input.LA(1)<=SCROLL_DOWN) ) {
                input.consume();

                set177_tree = (CommonTree)adaptor.dupNode(set177);

                adaptor.addChild(root_0, set177_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:214:1: clavier[SymbolTable st] returns [Code c] : ( LETTER | UP | DOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final hightTree.clavier_return clavier(SymbolTable st) throws RecognitionException {
        hightTree.clavier_return retval = new hightTree.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set178=null;

        CommonTree set178_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:214:42: ( LETTER | UP | DOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set178=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=DOWN && input.LA(1)<=UP)||(input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
                input.consume();

                set178_tree = (CommonTree)adaptor.dupNode(set178);

                adaptor.addChild(root_0, set178_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:218:1: actionCommandePressee[SymbolTable st] returns [Code c] : ( JUMP operation[st] | PAUSE_KW | STOP_KW );
    public final hightTree.actionCommandePressee_return actionCommandePressee(SymbolTable st) throws RecognitionException {
        hightTree.actionCommandePressee_return retval = new hightTree.actionCommandePressee_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree JUMP179=null;
        CommonTree PAUSE_KW181=null;
        CommonTree STOP_KW182=null;
        hightTree.operation_return operation180 = null;


        CommonTree JUMP179_tree=null;
        CommonTree PAUSE_KW181_tree=null;
        CommonTree STOP_KW182_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:218:56: ( JUMP operation[st] | PAUSE_KW | STOP_KW )
            int alt37=3;
            switch ( input.LA(1) ) {
            case JUMP:
                {
                alt37=1;
                }
                break;
            case PAUSE_KW:
                {
                alt37=2;
                }
                break;
            case STOP_KW:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:219:3: JUMP operation[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    JUMP179=(CommonTree)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1429); 
                    JUMP179_tree = (CommonTree)adaptor.dupNode(JUMP179);

                    adaptor.addChild(root_0, JUMP179_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_actionCommandePressee1431);
                    operation180=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, operation180.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:220:5: PAUSE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PAUSE_KW181=(CommonTree)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1438); 
                    PAUSE_KW181_tree = (CommonTree)adaptor.dupNode(PAUSE_KW181);

                    adaptor.addChild(root_0, PAUSE_KW181_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:221:5: STOP_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    STOP_KW182=(CommonTree)match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1444); 
                    STOP_KW182_tree = (CommonTree)adaptor.dupNode(STOP_KW182);

                    adaptor.addChild(root_0, STOP_KW182_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:224:1: actionCommandeMaintenue[SymbolTable st] returns [Code c] : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
    public final hightTree.actionCommandeMaintenue_return actionCommandeMaintenue(SymbolTable st) throws RecognitionException {
        hightTree.actionCommandeMaintenue_return retval = new hightTree.actionCommandeMaintenue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MOVE183=null;
        CommonTree set184=null;
        CommonTree TURN185=null;
        CommonTree set186=null;
        CommonTree ACCELERATE187=null;
        CommonTree BRAKE188=null;

        CommonTree MOVE183_tree=null;
        CommonTree set184_tree=null;
        CommonTree TURN185_tree=null;
        CommonTree set186_tree=null;
        CommonTree ACCELERATE187_tree=null;
        CommonTree BRAKE188_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:224:58: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
            int alt38=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt38=1;
                }
                break;
            case TURN:
                {
                alt38=2;
                }
                break;
            case ACCELERATE:
                {
                alt38=3;
                }
                break;
            case BRAKE:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:225:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    MOVE183=(CommonTree)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1464); 
                    MOVE183_tree = (CommonTree)adaptor.dupNode(MOVE183);

                    adaptor.addChild(root_0, MOVE183_tree);

                    _last = (CommonTree)input.LT(1);
                    set184=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=FORWARD && input.LA(1)<=BACKWARD) ) {
                        input.consume();

                        set184_tree = (CommonTree)adaptor.dupNode(set184);

                        adaptor.addChild(root_0, set184_tree);

                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:226:5: TURN ( LEFT | RIGHT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    TURN185=(CommonTree)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1486); 
                    TURN185_tree = (CommonTree)adaptor.dupNode(TURN185);

                    adaptor.addChild(root_0, TURN185_tree);

                    _last = (CommonTree)input.LT(1);
                    set186=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT) ) {
                        input.consume();

                        set186_tree = (CommonTree)adaptor.dupNode(set186);

                        adaptor.addChild(root_0, set186_tree);

                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:227:5: ACCELERATE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ACCELERATE187=(CommonTree)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1500); 
                    ACCELERATE187_tree = (CommonTree)adaptor.dupNode(ACCELERATE187);

                    adaptor.addChild(root_0, ACCELERATE187_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:228:5: BRAKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    BRAKE188=(CommonTree)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1506); 
                    BRAKE188_tree = (CommonTree)adaptor.dupNode(BRAKE188);

                    adaptor.addChild(root_0, BRAKE188_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:231:1: activCommande[SymbolTable st] returns [Code c] : ( ^( ACTIVATE_KW type_Command[st] ) | ^( DISABLE_KW type_Command[st] ) );
    public final hightTree.activCommande_return activCommande(SymbolTable st) throws RecognitionException {
        hightTree.activCommande_return retval = new hightTree.activCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ACTIVATE_KW189=null;
        CommonTree DISABLE_KW191=null;
        hightTree.type_Command_return type_Command190 = null;

        hightTree.type_Command_return type_Command192 = null;


        CommonTree ACTIVATE_KW189_tree=null;
        CommonTree DISABLE_KW191_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:231:48: ( ^( ACTIVATE_KW type_Command[st] ) | ^( DISABLE_KW type_Command[st] ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ACTIVATE_KW) ) {
                alt39=1;
            }
            else if ( (LA39_0==DISABLE_KW) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:232:3: ^( ACTIVATE_KW type_Command[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ACTIVATE_KW189=(CommonTree)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1527); 
                    ACTIVATE_KW189_tree = (CommonTree)adaptor.dupNode(ACTIVATE_KW189);

                    root_1 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW189_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_Command_in_activCommande1529);
                    type_Command190=type_Command(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_Command190.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:233:4: ^( DISABLE_KW type_Command[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DISABLE_KW191=(CommonTree)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1538); 
                    DISABLE_KW191_tree = (CommonTree)adaptor.dupNode(DISABLE_KW191);

                    root_1 = (CommonTree)adaptor.becomeRoot(DISABLE_KW191_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_Command_in_activCommande1540);
                    type_Command192=type_Command(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_Command192.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:236:1: type_Command[SymbolTable st] returns [Code c] : ( COMMANDS | MOUSE_KW ( souris[st] ( VIRG souris[st] )* )? | KEY_KW clavier[st] ( VIRG clavier[st] )* | KEYBOARD );
    public final hightTree.type_Command_return type_Command(SymbolTable st) throws RecognitionException {
        hightTree.type_Command_return retval = new hightTree.type_Command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COMMANDS193=null;
        CommonTree MOUSE_KW194=null;
        CommonTree VIRG196=null;
        CommonTree KEY_KW198=null;
        CommonTree VIRG200=null;
        CommonTree KEYBOARD202=null;
        hightTree.souris_return souris195 = null;

        hightTree.souris_return souris197 = null;

        hightTree.clavier_return clavier199 = null;

        hightTree.clavier_return clavier201 = null;


        CommonTree COMMANDS193_tree=null;
        CommonTree MOUSE_KW194_tree=null;
        CommonTree VIRG196_tree=null;
        CommonTree KEY_KW198_tree=null;
        CommonTree VIRG200_tree=null;
        CommonTree KEYBOARD202_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:236:47: ( COMMANDS | MOUSE_KW ( souris[st] ( VIRG souris[st] )* )? | KEY_KW clavier[st] ( VIRG clavier[st] )* | KEYBOARD )
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:237:2: COMMANDS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    COMMANDS193=(CommonTree)match(input,COMMANDS,FOLLOW_COMMANDS_in_type_Command1558); 
                    COMMANDS193_tree = (CommonTree)adaptor.dupNode(COMMANDS193);

                    adaptor.addChild(root_0, COMMANDS193_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:4: MOUSE_KW ( souris[st] ( VIRG souris[st] )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    MOUSE_KW194=(CommonTree)match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_type_Command1564); 
                    MOUSE_KW194_tree = (CommonTree)adaptor.dupNode(MOUSE_KW194);

                    adaptor.addChild(root_0, MOUSE_KW194_tree);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:13: ( souris[st] ( VIRG souris[st] )* )?
                    int alt41=2;
                    alt41 = dfa41.predict(input);
                    switch (alt41) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:14: souris[st] ( VIRG souris[st] )*
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_souris_in_type_Command1567);
                            souris195=souris(st);

                            state._fsp--;

                            adaptor.addChild(root_0, souris195.getTree());
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:25: ( VIRG souris[st] )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==VIRG) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:238:26: VIRG souris[st]
                            	    {
                            	    _last = (CommonTree)input.LT(1);
                            	    VIRG196=(CommonTree)match(input,VIRG,FOLLOW_VIRG_in_type_Command1571); 
                            	    _last = (CommonTree)input.LT(1);
                            	    pushFollow(FOLLOW_souris_in_type_Command1574);
                            	    souris197=souris(st);

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, souris197.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:239:4: KEY_KW clavier[st] ( VIRG clavier[st] )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    KEY_KW198=(CommonTree)match(input,KEY_KW,FOLLOW_KEY_KW_in_type_Command1584); 
                    KEY_KW198_tree = (CommonTree)adaptor.dupNode(KEY_KW198);

                    adaptor.addChild(root_0, KEY_KW198_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_clavier_in_type_Command1586);
                    clavier199=clavier(st);

                    state._fsp--;

                    adaptor.addChild(root_0, clavier199.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:239:23: ( VIRG clavier[st] )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==VIRG) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:239:24: VIRG clavier[st]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    VIRG200=(CommonTree)match(input,VIRG,FOLLOW_VIRG_in_type_Command1590); 
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_clavier_in_type_Command1593);
                    	    clavier201=clavier(st);

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, clavier201.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:240:4: KEYBOARD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    KEYBOARD202=(CommonTree)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_type_Command1602); 
                    KEYBOARD202_tree = (CommonTree)adaptor.dupNode(KEYBOARD202);

                    adaptor.addChild(root_0, KEYBOARD202_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:242:1: reglesJeu[SymbolTable st] returns [Code c] : ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) ;
    public final hightTree.reglesJeu_return reglesJeu(SymbolTable st) throws RecognitionException {
        hightTree.reglesJeu_return retval = new hightTree.reglesJeu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RULE_KW203=null;
        CommonTree IDENT204=null;
        hightTree.declencheur_return declencheur205 = null;

        hightTree.consequences_return consequences206 = null;


        CommonTree RULE_KW203_tree=null;
        CommonTree IDENT204_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:242:44: ( ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:243:3: ^( RULE_KW ( IDENT )? declencheur[st] consequences[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            RULE_KW203=(CommonTree)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1620); 
            RULE_KW203_tree = (CommonTree)adaptor.dupNode(RULE_KW203);

            root_1 = (CommonTree)adaptor.becomeRoot(RULE_KW203_tree, root_1);



            match(input, Token.DOWN, null); 
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:243:13: ( IDENT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==IDENT) ) {
                int LA44_1 = input.LA(2);

                if ( ((LA44_1>=BECOMES_VAR_KW && LA44_1<=BECOMES_ID_KW)||LA44_1==IDENT||LA44_1==CAMERA||LA44_1==MEDIA||(LA44_1>=PLAYER && LA44_1<=NEUTRAL)||(LA44_1>=VICTORY_KW && LA44_1<=STARTS_KW)||LA44_1==PG||(LA44_1>=ALL && LA44_1<=NUM)||(LA44_1>=COUNTER && LA44_1<=TELEPORTER)) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:243:13: IDENT
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENT204=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1622); 
                    IDENT204_tree = (CommonTree)adaptor.dupNode(IDENT204);

                    adaptor.addChild(root_1, IDENT204_tree);


                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_declencheur_in_reglesJeu1625);
            declencheur205=declencheur(st);

            state._fsp--;

            adaptor.addChild(root_1, declencheur205.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_consequences_in_reglesJeu1628);
            consequences206=consequences(st);

            state._fsp--;

            adaptor.addChild(root_1, consequences206.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:246:1: declencheur[SymbolTable st] returns [Code c] : ( accesClasse[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW );
    public final hightTree.declencheur_return declencheur(SymbolTable st) throws RecognitionException {
        hightTree.declencheur_return retval = new hightTree.declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MOVES_KW208=null;
        CommonTree DIES_KW209=null;
        CommonTree ENDS_KW212=null;
        CommonTree STARTS_KW214=null;
        CommonTree BECOMES_VAR_KW216=null;
        CommonTree BECOMES_ID_KW219=null;
        CommonTree IDENT220=null;
        CommonTree VICTORY_KW222=null;
        CommonTree DEFEAT_KW223=null;
        hightTree.accesClasse_return accesClasse207 = null;

        hightTree.declencheurTK_return declencheurTK210 = null;

        hightTree.declencheurKT_return declencheurKT211 = null;

        hightTree.type_declencheur_return type_declencheur213 = null;

        hightTree.type_declencheur_return type_declencheur215 = null;

        hightTree.variable_return variable217 = null;

        hightTree.varOuNB_return varOuNB218 = null;

        hightTree.playerOuInteraction_return playerOuInteraction221 = null;


        CommonTree MOVES_KW208_tree=null;
        CommonTree DIES_KW209_tree=null;
        CommonTree ENDS_KW212_tree=null;
        CommonTree STARTS_KW214_tree=null;
        CommonTree BECOMES_VAR_KW216_tree=null;
        CommonTree BECOMES_ID_KW219_tree=null;
        CommonTree IDENT220_tree=null;
        CommonTree VICTORY_KW222_tree=null;
        CommonTree DEFEAT_KW223_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:246:46: ( accesClasse[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] ) | ^( ENDS_KW type_declencheur[st] ) | ^( STARTS_KW type_declencheur[st] ) | ^( BECOMES_VAR_KW variable[st] varOuNB[st] ) | ^( BECOMES_ID_KW IDENT playerOuInteraction[st] ) | VICTORY_KW | DEFEAT_KW )
            int alt46=7;
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:3: accesClasse[st] ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_declencheur1649);
                    accesClasse207=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse207.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:19: ( MOVES_KW | DIES_KW | declencheurTK[st] | declencheurKT[st] )
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
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:20: MOVES_KW
                            {
                            _last = (CommonTree)input.LT(1);
                            MOVES_KW208=(CommonTree)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1653); 
                            MOVES_KW208_tree = (CommonTree)adaptor.dupNode(MOVES_KW208);

                            adaptor.addChild(root_0, MOVES_KW208_tree);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:31: DIES_KW
                            {
                            _last = (CommonTree)input.LT(1);
                            DIES_KW209=(CommonTree)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1657); 
                            DIES_KW209_tree = (CommonTree)adaptor.dupNode(DIES_KW209);

                            adaptor.addChild(root_0, DIES_KW209_tree);


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:41: declencheurTK[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1661);
                            declencheurTK210=declencheurTK(st);

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK210.getTree());

                            }
                            break;
                        case 4 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:247:61: declencheurKT[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1666);
                            declencheurKT211=declencheurKT(st);

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT211.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:248:4: ^( ENDS_KW type_declencheur[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ENDS_KW212=(CommonTree)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1675); 
                    ENDS_KW212_tree = (CommonTree)adaptor.dupNode(ENDS_KW212);

                    root_1 = (CommonTree)adaptor.becomeRoot(ENDS_KW212_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1677);
                    type_declencheur213=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur213.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:249:4: ^( STARTS_KW type_declencheur[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STARTS_KW214=(CommonTree)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1685); 
                    STARTS_KW214_tree = (CommonTree)adaptor.dupNode(STARTS_KW214);

                    root_1 = (CommonTree)adaptor.becomeRoot(STARTS_KW214_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_declencheur1687);
                    type_declencheur215=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur215.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:250:4: ^( BECOMES_VAR_KW variable[st] varOuNB[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BECOMES_VAR_KW216=(CommonTree)match(input,BECOMES_VAR_KW,FOLLOW_BECOMES_VAR_KW_in_declencheur1705); 
                    BECOMES_VAR_KW216_tree = (CommonTree)adaptor.dupNode(BECOMES_VAR_KW216);

                    root_1 = (CommonTree)adaptor.becomeRoot(BECOMES_VAR_KW216_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_declencheur1707);
                    variable217=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable217.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOuNB_in_declencheur1710);
                    varOuNB218=varOuNB(st);

                    state._fsp--;

                    adaptor.addChild(root_1, varOuNB218.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:251:4: ^( BECOMES_ID_KW IDENT playerOuInteraction[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BECOMES_ID_KW219=(CommonTree)match(input,BECOMES_ID_KW,FOLLOW_BECOMES_ID_KW_in_declencheur1718); 
                    BECOMES_ID_KW219_tree = (CommonTree)adaptor.dupNode(BECOMES_ID_KW219);

                    root_1 = (CommonTree)adaptor.becomeRoot(BECOMES_ID_KW219_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT220=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declencheur1720); 
                    IDENT220_tree = (CommonTree)adaptor.dupNode(IDENT220);

                    adaptor.addChild(root_1, IDENT220_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1722);
                    playerOuInteraction221=playerOuInteraction(st);

                    state._fsp--;

                    adaptor.addChild(root_1, playerOuInteraction221.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:252:4: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    VICTORY_KW222=(CommonTree)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur1729); 
                    VICTORY_KW222_tree = (CommonTree)adaptor.dupNode(VICTORY_KW222);

                    adaptor.addChild(root_0, VICTORY_KW222_tree);


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:253:4: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DEFEAT_KW223=(CommonTree)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur1735); 
                    DEFEAT_KW223_tree = (CommonTree)adaptor.dupNode(DEFEAT_KW223);

                    adaptor.addChild(root_0, DEFEAT_KW223_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:256:1: type_declencheur[SymbolTable st] returns [Code c] : ( IDENT | GAME );
    public final hightTree.type_declencheur_return type_declencheur(SymbolTable st) throws RecognitionException {
        hightTree.type_declencheur_return retval = new hightTree.type_declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set224=null;

        CommonTree set224_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:256:51: ( IDENT | GAME )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set224=(CommonTree)input.LT(1);
            if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                input.consume();

                set224_tree = (CommonTree)adaptor.dupNode(set224);

                adaptor.addChild(root_0, set224_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:259:1: varOuNB[SymbolTable st] returns [Code c] : ( variable[st] | FLOAT );
    public final hightTree.varOuNB_return varOuNB(SymbolTable st) throws RecognitionException {
        hightTree.varOuNB_return retval = new hightTree.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FLOAT226=null;
        hightTree.variable_return variable225 = null;


        CommonTree FLOAT226_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:259:42: ( variable[st] | FLOAT )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==GAME_SCORE_KW||LA47_0==VALUE_KW||(LA47_0>=VAR_I_KW && LA47_0<=VAR_A_KW)||(LA47_0>=X && LA47_0<=Z)) ) {
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:259:44: variable[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_varOuNB1771);
                    variable225=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_0, variable225.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:259:59: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    FLOAT226=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB1776); 
                    FLOAT226_tree = (CommonTree)adaptor.dupNode(FLOAT226);

                    adaptor.addChild(root_0, FLOAT226_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:261:1: playerOuInteraction[SymbolTable st] returns [Code c] : ( PLAYER | interaction[st] ) ;
    public final hightTree.playerOuInteraction_return playerOuInteraction(SymbolTable st) throws RecognitionException {
        hightTree.playerOuInteraction_return retval = new hightTree.playerOuInteraction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PLAYER227=null;
        hightTree.interaction_return interaction228 = null;


        CommonTree PLAYER227_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:262:2: ( ( PLAYER | interaction[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:262:4: ( PLAYER | interaction[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:262:4: ( PLAYER | interaction[st] )
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:262:5: PLAYER
                    {
                    _last = (CommonTree)input.LT(1);
                    PLAYER227=(CommonTree)match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction1792); 
                    PLAYER227_tree = (CommonTree)adaptor.dupNode(PLAYER227);

                    adaptor.addChild(root_0, PLAYER227_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:262:13: interaction[st]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction1795);
                    interaction228=interaction(st);

                    state._fsp--;

                    adaptor.addChild(root_0, interaction228.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:264:1: declencheurTK[SymbolTable st] returns [Code c] : ( ^( TOUCHES_KW declencheur_O[st] ) | ^( KILLS_KW declencheur_O[st] ) );
    public final hightTree.declencheurTK_return declencheurTK(SymbolTable st) throws RecognitionException {
        hightTree.declencheurTK_return retval = new hightTree.declencheurTK_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TOUCHES_KW229=null;
        CommonTree KILLS_KW231=null;
        hightTree.declencheur_O_return declencheur_O230 = null;

        hightTree.declencheur_O_return declencheur_O232 = null;


        CommonTree TOUCHES_KW229_tree=null;
        CommonTree KILLS_KW231_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:265:2: ( ^( TOUCHES_KW declencheur_O[st] ) | ^( KILLS_KW declencheur_O[st] ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==TOUCHES_KW) ) {
                alt49=1;
            }
            else if ( (LA49_0==KILLS_KW) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:265:4: ^( TOUCHES_KW declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOUCHES_KW229=(CommonTree)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK1813); 
                    TOUCHES_KW229_tree = (CommonTree)adaptor.dupNode(TOUCHES_KW229);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW229_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_declencheurTK1815);
                    declencheur_O230=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O230.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:266:4: ^( KILLS_KW declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    KILLS_KW231=(CommonTree)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK1823); 
                    KILLS_KW231_tree = (CommonTree)adaptor.dupNode(KILLS_KW231);

                    root_1 = (CommonTree)adaptor.becomeRoot(KILLS_KW231_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_declencheurTK1825);
                    declencheur_O232=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O232.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:270:1: declencheurKT[SymbolTable st] returns [Code c] : ( ^( KILLED_KW declencheur_O[st] ) | ^( TOUCHED_KW declencheur_O[st] ) );
    public final hightTree.declencheurKT_return declencheurKT(SymbolTable st) throws RecognitionException {
        hightTree.declencheurKT_return retval = new hightTree.declencheurKT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree KILLED_KW233=null;
        CommonTree TOUCHED_KW235=null;
        hightTree.declencheur_O_return declencheur_O234 = null;

        hightTree.declencheur_O_return declencheur_O236 = null;


        CommonTree KILLED_KW233_tree=null;
        CommonTree TOUCHED_KW235_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:271:2: ( ^( KILLED_KW declencheur_O[st] ) | ^( TOUCHED_KW declencheur_O[st] ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KILLED_KW) ) {
                alt50=1;
            }
            else if ( (LA50_0==TOUCHED_KW) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:271:4: ^( KILLED_KW declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    KILLED_KW233=(CommonTree)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT1847); 
                    KILLED_KW233_tree = (CommonTree)adaptor.dupNode(KILLED_KW233);

                    root_1 = (CommonTree)adaptor.becomeRoot(KILLED_KW233_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_declencheurKT1849);
                    declencheur_O234=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O234.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:272:4: ^( TOUCHED_KW declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOUCHED_KW235=(CommonTree)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT1858); 
                    TOUCHED_KW235_tree = (CommonTree)adaptor.dupNode(TOUCHED_KW235);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW235_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_declencheurKT1860);
                    declencheur_O236=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O236.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:1: declencheur_O[SymbolTable st] returns [Code c] : ( ( OTHER )? accesGlobal[st] | accesLocal[st] );
    public final hightTree.declencheur_O_return declencheur_O(SymbolTable st) throws RecognitionException {
        hightTree.declencheur_O_return retval = new hightTree.declencheur_O_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OTHER237=null;
        hightTree.accesGlobal_return accesGlobal238 = null;

        hightTree.accesLocal_return accesLocal239 = null;


        CommonTree OTHER237_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:274:48: ( ( OTHER )? accesGlobal[st] | accesLocal[st] )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==CAMERA||LA52_0==MEDIA||(LA52_0>=ALLY && LA52_0<=NEUTRAL)||LA52_0==OTHER||LA52_0==PG||(LA52_0>=COUNTER && LA52_0<=TELEPORTER)) ) {
                alt52=1;
            }
            else if ( (LA52_0==IDENT||LA52_0==PLAYER||LA52_0==NUM) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:2: ( OTHER )? accesGlobal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:2: ( OTHER )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==OTHER) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:3: OTHER
                            {
                            _last = (CommonTree)input.LT(1);
                            OTHER237=(CommonTree)match(input,OTHER,FOLLOW_OTHER_in_declencheur_O1877); 
                            OTHER237_tree = (CommonTree)adaptor.dupNode(OTHER237);

                            adaptor.addChild(root_0, OTHER237_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesGlobal_in_declencheur_O1881);
                    accesGlobal238=accesGlobal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal238.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:275:29: accesLocal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_declencheur_O1886);
                    accesLocal239=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal239.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:278:1: siAlors[SymbolTable st] returns [Code c] : ^( IF_KW conditions[st] consequences[st] ( consequences[st] )? ) ;
    public final hightTree.siAlors_return siAlors(SymbolTable st) throws RecognitionException {
        hightTree.siAlors_return retval = new hightTree.siAlors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IF_KW240=null;
        hightTree.conditions_return conditions241 = null;

        hightTree.consequences_return consequences242 = null;

        hightTree.consequences_return consequences243 = null;


        CommonTree IF_KW240_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:278:42: ( ^( IF_KW conditions[st] consequences[st] ( consequences[st] )? ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:279:3: ^( IF_KW conditions[st] consequences[st] ( consequences[st] )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IF_KW240=(CommonTree)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors1908); 
            IF_KW240_tree = (CommonTree)adaptor.dupNode(IF_KW240);

            root_1 = (CommonTree)adaptor.becomeRoot(IF_KW240_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_conditions_in_siAlors1910);
            conditions241=conditions(st);

            state._fsp--;

            adaptor.addChild(root_1, conditions241.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_consequences_in_siAlors1913);
            consequences242=consequences(st);

            state._fsp--;

            adaptor.addChild(root_1, consequences242.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:279:43: ( consequences[st] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==CONSEQUENCES_KW) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:279:43: consequences[st]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_consequences_in_siAlors1916);
                    consequences243=consequences(st);

                    state._fsp--;

                    adaptor.addChild(root_1, consequences243.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:282:1: conditions[SymbolTable st] returns [Code c] : ( ^( CONDITION_KW ( NOT )? conditions[st] ) | ^( OR conditions[st] ( NOT )? conditions[st] ) | ^( AND conditions[st] ( NOT )? conditions[st] ) | ^( EQUALS operation[st] operation[st] ) | ^( INF operation[st] operation[st] ) | ^( SUP operation[st] operation[st] ) | ^( INFEG operation[st] operation[st] ) | ^( SUPED operation[st] operation[st] ) | ^( DIFF operation[st] operation[st] ) );
    public final hightTree.conditions_return conditions(SymbolTable st) throws RecognitionException {
        hightTree.conditions_return retval = new hightTree.conditions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_KW244=null;
        CommonTree NOT245=null;
        CommonTree OR247=null;
        CommonTree NOT249=null;
        CommonTree AND251=null;
        CommonTree NOT253=null;
        CommonTree EQUALS255=null;
        CommonTree INF258=null;
        CommonTree SUP261=null;
        CommonTree INFEG264=null;
        CommonTree SUPED267=null;
        CommonTree DIFF270=null;
        hightTree.conditions_return conditions246 = null;

        hightTree.conditions_return conditions248 = null;

        hightTree.conditions_return conditions250 = null;

        hightTree.conditions_return conditions252 = null;

        hightTree.conditions_return conditions254 = null;

        hightTree.operation_return operation256 = null;

        hightTree.operation_return operation257 = null;

        hightTree.operation_return operation259 = null;

        hightTree.operation_return operation260 = null;

        hightTree.operation_return operation262 = null;

        hightTree.operation_return operation263 = null;

        hightTree.operation_return operation265 = null;

        hightTree.operation_return operation266 = null;

        hightTree.operation_return operation268 = null;

        hightTree.operation_return operation269 = null;

        hightTree.operation_return operation271 = null;

        hightTree.operation_return operation272 = null;


        CommonTree CONDITION_KW244_tree=null;
        CommonTree NOT245_tree=null;
        CommonTree OR247_tree=null;
        CommonTree NOT249_tree=null;
        CommonTree AND251_tree=null;
        CommonTree NOT253_tree=null;
        CommonTree EQUALS255_tree=null;
        CommonTree INF258_tree=null;
        CommonTree SUP261_tree=null;
        CommonTree INFEG264_tree=null;
        CommonTree SUPED267_tree=null;
        CommonTree DIFF270_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:282:45: ( ^( CONDITION_KW ( NOT )? conditions[st] ) | ^( OR conditions[st] ( NOT )? conditions[st] ) | ^( AND conditions[st] ( NOT )? conditions[st] ) | ^( EQUALS operation[st] operation[st] ) | ^( INF operation[st] operation[st] ) | ^( SUP operation[st] operation[st] ) | ^( INFEG operation[st] operation[st] ) | ^( SUPED operation[st] operation[st] ) | ^( DIFF operation[st] operation[st] ) )
            int alt57=9;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:283:3: ^( CONDITION_KW ( NOT )? conditions[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONDITION_KW244=(CommonTree)match(input,CONDITION_KW,FOLLOW_CONDITION_KW_in_conditions1938); 
                    CONDITION_KW244_tree = (CommonTree)adaptor.dupNode(CONDITION_KW244);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_KW244_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:283:18: ( NOT )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==NOT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:283:18: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT245=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions1940); 
                            NOT245_tree = (CommonTree)adaptor.dupNode(NOT245);

                            adaptor.addChild(root_1, NOT245_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1943);
                    conditions246=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions246.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:284:4: ^( OR conditions[st] ( NOT )? conditions[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    OR247=(CommonTree)match(input,OR,FOLLOW_OR_in_conditions1951); 
                    OR247_tree = (CommonTree)adaptor.dupNode(OR247);

                    root_1 = (CommonTree)adaptor.becomeRoot(OR247_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1953);
                    conditions248=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions248.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:284:24: ( NOT )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==NOT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:284:24: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT249=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions1956); 
                            NOT249_tree = (CommonTree)adaptor.dupNode(NOT249);

                            adaptor.addChild(root_1, NOT249_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1959);
                    conditions250=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions250.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:285:4: ^( AND conditions[st] ( NOT )? conditions[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AND251=(CommonTree)match(input,AND,FOLLOW_AND_in_conditions1967); 
                    AND251_tree = (CommonTree)adaptor.dupNode(AND251);

                    root_1 = (CommonTree)adaptor.becomeRoot(AND251_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1969);
                    conditions252=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions252.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:285:25: ( NOT )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==NOT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:285:25: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT253=(CommonTree)match(input,NOT,FOLLOW_NOT_in_conditions1972); 
                            NOT253_tree = (CommonTree)adaptor.dupNode(NOT253);

                            adaptor.addChild(root_1, NOT253_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditions_in_conditions1975);
                    conditions254=conditions(st);

                    state._fsp--;

                    adaptor.addChild(root_1, conditions254.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:286:4: ^( EQUALS operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUALS255=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_conditions1983); 
                    EQUALS255_tree = (CommonTree)adaptor.dupNode(EQUALS255);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS255_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions1985);
                    operation256=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation256.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions1988);
                    operation257=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation257.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:287:4: ^( INF operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INF258=(CommonTree)match(input,INF,FOLLOW_INF_in_conditions1996); 
                    INF258_tree = (CommonTree)adaptor.dupNode(INF258);

                    root_1 = (CommonTree)adaptor.becomeRoot(INF258_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions1998);
                    operation259=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation259.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2000);
                    operation260=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation260.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:288:4: ^( SUP operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUP261=(CommonTree)match(input,SUP,FOLLOW_SUP_in_conditions2008); 
                    SUP261_tree = (CommonTree)adaptor.dupNode(SUP261);

                    root_1 = (CommonTree)adaptor.becomeRoot(SUP261_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2010);
                    operation262=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation262.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2013);
                    operation263=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation263.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:289:4: ^( INFEG operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INFEG264=(CommonTree)match(input,INFEG,FOLLOW_INFEG_in_conditions2021); 
                    INFEG264_tree = (CommonTree)adaptor.dupNode(INFEG264);

                    root_1 = (CommonTree)adaptor.becomeRoot(INFEG264_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2023);
                    operation265=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation265.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2026);
                    operation266=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation266.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:290:4: ^( SUPED operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUPED267=(CommonTree)match(input,SUPED,FOLLOW_SUPED_in_conditions2034); 
                    SUPED267_tree = (CommonTree)adaptor.dupNode(SUPED267);

                    root_1 = (CommonTree)adaptor.becomeRoot(SUPED267_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2036);
                    operation268=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation268.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2039);
                    operation269=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation269.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:291:4: ^( DIFF operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIFF270=(CommonTree)match(input,DIFF,FOLLOW_DIFF_in_conditions2047); 
                    DIFF270_tree = (CommonTree)adaptor.dupNode(DIFF270);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIFF270_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2049);
                    operation271=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation271.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_conditions2052);
                    operation272=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation272.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:294:1: etat[SymbolTable st] returns [Code c] : ( ^( DEAD_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( ALIVE_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( EFFACED_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( GENERATED_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( TOUCHING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( MOVING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( WAITING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW );
    public final hightTree.etat_return etat(SymbolTable st) throws RecognitionException {
        hightTree.etat_return retval = new hightTree.etat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEAD_KW273=null;
        CommonTree NOT275=null;
        CommonTree ALIVE_KW277=null;
        CommonTree NOT279=null;
        CommonTree EFFACED_KW281=null;
        CommonTree NOT283=null;
        CommonTree GENERATED_KW285=null;
        CommonTree NOT287=null;
        CommonTree TOUCHING_KW289=null;
        CommonTree NOT291=null;
        CommonTree MOVING_KW293=null;
        CommonTree NOT295=null;
        CommonTree WAITING_KW297=null;
        CommonTree NOT299=null;
        CommonTree FINISHED_KW301=null;
        CommonTree NOT303=null;
        CommonTree STARTED_KW304=null;
        CommonTree NOT306=null;
        CommonTree PAUSED_KW307=null;
        CommonTree NOT309=null;
        CommonTree MUTED_KW310=null;
        CommonTree NOT312=null;
        CommonTree PLAYED_KW314=null;
        CommonTree NOT316=null;
        CommonTree STOPPED_KW317=null;
        CommonTree NOT319=null;
        CommonTree VICTORY_KW320=null;
        CommonTree DEFEAT_KW321=null;
        hightTree.accesClasse_return accesClasse274 = null;

        hightTree.declencheur_O_return declencheur_O276 = null;

        hightTree.accesClasse_return accesClasse278 = null;

        hightTree.declencheur_O_return declencheur_O280 = null;

        hightTree.accesClasse_return accesClasse282 = null;

        hightTree.declencheur_O_return declencheur_O284 = null;

        hightTree.accesClasse_return accesClasse286 = null;

        hightTree.declencheur_O_return declencheur_O288 = null;

        hightTree.accesClasse_return accesClasse290 = null;

        hightTree.declencheur_O_return declencheur_O292 = null;

        hightTree.accesClasse_return accesClasse294 = null;

        hightTree.declencheur_O_return declencheur_O296 = null;

        hightTree.accesClasse_return accesClasse298 = null;

        hightTree.declencheur_O_return declencheur_O300 = null;

        hightTree.type_declencheur_return type_declencheur302 = null;

        hightTree.type_declencheur_return type_declencheur305 = null;

        hightTree.type_declencheur_return type_declencheur308 = null;

        hightTree.type_declencheur_return type_declencheur311 = null;

        hightTree.mode_mute_return mode_mute313 = null;

        hightTree.type_declencheur_return type_declencheur315 = null;

        hightTree.type_declencheur_return type_declencheur318 = null;


        CommonTree DEAD_KW273_tree=null;
        CommonTree NOT275_tree=null;
        CommonTree ALIVE_KW277_tree=null;
        CommonTree NOT279_tree=null;
        CommonTree EFFACED_KW281_tree=null;
        CommonTree NOT283_tree=null;
        CommonTree GENERATED_KW285_tree=null;
        CommonTree NOT287_tree=null;
        CommonTree TOUCHING_KW289_tree=null;
        CommonTree NOT291_tree=null;
        CommonTree MOVING_KW293_tree=null;
        CommonTree NOT295_tree=null;
        CommonTree WAITING_KW297_tree=null;
        CommonTree NOT299_tree=null;
        CommonTree FINISHED_KW301_tree=null;
        CommonTree NOT303_tree=null;
        CommonTree STARTED_KW304_tree=null;
        CommonTree NOT306_tree=null;
        CommonTree PAUSED_KW307_tree=null;
        CommonTree NOT309_tree=null;
        CommonTree MUTED_KW310_tree=null;
        CommonTree NOT312_tree=null;
        CommonTree PLAYED_KW314_tree=null;
        CommonTree NOT316_tree=null;
        CommonTree STOPPED_KW317_tree=null;
        CommonTree NOT319_tree=null;
        CommonTree VICTORY_KW320_tree=null;
        CommonTree DEFEAT_KW321_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:294:39: ( ^( DEAD_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( ALIVE_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( EFFACED_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( GENERATED_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( TOUCHING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( MOVING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( WAITING_KW accesClasse[st] ( NOT )? declencheur_O[st] ) | ^( FINISHED_KW type_declencheur[st] ( NOT )? ) | ^( STARTED_KW type_declencheur[st] ( NOT )? ) | ^( PAUSED_KW type_declencheur[st] ( NOT )? ) | ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] ) | ^( PLAYED_KW type_declencheur[st] ( NOT )? ) | ^( STOPPED_KW type_declencheur[st] ( NOT )? ) | VICTORY_KW | DEFEAT_KW )
            int alt71=15;
            switch ( input.LA(1) ) {
            case DEAD_KW:
                {
                alt71=1;
                }
                break;
            case ALIVE_KW:
                {
                alt71=2;
                }
                break;
            case EFFACED_KW:
                {
                alt71=3;
                }
                break;
            case GENERATED_KW:
                {
                alt71=4;
                }
                break;
            case TOUCHING_KW:
                {
                alt71=5;
                }
                break;
            case MOVING_KW:
                {
                alt71=6;
                }
                break;
            case WAITING_KW:
                {
                alt71=7;
                }
                break;
            case FINISHED_KW:
                {
                alt71=8;
                }
                break;
            case STARTED_KW:
                {
                alt71=9;
                }
                break;
            case PAUSED_KW:
                {
                alt71=10;
                }
                break;
            case MUTED_KW:
                {
                alt71=11;
                }
                break;
            case PLAYED_KW:
                {
                alt71=12;
                }
                break;
            case STOPPED_KW:
                {
                alt71=13;
                }
                break;
            case VICTORY_KW:
                {
                alt71=14;
                }
                break;
            case DEFEAT_KW:
                {
                alt71=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:295:2: ^( DEAD_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DEAD_KW273=(CommonTree)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2072); 
                    DEAD_KW273_tree = (CommonTree)adaptor.dupNode(DEAD_KW273);

                    root_1 = (CommonTree)adaptor.becomeRoot(DEAD_KW273_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2074);
                    accesClasse274=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse274.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:295:28: ( NOT )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==NOT) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:295:29: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT275=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2078); 
                            NOT275_tree = (CommonTree)adaptor.dupNode(NOT275);

                            adaptor.addChild(root_1, NOT275_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2082);
                    declencheur_O276=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O276.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:4: ^( ALIVE_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ALIVE_KW277=(CommonTree)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2090); 
                    ALIVE_KW277_tree = (CommonTree)adaptor.dupNode(ALIVE_KW277);

                    root_1 = (CommonTree)adaptor.becomeRoot(ALIVE_KW277_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2092);
                    accesClasse278=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse278.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:31: ( NOT )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==NOT) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:296:32: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT279=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2096); 
                            NOT279_tree = (CommonTree)adaptor.dupNode(NOT279);

                            adaptor.addChild(root_1, NOT279_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2100);
                    declencheur_O280=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O280.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:297:4: ^( EFFACED_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EFFACED_KW281=(CommonTree)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2108); 
                    EFFACED_KW281_tree = (CommonTree)adaptor.dupNode(EFFACED_KW281);

                    root_1 = (CommonTree)adaptor.becomeRoot(EFFACED_KW281_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2110);
                    accesClasse282=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse282.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:297:33: ( NOT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==NOT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:297:34: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT283=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2114); 
                            NOT283_tree = (CommonTree)adaptor.dupNode(NOT283);

                            adaptor.addChild(root_1, NOT283_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2118);
                    declencheur_O284=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O284.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:298:4: ^( GENERATED_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GENERATED_KW285=(CommonTree)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2126); 
                    GENERATED_KW285_tree = (CommonTree)adaptor.dupNode(GENERATED_KW285);

                    root_1 = (CommonTree)adaptor.becomeRoot(GENERATED_KW285_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2128);
                    accesClasse286=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse286.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:298:35: ( NOT )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==NOT) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:298:36: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT287=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2132); 
                            NOT287_tree = (CommonTree)adaptor.dupNode(NOT287);

                            adaptor.addChild(root_1, NOT287_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2136);
                    declencheur_O288=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O288.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:299:4: ^( TOUCHING_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOUCHING_KW289=(CommonTree)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2144); 
                    TOUCHING_KW289_tree = (CommonTree)adaptor.dupNode(TOUCHING_KW289);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW289_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2146);
                    accesClasse290=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse290.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:299:34: ( NOT )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==NOT) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:299:35: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT291=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2150); 
                            NOT291_tree = (CommonTree)adaptor.dupNode(NOT291);

                            adaptor.addChild(root_1, NOT291_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2154);
                    declencheur_O292=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O292.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:300:4: ^( MOVING_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MOVING_KW293=(CommonTree)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2162); 
                    MOVING_KW293_tree = (CommonTree)adaptor.dupNode(MOVING_KW293);

                    root_1 = (CommonTree)adaptor.becomeRoot(MOVING_KW293_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2164);
                    accesClasse294=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse294.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:300:32: ( NOT )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==NOT) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:300:33: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT295=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2168); 
                            NOT295_tree = (CommonTree)adaptor.dupNode(NOT295);

                            adaptor.addChild(root_1, NOT295_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2172);
                    declencheur_O296=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O296.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:301:4: ^( WAITING_KW accesClasse[st] ( NOT )? declencheur_O[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WAITING_KW297=(CommonTree)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2180); 
                    WAITING_KW297_tree = (CommonTree)adaptor.dupNode(WAITING_KW297);

                    root_1 = (CommonTree)adaptor.becomeRoot(WAITING_KW297_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_etat2182);
                    accesClasse298=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse298.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:301:33: ( NOT )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==NOT) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:301:34: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT299=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2186); 
                            NOT299_tree = (CommonTree)adaptor.dupNode(NOT299);

                            adaptor.addChild(root_1, NOT299_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declencheur_O_in_etat2190);
                    declencheur_O300=declencheur_O(st);

                    state._fsp--;

                    adaptor.addChild(root_1, declencheur_O300.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:302:4: ^( FINISHED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FINISHED_KW301=(CommonTree)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2198); 
                    FINISHED_KW301_tree = (CommonTree)adaptor.dupNode(FINISHED_KW301);

                    root_1 = (CommonTree)adaptor.becomeRoot(FINISHED_KW301_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2200);
                    type_declencheur302=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur302.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:302:39: ( NOT )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==NOT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:302:40: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT303=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2204); 
                            NOT303_tree = (CommonTree)adaptor.dupNode(NOT303);

                            adaptor.addChild(root_1, NOT303_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:303:4: ^( STARTED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STARTED_KW304=(CommonTree)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2213); 
                    STARTED_KW304_tree = (CommonTree)adaptor.dupNode(STARTED_KW304);

                    root_1 = (CommonTree)adaptor.becomeRoot(STARTED_KW304_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2215);
                    type_declencheur305=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur305.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:303:37: ( NOT )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NOT) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:303:38: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT306=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2218); 
                            NOT306_tree = (CommonTree)adaptor.dupNode(NOT306);

                            adaptor.addChild(root_1, NOT306_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 10 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:304:4: ^( PAUSED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PAUSED_KW307=(CommonTree)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2227); 
                    PAUSED_KW307_tree = (CommonTree)adaptor.dupNode(PAUSED_KW307);

                    root_1 = (CommonTree)adaptor.becomeRoot(PAUSED_KW307_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2229);
                    type_declencheur308=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur308.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:304:36: ( NOT )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==NOT) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:304:37: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT309=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2232); 
                            NOT309_tree = (CommonTree)adaptor.dupNode(NOT309);

                            adaptor.addChild(root_1, NOT309_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 11 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:305:4: ^( MUTED_KW type_declencheur[st] ( NOT )? mode_mute[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MUTED_KW310=(CommonTree)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2241); 
                    MUTED_KW310_tree = (CommonTree)adaptor.dupNode(MUTED_KW310);

                    root_1 = (CommonTree)adaptor.becomeRoot(MUTED_KW310_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2243);
                    type_declencheur311=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur311.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:305:36: ( NOT )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==NOT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:305:37: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT312=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2247); 
                            NOT312_tree = (CommonTree)adaptor.dupNode(NOT312);

                            adaptor.addChild(root_1, NOT312_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_mode_mute_in_etat2251);
                    mode_mute313=mode_mute(st);

                    state._fsp--;

                    adaptor.addChild(root_1, mode_mute313.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 12 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:306:4: ^( PLAYED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLAYED_KW314=(CommonTree)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2259); 
                    PLAYED_KW314_tree = (CommonTree)adaptor.dupNode(PLAYED_KW314);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLAYED_KW314_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2261);
                    type_declencheur315=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur315.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:306:37: ( NOT )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==NOT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:306:38: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT316=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2265); 
                            NOT316_tree = (CommonTree)adaptor.dupNode(NOT316);

                            adaptor.addChild(root_1, NOT316_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 13 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:307:4: ^( STOPPED_KW type_declencheur[st] ( NOT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STOPPED_KW317=(CommonTree)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2274); 
                    STOPPED_KW317_tree = (CommonTree)adaptor.dupNode(STOPPED_KW317);

                    root_1 = (CommonTree)adaptor.becomeRoot(STOPPED_KW317_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_declencheur_in_etat2276);
                    type_declencheur318=type_declencheur(st);

                    state._fsp--;

                    adaptor.addChild(root_1, type_declencheur318.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:307:38: ( NOT )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==NOT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:307:39: NOT
                            {
                            _last = (CommonTree)input.LT(1);
                            NOT319=(CommonTree)match(input,NOT,FOLLOW_NOT_in_etat2280); 
                            NOT319_tree = (CommonTree)adaptor.dupNode(NOT319);

                            adaptor.addChild(root_1, NOT319_tree);


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 14 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:309:4: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    VICTORY_KW320=(CommonTree)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2291); 
                    VICTORY_KW320_tree = (CommonTree)adaptor.dupNode(VICTORY_KW320);

                    adaptor.addChild(root_0, VICTORY_KW320_tree);


                    }
                    break;
                case 15 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:310:4: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DEFEAT_KW321=(CommonTree)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2296); 
                    DEFEAT_KW321_tree = (CommonTree)adaptor.dupNode(DEFEAT_KW321);

                    adaptor.addChild(root_0, DEFEAT_KW321_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:313:1: mode_mute[SymbolTable st] returns [Code c] : ( ON | OFF );
    public final hightTree.mode_mute_return mode_mute(SymbolTable st) throws RecognitionException {
        hightTree.mode_mute_return retval = new hightTree.mode_mute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set322=null;

        CommonTree set322_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:313:44: ( ON | OFF )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set322=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                input.consume();

                set322_tree = (CommonTree)adaptor.dupNode(set322);

                adaptor.addChild(root_0, set322_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:316:1: affectation[SymbolTable st] returns [Code c] : ( ^( ASSIGN_KW operation[st] variable[st] ) | ^( ADD_KW operation[st] variable[st] ) | ^( SUB_KW operation[st] variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) );
    public final hightTree.affectation_return affectation(SymbolTable st) throws RecognitionException {
        hightTree.affectation_return retval = new hightTree.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN_KW323=null;
        CommonTree ADD_KW326=null;
        CommonTree SUB_KW329=null;
        CommonTree INVERT_KW332=null;
        hightTree.operation_return operation324 = null;

        hightTree.variable_return variable325 = null;

        hightTree.operation_return operation327 = null;

        hightTree.variable_return variable328 = null;

        hightTree.operation_return operation330 = null;

        hightTree.variable_return variable331 = null;

        hightTree.variable_return variable333 = null;

        hightTree.variable_return variable334 = null;


        CommonTree ASSIGN_KW323_tree=null;
        CommonTree ADD_KW326_tree=null;
        CommonTree SUB_KW329_tree=null;
        CommonTree INVERT_KW332_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:316:46: ( ^( ASSIGN_KW operation[st] variable[st] ) | ^( ADD_KW operation[st] variable[st] ) | ^( SUB_KW operation[st] variable[st] ) | ^( INVERT_KW variable[st] variable[st] ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case ASSIGN_KW:
                {
                alt72=1;
                }
                break;
            case ADD_KW:
                {
                alt72=2;
                }
                break;
            case SUB_KW:
                {
                alt72=3;
                }
                break;
            case INVERT_KW:
                {
                alt72=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:317:3: ^( ASSIGN_KW operation[st] variable[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ASSIGN_KW323=(CommonTree)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2335); 
                    ASSIGN_KW323_tree = (CommonTree)adaptor.dupNode(ASSIGN_KW323);

                    root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW323_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_affectation2337);
                    operation324=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation324.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2340);
                    variable325=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable325.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:318:4: ^( ADD_KW operation[st] variable[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ADD_KW326=(CommonTree)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2348); 
                    ADD_KW326_tree = (CommonTree)adaptor.dupNode(ADD_KW326);

                    root_1 = (CommonTree)adaptor.becomeRoot(ADD_KW326_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_affectation2350);
                    operation327=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation327.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2353);
                    variable328=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable328.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:319:4: ^( SUB_KW operation[st] variable[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUB_KW329=(CommonTree)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2362); 
                    SUB_KW329_tree = (CommonTree)adaptor.dupNode(SUB_KW329);

                    root_1 = (CommonTree)adaptor.becomeRoot(SUB_KW329_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_affectation2364);
                    operation330=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation330.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2367);
                    variable331=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable331.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:320:4: ^( INVERT_KW variable[st] variable[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INVERT_KW332=(CommonTree)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2376); 
                    INVERT_KW332_tree = (CommonTree)adaptor.dupNode(INVERT_KW332);

                    root_1 = (CommonTree)adaptor.becomeRoot(INVERT_KW332_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2378);
                    variable333=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable333.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_affectation2381);
                    variable334=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_1, variable334.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:323:1: iaBasique[SymbolTable st] returns [Code c] : ^( IA_KW accesClasse[st] actionObjetList[st] ) ;
    public final hightTree.iaBasique_return iaBasique(SymbolTable st) throws RecognitionException {
        hightTree.iaBasique_return retval = new hightTree.iaBasique_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IA_KW335=null;
        hightTree.accesClasse_return accesClasse336 = null;

        hightTree.actionObjetList_return actionObjetList337 = null;


        CommonTree IA_KW335_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:323:44: ( ^( IA_KW accesClasse[st] actionObjetList[st] ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:323:46: ^( IA_KW accesClasse[st] actionObjetList[st] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IA_KW335=(CommonTree)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2402); 
            IA_KW335_tree = (CommonTree)adaptor.dupNode(IA_KW335);

            root_1 = (CommonTree)adaptor.becomeRoot(IA_KW335_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_accesClasse_in_iaBasique2404);
            accesClasse336=accesClasse(st);

            state._fsp--;

            adaptor.addChild(root_1, accesClasse336.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_actionObjetList_in_iaBasique2407);
            actionObjetList337=actionObjetList(st);

            state._fsp--;

            adaptor.addChild(root_1, actionObjetList337.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:325:1: actionObjetList[SymbolTable st] returns [Code c] : ( actionObjet[st] )+ ;
    public final hightTree.actionObjetList_return actionObjetList(SymbolTable st) throws RecognitionException {
        hightTree.actionObjetList_return retval = new hightTree.actionObjetList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        hightTree.actionObjet_return actionObjet338 = null;



        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:325:50: ( ( actionObjet[st] )+ )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:325:52: ( actionObjet[st] )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:325:52: ( actionObjet[st] )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==PAUSE_KW||LA73_0==STOP_KW||(LA73_0>=DIES_KW && LA73_0<=EQUIP)||LA73_0==JUMP) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:325:52: actionObjet[st]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_actionObjet_in_actionObjetList2422);
            	    actionObjet338=actionObjet(st);

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionObjet338.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:332:1: operation[SymbolTable st] returns [Code c] : ( ^( RANDOM_KW operation[st] operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | variable[st] | FLOAT );
    public final hightTree.operation_return operation(SymbolTable st) throws RecognitionException {
        hightTree.operation_return retval = new hightTree.operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RANDOM_KW339=null;
        CommonTree PLUS342=null;
        CommonTree MINUS345=null;
        CommonTree MUL348=null;
        CommonTree DIV351=null;
        CommonTree MOD354=null;
        CommonTree POW357=null;
        CommonTree FLOAT361=null;
        hightTree.operation_return operation340 = null;

        hightTree.operation_return operation341 = null;

        hightTree.operation_return operation343 = null;

        hightTree.operation_return operation344 = null;

        hightTree.operation_return operation346 = null;

        hightTree.operation_return operation347 = null;

        hightTree.operation_return operation349 = null;

        hightTree.operation_return operation350 = null;

        hightTree.operation_return operation352 = null;

        hightTree.operation_return operation353 = null;

        hightTree.operation_return operation355 = null;

        hightTree.operation_return operation356 = null;

        hightTree.operation_return operation358 = null;

        hightTree.operation_return operation359 = null;

        hightTree.variable_return variable360 = null;


        CommonTree RANDOM_KW339_tree=null;
        CommonTree PLUS342_tree=null;
        CommonTree MINUS345_tree=null;
        CommonTree MUL348_tree=null;
        CommonTree DIV351_tree=null;
        CommonTree MOD354_tree=null;
        CommonTree POW357_tree=null;
        CommonTree FLOAT361_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:332:44: ( ^( RANDOM_KW operation[st] operation[st] ) | ^( PLUS operation[st] operation[st] ) | ^( MINUS operation[st] operation[st] ) | ^( MUL operation[st] operation[st] ) | ^( DIV operation[st] operation[st] ) | ^( MOD operation[st] operation[st] ) | ^( POW operation[st] operation[st] ) | variable[st] | FLOAT )
            int alt74=9;
            switch ( input.LA(1) ) {
            case RANDOM_KW:
                {
                alt74=1;
                }
                break;
            case PLUS:
                {
                alt74=2;
                }
                break;
            case MINUS:
                {
                alt74=3;
                }
                break;
            case MUL:
                {
                alt74=4;
                }
                break;
            case DIV:
                {
                alt74=5;
                }
                break;
            case MOD:
                {
                alt74=6;
                }
                break;
            case POW:
                {
                alt74=7;
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
                alt74=8;
                }
                break;
            case FLOAT:
                {
                alt74=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:333:2: ^( RANDOM_KW operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    RANDOM_KW339=(CommonTree)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2447); 
                    RANDOM_KW339_tree = (CommonTree)adaptor.dupNode(RANDOM_KW339);

                    root_1 = (CommonTree)adaptor.becomeRoot(RANDOM_KW339_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2449);
                    operation340=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation340.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2452);
                    operation341=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation341.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:334:3: ^( PLUS operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS342=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_operation2459); 
                    PLUS342_tree = (CommonTree)adaptor.dupNode(PLUS342);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS342_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2461);
                    operation343=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation343.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2464);
                    operation344=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation344.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:335:3: ^( MINUS operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS345=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_operation2471); 
                    MINUS345_tree = (CommonTree)adaptor.dupNode(MINUS345);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS345_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2473);
                    operation346=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation346.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2476);
                    operation347=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation347.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:336:3: ^( MUL operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MUL348=(CommonTree)match(input,MUL,FOLLOW_MUL_in_operation2483); 
                    MUL348_tree = (CommonTree)adaptor.dupNode(MUL348);

                    root_1 = (CommonTree)adaptor.becomeRoot(MUL348_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2485);
                    operation349=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation349.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2488);
                    operation350=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation350.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:337:3: ^( DIV operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIV351=(CommonTree)match(input,DIV,FOLLOW_DIV_in_operation2495); 
                    DIV351_tree = (CommonTree)adaptor.dupNode(DIV351);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIV351_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2497);
                    operation352=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation352.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2500);
                    operation353=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation353.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:338:3: ^( MOD operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MOD354=(CommonTree)match(input,MOD,FOLLOW_MOD_in_operation2507); 
                    MOD354_tree = (CommonTree)adaptor.dupNode(MOD354);

                    root_1 = (CommonTree)adaptor.becomeRoot(MOD354_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2509);
                    operation355=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation355.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2512);
                    operation356=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation356.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:339:3: ^( POW operation[st] operation[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    POW357=(CommonTree)match(input,POW,FOLLOW_POW_in_operation2519); 
                    POW357_tree = (CommonTree)adaptor.dupNode(POW357);

                    root_1 = (CommonTree)adaptor.becomeRoot(POW357_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2521);
                    operation358=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation358.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_operation2524);
                    operation359=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_1, operation359.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:340:3: variable[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_operation2530);
                    variable360=variable(st);

                    state._fsp--;

                    adaptor.addChild(root_0, variable360.getTree());

                    }
                    break;
                case 9 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:341:3: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    FLOAT361=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_operation2535); 
                    FLOAT361_tree = (CommonTree)adaptor.dupNode(FLOAT361);

                    adaptor.addChild(root_0, FLOAT361_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:345:1: variable[SymbolTable st] returns [Code c] : ( ^( X typeCoordonnees[st] accesClasse[st] ) | ^( Y typeCoordonnees[st] accesClasse[st] ) | ^( Z typeCoordonnees[st] accesClasse[st] ) | ^( VAR_I_KW IDENT accesClasse[st] ) | ^( VAR_A_KW attribut[st] accesClasse[st] ) | GAME_SCORE_KW | ^( VALUE_KW attributTps[st] accesClasse[st] ) );
    public final hightTree.variable_return variable(SymbolTable st) throws RecognitionException {
        hightTree.variable_return retval = new hightTree.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree X362=null;
        CommonTree Y365=null;
        CommonTree Z368=null;
        CommonTree VAR_I_KW371=null;
        CommonTree IDENT372=null;
        CommonTree VAR_A_KW374=null;
        CommonTree GAME_SCORE_KW377=null;
        CommonTree VALUE_KW378=null;
        hightTree.typeCoordonnees_return typeCoordonnees363 = null;

        hightTree.accesClasse_return accesClasse364 = null;

        hightTree.typeCoordonnees_return typeCoordonnees366 = null;

        hightTree.accesClasse_return accesClasse367 = null;

        hightTree.typeCoordonnees_return typeCoordonnees369 = null;

        hightTree.accesClasse_return accesClasse370 = null;

        hightTree.accesClasse_return accesClasse373 = null;

        hightTree.attribut_return attribut375 = null;

        hightTree.accesClasse_return accesClasse376 = null;

        hightTree.attributTps_return attributTps379 = null;

        hightTree.accesClasse_return accesClasse380 = null;


        CommonTree X362_tree=null;
        CommonTree Y365_tree=null;
        CommonTree Z368_tree=null;
        CommonTree VAR_I_KW371_tree=null;
        CommonTree IDENT372_tree=null;
        CommonTree VAR_A_KW374_tree=null;
        CommonTree GAME_SCORE_KW377_tree=null;
        CommonTree VALUE_KW378_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:345:43: ( ^( X typeCoordonnees[st] accesClasse[st] ) | ^( Y typeCoordonnees[st] accesClasse[st] ) | ^( Z typeCoordonnees[st] accesClasse[st] ) | ^( VAR_I_KW IDENT accesClasse[st] ) | ^( VAR_A_KW attribut[st] accesClasse[st] ) | GAME_SCORE_KW | ^( VALUE_KW attributTps[st] accesClasse[st] ) )
            int alt75=7;
            switch ( input.LA(1) ) {
            case X:
                {
                alt75=1;
                }
                break;
            case Y:
                {
                alt75=2;
                }
                break;
            case Z:
                {
                alt75=3;
                }
                break;
            case VAR_I_KW:
                {
                alt75=4;
                }
                break;
            case VAR_A_KW:
                {
                alt75=5;
                }
                break;
            case GAME_SCORE_KW:
                {
                alt75=6;
                }
                break;
            case VALUE_KW:
                {
                alt75=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:346:3: ^( X typeCoordonnees[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    X362=(CommonTree)match(input,X,FOLLOW_X_in_variable2555); 
                    X362_tree = (CommonTree)adaptor.dupNode(X362);

                    root_1 = (CommonTree)adaptor.becomeRoot(X362_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2557);
                    typeCoordonnees363=typeCoordonnees(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeCoordonnees363.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2560);
                    accesClasse364=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse364.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:347:4: ^( Y typeCoordonnees[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Y365=(CommonTree)match(input,Y,FOLLOW_Y_in_variable2568); 
                    Y365_tree = (CommonTree)adaptor.dupNode(Y365);

                    root_1 = (CommonTree)adaptor.becomeRoot(Y365_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2570);
                    typeCoordonnees366=typeCoordonnees(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeCoordonnees366.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2573);
                    accesClasse367=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse367.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:348:4: ^( Z typeCoordonnees[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Z368=(CommonTree)match(input,Z,FOLLOW_Z_in_variable2581); 
                    Z368_tree = (CommonTree)adaptor.dupNode(Z368);

                    root_1 = (CommonTree)adaptor.becomeRoot(Z368_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2583);
                    typeCoordonnees369=typeCoordonnees(st);

                    state._fsp--;

                    adaptor.addChild(root_1, typeCoordonnees369.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2586);
                    accesClasse370=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse370.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:349:4: ^( VAR_I_KW IDENT accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VAR_I_KW371=(CommonTree)match(input,VAR_I_KW,FOLLOW_VAR_I_KW_in_variable2594); 
                    VAR_I_KW371_tree = (CommonTree)adaptor.dupNode(VAR_I_KW371);

                    root_1 = (CommonTree)adaptor.becomeRoot(VAR_I_KW371_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT372=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variable2596); 
                    IDENT372_tree = (CommonTree)adaptor.dupNode(IDENT372);

                    adaptor.addChild(root_1, IDENT372_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2598);
                    accesClasse373=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse373.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:350:4: ^( VAR_A_KW attribut[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VAR_A_KW374=(CommonTree)match(input,VAR_A_KW,FOLLOW_VAR_A_KW_in_variable2606); 
                    VAR_A_KW374_tree = (CommonTree)adaptor.dupNode(VAR_A_KW374);

                    root_1 = (CommonTree)adaptor.becomeRoot(VAR_A_KW374_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_attribut_in_variable2608);
                    attribut375=attribut(st);

                    state._fsp--;

                    adaptor.addChild(root_1, attribut375.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2611);
                    accesClasse376=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse376.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:351:4: GAME_SCORE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    GAME_SCORE_KW377=(CommonTree)match(input,GAME_SCORE_KW,FOLLOW_GAME_SCORE_KW_in_variable2618); 
                    GAME_SCORE_KW377_tree = (CommonTree)adaptor.dupNode(GAME_SCORE_KW377);

                    adaptor.addChild(root_0, GAME_SCORE_KW377_tree);


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:352:4: ^( VALUE_KW attributTps[st] accesClasse[st] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VALUE_KW378=(CommonTree)match(input,VALUE_KW,FOLLOW_VALUE_KW_in_variable2624); 
                    VALUE_KW378_tree = (CommonTree)adaptor.dupNode(VALUE_KW378);

                    root_1 = (CommonTree)adaptor.becomeRoot(VALUE_KW378_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_attributTps_in_variable2626);
                    attributTps379=attributTps(st);

                    state._fsp--;

                    adaptor.addChild(root_1, attributTps379.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesClasse_in_variable2629);
                    accesClasse380=accesClasse(st);

                    state._fsp--;

                    adaptor.addChild(root_1, accesClasse380.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:355:1: accesClasse[SymbolTable st] returns [Code c] : ( ALL | accesLocal[st] | accesGlobal[st] );
    public final hightTree.accesClasse_return accesClasse(SymbolTable st) throws RecognitionException {
        hightTree.accesClasse_return retval = new hightTree.accesClasse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALL381=null;
        hightTree.accesLocal_return accesLocal382 = null;

        hightTree.accesGlobal_return accesGlobal383 = null;


        CommonTree ALL381_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:355:46: ( ALL | accesLocal[st] | accesGlobal[st] )
            int alt76=3;
            switch ( input.LA(1) ) {
            case ALL:
                {
                alt76=1;
                }
                break;
            case IDENT:
            case PLAYER:
            case NUM:
                {
                alt76=2;
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
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:356:3: ALL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ALL381=(CommonTree)match(input,ALL,FOLLOW_ALL_in_accesClasse2650); 
                    ALL381_tree = (CommonTree)adaptor.dupNode(ALL381);

                    adaptor.addChild(root_0, ALL381_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:357:5: accesLocal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesLocal_in_accesClasse2657);
                    accesLocal382=accesLocal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal382.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:358:5: accesGlobal[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_accesGlobal_in_accesClasse2664);
                    accesGlobal383=accesGlobal(st);

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal383.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:361:1: accesGlobal[SymbolTable st] returns [Code c] : ( typeObjet[st] | interaction[st] | PG NOT ( typeObjet[st] | interaction[st] | PLAYER ) PD );
    public final hightTree.accesGlobal_return accesGlobal(SymbolTable st) throws RecognitionException {
        hightTree.accesGlobal_return retval = new hightTree.accesGlobal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PG386=null;
        CommonTree NOT387=null;
        CommonTree PLAYER390=null;
        CommonTree PD391=null;
        hightTree.typeObjet_return typeObjet384 = null;

        hightTree.interaction_return interaction385 = null;

        hightTree.typeObjet_return typeObjet388 = null;

        hightTree.interaction_return interaction389 = null;


        CommonTree PG386_tree=null;
        CommonTree NOT387_tree=null;
        CommonTree PLAYER390_tree=null;
        CommonTree PD391_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:361:46: ( typeObjet[st] | interaction[st] | PG NOT ( typeObjet[st] | interaction[st] | PLAYER ) PD )
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
            case PG:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:362:3: typeObjet[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeObjet_in_accesGlobal2683);
                    typeObjet384=typeObjet(st);

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet384.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:363:5: interaction[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interaction_in_accesGlobal2690);
                    interaction385=interaction(st);

                    state._fsp--;

                    adaptor.addChild(root_0, interaction385.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:364:5: PG NOT ( typeObjet[st] | interaction[st] | PLAYER ) PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PG386=(CommonTree)match(input,PG,FOLLOW_PG_in_accesGlobal2697); 
                    PG386_tree = (CommonTree)adaptor.dupNode(PG386);

                    adaptor.addChild(root_0, PG386_tree);

                    _last = (CommonTree)input.LT(1);
                    NOT387=(CommonTree)match(input,NOT,FOLLOW_NOT_in_accesGlobal2699); 
                    NOT387_tree = (CommonTree)adaptor.dupNode(NOT387);

                    adaptor.addChild(root_0, NOT387_tree);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:364:12: ( typeObjet[st] | interaction[st] | PLAYER )
                    int alt77=3;
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
                        alt77=1;
                        }
                        break;
                    case ALLY:
                    case ENEMY:
                    case NEUTRAL:
                        {
                        alt77=2;
                        }
                        break;
                    case PLAYER:
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
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:364:13: typeObjet[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_typeObjet_in_accesGlobal2702);
                            typeObjet388=typeObjet(st);

                            state._fsp--;

                            adaptor.addChild(root_0, typeObjet388.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:364:29: interaction[st]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_interaction_in_accesGlobal2707);
                            interaction389=interaction(st);

                            state._fsp--;

                            adaptor.addChild(root_0, interaction389.getTree());

                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:364:47: PLAYER
                            {
                            _last = (CommonTree)input.LT(1);
                            PLAYER390=(CommonTree)match(input,PLAYER,FOLLOW_PLAYER_in_accesGlobal2712); 
                            PLAYER390_tree = (CommonTree)adaptor.dupNode(PLAYER390);

                            adaptor.addChild(root_0, PLAYER390_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    PD391=(CommonTree)match(input,PD,FOLLOW_PD_in_accesGlobal2715); 
                    PD391_tree = (CommonTree)adaptor.dupNode(PD391);

                    adaptor.addChild(root_0, PD391_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:367:1: accesLocal[SymbolTable st] returns [Code c] : ( IDENT | NUM operation[st] IN IDENT | PLAYER );
    public final hightTree.accesLocal_return accesLocal(SymbolTable st) throws RecognitionException {
        hightTree.accesLocal_return retval = new hightTree.accesLocal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT392=null;
        CommonTree NUM393=null;
        CommonTree IN395=null;
        CommonTree IDENT396=null;
        CommonTree PLAYER397=null;
        hightTree.operation_return operation394 = null;


        CommonTree IDENT392_tree=null;
        CommonTree NUM393_tree=null;
        CommonTree IN395_tree=null;
        CommonTree IDENT396_tree=null;
        CommonTree PLAYER397_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:367:45: ( IDENT | NUM operation[st] IN IDENT | PLAYER )
            int alt79=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt79=1;
                }
                break;
            case NUM:
                {
                alt79=2;
                }
                break;
            case PLAYER:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:368:3: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT392=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2733); 
                    IDENT392_tree = (CommonTree)adaptor.dupNode(IDENT392);

                    adaptor.addChild(root_0, IDENT392_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:369:5: NUM operation[st] IN IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    NUM393=(CommonTree)match(input,NUM,FOLLOW_NUM_in_accesLocal2739); 
                    NUM393_tree = (CommonTree)adaptor.dupNode(NUM393);

                    adaptor.addChild(root_0, NUM393_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_operation_in_accesLocal2741);
                    operation394=operation(st);

                    state._fsp--;

                    adaptor.addChild(root_0, operation394.getTree());
                    _last = (CommonTree)input.LT(1);
                    IN395=(CommonTree)match(input,IN,FOLLOW_IN_in_accesLocal2744); 
                    IN395_tree = (CommonTree)adaptor.dupNode(IN395);

                    adaptor.addChild(root_0, IN395_tree);

                    _last = (CommonTree)input.LT(1);
                    IDENT396=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2746); 
                    IDENT396_tree = (CommonTree)adaptor.dupNode(IDENT396);

                    adaptor.addChild(root_0, IDENT396_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:370:5: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PLAYER397=(CommonTree)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal2752); 
                    PLAYER397_tree = (CommonTree)adaptor.dupNode(PLAYER397);

                    adaptor.addChild(root_0, PLAYER397_tree);


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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:373:1: typeCoordonnees[SymbolTable st] returns [Code c] : ( POSITION | ORIENTATION | SIZE );
    public final hightTree.typeCoordonnees_return typeCoordonnees(SymbolTable st) throws RecognitionException {
        hightTree.typeCoordonnees_return retval = new hightTree.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set398=null;

        CommonTree set398_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:373:50: ( POSITION | ORIENTATION | SIZE )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set398=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=POSITION && input.LA(1)<=SIZE) ) {
                input.consume();

                set398_tree = (CommonTree)adaptor.dupNode(set398);

                adaptor.addChild(root_0, set398_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:377:1: timeUnit[SymbolTable st] returns [Code c] : ( MIN | SEC | MS | FRAME );
    public final hightTree.timeUnit_return timeUnit(SymbolTable st) throws RecognitionException {
        hightTree.timeUnit_return retval = new hightTree.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set399=null;

        CommonTree set399_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:377:43: ( MIN | SEC | MS | FRAME )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set399=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=MIN && input.LA(1)<=FRAME) ) {
                input.consume();

                set399_tree = (CommonTree)adaptor.dupNode(set399);

                adaptor.addChild(root_0, set399_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:385:1: typeObjet[SymbolTable st] returns [Code c] : ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D[st] );
    public final hightTree.typeObjet_return typeObjet(SymbolTable st) throws RecognitionException {
        hightTree.typeObjet_return retval = new hightTree.typeObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CAMERA400=null;
        CommonTree MEDIA401=null;
        CommonTree COUNTER402=null;
        CommonTree TIME403=null;
        hightTree.typeObjet3D_return typeObjet3D404 = null;


        CommonTree CAMERA400_tree=null;
        CommonTree MEDIA401_tree=null;
        CommonTree COUNTER402_tree=null;
        CommonTree TIME403_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:385:44: ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D[st] )
            int alt80=5;
            switch ( input.LA(1) ) {
            case CAMERA:
                {
                alt80=1;
                }
                break;
            case MEDIA:
                {
                alt80=2;
                }
                break;
            case COUNTER:
                {
                alt80=3;
                }
                break;
            case TIME:
                {
                alt80=4;
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
                alt80=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:386:2: CAMERA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    CAMERA400=(CommonTree)match(input,CAMERA,FOLLOW_CAMERA_in_typeObjet2828); 
                    CAMERA400_tree = (CommonTree)adaptor.dupNode(CAMERA400);

                    adaptor.addChild(root_0, CAMERA400_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:387:4: MEDIA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    MEDIA401=(CommonTree)match(input,MEDIA,FOLLOW_MEDIA_in_typeObjet2833); 
                    MEDIA401_tree = (CommonTree)adaptor.dupNode(MEDIA401);

                    adaptor.addChild(root_0, MEDIA401_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:388:4: COUNTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    COUNTER402=(CommonTree)match(input,COUNTER,FOLLOW_COUNTER_in_typeObjet2838); 
                    COUNTER402_tree = (CommonTree)adaptor.dupNode(COUNTER402);

                    adaptor.addChild(root_0, COUNTER402_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:389:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    TIME403=(CommonTree)match(input,TIME,FOLLOW_TIME_in_typeObjet2843); 
                    TIME403_tree = (CommonTree)adaptor.dupNode(TIME403);

                    adaptor.addChild(root_0, TIME403_tree);


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:390:4: typeObjet3D[st]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeObjet3D_in_typeObjet2848);
                    typeObjet3D404=typeObjet3D(st);

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet3D404.getTree());

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:395:1: typeObjet3D[SymbolTable st] returns [Code c] : ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER );
    public final hightTree.typeObjet3D_return typeObjet3D(SymbolTable st) throws RecognitionException {
        hightTree.typeObjet3D_return retval = new hightTree.typeObjet3D_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set405=null;

        CommonTree set405_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:395:46: ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set405=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=OBJECT && input.LA(1)<=TELEPORTER) ) {
                input.consume();

                set405_tree = (CommonTree)adaptor.dupNode(set405);

                adaptor.addChild(root_0, set405_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:416:1: attribut[SymbolTable st] returns [Code c] : ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA );
    public final hightTree.attribut_return attribut(SymbolTable st) throws RecognitionException {
        hightTree.attribut_return retval = new hightTree.attribut_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set406=null;

        CommonTree set406_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:416:43: ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set406=(CommonTree)input.LT(1);
            if ( input.LA(1)==TYPE||input.LA(1)==VALUE||(input.LA(1)>=MASS && input.LA(1)<=MOVE_WITH_CAMERA) ) {
                input.consume();

                set406_tree = (CommonTree)adaptor.dupNode(set406);

                adaptor.addChild(root_0, set406_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:459:1: attributTps[SymbolTable st] returns [Code c] : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final hightTree.attributTps_return attributTps(SymbolTable st) throws RecognitionException {
        hightTree.attributTps_return retval = new hightTree.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set407=null;

        CommonTree set407_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:459:46: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set407=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=BOOST_INTERVAL && input.LA(1)<=RELOAD_TIME) ) {
                input.consume();

                set407_tree = (CommonTree)adaptor.dupNode(set407);

                adaptor.addChild(root_0, set407_tree);

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
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:465:1: attributListeOuObjet[SymbolTable st] returns [Code c] : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final hightTree.attributListeOuObjet_return attributListeOuObjet(SymbolTable st) throws RecognitionException {
        hightTree.attributListeOuObjet_return retval = new hightTree.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set408=null;

        CommonTree set408_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:465:55: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hightTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set408=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=INVENTORY && input.LA(1)<=TYPES_TELEPORTABLES) ) {
                input.consume();

                set408_tree = (CommonTree)adaptor.dupNode(set408);

                adaptor.addChild(root_0, set408_tree);

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
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA41 dfa41 = new DFA41(this);
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
            return "61:1: declarationObjet[SymbolTable st] returns [Code c] : ( ^( DEC typeEntity[st] ( entityMode[st] )? ) | ^( LIST_KW list_declaration[st] ) | ^( CAMERA_KW PERSON view[st] ) | ^( CAMERA_KW FREE ) | ^( MEDIA_KW LOOP ) | ^( MEDIA_KW ONCE ) | ^( IN_KW IDENT ) );";
        }
    }
    static final String DFA25_eotS =
        "\13\uffff";
    static final String DFA25_eofS =
        "\13\uffff";
    static final String DFA25_minS =
        "\1\42\2\uffff\1\3\4\uffff\2\2\1\uffff";
    static final String DFA25_maxS =
        "\1\u00bd\2\uffff\1\u00bd\4\uffff\2\u00bd\1\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\6\1\7\2\uffff\1\5";
    static final String DFA25_specialS =
        "\13\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\3\5\uffff\1\2\2\uffff\1\2\3\uffff\4\2\5\uffff\1\6\1\7\4"+
            "\2\2\uffff\6\2\2\uffff\1\2\37\uffff\2\5\13\uffff\1\1\13\uffff"+
            "\1\2\16\uffff\4\4\15\uffff\2\2\7\uffff\24\2",
            "",
            "",
            "\1\12\36\uffff\1\12\5\uffff\1\12\2\uffff\1\12\3\uffff\4\12"+
            "\5\uffff\4\12\1\10\1\12\2\uffff\1\12\1\11\4\12\2\uffff\1\12"+
            "\4\2\24\uffff\1\2\6\uffff\2\12\13\uffff\1\12\13\uffff\1\12\16"+
            "\uffff\4\12\15\uffff\2\12\7\uffff\24\12",
            "",
            "",
            "",
            "",
            "\1\12\1\2\36\uffff\1\2\5\uffff\1\2\2\uffff\1\2\3\uffff\4\2"+
            "\5\uffff\6\2\2\uffff\6\2\2\uffff\1\2\37\uffff\2\2\13\uffff\1"+
            "\2\13\uffff\1\2\16\uffff\4\2\15\uffff\2\2\7\uffff\24\2",
            "\1\12\1\2\36\uffff\1\2\5\uffff\1\2\2\uffff\1\2\3\uffff\4\2"+
            "\5\uffff\6\2\2\uffff\6\2\2\uffff\1\2\37\uffff\2\2\13\uffff\1"+
            "\2\13\uffff\1\2\16\uffff\4\2\15\uffff\2\2\7\uffff\24\2",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "137:1: consequ[SymbolTable st] returns [Code c] : ( siAlors[st] | action[st] | affectation[st] | activCommande[st] | IDENT | VICTORY_KW | DEFEAT_KW );";
        }
    }
    static final String DFA28_eotS =
        "\26\uffff";
    static final String DFA28_eofS =
        "\26\uffff";
    static final String DFA28_minS =
        "\1\42\1\uffff\2\2\1\uffff\1\2\7\uffff\2\32\1\76\6\uffff";
    static final String DFA28_maxS =
        "\1\u00bd\1\uffff\2\2\1\uffff\1\2\7\uffff\2\42\1\77\6\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\1\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\1\17\3\uffff\1\2\1\3\1\4\1\5\1\7\1\10";
    static final String DFA28_specialS =
        "\26\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\5\uffff\1\1\2\uffff\1\1\3\uffff\4\1\7\uffff\1\2\1\3\1"+
            "\4\1\5\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff\1\14\70\uffff"+
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "147:1: action[SymbolTable st] returns [Code c] : ( accesClasse[st] actionObjet[st] | ^( ENDS_KW IDENT ) | ^( ENDS_KW GAME ) | ^( STARTS_KW IDENT ) | ^( STARTS_KW GAME ) | ^( PAUSE_KW IDENT ) | ^( MUTE_KW ON IDENT ) | ^( MUTE_KW OFF IDENT ) | ^( PLAY_KW IDENT ) | ^( STOP_KW IDENT ) | ^( BLOCK_KW transformation[st] accesClasse[st] coordinates[st] ) | ^( EFFACE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( GENERATE_KW typeAcces[st] ( typeDestination[st] )? ) | ^( WAIT_KW operation[st] timeUnit[st] consequences[st] ) | SAVE_KW );";
        }
    }
    static final String DFA32_eotS =
        "\12\uffff";
    static final String DFA32_eofS =
        "\12\uffff";
    static final String DFA32_minS =
        "\1\74\4\uffff\1\2\1\42\3\uffff";
    static final String DFA32_maxS =
        "\1\141\4\uffff\1\2\1\u00a2\3\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\6\1\7\1\5";
    static final String DFA32_specialS =
        "\12\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\2\4\uffff\1\2\7\uffff\1\1\1\3\1\4\1\5\24\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\6",
            "\1\11\14\uffff\1\11\35\uffff\1\7\1\10\123\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "171:1: actionObjet[SymbolTable st] returns [Code c] : ( DIES_KW | actionCommandePressee[st] | ^( DURING actionCommandeMaintenue[st] operation[st] timeUnit[st] ) | ^( UNTIL actionCommandeMaintenue[st] conditions[st] ) | ^( EQUIP accesLocal[st] ) | ^( EQUIP NEXT ) | ^( EQUIP PREVIOUS ) );";
        }
    }
    static final String DFA41_eotS =
        "\10\uffff";
    static final String DFA41_eofS =
        "\6\uffff\1\4\1\2";
    static final String DFA41_minS =
        "\1\2\1\3\1\uffff\1\3\1\uffff\3\3";
    static final String DFA41_maxS =
        "\1\134\1\u00bd\1\uffff\1\u00bd\1\uffff\3\u00bd";
    static final String DFA41_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String DFA41_specialS =
        "\10\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\2\1\1\122\uffff\7\2",
            "\1\3\30\uffff\1\2\5\uffff\1\4\5\uffff\1\4\2\uffff\1\4\3\uffff"+
            "\4\4\5\uffff\6\4\2\uffff\6\4\2\uffff\1\4\37\uffff\2\4\13\uffff"+
            "\1\4\13\uffff\1\4\16\uffff\4\4\15\uffff\2\4\7\uffff\24\4",
            "",
            "\1\5\16\uffff\1\4\17\uffff\1\2\5\uffff\1\2\2\uffff\1\2\3\uffff"+
            "\4\2\5\uffff\6\2\2\uffff\6\2\2\uffff\1\2\37\uffff\2\2\13\uffff"+
            "\1\2\13\uffff\1\2\16\uffff\4\2\15\uffff\2\2\7\uffff\24\2",
            "",
            "\1\6\16\uffff\1\2\17\uffff\1\4\5\uffff\1\4\2\uffff\1\4\3\uffff"+
            "\4\4\3\uffff\1\4\1\uffff\6\4\2\uffff\6\4\2\uffff\1\4\11\uffff"+
            "\1\4\25\uffff\2\4\2\uffff\1\4\10\uffff\1\4\13\uffff\1\4\16\uffff"+
            "\5\4\14\uffff\2\4\7\uffff\24\4",
            "\1\7\16\uffff\1\4\17\uffff\1\2\5\uffff\1\2\2\uffff\1\2\3\uffff"+
            "\4\2\3\uffff\1\2\1\uffff\6\2\2\uffff\6\2\2\uffff\1\2\11\uffff"+
            "\1\2\25\uffff\2\2\2\uffff\1\2\10\uffff\1\2\13\uffff\1\2\16\uffff"+
            "\5\2\14\uffff\2\2\7\uffff\24\2",
            "\1\6\16\uffff\1\2\17\uffff\1\4\5\uffff\1\4\2\uffff\1\4\3\uffff"+
            "\4\4\3\uffff\1\4\1\uffff\6\4\2\uffff\6\4\2\uffff\1\4\11\uffff"+
            "\1\4\25\uffff\2\4\2\uffff\1\4\10\uffff\1\4\13\uffff\1\4\16\uffff"+
            "\5\4\14\uffff\2\4\7\uffff\24\4"
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "238:13: ( souris[st] ( VIRG souris[st] )* )?";
        }
    }
 

    public static final BitSet FOLLOW_GAME_KW_in_game68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gameData_in_game70 = new BitSet(new long[]{0x00000000000000C0L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_newType_in_game74 = new BitSet(new long[]{0x00000000000000C0L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_init_in_game78 = new BitSet(new long[]{0x00400000000000C8L,0x0000100000040000L,0x0000000000100000L,0x0100000000000000L});
    public static final BitSet FOLLOW_definition_in_game82 = new BitSet(new long[]{0x0040000000000008L,0x0000100000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_commande_in_game86 = new BitSet(new long[]{0x0000000000000008L,0x0000100000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_reglesJeu_in_game90 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_iaBasique_in_game94 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_GAME_ATTRIBUT_KW_in_gameData117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributGame_list_in_gameData119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attributGame_in_attributGame_list136 = new BitSet(new long[]{0x0000000020002002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame164 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame166 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCORE_KW_in_attributGame174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_KW_in_newType196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_newType198 = new BitSet(new long[]{0x0000090400000000L,0x0000000000000000L,0x3FFFFC0000000000L});
    public static final BitSet FOLLOW_subType_list_in_newType200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_subType_in_subType_list219 = new BitSet(new long[]{0x0000090400000002L,0x0000000000000000L,0x3FFFFC0000000000L});
    public static final BitSet FOLLOW_IDENT_in_subType237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_IS_KW_in_init262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_init264 = new BitSet(new long[]{0x0000002000008700L});
    public static final BitSet FOLLOW_declarationObjet_in_init266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INIT_HAS_KW_in_init273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_affectationObjet_in_init275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEC_in_declarationObjet295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet297 = new BitSet(new long[]{0x0008800000000808L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_declaration_in_declarationObjet313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet322 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_view_in_declarationObjet324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAMERA_KW_in_declarationObjet332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIA_KW_in_declarationObjet349 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_KW_in_declarationObjet365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_list_declaration399 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_list_declaration403 = new BitSet(new long[]{0x0000000480305002L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeEntity427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERACTION_KW_in_entityMode450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_entityMode452 = new BitSet(new long[]{0x0008800000000808L});
    public static final BitSet FOLLOW_dupli_in_entityMode455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dupli_in_entityMode463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_interaction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet550 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_valAggregation_in_affectationObjet552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribut_in_affectationObjet562 = new BitSet(new long[]{0x0000000480305000L,0x0000000000000000L,0x00000000FFA00000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_typeAllocation_in_affectationObjet565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_affectationObjet574 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_affectationObjet577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_affectationObjet586 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_affectationObjet589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALLOCATION_KW_in_affectationObjet595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_affectationObjet597 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_affectationObjet600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000003C000000000L});
    public static final BitSet FOLLOW_timeUnit_in_affectationObjet603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_typeAllocation630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeAllocation635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_typeAllocation639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_typeAllocation643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation662 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_valAggregation664 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000003C000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation667 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_KW_in_valAggregation675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_operation_in_valAffectation698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAffectation704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_valAffectation708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_valAffectation712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_definition737 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_definition739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSEQUENCES_KW_in_consequences759 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_list_in_consequences761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_consequ_in_consequ_list780 = new BitSet(new long[]{0x3F07890400000002L,0x002003000000013FL,0x3FFFFC06000F0002L});
    public static final BitSet FOLLOW_siAlors_in_consequ799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action856 = new BitSet(new long[]{0x1000000000000000L,0x0000000200001E02L});
    public static final BitSet FOLLOW_actionObjet_in_action859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_action865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action867 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENDS_KW_in_action874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action883 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GAME_in_action893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_action909 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_action911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTE_KW_in_action917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OFF_in_action919 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_action921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAY_KW_in_action928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOP_KW_in_action936 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_action938 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_transformation_in_action946 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_action949 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_coordinates_in_action952 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action961 = new BitSet(new long[]{0x0000800400020008L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeDestination_in_action964 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeAcces_in_action974 = new BitSet(new long[]{0x0000800400020008L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeDestination_in_action977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_KW_in_action985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_action987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000003C000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action990 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_action993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAVE_KW_in_action999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_typeAcces1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAcces1020 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_IDENT_in_typeAcces1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_typeAcces1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_typeDestination1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coordinates_in_typeDestination1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1079 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1081 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_actionObjet1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000003C000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1087 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1097 = new BitSet(new long[]{0x0000001001000000L,0xFA00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_KW_in_coordinates1182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_coordinates1184 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_coordinates1187 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_coordinates1190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_commande1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_actionCommande_list_in_commande1217 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionCommande_in_actionCommande_list1235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande1255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_souris_in_actionCommande1257 = new BitSet(new long[]{0x1000000400000000L,0x000000E600000002L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande1268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1270 = new BitSet(new long[]{0x1000000400000000L,0x000000E600000002L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1429 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1464 = new BitSet(new long[]{0x0000000000000000L,0x0000001800C00000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_Command_in_activCommande1529 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_Command_in_activCommande1540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMMANDS_in_type_Command1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_type_Command1564 = new BitSet(new long[]{0x000000000000000EL,0x000000001FC00000L});
    public static final BitSet FOLLOW_souris_in_type_Command1567 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_type_Command1571 = new BitSet(new long[]{0x000000000000000CL,0x000000001FC00000L});
    public static final BitSet FOLLOW_souris_in_type_Command1574 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_KEY_KW_in_type_Command1584 = new BitSet(new long[]{0x000000000000000CL,0x00000001E0C00000L});
    public static final BitSet FOLLOW_clavier_in_type_Command1586 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_type_Command1590 = new BitSet(new long[]{0x000000000000000CL,0x00000001E0C00000L});
    public static final BitSet FOLLOW_clavier_in_type_Command1593 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_type_Command1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1622 = new BitSet(new long[]{0x0F07890400C00000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1625 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur1649 = new BitSet(new long[]{0x0000000000000000L,0x000DA00000000200L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_declencheur1687 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_VAR_KW_in_declencheur1705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_declencheur1707 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BECOMES_ID_KW_in_declencheur1718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1720 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_declencheur0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK1813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declencheur_O_in_declencheurTK1815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK1823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declencheur_O_in_declencheurTK1825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT1847 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declencheur_O_in_declencheurKT1849 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT1858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declencheur_O_in_declencheurKT1860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OTHER_in_declencheur_O1877 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheur_O1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheur_O1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors1910 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_consequences_in_siAlors1913 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_consequences_in_siAlors1916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_KW_in_conditions1938 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_in_conditions1940 = new BitSet(new long[]{0x0000001001000000L,0xFA00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditions_in_conditions1943 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_conditions1951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions1953 = new BitSet(new long[]{0x0000001001000000L,0xFB00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_in_conditions1956 = new BitSet(new long[]{0x0000001001000000L,0xFA00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditions_in_conditions1959 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_conditions1967 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_conditions1969 = new BitSet(new long[]{0x0000001001000000L,0xFB00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_in_conditions1972 = new BitSet(new long[]{0x0000001001000000L,0xFA00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditions_in_conditions1975 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_conditions1983 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions1985 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_conditions1988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_conditions1996 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions1998 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_conditions2000 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_conditions2008 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2010 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_conditions2013 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEG_in_conditions2021 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2023 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_conditions2026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPED_in_conditions2034 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2036 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_conditions2039 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIFF_in_conditions2047 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_conditions2049 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_conditions2052 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2072 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2074 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_NOT_in_etat2078 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2082 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2090 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2092 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_NOT_in_etat2096 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2110 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_NOT_in_etat2114 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2128 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_NOT_in_etat2132 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2146 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_NOT_in_etat2150 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2164 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_NOT_in_etat2168 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_etat2182 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_NOT_in_etat2186 = new BitSet(new long[]{0x0007890400000000L,0x0102000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_declencheur_O_in_etat2190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2200 = new BitSet(new long[]{0x0000000000000008L,0x0100000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2215 = new BitSet(new long[]{0x0000000000000008L,0x0100000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2229 = new BitSet(new long[]{0x0000000000000008L,0x0100000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2243 = new BitSet(new long[]{0xC000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2247 = new BitSet(new long[]{0xC000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_mode_mute_in_etat2251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2261 = new BitSet(new long[]{0x0000000000000008L,0x0100000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2265 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_declencheur_in_etat2276 = new BitSet(new long[]{0x0000000000000008L,0x0100000000000000L});
    public static final BitSet FOLLOW_NOT_in_etat2280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mode_mute0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2337 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_variable_in_affectation2340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2350 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_variable_in_affectation2353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_affectation2364 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_variable_in_affectation2367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_affectation2378 = new BitSet(new long[]{0x0000000000305000L,0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_variable_in_affectation2381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_iaBasique2404 = new BitSet(new long[]{0x1000000000000000L,0x0000000200001E02L});
    public static final BitSet FOLLOW_actionObjetList_in_iaBasique2407 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_actionObjet_in_actionObjetList2422 = new BitSet(new long[]{0x1000000000000002L,0x0000000200001E02L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2449 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_operation2452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_operation2459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2461 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_operation2464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_operation2471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2473 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_operation2476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_operation2483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2485 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_operation2488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation2495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2497 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_operation2500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_operation2507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2509 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_operation2512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_operation2519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_in_operation2521 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_operation2524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_operation2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operation2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable2555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2557 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Y_in_variable2568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2570 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Z_in_variable2581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2583 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_I_KW_in_variable2594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable2596 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_A_KW_in_variable2606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribut_in_variable2608 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GAME_SCORE_KW_in_variable2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_KW_in_variable2624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributTps_in_variable2626 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALL_in_accesClasse2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_accesClasse2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_accesGlobal2697 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_NOT_in_accesGlobal2699 = new BitSet(new long[]{0x0007890400000000L,0x0000000000000000L,0x3FFFFC0000000000L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PLAYER_in_accesGlobal2712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PD_in_accesGlobal2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal2739 = new BitSet(new long[]{0x0000000080305000L,0x0000000000000000L,0x00000000FFA00000L});
    public static final BitSet FOLLOW_operation_in_accesLocal2741 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal2744 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERA_in_typeObjet2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_typeObjet2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNTER_in_typeObjet2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_typeObjet2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeObjet2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeObjet3D0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attribut0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}