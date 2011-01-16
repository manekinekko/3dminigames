// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g 2011-01-15 20:54:34

    package grammars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class hightParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "SCORE", "TYPE", "IDENT", "IS", "AND", "LIST_KW", "OF", "WITH", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "IN", "PLAYER", "ALLY", "ENEMY", "NEUTRAL", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "DIES_KW", "DURING", "UNTIL", "EQUIP", "NEXT", "PREVIOUS", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "MOUSE_KW", "KEY_KW", "FOR", "LEFT", "RIGHT", "CLICK_LEFT", "CLICK_CENTER", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "JUMP", "MOVE", "FORWARD", "BACKWARD", "TURN", "ACCELERATE", "BRAKE", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "BY", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "X", "Y", "Z", "VALUE", "ALL", "NUM", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "COUNTER", "TIME", "OBJECT", "CHARACTER", "VEHICLE", "PLANE", "SPACECRAFT", "OBSTACLE", "WEAPON", "SWORD", "PROJECTILE", "ZONE", "GROUND", "BONUS", "CHECKPOINT", "BREAKABLE", "CONSTRUCTION", "ROOM", "BALL", "TELEPORTER", "MASS", "IS_FIX", "IS_TRAVERSABLE", "FOV", "ACTIVE", "NAME", "DESCRIPTION", "LIFE", "LIFE_MAX", "LIFE_MIN", "NB_LIVES", "MAGIC", "MAGIC_MAX", "MAGIC_MIN", "LEVEL", "ATTACK", "DEFENSE", "JUMP_FORCE", "JUMP_AIR_MAX", "MONEY", "CLASS", "RACE", "ACCELERATION", "SPEED", "SPEED_MAX", "SPEED_MIN", "BOOST", "BOOST_MAX", "NB_MUNITIONS", "NB_MUNITIONS_MAX", "SHOOT_POWER", "DAMAGES", "UNIT", "OBJECT_NAME", "ATTRIBUT_NAME", "VOLUME", "NUMBER", "MOVE_WITH_CAMERA", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "WS", "'true'", "'false'"
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

    // delegates
    // delegators


        public hightParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public hightParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return hightParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g"; }


    public static class game_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "game"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:41:1: game : ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )* ( reglesJeu ( FIN )? )* ( iaBasique ( FIN )? )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )* ( reglesJeu )* ( iaBasique )* ) ;
    public final hightParser.game_return game() throws RecognitionException {
        hightParser.game_return retval = new hightParser.game_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FIN2=null;
        Token FIN4=null;
        Token FIN6=null;
        Token FIN8=null;
        Token FIN10=null;
        Token FIN12=null;
        Token FIN14=null;
        hightParser.gameData_return gameData1 = null;

        hightParser.newType_return newType3 = null;

        hightParser.init_return init5 = null;

        hightParser.definition_return definition7 = null;

        hightParser.commande_return commande9 = null;

        hightParser.reglesJeu_return reglesJeu11 = null;

        hightParser.iaBasique_return iaBasique13 = null;


        CommonTree FIN2_tree=null;
        CommonTree FIN4_tree=null;
        CommonTree FIN6_tree=null;
        CommonTree FIN8_tree=null;
        CommonTree FIN10_tree=null;
        CommonTree FIN12_tree=null;
        CommonTree FIN14_tree=null;
        RewriteRuleTokenStream stream_FIN=new RewriteRuleTokenStream(adaptor,"token FIN");
        RewriteRuleSubtreeStream stream_reglesJeu=new RewriteRuleSubtreeStream(adaptor,"rule reglesJeu");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        RewriteRuleSubtreeStream stream_gameData=new RewriteRuleSubtreeStream(adaptor,"rule gameData");
        RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init");
        RewriteRuleSubtreeStream stream_newType=new RewriteRuleSubtreeStream(adaptor,"rule newType");
        RewriteRuleSubtreeStream stream_commande=new RewriteRuleSubtreeStream(adaptor,"rule commande");
        RewriteRuleSubtreeStream stream_iaBasique=new RewriteRuleSubtreeStream(adaptor,"rule iaBasique");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:41:6: ( ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )* ( reglesJeu ( FIN )? )* ( iaBasique ( FIN )? )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )* ( reglesJeu )* ( iaBasique )* ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:42:2: ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )* ( reglesJeu ( FIN )? )* ( iaBasique ( FIN )? )*
            {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:42:2: ( gameData FIN )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:42:3: gameData FIN
                    {
                    pushFollow(FOLLOW_gameData_in_game150);
                    gameData1=gameData();

                    state._fsp--;

                    stream_gameData.add(gameData1.getTree());
                    FIN2=(Token)match(input,FIN,FOLLOW_FIN_in_game152);  
                    stream_FIN.add(FIN2);


                    }
                    break;

            }

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:43:2: ( newType FIN )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:43:3: newType FIN
            	    {
            	    pushFollow(FOLLOW_newType_in_game158);
            	    newType3=newType();

            	    state._fsp--;

            	    stream_newType.add(newType3.getTree());
            	    FIN4=(Token)match(input,FIN,FOLLOW_FIN_in_game160);  
            	    stream_FIN.add(FIN4);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:44:2: ( init FIN )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENT||LA3_0==CAMERA||LA3_0==MEDIA||(LA3_0>=PLAYER && LA3_0<=NEUTRAL)||LA3_0==PG||(LA3_0>=ALL && LA3_0<=NUM)||(LA3_0>=COUNTER && LA3_0<=TELEPORTER)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:44:3: init FIN
            	    {
            	    pushFollow(FOLLOW_init_in_game166);
            	    init5=init();

            	    state._fsp--;

            	    stream_init.add(init5.getTree());
            	    FIN6=(Token)match(input,FIN,FOLLOW_FIN_in_game168);  
            	    stream_FIN.add(FIN6);


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

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:2: ( definition ( FIN )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DEFINITION_KW) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:3: definition ( FIN )?
            	    {
            	    pushFollow(FOLLOW_definition_in_game174);
            	    definition7=definition();

            	    state._fsp--;

            	    stream_definition.add(definition7.getTree());
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:14: ( FIN )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==FIN) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:15: FIN
            	            {
            	            FIN8=(Token)match(input,FIN,FOLLOW_FIN_in_game177);  
            	            stream_FIN.add(FIN8);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:2: ( commande ( FIN )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMAND_KW) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:3: commande ( FIN )?
            	    {
            	    pushFollow(FOLLOW_commande_in_game185);
            	    commande9=commande();

            	    state._fsp--;

            	    stream_commande.add(commande9.getTree());
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:12: ( FIN )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==FIN) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:13: FIN
            	            {
            	            FIN10=(Token)match(input,FIN,FOLLOW_FIN_in_game188);  
            	            stream_FIN.add(FIN10);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:2: ( reglesJeu ( FIN )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_KW) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:3: reglesJeu ( FIN )?
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game196);
            	    reglesJeu11=reglesJeu();

            	    state._fsp--;

            	    stream_reglesJeu.add(reglesJeu11.getTree());
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:13: ( FIN )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==FIN) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:14: FIN
            	            {
            	            FIN12=(Token)match(input,FIN,FOLLOW_FIN_in_game199);  
            	            stream_FIN.add(FIN12);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:2: ( iaBasique ( FIN )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IA_KW) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:3: iaBasique ( FIN )?
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game207);
            	    iaBasique13=iaBasique();

            	    state._fsp--;

            	    stream_iaBasique.add(iaBasique13.getTree());
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:13: ( FIN )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==FIN) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:14: FIN
            	            {
            	            FIN14=(Token)match(input,FIN,FOLLOW_FIN_in_game210);  
            	            stream_FIN.add(FIN14);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: newType, gameData, iaBasique, init, commande, definition, reglesJeu
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 49:4: -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )* ( reglesJeu )* ( iaBasique )* )
            {
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:7: ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )* ( reglesJeu )* ( iaBasique )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME_KW, "GAME_KW"), root_1);

                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:17: ( gameData )?
                if ( stream_gameData.hasNext() ) {
                    adaptor.addChild(root_1, stream_gameData.nextTree());

                }
                stream_gameData.reset();
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:27: ( newType )*
                while ( stream_newType.hasNext() ) {
                    adaptor.addChild(root_1, stream_newType.nextTree());

                }
                stream_newType.reset();
                if ( !(stream_init.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextTree());

                }
                stream_init.reset();
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:42: ( definition )*
                while ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:54: ( commande )*
                while ( stream_commande.hasNext() ) {
                    adaptor.addChild(root_1, stream_commande.nextTree());

                }
                stream_commande.reset();
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:64: ( reglesJeu )*
                while ( stream_reglesJeu.hasNext() ) {
                    adaptor.addChild(root_1, stream_reglesJeu.nextTree());

                }
                stream_reglesJeu.reset();
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:75: ( iaBasique )*
                while ( stream_iaBasique.hasNext() ) {
                    adaptor.addChild(root_1, stream_iaBasique.nextTree());

                }
                stream_iaBasique.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "game"

    public static class gameData_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "gameData"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:53:1: gameData : GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) ;
    public final hightParser.gameData_return gameData() throws RecognitionException {
        hightParser.gameData_return retval = new hightParser.gameData_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GAME15=null;
        Token HAS16=null;
        Token VIRG18=null;
        hightParser.attributGame_return attributGame17 = null;

        hightParser.attributGame_return attributGame19 = null;


        CommonTree GAME15_tree=null;
        CommonTree HAS16_tree=null;
        CommonTree VIRG18_tree=null;
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_attributGame=new RewriteRuleSubtreeStream(adaptor,"rule attributGame");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:53:10: ( GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:54:2: GAME HAS attributGame ( VIRG attributGame )*
            {
            GAME15=(Token)match(input,GAME,FOLLOW_GAME_in_gameData257);  
            stream_GAME.add(GAME15);

            HAS16=(Token)match(input,HAS,FOLLOW_HAS_in_gameData259);  
            stream_HAS.add(HAS16);

            pushFollow(FOLLOW_attributGame_in_gameData261);
            attributGame17=attributGame();

            state._fsp--;

            stream_attributGame.add(attributGame17.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:54:24: ( VIRG attributGame )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==VIRG) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:54:25: VIRG attributGame
            	    {
            	    VIRG18=(Token)match(input,VIRG,FOLLOW_VIRG_in_gameData264);  
            	    stream_VIRG.add(VIRG18);

            	    pushFollow(FOLLOW_attributGame_in_gameData266);
            	    attributGame19=attributGame();

            	    state._fsp--;

            	    stream_attributGame.add(attributGame19.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            // AST REWRITE
            // elements: attributGame
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 55:4: -> ^( GAME_ATTRIBUT_KW ( attributGame )+ )
            {
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:55:7: ^( GAME_ATTRIBUT_KW ( attributGame )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME_ATTRIBUT_KW, "GAME_ATTRIBUT_KW"), root_1);

                if ( !(stream_attributGame.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_attributGame.hasNext() ) {
                    adaptor.addChild(root_1, stream_attributGame.nextTree());

                }
                stream_attributGame.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "gameData"

    public static class attributGame_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributGame"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:58:1: attributGame : ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | SCORE AT FLOAT -> ^( SCORE_KW FLOAT ) );
    public final hightParser.attributGame_return attributGame() throws RecognitionException {
        hightParser.attributGame_return retval = new hightParser.attributGame_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GRAVITY_KW20=null;
        Token AT21=null;
        Token FLOAT22=null;
        Token FLOAT23=null;
        Token FLOAT24=null;
        Token FLOAT25=null;
        Token SCORE26=null;
        Token AT27=null;
        Token FLOAT28=null;

        CommonTree GRAVITY_KW20_tree=null;
        CommonTree AT21_tree=null;
        CommonTree FLOAT22_tree=null;
        CommonTree FLOAT23_tree=null;
        CommonTree FLOAT24_tree=null;
        CommonTree FLOAT25_tree=null;
        CommonTree SCORE26_tree=null;
        CommonTree AT27_tree=null;
        CommonTree FLOAT28_tree=null;
        RewriteRuleTokenStream stream_GRAVITY_KW=new RewriteRuleTokenStream(adaptor,"token GRAVITY_KW");
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:58:14: ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | SCORE AT FLOAT -> ^( SCORE_KW FLOAT ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==GRAVITY_KW) ) {
                alt14=1;
            }
            else if ( (LA14_0==SCORE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:59:2: GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
                    {
                    GRAVITY_KW20=(Token)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame291);  
                    stream_GRAVITY_KW.add(GRAVITY_KW20);

                    AT21=(Token)match(input,AT,FOLLOW_AT_in_attributGame293);  
                    stream_AT.add(AT21);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:59:16: ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==FLOAT) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==FLOAT) ) {
                            alt13=2;
                        }
                        else if ( (LA13_1==FIN||LA13_1==VIRG) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:59:17: FLOAT
                            {
                            FLOAT22=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame296);  
                            stream_FLOAT.add(FLOAT22);



                            // AST REWRITE
                            // elements: FLOAT, GRAVITY_KW
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 60:5: -> ^( GRAVITY_KW FLOAT )
                            {
                                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:60:8: ^( GRAVITY_KW FLOAT )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_GRAVITY_KW.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_FLOAT.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:61:5: FLOAT FLOAT FLOAT
                            {
                            FLOAT23=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame314);  
                            stream_FLOAT.add(FLOAT23);

                            FLOAT24=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame316);  
                            stream_FLOAT.add(FLOAT24);

                            FLOAT25=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame318);  
                            stream_FLOAT.add(FLOAT25);



                            // AST REWRITE
                            // elements: FLOAT, GRAVITY_KW, FLOAT, FLOAT
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 62:5: -> ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                            {
                                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:62:8: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_GRAVITY_KW.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_FLOAT.nextNode());
                                adaptor.addChild(root_1, stream_FLOAT.nextNode());
                                adaptor.addChild(root_1, stream_FLOAT.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:63:4: SCORE AT FLOAT
                    {
                    SCORE26=(Token)match(input,SCORE,FOLLOW_SCORE_in_attributGame341);  
                    stream_SCORE.add(SCORE26);

                    AT27=(Token)match(input,AT,FOLLOW_AT_in_attributGame343);  
                    stream_AT.add(AT27);

                    FLOAT28=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame345);  
                    stream_FLOAT.add(FLOAT28);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 64:4: -> ^( SCORE_KW FLOAT )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:64:7: ^( SCORE_KW FLOAT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCORE_KW, "SCORE_KW"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributGame"

    public static class newType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newType"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:68:1: newType : TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT ( subType )+ ) ;
    public final hightParser.newType_return newType() throws RecognitionException {
        hightParser.newType_return retval = new hightParser.newType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE29=null;
        Token IDENT30=null;
        Token IS31=null;
        Token AND33=null;
        hightParser.subType_return subType32 = null;

        hightParser.subType_return subType34 = null;


        CommonTree TYPE29_tree=null;
        CommonTree IDENT30_tree=null;
        CommonTree IS31_tree=null;
        CommonTree AND33_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_subType=new RewriteRuleSubtreeStream(adaptor,"rule subType");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:68:9: ( TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT ( subType )+ ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:69:2: TYPE IDENT IS subType ( AND subType )*
            {
            TYPE29=(Token)match(input,TYPE,FOLLOW_TYPE_in_newType369);  
            stream_TYPE.add(TYPE29);

            IDENT30=(Token)match(input,IDENT,FOLLOW_IDENT_in_newType371);  
            stream_IDENT.add(IDENT30);

            IS31=(Token)match(input,IS,FOLLOW_IS_in_newType373);  
            stream_IS.add(IS31);

            pushFollow(FOLLOW_subType_in_newType375);
            subType32=subType();

            state._fsp--;

            stream_subType.add(subType32.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:69:24: ( AND subType )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:69:25: AND subType
            	    {
            	    AND33=(Token)match(input,AND,FOLLOW_AND_in_newType378);  
            	    stream_AND.add(AND33);

            	    pushFollow(FOLLOW_subType_in_newType380);
            	    subType34=subType();

            	    state._fsp--;

            	    stream_subType.add(subType34.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);



            // AST REWRITE
            // elements: TYPE, IDENT, subType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 70:4: -> ^( TYPE IDENT ( subType )+ )
            {
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:70:7: ^( TYPE IDENT ( subType )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                if ( !(stream_subType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_subType.hasNext() ) {
                    adaptor.addChild(root_1, stream_subType.nextTree());

                }
                stream_subType.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newType"

    public static class subType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subType"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:73:1: subType : ( IDENT | typeObjet );
    public final hightParser.subType_return subType() throws RecognitionException {
        hightParser.subType_return retval = new hightParser.subType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT35=null;
        hightParser.typeObjet_return typeObjet36 = null;


        CommonTree IDENT35_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:73:9: ( IDENT | typeObjet )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENT) ) {
                alt16=1;
            }
            else if ( (LA16_0==CAMERA||LA16_0==MEDIA||(LA16_0>=COUNTER && LA16_0<=TELEPORTER)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:74:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_subType409); 
                    IDENT35_tree = (CommonTree)adaptor.create(IDENT35);
                    adaptor.addChild(root_0, IDENT35_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:75:4: typeObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet_in_subType414);
                    typeObjet36=typeObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet36.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subType"

    public static class init_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "init"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:80:1: init : ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW ( allocationObject )+ ) );
    public final hightParser.init_return init() throws RecognitionException {
        hightParser.init_return retval = new hightParser.init_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT37=null;
        Token IS38=null;
        Token HAS41=null;
        Token VIRG43=null;
        hightParser.declarationObjet_return declarationObjet39 = null;

        hightParser.accesClasse_return accesClasse40 = null;

        hightParser.allocationObject_return allocationObject42 = null;

        hightParser.allocationObject_return allocationObject44 = null;


        CommonTree IDENT37_tree=null;
        CommonTree IS38_tree=null;
        CommonTree HAS41_tree=null;
        CommonTree VIRG43_tree=null;
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_accesClasse=new RewriteRuleSubtreeStream(adaptor,"rule accesClasse");
        RewriteRuleSubtreeStream stream_allocationObject=new RewriteRuleSubtreeStream(adaptor,"rule allocationObject");
        RewriteRuleSubtreeStream stream_declarationObjet=new RewriteRuleSubtreeStream(adaptor,"rule declarationObjet");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:80:6: ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW ( allocationObject )+ ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==IS) ) {
                    alt18=1;
                }
                else if ( (LA18_1==HAS) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==CAMERA||LA18_0==MEDIA||(LA18_0>=PLAYER && LA18_0<=NEUTRAL)||LA18_0==PG||(LA18_0>=ALL && LA18_0<=NUM)||(LA18_0>=COUNTER && LA18_0<=TELEPORTER)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:81:2: IDENT IS declarationObjet
                    {
                    IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_init431);  
                    stream_IDENT.add(IDENT37);

                    IS38=(Token)match(input,IS,FOLLOW_IS_in_init433);  
                    stream_IS.add(IS38);

                    pushFollow(FOLLOW_declarationObjet_in_init435);
                    declarationObjet39=declarationObjet();

                    state._fsp--;

                    stream_declarationObjet.add(declarationObjet39.getTree());


                    // AST REWRITE
                    // elements: declarationObjet, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 82:4: -> ^( INIT_IS_KW IDENT declarationObjet )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:82:7: ^( INIT_IS_KW IDENT declarationObjet )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INIT_IS_KW, "INIT_IS_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_declarationObjet.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:83:4: accesClasse HAS allocationObject ( VIRG allocationObject )*
                    {
                    pushFollow(FOLLOW_accesClasse_in_init453);
                    accesClasse40=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse40.getTree());
                    HAS41=(Token)match(input,HAS,FOLLOW_HAS_in_init455);  
                    stream_HAS.add(HAS41);

                    pushFollow(FOLLOW_allocationObject_in_init457);
                    allocationObject42=allocationObject();

                    state._fsp--;

                    stream_allocationObject.add(allocationObject42.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:83:37: ( VIRG allocationObject )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==VIRG) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:83:38: VIRG allocationObject
                    	    {
                    	    VIRG43=(Token)match(input,VIRG,FOLLOW_VIRG_in_init460);  
                    	    stream_VIRG.add(VIRG43);

                    	    pushFollow(FOLLOW_allocationObject_in_init462);
                    	    allocationObject44=allocationObject();

                    	    state._fsp--;

                    	    stream_allocationObject.add(allocationObject44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: allocationObject
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 84:4: -> ^( INIT_HAS_KW ( allocationObject )+ )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:84:7: ^( INIT_HAS_KW ( allocationObject )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INIT_HAS_KW, "INIT_HAS_KW"), root_1);

                        if ( !(stream_allocationObject.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_allocationObject.hasNext() ) {
                            adaptor.addChild(root_1, stream_allocationObject.nextTree());

                        }
                        stream_allocationObject.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "init"

    public static class declarationObjet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarationObjet"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:88:1: declarationObjet : ( typeEntity ( entityMode )? -> ^( DEC typeEntity ( entityMode )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) );
    public final hightParser.declarationObjet_return declarationObjet() throws RecognitionException {
        hightParser.declarationObjet_return retval = new hightParser.declarationObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LIST_KW47=null;
        Token OF48=null;
        Token IDENT50=null;
        Token WITH51=null;
        Token IDENT53=null;
        Token CAMERA54=null;
        Token PERSON56=null;
        Token FREE57=null;
        Token MEDIA58=null;
        Token LOOP59=null;
        Token ONCE60=null;
        Token IN61=null;
        Token IDENT62=null;
        hightParser.typeEntity_return typeEntity45 = null;

        hightParser.entityMode_return entityMode46 = null;

        hightParser.operation_return operation49 = null;

        hightParser.operation_return operation52 = null;

        hightParser.view_return view55 = null;


        CommonTree LIST_KW47_tree=null;
        CommonTree OF48_tree=null;
        CommonTree IDENT50_tree=null;
        CommonTree WITH51_tree=null;
        CommonTree IDENT53_tree=null;
        CommonTree CAMERA54_tree=null;
        CommonTree PERSON56_tree=null;
        CommonTree FREE57_tree=null;
        CommonTree MEDIA58_tree=null;
        CommonTree LOOP59_tree=null;
        CommonTree ONCE60_tree=null;
        CommonTree IN61_tree=null;
        CommonTree IDENT62_tree=null;
        RewriteRuleTokenStream stream_FREE=new RewriteRuleTokenStream(adaptor,"token FREE");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_PERSON=new RewriteRuleTokenStream(adaptor,"token PERSON");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_ONCE=new RewriteRuleTokenStream(adaptor,"token ONCE");
        RewriteRuleTokenStream stream_LIST_KW=new RewriteRuleTokenStream(adaptor,"token LIST_KW");
        RewriteRuleTokenStream stream_MEDIA=new RewriteRuleTokenStream(adaptor,"token MEDIA");
        RewriteRuleTokenStream stream_CAMERA=new RewriteRuleTokenStream(adaptor,"token CAMERA");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_typeEntity=new RewriteRuleSubtreeStream(adaptor,"rule typeEntity");
        RewriteRuleSubtreeStream stream_entityMode=new RewriteRuleSubtreeStream(adaptor,"rule entityMode");
        RewriteRuleSubtreeStream stream_view=new RewriteRuleSubtreeStream(adaptor,"rule view");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:88:18: ( typeEntity ( entityMode )? -> ^( DEC typeEntity ( entityMode )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case IDENT:
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
                alt26=1;
                }
                break;
            case LIST_KW:
                {
                alt26=2;
                }
                break;
            case CAMERA:
                {
                alt26=3;
                }
                break;
            case MEDIA:
                {
                alt26=4;
                }
                break;
            case IN:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:89:2: typeEntity ( entityMode )?
                    {
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet489);
                    typeEntity45=typeEntity();

                    state._fsp--;

                    stream_typeEntity.add(typeEntity45.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:89:13: ( entityMode )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=PLAYER && LA19_0<=DUPLICABLE)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:89:13: entityMode
                            {
                            pushFollow(FOLLOW_entityMode_in_declarationObjet491);
                            entityMode46=entityMode();

                            state._fsp--;

                            stream_entityMode.add(entityMode46.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: entityMode, typeEntity
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 90:4: -> ^( DEC typeEntity ( entityMode )? )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:90:7: ^( DEC typeEntity ( entityMode )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);

                        adaptor.addChild(root_1, stream_typeEntity.nextTree());
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:90:24: ( entityMode )?
                        if ( stream_entityMode.hasNext() ) {
                            adaptor.addChild(root_1, stream_entityMode.nextTree());

                        }
                        stream_entityMode.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:4: LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )?
                    {
                    LIST_KW47=(Token)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet515);  
                    stream_LIST_KW.add(LIST_KW47);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:12: ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==OF) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:13: OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )*
                            {
                            OF48=(Token)match(input,OF,FOLLOW_OF_in_declarationObjet518);  
                            stream_OF.add(OF48);

                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:16: ( operation )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>=FLOAT && LA20_0<=TYPE)||LA20_0==PG||LA20_0==RANDOM_KW||(LA20_0>=X && LA20_0<=VALUE)||(LA20_0>=MASS && LA20_0<=MOVE_WITH_CAMERA)) ) {
                                alt20=1;
                            }
                            else if ( (LA20_0==IDENT) ) {
                                int LA20_2 = input.LA(2);

                                if ( (LA20_2==OF) ) {
                                    alt20=1;
                                }
                            }
                            switch (alt20) {
                                case 1 :
                                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:17: operation
                                    {
                                    pushFollow(FOLLOW_operation_in_declarationObjet521);
                                    operation49=operation();

                                    state._fsp--;

                                    stream_operation.add(operation49.getTree());

                                    }
                                    break;

                            }

                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:29: ( IDENT )
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:30: IDENT
                            {
                            IDENT50=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet526);  
                            stream_IDENT.add(IDENT50);


                            }

                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:37: ( WITH ( operation )? ( IDENT ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==WITH) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:38: WITH ( operation )? ( IDENT )
                            	    {
                            	    WITH51=(Token)match(input,WITH,FOLLOW_WITH_in_declarationObjet530);  
                            	    stream_WITH.add(WITH51);

                            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:43: ( operation )?
                            	    int alt21=2;
                            	    int LA21_0 = input.LA(1);

                            	    if ( ((LA21_0>=FLOAT && LA21_0<=TYPE)||LA21_0==PG||LA21_0==RANDOM_KW||(LA21_0>=X && LA21_0<=VALUE)||(LA21_0>=MASS && LA21_0<=MOVE_WITH_CAMERA)) ) {
                            	        alt21=1;
                            	    }
                            	    else if ( (LA21_0==IDENT) ) {
                            	        int LA21_2 = input.LA(2);

                            	        if ( (LA21_2==OF) ) {
                            	            alt21=1;
                            	        }
                            	    }
                            	    switch (alt21) {
                            	        case 1 :
                            	            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:44: operation
                            	            {
                            	            pushFollow(FOLLOW_operation_in_declarationObjet533);
                            	            operation52=operation();

                            	            state._fsp--;

                            	            stream_operation.add(operation52.getTree());

                            	            }
                            	            break;

                            	    }

                            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:56: ( IDENT )
                            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:57: IDENT
                            	    {
                            	    IDENT53=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet538);  
                            	    stream_IDENT.add(IDENT53);


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IDENT, LIST_KW, operation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 92:4: -> ^( LIST_KW ( ( operation )? IDENT )+ )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:6: ^( LIST_KW ( ( operation )? IDENT )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LIST_KW.nextNode(), root_1);

                        if ( !(stream_IDENT.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_IDENT.hasNext() ) {
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:17: ( operation )?
                            if ( stream_operation.hasNext() ) {
                                adaptor.addChild(root_1, stream_operation.nextTree());

                            }
                            stream_operation.reset();
                            adaptor.addChild(root_1, stream_IDENT.nextNode());

                        }
                        stream_IDENT.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:4: CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
                    {
                    CAMERA54=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_declarationObjet567);  
                    stream_CAMERA.add(CAMERA54);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:11: ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
                    int alt24=3;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=FIRST && LA24_0<=THIRD)) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==FREE) ) {
                        alt24=2;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:12: view PERSON
                            {
                            pushFollow(FOLLOW_view_in_declarationObjet570);
                            view55=view();

                            state._fsp--;

                            stream_view.add(view55.getTree());
                            PERSON56=(Token)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet572);  
                            stream_PERSON.add(PERSON56);



                            // AST REWRITE
                            // elements: view, PERSON
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 93:24: -> ^( CAMERA_KW PERSON view )
                            {
                                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:27: ^( CAMERA_KW PERSON view )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAMERA_KW, "CAMERA_KW"), root_1);

                                adaptor.addChild(root_1, stream_PERSON.nextNode());
                                adaptor.addChild(root_1, stream_view.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:54: FREE
                            {
                            FREE57=(Token)match(input,FREE,FOLLOW_FREE_in_declarationObjet586);  
                            stream_FREE.add(FREE57);



                            // AST REWRITE
                            // elements: FREE
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 93:59: -> ^( CAMERA_KW FREE )
                            {
                                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:62: ^( CAMERA_KW FREE )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAMERA_KW, "CAMERA_KW"), root_1);

                                adaptor.addChild(root_1, stream_FREE.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:4: MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
                    {
                    MEDIA58=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_declarationObjet601);  
                    stream_MEDIA.add(MEDIA58);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:10: ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
                    int alt25=3;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==LOOP) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==ONCE) ) {
                        alt25=2;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:11: LOOP
                            {
                            LOOP59=(Token)match(input,LOOP,FOLLOW_LOOP_in_declarationObjet604);  
                            stream_LOOP.add(LOOP59);



                            // AST REWRITE
                            // elements: LOOP
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 94:16: -> ^( MEDIA_KW LOOP )
                            {
                                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:18: ^( MEDIA_KW LOOP )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEDIA_KW, "MEDIA_KW"), root_1);

                                adaptor.addChild(root_1, stream_LOOP.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:37: ONCE
                            {
                            ONCE60=(Token)match(input,ONCE,FOLLOW_ONCE_in_declarationObjet615);  
                            stream_ONCE.add(ONCE60);



                            // AST REWRITE
                            // elements: ONCE
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 94:42: -> ^( MEDIA_KW ONCE )
                            {
                                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:44: ^( MEDIA_KW ONCE )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEDIA_KW, "MEDIA_KW"), root_1);

                                adaptor.addChild(root_1, stream_ONCE.nextNode());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:4: IN IDENT
                    {
                    IN61=(Token)match(input,IN,FOLLOW_IN_in_declarationObjet637);  
                    stream_IN.add(IN61);

                    IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet639);  
                    stream_IDENT.add(IDENT62);



                    // AST REWRITE
                    // elements: IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 95:13: -> ^( IN_KW IDENT )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:16: ^( IN_KW IDENT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IN_KW, "IN_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarationObjet"

    public static class typeEntity_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeEntity"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:98:1: typeEntity : ( IDENT | typeObjet3D );
    public final hightParser.typeEntity_return typeEntity() throws RecognitionException {
        hightParser.typeEntity_return retval = new hightParser.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT63=null;
        hightParser.typeObjet3D_return typeObjet3D64 = null;


        CommonTree IDENT63_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:98:12: ( IDENT | typeObjet3D )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IDENT) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=OBJECT && LA27_0<=TELEPORTER)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:99:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT63=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeEntity670); 
                    IDENT63_tree = (CommonTree)adaptor.create(IDENT63);
                    adaptor.addChild(root_0, IDENT63_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:100:4: typeObjet3D
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet3D_in_typeEntity675);
                    typeObjet3D64=typeObjet3D();

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet3D64.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeEntity"

    public static class entityMode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entityMode"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:103:1: entityMode : ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli );
    public final hightParser.entityMode_return entityMode() throws RecognitionException {
        hightParser.entityMode_return retval = new hightParser.entityMode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER65=null;
        hightParser.interaction_return interaction66 = null;

        hightParser.dupli_return dupli67 = null;

        hightParser.dupli_return dupli68 = null;


        CommonTree PLAYER65_tree=null;
        RewriteRuleSubtreeStream stream_dupli=new RewriteRuleSubtreeStream(adaptor,"rule dupli");
        RewriteRuleSubtreeStream stream_interaction=new RewriteRuleSubtreeStream(adaptor,"rule interaction");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:103:11: ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli )
            int alt29=3;
            switch ( input.LA(1) ) {
            case PLAYER:
                {
                alt29=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
                {
                alt29=2;
                }
                break;
            case DUPLICABLE:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:104:2: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER65=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_entityMode685); 
                    PLAYER65_tree = (CommonTree)adaptor.create(PLAYER65);
                    adaptor.addChild(root_0, PLAYER65_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:4: interaction ( dupli )?
                    {
                    pushFollow(FOLLOW_interaction_in_entityMode690);
                    interaction66=interaction();

                    state._fsp--;

                    stream_interaction.add(interaction66.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:16: ( dupli )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==DUPLICABLE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:16: dupli
                            {
                            pushFollow(FOLLOW_dupli_in_entityMode692);
                            dupli67=dupli();

                            state._fsp--;

                            stream_dupli.add(dupli67.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: dupli, interaction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 105:23: -> ^( INTERACTION_KW interaction ( dupli )? )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:25: ^( INTERACTION_KW interaction ( dupli )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTERACTION_KW, "INTERACTION_KW"), root_1);

                        adaptor.addChild(root_1, stream_interaction.nextTree());
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:54: ( dupli )?
                        if ( stream_dupli.hasNext() ) {
                            adaptor.addChild(root_1, stream_dupli.nextTree());

                        }
                        stream_dupli.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:106:4: dupli
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dupli_in_entityMode708);
                    dupli68=dupli();

                    state._fsp--;

                    adaptor.addChild(root_0, dupli68.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entityMode"

    public static class interaction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interaction"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:109:1: interaction : ( ALLY | ENEMY | NEUTRAL );
    public final hightParser.interaction_return interaction() throws RecognitionException {
        hightParser.interaction_return retval = new hightParser.interaction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set69=null;

        CommonTree set69_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:109:13: ( ALLY | ENEMY | NEUTRAL )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set69=(Token)input.LT(1);
            if ( (input.LA(1)>=ALLY && input.LA(1)<=NEUTRAL) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set69));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interaction"

    public static class dupli_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dupli"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:115:1: dupli : DUPLICABLE ;
    public final hightParser.dupli_return dupli() throws RecognitionException {
        hightParser.dupli_return retval = new hightParser.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DUPLICABLE70=null;

        CommonTree DUPLICABLE70_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:115:7: ( DUPLICABLE )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:116:2: DUPLICABLE
            {
            root_0 = (CommonTree)adaptor.nil();

            DUPLICABLE70=(Token)match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli741); 
            DUPLICABLE70_tree = (CommonTree)adaptor.create(DUPLICABLE70);
            adaptor.addChild(root_0, DUPLICABLE70_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dupli"

    public static class view_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "view"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:119:1: view : ( FIRST | THIRD );
    public final hightParser.view_return view() throws RecognitionException {
        hightParser.view_return retval = new hightParser.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set71=null;

        CommonTree set71_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:119:6: ( FIRST | THIRD )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set71=(Token)input.LT(1);
            if ( (input.LA(1)>=FIRST && input.LA(1)<=THIRD) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set71));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "view"

    public static class allocationObject_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "allocationObject"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:124:1: allocationObject : ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT valAggregation ) | attribut AT typeAllocation -> ^( ALLOCATION_KW attribut typeAllocation ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) );
    public final hightParser.allocationObject_return allocationObject() throws RecognitionException {
        hightParser.allocationObject_return retval = new hightParser.allocationObject_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT72=null;
        Token AT73=null;
        Token AT76=null;
        Token AT79=null;
        Token AT82=null;
        Token IDENT83=null;
        Token AT85=null;
        hightParser.valAggregation_return valAggregation74 = null;

        hightParser.attribut_return attribut75 = null;

        hightParser.typeAllocation_return typeAllocation77 = null;

        hightParser.typeCoordonnees_return typeCoordonnees78 = null;

        hightParser.coordinates_return coordinates80 = null;

        hightParser.attributListeOuObjet_return attributListeOuObjet81 = null;

        hightParser.attributTps_return attributTps84 = null;

        hightParser.operation_return operation86 = null;

        hightParser.timeUnit_return timeUnit87 = null;


        CommonTree IDENT72_tree=null;
        CommonTree AT73_tree=null;
        CommonTree AT76_tree=null;
        CommonTree AT79_tree=null;
        CommonTree AT82_tree=null;
        CommonTree IDENT83_tree=null;
        CommonTree AT85_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_valAggregation=new RewriteRuleSubtreeStream(adaptor,"rule valAggregation");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_attribut=new RewriteRuleSubtreeStream(adaptor,"rule attribut");
        RewriteRuleSubtreeStream stream_typeAllocation=new RewriteRuleSubtreeStream(adaptor,"rule typeAllocation");
        RewriteRuleSubtreeStream stream_attributListeOuObjet=new RewriteRuleSubtreeStream(adaptor,"rule attributListeOuObjet");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        RewriteRuleSubtreeStream stream_typeCoordonnees=new RewriteRuleSubtreeStream(adaptor,"rule typeCoordonnees");
        RewriteRuleSubtreeStream stream_coordinates=new RewriteRuleSubtreeStream(adaptor,"rule coordinates");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:124:18: ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT valAggregation ) | attribut AT typeAllocation -> ^( ALLOCATION_KW attribut typeAllocation ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt31=1;
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
                alt31=2;
                }
                break;
            case POSITION:
            case ORIENTATION:
            case SIZE:
                {
                alt31=3;
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
                alt31=4;
                }
                break;
            case BOOST_INTERVAL:
            case SHOOT_INTERVAL:
            case RELOAD_TIME:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:2: IDENT ( AT valAggregation )?
                    {
                    IDENT72=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject770);  
                    stream_IDENT.add(IDENT72);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:8: ( AT valAggregation )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==AT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:9: AT valAggregation
                            {
                            AT73=(Token)match(input,AT,FOLLOW_AT_in_allocationObject773);  
                            stream_AT.add(AT73);

                            pushFollow(FOLLOW_valAggregation_in_allocationObject775);
                            valAggregation74=valAggregation();

                            state._fsp--;

                            stream_valAggregation.add(valAggregation74.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: valAggregation, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 126:4: -> ^( ALLOCATION_KW IDENT valAggregation )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:126:7: ^( ALLOCATION_KW IDENT valAggregation )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_valAggregation.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:127:4: attribut AT typeAllocation
                    {
                    pushFollow(FOLLOW_attribut_in_allocationObject805);
                    attribut75=attribut();

                    state._fsp--;

                    stream_attribut.add(attribut75.getTree());
                    AT76=(Token)match(input,AT,FOLLOW_AT_in_allocationObject807);  
                    stream_AT.add(AT76);

                    pushFollow(FOLLOW_typeAllocation_in_allocationObject809);
                    typeAllocation77=typeAllocation();

                    state._fsp--;

                    stream_typeAllocation.add(typeAllocation77.getTree());


                    // AST REWRITE
                    // elements: typeAllocation, attribut
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 128:4: -> ^( ALLOCATION_KW attribut typeAllocation )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:128:7: ^( ALLOCATION_KW attribut typeAllocation )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_attribut.nextTree());
                        adaptor.addChild(root_1, stream_typeAllocation.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:129:4: typeCoordonnees AT coordinates
                    {
                    pushFollow(FOLLOW_typeCoordonnees_in_allocationObject839);
                    typeCoordonnees78=typeCoordonnees();

                    state._fsp--;

                    stream_typeCoordonnees.add(typeCoordonnees78.getTree());
                    AT79=(Token)match(input,AT,FOLLOW_AT_in_allocationObject841);  
                    stream_AT.add(AT79);

                    pushFollow(FOLLOW_coordinates_in_allocationObject843);
                    coordinates80=coordinates();

                    state._fsp--;

                    stream_coordinates.add(coordinates80.getTree());


                    // AST REWRITE
                    // elements: typeCoordonnees, coordinates
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 130:4: -> ^( ALLOCATION_KW typeCoordonnees coordinates )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:130:7: ^( ALLOCATION_KW typeCoordonnees coordinates )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_typeCoordonnees.nextTree());
                        adaptor.addChild(root_1, stream_coordinates.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:131:4: attributListeOuObjet AT IDENT
                    {
                    pushFollow(FOLLOW_attributListeOuObjet_in_allocationObject874);
                    attributListeOuObjet81=attributListeOuObjet();

                    state._fsp--;

                    stream_attributListeOuObjet.add(attributListeOuObjet81.getTree());
                    AT82=(Token)match(input,AT,FOLLOW_AT_in_allocationObject876);  
                    stream_AT.add(AT82);

                    IDENT83=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject878);  
                    stream_IDENT.add(IDENT83);



                    // AST REWRITE
                    // elements: IDENT, attributListeOuObjet
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 132:4: -> ^( ALLOCATION_KW attributListeOuObjet IDENT )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:132:7: ^( ALLOCATION_KW attributListeOuObjet IDENT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_attributListeOuObjet.nextTree());
                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:133:4: attributTps AT operation timeUnit
                    {
                    pushFollow(FOLLOW_attributTps_in_allocationObject910);
                    attributTps84=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps84.getTree());
                    AT85=(Token)match(input,AT,FOLLOW_AT_in_allocationObject912);  
                    stream_AT.add(AT85);

                    pushFollow(FOLLOW_operation_in_allocationObject914);
                    operation86=operation();

                    state._fsp--;

                    stream_operation.add(operation86.getTree());
                    pushFollow(FOLLOW_timeUnit_in_allocationObject916);
                    timeUnit87=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit87.getTree());


                    // AST REWRITE
                    // elements: attributTps, operation, timeUnit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 134:4: -> ^( ALLOCATION_KW attributTps operation timeUnit )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:134:7: ^( ALLOCATION_KW attributTps operation timeUnit )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_attributTps.nextTree());
                        adaptor.addChild(root_1, stream_operation.nextTree());
                        adaptor.addChild(root_1, stream_timeUnit.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "allocationObject"

    public static class typeAllocation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeAllocation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:137:1: typeAllocation : ( operation | IDENT | 'true' | 'false' ) ;
    public final hightParser.typeAllocation_return typeAllocation() throws RecognitionException {
        hightParser.typeAllocation_return retval = new hightParser.typeAllocation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT89=null;
        Token string_literal90=null;
        Token string_literal91=null;
        hightParser.operation_return operation88 = null;


        CommonTree IDENT89_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree string_literal91_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:2: ( ( operation | IDENT | 'true' | 'false' ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:4: ( operation | IDENT | 'true' | 'false' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:4: ( operation | IDENT | 'true' | 'false' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case FLOAT:
            case SCORE:
            case TYPE:
            case PG:
            case RANDOM_KW:
            case X:
            case Y:
            case Z:
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
                alt32=1;
                }
                break;
            case IDENT:
                {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==OF) ) {
                    alt32=1;
                }
                else if ( (LA32_2==FIN||LA32_2==VIRG) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
                }
                break;
            case 246:
                {
                alt32=3;
                }
                break;
            case 247:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:5: operation
                    {
                    pushFollow(FOLLOW_operation_in_typeAllocation958);
                    operation88=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation88.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:17: IDENT
                    {
                    IDENT89=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeAllocation962); 
                    IDENT89_tree = (CommonTree)adaptor.create(IDENT89);
                    adaptor.addChild(root_0, IDENT89_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:25: 'true'
                    {
                    string_literal90=(Token)match(input,246,FOLLOW_246_in_typeAllocation966); 
                    string_literal90_tree = (CommonTree)adaptor.create(string_literal90);
                    adaptor.addChild(root_0, string_literal90_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:34: 'false'
                    {
                    string_literal91=(Token)match(input,247,FOLLOW_247_in_typeAllocation970); 
                    string_literal91_tree = (CommonTree)adaptor.create(string_literal91);
                    adaptor.addChild(root_0, string_literal91_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeAllocation"

    public static class valAggregation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valAggregation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:140:1: valAggregation : ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) );
    public final hightParser.valAggregation_return valAggregation() throws RecognitionException {
        hightParser.valAggregation_return retval = new hightParser.valAggregation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT94=null;
        hightParser.operation_return operation92 = null;

        hightParser.timeUnit_return timeUnit93 = null;


        CommonTree IDENT94_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:140:16: ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=FLOAT && LA34_0<=TYPE)||LA34_0==PG||LA34_0==RANDOM_KW||(LA34_0>=X && LA34_0<=VALUE)||(LA34_0>=MASS && LA34_0<=MOVE_WITH_CAMERA)) ) {
                alt34=1;
            }
            else if ( (LA34_0==IDENT) ) {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==OF) ) {
                    alt34=1;
                }
                else if ( (LA34_2==FIN||LA34_2==VIRG) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:2: operation ( timeUnit )?
                    {
                    pushFollow(FOLLOW_operation_in_valAggregation980);
                    operation92=operation();

                    state._fsp--;

                    stream_operation.add(operation92.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:12: ( timeUnit )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=MIN && LA33_0<=FRAME)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:13: timeUnit
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation983);
                            timeUnit93=timeUnit();

                            state._fsp--;

                            stream_timeUnit.add(timeUnit93.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: timeUnit, operation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 142:4: -> ^( AGGREGATION_KW operation ( timeUnit )? )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:7: ^( AGGREGATION_KW operation ( timeUnit )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_operation.nextTree());
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:34: ( timeUnit )?
                        if ( stream_timeUnit.hasNext() ) {
                            adaptor.addChild(root_1, stream_timeUnit.nextTree());

                        }
                        stream_timeUnit.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:143:4: IDENT
                    {
                    IDENT94=(Token)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1005);  
                    stream_IDENT.add(IDENT94);



                    // AST REWRITE
                    // elements: IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 144:4: -> ^( AGGREGATION_KW IDENT )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:144:7: ^( AGGREGATION_KW IDENT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "valAggregation"

    public static class valAffectation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valAffectation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:147:2: valAffectation : ( operation | IDENT | 'true' | 'false' );
    public final hightParser.valAffectation_return valAffectation() throws RecognitionException {
        hightParser.valAffectation_return retval = new hightParser.valAffectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT96=null;
        Token string_literal97=null;
        Token string_literal98=null;
        hightParser.operation_return operation95 = null;


        CommonTree IDENT96_tree=null;
        CommonTree string_literal97_tree=null;
        CommonTree string_literal98_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:147:17: ( operation | IDENT | 'true' | 'false' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case FLOAT:
            case SCORE:
            case TYPE:
            case PG:
            case RANDOM_KW:
            case X:
            case Y:
            case Z:
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
                alt35=1;
                }
                break;
            case IDENT:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==OF) ) {
                    alt35=1;
                }
                else if ( (LA35_2==EOF) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case 246:
                {
                alt35=3;
                }
                break;
            case 247:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:148:2: operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operation_in_valAffectation1031);
                    operation95=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation95.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:149:4: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT96=(Token)match(input,IDENT,FOLLOW_IDENT_in_valAffectation1037); 
                    IDENT96_tree = (CommonTree)adaptor.create(IDENT96);
                    adaptor.addChild(root_0, IDENT96_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:150:4: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal97=(Token)match(input,246,FOLLOW_246_in_valAffectation1043); 
                    string_literal97_tree = (CommonTree)adaptor.create(string_literal97);
                    adaptor.addChild(root_0, string_literal97_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:150:13: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal98=(Token)match(input,247,FOLLOW_247_in_valAffectation1047); 
                    string_literal98_tree = (CommonTree)adaptor.create(string_literal98);
                    adaptor.addChild(root_0, string_literal98_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "valAffectation"

    public static class definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:154:1: definition : DEFINITION_KW IDENT MEANS consequences ;
    public final hightParser.definition_return definition() throws RecognitionException {
        hightParser.definition_return retval = new hightParser.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINITION_KW99=null;
        Token IDENT100=null;
        Token MEANS101=null;
        hightParser.consequences_return consequences102 = null;


        CommonTree DEFINITION_KW99_tree=null;
        CommonTree IDENT100_tree=null;
        CommonTree MEANS101_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:154:12: ( DEFINITION_KW IDENT MEANS consequences )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:154:14: DEFINITION_KW IDENT MEANS consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFINITION_KW99=(Token)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1060); 
            DEFINITION_KW99_tree = (CommonTree)adaptor.create(DEFINITION_KW99);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW99_tree, root_0);

            IDENT100=(Token)match(input,IDENT,FOLLOW_IDENT_in_definition1063); 
            IDENT100_tree = (CommonTree)adaptor.create(IDENT100);
            adaptor.addChild(root_0, IDENT100_tree);

            MEANS101=(Token)match(input,MEANS,FOLLOW_MEANS_in_definition1065); 
            pushFollow(FOLLOW_consequences_in_definition1068);
            consequences102=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences102.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "definition"

    public static class consequences_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consequences"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:156:1: consequences : consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) ;
    public final hightParser.consequences_return consequences() throws RecognitionException {
        hightParser.consequences_return retval = new hightParser.consequences_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG104=null;
        hightParser.consequ_return consequ103 = null;

        hightParser.consequ_return consequ105 = null;


        CommonTree VIRG104_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_consequ=new RewriteRuleSubtreeStream(adaptor,"rule consequ");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:156:14: ( consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:157:2: consequ ( VIRG consequ )*
            {
            pushFollow(FOLLOW_consequ_in_consequences1077);
            consequ103=consequ();

            state._fsp--;

            stream_consequ.add(consequ103.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:157:10: ( VIRG consequ )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==VIRG) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:157:11: VIRG consequ
            	    {
            	    VIRG104=(Token)match(input,VIRG,FOLLOW_VIRG_in_consequences1080);  
            	    stream_VIRG.add(VIRG104);

            	    pushFollow(FOLLOW_consequ_in_consequences1082);
            	    consequ105=consequ();

            	    state._fsp--;

            	    stream_consequ.add(consequ105.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);



            // AST REWRITE
            // elements: consequ
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 158:4: -> ^( CONSEQUENCES_KW ( consequ )+ )
            {
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:158:6: ^( CONSEQUENCES_KW ( consequ )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSEQUENCES_KW, "CONSEQUENCES_KW"), root_1);

                if ( !(stream_consequ.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_consequ.hasNext() ) {
                    adaptor.addChild(root_1, stream_consequ.nextTree());

                }
                stream_consequ.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consequences"

    public static class consequ_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consequ"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:161:1: consequ : ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW );
    public final hightParser.consequ_return consequ() throws RecognitionException {
        hightParser.consequ_return retval = new hightParser.consequ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT110=null;
        Token VICTORY_KW111=null;
        Token DEFEAT_KW112=null;
        hightParser.siAlors_return siAlors106 = null;

        hightParser.action_return action107 = null;

        hightParser.affectation_return affectation108 = null;

        hightParser.activCommande_return activCommande109 = null;


        CommonTree IDENT110_tree=null;
        CommonTree VICTORY_KW111_tree=null;
        CommonTree DEFEAT_KW112_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:161:9: ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW )
            int alt37=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt37=1;
                }
                break;
            case GAME:
            case CAMERA:
            case MEDIA:
            case PLAYER:
            case ALLY:
            case ENEMY:
            case NEUTRAL:
            case PAUSE_KW:
            case MUTE_KW:
            case PLAY_KW:
            case STOP_KW:
            case BLOCK_KW:
            case EFFACE_KW:
            case GENERATE_KW:
            case WAIT_KW:
            case SAVE_KW:
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
                alt37=2;
                }
                break;
            case IDENT:
                {
                int LA37_3 = input.LA(2);

                if ( ((LA37_3>=ENDS_KW && LA37_3<=PAUSE_KW)||LA37_3==STOP_KW||LA37_3==DIES_KW||LA37_3==EQUIP||(LA37_3>=JUMP && LA37_3<=MOVE)||(LA37_3>=TURN && LA37_3<=BRAKE)) ) {
                    alt37=2;
                }
                else if ( (LA37_3==EOF||LA37_3==FIN||LA37_3==VIRG||LA37_3==DEFINITION_KW||LA37_3==ENDWAIT||LA37_3==COMMAND_KW||LA37_3==RULE_KW||(LA37_3>=ELSE && LA37_3<=ENDIF)||LA37_3==IA_KW) ) {
                    alt37=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            case ASSIGN_KW:
            case ADD_KW:
            case SUB_KW:
            case INVERT_KW:
                {
                alt37=3;
                }
                break;
            case ACTIVATE_KW:
            case DISABLE_KW:
                {
                alt37=4;
                }
                break;
            case VICTORY_KW:
                {
                alt37=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:162:3: siAlors
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_siAlors_in_consequ1108);
                    siAlors106=siAlors();

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors106.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:163:5: action
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_action_in_consequ1114);
                    action107=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action107.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:164:5: affectation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_consequ1120);
                    affectation108=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation108.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:165:5: activCommande
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_activCommande_in_consequ1126);
                    activCommande109=activCommande();

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande109.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:166:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT110=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1132); 
                    IDENT110_tree = (CommonTree)adaptor.create(IDENT110);
                    adaptor.addChild(root_0, IDENT110_tree);


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:167:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW111=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1138); 
                    VICTORY_KW111_tree = (CommonTree)adaptor.create(VICTORY_KW111);
                    adaptor.addChild(root_0, VICTORY_KW111_tree);


                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:168:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW112=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1144); 
                    DEFEAT_KW112_tree = (CommonTree)adaptor.create(DEFEAT_KW112);
                    adaptor.addChild(root_0, DEFEAT_KW112_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consequ"

    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW );
    public final hightParser.action_return action() throws RecognitionException {
        hightParser.action_return retval = new hightParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set115=null;
        Token ENDS_KW116=null;
        Token STARTS_KW117=null;
        Token PAUSE_KW118=null;
        Token MUTE_KW119=null;
        Token set120=null;
        Token PLAY_KW121=null;
        Token STOP_KW122=null;
        Token IDENT123=null;
        Token BLOCK_KW124=null;
        Token OF126=null;
        Token EFFACE_KW129=null;
        Token GENERATE_KW130=null;
        Token IDENT133=null;
        Token IN135=null;
        Token ON136=null;
        Token AT138=null;
        Token WAIT_KW140=null;
        Token THEN143=null;
        Token ENDWAIT145=null;
        Token SAVE_KW146=null;
        hightParser.accesClasse_return accesClasse113 = null;

        hightParser.actionObjet_return actionObjet114 = null;

        hightParser.transformation_return transformation125 = null;

        hightParser.accesClasse_return accesClasse127 = null;

        hightParser.coordinates_return coordinates128 = null;

        hightParser.accesLocal_return accesLocal131 = null;

        hightParser.operation_return operation132 = null;

        hightParser.accesGlobal_return accesGlobal134 = null;

        hightParser.accesLocal_return accesLocal137 = null;

        hightParser.coordinates_return coordinates139 = null;

        hightParser.operation_return operation141 = null;

        hightParser.timeUnit_return timeUnit142 = null;

        hightParser.consequences_return consequences144 = null;


        CommonTree set115_tree=null;
        CommonTree ENDS_KW116_tree=null;
        CommonTree STARTS_KW117_tree=null;
        CommonTree PAUSE_KW118_tree=null;
        CommonTree MUTE_KW119_tree=null;
        CommonTree set120_tree=null;
        CommonTree PLAY_KW121_tree=null;
        CommonTree STOP_KW122_tree=null;
        CommonTree IDENT123_tree=null;
        CommonTree BLOCK_KW124_tree=null;
        CommonTree OF126_tree=null;
        CommonTree EFFACE_KW129_tree=null;
        CommonTree GENERATE_KW130_tree=null;
        CommonTree IDENT133_tree=null;
        CommonTree IN135_tree=null;
        CommonTree ON136_tree=null;
        CommonTree AT138_tree=null;
        CommonTree WAIT_KW140_tree=null;
        CommonTree THEN143_tree=null;
        CommonTree ENDWAIT145_tree=null;
        CommonTree SAVE_KW146_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:8: ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW )
            int alt45=7;
            switch ( input.LA(1) ) {
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
                alt45=1;
                }
                break;
            case IDENT:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==PAUSE_KW||LA45_2==STOP_KW||LA45_2==DIES_KW||LA45_2==EQUIP||(LA45_2>=JUMP && LA45_2<=MOVE)||(LA45_2>=TURN && LA45_2<=BRAKE)) ) {
                    alt45=1;
                }
                else if ( ((LA45_2>=ENDS_KW && LA45_2<=STARTS_KW)) ) {
                    alt45=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt45=2;
                }
                break;
            case PAUSE_KW:
            case MUTE_KW:
            case PLAY_KW:
            case STOP_KW:
                {
                alt45=3;
                }
                break;
            case BLOCK_KW:
                {
                alt45=4;
                }
                break;
            case EFFACE_KW:
            case GENERATE_KW:
                {
                alt45=5;
                }
                break;
            case WAIT_KW:
                {
                alt45=6;
                }
                break;
            case SAVE_KW:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:172:2: accesClasse actionObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_action1156);
                    accesClasse113=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse113.getTree());
                    pushFollow(FOLLOW_actionObjet_in_action1158);
                    actionObjet114=actionObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet114.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:4: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set115=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set115));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:19: ( ENDS_KW | STARTS_KW )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ENDS_KW) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==STARTS_KW) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:20: ENDS_KW
                            {
                            ENDS_KW116=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1172); 
                            ENDS_KW116_tree = (CommonTree)adaptor.create(ENDS_KW116);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW116_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:30: STARTS_KW
                            {
                            STARTS_KW117=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1176); 
                            STARTS_KW117_tree = (CommonTree)adaptor.create(STARTS_KW117);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW117_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:174:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:174:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW )
                    int alt39=4;
                    switch ( input.LA(1) ) {
                    case PAUSE_KW:
                        {
                        alt39=1;
                        }
                        break;
                    case MUTE_KW:
                        {
                        alt39=2;
                        }
                        break;
                    case PLAY_KW:
                        {
                        alt39=3;
                        }
                        break;
                    case STOP_KW:
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
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:174:5: PAUSE_KW
                            {
                            PAUSE_KW118=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1184); 
                            PAUSE_KW118_tree = (CommonTree)adaptor.create(PAUSE_KW118);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW118_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:174:17: MUTE_KW ( ON | OFF )
                            {
                            MUTE_KW119=(Token)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1189); 
                            MUTE_KW119_tree = (CommonTree)adaptor.create(MUTE_KW119);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTE_KW119_tree, root_0);

                            set120=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set120));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:174:39: PLAY_KW
                            {
                            PLAY_KW121=(Token)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1202); 
                            PLAY_KW121_tree = (CommonTree)adaptor.create(PLAY_KW121);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAY_KW121_tree, root_0);


                            }
                            break;
                        case 4 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:174:50: STOP_KW
                            {
                            STOP_KW122=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_action1207); 
                            STOP_KW122_tree = (CommonTree)adaptor.create(STOP_KW122);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOP_KW122_tree, root_0);


                            }
                            break;

                    }

                    IDENT123=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1212); 
                    IDENT123_tree = (CommonTree)adaptor.create(IDENT123);
                    adaptor.addChild(root_0, IDENT123_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:175:4: BLOCK_KW transformation OF accesClasse coordinates
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLOCK_KW124=(Token)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1217); 
                    BLOCK_KW124_tree = (CommonTree)adaptor.create(BLOCK_KW124);
                    root_0 = (CommonTree)adaptor.becomeRoot(BLOCK_KW124_tree, root_0);

                    pushFollow(FOLLOW_transformation_in_action1220);
                    transformation125=transformation();

                    state._fsp--;

                    adaptor.addChild(root_0, transformation125.getTree());
                    OF126=(Token)match(input,OF,FOLLOW_OF_in_action1222); 
                    pushFollow(FOLLOW_accesClasse_in_action1225);
                    accesClasse127=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse127.getTree());
                    pushFollow(FOLLOW_coordinates_in_action1227);
                    coordinates128=coordinates();

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates128.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:4: ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:4: ( EFFACE_KW | GENERATE_KW )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==EFFACE_KW) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==GENERATE_KW) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:5: EFFACE_KW
                            {
                            EFFACE_KW129=(Token)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1233); 
                            EFFACE_KW129_tree = (CommonTree)adaptor.create(EFFACE_KW129);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACE_KW129_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:18: GENERATE_KW
                            {
                            GENERATE_KW130=(Token)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1238); 
                            GENERATE_KW130_tree = (CommonTree)adaptor.create(GENERATE_KW130);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATE_KW130_tree, root_0);


                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:32: ( accesLocal | operation ( IDENT | accesGlobal ) )
                    int alt42=2;
                    switch ( input.LA(1) ) {
                    case IDENT:
                        {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==OF) ) {
                            alt42=2;
                        }
                        else if ( (LA42_1==EOF||LA42_1==FIN||LA42_1==VIRG||LA42_1==AT||LA42_1==IN||LA42_1==DEFINITION_KW||LA42_1==ON||LA42_1==ENDWAIT||LA42_1==COMMAND_KW||LA42_1==RULE_KW||(LA42_1>=ELSE && LA42_1<=ENDIF)||LA42_1==IA_KW) ) {
                            alt42=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLAYER:
                    case NUM:
                        {
                        alt42=1;
                        }
                        break;
                    case FLOAT:
                    case SCORE:
                    case TYPE:
                    case PG:
                    case RANDOM_KW:
                    case X:
                    case Y:
                    case Z:
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
                        alt42=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:33: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_action1243);
                            accesLocal131=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal131.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:46: operation ( IDENT | accesGlobal )
                            {
                            pushFollow(FOLLOW_operation_in_action1247);
                            operation132=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation132.getTree());
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:56: ( IDENT | accesGlobal )
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==IDENT) ) {
                                alt41=1;
                            }
                            else if ( (LA41_0==CAMERA||LA41_0==MEDIA||(LA41_0>=ALLY && LA41_0<=NEUTRAL)||LA41_0==PG||(LA41_0>=COUNTER && LA41_0<=TELEPORTER)) ) {
                                alt41=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 0, input);

                                throw nvae;
                            }
                            switch (alt41) {
                                case 1 :
                                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:57: IDENT
                                    {
                                    IDENT133=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1250); 
                                    IDENT133_tree = (CommonTree)adaptor.create(IDENT133);
                                    adaptor.addChild(root_0, IDENT133_tree);


                                    }
                                    break;
                                case 2 :
                                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:65: accesGlobal
                                    {
                                    pushFollow(FOLLOW_accesGlobal_in_action1254);
                                    accesGlobal134=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal134.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:79: ( ( IN | ON ) accesLocal | AT coordinates )?
                    int alt44=3;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==IN||LA44_0==ON) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==AT) ) {
                        alt44=2;
                    }
                    switch (alt44) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:80: ( IN | ON ) accesLocal
                            {
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:80: ( IN | ON )
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==IN) ) {
                                alt43=1;
                            }
                            else if ( (LA43_0==ON) ) {
                                alt43=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 43, 0, input);

                                throw nvae;
                            }
                            switch (alt43) {
                                case 1 :
                                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:81: IN
                                    {
                                    IN135=(Token)match(input,IN,FOLLOW_IN_in_action1260); 

                                    }
                                    break;
                                case 2 :
                                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:85: ON
                                    {
                                    ON136=(Token)match(input,ON,FOLLOW_ON_in_action1263); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_action1267);
                            accesLocal137=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal137.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:103: AT coordinates
                            {
                            AT138=(Token)match(input,AT,FOLLOW_AT_in_action1271); 
                            pushFollow(FOLLOW_coordinates_in_action1274);
                            coordinates139=coordinates();

                            state._fsp--;

                            adaptor.addChild(root_0, coordinates139.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:177:4: WAIT_KW operation timeUnit THEN consequences ENDWAIT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAIT_KW140=(Token)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1281); 
                    WAIT_KW140_tree = (CommonTree)adaptor.create(WAIT_KW140);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAIT_KW140_tree, root_0);

                    pushFollow(FOLLOW_operation_in_action1284);
                    operation141=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation141.getTree());
                    pushFollow(FOLLOW_timeUnit_in_action1286);
                    timeUnit142=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit142.getTree());
                    THEN143=(Token)match(input,THEN,FOLLOW_THEN_in_action1288); 
                    pushFollow(FOLLOW_consequences_in_action1291);
                    consequences144=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences144.getTree());
                    ENDWAIT145=(Token)match(input,ENDWAIT,FOLLOW_ENDWAIT_in_action1293); 

                    }
                    break;
                case 7 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:178:4: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAVE_KW146=(Token)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1299); 
                    SAVE_KW146_tree = (CommonTree)adaptor.create(SAVE_KW146);
                    adaptor.addChild(root_0, SAVE_KW146_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action"

    public static class actionObjet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionObjet"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:181:1: actionObjet : ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) );
    public final hightParser.actionObjet_return actionObjet() throws RecognitionException {
        hightParser.actionObjet_return retval = new hightParser.actionObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIES_KW147=null;
        Token DURING150=null;
        Token UNTIL153=null;
        Token EQUIP155=null;
        Token NEXT157=null;
        Token PREVIOUS158=null;
        hightParser.actionCommandePressee_return actionCommandePressee148 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue149 = null;

        hightParser.operation_return operation151 = null;

        hightParser.timeUnit_return timeUnit152 = null;

        hightParser.conditions_return conditions154 = null;

        hightParser.accesLocal_return accesLocal156 = null;


        CommonTree DIES_KW147_tree=null;
        CommonTree DURING150_tree=null;
        CommonTree UNTIL153_tree=null;
        CommonTree EQUIP155_tree=null;
        CommonTree NEXT157_tree=null;
        CommonTree PREVIOUS158_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:181:13: ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case DIES_KW:
                {
                alt48=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt48=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt48=3;
                }
                break;
            case EQUIP:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:182:3: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DIES_KW147=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1311); 
                    DIES_KW147_tree = (CommonTree)adaptor.create(DIES_KW147);
                    adaptor.addChild(root_0, DIES_KW147_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:183:5: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1317);
                    actionCommandePressee148=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee148.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:5: actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1323);
                    actionCommandeMaintenue149=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue149.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:29: ( DURING operation timeUnit | UNTIL conditions )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==DURING) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==UNTIL) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:30: DURING operation timeUnit
                            {
                            DURING150=(Token)match(input,DURING,FOLLOW_DURING_in_actionObjet1326); 
                            DURING150_tree = (CommonTree)adaptor.create(DURING150);
                            root_0 = (CommonTree)adaptor.becomeRoot(DURING150_tree, root_0);

                            pushFollow(FOLLOW_operation_in_actionObjet1329);
                            operation151=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation151.getTree());
                            pushFollow(FOLLOW_timeUnit_in_actionObjet1331);
                            timeUnit152=timeUnit();

                            state._fsp--;

                            adaptor.addChild(root_0, timeUnit152.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:59: UNTIL conditions
                            {
                            UNTIL153=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1335); 
                            UNTIL153_tree = (CommonTree)adaptor.create(UNTIL153);
                            root_0 = (CommonTree)adaptor.becomeRoot(UNTIL153_tree, root_0);

                            pushFollow(FOLLOW_conditions_in_actionObjet1338);
                            conditions154=conditions();

                            state._fsp--;

                            adaptor.addChild(root_0, conditions154.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:185:5: EQUIP ( accesLocal | NEXT | PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EQUIP155=(Token)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1345); 
                    EQUIP155_tree = (CommonTree)adaptor.create(EQUIP155);
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUIP155_tree, root_0);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:185:12: ( accesLocal | NEXT | PREVIOUS )
                    int alt47=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case PLAYER:
                    case NUM:
                        {
                        alt47=1;
                        }
                        break;
                    case NEXT:
                        {
                        alt47=2;
                        }
                        break;
                    case PREVIOUS:
                        {
                        alt47=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:185:13: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_actionObjet1349);
                            accesLocal156=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal156.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:185:26: NEXT
                            {
                            NEXT157=(Token)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1353); 
                            NEXT157_tree = (CommonTree)adaptor.create(NEXT157);
                            adaptor.addChild(root_0, NEXT157_tree);


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:185:33: PREVIOUS
                            {
                            PREVIOUS158=(Token)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1357); 
                            PREVIOUS158_tree = (CommonTree)adaptor.create(PREVIOUS158);
                            adaptor.addChild(root_0, PREVIOUS158_tree);


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionObjet"

    public static class transformation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "transformation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:188:1: transformation : ( TRANSLATION | ROTATION | SCALE );
    public final hightParser.transformation_return transformation() throws RecognitionException {
        hightParser.transformation_return retval = new hightParser.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set159=null;

        CommonTree set159_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:188:16: ( TRANSLATION | ROTATION | SCALE )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set159=(Token)input.LT(1);
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set159));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "transformation"

    public static class coordinates_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "coordinates"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:194:1: coordinates : operation operation operation -> ^( COORDINATE_KW operation operation operation ) ;
    public final hightParser.coordinates_return coordinates() throws RecognitionException {
        hightParser.coordinates_return retval = new hightParser.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hightParser.operation_return operation160 = null;

        hightParser.operation_return operation161 = null;

        hightParser.operation_return operation162 = null;


        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:194:13: ( operation operation operation -> ^( COORDINATE_KW operation operation operation ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:195:2: operation operation operation
            {
            pushFollow(FOLLOW_operation_in_coordinates1397);
            operation160=operation();

            state._fsp--;

            stream_operation.add(operation160.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1399);
            operation161=operation();

            state._fsp--;

            stream_operation.add(operation161.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1401);
            operation162=operation();

            state._fsp--;

            stream_operation.add(operation162.getTree());


            // AST REWRITE
            // elements: operation, operation, operation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 196:4: -> ^( COORDINATE_KW operation operation operation )
            {
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:196:7: ^( COORDINATE_KW operation operation operation )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COORDINATE_KW, "COORDINATE_KW"), root_1);

                adaptor.addChild(root_1, stream_operation.nextTree());
                adaptor.addChild(root_1, stream_operation.nextTree());
                adaptor.addChild(root_1, stream_operation.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "coordinates"

    public static class commande_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commande"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:201:1: commande : COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )* ;
    public final hightParser.commande_return commande() throws RecognitionException {
        hightParser.commande_return retval = new hightParser.commande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMAND_KW163=null;
        Token IDENT164=null;
        Token IS165=null;
        Token VIRG167=null;
        hightParser.actionCommande_return actionCommande166 = null;

        hightParser.actionCommande_return actionCommande168 = null;


        CommonTree COMMAND_KW163_tree=null;
        CommonTree IDENT164_tree=null;
        CommonTree IS165_tree=null;
        CommonTree VIRG167_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:201:10: ( COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )* )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:202:2: COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )*
            {
            root_0 = (CommonTree)adaptor.nil();

            COMMAND_KW163=(Token)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1430); 
            COMMAND_KW163_tree = (CommonTree)adaptor.create(COMMAND_KW163);
            root_0 = (CommonTree)adaptor.becomeRoot(COMMAND_KW163_tree, root_0);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:202:14: ( IDENT IS )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==IDENT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:202:15: IDENT IS
                    {
                    IDENT164=(Token)match(input,IDENT,FOLLOW_IDENT_in_commande1434); 
                    IDENT164_tree = (CommonTree)adaptor.create(IDENT164);
                    adaptor.addChild(root_0, IDENT164_tree);

                    IS165=(Token)match(input,IS,FOLLOW_IS_in_commande1436); 

                    }
                    break;

            }

            pushFollow(FOLLOW_actionCommande_in_commande1441);
            actionCommande166=actionCommande();

            state._fsp--;

            adaptor.addChild(root_0, actionCommande166.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:202:42: ( VIRG actionCommande )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==VIRG) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:202:43: VIRG actionCommande
            	    {
            	    VIRG167=(Token)match(input,VIRG,FOLLOW_VIRG_in_commande1444); 
            	    pushFollow(FOLLOW_actionCommande_in_commande1447);
            	    actionCommande168=actionCommande();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionCommande168.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commande"

    public static class actionCommande_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommande"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:205:1: actionCommande : ( MOUSE_KW souris | KEY_KW clavier ) FOR actionCommandeType ;
    public final hightParser.actionCommande_return actionCommande() throws RecognitionException {
        hightParser.actionCommande_return retval = new hightParser.actionCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOUSE_KW169=null;
        Token KEY_KW171=null;
        Token FOR173=null;
        hightParser.souris_return souris170 = null;

        hightParser.clavier_return clavier172 = null;

        hightParser.actionCommandeType_return actionCommandeType174 = null;


        CommonTree MOUSE_KW169_tree=null;
        CommonTree KEY_KW171_tree=null;
        CommonTree FOR173_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:205:16: ( ( MOUSE_KW souris | KEY_KW clavier ) FOR actionCommandeType )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:206:2: ( MOUSE_KW souris | KEY_KW clavier ) FOR actionCommandeType
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:206:2: ( MOUSE_KW souris | KEY_KW clavier )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==MOUSE_KW) ) {
                alt51=1;
            }
            else if ( (LA51_0==KEY_KW) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:206:3: MOUSE_KW souris
                    {
                    MOUSE_KW169=(Token)match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande1461); 
                    MOUSE_KW169_tree = (CommonTree)adaptor.create(MOUSE_KW169);
                    root_0 = (CommonTree)adaptor.becomeRoot(MOUSE_KW169_tree, root_0);

                    pushFollow(FOLLOW_souris_in_actionCommande1464);
                    souris170=souris();

                    state._fsp--;

                    adaptor.addChild(root_0, souris170.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:206:22: KEY_KW clavier
                    {
                    KEY_KW171=(Token)match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande1468); 
                    KEY_KW171_tree = (CommonTree)adaptor.create(KEY_KW171);
                    root_0 = (CommonTree)adaptor.becomeRoot(KEY_KW171_tree, root_0);

                    pushFollow(FOLLOW_clavier_in_actionCommande1471);
                    clavier172=clavier();

                    state._fsp--;

                    adaptor.addChild(root_0, clavier172.getTree());

                    }
                    break;

            }

            FOR173=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande1474); 
            pushFollow(FOLLOW_actionCommandeType_in_actionCommande1477);
            actionCommandeType174=actionCommandeType();

            state._fsp--;

            adaptor.addChild(root_0, actionCommandeType174.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionCommande"

    public static class actionCommandeType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommandeType"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:209:1: actionCommandeType : ( IDENT | actionCommandePressee | actionCommandeMaintenue );
    public final hightParser.actionCommandeType_return actionCommandeType() throws RecognitionException {
        hightParser.actionCommandeType_return retval = new hightParser.actionCommandeType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT175=null;
        hightParser.actionCommandePressee_return actionCommandePressee176 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue177 = null;


        CommonTree IDENT175_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:209:20: ( IDENT | actionCommandePressee | actionCommandeMaintenue )
            int alt52=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt52=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt52=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:210:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT175=(Token)match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1489); 
                    IDENT175_tree = (CommonTree)adaptor.create(IDENT175);
                    adaptor.addChild(root_0, IDENT175_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:210:10: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1493);
                    actionCommandePressee176=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee176.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:210:34: actionCommandeMaintenue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1497);
                    actionCommandeMaintenue177=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue177.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionCommandeType"

    public static class souris_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "souris"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:213:1: souris : ( UP | DOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final hightParser.souris_return souris() throws RecognitionException {
        hightParser.souris_return retval = new hightParser.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set178=null;

        CommonTree set178_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:213:8: ( UP | DOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set178=(Token)input.LT(1);
            if ( (input.LA(1)>=DOWN && input.LA(1)<=UP)||(input.LA(1)>=LEFT && input.LA(1)<=SCROLL_DOWN) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set178));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "souris"

    public static class clavier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clavier"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:217:1: clavier : ( LETTER | UP | DOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final hightParser.clavier_return clavier() throws RecognitionException {
        hightParser.clavier_return retval = new hightParser.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set179=null;

        CommonTree set179_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:217:9: ( LETTER | UP | DOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set179=(Token)input.LT(1);
            if ( (input.LA(1)>=DOWN && input.LA(1)<=UP)||(input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set179));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "clavier"

    public static class actionCommandePressee_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommandePressee"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:221:1: actionCommandePressee : ( JUMP operation | PAUSE_KW | STOP_KW );
    public final hightParser.actionCommandePressee_return actionCommandePressee() throws RecognitionException {
        hightParser.actionCommandePressee_return retval = new hightParser.actionCommandePressee_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token JUMP180=null;
        Token PAUSE_KW182=null;
        Token STOP_KW183=null;
        hightParser.operation_return operation181 = null;


        CommonTree JUMP180_tree=null;
        CommonTree PAUSE_KW182_tree=null;
        CommonTree STOP_KW183_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:221:23: ( JUMP operation | PAUSE_KW | STOP_KW )
            int alt53=3;
            switch ( input.LA(1) ) {
            case JUMP:
                {
                alt53=1;
                }
                break;
            case PAUSE_KW:
                {
                alt53=2;
                }
                break;
            case STOP_KW:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:222:3: JUMP operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    JUMP180=(Token)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1609); 
                    JUMP180_tree = (CommonTree)adaptor.create(JUMP180);
                    adaptor.addChild(root_0, JUMP180_tree);

                    pushFollow(FOLLOW_operation_in_actionCommandePressee1611);
                    operation181=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation181.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:223:5: PAUSE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PAUSE_KW182=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1617); 
                    PAUSE_KW182_tree = (CommonTree)adaptor.create(PAUSE_KW182);
                    adaptor.addChild(root_0, PAUSE_KW182_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:224:5: STOP_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STOP_KW183=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1623); 
                    STOP_KW183_tree = (CommonTree)adaptor.create(STOP_KW183);
                    adaptor.addChild(root_0, STOP_KW183_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionCommandePressee"

    public static class actionCommandeMaintenue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommandeMaintenue"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:227:1: actionCommandeMaintenue : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
    public final hightParser.actionCommandeMaintenue_return actionCommandeMaintenue() throws RecognitionException {
        hightParser.actionCommandeMaintenue_return retval = new hightParser.actionCommandeMaintenue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVE184=null;
        Token set185=null;
        Token TURN186=null;
        Token set187=null;
        Token ACCELERATE188=null;
        Token BRAKE189=null;

        CommonTree MOVE184_tree=null;
        CommonTree set185_tree=null;
        CommonTree TURN186_tree=null;
        CommonTree set187_tree=null;
        CommonTree ACCELERATE188_tree=null;
        CommonTree BRAKE189_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:227:25: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
            int alt54=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt54=1;
                }
                break;
            case TURN:
                {
                alt54=2;
                }
                break;
            case ACCELERATE:
                {
                alt54=3;
                }
                break;
            case BRAKE:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:228:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MOVE184=(Token)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1638); 
                    MOVE184_tree = (CommonTree)adaptor.create(MOVE184);
                    adaptor.addChild(root_0, MOVE184_tree);

                    set185=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=FORWARD && input.LA(1)<=BACKWARD) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set185));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:5: TURN ( LEFT | RIGHT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURN186=(Token)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1660); 
                    TURN186_tree = (CommonTree)adaptor.create(TURN186);
                    adaptor.addChild(root_0, TURN186_tree);

                    set187=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set187));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:230:5: ACCELERATE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACCELERATE188=(Token)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1674); 
                    ACCELERATE188_tree = (CommonTree)adaptor.create(ACCELERATE188);
                    adaptor.addChild(root_0, ACCELERATE188_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:231:5: BRAKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BRAKE189=(Token)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1680); 
                    BRAKE189_tree = (CommonTree)adaptor.create(BRAKE189);
                    adaptor.addChild(root_0, BRAKE189_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionCommandeMaintenue"

    public static class activCommande_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activCommande"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:234:1: activCommande : ( ACTIVATE_KW | DISABLE_KW ) ( COMMANDS | MOUSE_KW ( souris ( VIRG souris )* )? | KEY_KW clavier ( VIRG clavier )* | KEYBOARD ) ;
    public final hightParser.activCommande_return activCommande() throws RecognitionException {
        hightParser.activCommande_return retval = new hightParser.activCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ACTIVATE_KW190=null;
        Token DISABLE_KW191=null;
        Token COMMANDS192=null;
        Token MOUSE_KW193=null;
        Token VIRG195=null;
        Token KEY_KW197=null;
        Token VIRG199=null;
        Token KEYBOARD201=null;
        hightParser.souris_return souris194 = null;

        hightParser.souris_return souris196 = null;

        hightParser.clavier_return clavier198 = null;

        hightParser.clavier_return clavier200 = null;


        CommonTree ACTIVATE_KW190_tree=null;
        CommonTree DISABLE_KW191_tree=null;
        CommonTree COMMANDS192_tree=null;
        CommonTree MOUSE_KW193_tree=null;
        CommonTree VIRG195_tree=null;
        CommonTree KEY_KW197_tree=null;
        CommonTree VIRG199_tree=null;
        CommonTree KEYBOARD201_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:234:15: ( ( ACTIVATE_KW | DISABLE_KW ) ( COMMANDS | MOUSE_KW ( souris ( VIRG souris )* )? | KEY_KW clavier ( VIRG clavier )* | KEYBOARD ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:3: ( ACTIVATE_KW | DISABLE_KW ) ( COMMANDS | MOUSE_KW ( souris ( VIRG souris )* )? | KEY_KW clavier ( VIRG clavier )* | KEYBOARD )
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:3: ( ACTIVATE_KW | DISABLE_KW )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ACTIVATE_KW) ) {
                alt55=1;
            }
            else if ( (LA55_0==DISABLE_KW) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:4: ACTIVATE_KW
                    {
                    ACTIVATE_KW190=(Token)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1696); 
                    ACTIVATE_KW190_tree = (CommonTree)adaptor.create(ACTIVATE_KW190);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW190_tree, root_0);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:19: DISABLE_KW
                    {
                    DISABLE_KW191=(Token)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1701); 
                    DISABLE_KW191_tree = (CommonTree)adaptor.create(DISABLE_KW191);
                    root_0 = (CommonTree)adaptor.becomeRoot(DISABLE_KW191_tree, root_0);


                    }
                    break;

            }

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:32: ( COMMANDS | MOUSE_KW ( souris ( VIRG souris )* )? | KEY_KW clavier ( VIRG clavier )* | KEYBOARD )
            int alt59=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt59=1;
                }
                break;
            case MOUSE_KW:
                {
                alt59=2;
                }
                break;
            case KEY_KW:
                {
                alt59=3;
                }
                break;
            case KEYBOARD:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:33: COMMANDS
                    {
                    COMMANDS192=(Token)match(input,COMMANDS,FOLLOW_COMMANDS_in_activCommande1706); 
                    COMMANDS192_tree = (CommonTree)adaptor.create(COMMANDS192);
                    adaptor.addChild(root_0, COMMANDS192_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:44: MOUSE_KW ( souris ( VIRG souris )* )?
                    {
                    MOUSE_KW193=(Token)match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_activCommande1710); 
                    MOUSE_KW193_tree = (CommonTree)adaptor.create(MOUSE_KW193);
                    adaptor.addChild(root_0, MOUSE_KW193_tree);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:53: ( souris ( VIRG souris )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=DOWN && LA57_0<=UP)||(LA57_0>=LEFT && LA57_0<=SCROLL_DOWN)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:54: souris ( VIRG souris )*
                            {
                            pushFollow(FOLLOW_souris_in_activCommande1713);
                            souris194=souris();

                            state._fsp--;

                            adaptor.addChild(root_0, souris194.getTree());
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:61: ( VIRG souris )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==VIRG) ) {
                                    int LA56_1 = input.LA(2);

                                    if ( ((LA56_1>=DOWN && LA56_1<=UP)||(LA56_1>=LEFT && LA56_1<=SCROLL_DOWN)) ) {
                                        alt56=1;
                                    }


                                }


                                switch (alt56) {
                            	case 1 :
                            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:62: VIRG souris
                            	    {
                            	    VIRG195=(Token)match(input,VIRG,FOLLOW_VIRG_in_activCommande1716); 
                            	    pushFollow(FOLLOW_souris_in_activCommande1719);
                            	    souris196=souris();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, souris196.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:81: KEY_KW clavier ( VIRG clavier )*
                    {
                    KEY_KW197=(Token)match(input,KEY_KW,FOLLOW_KEY_KW_in_activCommande1727); 
                    KEY_KW197_tree = (CommonTree)adaptor.create(KEY_KW197);
                    adaptor.addChild(root_0, KEY_KW197_tree);

                    pushFollow(FOLLOW_clavier_in_activCommande1729);
                    clavier198=clavier();

                    state._fsp--;

                    adaptor.addChild(root_0, clavier198.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:96: ( VIRG clavier )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==VIRG) ) {
                            int LA58_1 = input.LA(2);

                            if ( ((LA58_1>=DOWN && LA58_1<=UP)||(LA58_1>=LEFT && LA58_1<=RIGHT)||(LA58_1>=LETTER && LA58_1<=ENTER)) ) {
                                alt58=1;
                            }


                        }


                        switch (alt58) {
                    	case 1 :
                    	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:97: VIRG clavier
                    	    {
                    	    VIRG199=(Token)match(input,VIRG,FOLLOW_VIRG_in_activCommande1732); 
                    	    pushFollow(FOLLOW_clavier_in_activCommande1735);
                    	    clavier200=clavier();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, clavier200.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:115: KEYBOARD
                    {
                    KEYBOARD201=(Token)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_activCommande1741); 
                    KEYBOARD201_tree = (CommonTree)adaptor.create(KEYBOARD201);
                    adaptor.addChild(root_0, KEYBOARD201_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "activCommande"

    public static class reglesJeu_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reglesJeu"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:238:1: reglesJeu : RULE_KW ( IDENT IS )? declencheur THEN consequences ;
    public final hightParser.reglesJeu_return reglesJeu() throws RecognitionException {
        hightParser.reglesJeu_return retval = new hightParser.reglesJeu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RULE_KW202=null;
        Token IDENT203=null;
        Token IS204=null;
        Token THEN206=null;
        hightParser.declencheur_return declencheur205 = null;

        hightParser.consequences_return consequences207 = null;


        CommonTree RULE_KW202_tree=null;
        CommonTree IDENT203_tree=null;
        CommonTree IS204_tree=null;
        CommonTree THEN206_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:238:11: ( RULE_KW ( IDENT IS )? declencheur THEN consequences )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:239:3: RULE_KW ( IDENT IS )? declencheur THEN consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            RULE_KW202=(Token)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1756); 
            RULE_KW202_tree = (CommonTree)adaptor.create(RULE_KW202);
            root_0 = (CommonTree)adaptor.becomeRoot(RULE_KW202_tree, root_0);

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:239:12: ( IDENT IS )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==IDENT) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==IS) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:239:13: IDENT IS
                    {
                    IDENT203=(Token)match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1760); 
                    IDENT203_tree = (CommonTree)adaptor.create(IDENT203);
                    adaptor.addChild(root_0, IDENT203_tree);

                    IS204=(Token)match(input,IS,FOLLOW_IS_in_reglesJeu1762); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu1768);
            declencheur205=declencheur();

            state._fsp--;

            adaptor.addChild(root_0, declencheur205.getTree());
            THEN206=(Token)match(input,THEN,FOLLOW_THEN_in_reglesJeu1770); 
            pushFollow(FOLLOW_consequences_in_reglesJeu1773);
            consequences207=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences207.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reglesJeu"

    public static class declencheur_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declencheur"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:242:1: declencheur : ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW );
    public final hightParser.declencheur_return declencheur() throws RecognitionException {
        hightParser.declencheur_return retval = new hightParser.declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVES_KW209=null;
        Token DIES_KW210=null;
        Token set213=null;
        Token ENDS_KW214=null;
        Token STARTS_KW215=null;
        Token BECOMES217=null;
        Token IDENT219=null;
        Token BECOMES220=null;
        Token VICTORY_KW222=null;
        Token DEFEAT_KW223=null;
        hightParser.accesClasse_return accesClasse208 = null;

        hightParser.declencheurTK_return declencheurTK211 = null;

        hightParser.declencheurKT_return declencheurKT212 = null;

        hightParser.variable_return variable216 = null;

        hightParser.varOuNB_return varOuNB218 = null;

        hightParser.playerOuInteraction_return playerOuInteraction221 = null;


        CommonTree MOVES_KW209_tree=null;
        CommonTree DIES_KW210_tree=null;
        CommonTree set213_tree=null;
        CommonTree ENDS_KW214_tree=null;
        CommonTree STARTS_KW215_tree=null;
        CommonTree BECOMES217_tree=null;
        CommonTree IDENT219_tree=null;
        CommonTree BECOMES220_tree=null;
        CommonTree VICTORY_KW222_tree=null;
        CommonTree DEFEAT_KW223_tree=null;
        RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_varOuNB=new RewriteRuleSubtreeStream(adaptor,"rule varOuNB");
        RewriteRuleSubtreeStream stream_playerOuInteraction=new RewriteRuleSubtreeStream(adaptor,"rule playerOuInteraction");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:242:13: ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW )
            int alt63=6;
            switch ( input.LA(1) ) {
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
                alt63=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case OF:
                    {
                    alt63=3;
                    }
                    break;
                case BECOMES:
                    {
                    alt63=4;
                    }
                    break;
                case DIES_KW:
                case MOVES_KW:
                case TOUCHES_KW:
                case KILLS_KW:
                case KILLED_KW:
                case TOUCHED_KW:
                    {
                    alt63=1;
                    }
                    break;
                case ENDS_KW:
                case STARTS_KW:
                    {
                    alt63=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 2, input);

                    throw nvae;
                }

                }
                break;
            case GAME:
                {
                alt63=2;
                }
                break;
            case SCORE:
            case TYPE:
            case X:
            case Y:
            case Z:
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
                alt63=3;
                }
                break;
            case VICTORY_KW:
                {
                alt63=5;
                }
                break;
            case DEFEAT_KW:
                {
                alt63=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:243:3: accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_declencheur1787);
                    accesClasse208=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse208.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:243:15: ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    int alt61=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt61=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt61=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                        {
                        alt61=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
                        {
                        alt61=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:243:16: MOVES_KW
                            {
                            MOVES_KW209=(Token)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1790); 
                            MOVES_KW209_tree = (CommonTree)adaptor.create(MOVES_KW209);
                            adaptor.addChild(root_0, MOVES_KW209_tree);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:243:27: DIES_KW
                            {
                            DIES_KW210=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1794); 
                            DIES_KW210_tree = (CommonTree)adaptor.create(DIES_KW210);
                            adaptor.addChild(root_0, DIES_KW210_tree);


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:243:37: declencheurTK
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1798);
                            declencheurTK211=declencheurTK();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK211.getTree());

                            }
                            break;
                        case 4 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:243:53: declencheurKT
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1802);
                            declencheurKT212=declencheurKT();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT212.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:244:5: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set213=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set213));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:244:20: ( ENDS_KW | STARTS_KW )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==ENDS_KW) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==STARTS_KW) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:244:21: ENDS_KW
                            {
                            ENDS_KW214=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1819); 
                            ENDS_KW214_tree = (CommonTree)adaptor.create(ENDS_KW214);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW214_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:244:31: STARTS_KW
                            {
                            STARTS_KW215=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1823); 
                            STARTS_KW215_tree = (CommonTree)adaptor.create(STARTS_KW215);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW215_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:245:5: variable BECOMES varOuNB
                    {
                    pushFollow(FOLLOW_variable_in_declencheur1841);
                    variable216=variable();

                    state._fsp--;

                    stream_variable.add(variable216.getTree());
                    BECOMES217=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1843);  
                    stream_BECOMES.add(BECOMES217);

                    pushFollow(FOLLOW_varOuNB_in_declencheur1845);
                    varOuNB218=varOuNB();

                    state._fsp--;

                    stream_varOuNB.add(varOuNB218.getTree());


                    // AST REWRITE
                    // elements: variable, varOuNB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 246:5: -> ^( BECOMES_VAR_KW variable varOuNB )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:246:8: ^( BECOMES_VAR_KW variable varOuNB )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BECOMES_VAR_KW, "BECOMES_VAR_KW"), root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());
                        adaptor.addChild(root_1, stream_varOuNB.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:247:5: IDENT BECOMES playerOuInteraction
                    {
                    IDENT219=(Token)match(input,IDENT,FOLLOW_IDENT_in_declencheur1865);  
                    stream_IDENT.add(IDENT219);

                    BECOMES220=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1867);  
                    stream_BECOMES.add(BECOMES220);

                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1869);
                    playerOuInteraction221=playerOuInteraction();

                    state._fsp--;

                    stream_playerOuInteraction.add(playerOuInteraction221.getTree());


                    // AST REWRITE
                    // elements: playerOuInteraction, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 248:5: -> ^( BECOMES_ID_KW IDENT playerOuInteraction )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:248:8: ^( BECOMES_ID_KW IDENT playerOuInteraction )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BECOMES_ID_KW, "BECOMES_ID_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_playerOuInteraction.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:249:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW222=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur1889); 
                    VICTORY_KW222_tree = (CommonTree)adaptor.create(VICTORY_KW222);
                    adaptor.addChild(root_0, VICTORY_KW222_tree);


                    }
                    break;
                case 6 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:250:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW223=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur1895); 
                    DEFEAT_KW223_tree = (CommonTree)adaptor.create(DEFEAT_KW223);
                    adaptor.addChild(root_0, DEFEAT_KW223_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declencheur"

    public static class varOuNB_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varOuNB"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:1: varOuNB : ( variable | FLOAT );
    public final hightParser.varOuNB_return varOuNB() throws RecognitionException {
        hightParser.varOuNB_return retval = new hightParser.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FLOAT225=null;
        hightParser.variable_return variable224 = null;


        CommonTree FLOAT225_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:9: ( variable | FLOAT )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=SCORE && LA64_0<=IDENT)||(LA64_0>=X && LA64_0<=VALUE)||(LA64_0>=MASS && LA64_0<=MOVE_WITH_CAMERA)) ) {
                alt64=1;
            }
            else if ( (LA64_0==FLOAT) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:11: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_varOuNB1906);
                    variable224=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable224.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:22: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT225=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB1910); 
                    FLOAT225_tree = (CommonTree)adaptor.create(FLOAT225);
                    adaptor.addChild(root_0, FLOAT225_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varOuNB"

    public static class playerOuInteraction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "playerOuInteraction"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:255:1: playerOuInteraction : ( PLAYER | interaction ) ;
    public final hightParser.playerOuInteraction_return playerOuInteraction() throws RecognitionException {
        hightParser.playerOuInteraction_return retval = new hightParser.playerOuInteraction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER226=null;
        hightParser.interaction_return interaction227 = null;


        CommonTree PLAYER226_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:2: ( ( PLAYER | interaction ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:4: ( PLAYER | interaction )
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:4: ( PLAYER | interaction )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==PLAYER) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=ALLY && LA65_0<=NEUTRAL)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:5: PLAYER
                    {
                    PLAYER226=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction1920); 
                    PLAYER226_tree = (CommonTree)adaptor.create(PLAYER226);
                    adaptor.addChild(root_0, PLAYER226_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction1923);
                    interaction227=interaction();

                    state._fsp--;

                    adaptor.addChild(root_0, interaction227.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "playerOuInteraction"

    public static class declencheurTK_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declencheurTK"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:258:1: declencheurTK : ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) ;
    public final hightParser.declencheurTK_return declencheurTK() throws RecognitionException {
        hightParser.declencheurTK_return retval = new hightParser.declencheurTK_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOUCHES_KW228=null;
        Token KILLS_KW229=null;
        Token OTHER230=null;
        hightParser.accesGlobal_return accesGlobal231 = null;

        hightParser.accesLocal_return accesLocal232 = null;


        CommonTree TOUCHES_KW228_tree=null;
        CommonTree KILLS_KW229_tree=null;
        CommonTree OTHER230_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:2: ( ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:4: ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal )
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:4: ( TOUCHES_KW | KILLS_KW )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==TOUCHES_KW) ) {
                alt66=1;
            }
            else if ( (LA66_0==KILLS_KW) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:5: TOUCHES_KW
                    {
                    TOUCHES_KW228=(Token)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK1935); 
                    TOUCHES_KW228_tree = (CommonTree)adaptor.create(TOUCHES_KW228);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW228_tree, root_0);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:19: KILLS_KW
                    {
                    KILLS_KW229=(Token)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK1940); 
                    KILLS_KW229_tree = (CommonTree)adaptor.create(KILLS_KW229);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLS_KW229_tree, root_0);


                    }
                    break;

            }

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:30: ( ( OTHER )? accesGlobal | accesLocal )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==CAMERA||LA68_0==MEDIA||(LA68_0>=ALLY && LA68_0<=NEUTRAL)||LA68_0==OTHER||LA68_0==PG||(LA68_0>=COUNTER && LA68_0<=TELEPORTER)) ) {
                alt68=1;
            }
            else if ( (LA68_0==IDENT||LA68_0==PLAYER||LA68_0==NUM) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:31: ( OTHER )? accesGlobal
                    {
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:31: ( OTHER )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==OTHER) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:32: OTHER
                            {
                            OTHER230=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurTK1946); 
                            OTHER230_tree = (CommonTree)adaptor.create(OTHER230);
                            adaptor.addChild(root_0, OTHER230_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesGlobal_in_declencheurTK1950);
                    accesGlobal231=accesGlobal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal231.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:54: accesLocal
                    {
                    pushFollow(FOLLOW_accesLocal_in_declencheurTK1954);
                    accesLocal232=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal232.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declencheurTK"

    public static class declencheurKT_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declencheurKT"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:261:1: declencheurKT : ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? ;
    public final hightParser.declencheurKT_return declencheurKT() throws RecognitionException {
        hightParser.declencheurKT_return retval = new hightParser.declencheurKT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KILLED_KW233=null;
        Token TOUCHED_KW234=null;
        Token BY235=null;
        Token OTHER236=null;
        hightParser.accesGlobal_return accesGlobal237 = null;

        hightParser.accesLocal_return accesLocal238 = null;


        CommonTree KILLED_KW233_tree=null;
        CommonTree TOUCHED_KW234_tree=null;
        CommonTree BY235_tree=null;
        CommonTree OTHER236_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:2: ( ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:4: ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:4: ( KILLED_KW | TOUCHED_KW )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==KILLED_KW) ) {
                alt69=1;
            }
            else if ( (LA69_0==TOUCHED_KW) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:5: KILLED_KW
                    {
                    KILLED_KW233=(Token)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT1966); 
                    KILLED_KW233_tree = (CommonTree)adaptor.create(KILLED_KW233);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLED_KW233_tree, root_0);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:18: TOUCHED_KW
                    {
                    TOUCHED_KW234=(Token)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT1971); 
                    TOUCHED_KW234_tree = (CommonTree)adaptor.create(TOUCHED_KW234);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW234_tree, root_0);


                    }
                    break;

            }

            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:31: ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==BY) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:32: BY ( ( OTHER )? accesGlobal | accesLocal )
                    {
                    BY235=(Token)match(input,BY,FOLLOW_BY_in_declencheurKT1976); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:36: ( ( OTHER )? accesGlobal | accesLocal )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==CAMERA||LA71_0==MEDIA||(LA71_0>=ALLY && LA71_0<=NEUTRAL)||LA71_0==OTHER||LA71_0==PG||(LA71_0>=COUNTER && LA71_0<=TELEPORTER)) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==IDENT||LA71_0==PLAYER||LA71_0==NUM) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:37: ( OTHER )? accesGlobal
                            {
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:37: ( OTHER )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==OTHER) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:38: OTHER
                                    {
                                    OTHER236=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurKT1981); 
                                    OTHER236_tree = (CommonTree)adaptor.create(OTHER236);
                                    adaptor.addChild(root_0, OTHER236_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesGlobal_in_declencheurKT1985);
                            accesGlobal237=accesGlobal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesGlobal237.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:262:60: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_declencheurKT1989);
                            accesLocal238=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal238.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declencheurKT"

    public static class siAlors_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "siAlors"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:1: siAlors : IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF ;
    public final hightParser.siAlors_return siAlors() throws RecognitionException {
        hightParser.siAlors_return retval = new hightParser.siAlors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF_KW239=null;
        Token THEN241=null;
        Token ELSE243=null;
        Token ENDIF245=null;
        hightParser.conditions_return conditions240 = null;

        hightParser.consequences_return consequences242 = null;

        hightParser.consequences_return consequences244 = null;


        CommonTree IF_KW239_tree=null;
        CommonTree THEN241_tree=null;
        CommonTree ELSE243_tree=null;
        CommonTree ENDIF245_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:9: ( IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:266:3: IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF_KW239=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2006); 
            IF_KW239_tree = (CommonTree)adaptor.create(IF_KW239);
            root_0 = (CommonTree)adaptor.becomeRoot(IF_KW239_tree, root_0);

            pushFollow(FOLLOW_conditions_in_siAlors2009);
            conditions240=conditions();

            state._fsp--;

            adaptor.addChild(root_0, conditions240.getTree());
            THEN241=(Token)match(input,THEN,FOLLOW_THEN_in_siAlors2011); 
            pushFollow(FOLLOW_consequences_in_siAlors2014);
            consequences242=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences242.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:266:40: ( ELSE consequences )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ELSE) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:266:41: ELSE consequences
                    {
                    ELSE243=(Token)match(input,ELSE,FOLLOW_ELSE_in_siAlors2017); 
                    pushFollow(FOLLOW_consequences_in_siAlors2020);
                    consequences244=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences244.getTree());

                    }
                    break;

            }

            ENDIF245=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_siAlors2024); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "siAlors"

    public static class conditions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditions"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:1: conditions : ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) ;
    public final hightParser.conditions_return conditions() throws RecognitionException {
        hightParser.conditions_return retval = new hightParser.conditions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT246=null;
        hightParser.conditionOu_return conditionOu247 = null;


        CommonTree NOT246_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_conditionOu=new RewriteRuleSubtreeStream(adaptor,"rule conditionOu");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:12: ( ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:270:3: ( NOT )? conditionOu
            {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:270:3: ( NOT )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==NOT) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:270:4: NOT
                    {
                    NOT246=(Token)match(input,NOT,FOLLOW_NOT_in_conditions2039);  
                    stream_NOT.add(NOT246);


                    }
                    break;

            }

            pushFollow(FOLLOW_conditionOu_in_conditions2043);
            conditionOu247=conditionOu();

            state._fsp--;

            stream_conditionOu.add(conditionOu247.getTree());


            // AST REWRITE
            // elements: NOT, conditionOu
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 271:3: -> ^( CONDITION_KW ( NOT )? conditionOu )
            {
                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:271:6: ^( CONDITION_KW ( NOT )? conditionOu )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_KW, "CONDITION_KW"), root_1);

                // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:271:21: ( NOT )?
                if ( stream_NOT.hasNext() ) {
                    adaptor.addChild(root_1, stream_NOT.nextNode());

                }
                stream_NOT.reset();
                adaptor.addChild(root_1, stream_conditionOu.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditions"

    public static class conditionOu_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionOu"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:274:1: conditionOu : conditionEt ( OR ( NOT )? conditionOu )? ;
    public final hightParser.conditionOu_return conditionOu() throws RecognitionException {
        hightParser.conditionOu_return retval = new hightParser.conditionOu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR249=null;
        Token NOT250=null;
        hightParser.conditionEt_return conditionEt248 = null;

        hightParser.conditionOu_return conditionOu251 = null;


        CommonTree OR249_tree=null;
        CommonTree NOT250_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:274:13: ( conditionEt ( OR ( NOT )? conditionOu )? )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:3: conditionEt ( OR ( NOT )? conditionOu )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionEt_in_conditionOu2069);
            conditionEt248=conditionEt();

            state._fsp--;

            adaptor.addChild(root_0, conditionEt248.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:15: ( OR ( NOT )? conditionOu )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==OR) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:16: OR ( NOT )? conditionOu
                    {
                    OR249=(Token)match(input,OR,FOLLOW_OR_in_conditionOu2072); 
                    OR249_tree = (CommonTree)adaptor.create(OR249);
                    root_0 = (CommonTree)adaptor.becomeRoot(OR249_tree, root_0);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:20: ( NOT )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==NOT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:21: NOT
                            {
                            NOT250=(Token)match(input,NOT,FOLLOW_NOT_in_conditionOu2076); 
                            NOT250_tree = (CommonTree)adaptor.create(NOT250);
                            adaptor.addChild(root_0, NOT250_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditionOu_in_conditionOu2080);
                    conditionOu251=conditionOu();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionOu251.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionOu"

    public static class conditionEt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionEt"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:1: conditionEt : cond ( AND ( NOT )? conditionEt )? ;
    public final hightParser.conditionEt_return conditionEt() throws RecognitionException {
        hightParser.conditionEt_return retval = new hightParser.conditionEt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND253=null;
        Token NOT254=null;
        hightParser.cond_return cond252 = null;

        hightParser.conditionEt_return conditionEt255 = null;


        CommonTree AND253_tree=null;
        CommonTree NOT254_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:13: ( cond ( AND ( NOT )? conditionEt )? )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:3: cond ( AND ( NOT )? conditionEt )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cond_in_conditionEt2096);
            cond252=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond252.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:8: ( AND ( NOT )? conditionEt )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==AND) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:9: AND ( NOT )? conditionEt
                    {
                    AND253=(Token)match(input,AND,FOLLOW_AND_in_conditionEt2099); 
                    AND253_tree = (CommonTree)adaptor.create(AND253);
                    root_0 = (CommonTree)adaptor.becomeRoot(AND253_tree, root_0);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:14: ( NOT )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NOT) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:15: NOT
                            {
                            NOT254=(Token)match(input,NOT,FOLLOW_NOT_in_conditionEt2103); 
                            NOT254_tree = (CommonTree)adaptor.create(NOT254);
                            adaptor.addChild(root_0, NOT254_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditionEt_in_conditionEt2107);
                    conditionEt255=conditionEt();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionEt255.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionEt"

    public static class cond_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cond"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:282:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD );
    public final hightParser.cond_return cond() throws RecognitionException {
        hightParser.cond_return retval = new hightParser.cond_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMP257=null;
        Token EQUALS259=null;
        Token INF260=null;
        Token SUP261=null;
        Token INFEG262=null;
        Token SUPED263=null;
        Token DIFF264=null;
        Token PG266=null;
        Token PD268=null;
        hightParser.etat_return etat256 = null;

        hightParser.operation_return operation258 = null;

        hightParser.operation_return operation265 = null;

        hightParser.conditions_return conditions267 = null;


        CommonTree COMP257_tree=null;
        CommonTree EQUALS259_tree=null;
        CommonTree INF260_tree=null;
        CommonTree SUP261_tree=null;
        CommonTree INFEG262_tree=null;
        CommonTree SUPED263_tree=null;
        CommonTree DIFF264_tree=null;
        CommonTree PG266_tree=null;
        CommonTree PD268_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:282:6: ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:3: etat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_etat_in_cond2123);
                    etat256=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, etat256.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:5: COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMP257=(Token)match(input,COMP,FOLLOW_COMP_in_cond2129); 
                    pushFollow(FOLLOW_operation_in_cond2132);
                    operation258=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation258.getTree());
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:21: ( EQUALS | INF | SUP | INFEG | SUPED | DIFF )
                    int alt79=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt79=1;
                        }
                        break;
                    case INF:
                        {
                        alt79=2;
                        }
                        break;
                    case SUP:
                        {
                        alt79=3;
                        }
                        break;
                    case INFEG:
                        {
                        alt79=4;
                        }
                        break;
                    case SUPED:
                        {
                        alt79=5;
                        }
                        break;
                    case DIFF:
                        {
                        alt79=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }

                    switch (alt79) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:22: EQUALS
                            {
                            EQUALS259=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond2135); 
                            EQUALS259_tree = (CommonTree)adaptor.create(EQUALS259);
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALS259_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:32: INF
                            {
                            INF260=(Token)match(input,INF,FOLLOW_INF_in_cond2140); 
                            INF260_tree = (CommonTree)adaptor.create(INF260);
                            root_0 = (CommonTree)adaptor.becomeRoot(INF260_tree, root_0);


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:39: SUP
                            {
                            SUP261=(Token)match(input,SUP,FOLLOW_SUP_in_cond2145); 
                            SUP261_tree = (CommonTree)adaptor.create(SUP261);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUP261_tree, root_0);


                            }
                            break;
                        case 4 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:46: INFEG
                            {
                            INFEG262=(Token)match(input,INFEG,FOLLOW_INFEG_in_cond2150); 
                            INFEG262_tree = (CommonTree)adaptor.create(INFEG262);
                            root_0 = (CommonTree)adaptor.becomeRoot(INFEG262_tree, root_0);


                            }
                            break;
                        case 5 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:55: SUPED
                            {
                            SUPED263=(Token)match(input,SUPED,FOLLOW_SUPED_in_cond2155); 
                            SUPED263_tree = (CommonTree)adaptor.create(SUPED263);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUPED263_tree, root_0);


                            }
                            break;
                        case 6 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:64: DIFF
                            {
                            DIFF264=(Token)match(input,DIFF,FOLLOW_DIFF_in_cond2160); 
                            DIFF264_tree = (CommonTree)adaptor.create(DIFF264);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIFF264_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_cond2164);
                    operation265=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation265.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:285:5: PG conditions PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG266=(Token)match(input,PG,FOLLOW_PG_in_cond2181); 
                    PG266_tree = (CommonTree)adaptor.create(PG266);
                    adaptor.addChild(root_0, PG266_tree);

                    pushFollow(FOLLOW_conditions_in_cond2183);
                    conditions267=conditions();

                    state._fsp--;

                    adaptor.addChild(root_0, conditions267.getTree());
                    PD268=(Token)match(input,PD,FOLLOW_PD_in_cond2185); 
                    PD268_tree = (CommonTree)adaptor.create(PD268);
                    adaptor.addChild(root_0, PD268_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cond"

    public static class etat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "etat"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:288:1: etat : ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW );
    public final hightParser.etat_return etat() throws RecognitionException {
        hightParser.etat_return retval = new hightParser.etat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS270=null;
        Token NOT271=null;
        Token DEAD_KW272=null;
        Token ALIVE_KW273=null;
        Token EFFACED_KW274=null;
        Token GENERATED_KW275=null;
        Token TOUCHING_KW276=null;
        Token OTHER277=null;
        Token MOVING_KW280=null;
        Token WAITING_KW281=null;
        Token set282=null;
        Token IS283=null;
        Token NOT284=null;
        Token FINISHED_KW285=null;
        Token STARTED_KW286=null;
        Token PAUSED_KW287=null;
        Token MUTED_KW288=null;
        Token set289=null;
        Token PLAYED_KW290=null;
        Token STOPPED_KW291=null;
        Token VICTORY_KW292=null;
        Token DEFEAT_KW293=null;
        hightParser.accesClasse_return accesClasse269 = null;

        hightParser.accesGlobal_return accesGlobal278 = null;

        hightParser.accesLocal_return accesLocal279 = null;


        CommonTree IS270_tree=null;
        CommonTree NOT271_tree=null;
        CommonTree DEAD_KW272_tree=null;
        CommonTree ALIVE_KW273_tree=null;
        CommonTree EFFACED_KW274_tree=null;
        CommonTree GENERATED_KW275_tree=null;
        CommonTree TOUCHING_KW276_tree=null;
        CommonTree OTHER277_tree=null;
        CommonTree MOVING_KW280_tree=null;
        CommonTree WAITING_KW281_tree=null;
        CommonTree set282_tree=null;
        CommonTree IS283_tree=null;
        CommonTree NOT284_tree=null;
        CommonTree FINISHED_KW285_tree=null;
        CommonTree STARTED_KW286_tree=null;
        CommonTree PAUSED_KW287_tree=null;
        CommonTree MUTED_KW288_tree=null;
        CommonTree set289_tree=null;
        CommonTree PLAYED_KW290_tree=null;
        CommonTree STOPPED_KW291_tree=null;
        CommonTree VICTORY_KW292_tree=null;
        CommonTree DEFEAT_KW293_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:288:6: ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW )
            int alt87=4;
            switch ( input.LA(1) ) {
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
                alt87=1;
                }
                break;
            case IDENT:
                {
                int LA87_2 = input.LA(2);

                if ( (LA87_2==IS) ) {
                    switch ( input.LA(3) ) {
                    case NOT:
                        {
                        int LA87_7 = input.LA(4);

                        if ( ((LA87_7>=FINISHED_KW && LA87_7<=STOPPED_KW)) ) {
                            alt87=2;
                        }
                        else if ( ((LA87_7>=DEAD_KW && LA87_7<=WAITING_KW)) ) {
                            alt87=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 87, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FINISHED_KW:
                    case STARTED_KW:
                    case PAUSED_KW:
                    case MUTED_KW:
                    case PLAYED_KW:
                    case STOPPED_KW:
                        {
                        alt87=2;
                        }
                        break;
                    case DEAD_KW:
                    case ALIVE_KW:
                    case EFFACED_KW:
                    case GENERATED_KW:
                    case TOUCHING_KW:
                    case MOVING_KW:
                    case WAITING_KW:
                        {
                        alt87=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 6, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt87=2;
                }
                break;
            case VICTORY_KW:
                {
                alt87=3;
                }
                break;
            case DEFEAT_KW:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:3: accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_etat2199);
                    accesClasse269=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse269.getTree());
                    IS270=(Token)match(input,IS,FOLLOW_IS_in_etat2201); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:19: ( NOT )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==NOT) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:20: NOT
                            {
                            NOT271=(Token)match(input,NOT,FOLLOW_NOT_in_etat2205); 
                            NOT271_tree = (CommonTree)adaptor.create(NOT271);
                            adaptor.addChild(root_0, NOT271_tree);


                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:26: ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
                    int alt84=7;
                    switch ( input.LA(1) ) {
                    case DEAD_KW:
                        {
                        alt84=1;
                        }
                        break;
                    case ALIVE_KW:
                        {
                        alt84=2;
                        }
                        break;
                    case EFFACED_KW:
                        {
                        alt84=3;
                        }
                        break;
                    case GENERATED_KW:
                        {
                        alt84=4;
                        }
                        break;
                    case TOUCHING_KW:
                        {
                        alt84=5;
                        }
                        break;
                    case MOVING_KW:
                        {
                        alt84=6;
                        }
                        break;
                    case WAITING_KW:
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
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:27: DEAD_KW
                            {
                            DEAD_KW272=(Token)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2210); 
                            DEAD_KW272_tree = (CommonTree)adaptor.create(DEAD_KW272);
                            root_0 = (CommonTree)adaptor.becomeRoot(DEAD_KW272_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:38: ALIVE_KW
                            {
                            ALIVE_KW273=(Token)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2215); 
                            ALIVE_KW273_tree = (CommonTree)adaptor.create(ALIVE_KW273);
                            root_0 = (CommonTree)adaptor.becomeRoot(ALIVE_KW273_tree, root_0);


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:50: EFFACED_KW
                            {
                            EFFACED_KW274=(Token)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2220); 
                            EFFACED_KW274_tree = (CommonTree)adaptor.create(EFFACED_KW274);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACED_KW274_tree, root_0);


                            }
                            break;
                        case 4 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:64: GENERATED_KW
                            {
                            GENERATED_KW275=(Token)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2225); 
                            GENERATED_KW275_tree = (CommonTree)adaptor.create(GENERATED_KW275);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATED_KW275_tree, root_0);


                            }
                            break;
                        case 5 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:80: TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal )
                            {
                            TOUCHING_KW276=(Token)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2230); 
                            TOUCHING_KW276_tree = (CommonTree)adaptor.create(TOUCHING_KW276);
                            root_0 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW276_tree, root_0);

                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:93: ( ( OTHER )? accesGlobal | accesLocal )
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==CAMERA||LA83_0==MEDIA||(LA83_0>=ALLY && LA83_0<=NEUTRAL)||LA83_0==OTHER||LA83_0==PG||(LA83_0>=COUNTER && LA83_0<=TELEPORTER)) ) {
                                alt83=1;
                            }
                            else if ( (LA83_0==IDENT||LA83_0==PLAYER||LA83_0==NUM) ) {
                                alt83=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 83, 0, input);

                                throw nvae;
                            }
                            switch (alt83) {
                                case 1 :
                                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:94: ( OTHER )? accesGlobal
                                    {
                                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:94: ( OTHER )?
                                    int alt82=2;
                                    int LA82_0 = input.LA(1);

                                    if ( (LA82_0==OTHER) ) {
                                        alt82=1;
                                    }
                                    switch (alt82) {
                                        case 1 :
                                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:95: OTHER
                                            {
                                            OTHER277=(Token)match(input,OTHER,FOLLOW_OTHER_in_etat2235); 
                                            OTHER277_tree = (CommonTree)adaptor.create(OTHER277);
                                            adaptor.addChild(root_0, OTHER277_tree);


                                            }
                                            break;

                                    }

                                    pushFollow(FOLLOW_accesGlobal_in_etat2239);
                                    accesGlobal278=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal278.getTree());

                                    }
                                    break;
                                case 2 :
                                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:117: accesLocal
                                    {
                                    pushFollow(FOLLOW_accesLocal_in_etat2243);
                                    accesLocal279=accesLocal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesLocal279.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 6 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:131: MOVING_KW
                            {
                            MOVING_KW280=(Token)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2248); 
                            MOVING_KW280_tree = (CommonTree)adaptor.create(MOVING_KW280);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOVING_KW280_tree, root_0);


                            }
                            break;
                        case 7 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:289:144: WAITING_KW
                            {
                            WAITING_KW281=(Token)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2253); 
                            WAITING_KW281_tree = (CommonTree)adaptor.create(WAITING_KW281);
                            root_0 = (CommonTree)adaptor.becomeRoot(WAITING_KW281_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:5: ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set282=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set282));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    IS283=(Token)match(input,IS,FOLLOW_IS_in_etat2271); 
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:24: ( NOT )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==NOT) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:25: NOT
                            {
                            NOT284=(Token)match(input,NOT,FOLLOW_NOT_in_etat2275); 
                            NOT284_tree = (CommonTree)adaptor.create(NOT284);
                            adaptor.addChild(root_0, NOT284_tree);


                            }
                            break;

                    }

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:31: ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    int alt86=6;
                    switch ( input.LA(1) ) {
                    case FINISHED_KW:
                        {
                        alt86=1;
                        }
                        break;
                    case STARTED_KW:
                        {
                        alt86=2;
                        }
                        break;
                    case PAUSED_KW:
                        {
                        alt86=3;
                        }
                        break;
                    case MUTED_KW:
                        {
                        alt86=4;
                        }
                        break;
                    case PLAYED_KW:
                        {
                        alt86=5;
                        }
                        break;
                    case STOPPED_KW:
                        {
                        alt86=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }

                    switch (alt86) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:32: FINISHED_KW
                            {
                            FINISHED_KW285=(Token)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2280); 
                            FINISHED_KW285_tree = (CommonTree)adaptor.create(FINISHED_KW285);
                            root_0 = (CommonTree)adaptor.becomeRoot(FINISHED_KW285_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:46: STARTED_KW
                            {
                            STARTED_KW286=(Token)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2284); 
                            STARTED_KW286_tree = (CommonTree)adaptor.create(STARTED_KW286);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTED_KW286_tree, root_0);


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:60: PAUSED_KW
                            {
                            PAUSED_KW287=(Token)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2289); 
                            PAUSED_KW287_tree = (CommonTree)adaptor.create(PAUSED_KW287);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSED_KW287_tree, root_0);


                            }
                            break;
                        case 4 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:73: MUTED_KW ( ON | OFF )
                            {
                            MUTED_KW288=(Token)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2294); 
                            MUTED_KW288_tree = (CommonTree)adaptor.create(MUTED_KW288);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTED_KW288_tree, root_0);

                            set289=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set289));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 5 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:96: PLAYED_KW
                            {
                            PLAYED_KW290=(Token)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2307); 
                            PLAYED_KW290_tree = (CommonTree)adaptor.create(PLAYED_KW290);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAYED_KW290_tree, root_0);


                            }
                            break;
                        case 6 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:109: STOPPED_KW
                            {
                            STOPPED_KW291=(Token)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2312); 
                            STOPPED_KW291_tree = (CommonTree)adaptor.create(STOPPED_KW291);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOPPED_KW291_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:292:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW292=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2326); 
                    VICTORY_KW292_tree = (CommonTree)adaptor.create(VICTORY_KW292);
                    adaptor.addChild(root_0, VICTORY_KW292_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:293:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW293=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2332); 
                    DEFEAT_KW293_tree = (CommonTree)adaptor.create(DEFEAT_KW293);
                    adaptor.addChild(root_0, DEFEAT_KW293_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "etat"

    public static class affectation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:296:1: affectation : ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable );
    public final hightParser.affectation_return affectation() throws RecognitionException {
        hightParser.affectation_return retval = new hightParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN_KW294=null;
        Token ADD_KW295=null;
        Token SUB_KW296=null;
        Token FOR298=null;
        Token INVERT_KW300=null;
        Token WITH302=null;
        hightParser.operation_return operation297 = null;

        hightParser.variable_return variable299 = null;

        hightParser.variable_return variable301 = null;

        hightParser.variable_return variable303 = null;


        CommonTree ASSIGN_KW294_tree=null;
        CommonTree ADD_KW295_tree=null;
        CommonTree SUB_KW296_tree=null;
        CommonTree FOR298_tree=null;
        CommonTree INVERT_KW300_tree=null;
        CommonTree WITH302_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:296:13: ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=ASSIGN_KW && LA89_0<=SUB_KW)) ) {
                alt89=1;
            }
            else if ( (LA89_0==INVERT_KW) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation )
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:4: ( ASSIGN_KW | ADD_KW | SUB_KW ) operation
                    {
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:4: ( ASSIGN_KW | ADD_KW | SUB_KW )
                    int alt88=3;
                    switch ( input.LA(1) ) {
                    case ASSIGN_KW:
                        {
                        alt88=1;
                        }
                        break;
                    case ADD_KW:
                        {
                        alt88=2;
                        }
                        break;
                    case SUB_KW:
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
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:5: ASSIGN_KW
                            {
                            ASSIGN_KW294=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2349); 
                            ASSIGN_KW294_tree = (CommonTree)adaptor.create(ASSIGN_KW294);
                            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW294_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:18: ADD_KW
                            {
                            ADD_KW295=(Token)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2354); 
                            ADD_KW295_tree = (CommonTree)adaptor.create(ADD_KW295);
                            root_0 = (CommonTree)adaptor.becomeRoot(ADD_KW295_tree, root_0);


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:297:28: SUB_KW
                            {
                            SUB_KW296=(Token)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2359); 
                            SUB_KW296_tree = (CommonTree)adaptor.create(SUB_KW296);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUB_KW296_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_affectation2363);
                    operation297=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation297.getTree());

                    }

                    FOR298=(Token)match(input,FOR,FOLLOW_FOR_in_affectation2366); 
                    pushFollow(FOLLOW_variable_in_affectation2369);
                    variable299=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable299.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:298:5: INVERT_KW variable WITH variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INVERT_KW300=(Token)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2376); 
                    INVERT_KW300_tree = (CommonTree)adaptor.create(INVERT_KW300);
                    root_0 = (CommonTree)adaptor.becomeRoot(INVERT_KW300_tree, root_0);

                    pushFollow(FOLLOW_variable_in_affectation2379);
                    variable301=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable301.getTree());
                    WITH302=(Token)match(input,WITH,FOLLOW_WITH_in_affectation2381); 
                    pushFollow(FOLLOW_variable_in_affectation2384);
                    variable303=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable303.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "affectation"

    public static class iaBasique_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iaBasique"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:1: iaBasique : IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* ;
    public final hightParser.iaBasique_return iaBasique() throws RecognitionException {
        hightParser.iaBasique_return retval = new hightParser.iaBasique_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IA_KW304=null;
        Token IS306=null;
        Token VIRG308=null;
        hightParser.accesClasse_return accesClasse305 = null;

        hightParser.actionObjet_return actionObjet307 = null;

        hightParser.actionObjet_return actionObjet309 = null;


        CommonTree IA_KW304_tree=null;
        CommonTree IS306_tree=null;
        CommonTree VIRG308_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:11: ( IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:13: IA_KW accesClasse IS actionObjet ( VIRG actionObjet )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IA_KW304=(Token)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2397); 
            IA_KW304_tree = (CommonTree)adaptor.create(IA_KW304);
            root_0 = (CommonTree)adaptor.becomeRoot(IA_KW304_tree, root_0);

            pushFollow(FOLLOW_accesClasse_in_iaBasique2400);
            accesClasse305=accesClasse();

            state._fsp--;

            adaptor.addChild(root_0, accesClasse305.getTree());
            IS306=(Token)match(input,IS,FOLLOW_IS_in_iaBasique2402); 
            pushFollow(FOLLOW_actionObjet_in_iaBasique2405);
            actionObjet307=actionObjet();

            state._fsp--;

            adaptor.addChild(root_0, actionObjet307.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:48: ( VIRG actionObjet )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==VIRG) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:49: VIRG actionObjet
            	    {
            	    VIRG308=(Token)match(input,VIRG,FOLLOW_VIRG_in_iaBasique2408); 
            	    pushFollow(FOLLOW_actionObjet_in_iaBasique2411);
            	    actionObjet309=actionObjet();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionObjet309.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iaBasique"

    public static class operation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:1: operation : ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus );
    public final hightParser.operation_return operation() throws RecognitionException {
        hightParser.operation_return retval = new hightParser.operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RANDOM_KW311=null;
        Token BETWEEN312=null;
        Token AND314=null;
        hightParser.operationPlus_return operationPlus310 = null;

        hightParser.operationPlus_return operationPlus313 = null;

        hightParser.operationPlus_return operationPlus315 = null;


        CommonTree RANDOM_KW311_tree=null;
        CommonTree BETWEEN312_tree=null;
        CommonTree AND314_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:11: ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=FLOAT && LA91_0<=IDENT)||LA91_0==PG||(LA91_0>=X && LA91_0<=VALUE)||(LA91_0>=MASS && LA91_0<=MOVE_WITH_CAMERA)) ) {
                alt91=1;
            }
            else if ( (LA91_0==RANDOM_KW) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:306:2: operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operationPlus_in_operation2425);
                    operationPlus310=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus310.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:4: RANDOM_KW BETWEEN operationPlus AND operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RANDOM_KW311=(Token)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2430); 
                    RANDOM_KW311_tree = (CommonTree)adaptor.create(RANDOM_KW311);
                    root_0 = (CommonTree)adaptor.becomeRoot(RANDOM_KW311_tree, root_0);

                    BETWEEN312=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operation2433); 
                    pushFollow(FOLLOW_operationPlus_in_operation2436);
                    operationPlus313=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus313.getTree());
                    AND314=(Token)match(input,AND,FOLLOW_AND_in_operation2438); 
                    pushFollow(FOLLOW_operationPlus_in_operation2441);
                    operationPlus315=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus315.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operation"

    public static class operationPlus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationPlus"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:310:1: operationPlus : operationMul ( ( PLUS | MINUS ) operationMul )* ;
    public final hightParser.operationPlus_return operationPlus() throws RecognitionException {
        hightParser.operationPlus_return retval = new hightParser.operationPlus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS317=null;
        Token MINUS318=null;
        hightParser.operationMul_return operationMul316 = null;

        hightParser.operationMul_return operationMul319 = null;


        CommonTree PLUS317_tree=null;
        CommonTree MINUS318_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:310:15: ( operationMul ( ( PLUS | MINUS ) operationMul )* )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:2: operationMul ( ( PLUS | MINUS ) operationMul )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationMul_in_operationPlus2453);
            operationMul316=operationMul();

            state._fsp--;

            adaptor.addChild(root_0, operationMul316.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:15: ( ( PLUS | MINUS ) operationMul )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=PLUS && LA93_0<=MINUS)) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:16: ( PLUS | MINUS ) operationMul
            	    {
            	    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:16: ( PLUS | MINUS )
            	    int alt92=2;
            	    int LA92_0 = input.LA(1);

            	    if ( (LA92_0==PLUS) ) {
            	        alt92=1;
            	    }
            	    else if ( (LA92_0==MINUS) ) {
            	        alt92=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 92, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt92) {
            	        case 1 :
            	            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:17: PLUS
            	            {
            	            PLUS317=(Token)match(input,PLUS,FOLLOW_PLUS_in_operationPlus2457); 
            	            PLUS317_tree = (CommonTree)adaptor.create(PLUS317);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS317_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:25: MINUS
            	            {
            	            MINUS318=(Token)match(input,MINUS,FOLLOW_MINUS_in_operationPlus2462); 
            	            MINUS318_tree = (CommonTree)adaptor.create(MINUS318);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS318_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_operationMul_in_operationPlus2466);
            	    operationMul319=operationMul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operationMul319.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operationPlus"

    public static class operationMul_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationMul"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:314:1: operationMul : operationPow ( ( MUL | DIV | MOD ) operationPow )? ;
    public final hightParser.operationMul_return operationMul() throws RecognitionException {
        hightParser.operationMul_return retval = new hightParser.operationMul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL321=null;
        Token DIV322=null;
        Token MOD323=null;
        hightParser.operationPow_return operationPow320 = null;

        hightParser.operationPow_return operationPow324 = null;


        CommonTree MUL321_tree=null;
        CommonTree DIV322_tree=null;
        CommonTree MOD323_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:314:14: ( operationPow ( ( MUL | DIV | MOD ) operationPow )? )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:2: operationPow ( ( MUL | DIV | MOD ) operationPow )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationPow_in_operationMul2479);
            operationPow320=operationPow();

            state._fsp--;

            adaptor.addChild(root_0, operationPow320.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:15: ( ( MUL | DIV | MOD ) operationPow )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=MUL && LA95_0<=MOD)) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:16: ( MUL | DIV | MOD ) operationPow
                    {
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:16: ( MUL | DIV | MOD )
                    int alt94=3;
                    switch ( input.LA(1) ) {
                    case MUL:
                        {
                        alt94=1;
                        }
                        break;
                    case DIV:
                        {
                        alt94=2;
                        }
                        break;
                    case MOD:
                        {
                        alt94=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }

                    switch (alt94) {
                        case 1 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:17: MUL
                            {
                            MUL321=(Token)match(input,MUL,FOLLOW_MUL_in_operationMul2483); 
                            MUL321_tree = (CommonTree)adaptor.create(MUL321);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUL321_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:24: DIV
                            {
                            DIV322=(Token)match(input,DIV,FOLLOW_DIV_in_operationMul2488); 
                            DIV322_tree = (CommonTree)adaptor.create(DIV322);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIV322_tree, root_0);


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:31: MOD
                            {
                            MOD323=(Token)match(input,MOD,FOLLOW_MOD_in_operationMul2493); 
                            MOD323_tree = (CommonTree)adaptor.create(MOD323);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOD323_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operationPow_in_operationMul2497);
                    operationPow324=operationPow();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPow324.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operationMul"

    public static class operationPow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationPow"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:1: operationPow : operationBracket ( POW operationBracket )? ;
    public final hightParser.operationPow_return operationPow() throws RecognitionException {
        hightParser.operationPow_return retval = new hightParser.operationPow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POW326=null;
        hightParser.operationBracket_return operationBracket325 = null;

        hightParser.operationBracket_return operationBracket327 = null;


        CommonTree POW326_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:14: ( operationBracket ( POW operationBracket )? )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:319:2: operationBracket ( POW operationBracket )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationBracket_in_operationPow2512);
            operationBracket325=operationBracket();

            state._fsp--;

            adaptor.addChild(root_0, operationBracket325.getTree());
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:319:19: ( POW operationBracket )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==POW) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:319:20: POW operationBracket
                    {
                    POW326=(Token)match(input,POW,FOLLOW_POW_in_operationPow2515); 
                    POW326_tree = (CommonTree)adaptor.create(POW326);
                    root_0 = (CommonTree)adaptor.becomeRoot(POW326_tree, root_0);

                    pushFollow(FOLLOW_operationBracket_in_operationPow2518);
                    operationBracket327=operationBracket();

                    state._fsp--;

                    adaptor.addChild(root_0, operationBracket327.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operationPow"

    public static class operationBracket_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationBracket"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:322:1: operationBracket : ( PG operation PD | variable | FLOAT );
    public final hightParser.operationBracket_return operationBracket() throws RecognitionException {
        hightParser.operationBracket_return retval = new hightParser.operationBracket_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG328=null;
        Token PD330=null;
        Token FLOAT332=null;
        hightParser.operation_return operation329 = null;

        hightParser.variable_return variable331 = null;


        CommonTree PG328_tree=null;
        CommonTree PD330_tree=null;
        CommonTree FLOAT332_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:322:18: ( PG operation PD | variable | FLOAT )
            int alt97=3;
            switch ( input.LA(1) ) {
            case PG:
                {
                alt97=1;
                }
                break;
            case SCORE:
            case TYPE:
            case IDENT:
            case X:
            case Y:
            case Z:
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
                alt97=2;
                }
                break;
            case FLOAT:
                {
                alt97=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:323:2: PG operation PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG328=(Token)match(input,PG,FOLLOW_PG_in_operationBracket2533); 
                    pushFollow(FOLLOW_operation_in_operationBracket2536);
                    operation329=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation329.getTree());
                    PD330=(Token)match(input,PD,FOLLOW_PD_in_operationBracket2538); 

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:324:4: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operationBracket2544);
                    variable331=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable331.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:325:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT332=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operationBracket2549); 
                    FLOAT332_tree = (CommonTree)adaptor.create(FLOAT332);
                    adaptor.addChild(root_0, FLOAT332_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operationBracket"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:328:1: variable : ( ( X | Y | Z ) OF typeCoordonnees OF accesClasse | IDENT OF accesClasse -> ^( VAR_I_KW IDENT accesClasse ) | attribut OF accesClasse -> ^( VAR_A_KW attribut accesClasse ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesClasse -> ^( VALUE_KW attributTps accesClasse ) );
    public final hightParser.variable_return variable() throws RecognitionException {
        hightParser.variable_return retval = new hightParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token X333=null;
        Token Y334=null;
        Token Z335=null;
        Token OF336=null;
        Token OF338=null;
        Token IDENT340=null;
        Token OF341=null;
        Token OF344=null;
        Token SCORE346=null;
        Token OF347=null;
        Token GAME348=null;
        Token VALUE349=null;
        Token OF350=null;
        Token OF352=null;
        hightParser.typeCoordonnees_return typeCoordonnees337 = null;

        hightParser.accesClasse_return accesClasse339 = null;

        hightParser.accesClasse_return accesClasse342 = null;

        hightParser.attribut_return attribut343 = null;

        hightParser.accesClasse_return accesClasse345 = null;

        hightParser.attributTps_return attributTps351 = null;

        hightParser.accesClasse_return accesClasse353 = null;


        CommonTree X333_tree=null;
        CommonTree Y334_tree=null;
        CommonTree Z335_tree=null;
        CommonTree OF336_tree=null;
        CommonTree OF338_tree=null;
        CommonTree IDENT340_tree=null;
        CommonTree OF341_tree=null;
        CommonTree OF344_tree=null;
        CommonTree SCORE346_tree=null;
        CommonTree OF347_tree=null;
        CommonTree GAME348_tree=null;
        CommonTree VALUE349_tree=null;
        CommonTree OF350_tree=null;
        CommonTree OF352_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_attribut=new RewriteRuleSubtreeStream(adaptor,"rule attribut");
        RewriteRuleSubtreeStream stream_accesClasse=new RewriteRuleSubtreeStream(adaptor,"rule accesClasse");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:328:10: ( ( X | Y | Z ) OF typeCoordonnees OF accesClasse | IDENT OF accesClasse -> ^( VAR_I_KW IDENT accesClasse ) | attribut OF accesClasse -> ^( VAR_A_KW attribut accesClasse ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesClasse -> ^( VALUE_KW attributTps accesClasse ) )
            int alt99=5;
            switch ( input.LA(1) ) {
            case X:
            case Y:
            case Z:
                {
                alt99=1;
                }
                break;
            case IDENT:
                {
                alt99=2;
                }
                break;
            case VALUE:
                {
                int LA99_3 = input.LA(2);

                if ( (LA99_3==OF) ) {
                    int LA99_6 = input.LA(3);

                    if ( ((LA99_6>=BOOST_INTERVAL && LA99_6<=RELOAD_TIME)) ) {
                        alt99=5;
                    }
                    else if ( (LA99_6==IDENT||LA99_6==CAMERA||LA99_6==MEDIA||(LA99_6>=PLAYER && LA99_6<=NEUTRAL)||LA99_6==PG||(LA99_6>=ALL && LA99_6<=NUM)||(LA99_6>=COUNTER && LA99_6<=TELEPORTER)) ) {
                        alt99=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 3, input);

                    throw nvae;
                }
                }
                break;
            case SCORE:
                {
                alt99=4;
                }
                break;
            case TYPE:
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
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:329:3: ( X | Y | Z ) OF typeCoordonnees OF accesClasse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:329:3: ( X | Y | Z )
                    int alt98=3;
                    switch ( input.LA(1) ) {
                    case X:
                        {
                        alt98=1;
                        }
                        break;
                    case Y:
                        {
                        alt98=2;
                        }
                        break;
                    case Z:
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
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:329:4: X
                            {
                            X333=(Token)match(input,X,FOLLOW_X_in_variable2562); 
                            X333_tree = (CommonTree)adaptor.create(X333);
                            root_0 = (CommonTree)adaptor.becomeRoot(X333_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:329:9: Y
                            {
                            Y334=(Token)match(input,Y,FOLLOW_Y_in_variable2567); 
                            Y334_tree = (CommonTree)adaptor.create(Y334);
                            root_0 = (CommonTree)adaptor.becomeRoot(Y334_tree, root_0);


                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:329:14: Z
                            {
                            Z335=(Token)match(input,Z,FOLLOW_Z_in_variable2572); 
                            Z335_tree = (CommonTree)adaptor.create(Z335);
                            root_0 = (CommonTree)adaptor.becomeRoot(Z335_tree, root_0);


                            }
                            break;

                    }

                    OF336=(Token)match(input,OF,FOLLOW_OF_in_variable2576); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2579);
                    typeCoordonnees337=typeCoordonnees();

                    state._fsp--;

                    adaptor.addChild(root_0, typeCoordonnees337.getTree());
                    OF338=(Token)match(input,OF,FOLLOW_OF_in_variable2581); 
                    pushFollow(FOLLOW_accesClasse_in_variable2584);
                    accesClasse339=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse339.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:330:5: IDENT OF accesClasse
                    {
                    IDENT340=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable2590);  
                    stream_IDENT.add(IDENT340);

                    OF341=(Token)match(input,OF,FOLLOW_OF_in_variable2592);  
                    stream_OF.add(OF341);

                    pushFollow(FOLLOW_accesClasse_in_variable2594);
                    accesClasse342=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse342.getTree());


                    // AST REWRITE
                    // elements: IDENT, accesClasse
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 331:5: -> ^( VAR_I_KW IDENT accesClasse )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:331:8: ^( VAR_I_KW IDENT accesClasse )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_I_KW, "VAR_I_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_accesClasse.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:5: attribut OF accesClasse
                    {
                    pushFollow(FOLLOW_attribut_in_variable2614);
                    attribut343=attribut();

                    state._fsp--;

                    stream_attribut.add(attribut343.getTree());
                    OF344=(Token)match(input,OF,FOLLOW_OF_in_variable2616);  
                    stream_OF.add(OF344);

                    pushFollow(FOLLOW_accesClasse_in_variable2618);
                    accesClasse345=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse345.getTree());


                    // AST REWRITE
                    // elements: accesClasse, attribut
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 333:5: -> ^( VAR_A_KW attribut accesClasse )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:333:8: ^( VAR_A_KW attribut accesClasse )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_A_KW, "VAR_A_KW"), root_1);

                        adaptor.addChild(root_1, stream_attribut.nextTree());
                        adaptor.addChild(root_1, stream_accesClasse.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:334:5: SCORE OF GAME
                    {
                    SCORE346=(Token)match(input,SCORE,FOLLOW_SCORE_in_variable2638);  
                    stream_SCORE.add(SCORE346);

                    OF347=(Token)match(input,OF,FOLLOW_OF_in_variable2640);  
                    stream_OF.add(OF347);

                    GAME348=(Token)match(input,GAME,FOLLOW_GAME_in_variable2642);  
                    stream_GAME.add(GAME348);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 335:5: -> GAME_SCORE_KW
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GAME_SCORE_KW, "GAME_SCORE_KW"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:5: VALUE OF attributTps OF accesClasse
                    {
                    VALUE349=(Token)match(input,VALUE,FOLLOW_VALUE_in_variable2656);  
                    stream_VALUE.add(VALUE349);

                    OF350=(Token)match(input,OF,FOLLOW_OF_in_variable2658);  
                    stream_OF.add(OF350);

                    pushFollow(FOLLOW_attributTps_in_variable2660);
                    attributTps351=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps351.getTree());
                    OF352=(Token)match(input,OF,FOLLOW_OF_in_variable2662);  
                    stream_OF.add(OF352);

                    pushFollow(FOLLOW_accesClasse_in_variable2664);
                    accesClasse353=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse353.getTree());


                    // AST REWRITE
                    // elements: accesClasse, attributTps
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 337:5: -> ^( VALUE_KW attributTps accesClasse )
                    {
                        // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:337:8: ^( VALUE_KW attributTps accesClasse )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE_KW, "VALUE_KW"), root_1);

                        adaptor.addChild(root_1, stream_attributTps.nextTree());
                        adaptor.addChild(root_1, stream_accesClasse.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class accesClasse_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accesClasse"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:340:1: accesClasse : ( ALL | accesLocal | accesGlobal );
    public final hightParser.accesClasse_return accesClasse() throws RecognitionException {
        hightParser.accesClasse_return retval = new hightParser.accesClasse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALL354=null;
        hightParser.accesLocal_return accesLocal355 = null;

        hightParser.accesGlobal_return accesGlobal356 = null;


        CommonTree ALL354_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:340:13: ( ALL | accesLocal | accesGlobal )
            int alt100=3;
            switch ( input.LA(1) ) {
            case ALL:
                {
                alt100=1;
                }
                break;
            case IDENT:
            case PLAYER:
            case NUM:
                {
                alt100=2;
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
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:341:3: ALL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ALL354=(Token)match(input,ALL,FOLLOW_ALL_in_accesClasse2692); 
                    ALL354_tree = (CommonTree)adaptor.create(ALL354);
                    adaptor.addChild(root_0, ALL354_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:342:5: accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesLocal_in_accesClasse2699);
                    accesLocal355=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal355.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:343:5: accesGlobal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesGlobal_in_accesClasse2705);
                    accesGlobal356=accesGlobal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal356.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "accesClasse"

    public static class accesGlobal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accesGlobal"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:1: accesGlobal : ( typeObjet | interaction | PG NOT ( typeObjet | interaction | PLAYER ) PD );
    public final hightParser.accesGlobal_return accesGlobal() throws RecognitionException {
        hightParser.accesGlobal_return retval = new hightParser.accesGlobal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG359=null;
        Token NOT360=null;
        Token PLAYER363=null;
        Token PD364=null;
        hightParser.typeObjet_return typeObjet357 = null;

        hightParser.interaction_return interaction358 = null;

        hightParser.typeObjet_return typeObjet361 = null;

        hightParser.interaction_return interaction362 = null;


        CommonTree PG359_tree=null;
        CommonTree NOT360_tree=null;
        CommonTree PLAYER363_tree=null;
        CommonTree PD364_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:13: ( typeObjet | interaction | PG NOT ( typeObjet | interaction | PLAYER ) PD )
            int alt102=3;
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
                alt102=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
                {
                alt102=2;
                }
                break;
            case PG:
                {
                alt102=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:347:3: typeObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet_in_accesGlobal2718);
                    typeObjet357=typeObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet357.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:348:5: interaction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_interaction_in_accesGlobal2724);
                    interaction358=interaction();

                    state._fsp--;

                    adaptor.addChild(root_0, interaction358.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:349:5: PG NOT ( typeObjet | interaction | PLAYER ) PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG359=(Token)match(input,PG,FOLLOW_PG_in_accesGlobal2730); 
                    PG359_tree = (CommonTree)adaptor.create(PG359);
                    adaptor.addChild(root_0, PG359_tree);

                    NOT360=(Token)match(input,NOT,FOLLOW_NOT_in_accesGlobal2732); 
                    NOT360_tree = (CommonTree)adaptor.create(NOT360);
                    adaptor.addChild(root_0, NOT360_tree);

                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:349:12: ( typeObjet | interaction | PLAYER )
                    int alt101=3;
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
                        alt101=1;
                        }
                        break;
                    case ALLY:
                    case ENEMY:
                    case NEUTRAL:
                        {
                        alt101=2;
                        }
                        break;
                    case PLAYER:
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
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:349:13: typeObjet
                            {
                            pushFollow(FOLLOW_typeObjet_in_accesGlobal2735);
                            typeObjet361=typeObjet();

                            state._fsp--;

                            adaptor.addChild(root_0, typeObjet361.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:349:25: interaction
                            {
                            pushFollow(FOLLOW_interaction_in_accesGlobal2739);
                            interaction362=interaction();

                            state._fsp--;

                            adaptor.addChild(root_0, interaction362.getTree());

                            }
                            break;
                        case 3 :
                            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:349:39: PLAYER
                            {
                            PLAYER363=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesGlobal2743); 
                            PLAYER363_tree = (CommonTree)adaptor.create(PLAYER363);
                            adaptor.addChild(root_0, PLAYER363_tree);


                            }
                            break;

                    }

                    PD364=(Token)match(input,PD,FOLLOW_PD_in_accesGlobal2746); 
                    PD364_tree = (CommonTree)adaptor.create(PD364);
                    adaptor.addChild(root_0, PD364_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "accesGlobal"

    public static class accesLocal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accesLocal"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:352:1: accesLocal : ( IDENT | NUM operation IN IDENT | PLAYER );
    public final hightParser.accesLocal_return accesLocal() throws RecognitionException {
        hightParser.accesLocal_return retval = new hightParser.accesLocal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT365=null;
        Token NUM366=null;
        Token IN368=null;
        Token IDENT369=null;
        Token PLAYER370=null;
        hightParser.operation_return operation367 = null;


        CommonTree IDENT365_tree=null;
        CommonTree NUM366_tree=null;
        CommonTree IN368_tree=null;
        CommonTree IDENT369_tree=null;
        CommonTree PLAYER370_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:352:12: ( IDENT | NUM operation IN IDENT | PLAYER )
            int alt103=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt103=1;
                }
                break;
            case NUM:
                {
                alt103=2;
                }
                break;
            case PLAYER:
                {
                alt103=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:353:3: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT365=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2759); 
                    IDENT365_tree = (CommonTree)adaptor.create(IDENT365);
                    adaptor.addChild(root_0, IDENT365_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:354:5: NUM operation IN IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUM366=(Token)match(input,NUM,FOLLOW_NUM_in_accesLocal2765); 
                    NUM366_tree = (CommonTree)adaptor.create(NUM366);
                    adaptor.addChild(root_0, NUM366_tree);

                    pushFollow(FOLLOW_operation_in_accesLocal2767);
                    operation367=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation367.getTree());
                    IN368=(Token)match(input,IN,FOLLOW_IN_in_accesLocal2769); 
                    IN368_tree = (CommonTree)adaptor.create(IN368);
                    adaptor.addChild(root_0, IN368_tree);

                    IDENT369=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2771); 
                    IDENT369_tree = (CommonTree)adaptor.create(IDENT369);
                    adaptor.addChild(root_0, IDENT369_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:355:5: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER370=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal2777); 
                    PLAYER370_tree = (CommonTree)adaptor.create(PLAYER370);
                    adaptor.addChild(root_0, PLAYER370_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "accesLocal"

    public static class typeCoordonnees_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCoordonnees"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:358:1: typeCoordonnees : ( POSITION | ORIENTATION | SIZE );
    public final hightParser.typeCoordonnees_return typeCoordonnees() throws RecognitionException {
        hightParser.typeCoordonnees_return retval = new hightParser.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set371=null;

        CommonTree set371_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:358:17: ( POSITION | ORIENTATION | SIZE )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set371=(Token)input.LT(1);
            if ( (input.LA(1)>=POSITION && input.LA(1)<=SIZE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set371));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeCoordonnees"

    public static class timeUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeUnit"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:362:1: timeUnit : ( MIN | SEC | MS | FRAME );
    public final hightParser.timeUnit_return timeUnit() throws RecognitionException {
        hightParser.timeUnit_return retval = new hightParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set372=null;

        CommonTree set372_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:362:10: ( MIN | SEC | MS | FRAME )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set372=(Token)input.LT(1);
            if ( (input.LA(1)>=MIN && input.LA(1)<=FRAME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set372));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeUnit"

    public static class typeObjet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeObjet"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:370:1: typeObjet : ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D );
    public final hightParser.typeObjet_return typeObjet() throws RecognitionException {
        hightParser.typeObjet_return retval = new hightParser.typeObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CAMERA373=null;
        Token MEDIA374=null;
        Token COUNTER375=null;
        Token TIME376=null;
        hightParser.typeObjet3D_return typeObjet3D377 = null;


        CommonTree CAMERA373_tree=null;
        CommonTree MEDIA374_tree=null;
        CommonTree COUNTER375_tree=null;
        CommonTree TIME376_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:370:11: ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D )
            int alt104=5;
            switch ( input.LA(1) ) {
            case CAMERA:
                {
                alt104=1;
                }
                break;
            case MEDIA:
                {
                alt104=2;
                }
                break;
            case COUNTER:
                {
                alt104=3;
                }
                break;
            case TIME:
                {
                alt104=4;
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
                alt104=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:371:2: CAMERA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CAMERA373=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_typeObjet2838); 
                    CAMERA373_tree = (CommonTree)adaptor.create(CAMERA373);
                    adaptor.addChild(root_0, CAMERA373_tree);


                    }
                    break;
                case 2 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:372:4: MEDIA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MEDIA374=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_typeObjet2843); 
                    MEDIA374_tree = (CommonTree)adaptor.create(MEDIA374);
                    adaptor.addChild(root_0, MEDIA374_tree);


                    }
                    break;
                case 3 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:373:4: COUNTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COUNTER375=(Token)match(input,COUNTER,FOLLOW_COUNTER_in_typeObjet2848); 
                    COUNTER375_tree = (CommonTree)adaptor.create(COUNTER375);
                    adaptor.addChild(root_0, COUNTER375_tree);


                    }
                    break;
                case 4 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:374:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TIME376=(Token)match(input,TIME,FOLLOW_TIME_in_typeObjet2853); 
                    TIME376_tree = (CommonTree)adaptor.create(TIME376);
                    adaptor.addChild(root_0, TIME376_tree);


                    }
                    break;
                case 5 :
                    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:375:4: typeObjet3D
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet3D_in_typeObjet2858);
                    typeObjet3D377=typeObjet3D();

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet3D377.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeObjet"

    public static class typeObjet3D_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeObjet3D"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:380:1: typeObjet3D : ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER );
    public final hightParser.typeObjet3D_return typeObjet3D() throws RecognitionException {
        hightParser.typeObjet3D_return retval = new hightParser.typeObjet3D_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set378=null;

        CommonTree set378_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:380:12: ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set378=(Token)input.LT(1);
            if ( (input.LA(1)>=OBJECT && input.LA(1)<=TELEPORTER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set378));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeObjet3D"

    public static class attribut_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribut"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:401:1: attribut : ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA );
    public final hightParser.attribut_return attribut() throws RecognitionException {
        hightParser.attribut_return retval = new hightParser.attribut_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set379=null;

        CommonTree set379_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:401:10: ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set379=(Token)input.LT(1);
            if ( input.LA(1)==TYPE||input.LA(1)==VALUE||(input.LA(1)>=MASS && input.LA(1)<=MOVE_WITH_CAMERA) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set379));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribut"

    public static class attributTps_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributTps"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:444:1: attributTps : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final hightParser.attributTps_return attributTps() throws RecognitionException {
        hightParser.attributTps_return retval = new hightParser.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set380=null;

        CommonTree set380_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:444:13: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set380=(Token)input.LT(1);
            if ( (input.LA(1)>=BOOST_INTERVAL && input.LA(1)<=RELOAD_TIME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set380));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributTps"

    public static class attributListeOuObjet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributListeOuObjet"
    // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:450:1: attributListeOuObjet : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final hightParser.attributListeOuObjet_return attributListeOuObjet() throws RecognitionException {
        hightParser.attributListeOuObjet_return retval = new hightParser.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set381=null;

        CommonTree set381_tree=null;

        try {
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:450:22: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // D:\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set381=(Token)input.LT(1);
            if ( (input.LA(1)>=INVENTORY && input.LA(1)<=TYPES_TELEPORTABLES) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set381));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributListeOuObjet"

    // Delegated rules


    protected DFA80 dfa80 = new DFA80(this);
    static final String DFA80_eotS =
        "\15\uffff";
    static final String DFA80_eofS =
        "\15\uffff";
    static final String DFA80_minS =
        "\1\32\1\uffff\1\32\1\uffff\1\32\1\uffff\7\43";
    static final String DFA80_maxS =
        "\1\u00bd\1\uffff\1\u00bd\1\uffff\1\u00bd\1\uffff\7\u0082";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3\7\uffff";
    static final String DFA80_specialS =
        "\15\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\1\7\uffff\1\1\5\uffff\1\1\2\uffff\1\1\3\uffff\4\1\5\uffff"+
            "\2\1\100\uffff\1\3\6\uffff\1\2\37\uffff\2\1\7\uffff\24\1",
            "",
            "\1\5\7\uffff\1\5\5\uffff\1\5\2\uffff\1\5\3\uffff\4\5\5\uffff"+
            "\2\5\76\uffff\1\4\1\uffff\1\5\6\uffff\1\5\37\uffff\2\5\7\uffff"+
            "\24\5",
            "",
            "\1\5\7\uffff\1\5\5\uffff\1\6\2\uffff\1\7\3\uffff\1\14\3\13"+
            "\5\uffff\2\5\100\uffff\1\5\6\uffff\1\5\37\uffff\2\5\7\uffff"+
            "\1\10\1\11\22\12",
            "",
            "\1\5\136\uffff\1\1",
            "\1\5\136\uffff\1\1",
            "\1\5\136\uffff\1\1",
            "\1\5\136\uffff\1\1",
            "\1\5\136\uffff\1\1",
            "\1\5\136\uffff\1\1",
            "\1\5\136\uffff\1\1"
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "282:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD );";
        }
    }
 

    public static final BitSet FOLLOW_gameData_in_game150 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game152 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_newType_in_game158 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game160 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_init_in_game166 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game168 = new BitSet(new long[]{0x0047890600000002L,0x0000100000040000L,0x3FFFFC0600100002L});
    public static final BitSet FOLLOW_definition_in_game174 = new BitSet(new long[]{0x0040000002000002L,0x0000100000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_FIN_in_game177 = new BitSet(new long[]{0x0040000000000002L,0x0000100000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_commande_in_game185 = new BitSet(new long[]{0x0000000002000002L,0x0000100000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_FIN_in_game188 = new BitSet(new long[]{0x0000000000000002L,0x0000100000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_reglesJeu_in_game196 = new BitSet(new long[]{0x0000000002000002L,0x0000100000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_FIN_in_game199 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_iaBasique_in_game207 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_FIN_in_game210 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_GAME_in_gameData257 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_HAS_in_gameData259 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData261 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_gameData264 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData266 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame291 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_attributGame293 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame314 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame316 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_attributGame341 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_attributGame343 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_newType369 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_newType371 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_newType373 = new BitSet(new long[]{0x0000090400000000L,0x0000000000000000L,0x3FFFFC0000000000L});
    public static final BitSet FOLLOW_subType_in_newType375 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_AND_in_newType378 = new BitSet(new long[]{0x0000090400000000L,0x0000000000000000L,0x3FFFFC0000000000L});
    public static final BitSet FOLLOW_subType_in_newType380 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_IDENT_in_subType409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_init431 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_init433 = new BitSet(new long[]{0x0000492400000000L,0x0000000000000000L,0x3FFFFC0000000000L});
    public static final BitSet FOLLOW_declarationObjet_in_init435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_init453 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_HAS_in_init455 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000000L,0xC000003900000000L,0x000FFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_allocationObject_in_init457 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_init460 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000000L,0xC000003900000000L,0x000FFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_allocationObject_in_init462 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet489 = new BitSet(new long[]{0x000F800000000002L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet515 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OF_in_declarationObjet518 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_declarationObjet521 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet526 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_WITH_in_declarationObjet530 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_declarationObjet533 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet538 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_CAMERA_in_declarationObjet567 = new BitSet(new long[]{0x0030040000000002L});
    public static final BitSet FOLLOW_view_in_declarationObjet570 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_declarationObjet601 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_declarationObjet637 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeEntity675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_entityMode690 = new BitSet(new long[]{0x000F800000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_interaction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject770 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_AT_in_allocationObject773 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_valAggregation_in_allocationObject775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribut_in_allocationObject805 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject807 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x00C0000FFFFFFFFFL});
    public static final BitSet FOLLOW_typeAllocation_in_allocationObject809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeCoordonnees_in_allocationObject839 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject841 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_coordinates_in_allocationObject843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_allocationObject874 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject876 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributTps_in_allocationObject910 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject912 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_allocationObject914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000003C000000000L});
    public static final BitSet FOLLOW_timeUnit_in_allocationObject916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAllocation958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeAllocation962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_typeAllocation966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_typeAllocation970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_valAggregation980 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000003C000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_valAffectation1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAffectation1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_valAffectation1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_valAffectation1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1060 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_definition1063 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_MEANS_in_definition1065 = new BitSet(new long[]{0x3307890604000000L,0x002003000000013FL,0x3FFFFC06000F0002L});
    public static final BitSet FOLLOW_consequences_in_definition1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1077 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_consequences1080 = new BitSet(new long[]{0x3307890604000000L,0x002003000000013FL,0x3FFFFC06000F0002L});
    public static final BitSet FOLLOW_consequ_in_consequences1082 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_siAlors_in_consequ1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1156 = new BitSet(new long[]{0x1000000000000000L,0x000000E600001202L});
    public static final BitSet FOLLOW_actionObjet_in_action1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action1163 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1184 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1189 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_action1192 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1202 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_STOP_KW_in_action1207 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_action1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_transformation_in_action1220 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_action1222 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1225 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_coordinates_in_action1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1233 = new BitSet(new long[]{0x0000800780000000L,0x0000000000000000L,0xC0000005E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1238 = new BitSet(new long[]{0x0000800780000000L,0x0000000000000000L,0xC0000005E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_accesLocal_in_action1243 = new BitSet(new long[]{0x4000400040000002L});
    public static final BitSet FOLLOW_operation_in_action1247 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_IDENT_in_action1250 = new BitSet(new long[]{0x4000400040000002L});
    public static final BitSet FOLLOW_accesGlobal_in_action1254 = new BitSet(new long[]{0x4000400040000002L});
    public static final BitSet FOLLOW_IN_in_action1260 = new BitSet(new long[]{0x0000800400000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ON_in_action1263 = new BitSet(new long[]{0x0000800400000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_accesLocal_in_action1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_action1271 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_coordinates_in_action1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1281 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_action1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000003C000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_THEN_in_action1288 = new BitSet(new long[]{0x3307890604000000L,0x002003000000013FL,0x3FFFFC06000F0002L});
    public static final BitSet FOLLOW_consequences_in_action1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ENDWAIT_in_action1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1326 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_actionObjet1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000003C000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1335 = new BitSet(new long[]{0x0307890604000000L,0x0500000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1345 = new BitSet(new long[]{0x0000800400000000L,0x0000000000006000L,0x0000000400000000L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_coordinates1397 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_coordinates1399 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_coordinates1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1430 = new BitSet(new long[]{0x0000000400000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_IDENT_in_commande1434 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_commande1436 = new BitSet(new long[]{0x0000000400000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1441 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_commande1444 = new BitSet(new long[]{0x0000000400000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1447 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande1461 = new BitSet(new long[]{0x000000000000000CL,0x000000001FC00000L});
    public static final BitSet FOLLOW_souris_in_actionCommande1464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande1468 = new BitSet(new long[]{0x000000000000000CL,0x00000001E0C00000L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande1474 = new BitSet(new long[]{0x1000000400000000L,0x000000E600000002L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1609 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1638 = new BitSet(new long[]{0x0000000000000000L,0x0000001800C00000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1696 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000180000L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1701 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000180000L});
    public static final BitSet FOLLOW_COMMANDS_in_activCommande1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_activCommande1710 = new BitSet(new long[]{0x000000000000000EL,0x000000001FC00000L});
    public static final BitSet FOLLOW_souris_in_activCommande1713 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_activCommande1716 = new BitSet(new long[]{0x000000000000000CL,0x000000001FC00000L});
    public static final BitSet FOLLOW_souris_in_activCommande1719 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_KEY_KW_in_activCommande1727 = new BitSet(new long[]{0x000000000000000CL,0x00000001E0C00000L});
    public static final BitSet FOLLOW_clavier_in_activCommande1729 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_activCommande1732 = new BitSet(new long[]{0x000000000000000CL,0x00000001E0C00000L});
    public static final BitSet FOLLOW_clavier_in_activCommande1735 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_activCommande1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1756 = new BitSet(new long[]{0x0307890704000000L,0x0000000000000000L,0xFFFFFC07E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1760 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_reglesJeu1762 = new BitSet(new long[]{0x0307890704000000L,0x0000000000000000L,0xFFFFFC07E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_THEN_in_reglesJeu1770 = new BitSet(new long[]{0x3307890604000000L,0x002003000000013FL,0x3FFFFC06000F0002L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur1787 = new BitSet(new long[]{0x0000000000000000L,0x000DA00000000200L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declencheur1810 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declencheur1841 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1843 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0000000L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1865 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1867 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK1935 = new BitSet(new long[]{0x0007890600000000L,0x0002000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK1940 = new BitSet(new long[]{0x0007890600000000L,0x0002000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK1946 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurTK1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurTK1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT1966 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT1971 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_BY_in_declencheurKT1976 = new BitSet(new long[]{0x0007890600000000L,0x0002000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT1981 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurKT1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurKT1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2006 = new BitSet(new long[]{0x0307890604000000L,0x0500000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_conditions_in_siAlors2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_THEN_in_siAlors2011 = new BitSet(new long[]{0x3307890604000000L,0x002003000000013FL,0x3FFFFC06000F0002L});
    public static final BitSet FOLLOW_consequences_in_siAlors2014 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_ELSE_in_siAlors2017 = new BitSet(new long[]{0x3307890604000000L,0x002003000000013FL,0x3FFFFC06000F0002L});
    public static final BitSet FOLLOW_consequences_in_siAlors2020 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_ENDIF_in_siAlors2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_conditions2039 = new BitSet(new long[]{0x0307890604000000L,0x0500000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_conditionOu_in_conditions2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2069 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_OR_in_conditionOu2072 = new BitSet(new long[]{0x0307890604000000L,0x0500000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_NOT_in_conditionOu2076 = new BitSet(new long[]{0x0307890604000000L,0x0500000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_conditionOu_in_conditionOu2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_in_conditionEt2096 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_AND_in_conditionEt2099 = new BitSet(new long[]{0x0307890604000000L,0x0500000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_NOT_in_conditionEt2103 = new BitSet(new long[]{0x0307890604000000L,0x0500000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionEt2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_etat_in_cond2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMP_in_cond2129 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_cond2132 = new BitSet(new long[]{0x0000000000000000L,0xF800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUALS_in_cond2135 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_INF_in_cond2140 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_SUP_in_cond2145 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_INFEG_in_cond2150 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_SUPED_in_cond2155 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_DIFF_in_cond2160 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_cond2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_cond2181 = new BitSet(new long[]{0x0307890604000000L,0x0500000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_conditions_in_cond2183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PD_in_cond2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_etat2199 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_etat2201 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x00000000000003F8L});
    public static final BitSet FOLLOW_NOT_in_etat2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000003F8L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2230 = new BitSet(new long[]{0x0007890600000000L,0x0002000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_OTHER_in_etat2235 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesGlobal_in_etat2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_etat2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_etat2263 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_etat2271 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_NOT_in_etat2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2294 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_etat2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2349 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2354 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2359 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_affectation2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_FOR_in_affectation2366 = new BitSet(new long[]{0x0000000700000000L,0x0000000000000000L,0xC0000001E0000000L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_variable_in_affectation2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2376 = new BitSet(new long[]{0x0000000700000000L,0x0000000000000000L,0xC0000001E0000000L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_variable_in_affectation2379 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_WITH_in_affectation2381 = new BitSet(new long[]{0x0000000700000000L,0x0000000000000000L,0xC0000001E0000000L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_variable_in_affectation2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2397 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_iaBasique2400 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_iaBasique2402 = new BitSet(new long[]{0x1000000000000000L,0x000000E600001202L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2405 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_iaBasique2408 = new BitSet(new long[]{0x1000000000000000L,0x000000E600001202L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2411 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_operationPlus_in_operation2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_BETWEEN_in_operation2433 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operationPlus_in_operation2436 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_AND_in_operation2438 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operationPlus_in_operation2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_PLUS_in_operationPlus2457 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_MINUS_in_operationPlus2462 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_operationPow_in_operationMul2479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000E000000L});
    public static final BitSet FOLLOW_MUL_in_operationMul2483 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_DIV_in_operationMul2488 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_MOD_in_operationMul2493 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operationPow_in_operationMul2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_POW_in_operationPow2515 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0000002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_operationBracket2533 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_operationBracket2536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PD_in_operationBracket2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operationBracket2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operationBracket2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable2562 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Y_in_variable2567 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Z_in_variable2572 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2579 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2581 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable2590 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2592 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribut_in_variable2614 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2616 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_variable2638 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2640 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_GAME_in_variable2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_variable2656 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2658 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000000L,0xC000003900000000L,0x000FFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_attributTps_in_variable2660 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2662 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0x3FFFFC0600000002L});
    public static final BitSet FOLLOW_accesClasse_in_variable2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_accesClasse2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_accesClasse2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_accesGlobal2730 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_NOT_in_accesGlobal2732 = new BitSet(new long[]{0x0007890000000000L,0x0000000000000000L,0x3FFFFC0000000000L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PLAYER_in_accesGlobal2743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PD_in_accesGlobal2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal2765 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0xC0000001E0200002L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_accesLocal2767 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal2769 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERA_in_typeObjet2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_typeObjet2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNTER_in_typeObjet2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_typeObjet2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeObjet2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeObjet3D0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attribut0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}