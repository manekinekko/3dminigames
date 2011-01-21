// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g 2011-01-21 21:48:51

    package grammars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class hightParser extends Parser {
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
    public String getGrammarFileName() { return "C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g"; }


    public static class game_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "game"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:44:1: game : ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )+ ( reglesJeu ( FIN )? )+ ( iaBasique ( FIN )? )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) ;
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:44:6: ( ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )+ ( reglesJeu ( FIN )? )+ ( iaBasique ( FIN )? )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:45:2: ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )+ ( reglesJeu ( FIN )? )+ ( iaBasique ( FIN )? )*
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:45:2: ( gameData FIN )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:45:3: gameData FIN
                    {
                    pushFollow(FOLLOW_gameData_in_game233);
                    gameData1=gameData();

                    state._fsp--;

                    stream_gameData.add(gameData1.getTree());
                    FIN2=(Token)match(input,FIN,FOLLOW_FIN_in_game235);  
                    stream_FIN.add(FIN2);


                    }
                    break;

            }

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:46:2: ( newType FIN )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:46:3: newType FIN
            	    {
            	    pushFollow(FOLLOW_newType_in_game241);
            	    newType3=newType();

            	    state._fsp--;

            	    stream_newType.add(newType3.getTree());
            	    FIN4=(Token)match(input,FIN,FOLLOW_FIN_in_game243);  
            	    stream_FIN.add(FIN4);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:47:2: ( init FIN )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:47:3: init FIN
            	    {
            	    pushFollow(FOLLOW_init_in_game249);
            	    init5=init();

            	    state._fsp--;

            	    stream_init.add(init5.getTree());
            	    FIN6=(Token)match(input,FIN,FOLLOW_FIN_in_game251);  
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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:48:2: ( definition ( FIN )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DEFINITION_KW) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:48:3: definition ( FIN )?
            	    {
            	    pushFollow(FOLLOW_definition_in_game257);
            	    definition7=definition();

            	    state._fsp--;

            	    stream_definition.add(definition7.getTree());
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:48:14: ( FIN )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==FIN) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:48:15: FIN
            	            {
            	            FIN8=(Token)match(input,FIN,FOLLOW_FIN_in_game260);  
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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:49:2: ( commande ( FIN )? )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:49:3: commande ( FIN )?
            	    {
            	    pushFollow(FOLLOW_commande_in_game268);
            	    commande9=commande();

            	    state._fsp--;

            	    stream_commande.add(commande9.getTree());
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:49:12: ( FIN )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==FIN) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:49:13: FIN
            	            {
            	            FIN10=(Token)match(input,FIN,FOLLOW_FIN_in_game271);  
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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:50:2: ( reglesJeu ( FIN )? )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:50:3: reglesJeu ( FIN )?
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game279);
            	    reglesJeu11=reglesJeu();

            	    state._fsp--;

            	    stream_reglesJeu.add(reglesJeu11.getTree());
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:50:13: ( FIN )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==FIN) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:50:14: FIN
            	            {
            	            FIN12=(Token)match(input,FIN,FOLLOW_FIN_in_game282);  
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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:51:2: ( iaBasique ( FIN )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IA_KW) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:51:3: iaBasique ( FIN )?
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game290);
            	    iaBasique13=iaBasique();

            	    state._fsp--;

            	    stream_iaBasique.add(iaBasique13.getTree());
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:51:13: ( FIN )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==FIN) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:51:14: FIN
            	            {
            	            FIN14=(Token)match(input,FIN,FOLLOW_FIN_in_game293);  
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
            // elements: reglesJeu, commande, init, definition, gameData, newType, iaBasique
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 52:4: -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:52:7: ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME_KW, "GAME_KW"), root_1);

                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:52:17: ( gameData )?
                if ( stream_gameData.hasNext() ) {
                    adaptor.addChild(root_1, stream_gameData.nextTree());

                }
                stream_gameData.reset();
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:52:27: ( newType )*
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
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:52:42: ( definition )*
                while ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();
                if ( !(stream_commande.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_commande.hasNext() ) {
                    adaptor.addChild(root_1, stream_commande.nextTree());

                }
                stream_commande.reset();
                if ( !(stream_reglesJeu.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_reglesJeu.hasNext() ) {
                    adaptor.addChild(root_1, stream_reglesJeu.nextTree());

                }
                stream_reglesJeu.reset();
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:52:75: ( iaBasique )*
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:56:1: gameData : GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) ;
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:56:10: ( GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:57:2: GAME HAS attributGame ( VIRG attributGame )*
            {
            GAME15=(Token)match(input,GAME,FOLLOW_GAME_in_gameData340);  
            stream_GAME.add(GAME15);

            HAS16=(Token)match(input,HAS,FOLLOW_HAS_in_gameData342);  
            stream_HAS.add(HAS16);

            pushFollow(FOLLOW_attributGame_in_gameData344);
            attributGame17=attributGame();

            state._fsp--;

            stream_attributGame.add(attributGame17.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:57:24: ( VIRG attributGame )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==VIRG) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:57:25: VIRG attributGame
            	    {
            	    VIRG18=(Token)match(input,VIRG,FOLLOW_VIRG_in_gameData347);  
            	    stream_VIRG.add(VIRG18);

            	    pushFollow(FOLLOW_attributGame_in_gameData349);
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
            // 58:4: -> ^( GAME_ATTRIBUT_KW ( attributGame )+ )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:58:7: ^( GAME_ATTRIBUT_KW ( attributGame )+ )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:61:1: attributGame : ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | SCORE AT FLOAT -> ^( SCORE_KW FLOAT ) );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:61:14: ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | SCORE AT FLOAT -> ^( SCORE_KW FLOAT ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:62:2: GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
                    {
                    GRAVITY_KW20=(Token)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame374);  
                    stream_GRAVITY_KW.add(GRAVITY_KW20);

                    AT21=(Token)match(input,AT,FOLLOW_AT_in_attributGame376);  
                    stream_AT.add(AT21);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:62:16: ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:62:17: FLOAT
                            {
                            FLOAT22=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame379);  
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
                            // 63:5: -> ^( GRAVITY_KW FLOAT )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:63:8: ^( GRAVITY_KW FLOAT )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:64:5: FLOAT FLOAT FLOAT
                            {
                            FLOAT23=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame397);  
                            stream_FLOAT.add(FLOAT23);

                            FLOAT24=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame399);  
                            stream_FLOAT.add(FLOAT24);

                            FLOAT25=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame401);  
                            stream_FLOAT.add(FLOAT25);



                            // AST REWRITE
                            // elements: FLOAT, FLOAT, GRAVITY_KW, FLOAT
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 65:5: -> ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:65:8: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:66:4: SCORE AT FLOAT
                    {
                    SCORE26=(Token)match(input,SCORE,FOLLOW_SCORE_in_attributGame424);  
                    stream_SCORE.add(SCORE26);

                    AT27=(Token)match(input,AT,FOLLOW_AT_in_attributGame426);  
                    stream_AT.add(AT27);

                    FLOAT28=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame428);  
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
                    // 67:4: -> ^( SCORE_KW FLOAT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:67:7: ^( SCORE_KW FLOAT )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:71:1: newType : TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) ;
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:71:9: ( TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:72:2: TYPE IDENT IS subType ( AND subType )*
            {
            TYPE29=(Token)match(input,TYPE,FOLLOW_TYPE_in_newType452);  
            stream_TYPE.add(TYPE29);

            IDENT30=(Token)match(input,IDENT,FOLLOW_IDENT_in_newType454);  
            stream_IDENT.add(IDENT30);

            IS31=(Token)match(input,IS,FOLLOW_IS_in_newType456);  
            stream_IS.add(IS31);

            pushFollow(FOLLOW_subType_in_newType458);
            subType32=subType();

            state._fsp--;

            stream_subType.add(subType32.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:72:24: ( AND subType )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:72:25: AND subType
            	    {
            	    AND33=(Token)match(input,AND,FOLLOW_AND_in_newType461);  
            	    stream_AND.add(AND33);

            	    pushFollow(FOLLOW_subType_in_newType463);
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
            // elements: subType, subType, TYPE, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:4: -> ^( TYPE IDENT subType ( subType )* )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:73:7: ^( TYPE IDENT subType ( subType )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_subType.nextTree());
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:73:28: ( subType )*
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:76:1: subType : ( IDENT | typeObjet );
    public final hightParser.subType_return subType() throws RecognitionException {
        hightParser.subType_return retval = new hightParser.subType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT35=null;
        hightParser.typeObjet_return typeObjet36 = null;


        CommonTree IDENT35_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:76:9: ( IDENT | typeObjet )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:77:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_subType494); 
                    IDENT35_tree = (CommonTree)adaptor.create(IDENT35);
                    adaptor.addChild(root_0, IDENT35_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:78:4: typeObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet_in_subType499);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:83:1: init : ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW ( allocationObject )+ ) );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:83:6: ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW ( allocationObject )+ ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:84:2: IDENT IS declarationObjet
                    {
                    IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_init516);  
                    stream_IDENT.add(IDENT37);

                    IS38=(Token)match(input,IS,FOLLOW_IS_in_init518);  
                    stream_IS.add(IS38);

                    pushFollow(FOLLOW_declarationObjet_in_init520);
                    declarationObjet39=declarationObjet();

                    state._fsp--;

                    stream_declarationObjet.add(declarationObjet39.getTree());


                    // AST REWRITE
                    // elements: IDENT, declarationObjet
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:4: -> ^( INIT_IS_KW IDENT declarationObjet )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:85:7: ^( INIT_IS_KW IDENT declarationObjet )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:86:4: accesClasse HAS allocationObject ( VIRG allocationObject )*
                    {
                    pushFollow(FOLLOW_accesClasse_in_init538);
                    accesClasse40=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse40.getTree());
                    HAS41=(Token)match(input,HAS,FOLLOW_HAS_in_init540);  
                    stream_HAS.add(HAS41);

                    pushFollow(FOLLOW_allocationObject_in_init542);
                    allocationObject42=allocationObject();

                    state._fsp--;

                    stream_allocationObject.add(allocationObject42.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:86:37: ( VIRG allocationObject )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==VIRG) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:86:38: VIRG allocationObject
                    	    {
                    	    VIRG43=(Token)match(input,VIRG,FOLLOW_VIRG_in_init545);  
                    	    stream_VIRG.add(VIRG43);

                    	    pushFollow(FOLLOW_allocationObject_in_init547);
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
                    // 87:4: -> ^( INIT_HAS_KW ( allocationObject )+ )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:87:7: ^( INIT_HAS_KW ( allocationObject )+ )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:91:1: declarationObjet : ( typeEntity ( entityMode )? -> ^( DEC typeEntity ( entityMode )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:91:18: ( typeEntity ( entityMode )? -> ^( DEC typeEntity ( entityMode )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:92:2: typeEntity ( entityMode )?
                    {
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet574);
                    typeEntity45=typeEntity();

                    state._fsp--;

                    stream_typeEntity.add(typeEntity45.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:92:13: ( entityMode )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=PLAYER && LA19_0<=DUPLICABLE)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:92:13: entityMode
                            {
                            pushFollow(FOLLOW_entityMode_in_declarationObjet576);
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
                    // 93:4: -> ^( DEC typeEntity ( entityMode )? )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:93:7: ^( DEC typeEntity ( entityMode )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);

                        adaptor.addChild(root_1, stream_typeEntity.nextTree());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:93:24: ( entityMode )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:4: LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )?
                    {
                    LIST_KW47=(Token)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet600);  
                    stream_LIST_KW.add(LIST_KW47);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:12: ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==OF) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:13: OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )*
                            {
                            OF48=(Token)match(input,OF,FOLLOW_OF_in_declarationObjet603);  
                            stream_OF.add(OF48);

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:16: ( operation )?
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
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:17: operation
                                    {
                                    pushFollow(FOLLOW_operation_in_declarationObjet606);
                                    operation49=operation();

                                    state._fsp--;

                                    stream_operation.add(operation49.getTree());

                                    }
                                    break;

                            }

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:29: ( IDENT )
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:30: IDENT
                            {
                            IDENT50=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet611);  
                            stream_IDENT.add(IDENT50);


                            }

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:37: ( WITH ( operation )? ( IDENT ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==WITH) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:38: WITH ( operation )? ( IDENT )
                            	    {
                            	    WITH51=(Token)match(input,WITH,FOLLOW_WITH_in_declarationObjet615);  
                            	    stream_WITH.add(WITH51);

                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:43: ( operation )?
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
                            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:44: operation
                            	            {
                            	            pushFollow(FOLLOW_operation_in_declarationObjet618);
                            	            operation52=operation();

                            	            state._fsp--;

                            	            stream_operation.add(operation52.getTree());

                            	            }
                            	            break;

                            	    }

                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:56: ( IDENT )
                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:57: IDENT
                            	    {
                            	    IDENT53=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet623);  
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
                    // elements: IDENT, operation, LIST_KW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 95:4: -> ^( LIST_KW ( ( operation )? IDENT )+ )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:95:6: ^( LIST_KW ( ( operation )? IDENT )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LIST_KW.nextNode(), root_1);

                        if ( !(stream_IDENT.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_IDENT.hasNext() ) {
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:95:17: ( operation )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:96:4: CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
                    {
                    CAMERA54=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_declarationObjet652);  
                    stream_CAMERA.add(CAMERA54);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:96:11: ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:96:12: view PERSON
                            {
                            pushFollow(FOLLOW_view_in_declarationObjet655);
                            view55=view();

                            state._fsp--;

                            stream_view.add(view55.getTree());
                            PERSON56=(Token)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet657);  
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
                            // 96:24: -> ^( CAMERA_KW PERSON view )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:96:27: ^( CAMERA_KW PERSON view )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:96:54: FREE
                            {
                            FREE57=(Token)match(input,FREE,FOLLOW_FREE_in_declarationObjet671);  
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
                            // 96:59: -> ^( CAMERA_KW FREE )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:96:62: ^( CAMERA_KW FREE )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:97:4: MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
                    {
                    MEDIA58=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_declarationObjet686);  
                    stream_MEDIA.add(MEDIA58);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:97:10: ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:97:11: LOOP
                            {
                            LOOP59=(Token)match(input,LOOP,FOLLOW_LOOP_in_declarationObjet689);  
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
                            // 97:16: -> ^( MEDIA_KW LOOP )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:97:18: ^( MEDIA_KW LOOP )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:97:37: ONCE
                            {
                            ONCE60=(Token)match(input,ONCE,FOLLOW_ONCE_in_declarationObjet700);  
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
                            // 97:42: -> ^( MEDIA_KW ONCE )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:97:44: ^( MEDIA_KW ONCE )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:98:4: IN IDENT
                    {
                    IN61=(Token)match(input,IN,FOLLOW_IN_in_declarationObjet722);  
                    stream_IN.add(IN61);

                    IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet724);  
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
                    // 98:13: -> ^( IN_KW IDENT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:98:16: ^( IN_KW IDENT )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:101:1: typeEntity : ( IDENT | typeObjet3D );
    public final hightParser.typeEntity_return typeEntity() throws RecognitionException {
        hightParser.typeEntity_return retval = new hightParser.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT63=null;
        hightParser.typeObjet3D_return typeObjet3D64 = null;


        CommonTree IDENT63_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:101:12: ( IDENT | typeObjet3D )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:102:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT63=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeEntity755); 
                    IDENT63_tree = (CommonTree)adaptor.create(IDENT63);
                    adaptor.addChild(root_0, IDENT63_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:103:4: typeObjet3D
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet3D_in_typeEntity760);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:106:1: entityMode : ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:106:11: ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:107:2: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER65=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_entityMode770); 
                    PLAYER65_tree = (CommonTree)adaptor.create(PLAYER65);
                    adaptor.addChild(root_0, PLAYER65_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:108:4: interaction ( dupli )?
                    {
                    pushFollow(FOLLOW_interaction_in_entityMode775);
                    interaction66=interaction();

                    state._fsp--;

                    stream_interaction.add(interaction66.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:108:16: ( dupli )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==DUPLICABLE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:108:16: dupli
                            {
                            pushFollow(FOLLOW_dupli_in_entityMode777);
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
                    // 108:23: -> ^( INTERACTION_KW interaction ( dupli )? )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:108:25: ^( INTERACTION_KW interaction ( dupli )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTERACTION_KW, "INTERACTION_KW"), root_1);

                        adaptor.addChild(root_1, stream_interaction.nextTree());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:108:54: ( dupli )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:109:4: dupli
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dupli_in_entityMode793);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:112:1: interaction : ( ALLY | ENEMY | NEUTRAL );
    public final hightParser.interaction_return interaction() throws RecognitionException {
        hightParser.interaction_return retval = new hightParser.interaction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set69=null;

        CommonTree set69_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:112:13: ( ALLY | ENEMY | NEUTRAL )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:118:1: dupli : DUPLICABLE ;
    public final hightParser.dupli_return dupli() throws RecognitionException {
        hightParser.dupli_return retval = new hightParser.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DUPLICABLE70=null;

        CommonTree DUPLICABLE70_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:118:7: ( DUPLICABLE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:119:2: DUPLICABLE
            {
            root_0 = (CommonTree)adaptor.nil();

            DUPLICABLE70=(Token)match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli826); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:122:1: view : ( FIRST | THIRD );
    public final hightParser.view_return view() throws RecognitionException {
        hightParser.view_return retval = new hightParser.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set71=null;

        CommonTree set71_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:122:6: ( FIRST | THIRD )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:127:1: allocationObject : ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | attribut AT typeAllocation -> ^( ALLOCATION_KW attribut typeAllocation ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:127:18: ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | attribut AT typeAllocation -> ^( ALLOCATION_KW attribut typeAllocation ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:128:2: IDENT ( AT valAggregation )?
                    {
                    IDENT72=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject855);  
                    stream_IDENT.add(IDENT72);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:128:8: ( AT valAggregation )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==AT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:128:9: AT valAggregation
                            {
                            AT73=(Token)match(input,AT,FOLLOW_AT_in_allocationObject858);  
                            stream_AT.add(AT73);

                            pushFollow(FOLLOW_valAggregation_in_allocationObject860);
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
                    // 129:4: -> ^( ALLOCATION_KW IDENT ( valAggregation )? )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:129:7: ^( ALLOCATION_KW IDENT ( valAggregation )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:129:30: ( valAggregation )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:130:4: attribut AT typeAllocation
                    {
                    pushFollow(FOLLOW_attribut_in_allocationObject890);
                    attribut75=attribut();

                    state._fsp--;

                    stream_attribut.add(attribut75.getTree());
                    AT76=(Token)match(input,AT,FOLLOW_AT_in_allocationObject892);  
                    stream_AT.add(AT76);

                    pushFollow(FOLLOW_typeAllocation_in_allocationObject894);
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
                    // 131:4: -> ^( ALLOCATION_KW attribut typeAllocation )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:131:7: ^( ALLOCATION_KW attribut typeAllocation )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:132:4: typeCoordonnees AT coordinates
                    {
                    pushFollow(FOLLOW_typeCoordonnees_in_allocationObject924);
                    typeCoordonnees78=typeCoordonnees();

                    state._fsp--;

                    stream_typeCoordonnees.add(typeCoordonnees78.getTree());
                    AT79=(Token)match(input,AT,FOLLOW_AT_in_allocationObject926);  
                    stream_AT.add(AT79);

                    pushFollow(FOLLOW_coordinates_in_allocationObject928);
                    coordinates80=coordinates();

                    state._fsp--;

                    stream_coordinates.add(coordinates80.getTree());


                    // AST REWRITE
                    // elements: coordinates, typeCoordonnees
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 133:4: -> ^( ALLOCATION_KW typeCoordonnees coordinates )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:133:7: ^( ALLOCATION_KW typeCoordonnees coordinates )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:134:4: attributListeOuObjet AT IDENT
                    {
                    pushFollow(FOLLOW_attributListeOuObjet_in_allocationObject959);
                    attributListeOuObjet81=attributListeOuObjet();

                    state._fsp--;

                    stream_attributListeOuObjet.add(attributListeOuObjet81.getTree());
                    AT82=(Token)match(input,AT,FOLLOW_AT_in_allocationObject961);  
                    stream_AT.add(AT82);

                    IDENT83=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject963);  
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
                    // 135:4: -> ^( ALLOCATION_KW attributListeOuObjet IDENT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:135:7: ^( ALLOCATION_KW attributListeOuObjet IDENT )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:136:4: attributTps AT operation timeUnit
                    {
                    pushFollow(FOLLOW_attributTps_in_allocationObject995);
                    attributTps84=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps84.getTree());
                    AT85=(Token)match(input,AT,FOLLOW_AT_in_allocationObject997);  
                    stream_AT.add(AT85);

                    pushFollow(FOLLOW_operation_in_allocationObject999);
                    operation86=operation();

                    state._fsp--;

                    stream_operation.add(operation86.getTree());
                    pushFollow(FOLLOW_timeUnit_in_allocationObject1001);
                    timeUnit87=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit87.getTree());


                    // AST REWRITE
                    // elements: timeUnit, attributTps, operation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 137:4: -> ^( ALLOCATION_KW attributTps operation timeUnit )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:137:7: ^( ALLOCATION_KW attributTps operation timeUnit )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:140:1: typeAllocation : ( operation | IDENT | 'true' | 'false' ) ;
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:2: ( ( operation | IDENT | 'true' | 'false' ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:4: ( operation | IDENT | 'true' | 'false' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:4: ( operation | IDENT | 'true' | 'false' )
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
            case 251:
                {
                alt32=3;
                }
                break;
            case 252:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:5: operation
                    {
                    pushFollow(FOLLOW_operation_in_typeAllocation1043);
                    operation88=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation88.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:17: IDENT
                    {
                    IDENT89=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeAllocation1047); 
                    IDENT89_tree = (CommonTree)adaptor.create(IDENT89);
                    adaptor.addChild(root_0, IDENT89_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:25: 'true'
                    {
                    string_literal90=(Token)match(input,251,FOLLOW_251_in_typeAllocation1051); 
                    string_literal90_tree = (CommonTree)adaptor.create(string_literal90);
                    adaptor.addChild(root_0, string_literal90_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:34: 'false'
                    {
                    string_literal91=(Token)match(input,252,FOLLOW_252_in_typeAllocation1055); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:143:1: valAggregation : ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:143:16: ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:144:2: operation ( timeUnit )?
                    {
                    pushFollow(FOLLOW_operation_in_valAggregation1065);
                    operation92=operation();

                    state._fsp--;

                    stream_operation.add(operation92.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:144:12: ( timeUnit )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=MIN && LA33_0<=FRAME)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:144:13: timeUnit
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1068);
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
                    // 145:4: -> ^( AGGREGATION_KW operation ( timeUnit )? )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:145:7: ^( AGGREGATION_KW operation ( timeUnit )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_operation.nextTree());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:145:34: ( timeUnit )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:146:4: IDENT
                    {
                    IDENT94=(Token)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1090);  
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
                    // 147:4: -> ^( AGGREGATION_KW IDENT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:147:7: ^( AGGREGATION_KW IDENT )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:151:1: definition : DEFINITION_KW IDENT MEANS consequences ;
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:151:12: ( DEFINITION_KW IDENT MEANS consequences )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:151:14: DEFINITION_KW IDENT MEANS consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFINITION_KW95=(Token)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1114); 
            DEFINITION_KW95_tree = (CommonTree)adaptor.create(DEFINITION_KW95);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW95_tree, root_0);

            IDENT96=(Token)match(input,IDENT,FOLLOW_IDENT_in_definition1117); 
            IDENT96_tree = (CommonTree)adaptor.create(IDENT96);
            adaptor.addChild(root_0, IDENT96_tree);

            MEANS97=(Token)match(input,MEANS,FOLLOW_MEANS_in_definition1119); 
            pushFollow(FOLLOW_consequences_in_definition1122);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:153:1: consequences : consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) ;
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:153:14: ( consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:154:2: consequ ( VIRG consequ )*
            {
            pushFollow(FOLLOW_consequ_in_consequences1131);
            consequ99=consequ();

            state._fsp--;

            stream_consequ.add(consequ99.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:154:10: ( VIRG consequ )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==VIRG) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:154:11: VIRG consequ
            	    {
            	    VIRG100=(Token)match(input,VIRG,FOLLOW_VIRG_in_consequences1134);  
            	    stream_VIRG.add(VIRG100);

            	    pushFollow(FOLLOW_consequ_in_consequences1136);
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
            // 155:4: -> ^( CONSEQUENCES_KW ( consequ )+ )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:155:6: ^( CONSEQUENCES_KW ( consequ )+ )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:158:1: consequ : ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:158:9: ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:159:3: siAlors
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_siAlors_in_consequ1162);
                    siAlors102=siAlors();

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors102.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:160:5: action
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_action_in_consequ1168);
                    action103=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action103.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:161:5: affectation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_consequ1174);
                    affectation104=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation104.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:162:5: activCommande
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_activCommande_in_consequ1180);
                    activCommande105=activCommande();

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande105.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:163:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1186); 
                    IDENT106_tree = (CommonTree)adaptor.create(IDENT106);
                    adaptor.addChild(root_0, IDENT106_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:164:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW107=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1192); 
                    VICTORY_KW107_tree = (CommonTree)adaptor.create(VICTORY_KW107);
                    adaptor.addChild(root_0, VICTORY_KW107_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:165:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW108=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1198); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:168:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:168:8: ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:169:2: accesClasse actionObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_action1210);
                    accesClasse109=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse109.getTree());
                    pushFollow(FOLLOW_actionObjet_in_action1212);
                    actionObjet110=actionObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet110.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:4: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
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

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:19: ( ENDS_KW | STARTS_KW )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:20: ENDS_KW
                            {
                            ENDS_KW112=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1226); 
                            ENDS_KW112_tree = (CommonTree)adaptor.create(ENDS_KW112);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW112_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:30: STARTS_KW
                            {
                            STARTS_KW113=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1230); 
                            STARTS_KW113_tree = (CommonTree)adaptor.create(STARTS_KW113);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW113_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:171:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:171:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:171:5: PAUSE_KW
                            {
                            PAUSE_KW114=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1238); 
                            PAUSE_KW114_tree = (CommonTree)adaptor.create(PAUSE_KW114);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW114_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:171:17: MUTE_KW ( ON | OFF )
                            {
                            MUTE_KW115=(Token)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1243); 
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:171:39: PLAY_KW
                            {
                            PLAY_KW117=(Token)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1256); 
                            PLAY_KW117_tree = (CommonTree)adaptor.create(PLAY_KW117);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAY_KW117_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:171:50: STOP_KW
                            {
                            STOP_KW118=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_action1261); 
                            STOP_KW118_tree = (CommonTree)adaptor.create(STOP_KW118);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOP_KW118_tree, root_0);


                            }
                            break;

                    }

                    IDENT119=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1266); 
                    IDENT119_tree = (CommonTree)adaptor.create(IDENT119);
                    adaptor.addChild(root_0, IDENT119_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:172:4: BLOCK_KW transformation OF accesClasse coordinates
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLOCK_KW120=(Token)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1271); 
                    BLOCK_KW120_tree = (CommonTree)adaptor.create(BLOCK_KW120);
                    root_0 = (CommonTree)adaptor.becomeRoot(BLOCK_KW120_tree, root_0);

                    pushFollow(FOLLOW_transformation_in_action1274);
                    transformation121=transformation();

                    state._fsp--;

                    adaptor.addChild(root_0, transformation121.getTree());
                    OF122=(Token)match(input,OF,FOLLOW_OF_in_action1276); 
                    pushFollow(FOLLOW_accesClasse_in_action1279);
                    accesClasse123=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse123.getTree());
                    pushFollow(FOLLOW_coordinates_in_action1281);
                    coordinates124=coordinates();

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates124.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:4: ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:4: ( EFFACE_KW | GENERATE_KW )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:5: EFFACE_KW
                            {
                            EFFACE_KW125=(Token)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1287); 
                            EFFACE_KW125_tree = (CommonTree)adaptor.create(EFFACE_KW125);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACE_KW125_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:18: GENERATE_KW
                            {
                            GENERATE_KW126=(Token)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1292); 
                            GENERATE_KW126_tree = (CommonTree)adaptor.create(GENERATE_KW126);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATE_KW126_tree, root_0);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:32: ( accesLocal | operation ( IDENT | accesGlobal ) )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:33: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_action1297);
                            accesLocal127=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal127.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:46: operation ( IDENT | accesGlobal )
                            {
                            pushFollow(FOLLOW_operation_in_action1301);
                            operation128=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation128.getTree());
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:56: ( IDENT | accesGlobal )
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
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:57: IDENT
                                    {
                                    IDENT129=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1304); 
                                    IDENT129_tree = (CommonTree)adaptor.create(IDENT129);
                                    adaptor.addChild(root_0, IDENT129_tree);


                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:65: accesGlobal
                                    {
                                    pushFollow(FOLLOW_accesGlobal_in_action1308);
                                    accesGlobal130=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal130.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:79: ( ( IN | ON ) accesLocal | AT coordinates )?
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:80: ( IN | ON ) accesLocal
                            {
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:80: ( IN | ON )
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
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:81: IN
                                    {
                                    IN131=(Token)match(input,IN,FOLLOW_IN_in_action1314); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:85: ON
                                    {
                                    ON132=(Token)match(input,ON,FOLLOW_ON_in_action1317); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_action1321);
                            accesLocal133=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal133.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:173:103: AT coordinates
                            {
                            AT134=(Token)match(input,AT,FOLLOW_AT_in_action1325); 
                            pushFollow(FOLLOW_coordinates_in_action1328);
                            coordinates135=coordinates();

                            state._fsp--;

                            adaptor.addChild(root_0, coordinates135.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:174:4: WAIT_KW operation timeUnit THEN consequences ENDWAIT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAIT_KW136=(Token)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1335); 
                    WAIT_KW136_tree = (CommonTree)adaptor.create(WAIT_KW136);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAIT_KW136_tree, root_0);

                    pushFollow(FOLLOW_operation_in_action1338);
                    operation137=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation137.getTree());
                    pushFollow(FOLLOW_timeUnit_in_action1340);
                    timeUnit138=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit138.getTree());
                    THEN139=(Token)match(input,THEN,FOLLOW_THEN_in_action1342); 
                    pushFollow(FOLLOW_consequences_in_action1345);
                    consequences140=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences140.getTree());
                    ENDWAIT141=(Token)match(input,ENDWAIT,FOLLOW_ENDWAIT_in_action1347); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:175:4: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAVE_KW142=(Token)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1353); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:178:1: actionObjet : ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:178:13: ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:179:3: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DIES_KW143=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1365); 
                    DIES_KW143_tree = (CommonTree)adaptor.create(DIES_KW143);
                    adaptor.addChild(root_0, DIES_KW143_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:180:5: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1371);
                    actionCommandePressee144=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee144.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:181:5: actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1377);
                    actionCommandeMaintenue145=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue145.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:181:29: ( DURING operation timeUnit | UNTIL conditions )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:181:30: DURING operation timeUnit
                            {
                            DURING146=(Token)match(input,DURING,FOLLOW_DURING_in_actionObjet1380); 
                            DURING146_tree = (CommonTree)adaptor.create(DURING146);
                            root_0 = (CommonTree)adaptor.becomeRoot(DURING146_tree, root_0);

                            pushFollow(FOLLOW_operation_in_actionObjet1383);
                            operation147=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation147.getTree());
                            pushFollow(FOLLOW_timeUnit_in_actionObjet1385);
                            timeUnit148=timeUnit();

                            state._fsp--;

                            adaptor.addChild(root_0, timeUnit148.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:181:59: UNTIL conditions
                            {
                            UNTIL149=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1389); 
                            UNTIL149_tree = (CommonTree)adaptor.create(UNTIL149);
                            root_0 = (CommonTree)adaptor.becomeRoot(UNTIL149_tree, root_0);

                            pushFollow(FOLLOW_conditions_in_actionObjet1392);
                            conditions150=conditions();

                            state._fsp--;

                            adaptor.addChild(root_0, conditions150.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:182:5: EQUIP ( accesLocal | NEXT | PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EQUIP151=(Token)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1399); 
                    EQUIP151_tree = (CommonTree)adaptor.create(EQUIP151);
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUIP151_tree, root_0);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:182:12: ( accesLocal | NEXT | PREVIOUS )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:182:13: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_actionObjet1403);
                            accesLocal152=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal152.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:182:26: NEXT
                            {
                            NEXT153=(Token)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1407); 
                            NEXT153_tree = (CommonTree)adaptor.create(NEXT153);
                            adaptor.addChild(root_0, NEXT153_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:182:33: PREVIOUS
                            {
                            PREVIOUS154=(Token)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1411); 
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:185:1: transformation : ( TRANSLATION | ROTATION | SCALE );
    public final hightParser.transformation_return transformation() throws RecognitionException {
        hightParser.transformation_return retval = new hightParser.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set155=null;

        CommonTree set155_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:185:16: ( TRANSLATION | ROTATION | SCALE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:191:1: coordinates : operation operation operation -> ^( COORDINATE_KW operation operation operation ) ;
    public final hightParser.coordinates_return coordinates() throws RecognitionException {
        hightParser.coordinates_return retval = new hightParser.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hightParser.operation_return operation156 = null;

        hightParser.operation_return operation157 = null;

        hightParser.operation_return operation158 = null;


        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:191:13: ( operation operation operation -> ^( COORDINATE_KW operation operation operation ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:192:2: operation operation operation
            {
            pushFollow(FOLLOW_operation_in_coordinates1451);
            operation156=operation();

            state._fsp--;

            stream_operation.add(operation156.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1453);
            operation157=operation();

            state._fsp--;

            stream_operation.add(operation157.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1455);
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
            // 193:4: -> ^( COORDINATE_KW operation operation operation )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:193:7: ^( COORDINATE_KW operation operation operation )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:198:1: commande : COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )* ;
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:198:10: ( COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:199:2: COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )*
            {
            root_0 = (CommonTree)adaptor.nil();

            COMMAND_KW159=(Token)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1484); 
            COMMAND_KW159_tree = (CommonTree)adaptor.create(COMMAND_KW159);
            root_0 = (CommonTree)adaptor.becomeRoot(COMMAND_KW159_tree, root_0);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:199:14: ( IDENT IS )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IDENT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:199:15: IDENT IS
                    {
                    IDENT160=(Token)match(input,IDENT,FOLLOW_IDENT_in_commande1488); 
                    IDENT160_tree = (CommonTree)adaptor.create(IDENT160);
                    adaptor.addChild(root_0, IDENT160_tree);

                    IS161=(Token)match(input,IS,FOLLOW_IS_in_commande1490); 

                    }
                    break;

            }

            pushFollow(FOLLOW_actionCommande_in_commande1495);
            actionCommande162=actionCommande();

            state._fsp--;

            adaptor.addChild(root_0, actionCommande162.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:199:42: ( VIRG actionCommande )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==VIRG) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:199:43: VIRG actionCommande
            	    {
            	    VIRG163=(Token)match(input,VIRG,FOLLOW_VIRG_in_commande1498); 
            	    pushFollow(FOLLOW_actionCommande_in_commande1501);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:202:1: actionCommande : ( MOUSE souris FOR actionCommandeType -> ^( MOUSE_KW souris actionCommandeType ) | KEY clavier FOR actionCommandeType -> ^( KEY_KW clavier actionCommandeType ) );
    public final hightParser.actionCommande_return actionCommande() throws RecognitionException {
        hightParser.actionCommande_return retval = new hightParser.actionCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOUSE165=null;
        Token FOR167=null;
        Token KEY169=null;
        Token FOR171=null;
        hightParser.souris_return souris166 = null;

        hightParser.actionCommandeType_return actionCommandeType168 = null;

        hightParser.clavier_return clavier170 = null;

        hightParser.actionCommandeType_return actionCommandeType172 = null;


        CommonTree MOUSE165_tree=null;
        CommonTree FOR167_tree=null;
        CommonTree KEY169_tree=null;
        CommonTree FOR171_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_actionCommandeType=new RewriteRuleSubtreeStream(adaptor,"rule actionCommandeType");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:202:16: ( MOUSE souris FOR actionCommandeType -> ^( MOUSE_KW souris actionCommandeType ) | KEY clavier FOR actionCommandeType -> ^( KEY_KW clavier actionCommandeType ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==MOUSE) ) {
                alt50=1;
            }
            else if ( (LA50_0==KEY) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:203:2: MOUSE souris FOR actionCommandeType
                    {
                    MOUSE165=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_actionCommande1514);  
                    stream_MOUSE.add(MOUSE165);

                    pushFollow(FOLLOW_souris_in_actionCommande1516);
                    souris166=souris();

                    state._fsp--;

                    stream_souris.add(souris166.getTree());
                    FOR167=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande1518);  
                    stream_FOR.add(FOR167);

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1520);
                    actionCommandeType168=actionCommandeType();

                    state._fsp--;

                    stream_actionCommandeType.add(actionCommandeType168.getTree());


                    // AST REWRITE
                    // elements: souris, actionCommandeType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:4: -> ^( MOUSE_KW souris actionCommandeType )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:204:7: ^( MOUSE_KW souris actionCommandeType )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        adaptor.addChild(root_1, stream_souris.nextTree());
                        adaptor.addChild(root_1, stream_actionCommandeType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:205:4: KEY clavier FOR actionCommandeType
                    {
                    KEY169=(Token)match(input,KEY,FOLLOW_KEY_in_actionCommande1538);  
                    stream_KEY.add(KEY169);

                    pushFollow(FOLLOW_clavier_in_actionCommande1540);
                    clavier170=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier170.getTree());
                    FOR171=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande1542);  
                    stream_FOR.add(FOR171);

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1544);
                    actionCommandeType172=actionCommandeType();

                    state._fsp--;

                    stream_actionCommandeType.add(actionCommandeType172.getTree());


                    // AST REWRITE
                    // elements: clavier, actionCommandeType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:4: -> ^( KEY_KW clavier actionCommandeType )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:206:7: ^( KEY_KW clavier actionCommandeType )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEY_KW, "KEY_KW"), root_1);

                        adaptor.addChild(root_1, stream_clavier.nextTree());
                        adaptor.addChild(root_1, stream_actionCommandeType.nextTree());

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
    // $ANTLR end "actionCommande"

    public static class actionCommandeType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommandeType"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:209:1: actionCommandeType : ( IDENT | actionCommandePressee | actionCommandeMaintenue );
    public final hightParser.actionCommandeType_return actionCommandeType() throws RecognitionException {
        hightParser.actionCommandeType_return retval = new hightParser.actionCommandeType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT173=null;
        hightParser.actionCommandePressee_return actionCommandePressee174 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue175 = null;


        CommonTree IDENT173_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:209:20: ( IDENT | actionCommandePressee | actionCommandeMaintenue )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:210:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT173=(Token)match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1569); 
                    IDENT173_tree = (CommonTree)adaptor.create(IDENT173);
                    adaptor.addChild(root_0, IDENT173_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:210:10: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1573);
                    actionCommandePressee174=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee174.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:210:34: actionCommandeMaintenue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1577);
                    actionCommandeMaintenue175=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue175.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:213:1: souris : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final hightParser.souris_return souris() throws RecognitionException {
        hightParser.souris_return retval = new hightParser.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set176=null;

        CommonTree set176_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:213:8: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set176=(Token)input.LT(1);
            if ( (input.LA(1)>=WUP && input.LA(1)<=SCROLL_DOWN) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set176));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:217:1: clavier : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final hightParser.clavier_return clavier() throws RecognitionException {
        hightParser.clavier_return retval = new hightParser.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set177=null;

        CommonTree set177_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:217:9: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set177=(Token)input.LT(1);
            if ( (input.LA(1)>=WUP && input.LA(1)<=RIGHT)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set177));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:221:1: actionCommandePressee : ( JUMP operation | PAUSE_KW | STOP_KW );
    public final hightParser.actionCommandePressee_return actionCommandePressee() throws RecognitionException {
        hightParser.actionCommandePressee_return retval = new hightParser.actionCommandePressee_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token JUMP178=null;
        Token PAUSE_KW180=null;
        Token STOP_KW181=null;
        hightParser.operation_return operation179 = null;


        CommonTree JUMP178_tree=null;
        CommonTree PAUSE_KW180_tree=null;
        CommonTree STOP_KW181_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:221:23: ( JUMP operation | PAUSE_KW | STOP_KW )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:222:3: JUMP operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    JUMP178=(Token)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1689); 
                    JUMP178_tree = (CommonTree)adaptor.create(JUMP178);
                    adaptor.addChild(root_0, JUMP178_tree);

                    pushFollow(FOLLOW_operation_in_actionCommandePressee1691);
                    operation179=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation179.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:223:5: PAUSE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PAUSE_KW180=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1697); 
                    PAUSE_KW180_tree = (CommonTree)adaptor.create(PAUSE_KW180);
                    adaptor.addChild(root_0, PAUSE_KW180_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:224:5: STOP_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STOP_KW181=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1703); 
                    STOP_KW181_tree = (CommonTree)adaptor.create(STOP_KW181);
                    adaptor.addChild(root_0, STOP_KW181_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:227:1: actionCommandeMaintenue : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
    public final hightParser.actionCommandeMaintenue_return actionCommandeMaintenue() throws RecognitionException {
        hightParser.actionCommandeMaintenue_return retval = new hightParser.actionCommandeMaintenue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVE182=null;
        Token set183=null;
        Token TURN184=null;
        Token set185=null;
        Token ACCELERATE186=null;
        Token BRAKE187=null;

        CommonTree MOVE182_tree=null;
        CommonTree set183_tree=null;
        CommonTree TURN184_tree=null;
        CommonTree set185_tree=null;
        CommonTree ACCELERATE186_tree=null;
        CommonTree BRAKE187_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:227:25: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:228:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MOVE182=(Token)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1718); 
                    MOVE182_tree = (CommonTree)adaptor.create(MOVE182);
                    adaptor.addChild(root_0, MOVE182_tree);

                    set183=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=FORWARD && input.LA(1)<=BACKWARD) ) {
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
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:229:5: TURN ( LEFT | RIGHT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURN184=(Token)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1740); 
                    TURN184_tree = (CommonTree)adaptor.create(TURN184);
                    adaptor.addChild(root_0, TURN184_tree);

                    set185=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT) ) {
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
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:230:5: ACCELERATE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACCELERATE186=(Token)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1754); 
                    ACCELERATE186_tree = (CommonTree)adaptor.create(ACCELERATE186);
                    adaptor.addChild(root_0, ACCELERATE186_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:231:5: BRAKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BRAKE187=(Token)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1760); 
                    BRAKE187_tree = (CommonTree)adaptor.create(BRAKE187);
                    adaptor.addChild(root_0, BRAKE187_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:234:1: activCommande : ( ACTIVATE_KW | DISABLE_KW ) typeCommand ;
    public final hightParser.activCommande_return activCommande() throws RecognitionException {
        hightParser.activCommande_return retval = new hightParser.activCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ACTIVATE_KW188=null;
        Token DISABLE_KW189=null;
        hightParser.typeCommand_return typeCommand190 = null;


        CommonTree ACTIVATE_KW188_tree=null;
        CommonTree DISABLE_KW189_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:234:15: ( ( ACTIVATE_KW | DISABLE_KW ) typeCommand )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:235:3: ( ACTIVATE_KW | DISABLE_KW ) typeCommand
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:235:3: ( ACTIVATE_KW | DISABLE_KW )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:235:4: ACTIVATE_KW
                    {
                    ACTIVATE_KW188=(Token)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1776); 
                    ACTIVATE_KW188_tree = (CommonTree)adaptor.create(ACTIVATE_KW188);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW188_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:235:19: DISABLE_KW
                    {
                    DISABLE_KW189=(Token)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1781); 
                    DISABLE_KW189_tree = (CommonTree)adaptor.create(DISABLE_KW189);
                    root_0 = (CommonTree)adaptor.becomeRoot(DISABLE_KW189_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeCommand_in_activCommande1785);
            typeCommand190=typeCommand();

            state._fsp--;

            adaptor.addChild(root_0, typeCommand190.getTree());

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

    public static class typeCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCommand"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:238:1: typeCommand : ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD );
    public final hightParser.typeCommand_return typeCommand() throws RecognitionException {
        hightParser.typeCommand_return retval = new hightParser.typeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMANDS191=null;
        Token MOUSE192=null;
        Token VIRG194=null;
        Token KEY196=null;
        Token VIRG198=null;
        Token KEYBOARD200=null;
        hightParser.souris_return souris193 = null;

        hightParser.souris_return souris195 = null;

        hightParser.clavier_return clavier197 = null;

        hightParser.clavier_return clavier199 = null;


        CommonTree COMMANDS191_tree=null;
        CommonTree MOUSE192_tree=null;
        CommonTree VIRG194_tree=null;
        CommonTree KEY196_tree=null;
        CommonTree VIRG198_tree=null;
        CommonTree KEYBOARD200_tree=null;
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:238:13: ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD )
            int alt58=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt58=1;
                }
                break;
            case MOUSE:
                {
                alt58=2;
                }
                break;
            case KEY:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:239:5: COMMANDS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMMANDS191=(Token)match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand1799); 
                    COMMANDS191_tree = (CommonTree)adaptor.create(COMMANDS191);
                    adaptor.addChild(root_0, COMMANDS191_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:240:7: MOUSE ( souris ( VIRG souris )* )?
                    {
                    MOUSE192=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_typeCommand1807);  
                    stream_MOUSE.add(MOUSE192);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:240:13: ( souris ( VIRG souris )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( ((LA56_0>=WUP && LA56_0<=SCROLL_DOWN)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:240:14: souris ( VIRG souris )*
                            {
                            pushFollow(FOLLOW_souris_in_typeCommand1810);
                            souris193=souris();

                            state._fsp--;

                            stream_souris.add(souris193.getTree());
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:240:21: ( VIRG souris )*
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
                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:240:22: VIRG souris
                            	    {
                            	    VIRG194=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand1813);  
                            	    stream_VIRG.add(VIRG194);

                            	    pushFollow(FOLLOW_souris_in_typeCommand1815);
                            	    souris195=souris();

                            	    state._fsp--;

                            	    stream_souris.add(souris195.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: souris
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 241:7: -> ^( MOUSE_KW ( souris )* )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:241:10: ^( MOUSE_KW ( souris )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:241:21: ( souris )*
                        while ( stream_souris.hasNext() ) {
                            adaptor.addChild(root_1, stream_souris.nextTree());

                        }
                        stream_souris.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:242:7: KEY clavier ( VIRG clavier )*
                    {
                    KEY196=(Token)match(input,KEY,FOLLOW_KEY_in_typeCommand1842);  
                    stream_KEY.add(KEY196);

                    pushFollow(FOLLOW_clavier_in_typeCommand1844);
                    clavier197=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier197.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:242:19: ( VIRG clavier )*
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
                    	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:242:20: VIRG clavier
                    	    {
                    	    VIRG198=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand1847);  
                    	    stream_VIRG.add(VIRG198);

                    	    pushFollow(FOLLOW_clavier_in_typeCommand1849);
                    	    clavier199=clavier();

                    	    state._fsp--;

                    	    stream_clavier.add(clavier199.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: clavier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 243:7: -> ^( KEY_KW ( clavier )+ )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:243:10: ^( KEY_KW ( clavier )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEY_KW, "KEY_KW"), root_1);

                        if ( !(stream_clavier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_clavier.hasNext() ) {
                            adaptor.addChild(root_1, stream_clavier.nextTree());

                        }
                        stream_clavier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:244:7: KEYBOARD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KEYBOARD200=(Token)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand1874); 
                    KEYBOARD200_tree = (CommonTree)adaptor.create(KEYBOARD200);
                    adaptor.addChild(root_0, KEYBOARD200_tree);


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
    // $ANTLR end "typeCommand"

    public static class reglesJeu_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reglesJeu"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:246:1: reglesJeu : RULE_KW ( IDENT IS )? declencheur THEN consequences ;
    public final hightParser.reglesJeu_return reglesJeu() throws RecognitionException {
        hightParser.reglesJeu_return retval = new hightParser.reglesJeu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RULE_KW201=null;
        Token IDENT202=null;
        Token IS203=null;
        Token THEN205=null;
        hightParser.declencheur_return declencheur204 = null;

        hightParser.consequences_return consequences206 = null;


        CommonTree RULE_KW201_tree=null;
        CommonTree IDENT202_tree=null;
        CommonTree IS203_tree=null;
        CommonTree THEN205_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:246:11: ( RULE_KW ( IDENT IS )? declencheur THEN consequences )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:247:3: RULE_KW ( IDENT IS )? declencheur THEN consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            RULE_KW201=(Token)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1884); 
            RULE_KW201_tree = (CommonTree)adaptor.create(RULE_KW201);
            root_0 = (CommonTree)adaptor.becomeRoot(RULE_KW201_tree, root_0);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:247:12: ( IDENT IS )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:247:13: IDENT IS
                    {
                    IDENT202=(Token)match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1888); 
                    IDENT202_tree = (CommonTree)adaptor.create(IDENT202);
                    adaptor.addChild(root_0, IDENT202_tree);

                    IS203=(Token)match(input,IS,FOLLOW_IS_in_reglesJeu1890); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu1896);
            declencheur204=declencheur();

            state._fsp--;

            adaptor.addChild(root_0, declencheur204.getTree());
            THEN205=(Token)match(input,THEN,FOLLOW_THEN_in_reglesJeu1898); 
            pushFollow(FOLLOW_consequences_in_reglesJeu1901);
            consequences206=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences206.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:250:1: declencheur : ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW );
    public final hightParser.declencheur_return declencheur() throws RecognitionException {
        hightParser.declencheur_return retval = new hightParser.declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVES_KW208=null;
        Token DIES_KW209=null;
        Token set212=null;
        Token ENDS_KW213=null;
        Token STARTS_KW214=null;
        Token BECOMES216=null;
        Token IDENT218=null;
        Token BECOMES219=null;
        Token VICTORY_KW221=null;
        Token DEFEAT_KW222=null;
        hightParser.accesClasse_return accesClasse207 = null;

        hightParser.declencheurTK_return declencheurTK210 = null;

        hightParser.declencheurKT_return declencheurKT211 = null;

        hightParser.variable_return variable215 = null;

        hightParser.varOuNB_return varOuNB217 = null;

        hightParser.playerOuInteraction_return playerOuInteraction220 = null;


        CommonTree MOVES_KW208_tree=null;
        CommonTree DIES_KW209_tree=null;
        CommonTree set212_tree=null;
        CommonTree ENDS_KW213_tree=null;
        CommonTree STARTS_KW214_tree=null;
        CommonTree BECOMES216_tree=null;
        CommonTree IDENT218_tree=null;
        CommonTree BECOMES219_tree=null;
        CommonTree VICTORY_KW221_tree=null;
        CommonTree DEFEAT_KW222_tree=null;
        RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_varOuNB=new RewriteRuleSubtreeStream(adaptor,"rule varOuNB");
        RewriteRuleSubtreeStream stream_playerOuInteraction=new RewriteRuleSubtreeStream(adaptor,"rule playerOuInteraction");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:250:13: ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:251:3: accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_declencheur1915);
                    accesClasse207=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse207.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:251:15: ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:251:16: MOVES_KW
                            {
                            MOVES_KW208=(Token)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1918); 
                            MOVES_KW208_tree = (CommonTree)adaptor.create(MOVES_KW208);
                            adaptor.addChild(root_0, MOVES_KW208_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:251:27: DIES_KW
                            {
                            DIES_KW209=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1922); 
                            DIES_KW209_tree = (CommonTree)adaptor.create(DIES_KW209);
                            adaptor.addChild(root_0, DIES_KW209_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:251:37: declencheurTK
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1926);
                            declencheurTK210=declencheurTK();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK210.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:251:53: declencheurKT
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1930);
                            declencheurKT211=declencheurKT();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT211.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:252:5: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set212=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set212));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:252:20: ( ENDS_KW | STARTS_KW )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:252:21: ENDS_KW
                            {
                            ENDS_KW213=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1947); 
                            ENDS_KW213_tree = (CommonTree)adaptor.create(ENDS_KW213);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW213_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:252:31: STARTS_KW
                            {
                            STARTS_KW214=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1951); 
                            STARTS_KW214_tree = (CommonTree)adaptor.create(STARTS_KW214);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW214_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:253:5: variable BECOMES varOuNB
                    {
                    pushFollow(FOLLOW_variable_in_declencheur1969);
                    variable215=variable();

                    state._fsp--;

                    stream_variable.add(variable215.getTree());
                    BECOMES216=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1971);  
                    stream_BECOMES.add(BECOMES216);

                    pushFollow(FOLLOW_varOuNB_in_declencheur1973);
                    varOuNB217=varOuNB();

                    state._fsp--;

                    stream_varOuNB.add(varOuNB217.getTree());


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
                    // 254:5: -> ^( BECOMES_VAR_KW variable varOuNB )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:254:8: ^( BECOMES_VAR_KW variable varOuNB )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:255:5: IDENT BECOMES playerOuInteraction
                    {
                    IDENT218=(Token)match(input,IDENT,FOLLOW_IDENT_in_declencheur1993);  
                    stream_IDENT.add(IDENT218);

                    BECOMES219=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1995);  
                    stream_BECOMES.add(BECOMES219);

                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1997);
                    playerOuInteraction220=playerOuInteraction();

                    state._fsp--;

                    stream_playerOuInteraction.add(playerOuInteraction220.getTree());


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
                    // 256:5: -> ^( BECOMES_ID_KW IDENT playerOuInteraction )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:256:8: ^( BECOMES_ID_KW IDENT playerOuInteraction )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:257:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW221=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur2017); 
                    VICTORY_KW221_tree = (CommonTree)adaptor.create(VICTORY_KW221);
                    adaptor.addChild(root_0, VICTORY_KW221_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:258:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW222=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur2023); 
                    DEFEAT_KW222_tree = (CommonTree)adaptor.create(DEFEAT_KW222);
                    adaptor.addChild(root_0, DEFEAT_KW222_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:261:1: varOuNB : ( variable | FLOAT );
    public final hightParser.varOuNB_return varOuNB() throws RecognitionException {
        hightParser.varOuNB_return retval = new hightParser.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FLOAT224=null;
        hightParser.variable_return variable223 = null;


        CommonTree FLOAT224_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:261:9: ( variable | FLOAT )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:261:11: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_varOuNB2034);
                    variable223=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable223.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:261:22: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT224=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2038); 
                    FLOAT224_tree = (CommonTree)adaptor.create(FLOAT224);
                    adaptor.addChild(root_0, FLOAT224_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:263:1: playerOuInteraction : ( PLAYER | interaction ) ;
    public final hightParser.playerOuInteraction_return playerOuInteraction() throws RecognitionException {
        hightParser.playerOuInteraction_return retval = new hightParser.playerOuInteraction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER225=null;
        hightParser.interaction_return interaction226 = null;


        CommonTree PLAYER225_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:2: ( ( PLAYER | interaction ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:4: ( PLAYER | interaction )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:4: ( PLAYER | interaction )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:5: PLAYER
                    {
                    PLAYER225=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction2048); 
                    PLAYER225_tree = (CommonTree)adaptor.create(PLAYER225);
                    adaptor.addChild(root_0, PLAYER225_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction2051);
                    interaction226=interaction();

                    state._fsp--;

                    adaptor.addChild(root_0, interaction226.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:266:1: declencheurTK : ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) ;
    public final hightParser.declencheurTK_return declencheurTK() throws RecognitionException {
        hightParser.declencheurTK_return retval = new hightParser.declencheurTK_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOUCHES_KW227=null;
        Token KILLS_KW228=null;
        Token OTHER229=null;
        hightParser.accesGlobal_return accesGlobal230 = null;

        hightParser.accesLocal_return accesLocal231 = null;


        CommonTree TOUCHES_KW227_tree=null;
        CommonTree KILLS_KW228_tree=null;
        CommonTree OTHER229_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:2: ( ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:4: ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:4: ( TOUCHES_KW | KILLS_KW )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:5: TOUCHES_KW
                    {
                    TOUCHES_KW227=(Token)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2063); 
                    TOUCHES_KW227_tree = (CommonTree)adaptor.create(TOUCHES_KW227);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW227_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:19: KILLS_KW
                    {
                    KILLS_KW228=(Token)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2068); 
                    KILLS_KW228_tree = (CommonTree)adaptor.create(KILLS_KW228);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLS_KW228_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:30: ( ( OTHER )? accesGlobal | accesLocal )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:31: ( OTHER )? accesGlobal
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:31: ( OTHER )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==OTHER) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:32: OTHER
                            {
                            OTHER229=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2074); 
                            OTHER229_tree = (CommonTree)adaptor.create(OTHER229);
                            adaptor.addChild(root_0, OTHER229_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesGlobal_in_declencheurTK2078);
                    accesGlobal230=accesGlobal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal230.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:54: accesLocal
                    {
                    pushFollow(FOLLOW_accesLocal_in_declencheurTK2082);
                    accesLocal231=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal231.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:269:1: declencheurKT : ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? ;
    public final hightParser.declencheurKT_return declencheurKT() throws RecognitionException {
        hightParser.declencheurKT_return retval = new hightParser.declencheurKT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KILLED_KW232=null;
        Token TOUCHED_KW233=null;
        Token BY234=null;
        Token OTHER235=null;
        hightParser.accesGlobal_return accesGlobal236 = null;

        hightParser.accesLocal_return accesLocal237 = null;


        CommonTree KILLED_KW232_tree=null;
        CommonTree TOUCHED_KW233_tree=null;
        CommonTree BY234_tree=null;
        CommonTree OTHER235_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:2: ( ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:4: ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:4: ( KILLED_KW | TOUCHED_KW )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:5: KILLED_KW
                    {
                    KILLED_KW232=(Token)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2094); 
                    KILLED_KW232_tree = (CommonTree)adaptor.create(KILLED_KW232);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLED_KW232_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:18: TOUCHED_KW
                    {
                    TOUCHED_KW233=(Token)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2099); 
                    TOUCHED_KW233_tree = (CommonTree)adaptor.create(TOUCHED_KW233);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW233_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:31: ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==BY) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:32: BY ( ( OTHER )? accesGlobal | accesLocal )
                    {
                    BY234=(Token)match(input,BY,FOLLOW_BY_in_declencheurKT2104); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:36: ( ( OTHER )? accesGlobal | accesLocal )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:37: ( OTHER )? accesGlobal
                            {
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:37: ( OTHER )?
                            int alt69=2;
                            int LA69_0 = input.LA(1);

                            if ( (LA69_0==OTHER) ) {
                                alt69=1;
                            }
                            switch (alt69) {
                                case 1 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:38: OTHER
                                    {
                                    OTHER235=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2109); 
                                    OTHER235_tree = (CommonTree)adaptor.create(OTHER235);
                                    adaptor.addChild(root_0, OTHER235_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesGlobal_in_declencheurKT2113);
                            accesGlobal236=accesGlobal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesGlobal236.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:60: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_declencheurKT2117);
                            accesLocal237=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal237.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:273:1: siAlors : IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF ;
    public final hightParser.siAlors_return siAlors() throws RecognitionException {
        hightParser.siAlors_return retval = new hightParser.siAlors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF_KW238=null;
        Token THEN240=null;
        Token ELSE242=null;
        Token ENDIF244=null;
        hightParser.conditions_return conditions239 = null;

        hightParser.consequences_return consequences241 = null;

        hightParser.consequences_return consequences243 = null;


        CommonTree IF_KW238_tree=null;
        CommonTree THEN240_tree=null;
        CommonTree ELSE242_tree=null;
        CommonTree ENDIF244_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:273:9: ( IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:274:3: IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF_KW238=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2134); 
            IF_KW238_tree = (CommonTree)adaptor.create(IF_KW238);
            root_0 = (CommonTree)adaptor.becomeRoot(IF_KW238_tree, root_0);

            pushFollow(FOLLOW_conditions_in_siAlors2137);
            conditions239=conditions();

            state._fsp--;

            adaptor.addChild(root_0, conditions239.getTree());
            THEN240=(Token)match(input,THEN,FOLLOW_THEN_in_siAlors2139); 
            pushFollow(FOLLOW_consequences_in_siAlors2142);
            consequences241=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences241.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:274:40: ( ELSE consequences )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==ELSE) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:274:41: ELSE consequences
                    {
                    ELSE242=(Token)match(input,ELSE,FOLLOW_ELSE_in_siAlors2145); 
                    pushFollow(FOLLOW_consequences_in_siAlors2148);
                    consequences243=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences243.getTree());

                    }
                    break;

            }

            ENDIF244=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_siAlors2152); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:277:1: conditions : ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) ;
    public final hightParser.conditions_return conditions() throws RecognitionException {
        hightParser.conditions_return retval = new hightParser.conditions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT245=null;
        hightParser.conditionOu_return conditionOu246 = null;


        CommonTree NOT245_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_conditionOu=new RewriteRuleSubtreeStream(adaptor,"rule conditionOu");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:277:12: ( ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:278:3: ( NOT )? conditionOu
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:278:3: ( NOT )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==NOT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:278:4: NOT
                    {
                    NOT245=(Token)match(input,NOT,FOLLOW_NOT_in_conditions2167);  
                    stream_NOT.add(NOT245);


                    }
                    break;

            }

            pushFollow(FOLLOW_conditionOu_in_conditions2171);
            conditionOu246=conditionOu();

            state._fsp--;

            stream_conditionOu.add(conditionOu246.getTree());


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
            // 279:3: -> ^( CONDITION_KW ( NOT )? conditionOu )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:279:6: ^( CONDITION_KW ( NOT )? conditionOu )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_KW, "CONDITION_KW"), root_1);

                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:279:21: ( NOT )?
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:282:1: conditionOu : conditionEt ( OR ( NOT )? conditionOu )? ;
    public final hightParser.conditionOu_return conditionOu() throws RecognitionException {
        hightParser.conditionOu_return retval = new hightParser.conditionOu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR248=null;
        Token NOT249=null;
        hightParser.conditionEt_return conditionEt247 = null;

        hightParser.conditionOu_return conditionOu250 = null;


        CommonTree OR248_tree=null;
        CommonTree NOT249_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:282:13: ( conditionEt ( OR ( NOT )? conditionOu )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:283:3: conditionEt ( OR ( NOT )? conditionOu )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionEt_in_conditionOu2197);
            conditionEt247=conditionEt();

            state._fsp--;

            adaptor.addChild(root_0, conditionEt247.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:283:15: ( OR ( NOT )? conditionOu )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==OR) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:283:16: OR ( NOT )? conditionOu
                    {
                    OR248=(Token)match(input,OR,FOLLOW_OR_in_conditionOu2200); 
                    OR248_tree = (CommonTree)adaptor.create(OR248);
                    root_0 = (CommonTree)adaptor.becomeRoot(OR248_tree, root_0);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:283:20: ( NOT )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NOT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:283:21: NOT
                            {
                            NOT249=(Token)match(input,NOT,FOLLOW_NOT_in_conditionOu2204); 
                            NOT249_tree = (CommonTree)adaptor.create(NOT249);
                            adaptor.addChild(root_0, NOT249_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditionOu_in_conditionOu2208);
                    conditionOu250=conditionOu();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionOu250.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:286:1: conditionEt : cond ( AND ( NOT )? conditionEt )? ;
    public final hightParser.conditionEt_return conditionEt() throws RecognitionException {
        hightParser.conditionEt_return retval = new hightParser.conditionEt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND252=null;
        Token NOT253=null;
        hightParser.cond_return cond251 = null;

        hightParser.conditionEt_return conditionEt254 = null;


        CommonTree AND252_tree=null;
        CommonTree NOT253_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:286:13: ( cond ( AND ( NOT )? conditionEt )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:287:3: cond ( AND ( NOT )? conditionEt )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cond_in_conditionEt2224);
            cond251=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond251.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:287:8: ( AND ( NOT )? conditionEt )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==AND) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:287:9: AND ( NOT )? conditionEt
                    {
                    AND252=(Token)match(input,AND,FOLLOW_AND_in_conditionEt2227); 
                    AND252_tree = (CommonTree)adaptor.create(AND252);
                    root_0 = (CommonTree)adaptor.becomeRoot(AND252_tree, root_0);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:287:14: ( NOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NOT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:287:15: NOT
                            {
                            NOT253=(Token)match(input,NOT,FOLLOW_NOT_in_conditionEt2231); 
                            NOT253_tree = (CommonTree)adaptor.create(NOT253);
                            adaptor.addChild(root_0, NOT253_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_conditionEt_in_conditionEt2235);
                    conditionEt254=conditionEt();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionEt254.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:290:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD );
    public final hightParser.cond_return cond() throws RecognitionException {
        hightParser.cond_return retval = new hightParser.cond_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMP256=null;
        Token EQUALS258=null;
        Token INF259=null;
        Token SUP260=null;
        Token INFEG261=null;
        Token SUPED262=null;
        Token DIFF263=null;
        Token PG265=null;
        Token PD267=null;
        hightParser.etat_return etat255 = null;

        hightParser.operation_return operation257 = null;

        hightParser.operation_return operation264 = null;

        hightParser.conditions_return conditions266 = null;


        CommonTree COMP256_tree=null;
        CommonTree EQUALS258_tree=null;
        CommonTree INF259_tree=null;
        CommonTree SUP260_tree=null;
        CommonTree INFEG261_tree=null;
        CommonTree SUPED262_tree=null;
        CommonTree DIFF263_tree=null;
        CommonTree PG265_tree=null;
        CommonTree PD267_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:290:6: ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD )
            int alt79=3;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:291:3: etat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_etat_in_cond2251);
                    etat255=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, etat255.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:292:5: COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMP256=(Token)match(input,COMP,FOLLOW_COMP_in_cond2257); 
                    pushFollow(FOLLOW_operation_in_cond2260);
                    operation257=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation257.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:292:21: ( EQUALS | INF | SUP | INFEG | SUPED | DIFF )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:292:22: EQUALS
                            {
                            EQUALS258=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond2263); 
                            EQUALS258_tree = (CommonTree)adaptor.create(EQUALS258);
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALS258_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:292:32: INF
                            {
                            INF259=(Token)match(input,INF,FOLLOW_INF_in_cond2268); 
                            INF259_tree = (CommonTree)adaptor.create(INF259);
                            root_0 = (CommonTree)adaptor.becomeRoot(INF259_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:292:39: SUP
                            {
                            SUP260=(Token)match(input,SUP,FOLLOW_SUP_in_cond2273); 
                            SUP260_tree = (CommonTree)adaptor.create(SUP260);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUP260_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:292:46: INFEG
                            {
                            INFEG261=(Token)match(input,INFEG,FOLLOW_INFEG_in_cond2278); 
                            INFEG261_tree = (CommonTree)adaptor.create(INFEG261);
                            root_0 = (CommonTree)adaptor.becomeRoot(INFEG261_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:292:55: SUPED
                            {
                            SUPED262=(Token)match(input,SUPED,FOLLOW_SUPED_in_cond2283); 
                            SUPED262_tree = (CommonTree)adaptor.create(SUPED262);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUPED262_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:292:64: DIFF
                            {
                            DIFF263=(Token)match(input,DIFF,FOLLOW_DIFF_in_cond2288); 
                            DIFF263_tree = (CommonTree)adaptor.create(DIFF263);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIFF263_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_cond2292);
                    operation264=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation264.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:293:5: PG conditions PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG265=(Token)match(input,PG,FOLLOW_PG_in_cond2309); 
                    PG265_tree = (CommonTree)adaptor.create(PG265);
                    adaptor.addChild(root_0, PG265_tree);

                    pushFollow(FOLLOW_conditions_in_cond2311);
                    conditions266=conditions();

                    state._fsp--;

                    adaptor.addChild(root_0, conditions266.getTree());
                    PD267=(Token)match(input,PD,FOLLOW_PD_in_cond2313); 
                    PD267_tree = (CommonTree)adaptor.create(PD267);
                    adaptor.addChild(root_0, PD267_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:296:1: etat : ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW );
    public final hightParser.etat_return etat() throws RecognitionException {
        hightParser.etat_return retval = new hightParser.etat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS269=null;
        Token NOT270=null;
        Token DEAD_KW271=null;
        Token ALIVE_KW272=null;
        Token EFFACED_KW273=null;
        Token GENERATED_KW274=null;
        Token TOUCHING_KW275=null;
        Token OTHER276=null;
        Token MOVING_KW279=null;
        Token WAITING_KW280=null;
        Token set281=null;
        Token IS282=null;
        Token NOT283=null;
        Token FINISHED_KW284=null;
        Token STARTED_KW285=null;
        Token PAUSED_KW286=null;
        Token MUTED_KW287=null;
        Token set288=null;
        Token PLAYED_KW289=null;
        Token STOPPED_KW290=null;
        Token VICTORY_KW291=null;
        Token DEFEAT_KW292=null;
        hightParser.accesClasse_return accesClasse268 = null;

        hightParser.accesGlobal_return accesGlobal277 = null;

        hightParser.accesLocal_return accesLocal278 = null;


        CommonTree IS269_tree=null;
        CommonTree NOT270_tree=null;
        CommonTree DEAD_KW271_tree=null;
        CommonTree ALIVE_KW272_tree=null;
        CommonTree EFFACED_KW273_tree=null;
        CommonTree GENERATED_KW274_tree=null;
        CommonTree TOUCHING_KW275_tree=null;
        CommonTree OTHER276_tree=null;
        CommonTree MOVING_KW279_tree=null;
        CommonTree WAITING_KW280_tree=null;
        CommonTree set281_tree=null;
        CommonTree IS282_tree=null;
        CommonTree NOT283_tree=null;
        CommonTree FINISHED_KW284_tree=null;
        CommonTree STARTED_KW285_tree=null;
        CommonTree PAUSED_KW286_tree=null;
        CommonTree MUTED_KW287_tree=null;
        CommonTree set288_tree=null;
        CommonTree PLAYED_KW289_tree=null;
        CommonTree STOPPED_KW290_tree=null;
        CommonTree VICTORY_KW291_tree=null;
        CommonTree DEFEAT_KW292_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:296:6: ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:3: accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_etat2327);
                    accesClasse268=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse268.getTree());
                    IS269=(Token)match(input,IS,FOLLOW_IS_in_etat2329); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:19: ( NOT )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NOT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:20: NOT
                            {
                            NOT270=(Token)match(input,NOT,FOLLOW_NOT_in_etat2333); 
                            NOT270_tree = (CommonTree)adaptor.create(NOT270);
                            adaptor.addChild(root_0, NOT270_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:26: ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:27: DEAD_KW
                            {
                            DEAD_KW271=(Token)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2338); 
                            DEAD_KW271_tree = (CommonTree)adaptor.create(DEAD_KW271);
                            root_0 = (CommonTree)adaptor.becomeRoot(DEAD_KW271_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:38: ALIVE_KW
                            {
                            ALIVE_KW272=(Token)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2343); 
                            ALIVE_KW272_tree = (CommonTree)adaptor.create(ALIVE_KW272);
                            root_0 = (CommonTree)adaptor.becomeRoot(ALIVE_KW272_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:50: EFFACED_KW
                            {
                            EFFACED_KW273=(Token)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2348); 
                            EFFACED_KW273_tree = (CommonTree)adaptor.create(EFFACED_KW273);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACED_KW273_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:64: GENERATED_KW
                            {
                            GENERATED_KW274=(Token)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2353); 
                            GENERATED_KW274_tree = (CommonTree)adaptor.create(GENERATED_KW274);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATED_KW274_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:80: TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal )
                            {
                            TOUCHING_KW275=(Token)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2358); 
                            TOUCHING_KW275_tree = (CommonTree)adaptor.create(TOUCHING_KW275);
                            root_0 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW275_tree, root_0);

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:93: ( ( OTHER )? accesGlobal | accesLocal )
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
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:94: ( OTHER )? accesGlobal
                                    {
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:94: ( OTHER )?
                                    int alt81=2;
                                    int LA81_0 = input.LA(1);

                                    if ( (LA81_0==OTHER) ) {
                                        alt81=1;
                                    }
                                    switch (alt81) {
                                        case 1 :
                                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:95: OTHER
                                            {
                                            OTHER276=(Token)match(input,OTHER,FOLLOW_OTHER_in_etat2363); 
                                            OTHER276_tree = (CommonTree)adaptor.create(OTHER276);
                                            adaptor.addChild(root_0, OTHER276_tree);


                                            }
                                            break;

                                    }

                                    pushFollow(FOLLOW_accesGlobal_in_etat2367);
                                    accesGlobal277=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal277.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:117: accesLocal
                                    {
                                    pushFollow(FOLLOW_accesLocal_in_etat2371);
                                    accesLocal278=accesLocal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesLocal278.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:131: MOVING_KW
                            {
                            MOVING_KW279=(Token)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2376); 
                            MOVING_KW279_tree = (CommonTree)adaptor.create(MOVING_KW279);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOVING_KW279_tree, root_0);


                            }
                            break;
                        case 7 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:144: WAITING_KW
                            {
                            WAITING_KW280=(Token)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2381); 
                            WAITING_KW280_tree = (CommonTree)adaptor.create(WAITING_KW280);
                            root_0 = (CommonTree)adaptor.becomeRoot(WAITING_KW280_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:5: ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set281=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set281));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    IS282=(Token)match(input,IS,FOLLOW_IS_in_etat2399); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:24: ( NOT )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NOT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:25: NOT
                            {
                            NOT283=(Token)match(input,NOT,FOLLOW_NOT_in_etat2403); 
                            NOT283_tree = (CommonTree)adaptor.create(NOT283);
                            adaptor.addChild(root_0, NOT283_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:31: ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:32: FINISHED_KW
                            {
                            FINISHED_KW284=(Token)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2408); 
                            FINISHED_KW284_tree = (CommonTree)adaptor.create(FINISHED_KW284);
                            root_0 = (CommonTree)adaptor.becomeRoot(FINISHED_KW284_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:46: STARTED_KW
                            {
                            STARTED_KW285=(Token)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2412); 
                            STARTED_KW285_tree = (CommonTree)adaptor.create(STARTED_KW285);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTED_KW285_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:60: PAUSED_KW
                            {
                            PAUSED_KW286=(Token)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2417); 
                            PAUSED_KW286_tree = (CommonTree)adaptor.create(PAUSED_KW286);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSED_KW286_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:73: MUTED_KW ( ON | OFF )
                            {
                            MUTED_KW287=(Token)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2422); 
                            MUTED_KW287_tree = (CommonTree)adaptor.create(MUTED_KW287);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTED_KW287_tree, root_0);

                            set288=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set288));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:96: PLAYED_KW
                            {
                            PLAYED_KW289=(Token)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2435); 
                            PLAYED_KW289_tree = (CommonTree)adaptor.create(PLAYED_KW289);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAYED_KW289_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:109: STOPPED_KW
                            {
                            STOPPED_KW290=(Token)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2440); 
                            STOPPED_KW290_tree = (CommonTree)adaptor.create(STOPPED_KW290);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOPPED_KW290_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:300:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW291=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2454); 
                    VICTORY_KW291_tree = (CommonTree)adaptor.create(VICTORY_KW291);
                    adaptor.addChild(root_0, VICTORY_KW291_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:301:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW292=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2460); 
                    DEFEAT_KW292_tree = (CommonTree)adaptor.create(DEFEAT_KW292);
                    adaptor.addChild(root_0, DEFEAT_KW292_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:304:1: affectation : ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable );
    public final hightParser.affectation_return affectation() throws RecognitionException {
        hightParser.affectation_return retval = new hightParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN_KW293=null;
        Token ADD_KW294=null;
        Token SUB_KW295=null;
        Token FOR297=null;
        Token INVERT_KW299=null;
        Token WITH301=null;
        hightParser.operation_return operation296 = null;

        hightParser.variable_return variable298 = null;

        hightParser.variable_return variable300 = null;

        hightParser.variable_return variable302 = null;


        CommonTree ASSIGN_KW293_tree=null;
        CommonTree ADD_KW294_tree=null;
        CommonTree SUB_KW295_tree=null;
        CommonTree FOR297_tree=null;
        CommonTree INVERT_KW299_tree=null;
        CommonTree WITH301_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:304:13: ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:305:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:305:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation )
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:305:4: ( ASSIGN_KW | ADD_KW | SUB_KW ) operation
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:305:4: ( ASSIGN_KW | ADD_KW | SUB_KW )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:305:5: ASSIGN_KW
                            {
                            ASSIGN_KW293=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2477); 
                            ASSIGN_KW293_tree = (CommonTree)adaptor.create(ASSIGN_KW293);
                            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW293_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:305:18: ADD_KW
                            {
                            ADD_KW294=(Token)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2482); 
                            ADD_KW294_tree = (CommonTree)adaptor.create(ADD_KW294);
                            root_0 = (CommonTree)adaptor.becomeRoot(ADD_KW294_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:305:28: SUB_KW
                            {
                            SUB_KW295=(Token)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2487); 
                            SUB_KW295_tree = (CommonTree)adaptor.create(SUB_KW295);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUB_KW295_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_affectation2491);
                    operation296=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation296.getTree());

                    }

                    FOR297=(Token)match(input,FOR,FOLLOW_FOR_in_affectation2494); 
                    pushFollow(FOLLOW_variable_in_affectation2497);
                    variable298=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable298.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:306:5: INVERT_KW variable WITH variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INVERT_KW299=(Token)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2504); 
                    INVERT_KW299_tree = (CommonTree)adaptor.create(INVERT_KW299);
                    root_0 = (CommonTree)adaptor.becomeRoot(INVERT_KW299_tree, root_0);

                    pushFollow(FOLLOW_variable_in_affectation2507);
                    variable300=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable300.getTree());
                    WITH301=(Token)match(input,WITH,FOLLOW_WITH_in_affectation2509); 
                    pushFollow(FOLLOW_variable_in_affectation2512);
                    variable302=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable302.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:309:1: iaBasique : IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* ;
    public final hightParser.iaBasique_return iaBasique() throws RecognitionException {
        hightParser.iaBasique_return retval = new hightParser.iaBasique_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IA_KW303=null;
        Token IS305=null;
        Token VIRG307=null;
        hightParser.accesClasse_return accesClasse304 = null;

        hightParser.actionObjet_return actionObjet306 = null;

        hightParser.actionObjet_return actionObjet308 = null;


        CommonTree IA_KW303_tree=null;
        CommonTree IS305_tree=null;
        CommonTree VIRG307_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:309:11: ( IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:309:13: IA_KW accesClasse IS actionObjet ( VIRG actionObjet )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IA_KW303=(Token)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2525); 
            IA_KW303_tree = (CommonTree)adaptor.create(IA_KW303);
            root_0 = (CommonTree)adaptor.becomeRoot(IA_KW303_tree, root_0);

            pushFollow(FOLLOW_accesClasse_in_iaBasique2528);
            accesClasse304=accesClasse();

            state._fsp--;

            adaptor.addChild(root_0, accesClasse304.getTree());
            IS305=(Token)match(input,IS,FOLLOW_IS_in_iaBasique2530); 
            pushFollow(FOLLOW_actionObjet_in_iaBasique2533);
            actionObjet306=actionObjet();

            state._fsp--;

            adaptor.addChild(root_0, actionObjet306.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:309:48: ( VIRG actionObjet )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==VIRG) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:309:49: VIRG actionObjet
            	    {
            	    VIRG307=(Token)match(input,VIRG,FOLLOW_VIRG_in_iaBasique2536); 
            	    pushFollow(FOLLOW_actionObjet_in_iaBasique2539);
            	    actionObjet308=actionObjet();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionObjet308.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:313:1: operation : ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus );
    public final hightParser.operation_return operation() throws RecognitionException {
        hightParser.operation_return retval = new hightParser.operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RANDOM_KW310=null;
        Token BETWEEN311=null;
        Token AND313=null;
        hightParser.operationPlus_return operationPlus309 = null;

        hightParser.operationPlus_return operationPlus312 = null;

        hightParser.operationPlus_return operationPlus314 = null;


        CommonTree RANDOM_KW310_tree=null;
        CommonTree BETWEEN311_tree=null;
        CommonTree AND313_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:313:11: ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:314:2: operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operationPlus_in_operation2553);
                    operationPlus309=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus309.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:315:4: RANDOM_KW BETWEEN operationPlus AND operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RANDOM_KW310=(Token)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2558); 
                    RANDOM_KW310_tree = (CommonTree)adaptor.create(RANDOM_KW310);
                    root_0 = (CommonTree)adaptor.becomeRoot(RANDOM_KW310_tree, root_0);

                    BETWEEN311=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operation2561); 
                    pushFollow(FOLLOW_operationPlus_in_operation2564);
                    operationPlus312=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus312.getTree());
                    AND313=(Token)match(input,AND,FOLLOW_AND_in_operation2566); 
                    pushFollow(FOLLOW_operationPlus_in_operation2569);
                    operationPlus314=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus314.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:318:1: operationPlus : operationMul ( ( PLUS | MINUS ) operationMul )* ;
    public final hightParser.operationPlus_return operationPlus() throws RecognitionException {
        hightParser.operationPlus_return retval = new hightParser.operationPlus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS316=null;
        Token MINUS317=null;
        hightParser.operationMul_return operationMul315 = null;

        hightParser.operationMul_return operationMul318 = null;


        CommonTree PLUS316_tree=null;
        CommonTree MINUS317_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:318:15: ( operationMul ( ( PLUS | MINUS ) operationMul )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:319:2: operationMul ( ( PLUS | MINUS ) operationMul )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationMul_in_operationPlus2581);
            operationMul315=operationMul();

            state._fsp--;

            adaptor.addChild(root_0, operationMul315.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:319:15: ( ( PLUS | MINUS ) operationMul )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=PLUS && LA92_0<=MINUS)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:319:16: ( PLUS | MINUS ) operationMul
            	    {
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:319:16: ( PLUS | MINUS )
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
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:319:17: PLUS
            	            {
            	            PLUS316=(Token)match(input,PLUS,FOLLOW_PLUS_in_operationPlus2585); 
            	            PLUS316_tree = (CommonTree)adaptor.create(PLUS316);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS316_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:319:25: MINUS
            	            {
            	            MINUS317=(Token)match(input,MINUS,FOLLOW_MINUS_in_operationPlus2590); 
            	            MINUS317_tree = (CommonTree)adaptor.create(MINUS317);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS317_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_operationMul_in_operationPlus2594);
            	    operationMul318=operationMul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operationMul318.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:322:1: operationMul : operationPow ( ( MUL | DIV | MOD ) operationPow )? ;
    public final hightParser.operationMul_return operationMul() throws RecognitionException {
        hightParser.operationMul_return retval = new hightParser.operationMul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL320=null;
        Token DIV321=null;
        Token MOD322=null;
        hightParser.operationPow_return operationPow319 = null;

        hightParser.operationPow_return operationPow323 = null;


        CommonTree MUL320_tree=null;
        CommonTree DIV321_tree=null;
        CommonTree MOD322_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:322:14: ( operationPow ( ( MUL | DIV | MOD ) operationPow )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:323:2: operationPow ( ( MUL | DIV | MOD ) operationPow )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationPow_in_operationMul2607);
            operationPow319=operationPow();

            state._fsp--;

            adaptor.addChild(root_0, operationPow319.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:323:15: ( ( MUL | DIV | MOD ) operationPow )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=MUL && LA94_0<=MOD)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:323:16: ( MUL | DIV | MOD ) operationPow
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:323:16: ( MUL | DIV | MOD )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:323:17: MUL
                            {
                            MUL320=(Token)match(input,MUL,FOLLOW_MUL_in_operationMul2611); 
                            MUL320_tree = (CommonTree)adaptor.create(MUL320);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUL320_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:323:24: DIV
                            {
                            DIV321=(Token)match(input,DIV,FOLLOW_DIV_in_operationMul2616); 
                            DIV321_tree = (CommonTree)adaptor.create(DIV321);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIV321_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:323:31: MOD
                            {
                            MOD322=(Token)match(input,MOD,FOLLOW_MOD_in_operationMul2621); 
                            MOD322_tree = (CommonTree)adaptor.create(MOD322);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOD322_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operationPow_in_operationMul2625);
                    operationPow323=operationPow();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPow323.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:326:1: operationPow : operationBracket ( POW operationBracket )? ;
    public final hightParser.operationPow_return operationPow() throws RecognitionException {
        hightParser.operationPow_return retval = new hightParser.operationPow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POW325=null;
        hightParser.operationBracket_return operationBracket324 = null;

        hightParser.operationBracket_return operationBracket326 = null;


        CommonTree POW325_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:326:14: ( operationBracket ( POW operationBracket )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:327:2: operationBracket ( POW operationBracket )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationBracket_in_operationPow2640);
            operationBracket324=operationBracket();

            state._fsp--;

            adaptor.addChild(root_0, operationBracket324.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:327:19: ( POW operationBracket )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==POW) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:327:20: POW operationBracket
                    {
                    POW325=(Token)match(input,POW,FOLLOW_POW_in_operationPow2643); 
                    POW325_tree = (CommonTree)adaptor.create(POW325);
                    root_0 = (CommonTree)adaptor.becomeRoot(POW325_tree, root_0);

                    pushFollow(FOLLOW_operationBracket_in_operationPow2646);
                    operationBracket326=operationBracket();

                    state._fsp--;

                    adaptor.addChild(root_0, operationBracket326.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:330:1: operationBracket : ( PG operation PD | variable | FLOAT );
    public final hightParser.operationBracket_return operationBracket() throws RecognitionException {
        hightParser.operationBracket_return retval = new hightParser.operationBracket_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG327=null;
        Token PD329=null;
        Token FLOAT331=null;
        hightParser.operation_return operation328 = null;

        hightParser.variable_return variable330 = null;


        CommonTree PG327_tree=null;
        CommonTree PD329_tree=null;
        CommonTree FLOAT331_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:330:18: ( PG operation PD | variable | FLOAT )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:331:2: PG operation PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG327=(Token)match(input,PG,FOLLOW_PG_in_operationBracket2661); 
                    pushFollow(FOLLOW_operation_in_operationBracket2664);
                    operation328=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation328.getTree());
                    PD329=(Token)match(input,PD,FOLLOW_PD_in_operationBracket2666); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:332:4: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operationBracket2672);
                    variable330=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable330.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:333:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT331=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operationBracket2677); 
                    FLOAT331_tree = (CommonTree)adaptor.create(FLOAT331);
                    adaptor.addChild(root_0, FLOAT331_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:336:1: variable : ( ( X | Y | Z ) OF typeCoordonnees OF accesClasse | IDENT OF accesClasse -> ^( VAR_I_KW IDENT accesClasse ) | attribut OF accesClasse -> ^( VAR_A_KW attribut accesClasse ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesClasse -> ^( VALUE_KW attributTps accesClasse ) );
    public final hightParser.variable_return variable() throws RecognitionException {
        hightParser.variable_return retval = new hightParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token X332=null;
        Token Y333=null;
        Token Z334=null;
        Token OF335=null;
        Token OF337=null;
        Token IDENT339=null;
        Token OF340=null;
        Token OF343=null;
        Token SCORE345=null;
        Token OF346=null;
        Token GAME347=null;
        Token VALUE348=null;
        Token OF349=null;
        Token OF351=null;
        hightParser.typeCoordonnees_return typeCoordonnees336 = null;

        hightParser.accesClasse_return accesClasse338 = null;

        hightParser.accesClasse_return accesClasse341 = null;

        hightParser.attribut_return attribut342 = null;

        hightParser.accesClasse_return accesClasse344 = null;

        hightParser.attributTps_return attributTps350 = null;

        hightParser.accesClasse_return accesClasse352 = null;


        CommonTree X332_tree=null;
        CommonTree Y333_tree=null;
        CommonTree Z334_tree=null;
        CommonTree OF335_tree=null;
        CommonTree OF337_tree=null;
        CommonTree IDENT339_tree=null;
        CommonTree OF340_tree=null;
        CommonTree OF343_tree=null;
        CommonTree SCORE345_tree=null;
        CommonTree OF346_tree=null;
        CommonTree GAME347_tree=null;
        CommonTree VALUE348_tree=null;
        CommonTree OF349_tree=null;
        CommonTree OF351_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_attribut=new RewriteRuleSubtreeStream(adaptor,"rule attribut");
        RewriteRuleSubtreeStream stream_accesClasse=new RewriteRuleSubtreeStream(adaptor,"rule accesClasse");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:336:10: ( ( X | Y | Z ) OF typeCoordonnees OF accesClasse | IDENT OF accesClasse -> ^( VAR_I_KW IDENT accesClasse ) | attribut OF accesClasse -> ^( VAR_A_KW attribut accesClasse ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesClasse -> ^( VALUE_KW attributTps accesClasse ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:337:3: ( X | Y | Z ) OF typeCoordonnees OF accesClasse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:337:3: ( X | Y | Z )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:337:4: X
                            {
                            X332=(Token)match(input,X,FOLLOW_X_in_variable2690); 
                            X332_tree = (CommonTree)adaptor.create(X332);
                            root_0 = (CommonTree)adaptor.becomeRoot(X332_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:337:9: Y
                            {
                            Y333=(Token)match(input,Y,FOLLOW_Y_in_variable2695); 
                            Y333_tree = (CommonTree)adaptor.create(Y333);
                            root_0 = (CommonTree)adaptor.becomeRoot(Y333_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:337:14: Z
                            {
                            Z334=(Token)match(input,Z,FOLLOW_Z_in_variable2700); 
                            Z334_tree = (CommonTree)adaptor.create(Z334);
                            root_0 = (CommonTree)adaptor.becomeRoot(Z334_tree, root_0);


                            }
                            break;

                    }

                    OF335=(Token)match(input,OF,FOLLOW_OF_in_variable2704); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2707);
                    typeCoordonnees336=typeCoordonnees();

                    state._fsp--;

                    adaptor.addChild(root_0, typeCoordonnees336.getTree());
                    OF337=(Token)match(input,OF,FOLLOW_OF_in_variable2709); 
                    pushFollow(FOLLOW_accesClasse_in_variable2712);
                    accesClasse338=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse338.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:338:5: IDENT OF accesClasse
                    {
                    IDENT339=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable2718);  
                    stream_IDENT.add(IDENT339);

                    OF340=(Token)match(input,OF,FOLLOW_OF_in_variable2720);  
                    stream_OF.add(OF340);

                    pushFollow(FOLLOW_accesClasse_in_variable2722);
                    accesClasse341=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse341.getTree());


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
                    // 339:5: -> ^( VAR_I_KW IDENT accesClasse )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:339:8: ^( VAR_I_KW IDENT accesClasse )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:340:5: attribut OF accesClasse
                    {
                    pushFollow(FOLLOW_attribut_in_variable2742);
                    attribut342=attribut();

                    state._fsp--;

                    stream_attribut.add(attribut342.getTree());
                    OF343=(Token)match(input,OF,FOLLOW_OF_in_variable2744);  
                    stream_OF.add(OF343);

                    pushFollow(FOLLOW_accesClasse_in_variable2746);
                    accesClasse344=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse344.getTree());


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
                    // 341:5: -> ^( VAR_A_KW attribut accesClasse )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:341:8: ^( VAR_A_KW attribut accesClasse )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:342:5: SCORE OF GAME
                    {
                    SCORE345=(Token)match(input,SCORE,FOLLOW_SCORE_in_variable2766);  
                    stream_SCORE.add(SCORE345);

                    OF346=(Token)match(input,OF,FOLLOW_OF_in_variable2768);  
                    stream_OF.add(OF346);

                    GAME347=(Token)match(input,GAME,FOLLOW_GAME_in_variable2770);  
                    stream_GAME.add(GAME347);



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
                    // 343:5: -> GAME_SCORE_KW
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GAME_SCORE_KW, "GAME_SCORE_KW"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:344:5: VALUE OF attributTps OF accesClasse
                    {
                    VALUE348=(Token)match(input,VALUE,FOLLOW_VALUE_in_variable2784);  
                    stream_VALUE.add(VALUE348);

                    OF349=(Token)match(input,OF,FOLLOW_OF_in_variable2786);  
                    stream_OF.add(OF349);

                    pushFollow(FOLLOW_attributTps_in_variable2788);
                    attributTps350=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps350.getTree());
                    OF351=(Token)match(input,OF,FOLLOW_OF_in_variable2790);  
                    stream_OF.add(OF351);

                    pushFollow(FOLLOW_accesClasse_in_variable2792);
                    accesClasse352=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse352.getTree());


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
                    // 345:5: -> ^( VALUE_KW attributTps accesClasse )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:345:8: ^( VALUE_KW attributTps accesClasse )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:348:1: accesClasse : ( ALL -> ^( ACCESS_KW ALL ) | accesLocal | accesGlobal );
    public final hightParser.accesClasse_return accesClasse() throws RecognitionException {
        hightParser.accesClasse_return retval = new hightParser.accesClasse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALL353=null;
        hightParser.accesLocal_return accesLocal354 = null;

        hightParser.accesGlobal_return accesGlobal355 = null;


        CommonTree ALL353_tree=null;
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:348:13: ( ALL -> ^( ACCESS_KW ALL ) | accesLocal | accesGlobal )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:349:3: ALL
                    {
                    ALL353=(Token)match(input,ALL,FOLLOW_ALL_in_accesClasse2820);  
                    stream_ALL.add(ALL353);



                    // AST REWRITE
                    // elements: ALL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 350:5: -> ^( ACCESS_KW ALL )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:350:8: ^( ACCESS_KW ALL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCESS_KW, "ACCESS_KW"), root_1);

                        adaptor.addChild(root_1, stream_ALL.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:351:5: accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesLocal_in_accesClasse2838);
                    accesLocal354=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal354.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:352:5: accesGlobal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesGlobal_in_accesClasse2844);
                    accesGlobal355=accesGlobal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal355.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:355:1: accesGlobal : ( typeObjet -> ^( ACCESS_KW typeObjet ) | interaction -> ^( ACCESS_KW interaction ) | PG NOT notAccess PD -> ^( ACCESS_KW NOT notAccess ) );
    public final hightParser.accesGlobal_return accesGlobal() throws RecognitionException {
        hightParser.accesGlobal_return retval = new hightParser.accesGlobal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG358=null;
        Token NOT359=null;
        Token PD361=null;
        hightParser.typeObjet_return typeObjet356 = null;

        hightParser.interaction_return interaction357 = null;

        hightParser.notAccess_return notAccess360 = null;


        CommonTree PG358_tree=null;
        CommonTree NOT359_tree=null;
        CommonTree PD361_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_PD=new RewriteRuleTokenStream(adaptor,"token PD");
        RewriteRuleTokenStream stream_PG=new RewriteRuleTokenStream(adaptor,"token PG");
        RewriteRuleSubtreeStream stream_interaction=new RewriteRuleSubtreeStream(adaptor,"rule interaction");
        RewriteRuleSubtreeStream stream_typeObjet=new RewriteRuleSubtreeStream(adaptor,"rule typeObjet");
        RewriteRuleSubtreeStream stream_notAccess=new RewriteRuleSubtreeStream(adaptor,"rule notAccess");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:355:13: ( typeObjet -> ^( ACCESS_KW typeObjet ) | interaction -> ^( ACCESS_KW interaction ) | PG NOT notAccess PD -> ^( ACCESS_KW NOT notAccess ) )
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
            case PG:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:356:3: typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_accesGlobal2857);
                    typeObjet356=typeObjet();

                    state._fsp--;

                    stream_typeObjet.add(typeObjet356.getTree());


                    // AST REWRITE
                    // elements: typeObjet
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 357:5: -> ^( ACCESS_KW typeObjet )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:357:8: ^( ACCESS_KW typeObjet )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCESS_KW, "ACCESS_KW"), root_1);

                        adaptor.addChild(root_1, stream_typeObjet.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:358:5: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_accesGlobal2875);
                    interaction357=interaction();

                    state._fsp--;

                    stream_interaction.add(interaction357.getTree());


                    // AST REWRITE
                    // elements: interaction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 359:5: -> ^( ACCESS_KW interaction )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:359:8: ^( ACCESS_KW interaction )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCESS_KW, "ACCESS_KW"), root_1);

                        adaptor.addChild(root_1, stream_interaction.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:360:5: PG NOT notAccess PD
                    {
                    PG358=(Token)match(input,PG,FOLLOW_PG_in_accesGlobal2893);  
                    stream_PG.add(PG358);

                    NOT359=(Token)match(input,NOT,FOLLOW_NOT_in_accesGlobal2895);  
                    stream_NOT.add(NOT359);

                    pushFollow(FOLLOW_notAccess_in_accesGlobal2897);
                    notAccess360=notAccess();

                    state._fsp--;

                    stream_notAccess.add(notAccess360.getTree());
                    PD361=(Token)match(input,PD,FOLLOW_PD_in_accesGlobal2899);  
                    stream_PD.add(PD361);



                    // AST REWRITE
                    // elements: NOT, notAccess
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 361:5: -> ^( ACCESS_KW NOT notAccess )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:361:8: ^( ACCESS_KW NOT notAccess )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCESS_KW, "ACCESS_KW"), root_1);

                        adaptor.addChild(root_1, stream_NOT.nextNode());
                        adaptor.addChild(root_1, stream_notAccess.nextTree());

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
    // $ANTLR end "accesGlobal"

    public static class notAccess_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notAccess"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:364:1: notAccess : ( typeObjet | interaction | PLAYER );
    public final hightParser.notAccess_return notAccess() throws RecognitionException {
        hightParser.notAccess_return retval = new hightParser.notAccess_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER364=null;
        hightParser.typeObjet_return typeObjet362 = null;

        hightParser.interaction_return interaction363 = null;


        CommonTree PLAYER364_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:364:11: ( typeObjet | interaction | PLAYER )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:365:1: typeObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet_in_notAccess2924);
                    typeObjet362=typeObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet362.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:365:13: interaction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_interaction_in_notAccess2928);
                    interaction363=interaction();

                    state._fsp--;

                    adaptor.addChild(root_0, interaction363.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:365:27: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER364=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_notAccess2932); 
                    PLAYER364_tree = (CommonTree)adaptor.create(PLAYER364);
                    adaptor.addChild(root_0, PLAYER364_tree);


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
    // $ANTLR end "notAccess"

    public static class accesLocal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accesLocal"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:367:1: accesLocal : ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) );
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
        RewriteRuleTokenStream stream_PLAYER=new RewriteRuleTokenStream(adaptor,"token PLAYER");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:367:12: ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:368:3: IDENT
                    {
                    IDENT365=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2942);  
                    stream_IDENT.add(IDENT365);



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
                    // 369:5: -> ^( ACCESS_KW IDENT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:369:8: ^( ACCESS_KW IDENT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCESS_KW, "ACCESS_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:370:5: NUM operation IN IDENT
                    {
                    NUM366=(Token)match(input,NUM,FOLLOW_NUM_in_accesLocal2960);  
                    stream_NUM.add(NUM366);

                    pushFollow(FOLLOW_operation_in_accesLocal2962);
                    operation367=operation();

                    state._fsp--;

                    stream_operation.add(operation367.getTree());
                    IN368=(Token)match(input,IN,FOLLOW_IN_in_accesLocal2964);  
                    stream_IN.add(IN368);

                    IDENT369=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2966);  
                    stream_IDENT.add(IDENT369);



                    // AST REWRITE
                    // elements: operation, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 371:5: -> ^( ACCESS_KW IDENT operation )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:371:8: ^( ACCESS_KW IDENT operation )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCESS_KW, "ACCESS_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_operation.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:372:5: PLAYER
                    {
                    PLAYER370=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal2986);  
                    stream_PLAYER.add(PLAYER370);



                    // AST REWRITE
                    // elements: PLAYER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 373:5: -> ^( ACCESS_KW PLAYER )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:373:8: ^( ACCESS_KW PLAYER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCESS_KW, "ACCESS_KW"), root_1);

                        adaptor.addChild(root_1, stream_PLAYER.nextNode());

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
    // $ANTLR end "accesLocal"

    public static class typeCoordonnees_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCoordonnees"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:376:1: typeCoordonnees : ( POSITION | ORIENTATION | SIZE );
    public final hightParser.typeCoordonnees_return typeCoordonnees() throws RecognitionException {
        hightParser.typeCoordonnees_return retval = new hightParser.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set371=null;

        CommonTree set371_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:376:17: ( POSITION | ORIENTATION | SIZE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:380:1: timeUnit : ( MIN | SEC | MS | FRAME );
    public final hightParser.timeUnit_return timeUnit() throws RecognitionException {
        hightParser.timeUnit_return retval = new hightParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set372=null;

        CommonTree set372_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:380:10: ( MIN | SEC | MS | FRAME )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:388:1: typeObjet : ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:388:11: ( CAMERA | MEDIA | COUNTER | TIME | typeObjet3D )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:389:2: CAMERA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CAMERA373=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_typeObjet3059); 
                    CAMERA373_tree = (CommonTree)adaptor.create(CAMERA373);
                    adaptor.addChild(root_0, CAMERA373_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:390:4: MEDIA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MEDIA374=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_typeObjet3064); 
                    MEDIA374_tree = (CommonTree)adaptor.create(MEDIA374);
                    adaptor.addChild(root_0, MEDIA374_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:391:4: COUNTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COUNTER375=(Token)match(input,COUNTER,FOLLOW_COUNTER_in_typeObjet3069); 
                    COUNTER375_tree = (CommonTree)adaptor.create(COUNTER375);
                    adaptor.addChild(root_0, COUNTER375_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:392:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TIME376=(Token)match(input,TIME,FOLLOW_TIME_in_typeObjet3074); 
                    TIME376_tree = (CommonTree)adaptor.create(TIME376);
                    adaptor.addChild(root_0, TIME376_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:393:4: typeObjet3D
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet3D_in_typeObjet3079);
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:398:1: typeObjet3D : ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER );
    public final hightParser.typeObjet3D_return typeObjet3D() throws RecognitionException {
        hightParser.typeObjet3D_return retval = new hightParser.typeObjet3D_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set378=null;

        CommonTree set378_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:398:12: ( OBJECT | CHARACTER | VEHICLE | PLANE | SPACECRAFT | OBSTACLE | WEAPON | SWORD | PROJECTILE | ZONE | GROUND | BONUS | CHECKPOINT | BREAKABLE | CONSTRUCTION | ROOM | BALL | TELEPORTER )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:419:1: attribut : ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA );
    public final hightParser.attribut_return attribut() throws RecognitionException {
        hightParser.attribut_return retval = new hightParser.attribut_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set379=null;

        CommonTree set379_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:419:10: ( MASS | IS_FIX | IS_TRAVERSABLE | FOV | TYPE | ACTIVE | NAME | DESCRIPTION | LIFE | LIFE_MAX | LIFE_MIN | NB_LIVES | MAGIC | MAGIC_MAX | MAGIC_MIN | LEVEL | ATTACK | DEFENSE | JUMP_FORCE | JUMP_AIR_MAX | MONEY | CLASS | RACE | ACCELERATION | SPEED | SPEED_MAX | SPEED_MIN | BOOST | BOOST_MAX | NB_MUNITIONS | NB_MUNITIONS_MAX | SHOOT_POWER | DAMAGES | VALUE | UNIT | OBJECT_NAME | ATTRIBUT_NAME | VOLUME | NUMBER | MOVE_WITH_CAMERA )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:462:1: attributTps : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final hightParser.attributTps_return attributTps() throws RecognitionException {
        hightParser.attributTps_return retval = new hightParser.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set380=null;

        CommonTree set380_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:462:13: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:468:1: attributListeOuObjet : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final hightParser.attributListeOuObjet_return attributListeOuObjet() throws RecognitionException {
        hightParser.attributListeOuObjet_return retval = new hightParser.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set381=null;

        CommonTree set381_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:468:22: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
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


    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA79_eotS =
        "\15\uffff";
    static final String DFA79_eofS =
        "\15\uffff";
    static final String DFA79_minS =
        "\1\35\1\uffff\1\35\1\uffff\1\35\1\uffff\7\46";
    static final String DFA79_maxS =
        "\1\u00c2\1\uffff\1\u00c2\1\uffff\1\u00c2\1\uffff\7\u0087";
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
            return "290:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD );";
        }
    }
 

    public static final BitSet FOLLOW_gameData_in_game233 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game235 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_newType_in_game241 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game243 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_init_in_game249 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game251 = new BitSet(new long[]{0x023C483000000000L,0x0000000000200000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_definition_in_game257 = new BitSet(new long[]{0x0200000010000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_FIN_in_game260 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_commande_in_game268 = new BitSet(new long[]{0x0200000010000000L,0x0002000000200000L});
    public static final BitSet FOLLOW_FIN_in_game271 = new BitSet(new long[]{0x0200000000000000L,0x0002000000200000L});
    public static final BitSet FOLLOW_reglesJeu_in_game279 = new BitSet(new long[]{0x0000000010000002L,0x0002000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game282 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_iaBasique_in_game290 = new BitSet(new long[]{0x0000000010000002L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_GAME_in_gameData340 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_gameData342 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData344 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_gameData347 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData349 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame374 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame376 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame397 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame399 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_attributGame424 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame426 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_newType452 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_newType454 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_newType456 = new BitSet(new long[]{0x0000482000000000L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_subType_in_newType458 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_AND_in_newType461 = new BitSet(new long[]{0x0000482000000000L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_subType_in_newType463 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_IDENT_in_subType494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_init516 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_init518 = new BitSet(new long[]{0x0002492000000000L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_declarationObjet_in_init520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_init538 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_init540 = new BitSet(new long[]{0x0000003000000000L,0x0000000000000000L,0x0000072000000000L,0x01FFFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_allocationObject_in_init542 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_init545 = new BitSet(new long[]{0x0000003000000000L,0x0000000000000000L,0x0000072000000000L,0x01FFFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_allocationObject_in_init547 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet574 = new BitSet(new long[]{0x007C000000000002L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet600 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_OF_in_declarationObjet603 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_declarationObjet606 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet611 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_WITH_in_declarationObjet615 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_declarationObjet618 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet623 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_CAMERA_in_declarationObjet652 = new BitSet(new long[]{0x0180200000000002L});
    public static final BitSet FOLLOW_view_in_declarationObjet655 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_declarationObjet686 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_declarationObjet722 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeEntity760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_entityMode775 = new BitSet(new long[]{0x007C000000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_interaction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject855 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AT_in_allocationObject858 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_valAggregation_in_allocationObject860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribut_in_allocationObject890 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject892 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x180001FFFFFFFFF8L});
    public static final BitSet FOLLOW_typeAllocation_in_allocationObject894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeCoordonnees_in_allocationObject924 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject926 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_coordinates_in_allocationObject928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_allocationObject959 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject961 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributTps_in_allocationObject995 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject997 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_allocationObject999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_allocationObject1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAllocation1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeAllocation1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_typeAllocation1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_typeAllocation1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_valAggregation1065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1114 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_definition1117 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_MEANS_in_definition1119 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0xFFFF80C001E00040L,0x0000000000000007L});
    public static final BitSet FOLLOW_consequences_in_definition1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1131 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_consequences1134 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0xFFFF80C001E00040L,0x0000000000000007L});
    public static final BitSet FOLLOW_consequ_in_consequences1136 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_siAlors_in_consequ1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1210 = new BitSet(new long[]{0x8000000000000000L,0x00001CC000009010L});
    public static final BitSet FOLLOW_actionObjet_in_action1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action1217 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1238 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_action1246 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1256 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_STOP_KW_in_action1261 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1271 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_transformation_in_action1274 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_action1276 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_accesClasse_in_action1279 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_coordinates_in_action1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1287 = new BitSet(new long[]{0x0004003C00000000L,0x0000000000000000L,0x000000BC04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1292 = new BitSet(new long[]{0x0004003C00000000L,0x0000000000000000L,0x000000BC04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_accesLocal_in_action1297 = new BitSet(new long[]{0x0002000200000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_action1301 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_IDENT_in_action1304 = new BitSet(new long[]{0x0002000200000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_action1308 = new BitSet(new long[]{0x0002000200000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_action1314 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ON_in_action1317 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_action1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_action1325 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_coordinates_in_action1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1335 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_action1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_action1342 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0xFFFF80C001E00040L,0x0000000000000007L});
    public static final BitSet FOLLOW_consequences_in_action1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ENDWAIT_in_action1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1380 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_actionObjet1383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1389 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1399 = new BitSet(new long[]{0x0004002000000000L,0x0000000000030000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_coordinates1451 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_coordinates1453 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_coordinates1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1484 = new BitSet(new long[]{0x0000002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_IDENT_in_commande1488 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_commande1490 = new BitSet(new long[]{0x0000002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1495 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_commande1498 = new BitSet(new long[]{0x0000002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1501 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_MOUSE_in_actionCommande1514 = new BitSet(new long[]{0x0000000000000000L,0x00000003FE000000L});
    public static final BitSet FOLLOW_souris_in_actionCommande1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande1518 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_actionCommande1538 = new BitSet(new long[]{0x0000000000000000L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande1542 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1689 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1718 = new BitSet(new long[]{0x0000000000000000L,0x0000030018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1740 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1776 = new BitSet(new long[]{0x0000000000000000L,0x0001800001400000L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1781 = new BitSet(new long[]{0x0000000000000000L,0x0001800001400000L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_in_typeCommand1807 = new BitSet(new long[]{0x0000000000000002L,0x00000003FE000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand1810 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand1813 = new BitSet(new long[]{0x0000000000000000L,0x00000003FE000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand1815 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEY_in_typeCommand1842 = new BitSet(new long[]{0x0000000000000000L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand1844 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand1847 = new BitSet(new long[]{0x0000000000000000L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand1849 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1884 = new BitSet(new long[]{0x183C483820000000L,0x0000000000000000L,0xFFFF80FC00000040L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1888 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_reglesJeu1890 = new BitSet(new long[]{0x183C483820000000L,0x0000000000000000L,0xFFFF80FC00000040L,0x000001FFFFFFFFFFL});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_reglesJeu1898 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0xFFFF80C001E00040L,0x0000000000000007L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur1915 = new BitSet(new long[]{0x0000000000000000L,0x01B4000000001000L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declencheur1938 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declencheur1969 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1971 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C00000000L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1993 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1995 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2063 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2068 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2074 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurTK2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurTK2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2094 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2099 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_BY_in_declencheurKT2104 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2109 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurKT2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurKT2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2134 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditions_in_siAlors2137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_siAlors2139 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0xFFFF80C001E00040L,0x0000000000000007L});
    public static final BitSet FOLLOW_consequences_in_siAlors2142 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_ELSE_in_siAlors2145 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0xFFFF80C001E00040L,0x0000000000000007L});
    public static final BitSet FOLLOW_consequences_in_siAlors2148 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ENDIF_in_siAlors2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_conditions2167 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditionOu_in_conditions2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2197 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_OR_in_conditionOu2200 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_NOT_in_conditionOu2204 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditionOu_in_conditionOu2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_in_conditionEt2224 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_AND_in_conditionEt2227 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_NOT_in_conditionEt2231 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditionEt_in_conditionEt2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_etat_in_cond2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMP_in_cond2257 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_cond2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_EQUALS_in_cond2263 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_INF_in_cond2268 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_SUP_in_cond2273 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_INFEG_in_cond2278 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_SUPED_in_cond2283 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_DIFF_in_cond2288 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_cond2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_cond2309 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_conditions_in_cond2311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PD_in_cond2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_etat2327 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_etat2329 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_NOT_in_etat2333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2358 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_OTHER_in_etat2363 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_accesGlobal_in_etat2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_etat2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_etat2391 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_etat2399 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x00000000001F8000L});
    public static final BitSet FOLLOW_NOT_in_etat2403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000001F8000L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_etat2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2477 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2482 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2487 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_affectation2491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FOR_in_affectation2494 = new BitSet(new long[]{0x0000003800000000L,0x0000000000000000L,0x0000003C00000000L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_variable_in_affectation2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2504 = new BitSet(new long[]{0x0000003800000000L,0x0000000000000000L,0x0000003C00000000L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_variable_in_affectation2507 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WITH_in_affectation2509 = new BitSet(new long[]{0x0000003800000000L,0x0000000000000000L,0x0000003C00000000L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_variable_in_affectation2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2525 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_accesClasse_in_iaBasique2528 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_iaBasique2530 = new BitSet(new long[]{0x8000000000000000L,0x00001CC000009010L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2533 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_iaBasique2536 = new BitSet(new long[]{0x8000000000000000L,0x00001CC000009010L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2539 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_operationPlus_in_operation2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operation2561 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C00000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operationPlus_in_operation2564 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_AND_in_operation2566 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C00000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operationPlus_in_operation2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_PLUS_in_operationPlus2585 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C00000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_MINUS_in_operationPlus2590 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C00000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_operationPow_in_operationMul2607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_MUL_in_operationMul2611 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C00000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_DIV_in_operationMul2616 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C00000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_MOD_in_operationMul2621 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C00000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operationPow_in_operationMul2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_POW_in_operationPow2643 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C00000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_operationBracket2661 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_operationBracket2664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PD_in_operationBracket2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operationBracket2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operationBracket2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable2690 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Y_in_variable2695 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Z_in_variable2700 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2707 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2709 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_accesClasse_in_variable2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable2718 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2720 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_accesClasse_in_variable2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribut_in_variable2742 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2744 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_accesClasse_in_variable2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_variable2766 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2768 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GAME_in_variable2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_variable2784 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2786 = new BitSet(new long[]{0x0000003000000000L,0x0000000000000000L,0x0000072000000000L,0x01FFFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_attributTps_in_variable2788 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2790 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0xFFFF80C000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_accesClasse_in_variable2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_accesClasse2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_accesClasse2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_accesGlobal2893 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_accesGlobal2895 = new BitSet(new long[]{0x003C480000000000L,0x0000000000000000L,0xFFFF800000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_notAccess_in_accesGlobal2897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PD_in_accesGlobal2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_notAccess2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_notAccess2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_notAccess2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal2960 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000000000L,0x0000003C04000040L,0x000001FFFFFFFFF8L});
    public static final BitSet FOLLOW_operation_in_accesLocal2962 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal2964 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERA_in_typeObjet3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_typeObjet3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNTER_in_typeObjet3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_typeObjet3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet3D_in_typeObjet3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeObjet3D0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attribut0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}