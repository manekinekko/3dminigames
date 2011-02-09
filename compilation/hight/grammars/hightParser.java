// $ANTLR 3.3 Nov 30, 2010 12:50:56 H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g 2011-02-09 16:20:24

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
    public String getGrammarFileName() { return "H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g"; }


    public static class game_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "game"
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:44:1: game : ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )+ ( reglesJeu ( FIN )? )+ ( iaBasique ( FIN )? )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:44:6: ( ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )+ ( reglesJeu ( FIN )? )+ ( iaBasique ( FIN )? )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:45:2: ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition ( FIN )? )* ( commande ( FIN )? )+ ( reglesJeu ( FIN )? )+ ( iaBasique ( FIN )? )*
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:45:2: ( gameData FIN )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:45:3: gameData FIN
                    {
                    pushFollow(FOLLOW_gameData_in_game235);
                    gameData1=gameData();

                    state._fsp--;

                    stream_gameData.add(gameData1.getTree());
                    FIN2=(Token)match(input,FIN,FOLLOW_FIN_in_game237);  
                    stream_FIN.add(FIN2);


                    }
                    break;

            }

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:46:2: ( newType FIN )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:46:3: newType FIN
            	    {
            	    pushFollow(FOLLOW_newType_in_game243);
            	    newType3=newType();

            	    state._fsp--;

            	    stream_newType.add(newType3.getTree());
            	    FIN4=(Token)match(input,FIN,FOLLOW_FIN_in_game245);  
            	    stream_FIN.add(FIN4);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:47:2: ( init FIN )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:47:3: init FIN
            	    {
            	    pushFollow(FOLLOW_init_in_game251);
            	    init5=init();

            	    state._fsp--;

            	    stream_init.add(init5.getTree());
            	    FIN6=(Token)match(input,FIN,FOLLOW_FIN_in_game253);  
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

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:48:2: ( definition ( FIN )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DEFINITION_KW) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:48:3: definition ( FIN )?
            	    {
            	    pushFollow(FOLLOW_definition_in_game259);
            	    definition7=definition();

            	    state._fsp--;

            	    stream_definition.add(definition7.getTree());
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:48:14: ( FIN )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==FIN) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:48:15: FIN
            	            {
            	            FIN8=(Token)match(input,FIN,FOLLOW_FIN_in_game262);  
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

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:49:2: ( commande ( FIN )? )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:49:3: commande ( FIN )?
            	    {
            	    pushFollow(FOLLOW_commande_in_game270);
            	    commande9=commande();

            	    state._fsp--;

            	    stream_commande.add(commande9.getTree());
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:49:12: ( FIN )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==FIN) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:49:13: FIN
            	            {
            	            FIN10=(Token)match(input,FIN,FOLLOW_FIN_in_game273);  
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

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:50:2: ( reglesJeu ( FIN )? )+
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
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:50:3: reglesJeu ( FIN )?
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game281);
            	    reglesJeu11=reglesJeu();

            	    state._fsp--;

            	    stream_reglesJeu.add(reglesJeu11.getTree());
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:50:13: ( FIN )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==FIN) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:50:14: FIN
            	            {
            	            FIN12=(Token)match(input,FIN,FOLLOW_FIN_in_game284);  
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

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:51:2: ( iaBasique ( FIN )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IA_KW) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:51:3: iaBasique ( FIN )?
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game292);
            	    iaBasique13=iaBasique();

            	    state._fsp--;

            	    stream_iaBasique.add(iaBasique13.getTree());
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:51:13: ( FIN )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==FIN) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:51:14: FIN
            	            {
            	            FIN14=(Token)match(input,FIN,FOLLOW_FIN_in_game295);  
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
            // elements: init, gameData, commande, reglesJeu, definition, iaBasique, newType
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
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:52:7: ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME_KW, "GAME_KW"), root_1);

                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:52:17: ( gameData )?
                if ( stream_gameData.hasNext() ) {
                    adaptor.addChild(root_1, stream_gameData.nextTree());

                }
                stream_gameData.reset();
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:52:27: ( newType )*
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
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:52:42: ( definition )*
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
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:52:75: ( iaBasique )*
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:56:1: gameData : GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:56:10: ( GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:57:2: GAME HAS attributGame ( VIRG attributGame )*
            {
            GAME15=(Token)match(input,GAME,FOLLOW_GAME_in_gameData342);  
            stream_GAME.add(GAME15);

            HAS16=(Token)match(input,HAS,FOLLOW_HAS_in_gameData344);  
            stream_HAS.add(HAS16);

            pushFollow(FOLLOW_attributGame_in_gameData346);
            attributGame17=attributGame();

            state._fsp--;

            stream_attributGame.add(attributGame17.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:57:24: ( VIRG attributGame )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==VIRG) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:57:25: VIRG attributGame
            	    {
            	    VIRG18=(Token)match(input,VIRG,FOLLOW_VIRG_in_gameData349);  
            	    stream_VIRG.add(VIRG18);

            	    pushFollow(FOLLOW_attributGame_in_gameData351);
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
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:58:7: ^( GAME_ATTRIBUT_KW ( attributGame )+ )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:61:1: attributGame : ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | SCORE AT FLOAT -> ^( SCORE_KW FLOAT ) );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:61:14: ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | SCORE AT FLOAT -> ^( SCORE_KW FLOAT ) )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:62:2: GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
                    {
                    GRAVITY_KW20=(Token)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame376);  
                    stream_GRAVITY_KW.add(GRAVITY_KW20);

                    AT21=(Token)match(input,AT,FOLLOW_AT_in_attributGame378);  
                    stream_AT.add(AT21);

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:62:16: ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:62:17: FLOAT
                            {
                            FLOAT22=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame381);  
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
                                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:63:8: ^( GRAVITY_KW FLOAT )
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:64:5: FLOAT FLOAT FLOAT
                            {
                            FLOAT23=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame399);  
                            stream_FLOAT.add(FLOAT23);

                            FLOAT24=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame401);  
                            stream_FLOAT.add(FLOAT24);

                            FLOAT25=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame403);  
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
                                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:65:8: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:66:4: SCORE AT FLOAT
                    {
                    SCORE26=(Token)match(input,SCORE,FOLLOW_SCORE_in_attributGame426);  
                    stream_SCORE.add(SCORE26);

                    AT27=(Token)match(input,AT,FOLLOW_AT_in_attributGame428);  
                    stream_AT.add(AT27);

                    FLOAT28=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame430);  
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
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:67:7: ^( SCORE_KW FLOAT )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:71:1: newType : TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:71:9: ( TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:72:2: TYPE IDENT IS subType ( AND subType )*
            {
            TYPE29=(Token)match(input,TYPE,FOLLOW_TYPE_in_newType454);  
            stream_TYPE.add(TYPE29);

            IDENT30=(Token)match(input,IDENT,FOLLOW_IDENT_in_newType456);  
            stream_IDENT.add(IDENT30);

            IS31=(Token)match(input,IS,FOLLOW_IS_in_newType458);  
            stream_IS.add(IS31);

            pushFollow(FOLLOW_subType_in_newType460);
            subType32=subType();

            state._fsp--;

            stream_subType.add(subType32.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:72:24: ( AND subType )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:72:25: AND subType
            	    {
            	    AND33=(Token)match(input,AND,FOLLOW_AND_in_newType463);  
            	    stream_AND.add(AND33);

            	    pushFollow(FOLLOW_subType_in_newType465);
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
            // elements: subType, IDENT, TYPE, subType
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
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:73:7: ^( TYPE IDENT subType ( subType )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_subType.nextTree());
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:73:28: ( subType )*
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:76:1: subType : ( IDENT | typeObjet );
    public final hightParser.subType_return subType() throws RecognitionException {
        hightParser.subType_return retval = new hightParser.subType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT35=null;
        hightParser.typeObjet_return typeObjet36 = null;


        CommonTree IDENT35_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:76:9: ( IDENT | typeObjet )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:77:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_subType496); 
                    IDENT35_tree = (CommonTree)adaptor.create(IDENT35);
                    adaptor.addChild(root_0, IDENT35_tree);


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:78:4: typeObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet_in_subType501);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:83:1: init : ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:83:6: ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:84:2: IDENT IS declarationObjet
                    {
                    IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_init518);  
                    stream_IDENT.add(IDENT37);

                    IS38=(Token)match(input,IS,FOLLOW_IS_in_init520);  
                    stream_IS.add(IS38);

                    pushFollow(FOLLOW_declarationObjet_in_init522);
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
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:85:7: ^( INIT_IS_KW IDENT declarationObjet )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:86:4: accesClasse HAS allocationObject ( VIRG allocationObject )*
                    {
                    pushFollow(FOLLOW_accesClasse_in_init540);
                    accesClasse40=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse40.getTree());
                    HAS41=(Token)match(input,HAS,FOLLOW_HAS_in_init542);  
                    stream_HAS.add(HAS41);

                    pushFollow(FOLLOW_allocationObject_in_init544);
                    allocationObject42=allocationObject();

                    state._fsp--;

                    stream_allocationObject.add(allocationObject42.getTree());
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:86:37: ( VIRG allocationObject )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==VIRG) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:86:38: VIRG allocationObject
                    	    {
                    	    VIRG43=(Token)match(input,VIRG,FOLLOW_VIRG_in_init547);  
                    	    stream_VIRG.add(VIRG43);

                    	    pushFollow(FOLLOW_allocationObject_in_init549);
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
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:87:7: ^( INIT_HAS_KW accesClasse ( allocationObject )+ )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:91:1: declarationObjet : ( typeEntity ( entityMode )? -> ^( DEC typeEntity ( entityMode )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:91:18: ( typeEntity ( entityMode )? -> ^( DEC typeEntity ( entityMode )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:92:2: typeEntity ( entityMode )?
                    {
                    pushFollow(FOLLOW_typeEntity_in_declarationObjet578);
                    typeEntity45=typeEntity();

                    state._fsp--;

                    stream_typeEntity.add(typeEntity45.getTree());
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:92:13: ( entityMode )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=PLAYER && LA19_0<=DUPLICABLE)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:92:13: entityMode
                            {
                            pushFollow(FOLLOW_entityMode_in_declarationObjet580);
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
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:93:7: ^( DEC typeEntity ( entityMode )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);

                        adaptor.addChild(root_1, stream_typeEntity.nextTree());
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:93:24: ( entityMode )?
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:4: LIST_KW ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )?
                    {
                    LIST_KW47=(Token)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet604);  
                    stream_LIST_KW.add(LIST_KW47);

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:12: ( OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==OF) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:13: OF ( operation )? ( IDENT ) ( WITH ( operation )? ( IDENT ) )*
                            {
                            OF48=(Token)match(input,OF,FOLLOW_OF_in_declarationObjet607);  
                            stream_OF.add(OF48);

                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:16: ( operation )?
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
                                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:17: operation
                                    {
                                    pushFollow(FOLLOW_operation_in_declarationObjet610);
                                    operation49=operation();

                                    state._fsp--;

                                    stream_operation.add(operation49.getTree());

                                    }
                                    break;

                            }

                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:29: ( IDENT )
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:30: IDENT
                            {
                            IDENT50=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet615);  
                            stream_IDENT.add(IDENT50);


                            }

                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:37: ( WITH ( operation )? ( IDENT ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==WITH) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:38: WITH ( operation )? ( IDENT )
                            	    {
                            	    WITH51=(Token)match(input,WITH,FOLLOW_WITH_in_declarationObjet619);  
                            	    stream_WITH.add(WITH51);

                            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:43: ( operation )?
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
                            	            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:44: operation
                            	            {
                            	            pushFollow(FOLLOW_operation_in_declarationObjet622);
                            	            operation52=operation();

                            	            state._fsp--;

                            	            stream_operation.add(operation52.getTree());

                            	            }
                            	            break;

                            	    }

                            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:56: ( IDENT )
                            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:94:57: IDENT
                            	    {
                            	    IDENT53=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet627);  
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
                    // 95:4: -> ^( LIST_KW ( ( operation )? IDENT )+ )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:95:6: ^( LIST_KW ( ( operation )? IDENT )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LIST_KW.nextNode(), root_1);

                        if ( !(stream_IDENT.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_IDENT.hasNext() ) {
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:95:17: ( operation )?
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:96:4: CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
                    {
                    CAMERA54=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_declarationObjet656);  
                    stream_CAMERA.add(CAMERA54);

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:96:11: ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:96:12: view PERSON
                            {
                            pushFollow(FOLLOW_view_in_declarationObjet659);
                            view55=view();

                            state._fsp--;

                            stream_view.add(view55.getTree());
                            PERSON56=(Token)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet661);  
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
                                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:96:27: ^( CAMERA_KW PERSON view )
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:96:54: FREE
                            {
                            FREE57=(Token)match(input,FREE,FOLLOW_FREE_in_declarationObjet675);  
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
                                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:96:62: ^( CAMERA_KW FREE )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:97:4: MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
                    {
                    MEDIA58=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_declarationObjet690);  
                    stream_MEDIA.add(MEDIA58);

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:97:10: ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:97:11: LOOP
                            {
                            LOOP59=(Token)match(input,LOOP,FOLLOW_LOOP_in_declarationObjet693);  
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
                                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:97:18: ^( MEDIA_KW LOOP )
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:97:37: ONCE
                            {
                            ONCE60=(Token)match(input,ONCE,FOLLOW_ONCE_in_declarationObjet704);  
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
                                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:97:44: ^( MEDIA_KW ONCE )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:98:4: IN IDENT
                    {
                    IN61=(Token)match(input,IN,FOLLOW_IN_in_declarationObjet726);  
                    stream_IN.add(IN61);

                    IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet728);  
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
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:98:16: ^( IN_KW IDENT )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:101:1: typeEntity : IDENT ;
    public final hightParser.typeEntity_return typeEntity() throws RecognitionException {
        hightParser.typeEntity_return retval = new hightParser.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT63=null;

        CommonTree IDENT63_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:101:12: ( IDENT )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:102:2: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT63=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeEntity759); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:105:1: entityMode : ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:105:11: ( PLAYER | interaction ( dupli )? -> ^( INTERACTION_KW interaction ( dupli )? ) | dupli )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:106:2: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER64=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_entityMode769); 
                    PLAYER64_tree = (CommonTree)adaptor.create(PLAYER64);
                    adaptor.addChild(root_0, PLAYER64_tree);


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:107:4: interaction ( dupli )?
                    {
                    pushFollow(FOLLOW_interaction_in_entityMode774);
                    interaction65=interaction();

                    state._fsp--;

                    stream_interaction.add(interaction65.getTree());
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:107:16: ( dupli )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==DUPLICABLE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:107:16: dupli
                            {
                            pushFollow(FOLLOW_dupli_in_entityMode776);
                            dupli66=dupli();

                            state._fsp--;

                            stream_dupli.add(dupli66.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: interaction, dupli
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
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:107:25: ^( INTERACTION_KW interaction ( dupli )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTERACTION_KW, "INTERACTION_KW"), root_1);

                        adaptor.addChild(root_1, stream_interaction.nextTree());
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:107:54: ( dupli )?
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:108:4: dupli
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dupli_in_entityMode792);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:111:1: interaction : ( ALLY | ENEMY | NEUTRAL );
    public final hightParser.interaction_return interaction() throws RecognitionException {
        hightParser.interaction_return retval = new hightParser.interaction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set68=null;

        CommonTree set68_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:111:13: ( ALLY | ENEMY | NEUTRAL )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:117:1: dupli : DUPLICABLE ;
    public final hightParser.dupli_return dupli() throws RecognitionException {
        hightParser.dupli_return retval = new hightParser.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DUPLICABLE69=null;

        CommonTree DUPLICABLE69_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:117:7: ( DUPLICABLE )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:118:2: DUPLICABLE
            {
            root_0 = (CommonTree)adaptor.nil();

            DUPLICABLE69=(Token)match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli825); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:121:1: view : ( FIRST | THIRD );
    public final hightParser.view_return view() throws RecognitionException {
        hightParser.view_return retval = new hightParser.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set70=null;

        CommonTree set70_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:121:6: ( FIRST | THIRD )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:126:1: allocationObject : ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:126:18: ( IDENT ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:127:2: IDENT ( AT valAggregation )?
                    {
                    IDENT71=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject854);  
                    stream_IDENT.add(IDENT71);

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:127:8: ( AT valAggregation )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==AT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:127:9: AT valAggregation
                            {
                            AT72=(Token)match(input,AT,FOLLOW_AT_in_allocationObject857);  
                            stream_AT.add(AT72);

                            pushFollow(FOLLOW_valAggregation_in_allocationObject859);
                            valAggregation73=valAggregation();

                            state._fsp--;

                            stream_valAggregation.add(valAggregation73.getTree());

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
                    // 128:4: -> ^( ALLOCATION_KW IDENT ( valAggregation )? )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:128:7: ^( ALLOCATION_KW IDENT ( valAggregation )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:128:30: ( valAggregation )?
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:129:4: typeCoordonnees AT coordinates
                    {
                    pushFollow(FOLLOW_typeCoordonnees_in_allocationObject889);
                    typeCoordonnees74=typeCoordonnees();

                    state._fsp--;

                    stream_typeCoordonnees.add(typeCoordonnees74.getTree());
                    AT75=(Token)match(input,AT,FOLLOW_AT_in_allocationObject891);  
                    stream_AT.add(AT75);

                    pushFollow(FOLLOW_coordinates_in_allocationObject893);
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
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:130:7: ^( ALLOCATION_KW typeCoordonnees coordinates )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:131:4: attributListeOuObjet AT IDENT
                    {
                    pushFollow(FOLLOW_attributListeOuObjet_in_allocationObject924);
                    attributListeOuObjet77=attributListeOuObjet();

                    state._fsp--;

                    stream_attributListeOuObjet.add(attributListeOuObjet77.getTree());
                    AT78=(Token)match(input,AT,FOLLOW_AT_in_allocationObject926);  
                    stream_AT.add(AT78);

                    IDENT79=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject928);  
                    stream_IDENT.add(IDENT79);



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
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:132:7: ^( ALLOCATION_KW attributListeOuObjet IDENT )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:133:4: attributTps AT operation timeUnit
                    {
                    pushFollow(FOLLOW_attributTps_in_allocationObject960);
                    attributTps80=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps80.getTree());
                    AT81=(Token)match(input,AT,FOLLOW_AT_in_allocationObject962);  
                    stream_AT.add(AT81);

                    pushFollow(FOLLOW_operation_in_allocationObject964);
                    operation82=operation();

                    state._fsp--;

                    stream_operation.add(operation82.getTree());
                    pushFollow(FOLLOW_timeUnit_in_allocationObject966);
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
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:134:7: ^( ALLOCATION_KW attributTps operation timeUnit )
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

    public static class valAggregation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valAggregation"
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:137:1: valAggregation : ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) | 'true' | 'false' );
    public final hightParser.valAggregation_return valAggregation() throws RecognitionException {
        hightParser.valAggregation_return retval = new hightParser.valAggregation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT86=null;
        Token string_literal87=null;
        Token string_literal88=null;
        hightParser.operation_return operation84 = null;

        hightParser.timeUnit_return timeUnit85 = null;


        CommonTree IDENT86_tree=null;
        CommonTree string_literal87_tree=null;
        CommonTree string_literal88_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:137:16: ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) | 'true' | 'false' )
            int alt32=4;
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
            case 195:
                {
                alt32=3;
                }
                break;
            case 196:
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:138:2: operation ( timeUnit )?
                    {
                    pushFollow(FOLLOW_operation_in_valAggregation1004);
                    operation84=operation();

                    state._fsp--;

                    stream_operation.add(operation84.getTree());
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:138:12: ( timeUnit )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=MIN && LA31_0<=FRAME)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:138:13: timeUnit
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1007);
                            timeUnit85=timeUnit();

                            state._fsp--;

                            stream_timeUnit.add(timeUnit85.getTree());

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
                    // 139:4: -> ^( AGGREGATION_KW operation ( timeUnit )? )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:139:7: ^( AGGREGATION_KW operation ( timeUnit )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_operation.nextTree());
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:139:34: ( timeUnit )?
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:140:4: IDENT
                    {
                    IDENT86=(Token)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1029);  
                    stream_IDENT.add(IDENT86);



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
                    // 141:4: -> ^( AGGREGATION_KW IDENT )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:141:7: ^( AGGREGATION_KW IDENT )
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
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:142:4: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal87=(Token)match(input,195,FOLLOW_195_in_valAggregation1045); 
                    string_literal87_tree = (CommonTree)adaptor.create(string_literal87);
                    adaptor.addChild(root_0, string_literal87_tree);


                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:143:4: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal88=(Token)match(input,196,FOLLOW_196_in_valAggregation1050); 
                    string_literal88_tree = (CommonTree)adaptor.create(string_literal88);
                    adaptor.addChild(root_0, string_literal88_tree);


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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:147:1: definition : DEFINITION_KW IDENT MEANS consequences ;
    public final hightParser.definition_return definition() throws RecognitionException {
        hightParser.definition_return retval = new hightParser.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINITION_KW89=null;
        Token IDENT90=null;
        Token MEANS91=null;
        hightParser.consequences_return consequences92 = null;


        CommonTree DEFINITION_KW89_tree=null;
        CommonTree IDENT90_tree=null;
        CommonTree MEANS91_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:147:12: ( DEFINITION_KW IDENT MEANS consequences )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:147:14: DEFINITION_KW IDENT MEANS consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFINITION_KW89=(Token)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1063); 
            DEFINITION_KW89_tree = (CommonTree)adaptor.create(DEFINITION_KW89);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW89_tree, root_0);

            IDENT90=(Token)match(input,IDENT,FOLLOW_IDENT_in_definition1066); 
            IDENT90_tree = (CommonTree)adaptor.create(IDENT90);
            adaptor.addChild(root_0, IDENT90_tree);

            MEANS91=(Token)match(input,MEANS,FOLLOW_MEANS_in_definition1068); 
            pushFollow(FOLLOW_consequences_in_definition1071);
            consequences92=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences92.getTree());

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:149:1: consequences : consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) ;
    public final hightParser.consequences_return consequences() throws RecognitionException {
        hightParser.consequences_return retval = new hightParser.consequences_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG94=null;
        hightParser.consequ_return consequ93 = null;

        hightParser.consequ_return consequ95 = null;


        CommonTree VIRG94_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_consequ=new RewriteRuleSubtreeStream(adaptor,"rule consequ");
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:149:14: ( consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:150:2: consequ ( VIRG consequ )*
            {
            pushFollow(FOLLOW_consequ_in_consequences1080);
            consequ93=consequ();

            state._fsp--;

            stream_consequ.add(consequ93.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:150:10: ( VIRG consequ )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==VIRG) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:150:11: VIRG consequ
            	    {
            	    VIRG94=(Token)match(input,VIRG,FOLLOW_VIRG_in_consequences1083);  
            	    stream_VIRG.add(VIRG94);

            	    pushFollow(FOLLOW_consequ_in_consequences1085);
            	    consequ95=consequ();

            	    state._fsp--;

            	    stream_consequ.add(consequ95.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
            // 151:4: -> ^( CONSEQUENCES_KW ( consequ )+ )
            {
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:151:6: ^( CONSEQUENCES_KW ( consequ )+ )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:154:1: consequ : ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW );
    public final hightParser.consequ_return consequ() throws RecognitionException {
        hightParser.consequ_return retval = new hightParser.consequ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT100=null;
        Token VICTORY_KW101=null;
        Token DEFEAT_KW102=null;
        hightParser.siAlors_return siAlors96 = null;

        hightParser.action_return action97 = null;

        hightParser.affectation_return affectation98 = null;

        hightParser.activCommande_return activCommande99 = null;


        CommonTree IDENT100_tree=null;
        CommonTree VICTORY_KW101_tree=null;
        CommonTree DEFEAT_KW102_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:154:9: ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW | DEFEAT_KW )
            int alt34=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt34=1;
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
                alt34=2;
                }
                break;
            case IDENT:
                {
                int LA34_3 = input.LA(2);

                if ( ((LA34_3>=ENDS_KW && LA34_3<=PAUSE_KW)||LA34_3==STOP_KW||LA34_3==DIES_KW||LA34_3==EQUIP||(LA34_3>=JUMP && LA34_3<=MOVE)||(LA34_3>=TURN && LA34_3<=BRAKE)) ) {
                    alt34=2;
                }
                else if ( (LA34_3==EOF||LA34_3==FIN||LA34_3==VIRG||LA34_3==DEFINITION_KW||LA34_3==ENDWAIT||LA34_3==COMMAND_KW||LA34_3==RULE_KW||(LA34_3>=ELSE && LA34_3<=ENDIF)||LA34_3==IA_KW) ) {
                    alt34=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;
                }
                }
                break;
            case ASSIGN_KW:
            case ADD_KW:
            case SUB_KW:
            case INVERT_KW:
                {
                alt34=3;
                }
                break;
            case ACTIVATE_KW:
            case DISABLE_KW:
                {
                alt34=4;
                }
                break;
            case VICTORY_KW:
                {
                alt34=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt34=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:155:3: siAlors
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_siAlors_in_consequ1111);
                    siAlors96=siAlors();

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors96.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:156:5: action
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_action_in_consequ1117);
                    action97=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action97.getTree());

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:157:5: affectation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_consequ1123);
                    affectation98=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation98.getTree());

                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:158:5: activCommande
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_activCommande_in_consequ1129);
                    activCommande99=activCommande();

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande99.getTree());

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:159:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT100=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1135); 
                    IDENT100_tree = (CommonTree)adaptor.create(IDENT100);
                    adaptor.addChild(root_0, IDENT100_tree);


                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:160:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW101=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1141); 
                    VICTORY_KW101_tree = (CommonTree)adaptor.create(VICTORY_KW101);
                    adaptor.addChild(root_0, VICTORY_KW101_tree);


                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:161:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW102=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1147); 
                    DEFEAT_KW102_tree = (CommonTree)adaptor.create(DEFEAT_KW102);
                    adaptor.addChild(root_0, DEFEAT_KW102_tree);


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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:164:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW );
    public final hightParser.action_return action() throws RecognitionException {
        hightParser.action_return retval = new hightParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set105=null;
        Token ENDS_KW106=null;
        Token STARTS_KW107=null;
        Token PAUSE_KW108=null;
        Token MUTE_KW109=null;
        Token set110=null;
        Token PLAY_KW111=null;
        Token STOP_KW112=null;
        Token IDENT113=null;
        Token BLOCK_KW114=null;
        Token OF116=null;
        Token EFFACE_KW119=null;
        Token GENERATE_KW120=null;
        Token IDENT123=null;
        Token IN125=null;
        Token ON126=null;
        Token AT128=null;
        Token WAIT_KW130=null;
        Token THEN133=null;
        Token ENDWAIT135=null;
        Token SAVE_KW136=null;
        hightParser.accesClasse_return accesClasse103 = null;

        hightParser.actionObjet_return actionObjet104 = null;

        hightParser.transformation_return transformation115 = null;

        hightParser.accesClasse_return accesClasse117 = null;

        hightParser.coordinates_return coordinates118 = null;

        hightParser.accesLocal_return accesLocal121 = null;

        hightParser.operation_return operation122 = null;

        hightParser.accesGlobal_return accesGlobal124 = null;

        hightParser.accesLocal_return accesLocal127 = null;

        hightParser.coordinates_return coordinates129 = null;

        hightParser.operation_return operation131 = null;

        hightParser.timeUnit_return timeUnit132 = null;

        hightParser.consequences_return consequences134 = null;


        CommonTree set105_tree=null;
        CommonTree ENDS_KW106_tree=null;
        CommonTree STARTS_KW107_tree=null;
        CommonTree PAUSE_KW108_tree=null;
        CommonTree MUTE_KW109_tree=null;
        CommonTree set110_tree=null;
        CommonTree PLAY_KW111_tree=null;
        CommonTree STOP_KW112_tree=null;
        CommonTree IDENT113_tree=null;
        CommonTree BLOCK_KW114_tree=null;
        CommonTree OF116_tree=null;
        CommonTree EFFACE_KW119_tree=null;
        CommonTree GENERATE_KW120_tree=null;
        CommonTree IDENT123_tree=null;
        CommonTree IN125_tree=null;
        CommonTree ON126_tree=null;
        CommonTree AT128_tree=null;
        CommonTree WAIT_KW130_tree=null;
        CommonTree THEN133_tree=null;
        CommonTree ENDWAIT135_tree=null;
        CommonTree SAVE_KW136_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:164:8: ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW )
            int alt42=7;
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
                alt42=1;
                }
                break;
            case IDENT:
                {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==PAUSE_KW||LA42_2==STOP_KW||LA42_2==DIES_KW||LA42_2==EQUIP||(LA42_2>=JUMP && LA42_2<=MOVE)||(LA42_2>=TURN && LA42_2<=BRAKE)) ) {
                    alt42=1;
                }
                else if ( ((LA42_2>=ENDS_KW && LA42_2<=STARTS_KW)) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt42=2;
                }
                break;
            case PAUSE_KW:
            case MUTE_KW:
            case PLAY_KW:
            case STOP_KW:
                {
                alt42=3;
                }
                break;
            case BLOCK_KW:
                {
                alt42=4;
                }
                break;
            case EFFACE_KW:
            case GENERATE_KW:
                {
                alt42=5;
                }
                break;
            case WAIT_KW:
                {
                alt42=6;
                }
                break;
            case SAVE_KW:
                {
                alt42=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:165:2: accesClasse actionObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_action1159);
                    accesClasse103=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse103.getTree());
                    pushFollow(FOLLOW_actionObjet_in_action1161);
                    actionObjet104=actionObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet104.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:166:4: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set105=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set105));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:166:19: ( ENDS_KW | STARTS_KW )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ENDS_KW) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==STARTS_KW) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:166:20: ENDS_KW
                            {
                            ENDS_KW106=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1175); 
                            ENDS_KW106_tree = (CommonTree)adaptor.create(ENDS_KW106);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW106_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:166:30: STARTS_KW
                            {
                            STARTS_KW107=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1179); 
                            STARTS_KW107_tree = (CommonTree)adaptor.create(STARTS_KW107);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW107_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:167:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:167:4: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW )
                    int alt36=4;
                    switch ( input.LA(1) ) {
                    case PAUSE_KW:
                        {
                        alt36=1;
                        }
                        break;
                    case MUTE_KW:
                        {
                        alt36=2;
                        }
                        break;
                    case PLAY_KW:
                        {
                        alt36=3;
                        }
                        break;
                    case STOP_KW:
                        {
                        alt36=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:167:5: PAUSE_KW
                            {
                            PAUSE_KW108=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1187); 
                            PAUSE_KW108_tree = (CommonTree)adaptor.create(PAUSE_KW108);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW108_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:167:17: MUTE_KW ( ON | OFF )
                            {
                            MUTE_KW109=(Token)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1192); 
                            MUTE_KW109_tree = (CommonTree)adaptor.create(MUTE_KW109);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTE_KW109_tree, root_0);

                            set110=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set110));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:167:39: PLAY_KW
                            {
                            PLAY_KW111=(Token)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1205); 
                            PLAY_KW111_tree = (CommonTree)adaptor.create(PLAY_KW111);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAY_KW111_tree, root_0);


                            }
                            break;
                        case 4 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:167:50: STOP_KW
                            {
                            STOP_KW112=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_action1210); 
                            STOP_KW112_tree = (CommonTree)adaptor.create(STOP_KW112);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOP_KW112_tree, root_0);


                            }
                            break;

                    }

                    IDENT113=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1215); 
                    IDENT113_tree = (CommonTree)adaptor.create(IDENT113);
                    adaptor.addChild(root_0, IDENT113_tree);


                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:168:4: BLOCK_KW transformation OF accesClasse coordinates
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLOCK_KW114=(Token)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1220); 
                    BLOCK_KW114_tree = (CommonTree)adaptor.create(BLOCK_KW114);
                    root_0 = (CommonTree)adaptor.becomeRoot(BLOCK_KW114_tree, root_0);

                    pushFollow(FOLLOW_transformation_in_action1223);
                    transformation115=transformation();

                    state._fsp--;

                    adaptor.addChild(root_0, transformation115.getTree());
                    OF116=(Token)match(input,OF,FOLLOW_OF_in_action1225); 
                    pushFollow(FOLLOW_accesClasse_in_action1228);
                    accesClasse117=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse117.getTree());
                    pushFollow(FOLLOW_coordinates_in_action1230);
                    coordinates118=coordinates();

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates118.getTree());

                    }
                    break;
                case 5 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:4: ( EFFACE_KW | GENERATE_KW ) ( accesLocal | operation ( IDENT | accesGlobal ) ) ( ( IN | ON ) accesLocal | AT coordinates )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:4: ( EFFACE_KW | GENERATE_KW )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==EFFACE_KW) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==GENERATE_KW) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:5: EFFACE_KW
                            {
                            EFFACE_KW119=(Token)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1236); 
                            EFFACE_KW119_tree = (CommonTree)adaptor.create(EFFACE_KW119);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACE_KW119_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:18: GENERATE_KW
                            {
                            GENERATE_KW120=(Token)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1241); 
                            GENERATE_KW120_tree = (CommonTree)adaptor.create(GENERATE_KW120);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATE_KW120_tree, root_0);


                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:32: ( accesLocal | operation ( IDENT | accesGlobal ) )
                    int alt39=2;
                    switch ( input.LA(1) ) {
                    case IDENT:
                        {
                        int LA39_1 = input.LA(2);

                        if ( (LA39_1==OF) ) {
                            alt39=2;
                        }
                        else if ( (LA39_1==EOF||LA39_1==FIN||LA39_1==VIRG||LA39_1==AT||LA39_1==IN||LA39_1==DEFINITION_KW||LA39_1==ON||LA39_1==ENDWAIT||LA39_1==COMMAND_KW||LA39_1==RULE_KW||(LA39_1>=ELSE && LA39_1<=ENDIF)||LA39_1==IA_KW) ) {
                            alt39=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 39, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLAYER:
                    case NUM:
                        {
                        alt39=1;
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
                        alt39=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }

                    switch (alt39) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:33: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_action1246);
                            accesLocal121=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal121.getTree());

                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:46: operation ( IDENT | accesGlobal )
                            {
                            pushFollow(FOLLOW_operation_in_action1250);
                            operation122=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation122.getTree());
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:56: ( IDENT | accesGlobal )
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==IDENT) ) {
                                alt38=1;
                            }
                            else if ( (LA38_0==CAMERA||LA38_0==MEDIA||(LA38_0>=ALLY && LA38_0<=NEUTRAL)||LA38_0==PG||(LA38_0>=COUNTER && LA38_0<=TIME)) ) {
                                alt38=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 38, 0, input);

                                throw nvae;
                            }
                            switch (alt38) {
                                case 1 :
                                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:57: IDENT
                                    {
                                    IDENT123=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1253); 
                                    IDENT123_tree = (CommonTree)adaptor.create(IDENT123);
                                    adaptor.addChild(root_0, IDENT123_tree);


                                    }
                                    break;
                                case 2 :
                                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:65: accesGlobal
                                    {
                                    pushFollow(FOLLOW_accesGlobal_in_action1257);
                                    accesGlobal124=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal124.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:79: ( ( IN | ON ) accesLocal | AT coordinates )?
                    int alt41=3;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==IN||LA41_0==ON) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==AT) ) {
                        alt41=2;
                    }
                    switch (alt41) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:80: ( IN | ON ) accesLocal
                            {
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:80: ( IN | ON )
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==IN) ) {
                                alt40=1;
                            }
                            else if ( (LA40_0==ON) ) {
                                alt40=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 0, input);

                                throw nvae;
                            }
                            switch (alt40) {
                                case 1 :
                                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:81: IN
                                    {
                                    IN125=(Token)match(input,IN,FOLLOW_IN_in_action1263); 

                                    }
                                    break;
                                case 2 :
                                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:85: ON
                                    {
                                    ON126=(Token)match(input,ON,FOLLOW_ON_in_action1266); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_action1270);
                            accesLocal127=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal127.getTree());

                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:169:103: AT coordinates
                            {
                            AT128=(Token)match(input,AT,FOLLOW_AT_in_action1274); 
                            pushFollow(FOLLOW_coordinates_in_action1277);
                            coordinates129=coordinates();

                            state._fsp--;

                            adaptor.addChild(root_0, coordinates129.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:170:4: WAIT_KW operation timeUnit THEN consequences ENDWAIT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAIT_KW130=(Token)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1284); 
                    WAIT_KW130_tree = (CommonTree)adaptor.create(WAIT_KW130);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAIT_KW130_tree, root_0);

                    pushFollow(FOLLOW_operation_in_action1287);
                    operation131=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation131.getTree());
                    pushFollow(FOLLOW_timeUnit_in_action1289);
                    timeUnit132=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit132.getTree());
                    THEN133=(Token)match(input,THEN,FOLLOW_THEN_in_action1291); 
                    pushFollow(FOLLOW_consequences_in_action1294);
                    consequences134=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences134.getTree());
                    ENDWAIT135=(Token)match(input,ENDWAIT,FOLLOW_ENDWAIT_in_action1296); 

                    }
                    break;
                case 7 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:171:4: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAVE_KW136=(Token)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1302); 
                    SAVE_KW136_tree = (CommonTree)adaptor.create(SAVE_KW136);
                    adaptor.addChild(root_0, SAVE_KW136_tree);


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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:174:1: actionObjet : ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) );
    public final hightParser.actionObjet_return actionObjet() throws RecognitionException {
        hightParser.actionObjet_return retval = new hightParser.actionObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIES_KW137=null;
        Token DURING140=null;
        Token UNTIL143=null;
        Token EQUIP145=null;
        Token NEXT147=null;
        Token PREVIOUS148=null;
        hightParser.actionCommandePressee_return actionCommandePressee138 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue139 = null;

        hightParser.operation_return operation141 = null;

        hightParser.timeUnit_return timeUnit142 = null;

        hightParser.conditions_return conditions144 = null;

        hightParser.accesLocal_return accesLocal146 = null;


        CommonTree DIES_KW137_tree=null;
        CommonTree DURING140_tree=null;
        CommonTree UNTIL143_tree=null;
        CommonTree EQUIP145_tree=null;
        CommonTree NEXT147_tree=null;
        CommonTree PREVIOUS148_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:174:13: ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions ) | EQUIP ( accesLocal | NEXT | PREVIOUS ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case DIES_KW:
                {
                alt45=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt45=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt45=3;
                }
                break;
            case EQUIP:
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:175:3: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DIES_KW137=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1314); 
                    DIES_KW137_tree = (CommonTree)adaptor.create(DIES_KW137);
                    adaptor.addChild(root_0, DIES_KW137_tree);


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:176:5: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1320);
                    actionCommandePressee138=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee138.getTree());

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:177:5: actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1326);
                    actionCommandeMaintenue139=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue139.getTree());
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:177:29: ( DURING operation timeUnit | UNTIL conditions )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==DURING) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==UNTIL) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:177:30: DURING operation timeUnit
                            {
                            DURING140=(Token)match(input,DURING,FOLLOW_DURING_in_actionObjet1329); 
                            DURING140_tree = (CommonTree)adaptor.create(DURING140);
                            root_0 = (CommonTree)adaptor.becomeRoot(DURING140_tree, root_0);

                            pushFollow(FOLLOW_operation_in_actionObjet1332);
                            operation141=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation141.getTree());
                            pushFollow(FOLLOW_timeUnit_in_actionObjet1334);
                            timeUnit142=timeUnit();

                            state._fsp--;

                            adaptor.addChild(root_0, timeUnit142.getTree());

                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:177:59: UNTIL conditions
                            {
                            UNTIL143=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1338); 
                            UNTIL143_tree = (CommonTree)adaptor.create(UNTIL143);
                            root_0 = (CommonTree)adaptor.becomeRoot(UNTIL143_tree, root_0);

                            pushFollow(FOLLOW_conditions_in_actionObjet1341);
                            conditions144=conditions();

                            state._fsp--;

                            adaptor.addChild(root_0, conditions144.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:178:5: EQUIP ( accesLocal | NEXT | PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EQUIP145=(Token)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1348); 
                    EQUIP145_tree = (CommonTree)adaptor.create(EQUIP145);
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUIP145_tree, root_0);

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:178:12: ( accesLocal | NEXT | PREVIOUS )
                    int alt44=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case PLAYER:
                    case NUM:
                        {
                        alt44=1;
                        }
                        break;
                    case NEXT:
                        {
                        alt44=2;
                        }
                        break;
                    case PREVIOUS:
                        {
                        alt44=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }

                    switch (alt44) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:178:13: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_actionObjet1352);
                            accesLocal146=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal146.getTree());

                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:178:26: NEXT
                            {
                            NEXT147=(Token)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1356); 
                            NEXT147_tree = (CommonTree)adaptor.create(NEXT147);
                            adaptor.addChild(root_0, NEXT147_tree);


                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:178:33: PREVIOUS
                            {
                            PREVIOUS148=(Token)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1360); 
                            PREVIOUS148_tree = (CommonTree)adaptor.create(PREVIOUS148);
                            adaptor.addChild(root_0, PREVIOUS148_tree);


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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:181:1: transformation : ( TRANSLATION | ROTATION | SCALE );
    public final hightParser.transformation_return transformation() throws RecognitionException {
        hightParser.transformation_return retval = new hightParser.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set149=null;

        CommonTree set149_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:181:16: ( TRANSLATION | ROTATION | SCALE )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set149=(Token)input.LT(1);
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set149));
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:187:1: coordinates : operation operation operation -> ^( COORDINATE_KW operation operation operation ) ;
    public final hightParser.coordinates_return coordinates() throws RecognitionException {
        hightParser.coordinates_return retval = new hightParser.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hightParser.operation_return operation150 = null;

        hightParser.operation_return operation151 = null;

        hightParser.operation_return operation152 = null;


        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:187:13: ( operation operation operation -> ^( COORDINATE_KW operation operation operation ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:188:2: operation operation operation
            {
            pushFollow(FOLLOW_operation_in_coordinates1400);
            operation150=operation();

            state._fsp--;

            stream_operation.add(operation150.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1402);
            operation151=operation();

            state._fsp--;

            stream_operation.add(operation151.getTree());
            pushFollow(FOLLOW_operation_in_coordinates1404);
            operation152=operation();

            state._fsp--;

            stream_operation.add(operation152.getTree());


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
            // 189:4: -> ^( COORDINATE_KW operation operation operation )
            {
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:189:7: ^( COORDINATE_KW operation operation operation )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:194:1: commande : COMMAND_KW ( IDENT IS | PLAYER FLOAT )? actionCommande ( VIRG actionCommande )* ;
    public final hightParser.commande_return commande() throws RecognitionException {
        hightParser.commande_return retval = new hightParser.commande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMAND_KW153=null;
        Token IDENT154=null;
        Token IS155=null;
        Token PLAYER156=null;
        Token FLOAT157=null;
        Token VIRG159=null;
        hightParser.actionCommande_return actionCommande158 = null;

        hightParser.actionCommande_return actionCommande160 = null;


        CommonTree COMMAND_KW153_tree=null;
        CommonTree IDENT154_tree=null;
        CommonTree IS155_tree=null;
        CommonTree PLAYER156_tree=null;
        CommonTree FLOAT157_tree=null;
        CommonTree VIRG159_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:194:10: ( COMMAND_KW ( IDENT IS | PLAYER FLOAT )? actionCommande ( VIRG actionCommande )* )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:195:2: COMMAND_KW ( IDENT IS | PLAYER FLOAT )? actionCommande ( VIRG actionCommande )*
            {
            root_0 = (CommonTree)adaptor.nil();

            COMMAND_KW153=(Token)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande1433); 
            COMMAND_KW153_tree = (CommonTree)adaptor.create(COMMAND_KW153);
            root_0 = (CommonTree)adaptor.becomeRoot(COMMAND_KW153_tree, root_0);

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:195:14: ( IDENT IS | PLAYER FLOAT )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IDENT) ) {
                alt46=1;
            }
            else if ( (LA46_0==PLAYER) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:195:15: IDENT IS
                    {
                    IDENT154=(Token)match(input,IDENT,FOLLOW_IDENT_in_commande1437); 
                    IDENT154_tree = (CommonTree)adaptor.create(IDENT154);
                    adaptor.addChild(root_0, IDENT154_tree);

                    IS155=(Token)match(input,IS,FOLLOW_IS_in_commande1439); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:195:25: PLAYER FLOAT
                    {
                    PLAYER156=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_commande1442); 
                    FLOAT157=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_commande1445); 
                    FLOAT157_tree = (CommonTree)adaptor.create(FLOAT157);
                    adaptor.addChild(root_0, FLOAT157_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_actionCommande_in_commande1449);
            actionCommande158=actionCommande();

            state._fsp--;

            adaptor.addChild(root_0, actionCommande158.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:195:56: ( VIRG actionCommande )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==VIRG) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:195:57: VIRG actionCommande
            	    {
            	    VIRG159=(Token)match(input,VIRG,FOLLOW_VIRG_in_commande1452); 
            	    pushFollow(FOLLOW_actionCommande_in_commande1455);
            	    actionCommande160=actionCommande();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionCommande160.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:198:1: actionCommande : ( MOUSE souris FOR actionCommandeType -> ^( MOUSE_KW souris actionCommandeType ) | KEY clavier FOR actionCommandeType -> ^( KEY_KW clavier actionCommandeType ) );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:198:16: ( MOUSE souris FOR actionCommandeType -> ^( MOUSE_KW souris actionCommandeType ) | KEY clavier FOR actionCommandeType -> ^( KEY_KW clavier actionCommandeType ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==MOUSE) ) {
                alt48=1;
            }
            else if ( (LA48_0==KEY) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:199:2: MOUSE souris FOR actionCommandeType
                    {
                    MOUSE161=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_actionCommande1468);  
                    stream_MOUSE.add(MOUSE161);

                    pushFollow(FOLLOW_souris_in_actionCommande1470);
                    souris162=souris();

                    state._fsp--;

                    stream_souris.add(souris162.getTree());
                    FOR163=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande1472);  
                    stream_FOR.add(FOR163);

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1474);
                    actionCommandeType164=actionCommandeType();

                    state._fsp--;

                    stream_actionCommandeType.add(actionCommandeType164.getTree());


                    // AST REWRITE
                    // elements: actionCommandeType, souris
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:4: -> ^( MOUSE_KW souris actionCommandeType )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:200:7: ^( MOUSE_KW souris actionCommandeType )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:201:4: KEY clavier FOR actionCommandeType
                    {
                    KEY165=(Token)match(input,KEY,FOLLOW_KEY_in_actionCommande1492);  
                    stream_KEY.add(KEY165);

                    pushFollow(FOLLOW_clavier_in_actionCommande1494);
                    clavier166=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier166.getTree());
                    FOR167=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande1496);  
                    stream_FOR.add(FOR167);

                    pushFollow(FOLLOW_actionCommandeType_in_actionCommande1498);
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
                    // 202:4: -> ^( KEY_KW clavier actionCommandeType )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:202:7: ^( KEY_KW clavier actionCommandeType )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:205:1: actionCommandeType : ( IDENT | actionCommandePressee | actionCommandeMaintenue );
    public final hightParser.actionCommandeType_return actionCommandeType() throws RecognitionException {
        hightParser.actionCommandeType_return retval = new hightParser.actionCommandeType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT169=null;
        hightParser.actionCommandePressee_return actionCommandePressee170 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue171 = null;


        CommonTree IDENT169_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:205:20: ( IDENT | actionCommandePressee | actionCommandeMaintenue )
            int alt49=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt49=1;
                }
                break;
            case PAUSE_KW:
            case STOP_KW:
            case JUMP:
                {
                alt49=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:206:2: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT169=(Token)match(input,IDENT,FOLLOW_IDENT_in_actionCommandeType1523); 
                    IDENT169_tree = (CommonTree)adaptor.create(IDENT169);
                    adaptor.addChild(root_0, IDENT169_tree);


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:206:10: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionCommandeType1527);
                    actionCommandePressee170=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee170.getTree());

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:206:34: actionCommandeMaintenue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionCommandeType1531);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:209:1: souris : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final hightParser.souris_return souris() throws RecognitionException {
        hightParser.souris_return retval = new hightParser.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set172=null;

        CommonTree set172_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:209:8: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_CENTER | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:213:1: clavier : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final hightParser.clavier_return clavier() throws RecognitionException {
        hightParser.clavier_return retval = new hightParser.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set173=null;

        CommonTree set173_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:213:9: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:217:1: actionCommandePressee : ( JUMP operation | PAUSE_KW | STOP_KW );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:217:23: ( JUMP operation | PAUSE_KW | STOP_KW )
            int alt50=3;
            switch ( input.LA(1) ) {
            case JUMP:
                {
                alt50=1;
                }
                break;
            case PAUSE_KW:
                {
                alt50=2;
                }
                break;
            case STOP_KW:
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:218:3: JUMP operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    JUMP174=(Token)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1643); 
                    JUMP174_tree = (CommonTree)adaptor.create(JUMP174);
                    adaptor.addChild(root_0, JUMP174_tree);

                    pushFollow(FOLLOW_operation_in_actionCommandePressee1645);
                    operation175=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation175.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:219:5: PAUSE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PAUSE_KW176=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_actionCommandePressee1651); 
                    PAUSE_KW176_tree = (CommonTree)adaptor.create(PAUSE_KW176);
                    adaptor.addChild(root_0, PAUSE_KW176_tree);


                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:220:5: STOP_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STOP_KW177=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_actionCommandePressee1657); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:223:1: actionCommandeMaintenue : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:223:25: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD ) | TURN ( LEFT | RIGHT ) | ACCELERATE | BRAKE )
            int alt51=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt51=1;
                }
                break;
            case TURN:
                {
                alt51=2;
                }
                break;
            case ACCELERATE:
                {
                alt51=3;
                }
                break;
            case BRAKE:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:224:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MOVE178=(Token)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1672); 
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:225:5: TURN ( LEFT | RIGHT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURN180=(Token)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1694); 
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:226:5: ACCELERATE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACCELERATE182=(Token)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1708); 
                    ACCELERATE182_tree = (CommonTree)adaptor.create(ACCELERATE182);
                    adaptor.addChild(root_0, ACCELERATE182_tree);


                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:227:5: BRAKE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BRAKE183=(Token)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1714); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:230:1: activCommande : ( ACTIVATE_KW | DISABLE_KW ) typeCommand ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:230:15: ( ( ACTIVATE_KW | DISABLE_KW ) typeCommand )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:231:3: ( ACTIVATE_KW | DISABLE_KW ) typeCommand
            {
            root_0 = (CommonTree)adaptor.nil();

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:231:3: ( ACTIVATE_KW | DISABLE_KW )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ACTIVATE_KW) ) {
                alt52=1;
            }
            else if ( (LA52_0==DISABLE_KW) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:231:4: ACTIVATE_KW
                    {
                    ACTIVATE_KW184=(Token)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande1730); 
                    ACTIVATE_KW184_tree = (CommonTree)adaptor.create(ACTIVATE_KW184);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW184_tree, root_0);


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:231:19: DISABLE_KW
                    {
                    DISABLE_KW185=(Token)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande1735); 
                    DISABLE_KW185_tree = (CommonTree)adaptor.create(DISABLE_KW185);
                    root_0 = (CommonTree)adaptor.becomeRoot(DISABLE_KW185_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeCommand_in_activCommande1739);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:234:1: typeCommand : ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:234:13: ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD )
            int alt56=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt56=1;
                }
                break;
            case MOUSE:
                {
                alt56=2;
                }
                break;
            case KEY:
                {
                alt56=3;
                }
                break;
            case KEYBOARD:
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:235:5: COMMANDS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMMANDS187=(Token)match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand1753); 
                    COMMANDS187_tree = (CommonTree)adaptor.create(COMMANDS187);
                    adaptor.addChild(root_0, COMMANDS187_tree);


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:236:7: MOUSE ( souris ( VIRG souris )* )?
                    {
                    MOUSE188=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_typeCommand1761);  
                    stream_MOUSE.add(MOUSE188);

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:236:13: ( souris ( VIRG souris )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=WUP && LA54_0<=SCROLL_DOWN)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:236:14: souris ( VIRG souris )*
                            {
                            pushFollow(FOLLOW_souris_in_typeCommand1764);
                            souris189=souris();

                            state._fsp--;

                            stream_souris.add(souris189.getTree());
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:236:21: ( VIRG souris )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==VIRG) ) {
                                    int LA53_1 = input.LA(2);

                                    if ( ((LA53_1>=WUP && LA53_1<=SCROLL_DOWN)) ) {
                                        alt53=1;
                                    }


                                }


                                switch (alt53) {
                            	case 1 :
                            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:236:22: VIRG souris
                            	    {
                            	    VIRG190=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand1767);  
                            	    stream_VIRG.add(VIRG190);

                            	    pushFollow(FOLLOW_souris_in_typeCommand1769);
                            	    souris191=souris();

                            	    state._fsp--;

                            	    stream_souris.add(souris191.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop53;
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
                    // 237:7: -> ^( MOUSE_KW ( souris )* )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:237:10: ^( MOUSE_KW ( souris )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:237:21: ( souris )*
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:238:7: KEY clavier ( VIRG clavier )*
                    {
                    KEY192=(Token)match(input,KEY,FOLLOW_KEY_in_typeCommand1796);  
                    stream_KEY.add(KEY192);

                    pushFollow(FOLLOW_clavier_in_typeCommand1798);
                    clavier193=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier193.getTree());
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:238:19: ( VIRG clavier )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==VIRG) ) {
                            int LA55_1 = input.LA(2);

                            if ( ((LA55_1>=WUP && LA55_1<=RIGHT)||(LA55_1>=LETTER && LA55_1<=ENTER)) ) {
                                alt55=1;
                            }


                        }


                        switch (alt55) {
                    	case 1 :
                    	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:238:20: VIRG clavier
                    	    {
                    	    VIRG194=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand1801);  
                    	    stream_VIRG.add(VIRG194);

                    	    pushFollow(FOLLOW_clavier_in_typeCommand1803);
                    	    clavier195=clavier();

                    	    state._fsp--;

                    	    stream_clavier.add(clavier195.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
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
                    // 239:7: -> ^( KEY_KW ( clavier )+ )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:239:10: ^( KEY_KW ( clavier )+ )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:240:7: KEYBOARD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KEYBOARD196=(Token)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand1828); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:242:1: reglesJeu : RULE_KW ( IDENT IS )? declencheur THEN consequences ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:242:11: ( RULE_KW ( IDENT IS )? declencheur THEN consequences )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:243:3: RULE_KW ( IDENT IS )? declencheur THEN consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            RULE_KW197=(Token)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu1838); 
            RULE_KW197_tree = (CommonTree)adaptor.create(RULE_KW197);
            root_0 = (CommonTree)adaptor.becomeRoot(RULE_KW197_tree, root_0);

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:243:12: ( IDENT IS )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==IDENT) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==IS) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:243:13: IDENT IS
                    {
                    IDENT198=(Token)match(input,IDENT,FOLLOW_IDENT_in_reglesJeu1842); 
                    IDENT198_tree = (CommonTree)adaptor.create(IDENT198);
                    adaptor.addChild(root_0, IDENT198_tree);

                    IS199=(Token)match(input,IS,FOLLOW_IS_in_reglesJeu1844); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declencheur_in_reglesJeu1850);
            declencheur200=declencheur();

            state._fsp--;

            adaptor.addChild(root_0, declencheur200.getTree());
            THEN201=(Token)match(input,THEN,FOLLOW_THEN_in_reglesJeu1852); 
            pushFollow(FOLLOW_consequences_in_reglesJeu1855);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:246:1: declencheur : ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:246:13: ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | IDENT BECOMES playerOuInteraction -> ^( BECOMES_ID_KW IDENT playerOuInteraction ) | VICTORY_KW | DEFEAT_KW )
            int alt60=6;
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
                alt60=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case OF:
                    {
                    alt60=3;
                    }
                    break;
                case BECOMES:
                    {
                    alt60=4;
                    }
                    break;
                case DIES_KW:
                case MOVES_KW:
                case TOUCHES_KW:
                case KILLS_KW:
                case KILLED_KW:
                case TOUCHED_KW:
                    {
                    alt60=1;
                    }
                    break;
                case ENDS_KW:
                case STARTS_KW:
                    {
                    alt60=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;
                }

                }
                break;
            case GAME:
                {
                alt60=2;
                }
                break;
            case SCORE:
            case X:
            case Y:
            case Z:
            case VALUE:
                {
                alt60=3;
                }
                break;
            case VICTORY_KW:
                {
                alt60=5;
                }
                break;
            case DEFEAT_KW:
                {
                alt60=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:247:3: accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_declencheur1869);
                    accesClasse203=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse203.getTree());
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:247:15: ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    int alt58=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt58=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt58=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                        {
                        alt58=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:247:16: MOVES_KW
                            {
                            MOVES_KW204=(Token)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur1872); 
                            MOVES_KW204_tree = (CommonTree)adaptor.create(MOVES_KW204);
                            adaptor.addChild(root_0, MOVES_KW204_tree);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:247:27: DIES_KW
                            {
                            DIES_KW205=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur1876); 
                            DIES_KW205_tree = (CommonTree)adaptor.create(DIES_KW205);
                            adaptor.addChild(root_0, DIES_KW205_tree);


                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:247:37: declencheurTK
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur1880);
                            declencheurTK206=declencheurTK();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK206.getTree());

                            }
                            break;
                        case 4 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:247:53: declencheurKT
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur1884);
                            declencheurKT207=declencheurKT();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT207.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:248:5: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
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

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:248:20: ( ENDS_KW | STARTS_KW )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==ENDS_KW) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==STARTS_KW) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:248:21: ENDS_KW
                            {
                            ENDS_KW209=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur1901); 
                            ENDS_KW209_tree = (CommonTree)adaptor.create(ENDS_KW209);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW209_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:248:31: STARTS_KW
                            {
                            STARTS_KW210=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur1905); 
                            STARTS_KW210_tree = (CommonTree)adaptor.create(STARTS_KW210);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW210_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:249:5: variable BECOMES varOuNB
                    {
                    pushFollow(FOLLOW_variable_in_declencheur1923);
                    variable211=variable();

                    state._fsp--;

                    stream_variable.add(variable211.getTree());
                    BECOMES212=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1925);  
                    stream_BECOMES.add(BECOMES212);

                    pushFollow(FOLLOW_varOuNB_in_declencheur1927);
                    varOuNB213=varOuNB();

                    state._fsp--;

                    stream_varOuNB.add(varOuNB213.getTree());


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
                    // 250:5: -> ^( BECOMES_VAR_KW variable varOuNB )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:250:8: ^( BECOMES_VAR_KW variable varOuNB )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:251:5: IDENT BECOMES playerOuInteraction
                    {
                    IDENT214=(Token)match(input,IDENT,FOLLOW_IDENT_in_declencheur1947);  
                    stream_IDENT.add(IDENT214);

                    BECOMES215=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur1949);  
                    stream_BECOMES.add(BECOMES215);

                    pushFollow(FOLLOW_playerOuInteraction_in_declencheur1951);
                    playerOuInteraction216=playerOuInteraction();

                    state._fsp--;

                    stream_playerOuInteraction.add(playerOuInteraction216.getTree());


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
                    // 252:5: -> ^( BECOMES_ID_KW IDENT playerOuInteraction )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:252:8: ^( BECOMES_ID_KW IDENT playerOuInteraction )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:253:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW217=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur1971); 
                    VICTORY_KW217_tree = (CommonTree)adaptor.create(VICTORY_KW217);
                    adaptor.addChild(root_0, VICTORY_KW217_tree);


                    }
                    break;
                case 6 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:254:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW218=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur1977); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:257:1: varOuNB : ( variable | FLOAT );
    public final hightParser.varOuNB_return varOuNB() throws RecognitionException {
        hightParser.varOuNB_return retval = new hightParser.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FLOAT220=null;
        hightParser.variable_return variable219 = null;


        CommonTree FLOAT220_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:257:9: ( variable | FLOAT )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==SCORE||LA61_0==IDENT||(LA61_0>=X && LA61_0<=VALUE)) ) {
                alt61=1;
            }
            else if ( (LA61_0==FLOAT) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:257:11: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_varOuNB1988);
                    variable219=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable219.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:257:22: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT220=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB1992); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:259:1: playerOuInteraction : ( PLAYER | interaction ) ;
    public final hightParser.playerOuInteraction_return playerOuInteraction() throws RecognitionException {
        hightParser.playerOuInteraction_return retval = new hightParser.playerOuInteraction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER221=null;
        hightParser.interaction_return interaction222 = null;


        CommonTree PLAYER221_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:260:2: ( ( PLAYER | interaction ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:260:4: ( PLAYER | interaction )
            {
            root_0 = (CommonTree)adaptor.nil();

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:260:4: ( PLAYER | interaction )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==PLAYER) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=ALLY && LA62_0<=NEUTRAL)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:260:5: PLAYER
                    {
                    PLAYER221=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_playerOuInteraction2002); 
                    PLAYER221_tree = (CommonTree)adaptor.create(PLAYER221);
                    adaptor.addChild(root_0, PLAYER221_tree);


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:260:13: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_playerOuInteraction2005);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:262:1: declencheurTK : ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:2: ( ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:4: ( TOUCHES_KW | KILLS_KW ) ( ( OTHER )? accesGlobal | accesLocal )
            {
            root_0 = (CommonTree)adaptor.nil();

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:4: ( TOUCHES_KW | KILLS_KW )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==TOUCHES_KW) ) {
                alt63=1;
            }
            else if ( (LA63_0==KILLS_KW) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:5: TOUCHES_KW
                    {
                    TOUCHES_KW223=(Token)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2017); 
                    TOUCHES_KW223_tree = (CommonTree)adaptor.create(TOUCHES_KW223);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW223_tree, root_0);


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:19: KILLS_KW
                    {
                    KILLS_KW224=(Token)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2022); 
                    KILLS_KW224_tree = (CommonTree)adaptor.create(KILLS_KW224);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLS_KW224_tree, root_0);


                    }
                    break;

            }

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:30: ( ( OTHER )? accesGlobal | accesLocal )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==CAMERA||LA65_0==MEDIA||(LA65_0>=ALLY && LA65_0<=NEUTRAL)||LA65_0==OTHER||LA65_0==PG||(LA65_0>=COUNTER && LA65_0<=TIME)) ) {
                alt65=1;
            }
            else if ( (LA65_0==IDENT||LA65_0==PLAYER||LA65_0==NUM) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:31: ( OTHER )? accesGlobal
                    {
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:31: ( OTHER )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==OTHER) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:32: OTHER
                            {
                            OTHER225=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2028); 
                            OTHER225_tree = (CommonTree)adaptor.create(OTHER225);
                            adaptor.addChild(root_0, OTHER225_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesGlobal_in_declencheurTK2032);
                    accesGlobal226=accesGlobal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesGlobal226.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:263:54: accesLocal
                    {
                    pushFollow(FOLLOW_accesLocal_in_declencheurTK2036);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:265:1: declencheurKT : ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:2: ( ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )? )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:4: ( KILLED_KW | TOUCHED_KW ) ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:4: ( KILLED_KW | TOUCHED_KW )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==KILLED_KW) ) {
                alt66=1;
            }
            else if ( (LA66_0==TOUCHED_KW) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:5: KILLED_KW
                    {
                    KILLED_KW228=(Token)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2048); 
                    KILLED_KW228_tree = (CommonTree)adaptor.create(KILLED_KW228);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLED_KW228_tree, root_0);


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:18: TOUCHED_KW
                    {
                    TOUCHED_KW229=(Token)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2053); 
                    TOUCHED_KW229_tree = (CommonTree)adaptor.create(TOUCHED_KW229);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW229_tree, root_0);


                    }
                    break;

            }

            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:31: ( BY ( ( OTHER )? accesGlobal | accesLocal ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==BY) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:32: BY ( ( OTHER )? accesGlobal | accesLocal )
                    {
                    BY230=(Token)match(input,BY,FOLLOW_BY_in_declencheurKT2058); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:36: ( ( OTHER )? accesGlobal | accesLocal )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==CAMERA||LA68_0==MEDIA||(LA68_0>=ALLY && LA68_0<=NEUTRAL)||LA68_0==OTHER||LA68_0==PG||(LA68_0>=COUNTER && LA68_0<=TIME)) ) {
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:37: ( OTHER )? accesGlobal
                            {
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:37: ( OTHER )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==OTHER) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:38: OTHER
                                    {
                                    OTHER231=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2063); 
                                    OTHER231_tree = (CommonTree)adaptor.create(OTHER231);
                                    adaptor.addChild(root_0, OTHER231_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesGlobal_in_declencheurKT2067);
                            accesGlobal232=accesGlobal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesGlobal232.getTree());

                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:266:60: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_declencheurKT2071);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:269:1: siAlors : IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:269:9: ( IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:270:3: IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF_KW234=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2088); 
            IF_KW234_tree = (CommonTree)adaptor.create(IF_KW234);
            root_0 = (CommonTree)adaptor.becomeRoot(IF_KW234_tree, root_0);

            pushFollow(FOLLOW_conditions_in_siAlors2091);
            conditions235=conditions();

            state._fsp--;

            adaptor.addChild(root_0, conditions235.getTree());
            THEN236=(Token)match(input,THEN,FOLLOW_THEN_in_siAlors2093); 
            pushFollow(FOLLOW_consequences_in_siAlors2096);
            consequences237=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences237.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:270:40: ( ELSE consequences )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ELSE) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:270:41: ELSE consequences
                    {
                    ELSE238=(Token)match(input,ELSE,FOLLOW_ELSE_in_siAlors2099); 
                    pushFollow(FOLLOW_consequences_in_siAlors2102);
                    consequences239=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences239.getTree());

                    }
                    break;

            }

            ENDIF240=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_siAlors2106); 

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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:273:1: conditions : ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:273:12: ( ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:274:3: ( NOT )? conditionOu
            {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:274:3: ( NOT )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==NOT) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:274:4: NOT
                    {
                    NOT241=(Token)match(input,NOT,FOLLOW_NOT_in_conditions2121);  
                    stream_NOT.add(NOT241);


                    }
                    break;

            }

            pushFollow(FOLLOW_conditionOu_in_conditions2125);
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
            // 275:3: -> ^( CONDITION_KW ( NOT )? conditionOu )
            {
                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:275:6: ^( CONDITION_KW ( NOT )? conditionOu )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_KW, "CONDITION_KW"), root_1);

                // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:275:21: ( NOT )?
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:278:1: conditionOu : conditionEt ( OR conditionEt )* ;
    public final hightParser.conditionOu_return conditionOu() throws RecognitionException {
        hightParser.conditionOu_return retval = new hightParser.conditionOu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR244=null;
        hightParser.conditionEt_return conditionEt243 = null;

        hightParser.conditionEt_return conditionEt245 = null;


        CommonTree OR244_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:278:13: ( conditionEt ( OR conditionEt )* )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:279:3: conditionEt ( OR conditionEt )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionEt_in_conditionOu2151);
            conditionEt243=conditionEt();

            state._fsp--;

            adaptor.addChild(root_0, conditionEt243.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:279:15: ( OR conditionEt )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==OR) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:279:16: OR conditionEt
            	    {
            	    OR244=(Token)match(input,OR,FOLLOW_OR_in_conditionOu2154); 
            	    OR244_tree = (CommonTree)adaptor.create(OR244);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR244_tree, root_0);

            	    pushFollow(FOLLOW_conditionEt_in_conditionOu2157);
            	    conditionEt245=conditionEt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditionEt245.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:282:1: conditionEt : cond ( AND cond )* ;
    public final hightParser.conditionEt_return conditionEt() throws RecognitionException {
        hightParser.conditionEt_return retval = new hightParser.conditionEt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND247=null;
        hightParser.cond_return cond246 = null;

        hightParser.cond_return cond248 = null;


        CommonTree AND247_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:282:13: ( cond ( AND cond )* )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:283:3: cond ( AND cond )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cond_in_conditionEt2172);
            cond246=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond246.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:283:8: ( AND cond )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==AND) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:283:9: AND cond
            	    {
            	    AND247=(Token)match(input,AND,FOLLOW_AND_in_conditionEt2175); 
            	    AND247_tree = (CommonTree)adaptor.create(AND247);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND247_tree, root_0);

            	    pushFollow(FOLLOW_cond_in_conditionEt2178);
            	    cond248=cond();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cond248.getTree());

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
    // $ANTLR end "conditionEt"

    public static class cond_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cond"
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:286:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:286:6: ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD )
            int alt75=3;
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
                alt75=1;
                }
                break;
            case PG:
                {
                int LA75_2 = input.LA(2);

                if ( (LA75_2==NOT) ) {
                    switch ( input.LA(3) ) {
                    case CAMERA:
                    case MEDIA:
                    case COUNTER:
                    case TIME:
                        {
                        int LA75_6 = input.LA(4);

                        if ( (LA75_6==PD) ) {
                            alt75=1;
                        }
                        else if ( (LA75_6==IS) ) {
                            alt75=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ALLY:
                    case ENEMY:
                    case NEUTRAL:
                        {
                        int LA75_7 = input.LA(4);

                        if ( (LA75_7==PD) ) {
                            alt75=1;
                        }
                        else if ( (LA75_7==IS) ) {
                            alt75=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLAYER:
                        {
                        int LA75_8 = input.LA(4);

                        if ( (LA75_8==PD) ) {
                            alt75=1;
                        }
                        else if ( (LA75_8==IS) ) {
                            alt75=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 8, input);

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
                        alt75=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 4, input);

                        throw nvae;
                    }

                }
                else if ( (LA75_2==GAME||LA75_2==IDENT||LA75_2==CAMERA||LA75_2==MEDIA||(LA75_2>=PLAYER && LA75_2<=NEUTRAL)||(LA75_2>=VICTORY_KW && LA75_2<=DEFEAT_KW)||LA75_2==COMP||LA75_2==PG||(LA75_2>=ALL && LA75_2<=NUM)||(LA75_2>=COUNTER && LA75_2<=TIME)) ) {
                    alt75=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 2, input);

                    throw nvae;
                }
                }
                break;
            case COMP:
                {
                alt75=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:287:3: etat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_etat_in_cond2193);
                    etat249=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, etat249.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:288:5: COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMP250=(Token)match(input,COMP,FOLLOW_COMP_in_cond2199); 
                    pushFollow(FOLLOW_operation_in_cond2202);
                    operation251=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation251.getTree());
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:288:21: ( EQUALS | INF | SUP | INFEG | SUPED | DIFF )
                    int alt74=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt74=1;
                        }
                        break;
                    case INF:
                        {
                        alt74=2;
                        }
                        break;
                    case SUP:
                        {
                        alt74=3;
                        }
                        break;
                    case INFEG:
                        {
                        alt74=4;
                        }
                        break;
                    case SUPED:
                        {
                        alt74=5;
                        }
                        break;
                    case DIFF:
                        {
                        alt74=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }

                    switch (alt74) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:288:22: EQUALS
                            {
                            EQUALS252=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond2205); 
                            EQUALS252_tree = (CommonTree)adaptor.create(EQUALS252);
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALS252_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:288:32: INF
                            {
                            INF253=(Token)match(input,INF,FOLLOW_INF_in_cond2210); 
                            INF253_tree = (CommonTree)adaptor.create(INF253);
                            root_0 = (CommonTree)adaptor.becomeRoot(INF253_tree, root_0);


                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:288:39: SUP
                            {
                            SUP254=(Token)match(input,SUP,FOLLOW_SUP_in_cond2215); 
                            SUP254_tree = (CommonTree)adaptor.create(SUP254);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUP254_tree, root_0);


                            }
                            break;
                        case 4 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:288:46: INFEG
                            {
                            INFEG255=(Token)match(input,INFEG,FOLLOW_INFEG_in_cond2220); 
                            INFEG255_tree = (CommonTree)adaptor.create(INFEG255);
                            root_0 = (CommonTree)adaptor.becomeRoot(INFEG255_tree, root_0);


                            }
                            break;
                        case 5 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:288:55: SUPED
                            {
                            SUPED256=(Token)match(input,SUPED,FOLLOW_SUPED_in_cond2225); 
                            SUPED256_tree = (CommonTree)adaptor.create(SUPED256);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUPED256_tree, root_0);


                            }
                            break;
                        case 6 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:288:64: DIFF
                            {
                            DIFF257=(Token)match(input,DIFF,FOLLOW_DIFF_in_cond2230); 
                            DIFF257_tree = (CommonTree)adaptor.create(DIFF257);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIFF257_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_cond2234);
                    operation258=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation258.getTree());

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:289:5: PG conditions PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG259=(Token)match(input,PG,FOLLOW_PG_in_cond2251); 
                    PG259_tree = (CommonTree)adaptor.create(PG259);
                    adaptor.addChild(root_0, PG259_tree);

                    pushFollow(FOLLOW_conditions_in_cond2253);
                    conditions260=conditions();

                    state._fsp--;

                    adaptor.addChild(root_0, conditions260.getTree());
                    PD261=(Token)match(input,PD,FOLLOW_PD_in_cond2255); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:292:1: etat : ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:292:6: ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW | DEFEAT_KW )
            int alt82=4;
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
                alt82=1;
                }
                break;
            case IDENT:
                {
                int LA82_2 = input.LA(2);

                if ( (LA82_2==IS) ) {
                    switch ( input.LA(3) ) {
                    case NOT:
                        {
                        int LA82_7 = input.LA(4);

                        if ( ((LA82_7>=FINISHED_KW && LA82_7<=STOPPED_KW)) ) {
                            alt82=2;
                        }
                        else if ( ((LA82_7>=DEAD_KW && LA82_7<=WAITING_KW)) ) {
                            alt82=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 82, 7, input);

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
                        alt82=2;
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
                        alt82=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 6, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt82=2;
                }
                break;
            case VICTORY_KW:
                {
                alt82=3;
                }
                break;
            case DEFEAT_KW:
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:3: accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_etat2269);
                    accesClasse262=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse262.getTree());
                    IS263=(Token)match(input,IS,FOLLOW_IS_in_etat2271); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:19: ( NOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NOT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:20: NOT
                            {
                            NOT264=(Token)match(input,NOT,FOLLOW_NOT_in_etat2275); 
                            NOT264_tree = (CommonTree)adaptor.create(NOT264);
                            adaptor.addChild(root_0, NOT264_tree);


                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:26: ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal ) | MOVING_KW | WAITING_KW )
                    int alt79=7;
                    switch ( input.LA(1) ) {
                    case DEAD_KW:
                        {
                        alt79=1;
                        }
                        break;
                    case ALIVE_KW:
                        {
                        alt79=2;
                        }
                        break;
                    case EFFACED_KW:
                        {
                        alt79=3;
                        }
                        break;
                    case GENERATED_KW:
                        {
                        alt79=4;
                        }
                        break;
                    case TOUCHING_KW:
                        {
                        alt79=5;
                        }
                        break;
                    case MOVING_KW:
                        {
                        alt79=6;
                        }
                        break;
                    case WAITING_KW:
                        {
                        alt79=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }

                    switch (alt79) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:27: DEAD_KW
                            {
                            DEAD_KW265=(Token)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2280); 
                            DEAD_KW265_tree = (CommonTree)adaptor.create(DEAD_KW265);
                            root_0 = (CommonTree)adaptor.becomeRoot(DEAD_KW265_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:38: ALIVE_KW
                            {
                            ALIVE_KW266=(Token)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2285); 
                            ALIVE_KW266_tree = (CommonTree)adaptor.create(ALIVE_KW266);
                            root_0 = (CommonTree)adaptor.becomeRoot(ALIVE_KW266_tree, root_0);


                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:50: EFFACED_KW
                            {
                            EFFACED_KW267=(Token)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2290); 
                            EFFACED_KW267_tree = (CommonTree)adaptor.create(EFFACED_KW267);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACED_KW267_tree, root_0);


                            }
                            break;
                        case 4 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:64: GENERATED_KW
                            {
                            GENERATED_KW268=(Token)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2295); 
                            GENERATED_KW268_tree = (CommonTree)adaptor.create(GENERATED_KW268);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATED_KW268_tree, root_0);


                            }
                            break;
                        case 5 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:80: TOUCHING_KW ( ( OTHER )? accesGlobal | accesLocal )
                            {
                            TOUCHING_KW269=(Token)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2300); 
                            TOUCHING_KW269_tree = (CommonTree)adaptor.create(TOUCHING_KW269);
                            root_0 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW269_tree, root_0);

                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:93: ( ( OTHER )? accesGlobal | accesLocal )
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==CAMERA||LA78_0==MEDIA||(LA78_0>=ALLY && LA78_0<=NEUTRAL)||LA78_0==OTHER||LA78_0==PG||(LA78_0>=COUNTER && LA78_0<=TIME)) ) {
                                alt78=1;
                            }
                            else if ( (LA78_0==IDENT||LA78_0==PLAYER||LA78_0==NUM) ) {
                                alt78=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 78, 0, input);

                                throw nvae;
                            }
                            switch (alt78) {
                                case 1 :
                                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:94: ( OTHER )? accesGlobal
                                    {
                                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:94: ( OTHER )?
                                    int alt77=2;
                                    int LA77_0 = input.LA(1);

                                    if ( (LA77_0==OTHER) ) {
                                        alt77=1;
                                    }
                                    switch (alt77) {
                                        case 1 :
                                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:95: OTHER
                                            {
                                            OTHER270=(Token)match(input,OTHER,FOLLOW_OTHER_in_etat2305); 
                                            OTHER270_tree = (CommonTree)adaptor.create(OTHER270);
                                            adaptor.addChild(root_0, OTHER270_tree);


                                            }
                                            break;

                                    }

                                    pushFollow(FOLLOW_accesGlobal_in_etat2309);
                                    accesGlobal271=accesGlobal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesGlobal271.getTree());

                                    }
                                    break;
                                case 2 :
                                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:117: accesLocal
                                    {
                                    pushFollow(FOLLOW_accesLocal_in_etat2313);
                                    accesLocal272=accesLocal();

                                    state._fsp--;

                                    adaptor.addChild(root_0, accesLocal272.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 6 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:131: MOVING_KW
                            {
                            MOVING_KW273=(Token)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2318); 
                            MOVING_KW273_tree = (CommonTree)adaptor.create(MOVING_KW273);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOVING_KW273_tree, root_0);


                            }
                            break;
                        case 7 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:293:144: WAITING_KW
                            {
                            WAITING_KW274=(Token)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2323); 
                            WAITING_KW274_tree = (CommonTree)adaptor.create(WAITING_KW274);
                            root_0 = (CommonTree)adaptor.becomeRoot(WAITING_KW274_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:5: ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
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

                    IS276=(Token)match(input,IS,FOLLOW_IS_in_etat2341); 
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:24: ( NOT )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NOT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:25: NOT
                            {
                            NOT277=(Token)match(input,NOT,FOLLOW_NOT_in_etat2345); 
                            NOT277_tree = (CommonTree)adaptor.create(NOT277);
                            adaptor.addChild(root_0, NOT277_tree);


                            }
                            break;

                    }

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:31: ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    int alt81=6;
                    switch ( input.LA(1) ) {
                    case FINISHED_KW:
                        {
                        alt81=1;
                        }
                        break;
                    case STARTED_KW:
                        {
                        alt81=2;
                        }
                        break;
                    case PAUSED_KW:
                        {
                        alt81=3;
                        }
                        break;
                    case MUTED_KW:
                        {
                        alt81=4;
                        }
                        break;
                    case PLAYED_KW:
                        {
                        alt81=5;
                        }
                        break;
                    case STOPPED_KW:
                        {
                        alt81=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }

                    switch (alt81) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:32: FINISHED_KW
                            {
                            FINISHED_KW278=(Token)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat2350); 
                            FINISHED_KW278_tree = (CommonTree)adaptor.create(FINISHED_KW278);
                            root_0 = (CommonTree)adaptor.becomeRoot(FINISHED_KW278_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:46: STARTED_KW
                            {
                            STARTED_KW279=(Token)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat2354); 
                            STARTED_KW279_tree = (CommonTree)adaptor.create(STARTED_KW279);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTED_KW279_tree, root_0);


                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:60: PAUSED_KW
                            {
                            PAUSED_KW280=(Token)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat2359); 
                            PAUSED_KW280_tree = (CommonTree)adaptor.create(PAUSED_KW280);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSED_KW280_tree, root_0);


                            }
                            break;
                        case 4 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:73: MUTED_KW ( ON | OFF )
                            {
                            MUTED_KW281=(Token)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat2364); 
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:96: PLAYED_KW
                            {
                            PLAYED_KW283=(Token)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat2377); 
                            PLAYED_KW283_tree = (CommonTree)adaptor.create(PLAYED_KW283);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAYED_KW283_tree, root_0);


                            }
                            break;
                        case 6 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:294:109: STOPPED_KW
                            {
                            STOPPED_KW284=(Token)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat2382); 
                            STOPPED_KW284_tree = (CommonTree)adaptor.create(STOPPED_KW284);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOPPED_KW284_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:296:5: VICTORY_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW285=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat2396); 
                    VICTORY_KW285_tree = (CommonTree)adaptor.create(VICTORY_KW285);
                    adaptor.addChild(root_0, VICTORY_KW285_tree);


                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:297:5: DEFEAT_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW286=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat2402); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:300:1: affectation : ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:300:13: ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=ASSIGN_KW && LA84_0<=SUB_KW)) ) {
                alt84=1;
            }
            else if ( (LA84_0==INVERT_KW) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:301:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:301:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation )
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:301:4: ( ASSIGN_KW | ADD_KW | SUB_KW ) operation
                    {
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:301:4: ( ASSIGN_KW | ADD_KW | SUB_KW )
                    int alt83=3;
                    switch ( input.LA(1) ) {
                    case ASSIGN_KW:
                        {
                        alt83=1;
                        }
                        break;
                    case ADD_KW:
                        {
                        alt83=2;
                        }
                        break;
                    case SUB_KW:
                        {
                        alt83=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }

                    switch (alt83) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:301:5: ASSIGN_KW
                            {
                            ASSIGN_KW287=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation2419); 
                            ASSIGN_KW287_tree = (CommonTree)adaptor.create(ASSIGN_KW287);
                            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW287_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:301:18: ADD_KW
                            {
                            ADD_KW288=(Token)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation2424); 
                            ADD_KW288_tree = (CommonTree)adaptor.create(ADD_KW288);
                            root_0 = (CommonTree)adaptor.becomeRoot(ADD_KW288_tree, root_0);


                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:301:28: SUB_KW
                            {
                            SUB_KW289=(Token)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation2429); 
                            SUB_KW289_tree = (CommonTree)adaptor.create(SUB_KW289);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUB_KW289_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_affectation2433);
                    operation290=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation290.getTree());

                    }

                    FOR291=(Token)match(input,FOR,FOLLOW_FOR_in_affectation2436); 
                    pushFollow(FOLLOW_variable_in_affectation2439);
                    variable292=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable292.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:302:5: INVERT_KW variable WITH variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INVERT_KW293=(Token)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation2446); 
                    INVERT_KW293_tree = (CommonTree)adaptor.create(INVERT_KW293);
                    root_0 = (CommonTree)adaptor.becomeRoot(INVERT_KW293_tree, root_0);

                    pushFollow(FOLLOW_variable_in_affectation2449);
                    variable294=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable294.getTree());
                    WITH295=(Token)match(input,WITH,FOLLOW_WITH_in_affectation2451); 
                    pushFollow(FOLLOW_variable_in_affectation2454);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:305:1: iaBasique : IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:305:11: ( IA_KW accesClasse IS actionObjet ( VIRG actionObjet )* )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:305:13: IA_KW accesClasse IS actionObjet ( VIRG actionObjet )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IA_KW297=(Token)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique2467); 
            IA_KW297_tree = (CommonTree)adaptor.create(IA_KW297);
            root_0 = (CommonTree)adaptor.becomeRoot(IA_KW297_tree, root_0);

            pushFollow(FOLLOW_accesClasse_in_iaBasique2470);
            accesClasse298=accesClasse();

            state._fsp--;

            adaptor.addChild(root_0, accesClasse298.getTree());
            IS299=(Token)match(input,IS,FOLLOW_IS_in_iaBasique2472); 
            pushFollow(FOLLOW_actionObjet_in_iaBasique2475);
            actionObjet300=actionObjet();

            state._fsp--;

            adaptor.addChild(root_0, actionObjet300.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:305:48: ( VIRG actionObjet )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==VIRG) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:305:49: VIRG actionObjet
            	    {
            	    VIRG301=(Token)match(input,VIRG,FOLLOW_VIRG_in_iaBasique2478); 
            	    pushFollow(FOLLOW_actionObjet_in_iaBasique2481);
            	    actionObjet302=actionObjet();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionObjet302.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:309:1: operation : ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:309:11: ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=FLOAT && LA86_0<=SCORE)||LA86_0==IDENT||LA86_0==PG||(LA86_0>=X && LA86_0<=VALUE)) ) {
                alt86=1;
            }
            else if ( (LA86_0==RANDOM_KW) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:310:2: operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operationPlus_in_operation2495);
                    operationPlus303=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus303.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:311:4: RANDOM_KW BETWEEN operationPlus AND operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RANDOM_KW304=(Token)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation2500); 
                    RANDOM_KW304_tree = (CommonTree)adaptor.create(RANDOM_KW304);
                    root_0 = (CommonTree)adaptor.becomeRoot(RANDOM_KW304_tree, root_0);

                    BETWEEN305=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operation2503); 
                    pushFollow(FOLLOW_operationPlus_in_operation2506);
                    operationPlus306=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus306.getTree());
                    AND307=(Token)match(input,AND,FOLLOW_AND_in_operation2508); 
                    pushFollow(FOLLOW_operationPlus_in_operation2511);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:314:1: operationPlus : operationMul ( ( PLUS | MINUS ) operationMul )* ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:314:15: ( operationMul ( ( PLUS | MINUS ) operationMul )* )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:315:2: operationMul ( ( PLUS | MINUS ) operationMul )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationMul_in_operationPlus2523);
            operationMul309=operationMul();

            state._fsp--;

            adaptor.addChild(root_0, operationMul309.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:315:15: ( ( PLUS | MINUS ) operationMul )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=PLUS && LA88_0<=MINUS)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:315:16: ( PLUS | MINUS ) operationMul
            	    {
            	    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:315:16: ( PLUS | MINUS )
            	    int alt87=2;
            	    int LA87_0 = input.LA(1);

            	    if ( (LA87_0==PLUS) ) {
            	        alt87=1;
            	    }
            	    else if ( (LA87_0==MINUS) ) {
            	        alt87=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 87, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt87) {
            	        case 1 :
            	            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:315:17: PLUS
            	            {
            	            PLUS310=(Token)match(input,PLUS,FOLLOW_PLUS_in_operationPlus2527); 
            	            PLUS310_tree = (CommonTree)adaptor.create(PLUS310);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS310_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:315:25: MINUS
            	            {
            	            MINUS311=(Token)match(input,MINUS,FOLLOW_MINUS_in_operationPlus2532); 
            	            MINUS311_tree = (CommonTree)adaptor.create(MINUS311);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS311_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_operationMul_in_operationPlus2536);
            	    operationMul312=operationMul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operationMul312.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:318:1: operationMul : operationPow ( ( MUL | DIV | MOD ) operationPow )? ;
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:318:14: ( operationPow ( ( MUL | DIV | MOD ) operationPow )? )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:319:2: operationPow ( ( MUL | DIV | MOD ) operationPow )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationPow_in_operationMul2549);
            operationPow313=operationPow();

            state._fsp--;

            adaptor.addChild(root_0, operationPow313.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:319:15: ( ( MUL | DIV | MOD ) operationPow )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=MUL && LA90_0<=MOD)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:319:16: ( MUL | DIV | MOD ) operationPow
                    {
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:319:16: ( MUL | DIV | MOD )
                    int alt89=3;
                    switch ( input.LA(1) ) {
                    case MUL:
                        {
                        alt89=1;
                        }
                        break;
                    case DIV:
                        {
                        alt89=2;
                        }
                        break;
                    case MOD:
                        {
                        alt89=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }

                    switch (alt89) {
                        case 1 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:319:17: MUL
                            {
                            MUL314=(Token)match(input,MUL,FOLLOW_MUL_in_operationMul2553); 
                            MUL314_tree = (CommonTree)adaptor.create(MUL314);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUL314_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:319:24: DIV
                            {
                            DIV315=(Token)match(input,DIV,FOLLOW_DIV_in_operationMul2558); 
                            DIV315_tree = (CommonTree)adaptor.create(DIV315);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIV315_tree, root_0);


                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:319:31: MOD
                            {
                            MOD316=(Token)match(input,MOD,FOLLOW_MOD_in_operationMul2563); 
                            MOD316_tree = (CommonTree)adaptor.create(MOD316);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOD316_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operationPow_in_operationMul2567);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:322:1: operationPow : operationBracket ( POW operationBracket )? ;
    public final hightParser.operationPow_return operationPow() throws RecognitionException {
        hightParser.operationPow_return retval = new hightParser.operationPow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POW319=null;
        hightParser.operationBracket_return operationBracket318 = null;

        hightParser.operationBracket_return operationBracket320 = null;


        CommonTree POW319_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:322:14: ( operationBracket ( POW operationBracket )? )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:323:2: operationBracket ( POW operationBracket )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationBracket_in_operationPow2582);
            operationBracket318=operationBracket();

            state._fsp--;

            adaptor.addChild(root_0, operationBracket318.getTree());
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:323:19: ( POW operationBracket )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==POW) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:323:20: POW operationBracket
                    {
                    POW319=(Token)match(input,POW,FOLLOW_POW_in_operationPow2585); 
                    POW319_tree = (CommonTree)adaptor.create(POW319);
                    root_0 = (CommonTree)adaptor.becomeRoot(POW319_tree, root_0);

                    pushFollow(FOLLOW_operationBracket_in_operationPow2588);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:326:1: operationBracket : ( PG operation PD | variable | FLOAT );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:326:18: ( PG operation PD | variable | FLOAT )
            int alt92=3;
            switch ( input.LA(1) ) {
            case PG:
                {
                alt92=1;
                }
                break;
            case SCORE:
            case IDENT:
            case X:
            case Y:
            case Z:
            case VALUE:
                {
                alt92=2;
                }
                break;
            case FLOAT:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:327:2: PG operation PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG321=(Token)match(input,PG,FOLLOW_PG_in_operationBracket2603); 
                    pushFollow(FOLLOW_operation_in_operationBracket2606);
                    operation322=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation322.getTree());
                    PD323=(Token)match(input,PD,FOLLOW_PD_in_operationBracket2608); 

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:328:4: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operationBracket2614);
                    variable324=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable324.getTree());

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:329:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT325=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operationBracket2619); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:332:1: variable : ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:332:10: ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case X:
            case Y:
            case Z:
                {
                alt94=1;
                }
                break;
            case IDENT:
                {
                alt94=2;
                }
                break;
            case SCORE:
                {
                alt94=3;
                }
                break;
            case VALUE:
                {
                alt94=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:333:3: ( X | Y | Z ) OF typeCoordonnees OF accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:333:3: ( X | Y | Z )
                    int alt93=3;
                    switch ( input.LA(1) ) {
                    case X:
                        {
                        alt93=1;
                        }
                        break;
                    case Y:
                        {
                        alt93=2;
                        }
                        break;
                    case Z:
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
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:333:4: X
                            {
                            X326=(Token)match(input,X,FOLLOW_X_in_variable2632); 
                            X326_tree = (CommonTree)adaptor.create(X326);
                            root_0 = (CommonTree)adaptor.becomeRoot(X326_tree, root_0);


                            }
                            break;
                        case 2 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:333:9: Y
                            {
                            Y327=(Token)match(input,Y,FOLLOW_Y_in_variable2637); 
                            Y327_tree = (CommonTree)adaptor.create(Y327);
                            root_0 = (CommonTree)adaptor.becomeRoot(Y327_tree, root_0);


                            }
                            break;
                        case 3 :
                            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:333:14: Z
                            {
                            Z328=(Token)match(input,Z,FOLLOW_Z_in_variable2642); 
                            Z328_tree = (CommonTree)adaptor.create(Z328);
                            root_0 = (CommonTree)adaptor.becomeRoot(Z328_tree, root_0);


                            }
                            break;

                    }

                    OF329=(Token)match(input,OF,FOLLOW_OF_in_variable2646); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable2649);
                    typeCoordonnees330=typeCoordonnees();

                    state._fsp--;

                    adaptor.addChild(root_0, typeCoordonnees330.getTree());
                    OF331=(Token)match(input,OF,FOLLOW_OF_in_variable2651); 
                    pushFollow(FOLLOW_accesLocal_in_variable2654);
                    accesLocal332=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal332.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:334:5: IDENT OF accesLocal
                    {
                    IDENT333=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable2660);  
                    stream_IDENT.add(IDENT333);

                    OF334=(Token)match(input,OF,FOLLOW_OF_in_variable2662);  
                    stream_OF.add(OF334);

                    pushFollow(FOLLOW_accesLocal_in_variable2664);
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
                    // 335:5: -> ^( VAR_I_KW IDENT accesLocal )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:335:8: ^( VAR_I_KW IDENT accesLocal )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:336:5: SCORE OF GAME
                    {
                    SCORE336=(Token)match(input,SCORE,FOLLOW_SCORE_in_variable2684);  
                    stream_SCORE.add(SCORE336);

                    OF337=(Token)match(input,OF,FOLLOW_OF_in_variable2686);  
                    stream_OF.add(OF337);

                    GAME338=(Token)match(input,GAME,FOLLOW_GAME_in_variable2688);  
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
                    // 337:5: -> GAME_SCORE_KW
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GAME_SCORE_KW, "GAME_SCORE_KW"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:338:5: VALUE OF attributTps OF accesLocal
                    {
                    VALUE339=(Token)match(input,VALUE,FOLLOW_VALUE_in_variable2702);  
                    stream_VALUE.add(VALUE339);

                    OF340=(Token)match(input,OF,FOLLOW_OF_in_variable2704);  
                    stream_OF.add(OF340);

                    pushFollow(FOLLOW_attributTps_in_variable2706);
                    attributTps341=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps341.getTree());
                    OF342=(Token)match(input,OF,FOLLOW_OF_in_variable2708);  
                    stream_OF.add(OF342);

                    pushFollow(FOLLOW_accesLocal_in_variable2710);
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
                    // 339:5: -> ^( VALUE_KW attributTps accesLocal )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:339:8: ^( VALUE_KW attributTps accesLocal )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:342:1: accesClasse : ( ALL -> ^( ACCESS_KW ALL ) | accesLocal | accesGlobal );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:342:13: ( ALL -> ^( ACCESS_KW ALL ) | accesLocal | accesGlobal )
            int alt95=3;
            switch ( input.LA(1) ) {
            case ALL:
                {
                alt95=1;
                }
                break;
            case IDENT:
            case PLAYER:
            case NUM:
                {
                alt95=2;
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
                alt95=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:343:3: ALL
                    {
                    ALL344=(Token)match(input,ALL,FOLLOW_ALL_in_accesClasse2738);  
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
                    // 344:5: -> ^( ACCESS_KW ALL )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:344:8: ^( ACCESS_KW ALL )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:345:5: accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesLocal_in_accesClasse2756);
                    accesLocal345=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal345.getTree());

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:346:5: accesGlobal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesGlobal_in_accesClasse2762);
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:349:1: accesGlobal : ( typeObjet -> ^( ACCESS_KW typeObjet ) | interaction -> ^( ACCESS_KW interaction ) | PG NOT notAccess PD -> ^( ACCESS_KW NOT notAccess ) );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:349:13: ( typeObjet -> ^( ACCESS_KW typeObjet ) | interaction -> ^( ACCESS_KW interaction ) | PG NOT notAccess PD -> ^( ACCESS_KW NOT notAccess ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case CAMERA:
            case MEDIA:
            case COUNTER:
            case TIME:
                {
                alt96=1;
                }
                break;
            case ALLY:
            case ENEMY:
            case NEUTRAL:
                {
                alt96=2;
                }
                break;
            case PG:
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:350:3: typeObjet
                    {
                    pushFollow(FOLLOW_typeObjet_in_accesGlobal2775);
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
                    // 351:5: -> ^( ACCESS_KW typeObjet )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:351:8: ^( ACCESS_KW typeObjet )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:352:5: interaction
                    {
                    pushFollow(FOLLOW_interaction_in_accesGlobal2793);
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
                    // 353:5: -> ^( ACCESS_KW interaction )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:353:8: ^( ACCESS_KW interaction )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:354:5: PG NOT notAccess PD
                    {
                    PG349=(Token)match(input,PG,FOLLOW_PG_in_accesGlobal2811);  
                    stream_PG.add(PG349);

                    NOT350=(Token)match(input,NOT,FOLLOW_NOT_in_accesGlobal2813);  
                    stream_NOT.add(NOT350);

                    pushFollow(FOLLOW_notAccess_in_accesGlobal2815);
                    notAccess351=notAccess();

                    state._fsp--;

                    stream_notAccess.add(notAccess351.getTree());
                    PD352=(Token)match(input,PD,FOLLOW_PD_in_accesGlobal2817);  
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
                    // 355:5: -> ^( ACCESS_KW NOT notAccess )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:355:8: ^( ACCESS_KW NOT notAccess )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:358:1: notAccess : ( typeObjet | interaction | PLAYER );
    public final hightParser.notAccess_return notAccess() throws RecognitionException {
        hightParser.notAccess_return retval = new hightParser.notAccess_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER355=null;
        hightParser.typeObjet_return typeObjet353 = null;

        hightParser.interaction_return interaction354 = null;


        CommonTree PLAYER355_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:358:11: ( typeObjet | interaction | PLAYER )
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
            case PLAYER:
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:359:1: typeObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeObjet_in_notAccess2842);
                    typeObjet353=typeObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, typeObjet353.getTree());

                    }
                    break;
                case 2 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:359:13: interaction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_interaction_in_notAccess2846);
                    interaction354=interaction();

                    state._fsp--;

                    adaptor.addChild(root_0, interaction354.getTree());

                    }
                    break;
                case 3 :
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:359:27: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER355=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_notAccess2850); 
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:361:1: accesLocal : ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) );
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
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:361:12: ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) )
            int alt98=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt98=1;
                }
                break;
            case NUM:
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:362:3: IDENT
                    {
                    IDENT356=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2860);  
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
                    // 363:5: -> ^( ACCESS_KW IDENT )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:363:8: ^( ACCESS_KW IDENT )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:364:5: NUM operation IN IDENT
                    {
                    NUM357=(Token)match(input,NUM,FOLLOW_NUM_in_accesLocal2878);  
                    stream_NUM.add(NUM357);

                    pushFollow(FOLLOW_operation_in_accesLocal2880);
                    operation358=operation();

                    state._fsp--;

                    stream_operation.add(operation358.getTree());
                    IN359=(Token)match(input,IN,FOLLOW_IN_in_accesLocal2882);  
                    stream_IN.add(IN359);

                    IDENT360=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal2884);  
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
                    // 365:5: -> ^( ACCESS_KW IDENT operation )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:365:8: ^( ACCESS_KW IDENT operation )
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
                    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:366:5: PLAYER
                    {
                    PLAYER361=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal2904);  
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
                    // 367:5: -> ^( ACCESS_KW PLAYER )
                    {
                        // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:367:8: ^( ACCESS_KW PLAYER )
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:370:1: typeCoordonnees : ( POSITION | ORIENTATION | SIZE );
    public final hightParser.typeCoordonnees_return typeCoordonnees() throws RecognitionException {
        hightParser.typeCoordonnees_return retval = new hightParser.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set362=null;

        CommonTree set362_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:370:17: ( POSITION | ORIENTATION | SIZE )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:374:1: timeUnit : ( MIN | SEC | MS | FRAME );
    public final hightParser.timeUnit_return timeUnit() throws RecognitionException {
        hightParser.timeUnit_return retval = new hightParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set363=null;

        CommonTree set363_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:374:10: ( MIN | SEC | MS | FRAME )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:382:1: typeObjet : ( CAMERA | MEDIA | COUNTER | TIME );
    public final hightParser.typeObjet_return typeObjet() throws RecognitionException {
        hightParser.typeObjet_return retval = new hightParser.typeObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set364=null;

        CommonTree set364_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:382:11: ( CAMERA | MEDIA | COUNTER | TIME )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:389:1: attributTps : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final hightParser.attributTps_return attributTps() throws RecognitionException {
        hightParser.attributTps_return retval = new hightParser.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set365=null;

        CommonTree set365_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:389:13: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:395:1: attributListeOuObjet : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final hightParser.attributListeOuObjet_return attributListeOuObjet() throws RecognitionException {
        hightParser.attributListeOuObjet_return retval = new hightParser.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set366=null;

        CommonTree set366_tree=null;

        try {
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:395:22: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // H:\\M1\\PROJET\\svn\\compilation\\hight\\grammars\\hight.g:
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


 

    public static final BitSet FOLLOW_gameData_in_game235 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game237 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_newType_in_game243 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game245 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_init_in_game251 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game253 = new BitSet(new long[]{0x023C483000000000L,0x0000000000200000L,0x000180C000000040L});
    public static final BitSet FOLLOW_definition_in_game259 = new BitSet(new long[]{0x0200000010000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_FIN_in_game262 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_commande_in_game270 = new BitSet(new long[]{0x0200000010000000L,0x0002000000200000L});
    public static final BitSet FOLLOW_FIN_in_game273 = new BitSet(new long[]{0x0200000000000000L,0x0002000000200000L});
    public static final BitSet FOLLOW_reglesJeu_in_game281 = new BitSet(new long[]{0x0000000010000002L,0x0002000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game284 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_iaBasique_in_game292 = new BitSet(new long[]{0x0000000010000002L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_FIN_in_game295 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_GAME_in_gameData342 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_gameData344 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData346 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_gameData349 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData351 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame376 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame378 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame399 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame401 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_attributGame426 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame428 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_newType454 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_newType456 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_newType458 = new BitSet(new long[]{0x0000482000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_subType_in_newType460 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_AND_in_newType463 = new BitSet(new long[]{0x0000482000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_subType_in_newType465 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_IDENT_in_subType496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_subType501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_init518 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_init520 = new BitSet(new long[]{0x0002492000000000L});
    public static final BitSet FOLLOW_declarationObjet_in_init522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_init540 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_init542 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0xFFFE070000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_allocationObject_in_init544 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_init547 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0xFFFE070000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_allocationObject_in_init549 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_typeEntity_in_declarationObjet578 = new BitSet(new long[]{0x007C000000000002L});
    public static final BitSet FOLLOW_entityMode_in_declarationObjet580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet604 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_OF_in_declarationObjet607 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_declarationObjet610 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet615 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_WITH_in_declarationObjet619 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_declarationObjet622 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet627 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_CAMERA_in_declarationObjet656 = new BitSet(new long[]{0x0180200000000002L});
    public static final BitSet FOLLOW_view_in_declarationObjet659 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_declarationObjet690 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_declarationObjet726 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_entityMode774 = new BitSet(new long[]{0x007C000000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_interaction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject854 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AT_in_allocationObject857 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L,0x0000000000000018L});
    public static final BitSet FOLLOW_valAggregation_in_allocationObject859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeCoordonnees_in_allocationObject889 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject891 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_coordinates_in_allocationObject893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_allocationObject924 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject926 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributTps_in_allocationObject960 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject962 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_allocationObject964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_allocationObject966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_valAggregation1004 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_valAggregation1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_valAggregation1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1063 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_definition1066 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_MEANS_in_definition1068 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_definition1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1080 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_consequences1083 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequ_in_consequences1085 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_siAlors_in_consequ1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1159 = new BitSet(new long[]{0x8000000000000000L,0x00001CC000009010L});
    public static final BitSet FOLLOW_actionObjet_in_action1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action1166 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1187 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_action1195 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1205 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_STOP_KW_in_action1210 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1220 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_transformation_in_action1223 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_action1225 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesClasse_in_action1228 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_coordinates_in_action1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1236 = new BitSet(new long[]{0x0004002C00000000L,0x0000000000000000L,0x000000BC04000040L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1241 = new BitSet(new long[]{0x0004002C00000000L,0x0000000000000000L,0x000000BC04000040L});
    public static final BitSet FOLLOW_accesLocal_in_action1246 = new BitSet(new long[]{0x0002000200000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_action1250 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_IDENT_in_action1253 = new BitSet(new long[]{0x0002000200000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_action1257 = new BitSet(new long[]{0x0002000200000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_action1263 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ON_in_action1266 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_action1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_action1274 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_coordinates_in_action1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1284 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_action1287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_action1289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_action1291 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_action1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ENDWAIT_in_action1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1329 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_actionObjet1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1338 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1348 = new BitSet(new long[]{0x0004002000000000L,0x0000000000030000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_coordinates1400 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_coordinates1402 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_coordinates1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande1433 = new BitSet(new long[]{0x0004002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_IDENT_in_commande1437 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_commande1439 = new BitSet(new long[]{0x0004002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_PLAYER_in_commande1442 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_commande1445 = new BitSet(new long[]{0x0004002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1449 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_commande1452 = new BitSet(new long[]{0x0004002000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_actionCommande_in_commande1455 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_MOUSE_in_actionCommande1468 = new BitSet(new long[]{0x0000000000000000L,0x00000003FE000000L});
    public static final BitSet FOLLOW_souris_in_actionCommande1470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande1472 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_actionCommande1492 = new BitSet(new long[]{0x0000000000000000L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_clavier_in_actionCommande1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande1496 = new BitSet(new long[]{0x8000002000000000L,0x00001CC000000010L});
    public static final BitSet FOLLOW_actionCommandeType_in_actionCommande1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_actionCommandeType1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionCommandeType1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionCommandeType1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1643 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_actionCommandePressee1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_KW_in_actionCommandePressee1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1672 = new BitSet(new long[]{0x0000000000000000L,0x0000030018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande1730 = new BitSet(new long[]{0x0000000000000000L,0x0001800001400000L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande1735 = new BitSet(new long[]{0x0000000000000000L,0x0001800001400000L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_in_typeCommand1761 = new BitSet(new long[]{0x0000000000000002L,0x00000003FE000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand1764 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand1767 = new BitSet(new long[]{0x0000000000000000L,0x00000003FE000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand1769 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEY_in_typeCommand1796 = new BitSet(new long[]{0x0000000000000000L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand1798 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand1801 = new BitSet(new long[]{0x0000000000000000L,0x0000003C1E000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand1803 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu1838 = new BitSet(new long[]{0x183C483820000000L,0x0000000000000000L,0x000180FC00000040L});
    public static final BitSet FOLLOW_IDENT_in_reglesJeu1842 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_reglesJeu1844 = new BitSet(new long[]{0x183C483820000000L,0x0000000000000000L,0x000180FC00000040L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu1850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_reglesJeu1852 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_reglesJeu1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur1869 = new BitSet(new long[]{0x0000000000000000L,0x01B4000000001000L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declencheur1892 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declencheur1923 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1925 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declencheur1947 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur1949 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_playerOuInteraction_in_declencheur1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_playerOuInteraction2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_playerOuInteraction2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2017 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2022 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2028 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurTK2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurTK2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2048 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2053 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_BY_in_declencheurKT2058 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2063 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesGlobal_in_declencheurKT2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurKT2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2088 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditions_in_siAlors2091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_siAlors2093 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_siAlors2096 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_ELSE_in_siAlors2099 = new BitSet(new long[]{0x983C483020000000L,0x04006000000009F9L,0x000180C001E00040L});
    public static final BitSet FOLLOW_consequences_in_siAlors2102 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ENDIF_in_siAlors2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_conditions2121 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditionOu_in_conditions2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2151 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_OR_in_conditionOu2154 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2157 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_cond_in_conditionEt2172 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_AND_in_conditionEt2175 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_cond_in_conditionEt2178 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_etat_in_cond2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMP_in_cond2199 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_cond2202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_EQUALS_in_cond2205 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_INF_in_cond2210 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_SUP_in_cond2215 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_INFEG_in_cond2220 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_SUPED_in_cond2225 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_DIFF_in_cond2230 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_cond2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_cond2251 = new BitSet(new long[]{0x183C483020000000L,0xA000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_conditions_in_cond2253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PD_in_cond2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_etat2269 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_etat2271 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_NOT_in_etat2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2300 = new BitSet(new long[]{0x003C483000000000L,0x0040000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_OTHER_in_etat2305 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesGlobal_in_etat2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_etat2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_etat2333 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_etat2341 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x00000000001F8000L});
    public static final BitSet FOLLOW_NOT_in_etat2345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000001F8000L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_etat2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation2419 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation2424 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation2429 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_affectation2433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FOR_in_affectation2436 = new BitSet(new long[]{0x0000002800000000L,0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation2446 = new BitSet(new long[]{0x0000002800000000L,0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2449 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WITH_in_affectation2451 = new BitSet(new long[]{0x0000002800000000L,0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_variable_in_affectation2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique2467 = new BitSet(new long[]{0x003C483000000000L,0x0000000000000000L,0x000180C000000040L});
    public static final BitSet FOLLOW_accesClasse_in_iaBasique2470 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_iaBasique2472 = new BitSet(new long[]{0x8000000000000000L,0x00001CC000009010L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2475 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_iaBasique2478 = new BitSet(new long[]{0x8000000000000000L,0x00001CC000009010L});
    public static final BitSet FOLLOW_actionObjet_in_iaBasique2481 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_operationPlus_in_operation2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operation2503 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationPlus_in_operation2506 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_AND_in_operation2508 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationPlus_in_operation2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_PLUS_in_operationPlus2527 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_MINUS_in_operationPlus2532 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus2536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_operationPow_in_operationMul2549 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_MUL_in_operationMul2553 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_DIV_in_operationMul2558 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_MOD_in_operationMul2563 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationPow_in_operationMul2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2582 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_POW_in_operationPow2585 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C00000040L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_operationBracket2603 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_operationBracket2606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PD_in_operationBracket2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operationBracket2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operationBracket2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable2632 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Y_in_variable2637 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Z_in_variable2642 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable2649 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2651 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_variable2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable2660 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2662 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_variable2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_variable2684 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2686 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GAME_in_variable2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_variable2702 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2704 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0xFFFE070000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_attributTps_in_variable2706 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_variable2708 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_accesLocal_in_variable2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_accesClasse2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesGlobal_in_accesClasse2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_accesGlobal2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_accesGlobal2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_accesGlobal2811 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_NOT_in_accesGlobal2813 = new BitSet(new long[]{0x003C480000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_notAccess_in_accesGlobal2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PD_in_accesGlobal2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeObjet_in_notAccess2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interaction_in_notAccess2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_notAccess2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal2878 = new BitSet(new long[]{0x0000002C00000000L,0x0000000000000000L,0x0000003C04000040L});
    public static final BitSet FOLLOW_operation_in_accesLocal2880 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal2882 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeObjet0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}