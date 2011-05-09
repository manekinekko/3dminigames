// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g 2011-05-09 21:09:10

    package com.istic.mini3d.grammars;
    import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class highParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "ACCESS_KW", "KEY_KW", "MOUSE_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "TURNBASED_KW", "WORLD_KW", "GRIDSIZE_KW", "NAME_KW", "TEXTE", "GENERIC", "GRID", "RIBBON", "IDENT", "TYPE", "IS", "AND", "INSERT_KW", "IN", "NUM", "REMOVE_KW", "FROM", "LIST_KW", "OF", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "PLAYER", "SOLO", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DBP", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "NEXTURN_KW", "GRASPS_KW", "EXPELS_KW", "BY", "INGESTS_KW", "DIES_KW", "DURING", "UNTIL", "HAPPENS", "EQUIP", "NEXT", "PREVIOUS", "JUMP", "MOVE", "LEFT", "RIGHT", "FORWARD", "BACKWARD", "WUP", "WDOWN", "TURN", "CLOCKWISE", "ANTICLOCKWISE", "ACCELERATE", "BRAKE", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "FOR", "MOUSE", "KEY", "PRESSED_KW", "HELD_KW", "RELEASED_KW", "CLICK_LEFT", "CLICK_MIDDLE", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OWNES_KW", "NOTOWNES_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "OWNED_KW", "NOTOWNED_KW", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "CONTAINS_KW", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "WITH", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "DISTANCE_KW", "ANGLE_KW", "X", "Y", "Z", "SCORE", "VALUE", "ALL", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "RELOAD_KW", "TIME", "WS", "'true'", "'false'"
    };
    public static final int EOF=-1;
    public static final int T__222=222;
    public static final int T__223=223;
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
    public static final int TEXTE=39;
    public static final int GENERIC=40;
    public static final int GRID=41;
    public static final int RIBBON=42;
    public static final int IDENT=43;
    public static final int TYPE=44;
    public static final int IS=45;
    public static final int AND=46;
    public static final int INSERT_KW=47;
    public static final int IN=48;
    public static final int NUM=49;
    public static final int REMOVE_KW=50;
    public static final int FROM=51;
    public static final int LIST_KW=52;
    public static final int OF=53;
    public static final int CAMERA=54;
    public static final int PERSON=55;
    public static final int FREE=56;
    public static final int MEDIA=57;
    public static final int LOOP=58;
    public static final int ONCE=59;
    public static final int PLAYER=60;
    public static final int SOLO=61;
    public static final int DUPLICABLE=62;
    public static final int FIRST=63;
    public static final int THIRD=64;
    public static final int DEFINITION_KW=65;
    public static final int MEANS=66;
    public static final int VICTORY_KW=67;
    public static final int DBP=68;
    public static final int DEFEAT_KW=69;
    public static final int ENDS_KW=70;
    public static final int STARTS_KW=71;
    public static final int PAUSE_KW=72;
    public static final int MUTE_KW=73;
    public static final int ON=74;
    public static final int OFF=75;
    public static final int PLAY_KW=76;
    public static final int STOP_KW=77;
    public static final int BLOCK_KW=78;
    public static final int EFFACE_KW=79;
    public static final int GENERATE_KW=80;
    public static final int WAIT_KW=81;
    public static final int THEN=82;
    public static final int ENDWAIT=83;
    public static final int SAVE_KW=84;
    public static final int NEXTURN_KW=85;
    public static final int GRASPS_KW=86;
    public static final int EXPELS_KW=87;
    public static final int BY=88;
    public static final int INGESTS_KW=89;
    public static final int DIES_KW=90;
    public static final int DURING=91;
    public static final int UNTIL=92;
    public static final int HAPPENS=93;
    public static final int EQUIP=94;
    public static final int NEXT=95;
    public static final int PREVIOUS=96;
    public static final int JUMP=97;
    public static final int MOVE=98;
    public static final int LEFT=99;
    public static final int RIGHT=100;
    public static final int FORWARD=101;
    public static final int BACKWARD=102;
    public static final int WUP=103;
    public static final int WDOWN=104;
    public static final int TURN=105;
    public static final int CLOCKWISE=106;
    public static final int ANTICLOCKWISE=107;
    public static final int ACCELERATE=108;
    public static final int BRAKE=109;
    public static final int TRANSLATION=110;
    public static final int ROTATION=111;
    public static final int SCALE=112;
    public static final int COMMAND_KW=113;
    public static final int FOR=114;
    public static final int MOUSE=115;
    public static final int KEY=116;
    public static final int PRESSED_KW=117;
    public static final int HELD_KW=118;
    public static final int RELEASED_KW=119;
    public static final int CLICK_LEFT=120;
    public static final int CLICK_MIDDLE=121;
    public static final int CLICK_RIGHT=122;
    public static final int SCROLL_UP=123;
    public static final int SCROLL_DOWN=124;
    public static final int LETTER=125;
    public static final int SPACE=126;
    public static final int ESCAPE=127;
    public static final int ENTER=128;
    public static final int ACTIVATE_KW=129;
    public static final int DISABLE_KW=130;
    public static final int COMMANDS=131;
    public static final int KEYBOARD=132;
    public static final int RULE_KW=133;
    public static final int MOVES_KW=134;
    public static final int BECOMES=135;
    public static final int TOUCHES_KW=136;
    public static final int KILLS_KW=137;
    public static final int OWNES_KW=138;
    public static final int NOTOWNES_KW=139;
    public static final int OTHER=140;
    public static final int KILLED_KW=141;
    public static final int TOUCHED_KW=142;
    public static final int OWNED_KW=143;
    public static final int NOTOWNED_KW=144;
    public static final int IF_KW=145;
    public static final int ELSE=146;
    public static final int ENDIF=147;
    public static final int NOT=148;
    public static final int OR=149;
    public static final int COMP=150;
    public static final int EQUALS=151;
    public static final int INF=152;
    public static final int SUP=153;
    public static final int INFEG=154;
    public static final int SUPED=155;
    public static final int DIFF=156;
    public static final int PG=157;
    public static final int PD=158;
    public static final int CONTAINS_KW=159;
    public static final int DEAD_KW=160;
    public static final int ALIVE_KW=161;
    public static final int EFFACED_KW=162;
    public static final int GENERATED_KW=163;
    public static final int TOUCHING_KW=164;
    public static final int MOVING_KW=165;
    public static final int WAITING_KW=166;
    public static final int FINISHED_KW=167;
    public static final int STARTED_KW=168;
    public static final int PAUSED_KW=169;
    public static final int MUTED_KW=170;
    public static final int PLAYED_KW=171;
    public static final int STOPPED_KW=172;
    public static final int ASSIGN_KW=173;
    public static final int ADD_KW=174;
    public static final int SUB_KW=175;
    public static final int INVERT_KW=176;
    public static final int WITH=177;
    public static final int IA_KW=178;
    public static final int RANDOM_KW=179;
    public static final int BETWEEN=180;
    public static final int PLUS=181;
    public static final int MINUS=182;
    public static final int MUL=183;
    public static final int DIV=184;
    public static final int MOD=185;
    public static final int POW=186;
    public static final int DISTANCE_KW=187;
    public static final int ANGLE_KW=188;
    public static final int X=189;
    public static final int Y=190;
    public static final int Z=191;
    public static final int SCORE=192;
    public static final int VALUE=193;
    public static final int ALL=194;
    public static final int POSITION=195;
    public static final int ORIENTATION=196;
    public static final int SIZE=197;
    public static final int MIN=198;
    public static final int SEC=199;
    public static final int MS=200;
    public static final int FRAME=201;
    public static final int BOOST_INTERVAL=202;
    public static final int SHOOT_INTERVAL=203;
    public static final int RELOAD_TIME=204;
    public static final int INVENTORY=205;
    public static final int EQUIPED_OBJECT=206;
    public static final int ENTRANCES=207;
    public static final int EXITS=208;
    public static final int DAMAGE_ZONE=209;
    public static final int COLLECTORS=210;
    public static final int TYPES_COLLECTORS=211;
    public static final int GENERATORS=212;
    public static final int TYPE_GENERATORS=213;
    public static final int BREAKERS=214;
    public static final int TYPES_BREAKERS=215;
    public static final int TELEPORTABLES=216;
    public static final int TYPES_TELEPORTABLES=217;
    public static final int COMMENT=218;
    public static final int RELOAD_KW=219;
    public static final int TIME=220;
    public static final int WS=221;

    // delegates
    // delegators


        public highParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public highParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return highParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g"; }


        private List<String> errors = new LinkedList<String>();
        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            errors.add(hdr + " " + msg);
        }
        public List<String> getErrors() {
            return errors;
        }
         public void emitErrorMessage(String msg) {
            System.err.println("plop");
        }


    public static class game_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "game"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:62:1: game : ( gameData FIN )* ( newType FIN )* ( init FIN )+ ( definition FIN )* ( commande FIN )+ ( reglesJeu FIN )+ ( iaBasique FIN )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) ;
    public final highParser.game_return game() throws RecognitionException {
        highParser.game_return retval = new highParser.game_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FIN2=null;
        Token FIN4=null;
        Token FIN6=null;
        Token FIN8=null;
        Token FIN10=null;
        Token FIN12=null;
        Token FIN14=null;
        highParser.gameData_return gameData1 = null;

        highParser.newType_return newType3 = null;

        highParser.init_return init5 = null;

        highParser.definition_return definition7 = null;

        highParser.commande_return commande9 = null;

        highParser.reglesJeu_return reglesJeu11 = null;

        highParser.iaBasique_return iaBasique13 = null;


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
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:62:6: ( ( gameData FIN )* ( newType FIN )* ( init FIN )+ ( definition FIN )* ( commande FIN )+ ( reglesJeu FIN )+ ( iaBasique FIN )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:63:5: ( gameData FIN )* ( newType FIN )* ( init FIN )+ ( definition FIN )* ( commande FIN )+ ( reglesJeu FIN )+ ( iaBasique FIN )*
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:63:5: ( gameData FIN )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==GAME) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:63:6: gameData FIN
            	    {
            	    pushFollow(FOLLOW_gameData_in_game246);
            	    gameData1=gameData();

            	    state._fsp--;

            	    stream_gameData.add(gameData1.getTree());
            	    FIN2=(Token)match(input,FIN,FOLLOW_FIN_in_game248);  
            	    stream_FIN.add(FIN2);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:64:5: ( newType FIN )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:64:6: newType FIN
            	    {
            	    pushFollow(FOLLOW_newType_in_game257);
            	    newType3=newType();

            	    state._fsp--;

            	    stream_newType.add(newType3.getTree());
            	    FIN4=(Token)match(input,FIN,FOLLOW_FIN_in_game259);  
            	    stream_FIN.add(FIN4);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:65:5: ( init FIN )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENT||LA3_0==INSERT_KW||(LA3_0>=NUM && LA3_0<=REMOVE_KW)||LA3_0==PLAYER||LA3_0==ALL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:65:6: init FIN
            	    {
            	    pushFollow(FOLLOW_init_in_game268);
            	    init5=init();

            	    state._fsp--;

            	    stream_init.add(init5.getTree());
            	    FIN6=(Token)match(input,FIN,FOLLOW_FIN_in_game270);  
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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:66:5: ( definition FIN )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DEFINITION_KW) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:66:6: definition FIN
            	    {
            	    pushFollow(FOLLOW_definition_in_game280);
            	    definition7=definition();

            	    state._fsp--;

            	    stream_definition.add(definition7.getTree());
            	    FIN8=(Token)match(input,FIN,FOLLOW_FIN_in_game282);  
            	    stream_FIN.add(FIN8);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:67:5: ( commande FIN )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:67:6: commande FIN
            	    {
            	    pushFollow(FOLLOW_commande_in_game291);
            	    commande9=commande();

            	    state._fsp--;

            	    stream_commande.add(commande9.getTree());
            	    FIN10=(Token)match(input,FIN,FOLLOW_FIN_in_game293);  
            	    stream_FIN.add(FIN10);


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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:68:5: ( reglesJeu FIN )+
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
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:68:6: reglesJeu FIN
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game302);
            	    reglesJeu11=reglesJeu();

            	    state._fsp--;

            	    stream_reglesJeu.add(reglesJeu11.getTree());
            	    FIN12=(Token)match(input,FIN,FOLLOW_FIN_in_game304);  
            	    stream_FIN.add(FIN12);


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

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:69:5: ( iaBasique FIN )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IA_KW) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:69:6: iaBasique FIN
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game313);
            	    iaBasique13=iaBasique();

            	    state._fsp--;

            	    stream_iaBasique.add(iaBasique13.getTree());
            	    FIN14=(Token)match(input,FIN,FOLLOW_FIN_in_game315);  
            	    stream_FIN.add(FIN14);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



            // AST REWRITE
            // elements: iaBasique, commande, gameData, reglesJeu, init, newType, definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 70:7: -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:70:10: ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME_KW, "GAME_KW"), root_1);

                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:70:20: ( gameData )?
                if ( stream_gameData.hasNext() ) {
                    adaptor.addChild(root_1, stream_gameData.nextTree());

                }
                stream_gameData.reset();
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:70:30: ( newType )*
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
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:70:45: ( definition )*
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
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:70:78: ( iaBasique )*
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:74:1: gameData : GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) ;
    public final highParser.gameData_return gameData() throws RecognitionException {
        highParser.gameData_return retval = new highParser.gameData_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GAME15=null;
        Token HAS16=null;
        Token VIRG18=null;
        highParser.attributGame_return attributGame17 = null;

        highParser.attributGame_return attributGame19 = null;


        CommonTree GAME15_tree=null;
        CommonTree HAS16_tree=null;
        CommonTree VIRG18_tree=null;
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_attributGame=new RewriteRuleSubtreeStream(adaptor,"rule attributGame");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:74:10: ( GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:75:5: GAME HAS attributGame ( VIRG attributGame )*
            {
            GAME15=(Token)match(input,GAME,FOLLOW_GAME_in_gameData369);  
            stream_GAME.add(GAME15);

            HAS16=(Token)match(input,HAS,FOLLOW_HAS_in_gameData371);  
            stream_HAS.add(HAS16);

            pushFollow(FOLLOW_attributGame_in_gameData373);
            attributGame17=attributGame();

            state._fsp--;

            stream_attributGame.add(attributGame17.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:75:27: ( VIRG attributGame )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==VIRG) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:75:28: VIRG attributGame
            	    {
            	    VIRG18=(Token)match(input,VIRG,FOLLOW_VIRG_in_gameData376);  
            	    stream_VIRG.add(VIRG18);

            	    pushFollow(FOLLOW_attributGame_in_gameData378);
            	    attributGame19=attributGame();

            	    state._fsp--;

            	    stream_attributGame.add(attributGame19.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // 76:7: -> ^( GAME_ATTRIBUT_KW ( attributGame )+ )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:76:10: ^( GAME_ATTRIBUT_KW ( attributGame )+ )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:79:1: attributGame : ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | TURNBASED_KW AT ( 'true' | 'false' ) | WORLD_KW AT mapType | GRIDSIZE_KW AT FLOAT | NAME_KW AT TEXTE );
    public final highParser.attributGame_return attributGame() throws RecognitionException {
        highParser.attributGame_return retval = new highParser.attributGame_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GRAVITY_KW20=null;
        Token AT21=null;
        Token FLOAT22=null;
        Token FLOAT23=null;
        Token FLOAT24=null;
        Token FLOAT25=null;
        Token TURNBASED_KW26=null;
        Token AT27=null;
        Token set28=null;
        Token WORLD_KW29=null;
        Token AT30=null;
        Token GRIDSIZE_KW32=null;
        Token AT33=null;
        Token FLOAT34=null;
        Token NAME_KW35=null;
        Token AT36=null;
        Token TEXTE37=null;
        highParser.mapType_return mapType31 = null;


        CommonTree GRAVITY_KW20_tree=null;
        CommonTree AT21_tree=null;
        CommonTree FLOAT22_tree=null;
        CommonTree FLOAT23_tree=null;
        CommonTree FLOAT24_tree=null;
        CommonTree FLOAT25_tree=null;
        CommonTree TURNBASED_KW26_tree=null;
        CommonTree AT27_tree=null;
        CommonTree set28_tree=null;
        CommonTree WORLD_KW29_tree=null;
        CommonTree AT30_tree=null;
        CommonTree GRIDSIZE_KW32_tree=null;
        CommonTree AT33_tree=null;
        CommonTree FLOAT34_tree=null;
        CommonTree NAME_KW35_tree=null;
        CommonTree AT36_tree=null;
        CommonTree TEXTE37_tree=null;
        RewriteRuleTokenStream stream_GRAVITY_KW=new RewriteRuleTokenStream(adaptor,"token GRAVITY_KW");
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:79:14: ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | TURNBASED_KW AT ( 'true' | 'false' ) | WORLD_KW AT mapType | GRIDSIZE_KW AT FLOAT | NAME_KW AT TEXTE )
            int alt10=5;
            switch ( input.LA(1) ) {
            case GRAVITY_KW:
                {
                alt10=1;
                }
                break;
            case TURNBASED_KW:
                {
                alt10=2;
                }
                break;
            case WORLD_KW:
                {
                alt10=3;
                }
                break;
            case GRIDSIZE_KW:
                {
                alt10=4;
                }
                break;
            case NAME_KW:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:80:5: GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
                    {
                    GRAVITY_KW20=(Token)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame412);  
                    stream_GRAVITY_KW.add(GRAVITY_KW20);

                    AT21=(Token)match(input,AT,FOLLOW_AT_in_attributGame414);  
                    stream_AT.add(AT21);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:80:19: ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==FLOAT) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==FLOAT) ) {
                            alt9=2;
                        }
                        else if ( (LA9_1==FIN||LA9_1==VIRG) ) {
                            alt9=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:80:20: FLOAT
                            {
                            FLOAT22=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame417);  
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
                            // 81:7: -> ^( GRAVITY_KW FLOAT )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:81:10: ^( GRAVITY_KW FLOAT )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:82:7: FLOAT FLOAT FLOAT
                            {
                            FLOAT23=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame439);  
                            stream_FLOAT.add(FLOAT23);

                            FLOAT24=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame441);  
                            stream_FLOAT.add(FLOAT24);

                            FLOAT25=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame443);  
                            stream_FLOAT.add(FLOAT25);



                            // AST REWRITE
                            // elements: FLOAT, FLOAT, FLOAT, GRAVITY_KW
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 83:7: -> ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:83:10: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:84:7: TURNBASED_KW AT ( 'true' | 'false' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURNBASED_KW26=(Token)match(input,TURNBASED_KW,FOLLOW_TURNBASED_KW_in_attributGame471); 
                    TURNBASED_KW26_tree = (CommonTree)adaptor.create(TURNBASED_KW26);
                    root_0 = (CommonTree)adaptor.becomeRoot(TURNBASED_KW26_tree, root_0);

                    AT27=(Token)match(input,AT,FOLLOW_AT_in_attributGame474); 
                    set28=(Token)input.LT(1);
                    if ( (input.LA(1)>=222 && input.LA(1)<=223) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set28));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:85:7: WORLD_KW AT mapType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORLD_KW29=(Token)match(input,WORLD_KW,FOLLOW_WORLD_KW_in_attributGame489); 
                    WORLD_KW29_tree = (CommonTree)adaptor.create(WORLD_KW29);
                    root_0 = (CommonTree)adaptor.becomeRoot(WORLD_KW29_tree, root_0);

                    AT30=(Token)match(input,AT,FOLLOW_AT_in_attributGame492); 
                    pushFollow(FOLLOW_mapType_in_attributGame495);
                    mapType31=mapType();

                    state._fsp--;

                    adaptor.addChild(root_0, mapType31.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:86:7: GRIDSIZE_KW AT FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GRIDSIZE_KW32=(Token)match(input,GRIDSIZE_KW,FOLLOW_GRIDSIZE_KW_in_attributGame503); 
                    GRIDSIZE_KW32_tree = (CommonTree)adaptor.create(GRIDSIZE_KW32);
                    root_0 = (CommonTree)adaptor.becomeRoot(GRIDSIZE_KW32_tree, root_0);

                    AT33=(Token)match(input,AT,FOLLOW_AT_in_attributGame506); 
                    FLOAT34=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame509); 
                    FLOAT34_tree = (CommonTree)adaptor.create(FLOAT34);
                    adaptor.addChild(root_0, FLOAT34_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:87:7: NAME_KW AT TEXTE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NAME_KW35=(Token)match(input,NAME_KW,FOLLOW_NAME_KW_in_attributGame517); 
                    NAME_KW35_tree = (CommonTree)adaptor.create(NAME_KW35);
                    root_0 = (CommonTree)adaptor.becomeRoot(NAME_KW35_tree, root_0);

                    AT36=(Token)match(input,AT,FOLLOW_AT_in_attributGame521); 
                    TEXTE37=(Token)match(input,TEXTE,FOLLOW_TEXTE_in_attributGame524); 
                    TEXTE37_tree = (CommonTree)adaptor.create(TEXTE37);
                    adaptor.addChild(root_0, TEXTE37_tree);


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

    public static class mapType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapType"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:90:1: mapType : ( GENERIC | GRID | RIBBON );
    public final highParser.mapType_return mapType() throws RecognitionException {
        highParser.mapType_return retval = new highParser.mapType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set38=null;

        CommonTree set38_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:90:9: ( GENERIC | GRID | RIBBON )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set38=(Token)input.LT(1);
            if ( (input.LA(1)>=GENERIC && input.LA(1)<=RIBBON) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set38));
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
    // $ANTLR end "mapType"

    public static class name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:92:1: name : IDENT ;
    public final highParser.name_return name() throws RecognitionException {
        highParser.name_return retval = new highParser.name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT39=null;

        CommonTree IDENT39_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:92:6: ( IDENT )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:92:8: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT39=(Token)match(input,IDENT,FOLLOW_IDENT_in_name554); 
            IDENT39_tree = (CommonTree)adaptor.create(IDENT39);
            adaptor.addChild(root_0, IDENT39_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "name"

    public static class newType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newType"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:95:1: newType : TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) ;
    public final highParser.newType_return newType() throws RecognitionException {
        highParser.newType_return retval = new highParser.newType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE40=null;
        Token IDENT41=null;
        Token IS42=null;
        Token AND44=null;
        highParser.subType_return subType43 = null;

        highParser.subType_return subType45 = null;


        CommonTree TYPE40_tree=null;
        CommonTree IDENT41_tree=null;
        CommonTree IS42_tree=null;
        CommonTree AND44_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_subType=new RewriteRuleSubtreeStream(adaptor,"rule subType");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:95:9: ( TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:96:5: TYPE IDENT IS subType ( AND subType )*
            {
            TYPE40=(Token)match(input,TYPE,FOLLOW_TYPE_in_newType571);  
            stream_TYPE.add(TYPE40);

            IDENT41=(Token)match(input,IDENT,FOLLOW_IDENT_in_newType573);  
            stream_IDENT.add(IDENT41);

            IS42=(Token)match(input,IS,FOLLOW_IS_in_newType575);  
            stream_IS.add(IS42);

            pushFollow(FOLLOW_subType_in_newType577);
            subType43=subType();

            state._fsp--;

            stream_subType.add(subType43.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:96:27: ( AND subType )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:96:28: AND subType
            	    {
            	    AND44=(Token)match(input,AND,FOLLOW_AND_in_newType580);  
            	    stream_AND.add(AND44);

            	    pushFollow(FOLLOW_subType_in_newType582);
            	    subType45=subType();

            	    state._fsp--;

            	    stream_subType.add(subType45.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: TYPE, subType, subType, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:7: -> ^( TYPE IDENT subType ( subType )* )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:97:10: ^( TYPE IDENT subType ( subType )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_subType.nextTree());
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:97:31: ( subType )*
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:100:1: subType : IDENT ;
    public final highParser.subType_return subType() throws RecognitionException {
        highParser.subType_return retval = new highParser.subType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT46=null;

        CommonTree IDENT46_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:100:9: ( IDENT )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:101:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT46=(Token)match(input,IDENT,FOLLOW_IDENT_in_subType622); 
            IDENT46_tree = (CommonTree)adaptor.create(IDENT46);
            adaptor.addChild(root_0, IDENT46_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:107:1: init : ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) | INSERT_KW IDENT IN IDENT ( NUM operation )? | REMOVE_KW ( IDENT | NUM operation ) FROM IDENT );
    public final highParser.init_return init() throws RecognitionException {
        highParser.init_return retval = new highParser.init_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT47=null;
        Token IS48=null;
        Token HAS51=null;
        Token VIRG53=null;
        Token INSERT_KW55=null;
        Token IDENT56=null;
        Token IN57=null;
        Token IDENT58=null;
        Token NUM59=null;
        Token REMOVE_KW61=null;
        Token IDENT62=null;
        Token NUM63=null;
        Token FROM65=null;
        Token IDENT66=null;
        highParser.declarationObjet_return declarationObjet49 = null;

        highParser.accesClasse_return accesClasse50 = null;

        highParser.allocationObject_return allocationObject52 = null;

        highParser.allocationObject_return allocationObject54 = null;

        highParser.operation_return operation60 = null;

        highParser.operation_return operation64 = null;


        CommonTree IDENT47_tree=null;
        CommonTree IS48_tree=null;
        CommonTree HAS51_tree=null;
        CommonTree VIRG53_tree=null;
        CommonTree INSERT_KW55_tree=null;
        CommonTree IDENT56_tree=null;
        CommonTree IN57_tree=null;
        CommonTree IDENT58_tree=null;
        CommonTree NUM59_tree=null;
        CommonTree REMOVE_KW61_tree=null;
        CommonTree IDENT62_tree=null;
        CommonTree NUM63_tree=null;
        CommonTree FROM65_tree=null;
        CommonTree IDENT66_tree=null;
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_accesClasse=new RewriteRuleSubtreeStream(adaptor,"rule accesClasse");
        RewriteRuleSubtreeStream stream_allocationObject=new RewriteRuleSubtreeStream(adaptor,"rule allocationObject");
        RewriteRuleSubtreeStream stream_declarationObjet=new RewriteRuleSubtreeStream(adaptor,"rule declarationObjet");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:107:6: ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) | INSERT_KW IDENT IN IDENT ( NUM operation )? | REMOVE_KW ( IDENT | NUM operation ) FROM IDENT )
            int alt15=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==IS) ) {
                    alt15=1;
                }
                else if ( (LA15_1==HAS) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case NUM:
            case PLAYER:
            case ALL:
                {
                alt15=2;
                }
                break;
            case INSERT_KW:
                {
                alt15=3;
                }
                break;
            case REMOVE_KW:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:108:5: IDENT IS declarationObjet
                    {
                    IDENT47=(Token)match(input,IDENT,FOLLOW_IDENT_in_init647);  
                    stream_IDENT.add(IDENT47);

                    IS48=(Token)match(input,IS,FOLLOW_IS_in_init649);  
                    stream_IS.add(IS48);

                    pushFollow(FOLLOW_declarationObjet_in_init651);
                    declarationObjet49=declarationObjet();

                    state._fsp--;

                    stream_declarationObjet.add(declarationObjet49.getTree());


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
                    // 109:7: -> ^( INIT_IS_KW IDENT declarationObjet )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:109:10: ^( INIT_IS_KW IDENT declarationObjet )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:110:7: accesClasse HAS allocationObject ( VIRG allocationObject )*
                    {
                    pushFollow(FOLLOW_accesClasse_in_init675);
                    accesClasse50=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse50.getTree());
                    HAS51=(Token)match(input,HAS,FOLLOW_HAS_in_init677);  
                    stream_HAS.add(HAS51);

                    pushFollow(FOLLOW_allocationObject_in_init679);
                    allocationObject52=allocationObject();

                    state._fsp--;

                    stream_allocationObject.add(allocationObject52.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:110:40: ( VIRG allocationObject )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==VIRG) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:110:41: VIRG allocationObject
                    	    {
                    	    VIRG53=(Token)match(input,VIRG,FOLLOW_VIRG_in_init682);  
                    	    stream_VIRG.add(VIRG53);

                    	    pushFollow(FOLLOW_allocationObject_in_init684);
                    	    allocationObject54=allocationObject();

                    	    state._fsp--;

                    	    stream_allocationObject.add(allocationObject54.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: allocationObject, accesClasse
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 111:7: -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:111:10: ^( INIT_HAS_KW accesClasse ( allocationObject )+ )
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
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:112:7: INSERT_KW IDENT IN IDENT ( NUM operation )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSERT_KW55=(Token)match(input,INSERT_KW,FOLLOW_INSERT_KW_in_init712); 
                    INSERT_KW55_tree = (CommonTree)adaptor.create(INSERT_KW55);
                    root_0 = (CommonTree)adaptor.becomeRoot(INSERT_KW55_tree, root_0);

                    IDENT56=(Token)match(input,IDENT,FOLLOW_IDENT_in_init715); 
                    IDENT56_tree = (CommonTree)adaptor.create(IDENT56);
                    adaptor.addChild(root_0, IDENT56_tree);

                    IN57=(Token)match(input,IN,FOLLOW_IN_in_init717); 
                    IDENT58=(Token)match(input,IDENT,FOLLOW_IDENT_in_init720); 
                    IDENT58_tree = (CommonTree)adaptor.create(IDENT58);
                    adaptor.addChild(root_0, IDENT58_tree);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:112:34: ( NUM operation )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NUM) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:112:35: NUM operation
                            {
                            NUM59=(Token)match(input,NUM,FOLLOW_NUM_in_init723); 
                            pushFollow(FOLLOW_operation_in_init726);
                            operation60=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation60.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:113:7: REMOVE_KW ( IDENT | NUM operation ) FROM IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REMOVE_KW61=(Token)match(input,REMOVE_KW,FOLLOW_REMOVE_KW_in_init738); 
                    REMOVE_KW61_tree = (CommonTree)adaptor.create(REMOVE_KW61);
                    root_0 = (CommonTree)adaptor.becomeRoot(REMOVE_KW61_tree, root_0);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:113:18: ( IDENT | NUM operation )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==IDENT) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==NUM) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:113:19: IDENT
                            {
                            IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_init742); 
                            IDENT62_tree = (CommonTree)adaptor.create(IDENT62);
                            adaptor.addChild(root_0, IDENT62_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:113:25: NUM operation
                            {
                            NUM63=(Token)match(input,NUM,FOLLOW_NUM_in_init744); 
                            pushFollow(FOLLOW_operation_in_init747);
                            operation64=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation64.getTree());

                            }
                            break;

                    }

                    FROM65=(Token)match(input,FROM,FOLLOW_FROM_in_init750); 
                    IDENT66=(Token)match(input,IDENT,FOLLOW_IDENT_in_init753); 
                    IDENT66_tree = (CommonTree)adaptor.create(IDENT66);
                    adaptor.addChild(root_0, IDENT66_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:117:1: declarationObjet : ( IDENT ( dupli )? -> ^( DEC IDENT ( dupli )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) | -> ^( CAMERA_KW ON ) ) | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) | PLAYER ( SOLO )? );
    public final highParser.declarationObjet_return declarationObjet() throws RecognitionException {
        highParser.declarationObjet_return retval = new highParser.declarationObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT67=null;
        Token LIST_KW69=null;
        Token OF70=null;
        Token IDENT72=null;
        Token char_literal73=null;
        Token IDENT75=null;
        Token CAMERA76=null;
        Token PERSON78=null;
        Token FREE79=null;
        Token MEDIA80=null;
        Token LOOP81=null;
        Token ONCE82=null;
        Token IN83=null;
        Token IDENT84=null;
        Token PLAYER85=null;
        Token SOLO86=null;
        highParser.dupli_return dupli68 = null;

        highParser.operation_return operation71 = null;

        highParser.operation_return operation74 = null;

        highParser.view_return view77 = null;


        CommonTree IDENT67_tree=null;
        CommonTree LIST_KW69_tree=null;
        CommonTree OF70_tree=null;
        CommonTree IDENT72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree IDENT75_tree=null;
        CommonTree CAMERA76_tree=null;
        CommonTree PERSON78_tree=null;
        CommonTree FREE79_tree=null;
        CommonTree MEDIA80_tree=null;
        CommonTree LOOP81_tree=null;
        CommonTree ONCE82_tree=null;
        CommonTree IN83_tree=null;
        CommonTree IDENT84_tree=null;
        CommonTree PLAYER85_tree=null;
        CommonTree SOLO86_tree=null;
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
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_dupli=new RewriteRuleSubtreeStream(adaptor,"rule dupli");
        RewriteRuleSubtreeStream stream_view=new RewriteRuleSubtreeStream(adaptor,"rule view");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:117:18: ( IDENT ( dupli )? -> ^( DEC IDENT ( dupli )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) | -> ^( CAMERA_KW ON ) ) | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) | PLAYER ( SOLO )? )
            int alt24=6;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt24=1;
                }
                break;
            case LIST_KW:
                {
                alt24=2;
                }
                break;
            case CAMERA:
                {
                alt24=3;
                }
                break;
            case MEDIA:
                {
                alt24=4;
                }
                break;
            case IN:
                {
                alt24=5;
                }
                break;
            case PLAYER:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:118:5: IDENT ( dupli )?
                    {
                    IDENT67=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet771);  
                    stream_IDENT.add(IDENT67);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:118:11: ( dupli )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==DUPLICABLE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:118:11: dupli
                            {
                            pushFollow(FOLLOW_dupli_in_declarationObjet773);
                            dupli68=dupli();

                            state._fsp--;

                            stream_dupli.add(dupli68.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: dupli, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 119:7: -> ^( DEC IDENT ( dupli )? )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:119:10: ^( DEC IDENT ( dupli )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:119:22: ( dupli )?
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
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:7: LIST_KW ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )?
                    {
                    LIST_KW69=(Token)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet802);  
                    stream_LIST_KW.add(LIST_KW69);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:15: ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OF) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:16: OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )*
                            {
                            OF70=(Token)match(input,OF,FOLLOW_OF_in_declarationObjet805);  
                            stream_OF.add(OF70);

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:19: ( operation )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==FLOAT||LA17_0==PG||LA17_0==RANDOM_KW||(LA17_0>=DISTANCE_KW && LA17_0<=VALUE)) ) {
                                alt17=1;
                            }
                            else if ( (LA17_0==IDENT) ) {
                                int LA17_2 = input.LA(2);

                                if ( (LA17_2==OF) ) {
                                    alt17=1;
                                }
                            }
                            switch (alt17) {
                                case 1 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:20: operation
                                    {
                                    pushFollow(FOLLOW_operation_in_declarationObjet808);
                                    operation71=operation();

                                    state._fsp--;

                                    stream_operation.add(operation71.getTree());

                                    }
                                    break;

                            }

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:32: ( IDENT )
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:33: IDENT
                            {
                            IDENT72=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet813);  
                            stream_IDENT.add(IDENT72);


                            }

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:40: ( ',' ( operation )? ( IDENT ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==VIRG) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:41: ',' ( operation )? ( IDENT )
                            	    {
                            	    char_literal73=(Token)match(input,VIRG,FOLLOW_VIRG_in_declarationObjet817);  
                            	    stream_VIRG.add(char_literal73);

                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:45: ( operation )?
                            	    int alt18=2;
                            	    int LA18_0 = input.LA(1);

                            	    if ( (LA18_0==FLOAT||LA18_0==PG||LA18_0==RANDOM_KW||(LA18_0>=DISTANCE_KW && LA18_0<=VALUE)) ) {
                            	        alt18=1;
                            	    }
                            	    else if ( (LA18_0==IDENT) ) {
                            	        int LA18_2 = input.LA(2);

                            	        if ( (LA18_2==OF) ) {
                            	            alt18=1;
                            	        }
                            	    }
                            	    switch (alt18) {
                            	        case 1 :
                            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:46: operation
                            	            {
                            	            pushFollow(FOLLOW_operation_in_declarationObjet820);
                            	            operation74=operation();

                            	            state._fsp--;

                            	            stream_operation.add(operation74.getTree());

                            	            }
                            	            break;

                            	    }

                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:58: ( IDENT )
                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:120:59: IDENT
                            	    {
                            	    IDENT75=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet825);  
                            	    stream_IDENT.add(IDENT75);


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
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
                    // 121:7: -> ^( LIST_KW ( ( operation )? IDENT )+ )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:121:9: ^( LIST_KW ( ( operation )? IDENT )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LIST_KW.nextNode(), root_1);

                        if ( !(stream_IDENT.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_IDENT.hasNext() ) {
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:121:20: ( operation )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:122:7: CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) | -> ^( CAMERA_KW ON ) )
                    {
                    CAMERA76=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_declarationObjet860);  
                    stream_CAMERA.add(CAMERA76);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:122:14: ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) | -> ^( CAMERA_KW ON ) )
                    int alt21=3;
                    switch ( input.LA(1) ) {
                    case FIRST:
                    case THIRD:
                        {
                        alt21=1;
                        }
                        break;
                    case FREE:
                        {
                        alt21=2;
                        }
                        break;
                    case FIN:
                        {
                        alt21=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:122:15: view PERSON
                            {
                            pushFollow(FOLLOW_view_in_declarationObjet863);
                            view77=view();

                            state._fsp--;

                            stream_view.add(view77.getTree());
                            PERSON78=(Token)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet865);  
                            stream_PERSON.add(PERSON78);



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
                            // 122:27: -> ^( CAMERA_KW PERSON view )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:122:30: ^( CAMERA_KW PERSON view )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:122:57: FREE
                            {
                            FREE79=(Token)match(input,FREE,FOLLOW_FREE_in_declarationObjet879);  
                            stream_FREE.add(FREE79);



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
                            // 122:62: -> ^( CAMERA_KW FREE )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:122:65: ^( CAMERA_KW FREE )
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
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:122:85: 
                            {

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
                            // 122:85: -> ^( CAMERA_KW ON )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:122:87: ^( CAMERA_KW ON )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CAMERA_KW, "CAMERA_KW"), root_1);

                                adaptor.addChild(root_1, (CommonTree)adaptor.create(ON, "ON"));

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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:123:7: MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
                    {
                    MEDIA80=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_declarationObjet905);  
                    stream_MEDIA.add(MEDIA80);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:123:13: ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
                    int alt22=3;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==LOOP) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==ONCE) ) {
                        alt22=2;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:123:14: LOOP
                            {
                            LOOP81=(Token)match(input,LOOP,FOLLOW_LOOP_in_declarationObjet908);  
                            stream_LOOP.add(LOOP81);



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
                            // 123:19: -> ^( MEDIA_KW LOOP )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:123:21: ^( MEDIA_KW LOOP )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:123:40: ONCE
                            {
                            ONCE82=(Token)match(input,ONCE,FOLLOW_ONCE_in_declarationObjet919);  
                            stream_ONCE.add(ONCE82);



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
                            // 123:45: -> ^( MEDIA_KW ONCE )
                            {
                                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:123:47: ^( MEDIA_KW ONCE )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:124:7: IN IDENT
                    {
                    IN83=(Token)match(input,IN,FOLLOW_IN_in_declarationObjet944);  
                    stream_IN.add(IN83);

                    IDENT84=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet946);  
                    stream_IDENT.add(IDENT84);



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
                    // 124:16: -> ^( IN_KW IDENT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:124:19: ^( IN_KW IDENT )
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
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:125:7: PLAYER ( SOLO )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER85=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_declarationObjet962); 
                    PLAYER85_tree = (CommonTree)adaptor.create(PLAYER85);
                    adaptor.addChild(root_0, PLAYER85_tree);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:125:14: ( SOLO )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==SOLO) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:125:14: SOLO
                            {
                            SOLO86=(Token)match(input,SOLO,FOLLOW_SOLO_in_declarationObjet964); 
                            SOLO86_tree = (CommonTree)adaptor.create(SOLO86);
                            adaptor.addChild(root_0, SOLO86_tree);


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
    // $ANTLR end "declarationObjet"

    public static class typeEntity_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeEntity"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:128:1: typeEntity : IDENT ;
    public final highParser.typeEntity_return typeEntity() throws RecognitionException {
        highParser.typeEntity_return retval = new highParser.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT87=null;

        CommonTree IDENT87_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:128:12: ( IDENT )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:129:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT87=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeEntity992); 
            IDENT87_tree = (CommonTree)adaptor.create(IDENT87);
            adaptor.addChild(root_0, IDENT87_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    public static class dupli_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dupli"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:132:1: dupli : DUPLICABLE ;
    public final highParser.dupli_return dupli() throws RecognitionException {
        highParser.dupli_return retval = new highParser.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DUPLICABLE88=null;

        CommonTree DUPLICABLE88_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:132:7: ( DUPLICABLE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:133:5: DUPLICABLE
            {
            root_0 = (CommonTree)adaptor.nil();

            DUPLICABLE88=(Token)match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli1009); 
            DUPLICABLE88_tree = (CommonTree)adaptor.create(DUPLICABLE88);
            adaptor.addChild(root_0, DUPLICABLE88_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:136:1: view : ( FIRST | THIRD );
    public final highParser.view_return view() throws RecognitionException {
        highParser.view_return retval = new highParser.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set89=null;

        CommonTree set89_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:136:6: ( FIRST | THIRD )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set89=(Token)input.LT(1);
            if ( (input.LA(1)>=FIRST && input.LA(1)<=THIRD) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set89));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:141:1: allocationObject : ( ( IDENT | 'value' ) ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) );
    public final highParser.allocationObject_return allocationObject() throws RecognitionException {
        highParser.allocationObject_return retval = new highParser.allocationObject_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT90=null;
        Token string_literal91=null;
        Token AT92=null;
        Token AT95=null;
        Token AT98=null;
        Token IDENT99=null;
        Token AT101=null;
        highParser.valAggregation_return valAggregation93 = null;

        highParser.typeCoordonnees_return typeCoordonnees94 = null;

        highParser.coordinates_return coordinates96 = null;

        highParser.attributListeOuObjet_return attributListeOuObjet97 = null;

        highParser.attributTps_return attributTps100 = null;

        highParser.operation_return operation102 = null;

        highParser.timeUnit_return timeUnit103 = null;


        CommonTree IDENT90_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree AT92_tree=null;
        CommonTree AT95_tree=null;
        CommonTree AT98_tree=null;
        CommonTree IDENT99_tree=null;
        CommonTree AT101_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleSubtreeStream stream_valAggregation=new RewriteRuleSubtreeStream(adaptor,"rule valAggregation");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_attributListeOuObjet=new RewriteRuleSubtreeStream(adaptor,"rule attributListeOuObjet");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        RewriteRuleSubtreeStream stream_typeCoordonnees=new RewriteRuleSubtreeStream(adaptor,"rule typeCoordonnees");
        RewriteRuleSubtreeStream stream_coordinates=new RewriteRuleSubtreeStream(adaptor,"rule coordinates");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:141:18: ( ( IDENT | 'value' ) ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case IDENT:
            case VALUE:
                {
                alt27=1;
                }
                break;
            case POSITION:
            case ORIENTATION:
            case SIZE:
                {
                alt27=2;
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
                alt27=3;
                }
                break;
            case BOOST_INTERVAL:
            case SHOOT_INTERVAL:
            case RELOAD_TIME:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:142:5: ( IDENT | 'value' ) ( AT valAggregation )?
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:142:5: ( IDENT | 'value' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==IDENT) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==VALUE) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:142:6: IDENT
                            {
                            IDENT90=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject1053);  
                            stream_IDENT.add(IDENT90);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:142:14: 'value'
                            {
                            string_literal91=(Token)match(input,VALUE,FOLLOW_VALUE_in_allocationObject1057);  
                            stream_VALUE.add(string_literal91);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:142:23: ( AT valAggregation )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==AT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:142:24: AT valAggregation
                            {
                            AT92=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1061);  
                            stream_AT.add(AT92);

                            pushFollow(FOLLOW_valAggregation_in_allocationObject1063);
                            valAggregation93=valAggregation();

                            state._fsp--;

                            stream_valAggregation.add(valAggregation93.getTree());

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
                    // 143:7: -> ^( ALLOCATION_KW IDENT ( valAggregation )? )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:143:10: ^( ALLOCATION_KW IDENT ( valAggregation )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:143:33: ( valAggregation )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:144:7: typeCoordonnees AT coordinates
                    {
                    pushFollow(FOLLOW_typeCoordonnees_in_allocationObject1099);
                    typeCoordonnees94=typeCoordonnees();

                    state._fsp--;

                    stream_typeCoordonnees.add(typeCoordonnees94.getTree());
                    AT95=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1101);  
                    stream_AT.add(AT95);

                    pushFollow(FOLLOW_coordinates_in_allocationObject1103);
                    coordinates96=coordinates();

                    state._fsp--;

                    stream_coordinates.add(coordinates96.getTree());


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
                    // 145:7: -> ^( ALLOCATION_KW typeCoordonnees coordinates )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:145:10: ^( ALLOCATION_KW typeCoordonnees coordinates )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:146:7: attributListeOuObjet AT IDENT
                    {
                    pushFollow(FOLLOW_attributListeOuObjet_in_allocationObject1140);
                    attributListeOuObjet97=attributListeOuObjet();

                    state._fsp--;

                    stream_attributListeOuObjet.add(attributListeOuObjet97.getTree());
                    AT98=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1142);  
                    stream_AT.add(AT98);

                    IDENT99=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject1144);  
                    stream_IDENT.add(IDENT99);



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
                    // 147:7: -> ^( ALLOCATION_KW attributListeOuObjet IDENT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:147:10: ^( ALLOCATION_KW attributListeOuObjet IDENT )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:148:7: attributTps AT operation timeUnit
                    {
                    pushFollow(FOLLOW_attributTps_in_allocationObject1182);
                    attributTps100=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps100.getTree());
                    AT101=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1184);  
                    stream_AT.add(AT101);

                    pushFollow(FOLLOW_operation_in_allocationObject1186);
                    operation102=operation();

                    state._fsp--;

                    stream_operation.add(operation102.getTree());
                    pushFollow(FOLLOW_timeUnit_in_allocationObject1188);
                    timeUnit103=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit103.getTree());


                    // AST REWRITE
                    // elements: timeUnit, operation, attributTps
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 149:7: -> ^( ALLOCATION_KW attributTps operation timeUnit )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:149:10: ^( ALLOCATION_KW attributTps operation timeUnit )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:152:1: valAggregation : ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) | TEXTE -> ^( AGGREGATION_KW TEXTE ) | 'true' | 'false' );
    public final highParser.valAggregation_return valAggregation() throws RecognitionException {
        highParser.valAggregation_return retval = new highParser.valAggregation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT106=null;
        Token TEXTE107=null;
        Token string_literal108=null;
        Token string_literal109=null;
        highParser.operation_return operation104 = null;

        highParser.timeUnit_return timeUnit105 = null;


        CommonTree IDENT106_tree=null;
        CommonTree TEXTE107_tree=null;
        CommonTree string_literal108_tree=null;
        CommonTree string_literal109_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_TEXTE=new RewriteRuleTokenStream(adaptor,"token TEXTE");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:152:16: ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) | TEXTE -> ^( AGGREGATION_KW TEXTE ) | 'true' | 'false' )
            int alt29=5;
            switch ( input.LA(1) ) {
            case FLOAT:
            case PG:
            case RANDOM_KW:
            case DISTANCE_KW:
            case ANGLE_KW:
            case X:
            case Y:
            case Z:
            case SCORE:
            case VALUE:
                {
                alt29=1;
                }
                break;
            case IDENT:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==OF) ) {
                    alt29=1;
                }
                else if ( (LA29_2==FIN||LA29_2==VIRG) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case TEXTE:
                {
                alt29=3;
                }
                break;
            case 222:
                {
                alt29=4;
                }
                break;
            case 223:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:153:2: operation ( timeUnit )?
                    {
                    pushFollow(FOLLOW_operation_in_valAggregation1230);
                    operation104=operation();

                    state._fsp--;

                    stream_operation.add(operation104.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:153:12: ( timeUnit )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=MIN && LA28_0<=FRAME)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:153:13: timeUnit
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1233);
                            timeUnit105=timeUnit();

                            state._fsp--;

                            stream_timeUnit.add(timeUnit105.getTree());

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
                    // 154:4: -> ^( AGGREGATION_KW operation ( timeUnit )? )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:154:7: ^( AGGREGATION_KW operation ( timeUnit )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_operation.nextTree());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:154:34: ( timeUnit )?
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:155:4: IDENT
                    {
                    IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1255);  
                    stream_IDENT.add(IDENT106);



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
                    // 156:4: -> ^( AGGREGATION_KW IDENT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:156:7: ^( AGGREGATION_KW IDENT )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:157:11: TEXTE
                    {
                    TEXTE107=(Token)match(input,TEXTE,FOLLOW_TEXTE_in_valAggregation1278);  
                    stream_TEXTE.add(TEXTE107);



                    // AST REWRITE
                    // elements: TEXTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:11: -> ^( AGGREGATION_KW TEXTE )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:158:14: ^( AGGREGATION_KW TEXTE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_TEXTE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:159:4: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal108=(Token)match(input,222,FOLLOW_222_in_valAggregation1301); 
                    string_literal108_tree = (CommonTree)adaptor.create(string_literal108);
                    adaptor.addChild(root_0, string_literal108_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:160:4: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal109=(Token)match(input,223,FOLLOW_223_in_valAggregation1306); 
                    string_literal109_tree = (CommonTree)adaptor.create(string_literal109);
                    adaptor.addChild(root_0, string_literal109_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:164:1: definition : DEFINITION_KW IDENT MEANS consequences ;
    public final highParser.definition_return definition() throws RecognitionException {
        highParser.definition_return retval = new highParser.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINITION_KW110=null;
        Token IDENT111=null;
        Token MEANS112=null;
        highParser.consequences_return consequences113 = null;


        CommonTree DEFINITION_KW110_tree=null;
        CommonTree IDENT111_tree=null;
        CommonTree MEANS112_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:164:12: ( DEFINITION_KW IDENT MEANS consequences )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:164:14: DEFINITION_KW IDENT MEANS consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFINITION_KW110=(Token)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1319); 
            DEFINITION_KW110_tree = (CommonTree)adaptor.create(DEFINITION_KW110);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW110_tree, root_0);

            IDENT111=(Token)match(input,IDENT,FOLLOW_IDENT_in_definition1322); 
            IDENT111_tree = (CommonTree)adaptor.create(IDENT111);
            adaptor.addChild(root_0, IDENT111_tree);

            MEANS112=(Token)match(input,MEANS,FOLLOW_MEANS_in_definition1324); 
            pushFollow(FOLLOW_consequences_in_definition1327);
            consequences113=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences113.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:166:1: consequences : consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) ;
    public final highParser.consequences_return consequences() throws RecognitionException {
        highParser.consequences_return retval = new highParser.consequences_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG115=null;
        highParser.consequ_return consequ114 = null;

        highParser.consequ_return consequ116 = null;


        CommonTree VIRG115_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_consequ=new RewriteRuleSubtreeStream(adaptor,"rule consequ");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:166:14: ( consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:167:5: consequ ( VIRG consequ )*
            {
            pushFollow(FOLLOW_consequ_in_consequences1339);
            consequ114=consequ();

            state._fsp--;

            stream_consequ.add(consequ114.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:167:13: ( VIRG consequ )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==VIRG) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:167:14: VIRG consequ
            	    {
            	    VIRG115=(Token)match(input,VIRG,FOLLOW_VIRG_in_consequences1342);  
            	    stream_VIRG.add(VIRG115);

            	    pushFollow(FOLLOW_consequ_in_consequences1344);
            	    consequ116=consequ();

            	    state._fsp--;

            	    stream_consequ.add(consequ116.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // 168:7: -> ^( CONSEQUENCES_KW ( consequ )+ )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:168:9: ^( CONSEQUENCES_KW ( consequ )+ )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:171:1: consequ : ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW OF IDENT ( DBP IDENT )? | DEFEAT_KW OF IDENT ( DBP IDENT )? );
    public final highParser.consequ_return consequ() throws RecognitionException {
        highParser.consequ_return retval = new highParser.consequ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT121=null;
        Token VICTORY_KW122=null;
        Token OF123=null;
        Token IDENT124=null;
        Token DBP125=null;
        Token IDENT126=null;
        Token DEFEAT_KW127=null;
        Token OF128=null;
        Token IDENT129=null;
        Token DBP130=null;
        Token IDENT131=null;
        highParser.siAlors_return siAlors117 = null;

        highParser.action_return action118 = null;

        highParser.affectation_return affectation119 = null;

        highParser.activCommande_return activCommande120 = null;


        CommonTree IDENT121_tree=null;
        CommonTree VICTORY_KW122_tree=null;
        CommonTree OF123_tree=null;
        CommonTree IDENT124_tree=null;
        CommonTree DBP125_tree=null;
        CommonTree IDENT126_tree=null;
        CommonTree DEFEAT_KW127_tree=null;
        CommonTree OF128_tree=null;
        CommonTree IDENT129_tree=null;
        CommonTree DBP130_tree=null;
        CommonTree IDENT131_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:171:9: ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW OF IDENT ( DBP IDENT )? | DEFEAT_KW OF IDENT ( DBP IDENT )? )
            int alt33=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt33=1;
                }
                break;
            case GAME:
            case NUM:
            case PLAYER:
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
            case ALL:
                {
                alt33=2;
                }
                break;
            case IDENT:
                {
                int LA33_3 = input.LA(2);

                if ( ((LA33_3>=ENDS_KW && LA33_3<=PAUSE_KW)||(LA33_3>=GRASPS_KW && LA33_3<=EXPELS_KW)||(LA33_3>=INGESTS_KW && LA33_3<=DIES_KW)||LA33_3==EQUIP||(LA33_3>=JUMP && LA33_3<=MOVE)||LA33_3==TURN||(LA33_3>=ACCELERATE && LA33_3<=BRAKE)) ) {
                    alt33=2;
                }
                else if ( (LA33_3==FIN||LA33_3==VIRG||LA33_3==ENDWAIT||(LA33_3>=ELSE && LA33_3<=ENDIF)) ) {
                    alt33=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;
                }
                }
                break;
            case ASSIGN_KW:
            case ADD_KW:
            case SUB_KW:
            case INVERT_KW:
                {
                alt33=3;
                }
                break;
            case ACTIVATE_KW:
            case DISABLE_KW:
                {
                alt33=4;
                }
                break;
            case VICTORY_KW:
                {
                alt33=6;
                }
                break;
            case DEFEAT_KW:
                {
                alt33=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:172:5: siAlors
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_siAlors_in_consequ1378);
                    siAlors117=siAlors();

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors117.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:173:7: action
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_action_in_consequ1386);
                    action118=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action118.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:174:7: affectation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_consequ1394);
                    affectation119=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation119.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:175:7: activCommande
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_activCommande_in_consequ1402);
                    activCommande120=activCommande();

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande120.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:176:7: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT121=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1410); 
                    IDENT121_tree = (CommonTree)adaptor.create(IDENT121);
                    adaptor.addChild(root_0, IDENT121_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:177:7: VICTORY_KW OF IDENT ( DBP IDENT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW122=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1418); 
                    VICTORY_KW122_tree = (CommonTree)adaptor.create(VICTORY_KW122);
                    root_0 = (CommonTree)adaptor.becomeRoot(VICTORY_KW122_tree, root_0);

                    OF123=(Token)match(input,OF,FOLLOW_OF_in_consequ1421); 
                    IDENT124=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1424); 
                    IDENT124_tree = (CommonTree)adaptor.create(IDENT124);
                    adaptor.addChild(root_0, IDENT124_tree);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:177:29: ( DBP IDENT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==DBP) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:177:30: DBP IDENT
                            {
                            DBP125=(Token)match(input,DBP,FOLLOW_DBP_in_consequ1427); 
                            DBP125_tree = (CommonTree)adaptor.create(DBP125);
                            adaptor.addChild(root_0, DBP125_tree);

                            IDENT126=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1429); 
                            IDENT126_tree = (CommonTree)adaptor.create(IDENT126);
                            adaptor.addChild(root_0, IDENT126_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:178:7: DEFEAT_KW OF IDENT ( DBP IDENT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW127=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1439); 
                    DEFEAT_KW127_tree = (CommonTree)adaptor.create(DEFEAT_KW127);
                    root_0 = (CommonTree)adaptor.becomeRoot(DEFEAT_KW127_tree, root_0);

                    OF128=(Token)match(input,OF,FOLLOW_OF_in_consequ1442); 
                    IDENT129=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1445); 
                    IDENT129_tree = (CommonTree)adaptor.create(IDENT129);
                    adaptor.addChild(root_0, IDENT129_tree);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:178:28: ( DBP IDENT )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==DBP) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:178:29: DBP IDENT
                            {
                            DBP130=(Token)match(input,DBP,FOLLOW_DBP_in_consequ1448); 
                            DBP130_tree = (CommonTree)adaptor.create(DBP130);
                            adaptor.addChild(root_0, DBP130_tree);

                            IDENT131=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1450); 
                            IDENT131_tree = (CommonTree)adaptor.create(IDENT131);
                            adaptor.addChild(root_0, IDENT131_tree);


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
    // $ANTLR end "consequ"

    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:181:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )? | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW | NEXTURN_KW IDENT | IDENT GRASPS_KW IDENT | IDENT EXPELS_KW IDENT BY operation | IDENT INGESTS_KW IDENT IN IDENT );
    public final highParser.action_return action() throws RecognitionException {
        highParser.action_return retval = new highParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set134=null;
        Token ENDS_KW135=null;
        Token STARTS_KW136=null;
        Token PAUSE_KW137=null;
        Token char_literal138=null;
        Token IDENT139=null;
        Token PAUSE_KW140=null;
        Token MUTE_KW141=null;
        Token set142=null;
        Token PLAY_KW143=null;
        Token STOP_KW144=null;
        Token IDENT145=null;
        Token BLOCK_KW146=null;
        Token OF148=null;
        Token EFFACE_KW151=null;
        Token GENERATE_KW152=null;
        Token IN155=null;
        Token ON156=null;
        Token AT158=null;
        Token WAIT_KW160=null;
        Token THEN163=null;
        Token ENDWAIT165=null;
        Token SAVE_KW166=null;
        Token NEXTURN_KW167=null;
        Token IDENT168=null;
        Token IDENT169=null;
        Token GRASPS_KW170=null;
        Token IDENT171=null;
        Token IDENT172=null;
        Token EXPELS_KW173=null;
        Token IDENT174=null;
        Token BY175=null;
        Token IDENT177=null;
        Token INGESTS_KW178=null;
        Token IDENT179=null;
        Token IN180=null;
        Token IDENT181=null;
        highParser.accesClasse_return accesClasse132 = null;

        highParser.actionObjet_return actionObjet133 = null;

        highParser.transformation_return transformation147 = null;

        highParser.accesClasse_return accesClasse149 = null;

        highParser.coordinates_return coordinates150 = null;

        highParser.operation_return operation153 = null;

        highParser.accesLocal_return accesLocal154 = null;

        highParser.accesLocal_return accesLocal157 = null;

        highParser.coordinates_return coordinates159 = null;

        highParser.operation_return operation161 = null;

        highParser.timeUnit_return timeUnit162 = null;

        highParser.consequences_return consequences164 = null;

        highParser.operation_return operation176 = null;


        CommonTree set134_tree=null;
        CommonTree ENDS_KW135_tree=null;
        CommonTree STARTS_KW136_tree=null;
        CommonTree PAUSE_KW137_tree=null;
        CommonTree char_literal138_tree=null;
        CommonTree IDENT139_tree=null;
        CommonTree PAUSE_KW140_tree=null;
        CommonTree MUTE_KW141_tree=null;
        CommonTree set142_tree=null;
        CommonTree PLAY_KW143_tree=null;
        CommonTree STOP_KW144_tree=null;
        CommonTree IDENT145_tree=null;
        CommonTree BLOCK_KW146_tree=null;
        CommonTree OF148_tree=null;
        CommonTree EFFACE_KW151_tree=null;
        CommonTree GENERATE_KW152_tree=null;
        CommonTree IN155_tree=null;
        CommonTree ON156_tree=null;
        CommonTree AT158_tree=null;
        CommonTree WAIT_KW160_tree=null;
        CommonTree THEN163_tree=null;
        CommonTree ENDWAIT165_tree=null;
        CommonTree SAVE_KW166_tree=null;
        CommonTree NEXTURN_KW167_tree=null;
        CommonTree IDENT168_tree=null;
        CommonTree IDENT169_tree=null;
        CommonTree GRASPS_KW170_tree=null;
        CommonTree IDENT171_tree=null;
        CommonTree IDENT172_tree=null;
        CommonTree EXPELS_KW173_tree=null;
        CommonTree IDENT174_tree=null;
        CommonTree BY175_tree=null;
        CommonTree IDENT177_tree=null;
        CommonTree INGESTS_KW178_tree=null;
        CommonTree IDENT179_tree=null;
        CommonTree IN180_tree=null;
        CommonTree IDENT181_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:181:8: ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )? | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW | NEXTURN_KW IDENT | IDENT GRASPS_KW IDENT | IDENT EXPELS_KW IDENT BY operation | IDENT INGESTS_KW IDENT IN IDENT )
            int alt41=11;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:182:5: accesClasse actionObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_action1470);
                    accesClasse132=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse132.getTree());
                    pushFollow(FOLLOW_actionObjet_in_action1472);
                    actionObjet133=actionObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet133.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:183:7: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set134=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set134));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:183:22: ( ENDS_KW | STARTS_KW | PAUSE_KW )
                    int alt34=3;
                    switch ( input.LA(1) ) {
                    case ENDS_KW:
                        {
                        alt34=1;
                        }
                        break;
                    case STARTS_KW:
                        {
                        alt34=2;
                        }
                        break;
                    case PAUSE_KW:
                        {
                        alt34=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:183:23: ENDS_KW
                            {
                            ENDS_KW135=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1489); 
                            ENDS_KW135_tree = (CommonTree)adaptor.create(ENDS_KW135);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW135_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:183:34: STARTS_KW
                            {
                            STARTS_KW136=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1494); 
                            STARTS_KW136_tree = (CommonTree)adaptor.create(STARTS_KW136);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW136_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:183:47: PAUSE_KW
                            {
                            PAUSE_KW137=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1499); 
                            PAUSE_KW137_tree = (CommonTree)adaptor.create(PAUSE_KW137);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW137_tree, root_0);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:183:58: ( ':' IDENT )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==DBP) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:183:59: ':' IDENT
                            {
                            char_literal138=(Token)match(input,DBP,FOLLOW_DBP_in_action1504); 
                            char_literal138_tree = (CommonTree)adaptor.create(char_literal138);
                            adaptor.addChild(root_0, char_literal138_tree);

                            IDENT139=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1506); 
                            IDENT139_tree = (CommonTree)adaptor.create(IDENT139);
                            adaptor.addChild(root_0, IDENT139_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:184:7: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:184:7: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:184:8: PAUSE_KW
                            {
                            PAUSE_KW140=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1519); 
                            PAUSE_KW140_tree = (CommonTree)adaptor.create(PAUSE_KW140);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW140_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:184:20: MUTE_KW ( ON | OFF )
                            {
                            MUTE_KW141=(Token)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1524); 
                            MUTE_KW141_tree = (CommonTree)adaptor.create(MUTE_KW141);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTE_KW141_tree, root_0);

                            set142=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set142));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:184:42: PLAY_KW
                            {
                            PLAY_KW143=(Token)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1537); 
                            PLAY_KW143_tree = (CommonTree)adaptor.create(PLAY_KW143);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAY_KW143_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:184:53: STOP_KW
                            {
                            STOP_KW144=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_action1542); 
                            STOP_KW144_tree = (CommonTree)adaptor.create(STOP_KW144);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOP_KW144_tree, root_0);


                            }
                            break;

                    }

                    IDENT145=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1547); 
                    IDENT145_tree = (CommonTree)adaptor.create(IDENT145);
                    adaptor.addChild(root_0, IDENT145_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:185:7: BLOCK_KW transformation OF accesClasse coordinates
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLOCK_KW146=(Token)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1555); 
                    BLOCK_KW146_tree = (CommonTree)adaptor.create(BLOCK_KW146);
                    root_0 = (CommonTree)adaptor.becomeRoot(BLOCK_KW146_tree, root_0);

                    pushFollow(FOLLOW_transformation_in_action1558);
                    transformation147=transformation();

                    state._fsp--;

                    adaptor.addChild(root_0, transformation147.getTree());
                    OF148=(Token)match(input,OF,FOLLOW_OF_in_action1560); 
                    pushFollow(FOLLOW_accesClasse_in_action1563);
                    accesClasse149=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse149.getTree());
                    pushFollow(FOLLOW_coordinates_in_action1565);
                    coordinates150=coordinates();

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates150.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:7: ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:7: ( EFFACE_KW | GENERATE_KW )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:8: EFFACE_KW
                            {
                            EFFACE_KW151=(Token)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1574); 
                            EFFACE_KW151_tree = (CommonTree)adaptor.create(EFFACE_KW151);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACE_KW151_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:21: GENERATE_KW
                            {
                            GENERATE_KW152=(Token)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1579); 
                            GENERATE_KW152_tree = (CommonTree)adaptor.create(GENERATE_KW152);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATE_KW152_tree, root_0);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:35: ( ( operation )? accesLocal )
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:36: ( operation )? accesLocal
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:36: ( operation )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==FLOAT||LA38_0==PG||LA38_0==RANDOM_KW||(LA38_0>=DISTANCE_KW && LA38_0<=VALUE)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==IDENT) ) {
                        int LA38_2 = input.LA(2);

                        if ( (LA38_2==OF) ) {
                            alt38=1;
                        }
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:36: operation
                            {
                            pushFollow(FOLLOW_operation_in_action1584);
                            operation153=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation153.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesLocal_in_action1587);
                    accesLocal154=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal154.getTree());

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:59: ( ( IN | ON ) accesLocal | AT coordinates )?
                    int alt40=3;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==IN||LA40_0==ON) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==AT) ) {
                        alt40=2;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:60: ( IN | ON ) accesLocal
                            {
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:60: ( IN | ON )
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==IN) ) {
                                alt39=1;
                            }
                            else if ( (LA39_0==ON) ) {
                                alt39=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }
                            switch (alt39) {
                                case 1 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:61: IN
                                    {
                                    IN155=(Token)match(input,IN,FOLLOW_IN_in_action1592); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:65: ON
                                    {
                                    ON156=(Token)match(input,ON,FOLLOW_ON_in_action1595); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_action1599);
                            accesLocal157=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal157.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:186:83: AT coordinates
                            {
                            AT158=(Token)match(input,AT,FOLLOW_AT_in_action1603); 
                            pushFollow(FOLLOW_coordinates_in_action1606);
                            coordinates159=coordinates();

                            state._fsp--;

                            adaptor.addChild(root_0, coordinates159.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:187:7: WAIT_KW operation timeUnit THEN consequences ENDWAIT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAIT_KW160=(Token)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1617); 
                    WAIT_KW160_tree = (CommonTree)adaptor.create(WAIT_KW160);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAIT_KW160_tree, root_0);

                    pushFollow(FOLLOW_operation_in_action1620);
                    operation161=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation161.getTree());
                    pushFollow(FOLLOW_timeUnit_in_action1622);
                    timeUnit162=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit162.getTree());
                    THEN163=(Token)match(input,THEN,FOLLOW_THEN_in_action1624); 
                    pushFollow(FOLLOW_consequences_in_action1627);
                    consequences164=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences164.getTree());
                    ENDWAIT165=(Token)match(input,ENDWAIT,FOLLOW_ENDWAIT_in_action1629); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:188:7: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAVE_KW166=(Token)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1638); 
                    SAVE_KW166_tree = (CommonTree)adaptor.create(SAVE_KW166);
                    adaptor.addChild(root_0, SAVE_KW166_tree);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:189:7: NEXTURN_KW IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEXTURN_KW167=(Token)match(input,NEXTURN_KW,FOLLOW_NEXTURN_KW_in_action1646); 
                    NEXTURN_KW167_tree = (CommonTree)adaptor.create(NEXTURN_KW167);
                    root_0 = (CommonTree)adaptor.becomeRoot(NEXTURN_KW167_tree, root_0);

                    IDENT168=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1649); 
                    IDENT168_tree = (CommonTree)adaptor.create(IDENT168);
                    adaptor.addChild(root_0, IDENT168_tree);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:191:7: IDENT GRASPS_KW IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT169=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1705); 
                    IDENT169_tree = (CommonTree)adaptor.create(IDENT169);
                    adaptor.addChild(root_0, IDENT169_tree);

                    GRASPS_KW170=(Token)match(input,GRASPS_KW,FOLLOW_GRASPS_KW_in_action1707); 
                    GRASPS_KW170_tree = (CommonTree)adaptor.create(GRASPS_KW170);
                    root_0 = (CommonTree)adaptor.becomeRoot(GRASPS_KW170_tree, root_0);

                    IDENT171=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1710); 
                    IDENT171_tree = (CommonTree)adaptor.create(IDENT171);
                    adaptor.addChild(root_0, IDENT171_tree);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:192:7: IDENT EXPELS_KW IDENT BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT172=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1718); 
                    IDENT172_tree = (CommonTree)adaptor.create(IDENT172);
                    adaptor.addChild(root_0, IDENT172_tree);

                    EXPELS_KW173=(Token)match(input,EXPELS_KW,FOLLOW_EXPELS_KW_in_action1720); 
                    EXPELS_KW173_tree = (CommonTree)adaptor.create(EXPELS_KW173);
                    root_0 = (CommonTree)adaptor.becomeRoot(EXPELS_KW173_tree, root_0);

                    IDENT174=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1723); 
                    IDENT174_tree = (CommonTree)adaptor.create(IDENT174);
                    adaptor.addChild(root_0, IDENT174_tree);

                    BY175=(Token)match(input,BY,FOLLOW_BY_in_action1725); 
                    pushFollow(FOLLOW_operation_in_action1728);
                    operation176=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation176.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:193:7: IDENT INGESTS_KW IDENT IN IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT177=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1736); 
                    IDENT177_tree = (CommonTree)adaptor.create(IDENT177);
                    adaptor.addChild(root_0, IDENT177_tree);

                    INGESTS_KW178=(Token)match(input,INGESTS_KW,FOLLOW_INGESTS_KW_in_action1738); 
                    INGESTS_KW178_tree = (CommonTree)adaptor.create(INGESTS_KW178);
                    root_0 = (CommonTree)adaptor.becomeRoot(INGESTS_KW178_tree, root_0);

                    IDENT179=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1741); 
                    IDENT179_tree = (CommonTree)adaptor.create(IDENT179);
                    adaptor.addChild(root_0, IDENT179_tree);

                    IN180=(Token)match(input,IN,FOLLOW_IN_in_action1743); 
                    IDENT181=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1746); 
                    IDENT181_tree = (CommonTree)adaptor.create(IDENT181);
                    adaptor.addChild(root_0, IDENT181_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:197:1: actionObjet : ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions HAPPENS )? | EQUIP ( accesLocal | NEXT | PREVIOUS ) );
    public final highParser.actionObjet_return actionObjet() throws RecognitionException {
        highParser.actionObjet_return retval = new highParser.actionObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIES_KW182=null;
        Token DURING185=null;
        Token UNTIL188=null;
        Token HAPPENS190=null;
        Token EQUIP191=null;
        Token NEXT193=null;
        Token PREVIOUS194=null;
        highParser.actionCommandePressee_return actionCommandePressee183 = null;

        highParser.actionCommandeMaintenue_return actionCommandeMaintenue184 = null;

        highParser.operation_return operation186 = null;

        highParser.timeUnit_return timeUnit187 = null;

        highParser.conditions_return conditions189 = null;

        highParser.accesLocal_return accesLocal192 = null;


        CommonTree DIES_KW182_tree=null;
        CommonTree DURING185_tree=null;
        CommonTree UNTIL188_tree=null;
        CommonTree HAPPENS190_tree=null;
        CommonTree EQUIP191_tree=null;
        CommonTree NEXT193_tree=null;
        CommonTree PREVIOUS194_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:197:13: ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions HAPPENS )? | EQUIP ( accesLocal | NEXT | PREVIOUS ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case DIES_KW:
                {
                alt44=1;
                }
                break;
            case JUMP:
                {
                alt44=2;
                }
                break;
            case MOVE:
            case TURN:
            case ACCELERATE:
            case BRAKE:
                {
                alt44=3;
                }
                break;
            case EQUIP:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:198:5: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DIES_KW182=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1789); 
                    DIES_KW182_tree = (CommonTree)adaptor.create(DIES_KW182);
                    adaptor.addChild(root_0, DIES_KW182_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:199:7: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1797);
                    actionCommandePressee183=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee183.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:200:7: actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions HAPPENS )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1805);
                    actionCommandeMaintenue184=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue184.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:200:31: ( DURING operation timeUnit | UNTIL conditions HAPPENS )?
                    int alt42=3;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==DURING) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==UNTIL) ) {
                        alt42=2;
                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:200:32: DURING operation timeUnit
                            {
                            DURING185=(Token)match(input,DURING,FOLLOW_DURING_in_actionObjet1808); 
                            DURING185_tree = (CommonTree)adaptor.create(DURING185);
                            root_0 = (CommonTree)adaptor.becomeRoot(DURING185_tree, root_0);

                            pushFollow(FOLLOW_operation_in_actionObjet1811);
                            operation186=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation186.getTree());
                            pushFollow(FOLLOW_timeUnit_in_actionObjet1813);
                            timeUnit187=timeUnit();

                            state._fsp--;

                            adaptor.addChild(root_0, timeUnit187.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:200:61: UNTIL conditions HAPPENS
                            {
                            UNTIL188=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1817); 
                            UNTIL188_tree = (CommonTree)adaptor.create(UNTIL188);
                            root_0 = (CommonTree)adaptor.becomeRoot(UNTIL188_tree, root_0);

                            pushFollow(FOLLOW_conditions_in_actionObjet1820);
                            conditions189=conditions();

                            state._fsp--;

                            adaptor.addChild(root_0, conditions189.getTree());
                            HAPPENS190=(Token)match(input,HAPPENS,FOLLOW_HAPPENS_in_actionObjet1822); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:201:7: EQUIP ( accesLocal | NEXT | PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EQUIP191=(Token)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1833); 
                    EQUIP191_tree = (CommonTree)adaptor.create(EQUIP191);
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUIP191_tree, root_0);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:201:14: ( accesLocal | NEXT | PREVIOUS )
                    int alt43=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case NUM:
                    case PLAYER:
                        {
                        alt43=1;
                        }
                        break;
                    case NEXT:
                        {
                        alt43=2;
                        }
                        break;
                    case PREVIOUS:
                        {
                        alt43=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }

                    switch (alt43) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:201:15: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_actionObjet1837);
                            accesLocal192=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal192.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:201:28: NEXT
                            {
                            NEXT193=(Token)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1841); 
                            NEXT193_tree = (CommonTree)adaptor.create(NEXT193);
                            adaptor.addChild(root_0, NEXT193_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:201:35: PREVIOUS
                            {
                            PREVIOUS194=(Token)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1845); 
                            PREVIOUS194_tree = (CommonTree)adaptor.create(PREVIOUS194);
                            adaptor.addChild(root_0, PREVIOUS194_tree);


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

    public static class actionCommandePressee_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommandePressee"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:204:1: actionCommandePressee : JUMP operation ;
    public final highParser.actionCommandePressee_return actionCommandePressee() throws RecognitionException {
        highParser.actionCommandePressee_return retval = new highParser.actionCommandePressee_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token JUMP195=null;
        highParser.operation_return operation196 = null;


        CommonTree JUMP195_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:204:23: ( JUMP operation )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:205:5: JUMP operation
            {
            root_0 = (CommonTree)adaptor.nil();

            JUMP195=(Token)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1867); 
            JUMP195_tree = (CommonTree)adaptor.create(JUMP195);
            root_0 = (CommonTree)adaptor.becomeRoot(JUMP195_tree, root_0);

            pushFollow(FOLLOW_operation_in_actionCommandePressee1870);
            operation196=operation();

            state._fsp--;

            adaptor.addChild(root_0, operation196.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:208:1: actionCommandeMaintenue : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) BY operation | TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) BY operation | ACCELERATE BY operation | BRAKE BY operation );
    public final highParser.actionCommandeMaintenue_return actionCommandeMaintenue() throws RecognitionException {
        highParser.actionCommandeMaintenue_return retval = new highParser.actionCommandeMaintenue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVE197=null;
        Token set198=null;
        Token BY199=null;
        Token TURN201=null;
        Token set202=null;
        Token BY203=null;
        Token ACCELERATE205=null;
        Token BY206=null;
        Token BRAKE208=null;
        Token BY209=null;
        highParser.operation_return operation200 = null;

        highParser.operation_return operation204 = null;

        highParser.operation_return operation207 = null;

        highParser.operation_return operation210 = null;


        CommonTree MOVE197_tree=null;
        CommonTree set198_tree=null;
        CommonTree BY199_tree=null;
        CommonTree TURN201_tree=null;
        CommonTree set202_tree=null;
        CommonTree BY203_tree=null;
        CommonTree ACCELERATE205_tree=null;
        CommonTree BY206_tree=null;
        CommonTree BRAKE208_tree=null;
        CommonTree BY209_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:208:25: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) BY operation | TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) BY operation | ACCELERATE BY operation | BRAKE BY operation )
            int alt45=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt45=1;
                }
                break;
            case TURN:
                {
                alt45=2;
                }
                break;
            case ACCELERATE:
                {
                alt45=3;
                }
                break;
            case BRAKE:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:209:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MOVE197=(Token)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1887); 
                    MOVE197_tree = (CommonTree)adaptor.create(MOVE197);
                    root_0 = (CommonTree)adaptor.becomeRoot(MOVE197_tree, root_0);

                    set198=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=WDOWN) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set198));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    BY199=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1914); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1917);
                    operation200=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation200.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:210:5: TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURN201=(Token)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1923); 
                    TURN201_tree = (CommonTree)adaptor.create(TURN201);
                    root_0 = (CommonTree)adaptor.becomeRoot(TURN201_tree, root_0);

                    set202=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLOCKWISE && input.LA(1)<=ANTICLOCKWISE) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set202));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    BY203=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1950); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1953);
                    operation204=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation204.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:211:5: ACCELERATE BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACCELERATE205=(Token)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1959); 
                    ACCELERATE205_tree = (CommonTree)adaptor.create(ACCELERATE205);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACCELERATE205_tree, root_0);

                    BY206=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1962); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1965);
                    operation207=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation207.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:212:5: BRAKE BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BRAKE208=(Token)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1971); 
                    BRAKE208_tree = (CommonTree)adaptor.create(BRAKE208);
                    root_0 = (CommonTree)adaptor.becomeRoot(BRAKE208_tree, root_0);

                    BY209=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1974); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1977);
                    operation210=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation210.getTree());

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

    public static class transformation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "transformation"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:215:1: transformation : ( TRANSLATION | ROTATION | SCALE );
    public final highParser.transformation_return transformation() throws RecognitionException {
        highParser.transformation_return retval = new highParser.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set211=null;

        CommonTree set211_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:215:16: ( TRANSLATION | ROTATION | SCALE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set211=(Token)input.LT(1);
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set211));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:221:1: coordinates : operation operation operation -> ^( COORDINATE_KW operation operation operation ) ;
    public final highParser.coordinates_return coordinates() throws RecognitionException {
        highParser.coordinates_return retval = new highParser.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        highParser.operation_return operation212 = null;

        highParser.operation_return operation213 = null;

        highParser.operation_return operation214 = null;


        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:221:13: ( operation operation operation -> ^( COORDINATE_KW operation operation operation ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:222:5: operation operation operation
            {
            pushFollow(FOLLOW_operation_in_coordinates2026);
            operation212=operation();

            state._fsp--;

            stream_operation.add(operation212.getTree());
            pushFollow(FOLLOW_operation_in_coordinates2028);
            operation213=operation();

            state._fsp--;

            stream_operation.add(operation213.getTree());
            pushFollow(FOLLOW_operation_in_coordinates2030);
            operation214=operation();

            state._fsp--;

            stream_operation.add(operation214.getTree());


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
            // 223:7: -> ^( COORDINATE_KW operation operation operation )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:223:10: ^( COORDINATE_KW operation operation operation )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:228:1: commande : COMMAND_KW FOR player_list IS actionCommande ( VIRG actionCommande )* ;
    public final highParser.commande_return commande() throws RecognitionException {
        highParser.commande_return retval = new highParser.commande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMAND_KW215=null;
        Token FOR216=null;
        Token IS218=null;
        Token VIRG220=null;
        highParser.player_list_return player_list217 = null;

        highParser.actionCommande_return actionCommande219 = null;

        highParser.actionCommande_return actionCommande221 = null;


        CommonTree COMMAND_KW215_tree=null;
        CommonTree FOR216_tree=null;
        CommonTree IS218_tree=null;
        CommonTree VIRG220_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:228:10: ( COMMAND_KW FOR player_list IS actionCommande ( VIRG actionCommande )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:229:5: COMMAND_KW FOR player_list IS actionCommande ( VIRG actionCommande )*
            {
            root_0 = (CommonTree)adaptor.nil();

            COMMAND_KW215=(Token)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande2069); 
            COMMAND_KW215_tree = (CommonTree)adaptor.create(COMMAND_KW215);
            root_0 = (CommonTree)adaptor.becomeRoot(COMMAND_KW215_tree, root_0);

            FOR216=(Token)match(input,FOR,FOLLOW_FOR_in_commande2072); 
            pushFollow(FOLLOW_player_list_in_commande2075);
            player_list217=player_list();

            state._fsp--;

            adaptor.addChild(root_0, player_list217.getTree());
            IS218=(Token)match(input,IS,FOLLOW_IS_in_commande2077); 
            pushFollow(FOLLOW_actionCommande_in_commande2080);
            actionCommande219=actionCommande();

            state._fsp--;

            adaptor.addChild(root_0, actionCommande219.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:229:53: ( VIRG actionCommande )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==VIRG) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:229:54: VIRG actionCommande
            	    {
            	    VIRG220=(Token)match(input,VIRG,FOLLOW_VIRG_in_commande2083); 
            	    pushFollow(FOLLOW_actionCommande_in_commande2086);
            	    actionCommande221=actionCommande();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionCommande221.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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

    public static class player_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "player_list"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:232:1: player_list : IDENT ( VIRG IDENT )* ;
    public final highParser.player_list_return player_list() throws RecognitionException {
        highParser.player_list_return retval = new highParser.player_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT222=null;
        Token VIRG223=null;
        Token IDENT224=null;

        CommonTree IDENT222_tree=null;
        CommonTree VIRG223_tree=null;
        CommonTree IDENT224_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:232:12: ( IDENT ( VIRG IDENT )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:233:5: IDENT ( VIRG IDENT )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT222=(Token)match(input,IDENT,FOLLOW_IDENT_in_player_list2105); 
            IDENT222_tree = (CommonTree)adaptor.create(IDENT222);
            adaptor.addChild(root_0, IDENT222_tree);

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:233:11: ( VIRG IDENT )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==VIRG) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:233:12: VIRG IDENT
            	    {
            	    VIRG223=(Token)match(input,VIRG,FOLLOW_VIRG_in_player_list2108); 
            	    IDENT224=(Token)match(input,IDENT,FOLLOW_IDENT_in_player_list2111); 
            	    IDENT224_tree = (CommonTree)adaptor.create(IDENT224);
            	    adaptor.addChild(root_0, IDENT224_tree);


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
    // $ANTLR end "player_list"

    public static class actionCommande_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommande"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:236:1: actionCommande : ( MOUSE souris ( commandMode )? FOR definitionId -> ^( MOUSE_KW souris ( commandMode )? definitionId ) | KEY clavier ( commandMode )? FOR definitionId -> ^( KEY_KW clavier ( commandMode )? definitionId ) );
    public final highParser.actionCommande_return actionCommande() throws RecognitionException {
        highParser.actionCommande_return retval = new highParser.actionCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOUSE225=null;
        Token FOR228=null;
        Token KEY230=null;
        Token FOR233=null;
        highParser.souris_return souris226 = null;

        highParser.commandMode_return commandMode227 = null;

        highParser.definitionId_return definitionId229 = null;

        highParser.clavier_return clavier231 = null;

        highParser.commandMode_return commandMode232 = null;

        highParser.definitionId_return definitionId234 = null;


        CommonTree MOUSE225_tree=null;
        CommonTree FOR228_tree=null;
        CommonTree KEY230_tree=null;
        CommonTree FOR233_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_commandMode=new RewriteRuleSubtreeStream(adaptor,"rule commandMode");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        RewriteRuleSubtreeStream stream_definitionId=new RewriteRuleSubtreeStream(adaptor,"rule definitionId");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:236:16: ( MOUSE souris ( commandMode )? FOR definitionId -> ^( MOUSE_KW souris ( commandMode )? definitionId ) | KEY clavier ( commandMode )? FOR definitionId -> ^( KEY_KW clavier ( commandMode )? definitionId ) )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:237:5: MOUSE souris ( commandMode )? FOR definitionId
                    {
                    MOUSE225=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_actionCommande2130);  
                    stream_MOUSE.add(MOUSE225);

                    pushFollow(FOLLOW_souris_in_actionCommande2132);
                    souris226=souris();

                    state._fsp--;

                    stream_souris.add(souris226.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:237:18: ( commandMode )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=PRESSED_KW && LA48_0<=RELEASED_KW)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:237:19: commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2135);
                            commandMode227=commandMode();

                            state._fsp--;

                            stream_commandMode.add(commandMode227.getTree());

                            }
                            break;

                    }

                    FOR228=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande2139);  
                    stream_FOR.add(FOR228);

                    pushFollow(FOLLOW_definitionId_in_actionCommande2141);
                    definitionId229=definitionId();

                    state._fsp--;

                    stream_definitionId.add(definitionId229.getTree());


                    // AST REWRITE
                    // elements: commandMode, definitionId, souris
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:7: -> ^( MOUSE_KW souris ( commandMode )? definitionId )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:238:10: ^( MOUSE_KW souris ( commandMode )? definitionId )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        adaptor.addChild(root_1, stream_souris.nextTree());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:238:28: ( commandMode )?
                        if ( stream_commandMode.hasNext() ) {
                            adaptor.addChild(root_1, stream_commandMode.nextTree());

                        }
                        stream_commandMode.reset();
                        adaptor.addChild(root_1, stream_definitionId.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:239:7: KEY clavier ( commandMode )? FOR definitionId
                    {
                    KEY230=(Token)match(input,KEY,FOLLOW_KEY_in_actionCommande2170);  
                    stream_KEY.add(KEY230);

                    pushFollow(FOLLOW_clavier_in_actionCommande2172);
                    clavier231=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier231.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:239:19: ( commandMode )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=PRESSED_KW && LA49_0<=RELEASED_KW)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:239:20: commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2175);
                            commandMode232=commandMode();

                            state._fsp--;

                            stream_commandMode.add(commandMode232.getTree());

                            }
                            break;

                    }

                    FOR233=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande2179);  
                    stream_FOR.add(FOR233);

                    pushFollow(FOLLOW_definitionId_in_actionCommande2181);
                    definitionId234=definitionId();

                    state._fsp--;

                    stream_definitionId.add(definitionId234.getTree());


                    // AST REWRITE
                    // elements: commandMode, clavier, definitionId
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 240:7: -> ^( KEY_KW clavier ( commandMode )? definitionId )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:240:10: ^( KEY_KW clavier ( commandMode )? definitionId )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEY_KW, "KEY_KW"), root_1);

                        adaptor.addChild(root_1, stream_clavier.nextTree());
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:240:27: ( commandMode )?
                        if ( stream_commandMode.hasNext() ) {
                            adaptor.addChild(root_1, stream_commandMode.nextTree());

                        }
                        stream_commandMode.reset();
                        adaptor.addChild(root_1, stream_definitionId.nextTree());

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

    public static class commandMode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commandMode"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:243:1: commandMode : ( PRESSED_KW | HELD_KW | RELEASED_KW );
    public final highParser.commandMode_return commandMode() throws RecognitionException {
        highParser.commandMode_return retval = new highParser.commandMode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set235=null;

        CommonTree set235_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:243:13: ( PRESSED_KW | HELD_KW | RELEASED_KW )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set235=(Token)input.LT(1);
            if ( (input.LA(1)>=PRESSED_KW && input.LA(1)<=RELEASED_KW) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set235));
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
    // $ANTLR end "commandMode"

    public static class definitionId_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definitionId"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:247:1: definitionId : IDENT ;
    public final highParser.definitionId_return definitionId() throws RecognitionException {
        highParser.definitionId_return retval = new highParser.definitionId_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT236=null;

        CommonTree IDENT236_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:247:14: ( IDENT )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:248:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT236=(Token)match(input,IDENT,FOLLOW_IDENT_in_definitionId2245); 
            IDENT236_tree = (CommonTree)adaptor.create(IDENT236);
            adaptor.addChild(root_0, IDENT236_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "definitionId"

    public static class souris_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "souris"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:251:1: souris : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final highParser.souris_return souris() throws RecognitionException {
        highParser.souris_return retval = new highParser.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set237=null;

        CommonTree set237_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:251:8: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set237=(Token)input.LT(1);
            if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLICK_LEFT && input.LA(1)<=SCROLL_DOWN) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set237));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:255:1: clavier : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final highParser.clavier_return clavier() throws RecognitionException {
        highParser.clavier_return retval = new highParser.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set238=null;

        CommonTree set238_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:255:9: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set238=(Token)input.LT(1);
            if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set238));
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

    public static class activCommande_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activCommande"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:259:1: activCommande : ( ACTIVATE_KW | DISABLE_KW ) typeCommand ;
    public final highParser.activCommande_return activCommande() throws RecognitionException {
        highParser.activCommande_return retval = new highParser.activCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ACTIVATE_KW239=null;
        Token DISABLE_KW240=null;
        highParser.typeCommand_return typeCommand241 = null;


        CommonTree ACTIVATE_KW239_tree=null;
        CommonTree DISABLE_KW240_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:259:15: ( ( ACTIVATE_KW | DISABLE_KW ) typeCommand )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:260:5: ( ACTIVATE_KW | DISABLE_KW ) typeCommand
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:260:5: ( ACTIVATE_KW | DISABLE_KW )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:260:6: ACTIVATE_KW
                    {
                    ACTIVATE_KW239=(Token)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande2371); 
                    ACTIVATE_KW239_tree = (CommonTree)adaptor.create(ACTIVATE_KW239);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW239_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:260:21: DISABLE_KW
                    {
                    DISABLE_KW240=(Token)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande2376); 
                    DISABLE_KW240_tree = (CommonTree)adaptor.create(DISABLE_KW240);
                    root_0 = (CommonTree)adaptor.becomeRoot(DISABLE_KW240_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeCommand_in_activCommande2380);
            typeCommand241=typeCommand();

            state._fsp--;

            adaptor.addChild(root_0, typeCommand241.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:263:1: typeCommand : ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD );
    public final highParser.typeCommand_return typeCommand() throws RecognitionException {
        highParser.typeCommand_return retval = new highParser.typeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMANDS242=null;
        Token MOUSE243=null;
        Token VIRG245=null;
        Token KEY247=null;
        Token VIRG249=null;
        Token KEYBOARD251=null;
        highParser.souris_return souris244 = null;

        highParser.souris_return souris246 = null;

        highParser.clavier_return clavier248 = null;

        highParser.clavier_return clavier250 = null;


        CommonTree COMMANDS242_tree=null;
        CommonTree MOUSE243_tree=null;
        CommonTree VIRG245_tree=null;
        CommonTree KEY247_tree=null;
        CommonTree VIRG249_tree=null;
        CommonTree KEYBOARD251_tree=null;
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:263:13: ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD )
            int alt55=4;
            switch ( input.LA(1) ) {
            case COMMANDS:
                {
                alt55=1;
                }
                break;
            case MOUSE:
                {
                alt55=2;
                }
                break;
            case KEY:
                {
                alt55=3;
                }
                break;
            case KEYBOARD:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:264:5: COMMANDS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMMANDS242=(Token)match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand2397); 
                    COMMANDS242_tree = (CommonTree)adaptor.create(COMMANDS242);
                    adaptor.addChild(root_0, COMMANDS242_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:265:7: MOUSE ( souris ( VIRG souris )* )?
                    {
                    MOUSE243=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_typeCommand2405);  
                    stream_MOUSE.add(MOUSE243);

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:265:13: ( souris ( VIRG souris )* )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=LEFT && LA53_0<=RIGHT)||(LA53_0>=WUP && LA53_0<=WDOWN)||(LA53_0>=CLICK_LEFT && LA53_0<=SCROLL_DOWN)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:265:14: souris ( VIRG souris )*
                            {
                            pushFollow(FOLLOW_souris_in_typeCommand2408);
                            souris244=souris();

                            state._fsp--;

                            stream_souris.add(souris244.getTree());
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:265:21: ( VIRG souris )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==VIRG) ) {
                                    int LA52_1 = input.LA(2);

                                    if ( ((LA52_1>=LEFT && LA52_1<=RIGHT)||(LA52_1>=WUP && LA52_1<=WDOWN)||(LA52_1>=CLICK_LEFT && LA52_1<=SCROLL_DOWN)) ) {
                                        alt52=1;
                                    }


                                }


                                switch (alt52) {
                            	case 1 :
                            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:265:22: VIRG souris
                            	    {
                            	    VIRG245=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand2411);  
                            	    stream_VIRG.add(VIRG245);

                            	    pushFollow(FOLLOW_souris_in_typeCommand2413);
                            	    souris246=souris();

                            	    state._fsp--;

                            	    stream_souris.add(souris246.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop52;
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
                    // 266:7: -> ^( MOUSE_KW ( souris )* )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:266:10: ^( MOUSE_KW ( souris )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:266:21: ( souris )*
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:267:7: KEY clavier ( VIRG clavier )*
                    {
                    KEY247=(Token)match(input,KEY,FOLLOW_KEY_in_typeCommand2440);  
                    stream_KEY.add(KEY247);

                    pushFollow(FOLLOW_clavier_in_typeCommand2442);
                    clavier248=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier248.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:267:19: ( VIRG clavier )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==VIRG) ) {
                            int LA54_1 = input.LA(2);

                            if ( ((LA54_1>=LEFT && LA54_1<=RIGHT)||(LA54_1>=WUP && LA54_1<=WDOWN)||(LA54_1>=LETTER && LA54_1<=ENTER)) ) {
                                alt54=1;
                            }


                        }


                        switch (alt54) {
                    	case 1 :
                    	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:267:20: VIRG clavier
                    	    {
                    	    VIRG249=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand2445);  
                    	    stream_VIRG.add(VIRG249);

                    	    pushFollow(FOLLOW_clavier_in_typeCommand2447);
                    	    clavier250=clavier();

                    	    state._fsp--;

                    	    stream_clavier.add(clavier250.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
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
                    // 268:7: -> ^( KEY_KW ( clavier )+ )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:268:10: ^( KEY_KW ( clavier )+ )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:269:7: KEYBOARD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KEYBOARD251=(Token)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand2472); 
                    KEYBOARD251_tree = (CommonTree)adaptor.create(KEYBOARD251);
                    adaptor.addChild(root_0, KEYBOARD251_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:271:1: reglesJeu : RULE_KW declencheur THEN definitionId ;
    public final highParser.reglesJeu_return reglesJeu() throws RecognitionException {
        highParser.reglesJeu_return retval = new highParser.reglesJeu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RULE_KW252=null;
        Token THEN254=null;
        highParser.declencheur_return declencheur253 = null;

        highParser.definitionId_return definitionId255 = null;


        CommonTree RULE_KW252_tree=null;
        CommonTree THEN254_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:271:11: ( RULE_KW declencheur THEN definitionId )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:272:5: RULE_KW declencheur THEN definitionId
            {
            root_0 = (CommonTree)adaptor.nil();

            RULE_KW252=(Token)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu2484); 
            RULE_KW252_tree = (CommonTree)adaptor.create(RULE_KW252);
            root_0 = (CommonTree)adaptor.becomeRoot(RULE_KW252_tree, root_0);

            pushFollow(FOLLOW_declencheur_in_reglesJeu2487);
            declencheur253=declencheur();

            state._fsp--;

            adaptor.addChild(root_0, declencheur253.getTree());
            THEN254=(Token)match(input,THEN,FOLLOW_THEN_in_reglesJeu2489); 
            pushFollow(FOLLOW_definitionId_in_reglesJeu2492);
            definitionId255=definitionId();

            state._fsp--;

            adaptor.addChild(root_0, definitionId255.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:275:1: declencheur : ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | VICTORY_KW OF ( PLAYER | IDENT ) | DEFEAT_KW OF ( PLAYER | IDENT ) );
    public final highParser.declencheur_return declencheur() throws RecognitionException {
        highParser.declencheur_return retval = new highParser.declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVES_KW257=null;
        Token DIES_KW258=null;
        Token set261=null;
        Token ENDS_KW262=null;
        Token STARTS_KW263=null;
        Token BECOMES265=null;
        Token VICTORY_KW267=null;
        Token OF268=null;
        Token set269=null;
        Token DEFEAT_KW270=null;
        Token OF271=null;
        Token set272=null;
        highParser.accesClasse_return accesClasse256 = null;

        highParser.declencheurTK_return declencheurTK259 = null;

        highParser.declencheurKT_return declencheurKT260 = null;

        highParser.variable_return variable264 = null;

        highParser.varOuNB_return varOuNB266 = null;


        CommonTree MOVES_KW257_tree=null;
        CommonTree DIES_KW258_tree=null;
        CommonTree set261_tree=null;
        CommonTree ENDS_KW262_tree=null;
        CommonTree STARTS_KW263_tree=null;
        CommonTree BECOMES265_tree=null;
        CommonTree VICTORY_KW267_tree=null;
        CommonTree OF268_tree=null;
        CommonTree set269_tree=null;
        CommonTree DEFEAT_KW270_tree=null;
        CommonTree OF271_tree=null;
        CommonTree set272_tree=null;
        RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
        RewriteRuleSubtreeStream stream_varOuNB=new RewriteRuleSubtreeStream(adaptor,"rule varOuNB");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:275:13: ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | VICTORY_KW OF ( PLAYER | IDENT ) | DEFEAT_KW OF ( PLAYER | IDENT ) )
            int alt58=5;
            switch ( input.LA(1) ) {
            case NUM:
            case PLAYER:
            case ALL:
                {
                alt58=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case OF:
                    {
                    alt58=3;
                    }
                    break;
                case DIES_KW:
                case MOVES_KW:
                case TOUCHES_KW:
                case KILLS_KW:
                case OWNES_KW:
                case NOTOWNES_KW:
                case KILLED_KW:
                case TOUCHED_KW:
                case OWNED_KW:
                case NOTOWNED_KW:
                    {
                    alt58=1;
                    }
                    break;
                case ENDS_KW:
                case STARTS_KW:
                    {
                    alt58=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;
                }

                }
                break;
            case GAME:
                {
                alt58=2;
                }
                break;
            case X:
            case Y:
            case Z:
            case SCORE:
            case VALUE:
                {
                alt58=3;
                }
                break;
            case VICTORY_KW:
                {
                alt58=4;
                }
                break;
            case DEFEAT_KW:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:276:5: accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_declencheur2510);
                    accesClasse256=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse256.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:276:17: ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:276:18: MOVES_KW
                            {
                            MOVES_KW257=(Token)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur2513); 
                            MOVES_KW257_tree = (CommonTree)adaptor.create(MOVES_KW257);
                            adaptor.addChild(root_0, MOVES_KW257_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:276:29: DIES_KW
                            {
                            DIES_KW258=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur2517); 
                            DIES_KW258_tree = (CommonTree)adaptor.create(DIES_KW258);
                            adaptor.addChild(root_0, DIES_KW258_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:276:39: declencheurTK
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur2521);
                            declencheurTK259=declencheurTK();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK259.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:276:55: declencheurKT
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur2525);
                            declencheurKT260=declencheurKT();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT260.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:277:7: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set261=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set261));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:277:22: ( ENDS_KW | STARTS_KW )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==ENDS_KW) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==STARTS_KW) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:277:23: ENDS_KW
                            {
                            ENDS_KW262=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur2543); 
                            ENDS_KW262_tree = (CommonTree)adaptor.create(ENDS_KW262);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW262_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:277:33: STARTS_KW
                            {
                            STARTS_KW263=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur2547); 
                            STARTS_KW263_tree = (CommonTree)adaptor.create(STARTS_KW263);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW263_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:278:7: variable BECOMES varOuNB
                    {
                    pushFollow(FOLLOW_variable_in_declencheur2567);
                    variable264=variable();

                    state._fsp--;

                    stream_variable.add(variable264.getTree());
                    BECOMES265=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur2569);  
                    stream_BECOMES.add(BECOMES265);

                    pushFollow(FOLLOW_varOuNB_in_declencheur2571);
                    varOuNB266=varOuNB();

                    state._fsp--;

                    stream_varOuNB.add(varOuNB266.getTree());


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
                    // 279:7: -> ^( BECOMES_VAR_KW variable varOuNB )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:279:10: ^( BECOMES_VAR_KW variable varOuNB )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:280:7: VICTORY_KW OF ( PLAYER | IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW267=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur2595); 
                    VICTORY_KW267_tree = (CommonTree)adaptor.create(VICTORY_KW267);
                    root_0 = (CommonTree)adaptor.becomeRoot(VICTORY_KW267_tree, root_0);

                    OF268=(Token)match(input,OF,FOLLOW_OF_in_declencheur2598); 
                    set269=(Token)input.LT(1);
                    if ( input.LA(1)==IDENT||input.LA(1)==PLAYER ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set269));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:281:7: DEFEAT_KW OF ( PLAYER | IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW270=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur2615); 
                    DEFEAT_KW270_tree = (CommonTree)adaptor.create(DEFEAT_KW270);
                    root_0 = (CommonTree)adaptor.becomeRoot(DEFEAT_KW270_tree, root_0);

                    OF271=(Token)match(input,OF,FOLLOW_OF_in_declencheur2618); 
                    set272=(Token)input.LT(1);
                    if ( input.LA(1)==IDENT||input.LA(1)==PLAYER ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set272));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
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
    // $ANTLR end "declencheur"

    public static class varOuNB_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varOuNB"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:284:1: varOuNB : ( variable | FLOAT );
    public final highParser.varOuNB_return varOuNB() throws RecognitionException {
        highParser.varOuNB_return retval = new highParser.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FLOAT274=null;
        highParser.variable_return variable273 = null;


        CommonTree FLOAT274_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:284:9: ( variable | FLOAT )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IDENT||(LA59_0>=X && LA59_0<=VALUE)) ) {
                alt59=1;
            }
            else if ( (LA59_0==FLOAT) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:285:5: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_varOuNB2643);
                    variable273=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable273.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:285:16: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT274=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2647); 
                    FLOAT274_tree = (CommonTree)adaptor.create(FLOAT274);
                    adaptor.addChild(root_0, FLOAT274_tree);


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

    public static class declencheurTK_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declencheurTK"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:287:1: declencheurTK : ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW ) ( ( OTHER )? accesLocal ) ;
    public final highParser.declencheurTK_return declencheurTK() throws RecognitionException {
        highParser.declencheurTK_return retval = new highParser.declencheurTK_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOUCHES_KW275=null;
        Token KILLS_KW276=null;
        Token OWNES_KW277=null;
        Token NOTOWNES_KW278=null;
        Token OTHER279=null;
        highParser.accesLocal_return accesLocal280 = null;


        CommonTree TOUCHES_KW275_tree=null;
        CommonTree KILLS_KW276_tree=null;
        CommonTree OWNES_KW277_tree=null;
        CommonTree NOTOWNES_KW278_tree=null;
        CommonTree OTHER279_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:287:15: ( ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW ) ( ( OTHER )? accesLocal ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:5: ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW ) ( ( OTHER )? accesLocal )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:5: ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW )
            int alt60=4;
            switch ( input.LA(1) ) {
            case TOUCHES_KW:
                {
                alt60=1;
                }
                break;
            case KILLS_KW:
                {
                alt60=2;
                }
                break;
            case OWNES_KW:
                {
                alt60=3;
                }
                break;
            case NOTOWNES_KW:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:6: TOUCHES_KW
                    {
                    TOUCHES_KW275=(Token)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2660); 
                    TOUCHES_KW275_tree = (CommonTree)adaptor.create(TOUCHES_KW275);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW275_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:20: KILLS_KW
                    {
                    KILLS_KW276=(Token)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2665); 
                    KILLS_KW276_tree = (CommonTree)adaptor.create(KILLS_KW276);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLS_KW276_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:32: OWNES_KW
                    {
                    OWNES_KW277=(Token)match(input,OWNES_KW,FOLLOW_OWNES_KW_in_declencheurTK2670); 
                    OWNES_KW277_tree = (CommonTree)adaptor.create(OWNES_KW277);
                    root_0 = (CommonTree)adaptor.becomeRoot(OWNES_KW277_tree, root_0);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:44: NOTOWNES_KW
                    {
                    NOTOWNES_KW278=(Token)match(input,NOTOWNES_KW,FOLLOW_NOTOWNES_KW_in_declencheurTK2675); 
                    NOTOWNES_KW278_tree = (CommonTree)adaptor.create(NOTOWNES_KW278);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOTOWNES_KW278_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:58: ( ( OTHER )? accesLocal )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:59: ( OTHER )? accesLocal
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:59: ( OTHER )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==OTHER) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:288:60: OTHER
                    {
                    OTHER279=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2681); 
                    OTHER279_tree = (CommonTree)adaptor.create(OTHER279);
                    adaptor.addChild(root_0, OTHER279_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_accesLocal_in_declencheurTK2685);
            accesLocal280=accesLocal();

            state._fsp--;

            adaptor.addChild(root_0, accesLocal280.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:290:1: declencheurKT : ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW ) ( BY ( ( OTHER )? accesLocal ) )? ;
    public final highParser.declencheurKT_return declencheurKT() throws RecognitionException {
        highParser.declencheurKT_return retval = new highParser.declencheurKT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KILLED_KW281=null;
        Token TOUCHED_KW282=null;
        Token OWNED_KW283=null;
        Token NOTOWNED_KW284=null;
        Token BY285=null;
        Token OTHER286=null;
        highParser.accesLocal_return accesLocal287 = null;


        CommonTree KILLED_KW281_tree=null;
        CommonTree TOUCHED_KW282_tree=null;
        CommonTree OWNED_KW283_tree=null;
        CommonTree NOTOWNED_KW284_tree=null;
        CommonTree BY285_tree=null;
        CommonTree OTHER286_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:290:15: ( ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW ) ( BY ( ( OTHER )? accesLocal ) )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:5: ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW ) ( BY ( ( OTHER )? accesLocal ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:5: ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW )
            int alt62=4;
            switch ( input.LA(1) ) {
            case KILLED_KW:
                {
                alt62=1;
                }
                break;
            case TOUCHED_KW:
                {
                alt62=2;
                }
                break;
            case OWNED_KW:
                {
                alt62=3;
                }
                break;
            case NOTOWNED_KW:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:6: KILLED_KW
                    {
                    KILLED_KW281=(Token)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2700); 
                    KILLED_KW281_tree = (CommonTree)adaptor.create(KILLED_KW281);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLED_KW281_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:19: TOUCHED_KW
                    {
                    TOUCHED_KW282=(Token)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2705); 
                    TOUCHED_KW282_tree = (CommonTree)adaptor.create(TOUCHED_KW282);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW282_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:33: OWNED_KW
                    {
                    OWNED_KW283=(Token)match(input,OWNED_KW,FOLLOW_OWNED_KW_in_declencheurKT2710); 
                    OWNED_KW283_tree = (CommonTree)adaptor.create(OWNED_KW283);
                    root_0 = (CommonTree)adaptor.becomeRoot(OWNED_KW283_tree, root_0);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:45: NOTOWNED_KW
                    {
                    NOTOWNED_KW284=(Token)match(input,NOTOWNED_KW,FOLLOW_NOTOWNED_KW_in_declencheurKT2715); 
                    NOTOWNED_KW284_tree = (CommonTree)adaptor.create(NOTOWNED_KW284);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOTOWNED_KW284_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:59: ( BY ( ( OTHER )? accesLocal ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==BY) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:60: BY ( ( OTHER )? accesLocal )
                    {
                    BY285=(Token)match(input,BY,FOLLOW_BY_in_declencheurKT2720); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:64: ( ( OTHER )? accesLocal )
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:65: ( OTHER )? accesLocal
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:65: ( OTHER )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==OTHER) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:291:66: OTHER
                            {
                            OTHER286=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2725); 
                            OTHER286_tree = (CommonTree)adaptor.create(OTHER286);
                            adaptor.addChild(root_0, OTHER286_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesLocal_in_declencheurKT2729);
                    accesLocal287=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal287.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:294:1: siAlors : IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF ;
    public final highParser.siAlors_return siAlors() throws RecognitionException {
        highParser.siAlors_return retval = new highParser.siAlors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF_KW288=null;
        Token THEN290=null;
        Token ELSE292=null;
        Token ENDIF294=null;
        highParser.conditions_return conditions289 = null;

        highParser.consequences_return consequences291 = null;

        highParser.consequences_return consequences293 = null;


        CommonTree IF_KW288_tree=null;
        CommonTree THEN290_tree=null;
        CommonTree ELSE292_tree=null;
        CommonTree ENDIF294_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:294:9: ( IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:295:5: IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF_KW288=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2748); 
            IF_KW288_tree = (CommonTree)adaptor.create(IF_KW288);
            root_0 = (CommonTree)adaptor.becomeRoot(IF_KW288_tree, root_0);

            pushFollow(FOLLOW_conditions_in_siAlors2751);
            conditions289=conditions();

            state._fsp--;

            adaptor.addChild(root_0, conditions289.getTree());
            THEN290=(Token)match(input,THEN,FOLLOW_THEN_in_siAlors2753); 
            pushFollow(FOLLOW_consequences_in_siAlors2756);
            consequences291=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences291.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:295:42: ( ELSE consequences )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ELSE) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:295:43: ELSE consequences
                    {
                    ELSE292=(Token)match(input,ELSE,FOLLOW_ELSE_in_siAlors2759); 
                    pushFollow(FOLLOW_consequences_in_siAlors2762);
                    consequences293=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences293.getTree());

                    }
                    break;

            }

            ENDIF294=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_siAlors2766); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:298:1: conditions : ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) ;
    public final highParser.conditions_return conditions() throws RecognitionException {
        highParser.conditions_return retval = new highParser.conditions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT295=null;
        highParser.conditionOu_return conditionOu296 = null;


        CommonTree NOT295_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_conditionOu=new RewriteRuleSubtreeStream(adaptor,"rule conditionOu");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:298:12: ( ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:299:5: ( NOT )? conditionOu
            {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:299:5: ( NOT )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==NOT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:299:6: NOT
                    {
                    NOT295=(Token)match(input,NOT,FOLLOW_NOT_in_conditions2785);  
                    stream_NOT.add(NOT295);


                    }
                    break;

            }

            pushFollow(FOLLOW_conditionOu_in_conditions2789);
            conditionOu296=conditionOu();

            state._fsp--;

            stream_conditionOu.add(conditionOu296.getTree());


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
            // 300:7: -> ^( CONDITION_KW ( NOT )? conditionOu )
            {
                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:300:10: ^( CONDITION_KW ( NOT )? conditionOu )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_KW, "CONDITION_KW"), root_1);

                // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:300:25: ( NOT )?
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:303:1: conditionOu : conditionEt ( OR conditionEt )* ;
    public final highParser.conditionOu_return conditionOu() throws RecognitionException {
        highParser.conditionOu_return retval = new highParser.conditionOu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR298=null;
        highParser.conditionEt_return conditionEt297 = null;

        highParser.conditionEt_return conditionEt299 = null;


        CommonTree OR298_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:303:13: ( conditionEt ( OR conditionEt )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:304:5: conditionEt ( OR conditionEt )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionEt_in_conditionOu2823);
            conditionEt297=conditionEt();

            state._fsp--;

            adaptor.addChild(root_0, conditionEt297.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:304:17: ( OR conditionEt )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==OR) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:304:18: OR conditionEt
            	    {
            	    OR298=(Token)match(input,OR,FOLLOW_OR_in_conditionOu2826); 
            	    OR298_tree = (CommonTree)adaptor.create(OR298);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR298_tree, root_0);

            	    pushFollow(FOLLOW_conditionEt_in_conditionOu2829);
            	    conditionEt299=conditionEt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditionEt299.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:307:1: conditionEt : cond ( AND cond )* ;
    public final highParser.conditionEt_return conditionEt() throws RecognitionException {
        highParser.conditionEt_return retval = new highParser.conditionEt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND301=null;
        highParser.cond_return cond300 = null;

        highParser.cond_return cond302 = null;


        CommonTree AND301_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:307:13: ( cond ( AND cond )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:308:5: cond ( AND cond )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cond_in_conditionEt2848);
            cond300=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond300.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:308:10: ( AND cond )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==AND) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:308:11: AND cond
            	    {
            	    AND301=(Token)match(input,AND,FOLLOW_AND_in_conditionEt2851); 
            	    AND301_tree = (CommonTree)adaptor.create(AND301);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND301_tree, root_0);

            	    pushFollow(FOLLOW_cond_in_conditionEt2854);
            	    cond302=cond();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cond302.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:311:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD | IDENT CONTAINS_KW IDENT );
    public final highParser.cond_return cond() throws RecognitionException {
        highParser.cond_return retval = new highParser.cond_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMP304=null;
        Token EQUALS306=null;
        Token INF307=null;
        Token SUP308=null;
        Token INFEG309=null;
        Token SUPED310=null;
        Token DIFF311=null;
        Token PG313=null;
        Token PD315=null;
        Token IDENT316=null;
        Token CONTAINS_KW317=null;
        Token IDENT318=null;
        highParser.etat_return etat303 = null;

        highParser.operation_return operation305 = null;

        highParser.operation_return operation312 = null;

        highParser.conditions_return conditions314 = null;


        CommonTree COMP304_tree=null;
        CommonTree EQUALS306_tree=null;
        CommonTree INF307_tree=null;
        CommonTree SUP308_tree=null;
        CommonTree INFEG309_tree=null;
        CommonTree SUPED310_tree=null;
        CommonTree DIFF311_tree=null;
        CommonTree PG313_tree=null;
        CommonTree PD315_tree=null;
        CommonTree IDENT316_tree=null;
        CommonTree CONTAINS_KW317_tree=null;
        CommonTree IDENT318_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:311:6: ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD | IDENT CONTAINS_KW IDENT )
            int alt70=4;
            switch ( input.LA(1) ) {
            case GAME:
            case NUM:
            case PLAYER:
            case VICTORY_KW:
            case DEFEAT_KW:
            case ALL:
                {
                alt70=1;
                }
                break;
            case IDENT:
                {
                int LA70_2 = input.LA(2);

                if ( (LA70_2==IS) ) {
                    alt70=1;
                }
                else if ( (LA70_2==CONTAINS_KW) ) {
                    alt70=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 2, input);

                    throw nvae;
                }
                }
                break;
            case COMP:
                {
                alt70=2;
                }
                break;
            case PG:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:312:5: etat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_etat_in_cond2873);
                    etat303=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, etat303.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:313:7: COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMP304=(Token)match(input,COMP,FOLLOW_COMP_in_cond2881); 
                    pushFollow(FOLLOW_operation_in_cond2884);
                    operation305=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation305.getTree());
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:313:23: ( EQUALS | INF | SUP | INFEG | SUPED | DIFF )
                    int alt69=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt69=1;
                        }
                        break;
                    case INF:
                        {
                        alt69=2;
                        }
                        break;
                    case SUP:
                        {
                        alt69=3;
                        }
                        break;
                    case INFEG:
                        {
                        alt69=4;
                        }
                        break;
                    case SUPED:
                        {
                        alt69=5;
                        }
                        break;
                    case DIFF:
                        {
                        alt69=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }

                    switch (alt69) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:313:24: EQUALS
                            {
                            EQUALS306=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond2887); 
                            EQUALS306_tree = (CommonTree)adaptor.create(EQUALS306);
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALS306_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:313:34: INF
                            {
                            INF307=(Token)match(input,INF,FOLLOW_INF_in_cond2892); 
                            INF307_tree = (CommonTree)adaptor.create(INF307);
                            root_0 = (CommonTree)adaptor.becomeRoot(INF307_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:313:41: SUP
                            {
                            SUP308=(Token)match(input,SUP,FOLLOW_SUP_in_cond2897); 
                            SUP308_tree = (CommonTree)adaptor.create(SUP308);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUP308_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:313:48: INFEG
                            {
                            INFEG309=(Token)match(input,INFEG,FOLLOW_INFEG_in_cond2902); 
                            INFEG309_tree = (CommonTree)adaptor.create(INFEG309);
                            root_0 = (CommonTree)adaptor.becomeRoot(INFEG309_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:313:57: SUPED
                            {
                            SUPED310=(Token)match(input,SUPED,FOLLOW_SUPED_in_cond2907); 
                            SUPED310_tree = (CommonTree)adaptor.create(SUPED310);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUPED310_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:313:66: DIFF
                            {
                            DIFF311=(Token)match(input,DIFF,FOLLOW_DIFF_in_cond2912); 
                            DIFF311_tree = (CommonTree)adaptor.create(DIFF311);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIFF311_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_cond2916);
                    operation312=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation312.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:314:7: PG conditions PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG313=(Token)match(input,PG,FOLLOW_PG_in_cond2935); 
                    PG313_tree = (CommonTree)adaptor.create(PG313);
                    adaptor.addChild(root_0, PG313_tree);

                    pushFollow(FOLLOW_conditions_in_cond2937);
                    conditions314=conditions();

                    state._fsp--;

                    adaptor.addChild(root_0, conditions314.getTree());
                    PD315=(Token)match(input,PD,FOLLOW_PD_in_cond2939); 
                    PD315_tree = (CommonTree)adaptor.create(PD315);
                    adaptor.addChild(root_0, PD315_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:315:7: IDENT CONTAINS_KW IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT316=(Token)match(input,IDENT,FOLLOW_IDENT_in_cond2947); 
                    IDENT316_tree = (CommonTree)adaptor.create(IDENT316);
                    adaptor.addChild(root_0, IDENT316_tree);

                    CONTAINS_KW317=(Token)match(input,CONTAINS_KW,FOLLOW_CONTAINS_KW_in_cond2949); 
                    CONTAINS_KW317_tree = (CommonTree)adaptor.create(CONTAINS_KW317);
                    root_0 = (CommonTree)adaptor.becomeRoot(CONTAINS_KW317_tree, root_0);

                    IDENT318=(Token)match(input,IDENT,FOLLOW_IDENT_in_cond2952); 
                    IDENT318_tree = (CommonTree)adaptor.create(IDENT318);
                    adaptor.addChild(root_0, IDENT318_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:318:1: etat : ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW OF IDENT | DEFEAT_KW OF IDENT );
    public final highParser.etat_return etat() throws RecognitionException {
        highParser.etat_return retval = new highParser.etat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS320=null;
        Token NOT321=null;
        Token DEAD_KW322=null;
        Token ALIVE_KW323=null;
        Token EFFACED_KW324=null;
        Token GENERATED_KW325=null;
        Token TOUCHING_KW326=null;
        Token OTHER327=null;
        Token MOVING_KW329=null;
        Token WAITING_KW330=null;
        Token set331=null;
        Token IS332=null;
        Token NOT333=null;
        Token FINISHED_KW334=null;
        Token STARTED_KW335=null;
        Token PAUSED_KW336=null;
        Token MUTED_KW337=null;
        Token set338=null;
        Token PLAYED_KW339=null;
        Token STOPPED_KW340=null;
        Token VICTORY_KW341=null;
        Token OF342=null;
        Token IDENT343=null;
        Token DEFEAT_KW344=null;
        Token OF345=null;
        Token IDENT346=null;
        highParser.accesClasse_return accesClasse319 = null;

        highParser.accesLocal_return accesLocal328 = null;


        CommonTree IS320_tree=null;
        CommonTree NOT321_tree=null;
        CommonTree DEAD_KW322_tree=null;
        CommonTree ALIVE_KW323_tree=null;
        CommonTree EFFACED_KW324_tree=null;
        CommonTree GENERATED_KW325_tree=null;
        CommonTree TOUCHING_KW326_tree=null;
        CommonTree OTHER327_tree=null;
        CommonTree MOVING_KW329_tree=null;
        CommonTree WAITING_KW330_tree=null;
        CommonTree set331_tree=null;
        CommonTree IS332_tree=null;
        CommonTree NOT333_tree=null;
        CommonTree FINISHED_KW334_tree=null;
        CommonTree STARTED_KW335_tree=null;
        CommonTree PAUSED_KW336_tree=null;
        CommonTree MUTED_KW337_tree=null;
        CommonTree set338_tree=null;
        CommonTree PLAYED_KW339_tree=null;
        CommonTree STOPPED_KW340_tree=null;
        CommonTree VICTORY_KW341_tree=null;
        CommonTree OF342_tree=null;
        CommonTree IDENT343_tree=null;
        CommonTree DEFEAT_KW344_tree=null;
        CommonTree OF345_tree=null;
        CommonTree IDENT346_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:318:6: ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW OF IDENT | DEFEAT_KW OF IDENT )
            int alt76=4;
            switch ( input.LA(1) ) {
            case NUM:
            case PLAYER:
            case ALL:
                {
                alt76=1;
                }
                break;
            case IDENT:
                {
                int LA76_2 = input.LA(2);

                if ( (LA76_2==IS) ) {
                    switch ( input.LA(3) ) {
                    case NOT:
                        {
                        int LA76_7 = input.LA(4);

                        if ( ((LA76_7>=FINISHED_KW && LA76_7<=STOPPED_KW)) ) {
                            alt76=2;
                        }
                        else if ( ((LA76_7>=DEAD_KW && LA76_7<=WAITING_KW)) ) {
                            alt76=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 7, input);

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
                        alt76=2;
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
                        alt76=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 6, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt76=2;
                }
                break;
            case VICTORY_KW:
                {
                alt76=3;
                }
                break;
            case DEFEAT_KW:
                {
                alt76=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:5: accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_etat2970);
                    accesClasse319=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse319.getTree());
                    IS320=(Token)match(input,IS,FOLLOW_IS_in_etat2972); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:21: ( NOT )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==NOT) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:22: NOT
                            {
                            NOT321=(Token)match(input,NOT,FOLLOW_NOT_in_etat2976); 
                            NOT321_tree = (CommonTree)adaptor.create(NOT321);
                            adaptor.addChild(root_0, NOT321_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:28: ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW )
                    int alt73=7;
                    switch ( input.LA(1) ) {
                    case DEAD_KW:
                        {
                        alt73=1;
                        }
                        break;
                    case ALIVE_KW:
                        {
                        alt73=2;
                        }
                        break;
                    case EFFACED_KW:
                        {
                        alt73=3;
                        }
                        break;
                    case GENERATED_KW:
                        {
                        alt73=4;
                        }
                        break;
                    case TOUCHING_KW:
                        {
                        alt73=5;
                        }
                        break;
                    case MOVING_KW:
                        {
                        alt73=6;
                        }
                        break;
                    case WAITING_KW:
                        {
                        alt73=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }

                    switch (alt73) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:29: DEAD_KW
                            {
                            DEAD_KW322=(Token)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2981); 
                            DEAD_KW322_tree = (CommonTree)adaptor.create(DEAD_KW322);
                            root_0 = (CommonTree)adaptor.becomeRoot(DEAD_KW322_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:40: ALIVE_KW
                            {
                            ALIVE_KW323=(Token)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2986); 
                            ALIVE_KW323_tree = (CommonTree)adaptor.create(ALIVE_KW323);
                            root_0 = (CommonTree)adaptor.becomeRoot(ALIVE_KW323_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:52: EFFACED_KW
                            {
                            EFFACED_KW324=(Token)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2991); 
                            EFFACED_KW324_tree = (CommonTree)adaptor.create(EFFACED_KW324);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACED_KW324_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:66: GENERATED_KW
                            {
                            GENERATED_KW325=(Token)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2996); 
                            GENERATED_KW325_tree = (CommonTree)adaptor.create(GENERATED_KW325);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATED_KW325_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:82: TOUCHING_KW ( ( OTHER )? accesLocal )
                            {
                            TOUCHING_KW326=(Token)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat3001); 
                            TOUCHING_KW326_tree = (CommonTree)adaptor.create(TOUCHING_KW326);
                            root_0 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW326_tree, root_0);

                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:95: ( ( OTHER )? accesLocal )
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:96: ( OTHER )? accesLocal
                            {
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:96: ( OTHER )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==OTHER) ) {
                                alt72=1;
                            }
                            switch (alt72) {
                                case 1 :
                                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:97: OTHER
                                    {
                                    OTHER327=(Token)match(input,OTHER,FOLLOW_OTHER_in_etat3006); 
                                    OTHER327_tree = (CommonTree)adaptor.create(OTHER327);
                                    adaptor.addChild(root_0, OTHER327_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_etat3010);
                            accesLocal328=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal328.getTree());

                            }


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:119: MOVING_KW
                            {
                            MOVING_KW329=(Token)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat3015); 
                            MOVING_KW329_tree = (CommonTree)adaptor.create(MOVING_KW329);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOVING_KW329_tree, root_0);


                            }
                            break;
                        case 7 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:319:132: WAITING_KW
                            {
                            WAITING_KW330=(Token)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat3020); 
                            WAITING_KW330_tree = (CommonTree)adaptor.create(WAITING_KW330);
                            root_0 = (CommonTree)adaptor.becomeRoot(WAITING_KW330_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:7: ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set331=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set331));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    IS332=(Token)match(input,IS,FOLLOW_IS_in_etat3040); 
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:26: ( NOT )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==NOT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:27: NOT
                            {
                            NOT333=(Token)match(input,NOT,FOLLOW_NOT_in_etat3044); 
                            NOT333_tree = (CommonTree)adaptor.create(NOT333);
                            adaptor.addChild(root_0, NOT333_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:33: ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    int alt75=6;
                    switch ( input.LA(1) ) {
                    case FINISHED_KW:
                        {
                        alt75=1;
                        }
                        break;
                    case STARTED_KW:
                        {
                        alt75=2;
                        }
                        break;
                    case PAUSED_KW:
                        {
                        alt75=3;
                        }
                        break;
                    case MUTED_KW:
                        {
                        alt75=4;
                        }
                        break;
                    case PLAYED_KW:
                        {
                        alt75=5;
                        }
                        break;
                    case STOPPED_KW:
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:34: FINISHED_KW
                            {
                            FINISHED_KW334=(Token)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat3049); 
                            FINISHED_KW334_tree = (CommonTree)adaptor.create(FINISHED_KW334);
                            root_0 = (CommonTree)adaptor.becomeRoot(FINISHED_KW334_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:48: STARTED_KW
                            {
                            STARTED_KW335=(Token)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat3053); 
                            STARTED_KW335_tree = (CommonTree)adaptor.create(STARTED_KW335);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTED_KW335_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:62: PAUSED_KW
                            {
                            PAUSED_KW336=(Token)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat3058); 
                            PAUSED_KW336_tree = (CommonTree)adaptor.create(PAUSED_KW336);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSED_KW336_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:75: MUTED_KW ( ON | OFF )
                            {
                            MUTED_KW337=(Token)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat3063); 
                            MUTED_KW337_tree = (CommonTree)adaptor.create(MUTED_KW337);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTED_KW337_tree, root_0);

                            set338=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set338));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:98: PLAYED_KW
                            {
                            PLAYED_KW339=(Token)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat3076); 
                            PLAYED_KW339_tree = (CommonTree)adaptor.create(PLAYED_KW339);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAYED_KW339_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:320:111: STOPPED_KW
                            {
                            STOPPED_KW340=(Token)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat3081); 
                            STOPPED_KW340_tree = (CommonTree)adaptor.create(STOPPED_KW340);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOPPED_KW340_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:322:7: VICTORY_KW OF IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW341=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat3099); 
                    VICTORY_KW341_tree = (CommonTree)adaptor.create(VICTORY_KW341);
                    root_0 = (CommonTree)adaptor.becomeRoot(VICTORY_KW341_tree, root_0);

                    OF342=(Token)match(input,OF,FOLLOW_OF_in_etat3102); 
                    IDENT343=(Token)match(input,IDENT,FOLLOW_IDENT_in_etat3105); 
                    IDENT343_tree = (CommonTree)adaptor.create(IDENT343);
                    adaptor.addChild(root_0, IDENT343_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:323:7: DEFEAT_KW OF IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW344=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat3113); 
                    DEFEAT_KW344_tree = (CommonTree)adaptor.create(DEFEAT_KW344);
                    root_0 = (CommonTree)adaptor.becomeRoot(DEFEAT_KW344_tree, root_0);

                    OF345=(Token)match(input,OF,FOLLOW_OF_in_etat3116); 
                    IDENT346=(Token)match(input,IDENT,FOLLOW_IDENT_in_etat3119); 
                    IDENT346_tree = (CommonTree)adaptor.create(IDENT346);
                    adaptor.addChild(root_0, IDENT346_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:326:1: affectation : ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable );
    public final highParser.affectation_return affectation() throws RecognitionException {
        highParser.affectation_return retval = new highParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN_KW347=null;
        Token ADD_KW348=null;
        Token SUB_KW349=null;
        Token FOR351=null;
        Token INVERT_KW353=null;
        Token WITH355=null;
        highParser.operation_return operation350 = null;

        highParser.variable_return variable352 = null;

        highParser.variable_return variable354 = null;

        highParser.variable_return variable356 = null;


        CommonTree ASSIGN_KW347_tree=null;
        CommonTree ADD_KW348_tree=null;
        CommonTree SUB_KW349_tree=null;
        CommonTree FOR351_tree=null;
        CommonTree INVERT_KW353_tree=null;
        CommonTree WITH355_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:326:13: ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=ASSIGN_KW && LA78_0<=SUB_KW)) ) {
                alt78=1;
            }
            else if ( (LA78_0==INVERT_KW) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:327:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:327:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation )
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:327:4: ( ASSIGN_KW | ADD_KW | SUB_KW ) operation
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:327:4: ( ASSIGN_KW | ADD_KW | SUB_KW )
                    int alt77=3;
                    switch ( input.LA(1) ) {
                    case ASSIGN_KW:
                        {
                        alt77=1;
                        }
                        break;
                    case ADD_KW:
                        {
                        alt77=2;
                        }
                        break;
                    case SUB_KW:
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:327:5: ASSIGN_KW
                            {
                            ASSIGN_KW347=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation3138); 
                            ASSIGN_KW347_tree = (CommonTree)adaptor.create(ASSIGN_KW347);
                            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW347_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:327:18: ADD_KW
                            {
                            ADD_KW348=(Token)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation3143); 
                            ADD_KW348_tree = (CommonTree)adaptor.create(ADD_KW348);
                            root_0 = (CommonTree)adaptor.becomeRoot(ADD_KW348_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:327:28: SUB_KW
                            {
                            SUB_KW349=(Token)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation3148); 
                            SUB_KW349_tree = (CommonTree)adaptor.create(SUB_KW349);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUB_KW349_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_affectation3152);
                    operation350=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation350.getTree());

                    }

                    FOR351=(Token)match(input,FOR,FOLLOW_FOR_in_affectation3155); 
                    pushFollow(FOLLOW_variable_in_affectation3158);
                    variable352=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable352.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:328:5: INVERT_KW variable WITH variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INVERT_KW353=(Token)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation3165); 
                    INVERT_KW353_tree = (CommonTree)adaptor.create(INVERT_KW353);
                    root_0 = (CommonTree)adaptor.becomeRoot(INVERT_KW353_tree, root_0);

                    pushFollow(FOLLOW_variable_in_affectation3168);
                    variable354=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable354.getTree());
                    WITH355=(Token)match(input,WITH,FOLLOW_WITH_in_affectation3170); 
                    pushFollow(FOLLOW_variable_in_affectation3173);
                    variable356=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable356.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:333:1: iaBasique : IA_KW IDENT IS reglesJeu ( VIRG reglesJeu )* ;
    public final highParser.iaBasique_return iaBasique() throws RecognitionException {
        highParser.iaBasique_return retval = new highParser.iaBasique_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IA_KW357=null;
        Token IDENT358=null;
        Token IS359=null;
        Token VIRG361=null;
        highParser.reglesJeu_return reglesJeu360 = null;

        highParser.reglesJeu_return reglesJeu362 = null;


        CommonTree IA_KW357_tree=null;
        CommonTree IDENT358_tree=null;
        CommonTree IS359_tree=null;
        CommonTree VIRG361_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:333:11: ( IA_KW IDENT IS reglesJeu ( VIRG reglesJeu )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:334:5: IA_KW IDENT IS reglesJeu ( VIRG reglesJeu )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IA_KW357=(Token)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique3193); 
            IA_KW357_tree = (CommonTree)adaptor.create(IA_KW357);
            root_0 = (CommonTree)adaptor.becomeRoot(IA_KW357_tree, root_0);

            IDENT358=(Token)match(input,IDENT,FOLLOW_IDENT_in_iaBasique3196); 
            IDENT358_tree = (CommonTree)adaptor.create(IDENT358);
            adaptor.addChild(root_0, IDENT358_tree);

            IS359=(Token)match(input,IS,FOLLOW_IS_in_iaBasique3198); 
            pushFollow(FOLLOW_reglesJeu_in_iaBasique3201);
            reglesJeu360=reglesJeu();

            state._fsp--;

            adaptor.addChild(root_0, reglesJeu360.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:334:32: ( VIRG reglesJeu )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==VIRG) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:334:33: VIRG reglesJeu
            	    {
            	    VIRG361=(Token)match(input,VIRG,FOLLOW_VIRG_in_iaBasique3204); 
            	    pushFollow(FOLLOW_reglesJeu_in_iaBasique3207);
            	    reglesJeu362=reglesJeu();

            	    state._fsp--;

            	    adaptor.addChild(root_0, reglesJeu362.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:338:1: operation : ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus );
    public final highParser.operation_return operation() throws RecognitionException {
        highParser.operation_return retval = new highParser.operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RANDOM_KW364=null;
        Token BETWEEN365=null;
        Token AND367=null;
        highParser.operationPlus_return operationPlus363 = null;

        highParser.operationPlus_return operationPlus366 = null;

        highParser.operationPlus_return operationPlus368 = null;


        CommonTree RANDOM_KW364_tree=null;
        CommonTree BETWEEN365_tree=null;
        CommonTree AND367_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:338:11: ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==FLOAT||LA80_0==IDENT||LA80_0==PG||(LA80_0>=DISTANCE_KW && LA80_0<=VALUE)) ) {
                alt80=1;
            }
            else if ( (LA80_0==RANDOM_KW) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:339:5: operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operationPlus_in_operation3225);
                    operationPlus363=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus363.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:340:7: RANDOM_KW BETWEEN operationPlus AND operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RANDOM_KW364=(Token)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation3233); 
                    RANDOM_KW364_tree = (CommonTree)adaptor.create(RANDOM_KW364);
                    root_0 = (CommonTree)adaptor.becomeRoot(RANDOM_KW364_tree, root_0);

                    BETWEEN365=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operation3236); 
                    pushFollow(FOLLOW_operationPlus_in_operation3239);
                    operationPlus366=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus366.getTree());
                    AND367=(Token)match(input,AND,FOLLOW_AND_in_operation3241); 
                    pushFollow(FOLLOW_operationPlus_in_operation3244);
                    operationPlus368=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus368.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:343:1: operationPlus : operationMul ( ( PLUS | MINUS ) operationMul )* ;
    public final highParser.operationPlus_return operationPlus() throws RecognitionException {
        highParser.operationPlus_return retval = new highParser.operationPlus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS370=null;
        Token MINUS371=null;
        highParser.operationMul_return operationMul369 = null;

        highParser.operationMul_return operationMul372 = null;


        CommonTree PLUS370_tree=null;
        CommonTree MINUS371_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:343:15: ( operationMul ( ( PLUS | MINUS ) operationMul )* )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:344:5: operationMul ( ( PLUS | MINUS ) operationMul )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationMul_in_operationPlus3262);
            operationMul369=operationMul();

            state._fsp--;

            adaptor.addChild(root_0, operationMul369.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:344:18: ( ( PLUS | MINUS ) operationMul )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=PLUS && LA82_0<=MINUS)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:344:19: ( PLUS | MINUS ) operationMul
            	    {
            	    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:344:19: ( PLUS | MINUS )
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==PLUS) ) {
            	        alt81=1;
            	    }
            	    else if ( (LA81_0==MINUS) ) {
            	        alt81=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 81, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:344:20: PLUS
            	            {
            	            PLUS370=(Token)match(input,PLUS,FOLLOW_PLUS_in_operationPlus3266); 
            	            PLUS370_tree = (CommonTree)adaptor.create(PLUS370);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS370_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:344:28: MINUS
            	            {
            	            MINUS371=(Token)match(input,MINUS,FOLLOW_MINUS_in_operationPlus3271); 
            	            MINUS371_tree = (CommonTree)adaptor.create(MINUS371);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS371_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_operationMul_in_operationPlus3275);
            	    operationMul372=operationMul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operationMul372.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:347:1: operationMul : operationPow ( ( MUL | DIV | MOD ) operationPow )? ;
    public final highParser.operationMul_return operationMul() throws RecognitionException {
        highParser.operationMul_return retval = new highParser.operationMul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL374=null;
        Token DIV375=null;
        Token MOD376=null;
        highParser.operationPow_return operationPow373 = null;

        highParser.operationPow_return operationPow377 = null;


        CommonTree MUL374_tree=null;
        CommonTree DIV375_tree=null;
        CommonTree MOD376_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:347:14: ( operationPow ( ( MUL | DIV | MOD ) operationPow )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:348:5: operationPow ( ( MUL | DIV | MOD ) operationPow )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationPow_in_operationMul3294);
            operationPow373=operationPow();

            state._fsp--;

            adaptor.addChild(root_0, operationPow373.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:348:18: ( ( MUL | DIV | MOD ) operationPow )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=MUL && LA84_0<=MOD)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:348:19: ( MUL | DIV | MOD ) operationPow
                    {
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:348:19: ( MUL | DIV | MOD )
                    int alt83=3;
                    switch ( input.LA(1) ) {
                    case MUL:
                        {
                        alt83=1;
                        }
                        break;
                    case DIV:
                        {
                        alt83=2;
                        }
                        break;
                    case MOD:
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:348:20: MUL
                            {
                            MUL374=(Token)match(input,MUL,FOLLOW_MUL_in_operationMul3298); 
                            MUL374_tree = (CommonTree)adaptor.create(MUL374);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUL374_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:348:27: DIV
                            {
                            DIV375=(Token)match(input,DIV,FOLLOW_DIV_in_operationMul3303); 
                            DIV375_tree = (CommonTree)adaptor.create(DIV375);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIV375_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:348:34: MOD
                            {
                            MOD376=(Token)match(input,MOD,FOLLOW_MOD_in_operationMul3308); 
                            MOD376_tree = (CommonTree)adaptor.create(MOD376);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOD376_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operationPow_in_operationMul3312);
                    operationPow377=operationPow();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPow377.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:351:1: operationPow : operationBracket ( POW operationBracket )? ;
    public final highParser.operationPow_return operationPow() throws RecognitionException {
        highParser.operationPow_return retval = new highParser.operationPow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POW379=null;
        highParser.operationBracket_return operationBracket378 = null;

        highParser.operationBracket_return operationBracket380 = null;


        CommonTree POW379_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:351:14: ( operationBracket ( POW operationBracket )? )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:352:5: operationBracket ( POW operationBracket )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationBracket_in_operationPow3333);
            operationBracket378=operationBracket();

            state._fsp--;

            adaptor.addChild(root_0, operationBracket378.getTree());
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:352:22: ( POW operationBracket )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==POW) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:352:23: POW operationBracket
                    {
                    POW379=(Token)match(input,POW,FOLLOW_POW_in_operationPow3336); 
                    POW379_tree = (CommonTree)adaptor.create(POW379);
                    root_0 = (CommonTree)adaptor.becomeRoot(POW379_tree, root_0);

                    pushFollow(FOLLOW_operationBracket_in_operationPow3339);
                    operationBracket380=operationBracket();

                    state._fsp--;

                    adaptor.addChild(root_0, operationBracket380.getTree());

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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:355:1: operationBracket : ( PG operation PD | variable | FLOAT | ( DISTANCE_KW | ANGLE_KW ) BETWEEN IDENT AND IDENT );
    public final highParser.operationBracket_return operationBracket() throws RecognitionException {
        highParser.operationBracket_return retval = new highParser.operationBracket_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG381=null;
        Token PD383=null;
        Token FLOAT385=null;
        Token DISTANCE_KW386=null;
        Token ANGLE_KW387=null;
        Token BETWEEN388=null;
        Token IDENT389=null;
        Token AND390=null;
        Token IDENT391=null;
        highParser.operation_return operation382 = null;

        highParser.variable_return variable384 = null;


        CommonTree PG381_tree=null;
        CommonTree PD383_tree=null;
        CommonTree FLOAT385_tree=null;
        CommonTree DISTANCE_KW386_tree=null;
        CommonTree ANGLE_KW387_tree=null;
        CommonTree BETWEEN388_tree=null;
        CommonTree IDENT389_tree=null;
        CommonTree AND390_tree=null;
        CommonTree IDENT391_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:355:18: ( PG operation PD | variable | FLOAT | ( DISTANCE_KW | ANGLE_KW ) BETWEEN IDENT AND IDENT )
            int alt87=4;
            switch ( input.LA(1) ) {
            case PG:
                {
                alt87=1;
                }
                break;
            case IDENT:
            case X:
            case Y:
            case Z:
            case SCORE:
            case VALUE:
                {
                alt87=2;
                }
                break;
            case FLOAT:
                {
                alt87=3;
                }
                break;
            case DISTANCE_KW:
            case ANGLE_KW:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:356:5: PG operation PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG381=(Token)match(input,PG,FOLLOW_PG_in_operationBracket3360); 
                    pushFollow(FOLLOW_operation_in_operationBracket3363);
                    operation382=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation382.getTree());
                    PD383=(Token)match(input,PD,FOLLOW_PD_in_operationBracket3365); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:357:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operationBracket3374);
                    variable384=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable384.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:358:7: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT385=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operationBracket3382); 
                    FLOAT385_tree = (CommonTree)adaptor.create(FLOAT385);
                    adaptor.addChild(root_0, FLOAT385_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:359:7: ( DISTANCE_KW | ANGLE_KW ) BETWEEN IDENT AND IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:359:7: ( DISTANCE_KW | ANGLE_KW )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==DISTANCE_KW) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==ANGLE_KW) ) {
                        alt86=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:359:8: DISTANCE_KW
                            {
                            DISTANCE_KW386=(Token)match(input,DISTANCE_KW,FOLLOW_DISTANCE_KW_in_operationBracket3391); 
                            DISTANCE_KW386_tree = (CommonTree)adaptor.create(DISTANCE_KW386);
                            root_0 = (CommonTree)adaptor.becomeRoot(DISTANCE_KW386_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:359:22: ANGLE_KW
                            {
                            ANGLE_KW387=(Token)match(input,ANGLE_KW,FOLLOW_ANGLE_KW_in_operationBracket3395); 
                            ANGLE_KW387_tree = (CommonTree)adaptor.create(ANGLE_KW387);
                            root_0 = (CommonTree)adaptor.becomeRoot(ANGLE_KW387_tree, root_0);


                            }
                            break;

                    }

                    BETWEEN388=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operationBracket3399); 
                    IDENT389=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationBracket3402); 
                    IDENT389_tree = (CommonTree)adaptor.create(IDENT389);
                    adaptor.addChild(root_0, IDENT389_tree);

                    AND390=(Token)match(input,AND,FOLLOW_AND_in_operationBracket3404); 
                    IDENT391=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationBracket3407); 
                    IDENT391_tree = (CommonTree)adaptor.create(IDENT391);
                    adaptor.addChild(root_0, IDENT391_tree);


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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:362:1: variable : ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) );
    public final highParser.variable_return variable() throws RecognitionException {
        highParser.variable_return retval = new highParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token X392=null;
        Token Y393=null;
        Token Z394=null;
        Token OF395=null;
        Token OF397=null;
        Token IDENT399=null;
        Token OF400=null;
        Token SCORE402=null;
        Token OF403=null;
        Token GAME404=null;
        Token VALUE405=null;
        Token OF406=null;
        Token OF408=null;
        highParser.typeCoordonnees_return typeCoordonnees396 = null;

        highParser.accesLocal_return accesLocal398 = null;

        highParser.accesLocal_return accesLocal401 = null;

        highParser.attributTps_return attributTps407 = null;

        highParser.accesLocal_return accesLocal409 = null;


        CommonTree X392_tree=null;
        CommonTree Y393_tree=null;
        CommonTree Z394_tree=null;
        CommonTree OF395_tree=null;
        CommonTree OF397_tree=null;
        CommonTree IDENT399_tree=null;
        CommonTree OF400_tree=null;
        CommonTree SCORE402_tree=null;
        CommonTree OF403_tree=null;
        CommonTree GAME404_tree=null;
        CommonTree VALUE405_tree=null;
        CommonTree OF406_tree=null;
        CommonTree OF408_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_accesLocal=new RewriteRuleSubtreeStream(adaptor,"rule accesLocal");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:362:10: ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) )
            int alt89=4;
            switch ( input.LA(1) ) {
            case X:
            case Y:
            case Z:
                {
                alt89=1;
                }
                break;
            case IDENT:
                {
                alt89=2;
                }
                break;
            case SCORE:
                {
                alt89=3;
                }
                break;
            case VALUE:
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:363:5: ( X | Y | Z ) OF typeCoordonnees OF accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:363:5: ( X | Y | Z )
                    int alt88=3;
                    switch ( input.LA(1) ) {
                    case X:
                        {
                        alt88=1;
                        }
                        break;
                    case Y:
                        {
                        alt88=2;
                        }
                        break;
                    case Z:
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
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:363:6: X
                            {
                            X392=(Token)match(input,X,FOLLOW_X_in_variable3426); 
                            X392_tree = (CommonTree)adaptor.create(X392);
                            root_0 = (CommonTree)adaptor.becomeRoot(X392_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:363:11: Y
                            {
                            Y393=(Token)match(input,Y,FOLLOW_Y_in_variable3431); 
                            Y393_tree = (CommonTree)adaptor.create(Y393);
                            root_0 = (CommonTree)adaptor.becomeRoot(Y393_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:363:16: Z
                            {
                            Z394=(Token)match(input,Z,FOLLOW_Z_in_variable3436); 
                            Z394_tree = (CommonTree)adaptor.create(Z394);
                            root_0 = (CommonTree)adaptor.becomeRoot(Z394_tree, root_0);


                            }
                            break;

                    }

                    OF395=(Token)match(input,OF,FOLLOW_OF_in_variable3440); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3443);
                    typeCoordonnees396=typeCoordonnees();

                    state._fsp--;

                    adaptor.addChild(root_0, typeCoordonnees396.getTree());
                    OF397=(Token)match(input,OF,FOLLOW_OF_in_variable3445); 
                    pushFollow(FOLLOW_accesLocal_in_variable3448);
                    accesLocal398=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal398.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:364:7: IDENT OF accesLocal
                    {
                    IDENT399=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable3456);  
                    stream_IDENT.add(IDENT399);

                    OF400=(Token)match(input,OF,FOLLOW_OF_in_variable3458);  
                    stream_OF.add(OF400);

                    pushFollow(FOLLOW_accesLocal_in_variable3460);
                    accesLocal401=accesLocal();

                    state._fsp--;

                    stream_accesLocal.add(accesLocal401.getTree());


                    // AST REWRITE
                    // elements: accesLocal, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 365:7: -> ^( VAR_I_KW IDENT accesLocal )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:365:10: ^( VAR_I_KW IDENT accesLocal )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:366:7: SCORE OF GAME
                    {
                    SCORE402=(Token)match(input,SCORE,FOLLOW_SCORE_in_variable3504);  
                    stream_SCORE.add(SCORE402);

                    OF403=(Token)match(input,OF,FOLLOW_OF_in_variable3506);  
                    stream_OF.add(OF403);

                    GAME404=(Token)match(input,GAME,FOLLOW_GAME_in_variable3508);  
                    stream_GAME.add(GAME404);



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
                    // 367:7: -> GAME_SCORE_KW
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GAME_SCORE_KW, "GAME_SCORE_KW"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:368:7: VALUE OF attributTps OF accesLocal
                    {
                    VALUE405=(Token)match(input,VALUE,FOLLOW_VALUE_in_variable3526);  
                    stream_VALUE.add(VALUE405);

                    OF406=(Token)match(input,OF,FOLLOW_OF_in_variable3528);  
                    stream_OF.add(OF406);

                    pushFollow(FOLLOW_attributTps_in_variable3530);
                    attributTps407=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps407.getTree());
                    OF408=(Token)match(input,OF,FOLLOW_OF_in_variable3532);  
                    stream_OF.add(OF408);

                    pushFollow(FOLLOW_accesLocal_in_variable3534);
                    accesLocal409=accesLocal();

                    state._fsp--;

                    stream_accesLocal.add(accesLocal409.getTree());


                    // AST REWRITE
                    // elements: attributTps, accesLocal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 369:7: -> ^( VALUE_KW attributTps accesLocal )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:369:10: ^( VALUE_KW attributTps accesLocal )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:372:1: accesClasse : ( ALL -> ^( ACCESS_KW ALL ) | accesLocal );
    public final highParser.accesClasse_return accesClasse() throws RecognitionException {
        highParser.accesClasse_return retval = new highParser.accesClasse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALL410=null;
        highParser.accesLocal_return accesLocal411 = null;


        CommonTree ALL410_tree=null;
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:372:13: ( ALL -> ^( ACCESS_KW ALL ) | accesLocal )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==ALL) ) {
                alt90=1;
            }
            else if ( (LA90_0==IDENT||LA90_0==NUM||LA90_0==PLAYER) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:373:3: ALL
                    {
                    ALL410=(Token)match(input,ALL,FOLLOW_ALL_in_accesClasse3566);  
                    stream_ALL.add(ALL410);



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
                    // 374:5: -> ^( ACCESS_KW ALL )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:374:8: ^( ACCESS_KW ALL )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:375:5: accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesLocal_in_accesClasse3584);
                    accesLocal411=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal411.getTree());

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

    public static class accesLocal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accesLocal"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:378:1: accesLocal : ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) );
    public final highParser.accesLocal_return accesLocal() throws RecognitionException {
        highParser.accesLocal_return retval = new highParser.accesLocal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT412=null;
        Token NUM413=null;
        Token IN415=null;
        Token IDENT416=null;
        Token PLAYER417=null;
        highParser.operation_return operation414 = null;


        CommonTree IDENT412_tree=null;
        CommonTree NUM413_tree=null;
        CommonTree IN415_tree=null;
        CommonTree IDENT416_tree=null;
        CommonTree PLAYER417_tree=null;
        RewriteRuleTokenStream stream_PLAYER=new RewriteRuleTokenStream(adaptor,"token PLAYER");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:378:12: ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) )
            int alt91=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt91=1;
                }
                break;
            case NUM:
                {
                alt91=2;
                }
                break;
            case PLAYER:
                {
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:379:3: IDENT
                    {
                    IDENT412=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal3597);  
                    stream_IDENT.add(IDENT412);



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
                    // 380:5: -> ^( ACCESS_KW IDENT )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:380:8: ^( ACCESS_KW IDENT )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:381:5: NUM operation IN IDENT
                    {
                    NUM413=(Token)match(input,NUM,FOLLOW_NUM_in_accesLocal3615);  
                    stream_NUM.add(NUM413);

                    pushFollow(FOLLOW_operation_in_accesLocal3617);
                    operation414=operation();

                    state._fsp--;

                    stream_operation.add(operation414.getTree());
                    IN415=(Token)match(input,IN,FOLLOW_IN_in_accesLocal3619);  
                    stream_IN.add(IN415);

                    IDENT416=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal3621);  
                    stream_IDENT.add(IDENT416);



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
                    // 382:5: -> ^( ACCESS_KW IDENT operation )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:382:8: ^( ACCESS_KW IDENT operation )
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
                    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:383:5: PLAYER
                    {
                    PLAYER417=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal3641);  
                    stream_PLAYER.add(PLAYER417);



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
                    // 384:5: -> ^( ACCESS_KW PLAYER )
                    {
                        // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:384:8: ^( ACCESS_KW PLAYER )
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:387:1: typeCoordonnees : ( POSITION | ORIENTATION | SIZE );
    public final highParser.typeCoordonnees_return typeCoordonnees() throws RecognitionException {
        highParser.typeCoordonnees_return retval = new highParser.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set418=null;

        CommonTree set418_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:387:17: ( POSITION | ORIENTATION | SIZE )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set418=(Token)input.LT(1);
            if ( (input.LA(1)>=POSITION && input.LA(1)<=SIZE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set418));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:391:1: timeUnit : ( MIN | SEC | MS | FRAME );
    public final highParser.timeUnit_return timeUnit() throws RecognitionException {
        highParser.timeUnit_return retval = new highParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set419=null;

        CommonTree set419_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:391:10: ( MIN | SEC | MS | FRAME )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set419=(Token)input.LT(1);
            if ( (input.LA(1)>=MIN && input.LA(1)<=FRAME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set419));
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

    public static class attributTps_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributTps"
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:400:1: attributTps : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final highParser.attributTps_return attributTps() throws RecognitionException {
        highParser.attributTps_return retval = new highParser.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set420=null;

        CommonTree set420_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:400:13: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set420=(Token)input.LT(1);
            if ( (input.LA(1)>=BOOST_INTERVAL && input.LA(1)<=RELOAD_TIME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set420));
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
    // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:406:1: attributListeOuObjet : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final highParser.attributListeOuObjet_return attributListeOuObjet() throws RecognitionException {
        highParser.attributListeOuObjet_return retval = new highParser.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set421=null;

        CommonTree set421_tree=null;

        try {
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:406:22: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // C:\\Users\\Beben\\Desktop\\cours\\projet\\projet\\compilation\\hight\\com\\istic\\mini3d\\grammars\\high.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set421=(Token)input.LT(1);
            if ( (input.LA(1)>=INVENTORY && input.LA(1)<=TYPES_TELEPORTABLES) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set421));
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


    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA41_eotS =
        "\15\uffff";
    static final String DFA41_eofS =
        "\15\uffff";
    static final String DFA41_minS =
        "\1\35\1\uffff\1\106\12\uffff";
    static final String DFA41_maxS =
        "\1\u00c2\1\uffff\1\155\12\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA41_specialS =
        "\15\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\3\15\uffff\1\2\5\uffff\1\1\12\uffff\1\1\13\uffff\2\4\2\uffff"+
            "\2\4\1\5\2\6\1\7\2\uffff\1\10\1\11\154\uffff\1\1",
            "",
            "\3\3\15\uffff\1\12\1\13\1\uffff\1\14\1\1\3\uffff\1\1\2\uffff"+
            "\2\1\6\uffff\1\1\2\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "181:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )? | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW | NEXTURN_KW IDENT | IDENT GRASPS_KW IDENT | IDENT EXPELS_KW IDENT BY operation | IDENT INGESTS_KW IDENT IN IDENT );";
        }
    }
 

    public static final BitSet FOLLOW_gameData_in_game246 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game248 = new BitSet(new long[]{0x1006980020000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_newType_in_game257 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game259 = new BitSet(new long[]{0x1006980000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_init_in_game268 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game270 = new BitSet(new long[]{0x1006980000000000L,0x0002000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_definition_in_game280 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game282 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000002L});
    public static final BitSet FOLLOW_commande_in_game291 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game293 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_reglesJeu_in_game302 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000020L});
    public static final BitSet FOLLOW_iaBasique_in_game313 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_GAME_in_gameData369 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_gameData371 = new BitSet(new long[]{0x0000007900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData373 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_gameData376 = new BitSet(new long[]{0x0000007900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData378 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame412 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame414 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame439 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame441 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURNBASED_KW_in_attributGame471 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_attributGame477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORLD_KW_in_attributGame489 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame492 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_mapType_in_attributGame495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRIDSIZE_KW_in_attributGame503 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame506 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_KW_in_attributGame517 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame521 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TEXTE_in_attributGame524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mapType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_name554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_newType571 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_newType573 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IS_in_newType575 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_subType_in_newType577 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_AND_in_newType580 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_subType_in_newType582 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_IDENT_in_subType622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_init647 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IS_in_init649 = new BitSet(new long[]{0x1251080000000000L});
    public static final BitSet FOLLOW_declarationObjet_in_init651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_init675 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_init677 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000003FFFC3AL});
    public static final BitSet FOLLOW_allocationObject_in_init679 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_init682 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000003FFFC3AL});
    public static final BitSet FOLLOW_allocationObject_in_init684 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_INSERT_KW_in_init712 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_init715 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IN_in_init717 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_init720 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_NUM_in_init723 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_init726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_KW_in_init738 = new BitSet(new long[]{0x0002080000000000L});
    public static final BitSet FOLLOW_IDENT_in_init742 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NUM_in_init744 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_init747 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_FROM_in_init750 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_init753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet771 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_dupli_in_declarationObjet773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet802 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_OF_in_declarationObjet805 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_declarationObjet808 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet813 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_declarationObjet817 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_declarationObjet820 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet825 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_CAMERA_in_declarationObjet860 = new BitSet(new long[]{0x8100000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_view_in_declarationObjet863 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_declarationObjet905 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_declarationObjet944 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_declarationObjet962 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SOLO_in_declarationObjet964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject1053 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_VALUE_in_allocationObject1057 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AT_in_allocationObject1061 = new BitSet(new long[]{0x0000088400000000L,0x0000000000000000L,0xF808000020000000L,0x00000000C0000003L});
    public static final BitSet FOLLOW_valAggregation_in_allocationObject1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeCoordonnees_in_allocationObject1099 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject1101 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_coordinates_in_allocationObject1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_allocationObject1140 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject1142 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributTps_in_allocationObject1182 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject1184 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_allocationObject1186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_timeUnit_in_allocationObject1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_valAggregation1230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTE_in_valAggregation1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_valAggregation1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_valAggregation1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1319 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_definition1322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MEANS_in_definition1324 = new BitSet(new long[]{0x1002080020000000L,0x000000000033F328L,0x0001E00000020006L,0x0000000000000004L});
    public static final BitSet FOLLOW_consequences_in_definition1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1339 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_consequences1342 = new BitSet(new long[]{0x1002080020000000L,0x000000000033F328L,0x0001E00000020006L,0x0000000000000004L});
    public static final BitSet FOLLOW_consequ_in_consequences1344 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_siAlors_in_consequ1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1418 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_consequ1421 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_DBP_in_consequ1427 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1439 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_consequ1442 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_DBP_in_consequ1448 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1470 = new BitSet(new long[]{0x0000000000000000L,0x0000320644000000L});
    public static final BitSet FOLLOW_actionObjet_in_action1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action1480 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1499 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_DBP_in_action1504 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1519 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_action1527 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1537 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_STOP_KW_in_action1542 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1555 = new BitSet(new long[]{0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_transformation_in_action1558 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_action1560 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesClasse_in_action1563 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_coordinates_in_action1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1574 = new BitSet(new long[]{0x1002080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1579 = new BitSet(new long[]{0x1002080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_operation_in_action1584 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_action1587 = new BitSet(new long[]{0x0001000200000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_action1592 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_action1595 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_action1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_action1603 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_coordinates_in_action1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1617 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_action1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_timeUnit_in_action1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_THEN_in_action1624 = new BitSet(new long[]{0x1002080020000000L,0x000000000033F328L,0x0001E00000020006L,0x0000000000000004L});
    public static final BitSet FOLLOW_consequences_in_action1627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ENDWAIT_in_action1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXTURN_KW_in_action1646 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_GRASPS_KW_in_action1707 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXPELS_KW_in_action1720 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1723 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_BY_in_action1725 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_action1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action1736 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INGESTS_KW_in_action1738 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1741 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IN_in_action1743 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1805 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1808 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_actionObjet1811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1817 = new BitSet(new long[]{0x1002080020000000L,0x0000000000000028L,0x0000000020500000L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_HAPPENS_in_actionObjet1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1833 = new BitSet(new long[]{0x1002080000000000L,0x0000000180000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1867 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1887 = new BitSet(new long[]{0x0000000000000000L,0x000001F800000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1890 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1914 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1923 = new BitSet(new long[]{0x0000000000000000L,0x00000D9800000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1950 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1962 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1974 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_coordinates2026 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_coordinates2028 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_coordinates2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande2069 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_FOR_in_commande2072 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_player_list_in_commande2075 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IS_in_commande2077 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_actionCommande_in_commande2080 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_commande2083 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_actionCommande_in_commande2086 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IDENT_in_player_list2105 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_player_list2108 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_player_list2111 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_MOUSE_in_actionCommande2130 = new BitSet(new long[]{0x0000000000000000L,0x1F00019800000000L});
    public static final BitSet FOLLOW_souris_in_actionCommande2132 = new BitSet(new long[]{0x0000000000000000L,0x00E4000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2135 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande2139 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_actionCommande2170 = new BitSet(new long[]{0x0000000000000000L,0xE000019800000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_clavier_in_actionCommande2172 = new BitSet(new long[]{0x0000000000000000L,0x00E4000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2175 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande2179 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commandMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_definitionId2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande2371 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande2376 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_in_typeCommand2405 = new BitSet(new long[]{0x0000000000000002L,0x1F00019800000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand2408 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand2411 = new BitSet(new long[]{0x0000000000000000L,0x1F00019800000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand2413 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEY_in_typeCommand2440 = new BitSet(new long[]{0x0000000000000000L,0xE000019800000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2442 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand2445 = new BitSet(new long[]{0x0000000000000000L,0xE000019800000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2447 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu2484 = new BitSet(new long[]{0x1002080020000000L,0x0000000000000028L,0xE000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_THEN_in_reglesJeu2489 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_definitionId_in_reglesJeu2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur2510 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x000000000001EF40L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declencheur2534 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declencheur2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur2569 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur2595 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_declencheur2598 = new BitSet(new long[]{0x1000080000000000L});
    public static final BitSet FOLLOW_set_in_declencheur2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur2615 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_declencheur2618 = new BitSet(new long[]{0x1000080000000000L});
    public static final BitSet FOLLOW_set_in_declencheur2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2660 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2665 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OWNES_KW_in_declencheurTK2670 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NOTOWNES_KW_in_declencheurTK2675 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2681 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurTK2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2700 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2705 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_OWNED_KW_in_declencheurKT2710 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_NOTOWNED_KW_in_declencheurKT2715 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_BY_in_declencheurKT2720 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2725 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurKT2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2748 = new BitSet(new long[]{0x1002080020000000L,0x0000000000000028L,0x0000000020500000L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_siAlors2751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_THEN_in_siAlors2753 = new BitSet(new long[]{0x1002080020000000L,0x000000000033F328L,0x0001E00000020006L,0x0000000000000004L});
    public static final BitSet FOLLOW_consequences_in_siAlors2756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ELSE_in_siAlors2759 = new BitSet(new long[]{0x1002080020000000L,0x000000000033F328L,0x0001E00000020006L,0x0000000000000004L});
    public static final BitSet FOLLOW_consequences_in_siAlors2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ENDIF_in_siAlors2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_conditions2785 = new BitSet(new long[]{0x1002080020000000L,0x0000000000000028L,0x0000000020500000L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditionOu_in_conditions2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_OR_in_conditionOu2826 = new BitSet(new long[]{0x1002080020000000L,0x0000000000000028L,0x0000000020500000L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_cond_in_conditionEt2848 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_AND_in_conditionEt2851 = new BitSet(new long[]{0x1002080020000000L,0x0000000000000028L,0x0000000020500000L,0x0000000000000004L});
    public static final BitSet FOLLOW_cond_in_conditionEt2854 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_etat_in_cond2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMP_in_cond2881 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_cond2884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001F800000L});
    public static final BitSet FOLLOW_EQUALS_in_cond2887 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_INF_in_cond2892 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_SUP_in_cond2897 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_INFEG_in_cond2902 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_SUPED_in_cond2907 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_DIFF_in_cond2912 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_cond2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_cond2935 = new BitSet(new long[]{0x1002080020000000L,0x0000000000000028L,0x0000000020500000L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditions_in_cond2937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_PD_in_cond2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cond2947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_CONTAINS_KW_in_cond2949 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_cond2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_etat2970 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IS_in_etat2972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000007F00100000L});
    public static final BitSet FOLLOW_NOT_in_etat2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat3001 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_OTHER_in_etat3006 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_etat3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_etat3032 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IS_in_etat3040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00001F8000100000L});
    public static final BitSet FOLLOW_NOT_in_etat3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00001F8000000000L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat3063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_etat3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat3099 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_etat3102 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_etat3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat3113 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_etat3116 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_etat3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation3138 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation3143 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation3148 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_affectation3152 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_FOR_in_affectation3155 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_variable_in_affectation3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation3165 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_variable_in_affectation3168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WITH_in_affectation3170 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_variable_in_affectation3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique3193 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_iaBasique3196 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IS_in_iaBasique3198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3201 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_iaBasique3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3207 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_operationPlus_in_operation3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation3233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operation3236 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF800000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operationPlus_in_operation3239 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_AND_in_operation3241 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF800000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operationPlus_in_operation3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus3262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_PLUS_in_operationPlus3266 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF800000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_MINUS_in_operationPlus3271 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF800000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus3275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_operationPow_in_operationMul3294 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0380000000000000L});
    public static final BitSet FOLLOW_MUL_in_operationMul3298 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF800000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_DIV_in_operationMul3303 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF800000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_MOD_in_operationMul3308 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF800000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operationPow_in_operationMul3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow3333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_POW_in_operationPow3336 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF800000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_operationBracket3360 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_operationBracket3363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_PD_in_operationBracket3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operationBracket3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operationBracket3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_KW_in_operationBracket3391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_ANGLE_KW_in_operationBracket3395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operationBracket3399 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_operationBracket3402 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_AND_in_operationBracket3404 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_operationBracket3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable3426 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_Y_in_variable3431 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_Z_in_variable3436 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3443 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3445 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_variable3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable3456 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3458 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_variable3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_variable3504 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3506 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GAME_in_variable3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_variable3526 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3528 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000003FFFC3AL});
    public static final BitSet FOLLOW_attributTps_in_variable3530 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3532 = new BitSet(new long[]{0x1002080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_accesLocal_in_variable3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_accesClasse3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal3615 = new BitSet(new long[]{0x0000080400000000L,0x0000000000000000L,0xF808000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_accesLocal3617 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal3619 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}