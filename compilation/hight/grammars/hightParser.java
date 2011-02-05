// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g 2011-02-05 13:50:26

    package grammars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class hightParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "ACCESS_KW", "KEY_KW", "MOUSE_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "SCORE", "TYPE", "IDENT", "IS", "AND", "LIST_KW", "OF", "WITH", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "IN", "PLAYER", "ALLY", "ENEMY", "NEUTRAL", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "DIES_KW", "DURING", "UNTIL", "EQUIP", "NEXT", "PREVIOUS", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "MOUSE", "FOR", "KEY", "WUP", "WDOWN", "LEFT", "RIGHT", "CLICK_LEFT", "CLICK_CENTER", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "JUMP", "MOVE", "FORWARD", "BACKWARD", "TURN", "ACCELERATE", "BRAKE", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "BY", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "X", "Y", "Z", "VALUE", "ALL", "NUM", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "COUNTER", "TIME", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "WS", "'true'", "'false'"
    };
    public static final int EOF=-1;
    public static final int T__195=195;
    public static final int T__196=196;
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
    public static final int BOOST_INTERVAL=177;
    public static final int SHOOT_INTERVAL=178;
    public static final int RELOAD_TIME=179;
    public static final int INVENTORY=180;
    public static final int EQUIPED_OBJECT=181;
    public static final int ENTRANCES=182;
    public static final int EXITS=183;
    public static final int DAMAGE_ZONE=184;
    public static final int COLLECTORS=185;
    public static final int TYPES_COLLECTORS=186;
    public static final int GENERATORS=187;
    public static final int TYPE_GENERATORS=188;
    public static final int BREAKERS=189;
    public static final int TYPES_BREAKERS=190;
    public static final int TELEPORTABLES=191;
    public static final int TYPES_TELEPORTABLES=192;
    public static final int COMMENT=193;
    public static final int WS=194;

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

                if ( (LA3_0==IDENT||LA3_0==CAMERA||LA3_0==MEDIA||(LA3_0>=PLAYER && LA3_0<=NEUTRAL)||LA3_0==PG||(LA3_0>=ALL && LA3_0<=NUM)||(LA3_0>=COUNTER && LA3_0<=TIME)) ) {
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
            // elements: reglesJeu, commande, init, iaBasique, newType, gameData, definition
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
                            // elements: GRAVITY_KW, FLOAT
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
                            // elements: GRAVITY_KW, FLOAT, FLOAT, FLOAT
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
            // elements: IDENT, subType, subType, TYPE
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
            else if ( (LA16_0==CAMERA||LA16_0==MEDIA||(LA16_0>=COUNTER && LA16_0<=TIME)) ) {
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:83:1: init : ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) );
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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:83:6: ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) )
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
            else if ( (LA18_0==CAMERA||LA18_0==MEDIA||(LA18_0>=PLAYER && LA18_0<=NEUTRAL)||LA18_0==PG||(LA18_0>=ALL && LA18_0<=NUM)||(LA18_0>=COUNTER && LA18_0<=TIME)) ) {
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
                    // elements: declarationObjet, IDENT
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
                    // elements: accesClasse, allocationObject
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:4: -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:87:7: ^( INIT_HAS_KW accesClasse ( allocationObject )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INIT_HAS_KW, "INIT_HAS_KW"), root_1);

                        adaptor.addChild(root_1, stream_accesClasse.nextTree());
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
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet576);
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
                            pushFollow(FOLLOW_entityMode_in_declarationObjet578);
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
                    LIST_KW47=(Token)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet602);  
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
                            OF48=(Token)match(input,OF,FOLLOW_OF_in_declarationObjet605);  
                            stream_OF.add(OF48);

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:16: ( operation )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>=FLOAT && LA20_0<=SCORE)||LA20_0==PG||LA20_0==RANDOM_KW||(LA20_0>=X && LA20_0<=VALUE)) ) {
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
                                    pushFollow(FOLLOW_operation_in_declarationObjet608);
                                    operation49=operation();

                                    state._fsp--;

                                    stream_operation.add(operation49.getTree());

                                    }
                                    break;

                            }

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:29: ( IDENT )
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:30: IDENT
                            {
                            IDENT50=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet613);  
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
                            	    WITH51=(Token)match(input,WITH,FOLLOW_WITH_in_declarationObjet617);  
                            	    stream_WITH.add(WITH51);

                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:43: ( operation )?
                            	    int alt21=2;
                            	    int LA21_0 = input.LA(1);

                            	    if ( ((LA21_0>=FLOAT && LA21_0<=SCORE)||LA21_0==PG||LA21_0==RANDOM_KW||(LA21_0>=X && LA21_0<=VALUE)) ) {
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
                            	            pushFollow(FOLLOW_operation_in_declarationObjet620);
                            	            operation52=operation();

                            	            state._fsp--;

                            	            stream_operation.add(operation52.getTree());

                            	            }
                            	            break;

                            	    }

                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:56: ( IDENT )
                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:94:57: IDENT
                            	    {
                            	    IDENT53=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet625);  
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
                    // elements: LIST_KW, operation, IDENT
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
                    CAMERA54=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_declarationObjet654);  
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
                            pushFollow(FOLLOW_view_in_declarationObjet657);
                            view55=view();

                            state._fsp--;

                            stream_view.add(view55.getTree());
                            PERSON56=(Token)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet659);  
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
                            FREE57=(Token)match(input,FREE,FOLLOW_FREE_in_declarationObjet673);  
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
                    MEDIA58=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_declarationObjet688);  
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
                            LOOP59=(Token)match(input,LOOP,FOLLOW_LOOP_in_declarationObjet691);  
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
                            ONCE60=(Token)match(input,ONCE,FOLLOW_ONCE_in_declarationObjet702);  
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
                    IN61=(Token)match(input,IN,FOLLOW_IN_in_declarationObjet724);  
                    stream_IN.add(IN61);

                    IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet726);  
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:101:1: typeEntity : IDENT ;
    public final hightParser.typeEntity_return typeEntity() throws RecognitionException {
        hightParser.typeEntity_return retval = new hightParser.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT63=null;

        CommonTree IDENT63_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:101:12: ( IDENT )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:102:2: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT63=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeEntity757); 
            IDENT63_tree = (CommonTree)adaptor.create(IDENT63);
            adaptor.addChild(root_0, IDENT63_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:105:1: entityMode : ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli );
    public final hightParser.entityMode_return entityMode() throws RecognitionException {
        hightParser.entityMode_return retval = new hightParser.entityMode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER64=null;
        hightParser.interaction_return interaction65 = null;

        hightParser.dupli_return dupli66 = null;

        hightParser.dupli_return dupli67 = null;


        CommonTree PLAYER64_tree=null;
        RewriteRuleSubtreeStream stream_dupli=new RewriteRuleSubtreeStream(adaptor,"rule dupli");
        RewriteRuleSubtreeStream stream_interaction=new RewriteRuleSubtreeStream(adaptor,"rule interaction");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:105:11: ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli )
            int alt28=3;
            switch ( input.LA(1) ) {
            case PLAYER:
                {
                alt28=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
                {
                alt28=2;
                }
                break;
            case DUPLICABLE:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:106:2: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER64=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_entityMode767); 
                    PLAYER64_tree = (CommonTree)adaptor.create(PLAYER64);
                    adaptor.addChild(root_0, PLAYER64_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:107:4: interaction ( dupli )?
                    {
                    pushFollow(FOLLOW_interaction_in_entityMode772);
                    interaction65=interaction();

                    state._fsp--;

                    stream_interaction.add(interaction65.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:107:16: ( dupli )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==DUPLICABLE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:107:16: dupli
                            {
                            pushFollow(FOLLOW_dupli_in_entityMode774);
                            dupli66=dupli();

                            state._fsp--;

                            stream_dupli.add(dupli66.getTree());

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
                    // 107:23: -> ^( INTERACTION_KW interaction ( dupli )? )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:107:25: ^( INTERACTION_KW interaction ( dupli )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTERACTION_KW, "INTERACTION_KW"), root_1);

                        adaptor.addChild(root_1, stream_interaction.nextTree());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:107:54: ( dupli )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:108:4: dupli
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dupli_in_entityMode790);
                    dupli67=dupli();

                    state._fsp--;

                    adaptor.addChild(root_0, dupli67.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:111:1: interaction : ( ALLY | ENEMY | NEUTRAL );
    public final hightParser.interaction_return interaction() throws RecognitionException {
        hightParser.interaction_return retval = new hightParser.interaction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set68=null;

        CommonTree set68_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:111:13: ( ALLY | ENEMY | NEUTRAL )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set68=(Token)input.LT(1);
            if ( (input.LA(1)>=ALLY && input.LA(1)<=NEUTRAL) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set68));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:117:1: dupli : DUPLICABLE ;
    public final hightParser.dupli_return dupli() throws RecognitionException {
        hightParser.dupli_return retval = new hightParser.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DUPLICABLE69=null;

        CommonTree DUPLICABLE69_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:117:7: ( DUPLICABLE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:118:2: DUPLICABLE
            {
            root_0 = (CommonTree)adaptor.nil();

            DUPLICABLE69=(Token)match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli823); 
            DUPLICABLE69_tree = (CommonTree)adaptor.create(DUPLICABLE69);
            adaptor.addChild(root_0, DUPLICABLE69_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:121:1: view : ( FIRST | THIRD );
    public final hightParser.view_return view() throws RecognitionException {
        hightParser.view_return retval = new hightParser.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set70=null;

        CommonTree set70_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:121:6: ( FIRST | THIRD )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set70=(Token)input.LT(1);
            if ( (input.LA(1)>=FIRST && input.LA(1)<=THIRD) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set70));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:126:1: allocationObject : ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) );
    public final hightParser.allocationObject_return allocationObject() throws RecognitionException {
        hightParser.allocationObject_return retval = new hightParser.allocationObject_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT71=null;
        Token AT72=null;
        Token AT75=null;
        Token AT78=null;
        Token IDENT79=null;
        Token AT81=null;
        hightParser.valAggregation_return valAggregation73 = null;

        hightParser.typeCoordonnees_return typeCoordonnees74 = null;

        hightParser.coordinates_return coordinates76 = null;

        hightParser.attributListeOuObjet_return attributListeOuObjet77 = null;

        hightParser.attributTps_return attributTps80 = null;

        hightParser.operation_return operation82 = null;

        hightParser.timeUnit_return timeUnit83 = null;


        CommonTree IDENT71_tree=null;
        CommonTree AT72_tree=null;
        CommonTree AT75_tree=null;
        CommonTree AT78_tree=null;
        CommonTree IDENT79_tree=null;
        CommonTree AT81_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_valAggregation=new RewriteRuleSubtreeStream(adaptor,"rule valAggregation");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_attributListeOuObjet=new RewriteRuleSubtreeStream(adaptor,"rule attributListeOuObjet");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        RewriteRuleSubtreeStream stream_typeCoordonnees=new RewriteRuleSubtreeStream(adaptor,"rule typeCoordonnees");
        RewriteRuleSubtreeStream stream_coordinates=new RewriteRuleSubtreeStream(adaptor,"rule coordinates");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:126:18: ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt30=1;
                }
                break;
            case POSITION:
            case ORIENTATION:
            case SIZE:
                {
                alt30=2;
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
                alt30=3;
                }
                break;
            case BOOST_INTERVAL:
            case SHOOT_INTERVAL:
            case RELOAD_TIME:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:127:2: IDENT ( AT valAggregation )?
                    {
                    IDENT71=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject852);  
                    stream_IDENT.add(IDENT71);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:127:8: ( AT valAggregation )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==AT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:127:9: AT valAggregation
                            {
                            AT72=(Token)match(input,AT,FOLLOW_AT_in_allocationObject855);  
                            stream_AT.add(AT72);

                            pushFollow(FOLLOW_valAggregation_in_allocationObject857);
                            valAggregation73=valAggregation();

                            state._fsp--;

                            stream_valAggregation.add(valAggregation73.getTree());

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
                    // 128:4: -> ^( ALLOCATION_KW IDENT ( valAggregation )? )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:128:7: ^( ALLOCATION_KW IDENT ( valAggregation )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:128:30: ( valAggregation )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:129:4: typeCoordonnees AT coordinates
                    {
                    pushFollow(FOLLOW_typeCoordonnees_in_allocationObject887);
                    typeCoordonnees74=typeCoordonnees();

                    state._fsp--;

                    stream_typeCoordonnees.add(typeCoordonnees74.getTree());
                    AT75=(Token)match(input,AT,FOLLOW_AT_in_allocationObject889);  
                    stream_AT.add(AT75);

                    pushFollow(FOLLOW_coordinates_in_allocationObject891);
                    coordinates76=coordinates();

                    state._fsp--;

                    stream_coordinates.add(coordinates76.getTree());


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
                    // 130:4: -> ^( ALLOCATION_KW typeCoordonnees coordinates )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:130:7: ^( ALLOCATION_KW typeCoordonnees coordinates )
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
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:131:4: attributListeOuObjet AT IDENT
                    {
                    pushFollow(FOLLOW_attributListeOuObjet_in_allocationObject922);
                    attributListeOuObjet77=attributListeOuObjet();

                    state._fsp--;

                    stream_attributListeOuObjet.add(attributListeOuObjet77.getTree());
                    AT78=(Token)match(input,AT,FOLLOW_AT_in_allocationObject924);  
                    stream_AT.add(AT78);

                    IDENT79=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject926);  
                    stream_IDENT.add(IDENT79);



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
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:132:7: ^( ALLOCATION_KW attributListeOuObjet IDENT )
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
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:133:4: attributTps AT operation timeUnit
                    {
                    pushFollow(FOLLOW_attributTps_in_allocationObject958);
                    attributTps80=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps80.getTree());
                    AT81=(Token)match(input,AT,FOLLOW_AT_in_allocationObject960);  
                    stream_AT.add(AT81);

                    pushFollow(FOLLOW_operation_in_allocationObject962);
                    operation82=operation();

                    state._fsp--;

                    stream_operation.add(operation82.getTree());
                    pushFollow(FOLLOW_timeUnit_in_allocationObject964);
                    timeUnit83=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit83.getTree());


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
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:134:7: ^( ALLOCATION_KW attributTps operation timeUnit )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:137:1: typeAllocation : ( operation | IDENT | 'true' | 'false' ) ;
    public final hightParser.typeAllocation_return typeAllocation() throws RecognitionException {
        hightParser.typeAllocation_return retval = new hightParser.typeAllocation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT85=null;
        Token string_literal86=null;
        Token string_literal87=null;
        hightParser.operation_return operation84 = null;


        CommonTree IDENT85_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree string_literal87_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:138:2: ( ( operation | IDENT | 'true' | 'false' ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:138:4: ( operation | IDENT | 'true' | 'false' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:138:4: ( operation | IDENT | 'true' | 'false' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case FLOAT:
            case SCORE:
            case PG:
            case RANDOM_KW:
            case X:
            case Y:
            case Z:
            case VALUE:
                {
                alt31=1;
                }
                break;
            case IDENT:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==OF) ) {
                    alt31=1;
                }
                else if ( (LA31_2==EOF) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case 195:
                {
                alt31=3;
                }
                break;
            case 196:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:138:5: operation
                    {
                    pushFollow(FOLLOW_operation_in_typeAllocation1006);
                    operation84=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation84.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:138:17: IDENT
                    {
                    IDENT85=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeAllocation1010); 
                    IDENT85_tree = (CommonTree)adaptor.create(IDENT85);
                    adaptor.addChild(root_0, IDENT85_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:138:25: 'true'
                    {
                    string_literal86=(Token)match(input,195,FOLLOW_195_in_typeAllocation1014); 
                    string_literal86_tree = (CommonTree)adaptor.create(string_literal86);
                    adaptor.addChild(root_0, string_literal86_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:138:34: 'false'
                    {
                    string_literal87=(Token)match(input,196,FOLLOW_196_in_typeAllocation1018); 
                    string_literal87_tree = (CommonTree)adaptor.create(string_literal87);
                    adaptor.addChild(root_0, string_literal87_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:140:1: valAggregation : ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) );
    public final hightParser.valAggregation_return valAggregation() throws RecognitionException {
        hightParser.valAggregation_return retval = new hightParser.valAggregation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT90=null;
        hightParser.operation_return operation88 = null;

        hightParser.timeUnit_return timeUnit89 = null;


        CommonTree IDENT90_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:140:16: ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=FLOAT && LA33_0<=SCORE)||LA33_0==PG||LA33_0==RANDOM_KW||(LA33_0>=X && LA33_0<=VALUE)) ) {
                alt33=1;
            }
            else if ( (LA33_0==IDENT) ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==OF) ) {
                    alt33=1;
                }
                else if ( (LA33_2==FIN||LA33_2==VIRG) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:2: operation ( timeUnit )?
                    {
                    pushFollow(FOLLOW_operation_in_valAggregation1028);
                    operation88=operation();

                    state._fsp--;

                    stream_operation.add(operation88.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:12: ( timeUnit )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=MIN && LA32_0<=FRAME)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:141:13: timeUnit
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1031);
                            timeUnit89=timeUnit();

                            state._fsp--;

                            stream_timeUnit.add(timeUnit89.getTree());

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
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:142:7: ^( AGGREGATION_KW operation ( timeUnit )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_operation.nextTree());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:142:34: ( timeUnit )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:143:4: IDENT
                    {
                    IDENT90=(Token)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1053);  
                    stream_IDENT.add(IDENT90);



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
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:144:7: ^( AGGREGATION_KW IDENT )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:148:1: definition : DEFINITION_KW IDENT MEANS consequences ;
    public final hightParser.definition_return definition() throws RecognitionException {
        hightParser.definition_return retval = new hightParser.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINITION_KW91=null;
        Token IDENT92=null;
        Token MEANS93=null;
        hightParser.consequences_return consequences94 = null;


        CommonTree DEFINITION_KW91_tree=null;
        CommonTree IDENT92_tree=null;
        CommonTree MEANS93_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:148:12: ( DEFINITION_KW IDENT MEANS consequences )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:148:14: DEFINITION_KW IDENT MEANS consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFINITION_KW91=(Token)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1077); 
            DEFINITION_KW91_tree = (CommonTree)adaptor.create(DEFINITION_KW91);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW91_tree, root_0);

            IDENT92=(Token)match(input,IDENT,FOLLOW_IDENT_in_definition1080); 
            IDENT92_tree = (CommonTree)adaptor.create(IDENT92);
            adaptor.addChild(root_0, IDENT92_tree);

            MEANS93=(Token)match(input,MEANS,FOLLOW_MEANS_in_definition1082); 
            pushFollow(FOLLOW_consequences_in_definition1085);
            consequences94=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences94.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:150:1: consequences : consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) ;
    public final hightParser.consequences_return consequences() throws RecognitionException {
        hightParser.consequences_return retval = new hightParser.consequences_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG96=null;
        hightParser.consequ_return consequ95 = null;

        hightParser.consequ_return consequ97 = null;


        CommonTree VIRG96_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_consequ=new RewriteRuleSubtreeStream(adaptor,"rule consequ");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:150:14: ( consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:151:2: consequ ( VIRG consequ )*
            {
            pushFollow(FOLLOW_consequ_in_consequences1094);
            consequ95=consequ();

            state._fsp--;

            stream_consequ.add(consequ95.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:151:10: ( VIRG consequ )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==VIRG) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:151:11: VIRG consequ
            	    {
            	    VIRG96=(Token)match(input,VIRG,FOLLOW_VIRG_in_consequences1097);  
            	    stream_VIRG.add(VIRG96);

            	    pushFollow(FOLLOW_consequ_in_consequences1099);
            	    consequ97=consequ();

            	    state._fsp--;

            	    stream_consequ.add(consequ97.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:152:6: ^( CONSEQUENCES_KW ( consequ )+ )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:155:1: consequ : ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW );
    public final hightParser.consequ_return consequ() throws RecognitionException {
        hightParser.consequ_return retval = new hightParser.consequ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT102=null;
        Token VICTORY_KW103=null;
        Token DEFEAT_KW104=null;
        hightParser.siAlors_return siAlors98 = null;

        hightParser.action_return action99 = null;

        hightParser.affectation_return affectation100 = null;

        hightParser.activCommande_return activCommande101 = null;


        CommonTree IDENT102_tree=null;
        CommonTree VICTORY_KW103_tree=null;
        CommonTree DEFEAT_KW104_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:155:9: ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW )
            int alt35=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt35=1;
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
                {
                alt35=2;
                }
                break;
            case IDENT:
                {
                int LA35_3 = input.LA(2);

                if ( ((LA35_3>=ENDS_KW && LA35_3<=PAUSE_KW)||LA35_3==STOP_KW||LA35_3==DIES_KW||LA35_3==EQUIP||(LA35_3>=JUMP && LA35_3<=MOVE)||(LA35_3>=TURN && LA35_3<=BRAKE)) ) {
                    alt35=2;
                }
                else if ( (LA35_3==EOF||LA35_3==FIN||LA35_3==VIRG||LA35_3==DEFINITION_KW||LA35_3==ENDWAIT||LA35_3==COMMAND_KW||LA35_3==RULE_KW||(LA35_3>=ELSE && LA35_3<=ENDIF)||LA35_3==IA_KW) ) {
                    alt35=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            case ASSIGN_KW:
            case ADD_KW:
            case SUB_KW:
            case INVERT_KW:
                {
                alt35=3;
                }
                break;
            case ACTIVATE_KW:
            case DISABLE_KW:
                {
                alt35=4;
                }
                break;
            case VICTORY_KW:
                {
                alt35=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:156:3: siAlors
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_siAlors_in_consequ1125);
                    siAlors98=siAlors();

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors98.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:157:5: action
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_action_in_consequ1131);
                    action99=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action99.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:158:5: affectation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_consequ1137);
                    affectation100=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation100.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:159:5: activCommande
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_activCommande_in_consequ1143);
                    activCommande101=activCommande();

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande101.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:160:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT102=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1149); 
                    IDENT102_tree = (CommonTree)adaptor.create(IDENT102);
                    adaptor.addChild(root_0, IDENT102_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:161:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW103=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1155); 
                    VICTORY_KW103_tree = (CommonTree)adaptor.create(VICTORY_KW103);
                    adaptor.addChild(root_0, VICTORY_KW103_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:162:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW104=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1161); 
                    DEFEAT_KW104_tree = (CommonTree)adaptor.create(DEFEAT_KW104);
                    adaptor.addChild(root_0, DEFEAT_KW104_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:165:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW );
    public final hightParser.action_return action() throws RecognitionException {
        hightParser.action_return retval = new hightParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set107=null;
        Token ENDS_KW108=null;
        Token STARTS_KW109=null;
        Token PAUSE_KW110=null;
        Token MUTE_KW111=null;
        Token set112=null;
        Token PLAY_KW113=null;
        Token STOP_KW114=null;
        Token IDENT115=null;
        Token BLOCK_KW116=null;
        Token OF118=null;
        Token EFFACE_KW121=null;
        Token GENERATE_KW122=null;
        Token IDENT125=null;
        Token IN127=null;
        Token ON128=null;
        Token AT130=null;
        Token WAIT_KW132=null;
        Token THEN135=null;
        Token ENDWAIT137=null;
        Token SAVE_KW138=null;
        hightParser.accesClasse_return accesClasse105 = null;

        hightParser.actionObjet_return actionObjet106 = null;

        hightParser.transformation_return transformation117 = null;

        hightParser.accesClasse_return accesClasse119 = null;

        hightParser.coordinates_return coordinates120 = null;

        hightParser.accesLocal_return accesLocal123 = null;

        hightParser.operation_return operation124 = null;

        hightParser.accesGlobal_return accesGlobal126 = null;

        hightParser.accesLocal_return accesLocal129 = null;

        hightParser.coordinates_return coordinates131 = null;

        hightParser.operation_return operation133 = null;

        hightParser.timeUnit_return timeUnit134 = null;

        hightParser.consequences_return consequences136 = null;


        CommonTree set107_tree=null;
        CommonTree ENDS_KW108_tree=null;
        CommonTree STARTS_KW109_tree=null;
        CommonTree PAUSE_KW110_tree=null;
        CommonTree MUTE_KW111_tree=null;
        CommonTree set112_tree=null;
        CommonTree PLAY_KW113_tree=null;
        CommonTree STOP_KW114_tree=null;
        CommonTree IDENT115_tree=null;
        CommonTree BLOCK_KW116_tree=null;
        CommonTree OF118_tree=null;
        CommonTree EFFACE_KW121_tree=null;
        CommonTree GENERATE_KW122_tree=null;
        CommonTree IDENT125_tree=null;
        CommonTree IN127_tree=null;
        CommonTree ON128_tree=null;
        CommonTree AT130_tree=null;
        CommonTree WAIT_KW132_tree=null;
        CommonTree THEN135_tree=null;
        CommonTree ENDWAIT137_tree=null;
        CommonTree SAVE_KW138_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:165:8: ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW )
            int alt43=7;
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
                {
                alt43=1;
                }
                break;
            case IDENT:
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==PAUSE_KW||LA43_2==STOP_KW||LA43_2==DIES_KW||LA43_2==EQUIP||(LA43_2>=JUMP && LA43_2<=MOVE)||(LA43_2>=TURN && LA43_2<=BRAKE)) ) {
                    alt43=1;
                }
                else if ( ((LA43_2>=ENDS_KW && LA43_2<=STARTS_KW)) ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt43=2;
                }
                break;
            case PAUSE_KW:
            case MUTE_KW:
            case PLAY_KW:
            case STOP_KW:
                {
                alt43=3;
                }
                break;
            case BLOCK_KW:
                {
                alt43=4;
                }
                break;
            case EFFACE_KW:
            case GENERATE_KW:
                {
                alt43=5;
                }
                break;
            case WAIT_KW:
                {
                alt43=6;
                }
                break;
            case SAVE_KW:
                {
                alt43=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:166:2: accesClasse actionObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_action1173);
                    accesClasse105=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse105.getTree());
                    pushFollow(FOLLOW_actionObjet_in_action1175);
                    actionObjet106=actionObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet106.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:167:4: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set107=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set107));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:167:19: ( ENDS_KW | STARTS_KW )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ENDS_KW) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==STARTS_KW) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:167:20: ENDS_KW
                            {
                            ENDS_KW108=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1189); 
                            ENDS_KW108_tree = (CommonTree)adaptor.create(ENDS_KW108);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW108_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:167:30: STARTS_KW
                            {
                            STARTS_KW109=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1193); 
                            STARTS_KW109_tree = (CommonTree)adaptor.create(STARTS_KW109);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW109_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:168:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:168:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW )
                    int alt37=4;
                    switch ( input.LA(1) ) {
                    case PAUSE_KW:
                        {
                        alt37=1;
                        }
                        break;
                    case MUTE_KW:
                        {
                        alt37=2;
                        }
                        break;
                    case PLAY_KW:
                        {
                        alt37=3;
                        }
                        break;
                    case STOP_KW:
                        {
                        alt37=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:168:5: PAUSE_KW
                            {
                            PAUSE_KW110=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1201); 
                            PAUSE_KW110_tree = (CommonTree)adaptor.create(PAUSE_KW110);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW110_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:168:17: MUTE_KW ( ON | OFF )
                            {
                            MUTE_KW111=(Token)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1206); 
                            MUTE_KW111_tree = (CommonTree)adaptor.create(MUTE_KW111);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTE_KW111_tree, root_0);

                            set112=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set112));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:168:39: PLAY_KW
                            {
                            PLAY_KW113=(Token)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1219); 
                            PLAY_KW113_tree = (CommonTree)adaptor.create(PLAY_KW113);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAY_KW113_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:168:50: STOP_KW
                            {
                            STOP_KW114=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_action1224); 
                            STOP_KW114_tree = (CommonTree)adaptor.create(STOP_KW114);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOP_KW114_tree, root_0);


                            }
                            break;

                    }

                    IDENT115=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1229); 
                    IDENT115_tree = (CommonTree)adaptor.create(IDENT115);
                    adaptor.addChild(root_0, IDENT115_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:169:4: BLOCK_KW transformation OF accesClasse coordinates
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLOCK_KW116=(Token)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1234); 
                    BLOCK_KW116_tree = (CommonTree)adaptor.create(BLOCK_KW116);
                    root_0 = (CommonTree)adaptor.becomeRoot(BLOCK_KW116_tree, root_0);

                    pushFollow(FOLLOW_transformation_in_action1237);
                    transformation117=transformation();

                    state._fsp--;

                    adaptor.addChild(root_0, transformation117.getTree());
                    OF118=(Token)match(input,OF,FOLLOW_OF_in_action1239); 
                    pushFollow(FOLLOW_accesClasse_in_action1242);
                    accesClasse119=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse119.getTree());
                    pushFollow(FOLLOW_coordinates_in_action1244);
                    coordinates120=coordinates();

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates120.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:4: ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:4: ( EFFACE_KW | GENERATE_KW )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==EFFACE_KW) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==GENERATE_KW) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:5: EFFACE_KW
                            {
                            EFFACE_KW121=(Token)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1250); 
                            EFFACE_KW121_tree = (CommonTree)adaptor.create(EFFACE_KW121);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACE_KW121_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:18: GENERATE_KW
                            {
                            GENERATE_KW122=(Token)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1255); 
                            GENERATE_KW122_tree = (CommonTree)adaptor.create(GENERATE_KW122);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATE_KW122_tree, root_0);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:32: ( accesLocal | operation ( IDENT | accesGlobal ) )
                    int alt40=2;
                    switch ( input.LA(1) ) {
                    case IDENT:
                        {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==OF) ) {
                            alt40=2;
                        }
                        else if ( (LA40_1==EOF||LA40_1==FIN||LA40_1==VIRG||LA40_1==AT||LA40_1==IN||LA40_1==DEFINITION_KW||LA40_1==ON||LA40_1==ENDWAIT||LA40_1==COMMAND_KW||LA40_1==RULE_KW||(LA40_1>=ELSE && LA40_1<=ENDIF)||LA40_1==IA_KW) ) {
                            alt40=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLAYER:
                    case NUM:
                        {
                        alt40=1;
                        }
                        break;
                    case FLOAT:
                    case SCORE:
                    case PG:
                    case RANDOM_KW:
                    case X:
                    case Y:
                    case Z:
                    case VALUE:
                        {
                        alt40=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:33: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_action1260);
                            accesLocal123=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal123.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:46: operation ( IDENT | accesGlobal )
                            {
                            pushFollow(FOLLOW_operation_in_action1264);
                            operation124=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation124.getTree());
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:56: ( IDENT | accesGlobal )
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==IDENT) ) {
                                alt39=1;
                            }
                            else if ( (LA39_0==CAMERA||LA39_0==MEDIA||(LA39_0>=ALLY && LA39_0<=NEUTRAL)||LA39_0==PG||(LA39_0>=COUNTER && LA39_0<=TIME)) ) {
                                alt39=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }
                            switch (alt39) {
                                case 1 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:57: IDENT
                                    {
                                    IDENT125=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1267); 
                                    IDENT125_tree = (CommonTree)adaptor.create(IDENT125);
                                    adaptor.addChild(root_0, IDENT125_tree);


                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:65: accesGlobal
                                    {
                                    pushFollow(FOLLOW_accesGlobal_in_action1271);
                                    accesGlobal126=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal126.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:79: ( ( IN | ON ) accesLocal | AT coordinates )?
                    int alt42=3;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==IN||LA42_0==ON) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==AT) ) {
                        alt42=2;
                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:80: ( IN | ON ) accesLocal
                            {
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:80: ( IN | ON )
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==IN) ) {
                                alt41=1;
                            }
                            else if ( (LA41_0==ON) ) {
                                alt41=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 0, input);

                                throw nvae;
                            }
                            switch (alt41) {
                                case 1 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:81: IN
                                    {
                                    IN127=(Token)match(input,IN,FOLLOW_IN_in_action1277); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:85: ON
                                    {
                                    ON128=(Token)match(input,ON,FOLLOW_ON_in_action1280); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_action1284);
                            accesLocal129=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal129.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:170:103: AT coordinates
                            {
                            AT130=(Token)match(input,AT,FOLLOW_AT_in_action1288); 
                            pushFollow(FOLLOW_coordinates_in_action1291);
                            coordinates131=coordinates();

                            state._fsp--;

                            adaptor.addChild(root_0, coordinates131.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:171:4: WAIT_KW operation timeUnit THEN consequences ENDWAIT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAIT_KW132=(Token)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1298); 
                    WAIT_KW132_tree = (CommonTree)adaptor.create(WAIT_KW132);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAIT_KW132_tree, root_0);

                    pushFollow(FOLLOW_operation_in_action1301);
                    operation133=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation133.getTree());
                    pushFollow(FOLLOW_timeUnit_in_action1303);
                    timeUnit134=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit134.getTree());
                    THEN135=(Token)match(input,THEN,FOLLOW_THEN_in_action1305); 
                    pushFollow(FOLLOW_consequences_in_action1308);
                    consequences136=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences136.getTree());
                    ENDWAIT137=(Token)match(input,ENDWAIT,FOLLOW_ENDWAIT_in_action1310); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:172:4: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAVE_KW138=(Token)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1316); 
                    SAVE_KW138_tree = (CommonTree)adaptor.create(SAVE_KW138);
                    adaptor.addChild(root_0, SAVE_KW138_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:175:1: actionObjet : ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) );
    public final hightParser.actionObjet_return actionObjet() throws RecognitionException {
        hightParser.actionObjet_return retval = new hightParser.actionObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIES_KW139=null;
        Token DURING142=null;
        Token UNTIL145=null;
        Token EQUIP147=null;
        Token NEXT149=null;
        Token PREVIOUS150=null;
        hightParser.actionCommandePressee_return actionCommandePressee140 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue141 = null;

        hightParser.operation_return operation143 = null;

        hightParser.timeUnit_return timeUnit144 = null;

        hightParser.conditions_return conditions146 = null;

        hightParser.accesLocal_return accesLocal148 = null;


        CommonTree DIES_KW139_tree=null;
        CommonTree DURING142_tree=null;
        CommonTree UNTIL145_tree=null;
        CommonTree EQUIP147_tree=null;
        CommonTree NEXT149_tree=null;
        CommonTree PREVIOUS150_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:175:13: ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case DIES_KW:
                {
                alt46=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt46=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt46=3;
                }
                break;
            case EQUIP:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:176:3: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DIES_KW139=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1328); 
                    DIES_KW139_tree = (CommonTree)adaptor.create(DIES_KW139);
                    adaptor.addChild(root_0, DIES_KW139_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:177:5: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1334);
                    actionCommandePressee140=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee140.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:178:5: actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1340);
                    actionCommandeMaintenue141=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue141.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:178:29: ( DURING operation timeUnit | UNTIL conditions )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==DURING) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==UNTIL) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:178:30: DURING operation timeUnit
                            {
                            DURING142=(Token)match(input,DURING,FOLLOW_DURING_in_actionObjet1343); 
                            DURING142_tree = (CommonTree)adaptor.create(DURING142);
                            root_0 = (CommonTree)adaptor.becomeRoot(DURING142_tree, root_0);

                            pushFollow(FOLLOW_operation_in_actionObjet1346);
                            operation143=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation143.getTree());
                            pushFollow(FOLLOW_timeUnit_in_actionObjet1348);
                            timeUnit144=timeUnit();

                            state._fsp--;

                            adaptor.addChild(root_0, timeUnit144.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:178:59: UNTIL conditions
                            {
                            UNTIL145=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1352); 
                            UNTIL145_tree = (CommonTree)adaptor.create(UNTIL145);
                            root_0 = (CommonTree)adaptor.becomeRoot(UNTIL145_tree, root_0);

                            pushFollow(FOLLOW_conditions_in_actionObjet1355);
                            conditions146=conditions();

                            state._fsp--;

                            adaptor.addChild(root_0, conditions146.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:179:5: EQUIP ( accesLocal | NEXT | PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EQUIP147=(Token)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1362); 
                    EQUIP147_tree = (CommonTree)adaptor.create(EQUIP147);
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUIP147_tree, root_0);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:179:12: ( accesLocal | NEXT | PREVIOUS )
                    int alt45=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case PLAYER:
                    case NUM:
                        {
                        alt45=1;
                        }
                        break;
                    case NEXT:
                        {
                        alt45=2;
                        }
                        break;
                    case PREVIOUS:
                        {
                        alt45=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }

                    switch (alt45) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:179:13: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_actionObjet1366);
                            accesLocal148=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal148.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:179:26: NEXT
                            {
                            NEXT149=(Token)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1370); 
                            NEXT149_tree = (CommonTree)adaptor.create(NEXT149);
                            adaptor.addChild(root_0, NEXT149_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:179:33: PREVIOUS
                            {
                            PREVIOUS150=(Token)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1374); 
                            PREVIOUS150_tree = (CommonTree)adaptor.create(PREVIOUS150);
                            adaptor.addChild(root_0, PREVIOUS150_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:182:1: transformation : ( TRANSLATION | ROTATION | SCALE );
    public final hightParser.transformation_return transformation() throws RecognitionException {
        hightParser.transformation_return retval = new hightParser.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set151=null;

        CommonTree set151_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:182:16: ( TRANSLATION | ROTATION | SCALE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set151=(Token)input.LT(1);
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set151));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:188:1: coordinates : operation operation operation -> ^( COORDINATE_KW operation operation operation ) ;
    public final hightParser.coordinates_return coordinates() throws RecognitionException {
        hightParser.coordinates_return retval = new hightParser.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hightParser.operation_return operation152 = null;

        hightParser.operation_return operation153 = null;

        hightParser.operation_return operation154 = null;


        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:188:13: ( operation operation operation -> ^( COORDINATE_KW operation operation operation ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:189:2: operation operation operation
            {
            pushFollow(FOLLOW_operation_in_coordinates1414);
            operation152=operation();

            state._fsp--;

            stream_operation.add(operation152.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1416);
            operation153=operation();

            state._fsp--;

            stream_operation.add(operation153.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1418);
            operation154=operation();

            state._fsp--;

            stream_operation.add(operation154.getTree());


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
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:190:7: ^( COORDINATE_KW operation operation operation )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:195:1: commande : COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )* ;
    public final hightParser.commande_return commande() throws RecognitionException {
        hightParser.commande_return retval = new hightParser.commande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMAND_KW155=null;
        Token IDENT156=null;
        Token IS157=null;
        Token VIRG159=null;
        hightParser.actionCommande_return actionCommande158 = null;

        hightParser.actionCommande_return actionCommande160 = null;


        CommonTree COMMAND_KW155_tree=null;
        CommonTree IDENT156_tree=null;
        CommonTree IS157_tree=null;
        CommonTree VIRG159_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:195:10: ( COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:196:2: COMMAND_KW ( IDENT IS )? actionCommande ( VIRG actionCommande )*
            {
            root_0 = (CommonTree)adaptor.nil();

            COMMAND_KW155=(Token)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1447); 
            COMMAND_KW155_tree = (CommonTree)adaptor.create(COMMAND_KW155);
            root_0 = (CommonTree)adaptor.becomeRoot(COMMAND_KW155_tree, root_0);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:196:14: ( IDENT IS )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:196:15: IDENT IS
                    {
                    IDENT156=(Token)match(input,IDENT,FOLLOW_IDENT_in_commande1451); 
                    IDENT156_tree = (CommonTree)adaptor.create(IDENT156);
                    adaptor.addChild(root_0, IDENT156_tree);

                    IS157=(Token)match(input,IS,FOLLOW_IS_in_commande1453); 

                    }
                    break;

            }

            pushFollow(FOLLOW_actionCommande_in_commande1458);
            actionCommande158=actionCommande();

            state._fsp--;

            adaptor.addChild(root_0, actionCommande158.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:196:42: ( VIRG actionCommande )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==VIRG) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:196:43: VIRG actionCommande
            	    {
            	    VIRG159=(Token)match(input,VIRG,FOLLOW_VIRG_in_commande1461); 
            	    pushFollow(FOLLOW_actionCommande_in_commande1464);
            	    actionCommande160=actionCommande();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionCommande160.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:199:1: actionCommande : ( MOUSE souris FOR actionCommandeType -> ^( MOUSE_KW souris actionCommandeType ) | KEY clavier FOR actionCommandeType -> ^( KEY_KW clavier actionCommandeType ) );
    public final hightParser.actionCommande_return actionCommande() throws RecognitionException {
        hightParser.actionCommande_return retval = new hightParser.actionCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOUSE161=null;
        Token FOR163=null;
        Token KEY165=null;
        Token FOR167=null;
        hightParser.souris_return souris162 = null;

        hightParser.actionCommandeType_return actionCommandeType164 = null;

        hightParser.clavier_return clavier166 = null;

        hightParser.actionCommandeType_return actionCommandeType168 = null;


        CommonTree MOUSE161_tree=null;
        CommonTree FOR163_tree=null;
        CommonTree KEY165_tree=null;
        CommonTree FOR167_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_actionCommandeType=new RewriteRuleSubtreeStream(adaptor,"rule actionCommandeType");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:199:16: ( MOUSE souris FOR actionCommandeType -> ^( MOUSE_KW souris actionCommandeType ) | KEY clavier FOR actionCommandeType -> ^( KEY_KW clavier actionCommandeType ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==MOUSE) ) {
                alt49=1;
            }
            else if ( (LA49_0==KEY) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:200:2: MOUSE souris FOR actionCommandeType
                    {
                    MOUSE161=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_actionCommande1477);  
                    stream_MOUSE.add(MOUSE161);

                    pushFollow(FOLLOW_souris_in_actionCommande1479);
                    souris162=souris();

                    state._fsp--;

                    stream_souris.add(souris162.getTree());
                    FOR163=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande1481);  
                    stream_FOR.add(FOR163);

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1483);
                    actionCommandeType164=actionCommandeType();

                    state._fsp--;

                    stream_actionCommandeType.add(actionCommandeType164.getTree());


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
                    // 201:4: -> ^( MOUSE_KW souris actionCommandeType )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:201:7: ^( MOUSE_KW souris actionCommandeType )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:202:4: KEY clavier FOR actionCommandeType
                    {
                    KEY165=(Token)match(input,KEY,FOLLOW_KEY_in_actionCommande1501);  
                    stream_KEY.add(KEY165);

                    pushFollow(FOLLOW_clavier_in_actionCommande1503);
                    clavier166=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier166.getTree());
                    FOR167=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande1505);  
                    stream_FOR.add(FOR167);

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1507);
                    actionCommandeType168=actionCommandeType();

                    state._fsp--;

                    stream_actionCommandeType.add(actionCommandeType168.getTree());


                    // AST REWRITE
                    // elements: actionCommandeType, clavier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 203:4: -> ^( KEY_KW clavier actionCommandeType )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:203:7: ^( KEY_KW clavier actionCommandeType )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:206:1: actionCommandeType : ( IDENT | actionCommandePressee | actionCommandeMaintenue );
    public final hightParser.actionCommandeType_return actionCommandeType() throws RecognitionException {
        hightParser.actionCommandeType_return retval = new hightParser.actionCommandeType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT169=null;
        hightParser.actionCommandePressee_return actionCommandePressee170 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue171 = null;


        CommonTree IDENT169_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:206:20: ( IDENT | actionCommandePressee | actionCommandeMaintenue )
            int alt50=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt50=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt50=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:207:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT169=(Token)match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1532); 
                    IDENT169_tree = (CommonTree)adaptor.create(IDENT169);
                    adaptor.addChild(root_0, IDENT169_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:207:10: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1536);
                    actionCommandePressee170=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee170.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:207:34: actionCommandeMaintenue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1540);
                    actionCommandeMaintenue171=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue171.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:210:1: souris : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final hightParser.souris_return souris() throws RecognitionException {
        hightParser.souris_return retval = new hightParser.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set172=null;

        CommonTree set172_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:210:8: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set172=(Token)input.LT(1);
            if ( (input.LA(1)>=WUP && input.LA(1)<=SCROLL_DOWN) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set172));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:214:1: clavier : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final hightParser.clavier_return clavier() throws RecognitionException {
        hightParser.clavier_return retval = new hightParser.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set173=null;

        CommonTree set173_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:214:9: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set173=(Token)input.LT(1);
            if ( (input.LA(1)>=WUP && input.LA(1)<=RIGHT)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set173));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:218:1: actionCommandePressee : ( JUMP operation | PAUSE_KW | STOP_KW );
    public final hightParser.actionCommandePressee_return actionCommandePressee() throws RecognitionException {
        hightParser.actionCommandePressee_return retval = new hightParser.actionCommandePressee_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token JUMP174=null;
        Token PAUSE_KW176=null;
        Token STOP_KW177=null;
        hightParser.operation_return operation175 = null;


        CommonTree JUMP174_tree=null;
        CommonTree PAUSE_KW176_tree=null;
        CommonTree STOP_KW177_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:218:23: ( JUMP operation | PAUSE_KW | STOP_KW )
            int alt51=3;
            switch ( input.LA(1) ) {
            case JUMP:
                {
                alt51=1;
                }
                break;
            case PAUSE_KW:
                {
                alt51=2;
                }
                break;
            case STOP_KW:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:219:3: JUMP operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    JUMP174=(Token)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1652); 
                    JUMP174_tree = (CommonTree)adaptor.create(JUMP174);
                    adaptor.addChild(root_0, JUMP174_tree);

                    pushFollow(FOLLOW_operation_in_actionCommandePressee1654);
                    operation175=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation175.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:220:5: PAUSE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PAUSE_KW176=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1660); 
                    PAUSE_KW176_tree = (CommonTree)adaptor.create(PAUSE_KW176);
                    adaptor.addChild(root_0, PAUSE_KW176_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:221:5: STOP_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STOP_KW177=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1666); 
                    STOP_KW177_tree = (CommonTree)adaptor.create(STOP_KW177);
                    adaptor.addChild(root_0, STOP_KW177_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:224:1: actionCommandeMaintenue : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
    public final hightParser.actionCommandeMaintenue_return actionCommandeMaintenue() throws RecognitionException {
        hightParser.actionCommandeMaintenue_return retval = new hightParser.actionCommandeMaintenue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVE178=null;
        Token set179=null;
        Token TURN180=null;
        Token set181=null;
        Token ACCELERATE182=null;
        Token BRAKE183=null;

        CommonTree MOVE178_tree=null;
        CommonTree set179_tree=null;
        CommonTree TURN180_tree=null;
        CommonTree set181_tree=null;
        CommonTree ACCELERATE182_tree=null;
        CommonTree BRAKE183_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:224:25: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
            int alt52=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt52=1;
                }
                break;
            case TURN:
                {
                alt52=2;
                }
                break;
            case ACCELERATE:
                {
                alt52=3;
                }
                break;
            case BRAKE:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:225:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MOVE178=(Token)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1681); 
                    MOVE178_tree = (CommonTree)adaptor.create(MOVE178);
                    adaptor.addChild(root_0, MOVE178_tree);

                    set179=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=FORWARD && input.LA(1)<=BACKWARD) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set179));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:226:5: TURN ( LEFT | RIGHT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURN180=(Token)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1703); 
                    TURN180_tree = (CommonTree)adaptor.create(TURN180);
                    adaptor.addChild(root_0, TURN180_tree);

                    set181=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT) ) {
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
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:227:5: ACCELERATE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACCELERATE182=(Token)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1717); 
                    ACCELERATE182_tree = (CommonTree)adaptor.create(ACCELERATE182);
                    adaptor.addChild(root_0, ACCELERATE182_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:228:5: BRAKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BRAKE183=(Token)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1723); 
                    BRAKE183_tree = (CommonTree)adaptor.create(BRAKE183);
                    adaptor.addChild(root_0, BRAKE183_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:231:1: activCommande : ( ACTIVATE_KW | DISABLE_KW ) typeCommand ;
    public final hightParser.activCommande_return activCommande() throws RecognitionException {
        hightParser.activCommande_return retval = new hightParser.activCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ACTIVATE_KW184=null;
        Token DISABLE_KW185=null;
        hightParser.typeCommand_return typeCommand186 = null;


        CommonTree ACTIVATE_KW184_tree=null;
        CommonTree DISABLE_KW185_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:231:15: ( ( ACTIVATE_KW | DISABLE_KW ) typeCommand )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:232:3: ( ACTIVATE_KW | DISABLE_KW ) typeCommand
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:232:3: ( ACTIVATE_KW | DISABLE_KW )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ACTIVATE_KW) ) {
                alt53=1;
            }
            else if ( (LA53_0==DISABLE_KW) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:232:4: ACTIVATE_KW
                    {
                    ACTIVATE_KW184=(Token)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1739); 
                    ACTIVATE_KW184_tree = (CommonTree)adaptor.create(ACTIVATE_KW184);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW184_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:232:19: DISABLE_KW
                    {
                    DISABLE_KW185=(Token)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1744); 
                    DISABLE_KW185_tree = (CommonTree)adaptor.create(DISABLE_KW185);
                    root_0 = (CommonTree)adaptor.becomeRoot(DISABLE_KW185_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeCommand_in_activCommande1748);
            typeCommand186=typeCommand();

            state._fsp--;

            adaptor.addChild(root_0, typeCommand186.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:235:1: typeCommand : ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD );
    public final hightParser.typeCommand_return typeCommand() throws RecognitionException {
        hightParser.typeCommand_return retval = new hightParser.typeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMANDS187=null;
        Token MOUSE188=null;
        Token VIRG190=null;
        Token KEY192=null;
        Token VIRG194=null;
        Token KEYBOARD196=null;
        hightParser.souris_return souris189 = null;

        hightParser.souris_return souris191 = null;

        hightParser.clavier_return clavier193 = null;

        hightParser.clavier_return clavier195 = null;


        CommonTree COMMANDS187_tree=null;
        CommonTree MOUSE188_tree=null;
        CommonTree VIRG190_tree=null;
        CommonTree KEY192_tree=null;
        CommonTree VIRG194_tree=null;
        CommonTree KEYBOARD196_tree=null;
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:235:13: ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD )
            int alt57=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt57=1;
                }
                break;
            case MOUSE:
                {
                alt57=2;
                }
                break;
            case KEY:
                {
                alt57=3;
                }
                break;
            case KEYBOARD:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:236:5: COMMANDS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMMANDS187=(Token)match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand1762); 
                    COMMANDS187_tree = (CommonTree)adaptor.create(COMMANDS187);
                    adaptor.addChild(root_0, COMMANDS187_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:237:7: MOUSE ( souris ( VIRG souris )* )?
                    {
                    MOUSE188=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_typeCommand1770);  
                    stream_MOUSE.add(MOUSE188);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:237:13: ( souris ( VIRG souris )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=WUP && LA55_0<=SCROLL_DOWN)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:237:14: souris ( VIRG souris )*
                            {
                            pushFollow(FOLLOW_souris_in_typeCommand1773);
                            souris189=souris();

                            state._fsp--;

                            stream_souris.add(souris189.getTree());
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:237:21: ( VIRG souris )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==VIRG) ) {
                                    int LA54_1 = input.LA(2);

                                    if ( ((LA54_1>=WUP && LA54_1<=SCROLL_DOWN)) ) {
                                        alt54=1;
                                    }


                                }


                                switch (alt54) {
                            	case 1 :
                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:237:22: VIRG souris
                            	    {
                            	    VIRG190=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand1776);  
                            	    stream_VIRG.add(VIRG190);

                            	    pushFollow(FOLLOW_souris_in_typeCommand1778);
                            	    souris191=souris();

                            	    state._fsp--;

                            	    stream_souris.add(souris191.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop54;
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
                    // 238:7: -> ^( MOUSE_KW ( souris )* )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:238:10: ^( MOUSE_KW ( souris )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:238:21: ( souris )*
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:239:7: KEY clavier ( VIRG clavier )*
                    {
                    KEY192=(Token)match(input,KEY,FOLLOW_KEY_in_typeCommand1805);  
                    stream_KEY.add(KEY192);

                    pushFollow(FOLLOW_clavier_in_typeCommand1807);
                    clavier193=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier193.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:239:19: ( VIRG clavier )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==VIRG) ) {
                            int LA56_1 = input.LA(2);

                            if ( ((LA56_1>=WUP && LA56_1<=RIGHT)||(LA56_1>=LETTER && LA56_1<=ENTER)) ) {
                                alt56=1;
                            }


                        }


                        switch (alt56) {
                    	case 1 :
                    	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:239:20: VIRG clavier
                    	    {
                    	    VIRG194=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand1810);  
                    	    stream_VIRG.add(VIRG194);

                    	    pushFollow(FOLLOW_clavier_in_typeCommand1812);
                    	    clavier195=clavier();

                    	    state._fsp--;

                    	    stream_clavier.add(clavier195.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
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
                    // 240:7: -> ^( KEY_KW ( clavier )+ )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:240:10: ^( KEY_KW ( clavier )+ )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:241:7: KEYBOARD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KEYBOARD196=(Token)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand1837); 
                    KEYBOARD196_tree = (CommonTree)adaptor.create(KEYBOARD196);
                    adaptor.addChild(root_0, KEYBOARD196_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:243:1: reglesJeu : RULE_KW ( IDENT IS )? declencheur THEN consequences ;
    public final hightParser.reglesJeu_return reglesJeu() throws RecognitionException {
        hightParser.reglesJeu_return retval = new hightParser.reglesJeu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RULE_KW197=null;
        Token IDENT198=null;
        Token IS199=null;
        Token THEN201=null;
        hightParser.declencheur_return declencheur200 = null;

        hightParser.consequences_return consequences202 = null;


        CommonTree RULE_KW197_tree=null;
        CommonTree IDENT198_tree=null;
        CommonTree IS199_tree=null;
        CommonTree THEN201_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:243:11: ( RULE_KW ( IDENT IS )? declencheur THEN consequences )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:244:3: RULE_KW ( IDENT IS )? declencheur THEN consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            RULE_KW197=(Token)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1847); 
            RULE_KW197_tree = (CommonTree)adaptor.create(RULE_KW197);
            root_0 = (CommonTree)adaptor.becomeRoot(RULE_KW197_tree, root_0);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:244:12: ( IDENT IS )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IDENT) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==IS) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:244:13: IDENT IS
                    {
                    IDENT198=(Token)match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1851); 
                    IDENT198_tree = (CommonTree)adaptor.create(IDENT198);
                    adaptor.addChild(root_0, IDENT198_tree);

                    IS199=(Token)match(input,IS,FOLLOW_IS_in_reglesJeu1853); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu1859);
            declencheur200=declencheur();

            state._fsp--;

            adaptor.addChild(root_0, declencheur200.getTree());
            THEN201=(Token)match(input,THEN,FOLLOW_THEN_in_reglesJeu1861); 
            pushFollow(FOLLOW_consequences_in_reglesJeu1864);
            consequences202=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences202.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:247:1: declencheur : ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW );
    public final hightParser.declencheur_return declencheur() throws RecognitionException {
        hightParser.declencheur_return retval = new hightParser.declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVES_KW204=null;
        Token DIES_KW205=null;
        Token set208=null;
        Token ENDS_KW209=null;
        Token STARTS_KW210=null;
        Token BECOMES212=null;
        Token IDENT214=null;
        Token BECOMES215=null;
        Token VICTORY_KW217=null;
        Token DEFEAT_KW218=null;
        hightParser.accesClasse_return accesClasse203 = null;

        hightParser.declencheurTK_return declencheurTK206 = null;

        hightParser.declencheurKT_return declencheurKT207 = null;

        hightParser.variable_return variable211 = null;

        hightParser.varOuNB_return varOuNB213 = null;

        hightParser.playerOuInteraction_return playerOuInteraction216 = null;


        CommonTree MOVES_KW204_tree=null;
        CommonTree DIES_KW205_tree=null;
        CommonTree set208_tree=null;
        CommonTree ENDS_KW209_tree=null;
        CommonTree STARTS_KW210_tree=null;
        CommonTree BECOMES212_tree=null;
        CommonTree IDENT214_tree=null;
        CommonTree BECOMES215_tree=null;
        CommonTree VICTORY_KW217_tree=null;
        CommonTree DEFEAT_KW218_tree=null;
        RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_varOuNB=new RewriteRuleSubtreeStream(adaptor,"rule varOuNB");
        RewriteRuleSubtreeStream stream_playerOuInteraction=new RewriteRuleSubtreeStream(adaptor,"rule playerOuInteraction");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:247:13: ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW )
            int alt61=6;
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
                {
                alt61=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case OF:
                    {
                    alt61=3;
                    }
                    break;
                case BECOMES:
                    {
                    alt61=4;
                    }
                    break;
                case DIES_KW:
                case MOVES_KW:
                case TOUCHES_KW:
                case KILLS_KW:
                case KILLED_KW:
                case TOUCHED_KW:
                    {
                    alt61=1;
                    }
                    break;
                case ENDS_KW:
                case STARTS_KW:
                    {
                    alt61=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;
                }

                }
                break;
            case GAME:
                {
                alt61=2;
                }
                break;
            case SCORE:
            case X:
            case Y:
            case Z:
            case VALUE:
                {
                alt61=3;
                }
                break;
            case VICTORY_KW:
                {
                alt61=5;
                }
                break;
            case DEFEAT_KW:
                {
                alt61=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:248:3: accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_declencheur1878);
                    accesClasse203=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse203.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:248:15: ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    int alt59=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt59=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt59=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                        {
                        alt59=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:248:16: MOVES_KW
                            {
                            MOVES_KW204=(Token)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1881); 
                            MOVES_KW204_tree = (CommonTree)adaptor.create(MOVES_KW204);
                            adaptor.addChild(root_0, MOVES_KW204_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:248:27: DIES_KW
                            {
                            DIES_KW205=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1885); 
                            DIES_KW205_tree = (CommonTree)adaptor.create(DIES_KW205);
                            adaptor.addChild(root_0, DIES_KW205_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:248:37: declencheurTK
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1889);
                            declencheurTK206=declencheurTK();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK206.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:248:53: declencheurKT
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1893);
                            declencheurKT207=declencheurKT();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT207.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:249:5: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set208=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set208));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:249:20: ( ENDS_KW | STARTS_KW )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==ENDS_KW) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==STARTS_KW) ) {
                        alt60=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:249:21: ENDS_KW
                            {
                            ENDS_KW209=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1910); 
                            ENDS_KW209_tree = (CommonTree)adaptor.create(ENDS_KW209);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW209_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:249:31: STARTS_KW
                            {
                            STARTS_KW210=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1914); 
                            STARTS_KW210_tree = (CommonTree)adaptor.create(STARTS_KW210);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW210_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:250:5: variable BECOMES varOuNB
                    {
                    pushFollow(FOLLOW_variable_in_declencheur1932);
                    variable211=variable();

                    state._fsp--;

                    stream_variable.add(variable211.getTree());
                    BECOMES212=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1934);  
                    stream_BECOMES.add(BECOMES212);

                    pushFollow(FOLLOW_varOuNB_in_declencheur1936);
                    varOuNB213=varOuNB();

                    state._fsp--;

                    stream_varOuNB.add(varOuNB213.getTree());


                    // AST REWRITE
                    // elements: varOuNB, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 251:5: -> ^( BECOMES_VAR_KW variable varOuNB )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:251:8: ^( BECOMES_VAR_KW variable varOuNB )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:252:5: IDENT BECOMES playerOuInteraction
                    {
                    IDENT214=(Token)match(input,IDENT,FOLLOW_IDENT_in_declencheur1956);  
                    stream_IDENT.add(IDENT214);

                    BECOMES215=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1958);  
                    stream_BECOMES.add(BECOMES215);

                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1960);
                    playerOuInteraction216=playerOuInteraction();

                    state._fsp--;

                    stream_playerOuInteraction.add(playerOuInteraction216.getTree());


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
                    // 253:5: -> ^( BECOMES_ID_KW IDENT playerOuInteraction )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:253:8: ^( BECOMES_ID_KW IDENT playerOuInteraction )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:254:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW217=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur1980); 
                    VICTORY_KW217_tree = (CommonTree)adaptor.create(VICTORY_KW217);
                    adaptor.addChild(root_0, VICTORY_KW217_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:255:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW218=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur1986); 
                    DEFEAT_KW218_tree = (CommonTree)adaptor.create(DEFEAT_KW218);
                    adaptor.addChild(root_0, DEFEAT_KW218_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:258:1: varOuNB : ( variable | FLOAT );
    public final hightParser.varOuNB_return varOuNB() throws RecognitionException {
        hightParser.varOuNB_return retval = new hightParser.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FLOAT220=null;
        hightParser.variable_return variable219 = null;


        CommonTree FLOAT220_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:258:9: ( variable | FLOAT )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==SCORE||LA62_0==IDENT||(LA62_0>=X && LA62_0<=VALUE)) ) {
                alt62=1;
            }
            else if ( (LA62_0==FLOAT) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:258:11: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_varOuNB1997);
                    variable219=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable219.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:258:22: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT220=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2001); 
                    FLOAT220_tree = (CommonTree)adaptor.create(FLOAT220);
                    adaptor.addChild(root_0, FLOAT220_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:260:1: playerOuInteraction : ( PLAYER | interaction ) ;
    public final hightParser.playerOuInteraction_return playerOuInteraction() throws RecognitionException {
        hightParser.playerOuInteraction_return retval = new hightParser.playerOuInteraction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER221=null;
        hightParser.interaction_return interaction222 = null;


        CommonTree PLAYER221_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:261:2: ( ( PLAYER | interaction ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:261:4: ( PLAYER | interaction )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:261:4: ( PLAYER | interaction )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==PLAYER) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=ALLY && LA63_0<=NEUTRAL)) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:261:5: PLAYER
                    {
                    PLAYER221=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction2011); 
                    PLAYER221_tree = (CommonTree)adaptor.create(PLAYER221);
                    adaptor.addChild(root_0, PLAYER221_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:261:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction2014);
                    interaction222=interaction();

                    state._fsp--;

                    adaptor.addChild(root_0, interaction222.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:263:1: declencheurTK : ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) ;
    public final hightParser.declencheurTK_return declencheurTK() throws RecognitionException {
        hightParser.declencheurTK_return retval = new hightParser.declencheurTK_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOUCHES_KW223=null;
        Token KILLS_KW224=null;
        Token OTHER225=null;
        hightParser.accesGlobal_return accesGlobal226 = null;

        hightParser.accesLocal_return accesLocal227 = null;


        CommonTree TOUCHES_KW223_tree=null;
        CommonTree KILLS_KW224_tree=null;
        CommonTree OTHER225_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:2: ( ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:4: ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:4: ( TOUCHES_KW | KILLS_KW )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==TOUCHES_KW) ) {
                alt64=1;
            }
            else if ( (LA64_0==KILLS_KW) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:5: TOUCHES_KW
                    {
                    TOUCHES_KW223=(Token)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2026); 
                    TOUCHES_KW223_tree = (CommonTree)adaptor.create(TOUCHES_KW223);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW223_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:19: KILLS_KW
                    {
                    KILLS_KW224=(Token)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2031); 
                    KILLS_KW224_tree = (CommonTree)adaptor.create(KILLS_KW224);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLS_KW224_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:30: ( ( OTHER )? accesGlobal | accesLocal )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==CAMERA||LA66_0==MEDIA||(LA66_0>=ALLY && LA66_0<=NEUTRAL)||LA66_0==OTHER||LA66_0==PG||(LA66_0>=COUNTER && LA66_0<=TIME)) ) {
                alt66=1;
            }
            else if ( (LA66_0==IDENT||LA66_0==PLAYER||LA66_0==NUM) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:31: ( OTHER )? accesGlobal
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:31: ( OTHER )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==OTHER) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:32: OTHER
                            {
                            OTHER225=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2037); 
                            OTHER225_tree = (CommonTree)adaptor.create(OTHER225);
                            adaptor.addChild(root_0, OTHER225_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesGlobal_in_declencheurTK2041);
                    accesGlobal226=accesGlobal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal226.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:264:54: accesLocal
                    {
                    pushFollow(FOLLOW_accesLocal_in_declencheurTK2045);
                    accesLocal227=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal227.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:266:1: declencheurKT : ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? ;
    public final hightParser.declencheurKT_return declencheurKT() throws RecognitionException {
        hightParser.declencheurKT_return retval = new hightParser.declencheurKT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KILLED_KW228=null;
        Token TOUCHED_KW229=null;
        Token BY230=null;
        Token OTHER231=null;
        hightParser.accesGlobal_return accesGlobal232 = null;

        hightParser.accesLocal_return accesLocal233 = null;


        CommonTree KILLED_KW228_tree=null;
        CommonTree TOUCHED_KW229_tree=null;
        CommonTree BY230_tree=null;
        CommonTree OTHER231_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:2: ( ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:4: ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:4: ( KILLED_KW | TOUCHED_KW )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==KILLED_KW) ) {
                alt67=1;
            }
            else if ( (LA67_0==TOUCHED_KW) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:5: KILLED_KW
                    {
                    KILLED_KW228=(Token)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2057); 
                    KILLED_KW228_tree = (CommonTree)adaptor.create(KILLED_KW228);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLED_KW228_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:18: TOUCHED_KW
                    {
                    TOUCHED_KW229=(Token)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2062); 
                    TOUCHED_KW229_tree = (CommonTree)adaptor.create(TOUCHED_KW229);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW229_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:31: ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==BY) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:32: BY ( ( OTHER )? accesGlobal | accesLocal )
                    {
                    BY230=(Token)match(input,BY,FOLLOW_BY_in_declencheurKT2067); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:36: ( ( OTHER )? accesGlobal | accesLocal )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==CAMERA||LA69_0==MEDIA||(LA69_0>=ALLY && LA69_0<=NEUTRAL)||LA69_0==OTHER||LA69_0==PG||(LA69_0>=COUNTER && LA69_0<=TIME)) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==IDENT||LA69_0==PLAYER||LA69_0==NUM) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:37: ( OTHER )? accesGlobal
                            {
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:37: ( OTHER )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==OTHER) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:38: OTHER
                                    {
                                    OTHER231=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2072); 
                                    OTHER231_tree = (CommonTree)adaptor.create(OTHER231);
                                    adaptor.addChild(root_0, OTHER231_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesGlobal_in_declencheurKT2076);
                            accesGlobal232=accesGlobal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesGlobal232.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:267:60: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_declencheurKT2080);
                            accesLocal233=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal233.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:1: siAlors : IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF ;
    public final hightParser.siAlors_return siAlors() throws RecognitionException {
        hightParser.siAlors_return retval = new hightParser.siAlors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF_KW234=null;
        Token THEN236=null;
        Token ELSE238=null;
        Token ENDIF240=null;
        hightParser.conditions_return conditions235 = null;

        hightParser.consequences_return consequences237 = null;

        hightParser.consequences_return consequences239 = null;


        CommonTree IF_KW234_tree=null;
        CommonTree THEN236_tree=null;
        CommonTree ELSE238_tree=null;
        CommonTree ENDIF240_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:270:9: ( IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:271:3: IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF_KW234=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2097); 
            IF_KW234_tree = (CommonTree)adaptor.create(IF_KW234);
            root_0 = (CommonTree)adaptor.becomeRoot(IF_KW234_tree, root_0);

            pushFollow(FOLLOW_conditions_in_siAlors2100);
            conditions235=conditions();

            state._fsp--;

            adaptor.addChild(root_0, conditions235.getTree());
            THEN236=(Token)match(input,THEN,FOLLOW_THEN_in_siAlors2102); 
            pushFollow(FOLLOW_consequences_in_siAlors2105);
            consequences237=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences237.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:271:40: ( ELSE consequences )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ELSE) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:271:41: ELSE consequences
                    {
                    ELSE238=(Token)match(input,ELSE,FOLLOW_ELSE_in_siAlors2108); 
                    pushFollow(FOLLOW_consequences_in_siAlors2111);
                    consequences239=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences239.getTree());

                    }
                    break;

            }

            ENDIF240=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_siAlors2115); 

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:274:1: conditions : ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) ;
    public final hightParser.conditions_return conditions() throws RecognitionException {
        hightParser.conditions_return retval = new hightParser.conditions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT241=null;
        hightParser.conditionOu_return conditionOu242 = null;


        CommonTree NOT241_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_conditionOu=new RewriteRuleSubtreeStream(adaptor,"rule conditionOu");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:274:12: ( ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:275:3: ( NOT )? conditionOu
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:275:3: ( NOT )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==NOT) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:275:4: NOT
                    {
                    NOT241=(Token)match(input,NOT,FOLLOW_NOT_in_conditions2130);  
                    stream_NOT.add(NOT241);


                    }
                    break;

            }

            pushFollow(FOLLOW_conditionOu_in_conditions2134);
            conditionOu242=conditionOu();

            state._fsp--;

            stream_conditionOu.add(conditionOu242.getTree());


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
            // 276:3: -> ^( CONDITION_KW ( NOT )? conditionOu )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:276:6: ^( CONDITION_KW ( NOT )? conditionOu )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_KW, "CONDITION_KW"), root_1);

                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:276:21: ( NOT )?
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:279:1: conditionOu : conditionEt ( OR conditionEt )* ;
    public final hightParser.conditionOu_return conditionOu() throws RecognitionException {
        hightParser.conditionOu_return retval = new hightParser.conditionOu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR244=null;
        hightParser.conditionEt_return conditionEt243 = null;

        hightParser.conditionEt_return conditionEt245 = null;


        CommonTree OR244_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:279:13: ( conditionEt ( OR conditionEt )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:280:3: conditionEt ( OR conditionEt )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionEt_in_conditionOu2160);
            conditionEt243=conditionEt();

            state._fsp--;

            adaptor.addChild(root_0, conditionEt243.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:280:15: ( OR conditionEt )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==OR) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:280:16: OR conditionEt
            	    {
            	    OR244=(Token)match(input,OR,FOLLOW_OR_in_conditionOu2163); 
            	    OR244_tree = (CommonTree)adaptor.create(OR244);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR244_tree, root_0);

            	    pushFollow(FOLLOW_conditionEt_in_conditionOu2166);
            	    conditionEt245=conditionEt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditionEt245.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // $ANTLR end "conditionOu"

    public static class conditionEt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionEt"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:283:1: conditionEt : cond ( AND cond )* ;
    public final hightParser.conditionEt_return conditionEt() throws RecognitionException {
        hightParser.conditionEt_return retval = new hightParser.conditionEt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND247=null;
        hightParser.cond_return cond246 = null;

        hightParser.cond_return cond248 = null;


        CommonTree AND247_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:283:13: ( cond ( AND cond )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:284:3: cond ( AND cond )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cond_in_conditionEt2181);
            cond246=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond246.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:284:8: ( AND cond )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==AND) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:284:9: AND cond
            	    {
            	    AND247=(Token)match(input,AND,FOLLOW_AND_in_conditionEt2184); 
            	    AND247_tree = (CommonTree)adaptor.create(AND247);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND247_tree, root_0);

            	    pushFollow(FOLLOW_cond_in_conditionEt2187);
            	    cond248=cond();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cond248.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // $ANTLR end "conditionEt"

    public static class cond_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cond"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:287:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD );
    public final hightParser.cond_return cond() throws RecognitionException {
        hightParser.cond_return retval = new hightParser.cond_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMP250=null;
        Token EQUALS252=null;
        Token INF253=null;
        Token SUP254=null;
        Token INFEG255=null;
        Token SUPED256=null;
        Token DIFF257=null;
        Token PG259=null;
        Token PD261=null;
        hightParser.etat_return etat249 = null;

        hightParser.operation_return operation251 = null;

        hightParser.operation_return operation258 = null;

        hightParser.conditions_return conditions260 = null;


        CommonTree COMP250_tree=null;
        CommonTree EQUALS252_tree=null;
        CommonTree INF253_tree=null;
        CommonTree SUP254_tree=null;
        CommonTree INFEG255_tree=null;
        CommonTree SUPED256_tree=null;
        CommonTree DIFF257_tree=null;
        CommonTree PG259_tree=null;
        CommonTree PD261_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:287:6: ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD )
            int alt76=3;
            switch ( input.LA(1) ) {
            case GAME:
            case IDENT:
            case CAMERA:
            case MEDIA:
            case PLAYER:
            case ALLY:
            case ENEMY:
            case NEUTRAL:
            case VICTORY_KW:
            case DEFEAT_KW:
            case ALL:
            case NUM:
            case COUNTER:
            case TIME:
                {
                alt76=1;
                }
                break;
            case PG:
                {
                int LA76_2 = input.LA(2);

                if ( (LA76_2==NOT) ) {
                    switch ( input.LA(3) ) {
                    case CAMERA:
                    case MEDIA:
                    case COUNTER:
                    case TIME:
                        {
                        int LA76_6 = input.LA(4);

                        if ( (LA76_6==PD) ) {
                            alt76=1;
                        }
                        else if ( (LA76_6==IS) ) {
                            alt76=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ALLY:
                    case ENEMY:
                    case NEUTRAL:
                        {
                        int LA76_7 = input.LA(4);

                        if ( (LA76_7==PD) ) {
                            alt76=1;
                        }
                        else if ( (LA76_7==IS) ) {
                            alt76=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLAYER:
                        {
                        int LA76_8 = input.LA(4);

                        if ( (LA76_8==PD) ) {
                            alt76=1;
                        }
                        else if ( (LA76_8==IS) ) {
                            alt76=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GAME:
                    case IDENT:
                    case VICTORY_KW:
                    case DEFEAT_KW:
                    case COMP:
                    case PG:
                    case ALL:
                    case NUM:
                        {
                        alt76=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 4, input);

                        throw nvae;
                    }

                }
                else if ( (LA76_2==GAME||LA76_2==IDENT||LA76_2==CAMERA||LA76_2==MEDIA||(LA76_2>=PLAYER && LA76_2<=NEUTRAL)||(LA76_2>=VICTORY_KW && LA76_2<=DEFEAT_KW)||LA76_2==COMP||LA76_2==PG||(LA76_2>=ALL && LA76_2<=NUM)||(LA76_2>=COUNTER && LA76_2<=TIME)) ) {
                    alt76=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;
                }
                }
                break;
            case COMP:
                {
                alt76=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:288:3: etat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_etat_in_cond2202);
                    etat249=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, etat249.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:289:5: COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMP250=(Token)match(input,COMP,FOLLOW_COMP_in_cond2208); 
                    pushFollow(FOLLOW_operation_in_cond2211);
                    operation251=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation251.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:289:21: ( EQUALS | INF | SUP | INFEG | SUPED | DIFF )
                    int alt75=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt75=1;
                        }
                        break;
                    case INF:
                        {
                        alt75=2;
                        }
                        break;
                    case SUP:
                        {
                        alt75=3;
                        }
                        break;
                    case INFEG:
                        {
                        alt75=4;
                        }
                        break;
                    case SUPED:
                        {
                        alt75=5;
                        }
                        break;
                    case DIFF:
                        {
                        alt75=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }

                    switch (alt75) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:289:22: EQUALS
                            {
                            EQUALS252=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond2214); 
                            EQUALS252_tree = (CommonTree)adaptor.create(EQUALS252);
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALS252_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:289:32: INF
                            {
                            INF253=(Token)match(input,INF,FOLLOW_INF_in_cond2219); 
                            INF253_tree = (CommonTree)adaptor.create(INF253);
                            root_0 = (CommonTree)adaptor.becomeRoot(INF253_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:289:39: SUP
                            {
                            SUP254=(Token)match(input,SUP,FOLLOW_SUP_in_cond2224); 
                            SUP254_tree = (CommonTree)adaptor.create(SUP254);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUP254_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:289:46: INFEG
                            {
                            INFEG255=(Token)match(input,INFEG,FOLLOW_INFEG_in_cond2229); 
                            INFEG255_tree = (CommonTree)adaptor.create(INFEG255);
                            root_0 = (CommonTree)adaptor.becomeRoot(INFEG255_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:289:55: SUPED
                            {
                            SUPED256=(Token)match(input,SUPED,FOLLOW_SUPED_in_cond2234); 
                            SUPED256_tree = (CommonTree)adaptor.create(SUPED256);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUPED256_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:289:64: DIFF
                            {
                            DIFF257=(Token)match(input,DIFF,FOLLOW_DIFF_in_cond2239); 
                            DIFF257_tree = (CommonTree)adaptor.create(DIFF257);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIFF257_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_cond2243);
                    operation258=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation258.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:290:5: PG conditions PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG259=(Token)match(input,PG,FOLLOW_PG_in_cond2260); 
                    PG259_tree = (CommonTree)adaptor.create(PG259);
                    adaptor.addChild(root_0, PG259_tree);

                    pushFollow(FOLLOW_conditions_in_cond2262);
                    conditions260=conditions();

                    state._fsp--;

                    adaptor.addChild(root_0, conditions260.getTree());
                    PD261=(Token)match(input,PD,FOLLOW_PD_in_cond2264); 
                    PD261_tree = (CommonTree)adaptor.create(PD261);
                    adaptor.addChild(root_0, PD261_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:293:1: etat : ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW );
    public final hightParser.etat_return etat() throws RecognitionException {
        hightParser.etat_return retval = new hightParser.etat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS263=null;
        Token NOT264=null;
        Token DEAD_KW265=null;
        Token ALIVE_KW266=null;
        Token EFFACED_KW267=null;
        Token GENERATED_KW268=null;
        Token TOUCHING_KW269=null;
        Token OTHER270=null;
        Token MOVING_KW273=null;
        Token WAITING_KW274=null;
        Token set275=null;
        Token IS276=null;
        Token NOT277=null;
        Token FINISHED_KW278=null;
        Token STARTED_KW279=null;
        Token PAUSED_KW280=null;
        Token MUTED_KW281=null;
        Token set282=null;
        Token PLAYED_KW283=null;
        Token STOPPED_KW284=null;
        Token VICTORY_KW285=null;
        Token DEFEAT_KW286=null;
        hightParser.accesClasse_return accesClasse262 = null;

        hightParser.accesGlobal_return accesGlobal271 = null;

        hightParser.accesLocal_return accesLocal272 = null;


        CommonTree IS263_tree=null;
        CommonTree NOT264_tree=null;
        CommonTree DEAD_KW265_tree=null;
        CommonTree ALIVE_KW266_tree=null;
        CommonTree EFFACED_KW267_tree=null;
        CommonTree GENERATED_KW268_tree=null;
        CommonTree TOUCHING_KW269_tree=null;
        CommonTree OTHER270_tree=null;
        CommonTree MOVING_KW273_tree=null;
        CommonTree WAITING_KW274_tree=null;
        CommonTree set275_tree=null;
        CommonTree IS276_tree=null;
        CommonTree NOT277_tree=null;
        CommonTree FINISHED_KW278_tree=null;
        CommonTree STARTED_KW279_tree=null;
        CommonTree PAUSED_KW280_tree=null;
        CommonTree MUTED_KW281_tree=null;
        CommonTree set282_tree=null;
        CommonTree PLAYED_KW283_tree=null;
        CommonTree STOPPED_KW284_tree=null;
        CommonTree VICTORY_KW285_tree=null;
        CommonTree DEFEAT_KW286_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:293:6: ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW )
            int alt83=4;
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
                {
                alt83=1;
                }
                break;
            case IDENT:
                {
                int LA83_2 = input.LA(2);

                if ( (LA83_2==IS) ) {
                    switch ( input.LA(3) ) {
                    case NOT:
                        {
                        int LA83_7 = input.LA(4);

                        if ( ((LA83_7>=FINISHED_KW && LA83_7<=STOPPED_KW)) ) {
                            alt83=2;
                        }
                        else if ( ((LA83_7>=DEAD_KW && LA83_7<=WAITING_KW)) ) {
                            alt83=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 83, 7, input);

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
                        alt83=2;
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
                        alt83=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 6, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt83=2;
                }
                break;
            case VICTORY_KW:
                {
                alt83=3;
                }
                break;
            case DEFEAT_KW:
                {
                alt83=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:3: accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_etat2278);
                    accesClasse262=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse262.getTree());
                    IS263=(Token)match(input,IS,FOLLOW_IS_in_etat2280); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:19: ( NOT )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NOT) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:20: NOT
                            {
                            NOT264=(Token)match(input,NOT,FOLLOW_NOT_in_etat2284); 
                            NOT264_tree = (CommonTree)adaptor.create(NOT264);
                            adaptor.addChild(root_0, NOT264_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:26: ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
                    int alt80=7;
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
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }

                    switch (alt80) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:27: DEAD_KW
                            {
                            DEAD_KW265=(Token)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2289); 
                            DEAD_KW265_tree = (CommonTree)adaptor.create(DEAD_KW265);
                            root_0 = (CommonTree)adaptor.becomeRoot(DEAD_KW265_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:38: ALIVE_KW
                            {
                            ALIVE_KW266=(Token)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2294); 
                            ALIVE_KW266_tree = (CommonTree)adaptor.create(ALIVE_KW266);
                            root_0 = (CommonTree)adaptor.becomeRoot(ALIVE_KW266_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:50: EFFACED_KW
                            {
                            EFFACED_KW267=(Token)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2299); 
                            EFFACED_KW267_tree = (CommonTree)adaptor.create(EFFACED_KW267);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACED_KW267_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:64: GENERATED_KW
                            {
                            GENERATED_KW268=(Token)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2304); 
                            GENERATED_KW268_tree = (CommonTree)adaptor.create(GENERATED_KW268);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATED_KW268_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:80: TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal )
                            {
                            TOUCHING_KW269=(Token)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2309); 
                            TOUCHING_KW269_tree = (CommonTree)adaptor.create(TOUCHING_KW269);
                            root_0 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW269_tree, root_0);

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:93: ( ( OTHER )? accesGlobal | accesLocal )
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==CAMERA||LA79_0==MEDIA||(LA79_0>=ALLY && LA79_0<=NEUTRAL)||LA79_0==OTHER||LA79_0==PG||(LA79_0>=COUNTER && LA79_0<=TIME)) ) {
                                alt79=1;
                            }
                            else if ( (LA79_0==IDENT||LA79_0==PLAYER||LA79_0==NUM) ) {
                                alt79=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 79, 0, input);

                                throw nvae;
                            }
                            switch (alt79) {
                                case 1 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:94: ( OTHER )? accesGlobal
                                    {
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:94: ( OTHER )?
                                    int alt78=2;
                                    int LA78_0 = input.LA(1);

                                    if ( (LA78_0==OTHER) ) {
                                        alt78=1;
                                    }
                                    switch (alt78) {
                                        case 1 :
                                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:95: OTHER
                                            {
                                            OTHER270=(Token)match(input,OTHER,FOLLOW_OTHER_in_etat2314); 
                                            OTHER270_tree = (CommonTree)adaptor.create(OTHER270);
                                            adaptor.addChild(root_0, OTHER270_tree);


                                            }
                                            break;

                                    }

                                    pushFollow(FOLLOW_accesGlobal_in_etat2318);
                                    accesGlobal271=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal271.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:117: accesLocal
                                    {
                                    pushFollow(FOLLOW_accesLocal_in_etat2322);
                                    accesLocal272=accesLocal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesLocal272.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:131: MOVING_KW
                            {
                            MOVING_KW273=(Token)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2327); 
                            MOVING_KW273_tree = (CommonTree)adaptor.create(MOVING_KW273);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOVING_KW273_tree, root_0);


                            }
                            break;
                        case 7 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:294:144: WAITING_KW
                            {
                            WAITING_KW274=(Token)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2332); 
                            WAITING_KW274_tree = (CommonTree)adaptor.create(WAITING_KW274);
                            root_0 = (CommonTree)adaptor.becomeRoot(WAITING_KW274_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:5: ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set275=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set275));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    IS276=(Token)match(input,IS,FOLLOW_IS_in_etat2350); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:24: ( NOT )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==NOT) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:25: NOT
                            {
                            NOT277=(Token)match(input,NOT,FOLLOW_NOT_in_etat2354); 
                            NOT277_tree = (CommonTree)adaptor.create(NOT277);
                            adaptor.addChild(root_0, NOT277_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:31: ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    int alt82=6;
                    switch ( input.LA(1) ) {
                    case FINISHED_KW:
                        {
                        alt82=1;
                        }
                        break;
                    case STARTED_KW:
                        {
                        alt82=2;
                        }
                        break;
                    case PAUSED_KW:
                        {
                        alt82=3;
                        }
                        break;
                    case MUTED_KW:
                        {
                        alt82=4;
                        }
                        break;
                    case PLAYED_KW:
                        {
                        alt82=5;
                        }
                        break;
                    case STOPPED_KW:
                        {
                        alt82=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }

                    switch (alt82) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:32: FINISHED_KW
                            {
                            FINISHED_KW278=(Token)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2359); 
                            FINISHED_KW278_tree = (CommonTree)adaptor.create(FINISHED_KW278);
                            root_0 = (CommonTree)adaptor.becomeRoot(FINISHED_KW278_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:46: STARTED_KW
                            {
                            STARTED_KW279=(Token)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2363); 
                            STARTED_KW279_tree = (CommonTree)adaptor.create(STARTED_KW279);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTED_KW279_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:60: PAUSED_KW
                            {
                            PAUSED_KW280=(Token)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2368); 
                            PAUSED_KW280_tree = (CommonTree)adaptor.create(PAUSED_KW280);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSED_KW280_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:73: MUTED_KW ( ON | OFF )
                            {
                            MUTED_KW281=(Token)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2373); 
                            MUTED_KW281_tree = (CommonTree)adaptor.create(MUTED_KW281);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTED_KW281_tree, root_0);

                            set282=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set282));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:96: PLAYED_KW
                            {
                            PLAYED_KW283=(Token)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2386); 
                            PLAYED_KW283_tree = (CommonTree)adaptor.create(PLAYED_KW283);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAYED_KW283_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:295:109: STOPPED_KW
                            {
                            STOPPED_KW284=(Token)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2391); 
                            STOPPED_KW284_tree = (CommonTree)adaptor.create(STOPPED_KW284);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOPPED_KW284_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:297:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW285=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2405); 
                    VICTORY_KW285_tree = (CommonTree)adaptor.create(VICTORY_KW285);
                    adaptor.addChild(root_0, VICTORY_KW285_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:298:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW286=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2411); 
                    DEFEAT_KW286_tree = (CommonTree)adaptor.create(DEFEAT_KW286);
                    adaptor.addChild(root_0, DEFEAT_KW286_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:301:1: affectation : ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable );
    public final hightParser.affectation_return affectation() throws RecognitionException {
        hightParser.affectation_return retval = new hightParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN_KW287=null;
        Token ADD_KW288=null;
        Token SUB_KW289=null;
        Token FOR291=null;
        Token INVERT_KW293=null;
        Token WITH295=null;
        hightParser.operation_return operation290 = null;

        hightParser.variable_return variable292 = null;

        hightParser.variable_return variable294 = null;

        hightParser.variable_return variable296 = null;


        CommonTree ASSIGN_KW287_tree=null;
        CommonTree ADD_KW288_tree=null;
        CommonTree SUB_KW289_tree=null;
        CommonTree FOR291_tree=null;
        CommonTree INVERT_KW293_tree=null;
        CommonTree WITH295_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:301:13: ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=ASSIGN_KW && LA85_0<=SUB_KW)) ) {
                alt85=1;
            }
            else if ( (LA85_0==INVERT_KW) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:302:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:302:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation )
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:302:4: ( ASSIGN_KW | ADD_KW | SUB_KW ) operation
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:302:4: ( ASSIGN_KW | ADD_KW | SUB_KW )
                    int alt84=3;
                    switch ( input.LA(1) ) {
                    case ASSIGN_KW:
                        {
                        alt84=1;
                        }
                        break;
                    case ADD_KW:
                        {
                        alt84=2;
                        }
                        break;
                    case SUB_KW:
                        {
                        alt84=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }

                    switch (alt84) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:302:5: ASSIGN_KW
                            {
                            ASSIGN_KW287=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2428); 
                            ASSIGN_KW287_tree = (CommonTree)adaptor.create(ASSIGN_KW287);
                            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW287_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:302:18: ADD_KW
                            {
                            ADD_KW288=(Token)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2433); 
                            ADD_KW288_tree = (CommonTree)adaptor.create(ADD_KW288);
                            root_0 = (CommonTree)adaptor.becomeRoot(ADD_KW288_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:302:28: SUB_KW
                            {
                            SUB_KW289=(Token)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2438); 
                            SUB_KW289_tree = (CommonTree)adaptor.create(SUB_KW289);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUB_KW289_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_affectation2442);
                    operation290=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation290.getTree());

                    }

                    FOR291=(Token)match(input,FOR,FOLLOW_FOR_in_affectation2445); 
                    pushFollow(FOLLOW_variable_in_affectation2448);
                    variable292=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable292.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:303:5: INVERT_KW variable WITH variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INVERT_KW293=(Token)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2455); 
                    INVERT_KW293_tree = (CommonTree)adaptor.create(INVERT_KW293);
                    root_0 = (CommonTree)adaptor.becomeRoot(INVERT_KW293_tree, root_0);

                    pushFollow(FOLLOW_variable_in_affectation2458);
                    variable294=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable294.getTree());
                    WITH295=(Token)match(input,WITH,FOLLOW_WITH_in_affectation2460); 
                    pushFollow(FOLLOW_variable_in_affectation2463);
                    variable296=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable296.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:306:1: iaBasique : IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* ;
    public final hightParser.iaBasique_return iaBasique() throws RecognitionException {
        hightParser.iaBasique_return retval = new hightParser.iaBasique_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IA_KW297=null;
        Token IS299=null;
        Token VIRG301=null;
        hightParser.accesClasse_return accesClasse298 = null;

        hightParser.actionObjet_return actionObjet300 = null;

        hightParser.actionObjet_return actionObjet302 = null;


        CommonTree IA_KW297_tree=null;
        CommonTree IS299_tree=null;
        CommonTree VIRG301_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:306:11: ( IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:306:13: IA_KW accesClasse IS actionObjet ( VIRG actionObjet )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IA_KW297=(Token)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2476); 
            IA_KW297_tree = (CommonTree)adaptor.create(IA_KW297);
            root_0 = (CommonTree)adaptor.becomeRoot(IA_KW297_tree, root_0);

            pushFollow(FOLLOW_accesClasse_in_iaBasique2479);
            accesClasse298=accesClasse();

            state._fsp--;

            adaptor.addChild(root_0, accesClasse298.getTree());
            IS299=(Token)match(input,IS,FOLLOW_IS_in_iaBasique2481); 
            pushFollow(FOLLOW_actionObjet_in_iaBasique2484);
            actionObjet300=actionObjet();

            state._fsp--;

            adaptor.addChild(root_0, actionObjet300.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:306:48: ( VIRG actionObjet )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==VIRG) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:306:49: VIRG actionObjet
            	    {
            	    VIRG301=(Token)match(input,VIRG,FOLLOW_VIRG_in_iaBasique2487); 
            	    pushFollow(FOLLOW_actionObjet_in_iaBasique2490);
            	    actionObjet302=actionObjet();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionObjet302.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:310:1: operation : ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus );
    public final hightParser.operation_return operation() throws RecognitionException {
        hightParser.operation_return retval = new hightParser.operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RANDOM_KW304=null;
        Token BETWEEN305=null;
        Token AND307=null;
        hightParser.operationPlus_return operationPlus303 = null;

        hightParser.operationPlus_return operationPlus306 = null;

        hightParser.operationPlus_return operationPlus308 = null;


        CommonTree RANDOM_KW304_tree=null;
        CommonTree BETWEEN305_tree=null;
        CommonTree AND307_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:310:11: ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=FLOAT && LA87_0<=SCORE)||LA87_0==IDENT||LA87_0==PG||(LA87_0>=X && LA87_0<=VALUE)) ) {
                alt87=1;
            }
            else if ( (LA87_0==RANDOM_KW) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:311:2: operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operationPlus_in_operation2504);
                    operationPlus303=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus303.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:312:4: RANDOM_KW BETWEEN operationPlus AND operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RANDOM_KW304=(Token)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2509); 
                    RANDOM_KW304_tree = (CommonTree)adaptor.create(RANDOM_KW304);
                    root_0 = (CommonTree)adaptor.becomeRoot(RANDOM_KW304_tree, root_0);

                    BETWEEN305=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operation2512); 
                    pushFollow(FOLLOW_operationPlus_in_operation2515);
                    operationPlus306=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus306.getTree());
                    AND307=(Token)match(input,AND,FOLLOW_AND_in_operation2517); 
                    pushFollow(FOLLOW_operationPlus_in_operation2520);
                    operationPlus308=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus308.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:315:1: operationPlus : operationMul ( ( PLUS | MINUS ) operationMul )* ;
    public final hightParser.operationPlus_return operationPlus() throws RecognitionException {
        hightParser.operationPlus_return retval = new hightParser.operationPlus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS310=null;
        Token MINUS311=null;
        hightParser.operationMul_return operationMul309 = null;

        hightParser.operationMul_return operationMul312 = null;


        CommonTree PLUS310_tree=null;
        CommonTree MINUS311_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:315:15: ( operationMul ( ( PLUS | MINUS ) operationMul )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:316:2: operationMul ( ( PLUS | MINUS ) operationMul )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationMul_in_operationPlus2532);
            operationMul309=operationMul();

            state._fsp--;

            adaptor.addChild(root_0, operationMul309.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:316:15: ( ( PLUS | MINUS ) operationMul )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=PLUS && LA89_0<=MINUS)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:316:16: ( PLUS | MINUS ) operationMul
            	    {
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:316:16: ( PLUS | MINUS )
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==PLUS) ) {
            	        alt88=1;
            	    }
            	    else if ( (LA88_0==MINUS) ) {
            	        alt88=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 88, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:316:17: PLUS
            	            {
            	            PLUS310=(Token)match(input,PLUS,FOLLOW_PLUS_in_operationPlus2536); 
            	            PLUS310_tree = (CommonTree)adaptor.create(PLUS310);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS310_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:316:25: MINUS
            	            {
            	            MINUS311=(Token)match(input,MINUS,FOLLOW_MINUS_in_operationPlus2541); 
            	            MINUS311_tree = (CommonTree)adaptor.create(MINUS311);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS311_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_operationMul_in_operationPlus2545);
            	    operationMul312=operationMul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operationMul312.getTree());

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
    // $ANTLR end "operationPlus"

    public static class operationMul_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationMul"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:319:1: operationMul : operationPow ( ( MUL | DIV | MOD ) operationPow )? ;
    public final hightParser.operationMul_return operationMul() throws RecognitionException {
        hightParser.operationMul_return retval = new hightParser.operationMul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL314=null;
        Token DIV315=null;
        Token MOD316=null;
        hightParser.operationPow_return operationPow313 = null;

        hightParser.operationPow_return operationPow317 = null;


        CommonTree MUL314_tree=null;
        CommonTree DIV315_tree=null;
        CommonTree MOD316_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:319:14: ( operationPow ( ( MUL | DIV | MOD ) operationPow )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:320:2: operationPow ( ( MUL | DIV | MOD ) operationPow )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationPow_in_operationMul2558);
            operationPow313=operationPow();

            state._fsp--;

            adaptor.addChild(root_0, operationPow313.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:320:15: ( ( MUL | DIV | MOD ) operationPow )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=MUL && LA91_0<=MOD)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:320:16: ( MUL | DIV | MOD ) operationPow
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:320:16: ( MUL | DIV | MOD )
                    int alt90=3;
                    switch ( input.LA(1) ) {
                    case MUL:
                        {
                        alt90=1;
                        }
                        break;
                    case DIV:
                        {
                        alt90=2;
                        }
                        break;
                    case MOD:
                        {
                        alt90=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        throw nvae;
                    }

                    switch (alt90) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:320:17: MUL
                            {
                            MUL314=(Token)match(input,MUL,FOLLOW_MUL_in_operationMul2562); 
                            MUL314_tree = (CommonTree)adaptor.create(MUL314);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUL314_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:320:24: DIV
                            {
                            DIV315=(Token)match(input,DIV,FOLLOW_DIV_in_operationMul2567); 
                            DIV315_tree = (CommonTree)adaptor.create(DIV315);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIV315_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:320:31: MOD
                            {
                            MOD316=(Token)match(input,MOD,FOLLOW_MOD_in_operationMul2572); 
                            MOD316_tree = (CommonTree)adaptor.create(MOD316);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOD316_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operationPow_in_operationMul2576);
                    operationPow317=operationPow();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPow317.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:323:1: operationPow : operationBracket ( POW operationBracket )? ;
    public final hightParser.operationPow_return operationPow() throws RecognitionException {
        hightParser.operationPow_return retval = new hightParser.operationPow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POW319=null;
        hightParser.operationBracket_return operationBracket318 = null;

        hightParser.operationBracket_return operationBracket320 = null;


        CommonTree POW319_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:323:14: ( operationBracket ( POW operationBracket )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:324:2: operationBracket ( POW operationBracket )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationBracket_in_operationPow2591);
            operationBracket318=operationBracket();

            state._fsp--;

            adaptor.addChild(root_0, operationBracket318.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:324:19: ( POW operationBracket )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==POW) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:324:20: POW operationBracket
                    {
                    POW319=(Token)match(input,POW,FOLLOW_POW_in_operationPow2594); 
                    POW319_tree = (CommonTree)adaptor.create(POW319);
                    root_0 = (CommonTree)adaptor.becomeRoot(POW319_tree, root_0);

                    pushFollow(FOLLOW_operationBracket_in_operationPow2597);
                    operationBracket320=operationBracket();

                    state._fsp--;

                    adaptor.addChild(root_0, operationBracket320.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:327:1: operationBracket : ( PG operation PD | variable | FLOAT );
    public final hightParser.operationBracket_return operationBracket() throws RecognitionException {
        hightParser.operationBracket_return retval = new hightParser.operationBracket_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG321=null;
        Token PD323=null;
        Token FLOAT325=null;
        hightParser.operation_return operation322 = null;

        hightParser.variable_return variable324 = null;


        CommonTree PG321_tree=null;
        CommonTree PD323_tree=null;
        CommonTree FLOAT325_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:327:18: ( PG operation PD | variable | FLOAT )
            int alt93=3;
            switch ( input.LA(1) ) {
            case PG:
                {
                alt93=1;
                }
                break;
            case SCORE:
            case IDENT:
            case X:
            case Y:
            case Z:
            case VALUE:
                {
                alt93=2;
                }
                break;
            case FLOAT:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:328:2: PG operation PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG321=(Token)match(input,PG,FOLLOW_PG_in_operationBracket2612); 
                    pushFollow(FOLLOW_operation_in_operationBracket2615);
                    operation322=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation322.getTree());
                    PD323=(Token)match(input,PD,FOLLOW_PD_in_operationBracket2617); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:329:4: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operationBracket2623);
                    variable324=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable324.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:330:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT325=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operationBracket2628); 
                    FLOAT325_tree = (CommonTree)adaptor.create(FLOAT325);
                    adaptor.addChild(root_0, FLOAT325_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:333:1: variable : ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) );
    public final hightParser.variable_return variable() throws RecognitionException {
        hightParser.variable_return retval = new hightParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token X326=null;
        Token Y327=null;
        Token Z328=null;
        Token OF329=null;
        Token OF331=null;
        Token IDENT333=null;
        Token OF334=null;
        Token SCORE336=null;
        Token OF337=null;
        Token GAME338=null;
        Token VALUE339=null;
        Token OF340=null;
        Token OF342=null;
        hightParser.typeCoordonnees_return typeCoordonnees330 = null;

        hightParser.accesLocal_return accesLocal332 = null;

        hightParser.accesLocal_return accesLocal335 = null;

        hightParser.attributTps_return attributTps341 = null;

        hightParser.accesLocal_return accesLocal343 = null;


        CommonTree X326_tree=null;
        CommonTree Y327_tree=null;
        CommonTree Z328_tree=null;
        CommonTree OF329_tree=null;
        CommonTree OF331_tree=null;
        CommonTree IDENT333_tree=null;
        CommonTree OF334_tree=null;
        CommonTree SCORE336_tree=null;
        CommonTree OF337_tree=null;
        CommonTree GAME338_tree=null;
        CommonTree VALUE339_tree=null;
        CommonTree OF340_tree=null;
        CommonTree OF342_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_accesLocal=new RewriteRuleSubtreeStream(adaptor,"rule accesLocal");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:333:10: ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) )
            int alt95=4;
            switch ( input.LA(1) ) {
            case X:
            case Y:
            case Z:
                {
                alt95=1;
                }
                break;
            case IDENT:
                {
                alt95=2;
                }
                break;
            case SCORE:
                {
                alt95=3;
                }
                break;
            case VALUE:
                {
                alt95=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:334:3: ( X | Y | Z ) OF typeCoordonnees OF accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:334:3: ( X | Y | Z )
                    int alt94=3;
                    switch ( input.LA(1) ) {
                    case X:
                        {
                        alt94=1;
                        }
                        break;
                    case Y:
                        {
                        alt94=2;
                        }
                        break;
                    case Z:
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:334:4: X
                            {
                            X326=(Token)match(input,X,FOLLOW_X_in_variable2641); 
                            X326_tree = (CommonTree)adaptor.create(X326);
                            root_0 = (CommonTree)adaptor.becomeRoot(X326_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:334:9: Y
                            {
                            Y327=(Token)match(input,Y,FOLLOW_Y_in_variable2646); 
                            Y327_tree = (CommonTree)adaptor.create(Y327);
                            root_0 = (CommonTree)adaptor.becomeRoot(Y327_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:334:14: Z
                            {
                            Z328=(Token)match(input,Z,FOLLOW_Z_in_variable2651); 
                            Z328_tree = (CommonTree)adaptor.create(Z328);
                            root_0 = (CommonTree)adaptor.becomeRoot(Z328_tree, root_0);


                            }
                            break;

                    }

                    OF329=(Token)match(input,OF,FOLLOW_OF_in_variable2655); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2658);
                    typeCoordonnees330=typeCoordonnees();

                    state._fsp--;

                    adaptor.addChild(root_0, typeCoordonnees330.getTree());
                    OF331=(Token)match(input,OF,FOLLOW_OF_in_variable2660); 
                    pushFollow(FOLLOW_accesLocal_in_variable2663);
                    accesLocal332=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal332.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:335:5: IDENT OF accesLocal
                    {
                    IDENT333=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable2669);  
                    stream_IDENT.add(IDENT333);

                    OF334=(Token)match(input,OF,FOLLOW_OF_in_variable2671);  
                    stream_OF.add(OF334);

                    pushFollow(FOLLOW_accesLocal_in_variable2673);
                    accesLocal335=accesLocal();

                    state._fsp--;

                    stream_accesLocal.add(accesLocal335.getTree());


                    // AST REWRITE
                    // elements: IDENT, accesLocal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 336:5: -> ^( VAR_I_KW IDENT accesLocal )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:336:8: ^( VAR_I_KW IDENT accesLocal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_I_KW, "VAR_I_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_accesLocal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:337:5: SCORE OF GAME
                    {
                    SCORE336=(Token)match(input,SCORE,FOLLOW_SCORE_in_variable2693);  
                    stream_SCORE.add(SCORE336);

                    OF337=(Token)match(input,OF,FOLLOW_OF_in_variable2695);  
                    stream_OF.add(OF337);

                    GAME338=(Token)match(input,GAME,FOLLOW_GAME_in_variable2697);  
                    stream_GAME.add(GAME338);



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
                    // 338:5: -> GAME_SCORE_KW
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GAME_SCORE_KW, "GAME_SCORE_KW"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:339:5: VALUE OF attributTps OF accesLocal
                    {
                    VALUE339=(Token)match(input,VALUE,FOLLOW_VALUE_in_variable2711);  
                    stream_VALUE.add(VALUE339);

                    OF340=(Token)match(input,OF,FOLLOW_OF_in_variable2713);  
                    stream_OF.add(OF340);

                    pushFollow(FOLLOW_attributTps_in_variable2715);
                    attributTps341=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps341.getTree());
                    OF342=(Token)match(input,OF,FOLLOW_OF_in_variable2717);  
                    stream_OF.add(OF342);

                    pushFollow(FOLLOW_accesLocal_in_variable2719);
                    accesLocal343=accesLocal();

                    state._fsp--;

                    stream_accesLocal.add(accesLocal343.getTree());


                    // AST REWRITE
                    // elements: accesLocal, attributTps
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 340:5: -> ^( VALUE_KW attributTps accesLocal )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:340:8: ^( VALUE_KW attributTps accesLocal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE_KW, "VALUE_KW"), root_1);

                        adaptor.addChild(root_1, stream_attributTps.nextTree());
                        adaptor.addChild(root_1, stream_accesLocal.nextTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:343:1: accesClasse : ( ALL -> ^( ACCESS_KW ALL ) | accesLocal | accesGlobal );
    public final hightParser.accesClasse_return accesClasse() throws RecognitionException {
        hightParser.accesClasse_return retval = new hightParser.accesClasse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALL344=null;
        hightParser.accesLocal_return accesLocal345 = null;

        hightParser.accesGlobal_return accesGlobal346 = null;


        CommonTree ALL344_tree=null;
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:343:13: ( ALL -> ^( ACCESS_KW ALL ) | accesLocal | accesGlobal )
            int alt96=3;
            switch ( input.LA(1) ) {
            case ALL:
                {
                alt96=1;
                }
                break;
            case IDENT:
            case PLAYER:
            case NUM:
                {
                alt96=2;
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:344:3: ALL
                    {
                    ALL344=(Token)match(input,ALL,FOLLOW_ALL_in_accesClasse2747);  
                    stream_ALL.add(ALL344);



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
                    // 345:5: -> ^( ACCESS_KW ALL )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:345:8: ^( ACCESS_KW ALL )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:346:5: accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesLocal_in_accesClasse2765);
                    accesLocal345=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal345.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:347:5: accesGlobal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesGlobal_in_accesClasse2771);
                    accesGlobal346=accesGlobal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal346.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:350:1: accesGlobal : ( typeObjet -> ^( ACCESS_KW typeObjet ) | interaction -> ^( ACCESS_KW interaction ) | PG NOT notAccess PD -> ^( ACCESS_KW NOT notAccess ) );
    public final hightParser.accesGlobal_return accesGlobal() throws RecognitionException {
        hightParser.accesGlobal_return retval = new hightParser.accesGlobal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG349=null;
        Token NOT350=null;
        Token PD352=null;
        hightParser.typeObjet_return typeObjet347 = null;

        hightParser.interaction_return interaction348 = null;

        hightParser.notAccess_return notAccess351 = null;


        CommonTree PG349_tree=null;
        CommonTree NOT350_tree=null;
        CommonTree PD352_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_PD=new RewriteRuleTokenStream(adaptor,"token PD");
        RewriteRuleTokenStream stream_PG=new RewriteRuleTokenStream(adaptor,"token PG");
        RewriteRuleSubtreeStream stream_interaction=new RewriteRuleSubtreeStream(adaptor,"rule interaction");
        RewriteRuleSubtreeStream stream_typeObjet=new RewriteRuleSubtreeStream(adaptor,"rule typeObjet");
        RewriteRuleSubtreeStream stream_notAccess=new RewriteRuleSubtreeStream(adaptor,"rule notAccess");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:350:13: ( typeObjet -> ^( ACCESS_KW typeObjet ) | interaction -> ^( ACCESS_KW interaction ) | PG NOT notAccess PD -> ^( ACCESS_KW NOT notAccess ) )
            int alt97=3;
            switch ( input.LA(1) ) {
            case CAMERA:
            case MEDIA:
            case COUNTER:
            case TIME:
                {
                alt97=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
                {
                alt97=2;
                }
                break;
            case PG:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:351:3: typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_accesGlobal2784);
                    typeObjet347=typeObjet();

                    state._fsp--;

                    stream_typeObjet.add(typeObjet347.getTree());


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
                    // 352:5: -> ^( ACCESS_KW typeObjet )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:352:8: ^( ACCESS_KW typeObjet )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:353:5: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_accesGlobal2802);
                    interaction348=interaction();

                    state._fsp--;

                    stream_interaction.add(interaction348.getTree());


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
                    // 354:5: -> ^( ACCESS_KW interaction )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:354:8: ^( ACCESS_KW interaction )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:355:5: PG NOT notAccess PD
                    {
                    PG349=(Token)match(input,PG,FOLLOW_PG_in_accesGlobal2820);  
                    stream_PG.add(PG349);

                    NOT350=(Token)match(input,NOT,FOLLOW_NOT_in_accesGlobal2822);  
                    stream_NOT.add(NOT350);

                    pushFollow(FOLLOW_notAccess_in_accesGlobal2824);
                    notAccess351=notAccess();

                    state._fsp--;

                    stream_notAccess.add(notAccess351.getTree());
                    PD352=(Token)match(input,PD,FOLLOW_PD_in_accesGlobal2826);  
                    stream_PD.add(PD352);



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
                    // 356:5: -> ^( ACCESS_KW NOT notAccess )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:356:8: ^( ACCESS_KW NOT notAccess )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:359:1: notAccess : ( typeObjet | interaction | PLAYER );
    public final hightParser.notAccess_return notAccess() throws RecognitionException {
        hightParser.notAccess_return retval = new hightParser.notAccess_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER355=null;
        hightParser.typeObjet_return typeObjet353 = null;

        hightParser.interaction_return interaction354 = null;


        CommonTree PLAYER355_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:359:11: ( typeObjet | interaction | PLAYER )
            int alt98=3;
            switch ( input.LA(1) ) {
            case CAMERA:
            case MEDIA:
            case COUNTER:
            case TIME:
                {
                alt98=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
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
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:360:1: typeObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet_in_notAccess2851);
                    typeObjet353=typeObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet353.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:360:13: interaction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_interaction_in_notAccess2855);
                    interaction354=interaction();

                    state._fsp--;

                    adaptor.addChild(root_0, interaction354.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:360:27: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER355=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_notAccess2859); 
                    PLAYER355_tree = (CommonTree)adaptor.create(PLAYER355);
                    adaptor.addChild(root_0, PLAYER355_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:362:1: accesLocal : ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) );
    public final hightParser.accesLocal_return accesLocal() throws RecognitionException {
        hightParser.accesLocal_return retval = new hightParser.accesLocal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT356=null;
        Token NUM357=null;
        Token IN359=null;
        Token IDENT360=null;
        Token PLAYER361=null;
        hightParser.operation_return operation358 = null;


        CommonTree IDENT356_tree=null;
        CommonTree NUM357_tree=null;
        CommonTree IN359_tree=null;
        CommonTree IDENT360_tree=null;
        CommonTree PLAYER361_tree=null;
        RewriteRuleTokenStream stream_PLAYER=new RewriteRuleTokenStream(adaptor,"token PLAYER");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:362:12: ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt99=1;
                }
                break;
            case NUM:
                {
                alt99=2;
                }
                break;
            case PLAYER:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:363:3: IDENT
                    {
                    IDENT356=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2869);  
                    stream_IDENT.add(IDENT356);



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
                    // 364:5: -> ^( ACCESS_KW IDENT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:364:8: ^( ACCESS_KW IDENT )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:365:5: NUM operation IN IDENT
                    {
                    NUM357=(Token)match(input,NUM,FOLLOW_NUM_in_accesLocal2887);  
                    stream_NUM.add(NUM357);

                    pushFollow(FOLLOW_operation_in_accesLocal2889);
                    operation358=operation();

                    state._fsp--;

                    stream_operation.add(operation358.getTree());
                    IN359=(Token)match(input,IN,FOLLOW_IN_in_accesLocal2891);  
                    stream_IN.add(IN359);

                    IDENT360=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2893);  
                    stream_IDENT.add(IDENT360);



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
                    // 366:5: -> ^( ACCESS_KW IDENT operation )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:366:8: ^( ACCESS_KW IDENT operation )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:367:5: PLAYER
                    {
                    PLAYER361=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal2913);  
                    stream_PLAYER.add(PLAYER361);



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
                    // 368:5: -> ^( ACCESS_KW PLAYER )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:368:8: ^( ACCESS_KW PLAYER )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:371:1: typeCoordonnees : ( POSITION | ORIENTATION | SIZE );
    public final hightParser.typeCoordonnees_return typeCoordonnees() throws RecognitionException {
        hightParser.typeCoordonnees_return retval = new hightParser.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set362=null;

        CommonTree set362_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:371:17: ( POSITION | ORIENTATION | SIZE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set362=(Token)input.LT(1);
            if ( (input.LA(1)>=POSITION && input.LA(1)<=SIZE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set362));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:375:1: timeUnit : ( MIN | SEC | MS | FRAME );
    public final hightParser.timeUnit_return timeUnit() throws RecognitionException {
        hightParser.timeUnit_return retval = new hightParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set363=null;

        CommonTree set363_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:375:10: ( MIN | SEC | MS | FRAME )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set363=(Token)input.LT(1);
            if ( (input.LA(1)>=MIN && input.LA(1)<=FRAME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set363));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:383:1: typeObjet : ( CAMERA | MEDIA | COUNTER | TIME );
    public final hightParser.typeObjet_return typeObjet() throws RecognitionException {
        hightParser.typeObjet_return retval = new hightParser.typeObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set364=null;

        CommonTree set364_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:383:11: ( CAMERA | MEDIA | COUNTER | TIME )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set364=(Token)input.LT(1);
            if ( input.LA(1)==CAMERA||input.LA(1)==MEDIA||(input.LA(1)>=COUNTER && input.LA(1)<=TIME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set364));
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
    // $ANTLR end "typeObjet"

    public static class attributTps_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributTps"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:390:1: attributTps : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final hightParser.attributTps_return attributTps() throws RecognitionException {
        hightParser.attributTps_return retval = new hightParser.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set365=null;

        CommonTree set365_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:390:13: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set365=(Token)input.LT(1);
            if ( (input.LA(1)>=BOOST_INTERVAL && input.LA(1)<=RELOAD_TIME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set365));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:396:1: attributListeOuObjet : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final hightParser.attributListeOuObjet_return attributListeOuObjet() throws RecognitionException {
        hightParser.attributListeOuObjet_return retval = new hightParser.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set366=null;

        CommonTree set366_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:396:22: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set366=(Token)input.LT(1);
            if ( (input.LA(1)>=INVENTORY && input.LA(1)<=TYPES_TELEPORTABLES) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set366));
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


 

    public static final BitSet FOLLOW_gameData_in_game233 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game235 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_newType_in_game241 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game243 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_init_in_game249 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game251 = new BitSet(new long[]{0x023C483000000000L,0x0000000000200000L,0x000180C000000040L});
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
    public static final BitSet FOLLOW_IS_in_newType456 = new BitSet(new long[]{0x0000482000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_subType_in_newType458 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_AND_in_newType461 = new BitSet(new long[]{0x0000482000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_subType_in_newType463 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_IDENT_in_subType494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_init516 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_init518 = new BitSet(new long[]{0x0002492000000000L});
    public static final BitSet FOLLOW_declarationObjet_in_init520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_init538 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_init540 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0xFFFE070000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_allocationObject_in_init542 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_init545 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0xFFFE070000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_allocationObject_in_init547 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet576 = new BitSet(new long[]{0x007C000000000002L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet602 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_OF_in_declarationObjet605 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_declarationObjet608 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet613 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_WITH_in_declarationObjet617 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_declarationObjet620 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet625 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_CAMERA_in_declarationObjet654 = new BitSet(new long[]{0x0180200000000002L});
    public static final BitSet FOLLOW_view_in_declarationObjet657 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_declarationObjet688 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_declarationObjet724 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_entityMode772 = new BitSet(new long[]{0x007C000000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_interaction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject852 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AT_in_allocationObject855 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_valAggregation_in_allocationObject857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeCoordonnees_in_allocationObject887 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject889 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_coordinates_in_allocationObject891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_allocationObject922 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject924 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributTps_in_allocationObject958 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject960 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_allocationObject962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_allocationObject964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_typeAllocation1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeAllocation1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_typeAllocation1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_typeAllocation1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_valAggregation1028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1077 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_definition1080 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_MEANS_in_definition1082 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_definition1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1094 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_consequences1097 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequ_in_consequences1099 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_siAlors_in_consequ1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1173 = new BitSet(new long[]{0x8000000000000000L,0x00001CC000009010L});
    public static final BitSet FOLLOW_actionObjet_in_action1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action1180 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1201 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_action1209 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1219 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_STOP_KW_in_action1224 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1234 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_transformation_in_action1237 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_action1239 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesClasse_in_action1242 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_coordinates_in_action1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1250 = new BitSet(new long[]{0x0004002C00000000L,0x0000000000000000L,0x000000BC04000040L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1255 = new BitSet(new long[]{0x0004002C00000000L,0x0000000000000000L,0x000000BC04000040L});
    public static final BitSet FOLLOW_accesLocal_in_action1260 = new BitSet(new long[]{0x0002000200000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_action1264 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_IDENT_in_action1267 = new BitSet(new long[]{0x0002000200000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_action1271 = new BitSet(new long[]{0x0002000200000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_action1277 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ON_in_action1280 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_action1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_action1288 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_coordinates_in_action1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1298 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_action1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_action1305 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_action1308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ENDWAIT_in_action1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1343 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_actionObjet1346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1352 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1362 = new BitSet(new long[]{0x0004002000000000L,0x0000000000030000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_coordinates1414 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_coordinates1416 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_coordinates1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1447 = new BitSet(new long[]{0x0000002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_IDENT_in_commande1451 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_commande1453 = new BitSet(new long[]{0x0000002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1458 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_commande1461 = new BitSet(new long[]{0x0000002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1464 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_MOUSE_in_actionCommande1477 = new BitSet(new long[]{0x0000000000000000L,0x00000003FE000000L});
    public static final BitSet FOLLOW_souris_in_actionCommande1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande1481 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_actionCommande1501 = new BitSet(new long[]{0x0000000000000000L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande1505 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1652 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1681 = new BitSet(new long[]{0x0000000000000000L,0x0000030018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1703 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1739 = new BitSet(new long[]{0x0000000000000000L,0x0001800001400000L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1744 = new BitSet(new long[]{0x0000000000000000L,0x0001800001400000L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_in_typeCommand1770 = new BitSet(new long[]{0x0000000000000002L,0x00000003FE000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand1773 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand1776 = new BitSet(new long[]{0x0000000000000000L,0x00000003FE000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand1778 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEY_in_typeCommand1805 = new BitSet(new long[]{0x0000000000000000L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand1807 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand1810 = new BitSet(new long[]{0x0000000000000000L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand1812 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1847 = new BitSet(new long[]{0x183C483820000000L,0x0000000000000000L,0x000180FC00000040L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1851 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_reglesJeu1853 = new BitSet(new long[]{0x183C483820000000L,0x0000000000000000L,0x000180FC00000040L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_reglesJeu1861 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur1878 = new BitSet(new long[]{0x0000000000000000L,0x01B4000000001000L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declencheur1901 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declencheur1932 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1934 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1956 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1958 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2026 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2031 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2037 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurTK2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurTK2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2057 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2062 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_BY_in_declencheurKT2067 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2072 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurKT2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurKT2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2097 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditions_in_siAlors2100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_siAlors2102 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_siAlors2105 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_ELSE_in_siAlors2108 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_siAlors2111 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ENDIF_in_siAlors2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_conditions2130 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditionOu_in_conditions2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2160 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_OR_in_conditionOu2163 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2166 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_cond_in_conditionEt2181 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_AND_in_conditionEt2184 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_cond_in_conditionEt2187 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_etat_in_cond2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMP_in_cond2208 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_cond2211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_EQUALS_in_cond2214 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_INF_in_cond2219 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_SUP_in_cond2224 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_INFEG_in_cond2229 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_SUPED_in_cond2234 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_DIFF_in_cond2239 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_cond2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_cond2260 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditions_in_cond2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PD_in_cond2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_etat2278 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_etat2280 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_NOT_in_etat2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2309 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_OTHER_in_etat2314 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesGlobal_in_etat2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_etat2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_etat2342 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_etat2350 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x00000000001F8000L});
    public static final BitSet FOLLOW_NOT_in_etat2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000001F8000L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_etat2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2428 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2433 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2438 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_affectation2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FOR_in_affectation2445 = new BitSet(new long[]{0x0000002800000000L,0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2455 = new BitSet(new long[]{0x0000002800000000L,0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2458 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WITH_in_affectation2460 = new BitSet(new long[]{0x0000002800000000L,0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2476 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesClasse_in_iaBasique2479 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_iaBasique2481 = new BitSet(new long[]{0x8000000000000000L,0x00001CC000009010L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2484 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_iaBasique2487 = new BitSet(new long[]{0x8000000000000000L,0x00001CC000009010L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2490 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_operationPlus_in_operation2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operation2512 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationPlus_in_operation2515 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_AND_in_operation2517 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationPlus_in_operation2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_PLUS_in_operationPlus2536 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_MINUS_in_operationPlus2541 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_operationPow_in_operationMul2558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_MUL_in_operationMul2562 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_DIV_in_operationMul2567 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_MOD_in_operationMul2572 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationPow_in_operationMul2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_POW_in_operationPow2594 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_operationBracket2612 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_operationBracket2615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PD_in_operationBracket2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operationBracket2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operationBracket2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable2641 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Y_in_variable2646 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Z_in_variable2651 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2658 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2660 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_variable2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable2669 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2671 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_variable2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_variable2693 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2695 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GAME_in_variable2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_variable2711 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2713 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0xFFFE070000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_attributTps_in_variable2715 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2717 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_variable2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_accesClasse2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_accesClasse2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_accesGlobal2820 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_accesGlobal2822 = new BitSet(new long[]{0x003C480000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_notAccess_in_accesGlobal2824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PD_in_accesGlobal2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_notAccess2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_notAccess2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_notAccess2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal2887 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_accesLocal2889 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal2891 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeObjet0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}