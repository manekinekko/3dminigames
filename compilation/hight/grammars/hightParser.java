// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g 2011-02-23 16:20:57

    package grammars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class hightParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_KW", "GAME_ATTRIBUT_KW", "INIT_IS_KW", "INIT_HAS_KW", "DEC", "MEDIA_KW", "CAMERA_KW", "INTERACTION_KW", "GAME_SCORE_KW", "SCORE_KW", "VALUE_KW", "IN_KW", "ALLOCATION_KW", "COORDINATE_KW", "CONSEQUENCES_KW", "AGGREGATION_KW", "VAR_I_KW", "VAR_A_KW", "BECOMES_VAR_KW", "BECOMES_ID_KW", "CONDITION_KW", "ACCESS_KW", "KEY_KW", "MOUSE_KW", "FIN", "GAME", "HAS", "VIRG", "GRAVITY_KW", "AT", "FLOAT", "TURNBASED_KW", "WORLD_KW", "GRIDSIZE_KW", "NAME_KW", "GENERIC", "GRID", "RIBBON", "IDENT", "TYPE", "IS", "AND", "INSERT_KW", "IN", "NUM", "REMOVE_KW", "FROM", "LIST_KW", "OF", "CAMERA", "PERSON", "FREE", "MEDIA", "LOOP", "ONCE", "PLAYER", "SOLO", "DUPLICABLE", "FIRST", "THIRD", "DEFINITION_KW", "MEANS", "VICTORY_KW", "DBP", "DEFEAT_KW", "ENDS_KW", "STARTS_KW", "PAUSE_KW", "MUTE_KW", "ON", "OFF", "PLAY_KW", "STOP_KW", "BLOCK_KW", "EFFACE_KW", "GENERATE_KW", "WAIT_KW", "THEN", "ENDWAIT", "SAVE_KW", "NEXTURN_KW", "GRASPS_KW", "EXPELS_KW", "BY", "INGESTS_KW", "DIES_KW", "DURING", "UNTIL", "HAPPENS", "EQUIP", "NEXT", "PREVIOUS", "JUMP", "MOVE", "LEFT", "RIGHT", "FORWARD", "BACKWARD", "WUP", "WDOWN", "TURN", "CLOCKWISE", "ANTICLOCKWISE", "ACCELERATE", "BRAKE", "TRANSLATION", "ROTATION", "SCALE", "COMMAND_KW", "FOR", "MOUSE", "KEY", "PRESSED_KW", "HELD_KW", "RELEASED_KW", "CLICK_LEFT", "CLICK_MIDDLE", "CLICK_RIGHT", "SCROLL_UP", "SCROLL_DOWN", "LETTER", "SPACE", "ESCAPE", "ENTER", "ACTIVATE_KW", "DISABLE_KW", "COMMANDS", "KEYBOARD", "RULE_KW", "MOVES_KW", "BECOMES", "TOUCHES_KW", "KILLS_KW", "OWNES_KW", "NOTOWNES_KW", "OTHER", "KILLED_KW", "TOUCHED_KW", "OWNED_KW", "NOTOWNED_KW", "IF_KW", "ELSE", "ENDIF", "NOT", "OR", "COMP", "EQUALS", "INF", "SUP", "INFEG", "SUPED", "DIFF", "PG", "PD", "CONTAINS_KW", "DEAD_KW", "ALIVE_KW", "EFFACED_KW", "GENERATED_KW", "TOUCHING_KW", "MOVING_KW", "WAITING_KW", "FINISHED_KW", "STARTED_KW", "PAUSED_KW", "MUTED_KW", "PLAYED_KW", "STOPPED_KW", "ASSIGN_KW", "ADD_KW", "SUB_KW", "INVERT_KW", "WITH", "IA_KW", "RANDOM_KW", "BETWEEN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "DISTANCE_KW", "ANGLE_KW", "X", "Y", "Z", "SCORE", "VALUE", "ALL", "POSITION", "ORIENTATION", "SIZE", "MIN", "SEC", "MS", "FRAME", "BOOST_INTERVAL", "SHOOT_INTERVAL", "RELOAD_TIME", "INVENTORY", "EQUIPED_OBJECT", "ENTRANCES", "EXITS", "DAMAGE_ZONE", "COLLECTORS", "TYPES_COLLECTORS", "GENERATORS", "TYPE_GENERATORS", "BREAKERS", "TYPES_BREAKERS", "TELEPORTABLES", "TYPES_TELEPORTABLES", "COMMENT", "RELOAD_KW", "TIME", "WS", "'true'", "'false'"
    };
    public static final int EOF=-1;
    public static final int T__221=221;
    public static final int T__222=222;
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
    public static final int GENERIC=39;
    public static final int GRID=40;
    public static final int RIBBON=41;
    public static final int IDENT=42;
    public static final int TYPE=43;
    public static final int IS=44;
    public static final int AND=45;
    public static final int INSERT_KW=46;
    public static final int IN=47;
    public static final int NUM=48;
    public static final int REMOVE_KW=49;
    public static final int FROM=50;
    public static final int LIST_KW=51;
    public static final int OF=52;
    public static final int CAMERA=53;
    public static final int PERSON=54;
    public static final int FREE=55;
    public static final int MEDIA=56;
    public static final int LOOP=57;
    public static final int ONCE=58;
    public static final int PLAYER=59;
    public static final int SOLO=60;
    public static final int DUPLICABLE=61;
    public static final int FIRST=62;
    public static final int THIRD=63;
    public static final int DEFINITION_KW=64;
    public static final int MEANS=65;
    public static final int VICTORY_KW=66;
    public static final int DBP=67;
    public static final int DEFEAT_KW=68;
    public static final int ENDS_KW=69;
    public static final int STARTS_KW=70;
    public static final int PAUSE_KW=71;
    public static final int MUTE_KW=72;
    public static final int ON=73;
    public static final int OFF=74;
    public static final int PLAY_KW=75;
    public static final int STOP_KW=76;
    public static final int BLOCK_KW=77;
    public static final int EFFACE_KW=78;
    public static final int GENERATE_KW=79;
    public static final int WAIT_KW=80;
    public static final int THEN=81;
    public static final int ENDWAIT=82;
    public static final int SAVE_KW=83;
    public static final int NEXTURN_KW=84;
    public static final int GRASPS_KW=85;
    public static final int EXPELS_KW=86;
    public static final int BY=87;
    public static final int INGESTS_KW=88;
    public static final int DIES_KW=89;
    public static final int DURING=90;
    public static final int UNTIL=91;
    public static final int HAPPENS=92;
    public static final int EQUIP=93;
    public static final int NEXT=94;
    public static final int PREVIOUS=95;
    public static final int JUMP=96;
    public static final int MOVE=97;
    public static final int LEFT=98;
    public static final int RIGHT=99;
    public static final int FORWARD=100;
    public static final int BACKWARD=101;
    public static final int WUP=102;
    public static final int WDOWN=103;
    public static final int TURN=104;
    public static final int CLOCKWISE=105;
    public static final int ANTICLOCKWISE=106;
    public static final int ACCELERATE=107;
    public static final int BRAKE=108;
    public static final int TRANSLATION=109;
    public static final int ROTATION=110;
    public static final int SCALE=111;
    public static final int COMMAND_KW=112;
    public static final int FOR=113;
    public static final int MOUSE=114;
    public static final int KEY=115;
    public static final int PRESSED_KW=116;
    public static final int HELD_KW=117;
    public static final int RELEASED_KW=118;
    public static final int CLICK_LEFT=119;
    public static final int CLICK_MIDDLE=120;
    public static final int CLICK_RIGHT=121;
    public static final int SCROLL_UP=122;
    public static final int SCROLL_DOWN=123;
    public static final int LETTER=124;
    public static final int SPACE=125;
    public static final int ESCAPE=126;
    public static final int ENTER=127;
    public static final int ACTIVATE_KW=128;
    public static final int DISABLE_KW=129;
    public static final int COMMANDS=130;
    public static final int KEYBOARD=131;
    public static final int RULE_KW=132;
    public static final int MOVES_KW=133;
    public static final int BECOMES=134;
    public static final int TOUCHES_KW=135;
    public static final int KILLS_KW=136;
    public static final int OWNES_KW=137;
    public static final int NOTOWNES_KW=138;
    public static final int OTHER=139;
    public static final int KILLED_KW=140;
    public static final int TOUCHED_KW=141;
    public static final int OWNED_KW=142;
    public static final int NOTOWNED_KW=143;
    public static final int IF_KW=144;
    public static final int ELSE=145;
    public static final int ENDIF=146;
    public static final int NOT=147;
    public static final int OR=148;
    public static final int COMP=149;
    public static final int EQUALS=150;
    public static final int INF=151;
    public static final int SUP=152;
    public static final int INFEG=153;
    public static final int SUPED=154;
    public static final int DIFF=155;
    public static final int PG=156;
    public static final int PD=157;
    public static final int CONTAINS_KW=158;
    public static final int DEAD_KW=159;
    public static final int ALIVE_KW=160;
    public static final int EFFACED_KW=161;
    public static final int GENERATED_KW=162;
    public static final int TOUCHING_KW=163;
    public static final int MOVING_KW=164;
    public static final int WAITING_KW=165;
    public static final int FINISHED_KW=166;
    public static final int STARTED_KW=167;
    public static final int PAUSED_KW=168;
    public static final int MUTED_KW=169;
    public static final int PLAYED_KW=170;
    public static final int STOPPED_KW=171;
    public static final int ASSIGN_KW=172;
    public static final int ADD_KW=173;
    public static final int SUB_KW=174;
    public static final int INVERT_KW=175;
    public static final int WITH=176;
    public static final int IA_KW=177;
    public static final int RANDOM_KW=178;
    public static final int BETWEEN=179;
    public static final int PLUS=180;
    public static final int MINUS=181;
    public static final int MUL=182;
    public static final int DIV=183;
    public static final int MOD=184;
    public static final int POW=185;
    public static final int DISTANCE_KW=186;
    public static final int ANGLE_KW=187;
    public static final int X=188;
    public static final int Y=189;
    public static final int Z=190;
    public static final int SCORE=191;
    public static final int VALUE=192;
    public static final int ALL=193;
    public static final int POSITION=194;
    public static final int ORIENTATION=195;
    public static final int SIZE=196;
    public static final int MIN=197;
    public static final int SEC=198;
    public static final int MS=199;
    public static final int FRAME=200;
    public static final int BOOST_INTERVAL=201;
    public static final int SHOOT_INTERVAL=202;
    public static final int RELOAD_TIME=203;
    public static final int INVENTORY=204;
    public static final int EQUIPED_OBJECT=205;
    public static final int ENTRANCES=206;
    public static final int EXITS=207;
    public static final int DAMAGE_ZONE=208;
    public static final int COLLECTORS=209;
    public static final int TYPES_COLLECTORS=210;
    public static final int GENERATORS=211;
    public static final int TYPE_GENERATORS=212;
    public static final int BREAKERS=213;
    public static final int TYPES_BREAKERS=214;
    public static final int TELEPORTABLES=215;
    public static final int TYPES_TELEPORTABLES=216;
    public static final int COMMENT=217;
    public static final int RELOAD_KW=218;
    public static final int TIME=219;
    public static final int WS=220;

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:44:1: game : ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition FIN )* ( commande FIN )+ ( reglesJeu FIN )+ ( iaBasique FIN )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:44:6: ( ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition FIN )* ( commande FIN )+ ( reglesJeu FIN )+ ( iaBasique FIN )* -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:5: ( gameData FIN )? ( newType FIN )* ( init FIN )+ ( definition FIN )* ( commande FIN )+ ( reglesJeu FIN )+ ( iaBasique FIN )*
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:5: ( gameData FIN )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GAME) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:45:6: gameData FIN
                    {
                    pushFollow(FOLLOW_gameData_in_game238);
                    gameData1=gameData();

                    state._fsp--;

                    stream_gameData.add(gameData1.getTree());
                    FIN2=(Token)match(input,FIN,FOLLOW_FIN_in_game240);  
                    stream_FIN.add(FIN2);


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:5: ( newType FIN )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:46:6: newType FIN
            	    {
            	    pushFollow(FOLLOW_newType_in_game249);
            	    newType3=newType();

            	    state._fsp--;

            	    stream_newType.add(newType3.getTree());
            	    FIN4=(Token)match(input,FIN,FOLLOW_FIN_in_game251);  
            	    stream_FIN.add(FIN4);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:5: ( init FIN )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:47:6: init FIN
            	    {
            	    pushFollow(FOLLOW_init_in_game260);
            	    init5=init();

            	    state._fsp--;

            	    stream_init.add(init5.getTree());
            	    FIN6=(Token)match(input,FIN,FOLLOW_FIN_in_game262);  
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:5: ( definition FIN )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DEFINITION_KW) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:48:6: definition FIN
            	    {
            	    pushFollow(FOLLOW_definition_in_game271);
            	    definition7=definition();

            	    state._fsp--;

            	    stream_definition.add(definition7.getTree());
            	    FIN8=(Token)match(input,FIN,FOLLOW_FIN_in_game273);  
            	    stream_FIN.add(FIN8);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:5: ( commande FIN )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:49:6: commande FIN
            	    {
            	    pushFollow(FOLLOW_commande_in_game282);
            	    commande9=commande();

            	    state._fsp--;

            	    stream_commande.add(commande9.getTree());
            	    FIN10=(Token)match(input,FIN,FOLLOW_FIN_in_game284);  
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:50:5: ( reglesJeu FIN )+
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
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:50:6: reglesJeu FIN
            	    {
            	    pushFollow(FOLLOW_reglesJeu_in_game293);
            	    reglesJeu11=reglesJeu();

            	    state._fsp--;

            	    stream_reglesJeu.add(reglesJeu11.getTree());
            	    FIN12=(Token)match(input,FIN,FOLLOW_FIN_in_game295);  
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

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:51:5: ( iaBasique FIN )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IA_KW) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:51:6: iaBasique FIN
            	    {
            	    pushFollow(FOLLOW_iaBasique_in_game304);
            	    iaBasique13=iaBasique();

            	    state._fsp--;

            	    stream_iaBasique.add(iaBasique13.getTree());
            	    FIN14=(Token)match(input,FIN,FOLLOW_FIN_in_game306);  
            	    stream_FIN.add(FIN14);


            	    }
            	    break;

            	default :
            	    break loop7;
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
            // 52:7: -> ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:52:10: ^( GAME_KW ( gameData )? ( newType )* ( init )+ ( definition )* ( commande )+ ( reglesJeu )+ ( iaBasique )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GAME_KW, "GAME_KW"), root_1);

                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:52:20: ( gameData )?
                if ( stream_gameData.hasNext() ) {
                    adaptor.addChild(root_1, stream_gameData.nextTree());

                }
                stream_gameData.reset();
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:52:30: ( newType )*
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
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:52:45: ( definition )*
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
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:52:78: ( iaBasique )*
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:56:1: gameData : GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) ;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:56:10: ( GAME HAS attributGame ( VIRG attributGame )* -> ^( GAME_ATTRIBUT_KW ( attributGame )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:57:5: GAME HAS attributGame ( VIRG attributGame )*
            {
            GAME15=(Token)match(input,GAME,FOLLOW_GAME_in_gameData360);  
            stream_GAME.add(GAME15);

            HAS16=(Token)match(input,HAS,FOLLOW_HAS_in_gameData362);  
            stream_HAS.add(HAS16);

            pushFollow(FOLLOW_attributGame_in_gameData364);
            attributGame17=attributGame();

            state._fsp--;

            stream_attributGame.add(attributGame17.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:57:27: ( VIRG attributGame )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==VIRG) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:57:28: VIRG attributGame
            	    {
            	    VIRG18=(Token)match(input,VIRG,FOLLOW_VIRG_in_gameData367);  
            	    stream_VIRG.add(VIRG18);

            	    pushFollow(FOLLOW_attributGame_in_gameData369);
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
            // 58:7: -> ^( GAME_ATTRIBUT_KW ( attributGame )+ )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:58:10: ^( GAME_ATTRIBUT_KW ( attributGame )+ )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:61:1: attributGame : ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | TURNBASED_KW AT ( 'true' | 'false' ) | WORLD_KW AT mapType | GRIDSIZE_KW AT FLOAT | NAME_KW AT name );
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
        hightParser.mapType_return mapType31 = null;

        hightParser.name_return name37 = null;


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
        RewriteRuleTokenStream stream_GRAVITY_KW=new RewriteRuleTokenStream(adaptor,"token GRAVITY_KW");
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:61:14: ( GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) ) | TURNBASED_KW AT ( 'true' | 'false' ) | WORLD_KW AT mapType | GRIDSIZE_KW AT FLOAT | NAME_KW AT name )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:62:5: GRAVITY_KW AT ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
                    {
                    GRAVITY_KW20=(Token)match(input,GRAVITY_KW,FOLLOW_GRAVITY_KW_in_attributGame403);  
                    stream_GRAVITY_KW.add(GRAVITY_KW20);

                    AT21=(Token)match(input,AT,FOLLOW_AT_in_attributGame405);  
                    stream_AT.add(AT21);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:62:19: ( FLOAT -> ^( GRAVITY_KW FLOAT ) | FLOAT FLOAT FLOAT -> ^( GRAVITY_KW FLOAT FLOAT FLOAT ) )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:62:20: FLOAT
                            {
                            FLOAT22=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame408);  
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
                            // 63:7: -> ^( GRAVITY_KW FLOAT )
                            {
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:63:10: ^( GRAVITY_KW FLOAT )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:64:7: FLOAT FLOAT FLOAT
                            {
                            FLOAT23=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame430);  
                            stream_FLOAT.add(FLOAT23);

                            FLOAT24=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame432);  
                            stream_FLOAT.add(FLOAT24);

                            FLOAT25=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame434);  
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
                            // 65:7: -> ^( GRAVITY_KW FLOAT FLOAT FLOAT )
                            {
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:65:10: ^( GRAVITY_KW FLOAT FLOAT FLOAT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:66:7: TURNBASED_KW AT ( 'true' | 'false' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURNBASED_KW26=(Token)match(input,TURNBASED_KW,FOLLOW_TURNBASED_KW_in_attributGame462); 
                    TURNBASED_KW26_tree = (CommonTree)adaptor.create(TURNBASED_KW26);
                    root_0 = (CommonTree)adaptor.becomeRoot(TURNBASED_KW26_tree, root_0);

                    AT27=(Token)match(input,AT,FOLLOW_AT_in_attributGame465); 
                    set28=(Token)input.LT(1);
                    if ( (input.LA(1)>=221 && input.LA(1)<=222) ) {
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:67:7: WORLD_KW AT mapType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORLD_KW29=(Token)match(input,WORLD_KW,FOLLOW_WORLD_KW_in_attributGame480); 
                    WORLD_KW29_tree = (CommonTree)adaptor.create(WORLD_KW29);
                    root_0 = (CommonTree)adaptor.becomeRoot(WORLD_KW29_tree, root_0);

                    AT30=(Token)match(input,AT,FOLLOW_AT_in_attributGame483); 
                    pushFollow(FOLLOW_mapType_in_attributGame486);
                    mapType31=mapType();

                    state._fsp--;

                    adaptor.addChild(root_0, mapType31.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:68:7: GRIDSIZE_KW AT FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GRIDSIZE_KW32=(Token)match(input,GRIDSIZE_KW,FOLLOW_GRIDSIZE_KW_in_attributGame494); 
                    GRIDSIZE_KW32_tree = (CommonTree)adaptor.create(GRIDSIZE_KW32);
                    root_0 = (CommonTree)adaptor.becomeRoot(GRIDSIZE_KW32_tree, root_0);

                    AT33=(Token)match(input,AT,FOLLOW_AT_in_attributGame497); 
                    FLOAT34=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attributGame500); 
                    FLOAT34_tree = (CommonTree)adaptor.create(FLOAT34);
                    adaptor.addChild(root_0, FLOAT34_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:69:7: NAME_KW AT name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NAME_KW35=(Token)match(input,NAME_KW,FOLLOW_NAME_KW_in_attributGame508); 
                    NAME_KW35_tree = (CommonTree)adaptor.create(NAME_KW35);
                    root_0 = (CommonTree)adaptor.becomeRoot(NAME_KW35_tree, root_0);

                    AT36=(Token)match(input,AT,FOLLOW_AT_in_attributGame512); 
                    pushFollow(FOLLOW_name_in_attributGame515);
                    name37=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name37.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:72:1: mapType : ( GENERIC | GRID | RIBBON );
    public final hightParser.mapType_return mapType() throws RecognitionException {
        hightParser.mapType_return retval = new hightParser.mapType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set38=null;

        CommonTree set38_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:72:9: ( GENERIC | GRID | RIBBON )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:74:1: name : IDENT ;
    public final hightParser.name_return name() throws RecognitionException {
        hightParser.name_return retval = new hightParser.name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT39=null;

        CommonTree IDENT39_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:74:6: ( IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:74:8: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT39=(Token)match(input,IDENT,FOLLOW_IDENT_in_name544); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:77:1: newType : TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) ;
    public final hightParser.newType_return newType() throws RecognitionException {
        hightParser.newType_return retval = new hightParser.newType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE40=null;
        Token IDENT41=null;
        Token IS42=null;
        Token AND44=null;
        hightParser.subType_return subType43 = null;

        hightParser.subType_return subType45 = null;


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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:77:9: ( TYPE IDENT IS subType ( AND subType )* -> ^( TYPE IDENT subType ( subType )* ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:78:5: TYPE IDENT IS subType ( AND subType )*
            {
            TYPE40=(Token)match(input,TYPE,FOLLOW_TYPE_in_newType558);  
            stream_TYPE.add(TYPE40);

            IDENT41=(Token)match(input,IDENT,FOLLOW_IDENT_in_newType560);  
            stream_IDENT.add(IDENT41);

            IS42=(Token)match(input,IS,FOLLOW_IS_in_newType562);  
            stream_IS.add(IS42);

            pushFollow(FOLLOW_subType_in_newType564);
            subType43=subType();

            state._fsp--;

            stream_subType.add(subType43.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:78:27: ( AND subType )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:78:28: AND subType
            	    {
            	    AND44=(Token)match(input,AND,FOLLOW_AND_in_newType567);  
            	    stream_AND.add(AND44);

            	    pushFollow(FOLLOW_subType_in_newType569);
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
            // elements: subType, TYPE, subType, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 79:7: -> ^( TYPE IDENT subType ( subType )* )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:79:10: ^( TYPE IDENT subType ( subType )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_subType.nextTree());
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:79:31: ( subType )*
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:82:1: subType : IDENT ;
    public final hightParser.subType_return subType() throws RecognitionException {
        hightParser.subType_return retval = new hightParser.subType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT46=null;

        CommonTree IDENT46_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:82:9: ( IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:83:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT46=(Token)match(input,IDENT,FOLLOW_IDENT_in_subType609); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:89:1: init : ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) | INSERT_KW IDENT IN IDENT ( NUM operation )? | REMOVE_KW ( IDENT | NUM operation ) FROM IDENT );
    public final hightParser.init_return init() throws RecognitionException {
        hightParser.init_return retval = new hightParser.init_return();
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
        hightParser.declarationObjet_return declarationObjet49 = null;

        hightParser.accesClasse_return accesClasse50 = null;

        hightParser.allocationObject_return allocationObject52 = null;

        hightParser.allocationObject_return allocationObject54 = null;

        hightParser.operation_return operation60 = null;

        hightParser.operation_return operation64 = null;


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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:89:6: ( IDENT IS declarationObjet -> ^( INIT_IS_KW IDENT declarationObjet ) | accesClasse HAS allocationObject ( VIRG allocationObject )* -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ ) | INSERT_KW IDENT IN IDENT ( NUM operation )? | REMOVE_KW ( IDENT | NUM operation ) FROM IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:90:5: IDENT IS declarationObjet
                    {
                    IDENT47=(Token)match(input,IDENT,FOLLOW_IDENT_in_init634);  
                    stream_IDENT.add(IDENT47);

                    IS48=(Token)match(input,IS,FOLLOW_IS_in_init636);  
                    stream_IS.add(IS48);

                    pushFollow(FOLLOW_declarationObjet_in_init638);
                    declarationObjet49=declarationObjet();

                    state._fsp--;

                    stream_declarationObjet.add(declarationObjet49.getTree());


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
                    // 91:7: -> ^( INIT_IS_KW IDENT declarationObjet )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:91:10: ^( INIT_IS_KW IDENT declarationObjet )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:7: accesClasse HAS allocationObject ( VIRG allocationObject )*
                    {
                    pushFollow(FOLLOW_accesClasse_in_init662);
                    accesClasse50=accesClasse();

                    state._fsp--;

                    stream_accesClasse.add(accesClasse50.getTree());
                    HAS51=(Token)match(input,HAS,FOLLOW_HAS_in_init664);  
                    stream_HAS.add(HAS51);

                    pushFollow(FOLLOW_allocationObject_in_init666);
                    allocationObject52=allocationObject();

                    state._fsp--;

                    stream_allocationObject.add(allocationObject52.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:40: ( VIRG allocationObject )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==VIRG) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:92:41: VIRG allocationObject
                    	    {
                    	    VIRG53=(Token)match(input,VIRG,FOLLOW_VIRG_in_init669);  
                    	    stream_VIRG.add(VIRG53);

                    	    pushFollow(FOLLOW_allocationObject_in_init671);
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
                    // elements: accesClasse, allocationObject
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 93:7: -> ^( INIT_HAS_KW accesClasse ( allocationObject )+ )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:93:10: ^( INIT_HAS_KW accesClasse ( allocationObject )+ )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:7: INSERT_KW IDENT IN IDENT ( NUM operation )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSERT_KW55=(Token)match(input,INSERT_KW,FOLLOW_INSERT_KW_in_init699); 
                    INSERT_KW55_tree = (CommonTree)adaptor.create(INSERT_KW55);
                    root_0 = (CommonTree)adaptor.becomeRoot(INSERT_KW55_tree, root_0);

                    IDENT56=(Token)match(input,IDENT,FOLLOW_IDENT_in_init702); 
                    IDENT56_tree = (CommonTree)adaptor.create(IDENT56);
                    adaptor.addChild(root_0, IDENT56_tree);

                    IN57=(Token)match(input,IN,FOLLOW_IN_in_init704); 
                    IDENT58=(Token)match(input,IDENT,FOLLOW_IDENT_in_init707); 
                    IDENT58_tree = (CommonTree)adaptor.create(IDENT58);
                    adaptor.addChild(root_0, IDENT58_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:34: ( NUM operation )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NUM) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:94:35: NUM operation
                            {
                            NUM59=(Token)match(input,NUM,FOLLOW_NUM_in_init710); 
                            pushFollow(FOLLOW_operation_in_init713);
                            operation60=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation60.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:7: REMOVE_KW ( IDENT | NUM operation ) FROM IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REMOVE_KW61=(Token)match(input,REMOVE_KW,FOLLOW_REMOVE_KW_in_init725); 
                    REMOVE_KW61_tree = (CommonTree)adaptor.create(REMOVE_KW61);
                    root_0 = (CommonTree)adaptor.becomeRoot(REMOVE_KW61_tree, root_0);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:18: ( IDENT | NUM operation )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:19: IDENT
                            {
                            IDENT62=(Token)match(input,IDENT,FOLLOW_IDENT_in_init729); 
                            IDENT62_tree = (CommonTree)adaptor.create(IDENT62);
                            adaptor.addChild(root_0, IDENT62_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:95:25: NUM operation
                            {
                            NUM63=(Token)match(input,NUM,FOLLOW_NUM_in_init731); 
                            pushFollow(FOLLOW_operation_in_init734);
                            operation64=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation64.getTree());

                            }
                            break;

                    }

                    FROM65=(Token)match(input,FROM,FOLLOW_FROM_in_init737); 
                    IDENT66=(Token)match(input,IDENT,FOLLOW_IDENT_in_init740); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:99:1: declarationObjet : ( IDENT ( dupli )? -> ^( DEC IDENT ( dupli )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) | PLAYER ( SOLO )? );
    public final hightParser.declarationObjet_return declarationObjet() throws RecognitionException {
        hightParser.declarationObjet_return retval = new hightParser.declarationObjet_return();
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
        hightParser.dupli_return dupli68 = null;

        hightParser.operation_return operation71 = null;

        hightParser.operation_return operation74 = null;

        hightParser.view_return view77 = null;


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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:99:18: ( IDENT ( dupli )? -> ^( DEC IDENT ( dupli )? ) | LIST_KW ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )? -> ^( LIST_KW ( ( operation )? IDENT )+ ) | CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )? | MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )? | IN IDENT -> ^( IN_KW IDENT ) | PLAYER ( SOLO )? )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:100:5: IDENT ( dupli )?
                    {
                    IDENT67=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet758);  
                    stream_IDENT.add(IDENT67);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:100:11: ( dupli )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==DUPLICABLE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:100:11: dupli
                            {
                            pushFollow(FOLLOW_dupli_in_declarationObjet760);
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
                    // 101:7: -> ^( DEC IDENT ( dupli )? )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:101:10: ^( DEC IDENT ( dupli )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:101:22: ( dupli )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:7: LIST_KW ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )?
                    {
                    LIST_KW69=(Token)match(input,LIST_KW,FOLLOW_LIST_KW_in_declarationObjet789);  
                    stream_LIST_KW.add(LIST_KW69);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:15: ( OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OF) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:16: OF ( operation )? ( IDENT ) ( ',' ( operation )? ( IDENT ) )*
                            {
                            OF70=(Token)match(input,OF,FOLLOW_OF_in_declarationObjet792);  
                            stream_OF.add(OF70);

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:19: ( operation )?
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
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:20: operation
                                    {
                                    pushFollow(FOLLOW_operation_in_declarationObjet795);
                                    operation71=operation();

                                    state._fsp--;

                                    stream_operation.add(operation71.getTree());

                                    }
                                    break;

                            }

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:32: ( IDENT )
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:33: IDENT
                            {
                            IDENT72=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet800);  
                            stream_IDENT.add(IDENT72);


                            }

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:40: ( ',' ( operation )? ( IDENT ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==VIRG) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:41: ',' ( operation )? ( IDENT )
                            	    {
                            	    char_literal73=(Token)match(input,VIRG,FOLLOW_VIRG_in_declarationObjet804);  
                            	    stream_VIRG.add(char_literal73);

                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:45: ( operation )?
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
                            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:46: operation
                            	            {
                            	            pushFollow(FOLLOW_operation_in_declarationObjet807);
                            	            operation74=operation();

                            	            state._fsp--;

                            	            stream_operation.add(operation74.getTree());

                            	            }
                            	            break;

                            	    }

                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:58: ( IDENT )
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:102:59: IDENT
                            	    {
                            	    IDENT75=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet812);  
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
                    // elements: operation, LIST_KW, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 103:7: -> ^( LIST_KW ( ( operation )? IDENT )+ )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:103:9: ^( LIST_KW ( ( operation )? IDENT )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LIST_KW.nextNode(), root_1);

                        if ( !(stream_IDENT.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_IDENT.hasNext() ) {
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:103:20: ( operation )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:104:7: CAMERA ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
                    {
                    CAMERA76=(Token)match(input,CAMERA,FOLLOW_CAMERA_in_declarationObjet847);  
                    stream_CAMERA.add(CAMERA76);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:104:14: ( view PERSON -> ^( CAMERA_KW PERSON view ) | FREE -> ^( CAMERA_KW FREE ) )?
                    int alt21=3;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=FIRST && LA21_0<=THIRD)) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==FREE) ) {
                        alt21=2;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:104:15: view PERSON
                            {
                            pushFollow(FOLLOW_view_in_declarationObjet850);
                            view77=view();

                            state._fsp--;

                            stream_view.add(view77.getTree());
                            PERSON78=(Token)match(input,PERSON,FOLLOW_PERSON_in_declarationObjet852);  
                            stream_PERSON.add(PERSON78);



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
                            // 104:27: -> ^( CAMERA_KW PERSON view )
                            {
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:104:30: ^( CAMERA_KW PERSON view )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:104:57: FREE
                            {
                            FREE79=(Token)match(input,FREE,FOLLOW_FREE_in_declarationObjet866);  
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
                            // 104:62: -> ^( CAMERA_KW FREE )
                            {
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:104:65: ^( CAMERA_KW FREE )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:7: MEDIA ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
                    {
                    MEDIA80=(Token)match(input,MEDIA,FOLLOW_MEDIA_in_declarationObjet884);  
                    stream_MEDIA.add(MEDIA80);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:13: ( LOOP -> ^( MEDIA_KW LOOP ) | ONCE -> ^( MEDIA_KW ONCE ) )?
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:14: LOOP
                            {
                            LOOP81=(Token)match(input,LOOP,FOLLOW_LOOP_in_declarationObjet887);  
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
                            // 105:19: -> ^( MEDIA_KW LOOP )
                            {
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:21: ^( MEDIA_KW LOOP )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:40: ONCE
                            {
                            ONCE82=(Token)match(input,ONCE,FOLLOW_ONCE_in_declarationObjet898);  
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
                            // 105:45: -> ^( MEDIA_KW ONCE )
                            {
                                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:105:47: ^( MEDIA_KW ONCE )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:106:7: IN IDENT
                    {
                    IN83=(Token)match(input,IN,FOLLOW_IN_in_declarationObjet923);  
                    stream_IN.add(IN83);

                    IDENT84=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarationObjet925);  
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
                    // 106:16: -> ^( IN_KW IDENT )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:106:19: ^( IN_KW IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:107:7: PLAYER ( SOLO )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER85=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_declarationObjet941); 
                    PLAYER85_tree = (CommonTree)adaptor.create(PLAYER85);
                    adaptor.addChild(root_0, PLAYER85_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:107:14: ( SOLO )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==SOLO) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:107:14: SOLO
                            {
                            SOLO86=(Token)match(input,SOLO,FOLLOW_SOLO_in_declarationObjet943); 
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:110:1: typeEntity : IDENT ;
    public final hightParser.typeEntity_return typeEntity() throws RecognitionException {
        hightParser.typeEntity_return retval = new hightParser.typeEntity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT87=null;

        CommonTree IDENT87_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:110:12: ( IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:111:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT87=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeEntity971); 
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

    public static class entityMode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entityMode"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:115:1: entityMode : ( PLAYER | dupli );
    public final hightParser.entityMode_return entityMode() throws RecognitionException {
        hightParser.entityMode_return retval = new hightParser.entityMode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLAYER88=null;
        hightParser.dupli_return dupli89 = null;


        CommonTree PLAYER88_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:115:11: ( PLAYER | dupli )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==PLAYER) ) {
                alt25=1;
            }
            else if ( (LA25_0==DUPLICABLE) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:116:5: PLAYER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYER88=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_entityMode988); 
                    PLAYER88_tree = (CommonTree)adaptor.create(PLAYER88);
                    adaptor.addChild(root_0, PLAYER88_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:117:7: dupli
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dupli_in_entityMode996);
                    dupli89=dupli();

                    state._fsp--;

                    adaptor.addChild(root_0, dupli89.getTree());

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

    public static class dupli_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dupli"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:121:1: dupli : DUPLICABLE ;
    public final hightParser.dupli_return dupli() throws RecognitionException {
        hightParser.dupli_return retval = new hightParser.dupli_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DUPLICABLE90=null;

        CommonTree DUPLICABLE90_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:121:7: ( DUPLICABLE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:122:5: DUPLICABLE
            {
            root_0 = (CommonTree)adaptor.nil();

            DUPLICABLE90=(Token)match(input,DUPLICABLE,FOLLOW_DUPLICABLE_in_dupli1015); 
            DUPLICABLE90_tree = (CommonTree)adaptor.create(DUPLICABLE90);
            adaptor.addChild(root_0, DUPLICABLE90_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:1: view : ( FIRST | THIRD );
    public final hightParser.view_return view() throws RecognitionException {
        hightParser.view_return retval = new hightParser.view_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set91=null;

        CommonTree set91_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:125:6: ( FIRST | THIRD )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set91=(Token)input.LT(1);
            if ( (input.LA(1)>=FIRST && input.LA(1)<=THIRD) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set91));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:130:1: allocationObject : ( ( IDENT | 'value' ) ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) );
    public final hightParser.allocationObject_return allocationObject() throws RecognitionException {
        hightParser.allocationObject_return retval = new hightParser.allocationObject_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT92=null;
        Token string_literal93=null;
        Token AT94=null;
        Token AT97=null;
        Token AT100=null;
        Token IDENT101=null;
        Token AT103=null;
        hightParser.valAggregation_return valAggregation95 = null;

        hightParser.typeCoordonnees_return typeCoordonnees96 = null;

        hightParser.coordinates_return coordinates98 = null;

        hightParser.attributListeOuObjet_return attributListeOuObjet99 = null;

        hightParser.attributTps_return attributTps102 = null;

        hightParser.operation_return operation104 = null;

        hightParser.timeUnit_return timeUnit105 = null;


        CommonTree IDENT92_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree AT94_tree=null;
        CommonTree AT97_tree=null;
        CommonTree AT100_tree=null;
        CommonTree IDENT101_tree=null;
        CommonTree AT103_tree=null;
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
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:130:18: ( ( IDENT | 'value' ) ( AT valAggregation )? -> ^( ALLOCATION_KW IDENT ( valAggregation )? ) | typeCoordonnees AT coordinates -> ^( ALLOCATION_KW typeCoordonnees coordinates ) | attributListeOuObjet AT IDENT -> ^( ALLOCATION_KW attributListeOuObjet IDENT ) | attributTps AT operation timeUnit -> ^( ALLOCATION_KW attributTps operation timeUnit ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case IDENT:
            case VALUE:
                {
                alt28=1;
                }
                break;
            case POSITION:
            case ORIENTATION:
            case SIZE:
                {
                alt28=2;
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
                alt28=3;
                }
                break;
            case BOOST_INTERVAL:
            case SHOOT_INTERVAL:
            case RELOAD_TIME:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:131:5: ( IDENT | 'value' ) ( AT valAggregation )?
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:131:5: ( IDENT | 'value' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==IDENT) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==VALUE) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:131:6: IDENT
                            {
                            IDENT92=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject1059);  
                            stream_IDENT.add(IDENT92);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:131:14: 'value'
                            {
                            string_literal93=(Token)match(input,VALUE,FOLLOW_VALUE_in_allocationObject1063);  
                            stream_VALUE.add(string_literal93);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:131:23: ( AT valAggregation )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==AT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:131:24: AT valAggregation
                            {
                            AT94=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1067);  
                            stream_AT.add(AT94);

                            pushFollow(FOLLOW_valAggregation_in_allocationObject1069);
                            valAggregation95=valAggregation();

                            state._fsp--;

                            stream_valAggregation.add(valAggregation95.getTree());

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
                    // 132:7: -> ^( ALLOCATION_KW IDENT ( valAggregation )? )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:132:10: ^( ALLOCATION_KW IDENT ( valAggregation )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOCATION_KW, "ALLOCATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:132:33: ( valAggregation )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:133:7: typeCoordonnees AT coordinates
                    {
                    pushFollow(FOLLOW_typeCoordonnees_in_allocationObject1105);
                    typeCoordonnees96=typeCoordonnees();

                    state._fsp--;

                    stream_typeCoordonnees.add(typeCoordonnees96.getTree());
                    AT97=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1107);  
                    stream_AT.add(AT97);

                    pushFollow(FOLLOW_coordinates_in_allocationObject1109);
                    coordinates98=coordinates();

                    state._fsp--;

                    stream_coordinates.add(coordinates98.getTree());


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
                    // 134:7: -> ^( ALLOCATION_KW typeCoordonnees coordinates )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:134:10: ^( ALLOCATION_KW typeCoordonnees coordinates )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:135:7: attributListeOuObjet AT IDENT
                    {
                    pushFollow(FOLLOW_attributListeOuObjet_in_allocationObject1146);
                    attributListeOuObjet99=attributListeOuObjet();

                    state._fsp--;

                    stream_attributListeOuObjet.add(attributListeOuObjet99.getTree());
                    AT100=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1148);  
                    stream_AT.add(AT100);

                    IDENT101=(Token)match(input,IDENT,FOLLOW_IDENT_in_allocationObject1150);  
                    stream_IDENT.add(IDENT101);



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
                    // 136:7: -> ^( ALLOCATION_KW attributListeOuObjet IDENT )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:136:10: ^( ALLOCATION_KW attributListeOuObjet IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:137:7: attributTps AT operation timeUnit
                    {
                    pushFollow(FOLLOW_attributTps_in_allocationObject1188);
                    attributTps102=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps102.getTree());
                    AT103=(Token)match(input,AT,FOLLOW_AT_in_allocationObject1190);  
                    stream_AT.add(AT103);

                    pushFollow(FOLLOW_operation_in_allocationObject1192);
                    operation104=operation();

                    state._fsp--;

                    stream_operation.add(operation104.getTree());
                    pushFollow(FOLLOW_timeUnit_in_allocationObject1194);
                    timeUnit105=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit105.getTree());


                    // AST REWRITE
                    // elements: attributTps, timeUnit, operation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 138:7: -> ^( ALLOCATION_KW attributTps operation timeUnit )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:138:10: ^( ALLOCATION_KW attributTps operation timeUnit )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:1: valAggregation : ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) | 'true' | 'false' );
    public final hightParser.valAggregation_return valAggregation() throws RecognitionException {
        hightParser.valAggregation_return retval = new hightParser.valAggregation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT108=null;
        Token string_literal109=null;
        Token string_literal110=null;
        hightParser.operation_return operation106 = null;

        hightParser.timeUnit_return timeUnit107 = null;


        CommonTree IDENT108_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:141:16: ( operation ( timeUnit )? -> ^( AGGREGATION_KW operation ( timeUnit )? ) | IDENT -> ^( AGGREGATION_KW IDENT ) | 'true' | 'false' )
            int alt30=4;
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
                alt30=1;
                }
                break;
            case IDENT:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==OF) ) {
                    alt30=1;
                }
                else if ( (LA30_2==FIN||LA30_2==VIRG) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 221:
                {
                alt30=3;
                }
                break;
            case 222:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:2: operation ( timeUnit )?
                    {
                    pushFollow(FOLLOW_operation_in_valAggregation1236);
                    operation106=operation();

                    state._fsp--;

                    stream_operation.add(operation106.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:12: ( timeUnit )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=MIN && LA29_0<=FRAME)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:142:13: timeUnit
                            {
                            pushFollow(FOLLOW_timeUnit_in_valAggregation1239);
                            timeUnit107=timeUnit();

                            state._fsp--;

                            stream_timeUnit.add(timeUnit107.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: operation, timeUnit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 143:4: -> ^( AGGREGATION_KW operation ( timeUnit )? )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:143:7: ^( AGGREGATION_KW operation ( timeUnit )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AGGREGATION_KW, "AGGREGATION_KW"), root_1);

                        adaptor.addChild(root_1, stream_operation.nextTree());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:143:34: ( timeUnit )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:144:4: IDENT
                    {
                    IDENT108=(Token)match(input,IDENT,FOLLOW_IDENT_in_valAggregation1261);  
                    stream_IDENT.add(IDENT108);



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
                    // 145:4: -> ^( AGGREGATION_KW IDENT )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:145:7: ^( AGGREGATION_KW IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:146:4: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal109=(Token)match(input,221,FOLLOW_221_in_valAggregation1277); 
                    string_literal109_tree = (CommonTree)adaptor.create(string_literal109);
                    adaptor.addChild(root_0, string_literal109_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:147:4: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal110=(Token)match(input,222,FOLLOW_222_in_valAggregation1282); 
                    string_literal110_tree = (CommonTree)adaptor.create(string_literal110);
                    adaptor.addChild(root_0, string_literal110_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:151:1: definition : DEFINITION_KW IDENT MEANS consequences ;
    public final hightParser.definition_return definition() throws RecognitionException {
        hightParser.definition_return retval = new hightParser.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINITION_KW111=null;
        Token IDENT112=null;
        Token MEANS113=null;
        hightParser.consequences_return consequences114 = null;


        CommonTree DEFINITION_KW111_tree=null;
        CommonTree IDENT112_tree=null;
        CommonTree MEANS113_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:151:12: ( DEFINITION_KW IDENT MEANS consequences )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:151:14: DEFINITION_KW IDENT MEANS consequences
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFINITION_KW111=(Token)match(input,DEFINITION_KW,FOLLOW_DEFINITION_KW_in_definition1295); 
            DEFINITION_KW111_tree = (CommonTree)adaptor.create(DEFINITION_KW111);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINITION_KW111_tree, root_0);

            IDENT112=(Token)match(input,IDENT,FOLLOW_IDENT_in_definition1298); 
            IDENT112_tree = (CommonTree)adaptor.create(IDENT112);
            adaptor.addChild(root_0, IDENT112_tree);

            MEANS113=(Token)match(input,MEANS,FOLLOW_MEANS_in_definition1300); 
            pushFollow(FOLLOW_consequences_in_definition1303);
            consequences114=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences114.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:153:1: consequences : consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) ;
    public final hightParser.consequences_return consequences() throws RecognitionException {
        hightParser.consequences_return retval = new hightParser.consequences_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRG116=null;
        hightParser.consequ_return consequ115 = null;

        hightParser.consequ_return consequ117 = null;


        CommonTree VIRG116_tree=null;
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_consequ=new RewriteRuleSubtreeStream(adaptor,"rule consequ");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:153:14: ( consequ ( VIRG consequ )* -> ^( CONSEQUENCES_KW ( consequ )+ ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:154:5: consequ ( VIRG consequ )*
            {
            pushFollow(FOLLOW_consequ_in_consequences1315);
            consequ115=consequ();

            state._fsp--;

            stream_consequ.add(consequ115.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:154:13: ( VIRG consequ )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==VIRG) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:154:14: VIRG consequ
            	    {
            	    VIRG116=(Token)match(input,VIRG,FOLLOW_VIRG_in_consequences1318);  
            	    stream_VIRG.add(VIRG116);

            	    pushFollow(FOLLOW_consequ_in_consequences1320);
            	    consequ117=consequ();

            	    state._fsp--;

            	    stream_consequ.add(consequ117.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
            // 155:7: -> ^( CONSEQUENCES_KW ( consequ )+ )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:155:9: ^( CONSEQUENCES_KW ( consequ )+ )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:158:1: consequ : ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW OF IDENT ( DBP IDENT )? | DEFEAT_KW OF IDENT ( DBP IDENT )? );
    public final hightParser.consequ_return consequ() throws RecognitionException {
        hightParser.consequ_return retval = new hightParser.consequ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT122=null;
        Token VICTORY_KW123=null;
        Token OF124=null;
        Token IDENT125=null;
        Token DBP126=null;
        Token IDENT127=null;
        Token DEFEAT_KW128=null;
        Token OF129=null;
        Token IDENT130=null;
        Token DBP131=null;
        Token IDENT132=null;
        hightParser.siAlors_return siAlors118 = null;

        hightParser.action_return action119 = null;

        hightParser.affectation_return affectation120 = null;

        hightParser.activCommande_return activCommande121 = null;


        CommonTree IDENT122_tree=null;
        CommonTree VICTORY_KW123_tree=null;
        CommonTree OF124_tree=null;
        CommonTree IDENT125_tree=null;
        CommonTree DBP126_tree=null;
        CommonTree IDENT127_tree=null;
        CommonTree DEFEAT_KW128_tree=null;
        CommonTree OF129_tree=null;
        CommonTree IDENT130_tree=null;
        CommonTree DBP131_tree=null;
        CommonTree IDENT132_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:158:9: ( siAlors | action | affectation | activCommande | IDENT | VICTORY_KW OF IDENT ( DBP IDENT )? | DEFEAT_KW OF IDENT ( DBP IDENT )? )
            int alt34=7;
            switch ( input.LA(1) ) {
            case IF_KW:
                {
                alt34=1;
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
                alt34=2;
                }
                break;
            case IDENT:
                {
                int LA34_3 = input.LA(2);

                if ( ((LA34_3>=ENDS_KW && LA34_3<=PAUSE_KW)||(LA34_3>=GRASPS_KW && LA34_3<=EXPELS_KW)||(LA34_3>=INGESTS_KW && LA34_3<=DIES_KW)||LA34_3==EQUIP||(LA34_3>=JUMP && LA34_3<=MOVE)||LA34_3==TURN||(LA34_3>=ACCELERATE && LA34_3<=BRAKE)) ) {
                    alt34=2;
                }
                else if ( (LA34_3==FIN||LA34_3==VIRG||LA34_3==ENDWAIT||(LA34_3>=ELSE && LA34_3<=ENDIF)) ) {
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:159:5: siAlors
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_siAlors_in_consequ1354);
                    siAlors118=siAlors();

                    state._fsp--;

                    adaptor.addChild(root_0, siAlors118.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:160:7: action
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_action_in_consequ1362);
                    action119=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action119.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:161:7: affectation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_affectation_in_consequ1370);
                    affectation120=affectation();

                    state._fsp--;

                    adaptor.addChild(root_0, affectation120.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:162:7: activCommande
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_activCommande_in_consequ1378);
                    activCommande121=activCommande();

                    state._fsp--;

                    adaptor.addChild(root_0, activCommande121.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:163:7: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT122=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1386); 
                    IDENT122_tree = (CommonTree)adaptor.create(IDENT122);
                    adaptor.addChild(root_0, IDENT122_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:164:7: VICTORY_KW OF IDENT ( DBP IDENT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW123=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_consequ1394); 
                    VICTORY_KW123_tree = (CommonTree)adaptor.create(VICTORY_KW123);
                    root_0 = (CommonTree)adaptor.becomeRoot(VICTORY_KW123_tree, root_0);

                    OF124=(Token)match(input,OF,FOLLOW_OF_in_consequ1397); 
                    IDENT125=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1400); 
                    IDENT125_tree = (CommonTree)adaptor.create(IDENT125);
                    adaptor.addChild(root_0, IDENT125_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:164:29: ( DBP IDENT )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==DBP) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:164:30: DBP IDENT
                            {
                            DBP126=(Token)match(input,DBP,FOLLOW_DBP_in_consequ1403); 
                            DBP126_tree = (CommonTree)adaptor.create(DBP126);
                            adaptor.addChild(root_0, DBP126_tree);

                            IDENT127=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1405); 
                            IDENT127_tree = (CommonTree)adaptor.create(IDENT127);
                            adaptor.addChild(root_0, IDENT127_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:165:7: DEFEAT_KW OF IDENT ( DBP IDENT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW128=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_consequ1415); 
                    DEFEAT_KW128_tree = (CommonTree)adaptor.create(DEFEAT_KW128);
                    root_0 = (CommonTree)adaptor.becomeRoot(DEFEAT_KW128_tree, root_0);

                    OF129=(Token)match(input,OF,FOLLOW_OF_in_consequ1418); 
                    IDENT130=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1421); 
                    IDENT130_tree = (CommonTree)adaptor.create(IDENT130);
                    adaptor.addChild(root_0, IDENT130_tree);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:165:28: ( DBP IDENT )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==DBP) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:165:29: DBP IDENT
                            {
                            DBP131=(Token)match(input,DBP,FOLLOW_DBP_in_consequ1424); 
                            DBP131_tree = (CommonTree)adaptor.create(DBP131);
                            adaptor.addChild(root_0, DBP131_tree);

                            IDENT132=(Token)match(input,IDENT,FOLLOW_IDENT_in_consequ1426); 
                            IDENT132_tree = (CommonTree)adaptor.create(IDENT132);
                            adaptor.addChild(root_0, IDENT132_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:168:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )? | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW | NEXTURN_KW IDENT | IDENT GRASPS_KW IDENT | IDENT EXPELS_KW IDENT BY operation | IDENT INGESTS_KW IDENT IN IDENT );
    public final hightParser.action_return action() throws RecognitionException {
        hightParser.action_return retval = new hightParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set135=null;
        Token ENDS_KW136=null;
        Token STARTS_KW137=null;
        Token PAUSE_KW138=null;
        Token char_literal139=null;
        Token IDENT140=null;
        Token PAUSE_KW141=null;
        Token MUTE_KW142=null;
        Token set143=null;
        Token PLAY_KW144=null;
        Token STOP_KW145=null;
        Token IDENT146=null;
        Token BLOCK_KW147=null;
        Token OF149=null;
        Token EFFACE_KW152=null;
        Token GENERATE_KW153=null;
        Token IN156=null;
        Token ON157=null;
        Token AT159=null;
        Token WAIT_KW161=null;
        Token THEN164=null;
        Token ENDWAIT166=null;
        Token SAVE_KW167=null;
        Token NEXTURN_KW168=null;
        Token IDENT169=null;
        Token IDENT170=null;
        Token GRASPS_KW171=null;
        Token IDENT172=null;
        Token IDENT173=null;
        Token EXPELS_KW174=null;
        Token IDENT175=null;
        Token BY176=null;
        Token IDENT178=null;
        Token INGESTS_KW179=null;
        Token IDENT180=null;
        Token IN181=null;
        Token IDENT182=null;
        hightParser.accesClasse_return accesClasse133 = null;

        hightParser.actionObjet_return actionObjet134 = null;

        hightParser.transformation_return transformation148 = null;

        hightParser.accesClasse_return accesClasse150 = null;

        hightParser.coordinates_return coordinates151 = null;

        hightParser.operation_return operation154 = null;

        hightParser.accesLocal_return accesLocal155 = null;

        hightParser.accesLocal_return accesLocal158 = null;

        hightParser.coordinates_return coordinates160 = null;

        hightParser.operation_return operation162 = null;

        hightParser.timeUnit_return timeUnit163 = null;

        hightParser.consequences_return consequences165 = null;

        hightParser.operation_return operation177 = null;


        CommonTree set135_tree=null;
        CommonTree ENDS_KW136_tree=null;
        CommonTree STARTS_KW137_tree=null;
        CommonTree PAUSE_KW138_tree=null;
        CommonTree char_literal139_tree=null;
        CommonTree IDENT140_tree=null;
        CommonTree PAUSE_KW141_tree=null;
        CommonTree MUTE_KW142_tree=null;
        CommonTree set143_tree=null;
        CommonTree PLAY_KW144_tree=null;
        CommonTree STOP_KW145_tree=null;
        CommonTree IDENT146_tree=null;
        CommonTree BLOCK_KW147_tree=null;
        CommonTree OF149_tree=null;
        CommonTree EFFACE_KW152_tree=null;
        CommonTree GENERATE_KW153_tree=null;
        CommonTree IN156_tree=null;
        CommonTree ON157_tree=null;
        CommonTree AT159_tree=null;
        CommonTree WAIT_KW161_tree=null;
        CommonTree THEN164_tree=null;
        CommonTree ENDWAIT166_tree=null;
        CommonTree SAVE_KW167_tree=null;
        CommonTree NEXTURN_KW168_tree=null;
        CommonTree IDENT169_tree=null;
        CommonTree IDENT170_tree=null;
        CommonTree GRASPS_KW171_tree=null;
        CommonTree IDENT172_tree=null;
        CommonTree IDENT173_tree=null;
        CommonTree EXPELS_KW174_tree=null;
        CommonTree IDENT175_tree=null;
        CommonTree BY176_tree=null;
        CommonTree IDENT178_tree=null;
        CommonTree INGESTS_KW179_tree=null;
        CommonTree IDENT180_tree=null;
        CommonTree IN181_tree=null;
        CommonTree IDENT182_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:168:8: ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )? | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW | NEXTURN_KW IDENT | IDENT GRASPS_KW IDENT | IDENT EXPELS_KW IDENT BY operation | IDENT INGESTS_KW IDENT IN IDENT )
            int alt42=11;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:169:5: accesClasse actionObjet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_action1446);
                    accesClasse133=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse133.getTree());
                    pushFollow(FOLLOW_actionObjet_in_action1448);
                    actionObjet134=actionObjet();

                    state._fsp--;

                    adaptor.addChild(root_0, actionObjet134.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:7: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set135=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set135));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:22: ( ENDS_KW | STARTS_KW | PAUSE_KW )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case ENDS_KW:
                        {
                        alt35=1;
                        }
                        break;
                    case STARTS_KW:
                        {
                        alt35=2;
                        }
                        break;
                    case PAUSE_KW:
                        {
                        alt35=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:23: ENDS_KW
                            {
                            ENDS_KW136=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_action1465); 
                            ENDS_KW136_tree = (CommonTree)adaptor.create(ENDS_KW136);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW136_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:34: STARTS_KW
                            {
                            STARTS_KW137=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_action1470); 
                            STARTS_KW137_tree = (CommonTree)adaptor.create(STARTS_KW137);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW137_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:47: PAUSE_KW
                            {
                            PAUSE_KW138=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1475); 
                            PAUSE_KW138_tree = (CommonTree)adaptor.create(PAUSE_KW138);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW138_tree, root_0);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:58: ( ':' IDENT )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==DBP) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:170:59: ':' IDENT
                            {
                            char_literal139=(Token)match(input,DBP,FOLLOW_DBP_in_action1480); 
                            char_literal139_tree = (CommonTree)adaptor.create(char_literal139);
                            adaptor.addChild(root_0, char_literal139_tree);

                            IDENT140=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1482); 
                            IDENT140_tree = (CommonTree)adaptor.create(IDENT140);
                            adaptor.addChild(root_0, IDENT140_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:7: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:7: ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:8: PAUSE_KW
                            {
                            PAUSE_KW141=(Token)match(input,PAUSE_KW,FOLLOW_PAUSE_KW_in_action1495); 
                            PAUSE_KW141_tree = (CommonTree)adaptor.create(PAUSE_KW141);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSE_KW141_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:20: MUTE_KW ( ON | OFF )
                            {
                            MUTE_KW142=(Token)match(input,MUTE_KW,FOLLOW_MUTE_KW_in_action1500); 
                            MUTE_KW142_tree = (CommonTree)adaptor.create(MUTE_KW142);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTE_KW142_tree, root_0);

                            set143=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set143));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:42: PLAY_KW
                            {
                            PLAY_KW144=(Token)match(input,PLAY_KW,FOLLOW_PLAY_KW_in_action1513); 
                            PLAY_KW144_tree = (CommonTree)adaptor.create(PLAY_KW144);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAY_KW144_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:171:53: STOP_KW
                            {
                            STOP_KW145=(Token)match(input,STOP_KW,FOLLOW_STOP_KW_in_action1518); 
                            STOP_KW145_tree = (CommonTree)adaptor.create(STOP_KW145);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOP_KW145_tree, root_0);


                            }
                            break;

                    }

                    IDENT146=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1523); 
                    IDENT146_tree = (CommonTree)adaptor.create(IDENT146);
                    adaptor.addChild(root_0, IDENT146_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:172:7: BLOCK_KW transformation OF accesClasse coordinates
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLOCK_KW147=(Token)match(input,BLOCK_KW,FOLLOW_BLOCK_KW_in_action1531); 
                    BLOCK_KW147_tree = (CommonTree)adaptor.create(BLOCK_KW147);
                    root_0 = (CommonTree)adaptor.becomeRoot(BLOCK_KW147_tree, root_0);

                    pushFollow(FOLLOW_transformation_in_action1534);
                    transformation148=transformation();

                    state._fsp--;

                    adaptor.addChild(root_0, transformation148.getTree());
                    OF149=(Token)match(input,OF,FOLLOW_OF_in_action1536); 
                    pushFollow(FOLLOW_accesClasse_in_action1539);
                    accesClasse150=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse150.getTree());
                    pushFollow(FOLLOW_coordinates_in_action1541);
                    coordinates151=coordinates();

                    state._fsp--;

                    adaptor.addChild(root_0, coordinates151.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:7: ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:7: ( EFFACE_KW | GENERATE_KW )
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:8: EFFACE_KW
                            {
                            EFFACE_KW152=(Token)match(input,EFFACE_KW,FOLLOW_EFFACE_KW_in_action1550); 
                            EFFACE_KW152_tree = (CommonTree)adaptor.create(EFFACE_KW152);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACE_KW152_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:21: GENERATE_KW
                            {
                            GENERATE_KW153=(Token)match(input,GENERATE_KW,FOLLOW_GENERATE_KW_in_action1555); 
                            GENERATE_KW153_tree = (CommonTree)adaptor.create(GENERATE_KW153);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATE_KW153_tree, root_0);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:35: ( ( operation )? accesLocal )
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:36: ( operation )? accesLocal
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:36: ( operation )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==FLOAT||LA39_0==PG||LA39_0==RANDOM_KW||(LA39_0>=DISTANCE_KW && LA39_0<=VALUE)) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==IDENT) ) {
                        int LA39_2 = input.LA(2);

                        if ( (LA39_2==OF) ) {
                            alt39=1;
                        }
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:36: operation
                            {
                            pushFollow(FOLLOW_operation_in_action1560);
                            operation154=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation154.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesLocal_in_action1563);
                    accesLocal155=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal155.getTree());

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:59: ( ( IN | ON ) accesLocal | AT coordinates )?
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:60: ( IN | ON ) accesLocal
                            {
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:60: ( IN | ON )
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
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:61: IN
                                    {
                                    IN156=(Token)match(input,IN,FOLLOW_IN_in_action1568); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:65: ON
                                    {
                                    ON157=(Token)match(input,ON,FOLLOW_ON_in_action1571); 

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_action1575);
                            accesLocal158=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal158.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:173:83: AT coordinates
                            {
                            AT159=(Token)match(input,AT,FOLLOW_AT_in_action1579); 
                            pushFollow(FOLLOW_coordinates_in_action1582);
                            coordinates160=coordinates();

                            state._fsp--;

                            adaptor.addChild(root_0, coordinates160.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:174:7: WAIT_KW operation timeUnit THEN consequences ENDWAIT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAIT_KW161=(Token)match(input,WAIT_KW,FOLLOW_WAIT_KW_in_action1593); 
                    WAIT_KW161_tree = (CommonTree)adaptor.create(WAIT_KW161);
                    root_0 = (CommonTree)adaptor.becomeRoot(WAIT_KW161_tree, root_0);

                    pushFollow(FOLLOW_operation_in_action1596);
                    operation162=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation162.getTree());
                    pushFollow(FOLLOW_timeUnit_in_action1598);
                    timeUnit163=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit163.getTree());
                    THEN164=(Token)match(input,THEN,FOLLOW_THEN_in_action1600); 
                    pushFollow(FOLLOW_consequences_in_action1603);
                    consequences165=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences165.getTree());
                    ENDWAIT166=(Token)match(input,ENDWAIT,FOLLOW_ENDWAIT_in_action1605); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:175:7: SAVE_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SAVE_KW167=(Token)match(input,SAVE_KW,FOLLOW_SAVE_KW_in_action1614); 
                    SAVE_KW167_tree = (CommonTree)adaptor.create(SAVE_KW167);
                    adaptor.addChild(root_0, SAVE_KW167_tree);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:176:7: NEXTURN_KW IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEXTURN_KW168=(Token)match(input,NEXTURN_KW,FOLLOW_NEXTURN_KW_in_action1622); 
                    NEXTURN_KW168_tree = (CommonTree)adaptor.create(NEXTURN_KW168);
                    root_0 = (CommonTree)adaptor.becomeRoot(NEXTURN_KW168_tree, root_0);

                    IDENT169=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1625); 
                    IDENT169_tree = (CommonTree)adaptor.create(IDENT169);
                    adaptor.addChild(root_0, IDENT169_tree);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:178:7: IDENT GRASPS_KW IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT170=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1681); 
                    IDENT170_tree = (CommonTree)adaptor.create(IDENT170);
                    adaptor.addChild(root_0, IDENT170_tree);

                    GRASPS_KW171=(Token)match(input,GRASPS_KW,FOLLOW_GRASPS_KW_in_action1683); 
                    GRASPS_KW171_tree = (CommonTree)adaptor.create(GRASPS_KW171);
                    root_0 = (CommonTree)adaptor.becomeRoot(GRASPS_KW171_tree, root_0);

                    IDENT172=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1686); 
                    IDENT172_tree = (CommonTree)adaptor.create(IDENT172);
                    adaptor.addChild(root_0, IDENT172_tree);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:179:7: IDENT EXPELS_KW IDENT BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT173=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1694); 
                    IDENT173_tree = (CommonTree)adaptor.create(IDENT173);
                    adaptor.addChild(root_0, IDENT173_tree);

                    EXPELS_KW174=(Token)match(input,EXPELS_KW,FOLLOW_EXPELS_KW_in_action1696); 
                    EXPELS_KW174_tree = (CommonTree)adaptor.create(EXPELS_KW174);
                    root_0 = (CommonTree)adaptor.becomeRoot(EXPELS_KW174_tree, root_0);

                    IDENT175=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1699); 
                    IDENT175_tree = (CommonTree)adaptor.create(IDENT175);
                    adaptor.addChild(root_0, IDENT175_tree);

                    BY176=(Token)match(input,BY,FOLLOW_BY_in_action1701); 
                    pushFollow(FOLLOW_operation_in_action1704);
                    operation177=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation177.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:180:7: IDENT INGESTS_KW IDENT IN IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT178=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1712); 
                    IDENT178_tree = (CommonTree)adaptor.create(IDENT178);
                    adaptor.addChild(root_0, IDENT178_tree);

                    INGESTS_KW179=(Token)match(input,INGESTS_KW,FOLLOW_INGESTS_KW_in_action1714); 
                    INGESTS_KW179_tree = (CommonTree)adaptor.create(INGESTS_KW179);
                    root_0 = (CommonTree)adaptor.becomeRoot(INGESTS_KW179_tree, root_0);

                    IDENT180=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1717); 
                    IDENT180_tree = (CommonTree)adaptor.create(IDENT180);
                    adaptor.addChild(root_0, IDENT180_tree);

                    IN181=(Token)match(input,IN,FOLLOW_IN_in_action1719); 
                    IDENT182=(Token)match(input,IDENT,FOLLOW_IDENT_in_action1722); 
                    IDENT182_tree = (CommonTree)adaptor.create(IDENT182);
                    adaptor.addChild(root_0, IDENT182_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:1: actionObjet : ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions HAPPENS )? | EQUIP ( accesLocal | NEXT | PREVIOUS ) );
    public final hightParser.actionObjet_return actionObjet() throws RecognitionException {
        hightParser.actionObjet_return retval = new hightParser.actionObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIES_KW183=null;
        Token DURING186=null;
        Token UNTIL189=null;
        Token HAPPENS191=null;
        Token EQUIP192=null;
        Token NEXT194=null;
        Token PREVIOUS195=null;
        hightParser.actionCommandePressee_return actionCommandePressee184 = null;

        hightParser.actionCommandeMaintenue_return actionCommandeMaintenue185 = null;

        hightParser.operation_return operation187 = null;

        hightParser.timeUnit_return timeUnit188 = null;

        hightParser.conditions_return conditions190 = null;

        hightParser.accesLocal_return accesLocal193 = null;


        CommonTree DIES_KW183_tree=null;
        CommonTree DURING186_tree=null;
        CommonTree UNTIL189_tree=null;
        CommonTree HAPPENS191_tree=null;
        CommonTree EQUIP192_tree=null;
        CommonTree NEXT194_tree=null;
        CommonTree PREVIOUS195_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:184:13: ( DIES_KW | actionCommandePressee | actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions HAPPENS )? | EQUIP ( accesLocal | NEXT | PREVIOUS ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case DIES_KW:
                {
                alt45=1;
                }
                break;
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:185:5: DIES_KW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DIES_KW183=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_actionObjet1765); 
                    DIES_KW183_tree = (CommonTree)adaptor.create(DIES_KW183);
                    adaptor.addChild(root_0, DIES_KW183_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:186:7: actionCommandePressee
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandePressee_in_actionObjet1773);
                    actionCommandePressee184=actionCommandePressee();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandePressee184.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:187:7: actionCommandeMaintenue ( DURING operation timeUnit | UNTIL conditions HAPPENS )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_actionCommandeMaintenue_in_actionObjet1781);
                    actionCommandeMaintenue185=actionCommandeMaintenue();

                    state._fsp--;

                    adaptor.addChild(root_0, actionCommandeMaintenue185.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:187:31: ( DURING operation timeUnit | UNTIL conditions HAPPENS )?
                    int alt43=3;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==DURING) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==UNTIL) ) {
                        alt43=2;
                    }
                    switch (alt43) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:187:32: DURING operation timeUnit
                            {
                            DURING186=(Token)match(input,DURING,FOLLOW_DURING_in_actionObjet1784); 
                            DURING186_tree = (CommonTree)adaptor.create(DURING186);
                            root_0 = (CommonTree)adaptor.becomeRoot(DURING186_tree, root_0);

                            pushFollow(FOLLOW_operation_in_actionObjet1787);
                            operation187=operation();

                            state._fsp--;

                            adaptor.addChild(root_0, operation187.getTree());
                            pushFollow(FOLLOW_timeUnit_in_actionObjet1789);
                            timeUnit188=timeUnit();

                            state._fsp--;

                            adaptor.addChild(root_0, timeUnit188.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:187:61: UNTIL conditions HAPPENS
                            {
                            UNTIL189=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_actionObjet1793); 
                            UNTIL189_tree = (CommonTree)adaptor.create(UNTIL189);
                            root_0 = (CommonTree)adaptor.becomeRoot(UNTIL189_tree, root_0);

                            pushFollow(FOLLOW_conditions_in_actionObjet1796);
                            conditions190=conditions();

                            state._fsp--;

                            adaptor.addChild(root_0, conditions190.getTree());
                            HAPPENS191=(Token)match(input,HAPPENS,FOLLOW_HAPPENS_in_actionObjet1798); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:188:7: EQUIP ( accesLocal | NEXT | PREVIOUS )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EQUIP192=(Token)match(input,EQUIP,FOLLOW_EQUIP_in_actionObjet1809); 
                    EQUIP192_tree = (CommonTree)adaptor.create(EQUIP192);
                    root_0 = (CommonTree)adaptor.becomeRoot(EQUIP192_tree, root_0);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:188:14: ( accesLocal | NEXT | PREVIOUS )
                    int alt44=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case NUM:
                    case PLAYER:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:188:15: accesLocal
                            {
                            pushFollow(FOLLOW_accesLocal_in_actionObjet1813);
                            accesLocal193=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal193.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:188:28: NEXT
                            {
                            NEXT194=(Token)match(input,NEXT,FOLLOW_NEXT_in_actionObjet1817); 
                            NEXT194_tree = (CommonTree)adaptor.create(NEXT194);
                            adaptor.addChild(root_0, NEXT194_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:188:35: PREVIOUS
                            {
                            PREVIOUS195=(Token)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_actionObjet1821); 
                            PREVIOUS195_tree = (CommonTree)adaptor.create(PREVIOUS195);
                            adaptor.addChild(root_0, PREVIOUS195_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:191:1: actionCommandePressee : JUMP operation ;
    public final hightParser.actionCommandePressee_return actionCommandePressee() throws RecognitionException {
        hightParser.actionCommandePressee_return retval = new hightParser.actionCommandePressee_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token JUMP196=null;
        hightParser.operation_return operation197 = null;


        CommonTree JUMP196_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:191:23: ( JUMP operation )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:192:5: JUMP operation
            {
            root_0 = (CommonTree)adaptor.nil();

            JUMP196=(Token)match(input,JUMP,FOLLOW_JUMP_in_actionCommandePressee1841); 
            JUMP196_tree = (CommonTree)adaptor.create(JUMP196);
            root_0 = (CommonTree)adaptor.becomeRoot(JUMP196_tree, root_0);

            pushFollow(FOLLOW_operation_in_actionCommandePressee1844);
            operation197=operation();

            state._fsp--;

            adaptor.addChild(root_0, operation197.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:195:1: actionCommandeMaintenue : ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) BY operation | TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) BY operation | ACCELERATE BY operation | BRAKE BY operation );
    public final hightParser.actionCommandeMaintenue_return actionCommandeMaintenue() throws RecognitionException {
        hightParser.actionCommandeMaintenue_return retval = new hightParser.actionCommandeMaintenue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVE198=null;
        Token set199=null;
        Token BY200=null;
        Token TURN202=null;
        Token set203=null;
        Token BY204=null;
        Token ACCELERATE206=null;
        Token BY207=null;
        Token BRAKE209=null;
        Token BY210=null;
        hightParser.operation_return operation201 = null;

        hightParser.operation_return operation205 = null;

        hightParser.operation_return operation208 = null;

        hightParser.operation_return operation211 = null;


        CommonTree MOVE198_tree=null;
        CommonTree set199_tree=null;
        CommonTree BY200_tree=null;
        CommonTree TURN202_tree=null;
        CommonTree set203_tree=null;
        CommonTree BY204_tree=null;
        CommonTree ACCELERATE206_tree=null;
        CommonTree BY207_tree=null;
        CommonTree BRAKE209_tree=null;
        CommonTree BY210_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:195:25: ( MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) BY operation | TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) BY operation | ACCELERATE BY operation | BRAKE BY operation )
            int alt46=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt46=1;
                }
                break;
            case TURN:
                {
                alt46=2;
                }
                break;
            case ACCELERATE:
                {
                alt46=3;
                }
                break;
            case BRAKE:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:196:3: MOVE ( LEFT | RIGHT | FORWARD | BACKWARD | WUP | WDOWN ) BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MOVE198=(Token)match(input,MOVE,FOLLOW_MOVE_in_actionCommandeMaintenue1861); 
                    MOVE198_tree = (CommonTree)adaptor.create(MOVE198);
                    root_0 = (CommonTree)adaptor.becomeRoot(MOVE198_tree, root_0);

                    set199=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=WDOWN) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set199));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    BY200=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1888); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1891);
                    operation201=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation201.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:197:5: TURN ( LEFT | RIGHT | WUP | WDOWN | CLOCKWISE | ANTICLOCKWISE ) BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TURN202=(Token)match(input,TURN,FOLLOW_TURN_in_actionCommandeMaintenue1897); 
                    TURN202_tree = (CommonTree)adaptor.create(TURN202);
                    root_0 = (CommonTree)adaptor.becomeRoot(TURN202_tree, root_0);

                    set203=(Token)input.LT(1);
                    if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLOCKWISE && input.LA(1)<=ANTICLOCKWISE) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set203));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    BY204=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1917); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1920);
                    operation205=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation205.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:198:5: ACCELERATE BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACCELERATE206=(Token)match(input,ACCELERATE,FOLLOW_ACCELERATE_in_actionCommandeMaintenue1926); 
                    ACCELERATE206_tree = (CommonTree)adaptor.create(ACCELERATE206);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACCELERATE206_tree, root_0);

                    BY207=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1929); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1932);
                    operation208=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation208.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:199:5: BRAKE BY operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BRAKE209=(Token)match(input,BRAKE,FOLLOW_BRAKE_in_actionCommandeMaintenue1938); 
                    BRAKE209_tree = (CommonTree)adaptor.create(BRAKE209);
                    root_0 = (CommonTree)adaptor.becomeRoot(BRAKE209_tree, root_0);

                    BY210=(Token)match(input,BY,FOLLOW_BY_in_actionCommandeMaintenue1941); 
                    pushFollow(FOLLOW_operation_in_actionCommandeMaintenue1944);
                    operation211=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation211.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:203:1: transformation : ( TRANSLATION | ROTATION | SCALE );
    public final hightParser.transformation_return transformation() throws RecognitionException {
        hightParser.transformation_return retval = new hightParser.transformation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set212=null;

        CommonTree set212_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:203:16: ( TRANSLATION | ROTATION | SCALE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set212=(Token)input.LT(1);
            if ( (input.LA(1)>=TRANSLATION && input.LA(1)<=SCALE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set212));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:209:1: coordinates : operation operation operation -> ^( COORDINATE_KW operation operation operation ) ;
    public final hightParser.coordinates_return coordinates() throws RecognitionException {
        hightParser.coordinates_return retval = new hightParser.coordinates_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        hightParser.operation_return operation213 = null;

        hightParser.operation_return operation214 = null;

        hightParser.operation_return operation215 = null;


        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:209:13: ( operation operation operation -> ^( COORDINATE_KW operation operation operation ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:210:5: operation operation operation
            {
            pushFollow(FOLLOW_operation_in_coordinates1998);
            operation213=operation();

            state._fsp--;

            stream_operation.add(operation213.getTree());
            pushFollow(FOLLOW_operation_in_coordinates2000);
            operation214=operation();

            state._fsp--;

            stream_operation.add(operation214.getTree());
            pushFollow(FOLLOW_operation_in_coordinates2002);
            operation215=operation();

            state._fsp--;

            stream_operation.add(operation215.getTree());


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
            // 211:7: -> ^( COORDINATE_KW operation operation operation )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:211:10: ^( COORDINATE_KW operation operation operation )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:216:1: commande : COMMAND_KW FOR player_list IS actionCommande ( VIRG actionCommande )* ;
    public final hightParser.commande_return commande() throws RecognitionException {
        hightParser.commande_return retval = new hightParser.commande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMAND_KW216=null;
        Token FOR217=null;
        Token IS219=null;
        Token VIRG221=null;
        hightParser.player_list_return player_list218 = null;

        hightParser.actionCommande_return actionCommande220 = null;

        hightParser.actionCommande_return actionCommande222 = null;


        CommonTree COMMAND_KW216_tree=null;
        CommonTree FOR217_tree=null;
        CommonTree IS219_tree=null;
        CommonTree VIRG221_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:216:10: ( COMMAND_KW FOR player_list IS actionCommande ( VIRG actionCommande )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:217:5: COMMAND_KW FOR player_list IS actionCommande ( VIRG actionCommande )*
            {
            root_0 = (CommonTree)adaptor.nil();

            COMMAND_KW216=(Token)match(input,COMMAND_KW,FOLLOW_COMMAND_KW_in_commande2041); 
            COMMAND_KW216_tree = (CommonTree)adaptor.create(COMMAND_KW216);
            root_0 = (CommonTree)adaptor.becomeRoot(COMMAND_KW216_tree, root_0);

            FOR217=(Token)match(input,FOR,FOLLOW_FOR_in_commande2044); 
            pushFollow(FOLLOW_player_list_in_commande2047);
            player_list218=player_list();

            state._fsp--;

            adaptor.addChild(root_0, player_list218.getTree());
            IS219=(Token)match(input,IS,FOLLOW_IS_in_commande2049); 
            pushFollow(FOLLOW_actionCommande_in_commande2052);
            actionCommande220=actionCommande();

            state._fsp--;

            adaptor.addChild(root_0, actionCommande220.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:217:53: ( VIRG actionCommande )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==VIRG) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:217:54: VIRG actionCommande
            	    {
            	    VIRG221=(Token)match(input,VIRG,FOLLOW_VIRG_in_commande2055); 
            	    pushFollow(FOLLOW_actionCommande_in_commande2058);
            	    actionCommande222=actionCommande();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionCommande222.getTree());

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

    public static class player_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "player_list"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:220:1: player_list : IDENT ( VIRG IDENT )* ;
    public final hightParser.player_list_return player_list() throws RecognitionException {
        hightParser.player_list_return retval = new hightParser.player_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT223=null;
        Token VIRG224=null;
        Token IDENT225=null;

        CommonTree IDENT223_tree=null;
        CommonTree VIRG224_tree=null;
        CommonTree IDENT225_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:220:12: ( IDENT ( VIRG IDENT )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:221:5: IDENT ( VIRG IDENT )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT223=(Token)match(input,IDENT,FOLLOW_IDENT_in_player_list2077); 
            IDENT223_tree = (CommonTree)adaptor.create(IDENT223);
            adaptor.addChild(root_0, IDENT223_tree);

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:221:11: ( VIRG IDENT )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==VIRG) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:221:12: VIRG IDENT
            	    {
            	    VIRG224=(Token)match(input,VIRG,FOLLOW_VIRG_in_player_list2080); 
            	    IDENT225=(Token)match(input,IDENT,FOLLOW_IDENT_in_player_list2083); 
            	    IDENT225_tree = (CommonTree)adaptor.create(IDENT225);
            	    adaptor.addChild(root_0, IDENT225_tree);


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
    // $ANTLR end "player_list"

    public static class actionCommande_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionCommande"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:224:1: actionCommande : ( MOUSE souris ( commandMode )? FOR definitionId -> ^( MOUSE_KW souris ( commandMode )? definitionId ) | KEY clavier ( commandMode )? FOR definitionId -> ^( KEY_KW clavier ( commandMode )? definitionId ) );
    public final hightParser.actionCommande_return actionCommande() throws RecognitionException {
        hightParser.actionCommande_return retval = new hightParser.actionCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOUSE226=null;
        Token FOR229=null;
        Token KEY231=null;
        Token FOR234=null;
        hightParser.souris_return souris227 = null;

        hightParser.commandMode_return commandMode228 = null;

        hightParser.definitionId_return definitionId230 = null;

        hightParser.clavier_return clavier232 = null;

        hightParser.commandMode_return commandMode233 = null;

        hightParser.definitionId_return definitionId235 = null;


        CommonTree MOUSE226_tree=null;
        CommonTree FOR229_tree=null;
        CommonTree KEY231_tree=null;
        CommonTree FOR234_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_commandMode=new RewriteRuleSubtreeStream(adaptor,"rule commandMode");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        RewriteRuleSubtreeStream stream_definitionId=new RewriteRuleSubtreeStream(adaptor,"rule definitionId");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:224:16: ( MOUSE souris ( commandMode )? FOR definitionId -> ^( MOUSE_KW souris ( commandMode )? definitionId ) | KEY clavier ( commandMode )? FOR definitionId -> ^( KEY_KW clavier ( commandMode )? definitionId ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==MOUSE) ) {
                alt51=1;
            }
            else if ( (LA51_0==KEY) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:225:5: MOUSE souris ( commandMode )? FOR definitionId
                    {
                    MOUSE226=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_actionCommande2102);  
                    stream_MOUSE.add(MOUSE226);

                    pushFollow(FOLLOW_souris_in_actionCommande2104);
                    souris227=souris();

                    state._fsp--;

                    stream_souris.add(souris227.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:225:18: ( commandMode )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=PRESSED_KW && LA49_0<=RELEASED_KW)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:225:19: commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2107);
                            commandMode228=commandMode();

                            state._fsp--;

                            stream_commandMode.add(commandMode228.getTree());

                            }
                            break;

                    }

                    FOR229=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande2111);  
                    stream_FOR.add(FOR229);

                    pushFollow(FOLLOW_definitionId_in_actionCommande2113);
                    definitionId230=definitionId();

                    state._fsp--;

                    stream_definitionId.add(definitionId230.getTree());


                    // AST REWRITE
                    // elements: definitionId, commandMode, souris
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 226:7: -> ^( MOUSE_KW souris ( commandMode )? definitionId )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:226:10: ^( MOUSE_KW souris ( commandMode )? definitionId )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        adaptor.addChild(root_1, stream_souris.nextTree());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:226:28: ( commandMode )?
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:227:7: KEY clavier ( commandMode )? FOR definitionId
                    {
                    KEY231=(Token)match(input,KEY,FOLLOW_KEY_in_actionCommande2142);  
                    stream_KEY.add(KEY231);

                    pushFollow(FOLLOW_clavier_in_actionCommande2144);
                    clavier232=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier232.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:227:19: ( commandMode )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=PRESSED_KW && LA50_0<=RELEASED_KW)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:227:20: commandMode
                            {
                            pushFollow(FOLLOW_commandMode_in_actionCommande2147);
                            commandMode233=commandMode();

                            state._fsp--;

                            stream_commandMode.add(commandMode233.getTree());

                            }
                            break;

                    }

                    FOR234=(Token)match(input,FOR,FOLLOW_FOR_in_actionCommande2151);  
                    stream_FOR.add(FOR234);

                    pushFollow(FOLLOW_definitionId_in_actionCommande2153);
                    definitionId235=definitionId();

                    state._fsp--;

                    stream_definitionId.add(definitionId235.getTree());


                    // AST REWRITE
                    // elements: definitionId, clavier, commandMode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:7: -> ^( KEY_KW clavier ( commandMode )? definitionId )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:228:10: ^( KEY_KW clavier ( commandMode )? definitionId )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEY_KW, "KEY_KW"), root_1);

                        adaptor.addChild(root_1, stream_clavier.nextTree());
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:228:27: ( commandMode )?
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:231:1: commandMode : ( PRESSED_KW | HELD_KW | RELEASED_KW );
    public final hightParser.commandMode_return commandMode() throws RecognitionException {
        hightParser.commandMode_return retval = new hightParser.commandMode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set236=null;

        CommonTree set236_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:231:13: ( PRESSED_KW | HELD_KW | RELEASED_KW )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set236=(Token)input.LT(1);
            if ( (input.LA(1)>=PRESSED_KW && input.LA(1)<=RELEASED_KW) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set236));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:1: definitionId : IDENT ;
    public final hightParser.definitionId_return definitionId() throws RecognitionException {
        hightParser.definitionId_return retval = new hightParser.definitionId_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT237=null;

        CommonTree IDENT237_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:235:14: ( IDENT )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:236:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT237=(Token)match(input,IDENT,FOLLOW_IDENT_in_definitionId2216); 
            IDENT237_tree = (CommonTree)adaptor.create(IDENT237);
            adaptor.addChild(root_0, IDENT237_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:239:1: souris : ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN );
    public final hightParser.souris_return souris() throws RecognitionException {
        hightParser.souris_return retval = new hightParser.souris_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set238=null;

        CommonTree set238_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:239:8: ( WUP | WDOWN | LEFT | RIGHT | CLICK_LEFT | CLICK_MIDDLE | CLICK_RIGHT | SCROLL_UP | SCROLL_DOWN )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set238=(Token)input.LT(1);
            if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=CLICK_LEFT && input.LA(1)<=SCROLL_DOWN) ) {
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
    // $ANTLR end "souris"

    public static class clavier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clavier"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:243:1: clavier : ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER );
    public final hightParser.clavier_return clavier() throws RecognitionException {
        hightParser.clavier_return retval = new hightParser.clavier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set239=null;

        CommonTree set239_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:243:9: ( LETTER | WUP | WDOWN | LEFT | RIGHT | SPACE | ESCAPE | ENTER )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set239=(Token)input.LT(1);
            if ( (input.LA(1)>=LEFT && input.LA(1)<=RIGHT)||(input.LA(1)>=WUP && input.LA(1)<=WDOWN)||(input.LA(1)>=LETTER && input.LA(1)<=ENTER) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set239));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:247:1: activCommande : ( ACTIVATE_KW | DISABLE_KW ) typeCommand ;
    public final hightParser.activCommande_return activCommande() throws RecognitionException {
        hightParser.activCommande_return retval = new hightParser.activCommande_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ACTIVATE_KW240=null;
        Token DISABLE_KW241=null;
        hightParser.typeCommand_return typeCommand242 = null;


        CommonTree ACTIVATE_KW240_tree=null;
        CommonTree DISABLE_KW241_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:247:15: ( ( ACTIVATE_KW | DISABLE_KW ) typeCommand )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:248:5: ( ACTIVATE_KW | DISABLE_KW ) typeCommand
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:248:5: ( ACTIVATE_KW | DISABLE_KW )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:248:6: ACTIVATE_KW
                    {
                    ACTIVATE_KW240=(Token)match(input,ACTIVATE_KW,FOLLOW_ACTIVATE_KW_in_activCommande2342); 
                    ACTIVATE_KW240_tree = (CommonTree)adaptor.create(ACTIVATE_KW240);
                    root_0 = (CommonTree)adaptor.becomeRoot(ACTIVATE_KW240_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:248:21: DISABLE_KW
                    {
                    DISABLE_KW241=(Token)match(input,DISABLE_KW,FOLLOW_DISABLE_KW_in_activCommande2347); 
                    DISABLE_KW241_tree = (CommonTree)adaptor.create(DISABLE_KW241);
                    root_0 = (CommonTree)adaptor.becomeRoot(DISABLE_KW241_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeCommand_in_activCommande2351);
            typeCommand242=typeCommand();

            state._fsp--;

            adaptor.addChild(root_0, typeCommand242.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:251:1: typeCommand : ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD );
    public final hightParser.typeCommand_return typeCommand() throws RecognitionException {
        hightParser.typeCommand_return retval = new hightParser.typeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMANDS243=null;
        Token MOUSE244=null;
        Token VIRG246=null;
        Token KEY248=null;
        Token VIRG250=null;
        Token KEYBOARD252=null;
        hightParser.souris_return souris245 = null;

        hightParser.souris_return souris247 = null;

        hightParser.clavier_return clavier249 = null;

        hightParser.clavier_return clavier251 = null;


        CommonTree COMMANDS243_tree=null;
        CommonTree MOUSE244_tree=null;
        CommonTree VIRG246_tree=null;
        CommonTree KEY248_tree=null;
        CommonTree VIRG250_tree=null;
        CommonTree KEYBOARD252_tree=null;
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_MOUSE=new RewriteRuleTokenStream(adaptor,"token MOUSE");
        RewriteRuleTokenStream stream_VIRG=new RewriteRuleTokenStream(adaptor,"token VIRG");
        RewriteRuleSubtreeStream stream_souris=new RewriteRuleSubtreeStream(adaptor,"rule souris");
        RewriteRuleSubtreeStream stream_clavier=new RewriteRuleSubtreeStream(adaptor,"rule clavier");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:251:13: ( COMMANDS | MOUSE ( souris ( VIRG souris )* )? -> ^( MOUSE_KW ( souris )* ) | KEY clavier ( VIRG clavier )* -> ^( KEY_KW ( clavier )+ ) | KEYBOARD )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:252:5: COMMANDS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMMANDS243=(Token)match(input,COMMANDS,FOLLOW_COMMANDS_in_typeCommand2368); 
                    COMMANDS243_tree = (CommonTree)adaptor.create(COMMANDS243);
                    adaptor.addChild(root_0, COMMANDS243_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:7: MOUSE ( souris ( VIRG souris )* )?
                    {
                    MOUSE244=(Token)match(input,MOUSE,FOLLOW_MOUSE_in_typeCommand2376);  
                    stream_MOUSE.add(MOUSE244);

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:13: ( souris ( VIRG souris )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=LEFT && LA54_0<=RIGHT)||(LA54_0>=WUP && LA54_0<=WDOWN)||(LA54_0>=CLICK_LEFT && LA54_0<=SCROLL_DOWN)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:14: souris ( VIRG souris )*
                            {
                            pushFollow(FOLLOW_souris_in_typeCommand2379);
                            souris245=souris();

                            state._fsp--;

                            stream_souris.add(souris245.getTree());
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:21: ( VIRG souris )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==VIRG) ) {
                                    int LA53_1 = input.LA(2);

                                    if ( ((LA53_1>=LEFT && LA53_1<=RIGHT)||(LA53_1>=WUP && LA53_1<=WDOWN)||(LA53_1>=CLICK_LEFT && LA53_1<=SCROLL_DOWN)) ) {
                                        alt53=1;
                                    }


                                }


                                switch (alt53) {
                            	case 1 :
                            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:253:22: VIRG souris
                            	    {
                            	    VIRG246=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand2382);  
                            	    stream_VIRG.add(VIRG246);

                            	    pushFollow(FOLLOW_souris_in_typeCommand2384);
                            	    souris247=souris();

                            	    state._fsp--;

                            	    stream_souris.add(souris247.getTree());

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
                    // 254:7: -> ^( MOUSE_KW ( souris )* )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:254:10: ^( MOUSE_KW ( souris )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MOUSE_KW, "MOUSE_KW"), root_1);

                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:254:21: ( souris )*
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:255:7: KEY clavier ( VIRG clavier )*
                    {
                    KEY248=(Token)match(input,KEY,FOLLOW_KEY_in_typeCommand2411);  
                    stream_KEY.add(KEY248);

                    pushFollow(FOLLOW_clavier_in_typeCommand2413);
                    clavier249=clavier();

                    state._fsp--;

                    stream_clavier.add(clavier249.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:255:19: ( VIRG clavier )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==VIRG) ) {
                            int LA55_1 = input.LA(2);

                            if ( ((LA55_1>=LEFT && LA55_1<=RIGHT)||(LA55_1>=WUP && LA55_1<=WDOWN)||(LA55_1>=LETTER && LA55_1<=ENTER)) ) {
                                alt55=1;
                            }


                        }


                        switch (alt55) {
                    	case 1 :
                    	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:255:20: VIRG clavier
                    	    {
                    	    VIRG250=(Token)match(input,VIRG,FOLLOW_VIRG_in_typeCommand2416);  
                    	    stream_VIRG.add(VIRG250);

                    	    pushFollow(FOLLOW_clavier_in_typeCommand2418);
                    	    clavier251=clavier();

                    	    state._fsp--;

                    	    stream_clavier.add(clavier251.getTree());

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
                    // 256:7: -> ^( KEY_KW ( clavier )+ )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:256:10: ^( KEY_KW ( clavier )+ )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:257:7: KEYBOARD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    KEYBOARD252=(Token)match(input,KEYBOARD,FOLLOW_KEYBOARD_in_typeCommand2443); 
                    KEYBOARD252_tree = (CommonTree)adaptor.create(KEYBOARD252);
                    adaptor.addChild(root_0, KEYBOARD252_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:1: reglesJeu : RULE_KW declencheur THEN definitionId ;
    public final hightParser.reglesJeu_return reglesJeu() throws RecognitionException {
        hightParser.reglesJeu_return retval = new hightParser.reglesJeu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RULE_KW253=null;
        Token THEN255=null;
        hightParser.declencheur_return declencheur254 = null;

        hightParser.definitionId_return definitionId256 = null;


        CommonTree RULE_KW253_tree=null;
        CommonTree THEN255_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:259:11: ( RULE_KW declencheur THEN definitionId )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:260:5: RULE_KW declencheur THEN definitionId
            {
            root_0 = (CommonTree)adaptor.nil();

            RULE_KW253=(Token)match(input,RULE_KW,FOLLOW_RULE_KW_in_reglesJeu2455); 
            RULE_KW253_tree = (CommonTree)adaptor.create(RULE_KW253);
            root_0 = (CommonTree)adaptor.becomeRoot(RULE_KW253_tree, root_0);

            pushFollow(FOLLOW_declencheur_in_reglesJeu2458);
            declencheur254=declencheur();

            state._fsp--;

            adaptor.addChild(root_0, declencheur254.getTree());
            THEN255=(Token)match(input,THEN,FOLLOW_THEN_in_reglesJeu2460); 
            pushFollow(FOLLOW_definitionId_in_reglesJeu2463);
            definitionId256=definitionId();

            state._fsp--;

            adaptor.addChild(root_0, definitionId256.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:263:1: declencheur : ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | VICTORY_KW OF ( PLAYER | IDENT ) | DEFEAT_KW OF ( PLAYER | IDENT ) );
    public final hightParser.declencheur_return declencheur() throws RecognitionException {
        hightParser.declencheur_return retval = new hightParser.declencheur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOVES_KW258=null;
        Token DIES_KW259=null;
        Token set262=null;
        Token ENDS_KW263=null;
        Token STARTS_KW264=null;
        Token BECOMES266=null;
        Token VICTORY_KW268=null;
        Token OF269=null;
        Token set270=null;
        Token DEFEAT_KW271=null;
        Token OF272=null;
        Token set273=null;
        hightParser.accesClasse_return accesClasse257 = null;

        hightParser.declencheurTK_return declencheurTK260 = null;

        hightParser.declencheurKT_return declencheurKT261 = null;

        hightParser.variable_return variable265 = null;

        hightParser.varOuNB_return varOuNB267 = null;


        CommonTree MOVES_KW258_tree=null;
        CommonTree DIES_KW259_tree=null;
        CommonTree set262_tree=null;
        CommonTree ENDS_KW263_tree=null;
        CommonTree STARTS_KW264_tree=null;
        CommonTree BECOMES266_tree=null;
        CommonTree VICTORY_KW268_tree=null;
        CommonTree OF269_tree=null;
        CommonTree set270_tree=null;
        CommonTree DEFEAT_KW271_tree=null;
        CommonTree OF272_tree=null;
        CommonTree set273_tree=null;
        RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
        RewriteRuleSubtreeStream stream_varOuNB=new RewriteRuleSubtreeStream(adaptor,"rule varOuNB");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:263:13: ( accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT ) | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW ) | variable BECOMES varOuNB -> ^( BECOMES_VAR_KW variable varOuNB ) | VICTORY_KW OF ( PLAYER | IDENT ) | DEFEAT_KW OF ( PLAYER | IDENT ) )
            int alt59=5;
            switch ( input.LA(1) ) {
            case NUM:
            case PLAYER:
            case ALL:
                {
                alt59=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case OF:
                    {
                    alt59=3;
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
                    alt59=1;
                    }
                    break;
                case ENDS_KW:
                case STARTS_KW:
                    {
                    alt59=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 2, input);

                    throw nvae;
                }

                }
                break;
            case GAME:
                {
                alt59=2;
                }
                break;
            case X:
            case Y:
            case Z:
            case SCORE:
            case VALUE:
                {
                alt59=3;
                }
                break;
            case VICTORY_KW:
                {
                alt59=4;
                }
                break;
            case DEFEAT_KW:
                {
                alt59=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:5: accesClasse ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_declencheur2481);
                    accesClasse257=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse257.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:17: ( MOVES_KW | DIES_KW | declencheurTK | declencheurKT )
                    int alt57=4;
                    switch ( input.LA(1) ) {
                    case MOVES_KW:
                        {
                        alt57=1;
                        }
                        break;
                    case DIES_KW:
                        {
                        alt57=2;
                        }
                        break;
                    case TOUCHES_KW:
                    case KILLS_KW:
                    case OWNES_KW:
                    case NOTOWNES_KW:
                        {
                        alt57=3;
                        }
                        break;
                    case KILLED_KW:
                    case TOUCHED_KW:
                    case OWNED_KW:
                    case NOTOWNED_KW:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:18: MOVES_KW
                            {
                            MOVES_KW258=(Token)match(input,MOVES_KW,FOLLOW_MOVES_KW_in_declencheur2484); 
                            MOVES_KW258_tree = (CommonTree)adaptor.create(MOVES_KW258);
                            adaptor.addChild(root_0, MOVES_KW258_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:29: DIES_KW
                            {
                            DIES_KW259=(Token)match(input,DIES_KW,FOLLOW_DIES_KW_in_declencheur2488); 
                            DIES_KW259_tree = (CommonTree)adaptor.create(DIES_KW259);
                            adaptor.addChild(root_0, DIES_KW259_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:39: declencheurTK
                            {
                            pushFollow(FOLLOW_declencheurTK_in_declencheur2492);
                            declencheurTK260=declencheurTK();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurTK260.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:264:55: declencheurKT
                            {
                            pushFollow(FOLLOW_declencheurKT_in_declencheur2496);
                            declencheurKT261=declencheurKT();

                            state._fsp--;

                            adaptor.addChild(root_0, declencheurKT261.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:7: ( IDENT | GAME ) ( ENDS_KW | STARTS_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set262=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set262));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:22: ( ENDS_KW | STARTS_KW )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==ENDS_KW) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==STARTS_KW) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:23: ENDS_KW
                            {
                            ENDS_KW263=(Token)match(input,ENDS_KW,FOLLOW_ENDS_KW_in_declencheur2514); 
                            ENDS_KW263_tree = (CommonTree)adaptor.create(ENDS_KW263);
                            root_0 = (CommonTree)adaptor.becomeRoot(ENDS_KW263_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:265:33: STARTS_KW
                            {
                            STARTS_KW264=(Token)match(input,STARTS_KW,FOLLOW_STARTS_KW_in_declencheur2518); 
                            STARTS_KW264_tree = (CommonTree)adaptor.create(STARTS_KW264);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTS_KW264_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:266:7: variable BECOMES varOuNB
                    {
                    pushFollow(FOLLOW_variable_in_declencheur2538);
                    variable265=variable();

                    state._fsp--;

                    stream_variable.add(variable265.getTree());
                    BECOMES266=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declencheur2540);  
                    stream_BECOMES.add(BECOMES266);

                    pushFollow(FOLLOW_varOuNB_in_declencheur2542);
                    varOuNB267=varOuNB();

                    state._fsp--;

                    stream_varOuNB.add(varOuNB267.getTree());


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
                    // 267:7: -> ^( BECOMES_VAR_KW variable varOuNB )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:267:10: ^( BECOMES_VAR_KW variable varOuNB )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:268:7: VICTORY_KW OF ( PLAYER | IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW268=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_declencheur2566); 
                    VICTORY_KW268_tree = (CommonTree)adaptor.create(VICTORY_KW268);
                    root_0 = (CommonTree)adaptor.becomeRoot(VICTORY_KW268_tree, root_0);

                    OF269=(Token)match(input,OF,FOLLOW_OF_in_declencheur2569); 
                    set270=(Token)input.LT(1);
                    if ( input.LA(1)==IDENT||input.LA(1)==PLAYER ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set270));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:269:7: DEFEAT_KW OF ( PLAYER | IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW271=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_declencheur2586); 
                    DEFEAT_KW271_tree = (CommonTree)adaptor.create(DEFEAT_KW271);
                    root_0 = (CommonTree)adaptor.becomeRoot(DEFEAT_KW271_tree, root_0);

                    OF272=(Token)match(input,OF,FOLLOW_OF_in_declencheur2589); 
                    set273=(Token)input.LT(1);
                    if ( input.LA(1)==IDENT||input.LA(1)==PLAYER ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set273));
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:272:1: varOuNB : ( variable | FLOAT );
    public final hightParser.varOuNB_return varOuNB() throws RecognitionException {
        hightParser.varOuNB_return retval = new hightParser.varOuNB_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FLOAT275=null;
        hightParser.variable_return variable274 = null;


        CommonTree FLOAT275_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:272:9: ( variable | FLOAT )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==IDENT||(LA60_0>=X && LA60_0<=VALUE)) ) {
                alt60=1;
            }
            else if ( (LA60_0==FLOAT) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:273:5: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_varOuNB2614);
                    variable274=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable274.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:273:16: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT275=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_varOuNB2618); 
                    FLOAT275_tree = (CommonTree)adaptor.create(FLOAT275);
                    adaptor.addChild(root_0, FLOAT275_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:1: declencheurTK : ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW ) ( ( OTHER )? accesLocal ) ;
    public final hightParser.declencheurTK_return declencheurTK() throws RecognitionException {
        hightParser.declencheurTK_return retval = new hightParser.declencheurTK_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TOUCHES_KW276=null;
        Token KILLS_KW277=null;
        Token OWNES_KW278=null;
        Token NOTOWNES_KW279=null;
        Token OTHER280=null;
        hightParser.accesLocal_return accesLocal281 = null;


        CommonTree TOUCHES_KW276_tree=null;
        CommonTree KILLS_KW277_tree=null;
        CommonTree OWNES_KW278_tree=null;
        CommonTree NOTOWNES_KW279_tree=null;
        CommonTree OTHER280_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:275:15: ( ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW ) ( ( OTHER )? accesLocal ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:5: ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW ) ( ( OTHER )? accesLocal )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:5: ( TOUCHES_KW | KILLS_KW | OWNES_KW | NOTOWNES_KW )
            int alt61=4;
            switch ( input.LA(1) ) {
            case TOUCHES_KW:
                {
                alt61=1;
                }
                break;
            case KILLS_KW:
                {
                alt61=2;
                }
                break;
            case OWNES_KW:
                {
                alt61=3;
                }
                break;
            case NOTOWNES_KW:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:6: TOUCHES_KW
                    {
                    TOUCHES_KW276=(Token)match(input,TOUCHES_KW,FOLLOW_TOUCHES_KW_in_declencheurTK2631); 
                    TOUCHES_KW276_tree = (CommonTree)adaptor.create(TOUCHES_KW276);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES_KW276_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:20: KILLS_KW
                    {
                    KILLS_KW277=(Token)match(input,KILLS_KW,FOLLOW_KILLS_KW_in_declencheurTK2636); 
                    KILLS_KW277_tree = (CommonTree)adaptor.create(KILLS_KW277);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLS_KW277_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:32: OWNES_KW
                    {
                    OWNES_KW278=(Token)match(input,OWNES_KW,FOLLOW_OWNES_KW_in_declencheurTK2641); 
                    OWNES_KW278_tree = (CommonTree)adaptor.create(OWNES_KW278);
                    root_0 = (CommonTree)adaptor.becomeRoot(OWNES_KW278_tree, root_0);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:44: NOTOWNES_KW
                    {
                    NOTOWNES_KW279=(Token)match(input,NOTOWNES_KW,FOLLOW_NOTOWNES_KW_in_declencheurTK2646); 
                    NOTOWNES_KW279_tree = (CommonTree)adaptor.create(NOTOWNES_KW279);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOTOWNES_KW279_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:58: ( ( OTHER )? accesLocal )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:59: ( OTHER )? accesLocal
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:59: ( OTHER )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==OTHER) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:276:60: OTHER
                    {
                    OTHER280=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurTK2652); 
                    OTHER280_tree = (CommonTree)adaptor.create(OTHER280);
                    adaptor.addChild(root_0, OTHER280_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_accesLocal_in_declencheurTK2656);
            accesLocal281=accesLocal();

            state._fsp--;

            adaptor.addChild(root_0, accesLocal281.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:1: declencheurKT : ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW ) ( BY ( ( OTHER )? accesLocal ) )? ;
    public final hightParser.declencheurKT_return declencheurKT() throws RecognitionException {
        hightParser.declencheurKT_return retval = new hightParser.declencheurKT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token KILLED_KW282=null;
        Token TOUCHED_KW283=null;
        Token OWNED_KW284=null;
        Token NOTOWNED_KW285=null;
        Token BY286=null;
        Token OTHER287=null;
        hightParser.accesLocal_return accesLocal288 = null;


        CommonTree KILLED_KW282_tree=null;
        CommonTree TOUCHED_KW283_tree=null;
        CommonTree OWNED_KW284_tree=null;
        CommonTree NOTOWNED_KW285_tree=null;
        CommonTree BY286_tree=null;
        CommonTree OTHER287_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:278:15: ( ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW ) ( BY ( ( OTHER )? accesLocal ) )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:5: ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW ) ( BY ( ( OTHER )? accesLocal ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:5: ( KILLED_KW | TOUCHED_KW | OWNED_KW | NOTOWNED_KW )
            int alt63=4;
            switch ( input.LA(1) ) {
            case KILLED_KW:
                {
                alt63=1;
                }
                break;
            case TOUCHED_KW:
                {
                alt63=2;
                }
                break;
            case OWNED_KW:
                {
                alt63=3;
                }
                break;
            case NOTOWNED_KW:
                {
                alt63=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:6: KILLED_KW
                    {
                    KILLED_KW282=(Token)match(input,KILLED_KW,FOLLOW_KILLED_KW_in_declencheurKT2671); 
                    KILLED_KW282_tree = (CommonTree)adaptor.create(KILLED_KW282);
                    root_0 = (CommonTree)adaptor.becomeRoot(KILLED_KW282_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:19: TOUCHED_KW
                    {
                    TOUCHED_KW283=(Token)match(input,TOUCHED_KW,FOLLOW_TOUCHED_KW_in_declencheurKT2676); 
                    TOUCHED_KW283_tree = (CommonTree)adaptor.create(TOUCHED_KW283);
                    root_0 = (CommonTree)adaptor.becomeRoot(TOUCHED_KW283_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:33: OWNED_KW
                    {
                    OWNED_KW284=(Token)match(input,OWNED_KW,FOLLOW_OWNED_KW_in_declencheurKT2681); 
                    OWNED_KW284_tree = (CommonTree)adaptor.create(OWNED_KW284);
                    root_0 = (CommonTree)adaptor.becomeRoot(OWNED_KW284_tree, root_0);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:45: NOTOWNED_KW
                    {
                    NOTOWNED_KW285=(Token)match(input,NOTOWNED_KW,FOLLOW_NOTOWNED_KW_in_declencheurKT2686); 
                    NOTOWNED_KW285_tree = (CommonTree)adaptor.create(NOTOWNED_KW285);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOTOWNED_KW285_tree, root_0);


                    }
                    break;

            }

            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:59: ( BY ( ( OTHER )? accesLocal ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==BY) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:60: BY ( ( OTHER )? accesLocal )
                    {
                    BY286=(Token)match(input,BY,FOLLOW_BY_in_declencheurKT2691); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:64: ( ( OTHER )? accesLocal )
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:65: ( OTHER )? accesLocal
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:65: ( OTHER )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==OTHER) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:279:66: OTHER
                            {
                            OTHER287=(Token)match(input,OTHER,FOLLOW_OTHER_in_declencheurKT2696); 
                            OTHER287_tree = (CommonTree)adaptor.create(OTHER287);
                            adaptor.addChild(root_0, OTHER287_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesLocal_in_declencheurKT2700);
                    accesLocal288=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal288.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:282:1: siAlors : IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF ;
    public final hightParser.siAlors_return siAlors() throws RecognitionException {
        hightParser.siAlors_return retval = new hightParser.siAlors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF_KW289=null;
        Token THEN291=null;
        Token ELSE293=null;
        Token ENDIF295=null;
        hightParser.conditions_return conditions290 = null;

        hightParser.consequences_return consequences292 = null;

        hightParser.consequences_return consequences294 = null;


        CommonTree IF_KW289_tree=null;
        CommonTree THEN291_tree=null;
        CommonTree ELSE293_tree=null;
        CommonTree ENDIF295_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:282:9: ( IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:5: IF_KW conditions THEN consequences ( ELSE consequences )? ENDIF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF_KW289=(Token)match(input,IF_KW,FOLLOW_IF_KW_in_siAlors2719); 
            IF_KW289_tree = (CommonTree)adaptor.create(IF_KW289);
            root_0 = (CommonTree)adaptor.becomeRoot(IF_KW289_tree, root_0);

            pushFollow(FOLLOW_conditions_in_siAlors2722);
            conditions290=conditions();

            state._fsp--;

            adaptor.addChild(root_0, conditions290.getTree());
            THEN291=(Token)match(input,THEN,FOLLOW_THEN_in_siAlors2724); 
            pushFollow(FOLLOW_consequences_in_siAlors2727);
            consequences292=consequences();

            state._fsp--;

            adaptor.addChild(root_0, consequences292.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:42: ( ELSE consequences )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ELSE) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:283:43: ELSE consequences
                    {
                    ELSE293=(Token)match(input,ELSE,FOLLOW_ELSE_in_siAlors2730); 
                    pushFollow(FOLLOW_consequences_in_siAlors2733);
                    consequences294=consequences();

                    state._fsp--;

                    adaptor.addChild(root_0, consequences294.getTree());

                    }
                    break;

            }

            ENDIF295=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_siAlors2737); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:1: conditions : ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) ;
    public final hightParser.conditions_return conditions() throws RecognitionException {
        hightParser.conditions_return retval = new hightParser.conditions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT296=null;
        hightParser.conditionOu_return conditionOu297 = null;


        CommonTree NOT296_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_conditionOu=new RewriteRuleSubtreeStream(adaptor,"rule conditionOu");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:286:12: ( ( NOT )? conditionOu -> ^( CONDITION_KW ( NOT )? conditionOu ) )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:287:5: ( NOT )? conditionOu
            {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:287:5: ( NOT )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==NOT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:287:6: NOT
                    {
                    NOT296=(Token)match(input,NOT,FOLLOW_NOT_in_conditions2756);  
                    stream_NOT.add(NOT296);


                    }
                    break;

            }

            pushFollow(FOLLOW_conditionOu_in_conditions2760);
            conditionOu297=conditionOu();

            state._fsp--;

            stream_conditionOu.add(conditionOu297.getTree());


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
            // 288:7: -> ^( CONDITION_KW ( NOT )? conditionOu )
            {
                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:288:10: ^( CONDITION_KW ( NOT )? conditionOu )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION_KW, "CONDITION_KW"), root_1);

                // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:288:25: ( NOT )?
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:291:1: conditionOu : conditionEt ( OR conditionEt )* ;
    public final hightParser.conditionOu_return conditionOu() throws RecognitionException {
        hightParser.conditionOu_return retval = new hightParser.conditionOu_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR299=null;
        hightParser.conditionEt_return conditionEt298 = null;

        hightParser.conditionEt_return conditionEt300 = null;


        CommonTree OR299_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:291:13: ( conditionEt ( OR conditionEt )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:292:5: conditionEt ( OR conditionEt )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionEt_in_conditionOu2794);
            conditionEt298=conditionEt();

            state._fsp--;

            adaptor.addChild(root_0, conditionEt298.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:292:17: ( OR conditionEt )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==OR) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:292:18: OR conditionEt
            	    {
            	    OR299=(Token)match(input,OR,FOLLOW_OR_in_conditionOu2797); 
            	    OR299_tree = (CommonTree)adaptor.create(OR299);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR299_tree, root_0);

            	    pushFollow(FOLLOW_conditionEt_in_conditionOu2800);
            	    conditionEt300=conditionEt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditionEt300.getTree());

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
    // $ANTLR end "conditionOu"

    public static class conditionEt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionEt"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:295:1: conditionEt : cond ( AND cond )* ;
    public final hightParser.conditionEt_return conditionEt() throws RecognitionException {
        hightParser.conditionEt_return retval = new hightParser.conditionEt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND302=null;
        hightParser.cond_return cond301 = null;

        hightParser.cond_return cond303 = null;


        CommonTree AND302_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:295:13: ( cond ( AND cond )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:296:5: cond ( AND cond )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cond_in_conditionEt2819);
            cond301=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond301.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:296:10: ( AND cond )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==AND) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:296:11: AND cond
            	    {
            	    AND302=(Token)match(input,AND,FOLLOW_AND_in_conditionEt2822); 
            	    AND302_tree = (CommonTree)adaptor.create(AND302);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND302_tree, root_0);

            	    pushFollow(FOLLOW_cond_in_conditionEt2825);
            	    cond303=cond();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cond303.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:299:1: cond : ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD | IDENT CONTAINS_KW IDENT );
    public final hightParser.cond_return cond() throws RecognitionException {
        hightParser.cond_return retval = new hightParser.cond_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMP305=null;
        Token EQUALS307=null;
        Token INF308=null;
        Token SUP309=null;
        Token INFEG310=null;
        Token SUPED311=null;
        Token DIFF312=null;
        Token PG314=null;
        Token PD316=null;
        Token IDENT317=null;
        Token CONTAINS_KW318=null;
        Token IDENT319=null;
        hightParser.etat_return etat304 = null;

        hightParser.operation_return operation306 = null;

        hightParser.operation_return operation313 = null;

        hightParser.conditions_return conditions315 = null;


        CommonTree COMP305_tree=null;
        CommonTree EQUALS307_tree=null;
        CommonTree INF308_tree=null;
        CommonTree SUP309_tree=null;
        CommonTree INFEG310_tree=null;
        CommonTree SUPED311_tree=null;
        CommonTree DIFF312_tree=null;
        CommonTree PG314_tree=null;
        CommonTree PD316_tree=null;
        CommonTree IDENT317_tree=null;
        CommonTree CONTAINS_KW318_tree=null;
        CommonTree IDENT319_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:299:6: ( etat | COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation | PG conditions PD | IDENT CONTAINS_KW IDENT )
            int alt71=4;
            switch ( input.LA(1) ) {
            case GAME:
            case NUM:
            case PLAYER:
            case VICTORY_KW:
            case DEFEAT_KW:
            case ALL:
                {
                alt71=1;
                }
                break;
            case IDENT:
                {
                int LA71_2 = input.LA(2);

                if ( (LA71_2==IS) ) {
                    alt71=1;
                }
                else if ( (LA71_2==CONTAINS_KW) ) {
                    alt71=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 2, input);

                    throw nvae;
                }
                }
                break;
            case COMP:
                {
                alt71=2;
                }
                break;
            case PG:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:300:5: etat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_etat_in_cond2844);
                    etat304=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, etat304.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:7: COMP operation ( EQUALS | INF | SUP | INFEG | SUPED | DIFF ) operation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMP305=(Token)match(input,COMP,FOLLOW_COMP_in_cond2852); 
                    pushFollow(FOLLOW_operation_in_cond2855);
                    operation306=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation306.getTree());
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:23: ( EQUALS | INF | SUP | INFEG | SUPED | DIFF )
                    int alt70=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt70=1;
                        }
                        break;
                    case INF:
                        {
                        alt70=2;
                        }
                        break;
                    case SUP:
                        {
                        alt70=3;
                        }
                        break;
                    case INFEG:
                        {
                        alt70=4;
                        }
                        break;
                    case SUPED:
                        {
                        alt70=5;
                        }
                        break;
                    case DIFF:
                        {
                        alt70=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }

                    switch (alt70) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:24: EQUALS
                            {
                            EQUALS307=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond2858); 
                            EQUALS307_tree = (CommonTree)adaptor.create(EQUALS307);
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUALS307_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:34: INF
                            {
                            INF308=(Token)match(input,INF,FOLLOW_INF_in_cond2863); 
                            INF308_tree = (CommonTree)adaptor.create(INF308);
                            root_0 = (CommonTree)adaptor.becomeRoot(INF308_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:41: SUP
                            {
                            SUP309=(Token)match(input,SUP,FOLLOW_SUP_in_cond2868); 
                            SUP309_tree = (CommonTree)adaptor.create(SUP309);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUP309_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:48: INFEG
                            {
                            INFEG310=(Token)match(input,INFEG,FOLLOW_INFEG_in_cond2873); 
                            INFEG310_tree = (CommonTree)adaptor.create(INFEG310);
                            root_0 = (CommonTree)adaptor.becomeRoot(INFEG310_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:57: SUPED
                            {
                            SUPED311=(Token)match(input,SUPED,FOLLOW_SUPED_in_cond2878); 
                            SUPED311_tree = (CommonTree)adaptor.create(SUPED311);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUPED311_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:301:66: DIFF
                            {
                            DIFF312=(Token)match(input,DIFF,FOLLOW_DIFF_in_cond2883); 
                            DIFF312_tree = (CommonTree)adaptor.create(DIFF312);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIFF312_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_cond2887);
                    operation313=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation313.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:302:7: PG conditions PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG314=(Token)match(input,PG,FOLLOW_PG_in_cond2906); 
                    PG314_tree = (CommonTree)adaptor.create(PG314);
                    adaptor.addChild(root_0, PG314_tree);

                    pushFollow(FOLLOW_conditions_in_cond2908);
                    conditions315=conditions();

                    state._fsp--;

                    adaptor.addChild(root_0, conditions315.getTree());
                    PD316=(Token)match(input,PD,FOLLOW_PD_in_cond2910); 
                    PD316_tree = (CommonTree)adaptor.create(PD316);
                    adaptor.addChild(root_0, PD316_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:303:7: IDENT CONTAINS_KW IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT317=(Token)match(input,IDENT,FOLLOW_IDENT_in_cond2918); 
                    IDENT317_tree = (CommonTree)adaptor.create(IDENT317);
                    adaptor.addChild(root_0, IDENT317_tree);

                    CONTAINS_KW318=(Token)match(input,CONTAINS_KW,FOLLOW_CONTAINS_KW_in_cond2920); 
                    CONTAINS_KW318_tree = (CommonTree)adaptor.create(CONTAINS_KW318);
                    root_0 = (CommonTree)adaptor.becomeRoot(CONTAINS_KW318_tree, root_0);

                    IDENT319=(Token)match(input,IDENT,FOLLOW_IDENT_in_cond2923); 
                    IDENT319_tree = (CommonTree)adaptor.create(IDENT319);
                    adaptor.addChild(root_0, IDENT319_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:306:1: etat : ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW OF IDENT | DEFEAT_KW OF IDENT );
    public final hightParser.etat_return etat() throws RecognitionException {
        hightParser.etat_return retval = new hightParser.etat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS321=null;
        Token NOT322=null;
        Token DEAD_KW323=null;
        Token ALIVE_KW324=null;
        Token EFFACED_KW325=null;
        Token GENERATED_KW326=null;
        Token TOUCHING_KW327=null;
        Token OTHER328=null;
        Token MOVING_KW330=null;
        Token WAITING_KW331=null;
        Token set332=null;
        Token IS333=null;
        Token NOT334=null;
        Token FINISHED_KW335=null;
        Token STARTED_KW336=null;
        Token PAUSED_KW337=null;
        Token MUTED_KW338=null;
        Token set339=null;
        Token PLAYED_KW340=null;
        Token STOPPED_KW341=null;
        Token VICTORY_KW342=null;
        Token OF343=null;
        Token IDENT344=null;
        Token DEFEAT_KW345=null;
        Token OF346=null;
        Token IDENT347=null;
        hightParser.accesClasse_return accesClasse320 = null;

        hightParser.accesLocal_return accesLocal329 = null;


        CommonTree IS321_tree=null;
        CommonTree NOT322_tree=null;
        CommonTree DEAD_KW323_tree=null;
        CommonTree ALIVE_KW324_tree=null;
        CommonTree EFFACED_KW325_tree=null;
        CommonTree GENERATED_KW326_tree=null;
        CommonTree TOUCHING_KW327_tree=null;
        CommonTree OTHER328_tree=null;
        CommonTree MOVING_KW330_tree=null;
        CommonTree WAITING_KW331_tree=null;
        CommonTree set332_tree=null;
        CommonTree IS333_tree=null;
        CommonTree NOT334_tree=null;
        CommonTree FINISHED_KW335_tree=null;
        CommonTree STARTED_KW336_tree=null;
        CommonTree PAUSED_KW337_tree=null;
        CommonTree MUTED_KW338_tree=null;
        CommonTree set339_tree=null;
        CommonTree PLAYED_KW340_tree=null;
        CommonTree STOPPED_KW341_tree=null;
        CommonTree VICTORY_KW342_tree=null;
        CommonTree OF343_tree=null;
        CommonTree IDENT344_tree=null;
        CommonTree DEFEAT_KW345_tree=null;
        CommonTree OF346_tree=null;
        CommonTree IDENT347_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:306:6: ( accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW ) | ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW ) | VICTORY_KW OF IDENT | DEFEAT_KW OF IDENT )
            int alt77=4;
            switch ( input.LA(1) ) {
            case NUM:
            case PLAYER:
            case ALL:
                {
                alt77=1;
                }
                break;
            case IDENT:
                {
                int LA77_2 = input.LA(2);

                if ( (LA77_2==IS) ) {
                    switch ( input.LA(3) ) {
                    case NOT:
                        {
                        int LA77_7 = input.LA(4);

                        if ( ((LA77_7>=FINISHED_KW && LA77_7<=STOPPED_KW)) ) {
                            alt77=2;
                        }
                        else if ( ((LA77_7>=DEAD_KW && LA77_7<=WAITING_KW)) ) {
                            alt77=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 77, 7, input);

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
                        alt77=2;
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
                        alt77=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 6, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 2, input);

                    throw nvae;
                }
                }
                break;
            case GAME:
                {
                alt77=2;
                }
                break;
            case VICTORY_KW:
                {
                alt77=3;
                }
                break;
            case DEFEAT_KW:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:5: accesClasse IS ( NOT )? ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesClasse_in_etat2941);
                    accesClasse320=accesClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, accesClasse320.getTree());
                    IS321=(Token)match(input,IS,FOLLOW_IS_in_etat2943); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:21: ( NOT )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NOT) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:22: NOT
                            {
                            NOT322=(Token)match(input,NOT,FOLLOW_NOT_in_etat2947); 
                            NOT322_tree = (CommonTree)adaptor.create(NOT322);
                            adaptor.addChild(root_0, NOT322_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:28: ( DEAD_KW | ALIVE_KW | EFFACED_KW | GENERATED_KW | TOUCHING_KW ( ( OTHER )? accesLocal ) | MOVING_KW | WAITING_KW )
                    int alt74=7;
                    switch ( input.LA(1) ) {
                    case DEAD_KW:
                        {
                        alt74=1;
                        }
                        break;
                    case ALIVE_KW:
                        {
                        alt74=2;
                        }
                        break;
                    case EFFACED_KW:
                        {
                        alt74=3;
                        }
                        break;
                    case GENERATED_KW:
                        {
                        alt74=4;
                        }
                        break;
                    case TOUCHING_KW:
                        {
                        alt74=5;
                        }
                        break;
                    case MOVING_KW:
                        {
                        alt74=6;
                        }
                        break;
                    case WAITING_KW:
                        {
                        alt74=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }

                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:29: DEAD_KW
                            {
                            DEAD_KW323=(Token)match(input,DEAD_KW,FOLLOW_DEAD_KW_in_etat2952); 
                            DEAD_KW323_tree = (CommonTree)adaptor.create(DEAD_KW323);
                            root_0 = (CommonTree)adaptor.becomeRoot(DEAD_KW323_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:40: ALIVE_KW
                            {
                            ALIVE_KW324=(Token)match(input,ALIVE_KW,FOLLOW_ALIVE_KW_in_etat2957); 
                            ALIVE_KW324_tree = (CommonTree)adaptor.create(ALIVE_KW324);
                            root_0 = (CommonTree)adaptor.becomeRoot(ALIVE_KW324_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:52: EFFACED_KW
                            {
                            EFFACED_KW325=(Token)match(input,EFFACED_KW,FOLLOW_EFFACED_KW_in_etat2962); 
                            EFFACED_KW325_tree = (CommonTree)adaptor.create(EFFACED_KW325);
                            root_0 = (CommonTree)adaptor.becomeRoot(EFFACED_KW325_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:66: GENERATED_KW
                            {
                            GENERATED_KW326=(Token)match(input,GENERATED_KW,FOLLOW_GENERATED_KW_in_etat2967); 
                            GENERATED_KW326_tree = (CommonTree)adaptor.create(GENERATED_KW326);
                            root_0 = (CommonTree)adaptor.becomeRoot(GENERATED_KW326_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:82: TOUCHING_KW ( ( OTHER )? accesLocal )
                            {
                            TOUCHING_KW327=(Token)match(input,TOUCHING_KW,FOLLOW_TOUCHING_KW_in_etat2972); 
                            TOUCHING_KW327_tree = (CommonTree)adaptor.create(TOUCHING_KW327);
                            root_0 = (CommonTree)adaptor.becomeRoot(TOUCHING_KW327_tree, root_0);

                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:95: ( ( OTHER )? accesLocal )
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:96: ( OTHER )? accesLocal
                            {
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:96: ( OTHER )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==OTHER) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:97: OTHER
                                    {
                                    OTHER328=(Token)match(input,OTHER,FOLLOW_OTHER_in_etat2977); 
                                    OTHER328_tree = (CommonTree)adaptor.create(OTHER328);
                                    adaptor.addChild(root_0, OTHER328_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_accesLocal_in_etat2981);
                            accesLocal329=accesLocal();

                            state._fsp--;

                            adaptor.addChild(root_0, accesLocal329.getTree());

                            }


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:119: MOVING_KW
                            {
                            MOVING_KW330=(Token)match(input,MOVING_KW,FOLLOW_MOVING_KW_in_etat2986); 
                            MOVING_KW330_tree = (CommonTree)adaptor.create(MOVING_KW330);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOVING_KW330_tree, root_0);


                            }
                            break;
                        case 7 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:307:132: WAITING_KW
                            {
                            WAITING_KW331=(Token)match(input,WAITING_KW,FOLLOW_WAITING_KW_in_etat2991); 
                            WAITING_KW331_tree = (CommonTree)adaptor.create(WAITING_KW331);
                            root_0 = (CommonTree)adaptor.becomeRoot(WAITING_KW331_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:7: ( IDENT | GAME ) IS ( NOT )? ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set332=(Token)input.LT(1);
                    if ( input.LA(1)==GAME||input.LA(1)==IDENT ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set332));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    IS333=(Token)match(input,IS,FOLLOW_IS_in_etat3011); 
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:26: ( NOT )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==NOT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:27: NOT
                            {
                            NOT334=(Token)match(input,NOT,FOLLOW_NOT_in_etat3015); 
                            NOT334_tree = (CommonTree)adaptor.create(NOT334);
                            adaptor.addChild(root_0, NOT334_tree);


                            }
                            break;

                    }

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:33: ( FINISHED_KW | STARTED_KW | PAUSED_KW | MUTED_KW ( ON | OFF ) | PLAYED_KW | STOPPED_KW )
                    int alt76=6;
                    switch ( input.LA(1) ) {
                    case FINISHED_KW:
                        {
                        alt76=1;
                        }
                        break;
                    case STARTED_KW:
                        {
                        alt76=2;
                        }
                        break;
                    case PAUSED_KW:
                        {
                        alt76=3;
                        }
                        break;
                    case MUTED_KW:
                        {
                        alt76=4;
                        }
                        break;
                    case PLAYED_KW:
                        {
                        alt76=5;
                        }
                        break;
                    case STOPPED_KW:
                        {
                        alt76=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }

                    switch (alt76) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:34: FINISHED_KW
                            {
                            FINISHED_KW335=(Token)match(input,FINISHED_KW,FOLLOW_FINISHED_KW_in_etat3020); 
                            FINISHED_KW335_tree = (CommonTree)adaptor.create(FINISHED_KW335);
                            root_0 = (CommonTree)adaptor.becomeRoot(FINISHED_KW335_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:48: STARTED_KW
                            {
                            STARTED_KW336=(Token)match(input,STARTED_KW,FOLLOW_STARTED_KW_in_etat3024); 
                            STARTED_KW336_tree = (CommonTree)adaptor.create(STARTED_KW336);
                            root_0 = (CommonTree)adaptor.becomeRoot(STARTED_KW336_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:62: PAUSED_KW
                            {
                            PAUSED_KW337=(Token)match(input,PAUSED_KW,FOLLOW_PAUSED_KW_in_etat3029); 
                            PAUSED_KW337_tree = (CommonTree)adaptor.create(PAUSED_KW337);
                            root_0 = (CommonTree)adaptor.becomeRoot(PAUSED_KW337_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:75: MUTED_KW ( ON | OFF )
                            {
                            MUTED_KW338=(Token)match(input,MUTED_KW,FOLLOW_MUTED_KW_in_etat3034); 
                            MUTED_KW338_tree = (CommonTree)adaptor.create(MUTED_KW338);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUTED_KW338_tree, root_0);

                            set339=(Token)input.LT(1);
                            if ( (input.LA(1)>=ON && input.LA(1)<=OFF) ) {
                                input.consume();
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(set339));
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 5 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:98: PLAYED_KW
                            {
                            PLAYED_KW340=(Token)match(input,PLAYED_KW,FOLLOW_PLAYED_KW_in_etat3047); 
                            PLAYED_KW340_tree = (CommonTree)adaptor.create(PLAYED_KW340);
                            root_0 = (CommonTree)adaptor.becomeRoot(PLAYED_KW340_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:308:111: STOPPED_KW
                            {
                            STOPPED_KW341=(Token)match(input,STOPPED_KW,FOLLOW_STOPPED_KW_in_etat3052); 
                            STOPPED_KW341_tree = (CommonTree)adaptor.create(STOPPED_KW341);
                            root_0 = (CommonTree)adaptor.becomeRoot(STOPPED_KW341_tree, root_0);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:310:7: VICTORY_KW OF IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VICTORY_KW342=(Token)match(input,VICTORY_KW,FOLLOW_VICTORY_KW_in_etat3070); 
                    VICTORY_KW342_tree = (CommonTree)adaptor.create(VICTORY_KW342);
                    root_0 = (CommonTree)adaptor.becomeRoot(VICTORY_KW342_tree, root_0);

                    OF343=(Token)match(input,OF,FOLLOW_OF_in_etat3073); 
                    IDENT344=(Token)match(input,IDENT,FOLLOW_IDENT_in_etat3076); 
                    IDENT344_tree = (CommonTree)adaptor.create(IDENT344);
                    adaptor.addChild(root_0, IDENT344_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:311:7: DEFEAT_KW OF IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFEAT_KW345=(Token)match(input,DEFEAT_KW,FOLLOW_DEFEAT_KW_in_etat3084); 
                    DEFEAT_KW345_tree = (CommonTree)adaptor.create(DEFEAT_KW345);
                    root_0 = (CommonTree)adaptor.becomeRoot(DEFEAT_KW345_tree, root_0);

                    OF346=(Token)match(input,OF,FOLLOW_OF_in_etat3087); 
                    IDENT347=(Token)match(input,IDENT,FOLLOW_IDENT_in_etat3090); 
                    IDENT347_tree = (CommonTree)adaptor.create(IDENT347);
                    adaptor.addChild(root_0, IDENT347_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:314:1: affectation : ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable );
    public final hightParser.affectation_return affectation() throws RecognitionException {
        hightParser.affectation_return retval = new hightParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN_KW348=null;
        Token ADD_KW349=null;
        Token SUB_KW350=null;
        Token FOR352=null;
        Token INVERT_KW354=null;
        Token WITH356=null;
        hightParser.operation_return operation351 = null;

        hightParser.variable_return variable353 = null;

        hightParser.variable_return variable355 = null;

        hightParser.variable_return variable357 = null;


        CommonTree ASSIGN_KW348_tree=null;
        CommonTree ADD_KW349_tree=null;
        CommonTree SUB_KW350_tree=null;
        CommonTree FOR352_tree=null;
        CommonTree INVERT_KW354_tree=null;
        CommonTree WITH356_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:314:13: ( ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable | INVERT_KW variable WITH variable )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=ASSIGN_KW && LA79_0<=SUB_KW)) ) {
                alt79=1;
            }
            else if ( (LA79_0==INVERT_KW) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation ) FOR variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:3: ( ( ASSIGN_KW | ADD_KW | SUB_KW ) operation )
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:4: ( ASSIGN_KW | ADD_KW | SUB_KW ) operation
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:4: ( ASSIGN_KW | ADD_KW | SUB_KW )
                    int alt78=3;
                    switch ( input.LA(1) ) {
                    case ASSIGN_KW:
                        {
                        alt78=1;
                        }
                        break;
                    case ADD_KW:
                        {
                        alt78=2;
                        }
                        break;
                    case SUB_KW:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:5: ASSIGN_KW
                            {
                            ASSIGN_KW348=(Token)match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_affectation3109); 
                            ASSIGN_KW348_tree = (CommonTree)adaptor.create(ASSIGN_KW348);
                            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_KW348_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:18: ADD_KW
                            {
                            ADD_KW349=(Token)match(input,ADD_KW,FOLLOW_ADD_KW_in_affectation3114); 
                            ADD_KW349_tree = (CommonTree)adaptor.create(ADD_KW349);
                            root_0 = (CommonTree)adaptor.becomeRoot(ADD_KW349_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:315:28: SUB_KW
                            {
                            SUB_KW350=(Token)match(input,SUB_KW,FOLLOW_SUB_KW_in_affectation3119); 
                            SUB_KW350_tree = (CommonTree)adaptor.create(SUB_KW350);
                            root_0 = (CommonTree)adaptor.becomeRoot(SUB_KW350_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operation_in_affectation3123);
                    operation351=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation351.getTree());

                    }

                    FOR352=(Token)match(input,FOR,FOLLOW_FOR_in_affectation3126); 
                    pushFollow(FOLLOW_variable_in_affectation3129);
                    variable353=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable353.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:316:5: INVERT_KW variable WITH variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INVERT_KW354=(Token)match(input,INVERT_KW,FOLLOW_INVERT_KW_in_affectation3136); 
                    INVERT_KW354_tree = (CommonTree)adaptor.create(INVERT_KW354);
                    root_0 = (CommonTree)adaptor.becomeRoot(INVERT_KW354_tree, root_0);

                    pushFollow(FOLLOW_variable_in_affectation3139);
                    variable355=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable355.getTree());
                    WITH356=(Token)match(input,WITH,FOLLOW_WITH_in_affectation3141); 
                    pushFollow(FOLLOW_variable_in_affectation3144);
                    variable357=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable357.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:321:1: iaBasique : IA_KW IDENT IS reglesJeu ( VIRG reglesJeu )* ;
    public final hightParser.iaBasique_return iaBasique() throws RecognitionException {
        hightParser.iaBasique_return retval = new hightParser.iaBasique_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IA_KW358=null;
        Token IDENT359=null;
        Token IS360=null;
        Token VIRG362=null;
        hightParser.reglesJeu_return reglesJeu361 = null;

        hightParser.reglesJeu_return reglesJeu363 = null;


        CommonTree IA_KW358_tree=null;
        CommonTree IDENT359_tree=null;
        CommonTree IS360_tree=null;
        CommonTree VIRG362_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:321:11: ( IA_KW IDENT IS reglesJeu ( VIRG reglesJeu )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:322:5: IA_KW IDENT IS reglesJeu ( VIRG reglesJeu )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IA_KW358=(Token)match(input,IA_KW,FOLLOW_IA_KW_in_iaBasique3164); 
            IA_KW358_tree = (CommonTree)adaptor.create(IA_KW358);
            root_0 = (CommonTree)adaptor.becomeRoot(IA_KW358_tree, root_0);

            IDENT359=(Token)match(input,IDENT,FOLLOW_IDENT_in_iaBasique3167); 
            IDENT359_tree = (CommonTree)adaptor.create(IDENT359);
            adaptor.addChild(root_0, IDENT359_tree);

            IS360=(Token)match(input,IS,FOLLOW_IS_in_iaBasique3169); 
            pushFollow(FOLLOW_reglesJeu_in_iaBasique3172);
            reglesJeu361=reglesJeu();

            state._fsp--;

            adaptor.addChild(root_0, reglesJeu361.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:322:32: ( VIRG reglesJeu )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==VIRG) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:322:33: VIRG reglesJeu
            	    {
            	    VIRG362=(Token)match(input,VIRG,FOLLOW_VIRG_in_iaBasique3175); 
            	    pushFollow(FOLLOW_reglesJeu_in_iaBasique3178);
            	    reglesJeu363=reglesJeu();

            	    state._fsp--;

            	    adaptor.addChild(root_0, reglesJeu363.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:326:1: operation : ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus );
    public final hightParser.operation_return operation() throws RecognitionException {
        hightParser.operation_return retval = new hightParser.operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RANDOM_KW365=null;
        Token BETWEEN366=null;
        Token AND368=null;
        hightParser.operationPlus_return operationPlus364 = null;

        hightParser.operationPlus_return operationPlus367 = null;

        hightParser.operationPlus_return operationPlus369 = null;


        CommonTree RANDOM_KW365_tree=null;
        CommonTree BETWEEN366_tree=null;
        CommonTree AND368_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:326:11: ( operationPlus | RANDOM_KW BETWEEN operationPlus AND operationPlus )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==FLOAT||LA81_0==IDENT||LA81_0==PG||(LA81_0>=DISTANCE_KW && LA81_0<=VALUE)) ) {
                alt81=1;
            }
            else if ( (LA81_0==RANDOM_KW) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:327:5: operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operationPlus_in_operation3196);
                    operationPlus364=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus364.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:328:7: RANDOM_KW BETWEEN operationPlus AND operationPlus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RANDOM_KW365=(Token)match(input,RANDOM_KW,FOLLOW_RANDOM_KW_in_operation3204); 
                    RANDOM_KW365_tree = (CommonTree)adaptor.create(RANDOM_KW365);
                    root_0 = (CommonTree)adaptor.becomeRoot(RANDOM_KW365_tree, root_0);

                    BETWEEN366=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operation3207); 
                    pushFollow(FOLLOW_operationPlus_in_operation3210);
                    operationPlus367=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus367.getTree());
                    AND368=(Token)match(input,AND,FOLLOW_AND_in_operation3212); 
                    pushFollow(FOLLOW_operationPlus_in_operation3215);
                    operationPlus369=operationPlus();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPlus369.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:331:1: operationPlus : operationMul ( ( PLUS | MINUS ) operationMul )* ;
    public final hightParser.operationPlus_return operationPlus() throws RecognitionException {
        hightParser.operationPlus_return retval = new hightParser.operationPlus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS371=null;
        Token MINUS372=null;
        hightParser.operationMul_return operationMul370 = null;

        hightParser.operationMul_return operationMul373 = null;


        CommonTree PLUS371_tree=null;
        CommonTree MINUS372_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:331:15: ( operationMul ( ( PLUS | MINUS ) operationMul )* )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:5: operationMul ( ( PLUS | MINUS ) operationMul )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationMul_in_operationPlus3233);
            operationMul370=operationMul();

            state._fsp--;

            adaptor.addChild(root_0, operationMul370.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:18: ( ( PLUS | MINUS ) operationMul )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( ((LA83_0>=PLUS && LA83_0<=MINUS)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:19: ( PLUS | MINUS ) operationMul
            	    {
            	    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:19: ( PLUS | MINUS )
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==PLUS) ) {
            	        alt82=1;
            	    }
            	    else if ( (LA82_0==MINUS) ) {
            	        alt82=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 82, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:20: PLUS
            	            {
            	            PLUS371=(Token)match(input,PLUS,FOLLOW_PLUS_in_operationPlus3237); 
            	            PLUS371_tree = (CommonTree)adaptor.create(PLUS371);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS371_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:332:28: MINUS
            	            {
            	            MINUS372=(Token)match(input,MINUS,FOLLOW_MINUS_in_operationPlus3242); 
            	            MINUS372_tree = (CommonTree)adaptor.create(MINUS372);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS372_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_operationMul_in_operationPlus3246);
            	    operationMul373=operationMul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operationMul373.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:335:1: operationMul : operationPow ( ( MUL | DIV | MOD ) operationPow )? ;
    public final hightParser.operationMul_return operationMul() throws RecognitionException {
        hightParser.operationMul_return retval = new hightParser.operationMul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL375=null;
        Token DIV376=null;
        Token MOD377=null;
        hightParser.operationPow_return operationPow374 = null;

        hightParser.operationPow_return operationPow378 = null;


        CommonTree MUL375_tree=null;
        CommonTree DIV376_tree=null;
        CommonTree MOD377_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:335:14: ( operationPow ( ( MUL | DIV | MOD ) operationPow )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:5: operationPow ( ( MUL | DIV | MOD ) operationPow )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationPow_in_operationMul3265);
            operationPow374=operationPow();

            state._fsp--;

            adaptor.addChild(root_0, operationPow374.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:18: ( ( MUL | DIV | MOD ) operationPow )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=MUL && LA85_0<=MOD)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:19: ( MUL | DIV | MOD ) operationPow
                    {
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:19: ( MUL | DIV | MOD )
                    int alt84=3;
                    switch ( input.LA(1) ) {
                    case MUL:
                        {
                        alt84=1;
                        }
                        break;
                    case DIV:
                        {
                        alt84=2;
                        }
                        break;
                    case MOD:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:20: MUL
                            {
                            MUL375=(Token)match(input,MUL,FOLLOW_MUL_in_operationMul3269); 
                            MUL375_tree = (CommonTree)adaptor.create(MUL375);
                            root_0 = (CommonTree)adaptor.becomeRoot(MUL375_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:27: DIV
                            {
                            DIV376=(Token)match(input,DIV,FOLLOW_DIV_in_operationMul3274); 
                            DIV376_tree = (CommonTree)adaptor.create(DIV376);
                            root_0 = (CommonTree)adaptor.becomeRoot(DIV376_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:336:34: MOD
                            {
                            MOD377=(Token)match(input,MOD,FOLLOW_MOD_in_operationMul3279); 
                            MOD377_tree = (CommonTree)adaptor.create(MOD377);
                            root_0 = (CommonTree)adaptor.becomeRoot(MOD377_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_operationPow_in_operationMul3283);
                    operationPow378=operationPow();

                    state._fsp--;

                    adaptor.addChild(root_0, operationPow378.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:339:1: operationPow : operationBracket ( POW operationBracket )? ;
    public final hightParser.operationPow_return operationPow() throws RecognitionException {
        hightParser.operationPow_return retval = new hightParser.operationPow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POW380=null;
        hightParser.operationBracket_return operationBracket379 = null;

        hightParser.operationBracket_return operationBracket381 = null;


        CommonTree POW380_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:339:14: ( operationBracket ( POW operationBracket )? )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:340:5: operationBracket ( POW operationBracket )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operationBracket_in_operationPow3304);
            operationBracket379=operationBracket();

            state._fsp--;

            adaptor.addChild(root_0, operationBracket379.getTree());
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:340:22: ( POW operationBracket )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==POW) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:340:23: POW operationBracket
                    {
                    POW380=(Token)match(input,POW,FOLLOW_POW_in_operationPow3307); 
                    POW380_tree = (CommonTree)adaptor.create(POW380);
                    root_0 = (CommonTree)adaptor.becomeRoot(POW380_tree, root_0);

                    pushFollow(FOLLOW_operationBracket_in_operationPow3310);
                    operationBracket381=operationBracket();

                    state._fsp--;

                    adaptor.addChild(root_0, operationBracket381.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:343:1: operationBracket : ( PG operation PD | variable | FLOAT | ( DISTANCE_KW | ANGLE_KW ) BETWEEN IDENT AND IDENT );
    public final hightParser.operationBracket_return operationBracket() throws RecognitionException {
        hightParser.operationBracket_return retval = new hightParser.operationBracket_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PG382=null;
        Token PD384=null;
        Token FLOAT386=null;
        Token DISTANCE_KW387=null;
        Token ANGLE_KW388=null;
        Token BETWEEN389=null;
        Token IDENT390=null;
        Token AND391=null;
        Token IDENT392=null;
        hightParser.operation_return operation383 = null;

        hightParser.variable_return variable385 = null;


        CommonTree PG382_tree=null;
        CommonTree PD384_tree=null;
        CommonTree FLOAT386_tree=null;
        CommonTree DISTANCE_KW387_tree=null;
        CommonTree ANGLE_KW388_tree=null;
        CommonTree BETWEEN389_tree=null;
        CommonTree IDENT390_tree=null;
        CommonTree AND391_tree=null;
        CommonTree IDENT392_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:343:18: ( PG operation PD | variable | FLOAT | ( DISTANCE_KW | ANGLE_KW ) BETWEEN IDENT AND IDENT )
            int alt88=4;
            switch ( input.LA(1) ) {
            case PG:
                {
                alt88=1;
                }
                break;
            case IDENT:
            case X:
            case Y:
            case Z:
            case SCORE:
            case VALUE:
                {
                alt88=2;
                }
                break;
            case FLOAT:
                {
                alt88=3;
                }
                break;
            case DISTANCE_KW:
            case ANGLE_KW:
                {
                alt88=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:344:5: PG operation PD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PG382=(Token)match(input,PG,FOLLOW_PG_in_operationBracket3331); 
                    pushFollow(FOLLOW_operation_in_operationBracket3334);
                    operation383=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation383.getTree());
                    PD384=(Token)match(input,PD,FOLLOW_PD_in_operationBracket3336); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:345:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operationBracket3345);
                    variable385=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable385.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:346:7: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT386=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operationBracket3353); 
                    FLOAT386_tree = (CommonTree)adaptor.create(FLOAT386);
                    adaptor.addChild(root_0, FLOAT386_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:347:7: ( DISTANCE_KW | ANGLE_KW ) BETWEEN IDENT AND IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:347:7: ( DISTANCE_KW | ANGLE_KW )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==DISTANCE_KW) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==ANGLE_KW) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:347:8: DISTANCE_KW
                            {
                            DISTANCE_KW387=(Token)match(input,DISTANCE_KW,FOLLOW_DISTANCE_KW_in_operationBracket3362); 
                            DISTANCE_KW387_tree = (CommonTree)adaptor.create(DISTANCE_KW387);
                            root_0 = (CommonTree)adaptor.becomeRoot(DISTANCE_KW387_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:347:22: ANGLE_KW
                            {
                            ANGLE_KW388=(Token)match(input,ANGLE_KW,FOLLOW_ANGLE_KW_in_operationBracket3366); 
                            ANGLE_KW388_tree = (CommonTree)adaptor.create(ANGLE_KW388);
                            root_0 = (CommonTree)adaptor.becomeRoot(ANGLE_KW388_tree, root_0);


                            }
                            break;

                    }

                    BETWEEN389=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_operationBracket3370); 
                    IDENT390=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationBracket3373); 
                    IDENT390_tree = (CommonTree)adaptor.create(IDENT390);
                    adaptor.addChild(root_0, IDENT390_tree);

                    AND391=(Token)match(input,AND,FOLLOW_AND_in_operationBracket3375); 
                    IDENT392=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationBracket3378); 
                    IDENT392_tree = (CommonTree)adaptor.create(IDENT392);
                    adaptor.addChild(root_0, IDENT392_tree);


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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:350:1: variable : ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) );
    public final hightParser.variable_return variable() throws RecognitionException {
        hightParser.variable_return retval = new hightParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token X393=null;
        Token Y394=null;
        Token Z395=null;
        Token OF396=null;
        Token OF398=null;
        Token IDENT400=null;
        Token OF401=null;
        Token SCORE403=null;
        Token OF404=null;
        Token GAME405=null;
        Token VALUE406=null;
        Token OF407=null;
        Token OF409=null;
        hightParser.typeCoordonnees_return typeCoordonnees397 = null;

        hightParser.accesLocal_return accesLocal399 = null;

        hightParser.accesLocal_return accesLocal402 = null;

        hightParser.attributTps_return attributTps408 = null;

        hightParser.accesLocal_return accesLocal410 = null;


        CommonTree X393_tree=null;
        CommonTree Y394_tree=null;
        CommonTree Z395_tree=null;
        CommonTree OF396_tree=null;
        CommonTree OF398_tree=null;
        CommonTree IDENT400_tree=null;
        CommonTree OF401_tree=null;
        CommonTree SCORE403_tree=null;
        CommonTree OF404_tree=null;
        CommonTree GAME405_tree=null;
        CommonTree VALUE406_tree=null;
        CommonTree OF407_tree=null;
        CommonTree OF409_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_accesLocal=new RewriteRuleSubtreeStream(adaptor,"rule accesLocal");
        RewriteRuleSubtreeStream stream_attributTps=new RewriteRuleSubtreeStream(adaptor,"rule attributTps");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:350:10: ( ( X | Y | Z ) OF typeCoordonnees OF accesLocal | IDENT OF accesLocal -> ^( VAR_I_KW IDENT accesLocal ) | SCORE OF GAME -> GAME_SCORE_KW | VALUE OF attributTps OF accesLocal -> ^( VALUE_KW attributTps accesLocal ) )
            int alt90=4;
            switch ( input.LA(1) ) {
            case X:
            case Y:
            case Z:
                {
                alt90=1;
                }
                break;
            case IDENT:
                {
                alt90=2;
                }
                break;
            case SCORE:
                {
                alt90=3;
                }
                break;
            case VALUE:
                {
                alt90=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:351:5: ( X | Y | Z ) OF typeCoordonnees OF accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:351:5: ( X | Y | Z )
                    int alt89=3;
                    switch ( input.LA(1) ) {
                    case X:
                        {
                        alt89=1;
                        }
                        break;
                    case Y:
                        {
                        alt89=2;
                        }
                        break;
                    case Z:
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
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:351:6: X
                            {
                            X393=(Token)match(input,X,FOLLOW_X_in_variable3397); 
                            X393_tree = (CommonTree)adaptor.create(X393);
                            root_0 = (CommonTree)adaptor.becomeRoot(X393_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:351:11: Y
                            {
                            Y394=(Token)match(input,Y,FOLLOW_Y_in_variable3402); 
                            Y394_tree = (CommonTree)adaptor.create(Y394);
                            root_0 = (CommonTree)adaptor.becomeRoot(Y394_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:351:16: Z
                            {
                            Z395=(Token)match(input,Z,FOLLOW_Z_in_variable3407); 
                            Z395_tree = (CommonTree)adaptor.create(Z395);
                            root_0 = (CommonTree)adaptor.becomeRoot(Z395_tree, root_0);


                            }
                            break;

                    }

                    OF396=(Token)match(input,OF,FOLLOW_OF_in_variable3411); 
                    pushFollow(FOLLOW_typeCoordonnees_in_variable3414);
                    typeCoordonnees397=typeCoordonnees();

                    state._fsp--;

                    adaptor.addChild(root_0, typeCoordonnees397.getTree());
                    OF398=(Token)match(input,OF,FOLLOW_OF_in_variable3416); 
                    pushFollow(FOLLOW_accesLocal_in_variable3419);
                    accesLocal399=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal399.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:352:7: IDENT OF accesLocal
                    {
                    IDENT400=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable3427);  
                    stream_IDENT.add(IDENT400);

                    OF401=(Token)match(input,OF,FOLLOW_OF_in_variable3429);  
                    stream_OF.add(OF401);

                    pushFollow(FOLLOW_accesLocal_in_variable3431);
                    accesLocal402=accesLocal();

                    state._fsp--;

                    stream_accesLocal.add(accesLocal402.getTree());


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
                    // 353:7: -> ^( VAR_I_KW IDENT accesLocal )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:353:10: ^( VAR_I_KW IDENT accesLocal )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:354:7: SCORE OF GAME
                    {
                    SCORE403=(Token)match(input,SCORE,FOLLOW_SCORE_in_variable3475);  
                    stream_SCORE.add(SCORE403);

                    OF404=(Token)match(input,OF,FOLLOW_OF_in_variable3477);  
                    stream_OF.add(OF404);

                    GAME405=(Token)match(input,GAME,FOLLOW_GAME_in_variable3479);  
                    stream_GAME.add(GAME405);



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
                    // 355:7: -> GAME_SCORE_KW
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GAME_SCORE_KW, "GAME_SCORE_KW"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:356:7: VALUE OF attributTps OF accesLocal
                    {
                    VALUE406=(Token)match(input,VALUE,FOLLOW_VALUE_in_variable3497);  
                    stream_VALUE.add(VALUE406);

                    OF407=(Token)match(input,OF,FOLLOW_OF_in_variable3499);  
                    stream_OF.add(OF407);

                    pushFollow(FOLLOW_attributTps_in_variable3501);
                    attributTps408=attributTps();

                    state._fsp--;

                    stream_attributTps.add(attributTps408.getTree());
                    OF409=(Token)match(input,OF,FOLLOW_OF_in_variable3503);  
                    stream_OF.add(OF409);

                    pushFollow(FOLLOW_accesLocal_in_variable3505);
                    accesLocal410=accesLocal();

                    state._fsp--;

                    stream_accesLocal.add(accesLocal410.getTree());


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
                    // 357:7: -> ^( VALUE_KW attributTps accesLocal )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:357:10: ^( VALUE_KW attributTps accesLocal )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:360:1: accesClasse : ( ALL -> ^( ACCESS_KW ALL ) | accesLocal );
    public final hightParser.accesClasse_return accesClasse() throws RecognitionException {
        hightParser.accesClasse_return retval = new hightParser.accesClasse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALL411=null;
        hightParser.accesLocal_return accesLocal412 = null;


        CommonTree ALL411_tree=null;
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:360:13: ( ALL -> ^( ACCESS_KW ALL ) | accesLocal )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==ALL) ) {
                alt91=1;
            }
            else if ( (LA91_0==IDENT||LA91_0==NUM||LA91_0==PLAYER) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:361:3: ALL
                    {
                    ALL411=(Token)match(input,ALL,FOLLOW_ALL_in_accesClasse3537);  
                    stream_ALL.add(ALL411);



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
                    // 362:5: -> ^( ACCESS_KW ALL )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:362:8: ^( ACCESS_KW ALL )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:363:5: accesLocal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_accesLocal_in_accesClasse3555);
                    accesLocal412=accesLocal();

                    state._fsp--;

                    adaptor.addChild(root_0, accesLocal412.getTree());

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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:366:1: accesLocal : ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) );
    public final hightParser.accesLocal_return accesLocal() throws RecognitionException {
        hightParser.accesLocal_return retval = new hightParser.accesLocal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT413=null;
        Token NUM414=null;
        Token IN416=null;
        Token IDENT417=null;
        Token PLAYER418=null;
        hightParser.operation_return operation415 = null;


        CommonTree IDENT413_tree=null;
        CommonTree NUM414_tree=null;
        CommonTree IN416_tree=null;
        CommonTree IDENT417_tree=null;
        CommonTree PLAYER418_tree=null;
        RewriteRuleTokenStream stream_PLAYER=new RewriteRuleTokenStream(adaptor,"token PLAYER");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:366:12: ( IDENT -> ^( ACCESS_KW IDENT ) | NUM operation IN IDENT -> ^( ACCESS_KW IDENT operation ) | PLAYER -> ^( ACCESS_KW PLAYER ) )
            int alt92=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt92=1;
                }
                break;
            case NUM:
                {
                alt92=2;
                }
                break;
            case PLAYER:
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:367:3: IDENT
                    {
                    IDENT413=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal3568);  
                    stream_IDENT.add(IDENT413);



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
                    // 368:5: -> ^( ACCESS_KW IDENT )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:368:8: ^( ACCESS_KW IDENT )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:369:5: NUM operation IN IDENT
                    {
                    NUM414=(Token)match(input,NUM,FOLLOW_NUM_in_accesLocal3586);  
                    stream_NUM.add(NUM414);

                    pushFollow(FOLLOW_operation_in_accesLocal3588);
                    operation415=operation();

                    state._fsp--;

                    stream_operation.add(operation415.getTree());
                    IN416=(Token)match(input,IN,FOLLOW_IN_in_accesLocal3590);  
                    stream_IN.add(IN416);

                    IDENT417=(Token)match(input,IDENT,FOLLOW_IDENT_in_accesLocal3592);  
                    stream_IDENT.add(IDENT417);



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
                    // 370:5: -> ^( ACCESS_KW IDENT operation )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:370:8: ^( ACCESS_KW IDENT operation )
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
                    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:371:5: PLAYER
                    {
                    PLAYER418=(Token)match(input,PLAYER,FOLLOW_PLAYER_in_accesLocal3612);  
                    stream_PLAYER.add(PLAYER418);



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
                    // 372:5: -> ^( ACCESS_KW PLAYER )
                    {
                        // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:372:8: ^( ACCESS_KW PLAYER )
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
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:375:1: typeCoordonnees : ( POSITION | ORIENTATION | SIZE );
    public final hightParser.typeCoordonnees_return typeCoordonnees() throws RecognitionException {
        hightParser.typeCoordonnees_return retval = new hightParser.typeCoordonnees_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set419=null;

        CommonTree set419_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:375:17: ( POSITION | ORIENTATION | SIZE )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set419=(Token)input.LT(1);
            if ( (input.LA(1)>=POSITION && input.LA(1)<=SIZE) ) {
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
    // $ANTLR end "typeCoordonnees"

    public static class timeUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeUnit"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:379:1: timeUnit : ( MIN | SEC | MS | FRAME );
    public final hightParser.timeUnit_return timeUnit() throws RecognitionException {
        hightParser.timeUnit_return retval = new hightParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set420=null;

        CommonTree set420_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:379:10: ( MIN | SEC | MS | FRAME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set420=(Token)input.LT(1);
            if ( (input.LA(1)>=MIN && input.LA(1)<=FRAME) ) {
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
    // $ANTLR end "timeUnit"

    public static class attributTps_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributTps"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:388:1: attributTps : ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME );
    public final hightParser.attributTps_return attributTps() throws RecognitionException {
        hightParser.attributTps_return retval = new hightParser.attributTps_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set421=null;

        CommonTree set421_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:388:13: ( BOOST_INTERVAL | SHOOT_INTERVAL | RELOAD_TIME )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set421=(Token)input.LT(1);
            if ( (input.LA(1)>=BOOST_INTERVAL && input.LA(1)<=RELOAD_TIME) ) {
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
    // $ANTLR end "attributTps"

    public static class attributListeOuObjet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributListeOuObjet"
    // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:394:1: attributListeOuObjet : ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES );
    public final hightParser.attributListeOuObjet_return attributListeOuObjet() throws RecognitionException {
        hightParser.attributListeOuObjet_return retval = new hightParser.attributListeOuObjet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set422=null;

        CommonTree set422_tree=null;

        try {
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:394:22: ( INVENTORY | EQUIPED_OBJECT | ENTRANCES | EXITS | DAMAGE_ZONE | COLLECTORS | TYPES_COLLECTORS | GENERATORS | TYPE_GENERATORS | BREAKERS | TYPES_BREAKERS | TELEPORTABLES | TYPES_TELEPORTABLES )
            // C:\\Users\\Quentin\\Documents\\M1\\Projet\\svn\\compilation\\hight\\grammars\\hight.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set422=(Token)input.LT(1);
            if ( (input.LA(1)>=INVENTORY && input.LA(1)<=TYPES_TELEPORTABLES) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set422));
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


    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA42_eotS =
        "\15\uffff";
    static final String DFA42_eofS =
        "\15\uffff";
    static final String DFA42_minS =
        "\1\35\1\uffff\1\105\12\uffff";
    static final String DFA42_maxS =
        "\1\u00c1\1\uffff\1\154\12\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA42_specialS =
        "\15\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\3\14\uffff\1\2\5\uffff\1\1\12\uffff\1\1\13\uffff\2\4\2\uffff"+
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
            return "168:1: action : ( accesClasse actionObjet | ( IDENT | GAME ) ( ENDS_KW | STARTS_KW | PAUSE_KW ) ( ':' IDENT )? | ( PAUSE_KW | MUTE_KW ( ON | OFF ) | PLAY_KW | STOP_KW ) IDENT | BLOCK_KW transformation OF accesClasse coordinates | ( EFFACE_KW | GENERATE_KW ) ( ( operation )? accesLocal ) ( ( IN | ON ) accesLocal | AT coordinates )? | WAIT_KW operation timeUnit THEN consequences ENDWAIT | SAVE_KW | NEXTURN_KW IDENT | IDENT GRASPS_KW IDENT | IDENT EXPELS_KW IDENT BY operation | IDENT INGESTS_KW IDENT IN IDENT );";
        }
    }
 

    public static final BitSet FOLLOW_gameData_in_game238 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game240 = new BitSet(new long[]{0x08034C0000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_newType_in_game249 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game251 = new BitSet(new long[]{0x08034C0000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_init_in_game260 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game262 = new BitSet(new long[]{0x08034C0000000000L,0x0001000000000001L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_definition_in_game271 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game273 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L});
    public static final BitSet FOLLOW_commande_in_game282 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game284 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000001L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_game293 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game295 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000010L});
    public static final BitSet FOLLOW_iaBasique_in_game304 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIN_in_game306 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_GAME_in_gameData360 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_gameData362 = new BitSet(new long[]{0x0000007900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData364 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_gameData367 = new BitSet(new long[]{0x0000007900000000L});
    public static final BitSet FOLLOW_attributGame_in_gameData369 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_GRAVITY_KW_in_attributGame403 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame405 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame430 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame432 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURNBASED_KW_in_attributGame462 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_attributGame468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORLD_KW_in_attributGame480 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame483 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_mapType_in_attributGame486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRIDSIZE_KW_in_attributGame494 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame497 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FLOAT_in_attributGame500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_KW_in_attributGame508 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_attributGame512 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_name_in_attributGame515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mapType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_name544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_newType558 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_newType560 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_newType562 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_subType_in_newType564 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_AND_in_newType567 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_subType_in_newType569 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_subType609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_init634 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_init636 = new BitSet(new long[]{0x0928840000000000L});
    public static final BitSet FOLLOW_declarationObjet_in_init638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_init662 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAS_in_init664 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001FFFE1DL});
    public static final BitSet FOLLOW_allocationObject_in_init666 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_init669 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001FFFE1DL});
    public static final BitSet FOLLOW_allocationObject_in_init671 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_INSERT_KW_in_init699 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init702 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_init704 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init707 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_NUM_in_init710 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_init713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_KW_in_init725 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init729 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_NUM_in_init731 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_init734 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_FROM_in_init737 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_init740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet758 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_dupli_in_declarationObjet760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_KW_in_declarationObjet789 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OF_in_declarationObjet792 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_declarationObjet795 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet800 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_declarationObjet804 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_declarationObjet807 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet812 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_CAMERA_in_declarationObjet847 = new BitSet(new long[]{0xC080000000000002L});
    public static final BitSet FOLLOW_view_in_declarationObjet850 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PERSON_in_declarationObjet852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FREE_in_declarationObjet866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_in_declarationObjet884 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_LOOP_in_declarationObjet887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONCE_in_declarationObjet898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_declarationObjet923 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_declarationObjet925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_declarationObjet941 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_SOLO_in_declarationObjet943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeEntity971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_entityMode988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dupli_in_entityMode996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DUPLICABLE_in_dupli1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_view0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject1059 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_VALUE_in_allocationObject1063 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AT_in_allocationObject1067 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000060000001L});
    public static final BitSet FOLLOW_valAggregation_in_allocationObject1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeCoordonnees_in_allocationObject1105 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject1107 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_coordinates_in_allocationObject1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributListeOuObjet_in_allocationObject1146 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject1148 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_allocationObject1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributTps_in_allocationObject1188 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_allocationObject1190 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_allocationObject1192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_allocationObject1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_valAggregation1236 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_valAggregation1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_valAggregation1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_valAggregation1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_valAggregation1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_KW_in_definition1295 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_definition1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MEANS_in_definition1300 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequences_in_definition1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1315 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_consequences1318 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequ_in_consequences1320 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_siAlors_in_consequ1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_consequ1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_consequ1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activCommande_in_consequ1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_consequ1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_consequ1394 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_consequ1397 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1400 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_DBP_in_consequ1403 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_consequ1415 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_consequ1418 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_DBP_in_consequ1424 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_consequ1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1446 = new BitSet(new long[]{0x0000000000000000L,0x0000190322000000L});
    public static final BitSet FOLLOW_actionObjet_in_action1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_action1456 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ENDS_KW_in_action1465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_STARTS_KW_in_action1470 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_DBP_in_action1480 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_KW_in_action1495 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_MUTE_KW_in_action1500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_set_in_action1503 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PLAY_KW_in_action1513 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STOP_KW_in_action1518 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_KW_in_action1531 = new BitSet(new long[]{0x0000000000000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_transformation_in_action1534 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_action1536 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_action1539 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_coordinates_in_action1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACE_KW_in_action1550 = new BitSet(new long[]{0x0801040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_GENERATE_KW_in_action1555 = new BitSet(new long[]{0x0801040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_operation_in_action1560 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_action1563 = new BitSet(new long[]{0x0000800200000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_IN_in_action1568 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_action1571 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_action1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_action1579 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_coordinates_in_action1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAIT_KW_in_action1593 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_action1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_action1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_THEN_in_action1600 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequences_in_action1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ENDWAIT_in_action1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_KW_in_action1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXTURN_KW_in_action1622 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_GRASPS_KW_in_action1683 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EXPELS_KW_in_action1696 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_action1701 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_action1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_INGESTS_KW_in_action1714 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1717 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_action1719 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_action1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_actionObjet1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandePressee_in_actionObjet1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionCommandeMaintenue_in_actionObjet1781 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_DURING_in_actionObjet1784 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionObjet1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_timeUnit_in_actionObjet1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTIL_in_actionObjet1793 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_actionObjet1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_HAPPENS_in_actionObjet1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIP_in_actionObjet1809 = new BitSet(new long[]{0x0801040000000000L,0x00000000C0000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_actionObjet1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_actionObjet1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREVIOUS_in_actionObjet1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_actionCommandePressee1841 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandePressee1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_actionCommandeMaintenue1861 = new BitSet(new long[]{0x0000000000000000L,0x000000FC00000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1888 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_actionCommandeMaintenue1897 = new BitSet(new long[]{0x0000000000000000L,0x000006CC00000000L});
    public static final BitSet FOLLOW_set_in_actionCommandeMaintenue1900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1917 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCELERATE_in_actionCommandeMaintenue1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1929 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRAKE_in_actionCommandeMaintenue1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_actionCommandeMaintenue1941 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_actionCommandeMaintenue1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_transformation0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_coordinates1998 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_coordinates2000 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_coordinates2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_KW_in_commande2041 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_FOR_in_commande2044 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_player_list_in_commande2047 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_commande2049 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_actionCommande_in_commande2052 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_commande2055 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_actionCommande_in_commande2058 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IDENT_in_player_list2077 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_player_list2080 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_player_list2083 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_MOUSE_in_actionCommande2102 = new BitSet(new long[]{0x0000000000000000L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_souris_in_actionCommande2104 = new BitSet(new long[]{0x0000000000000000L,0x0072000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2107 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande2111 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_actionCommande2142 = new BitSet(new long[]{0x0000000000000000L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_clavier_in_actionCommande2144 = new BitSet(new long[]{0x0000000000000000L,0x0072000000000000L});
    public static final BitSet FOLLOW_commandMode_in_actionCommande2147 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_FOR_in_actionCommande2151 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_definitionId_in_actionCommande2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commandMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_definitionId2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_souris0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_clavier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIVATE_KW_in_activCommande2342 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_DISABLE_KW_in_activCommande2347 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_typeCommand_in_activCommande2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMANDS_in_typeCommand2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOUSE_in_typeCommand2376 = new BitSet(new long[]{0x0000000000000002L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand2379 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand2382 = new BitSet(new long[]{0x0000000000000000L,0x0F8000CC00000000L});
    public static final BitSet FOLLOW_souris_in_typeCommand2384 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEY_in_typeCommand2411 = new BitSet(new long[]{0x0000000000000000L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2413 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_typeCommand2416 = new BitSet(new long[]{0x0000000000000000L,0xF00000CC00000000L});
    public static final BitSet FOLLOW_clavier_in_typeCommand2418 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_KEYBOARD_in_typeCommand2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_in_reglesJeu2455 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_declencheur_in_reglesJeu2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_THEN_in_reglesJeu2460 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_definitionId_in_reglesJeu2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_declencheur2481 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x000000000000F7A0L});
    public static final BitSet FOLLOW_MOVES_KW_in_declencheur2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIES_KW_in_declencheur2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurTK_in_declencheur2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declencheurKT_in_declencheur2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declencheur2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ENDS_KW_in_declencheur2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_KW_in_declencheur2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declencheur2538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BECOMES_in_declencheur2540 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varOuNB_in_declencheur2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_declencheur2566 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_declencheur2569 = new BitSet(new long[]{0x0800040000000000L});
    public static final BitSet FOLLOW_set_in_declencheur2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_declencheur2586 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_declencheur2589 = new BitSet(new long[]{0x0800040000000000L});
    public static final BitSet FOLLOW_set_in_declencheur2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varOuNB2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_varOuNB2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHES_KW_in_declencheurTK2631 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_KILLS_KW_in_declencheurTK2636 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_OWNES_KW_in_declencheurTK2641 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_NOTOWNES_KW_in_declencheurTK2646 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_OTHER_in_declencheurTK2652 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurTK2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KILLED_KW_in_declencheurKT2671 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_TOUCHED_KW_in_declencheurKT2676 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_OWNED_KW_in_declencheurKT2681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_NOTOWNED_KW_in_declencheurKT2686 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_BY_in_declencheurKT2691 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_OTHER_in_declencheurKT2696 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_declencheurKT2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_KW_in_siAlors2719 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_siAlors2722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_THEN_in_siAlors2724 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequences_in_siAlors2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_ELSE_in_siAlors2730 = new BitSet(new long[]{0x0801040020000000L,0x000000000019F994L,0x0000F00000010003L,0x0000000000000002L});
    public static final BitSet FOLLOW_consequences_in_siAlors2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ENDIF_in_siAlors2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_conditions2756 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionOu_in_conditions2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_OR_in_conditionOu2797 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionEt_in_conditionOu2800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_cond_in_conditionEt2819 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_AND_in_conditionEt2822 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_cond_in_conditionEt2825 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_etat_in_cond2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMP_in_cond2852 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_cond2855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000FC00000L});
    public static final BitSet FOLLOW_EQUALS_in_cond2858 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_INF_in_cond2863 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SUP_in_cond2868 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_INFEG_in_cond2873 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SUPED_in_cond2878 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DIFF_in_cond2883 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_cond2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_cond2906 = new BitSet(new long[]{0x0801040020000000L,0x0000000000000014L,0x0000000010280000L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_cond2908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_PD_in_cond2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cond2918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_CONTAINS_KW_in_cond2920 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_cond2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesClasse_in_etat2941 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_etat2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F80080000L});
    public static final BitSet FOLLOW_NOT_in_etat2947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_DEAD_KW_in_etat2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIVE_KW_in_etat2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EFFACED_KW_in_etat2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERATED_KW_in_etat2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOUCHING_KW_in_etat2972 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_OTHER_in_etat2977 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_etat2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVING_KW_in_etat2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAITING_KW_in_etat2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_etat3003 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_etat3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000FC000080000L});
    public static final BitSet FOLLOW_NOT_in_etat3015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000FC000000000L});
    public static final BitSet FOLLOW_FINISHED_KW_in_etat3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTED_KW_in_etat3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSED_KW_in_etat3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTED_KW_in_etat3034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_set_in_etat3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYED_KW_in_etat3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPPED_KW_in_etat3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VICTORY_KW_in_etat3070 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_etat3073 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_etat3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFEAT_KW_in_etat3084 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_etat3087 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_etat3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_KW_in_affectation3109 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ADD_KW_in_affectation3114 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SUB_KW_in_affectation3119 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_affectation3123 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_FOR_in_affectation3126 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variable_in_affectation3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERT_KW_in_affectation3136 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variable_in_affectation3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_WITH_in_affectation3141 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variable_in_affectation3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IA_KW_in_iaBasique3164 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_iaBasique3167 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IS_in_iaBasique3169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3172 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_VIRG_in_iaBasique3175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_reglesJeu_in_iaBasique3178 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_operationPlus_in_operation3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_KW_in_operation3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operation3207 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationPlus_in_operation3210 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_AND_in_operation3212 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationPlus_in_operation3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus3233 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_PLUS_in_operationPlus3237 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_MINUS_in_operationPlus3242 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationMul_in_operationPlus3246 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_operationPow_in_operationMul3265 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x01C0000000000000L});
    public static final BitSet FOLLOW_MUL_in_operationMul3269 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DIV_in_operationMul3274 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_MOD_in_operationMul3279 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationPow_in_operationMul3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow3304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_POW_in_operationPow3307 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC00000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operationBracket_in_operationPow3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PG_in_operationBracket3331 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_operationBracket3334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_PD_in_operationBracket3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operationBracket3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operationBracket3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_KW_in_operationBracket3362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ANGLE_KW_in_operationBracket3366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_operationBracket3370 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_operationBracket3373 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_AND_in_operationBracket3375 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_operationBracket3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_X_in_variable3397 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Y_in_variable3402 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Z_in_variable3407 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_typeCoordonnees_in_variable3414 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3416 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_variable3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable3427 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3429 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_variable3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_variable3475 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3477 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GAME_in_variable3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_variable3497 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3499 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001FFFE1DL});
    public static final BitSet FOLLOW_attributTps_in_variable3501 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_OF_in_variable3503 = new BitSet(new long[]{0x0801040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_variable3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_accesClasse3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesLocal_in_accesClasse3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_accesLocal3586 = new BitSet(new long[]{0x0000040400000000L,0x0000000000000000L,0xFC04000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_operation_in_accesLocal3588 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_accesLocal3590 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_accesLocal3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYER_in_accesLocal3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCoordonnees0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributTps0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attributListeOuObjet0 = new BitSet(new long[]{0x0000000000000002L});

}