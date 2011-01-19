// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g 2011-01-19 01:38:38

    package grammars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class hightParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "SCORE", "TYPE", "IDENT", "IS", "AND", "LIST_KW", "OF", "WITH", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "IN", "PLAYER", "ALLY", "ENEMY", "NEUTRAL", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "DIES_KW", "DURING", "UNTIL", "EQUIP", "NEXT", "PREVIOUS", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "MOUSE_KW", "KEY_KW", "FOR", "WUP", "WDOWN", "LEFT", "RIGHT", "CLICK_LEFT", "CLICK_CENTER", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "JUMP", "MOVE", "FORWARD", "BACKWARD", "TURN", "ACCELERATE", "BRAKE", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "BY", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "X", "Y", "Z", "VALUE", "ALL", "NUM", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "COUNTER", "TIME", "OBJECT", "CHARACTER", "VEHICLE", "PLANE", "SPACECRAFT", "OBSTACLE", "WEAPON", "SWORD", "PROJECTILE", "ZONE", "GROUND", "BONUS", "CHECKPOINT", "BREAKABLE", "CONSTRUCTION", "ROOM", "BALL", "TELEPORTER", "MASS", "IS_FIX", "IS_TRAVERSABLE", "FOV", "ACTIVE", "NAME", "DESCRIPTION", "LIFE", "LIFE_MAX", "LIFE_MIN", "NB_LIVES", "MAGIC", "MAGIC_MAX", "MAGIC_MIN", "LEVEL", "ATTACK", "DEFENSE", "JUMP_FORCE", "JUMP_AIR_MAX", "MONEY", "CLASS", "RACE", "ACCELERATION", "SPEED", "SPEED_MAX", "SPEED_MIN", "BOOST", "BOOST_MAX", "NB_MUNITIONS", "NB_MUNITIONS_MAX", "SHOOT_POWER", "DAMAGES", "UNIT", "OBJECT_NAME", "ATTRIBUT_NAME", "VOLUME", "NUMBER", "MOVE_WITH_CAMERA", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "WS", "'true'", "'false'"
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
    public String getGrammarFileName() { return "C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g"; }


    public static class game_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "game"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:41:1: game : ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )+ ( reglesJeu ( FIN )? )+ ( iaBasique ( FIN )? )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )* ( reglesJeu )* ( iaBasique )* ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:41:6: ( ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )+ ( reglesJeu ( FIN )? )+ ( iaBasique ( FIN )? )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )* ( reglesJeu )* ( iaBasique )* ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:42:2: ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )+ ( reglesJeu ( FIN )? )+ ( iaBasique ( FIN )? )*
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:42:2: ( gameData FIN )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:42:3: gameData FIN
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:43:2: ( newType FIN )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:43:3: newType FIN
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:44:2: ( init FIN )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:44:3: init FIN
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:2: ( definition ( FIN )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DEFINITION_KW) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:3: definition ( FIN )?
            	    {
            	    pushFollow(FOLLOW_definition_in_game174);
            	    definition7=definition();

            	    state._fsp--;

            	    stream_definition.add(definition7.getTree());
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:14: ( FIN )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==FIN) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:15: FIN
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:2: ( commande ( FIN )? )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMAND_KW) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:3: commande ( FIN )?
            	    {
            	    pushFollow(FOLLOW_commande_in_game185);
            	    commande9=commande();

            	    state._fsp--;

            	    stream_commande.add(commande9.getTree());
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:12: ( FIN )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==FIN) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:13: FIN
            	            {
            	            FIN10=(Token)match(input,FIN,FOLLOW_FIN_in_game188);  
            	            stream_FIN.add(FIN10);


            	            }
            	            break;

            	    }


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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:2: ( reglesJeu ( FIN )? )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_KW) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:3: reglesJeu ( FIN )?
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game196);
            	    reglesJeu11=reglesJeu();

            	    state._fsp--;

            	    stream_reglesJeu.add(reglesJeu11.getTree());
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:13: ( FIN )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==FIN) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:14: FIN
            	            {
            	            FIN12=(Token)match(input,FIN,FOLLOW_FIN_in_game199);  
            	            stream_FIN.add(FIN12);


            	            }
            	            break;

            	    }


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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:2: ( iaBasique ( FIN )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IA_KW) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:3: iaBasique ( FIN )?
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game207);
            	    iaBasique13=iaBasique();

            	    state._fsp--;

            	    stream_iaBasique.add(iaBasique13.getTree());
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:13: ( FIN )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==FIN) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:14: FIN
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
            // elements: gameData, iaBasique, init, definition, reglesJeu, newType, commande
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
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:7: ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )* ( reglesJeu )* ( iaBasique )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME_KW, "GAME_KW"), root_1);

                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:17: ( gameData )?
                if ( stream_gameData.hasNext() ) {
                    adaptor.addChild(root_1, stream_gameData.nextTree());

                }
                stream_gameData.reset();
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:27: ( newType )*
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
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:42: ( definition )*
                while ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:54: ( commande )*
                while ( stream_commande.hasNext() ) {
                    adaptor.addChild(root_1, stream_commande.nextTree());

                }
                stream_commande.reset();
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:64: ( reglesJeu )*
                while ( stream_reglesJeu.hasNext() ) {
                    adaptor.addChild(root_1, stream_reglesJeu.nextTree());

                }
                stream_reglesJeu.reset();
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:75: ( iaBasique )*
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:53:1: gameData : GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:53:10: ( GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:54:2: GAME HAS attributGame ( VIRG attributGame )*
            {
            GAME15=(Token)match(input,GAME,FOLLOW_GAME_in_gameData257);  
            stream_GAME.add(GAME15);

            HAS16=(Token)match(input,HAS,FOLLOW_HAS_in_gameData259);  
            stream_HAS.add(HAS16);

            pushFollow(FOLLOW_attributGame_in_gameData261);
            attributGame17=attributGame();

            state._fsp--;

            stream_attributGame.add(attributGame17.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:54:24: ( VIRG attributGame )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==VIRG) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:54:25: VIRG attributGame
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
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:55:7: ^( GAME_ATTRIBUT_KW ( attributGame )+ )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:58:1: attributGame : ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | SCORE AT FLOAT -> ^( SCORE_KW FLOAT ) );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:58:14: ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | SCORE AT FLOAT -> ^( SCORE_KW FLOAT ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:59:2: GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
                    {
                    GRAVITY_KW20=(Token)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame291);  
                    stream_GRAVITY_KW.add(GRAVITY_KW20);

                    AT21=(Token)match(input,AT,FOLLOW_AT_in_attributGame293);  
                    stream_AT.add(AT21);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:59:16: ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:59:17: FLOAT
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:60:8: ^( GRAVITY_KW FLOAT )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:61:5: FLOAT FLOAT FLOAT
                            {
                            FLOAT23=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame314);  
                            stream_FLOAT.add(FLOAT23);

                            FLOAT24=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame316);  
                            stream_FLOAT.add(FLOAT24);

                            FLOAT25=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame318);  
                            stream_FLOAT.add(FLOAT25);



                            // AST REWRITE
                            // elements: GRAVITY_KW, FLOAT, FLOAT, FLOAT
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:62:8: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:63:4: SCORE AT FLOAT
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:64:7: ^( SCORE_KW FLOAT )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:68:1: newType : TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT ( subType )+ ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:68:9: ( TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT ( subType )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:69:2: TYPE IDENT IS subType ( AND subType )*
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:69:24: ( AND subType )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:69:25: AND subType
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
            // elements: TYPE, subType, IDENT
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
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:70:7: ^( TYPE IDENT ( subType )+ )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:73:1: subType : ( IDENT | typeObjet );
    public final hightParser.subType_return subType() throws RecognitionException {
        hightParser.subType_return retval = new hightParser.subType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT35=null;
        hightParser.typeObjet_return typeObjet36 = null;


        CommonTree IDENT35_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:73:9: ( IDENT | typeObjet )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:74:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_subType409); 
                    IDENT35_tree = (CommonTree)adaptor.create(IDENT35);
                    adaptor.addChild(root_0, IDENT35_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:75:4: typeObjet
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:80:1: init : ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW ( allocationObject )+ ) );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:80:6: ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW ( allocationObject )+ ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:81:2: IDENT IS declarationObjet
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:82:7: ^( INIT_IS_KW IDENT declarationObjet )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:83:4: accesClasse HAS allocationObject ( VIRG allocationObject )*
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:83:37: ( VIRG allocationObject )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==VIRG) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:83:38: VIRG allocationObject
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:84:7: ^( INIT_HAS_KW ( allocationObject )+ )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:88:1: declarationObjet : ( typeEntity ( entityMode )? -> ^( DEC typeEntity ( entityMode )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:88:18: ( typeEntity ( entityMode )? -> ^( DEC typeEntity ( entityMode )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:89:2: typeEntity ( entityMode )?
                    {
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet489);
                    typeEntity45=typeEntity();

                    state._fsp--;

                    stream_typeEntity.add(typeEntity45.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:89:13: ( entityMode )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=PLAYER && LA19_0<=DUPLICABLE)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:89:13: entityMode
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:90:7: ^( DEC typeEntity ( entityMode )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);

                        adaptor.addChild(root_1, stream_typeEntity.nextTree());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:90:24: ( entityMode )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:4: LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )?
                    {
                    LIST_KW47=(Token)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet515);  
                    stream_LIST_KW.add(LIST_KW47);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:12: ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==OF) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:13: OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )*
                            {
                            OF48=(Token)match(input,OF,FOLLOW_OF_in_declarationObjet518);  
                            stream_OF.add(OF48);

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:16: ( operation )?
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
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:17: operation
                                    {
                                    pushFollow(FOLLOW_operation_in_declarationObjet521);
                                    operation49=operation();

                                    state._fsp--;

                                    stream_operation.add(operation49.getTree());

                                    }
                                    break;

                            }

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:29: ( IDENT )
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:30: IDENT
                            {
                            IDENT50=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet526);  
                            stream_IDENT.add(IDENT50);


                            }

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:37: ( WITH ( operation )? ( IDENT ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==WITH) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:38: WITH ( operation )? ( IDENT )
                            	    {
                            	    WITH51=(Token)match(input,WITH,FOLLOW_WITH_in_declarationObjet530);  
                            	    stream_WITH.add(WITH51);

                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:43: ( operation )?
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
                            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:44: operation
                            	            {
                            	            pushFollow(FOLLOW_operation_in_declarationObjet533);
                            	            operation52=operation();

                            	            state._fsp--;

                            	            stream_operation.add(operation52.getTree());

                            	            }
                            	            break;

                            	    }

                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:56: ( IDENT )
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:57: IDENT
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
                    // elements: LIST_KW, IDENT, operation
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:6: ^( LIST_KW ( ( operation )? IDENT )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LIST_KW.nextNode(), root_1);

                        if ( !(stream_IDENT.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_IDENT.hasNext() ) {
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:17: ( operation )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:4: CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
                    {
                    CAMERA54=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_declarationObjet567);  
                    stream_CAMERA.add(CAMERA54);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:11: ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:12: view PERSON
                            {
                            pushFollow(FOLLOW_view_in_declarationObjet570);
                            view55=view();

                            state._fsp--;

                            stream_view.add(view55.getTree());
                            PERSON56=(Token)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet572);  
                            stream_PERSON.add(PERSON56);



                            // AST REWRITE
                            // elements: PERSON, view
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:27: ^( CAMERA_KW PERSON view )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:54: FREE
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:62: ^( CAMERA_KW FREE )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:4: MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
                    {
                    MEDIA58=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_declarationObjet601);  
                    stream_MEDIA.add(MEDIA58);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:10: ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:11: LOOP
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:18: ^( MEDIA_KW LOOP )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:37: ONCE
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
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:44: ^( MEDIA_KW ONCE )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:4: IN IDENT
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:16: ^( IN_KW IDENT )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:98:1: typeEntity : ( IDENT | typeObjet3D );
    public final hightParser.typeEntity_return typeEntity() throws RecognitionException {
        hightParser.typeEntity_return retval = new hightParser.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT63=null;
        hightParser.typeObjet3D_return typeObjet3D64 = null;


        CommonTree IDENT63_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:98:12: ( IDENT | typeObjet3D )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:99:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT63=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeEntity670); 
                    IDENT63_tree = (CommonTree)adaptor.create(IDENT63);
                    adaptor.addChild(root_0, IDENT63_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:100:4: typeObjet3D
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:103:1: entityMode : ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:103:11: ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:104:2: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER65=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_entityMode685); 
                    PLAYER65_tree = (CommonTree)adaptor.create(PLAYER65);
                    adaptor.addChild(root_0, PLAYER65_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:4: interaction ( dupli )?
                    {
                    pushFollow(FOLLOW_interaction_in_entityMode690);
                    interaction66=interaction();

                    state._fsp--;

                    stream_interaction.add(interaction66.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:16: ( dupli )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==DUPLICABLE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:16: dupli
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:25: ^( INTERACTION_KW interaction ( dupli )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTERACTION_KW, "INTERACTION_KW"), root_1);

                        adaptor.addChild(root_1, stream_interaction.nextTree());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:54: ( dupli )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:106:4: dupli
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:109:1: interaction : ( ALLY | ENEMY | NEUTRAL );
    public final hightParser.interaction_return interaction() throws RecognitionException {
        hightParser.interaction_return retval = new hightParser.interaction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set69=null;

        CommonTree set69_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:109:13: ( ALLY | ENEMY | NEUTRAL )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:115:1: dupli : DUPLICABLE ;
    public final hightParser.dupli_return dupli() throws RecognitionException {
        hightParser.dupli_return retval = new hightParser.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DUPLICABLE70=null;

        CommonTree DUPLICABLE70_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:115:7: ( DUPLICABLE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:116:2: DUPLICABLE
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:119:1: view : ( FIRST | THIRD );
    public final hightParser.view_return view() throws RecognitionException {
        hightParser.view_return retval = new hightParser.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set71=null;

        CommonTree set71_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:119:6: ( FIRST | THIRD )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:124:1: allocationObject : ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | attribut AT typeAllocation -> ^( ALLOCATION_KW attribut typeAllocation ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:124:18: ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | attribut AT typeAllocation -> ^( ALLOCATION_KW attribut typeAllocation ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:2: IDENT ( AT valAggregation )?
                    {
                    IDENT72=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject770);  
                    stream_IDENT.add(IDENT72);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:8: ( AT valAggregation )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==AT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:9: AT valAggregation
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
                    // elements: IDENT, valAggregation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 126:4: -> ^( ALLOCATION_KW IDENT ( valAggregation )? )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:126:7: ^( ALLOCATION_KW IDENT ( valAggregation )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:126:30: ( valAggregation )?
                        if ( stream_valAggregation.hasNext() ) {
                            adaptor.addChild(root_1, stream_valAggregation.nextTree());

                        }
                        stream_valAggregation.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:127:4: attribut AT typeAllocation
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:128:7: ^( ALLOCATION_KW attribut typeAllocation )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:129:4: typeCoordonnees AT coordinates
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:130:7: ^( ALLOCATION_KW typeCoordonnees coordinates )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:131:4: attributListeOuObjet AT IDENT
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
                    // elements: attributListeOuObjet, IDENT
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:132:7: ^( ALLOCATION_KW attributListeOuObjet IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:133:4: attributTps AT operation timeUnit
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:134:7: ^( ALLOCATION_KW attributTps operation timeUnit )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:137:1: typeAllocation : ( operation | IDENT | 'true' | 'false' ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:2: ( ( operation | IDENT | 'true' | 'false' ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:4: ( operation | IDENT | 'true' | 'false' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:4: ( operation | IDENT | 'true' | 'false' )
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
            case 248:
                {
                alt32=3;
                }
                break;
            case 249:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:5: operation
                    {
                    pushFollow(FOLLOW_operation_in_typeAllocation958);
                    operation88=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation88.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:17: IDENT
                    {
                    IDENT89=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeAllocation962); 
                    IDENT89_tree = (CommonTree)adaptor.create(IDENT89);
                    adaptor.addChild(root_0, IDENT89_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:25: 'true'
                    {
                    string_literal90=(Token)match(input,248,FOLLOW_248_in_typeAllocation966); 
                    string_literal90_tree = (CommonTree)adaptor.create(string_literal90);
                    adaptor.addChild(root_0, string_literal90_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:34: 'false'
                    {
                    string_literal91=(Token)match(input,249,FOLLOW_249_in_typeAllocation970); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:140:1: valAggregation : ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) );
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:140:16: ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:2: operation ( timeUnit )?
                    {
                    pushFollow(FOLLOW_operation_in_valAggregation980);
                    operation92=operation();

                    state._fsp--;

                    stream_operation.add(operation92.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:12: ( timeUnit )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=MIN && LA33_0<=FRAME)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:13: timeUnit
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:7: ^( AGGREGATION_KW operation ( timeUnit )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_operation.nextTree());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:34: ( timeUnit )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:143:4: IDENT
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
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:144:7: ^( AGGREGATION_KW IDENT )
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

    public static class definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:148:1: definition : DEFINITION_KW IDENT MEANS consequences ;
    public final hightParser.definition_return definition() throws RecognitionException {
        hightParser.definition_return retval = new hightParser.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINITION_KW95=null;
        Token IDENT96=null;
        Token MEANS97=null;
        hightParser.consequences_return consequences98 = null;


        CommonTree DEFINITION_KW95_tree=null;
        CommonTree IDENT96_tree=null;
        CommonTree MEANS97_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:148:12: ( DEFINITION_KW IDENT MEANS consequences )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:148:14: DEFINITION_KW IDENT MEANS consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFINITION_KW95=(Token)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1029); 
            DEFINITION_KW95_tree = (CommonTree)adaptor.create(DEFINITION_KW95);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW95_tree, root_0);

            IDENT96=(Token)match(input,IDENT,FOLLOW_IDENT_in_definition1032); 
            IDENT96_tree = (CommonTree)adaptor.create(IDENT96);
            adaptor.addChild(root_0, IDENT96_tree);

            MEANS97=(Token)match(input,MEANS,FOLLOW_MEANS_in_definition1034); 
            pushFollow(FOLLOW_consequences_in_definition1037);
            consequences98=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences98.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:150:1: consequences : consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) ;
    public final hightParser.consequences_return consequences() throws RecognitionException {
        hightParser.consequences_return retval = new hightParser.consequences_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG100=null;
        hightParser.consequ_return consequ99 = null;

        hightParser.consequ_return consequ101 = null;


        CommonTree VIRG100_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_consequ=new RewriteRuleSubtreeStream(adaptor,"rule consequ");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:150:14: ( consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:151:2: consequ ( VIRG consequ )*
            {
            pushFollow(FOLLOW_consequ_in_consequences1046);
            consequ99=consequ();

            state._fsp--;

            stream_consequ.add(consequ99.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:151:10: ( VIRG consequ )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==VIRG) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:151:11: VIRG consequ
            	    {
            	    VIRG100=(Token)match(input,VIRG,FOLLOW_VIRG_in_consequences1049);  
            	    stream_VIRG.add(VIRG100);

            	    pushFollow(FOLLOW_consequ_in_consequences1051);
            	    consequ101=consequ();

            	    state._fsp--;

            	    stream_consequ.add(consequ101.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
            // 152:4: -> ^( CONSEQUENCES_KW ( consequ )+ )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:152:6: ^( CONSEQUENCES_KW ( consequ )+ )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:155:1: consequ : ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW );
    public final hightParser.consequ_return consequ() throws RecognitionException {
        hightParser.consequ_return retval = new hightParser.consequ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT106=null;
        Token VICTORY_KW107=null;
        Token DEFEAT_KW108=null;
        hightParser.siAlors_return siAlors102 = null;

        hightParser.action_return action103 = null;

        hightParser.affectation_return affectation104 = null;

        hightParser.activCommande_return activCommande105 = null;


        CommonTree IDENT106_tree=null;
        CommonTree VICTORY_KW107_tree=null;
        CommonTree DEFEAT_KW108_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:155:9: ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW )
            int alt36=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt36=1;
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
                alt36=2;
                }
                break;
            case IDENT:
                {
                int LA36_3 = input.LA(2);

                if ( ((LA36_3>=ENDS_KW && LA36_3<=PAUSE_KW)||LA36_3==STOP_KW||LA36_3==DIES_KW||LA36_3==EQUIP||(LA36_3>=JUMP && LA36_3<=MOVE)||(LA36_3>=TURN && LA36_3<=BRAKE)) ) {
                    alt36=2;
                }
                else if ( (LA36_3==EOF||LA36_3==FIN||LA36_3==VIRG||LA36_3==DEFINITION_KW||LA36_3==ENDWAIT||LA36_3==COMMAND_KW||LA36_3==RULE_KW||(LA36_3>=ELSE && LA36_3<=ENDIF)||LA36_3==IA_KW) ) {
                    alt36=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 3, input);

                    throw nvae;
                }
                }
                break;
            case ASSIGN_KW:
            case ADD_KW:
            case SUB_KW:
            case INVERT_KW:
                {
                alt36=3;
                }
                break;
            case ACTIVATE_KW:
            case DISABLE_KW:
                {
                alt36=4;
                }
                break;
            case VICTORY_KW:
                {
                alt36=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt36=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:156:3: siAlors
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_siAlors_in_consequ1077);
                    siAlors102=siAlors();

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors102.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:157:5: action
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_action_in_consequ1083);
                    action103=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action103.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:158:5: affectation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_consequ1089);
                    affectation104=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation104.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:159:5: activCommande
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_activCommande_in_consequ1095);
                    activCommande105=activCommande();

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande105.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:160:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1101); 
                    IDENT106_tree = (CommonTree)adaptor.create(IDENT106);
                    adaptor.addChild(root_0, IDENT106_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:161:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW107=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1107); 
                    VICTORY_KW107_tree = (CommonTree)adaptor.create(VICTORY_KW107);
                    adaptor.addChild(root_0, VICTORY_KW107_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:162:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW108=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1113); 
                    DEFEAT_KW108_tree = (CommonTree)adaptor.create(DEFEAT_KW108);
                    adaptor.addChild(root_0, DEFEAT_KW108_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:165:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW );
    public final hightParser.action_return action() throws RecognitionException {
        hightParser.action_return retval = new hightParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set111=null;
        Token ENDS_KW112=null;
        Token STARTS_KW113=null;
        Token PAUSE_KW114=null;
        Token MUTE_KW115=null;
        Token set116=null;
        Token PLAY_KW117=null;
        Token STOP_KW118=null;
        Token IDENT119=null;
        Token BLOCK_KW120=null;
        Token OF122=null;
        Token EFFACE_KW125=null;
        Token GENERATE_KW126=null;
        Token IDENT129=null;
        Token IN131=null;
        Token ON132=null;
        Token AT134=null;
        Token WAIT_KW136=null;
        Token THEN139=null;
        Token ENDWAIT141=null;
        Token SAVE_KW142=null;
        hightParser.accesClasse_return accesClasse109 = null;

        hightParser.actionObjet_return actionObjet110 = null;

        hightParser.transformation_return transformation121 = null;

        hightParser.accesClasse_return accesClasse123 = null;

        hightParser.coordinates_return coordinates124 = null;

        hightParser.accesLocal_return accesLocal127 = null;

        hightParser.operation_return operation128 = null;

        hightParser.accesGlobal_return accesGlobal130 = null;

        hightParser.accesLocal_return accesLocal133 = null;

        hightParser.coordinates_return coordinates135 = null;

        hightParser.operation_return operation137 = null;

        hightParser.timeUnit_return timeUnit138 = null;

        hightParser.consequences_return consequences140 = null;


        CommonTree set111_tree=null;
        CommonTree ENDS_KW112_tree=null;
        CommonTree STARTS_KW113_tree=null;
        CommonTree PAUSE_KW114_tree=null;
        CommonTree MUTE_KW115_tree=null;
        CommonTree set116_tree=null;
        CommonTree PLAY_KW117_tree=null;
        CommonTree STOP_KW118_tree=null;
        CommonTree IDENT119_tree=null;
        CommonTree BLOCK_KW120_tree=null;
        CommonTree OF122_tree=null;
        CommonTree EFFACE_KW125_tree=null;
        CommonTree GENERATE_KW126_tree=null;
        CommonTree IDENT129_tree=null;
        CommonTree IN131_tree=null;
        CommonTree ON132_tree=null;
        CommonTree AT134_tree=null;
        CommonTree WAIT_KW136_tree=null;
        CommonTree THEN139_tree=null;
        CommonTree ENDWAIT141_tree=null;
        CommonTree SAVE_KW142_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:165:8: ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW )
            int alt44=7;
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
                alt44=1;
                }
                break;
            case IDENT:
                {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==PAUSE_KW||LA44_2==STOP_KW||LA44_2==DIES_KW||LA44_2==EQUIP||(LA44_2>=JUMP && LA44_2<=MOVE)||(LA44_2>=TURN && LA44_2<=BRAKE)) ) {
                    alt44=1;
                }
                else if ( ((LA44_2>=ENDS_KW && LA44_2<=STARTS_KW)) ) {
                    alt44=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt44=2;
                }
                break;
            case PAUSE_KW:
            case MUTE_KW:
            case PLAY_KW:
            case STOP_KW:
                {
                alt44=3;
                }
                break;
            case BLOCK_KW:
                {
                alt44=4;
                }
                break;
            case EFFACE_KW:
            case GENERATE_KW:
                {
                alt44=5;
                }
                break;
            case WAIT_KW:
                {
                alt44=6;
                }
                break;
            case SAVE_KW:
                {
                alt44=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:166:2: accesClasse actionObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_action1125);
                    accesClasse109=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse109.getTree());
                    pushFollow(FOLLOW_actionObjet_in_action1127);
                    actionObjet110=actionObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet110.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:167:4: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set111=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set111));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:167:19: ( ENDS_KW | STARTS_KW )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ENDS_KW) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==STARTS_KW) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:167:20: ENDS_KW
                            {
                            ENDS_KW112=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1141); 
                            ENDS_KW112_tree = (CommonTree)adaptor.create(ENDS_KW112);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW112_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:167:30: STARTS_KW
                            {
                            STARTS_KW113=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1145); 
                            STARTS_KW113_tree = (CommonTree)adaptor.create(STARTS_KW113);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW113_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:168:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:168:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW )
                    int alt38=4;
                    switch ( input.LA(1) ) {
                    case PAUSE_KW:
                        {
                        alt38=1;
                        }
                        break;
                    case MUTE_KW:
                        {
                        alt38=2;
                        }
                        break;
                    case PLAY_KW:
                        {
                        alt38=3;
                        }
                        break;
                    case STOP_KW:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:168:5: PAUSE_KW
                            {
                            PAUSE_KW114=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1153); 
                            PAUSE_KW114_tree = (CommonTree)adaptor.create(PAUSE_KW114);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW114_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:168:17: MUTE_KW ( ON | OFF )
                            {
                            MUTE_KW115=(Token)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1158); 
                            MUTE_KW115_tree = (CommonTree)adaptor.create(MUTE_KW115);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTE_KW115_tree, root_0);

                            set116=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set116));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:168:39: PLAY_KW
                            {
                            PLAY_KW117=(Token)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1171); 
                            PLAY_KW117_tree = (CommonTree)adaptor.create(PLAY_KW117);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAY_KW117_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:168:50: STOP_KW
                            {
                            STOP_KW118=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_action1176); 
                            STOP_KW118_tree = (CommonTree)adaptor.create(STOP_KW118);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOP_KW118_tree, root_0);


                            }
                            break;

                    }

                    IDENT119=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1181); 
                    IDENT119_tree = (CommonTree)adaptor.create(IDENT119);
                    adaptor.addChild(root_0, IDENT119_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:169:4: BLOCK_KW transformation OF accesClasse coordinates
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLOCK_KW120=(Token)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1186); 
                    BLOCK_KW120_tree = (CommonTree)adaptor.create(BLOCK_KW120);
                    root_0 = (CommonTree)adaptor.becomeRoot(BLOCK_KW120_tree, root_0);

                    pushFollow(FOLLOW_transformation_in_action1189);
                    transformation121=transformation();

                    state._fsp--;

                    adaptor.addChild(root_0, transformation121.getTree());
                    OF122=(Token)match(input,OF,FOLLOW_OF_in_action1191); 
                    pushFollow(FOLLOW_accesClasse_in_action1194);
                    accesClasse123=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse123.getTree());
                    pushFollow(FOLLOW_coordinates_in_action1196);
                    coordinates124=coordinates();

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates124.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:4: ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:4: ( EFFACE_KW | GENERATE_KW )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==EFFACE_KW) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==GENERATE_KW) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:5: EFFACE_KW
                            {
                            EFFACE_KW125=(Token)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1202); 
                            EFFACE_KW125_tree = (CommonTree)adaptor.create(EFFACE_KW125);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACE_KW125_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:18: GENERATE_KW
                            {
                            GENERATE_KW126=(Token)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1207); 
                            GENERATE_KW126_tree = (CommonTree)adaptor.create(GENERATE_KW126);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATE_KW126_tree, root_0);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:32: ( accesLocal | operation ( IDENT | accesGlobal ) )
                    int alt41=2;
                    switch ( input.LA(1) ) {
                    case IDENT:
                        {
                        int LA41_1 = input.LA(2);

                        if ( (LA41_1==OF) ) {
                            alt41=2;
                        }
                        else if ( (LA41_1==EOF||LA41_1==FIN||LA41_1==VIRG||LA41_1==AT||LA41_1==IN||LA41_1==DEFINITION_KW||LA41_1==ON||LA41_1==ENDWAIT||LA41_1==COMMAND_KW||LA41_1==RULE_KW||(LA41_1>=ELSE && LA41_1<=ENDIF)||LA41_1==IA_KW) ) {
                            alt41=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLAYER:
                    case NUM:
                        {
                        alt41=1;
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
                        alt41=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:33: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_action1212);
                            accesLocal127=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal127.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:46: operation ( IDENT | accesGlobal )
                            {
                            pushFollow(FOLLOW_operation_in_action1216);
                            operation128=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation128.getTree());
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:56: ( IDENT | accesGlobal )
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==IDENT) ) {
                                alt40=1;
                            }
                            else if ( (LA40_0==CAMERA||LA40_0==MEDIA||(LA40_0>=ALLY && LA40_0<=NEUTRAL)||LA40_0==PG||(LA40_0>=COUNTER && LA40_0<=TELEPORTER)) ) {
                                alt40=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 0, input);

                                throw nvae;
                            }
                            switch (alt40) {
                                case 1 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:57: IDENT
                                    {
                                    IDENT129=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1219); 
                                    IDENT129_tree = (CommonTree)adaptor.create(IDENT129);
                                    adaptor.addChild(root_0, IDENT129_tree);


                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:65: accesGlobal
                                    {
                                    pushFollow(FOLLOW_accesGlobal_in_action1223);
                                    accesGlobal130=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal130.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:79: ( ( IN | ON ) accesLocal | AT coordinates )?
                    int alt43=3;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==IN||LA43_0==ON) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==AT) ) {
                        alt43=2;
                    }
                    switch (alt43) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:80: ( IN | ON ) accesLocal
                            {
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:80: ( IN | ON )
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==IN) ) {
                                alt42=1;
                            }
                            else if ( (LA42_0==ON) ) {
                                alt42=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 42, 0, input);

                                throw nvae;
                            }
                            switch (alt42) {
                                case 1 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:81: IN
                                    {
                                    IN131=(Token)match(input,IN,FOLLOW_IN_in_action1229); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:85: ON
                                    {
                                    ON132=(Token)match(input,ON,FOLLOW_ON_in_action1232); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_action1236);
                            accesLocal133=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal133.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:103: AT coordinates
                            {
                            AT134=(Token)match(input,AT,FOLLOW_AT_in_action1240); 
                            pushFollow(FOLLOW_coordinates_in_action1243);
                            coordinates135=coordinates();

                            state._fsp--;

                            adaptor.addChild(root_0, coordinates135.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:4: WAIT_KW operation timeUnit THEN consequences ENDWAIT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAIT_KW136=(Token)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1250); 
                    WAIT_KW136_tree = (CommonTree)adaptor.create(WAIT_KW136);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAIT_KW136_tree, root_0);

                    pushFollow(FOLLOW_operation_in_action1253);
                    operation137=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation137.getTree());
                    pushFollow(FOLLOW_timeUnit_in_action1255);
                    timeUnit138=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit138.getTree());
                    THEN139=(Token)match(input,THEN,FOLLOW_THEN_in_action1257); 
                    pushFollow(FOLLOW_consequences_in_action1260);
                    consequences140=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences140.getTree());
                    ENDWAIT141=(Token)match(input,ENDWAIT,FOLLOW_ENDWAIT_in_action1262); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:172:4: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAVE_KW142=(Token)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1268); 
                    SAVE_KW142_tree = (CommonTree)adaptor.create(SAVE_KW142);
                    adaptor.addChild(root_0, SAVE_KW142_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:175:1: actionObjet : ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) );
    public final hightParser.actionObjet_return actionObjet() throws RecognitionException {
        hightParser.actionObjet_return retval = new hightParser.actionObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIES_KW143=null;
        Token DURING146=null;
        Token UNTIL149=null;
        Token EQUIP151=null;
        Token NEXT153=null;
        Token PREVIOUS154=null;
        hightParser.actionCommandePressee_return actionCommandePressee144 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue145 = null;

        hightParser.operation_return operation147 = null;

        hightParser.timeUnit_return timeUnit148 = null;

        hightParser.conditions_return conditions150 = null;

        hightParser.accesLocal_return accesLocal152 = null;


        CommonTree DIES_KW143_tree=null;
        CommonTree DURING146_tree=null;
        CommonTree UNTIL149_tree=null;
        CommonTree EQUIP151_tree=null;
        CommonTree NEXT153_tree=null;
        CommonTree PREVIOUS154_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:175:13: ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case DIES_KW:
                {
                alt47=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt47=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt47=3;
                }
                break;
            case EQUIP:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:3: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DIES_KW143=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1280); 
                    DIES_KW143_tree = (CommonTree)adaptor.create(DIES_KW143);
                    adaptor.addChild(root_0, DIES_KW143_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:177:5: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1286);
                    actionCommandePressee144=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee144.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:178:5: actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1292);
                    actionCommandeMaintenue145=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue145.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:178:29: ( DURING operation timeUnit | UNTIL conditions )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==DURING) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==UNTIL) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:178:30: DURING operation timeUnit
                            {
                            DURING146=(Token)match(input,DURING,FOLLOW_DURING_in_actionObjet1295); 
                            DURING146_tree = (CommonTree)adaptor.create(DURING146);
                            root_0 = (CommonTree)adaptor.becomeRoot(DURING146_tree, root_0);

                            pushFollow(FOLLOW_operation_in_actionObjet1298);
                            operation147=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation147.getTree());
                            pushFollow(FOLLOW_timeUnit_in_actionObjet1300);
                            timeUnit148=timeUnit();

                            state._fsp--;

                            adaptor.addChild(root_0, timeUnit148.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:178:59: UNTIL conditions
                            {
                            UNTIL149=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1304); 
                            UNTIL149_tree = (CommonTree)adaptor.create(UNTIL149);
                            root_0 = (CommonTree)adaptor.becomeRoot(UNTIL149_tree, root_0);

                            pushFollow(FOLLOW_conditions_in_actionObjet1307);
                            conditions150=conditions();

                            state._fsp--;

                            adaptor.addChild(root_0, conditions150.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:179:5: EQUIP ( accesLocal | NEXT | PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EQUIP151=(Token)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1314); 
                    EQUIP151_tree = (CommonTree)adaptor.create(EQUIP151);
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUIP151_tree, root_0);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:179:12: ( accesLocal | NEXT | PREVIOUS )
                    int alt46=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case PLAYER:
                    case NUM:
                        {
                        alt46=1;
                        }
                        break;
                    case NEXT:
                        {
                        alt46=2;
                        }
                        break;
                    case PREVIOUS:
                        {
                        alt46=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }

                    switch (alt46) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:179:13: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_actionObjet1318);
                            accesLocal152=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal152.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:179:26: NEXT
                            {
                            NEXT153=(Token)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1322); 
                            NEXT153_tree = (CommonTree)adaptor.create(NEXT153);
                            adaptor.addChild(root_0, NEXT153_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:179:33: PREVIOUS
                            {
                            PREVIOUS154=(Token)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1326); 
                            PREVIOUS154_tree = (CommonTree)adaptor.create(PREVIOUS154);
                            adaptor.addChild(root_0, PREVIOUS154_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:182:1: transformation : ( TRANSLATION | ROTATION | SCALE );
    public final hightParser.transformation_return transformation() throws RecognitionException {
        hightParser.transformation_return retval = new hightParser.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set155=null;

        CommonTree set155_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:182:16: ( TRANSLATION | ROTATION | SCALE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set155=(Token)input.LT(1);
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set155));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:188:1: coordinates : operation operation operation -> ^( COORDINATE_KW operation operation operation ) ;
    public final hightParser.coordinates_return coordinates() throws RecognitionException {
        hightParser.coordinates_return retval = new hightParser.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hightParser.operation_return operation156 = null;

        hightParser.operation_return operation157 = null;

        hightParser.operation_return operation158 = null;


        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:188:13: ( operation operation operation -> ^( COORDINATE_KW operation operation operation ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:189:2: operation operation operation
            {
            pushFollow(FOLLOW_operation_in_coordinates1366);
            operation156=operation();

            state._fsp--;

            stream_operation.add(operation156.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1368);
            operation157=operation();

            state._fsp--;

            stream_operation.add(operation157.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1370);
            operation158=operation();

            state._fsp--;

            stream_operation.add(operation158.getTree());


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
            // 190:4: -> ^( COORDINATE_KW operation operation operation )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:190:7: ^( COORDINATE_KW operation operation operation )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:195:1: commande : COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )* ;
    public final hightParser.commande_return commande() throws RecognitionException {
        hightParser.commande_return retval = new hightParser.commande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMAND_KW159=null;
        Token IDENT160=null;
        Token IS161=null;
        Token VIRG163=null;
        hightParser.actionCommande_return actionCommande162 = null;

        hightParser.actionCommande_return actionCommande164 = null;


        CommonTree COMMAND_KW159_tree=null;
        CommonTree IDENT160_tree=null;
        CommonTree IS161_tree=null;
        CommonTree VIRG163_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:195:10: ( COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:196:2: COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )*
            {
            root_0 = (CommonTree)adaptor.nil();

            COMMAND_KW159=(Token)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1399); 
            COMMAND_KW159_tree = (CommonTree)adaptor.create(COMMAND_KW159);
            root_0 = (CommonTree)adaptor.becomeRoot(COMMAND_KW159_tree, root_0);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:196:14: ( IDENT IS )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IDENT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:196:15: IDENT IS
                    {
                    IDENT160=(Token)match(input,IDENT,FOLLOW_IDENT_in_commande1403); 
                    IDENT160_tree = (CommonTree)adaptor.create(IDENT160);
                    adaptor.addChild(root_0, IDENT160_tree);

                    IS161=(Token)match(input,IS,FOLLOW_IS_in_commande1405); 

                    }
                    break;

            }

            pushFollow(FOLLOW_actionCommande_in_commande1410);
            actionCommande162=actionCommande();

            state._fsp--;

            adaptor.addChild(root_0, actionCommande162.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:196:42: ( VIRG actionCommande )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==VIRG) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:196:43: VIRG actionCommande
            	    {
            	    VIRG163=(Token)match(input,VIRG,FOLLOW_VIRG_in_commande1413); 
            	    pushFollow(FOLLOW_actionCommande_in_commande1416);
            	    actionCommande164=actionCommande();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionCommande164.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:199:1: actionCommande : ( MOUSE_KW souris | KEY_KW clavier ) FOR actionCommandeType ;
    public final hightParser.actionCommande_return actionCommande() throws RecognitionException {
        hightParser.actionCommande_return retval = new hightParser.actionCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOUSE_KW165=null;
        Token KEY_KW167=null;
        Token FOR169=null;
        hightParser.souris_return souris166 = null;

        hightParser.clavier_return clavier168 = null;

        hightParser.actionCommandeType_return actionCommandeType170 = null;


        CommonTree MOUSE_KW165_tree=null;
        CommonTree KEY_KW167_tree=null;
        CommonTree FOR169_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:199:16: ( ( MOUSE_KW souris | KEY_KW clavier ) FOR actionCommandeType )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:200:2: ( MOUSE_KW souris | KEY_KW clavier ) FOR actionCommandeType
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:200:2: ( MOUSE_KW souris | KEY_KW clavier )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==MOUSE_KW) ) {
                alt50=1;
            }
            else if ( (LA50_0==KEY_KW) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:200:3: MOUSE_KW souris
                    {
                    MOUSE_KW165=(Token)match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_actionCommande1430); 
                    MOUSE_KW165_tree = (CommonTree)adaptor.create(MOUSE_KW165);
                    root_0 = (CommonTree)adaptor.becomeRoot(MOUSE_KW165_tree, root_0);

                    pushFollow(FOLLOW_souris_in_actionCommande1433);
                    souris166=souris();

                    state._fsp--;

                    adaptor.addChild(root_0, souris166.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:200:22: KEY_KW clavier
                    {
                    KEY_KW167=(Token)match(input,KEY_KW,FOLLOW_KEY_KW_in_actionCommande1437); 
                    KEY_KW167_tree = (CommonTree)adaptor.create(KEY_KW167);
                    root_0 = (CommonTree)adaptor.becomeRoot(KEY_KW167_tree, root_0);

                    pushFollow(FOLLOW_clavier_in_actionCommande1440);
                    clavier168=clavier();

                    state._fsp--;

                    adaptor.addChild(root_0, clavier168.getTree());

                    }
                    break;

            }

            FOR169=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande1443); 
            pushFollow(FOLLOW_actionCommandeType_in_actionCommande1446);
            actionCommandeType170=actionCommandeType();

            state._fsp--;

            adaptor.addChild(root_0, actionCommandeType170.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:203:1: actionCommandeType : ( IDENT | actionCommandePressee | actionCommandeMaintenue );
    public final hightParser.actionCommandeType_return actionCommandeType() throws RecognitionException {
        hightParser.actionCommandeType_return retval = new hightParser.actionCommandeType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT171=null;
        hightParser.actionCommandePressee_return actionCommandePressee172 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue173 = null;


        CommonTree IDENT171_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:203:20: ( IDENT | actionCommandePressee | actionCommandeMaintenue )
            int alt51=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt51=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt51=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:204:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT171=(Token)match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1458); 
                    IDENT171_tree = (CommonTree)adaptor.create(IDENT171);
                    adaptor.addChild(root_0, IDENT171_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:204:10: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1462);
                    actionCommandePressee172=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee172.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:204:34: actionCommandeMaintenue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1466);
                    actionCommandeMaintenue173=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue173.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:207:1: souris : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final hightParser.souris_return souris() throws RecognitionException {
        hightParser.souris_return retval = new hightParser.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set174=null;

        CommonTree set174_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:207:8: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set174=(Token)input.LT(1);
            if ( (input.LA(1)>=WUP && input.LA(1)<=SCROLL_DOWN) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set174));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:211:1: clavier : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final hightParser.clavier_return clavier() throws RecognitionException {
        hightParser.clavier_return retval = new hightParser.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set175=null;

        CommonTree set175_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:211:9: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set175=(Token)input.LT(1);
            if ( (input.LA(1)>=WUP && input.LA(1)<=RIGHT)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set175));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:215:1: actionCommandePressee : ( JUMP operation | PAUSE_KW | STOP_KW );
    public final hightParser.actionCommandePressee_return actionCommandePressee() throws RecognitionException {
        hightParser.actionCommandePressee_return retval = new hightParser.actionCommandePressee_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token JUMP176=null;
        Token PAUSE_KW178=null;
        Token STOP_KW179=null;
        hightParser.operation_return operation177 = null;


        CommonTree JUMP176_tree=null;
        CommonTree PAUSE_KW178_tree=null;
        CommonTree STOP_KW179_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:215:23: ( JUMP operation | PAUSE_KW | STOP_KW )
            int alt52=3;
            switch ( input.LA(1) ) {
            case JUMP:
                {
                alt52=1;
                }
                break;
            case PAUSE_KW:
                {
                alt52=2;
                }
                break;
            case STOP_KW:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:216:3: JUMP operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    JUMP176=(Token)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1578); 
                    JUMP176_tree = (CommonTree)adaptor.create(JUMP176);
                    adaptor.addChild(root_0, JUMP176_tree);

                    pushFollow(FOLLOW_operation_in_actionCommandePressee1580);
                    operation177=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation177.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:217:5: PAUSE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PAUSE_KW178=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1586); 
                    PAUSE_KW178_tree = (CommonTree)adaptor.create(PAUSE_KW178);
                    adaptor.addChild(root_0, PAUSE_KW178_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:218:5: STOP_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STOP_KW179=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1592); 
                    STOP_KW179_tree = (CommonTree)adaptor.create(STOP_KW179);
                    adaptor.addChild(root_0, STOP_KW179_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:221:1: actionCommandeMaintenue : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
    public final hightParser.actionCommandeMaintenue_return actionCommandeMaintenue() throws RecognitionException {
        hightParser.actionCommandeMaintenue_return retval = new hightParser.actionCommandeMaintenue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVE180=null;
        Token set181=null;
        Token TURN182=null;
        Token set183=null;
        Token ACCELERATE184=null;
        Token BRAKE185=null;

        CommonTree MOVE180_tree=null;
        CommonTree set181_tree=null;
        CommonTree TURN182_tree=null;
        CommonTree set183_tree=null;
        CommonTree ACCELERATE184_tree=null;
        CommonTree BRAKE185_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:221:25: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
            int alt53=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt53=1;
                }
                break;
            case TURN:
                {
                alt53=2;
                }
                break;
            case ACCELERATE:
                {
                alt53=3;
                }
                break;
            case BRAKE:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:222:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MOVE180=(Token)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1607); 
                    MOVE180_tree = (CommonTree)adaptor.create(MOVE180);
                    adaptor.addChild(root_0, MOVE180_tree);

                    set181=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=FORWARD && input.LA(1)<=BACKWARD) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set181));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:223:5: TURN ( LEFT | RIGHT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURN182=(Token)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1629); 
                    TURN182_tree = (CommonTree)adaptor.create(TURN182);
                    adaptor.addChild(root_0, TURN182_tree);

                    set183=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set183));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:224:5: ACCELERATE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACCELERATE184=(Token)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1643); 
                    ACCELERATE184_tree = (CommonTree)adaptor.create(ACCELERATE184);
                    adaptor.addChild(root_0, ACCELERATE184_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:225:5: BRAKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BRAKE185=(Token)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1649); 
                    BRAKE185_tree = (CommonTree)adaptor.create(BRAKE185);
                    adaptor.addChild(root_0, BRAKE185_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:228:1: activCommande : ( ACTIVATE_KW | DISABLE_KW ) ( COMMANDS | MOUSE_KW ( souris ( VIRG souris )* )? | KEY_KW clavier ( VIRG clavier )* | KEYBOARD ) ;
    public final hightParser.activCommande_return activCommande() throws RecognitionException {
        hightParser.activCommande_return retval = new hightParser.activCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ACTIVATE_KW186=null;
        Token DISABLE_KW187=null;
        Token COMMANDS188=null;
        Token MOUSE_KW189=null;
        Token VIRG191=null;
        Token KEY_KW193=null;
        Token VIRG195=null;
        Token KEYBOARD197=null;
        hightParser.souris_return souris190 = null;

        hightParser.souris_return souris192 = null;

        hightParser.clavier_return clavier194 = null;

        hightParser.clavier_return clavier196 = null;


        CommonTree ACTIVATE_KW186_tree=null;
        CommonTree DISABLE_KW187_tree=null;
        CommonTree COMMANDS188_tree=null;
        CommonTree MOUSE_KW189_tree=null;
        CommonTree VIRG191_tree=null;
        CommonTree KEY_KW193_tree=null;
        CommonTree VIRG195_tree=null;
        CommonTree KEYBOARD197_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:228:15: ( ( ACTIVATE_KW | DISABLE_KW ) ( COMMANDS | MOUSE_KW ( souris ( VIRG souris )* )? | KEY_KW clavier ( VIRG clavier )* | KEYBOARD ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:3: ( ACTIVATE_KW | DISABLE_KW ) ( COMMANDS | MOUSE_KW ( souris ( VIRG souris )* )? | KEY_KW clavier ( VIRG clavier )* | KEYBOARD )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:3: ( ACTIVATE_KW | DISABLE_KW )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ACTIVATE_KW) ) {
                alt54=1;
            }
            else if ( (LA54_0==DISABLE_KW) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:4: ACTIVATE_KW
                    {
                    ACTIVATE_KW186=(Token)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1665); 
                    ACTIVATE_KW186_tree = (CommonTree)adaptor.create(ACTIVATE_KW186);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW186_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:19: DISABLE_KW
                    {
                    DISABLE_KW187=(Token)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1670); 
                    DISABLE_KW187_tree = (CommonTree)adaptor.create(DISABLE_KW187);
                    root_0 = (CommonTree)adaptor.becomeRoot(DISABLE_KW187_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:32: ( COMMANDS | MOUSE_KW ( souris ( VIRG souris )* )? | KEY_KW clavier ( VIRG clavier )* | KEYBOARD )
            int alt58=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt58=1;
                }
                break;
            case MOUSE_KW:
                {
                alt58=2;
                }
                break;
            case KEY_KW:
                {
                alt58=3;
                }
                break;
            case KEYBOARD:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:33: COMMANDS
                    {
                    COMMANDS188=(Token)match(input,COMMANDS,FOLLOW_COMMANDS_in_activCommande1675); 
                    COMMANDS188_tree = (CommonTree)adaptor.create(COMMANDS188);
                    adaptor.addChild(root_0, COMMANDS188_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:44: MOUSE_KW ( souris ( VIRG souris )* )?
                    {
                    MOUSE_KW189=(Token)match(input,MOUSE_KW,FOLLOW_MOUSE_KW_in_activCommande1679); 
                    MOUSE_KW189_tree = (CommonTree)adaptor.create(MOUSE_KW189);
                    adaptor.addChild(root_0, MOUSE_KW189_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:53: ( souris ( VIRG souris )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( ((LA56_0>=WUP && LA56_0<=SCROLL_DOWN)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:54: souris ( VIRG souris )*
                            {
                            pushFollow(FOLLOW_souris_in_activCommande1682);
                            souris190=souris();

                            state._fsp--;

                            adaptor.addChild(root_0, souris190.getTree());
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:61: ( VIRG souris )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==VIRG) ) {
                                    int LA55_1 = input.LA(2);

                                    if ( ((LA55_1>=WUP && LA55_1<=SCROLL_DOWN)) ) {
                                        alt55=1;
                                    }


                                }


                                switch (alt55) {
                            	case 1 :
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:62: VIRG souris
                            	    {
                            	    VIRG191=(Token)match(input,VIRG,FOLLOW_VIRG_in_activCommande1685); 
                            	    pushFollow(FOLLOW_souris_in_activCommande1688);
                            	    souris192=souris();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, souris192.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:81: KEY_KW clavier ( VIRG clavier )*
                    {
                    KEY_KW193=(Token)match(input,KEY_KW,FOLLOW_KEY_KW_in_activCommande1696); 
                    KEY_KW193_tree = (CommonTree)adaptor.create(KEY_KW193);
                    adaptor.addChild(root_0, KEY_KW193_tree);

                    pushFollow(FOLLOW_clavier_in_activCommande1698);
                    clavier194=clavier();

                    state._fsp--;

                    adaptor.addChild(root_0, clavier194.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:96: ( VIRG clavier )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==VIRG) ) {
                            int LA57_1 = input.LA(2);

                            if ( ((LA57_1>=WUP && LA57_1<=RIGHT)||(LA57_1>=LETTER && LA57_1<=ENTER)) ) {
                                alt57=1;
                            }


                        }


                        switch (alt57) {
                    	case 1 :
                    	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:97: VIRG clavier
                    	    {
                    	    VIRG195=(Token)match(input,VIRG,FOLLOW_VIRG_in_activCommande1701); 
                    	    pushFollow(FOLLOW_clavier_in_activCommande1704);
                    	    clavier196=clavier();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, clavier196.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:229:115: KEYBOARD
                    {
                    KEYBOARD197=(Token)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_activCommande1710); 
                    KEYBOARD197_tree = (CommonTree)adaptor.create(KEYBOARD197);
                    adaptor.addChild(root_0, KEYBOARD197_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:232:1: reglesJeu : RULE_KW ( IDENT IS )? declencheur THEN consequences ;
    public final hightParser.reglesJeu_return reglesJeu() throws RecognitionException {
        hightParser.reglesJeu_return retval = new hightParser.reglesJeu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RULE_KW198=null;
        Token IDENT199=null;
        Token IS200=null;
        Token THEN202=null;
        hightParser.declencheur_return declencheur201 = null;

        hightParser.consequences_return consequences203 = null;


        CommonTree RULE_KW198_tree=null;
        CommonTree IDENT199_tree=null;
        CommonTree IS200_tree=null;
        CommonTree THEN202_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:232:11: ( RULE_KW ( IDENT IS )? declencheur THEN consequences )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:233:3: RULE_KW ( IDENT IS )? declencheur THEN consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            RULE_KW198=(Token)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1725); 
            RULE_KW198_tree = (CommonTree)adaptor.create(RULE_KW198);
            root_0 = (CommonTree)adaptor.becomeRoot(RULE_KW198_tree, root_0);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:233:12: ( IDENT IS )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IDENT) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==IS) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:233:13: IDENT IS
                    {
                    IDENT199=(Token)match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1729); 
                    IDENT199_tree = (CommonTree)adaptor.create(IDENT199);
                    adaptor.addChild(root_0, IDENT199_tree);

                    IS200=(Token)match(input,IS,FOLLOW_IS_in_reglesJeu1731); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu1737);
            declencheur201=declencheur();

            state._fsp--;

            adaptor.addChild(root_0, declencheur201.getTree());
            THEN202=(Token)match(input,THEN,FOLLOW_THEN_in_reglesJeu1739); 
            pushFollow(FOLLOW_consequences_in_reglesJeu1742);
            consequences203=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences203.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:236:1: declencheur : ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW );
    public final hightParser.declencheur_return declencheur() throws RecognitionException {
        hightParser.declencheur_return retval = new hightParser.declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVES_KW205=null;
        Token DIES_KW206=null;
        Token set209=null;
        Token ENDS_KW210=null;
        Token STARTS_KW211=null;
        Token BECOMES213=null;
        Token IDENT215=null;
        Token BECOMES216=null;
        Token VICTORY_KW218=null;
        Token DEFEAT_KW219=null;
        hightParser.accesClasse_return accesClasse204 = null;

        hightParser.declencheurTK_return declencheurTK207 = null;

        hightParser.declencheurKT_return declencheurKT208 = null;

        hightParser.variable_return variable212 = null;

        hightParser.varOuNB_return varOuNB214 = null;

        hightParser.playerOuInteraction_return playerOuInteraction217 = null;


        CommonTree MOVES_KW205_tree=null;
        CommonTree DIES_KW206_tree=null;
        CommonTree set209_tree=null;
        CommonTree ENDS_KW210_tree=null;
        CommonTree STARTS_KW211_tree=null;
        CommonTree BECOMES213_tree=null;
        CommonTree IDENT215_tree=null;
        CommonTree BECOMES216_tree=null;
        CommonTree VICTORY_KW218_tree=null;
        CommonTree DEFEAT_KW219_tree=null;
        RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_varOuNB=new RewriteRuleSubtreeStream(adaptor,"rule varOuNB");
        RewriteRuleSubtreeStream stream_playerOuInteraction=new RewriteRuleSubtreeStream(adaptor,"rule playerOuInteraction");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:236:13: ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW )
            int alt62=6;
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
                alt62=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case OF:
                    {
                    alt62=3;
                    }
                    break;
                case BECOMES:
                    {
                    alt62=4;
                    }
                    break;
                case DIES_KW:
                case MOVES_KW:
                case TOUCHES_KW:
                case KILLS_KW:
                case KILLED_KW:
                case TOUCHED_KW:
                    {
                    alt62=1;
                    }
                    break;
                case ENDS_KW:
                case STARTS_KW:
                    {
                    alt62=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 2, input);

                    throw nvae;
                }

                }
                break;
            case GAME:
                {
                alt62=2;
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
                alt62=3;
                }
                break;
            case VICTORY_KW:
                {
                alt62=5;
                }
                break;
            case DEFEAT_KW:
                {
                alt62=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:237:3: accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_declencheur1756);
                    accesClasse204=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse204.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:237:15: ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    int alt60=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt60=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt60=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                        {
                        alt60=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:237:16: MOVES_KW
                            {
                            MOVES_KW205=(Token)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1759); 
                            MOVES_KW205_tree = (CommonTree)adaptor.create(MOVES_KW205);
                            adaptor.addChild(root_0, MOVES_KW205_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:237:27: DIES_KW
                            {
                            DIES_KW206=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1763); 
                            DIES_KW206_tree = (CommonTree)adaptor.create(DIES_KW206);
                            adaptor.addChild(root_0, DIES_KW206_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:237:37: declencheurTK
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1767);
                            declencheurTK207=declencheurTK();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK207.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:237:53: declencheurKT
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1771);
                            declencheurKT208=declencheurKT();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT208.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:238:5: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set209=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set209));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:238:20: ( ENDS_KW | STARTS_KW )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ENDS_KW) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==STARTS_KW) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:238:21: ENDS_KW
                            {
                            ENDS_KW210=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1788); 
                            ENDS_KW210_tree = (CommonTree)adaptor.create(ENDS_KW210);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW210_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:238:31: STARTS_KW
                            {
                            STARTS_KW211=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1792); 
                            STARTS_KW211_tree = (CommonTree)adaptor.create(STARTS_KW211);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW211_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:239:5: variable BECOMES varOuNB
                    {
                    pushFollow(FOLLOW_variable_in_declencheur1810);
                    variable212=variable();

                    state._fsp--;

                    stream_variable.add(variable212.getTree());
                    BECOMES213=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1812);  
                    stream_BECOMES.add(BECOMES213);

                    pushFollow(FOLLOW_varOuNB_in_declencheur1814);
                    varOuNB214=varOuNB();

                    state._fsp--;

                    stream_varOuNB.add(varOuNB214.getTree());


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
                    // 240:5: -> ^( BECOMES_VAR_KW variable varOuNB )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:240:8: ^( BECOMES_VAR_KW variable varOuNB )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:241:5: IDENT BECOMES playerOuInteraction
                    {
                    IDENT215=(Token)match(input,IDENT,FOLLOW_IDENT_in_declencheur1834);  
                    stream_IDENT.add(IDENT215);

                    BECOMES216=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1836);  
                    stream_BECOMES.add(BECOMES216);

                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1838);
                    playerOuInteraction217=playerOuInteraction();

                    state._fsp--;

                    stream_playerOuInteraction.add(playerOuInteraction217.getTree());


                    // AST REWRITE
                    // elements: IDENT, playerOuInteraction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 242:5: -> ^( BECOMES_ID_KW IDENT playerOuInteraction )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:242:8: ^( BECOMES_ID_KW IDENT playerOuInteraction )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:243:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW218=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur1858); 
                    VICTORY_KW218_tree = (CommonTree)adaptor.create(VICTORY_KW218);
                    adaptor.addChild(root_0, VICTORY_KW218_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:244:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW219=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur1864); 
                    DEFEAT_KW219_tree = (CommonTree)adaptor.create(DEFEAT_KW219);
                    adaptor.addChild(root_0, DEFEAT_KW219_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:247:1: varOuNB : ( variable | FLOAT );
    public final hightParser.varOuNB_return varOuNB() throws RecognitionException {
        hightParser.varOuNB_return retval = new hightParser.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FLOAT221=null;
        hightParser.variable_return variable220 = null;


        CommonTree FLOAT221_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:247:9: ( variable | FLOAT )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=SCORE && LA63_0<=IDENT)||(LA63_0>=X && LA63_0<=VALUE)||(LA63_0>=MASS && LA63_0<=MOVE_WITH_CAMERA)) ) {
                alt63=1;
            }
            else if ( (LA63_0==FLOAT) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:247:11: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_varOuNB1875);
                    variable220=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable220.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:247:22: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT221=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB1879); 
                    FLOAT221_tree = (CommonTree)adaptor.create(FLOAT221);
                    adaptor.addChild(root_0, FLOAT221_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:249:1: playerOuInteraction : ( PLAYER | interaction ) ;
    public final hightParser.playerOuInteraction_return playerOuInteraction() throws RecognitionException {
        hightParser.playerOuInteraction_return retval = new hightParser.playerOuInteraction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER222=null;
        hightParser.interaction_return interaction223 = null;


        CommonTree PLAYER222_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:250:2: ( ( PLAYER | interaction ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:250:4: ( PLAYER | interaction )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:250:4: ( PLAYER | interaction )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==PLAYER) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=ALLY && LA64_0<=NEUTRAL)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:250:5: PLAYER
                    {
                    PLAYER222=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction1889); 
                    PLAYER222_tree = (CommonTree)adaptor.create(PLAYER222);
                    adaptor.addChild(root_0, PLAYER222_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:250:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction1892);
                    interaction223=interaction();

                    state._fsp--;

                    adaptor.addChild(root_0, interaction223.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:252:1: declencheurTK : ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) ;
    public final hightParser.declencheurTK_return declencheurTK() throws RecognitionException {
        hightParser.declencheurTK_return retval = new hightParser.declencheurTK_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOUCHES_KW224=null;
        Token KILLS_KW225=null;
        Token OTHER226=null;
        hightParser.accesGlobal_return accesGlobal227 = null;

        hightParser.accesLocal_return accesLocal228 = null;


        CommonTree TOUCHES_KW224_tree=null;
        CommonTree KILLS_KW225_tree=null;
        CommonTree OTHER226_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:2: ( ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:4: ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:4: ( TOUCHES_KW | KILLS_KW )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==TOUCHES_KW) ) {
                alt65=1;
            }
            else if ( (LA65_0==KILLS_KW) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:5: TOUCHES_KW
                    {
                    TOUCHES_KW224=(Token)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK1904); 
                    TOUCHES_KW224_tree = (CommonTree)adaptor.create(TOUCHES_KW224);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW224_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:19: KILLS_KW
                    {
                    KILLS_KW225=(Token)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK1909); 
                    KILLS_KW225_tree = (CommonTree)adaptor.create(KILLS_KW225);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLS_KW225_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:30: ( ( OTHER )? accesGlobal | accesLocal )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==CAMERA||LA67_0==MEDIA||(LA67_0>=ALLY && LA67_0<=NEUTRAL)||LA67_0==OTHER||LA67_0==PG||(LA67_0>=COUNTER && LA67_0<=TELEPORTER)) ) {
                alt67=1;
            }
            else if ( (LA67_0==IDENT||LA67_0==PLAYER||LA67_0==NUM) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:31: ( OTHER )? accesGlobal
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:31: ( OTHER )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==OTHER) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:32: OTHER
                            {
                            OTHER226=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurTK1915); 
                            OTHER226_tree = (CommonTree)adaptor.create(OTHER226);
                            adaptor.addChild(root_0, OTHER226_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesGlobal_in_declencheurTK1919);
                    accesGlobal227=accesGlobal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal227.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:54: accesLocal
                    {
                    pushFollow(FOLLOW_accesLocal_in_declencheurTK1923);
                    accesLocal228=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal228.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:255:1: declencheurKT : ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? ;
    public final hightParser.declencheurKT_return declencheurKT() throws RecognitionException {
        hightParser.declencheurKT_return retval = new hightParser.declencheurKT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KILLED_KW229=null;
        Token TOUCHED_KW230=null;
        Token BY231=null;
        Token OTHER232=null;
        hightParser.accesGlobal_return accesGlobal233 = null;

        hightParser.accesLocal_return accesLocal234 = null;


        CommonTree KILLED_KW229_tree=null;
        CommonTree TOUCHED_KW230_tree=null;
        CommonTree BY231_tree=null;
        CommonTree OTHER232_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:2: ( ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:4: ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:4: ( KILLED_KW | TOUCHED_KW )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==KILLED_KW) ) {
                alt68=1;
            }
            else if ( (LA68_0==TOUCHED_KW) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:5: KILLED_KW
                    {
                    KILLED_KW229=(Token)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT1935); 
                    KILLED_KW229_tree = (CommonTree)adaptor.create(KILLED_KW229);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLED_KW229_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:18: TOUCHED_KW
                    {
                    TOUCHED_KW230=(Token)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT1940); 
                    TOUCHED_KW230_tree = (CommonTree)adaptor.create(TOUCHED_KW230);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW230_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:31: ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==BY) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:32: BY ( ( OTHER )? accesGlobal | accesLocal )
                    {
                    BY231=(Token)match(input,BY,FOLLOW_BY_in_declencheurKT1945); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:36: ( ( OTHER )? accesGlobal | accesLocal )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==CAMERA||LA70_0==MEDIA||(LA70_0>=ALLY && LA70_0<=NEUTRAL)||LA70_0==OTHER||LA70_0==PG||(LA70_0>=COUNTER && LA70_0<=TELEPORTER)) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==IDENT||LA70_0==PLAYER||LA70_0==NUM) ) {
                        alt70=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:37: ( OTHER )? accesGlobal
                            {
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:37: ( OTHER )?
                            int alt69=2;
                            int LA69_0 = input.LA(1);

                            if ( (LA69_0==OTHER) ) {
                                alt69=1;
                            }
                            switch (alt69) {
                                case 1 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:38: OTHER
                                    {
                                    OTHER232=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurKT1950); 
                                    OTHER232_tree = (CommonTree)adaptor.create(OTHER232);
                                    adaptor.addChild(root_0, OTHER232_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesGlobal_in_declencheurKT1954);
                            accesGlobal233=accesGlobal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesGlobal233.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:60: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_declencheurKT1958);
                            accesLocal234=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal234.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:1: siAlors : IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF ;
    public final hightParser.siAlors_return siAlors() throws RecognitionException {
        hightParser.siAlors_return retval = new hightParser.siAlors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF_KW235=null;
        Token THEN237=null;
        Token ELSE239=null;
        Token ENDIF241=null;
        hightParser.conditions_return conditions236 = null;

        hightParser.consequences_return consequences238 = null;

        hightParser.consequences_return consequences240 = null;


        CommonTree IF_KW235_tree=null;
        CommonTree THEN237_tree=null;
        CommonTree ELSE239_tree=null;
        CommonTree ENDIF241_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:9: ( IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:260:3: IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF_KW235=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors1975); 
            IF_KW235_tree = (CommonTree)adaptor.create(IF_KW235);
            root_0 = (CommonTree)adaptor.becomeRoot(IF_KW235_tree, root_0);

            pushFollow(FOLLOW_conditions_in_siAlors1978);
            conditions236=conditions();

            state._fsp--;

            adaptor.addChild(root_0, conditions236.getTree());
            THEN237=(Token)match(input,THEN,FOLLOW_THEN_in_siAlors1980); 
            pushFollow(FOLLOW_consequences_in_siAlors1983);
            consequences238=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences238.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:260:40: ( ELSE consequences )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==ELSE) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:260:41: ELSE consequences
                    {
                    ELSE239=(Token)match(input,ELSE,FOLLOW_ELSE_in_siAlors1986); 
                    pushFollow(FOLLOW_consequences_in_siAlors1989);
                    consequences240=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences240.getTree());

                    }
                    break;

            }

            ENDIF241=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_siAlors1993); 

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:263:1: conditions : ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) ;
    public final hightParser.conditions_return conditions() throws RecognitionException {
        hightParser.conditions_return retval = new hightParser.conditions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT242=null;
        hightParser.conditionOu_return conditionOu243 = null;


        CommonTree NOT242_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_conditionOu=new RewriteRuleSubtreeStream(adaptor,"rule conditionOu");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:263:12: ( ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:3: ( NOT )? conditionOu
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:3: ( NOT )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==NOT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:4: NOT
                    {
                    NOT242=(Token)match(input,NOT,FOLLOW_NOT_in_conditions2008);  
                    stream_NOT.add(NOT242);


                    }
                    break;

            }

            pushFollow(FOLLOW_conditionOu_in_conditions2012);
            conditionOu243=conditionOu();

            state._fsp--;

            stream_conditionOu.add(conditionOu243.getTree());


            // AST REWRITE
            // elements: conditionOu, NOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 265:3: -> ^( CONDITION_KW ( NOT )? conditionOu )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:6: ^( CONDITION_KW ( NOT )? conditionOu )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_KW, "CONDITION_KW"), root_1);

                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:21: ( NOT )?
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:268:1: conditionOu : conditionEt ( OR ( NOT )? conditionOu )? ;
    public final hightParser.conditionOu_return conditionOu() throws RecognitionException {
        hightParser.conditionOu_return retval = new hightParser.conditionOu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR245=null;
        Token NOT246=null;
        hightParser.conditionEt_return conditionEt244 = null;

        hightParser.conditionOu_return conditionOu247 = null;


        CommonTree OR245_tree=null;
        CommonTree NOT246_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:268:13: ( conditionEt ( OR ( NOT )? conditionOu )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:3: conditionEt ( OR ( NOT )? conditionOu )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionEt_in_conditionOu2038);
            conditionEt244=conditionEt();

            state._fsp--;

            adaptor.addChild(root_0, conditionEt244.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:15: ( OR ( NOT )? conditionOu )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==OR) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:16: OR ( NOT )? conditionOu
                    {
                    OR245=(Token)match(input,OR,FOLLOW_OR_in_conditionOu2041); 
                    OR245_tree = (CommonTree)adaptor.create(OR245);
                    root_0 = (CommonTree)adaptor.becomeRoot(OR245_tree, root_0);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:20: ( NOT )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NOT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:21: NOT
                            {
                            NOT246=(Token)match(input,NOT,FOLLOW_NOT_in_conditionOu2045); 
                            NOT246_tree = (CommonTree)adaptor.create(NOT246);
                            adaptor.addChild(root_0, NOT246_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditionOu_in_conditionOu2049);
                    conditionOu247=conditionOu();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionOu247.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:272:1: conditionEt : cond ( AND ( NOT )? conditionEt )? ;
    public final hightParser.conditionEt_return conditionEt() throws RecognitionException {
        hightParser.conditionEt_return retval = new hightParser.conditionEt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND249=null;
        Token NOT250=null;
        hightParser.cond_return cond248 = null;

        hightParser.conditionEt_return conditionEt251 = null;


        CommonTree AND249_tree=null;
        CommonTree NOT250_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:272:13: ( cond ( AND ( NOT )? conditionEt )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:273:3: cond ( AND ( NOT )? conditionEt )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cond_in_conditionEt2065);
            cond248=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond248.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:273:8: ( AND ( NOT )? conditionEt )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==AND) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:273:9: AND ( NOT )? conditionEt
                    {
                    AND249=(Token)match(input,AND,FOLLOW_AND_in_conditionEt2068); 
                    AND249_tree = (CommonTree)adaptor.create(AND249);
                    root_0 = (CommonTree)adaptor.becomeRoot(AND249_tree, root_0);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:273:14: ( NOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NOT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:273:15: NOT
                            {
                            NOT250=(Token)match(input,NOT,FOLLOW_NOT_in_conditionEt2072); 
                            NOT250_tree = (CommonTree)adaptor.create(NOT250);
                            adaptor.addChild(root_0, NOT250_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditionEt_in_conditionEt2076);
                    conditionEt251=conditionEt();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionEt251.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD );
    public final hightParser.cond_return cond() throws RecognitionException {
        hightParser.cond_return retval = new hightParser.cond_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMP253=null;
        Token EQUALS255=null;
        Token INF256=null;
        Token SUP257=null;
        Token INFEG258=null;
        Token SUPED259=null;
        Token DIFF260=null;
        Token PG262=null;
        Token PD264=null;
        hightParser.etat_return etat252 = null;

        hightParser.operation_return operation254 = null;

        hightParser.operation_return operation261 = null;

        hightParser.conditions_return conditions263 = null;


        CommonTree COMP253_tree=null;
        CommonTree EQUALS255_tree=null;
        CommonTree INF256_tree=null;
        CommonTree SUP257_tree=null;
        CommonTree INFEG258_tree=null;
        CommonTree SUPED259_tree=null;
        CommonTree DIFF260_tree=null;
        CommonTree PG262_tree=null;
        CommonTree PD264_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:6: ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD )
            int alt79=3;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:277:3: etat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_etat_in_cond2092);
                    etat252=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, etat252.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:5: COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMP253=(Token)match(input,COMP,FOLLOW_COMP_in_cond2098); 
                    pushFollow(FOLLOW_operation_in_cond2101);
                    operation254=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation254.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:21: ( EQUALS | INF | SUP | INFEG | SUPED | DIFF )
                    int alt78=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt78=1;
                        }
                        break;
                    case INF:
                        {
                        alt78=2;
                        }
                        break;
                    case SUP:
                        {
                        alt78=3;
                        }
                        break;
                    case INFEG:
                        {
                        alt78=4;
                        }
                        break;
                    case SUPED:
                        {
                        alt78=5;
                        }
                        break;
                    case DIFF:
                        {
                        alt78=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }

                    switch (alt78) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:22: EQUALS
                            {
                            EQUALS255=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond2104); 
                            EQUALS255_tree = (CommonTree)adaptor.create(EQUALS255);
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALS255_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:32: INF
                            {
                            INF256=(Token)match(input,INF,FOLLOW_INF_in_cond2109); 
                            INF256_tree = (CommonTree)adaptor.create(INF256);
                            root_0 = (CommonTree)adaptor.becomeRoot(INF256_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:39: SUP
                            {
                            SUP257=(Token)match(input,SUP,FOLLOW_SUP_in_cond2114); 
                            SUP257_tree = (CommonTree)adaptor.create(SUP257);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUP257_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:46: INFEG
                            {
                            INFEG258=(Token)match(input,INFEG,FOLLOW_INFEG_in_cond2119); 
                            INFEG258_tree = (CommonTree)adaptor.create(INFEG258);
                            root_0 = (CommonTree)adaptor.becomeRoot(INFEG258_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:55: SUPED
                            {
                            SUPED259=(Token)match(input,SUPED,FOLLOW_SUPED_in_cond2124); 
                            SUPED259_tree = (CommonTree)adaptor.create(SUPED259);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUPED259_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:64: DIFF
                            {
                            DIFF260=(Token)match(input,DIFF,FOLLOW_DIFF_in_cond2129); 
                            DIFF260_tree = (CommonTree)adaptor.create(DIFF260);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIFF260_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_cond2133);
                    operation261=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation261.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:5: PG conditions PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG262=(Token)match(input,PG,FOLLOW_PG_in_cond2150); 
                    PG262_tree = (CommonTree)adaptor.create(PG262);
                    adaptor.addChild(root_0, PG262_tree);

                    pushFollow(FOLLOW_conditions_in_cond2152);
                    conditions263=conditions();

                    state._fsp--;

                    adaptor.addChild(root_0, conditions263.getTree());
                    PD264=(Token)match(input,PD,FOLLOW_PD_in_cond2154); 
                    PD264_tree = (CommonTree)adaptor.create(PD264);
                    adaptor.addChild(root_0, PD264_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:282:1: etat : ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW );
    public final hightParser.etat_return etat() throws RecognitionException {
        hightParser.etat_return retval = new hightParser.etat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS266=null;
        Token NOT267=null;
        Token DEAD_KW268=null;
        Token ALIVE_KW269=null;
        Token EFFACED_KW270=null;
        Token GENERATED_KW271=null;
        Token TOUCHING_KW272=null;
        Token OTHER273=null;
        Token MOVING_KW276=null;
        Token WAITING_KW277=null;
        Token set278=null;
        Token IS279=null;
        Token NOT280=null;
        Token FINISHED_KW281=null;
        Token STARTED_KW282=null;
        Token PAUSED_KW283=null;
        Token MUTED_KW284=null;
        Token set285=null;
        Token PLAYED_KW286=null;
        Token STOPPED_KW287=null;
        Token VICTORY_KW288=null;
        Token DEFEAT_KW289=null;
        hightParser.accesClasse_return accesClasse265 = null;

        hightParser.accesGlobal_return accesGlobal274 = null;

        hightParser.accesLocal_return accesLocal275 = null;


        CommonTree IS266_tree=null;
        CommonTree NOT267_tree=null;
        CommonTree DEAD_KW268_tree=null;
        CommonTree ALIVE_KW269_tree=null;
        CommonTree EFFACED_KW270_tree=null;
        CommonTree GENERATED_KW271_tree=null;
        CommonTree TOUCHING_KW272_tree=null;
        CommonTree OTHER273_tree=null;
        CommonTree MOVING_KW276_tree=null;
        CommonTree WAITING_KW277_tree=null;
        CommonTree set278_tree=null;
        CommonTree IS279_tree=null;
        CommonTree NOT280_tree=null;
        CommonTree FINISHED_KW281_tree=null;
        CommonTree STARTED_KW282_tree=null;
        CommonTree PAUSED_KW283_tree=null;
        CommonTree MUTED_KW284_tree=null;
        CommonTree set285_tree=null;
        CommonTree PLAYED_KW286_tree=null;
        CommonTree STOPPED_KW287_tree=null;
        CommonTree VICTORY_KW288_tree=null;
        CommonTree DEFEAT_KW289_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:282:6: ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW )
            int alt86=4;
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
                alt86=1;
                }
                break;
            case IDENT:
                {
                int LA86_2 = input.LA(2);

                if ( (LA86_2==IS) ) {
                    switch ( input.LA(3) ) {
                    case NOT:
                        {
                        int LA86_7 = input.LA(4);

                        if ( ((LA86_7>=FINISHED_KW && LA86_7<=STOPPED_KW)) ) {
                            alt86=2;
                        }
                        else if ( ((LA86_7>=DEAD_KW && LA86_7<=WAITING_KW)) ) {
                            alt86=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 86, 7, input);

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
                        alt86=2;
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
                        alt86=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 6, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt86=2;
                }
                break;
            case VICTORY_KW:
                {
                alt86=3;
                }
                break;
            case DEFEAT_KW:
                {
                alt86=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:3: accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_etat2168);
                    accesClasse265=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse265.getTree());
                    IS266=(Token)match(input,IS,FOLLOW_IS_in_etat2170); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:19: ( NOT )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NOT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:20: NOT
                            {
                            NOT267=(Token)match(input,NOT,FOLLOW_NOT_in_etat2174); 
                            NOT267_tree = (CommonTree)adaptor.create(NOT267);
                            adaptor.addChild(root_0, NOT267_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:26: ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
                    int alt83=7;
                    switch ( input.LA(1) ) {
                    case DEAD_KW:
                        {
                        alt83=1;
                        }
                        break;
                    case ALIVE_KW:
                        {
                        alt83=2;
                        }
                        break;
                    case EFFACED_KW:
                        {
                        alt83=3;
                        }
                        break;
                    case GENERATED_KW:
                        {
                        alt83=4;
                        }
                        break;
                    case TOUCHING_KW:
                        {
                        alt83=5;
                        }
                        break;
                    case MOVING_KW:
                        {
                        alt83=6;
                        }
                        break;
                    case WAITING_KW:
                        {
                        alt83=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }

                    switch (alt83) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:27: DEAD_KW
                            {
                            DEAD_KW268=(Token)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2179); 
                            DEAD_KW268_tree = (CommonTree)adaptor.create(DEAD_KW268);
                            root_0 = (CommonTree)adaptor.becomeRoot(DEAD_KW268_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:38: ALIVE_KW
                            {
                            ALIVE_KW269=(Token)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2184); 
                            ALIVE_KW269_tree = (CommonTree)adaptor.create(ALIVE_KW269);
                            root_0 = (CommonTree)adaptor.becomeRoot(ALIVE_KW269_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:50: EFFACED_KW
                            {
                            EFFACED_KW270=(Token)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2189); 
                            EFFACED_KW270_tree = (CommonTree)adaptor.create(EFFACED_KW270);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACED_KW270_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:64: GENERATED_KW
                            {
                            GENERATED_KW271=(Token)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2194); 
                            GENERATED_KW271_tree = (CommonTree)adaptor.create(GENERATED_KW271);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATED_KW271_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:80: TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal )
                            {
                            TOUCHING_KW272=(Token)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2199); 
                            TOUCHING_KW272_tree = (CommonTree)adaptor.create(TOUCHING_KW272);
                            root_0 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW272_tree, root_0);

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:93: ( ( OTHER )? accesGlobal | accesLocal )
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==CAMERA||LA82_0==MEDIA||(LA82_0>=ALLY && LA82_0<=NEUTRAL)||LA82_0==OTHER||LA82_0==PG||(LA82_0>=COUNTER && LA82_0<=TELEPORTER)) ) {
                                alt82=1;
                            }
                            else if ( (LA82_0==IDENT||LA82_0==PLAYER||LA82_0==NUM) ) {
                                alt82=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 82, 0, input);

                                throw nvae;
                            }
                            switch (alt82) {
                                case 1 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:94: ( OTHER )? accesGlobal
                                    {
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:94: ( OTHER )?
                                    int alt81=2;
                                    int LA81_0 = input.LA(1);

                                    if ( (LA81_0==OTHER) ) {
                                        alt81=1;
                                    }
                                    switch (alt81) {
                                        case 1 :
                                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:95: OTHER
                                            {
                                            OTHER273=(Token)match(input,OTHER,FOLLOW_OTHER_in_etat2204); 
                                            OTHER273_tree = (CommonTree)adaptor.create(OTHER273);
                                            adaptor.addChild(root_0, OTHER273_tree);


                                            }
                                            break;

                                    }

                                    pushFollow(FOLLOW_accesGlobal_in_etat2208);
                                    accesGlobal274=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal274.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:117: accesLocal
                                    {
                                    pushFollow(FOLLOW_accesLocal_in_etat2212);
                                    accesLocal275=accesLocal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesLocal275.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:131: MOVING_KW
                            {
                            MOVING_KW276=(Token)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2217); 
                            MOVING_KW276_tree = (CommonTree)adaptor.create(MOVING_KW276);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOVING_KW276_tree, root_0);


                            }
                            break;
                        case 7 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:144: WAITING_KW
                            {
                            WAITING_KW277=(Token)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2222); 
                            WAITING_KW277_tree = (CommonTree)adaptor.create(WAITING_KW277);
                            root_0 = (CommonTree)adaptor.becomeRoot(WAITING_KW277_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:5: ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set278=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set278));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    IS279=(Token)match(input,IS,FOLLOW_IS_in_etat2240); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:24: ( NOT )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NOT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:25: NOT
                            {
                            NOT280=(Token)match(input,NOT,FOLLOW_NOT_in_etat2244); 
                            NOT280_tree = (CommonTree)adaptor.create(NOT280);
                            adaptor.addChild(root_0, NOT280_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:31: ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    int alt85=6;
                    switch ( input.LA(1) ) {
                    case FINISHED_KW:
                        {
                        alt85=1;
                        }
                        break;
                    case STARTED_KW:
                        {
                        alt85=2;
                        }
                        break;
                    case PAUSED_KW:
                        {
                        alt85=3;
                        }
                        break;
                    case MUTED_KW:
                        {
                        alt85=4;
                        }
                        break;
                    case PLAYED_KW:
                        {
                        alt85=5;
                        }
                        break;
                    case STOPPED_KW:
                        {
                        alt85=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }

                    switch (alt85) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:32: FINISHED_KW
                            {
                            FINISHED_KW281=(Token)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2249); 
                            FINISHED_KW281_tree = (CommonTree)adaptor.create(FINISHED_KW281);
                            root_0 = (CommonTree)adaptor.becomeRoot(FINISHED_KW281_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:46: STARTED_KW
                            {
                            STARTED_KW282=(Token)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2253); 
                            STARTED_KW282_tree = (CommonTree)adaptor.create(STARTED_KW282);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTED_KW282_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:60: PAUSED_KW
                            {
                            PAUSED_KW283=(Token)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2258); 
                            PAUSED_KW283_tree = (CommonTree)adaptor.create(PAUSED_KW283);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSED_KW283_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:73: MUTED_KW ( ON | OFF )
                            {
                            MUTED_KW284=(Token)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2263); 
                            MUTED_KW284_tree = (CommonTree)adaptor.create(MUTED_KW284);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTED_KW284_tree, root_0);

                            set285=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set285));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:96: PLAYED_KW
                            {
                            PLAYED_KW286=(Token)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2276); 
                            PLAYED_KW286_tree = (CommonTree)adaptor.create(PLAYED_KW286);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAYED_KW286_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:284:109: STOPPED_KW
                            {
                            STOPPED_KW287=(Token)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2281); 
                            STOPPED_KW287_tree = (CommonTree)adaptor.create(STOPPED_KW287);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOPPED_KW287_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW288=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2295); 
                    VICTORY_KW288_tree = (CommonTree)adaptor.create(VICTORY_KW288);
                    adaptor.addChild(root_0, VICTORY_KW288_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:287:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW289=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2301); 
                    DEFEAT_KW289_tree = (CommonTree)adaptor.create(DEFEAT_KW289);
                    adaptor.addChild(root_0, DEFEAT_KW289_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:1: affectation : ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable );
    public final hightParser.affectation_return affectation() throws RecognitionException {
        hightParser.affectation_return retval = new hightParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN_KW290=null;
        Token ADD_KW291=null;
        Token SUB_KW292=null;
        Token FOR294=null;
        Token INVERT_KW296=null;
        Token WITH298=null;
        hightParser.operation_return operation293 = null;

        hightParser.variable_return variable295 = null;

        hightParser.variable_return variable297 = null;

        hightParser.variable_return variable299 = null;


        CommonTree ASSIGN_KW290_tree=null;
        CommonTree ADD_KW291_tree=null;
        CommonTree SUB_KW292_tree=null;
        CommonTree FOR294_tree=null;
        CommonTree INVERT_KW296_tree=null;
        CommonTree WITH298_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:290:13: ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=ASSIGN_KW && LA88_0<=SUB_KW)) ) {
                alt88=1;
            }
            else if ( (LA88_0==INVERT_KW) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:291:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:291:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation )
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:291:4: ( ASSIGN_KW | ADD_KW | SUB_KW ) operation
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:291:4: ( ASSIGN_KW | ADD_KW | SUB_KW )
                    int alt87=3;
                    switch ( input.LA(1) ) {
                    case ASSIGN_KW:
                        {
                        alt87=1;
                        }
                        break;
                    case ADD_KW:
                        {
                        alt87=2;
                        }
                        break;
                    case SUB_KW:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:291:5: ASSIGN_KW
                            {
                            ASSIGN_KW290=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2318); 
                            ASSIGN_KW290_tree = (CommonTree)adaptor.create(ASSIGN_KW290);
                            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW290_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:291:18: ADD_KW
                            {
                            ADD_KW291=(Token)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2323); 
                            ADD_KW291_tree = (CommonTree)adaptor.create(ADD_KW291);
                            root_0 = (CommonTree)adaptor.becomeRoot(ADD_KW291_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:291:28: SUB_KW
                            {
                            SUB_KW292=(Token)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2328); 
                            SUB_KW292_tree = (CommonTree)adaptor.create(SUB_KW292);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUB_KW292_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_affectation2332);
                    operation293=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation293.getTree());

                    }

                    FOR294=(Token)match(input,FOR,FOLLOW_FOR_in_affectation2335); 
                    pushFollow(FOLLOW_variable_in_affectation2338);
                    variable295=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable295.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:292:5: INVERT_KW variable WITH variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INVERT_KW296=(Token)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2345); 
                    INVERT_KW296_tree = (CommonTree)adaptor.create(INVERT_KW296);
                    root_0 = (CommonTree)adaptor.becomeRoot(INVERT_KW296_tree, root_0);

                    pushFollow(FOLLOW_variable_in_affectation2348);
                    variable297=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable297.getTree());
                    WITH298=(Token)match(input,WITH,FOLLOW_WITH_in_affectation2350); 
                    pushFollow(FOLLOW_variable_in_affectation2353);
                    variable299=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable299.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:295:1: iaBasique : IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* ;
    public final hightParser.iaBasique_return iaBasique() throws RecognitionException {
        hightParser.iaBasique_return retval = new hightParser.iaBasique_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IA_KW300=null;
        Token IS302=null;
        Token VIRG304=null;
        hightParser.accesClasse_return accesClasse301 = null;

        hightParser.actionObjet_return actionObjet303 = null;

        hightParser.actionObjet_return actionObjet305 = null;


        CommonTree IA_KW300_tree=null;
        CommonTree IS302_tree=null;
        CommonTree VIRG304_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:295:11: ( IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:295:13: IA_KW accesClasse IS actionObjet ( VIRG actionObjet )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IA_KW300=(Token)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2366); 
            IA_KW300_tree = (CommonTree)adaptor.create(IA_KW300);
            root_0 = (CommonTree)adaptor.becomeRoot(IA_KW300_tree, root_0);

            pushFollow(FOLLOW_accesClasse_in_iaBasique2369);
            accesClasse301=accesClasse();

            state._fsp--;

            adaptor.addChild(root_0, accesClasse301.getTree());
            IS302=(Token)match(input,IS,FOLLOW_IS_in_iaBasique2371); 
            pushFollow(FOLLOW_actionObjet_in_iaBasique2374);
            actionObjet303=actionObjet();

            state._fsp--;

            adaptor.addChild(root_0, actionObjet303.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:295:48: ( VIRG actionObjet )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==VIRG) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:295:49: VIRG actionObjet
            	    {
            	    VIRG304=(Token)match(input,VIRG,FOLLOW_VIRG_in_iaBasique2377); 
            	    pushFollow(FOLLOW_actionObjet_in_iaBasique2380);
            	    actionObjet305=actionObjet();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionObjet305.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:299:1: operation : ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus );
    public final hightParser.operation_return operation() throws RecognitionException {
        hightParser.operation_return retval = new hightParser.operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RANDOM_KW307=null;
        Token BETWEEN308=null;
        Token AND310=null;
        hightParser.operationPlus_return operationPlus306 = null;

        hightParser.operationPlus_return operationPlus309 = null;

        hightParser.operationPlus_return operationPlus311 = null;


        CommonTree RANDOM_KW307_tree=null;
        CommonTree BETWEEN308_tree=null;
        CommonTree AND310_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:299:11: ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=FLOAT && LA90_0<=IDENT)||LA90_0==PG||(LA90_0>=X && LA90_0<=VALUE)||(LA90_0>=MASS && LA90_0<=MOVE_WITH_CAMERA)) ) {
                alt90=1;
            }
            else if ( (LA90_0==RANDOM_KW) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:300:2: operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operationPlus_in_operation2394);
                    operationPlus306=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus306.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:4: RANDOM_KW BETWEEN operationPlus AND operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RANDOM_KW307=(Token)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2399); 
                    RANDOM_KW307_tree = (CommonTree)adaptor.create(RANDOM_KW307);
                    root_0 = (CommonTree)adaptor.becomeRoot(RANDOM_KW307_tree, root_0);

                    BETWEEN308=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operation2402); 
                    pushFollow(FOLLOW_operationPlus_in_operation2405);
                    operationPlus309=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus309.getTree());
                    AND310=(Token)match(input,AND,FOLLOW_AND_in_operation2407); 
                    pushFollow(FOLLOW_operationPlus_in_operation2410);
                    operationPlus311=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus311.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:304:1: operationPlus : operationMul ( ( PLUS | MINUS ) operationMul )* ;
    public final hightParser.operationPlus_return operationPlus() throws RecognitionException {
        hightParser.operationPlus_return retval = new hightParser.operationPlus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS313=null;
        Token MINUS314=null;
        hightParser.operationMul_return operationMul312 = null;

        hightParser.operationMul_return operationMul315 = null;


        CommonTree PLUS313_tree=null;
        CommonTree MINUS314_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:304:15: ( operationMul ( ( PLUS | MINUS ) operationMul )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:2: operationMul ( ( PLUS | MINUS ) operationMul )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationMul_in_operationPlus2422);
            operationMul312=operationMul();

            state._fsp--;

            adaptor.addChild(root_0, operationMul312.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:15: ( ( PLUS | MINUS ) operationMul )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=PLUS && LA92_0<=MINUS)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:16: ( PLUS | MINUS ) operationMul
            	    {
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:16: ( PLUS | MINUS )
            	    int alt91=2;
            	    int LA91_0 = input.LA(1);

            	    if ( (LA91_0==PLUS) ) {
            	        alt91=1;
            	    }
            	    else if ( (LA91_0==MINUS) ) {
            	        alt91=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 91, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt91) {
            	        case 1 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:17: PLUS
            	            {
            	            PLUS313=(Token)match(input,PLUS,FOLLOW_PLUS_in_operationPlus2426); 
            	            PLUS313_tree = (CommonTree)adaptor.create(PLUS313);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS313_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:305:25: MINUS
            	            {
            	            MINUS314=(Token)match(input,MINUS,FOLLOW_MINUS_in_operationPlus2431); 
            	            MINUS314_tree = (CommonTree)adaptor.create(MINUS314);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS314_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_operationMul_in_operationPlus2435);
            	    operationMul315=operationMul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operationMul315.getTree());

            	    }
            	    break;

            	default :
            	    break loop92;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:1: operationMul : operationPow ( ( MUL | DIV | MOD ) operationPow )? ;
    public final hightParser.operationMul_return operationMul() throws RecognitionException {
        hightParser.operationMul_return retval = new hightParser.operationMul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL317=null;
        Token DIV318=null;
        Token MOD319=null;
        hightParser.operationPow_return operationPow316 = null;

        hightParser.operationPow_return operationPow320 = null;


        CommonTree MUL317_tree=null;
        CommonTree DIV318_tree=null;
        CommonTree MOD319_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:14: ( operationPow ( ( MUL | DIV | MOD ) operationPow )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:309:2: operationPow ( ( MUL | DIV | MOD ) operationPow )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationPow_in_operationMul2448);
            operationPow316=operationPow();

            state._fsp--;

            adaptor.addChild(root_0, operationPow316.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:309:15: ( ( MUL | DIV | MOD ) operationPow )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=MUL && LA94_0<=MOD)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:309:16: ( MUL | DIV | MOD ) operationPow
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:309:16: ( MUL | DIV | MOD )
                    int alt93=3;
                    switch ( input.LA(1) ) {
                    case MUL:
                        {
                        alt93=1;
                        }
                        break;
                    case DIV:
                        {
                        alt93=2;
                        }
                        break;
                    case MOD:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:309:17: MUL
                            {
                            MUL317=(Token)match(input,MUL,FOLLOW_MUL_in_operationMul2452); 
                            MUL317_tree = (CommonTree)adaptor.create(MUL317);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUL317_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:309:24: DIV
                            {
                            DIV318=(Token)match(input,DIV,FOLLOW_DIV_in_operationMul2457); 
                            DIV318_tree = (CommonTree)adaptor.create(DIV318);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIV318_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:309:31: MOD
                            {
                            MOD319=(Token)match(input,MOD,FOLLOW_MOD_in_operationMul2462); 
                            MOD319_tree = (CommonTree)adaptor.create(MOD319);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOD319_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operationPow_in_operationMul2466);
                    operationPow320=operationPow();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPow320.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:312:1: operationPow : operationBracket ( POW operationBracket )? ;
    public final hightParser.operationPow_return operationPow() throws RecognitionException {
        hightParser.operationPow_return retval = new hightParser.operationPow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POW322=null;
        hightParser.operationBracket_return operationBracket321 = null;

        hightParser.operationBracket_return operationBracket323 = null;


        CommonTree POW322_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:312:14: ( operationBracket ( POW operationBracket )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:313:2: operationBracket ( POW operationBracket )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationBracket_in_operationPow2481);
            operationBracket321=operationBracket();

            state._fsp--;

            adaptor.addChild(root_0, operationBracket321.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:313:19: ( POW operationBracket )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==POW) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:313:20: POW operationBracket
                    {
                    POW322=(Token)match(input,POW,FOLLOW_POW_in_operationPow2484); 
                    POW322_tree = (CommonTree)adaptor.create(POW322);
                    root_0 = (CommonTree)adaptor.becomeRoot(POW322_tree, root_0);

                    pushFollow(FOLLOW_operationBracket_in_operationPow2487);
                    operationBracket323=operationBracket();

                    state._fsp--;

                    adaptor.addChild(root_0, operationBracket323.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:316:1: operationBracket : ( PG operation PD | variable | FLOAT );
    public final hightParser.operationBracket_return operationBracket() throws RecognitionException {
        hightParser.operationBracket_return retval = new hightParser.operationBracket_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG324=null;
        Token PD326=null;
        Token FLOAT328=null;
        hightParser.operation_return operation325 = null;

        hightParser.variable_return variable327 = null;


        CommonTree PG324_tree=null;
        CommonTree PD326_tree=null;
        CommonTree FLOAT328_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:316:18: ( PG operation PD | variable | FLOAT )
            int alt96=3;
            switch ( input.LA(1) ) {
            case PG:
                {
                alt96=1;
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
                alt96=2;
                }
                break;
            case FLOAT:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:317:2: PG operation PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG324=(Token)match(input,PG,FOLLOW_PG_in_operationBracket2502); 
                    pushFollow(FOLLOW_operation_in_operationBracket2505);
                    operation325=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation325.getTree());
                    PD326=(Token)match(input,PD,FOLLOW_PD_in_operationBracket2507); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:318:4: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operationBracket2513);
                    variable327=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable327.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:319:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT328=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operationBracket2518); 
                    FLOAT328_tree = (CommonTree)adaptor.create(FLOAT328);
                    adaptor.addChild(root_0, FLOAT328_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:322:1: variable : ( ( X | Y | Z ) OF typeCoordonnees OF accesClasse | IDENT OF accesClasse -> ^( VAR_I_KW IDENT accesClasse ) | attribut OF accesClasse -> ^( VAR_A_KW attribut accesClasse ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesClasse -> ^( VALUE_KW attributTps accesClasse ) );
    public final hightParser.variable_return variable() throws RecognitionException {
        hightParser.variable_return retval = new hightParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token X329=null;
        Token Y330=null;
        Token Z331=null;
        Token OF332=null;
        Token OF334=null;
        Token IDENT336=null;
        Token OF337=null;
        Token OF340=null;
        Token SCORE342=null;
        Token OF343=null;
        Token GAME344=null;
        Token VALUE345=null;
        Token OF346=null;
        Token OF348=null;
        hightParser.typeCoordonnees_return typeCoordonnees333 = null;

        hightParser.accesClasse_return accesClasse335 = null;

        hightParser.accesClasse_return accesClasse338 = null;

        hightParser.attribut_return attribut339 = null;

        hightParser.accesClasse_return accesClasse341 = null;

        hightParser.attributTps_return attributTps347 = null;

        hightParser.accesClasse_return accesClasse349 = null;


        CommonTree X329_tree=null;
        CommonTree Y330_tree=null;
        CommonTree Z331_tree=null;
        CommonTree OF332_tree=null;
        CommonTree OF334_tree=null;
        CommonTree IDENT336_tree=null;
        CommonTree OF337_tree=null;
        CommonTree OF340_tree=null;
        CommonTree SCORE342_tree=null;
        CommonTree OF343_tree=null;
        CommonTree GAME344_tree=null;
        CommonTree VALUE345_tree=null;
        CommonTree OF346_tree=null;
        CommonTree OF348_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_attribut=new RewriteRuleSubtreeStream(adaptor,"rule attribut");
        RewriteRuleSubtreeStream stream_accesClasse=new RewriteRuleSubtreeStream(adaptor,"rule accesClasse");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:322:10: ( ( X | Y | Z ) OF typeCoordonnees OF accesClasse | IDENT OF accesClasse -> ^( VAR_I_KW IDENT accesClasse ) | attribut OF accesClasse -> ^( VAR_A_KW attribut accesClasse ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesClasse -> ^( VALUE_KW attributTps accesClasse ) )
            int alt98=5;
            switch ( input.LA(1) ) {
            case X:
            case Y:
            case Z:
                {
                alt98=1;
                }
                break;
            case IDENT:
                {
                alt98=2;
                }
                break;
            case VALUE:
                {
                int LA98_3 = input.LA(2);

                if ( (LA98_3==OF) ) {
                    int LA98_6 = input.LA(3);

                    if ( ((LA98_6>=BOOST_INTERVAL && LA98_6<=RELOAD_TIME)) ) {
                        alt98=5;
                    }
                    else if ( (LA98_6==IDENT||LA98_6==CAMERA||LA98_6==MEDIA||(LA98_6>=PLAYER && LA98_6<=NEUTRAL)||LA98_6==PG||(LA98_6>=ALL && LA98_6<=NUM)||(LA98_6>=COUNTER && LA98_6<=TELEPORTER)) ) {
                        alt98=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 3, input);

                    throw nvae;
                }
                }
                break;
            case SCORE:
                {
                alt98=4;
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:323:3: ( X | Y | Z ) OF typeCoordonnees OF accesClasse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:323:3: ( X | Y | Z )
                    int alt97=3;
                    switch ( input.LA(1) ) {
                    case X:
                        {
                        alt97=1;
                        }
                        break;
                    case Y:
                        {
                        alt97=2;
                        }
                        break;
                    case Z:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:323:4: X
                            {
                            X329=(Token)match(input,X,FOLLOW_X_in_variable2531); 
                            X329_tree = (CommonTree)adaptor.create(X329);
                            root_0 = (CommonTree)adaptor.becomeRoot(X329_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:323:9: Y
                            {
                            Y330=(Token)match(input,Y,FOLLOW_Y_in_variable2536); 
                            Y330_tree = (CommonTree)adaptor.create(Y330);
                            root_0 = (CommonTree)adaptor.becomeRoot(Y330_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:323:14: Z
                            {
                            Z331=(Token)match(input,Z,FOLLOW_Z_in_variable2541); 
                            Z331_tree = (CommonTree)adaptor.create(Z331);
                            root_0 = (CommonTree)adaptor.becomeRoot(Z331_tree, root_0);


                            }
                            break;

                    }

                    OF332=(Token)match(input,OF,FOLLOW_OF_in_variable2545); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2548);
                    typeCoordonnees333=typeCoordonnees();

                    state._fsp--;

                    adaptor.addChild(root_0, typeCoordonnees333.getTree());
                    OF334=(Token)match(input,OF,FOLLOW_OF_in_variable2550); 
                    pushFollow(FOLLOW_accesClasse_in_variable2553);
                    accesClasse335=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse335.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:324:5: IDENT OF accesClasse
                    {
                    IDENT336=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable2559);  
                    stream_IDENT.add(IDENT336);

                    OF337=(Token)match(input,OF,FOLLOW_OF_in_variable2561);  
                    stream_OF.add(OF337);

                    pushFollow(FOLLOW_accesClasse_in_variable2563);
                    accesClasse338=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse338.getTree());


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
                    // 325:5: -> ^( VAR_I_KW IDENT accesClasse )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:325:8: ^( VAR_I_KW IDENT accesClasse )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:326:5: attribut OF accesClasse
                    {
                    pushFollow(FOLLOW_attribut_in_variable2583);
                    attribut339=attribut();

                    state._fsp--;

                    stream_attribut.add(attribut339.getTree());
                    OF340=(Token)match(input,OF,FOLLOW_OF_in_variable2585);  
                    stream_OF.add(OF340);

                    pushFollow(FOLLOW_accesClasse_in_variable2587);
                    accesClasse341=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse341.getTree());


                    // AST REWRITE
                    // elements: attribut, accesClasse
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 327:5: -> ^( VAR_A_KW attribut accesClasse )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:327:8: ^( VAR_A_KW attribut accesClasse )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:328:5: SCORE OF GAME
                    {
                    SCORE342=(Token)match(input,SCORE,FOLLOW_SCORE_in_variable2607);  
                    stream_SCORE.add(SCORE342);

                    OF343=(Token)match(input,OF,FOLLOW_OF_in_variable2609);  
                    stream_OF.add(OF343);

                    GAME344=(Token)match(input,GAME,FOLLOW_GAME_in_variable2611);  
                    stream_GAME.add(GAME344);



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
                    // 329:5: -> GAME_SCORE_KW
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GAME_SCORE_KW, "GAME_SCORE_KW"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:330:5: VALUE OF attributTps OF accesClasse
                    {
                    VALUE345=(Token)match(input,VALUE,FOLLOW_VALUE_in_variable2625);  
                    stream_VALUE.add(VALUE345);

                    OF346=(Token)match(input,OF,FOLLOW_OF_in_variable2627);  
                    stream_OF.add(OF346);

                    pushFollow(FOLLOW_attributTps_in_variable2629);
                    attributTps347=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps347.getTree());
                    OF348=(Token)match(input,OF,FOLLOW_OF_in_variable2631);  
                    stream_OF.add(OF348);

                    pushFollow(FOLLOW_accesClasse_in_variable2633);
                    accesClasse349=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse349.getTree());


                    // AST REWRITE
                    // elements: attributTps, accesClasse
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 331:5: -> ^( VALUE_KW attributTps accesClasse )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:331:8: ^( VALUE_KW attributTps accesClasse )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:334:1: accesClasse : ( ALL | accesLocal | accesGlobal );
    public final hightParser.accesClasse_return accesClasse() throws RecognitionException {
        hightParser.accesClasse_return retval = new hightParser.accesClasse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALL350=null;
        hightParser.accesLocal_return accesLocal351 = null;

        hightParser.accesGlobal_return accesGlobal352 = null;


        CommonTree ALL350_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:334:13: ( ALL | accesLocal | accesGlobal )
            int alt99=3;
            switch ( input.LA(1) ) {
            case ALL:
                {
                alt99=1;
                }
                break;
            case IDENT:
            case PLAYER:
            case NUM:
                {
                alt99=2;
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:335:3: ALL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ALL350=(Token)match(input,ALL,FOLLOW_ALL_in_accesClasse2661); 
                    ALL350_tree = (CommonTree)adaptor.create(ALL350);
                    adaptor.addChild(root_0, ALL350_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:5: accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesLocal_in_accesClasse2668);
                    accesLocal351=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal351.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:337:5: accesGlobal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesGlobal_in_accesClasse2674);
                    accesGlobal352=accesGlobal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal352.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:340:1: accesGlobal : ( typeObjet | interaction | PG NOT ( typeObjet | interaction | PLAYER ) PD );
    public final hightParser.accesGlobal_return accesGlobal() throws RecognitionException {
        hightParser.accesGlobal_return retval = new hightParser.accesGlobal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG355=null;
        Token NOT356=null;
        Token PLAYER359=null;
        Token PD360=null;
        hightParser.typeObjet_return typeObjet353 = null;

        hightParser.interaction_return interaction354 = null;

        hightParser.typeObjet_return typeObjet357 = null;

        hightParser.interaction_return interaction358 = null;


        CommonTree PG355_tree=null;
        CommonTree NOT356_tree=null;
        CommonTree PLAYER359_tree=null;
        CommonTree PD360_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:340:13: ( typeObjet | interaction | PG NOT ( typeObjet | interaction | PLAYER ) PD )
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
            case PG:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:341:3: typeObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet_in_accesGlobal2687);
                    typeObjet353=typeObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet353.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:342:5: interaction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_interaction_in_accesGlobal2693);
                    interaction354=interaction();

                    state._fsp--;

                    adaptor.addChild(root_0, interaction354.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:343:5: PG NOT ( typeObjet | interaction | PLAYER ) PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG355=(Token)match(input,PG,FOLLOW_PG_in_accesGlobal2699); 
                    PG355_tree = (CommonTree)adaptor.create(PG355);
                    adaptor.addChild(root_0, PG355_tree);

                    NOT356=(Token)match(input,NOT,FOLLOW_NOT_in_accesGlobal2701); 
                    NOT356_tree = (CommonTree)adaptor.create(NOT356);
                    adaptor.addChild(root_0, NOT356_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:343:12: ( typeObjet | interaction | PLAYER )
                    int alt100=3;
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
                        alt100=1;
                        }
                        break;
                    case ALLY:
                    case ENEMY:
                    case NEUTRAL:
                        {
                        alt100=2;
                        }
                        break;
                    case PLAYER:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:343:13: typeObjet
                            {
                            pushFollow(FOLLOW_typeObjet_in_accesGlobal2704);
                            typeObjet357=typeObjet();

                            state._fsp--;

                            adaptor.addChild(root_0, typeObjet357.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:343:25: interaction
                            {
                            pushFollow(FOLLOW_interaction_in_accesGlobal2708);
                            interaction358=interaction();

                            state._fsp--;

                            adaptor.addChild(root_0, interaction358.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:343:39: PLAYER
                            {
                            PLAYER359=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesGlobal2712); 
                            PLAYER359_tree = (CommonTree)adaptor.create(PLAYER359);
                            adaptor.addChild(root_0, PLAYER359_tree);


                            }
                            break;

                    }

                    PD360=(Token)match(input,PD,FOLLOW_PD_in_accesGlobal2715); 
                    PD360_tree = (CommonTree)adaptor.create(PD360);
                    adaptor.addChild(root_0, PD360_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:1: accesLocal : ( IDENT | NUM operation IN IDENT | PLAYER );
    public final hightParser.accesLocal_return accesLocal() throws RecognitionException {
        hightParser.accesLocal_return retval = new hightParser.accesLocal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT361=null;
        Token NUM362=null;
        Token IN364=null;
        Token IDENT365=null;
        Token PLAYER366=null;
        hightParser.operation_return operation363 = null;


        CommonTree IDENT361_tree=null;
        CommonTree NUM362_tree=null;
        CommonTree IN364_tree=null;
        CommonTree IDENT365_tree=null;
        CommonTree PLAYER366_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:12: ( IDENT | NUM operation IN IDENT | PLAYER )
            int alt102=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt102=1;
                }
                break;
            case NUM:
                {
                alt102=2;
                }
                break;
            case PLAYER:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:347:3: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT361=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2728); 
                    IDENT361_tree = (CommonTree)adaptor.create(IDENT361);
                    adaptor.addChild(root_0, IDENT361_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:348:5: NUM operation IN IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUM362=(Token)match(input,NUM,FOLLOW_NUM_in_accesLocal2734); 
                    NUM362_tree = (CommonTree)adaptor.create(NUM362);
                    adaptor.addChild(root_0, NUM362_tree);

                    pushFollow(FOLLOW_operation_in_accesLocal2736);
                    operation363=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation363.getTree());
                    IN364=(Token)match(input,IN,FOLLOW_IN_in_accesLocal2738); 
                    IN364_tree = (CommonTree)adaptor.create(IN364);
                    adaptor.addChild(root_0, IN364_tree);

                    IDENT365=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2740); 
                    IDENT365_tree = (CommonTree)adaptor.create(IDENT365);
                    adaptor.addChild(root_0, IDENT365_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:349:5: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER366=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal2746); 
                    PLAYER366_tree = (CommonTree)adaptor.create(PLAYER366);
                    adaptor.addChild(root_0, PLAYER366_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:352:1: typeCoordonnees : ( POSITION | ORIENTATION | SIZE );
    public final hightParser.typeCoordonnees_return typeCoordonnees() throws RecognitionException {
        hightParser.typeCoordonnees_return retval = new hightParser.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set367=null;

        CommonTree set367_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:352:17: ( POSITION | ORIENTATION | SIZE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set367=(Token)input.LT(1);
            if ( (input.LA(1)>=POSITION && input.LA(1)<=SIZE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set367));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:356:1: timeUnit : ( MIN | SEC | MS | FRAME );
    public final hightParser.timeUnit_return timeUnit() throws RecognitionException {
        hightParser.timeUnit_return retval = new hightParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set368=null;

        CommonTree set368_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:356:10: ( MIN | SEC | MS | FRAME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set368=(Token)input.LT(1);
            if ( (input.LA(1)>=MIN && input.LA(1)<=FRAME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set368));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:364:1: typeObjet : ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D );
    public final hightParser.typeObjet_return typeObjet() throws RecognitionException {
        hightParser.typeObjet_return retval = new hightParser.typeObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CAMERA369=null;
        Token MEDIA370=null;
        Token COUNTER371=null;
        Token TIME372=null;
        hightParser.typeObjet3D_return typeObjet3D373 = null;


        CommonTree CAMERA369_tree=null;
        CommonTree MEDIA370_tree=null;
        CommonTree COUNTER371_tree=null;
        CommonTree TIME372_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:364:11: ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D )
            int alt103=5;
            switch ( input.LA(1) ) {
            case CAMERA:
                {
                alt103=1;
                }
                break;
            case MEDIA:
                {
                alt103=2;
                }
                break;
            case COUNTER:
                {
                alt103=3;
                }
                break;
            case TIME:
                {
                alt103=4;
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
                alt103=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:365:2: CAMERA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CAMERA369=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_typeObjet2807); 
                    CAMERA369_tree = (CommonTree)adaptor.create(CAMERA369);
                    adaptor.addChild(root_0, CAMERA369_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:366:4: MEDIA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MEDIA370=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_typeObjet2812); 
                    MEDIA370_tree = (CommonTree)adaptor.create(MEDIA370);
                    adaptor.addChild(root_0, MEDIA370_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:367:4: COUNTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COUNTER371=(Token)match(input,COUNTER,FOLLOW_COUNTER_in_typeObjet2817); 
                    COUNTER371_tree = (CommonTree)adaptor.create(COUNTER371);
                    adaptor.addChild(root_0, COUNTER371_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:368:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TIME372=(Token)match(input,TIME,FOLLOW_TIME_in_typeObjet2822); 
                    TIME372_tree = (CommonTree)adaptor.create(TIME372);
                    adaptor.addChild(root_0, TIME372_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:369:4: typeObjet3D
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet3D_in_typeObjet2827);
                    typeObjet3D373=typeObjet3D();

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet3D373.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:374:1: typeObjet3D : ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER );
    public final hightParser.typeObjet3D_return typeObjet3D() throws RecognitionException {
        hightParser.typeObjet3D_return retval = new hightParser.typeObjet3D_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set374=null;

        CommonTree set374_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:374:12: ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set374=(Token)input.LT(1);
            if ( (input.LA(1)>=OBJECT && input.LA(1)<=TELEPORTER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set374));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:395:1: attribut : ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA );
    public final hightParser.attribut_return attribut() throws RecognitionException {
        hightParser.attribut_return retval = new hightParser.attribut_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set375=null;

        CommonTree set375_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:395:10: ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set375=(Token)input.LT(1);
            if ( input.LA(1)==TYPE||input.LA(1)==VALUE||(input.LA(1)>=MASS && input.LA(1)<=MOVE_WITH_CAMERA) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set375));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:438:1: attributTps : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final hightParser.attributTps_return attributTps() throws RecognitionException {
        hightParser.attributTps_return retval = new hightParser.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set376=null;

        CommonTree set376_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:438:13: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set376=(Token)input.LT(1);
            if ( (input.LA(1)>=BOOST_INTERVAL && input.LA(1)<=RELOAD_TIME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set376));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:444:1: attributListeOuObjet : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final hightParser.attributListeOuObjet_return attributListeOuObjet() throws RecognitionException {
        hightParser.attributListeOuObjet_return retval = new hightParser.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set377=null;

        CommonTree set377_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:444:22: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set377=(Token)input.LT(1);
            if ( (input.LA(1)>=INVENTORY && input.LA(1)<=TYPES_TELEPORTABLES) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set377));
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


    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA79_eotS =
        "\15\uffff";
    static final String DFA79_eofS =
        "\15\uffff";
    static final String DFA79_minS =
        "\1\32\1\uffff\1\32\1\uffff\1\32\1\uffff\7\43";
    static final String DFA79_maxS =
        "\1\u00bf\1\uffff\1\u00bf\1\uffff\1\u00bf\1\uffff\7\u0084";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3\7\uffff";
    static final String DFA79_specialS =
        "\15\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\1\7\uffff\1\1\5\uffff\1\1\2\uffff\1\1\3\uffff\4\1\5\uffff"+
            "\2\1\102\uffff\1\3\6\uffff\1\2\37\uffff\2\1\7\uffff\24\1",
            "",
            "\1\5\7\uffff\1\5\5\uffff\1\5\2\uffff\1\5\3\uffff\4\5\5\uffff"+
            "\2\5\100\uffff\1\4\1\uffff\1\5\6\uffff\1\5\37\uffff\2\5\7\uffff"+
            "\24\5",
            "",
            "\1\5\7\uffff\1\5\5\uffff\1\6\2\uffff\1\7\3\uffff\1\14\3\13"+
            "\5\uffff\2\5\102\uffff\1\5\6\uffff\1\5\37\uffff\2\5\7\uffff"+
            "\1\10\1\11\22\12",
            "",
            "\1\5\140\uffff\1\1",
            "\1\5\140\uffff\1\1",
            "\1\5\140\uffff\1\1",
            "\1\5\140\uffff\1\1",
            "\1\5\140\uffff\1\1",
            "\1\5\140\uffff\1\1",
            "\1\5\140\uffff\1\1"
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "276:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD );";
        }
    }
 

    public static final BitSet FOLLOW_gameData_in_game150 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game152 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_newType_in_game158 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game160 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_init_in_game166 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game168 = new BitSet(new long[]{0x0047890600000000L,0x0000000000040000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_definition_in_game174 = new BitSet(new long[]{0x0040000002000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_FIN_in_game177 = new BitSet(new long[]{0x0040000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_commande_in_game185 = new BitSet(new long[]{0x0040000002000000L,0x0000400000040000L});
    public static final BitSet FOLLOW_FIN_in_game188 = new BitSet(new long[]{0x0040000000000000L,0x0000400000040000L});
    public static final BitSet FOLLOW_reglesJeu_in_game196 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FIN_in_game199 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_iaBasique_in_game207 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FIN_in_game210 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
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
    public static final BitSet FOLLOW_IS_in_newType373 = new BitSet(new long[]{0x0000090400000000L,0x0000000000000000L,0xFFFFF00000000000L});
    public static final BitSet FOLLOW_subType_in_newType375 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_AND_in_newType378 = new BitSet(new long[]{0x0000090400000000L,0x0000000000000000L,0xFFFFF00000000000L});
    public static final BitSet FOLLOW_subType_in_newType380 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_IDENT_in_subType409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_init431 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_init433 = new BitSet(new long[]{0x0000492400000000L,0x0000000000000000L,0xFFFFF00000000000L});
    public static final BitSet FOLLOW_declarationObjet_in_init435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_init453 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_HAS_in_init455 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000000L,0x000000E400000000L,0x003FFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_allocationObject_in_init457 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_init460 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000000L,0x000000E400000000L,0x003FFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_allocationObject_in_init462 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet489 = new BitSet(new long[]{0x000F800000000002L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet515 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OF_in_declarationObjet518 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_declarationObjet521 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet526 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_WITH_in_declarationObjet530 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
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
    public static final BitSet FOLLOW_AT_in_allocationObject773 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_valAggregation_in_allocationObject775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribut_in_allocationObject805 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject807 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0300003FFFFFFFFFL});
    public static final BitSet FOLLOW_typeAllocation_in_allocationObject809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeCoordonnees_in_allocationObject839 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject841 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_coordinates_in_allocationObject843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_allocationObject874 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject876 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributTps_in_allocationObject910 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject912 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_allocationObject914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_timeUnit_in_allocationObject916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAllocation958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeAllocation962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_typeAllocation966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_typeAllocation970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_valAggregation980 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1029 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_definition1032 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_MEANS_in_definition1034 = new BitSet(new long[]{0x3307890604000000L,0x00800C000000013FL,0xFFFFF018003C0008L});
    public static final BitSet FOLLOW_consequences_in_definition1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1046 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_consequences1049 = new BitSet(new long[]{0x3307890604000000L,0x00800C000000013FL,0xFFFFF018003C0008L});
    public static final BitSet FOLLOW_consequ_in_consequences1051 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_siAlors_in_consequ1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1125 = new BitSet(new long[]{0x1000000000000000L,0x0000039800001202L});
    public static final BitSet FOLLOW_actionObjet_in_action1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action1132 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1153 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1158 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_action1161 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1171 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_STOP_KW_in_action1176 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_action1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_transformation_in_action1189 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_action1191 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_action1194 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_coordinates_in_action1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1202 = new BitSet(new long[]{0x0000800780000000L,0x0000000000000000L,0x0000001780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1207 = new BitSet(new long[]{0x0000800780000000L,0x0000000000000000L,0x0000001780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_accesLocal_in_action1212 = new BitSet(new long[]{0x4000400040000002L});
    public static final BitSet FOLLOW_operation_in_action1216 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_IDENT_in_action1219 = new BitSet(new long[]{0x4000400040000002L});
    public static final BitSet FOLLOW_accesGlobal_in_action1223 = new BitSet(new long[]{0x4000400040000002L});
    public static final BitSet FOLLOW_IN_in_action1229 = new BitSet(new long[]{0x0000800400000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ON_in_action1232 = new BitSet(new long[]{0x0000800400000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_accesLocal_in_action1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_action1240 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_coordinates_in_action1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1250 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_action1253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_THEN_in_action1257 = new BitSet(new long[]{0x3307890604000000L,0x00800C000000013FL,0xFFFFF018003C0008L});
    public static final BitSet FOLLOW_consequences_in_action1260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ENDWAIT_in_action1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1295 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_actionObjet1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1304 = new BitSet(new long[]{0x0307890604000000L,0x1400000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1314 = new BitSet(new long[]{0x0000800400000000L,0x0000000000006000L,0x0000001000000000L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_coordinates1366 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_coordinates1368 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_coordinates1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1399 = new BitSet(new long[]{0x0000000400000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_IDENT_in_commande1403 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_commande1405 = new BitSet(new long[]{0x0000000400000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1410 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_commande1413 = new BitSet(new long[]{0x0000000400000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1416 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_actionCommande1430 = new BitSet(new long[]{0x0000000000000000L,0x000000007FC00000L});
    public static final BitSet FOLLOW_souris_in_actionCommande1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KEY_KW_in_actionCommande1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000783C00000L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande1443 = new BitSet(new long[]{0x1000000400000000L,0x0000039800000002L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1578 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1607 = new BitSet(new long[]{0x0000000000000000L,0x0000006003000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1629 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1665 = new BitSet(new long[]{0x0000000000000000L,0x0000300000180000L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1670 = new BitSet(new long[]{0x0000000000000000L,0x0000300000180000L});
    public static final BitSet FOLLOW_COMMANDS_in_activCommande1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_KW_in_activCommande1679 = new BitSet(new long[]{0x0000000000000002L,0x000000007FC00000L});
    public static final BitSet FOLLOW_souris_in_activCommande1682 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_activCommande1685 = new BitSet(new long[]{0x0000000000000000L,0x000000007FC00000L});
    public static final BitSet FOLLOW_souris_in_activCommande1688 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_KEY_KW_in_activCommande1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000783C00000L});
    public static final BitSet FOLLOW_clavier_in_activCommande1698 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_activCommande1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000783C00000L});
    public static final BitSet FOLLOW_clavier_in_activCommande1704 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_activCommande1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1725 = new BitSet(new long[]{0x0307890704000000L,0x0000000000000000L,0xFFFFF01F80000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1729 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_reglesJeu1731 = new BitSet(new long[]{0x0307890704000000L,0x0000000000000000L,0xFFFFF01F80000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_THEN_in_reglesJeu1739 = new BitSet(new long[]{0x3307890604000000L,0x00800C000000013FL,0xFFFFF018003C0008L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur1756 = new BitSet(new long[]{0x0000000000000000L,0x0036800000000200L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declencheur1779 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declencheur1810 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1812 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780000000L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1834 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1836 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK1904 = new BitSet(new long[]{0x0007890600000000L,0x0008000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK1909 = new BitSet(new long[]{0x0007890600000000L,0x0008000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK1915 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurTK1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurTK1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT1935 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT1940 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_BY_in_declencheurKT1945 = new BitSet(new long[]{0x0007890600000000L,0x0008000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT1950 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurKT1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurKT1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors1975 = new BitSet(new long[]{0x0307890604000000L,0x1400000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_conditions_in_siAlors1978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_THEN_in_siAlors1980 = new BitSet(new long[]{0x3307890604000000L,0x00800C000000013FL,0xFFFFF018003C0008L});
    public static final BitSet FOLLOW_consequences_in_siAlors1983 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_ELSE_in_siAlors1986 = new BitSet(new long[]{0x3307890604000000L,0x00800C000000013FL,0xFFFFF018003C0008L});
    public static final BitSet FOLLOW_consequences_in_siAlors1989 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_ENDIF_in_siAlors1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_conditions2008 = new BitSet(new long[]{0x0307890604000000L,0x1400000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_conditionOu_in_conditions2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2038 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_OR_in_conditionOu2041 = new BitSet(new long[]{0x0307890604000000L,0x1400000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_NOT_in_conditionOu2045 = new BitSet(new long[]{0x0307890604000000L,0x1400000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_conditionOu_in_conditionOu2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_in_conditionEt2065 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_AND_in_conditionEt2068 = new BitSet(new long[]{0x0307890604000000L,0x1400000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_NOT_in_conditionEt2072 = new BitSet(new long[]{0x0307890604000000L,0x1400000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_conditionEt_in_conditionEt2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_etat_in_cond2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMP_in_cond2098 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_cond2101 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_EQUALS_in_cond2104 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_INF_in_cond2109 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_SUP_in_cond2114 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_INFEG_in_cond2119 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_SUPED_in_cond2124 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_DIFF_in_cond2129 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_cond2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_cond2150 = new BitSet(new long[]{0x0307890604000000L,0x1400000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_conditions_in_cond2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PD_in_cond2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_etat2168 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_etat2170 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_NOT_in_etat2174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2199 = new BitSet(new long[]{0x0007890600000000L,0x0008000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_OTHER_in_etat2204 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesGlobal_in_etat2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_etat2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_etat2232 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_etat2240 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_NOT_in_etat2244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2263 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_etat2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2318 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2323 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2328 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_affectation2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_FOR_in_affectation2335 = new BitSet(new long[]{0x0000000700000000L,0x0000000000000000L,0x0000000780000000L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_variable_in_affectation2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2345 = new BitSet(new long[]{0x0000000700000000L,0x0000000000000000L,0x0000000780000000L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_variable_in_affectation2348 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_WITH_in_affectation2350 = new BitSet(new long[]{0x0000000700000000L,0x0000000000000000L,0x0000000780000000L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_variable_in_affectation2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2366 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_iaBasique2369 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IS_in_iaBasique2371 = new BitSet(new long[]{0x1000000000000000L,0x0000039800001202L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2374 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_VIRG_in_iaBasique2377 = new BitSet(new long[]{0x1000000000000000L,0x0000039800001202L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2380 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_operationPlus_in_operation2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operation2402 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operationPlus_in_operation2405 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_AND_in_operation2407 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operationPlus_in_operation2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_PLUS_in_operationPlus2426 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_MINUS_in_operationPlus2431 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_operationPow_in_operationMul2448 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_MUL_in_operationMul2452 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_DIV_in_operationMul2457 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_MOD_in_operationMul2462 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operationPow_in_operationMul2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_POW_in_operationPow2484 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780000008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_operationBracket2502 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_operationBracket2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PD_in_operationBracket2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operationBracket2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operationBracket2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable2531 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Y_in_variable2536 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Z_in_variable2541 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2548 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2550 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable2559 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2561 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribut_in_variable2583 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2585 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_variable2607 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2609 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_GAME_in_variable2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_variable2625 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2627 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000000L,0x000000E400000000L,0x003FFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_attributTps_in_variable2629 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_variable2631 = new BitSet(new long[]{0x0007890600000000L,0x0000000000000000L,0xFFFFF01800000008L});
    public static final BitSet FOLLOW_accesClasse_in_variable2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_accesClasse2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_accesClasse2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_accesGlobal2699 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_NOT_in_accesGlobal2701 = new BitSet(new long[]{0x0007890000000000L,0x0000000000000000L,0xFFFFF00000000000L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PLAYER_in_accesGlobal2712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PD_in_accesGlobal2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal2734 = new BitSet(new long[]{0x0000000780000000L,0x0000000000000000L,0x0000000780800008L,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_operation_in_accesLocal2736 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal2738 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERA_in_typeObjet2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_typeObjet2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNTER_in_typeObjet2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_typeObjet2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeObjet2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeObjet3D0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attribut0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}